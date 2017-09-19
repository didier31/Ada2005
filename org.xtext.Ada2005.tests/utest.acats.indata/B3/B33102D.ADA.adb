-- B33102D.ADA

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
-- CHECK THAT A TYPE DECLARATION, INCOMPLETE TYPE DECLARATION,
-- PRIVATE TYPE DECLARATION OR SUBTYPE DECLARATION CANNOT INTRODUCE
-- AN IDENTIFIER THAT WAS INTRODUCED PREVIOUSLY IN THE SAME
-- DECLARATIVE PART.

-- CASE D:  A BLOCK.

-- JRK 4/1/81
-- JWC 10/2/85
-- JRK 11/15/85

PROCEDURE B33102D IS

BEGIN

     DECLARE

          A : INTEGER;
          B : CONSTANT INTEGER := 0;
          C : CONSTANT := 0;

          TYPE D IS RANGE 0..10;
          SUBTYPE E IS INTEGER RANGE 0..10;

          PROCEDURE F (X : INTEGER);
          FUNCTION G (X : INTEGER) RETURN INTEGER;

          PACKAGE H IS
               X : INTEGER;
          END H;

          I : EXCEPTION;
          J : INTEGER RENAMES A;

          SUBTYPE A IS INTEGER;   -- ERROR: ID ALREADY DECLARED.
          TYPE B IS PRIVATE;      -- ERROR: ID ALREADY DECLARED.
          TYPE C IS NEW INTEGER;  -- ERROR: ID ALREADY DECLARED.
          TYPE D;                 -- ERROR: ID ALREADY DELCARED.
          SUBTYPE E IS INTEGER;   -- ERROR: ID ALREADY DECLARED.
          TYPE F IS PRIVATE;      -- ERROR: ID ALREADY DECLARED.
          TYPE G IS NEW INTEGER;  -- ERROR: ID ALREADY DECLARED.
          TYPE H;                 -- ERROR: ID ALREADY DECLARED.
          SUBTYPE I IS INTEGER;   -- ERROR: ID ALREADY DECLARED.
          TYPE J IS PRIVATE;      -- ERROR: ID ALREADY DECLARED.

          PROCEDURE F (X : INTEGER) IS
          BEGIN
               NULL;
          END F;

          FUNCTION G (X : INTEGER) RETURN INTEGER IS
          BEGIN
               RETURN 0;
          END G;

     BEGIN
          NULL;
     END;

END B33102D;
