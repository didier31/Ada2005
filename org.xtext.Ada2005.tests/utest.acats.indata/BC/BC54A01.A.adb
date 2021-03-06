-- BC54A01.A
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
--      Check that, for a formal access-to-subprogram subtype whose profile
--      contains access parameters, the designated subtypes of the
--      corresponding access parameters in the formal and actual profiles must
--      statically match. Check cases where the designated subtype is an
--      elementary subtype.
--
-- TEST DESCRIPTION:
--      Two subtypes of the same type statically match if their constraints
--      statically match. Two constraints statically match if they are both
--      null constraints, both are static and have equal corresponding bounds
--      or discriminant values, or both are nonstatic and result from the same
--      elaboration of a constraint of a subtype indication or the same
--      evaluation of a range of a discrete subtype definition.
--
--      The test declares generics with formal access-to-subprogram types
--      (access-to-procedure and access-to-function) with designated profiles
--      containing access parameters of an elementary type (discrete (integer),
--      floating point, and access-to-tagged). For each of these designated
--      types (as appropriate), various actual access-to-subprogram types are
--      declared whose access parameters designate unconstrained, constrained,
--      and derived subtypes with null, static, and nonstatic constraints.
--
-- TEST FILES:
--      The following files comprise this test:
--
--         FC54A00.A
--      -> BC54A01.A
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--
--!

with FC54A00;
package BC54A01_0 is

--
-- Generics declaring access-to-subprogram formals:
--

   -- Designated type is discrete:

   generic
      type ATS is access procedure (P: access FC54A00.Numerals);
   package Static_Discrete is end;

   generic
      type ATS is access procedure (P: access FC54A00.Positive_Nonstatic);
   package Nonstatic_Discrete is end;


   -- Designated type is floating point:

   generic
      type ATS is access function (P: access FC54A00.Float_Type)
        return Integer;
   package Unconstrained_Float is end;

   generic
      type ATS is access function (P: access FC54A00.Float_With_Range)
        return Integer;
   package Constrained_Float is end;



   -- Designated type is access-to-tagged:

   generic
      type ATS is access function (P: access FC54A00.Tagged_Ptr)
        return Boolean;
   package Unconstrained_Tagged_Access is end;


end BC54A01_0;


     --===================================================================--


with FC54A00;
package BC54A01_1 is

--
-- Access-to-subprogram types to be passed as actuals:
--

   -- Discrete types:

   type Discrete_Diff_Range is access procedure
     (A : access FC54A00.Positives);

   type Discrete_Same_Range is access procedure
     (A : access FC54A00.Numerals_Static);

   type Discrete_Nonstatic_Same_Range is access procedure
     (A : access FC54A00.Numerals_Nonstatic);

   type Discrete_Nonstatic_Dupl_Constr is access procedure
     (A : access FC54A00.Pos_Dupl_Nonstatic);

   type Discrete_Nonstatic_Range_Attr is access procedure
     (A : access FC54A00.Pos_Attr_Nonstatic);


   -- Floating point types:

   type Float_Diff_Type is access function
     (A : access FC54A00.New_Float) return Integer;

   type Float_Diff_Range is access function
     (A : access FC54A00.Float_100) return Integer;

   type Float_Nonconstrained_Subtype is access function
     (A : access FC54A00.Same_Float) return Integer;

   type Float_Has_Same_Range is access function
     (A : access FC54A00.Float_Same_Range) return Integer;


   -- Access types (designated type is tagged):

   type Acc_Tag_Unconstrained_Same_Type is access function
     (A : access FC54A00.Tagged_Ptr) return Boolean;

   type Acc_Tag_Unconstrained_Class_Type is access function
     (A : access FC54A00.Tag_Class_Ptr) return Boolean;

   type Acc_Tag_Constrained_A_Type is access function
     (A : access FC54A00.Msg_Ptr_Static) return Boolean;


end BC54A01_1;


     --===================================================================--


with BC54A01_0;
with BC54A01_1;
package BC54A01 is

--
-- Instantiations:
--

   -- Discrete types (formal is static):

   package Instance01 is new BC54A01_0.Static_Discrete
     (ATS => BC54A01_1.Discrete_Diff_Range);                          -- ERROR:
                -- Designated types of access parameters have different bounds.

   package Instance02 is new BC54A01_0.Static_Discrete
     (ATS => BC54A01_1.Discrete_Same_Range);                          -- OK.


   package Instance03 is new BC54A01_0.Static_Discrete
     (BC54A01_1.Discrete_Nonstatic_Same_Range);                       -- ERROR:
                -- Designated type in formal is static; in actual is nonstatic.



   -- Discrete types (formal is nonstatic):

   package Instance04 is new BC54A01_0.Nonstatic_Discrete
     (ATS => BC54A01_1.Discrete_Diff_Range);                          -- ERROR:
                -- Designated type in formal is nonstatic; in actual is static.

   package Instance05 is new BC54A01_0.Nonstatic_Discrete
     (ATS => BC54A01_1.Discrete_Nonstatic_Dupl_Constr);               -- ERROR:
                     -- Constraints of designated types do not result from same
                     -- elaboration/evaluation of constraint/range.

   package Instance06 is new BC54A01_0.Nonstatic_Discrete
     (BC54A01_1.Discrete_Nonstatic_Range_Attr);                       -- ERROR:
                     -- Constraints of designated types do not result from same
                     -- elaboration/evaluation of constraint/range.



   -- Floating point types (formal is unconstrained):

   package Instance07 is new BC54A01_0.Unconstrained_Float
     (BC54A01_1.Float_Diff_Type);                                     -- ERROR:
             -- Access parameters in profiles do not have same designated type.

   package Instance08 is new BC54A01_0.Unconstrained_Float
     (BC54A01_1.Float_Diff_Range);                                    -- ERROR:
                -- Designated types of access parameters have different bounds.

   package Instance09 is new BC54A01_0.Unconstrained_Float
     (BC54A01_1.Float_Nonconstrained_Subtype);                        -- OK.



   -- Floating point types (formal is constrained):

   package Instance10 is new BC54A01_0.Constrained_Float
     (BC54A01_1.Float_Diff_Range);                                    -- ERROR:
             -- Access parameters in profiles do not have same designated type.

   package Instance11 is new BC54A01_0.Constrained_Float
     (BC54A01_1.Float_Has_Same_Range);                                -- OK.



   -- Access types (designating tagged) (formal type is unconstrained):

   package Instance12 is new BC54A01_0.Unconstrained_Tagged_Access
     (BC54A01_1.Acc_Tag_Unconstrained_Same_Type);                     -- OK.


   package Instance13 is new BC54A01_0.Unconstrained_Tagged_Access
     (BC54A01_1.Acc_Tag_Unconstrained_Class_Type);                    -- ERROR:
             -- Access parameters in profiles do not have same designated type.

   package Instance14 is new BC54A01_0.Unconstrained_Tagged_Access
     (BC54A01_1.Acc_Tag_Constrained_A_Type);                          -- ERROR:
             -- Access parameters in profiles do not both have null constraint.


end BC54A01;
