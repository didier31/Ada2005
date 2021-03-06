-- B97103F.ADA

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
-- CHECK THAT WITHIN AN ACCEPT STATEMENT AN ENCLOSED SELECTIVE WAIT
-- STATEMENT CANNOT CONTAIN AN ACCEPT STATEMENT THAT NAMES THE SINGLE
-- ENTRY SPECIFIED IN THE OUTSIDE ACCEPT STATEMENT.

-- TBN 2/3/86

PROCEDURE B97103F IS

     TASK T1 IS
          ENTRY E;
     END T1;

     TASK BODY T1 IS
     BEGIN
          ACCEPT E DO
               SELECT
                    ACCEPT E;               -- ERROR: ACCEPT E.
               OR
                    TERMINATE;
               END SELECT;
          END E;
     END T1;

     -------------------------------------------------------------------

     TASK T2 IS
          ENTRY FRED;
          ENTRY JOE;
     END T2;

     TASK BODY T2 IS

          FLAG : BOOLEAN := TRUE;

     BEGIN
          ACCEPT FRED DO
               SELECT
                    WHEN NOT (FLAG) =>
                         ACCEPT JOE;
               ELSE
                    IF FLAG THEN
                         ACCEPT FRED;        -- ERROR: ACCEPT FRED.
                    END IF;
               END SELECT;
          END FRED;
     END T2;

BEGIN
     NULL;
END B97103F;
