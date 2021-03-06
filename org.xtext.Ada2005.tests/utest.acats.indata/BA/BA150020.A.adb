-- BA150020.A
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
--     Check the requirements on a program unit pragma imposed by
--     10.1.5(4) and the modified 10.1.5(5) from Technical
--     Corrigendum 1. (Originally discussed as AI95-00136.)
--     Specifically:
--     If a program unit pragma is given as a compilation_unit, check that it
--     must have a name and immediately follows the unit.
--     If a program unit pragma is given inside of a package to apply
--     to that package, check that it must appear at the beginning of the
--     package specification, and never in the private part. For a generic
--     package, it must not appear in the generic formal part.
--     Also check that the name given in such a program unit pragma must
--     denote the immediately enclosing program unit.
--
-- TEST DESCRIPTION
--     The program unit pragmas as listed in the index of the RM are:
--
--     pragma Convention   B.1(29)
--     pragma Export   B.1(29)
--     pragma Import   B.1(29)
--     pragma Inline   6.3.2(2)
--     library unit pragmas   10.1.5(7)
--        pragma All_Calls_Remote   E.2.3(6)
--        categorization pragmas   E.2(2)
--          pragma Remote_Call_Interface   E.2.3(2)
--          pragma Remote_Types   E.2.2(2)
--          pragma Shared_Passive   E.2.1(2)
--        pragma Elaborate_Body   10.2.1(24)
--        pragma Preelaborate   10.2.1(4)
--        pragma Pure   10.2.1(15)
--     We don't bother testing the Annex B and E pragmas here,
--     so the only pragmas of interest are Inline, Elaborate_Body,
--     Preelaborate, and Pure.  We figure that if the implementation
--     can get those right, then it can get the annex ones right, too.
--     For each pragma, we try illegally placing it in a generic formal
--     part (before any generic formal parameters) and at the beginning
--     of the private part of a (non-generic) package with an empty
--     visible part.  We also try some blatantly illegal cases
--     (placement in the visible part after some declarations),
--     and some legal cases.  We try both pragmas with and without
--     and explicit name, except in the case of pragma Inline, which
--     requires a name.
--
-- TEST FILES:
--      This test consists of the following files:
--      -> BA150020.A
--         BA150021.A
--         BA150022.A
--         BA150023.A
--         BA150024.A
--         BA150025.A
--         BA150026.A
--         BA150027.A
--         BA150028.A
--         BA150029.AM
--
-- PASS/FAIL CRITERIA:
--      Each of files BA150022..9 contains errors. All errors in all these
--      files must be detected to pass the test.
--
-- CHANGE HISTORY:
--      29 JUN 1999   RAD   Initial Version
--      08 JUL 1999   RLB   Cleaned up and added to test suite.
--
--!

with Ada; use Ada;
package BA15002 is
    pragma Pure; -- OK
    -- Empty.
end BA15002;

