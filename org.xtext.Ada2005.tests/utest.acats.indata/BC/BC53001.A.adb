-- BC53001.A
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
--      Check that the index subtypes of an unconstrained formal array
--      subtype and its corresponding actual subtype must statically
--      match.
--
--      Check that the index ranges of a constrained formal array
--      subtype and its corresponding actual subtype must statically
--      match.
--
--      Check that the component subtypes of a formal array type and its
--      corresponding actual type must statically match. 
--
-- TEST DESCRIPTION:
--      Two subtypes statically match if their constraints statically match.
--      Two constraints statically match if both are null constraints, both
--      are static and have equal corresponding bounds or discriminant values,
--      or both are nonstatic and result from the same elaboration of a
--      constraint of a subtype indication or the same evaluation of a range
--      of a discrete subtype definition.
--
--      Two ranges statically match if both result from the same evaluation of
--      a range, or both are static and have equal corresponding bounds.
--      
--      Declare formal unconstrained array and constrained array subtypes.
--      Verify that their corresponding actual subtypes must statically
--      match.      
--
--
-- CHANGE HISTORY:
--      01 Feb 95   SAIC    Initial version.
--      20 Apr 95   SAIC    Added a new subtype case.
--


function BC53001_0 return Natural is
begin           -- Artificial; in real code this function might
   return 100;  -- prompt the user for a value.
end BC53001_0;


     --==================================================================--


with BC53001_0;
package BC53001_1 is

   function Upper_Bound return Natural renames BC53001_0;


   subtype Index_Static    is Natural range 1 .. 100;
   subtype Index_NonStatic is Natural range 1 .. Upper_Bound;


   type Record_Type (L: Index_Static := 10) is record
      S: String (1 .. L);
   end record;

   subtype Record_Comp is Record_Type(10);


   generic
      type Formal_Unconstr is array (Index_Nonstatic range <>) of Record_Comp;
   package Unconstrained_Formal is end;

   generic
      type Formal_Constr is array (Index_Static) of Record_Comp;
   package Constrained_Formal is end;

   generic
      type Formal_SEG_Constr is (<>);
   package Constrained_SEG_Formal is 
      subtype Same_Elab_Constr is Formal_SEG_Constr;
      type Unconstr_Arr is array (Same_Elab_Constr range <>) of Record_Comp;
   end Constrained_SEG_Formal;

end BC53001_1;


     --==================================================================--


with BC53001_1;
use  BC53001_1;
package BC53001_2 is

--
-- Nonstatic index subtypes:
--

   subtype Same_Elab_Constraint is Index_Nonstatic;
   subtype Dupl_Range_Nonstatic is Natural range 1 .. Upper_Bound;


--
-- Static index subtypes:
--

   subtype Attr_Range_Static is Natural range
     Index_Static'first .. Index_Static'last;

   subtype Diff_Range_Static is Index_Static range 2 .. 100;



--
-- Component subtypes:
--

   type    New_Record_Type      is new Record_Comp;
   subtype Same_Disc_Constraint is Record_Type(10);


--
-- Unconstrained array actuals:
--

   type Unconstr_Arr1 is array (Index_Nonstatic      range <>) of Record_Comp;
   type Unconstr_Arr2 is array (Same_Elab_Constraint range <>) of Record_Comp;
   type Unconstr_Arr3 is array (Dupl_Range_Nonstatic range <>) of Record_Comp;


--
-- Constrained array actuals (with various index subtypes):
--

   type Constr_Arr1 is array (1 .. 100)          of Record_Comp;
   type Constr_Arr2 is array (Attr_Range_Static) of Record_Comp;
   type Constr_Arr3 is array (Diff_Range_Static) of Record_Comp;


--
-- Constrained array actuals (with various component subtypes):
--

   type Constr_Arr4 is array (Index_Static) of Record_Type;
   type Constr_Arr5 is array (Index_Static) of New_Record_Type;
   type Constr_Arr6 is array (Index_Static) of Same_Disc_Constraint;


end BC53001_2;


     --==================================================================--


with BC53001_1;
with BC53001_2;
package BC53001 is

--
-- Check static matching for index subtypes of unconstrained arrays:
--

   package I1 is new BC53001_1.Unconstrained_Formal 
                                          (BC53001_2.Unconstr_Arr1);  -- OK.


   package I2 is new BC53001_1.Unconstrained_Formal 
                                          (BC53001_2.Unconstr_Arr2);  -- OK.

   package I_SEG is new BC53001_1.Constrained_SEG_Formal
                                          (BC53001_1.Index_NonStatic);

   package II2 is new BC53001_1.Unconstrained_Formal 
                                          (I_SEG.Unconstr_Arr);       -- OK.

   package I3 is new BC53001_1.Unconstrained_Formal 
                                          (BC53001_2.Unconstr_Arr3);  -- ERROR:
                       -- Constraints of index subtypes do not result from same
                       -- evaluation/elaboration of a range/constraint.


--
-- Check static matching for index ranges of constrained arrays:
--

   package I4 is new BC53001_1.Constrained_Formal 
                                        (BC53001_2.Constr_Arr1);      -- OK.


   package I5 is new BC53001_1.Constrained_Formal 
                                        (BC53001_2.Constr_Arr2);      -- OK.


   package I6 is new BC53001_1.Constrained_Formal 
                                        (BC53001_2.Constr_Arr3);      -- ERROR:
                                       -- Index subtypes have different bounds.


--
-- Check static matching for component subtypes:
--

   package I7 is new BC53001_1.Constrained_Formal 
                                        (BC53001_2.Constr_Arr4);      -- ERROR:
        -- Component subtype in actual has null constraint; in formal does not.

   package I8 is new BC53001_1.Constrained_Formal 
                                        (BC53001_2.Constr_Arr5);      -- ERROR:
                                              -- Component types are different.

   package I9 is new BC53001_1.Constrained_Formal 
                                        (BC53001_2.Constr_Arr6);      -- OK.


end BC53001;
