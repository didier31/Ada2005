-- BA11010.A
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
--      Check that a library unit renaming declaration may not be used to
--      rename a physically nested package, a physically nested subprogram,
--      or a subunit.
--
-- TEST DESCRIPTION:
--      Declare a generic package.  Declare a parent package.  Declare a 
--      physically nested package in the parent package.  Instantiate the
--      generic package in the parent package.  Declare a subunit package in
--      the parent package.  Declare a subunit procedure in the subunit 
--      package.  Declare a child package.  Declare a physically nested
--      procedure in the child package.  Instantiate the generic package 
--      in the child package.  Declare a subunit function in the child
--      package.  Declare a child function.  Declare a physically nested 
--      package in the child function.  Declare a subunit procedure in the
--      child function.  Declare a procedure.  Declare a physically nested 
--      package in the procedure.  Declare a subunit function in the
--      procedure.  
--
--      The following cases should cause compile-time errors:
--         (a) rename the instance of BA11010_0 as a generic library package.
--         (b) rename physically nested package BA11010_2 in the parent package
--             as a library unit.
--         (c) rename the instance, BA11010_3, in the parent package as a
--             library unit.
--         (d) rename subunit procedure BA11010_5 of the subunit package
--             BA11010_4 in the parent package as a library unit.
--         (e) rename physically nested procedure BA11010_7 in the child  
--             package as a library unit.
--         (f) rename the instance, BA11010_8, in the child package as a
--             library unit.
--         (g) rename subunit function BA11010_9 in the child package as a
--             a library unit.
--         (h) rename physically nested package BA11010_11 in the child  
--             function as a library unit.
--         (i) rename subunit procedure BA11010_12 in the child function as a 
--             library unit.
--         (j) rename physically nested package BA11010_14 as a library unit.
--         (k) rename subunit function BA11010_15 as a library unit.
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--
--!

-- Generic package
generic
-- Parameters go here.
package BA11010_0 is
   type Generic_Type is range 1 .. 100;
end BA11010_0;

-- No bodies required for BA11010_0.

     --=================================================================--

with BA11010_0;
package BA11010_1 is

   type Parent_Type is range 101 .. 200;

   package BA11010_2 is
      type Inner_Type is range 201 .. 300;
   end BA11010_2;
  
   -- No bodies required for BA11010_2.

   --------------------------------------------------

   package BA11010_3 is new BA11010_0;

   --------------------------------------------------

   package BA11010_4 is
      procedure BA11010_5;
   end BA11010_4;

end BA11010_1;

     --=================================================================--

package body BA11010_1 is

   package body BA11010_4 is separate;

end BA11010_1;

     --=================================================================--

separate (BA11010_1)
package body BA11010_4 is 
   procedure BA11010_5 is separate;
end BA11010_4;

     --=================================================================--

separate (BA11010_1.BA11010_4)
procedure BA11010_5 is 
begin
   null;
end BA11010_5;

     --=================================================================--

with BA11010_0;
package BA11010_1.BA11010_6 is

   procedure BA11010_7;

   package BA11010_8 is new BA11010_0;

   function BA11010_9 return Parent_Type;

end BA11010_1.BA11010_6;

     --=================================================================--

package body BA11010_1.BA11010_6 is

   procedure BA11010_7 is
   begin
      -- Real body of procedure goes here.
      null;
   end BA11010_7;

   --------------------------------------------------

   function BA11010_9 return Parent_Type is separate;

end BA11010_1.BA11010_6;

     --=================================================================--

separate (BA11010_1.BA11010_6)
function BA11010_9 return Parent_Type is
begin
   -- Real body of function goes here.
   return 152;
end BA11010_9;

     --=================================================================--

function BA11010_1.BA11010_10 return Parent_Type is

     package BA11010_11 is
        type Enum_Type is (Off, On);
     end BA11010_11;
  
     -- No bodies required for BA11010_11.

     --------------------------------------------------

     procedure BA11010_12 is separate;

begin
   -- Real body of child function goes here.
   return 124;
end BA11010_1.BA11010_10;

     --=================================================================--

separate (BA11010_1.BA11010_10)
procedure BA11010_12 is
begin
   null;
end BA11010_12;

     --=================================================================--

procedure BA11010_13 is

   package BA11010_14 is
      type Color_Type is (Red, White);
   end BA11010_14;
  
   -- No bodies required for BA11010_14.

   --------------------------------------------------

   function BA11010_15 return integer is separate;

begin
   null;
end BA11010_13;

     --=================================================================--

separate (BA11010_13)
function BA11010_15 return integer is 
begin
   return 78;
end BA11010_15;

     --=================================================================--

-- Package and subprogram renaming as compilation units.

with BA11010_0;                            -- generic package
generic package BA11010_20 renames BA11010_0;                        -- OK

with BA11010_20;                           -- generic package
package BA11010_21 is new BA11010_20;                                -- OK

with BA11010_21;
generic package BA11010_22 renames BA11010_21;                       -- ERROR:
                                           -- BA11010_21 is not a generic pkg.

------------------------------------------------------------------------------
with BA11010_1;                            -- public parent package
package BA11010_23 renames BA11010_1;                                -- OK

with BA11010_1;                            -- public parent package
package BA11010_24 renames BA11010_1.BA11010_2;                      -- ERROR:
                                           -- BA11010_2 is a nested package.

with BA11010_1;                            -- public parent package
package BA11010_25 renames BA11010_1.BA11010_3;                      -- ERROR:
                                    -- BA11010_3 is a nested package instance.

with BA11010_1;                            -- public parent package
procedure BA11010_26 renames BA11010_1.BA11010_4.BA11010_5;          -- ERROR:
                                           -- BA11010_5 is a subunit.

------------------------------------------------------------------------------
with BA11010_1.BA11010_6;                  -- public child package
package BA11010_27 renames BA11010_1.BA11010_6;                      -- OK

with BA11010_1.BA11010_6;                  -- public child package
procedure BA11010_28 renames BA11010_1.BA11010_6.BA11010_7;          -- ERROR:
                                           -- BA11010_7 is a nested procedure.

with BA11010_1.BA11010_6;                  -- public child package
package BA11010_29 renames BA11010_1.BA11010_6.BA11010_8;            -- ERROR:
                                    -- BA11010_8 is a nested package instance.

with BA11010_1.BA11010_6;                  -- public child package
function BA11010_30 return BA11010_1.Parent_Type
  renames BA11010_1.BA11010_6.BA11010_9;                             -- ERROR:
                                           -- BA11010_9 is a subunit.

------------------------------------------------------------------------------
with BA11010_1.BA11010_10;                 -- public child function
function BA11010_31 return BA11010_1.Parent_Type 
  renames BA11010_1.BA11010_10;                                        -- OK

with BA11010_1.BA11010_10;                 -- public child function
package BA11010_32 renames BA11010_1.BA11010_10.BA11010_11;          -- ERROR:
                                           -- BA11010_11 is a nested package.

with BA11010_1.BA11010_10;                 -- public child function
procedure BA11010_33 renames BA11010_1.BA11010_10.BA11010_12;        -- ERROR:
                                           -- BA11010_12 is a subunit.

------------------------------------------------------------------------------
with BA11010_13;                           
procedure BA11010_34 renames BA11010_13;                             -- OK

with BA11010_13;                           
package BA11010_35 renames BA11010_13.BA11010_14;                    -- ERROR:
                                           -- BA11010_14 is a nested package.

with BA11010_13;                           
function BA11010_36 return integer renames BA11010_13.BA11010_15;    -- ERROR:
                                           -- BA11010_15 is a subunit.
