-- B83E01E2.ADA

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
-- OBJECTIVE:
--     THIS FILE CONTAINS THE SUBUNIT BODIES FOR THE B83E01E TEST.

-- HISTORY:
--     DHH 09/15/88 CREATED ORIGINAL TEST.
--     LDC 10/10/90 SPLIT PROCEDURE BODIES INTO SEPARATE FILES.

SEPARATE (B83E01E0M)
PROCEDURE B83E01E_PROC2(PARAM1, PARAM2, PARAM3, PARAM4 :
                        IN OUT INTEGER) IS

     PARAM1 : EXCEPTION;                                 -- ERROR:

     PROCEDURE PARAM2 IS                                 -- ERROR:
     BEGIN
          NULL;
     END;

     FUNCTION PARAM3 RETURN BOOLEAN IS                   -- ERROR:
     BEGIN
          RETURN TRUE;
     END;

BEGIN
  PARAM4:                                                -- ERROR:
     FOR I IN 1 .. 2 LOOP
          NULL;
     END LOOP PARAM4;

END B83E01E_PROC2;
