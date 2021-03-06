-- BXH4013.A
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
-- OBJECTIVE
--     Check pragma Restrictions.
--     Check that the application of the configuration pragma Restrictions
--     with the specific restriction:
--       No_Delay
--     is accepted.
--
-- TEST DESCRIPTION
--     The test requires that the configuration pragma
--     Restrictions(No_Delay) be processed.  Any use of the package Calendar
--     should be disallowed.  Any use of a delay or delay until statement
--     should be disallowed.  Check for the use of a delay alternative in a
--     selective wait, a timed entry call, and an asynchronous transfer of
--     control (select abort) statement.
--
-- APPLICABILITY CRITERIA:
--      This test is only applicable for a compiler attempting validation
--      for the Safety and Security Annex.
--
-- SPECIAL REQUIREMENTS
--      The implementation must process a configuration pragma which is not
--      part of any Compilation Unit; the method employed is implementation
--      defined.
--
--
-- CHANGE HISTORY:
--      26 OCT 95   SAIC   Initial version
--
--!

---------------------------- CONFIGURATION PRAGMAS -----------------------

pragma Restrictions(No_Delay);                                    -- OK
                                                -- configuration pragma

------------------------ END OF CONFIGURATION PRAGMAS --------------------


----------------------------------------------------------------- BXH4013_0

package BXH4013_0 is

  task T is
    entry A;
    entry B;
  end T;

end BXH4013_0;

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

package body BXH4013_0 is

  task body T is
  begin
    -- selective wait with delay alternative
    select
      accept A;
    or delay 1.4;                                                -- ERROR:
                                 -- pragma Restrictions(No_Delay) in force
    end select;
  end T;

  procedure Horribly_Complicated is -- not...
  begin
    T.B;
  end Horribly_Complicated;

  procedure P is
  begin

  -- timed entry call
    select
      T.A;
    or delay 2.3;                                                -- ERROR:
                                 -- pragma Restrictions(No_Delay) in force

    end select;

  -- timed asynchronous transfer of control
    select
      delay 3.2;                                                 -- ERROR:
                                 -- pragma Restrictions(No_Delay) in force
    then abort
      Horribly_Complicated;
    end select;

  -- simple delay statement

    delay 4.1;                                                  -- ERROR:
                                 -- pragma Restrictions(No_Delay) in force

  end P;

end BXH4013_0;

------------------------------------------------------------------- BXH4013

with Calendar;                                                   -- ERROR:
                                 -- pragma Restrictions(No_Delay) in force

procedure BXH4013 is
  use type Calendar.Time;         -- probable error due to disallowed with

begin  -- Main test procedure.

    -- delay until statement
    delay until Calendar.Clock + 5.0;                            -- ERROR:
                                 -- pragma Restrictions(No_Delay) in force
     -- Calendar should have be disallowed, undeclared ID acceptable error
end BXH4013;
