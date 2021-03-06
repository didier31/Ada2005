-- B3710010.A
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
--     DISCLOSED ARE AS IS.  THE GOVERNMENT MAKES NO EXPRESS OR IMPLIED
--     WARRANTY AS TO ANY MATTER WHATSOEVER, INCLUDING THE CONDITIONS OF THE
--     SOFTWARE, DOCUMENTATION OR OTHER INFORMATION RELEASED, MADE AVAILABLE
--     OR DISCLOSED, OR THE OWNERSHIP, MERCHANTABILITY, OR FITNESS FOR A
--     PARTICULAR PURPOSE OF SAID MATERIAL.
--*
--
-- OBJECTIVE:
--    Check that a discriminant_constraint of a general access type is illegal
--    if the designated type has default expressions for its discriminants.
--
--    Check that a discriminant_constraint of an access type is illegal
--    if the designated type has a partial view that is constrained.
--
-- TEST FILES:
--      This test consists of the following files:
--      -> B3710010.A
--         B3710011.A
--         B3710012.A
--         B3710013.A
--         B3710014.AM
--
-- PASS/FAIL CRITERIA:
--      Files B3710011.A, B3710012.A, and B3710013.A contain errors. All
--      errors in these files must be detected to pass the test.
--
-- CHANGE HISTORY:
--    18 Jan 2001   PHL   Initial version.
--    16 Mar 2001   RLB   Readied for release. Split files.
--    21 Mar 2007   RLB   Updated objective for Amendment 1 changes.
--    15 Nov 2007   RLB   Corrected typo in objective.
--!
package B371001_1 is
    pragma Elaborate_Body;

    type T is private;
    type Ptr1 is access constant T;

private

    type T (D : Integer := 0) is null record;
    type Ptr2 is access all T;

end B371001_1;

package B371001_1.Child_1 is
    pragma Elaborate_Body;

    type T (D2 : Integer := 0) is null record;
    type Ptr1 is access all T;

private
    type Ptr2 is access constant T;
end B371001_1.Child_1;

with B371001_1.Child_1;
package B371001_0 is

    type A is array (1 .. 10) of aliased B371001_1.T;
    type B is array (1 .. 10) of aliased B371001_1.Child_1.T;

    X : A;
    Y : B;

end B371001_0;

