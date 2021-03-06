-- B8310012
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
-- OBJECTIVE
--      See B8310010.A.
--
-- TEST DESCRIPTION
--      See B8310010.A.
--
-- TEST FILES:
--      This test consists of the following files:
--         B8310010.A
--         B8310011.A
--      -> B8310012.A
--
-- PASS/FAIL CRITERIA:
--      See B8310010.A.
--
-- CHANGE HISTORY:
--      22 Aug 2007   RLB   Created test from submitted test. Added null
--                          procedure cases. Added missing body cases.
--
--!
package body B831001_2 is

    not overriding
    procedure P (X : T) is separate; -- OK

    not overriding
    procedure Q (X : T) is separate; -- ERROR: Not primitive (not inherited
                                     --        from specification)

    not overriding
    function F return T is -- OK
    begin
        return (others => <>);
    end F;

    not overriding
    function G return Integer is -- ERROR:
    begin
        return 4;
    end G;

end B831001_2;

separate (B831001_2) -- OPTIONAL ERROR: Parent illegal.
procedure P (X : T) is
begin
    null;
end P;

separate (B831001_2) -- OPTIONAL ERROR: Parent illegal.
procedure Q (X : T) is
begin
    null;
end Q;
