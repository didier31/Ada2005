-- BA1020A0M.ADA

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
-- CHECK THAT IF A SUBPROGRAM P IS COMPILED, SUBSEQUENT COMPILATION OF A
-- GENERIC OR NON-GENERIC PACKAGE OR SUBPROGRAM DECLARATION FOR P
-- REMOVES SUBPROGRAM P AND ITS SUBUNITS FROM THE LIBRARY.

-- SEPARATE FILES ARE:
--     BA1020A0M  THE MAIN PROCEDURE, WITH SUBPROGRAM DECLARATIONS
--                BA1020A1 THROUGH A4.
--     BA1020A1   A LIBRARY PACKAGE.
--     BA1020A2   A LIBRARY FUNCTION.
--     BA1020A3   A GENERIC LIBRARY PACKAGE.
--     BA1020A4   A GENERIC LIBRARY PROCEDURE.
--     BA1020A5   A SUBUNIT PROCEDURE (P1).
--     BA1020A6   A SUBUNIT FUNCTION  (F2).
--     BA1020A7   A SUBUNIT PROCEDURE (P3).
--     BA1020A8   A SUBUNIT FUNCTION  (F4).

-- BHS 7/26/84

PROCEDURE BA1020A0M IS
BEGIN

     NULL;

END BA1020A0M;


PROCEDURE BA1020A1 IS
     PROCEDURE P1 IS SEPARATE;
BEGIN

     NULL;

END BA1020A1;


PROCEDURE BA1020A2 IS
     FUNCTION F2 RETURN INTEGER IS SEPARATE;
BEGIN

     NULL;

END BA1020A2;


FUNCTION BA1020A3 RETURN BOOLEAN IS
     PROCEDURE P3 IS SEPARATE;
BEGIN

     RETURN TRUE;

END BA1020A3;


FUNCTION BA1020A4 RETURN BOOLEAN IS
     FUNCTION F4 RETURN INTEGER IS SEPARATE;
BEGIN

     RETURN TRUE;

END BA1020A4;
