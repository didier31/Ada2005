-- BC54A02.A
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
--      statically match. Check cases where the designated subtype is a
--      composite subtype.
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
--      containing access parameters of composite types (array, tagged). For
--      each of these designated types (as appropriate), various actual
--      access-to-subprogram types are declared whose access parameters
--      designate unconstrained, constrained, class-wide, and derived subtypes
--      with null, static, and nonstatic constraints.
--
-- TEST FILES:
--      The following files comprise this test:
--
--         FC54A00.A
--      -> BC54A02.A
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--
--!

with FC54A00;
package BC54A02_0 is

--
-- Generics declaring access-to-subprogram formals:
--

   -- Designated type is array:

   generic
      type ATS is access function (P: access FC54A00.Msg_Static)
        return Boolean;
   package Static_Array is end;

   generic
      type ATS is access function (P: access FC54A00.Msg_Nonstatic)
        return Boolean;
   package Nonstatic_Array is end;


   -- Designated type is tagged:

   generic
      type ATS is access procedure (P: access FC54A00.Tag);
   package Unconstrained_Tagged is end;

   generic
      type ATS is access procedure (P: access FC54A00.Tag'Class);
   package Class_Wide is end;

   generic
      type ATS is access procedure (P: access FC54A00.Tag20_Nonstatic);
   package Nonstatic_Tagged is end;


end BC54A02_0;


     --===================================================================--


with FC54A00;
package BC54A02_1 is

--
-- Access-to-subprogram types to be passed as actuals:
--

   -- Array types:

   type Array_Unconstrained_Same_Type is access function
     (A : access String) return Boolean;

   type Array_Constrained_Same_Range is access function
     (A : access FC54A00.Msg10) return Boolean;

   type Array_Constrained_Diff_Range is access function
     (A : access FC54A00.Msg20) return Boolean;

   type Array_Constrained_Nonstatic_Type is access function
     (A : access FC54A00.Msg_Nonstatic) return Boolean;

   type Array_Constrained_Nonstatic_Dupl_Constr is access function
     (A : access FC54A00.Msg_Dupl_Nonstatic) return Boolean;


   -- Tagged types:

   type Tagged_Same_Type is access procedure
     (A : access FC54A00.Tag);

   type Tagged_Diff_Type is access procedure
     (A : access FC54A00.New_Tag);

   type Tagged_Class_Actual is access procedure
     (A : access FC54A00.Tag'Class);

   type Tagged_Nonconstrained_Subtype is access procedure
     (A : access FC54A00.Same_Tag);

   type Tagged_Nonstatic_Same_Type is access procedure
     (A : access FC54A00.Tag20_Nonstatic);

   type Tagged_Nonstatic_Dupl_Constraint is access procedure
     (A : access FC54A00.Tag20_Dupl_Nonstatic);

   type Tagged_Nonstatic_No_Constraint is access procedure
     (A : access FC54A00.Tag20_Same_Nonstatic);


end BC54A02_1;


     --===================================================================--


with BC54A02_0;
with BC54A02_1;
package BC54A02 is

--
-- Instantiations:
--

   -- Array types (formal type is static/constrained):

   package Instance01 is new BC54A02_0.Static_Array
     (BC54A02_1.Array_Unconstrained_Same_Type);                       -- ERROR:
             -- Access parameters in profiles do not both have null constraint.

   package Instance02 is new BC54A02_0.Static_Array
     (BC54A02_1.Array_Constrained_Same_Range);                        -- ERROR:
             -- Access parameters in profiles do not have same designated type.

   package Instance03 is new BC54A02_0.Static_Array
     (BC54A02_1.Array_Constrained_Diff_Range);                        -- ERROR:
                  -- Index constraints of designated types of access parameters
                  -- have different ranges.

   package Instance04 is new BC54A02_0.Static_Array
     (BC54A02_1.Array_Constrained_Nonstatic_Type);                    -- ERROR:
                -- Designated type in formal is static; in actual is nonstatic.



   -- Array types (formal type is nonstatic/constrained):

   package Instance05 is new BC54A02_0.Nonstatic_Array
     (BC54A02_1.Array_Constrained_Nonstatic_Type);                    -- OK.


   package Instance06 is new BC54A02_0.Nonstatic_Array
     (BC54A02_1.Array_Constrained_Nonstatic_Dupl_Constr);             -- ERROR:
                     -- Constraints of designated types do not result from same
                     -- elaboration/evaluation of a range/constraint.



   -- Tagged types (formal is unconstrained):

   package Instance07 is new BC54A02_0.Unconstrained_Tagged
     (ATS => BC54A02_1.Tagged_Diff_Type);                             -- ERROR:
             -- Access parameters in profiles do not have same designated type.

   package Instance08 is new BC54A02_0.Unconstrained_Tagged
     (ATS => BC54A02_1.Tagged_Nonconstrained_Subtype);                -- OK.



   -- Tagged types (formal is class-wide):

   package Instance09 is new BC54A02_0.Class_Wide
     (ATS => BC54A02_1.Tagged_Class_Actual);                          -- OK.


   package Instance10 is new BC54A02_0.Class_Wide
     (ATS => BC54A02_1.Tagged_Same_Type);                             -- ERROR:
             -- Access parameters in profiles do not have same designated type.



   -- Tagged types (formal is nonstatic):

   package Instance11 is new BC54A02_0.Nonstatic_Tagged
     (ATS => BC54A02_1.Tagged_Nonstatic_Same_Type);                   -- OK.


   package Instance12 is new BC54A02_0.Nonstatic_Tagged
     (ATS => BC54A02_1.Tagged_Nonstatic_Dupl_Constraint);             -- ERROR:
                     -- Constraints of designated types do not result from same
                     -- evaluation/elaboration of a range/constraint.

   package Instance13 is new BC54A02_0.Nonstatic_Tagged
     (ATS => BC54A02_1.Tagged_Nonstatic_No_Constraint);               -- OK.


end BC54A02;
