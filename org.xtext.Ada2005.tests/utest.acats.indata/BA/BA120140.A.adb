-- BA120140.A
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
--    Check that a name visible due to a private with clause is not allowed in
--    the package visible part or subprogram specification of the unit that has
--    the with clause. (10.1.2(12-16/2))
--
--    Check that a name visible due to a private with clause is not allowed in
--    a context-clause use_clause. (10.1.2(12-16/2))
--
--    Check that a name visible due to a private with clause is not allowed in
--    the package visible part or subprogram specification of a public
--    descendant of the unit that has the with clause. (10.1.2(12-16/2))
--
-- TEST FILES:
--     This test consists of the following files:
--     -> BA120140.A
--        BA120141.A
--        BA120142.A
--        BA120143.A
--        BA120144.A
--        BA120145.A
--        BA120146.A
--        BA120147.A
--
-- PASS/FAIL CRITERIA:
--     Files BA120141.A, BA120142.A, BA120143.A, BA120144.A, BA120145.A,
--     BA120146.A, and BA120147.A contain errors. All errors in these files
--     must be detected to pass the test.
--
-- CHANGE HISTORY:
--    06 May 2003   PHL   Initial version.
--    29 Mar 2007   RLB   Created test from submitted test.
--
--!
package BA12014_0 is
end BA12014_0;


private package BA12014_0.BA12014_1 is

    X : Integer;

    type R is
	record
	    A, B : Float;
	end record;

end BA12014_0.BA12014_1;


package BA12014_0.BA12014_2 is

    function BA12014_F (X : Integer) return Float;

end BA12014_0.BA12014_2;


function BA12014_0.F (X : Integer) return Float;


with Report;
function BA12014_0.F (X : Integer) return Float is
begin
    return Float (Report.Ident_Int (3));
end BA12014_0.F;


function BA12014_F (X : Integer) return Float;


with Report;
function BA12014_F (X : Integer) return Float is
begin
    return Float (Report.Ident_Int (3));
end BA12014_F;

with BA12014_0.BA12014_2;
private with BA12014_0.BA12014_1;
private with BA12014_F;
package BA12014_0.Parent is

    Y : Float := BA12014_0.BA12014_2.BA12014_F (3); -- OK.

private

    Z : Integer renames BA12014_0.BA12014_1.X; -- OK.

end BA12014_0.Parent;
