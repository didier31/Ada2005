-- BC1201E.ADA

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
-- CHECK THAT IF THE DECLARATION OF GENERIC FORMAL TYPES INCLUDES
-- A DISCRIMINANT PART, THE GENERIC TYPE DEFINITION MUST BE A PRIVATE
-- TYPE DEFINITION AND THE DISCRIMINANT PART MUST NOT INCLUDE A DEFAULT
-- EXPRESSION FOR A DISCRIMINANT.

-- KEI 3/4/82
-- RJK 1/24/84     ADDED TO ACVC
-- JWC 6/28/85   RENAMED FROM BC12ACB-B.ADA

PROCEDURE BC1201E IS

     TYPE N IS NEW INTEGER;

     GENERIC
          TYPE BUFFER (SIZE : INTEGER) IS PRIVATE;          -- OK.
          TYPE STORAGE (SPACE : INTEGER := 1) IS PRIVATE;   -- ERROR:

     PACKAGE P1 IS
     END P1;

BEGIN
     NULL;
END BC1201E;
