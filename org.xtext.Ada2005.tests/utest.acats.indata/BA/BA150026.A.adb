-- BA150026.A
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
-- OBJECTIVE
--     See BA150020.A.
--
-- TEST DESCRIPTION
--     See BA150020.A.
--
-- TEST FILES:
--      This test consists of the following files:
--         BA150020.A
--         BA150021.A
--         BA150022.A
--         BA150023.A
--         BA150024.A
--         BA150025.A
--      -> BA150026.A
--         BA150027.A
--         BA150028.A
--         BA150029.AM
--
-- PASS/FAIL CRITERIA:
--     See BA150020.A.
--
-- CHANGE HISTORY:
--      29 JUN 1999   RAD   Initial Version
--      08 JUL 1999   RLB   Cleaned up and added to test suite.
--
--!

-- Test pragma Preelaborate:

with Ada.Finalization;
generic
    pragma Preelaborate(BA15002.Bad_Preelaborate); -- ERROR:
        -- The pragma is not allowed here.
    type T is new Finalization.Limited_Controlled with private;
package BA15002.Bad_Preelaborate is
end BA15002.Bad_Preelaborate;

with Ada.Finalization;
generic
    pragma Preelaborate; -- ERROR:
        -- The pragma is not allowed here.
    type T is new Finalization.Limited_Controlled with private;
package BA15002.Bad_Bare_Preelaborate is
end BA15002.Bad_Bare_Preelaborate;

