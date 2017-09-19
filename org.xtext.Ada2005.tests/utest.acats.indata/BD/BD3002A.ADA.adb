-- BD3002A.ADA

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
--     CHECK THAT TWO ENUMERATION REPRESENTATION CLAUSES CANNOT BE GIVEN
--     FOR THE SAME TYPE.

-- HISTORY:
--     JKC 04/12/88  CREATED ORIGINAL TEST.

PROCEDURE BD3002A IS

     TYPE BASIC_E IS (RED, YELLOW, BLUE, GREEN, ORANGE);

     FOR BASIC_E USE (RED=>1, YELLOW=>2, BLUE=>3, GREEN=>4, ORANGE=>5);
     FOR BASIC_E USE (1,2,3,4,5);                   -- ERROR: DUPLICATE.

     TYPE ENUM IS (A,B,C);

     FOR ENUM USE (11,12,13);
     FOR ENUM USE (0,1,2);                          -- ERROR: DUPLICATE.

BEGIN
     NULL;
END BD3002A;
