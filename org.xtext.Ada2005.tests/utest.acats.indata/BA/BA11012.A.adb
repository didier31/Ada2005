-- BA11012.A
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
--      Check that in a library_unit_renaming_declaration, the (old) name must
--      denote a library_item.
--      Check that a generic renaming of a child of a parent generic package
--      is not allowed outside the declarative region of the parent generic.
--      Check that a library unit must be a private descendent of the parent
--      of a private child when the private child has been renamed and the name
--      denoting the renaming has been used in a with clause.
--      Check for subsequent renaming declarations of private children.
--
-- TEST DESCRIPTION:
--      This test declares generic procedure, generic function, and generic 
--      packages with children.  
--
--                                BA11012_0                        
--           -------------------------------------------------------
--          |          |          |          |          |           |     
--          |          |          |          |          |           |
--      BA11012_1  BA11012_3  BA11012_8  BA11012_9  BA11012_11  BA11012_17
--      (private)  (renamed)             (private)  (renamed)   (private)
--          |                                                       |
--          |                                                       |
--           ------------------------------                         |    
--          /        \          \          \                        |     
--         /          \          \          \                       |      
--      BA11012_2  BA11012_5  BA11012_14  BA11012_16            BA11012_20  
--      (private)  (renamed)  (private)   (renamed)               
--      
--      The following cases should cause compile-time errors:
--         (a) rename the private generic parent package BA11012_0.BA11012_1 
--             as BA11012_4.
--         (b) rename the private generic grandchild package 
--             BA11012_0.BA11012_1.BA11012_2 as BA11012_0.BA11012_6.
--         (c) "with" renamed (private) generic parent package 
--             BA11012_0.BA11012_3 in private package BA11012_7.
--         (d) "with" renamed (private) generic parent package BA11012_0.
--             BA11012_3 in public parent package BA11012_0.BA11012_8.
--         (e) rename the renamed (private) generic parent package 
--             BA11012_0.BA11012_3 as BA11012_10.
--         (f) "with" renamed (private) generic grandchild package
--             BA11012_0.BA11012_1.BA11012_5 in private parent package 
--             BA11012_0.BA11012_12.
--         (g) "with" renamed (private) generic grandchild package
--             BA11012_0.BA11012_1.BA11012_5 in public grandchild package 
--             BA11012_0.BA11012_1.BA11012_13.
--         (h) rename the renamed (private) generic grandchild package
--             BA11012_0.BA11012_1.BA11012_5 in private parent package 
--             BA11012_0.BA11012_15.
--         (i) rename the renamed package BA11012_18 of BA11012_0.BA11012_17 
--             as BA11012_0.BA11012_19.
--
--
-- CHANGE HISTORY:
--      11 Jul 95   SAIC    Initial prerelease version
--      24 Aug 96   SAIC    Modified test description and comment for package
--                          BA11012_12.
--
--!

generic
package BA11012_0 is end;

-------------------------------------------------------
private
generic
package BA11012_0.BA11012_1 is end;

-------------------------------------------------------
private
generic
package BA11012_0.BA11012_1.BA11012_2 is end;

-------------------------------------------------------
with BA11012_0.BA11012_1;               -- private generic parent package.
private
generic 
package BA11012_0.BA11012_3 renames BA11012_0.BA11012_1;              -- OK.

-------------------------------------------------------
with BA11012_0.BA11012_1;               -- private generic parent package.
private 
generic 
package BA11012_4 renames BA11012_0.BA11012_1;                        -- ERROR:
                                -- Outside the declarative region of BA11012_0.

-------------------------------------------------------
with BA11012_0.BA11012_1.BA11012_2;     -- private generic grandchild package.
private 
generic 
package BA11012_0.BA11012_1.BA11012_5 renames 
  BA11012_0.BA11012_1.BA11012_2;                                      -- OK.

-------------------------------------------------------
with BA11012_0.BA11012_1.BA11012_2;     -- private generic grandchild package.
private 
generic 
package BA11012_0.BA11012_6 renames BA11012_0.BA11012_1.BA11012_2;    -- ERROR:
                                -- Outside the declarative region of BA11012_1.

-------------------------------------------------------
with BA11012_0.BA11012_3;          -- renamed (private) generic parent package.
private
package BA11012_7 is end;                                             -- ERROR:
                            -- BA11012_3 is private; BA11012_7 is not a private 
                            -- descendent of BA11012_0.

-------------------------------------------------------
with BA11012_0.BA11012_3;          -- renamed (private) generic parent package.
generic 
package BA11012_0.BA11012_8 is end;                                   -- ERROR:
                            -- BA11012_3 is private; BA11012_8 is not a private 
                            -- descendent of BA11012_0.

-------------------------------------------------------
with BA11012_0.BA11012_3;          -- renamed (private) generic parent package.
private
generic 
package BA11012_0.BA11012_9 is end;                                   -- OK.

-------------------------------------------------------
with BA11012_0.BA11012_3;          -- renamed (private) generic parent package.
private
generic
package BA11012_10 renames BA11012_0.BA11012_3;                       -- ERROR:
                                -- Outside the declarative region of BA11012_0.

-------------------------------------------------------
with BA11012_0.BA11012_3;          -- renamed (private) generic parent package.
private
generic 
package BA11012_0.BA11012_11 renames BA11012_0.BA11012_3;             -- OK.

-------------------------------------------------------
with BA11012_0.BA11012_1.BA11012_5; 
                               -- renamed (private) generic grandchild package.
private
generic 
package BA11012_0.BA11012_12 is end;                                  -- ERROR:
                           -- BA11012_5 is private; BA11012_12 is not a private 
                           -- descendent of BA11012_1.

-------------------------------------------------------
with BA11012_0.BA11012_1.BA11012_5; 
                               -- renamed (private) generic grandchild package.
generic 
package BA11012_0.BA11012_1.BA11012_13 is end;                        -- ERROR:
                           -- BA11012_5 is private; BA11012_13 is not a private 
                           -- descendent of BA11012_0.

-------------------------------------------------------
with BA11012_0.BA11012_1.BA11012_5; 
                               -- renamed (private) generic grandchild package.
private
generic 
package BA11012_0.BA11012_1.BA11012_14 is end;                        -- OK.

-------------------------------------------------------
with BA11012_0.BA11012_1.BA11012_5; 
                               -- renamed (private) generic grandchild package.
private
generic 
package BA11012_0.BA11012_15 renames BA11012_0.BA11012_1.BA11012_5;   -- ERROR:
                                -- Outside the declarative region of BA11012_1.

-------------------------------------------------------
with BA11012_0.BA11012_1.BA11012_5; 
                               -- renamed (private) generic grandchild package.
private
generic 
package BA11012_0.BA11012_1.BA11012_16 renames 
  BA11012_0.BA11012_1.BA11012_5;                                      -- OK.

-------------------------------------------------------
with BA11012_0.BA11012_1;               -- private generic parent package.
private
generic 
package BA11012_0.BA11012_17 is
   generic package BA11012_18 renames BA11012_0.BA11012_1;            -- OK.
end BA11012_0.BA11012_17;

-------------------------------------------------------
with BA11012_0.BA11012_17;              -- private generic parent package.
private 
generic 
package BA11012_0.BA11012_19 renames BA11012_0.BA11012_17.BA11012_18; -- ERROR:
                                           -- BA11012_18 is not a library unit.

-------------------------------------------------------
generic 
package BA11012_0.BA11012_17.BA11012_20 is
   generic package BA11012_21 renames BA11012_18;                     -- OK.
end BA11012_0.BA11012_17.BA11012_20;
