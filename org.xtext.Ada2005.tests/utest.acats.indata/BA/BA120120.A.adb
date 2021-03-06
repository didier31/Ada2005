-- BA120120.A
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
--    The ACAA has created and maintains the Ada Conformity Assessment Test
--    Suite for the purpose of conformity assessments conducted in accordance
--    with the International Standard ISO/IEC 18009 - Ada: Conformity
--    assessment of a language processor. This test suite should not be used
--    to make claims of conformance unless used in accordance with
--    ISO/IEC 18009 and any applicable ACAA procedures.
--
--*
--
-- OBJECTIVE:
--    Check that the declaration of a public descendant of a unit L cannot
--    mention a private child of L in a non-private limited with_clause.
--
--    Check that a unit that is not a descendant of a unit L cannot mention a
--    private child of L in a limited with_clause.
--
-- TEST DESCRIPTION:
--      Declare a grandparent package.  Declare a public parent package.
--      Declare a private grandchild package. Declare a private parent
--      package. Declare a public child package. Declare a public
--      grandchild package.
--
--                               BA12012_0
--                               /       \
--                              /         \
--                       BA12012_1     BA12012_2
--                         /           (private)
--                        /                   \
--                       /                     \
--                  BA12012_3                BA12012_4
--                  (private)                    \
--                                                \
--                                              BA12012_5
--                                              (private)
--
--     Then declare various units as children of BA12012_0, the
--     two parent units, and at the library level.
--     Test various limited withs and limited private withs of the units
--     in each place.
--
-- TEST FILES:
--      This test consists of the following files:
--      -> BA120120.A
--         BA120121.A
--         BA120122.A
--         BA120123.A
--         BA120124.A
--         BA120125.A
--         BA120126.A
--         BA120127.A
--         BA120128.A
--         BA120129.A
--         BA12012A.A
--
-- PASS/FAIL CRITERIA:
--      Files BA120121.A, BA120122.A, BA120123.A, BA120124.A, BA120125.A,
--      BA120126.A, BA120127.A, BA120128.A, BA120129.A, and BA12012A.A
--      contain errors. All errors in these files must be detected to pass
--      the test.
--
-- CHANGE HISTORY:
--    28 Mar 2007   RLB   Created test, based on ACATS 2.0 test BA12004.
--
--!

-- Grandparent

package BA12012_0 is

   type Grandparent_Type is range 101 .. 500;

end BA12012_0;

-- No body for BA12012_0.


     --=================================================================--

-- Public parent

package BA12012_0.BA12012_1 is

   type Public_Parent_Type is range 1 .. 100;
   Public_Parent_Var : Grandparent_Type := 125;

end BA12012_0.BA12012_1;


-- No body for BA12012_0.BA12012_1.

     --=================================================================--


-- Private parent

private package BA12012_0.BA12012_2 is

   Private_Parent_Var : Grandparent_Type := 236;

end BA12012_0.BA12012_2;

     --=================================================================--

-- Private child

private package BA12012_0.BA12012_1.BA12012_3 is

   type Private_Grandchild_Type is null record;
   Private_Grandchild_Var : Public_Parent_Type := 26;

end BA12012_0.BA12012_1.BA12012_3;

-- No body needed for BA12012_0.BA12012_1.BA12012_3.

     --=================================================================--

-- Public child

package BA12012_0.BA12012_2.BA12012_4 is

   type Child_Type is range 501 .. 600;
   Public_Child_Var : Grandparent_Type := 278;

end BA12012_0.BA12012_2.BA12012_4;


-- No body for BA12012_0.BA12012_2.BA12012_4.

     --=================================================================--

-- Private grandchild

private package BA12012_0.BA12012_2.BA12012_4.BA12012_5 is

   type Grandchild_Type is (Red, Green, Blue);
   Private_Grandchild_Var : Grandchild_Type := Red;

end BA12012_0.BA12012_2.BA12012_4.BA12012_5;


-- No body for BA12012_0.BA12012_2.BA12012_4.BA12012_5.

     --=================================================================--

