-- BA210034.A
--
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
-- OBJECTIVE:
--      Check that all compilation units of a preelaborated library unit
--      must depend semantically only on compilation units of other
--      preelaborated library units.
--
--      Check that all compilation units of a declared-pure library unit
--      must depend semantically only on compilation units of other library
--      units which are declared pure.
--
--      Check that a preelaborated unit may have a non-preelaborable child
--      unit, but not a non-preelaborable subunit.
--
-- TEST DESCRIPTION:
--
--           =========================     =========================
--          |         package         |   |         package         |
--          |        BA21003_3        |   |        BA21003_4        |
--          |                         |   |                         |
--          |          pragma         |   |          pragma         |
--          |       PREELABORATE      |   |           PURE          |
--          |                         |    =========================
--          | (but pragma PURE would  |                ||
--          |  also have been legal)  |         with BA21003_3;
--           =========================     =========================
--                                        |      package body       |
--                                         =========================
--
--      Verify that a compilation unit (in this case, the body) of a declared-
--      pure package (BA21003_4) may not WITH a preelaborated package
--      (BA21003_3), even if the preelaborated package declares no variables
--      or named access types, and thus could have been declared pure.
--      
-- TEST FILES:
--      The following files comprise this test:
--
--         BA210030.A
--         BA210031.A
--         BA210032.A
--         BA210033.A
--      -> BA210034.A
--         BA210035.A
--
-- PASS/FAIL CRITERIA:
--      Each of files BA210031..5 contains errors. All errors in all these
--      files must be detected to pass the test.
--
-- CHANGE HISTORY:
--      10 Apr 95   SAIC    Initial prerelease version.
--      29 Jun 98   EDS     Renumbered to accommodate changes in files 1 and 2
--!

package BA21003_3 is  -- Preelaborated unit that could have been declared pure.

   pragma Preelaborate;

   type T1 is abstract tagged null record;

end BA21003_3;


     --===================================================================--


package BA21003_4 is -- Declare-pure unit.

   pragma Pure (BA21003_4);


   type T2 is abstract tagged record
      C: Integer;
   end record;

   procedure Init (P: in out T2);
   procedure Op1  (P: in out T2) is abstract;

end BA21003_4;
 

     --===================================================================--


with BA21003_3;                                                       -- ERROR:
                                              -- WITHed unit not declared pure.
package body BA21003_4 is
   procedure Init (P: in out T2) is
   begin
      P.C := 0;
   end Init;
end BA21003_4;
