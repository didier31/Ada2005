-- BA11008.A
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
--      Check that an instance of a child of a generic package that is not
--      part of a formal package declaration and that is a child of an
--      instance of the generic package is not allowed outside the
--      declarative region of the generic package itself.  Check
--      that an instance of a generic does not inherit children from the
--      generic.  Check that a child of an instance of a generic package
--      must be an instance.
--
-- TEST DESCRIPTION:
--      Declare a generic grandparent package.  Declare the first generic 
--      parent package.  Declare a generic grandchild package.  Declare the 
--      second generic parent package.  Declare the third generic parent 
--      package.  Declare a generic grandchild package. 
--      Declare another generic package with a generic child.
--      
--
--                             BA11008_0                      BA11008_6 
--                       /        |         \                     |
--                      /         |          \                    |
--                 BA11008_1   BA11008_3   BA11008_4          BA11008_7
--                    /                       \        
--                   /                         \      
--               BA11008_2                 BA11008_5                         
--      
--      The following cases should cause compile-time errors:
--         (a) instantiate BA11008_2 in the body of BA11008_3.
--         (b) instantiate BA11008_2 in the body of BA11008_5.
--         (c) instantiate BA11008_1 as a library package.
--         (d) instantiate BA11008_1 as a child of BA11008_24.
--         (e) instantiate BA11008_1 in BA11008.
--         (f) instantiate BA11008_2 in BA11008.
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--      27 Nov 95   SAIC    Update and repair for ACVC 2.0.1
--
--!
 
-- Generic grandparent package
generic
package BA11008_0 is

   type Grand_Parent_Type is range 1..100;

end BA11008_0;
 
-- No bodies required for BA11008_0.
 
     --=================================================================--
 
-- Generic public parent package.  
generic
package BA11008_0.BA11008_1 is

   Parent_Var : Grand_Parent_Type := 10;
 
end BA11008_0.BA11008_1;
 
-- No bodies required for BA11008_0.BA11008_1.
 
     --=================================================================--
 
-- Generic public grandchild package.  
generic
package BA11008_0.BA11008_1.BA11008_2 is
   Grand_Child_Var : Grand_Parent_Type := 32;
 
end BA11008_0.BA11008_1.BA11008_2;
 
-- No bodies required for BA11008_0.BA11008_1.BA11008_2.
 
     --=================================================================--
 
-- Generic public parent package.  
generic
package BA11008_0.BA11008_3 is
 
   Parent_Var : Grand_Parent_Type := 17;
 
   procedure Parent_Proc;      -- will require the package body

end BA11008_0.BA11008_3;
 
     --=================================================================--
 
-- Generic public parent package.  
generic
package BA11008_0.BA11008_4 is
 
   type FParent_Type is range 100..200;
 
end BA11008_0.BA11008_4;
 
     --=================================================================--
 
-- Generic public grandchild package.  
generic
package BA11008_0.BA11008_4.BA11008_5 is
   Gr_Child_Var : FParent_Type := 125;
 
   procedure Gr_Child_Proc;      -- will require the package body

end BA11008_0.BA11008_4.BA11008_5;
 
     --=================================================================--
 
with BA11008_0.BA11008_1.BA11008_2;   -- Generic grandchild package,
                                      -- implicitly with BA11008_0.BA11008_1.
package body BA11008_0.BA11008_3 is
 
   package BA11008_10 is new BA11008_0.BA11008_1;                    -- OK. 
                                      -- within BA11008_0's declarative region.
 
   package BA11008_11 is new BA11008_0.BA11008_1.BA11008_2;          -- ERROR:
                      -- not in the declarative region of BA11008_0.BA11008_1.

   package BA11008_12 is new BA11008_10.BA11008_2;                   -- OK.

   procedure Parent_Proc is
   begin
      Parent_Var := Parent_Var + 1;
   end Parent_Proc;

end BA11008_0.BA11008_3;
 
     --=================================================================--
 
with BA11008_0.BA11008_1.BA11008_2;   -- Generic grandchild package,
                                      -- implicitly with BA11008_0.BA11008_1.
 
package body BA11008_0.BA11008_4.BA11008_5 is
 
   package BA11008_13 is new BA11008_0.BA11008_1;                    -- OK. 
                                     -- within BA11008_0's declarative region.
 
   package BA11008_14 is new BA11008_0.BA11008_1.BA11008_2;          -- ERROR:
                      -- not in the declarative region of BA11008_0.BA11008_1.
 
   procedure Gr_Child_Proc is
   begin
      Gr_Child_Var := Gr_Child_Var / 5;
   end Gr_Child_Proc;

end BA11008_0.BA11008_4.BA11008_5;
 
     --=================================================================--
 
-- Generic parent package
generic
package BA11008_6 is
 
   type SParent_Type is range 500..600;
 
end BA11008_6;
 
-- No body required for BA11008_6.
 
     --=================================================================--
 
-- Generic public child package.  
generic
package BA11008_6.BA11008_7 is
 
   Child_Var : SParent_Type := 567;
 
end BA11008_6.BA11008_7;
 
-- No body required for BA11008_6.BA11008_7.
 
      --=================================================================--
 
with BA11008_0;
package BA11008_15 is new BA11008_0;                                 -- OK. 

     --=================================================================--
 
with BA11008_0.BA11008_1;  -- Generic grandchild package
package BA11008_16 is new BA11008_0.BA11008_1;                       -- ERROR:
                               -- Must be a child of an instance of BA11008_0.

     --=================================================================--
 
with BA11008_6.BA11008_7;             -- Generic child package.
package BA11008_20 is new BA11008_6;                                 -- OK. 
 
      --=================================================================--
 
with BA11008_0;                       -- Generic child package.
                                      -- implicitly with BA11008_0.
package BA11008_24 is new BA11008_0;                                 -- OK. 

package BA11008_24.BA11008_7 is new BA11008_24.BA11008_1;            -- ERROR:
                                            -- Not in the scope of BA11008_24.

      --=================================================================--
 
with BA11008_0.BA11008_1;             -- Generic child package.
package BA11008_24.BA11008_8 is new BA11008_24.BA11008_1;            -- OK.

      --=================================================================--
 
with BA11008_0.BA11008_1.BA11008_2;   -- Generic grandchild package,
                                      -- implicitly with BA11008_0,
                                      -- BA11008_0.BA11008_1.
 
procedure BA11008 is
 
   package BA11008_22 is new BA11008_0.BA11008_1;                    -- ERROR:
                               -- Must be a child of an instance of BA11008_0.

   package BA11008_23 is new BA11008_0.BA11008_1.BA11008_2;          -- ERROR:
                     -- Must be a child of an instance of BA11008_0.BA11008_1.
 
begin
   null;
end BA11008;
