-- B370001.A
--
--                             Grant of Unlimited Rights
--
--     Under contracts F33600-87-D-0337, F33600-84-D-0280, MDA903-79-C-0687,
--     F08630-91-C-0015, and DCA100-97-D-0025, the U.S. Government obtained
--     unlimited rights in the software and documentation contained herein.
--     Unlimited rights are defined in DFAR 252.227-7013(a)(19).  By making
--     this public release, the Government intends to confer upon all
--     recipients unlimited rights  equal to those held by the Government.
--     These rights include rights to use, duplicate, release or disclose the
--     released technical data and computer software in whole or in part, in
--     any manner and for any purpose whatsoever, and to have or permit others
--     to do so.
--
--                                    DISCLAIMER
--
--     ALL MATERIALS OR INFORMATION HEREIN RELEASED, MADE AVAILABLE OR
--     DISCLOSED ARE AS IS.  THE GOVERNMENT MAKES NO EXPRESS OR IMPLIED
--     WARRANTY AS TO ANY MATTER WHATSOEVER, INCLUDING THE CONDITIONS OF THE
--     SOFTWARE, DOCUMENTATION OR OTHER INFORMATION RELEASED, MADE AVAILABLE
--     OR DISCLOSED, OR THE OWNERSHIP, MERCHANTABILITY, OR FITNESS FOR A
--     PARTICULAR PURPOSE OF SAID MATERIAL.
--*
--
-- OBJECTIVE:
--      Check that a discriminant specification for an access discriminant
--      with a default expression may not appear in the declaration of a
--      type (that is not a task or protected type) if it or one of
--      its ancestors is not an explicitly limited record type.
--
--         Check for basic cases, including a type that is limited only
--         due to the presence of a limited component.
--
--         Check for the generic case, where the type is derived from
--         a limited untagged formal private type, or a formal untagged
--         derived type.
--
--         Check for the instance case, where the type is derived from a
--         limited formal private type, and the corresponding actual
--         is not explictly limited, or a task or protected type.
--         Check in both the visible and private part of an instance.
--

--
-- TEST DESCRIPTION:
--      For the basic case:
--
--         Verify that it is illegal to declare a record type with an access
--         discriminant with a default expression, where the record type is
--	   limited only because it has a limited component. Verify that it is
--         legal to declare a derived type with an access discriminant with
--         a default if the parent is a type derived from an explicitly
--         limited type.
--
--      For the generic case:
--
--         Verify that it is illegal to derive a type with an access
--         discriminant with a default expression from a formal nonlimited
--         untagged private type. It is illegal to derive from an unconstrained
--         type, it is illegal to add a discriminant when deriving an untagged
--         type, and it is illegal to have a known_discriminant_part on a
--         formal derived type, so no useful test can be constructed for that
--         untagged formal derived types.
--
--         Verify that it is illegal to derive a type with an access
--         discriminant with a default expression from a formal limited
--         private type in a generic body.

--      For the instance case:
--
--         Derive a type with an access discriminant from a formal limited
--         private type in the visible part of a generic. Verify that the
--         derived type is legal in the instance if the actual type is a
--         task or protected type, or is explicitly limited, and is illegal
--         for other record types.
--
--         Derive a type with an access discriminant from a formal limited
--         private type in the private part of a generic. Verify that the
--         derived type is legal in the instance if the actual type is a
--         task or protected type, or is explicitly limited, and is illegal
--         for other record types.
--
--
-- CHANGE HISTORY:
--      06 Mar 95   SAIC    Initial prerelease version.
--      15 Mar 07   RLB     Revised test and objective to match rules in
--                          Amendment 1.
--      06 Aug 07   RLB     Eliminated violations of 3.7(13) and 12.5.1(6).
--      18 Aug 07   RLB     Fixed conformance and name conflict of
--                          LocalNonLimRec.
--
--!

package B370001_0 is

   type Disc is new Natural range 0 .. 10;

   type Acc_Disc is access all Disc;
   Disc_Var : aliased Disc;
   A_Disc : Acc_Disc := Disc_Var'access;

   task type Tsk (X: access Disc) is end;  -- Task type is limited.

   protected type PT (X: access Disc) is   -- Protected type is limited.
      procedure Op;
   end PT;

   type LimRec (X: access Disc) is         -- Explictly limited record type.
     limited record
      C : Integer;
   end record;

   type DerLimRec is new LimRec;           -- Limited since parent is
                                           -- explictly limited.


   type NonLimRec (X: access Disc) is      -- Not explicitly limited.
     record
      C : Integer;
   end record;

   generic
      type FLP (D: access Disc)  is limited private;
   package Some_Generic_Cases is

      procedure Need_a_Body;

   end Some_Generic_Cases;

   type TaggedLimRec is                   -- Explictly limited record type.
     tagged limited record
      C : Integer;
   end record;

   type TaggedNonLimRec is                -- Not explicitly limited.
     tagged record
      C : Integer;
   end record;

end B370001_0;


     --==================================================================--


with B370001_0;
use  B370001_0;
package B370001_1 is

--
-- Basic cases:
--

   type LocalNonLimRec (D: access Disc := A_Disc) is record           -- ERROR:
                            -- Non-task/protected type with access discriminant
                            -- must be explicitly declared limited.
      C: TaggedLimRec;
   end record;

   type DerDerLimRec (D: access Disc := A_Disc) is new DerLimRec(D);  -- OK.
      -- Parent of DerLimRec is explicitly limited.

--
-- Generic cases:
--

   generic
      type FP    (DD: access Disc) is private;
   package Generic_Cases is

      type Der_FP (D: access Disc := A_Disc) is new FP(D);            -- ERROR:
                                     -- Parent type is not limited.

      -- Can't test untagged derived cases, because we can't add discriminants
      -- when deriving an untagged type and we can't have known discriminants
      -- for formal derived types.
   end Generic_Cases;

   -- Generic body cases tested by Some_Generic_Cases.

--
-- Instance cases:
--

   generic
      type FP (DD: access Disc) is limited private;
   package GenLP is
      type DFP (D: access Disc := A_Disc) is new FP(D);  -- Checked in instance.
   end GenLP;

   package Instance_Tsk       is new GenLP (Tsk);                     -- OK.
   package Instance_PT        is new GenLP (PT);                      -- OK.
   package Instance_LimRec    is new GenLP (LimRec);                  -- OK.
   package Instance_NonLimRec is new GenLP (NonLimRec);               -- ERROR:


end B370001_1;

package body B370001_0 is

   package body Some_Generic_Cases is

      procedure Need_a_Body is
      begin
          null;
      end Need_a_Body;

      type Der2_FLP (D: access Disc := A_Disc) is new FLP(D);         -- ERROR:
                                     -- Not an explicitly limited record type.

   end Some_Generic_Cases;

   task body Tsk is
   begin
       null;
   end Tsk;

   protected body PT is
      procedure Op is
      begin
          null;
      end Op;
   end PT;

end B370001_0;

with B370001_1; -- OPTIONAL ERROR:
procedure B370001 is -- Optional main subprogram. This does not need to be
                     -- processed.
begin
    null;
end B370001;

