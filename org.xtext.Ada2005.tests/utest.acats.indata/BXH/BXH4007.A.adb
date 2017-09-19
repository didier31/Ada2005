-- BXH4007.A
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
--       No_Fixed_Point
--     is accepted.
--
-- TEST DESCRIPTION
--     The test requires that the configuration pragma
--     Restrictions(No_Fixed_Point) be processed.  Any use of the
--     predefined type Duration, and any attempt to define a fixed point
--     type should be disallowed.
--
-- APPLICABILITY CRITERIA:
--      This test is only applicable for a compiler attempting validation
--      for the Safety and Security Annex.
--
-- SPECIAL REQUIREMENTS
--      The implementation must process a configuration pragma which is not
--      part of any Compilation Unit; the method employed is implementation
--      defined.
--      The subtest for decimal type rejection may be rejected for either or
--      both reasons: implementing the restriction, or not supporting the
--      feature.
--
--
-- CHANGE HISTORY:
--      26 OCT 95   SAIC   Initial version
--      04 NOV 96   SAIC   Revised for 2.1 release
--
--!

---------------------------- CONFIGURATION PRAGMAS -----------------------

pragma Restrictions(No_Fixed_Point);                              -- OK
                                                -- configuration pragma

------------------------ END OF CONFIGURATION PRAGMAS --------------------


------------------------------------------------------------------- BXH4007

package BXH4007 is

  Increment : constant := 0.125;                                  -- OK
                                                     -- not fixed point

  task Do_Something is
    entry Wait;
    entry Release;
  end Do_Something;

end BXH4007;

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

package body BXH4007 is

  Int : Integer;

  Sometime : Duration;                                           -- ERROR:
                           -- pragma Restrictions(No_Fixed_Point) in force

  type Radar is delta 0.5 range -1.0 .. 1.0;                     -- ERROR:
                           -- pragma Restrictions(No_Fixed_Point) in force

  type Oar_Bucks is delta 0.01 digits 10;                        -- ERROR:
                           -- pragma Restrictions(No_Fixed_Point) in force
                           -- implementation may not support decimal types

  task body Do_Something is
  begin
    select
      accept Wait;
    or
      accept Release;
    or delay 5.0;                                                 -- ERROR:
                            -- pragma Restrictions(No_Fixed_Point) in force
    end select;
  
  end Do_Something;

begin

  Int := Integer(Duration(3.0) * 6 );                             -- ERROR:
                            -- pragma Restrictions(No_Fixed_Point) in force

end BXH4007;
