-- BA11011.A
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
--      Check that the renamed entity must be a generic unit of the appropriate
--      kind.
--      Check that in a library_unit_renaming_declaration, the (old) name must
--      denote a library_item.
--      Check that a generic renaming of a child of a parent generic package
--      is not allowed outside the declarative region of the parent generic.
--      Check for subsequent renaming declarations of public children.
--
-- TEST DESCRIPTION:
--      This test declares generic procedure, generic function, and generic 
--      packages with children.  
--
--            BA11011_0                    BA11011_7
--              /    \                    (BA11011_8)                   
--             /      \                    (renamed)                     
--      BA11011_1  BA11011_2                                
--
--                                 BA11011_10                   BA11011_20
--                  ----------------------------------------- (new BA11011_10)
--                 /          |           |           |        \  
--                /           |           |           |         \
--            BA11011_11  BA11011_14  BA11011_16  BA11011_23  BA11011_26
--              /  \                  (renamed)
--            /      \                
--      BA11011_12  BA11011_17
--                 (BA11011_18)
--                  (renamed)
--
--      The following cases should cause compile-time errors:
--         (a) rename the generic package BA11011_0 as a generic procedure.
--         (b) rename the generic child procedure BA11011_1 as a generic 
--             child package.
--         (c) rename the generic child function BA11011_2 as a generic 
--             child package.
--         (d) rename the generic child procedure BA11011_1 as a generic 
--             child function.
--         (e) rename the renamed generic package BA11011_8 as a library unit.
--         (f) rename generic package BA11011_10.BA11011_11 as a library unit.
--         (g) rename generic package BA11011_10.BA11011_11.BA11011_12 in 
--             BA11011_10.BA11011_14.
--         (h) rename the renamed generic package BA11011_18 as a library unit.
--         (i) rename generic package BA11011_20.BA11011_11 as a library unit,
--             ("with" only BA11011_20).
--         (j) rename generic package BA11011_20.BA11011_11 as a library unit,
--             ("with" BA11011_10.BA11011_11, BA11011_20).
--         (k) rename the renamed generic package BA11011_24 as a library unit.
--         (l) rename the renamed generic package BA11011_24 as a child of
--             BA11011_10.
--         (m) rename generic package BA11011_20.BA11011_11 as a child of
--             BA11011_20.
--         (n) rename the renamed generic package BA11011_24 in the main.
--
--
-- CHANGE HISTORY:
--      10 Jul 95   SAIC    Initial prerelease version
--      01 May 96   SAIC    Modified test description. Generated errors for
--                          BA11011_26 and BA11011_29.
--
--!

generic
package BA11011_0 is end;

-------------------------------------------------------
generic
procedure BA11011_0.BA11011_1;

-------------------------------------------------------
generic
function BA11011_0.BA11011_2 return Integer;

-------------------------------------------------------
with BA11011_0;           
generic procedure BA11011_3 renames BA11011_0;                       -- ERROR:
                                      -- BA11011_0 is not a generic procedure.

-------------------------------------------------------
with BA11011_0.BA11011_1;
generic package BA11011_0.BA11011_4 renames BA11011_0.BA11011_1;     -- ERROR:
                                        -- BA11011_1 is not a generic package.

-------------------------------------------------------
with BA11011_0.BA11011_2;
generic package BA11011_0.BA11011_5 renames BA11011_0.BA11011_2;     -- ERROR:
                                        -- BA11011_2 is not a generic package.

-------------------------------------------------------
with BA11011_0.BA11011_1;
generic function BA11011_0.BA11011_6 renames BA11011_0.BA11011_1;    -- ERROR:
                                       -- BA11011_1 is not a generic function.

-------------------------------------------------------
with BA11011_0;
package BA11011_7 is
   generic package BA11011_8 renames BA11011_0;                       -- OK.
end BA11011_7;

-------------------------------------------------------
with BA11011_7;
generic package BA11011_9 renames BA11011_7.BA11011_8;                -- ERROR:
                                            -- BA11011_8 is not a library unit.

-------------------------------------------------------
generic
package BA11011_10 is end;

-------------------------------------------------------
generic
package BA11011_10.BA11011_11 is end;

-------------------------------------------------------
generic
package BA11011_10.BA11011_11.BA11011_12 is end;

-------------------------------------------------------
with BA11011_10.BA11011_11;
generic package BA11011_13 renames BA11011_10.BA11011_11;             -- ERROR:
                               -- Outside the declarative region of BA11011_10.

-------------------------------------------------------
with BA11011_10.BA11011_11.BA11011_12;
generic 
package BA11011_10.BA11011_14 is
   generic package BA11011_15 renames 
     BA11011_10.BA11011_11.BA11011_12;                                -- ERROR:
                               -- Outside the declarative region of BA11011_11.
end BA11011_10.BA11011_14;

-------------------------------------------------------
with BA11011_10.BA11011_11;
generic package BA11011_10.BA11011_16 renames BA11011_10.BA11011_11;  -- OK.

-------------------------------------------------------
with BA11011_10.BA11011_11.BA11011_12;
generic 
package BA11011_10.BA11011_11.BA11011_17 is
   generic package BA11011_18 renames 
     BA11011_10.BA11011_11.BA11011_12;                                -- OK.
end BA11011_10.BA11011_11.BA11011_17;

-------------------------------------------------------
with BA11011_10.BA11011_11.BA11011_17;
generic package BA11011_10.BA11011_11.BA11011_19 
  renames BA11011_10.BA11011_11.BA11011_17.BA11011_18;                -- ERROR:
                                           -- BA11011_18 is not a library unit.

-------------------------------------------------------
with BA11011_10;
package BA11011_20 is new BA11011_10;

-------------------------------------------------------
with BA11011_20;
generic package BA11011_21 renames BA11011_20.BA11011_11;             -- ERROR:
                                          -- BA11011_20.BA11011_11 not visible.

-------------------------------------------------------
with BA11011_10.BA11011_11;
with BA11011_20;
generic package BA11011_22 renames BA11011_20.BA11011_11;             -- ERROR:
                                -- BA11011_20.BA11011_11 is not a library unit.
                       -- BA11011_20.BA11011_11 is not an explicit declaration.

-------------------------------------------------------
with BA11011_10.BA11011_11;
generic 
package BA11011_10.BA11011_23 is
   generic package BA11011_24 renames BA11011_10.BA11011_11;          -- OK.
end BA11011_10.BA11011_23;

-------------------------------------------------------
with BA11011_10.BA11011_23;
generic package BA11011_25 renames 
  BA11011_10.BA11011_23.BA11011_24;                                   -- ERROR:
                                           -- BA11011_24 is not a library unit.

-------------------------------------------------------
with BA11011_10.BA11011_23;
generic 
package BA11011_10.BA11011_26 is
   generic package BA11011_27 renames 
     BA11011_10.BA11011_23.BA11011_24;                                -- ERROR:
                     -- BA11011_10.BA11011_23.BA11011_24 is not a library unit.
end BA11011_10.BA11011_26;

-------------------------------------------------------
with BA11011_10.BA11011_11;
with BA11011_20;
generic package BA11011_20.BA11011_28 renames BA11011_20.BA11011_11;  -- ERROR:
                                -- BA11011_20.BA11011_11 is not a library unit.

-------------------------------------------------------
with BA11011_10.BA11011_23;
procedure BA11011 is
   generic package BA11011_29 renames
     BA11011_10.BA11011_23.BA11011_24;                                -- ERROR:
                     -- BA11011_10.BA11011_23.BA11011_11 is not a library unit.

begin
   null;
end BA11011;
