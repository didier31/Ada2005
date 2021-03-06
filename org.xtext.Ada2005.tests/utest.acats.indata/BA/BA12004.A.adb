-- BA12004.A
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
--      Check that a with-clause of a library unit may not include the
--      private child or any descendant of a private child of some other
--      library unit.
--
-- TEST DESCRIPTION:
--      Declare a grandparent package.  Declare a public parent package.
--      Declare a private grandchild procedure.  Declare a private parent 
--      package.  Declare a public grandchild package.  Declare a public
--      grandchild function.
--
--                               BA12004_0
--                               /       \
--                              /         \
--                       BA12004_1     BA12004_2
--                         /           (private)       
--                        /                   \
--                       /                     \
--                  BA12004_3                BA12004_4
--                  (private)                   \
--                                               \
--                                             BA12004_5
--
--      In the main program, "with"s the following library units:
--        
--         (a) the public child package, BA12004_1.
--         (b) the private child package, BA12004_2.
--         (c) the private grandchild procedure, BA12004_3.
--         (d) the public grandchild package, BA12004_4.
--         (e) the public great grandchild function, BA12004_5.
--         (f) The specification of a package not in the hierarchy, BA12004_7,
--               "with"s the child BA12004_2.
--
--      All cases (b) through (f) should cause compile-time errors.
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--
--!

-- Grandparent

package BA12004_0 is

   type Grandparent_Type is range 101 .. 500;

end BA12004_0;

-- No body for BA12004_0.


     --=================================================================--

-- Public parent

package BA12004_0.BA12004_1 is

   type Public_Parent_Type is range 1 .. 100;
   Public_Parent_Var : Grandparent_Type := 125;

end BA12004_0.BA12004_1;


-- No body for BA12004_0.BA12004_1.

     --=================================================================--


-- Private parent

private package BA12004_0.BA12004_2 is
   
   Private_Parent_Var : Grandparent_Type := 236;

end BA12004_0.BA12004_2;

     --=================================================================--

-- Private child

private procedure BA12004_0.BA12004_1.BA12004_3;

procedure BA12004_0.BA12004_1.BA12004_3 is

   Private_Grandchild_Var : Public_Parent_Type := 26;

begin

   Private_Grandchild_Var := Private_Grandchild_Var * 3;

   -- Real body of procedure goes here.

end BA12004_0.BA12004_1.BA12004_3;
                       
     --=================================================================--

-- Public child

package BA12004_0.BA12004_2.BA12004_4 is

   type Child_Type is range 501 .. 600;
   Public_Child_Var : Grandparent_Type := 278;

end BA12004_0.BA12004_2.BA12004_4;


-- No body for BA12004_0.BA12004_2.BA12004_4.

     --=================================================================--

-- Public grandchild

function BA12004_0.BA12004_2.BA12004_4.BA12004_5 (N : Child_Type) 
  return Child_Type;
   
function BA12004_0.BA12004_2.BA12004_4.BA12004_5 (N : Child_Type) 
  return Child_Type is
begin

   -- Real body of function goes here.

   return (N - 4);

end BA12004_0.BA12004_2.BA12004_4.BA12004_5;

     --=================================================================--

with BA12004_0.BA12004_1;                                          -- OK.

with BA12004_0.BA12004_2;                                          -- ERROR:
                          -- Child BA12004_2 is not visible in this context.

with BA12004_0.BA12004_1.BA12004_3;                                -- ERROR:
                          -- Child BA12004_3 is not visible in this context.

with BA12004_0.BA12004_2.BA12004_4;                                -- ERROR:
                          -- Child BA12004_4 is not visible in this context.

with BA12004_0.BA12004_2.BA12004_4.BA12004_5;                      -- ERROR:
                          -- Child BA12004_5 is not visible in this context.

package BA12004 is

   Client_Var : BA12004_0.Grandparent_Type := 451;

end BA12004;

-- No body for BA12004.

     --=================================================================--

with BA12004_0.BA12004_2;                                          -- ERROR:
                          -- Child BA12004_2 is not visible in this context.
package BA12004_7 is

  type Invisible is (A, B, C);

end BA12004_7;
