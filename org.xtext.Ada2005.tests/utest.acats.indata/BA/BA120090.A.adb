-- BA120090.A
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
-- OBJECTIVE
--     Check that a limited_with_clause is not given on:
--       * a library unit body;
--       * a subunit; or
--       * a library unit renaming. (10.1.2(18/2)).
--     Check that a limited_with_clause is not given in the context clause
--     for the explicit declaration of the named package. (10.1.2(20/2)).
--
-- TEST DESCRIPTION
--     A package containing a type declaration is defined, as well as
--     a number of other library units. The various illegal cases are then
--     tested.
--
-- TEST FILES:
--      This test consists of the following files:
--      -> BA120090.A
--         BA120091.A
--         BA120092.A
--         BA120093.A
--         BA120094.A
--         BA120095.A
--         BA120096.A
--         BA120097.A
--         BA120098.A
--
-- PASS/FAIL CRITERIA:
--      Files BA120091.A, BA120092.A, BA120093.A, BA120094.A, BA120095.A,
--      BA120096.A, BA120097.A, and BA120098.A contain errors. All errors in
--      these files must be detected to pass the test.
--
-- CHANGE HISTORY:
--    29 NOV 2004   PHL   Initial version.
--    26 Mar 2007   RLB   Created ACATS version from submitted test.
--
--!

package BA12009_0 is
    type My_Item is tagged record
        B : Boolean;
    end record;
end BA12009_0;

limited with BA12009_0;          -- OK.
package BA12009_1 is
    type Another_Item is tagged record
        Ptr : access BA12009_0.My_Item;
    end record;
    procedure Process (P : access BA12009_0.My_Item);
end BA12009_1;

limited with BA12009_0;          -- OK.
procedure BA12009_2 (P : access BA12009_0.My_Item);

package BA12009_3 is
    procedure Test_It;
end BA12009_3;

package body BA12009_3 is
    procedure Test_It is separate;
end BA12009_3;

generic
   type Int is range <>;
package BA12009_6 is
   type Has_Disc (D : Int) is null record;
   procedure Process (R : Has_Disc);
end BA12009_6;

