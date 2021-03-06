-- BA11007.A
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
--      Check that a child library subprogram may not override a user-defined
--      primitive subprogram.
--
-- TEST DESCRIPTION:
--      Declare two primitive subprograms of two root types in the grandparent 
--      package.  Declare a new type of the first root type.  Declare a new
--      type of the second root type.  Then declare a new type of that new
--      type.  Declare two public parent packages.  In the first parent 
--      package, declare a new type of the first new type from the grandparent 
--      package.  In the second parent package, declare a new type of the new
--      type of the second new type from the grandparent package.
--
--      The following cases generate compile-time errors:
--      (a) Declare a public parent function for the first new type in the 
--          grandparent package.  This parent function overrides the inherited 
--          grandparent subprogram.
--      (b) Declare a public child procedure for the new type of the
--          new type in the grandparent package.  This child procedure 
--          overrides the inherited second grandparent subprogram.
--      (c) Declare a public grandchild function for the new type that was
--          derived in the first parent package.  This grandchild function 
--          overrides the inherited parent subprogram.
--      (d) Declare a public grandchild procedure for the new type that was
--          derived in the second parent package.  This grandchild 
--          procedure overrides the inherited parent subprogram.
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--      17 Nov 95   SAIC    Update and repair for ACVC 2.0.1
--      08 Sep 96   SAIC    ACVC 2.1 
--
--!

package BA11007_0 is

   type Parent_Integer is range 1..100;

   function Parent_Function (I : Parent_Integer) 
     return Parent_Integer;

end BA11007_0;

     --=================================================================--

-- Grandparent package

with BA11007_0;
package BA11007_3 is

   type New_Parent_Integer is new BA11007_0.Parent_Integer;

   -- Inherited Parent_Function (I : New_Parent_Integer)

   type Parent_Record is
      record
         VI : New_Parent_Integer;
      end record;

   procedure Parent_Procedure (R : in out Parent_Record);

   type Derived_Parent_Record is new Parent_Record;

   -- Inherited Parent_Procedure (R : in out Derived_Parent_Record)

   type New_Derived_Parent_Record is new Derived_Parent_Record;

   -- Inherited Parent_Procedure (R : in out New_Derived_Parent_Record)

end BA11007_3;


-- No body provided for BA11007_0 or BA11007_3.


     --=================================================================--


-- Public child function.  

function BA11007_3.Parent_Function 
  (I : New_Parent_Integer) return New_Parent_Integer is           -- ERROR:
                         -- overrides (inherited) BA11007_3.Parent_Function
begin

   -- Real body of child function goes here.

   return I/2;

end BA11007_3.Parent_Function;


     --=================================================================--

-- Public child procedure.  

procedure BA11007_3.Parent_Procedure
  (R : in out New_Derived_Parent_Record) is                      -- ERROR:
                       -- overrides (inherited) BA11007_3.Parent_Procedure
begin

   -- Real body of child procedure goes here.

   R.VI := R.VI - 2;

end BA11007_3.Parent_Procedure;


     --=================================================================--

-- Public child package.  

package BA11007_3.BA11007_1 is

   type New_Child_Integer is new BA11007_0.Parent_Integer;

   -- Inherited Parent_Function (I : New_Child_Integer)

   -- Other definition and declarations ...

end BA11007_3.BA11007_1;


-- No body provided for BA11007_3.BA11007_1.


     --=================================================================--


-- Public grandchild function.  

function BA11007_3.BA11007_1.Parent_Function 
  (I : New_Child_Integer) return New_Child_Integer is             -- ERROR:
               -- overrides (inherited) BA11007_3.BA11007_1.Parent_Function
begin

   -- Real body of grandchild function goes here.

   return I;

end BA11007_3.BA11007_1.Parent_Function;


     --=================================================================--


-- Public grandchild procedure.  

procedure BA11007_3.BA11007_1.Parent_Procedure
  (R : in out New_Derived_Parent_Record) is                      -- OK.
                                          -- function does not override
begin

   -- Real body of grandchild procedure goes here.

   R.VI := R.VI + 3;

end BA11007_3.BA11007_1.Parent_Procedure;


     --=================================================================--


-- Public child package.  

package BA11007_3.BA11007_2 is

   type New_Child_Record is new New_Derived_Parent_Record;

   -- Inherited Parent_Procedure (R : in out New_Child_Record)

   -- Other definition and declarations ...

end BA11007_3.BA11007_2;


-- No body provided for BA11007_3.BA11007_2.


     --=================================================================--

-- Public grandchild procedure.  

procedure BA11007_3.BA11007_2.Parent_Procedure 
  (R : in out New_Child_Record) is                               -- ERROR:
             -- overrides (inherited) BA11007_3.BA11007_2.Parent_Procedure
begin

   -- Real body of grandchild procedure goes here.

   R.VI := R.VI * 4;

end BA11007_3.BA11007_2.Parent_Procedure;


     --=================================================================--

-- Public child function.

with BA11007_0;
function BA11007_3.BA11007_2.Parent_Function 
  (I : BA11007_0.Parent_Integer) 
    return BA11007_0.Parent_Integer is                           -- OK.
                                          -- function does not override
   use type BA11007_0.Parent_Integer;

begin

   -- Real body of child function goes here.

   return I/2;

end BA11007_3.BA11007_2.Parent_Function;
