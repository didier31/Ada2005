-- BA2011A1M.ADA

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
--     CHECK THAT A BODY STUB MUST CONFORM TO A PRECEDING DECLARATION,
--     AND A PROPER BODY MUST CONFORM WITH ITS STUB.

-- SEPARATE FILES ARE:
--     BA2011A0.ADA  - SPECIFICATIONS AND MISMATCHED STUBS FOR
--                     SUBPROGRAMS BA2011A_*.
--     BA2011A1M.ADA - SPECIFICATIONS AND MATCHING STUBS FOR
--                     SUBPROGRAMS BA2011A_*.  THIS FILE SHOULD COMPILE
--                     WITHOUT ERRORS.
--     BA2011A2.ADA  - PROPER BODIES FOR SUBPROGRAM STUBS BA2011A_1-8.
--     BA2011A3.ADA  - PROPER BODIES FOR SUBPROGRAM STUBS BA2011A_1-8.
--     BA2011A4.ADA  - PROPER BODIES FOR SUBPROGRAM STUBS BA2011A_2-6,8.
--     BA2011A5.ADA  - PROPER BODIES FOR SUBPROGRAM STUBS BA2011A_2-5,8.
--     BA2011A6.ADA  - PROPER BODIES FOR SUBPROGRAM STUBS BA2011A_2-5.
--     BA2011A7.ADA  - PROPER BODIES FOR SUBPROGRAM STUBS BA2011A_2-5.
--     BA2011A8.ADA  - PROPER BODIES FOR SUBPROGRAM STUBS BA2011A_2,3,5.
--     BA2011A9.ADA  - PROPER BODIES FOR SUBPROGRAM STUBS BA2011A_2,5.

-- HISTORY:
--     JET 07/07/88  CREATED ORIGINAL TEST.
--     RJW 02/23/90  MODIFIED BODY OF BA2011A_6 IN BA2011A4.ADA.

PROCEDURE BA2011A1M IS

     PROCEDURE BA2011A_1;
     PROCEDURE BA2011A_2 (I : IN INTEGER);
     PROCEDURE BA2011A_3 (I : IN OUT INTEGER);
     PROCEDURE BA2011A_4 (I : OUT INTEGER);
     PROCEDURE BA2011A_5 (I : INTEGER; J : INTEGER);
     FUNCTION BA2011A_6 RETURN INTEGER;
     PROCEDURE BA2011A_7 (I : INTEGER);
     PROCEDURE BA2011A_8 (I : IN INTEGER := 5);

     PROCEDURE BA2011A_1 IS SEPARATE;
     PROCEDURE BA2011A_2 (I : IN INTEGER) IS SEPARATE;
     PROCEDURE BA2011A_3 (I : IN OUT INTEGER) IS SEPARATE;
     PROCEDURE BA2011A_4 (I : OUT INTEGER) IS SEPARATE;
     PROCEDURE BA2011A_5 (I : INTEGER; J : INTEGER) IS SEPARATE;
     FUNCTION BA2011A_6 RETURN INTEGER IS SEPARATE;
     PROCEDURE BA2011A_7 (I : INTEGER) IS SEPARATE;
     PROCEDURE BA2011A_8 (I : IN INTEGER := 5) IS SEPARATE;

BEGIN
     NULL;
END BA2011A1M;
