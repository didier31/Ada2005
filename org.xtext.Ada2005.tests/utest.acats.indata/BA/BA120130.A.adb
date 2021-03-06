-- BA120130.A
--
--                             Grant of Unlimited Rights
--
--     The Ada Conformity Assessment Authority (ACAA) holds unlimited
--     rights in the software and documentation contained herein. Unlimited
--     rights are the same as those granted by the U.S. Government for older
--     parts of the Ada Conformity Assessment Test Suite, and are defined
--     in DFAR 252.227-7013(a)(19). By making this public release, the ACAA
--     intends to confer upon all recipients unlimited rights equal to those
--     held by the ACAA. These rights include rights to use, duplicate,
--     release or disclose the released technical data and computer software
--     in whole or in part, in any manner and for any purpose whatsoever, and
--     to have or permit others to do so.
--
--                                    DISCLAIMER
--
--     ALL MATERIALS OR INFORMATION HEREIN RELEASED, MADE AVAILABLE OR
--     DISCLOSED ARE AS IS. THE ACAA MAKES NO EXPRESS OR IMPLIED
--     WARRANTY AS TO ANY MATTER WHATSOEVER, INCLUDING THE CONDITIONS OF THE
--     SOFTWARE, DOCUMENTATION OR OTHER INFORMATION RELEASED, MADE AVAILABLE
--     OR DISCLOSED, OR THE OWNERSHIP, MERCHANTABILITY, OR FITNESS FOR A
--     PARTICULAR PURPOSE OF SAID MATERIAL.
--
--                                     Notice
--
--     The ACAA has created and maintains the Ada Conformity Assessment Test
--     Suite for the purpose of conformity assessments conducted in accordance
--     with the International Standard ISO/IEC 18009 - Ada: Conformity
--     assessment of a language processor. This test suite should not be used
--     to make claims of conformance unless used in accordance with
--     ISO/IEC 18009 and any applicable ACAA procedures.
--
--*
--
-- OBJECTIVE:
--     Check that a unit that is not a descendant of a unit L cannot mention
--     a private child of L in a private with_clause. (10.1.2(8-11/2))
--
-- TEST DESCRIPTION:
--     Declare a grandparent package. Declare a public parent package.
--     Declare a private grandchild procedure and a private grandchild
--     generic package. Declare a private parent package. Declare a public
--     grandchild package. Declare a private renames of the public grandchild
--     package. Declare a private great grandchild function.
--
--                               BA12013_0
--                               /       \
--                              /         \
--                       BA12013_1     BA12013_2
--                         /   \       (private)
--                        /     \             \
--                       /       \             \
--                  BA12013_3   BA12013_6    BA12013_4----BA12013_7
--                  (private)   (private)        \        (private)
--                                                \
--                                              BA12013_5
--                                              (private)
--
--     Then declare various public units as children of BA12013_0, as
--     children of BA12013_1 and BA12013_2, and at
--     the library level.
--     Test various private withs of the units in each place.
--     Note: We do not test private withs on bodies, subunits, or
--     private units, as these contexts are semantically identical to regular
--     withs. We do try subprogram bodies acting as a declaration and
--     the generally useless renamed package.
--
-- TEST FILES:
--     This test consists of the following files:
--     -> BA120130.A
--        BA120131.A
--        BA120132.A
--        BA120133.A
--        BA120134.A
--        BA120135.A
--        BA120136.A
--        BA120137.A
--        BA120138.A
--        BA120139.A
--        BA12013A.A
--
-- PASS/FAIL CRITERIA:
--     Files BA120131.A, BA120132.A, BA120133.A, BA120134.A, BA120135.A,
--     BA120136.A, BA120137.A, BA120138.A, BA120139.A, and BA12013A.A
--     contain errors. All errors in these files must be detected to pass
--     the test.
--
-- CHANGE HISTORY:
--     28 Mar 2007   RLB   Created test, based on ACATS 2.0 test BA12004.
--
--!

-- Grandparent

package BA12013_0 is

   type Grandparent_Type is range 101 .. 500;

end BA12013_0;

-- No body for BA12013_0.


     --=================================================================--

-- Public parent

package BA12013_0.BA12013_1 is

   type Public_Parent_Type is range 1 .. 100;
   Public_Parent_Var : Grandparent_Type := 125;

end BA12013_0.BA12013_1;


-- No body for BA12013_0.BA12013_1.

     --=================================================================--


-- Private parent

private package BA12013_0.BA12013_2 is

   Private_Parent_Var : Grandparent_Type := 236;

end BA12013_0.BA12013_2;

     --=================================================================--

-- Private child

private procedure BA12013_0.BA12013_1.BA12013_3;

procedure BA12013_0.BA12013_1.BA12013_3 is

   Private_Grandchild_Var : Public_Parent_Type := 26;

begin

   Private_Grandchild_Var := Private_Grandchild_Var * 3;

   -- Real body of procedure goes here.

end BA12013_0.BA12013_1.BA12013_3;

     --=================================================================--

-- Private child

private generic
    Size : in Natural;
package BA12013_0.BA12013_1.BA12013_6 is
    type Gen_Type is new Natural range 1 .. Size;
end BA12013_0.BA12013_1.BA12013_6;

-- No body for BA12013_0.BA12013_1.BA12013_6.

     --=================================================================--

-- Public child

package BA12013_0.BA12013_2.BA12013_4 is

   type Child_Type is range 501 .. 600;
   Public_Child_Var : Grandparent_Type := 278;

end BA12013_0.BA12013_2.BA12013_4;


-- No body for BA12013_0.BA12013_2.BA12013_4.

     --=================================================================--

-- Private renames of public child

with BA12013_0.BA12013_2.BA12013_4;
private package BA12013_0.BA12013_2.BA12013_7 renames
   BA12013_0.BA12013_2.BA12013_4;

     --=================================================================--

-- Private child of public child of private child.

private function BA12013_0.BA12013_2.BA12013_4.BA12013_5 return Boolean;

function BA12013_0.BA12013_2.BA12013_4.BA12013_5 return Boolean is
begin
    return False; -- Real body goes here.
end BA12013_0.BA12013_2.BA12013_4.BA12013_5;


     --=================================================================--

