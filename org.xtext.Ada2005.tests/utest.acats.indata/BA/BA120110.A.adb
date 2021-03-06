-- BA120110.A
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
--    Check that a subprogram body acting as a declaration of a public
--    descendant of a unit L cannot mention a private child of L in a
--    non-private with_clause. (10.1.2(10/2))
--
--    Note: This rule was originally found in the Binding Interpretation
--    AI-220, and later in Amendment 1. Thus it applies to all Ada
--    implementations.
--
-- TEST DESCRIPTION:
--      Declare a grandparent package. Declare a public parent package.
--      Declare a private grandchild procedure. Declare a private parent
--      package. Declare a public grandchild package. Declare a private
--      renames of the public grandchild package.
--
--                               BA12011_0
--                               /       \
--                              /         \
--                       BA12011_1     BA12011_2
--                         /           (private)
--                        /                   \
--                       /                     \
--                  BA12011_3                BA12011_4----BA12011_R
--                  (private)                             (private)
--
--     Then declare various subprograms as children of BA12011_0 and at
--     the library level, both with and without separate declarations.
--     Test various withs of the units in each place.
--
-- TEST FILES:
--      This test consists of the following files:
--      -> BA120110.A
--         BA120111.A
--         BA120112.A
--         BA120113.A
--         BA120114.A
--         BA120115.A
--
-- PASS/FAIL CRITERIA:
--      Files BA120111.A, BA120112.A, BA120113.A, BA120114.A, and BA120115.A
--      contain errors. All errors in these files must be detected to pass
--      the test.
--
-- CHANGE HISTORY:
--    28 Mar 2007   RLB   Created test, based on ACATS 2.0 test BA12004.
--
--!

-- Grandparent

package BA12011_0 is

   type Grandparent_Type is range 101 .. 500;

end BA12011_0;

-- No body for BA12011_0.


     --=================================================================--

-- Public parent

package BA12011_0.BA12011_1 is

   type Public_Parent_Type is range 1 .. 100;
   Public_Parent_Var : Grandparent_Type := 125;

end BA12011_0.BA12011_1;


-- No body for BA12011_0.BA12011_1.

     --=================================================================--


-- Private parent

private package BA12011_0.BA12011_2 is

   Private_Parent_Var : Grandparent_Type := 236;

end BA12011_0.BA12011_2;

     --=================================================================--

-- Private child

private procedure BA12011_0.BA12011_1.BA12011_3;

procedure BA12011_0.BA12011_1.BA12011_3 is

   Private_Grandchild_Var : Public_Parent_Type := 26;

begin

   Private_Grandchild_Var := Private_Grandchild_Var * 3;

   -- Real body of procedure goes here.

end BA12011_0.BA12011_1.BA12011_3;

     --=================================================================--

-- Public child

package BA12011_0.BA12011_2.BA12011_4 is

   type Child_Type is range 501 .. 600;
   Public_Child_Var : Grandparent_Type := 278;

end BA12011_0.BA12011_2.BA12011_4;


-- No body for BA12011_0.BA12011_2.BA12011_4.

     --=================================================================--

-- Private renames of public child

with BA12011_0.BA12011_2.BA12011_4;
private package BA12011_0.BA12011_2.BA12011_R renames
   BA12011_0.BA12011_2.BA12011_4;

     --=================================================================--

procedure BA12011_0.BA12011_5;
   -- Subprogram with separate declaration, child of grandparent.

     --=================================================================--

procedure BA12011_6;
   -- Subprogram with separate declaration.
