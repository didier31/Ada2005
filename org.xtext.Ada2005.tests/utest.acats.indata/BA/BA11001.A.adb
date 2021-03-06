-- BA11001.A
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
--      Check that in the visible part of a public child, the private
--      declarations of the parent package are not visible.
--
-- TEST DESCRIPTION:
--      The parent package includes integer, record, record with one private
--      component, tagged, and extension tagged type.
--
--      Declare a public child package which incorrectly uses its parent's 
--      private declarations in its visible part.
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--
--!

package BA11001_0 is    

   -- Type definitions.

   type Visible_Integer is range 1 .. 10;

   type Private_Record is private;

   type Visible_Tagged is tagged
      record
         VI : Visible_Integer;
         PR : Private_Record;
      end record;

   type Color is (White, Black, Red);

   type Private_Extension is new Visible_Tagged with private;

   -- Object definitions.

   Visible_Integer_Num : Visible_Integer := 5;


private
   -- Type definitions.

   type Private_Integer is range 11 .. 20;

   type Private_Record is
      record
         VI : Visible_Integer;
         PI : Private_Integer;
      end record;

   type Private_Extension is new Visible_Tagged with
      record
         C  : Color;
      end record;

   -- Object definitions.

   Private_Integer_Num : Visible_Integer :=  6;

   Private_Exception   : exception;

end BA11001_0;       


-- No body for BA11001_0.


     --=================================================================--

-- Public child 

package BA11001_0.BA11001_1 is    

   -- Integer declarations.

   Child_Variable1  : Visible_Integer 
                    := Visible_Integer_Num;                  -- OK 
  
   Child_Variable2  : Private_Integer;                       -- ERROR: 
                                   -- Private_Integer not visible here
   Child_Variable3  : Visible_Integer 
                    := Private_Integer_Num;                  -- ERROR: 
                               -- Private_Integer_Num not visible here

   -- Record declaration.

   Child_Variable4  : Private_Record;                        -- OK

   function Assign_Int (I : Visible_Integer) 
     return Visible_Integer;

   Child_Variable5  : Visible_Integer 
                    := Assign_Int (Child_Variable4.VI);      -- ERROR: 
                                      -- component VI not visible here

   -- Record with one private component declarations.

   Child_Variable6  : Visible_Tagged;                        -- OK

   function Assign_Tagged (I : Visible_Integer) 
     return Visible_Tagged;

   Child_Variable7  : Visible_Tagged  
                    := Assign_Tagged (Child_Variable6.VI);   -- OK

   function Assign_Record (PR : Private_Record)
     return Visible_Tagged;

   Child_Variable8  : Visible_Tagged  
                    := Assign_Record (Child_Variable6.PR);   -- OK

   Child_Variable9  : Visible_Integer 
                    := Assign_Int (Child_Variable6.PR.VI);   -- ERROR: 
                                      -- component VI not visible here

   -- Record with private extension declaration.

   Child_Variable10 : Private_Extension;                     -- OK

   Child_Variable11 : Visible_Integer 
                    := Assign_Int (Child_Variable10.VI);     -- OK

   function Assign_Color (C : Color)
     return Color;

   Child_Variable12 : Color             
                    := Assign_Color (Child_Variable10.C);    -- ERROR:
                                       -- component C not visible here
   -- Exception declaration.

   Child_Exception  : exception renames Private_Exception;   -- ERROR:
                       -- exception Private_Exception not visible here
end BA11001_0.BA11001_1;

-- No body for BA11001_0.BA11001_1.
