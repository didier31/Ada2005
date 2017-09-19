-- B95020B2M.ADA

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
-- CHECK THAT THE FORMAL PART OF AN ACCEPT STATEMENT MUST CONFORM TO
-- THAT GIVEN IN THE ENTRY DECLARATION, EXCEPT FOR THE POSSIBLE USE OF
-- SELECTED COMPONENT NOTATION TO DISAMBIGUATE NAMES, THE FORM OF
-- NUMERIC LITERALS THAT HAVE THE SAME VALUE, THE CASE OF LETTERS IN
-- STRING LITERALS USED AS OPERATOR SYMBOLS, AND THE PRESENCE OF
-- COMMENTS.

-- CASE B: THE TASK DECLARATION IS IN A LIBRARY PACKAGE DECLARATION AND
--         THE TASK BODY IS IN THE CORRESPONDING PACKAGE BODY, WHICH IS
--         SEPARATELY COMPILED.

-- SUBCASES:
--   (A)  USE OF SIMPLE VS. EXPANDED NAMES.
--   (B)  MISUSE OF RENAMED ENTITIES.
--   (C)  MISUSE OF SUBTYPES.
--   (D)  USE OF DIFFERENT FORMS OF INTEGER LITERALS.
--   (E)  MISUSE OF SIMPLE NAMES DENOTING DIFFERENT FUNCTIONS OR
--        OBJECTS.
--   (F)  USE OF STRING LITERALS AS OPERATOR SYMBOLS VS. MISUSE OF
--        STRING LITERALS AS SOMETHING OTHER THAN OPERATOR SYMBOLS.
--        (TESTED ELSEWHERE).
--   (G)  MISUSE OF INFIX VS. FUNCTIONAL FORM OF OPERATOR INVOCATION;
--        MISUSE OF COMMUTATIVITY OF CERTAIN OPERATORS.
--   (H)  MISUSE OF SINGLE VS. MULTIPLE PARAMETER DECLARATIONS.
--   (I)  USE/MISUSE OF EXPANDED VS. EXPANDED NAMES.
--   (J)  MISUSE OF PRAGMAS (TESTED ELSEWHERE).
--   (K)  USE OF COMMENTS.
--   (L)  MISUSE OF (DIFFERENT) PARAMETER NAMES.
--   (M)  MISUSE OF LEXICAL FORM OF EXPRESSIONS, E.G., EXTRA PARENTHESES
--        OR QUALIFICATION.
--   (N)  MISUSE OF SAME OPERATORS WITH DIFFERENT MEANINGS.
--   (O)  MISUSE OF SIMPLE VS. EXPANDED NAMES FOR OPERATOR SYMBOLS AND
--        CHARACTER LITERALS.
--   (P)  MISUSE OF EXPANDED NAMES ASSOCIATED WITH RENAMING OR SUBTYPE
--        DECLARATIONS.
--   (Q)  MISUSE OF PRESENCE/ABSENCE OF DEFAULT EXPRESSIONS.
--   (R)  MISUSE OF PARAMETER MODES.

-- SEPARATE FILES ARE:
--   B95020B0  A LIBRARY PACKAGE DECLARATION (WITH ENTRY DECLS).
--   B95020B1  A LIBRARY PACKAGE BODY (B95020B0, WITH ACCEPT STMTS).
--   B95020B2M A DUMMY MAIN PROCEDURE.

-- JRK 2/27/84

WITH B95020B0; USE B95020B0;

PROCEDURE B95020B2M IS

BEGIN

     NULL;

END B95020B2M;
