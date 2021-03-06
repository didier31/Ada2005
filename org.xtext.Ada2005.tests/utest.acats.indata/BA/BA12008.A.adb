-- BA12008.A
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
--      Check that a child unit may not be "with"ed using only its simple name.
--      Check that a child unit may not be "with"ed using any abbreviated 
--      version of its full expanded name (e.g., grandparent.child rather than
--      grandparent.parent.child)
--
-- TEST DESCRIPTION:
--      Declare a public parent package.  Declare a public child package.
--      Declare a public grandchild package.  Declare a public great 
--      grandchild procedure.  Verify that all cases in which a client tries
--      to "with" the library units using anything but the fully expanded
--      name are illegal.
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--
--!

-- Public parent

package BA12008_0 is

   type Parent_Type is range 1 .. 100;

end BA12008_0;

-- No bodies required for BA12008_0.

     --=================================================================--

-- Public child

package BA12008_0.BA12008_1 is

   type Child_Type is range 101 .. 500;

   Child_Var : Parent_Type := 11;

end BA12008_0.BA12008_1;

-- No bodies required for BA12008_0.BA12008_1.

     --=================================================================--

-- Public grandchild

package BA12008_0.BA12008_1.BA12008_2 is

   type Grand_Child_Type is range 501 .. 600;

end BA12008_0.BA12008_1.BA12008_2;

-- No bodies required for BA12008_0.BA12008_2.

     --=================================================================--

-- Public great grandchild

procedure BA12008_0.BA12008_1.BA12008_2.BA12008_3 is

   Public_Greatchild_Var : Grand_Child_Type := 564;

begin
   null;
end BA12008_0.BA12008_1.BA12008_2.BA12008_3;

     --=================================================================--

with BA12008_0;                                                      -- OK
with BA12008_0.BA12008_1;                                            -- OK
with BA12008_0.BA12008_1.BA12008_2;                                  -- OK
with BA12008_0.BA12008_1.BA12008_2.BA12008_3;                        -- OK

with BA12008_3;                                                      -- ERROR:
                                          -- Great grandchild simple name.

with BA12008_0.BA12008_2;                                            -- ERROR:
                                          -- Parent.Grandchild name.

with BA12008_0.BA12008_3;                                            -- ERROR:
                                          -- Parent.Great grandchild name.

with BA12008_1;                                                      -- ERROR:
                                          -- Child simple name.

with BA12008_1.BA12008_2;                                            -- ERROR:
                                          -- Child.Grandchild name.

with BA12008_1.BA12008_3;                                            -- ERROR:
                                          -- Child.Great grandchild name.

with BA12008_2;                                                      -- ERROR:
                                          -- Grandchild simple name.

with BA12008_2.BA12008_3;                                            -- ERROR:
                                          -- Grandchild.Great grandchild name.

procedure BA12008 is

   Client_Var : BA12008_0.Parent_Type := 35;

begin
   null;
end BA12008;
