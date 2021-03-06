-- BA12003.A
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
--      Check that the with-clause of the public descendant of a private
--      descendant of a library unit cannot include any private descendants
--      of its (immediate) parent.
--
-- TEST DESCRIPTION:
--      Declare a grandparent package.  Declare a private parent package.
--      Declare a private grandchild function.  Declare a public grandchild 
--      package.  Declare a public great grandchild procedure.  Declare a 
--      private great grandchild package. Declare a second public grandchild 
--      package.  
--
--                               BA12003_0
--                                   |      
--                                   |      
--                                   |      
--                               BA12003_1              
--                               (private)              
--                              /    |     \          
--                             /     |      \          
--                            /      |       \
--                     BA12003_6 BA12003_2 BA12003_3              
--                               (private)  /     \             
--                                         /       \
--                                        /         \
--                                     BA12003_4  BA12003_5           
--                                                (private)
--
--      In the specification of the second public grandchild package, 
--      BA12003_6, "with"s the following library units:
--
--         (a) the public grandchild package, BA12003_3.
--         (b) the public great grandchild procedure, BA12003_4. 
--         (c) the private grandchild function, BA12003_2.
--         (d) the private great grandchild package, BA12003_5.
--
--      Cases (c) and (d) should cause compile-time errors.
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--      10 Mar 95   SAIC    Modified the full path name of BA12003_6.
--
--!

-- Grandparent

package BA12003_0 is

   type Grandparent_Type is range 1 .. 100;

end BA12003_0;

-- No body for BA12003_0.


     --=================================================================--

-- Private parent

private package BA12003_0.BA12003_1 is

   type Private_Parent_Type is range 101 .. 500;

   Private_Parent_Var : Grandparent_Type := 11;

end BA12003_0.BA12003_1;


-- No body for BA12003_0.BA12003_1.

     --=================================================================--


-- Private grandchild
private function BA12003_0.BA12003_1.BA12003_2 (X, Y :  Private_Parent_Type)
  return Private_Parent_Type;   

function BA12003_0.BA12003_1.BA12003_2 (X, Y :  Private_Parent_Type)
  return Private_Parent_Type is                                             
   
begin

   -- Real body of function goes here.

   return (X + Y);

end BA12003_0.BA12003_1.BA12003_2;

     --=================================================================--

-- Public grandchild

package BA12003_0.BA12003_1.BA12003_3 is
  
   type Public_Grandchild_Type is range 501 .. 700;

   Public_Grandchild_Var : Grandparent_Type := 49;

end BA12003_0.BA12003_1.BA12003_3;
                       
     --=================================================================--

-- Public great grandchild

procedure BA12003_0.BA12003_1.BA12003_3.BA12003_4 is

   Public_Greatchild_Var : Public_Grandchild_Type := 640;

begin

   Public_Greatchild_Var := Public_Greatchild_Var / 4;

   -- Real body of procedure goes here.

end BA12003_0.BA12003_1.BA12003_3.BA12003_4;

     --=================================================================--

-- Private great grandchild

private package BA12003_0.BA12003_1.BA12003_3.BA12003_5 is

   Private_Greatchild_Var : Private_Parent_Type := 470;

end BA12003_0.BA12003_1.BA12003_3.BA12003_5;


-- No body for BA12003_0.BA12003_1.BA12003_3.BA12003_5.

     --=================================================================--

-- Public child

with BA12003_0.BA12003_1.BA12003_3;                 -- OK

with BA12003_0.BA12003_1.BA12003_3.BA12003_4;       -- OK

with BA12003_0.BA12003_1.BA12003_2;                                  -- ERROR:
                                   -- private descendant of (immediate) parent

with BA12003_0.BA12003_1.BA12003_3.BA12003_5;                        -- ERROR:
                                   -- private descendant of (immediate) parent

package BA12003_0.BA12003_1.BA12003_6 is

   Public_Child_Var : Grandparent_Type := 35;

end BA12003_0.BA12003_1.BA12003_6;


-- No body for BA12003_0.BA12003_1.BA12003_6.
