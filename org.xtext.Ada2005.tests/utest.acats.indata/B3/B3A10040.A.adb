-- B3A10040.A
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
--*
--
-- OBJECTIVE:
--
--     Check that a tagged incomplete type cannot be completed by
--     an untagged type.
--
-- TEST DESCRIPTION:
--
--     We try at least one example of each kind of type (enumeration,
--     integer, float, fixed, access, record, array, task, protected). In
--     addition, we try an untagged private type whose full type is tagged and
--     a derivation from an untagged language-defined type that
--     "needs finalization" and thus probably is implemented by a tagged type.
--
--     In addition, we check that a tagged incomplete type declared in
--     a private part must have a completion that is not a subtype in a
--     separate compiled package body. (Avoiding creating a separate test
--     for this case.)
--
-- TEST FILES:
--      This test consists of the following files:
--      -> B3A10040.A
--         B3A10041.A
--         B3A10042.A
--
-- PASS/FAIL CRITERIA:
--     Test files B3A10041 and B3A10042 contain errors. All errors in each of
--     these files must be detected.
--
--     The test contains several lines marked POSSIBLE ERROR: [Setnn].
--     For each value of n, the implementation must detect one or more of
--     these possible errors. For instance, an error must be detected on
--     at least one of the lines labeled POSSIBLE ERROR: [Set01] for an
--     implementation to pass.
--
-- CHANGE HISTORY:
--     29 May 2008  RLB  Created test based on submitted tests.
--
package B3A10040 is

    type UPriv is private;

    type TPriv is tagged private;

    type Interf is limited interface;

private

    type UPRiv is tagged null record;

    type TPRiv is tagged null record;

end B3A10040;

package B3A10042 is
    procedure Proc1;
private
    type T21 is tagged;
    type T22 is tagged;
    type T23 is tagged;
    type T24 is tagged;
    type T25 is tagged;
    type T26 is tagged;
    type T27 is tagged;
    type T28 is tagged;
    type T29 is tagged;
    type T2A is tagged;
    type T2B is tagged;
    type T2C is tagged;
    type T2D is tagged;
    type T2E is tagged;
    type T2F is tagged;
    type T2G is tagged;
    type T2H is tagged;
    type T2J is tagged;
end B3A10042;
