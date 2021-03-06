-- BC54A06.A
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
--      Check that, for a formal access-to-object type, the designated
--      subtypes of the formal and actual must statically match. Check for the
--      case where the access-to-object type is a pool-specific
--      access-to-variable type.
--
-- TEST DESCRIPTION:
--      Two subtypes of the same type statically match if their constraints
--      statically match. Two constraints statically match if they are both
--      null constraints, both are static and have equal corresponding bounds
--      or discriminant values, or both are nonstatic and result from the same
--      elaboration of a constraint of a subtype indication or the same
--      evaluation of a range of a discrete subtype definition.
--      The test declares generics with formal pool-specific access-to-variable
--      types designating tagged and formal discrete types.
--      For each of these designated types (as appropriate), various general
--      and pool-specific access-to-variable actual types are declared which
--      designate unconstrained, constrained, class-wide, and derived types,
--      with null, static, and nonstatic constraints.
--
-- TEST FILES:
--      The following files comprise this test:
--
--         FC54A00.A
--      -> BC54A06.A
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--
--!

with FC54A00;
package BC54A06_0 is

--
-- Generics declaring formal pool-specific access-to-variable types:
--

   -- Tagged designated type:

   generic
      type Access_To_Variable is access FC54A00.Tag;
   package Pool_Access_To_Var_Tagged is end;

   generic
      type Access_To_Variable is access FC54A00.Tag20;
   package Pool_Access_To_Var_Tag_Static is end;

   generic
      type Access_To_Variable is access FC54A00.Tag20_Nonstatic;
   package Pool_Access_To_Var_Tag_Nonstat is end;



   -- Formal discrete designated type:
   -- Two levels of indirection through formal packages:

   generic                                           -- Template (A) for
      type Formal_Discrete is (<>);                  -- formal package.
   package Outer_FP_Template is end;

   generic                                           -- Template (B) for
      with package Outer_FP is new                   -- formal package.
        Outer_FP_Template (<>);
   package Inner_FP_Template is end;


   package Out_Desig_Num is new                      -- Instance of template A
   Outer_FP_Template (FC54A00.Numerals);             -- to be passed as actual.

   package In_Desig_Num is new                       -- Instance of template B
   Inner_FP_Template (Out_Desig_Num);                -- to be passed as actual.


   generic
      with package Formal_Package is new Inner_FP_Template (<>);
      type Access_To_Variable is access
        Formal_Package.Outer_FP.Formal_Discrete;
   package Pool_Access_To_Var_Form_Disc is end;


end BC54A06_0;


     --===================================================================--


with FC54A00;
package BC54A06_1 is

--
-- Access-to-variable types to be passed as actuals:
--

   -- Note that some are pool-specific, and others are general. The actual
   -- corresponding to a pool-specific formal may be either general or
   -- pool-specific. 


   -- Tagged (pool-specific) designated type:

   type Acc_Tag            is access     FC54A00.Tag;
   type Acc_Same_Tag       is access all FC54A00.Same_Tag;
   type Acc_Tag20          is access     FC54A00.Tag20;
   type Acc_Tag25          is access all FC54A00.Tag25;
   type Acc_Tag_Nonstat    is access     FC54A00.Tag20_Nonstatic;
   type Acc_Tag_Du_Nonstat is access all FC54A00.Tag20_Dupl_Nonstatic;
   type Acc_Tag_Va_Nonstat is access     FC54A00.Tag20_Var_Nonstatic;



   -- Formal discrete (general) designated type:

   type Acc_Num            is access     FC54A00.Numerals;
   type Acc_New_Num        is access all FC54A00.New_Numerals;
   type Acc_Pos            is access     FC54A00.Positives;
   type Acc_Num_Nonstat    is access all FC54A00.Numerals_Nonstatic;


end BC54A06_1;


     --===================================================================--


with BC54A06_0;
with BC54A06_1;
package BC54A06 is

--
-- Instantiations:
--

   -- Tagged designated type:

   package Instance01 is new BC54A06_0.Pool_Access_To_Var_Tagged
     (BC54A06_1.Acc_Tag);                                             -- OK.


   package Instance02 is new BC54A06_0.Pool_Access_To_Var_Tagged
     (BC54A06_1.Acc_Same_Tag);                                        -- OK.


   package Instance03 is new BC54A06_0.Pool_Access_To_Var_Tag_Static
     (BC54A06_1.Acc_Tag);                                             -- ERROR:
                       -- Designated subtypes do not both have null constraint.

   package Instance04 is new BC54A06_0.Pool_Access_To_Var_Tag_Static
     (BC54A06_1.Acc_Tag20);                                           -- OK.


   package Instance05 is new BC54A06_0.Pool_Access_To_Var_Tag_Static
     (BC54A06_1.Acc_Tag25);                                           -- ERROR:
                -- Designated subtypes have different discriminant constraints.

   package Instance06 is new BC54A06_0.Pool_Access_To_Var_Tag_Nonstat
     (BC54A06_1.Acc_Tag_Nonstat);                                     -- OK.


   package Instance07 is new BC54A06_0.Pool_Access_To_Var_Tag_Nonstat
     (BC54A06_1.Acc_Tag_Du_Nonstat);                                  -- ERROR:
                     -- Constraints of designated types do not result from same
                     -- evaluation/elaboration of a range/constraint.

   package Instance08 is new BC54A06_0.Pool_Access_To_Var_Tag_Nonstat
     (BC54A06_1.Acc_Tag_Va_Nonstat);                                  -- ERROR:
                     -- Constraints of designated types do not result from same
                     -- evaluation/elaboration of a range/constraint.



   -- Formal discrete designated type:
   -- Two levels of indirection through formal packages:

   package Instance09 is new BC54A06_0.Pool_Access_To_Var_Form_Disc
     (BC54A06_0.In_Desig_Num, BC54A06_1.Acc_Num);                     -- OK.


   package Instance10 is new BC54A06_0.Pool_Access_To_Var_Form_Disc
     (BC54A06_0.In_Desig_Num, BC54A06_1.Acc_New_Num);                 -- ERROR:
                                             -- Designated types are different.

   package Instance11 is new BC54A06_0.Pool_Access_To_Var_Form_Disc
     (BC54A06_0.In_Desig_Num, BC54A06_1.Acc_Pos);                     -- ERROR:
                                     -- Designated types have different bounds.

   package Instance12 is new BC54A06_0.Pool_Access_To_Var_Form_Disc
     (BC54A06_0.In_Desig_Num, BC54A06_1.Acc_Num_Nonstat);             -- ERROR:
                -- Designated type in formal is static; in actual is nonstatic.


end BC54A06;
