-- BA12001.A
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
--      Check that the with-clause of a public child of some library unit
--      cannot include a private child of the same ancestor.
--
-- TEST DESCRIPTION:
--      Declare a grandparent package.  Declare a private parent package.
--      Declare a private grandchild function.  Declare a public grandchild 
--      procedure.  Declare a second public parent package.  
--
--                             BA12001_0
--                               /    \
--                              /      \
--                        BA12001_1  BA12001_4
--                        (private)
--                         /     \
--                        /       \
--                  BA12001_2    BA12001_3
--                  (private)  
--      
--      In the specification of the second public parent package, BA12001_4,
--      "with"s the following library units:
--
--         (a) the private parent package, BA12001_1.
--         (b) the private grandchild procedure, BA12001_2.
--         (c) the public grandchild function, BA12001_3.
--
--      All cases (a) through (c) should cause compile-time errors.
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--
--!

-- Grandparent

package BA12001_0 is

   type Grandparent_Type is range 1 .. 100;

end BA12001_0;

-- No body for BA12001_0.


     --=================================================================--

-- Private parent

private package BA12001_0.BA12001_1 is

   type Private_Parent_Type is range 101 .. 500;

   Private_Parent_Var : Grandparent_Type := 11;

end BA12001_0.BA12001_1;


-- No body for BA12001_0.BA12001_1.

     --=================================================================--


-- Private grandchild
private function BA12001_0.BA12001_1.BA12001_2 (X, Y :  Private_Parent_Type)
  return Private_Parent_Type;

function BA12001_0.BA12001_1.BA12001_2 (X, Y :  Private_Parent_Type)
  return Private_Parent_Type is
   
begin

   -- Real body of function goes here.

   return (X + Y);

end BA12001_0.BA12001_1.BA12001_2;

     --=================================================================--

-- Public grandchild

procedure BA12001_0.BA12001_1.BA12001_3 is
  
   Public_Grandchild_Var : Grandparent_Type := 49;

begin

   Public_Grandchild_Var := Public_Grandchild_Var * 2;

   -- Real body of procedure goes here.

end BA12001_0.BA12001_1.BA12001_3;
                       
     --=================================================================--

-- Public child

with BA12001_0.BA12001_1;                                            -- ERROR:
                                         -- private child of the same ancestor

with BA12001_0.BA12001_1.BA12001_2;                                  -- ERROR:
                                         -- private child of the same ancestor

with BA12001_0.BA12001_1.BA12001_3;                                  -- ERROR:
                                         -- private child of the same ancestor

package BA12001_0.BA12001_4 is

   Public_Child_Var : Grandparent_Type := 21;

end BA12001_0.BA12001_4;


-- No body for BA12001_0.BA12001_4.
