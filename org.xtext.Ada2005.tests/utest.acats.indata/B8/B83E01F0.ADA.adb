-- B83E01F0M.ADA

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
--     CHECK THAT A FORMAL PARAMETER OF A GENERIC SUBPROGRAM SUBUNIT,
--     IN A SEPARATE FILE, CANNOT  BE IDENTICAL TO ANY OTHER IDENTIFIERS
--     DECLARED IN THE SUBUNIT.

-- APPLICABILITY CRITERIA:
--     THIS TEST IS APPLICABLE TO IMPLEMENTATIONS THAT SUPPORT SEPARATE
--     COMPILATION OF GENERIC SPECIFICATIONS AND BODIES.

-- SEPARATE FILES:
--     B83E01F0M CONTAINS THE PROCEDURE WHICH HOLDS THE SPECIFICATIONS
--               FOR THE SUBUNITS. THIS FILE SHOULD COMPILE WITHOUT
--               ERRORS.
--     B83E01F1  CONTAINS THE SUBUNIT BODY FOR B83E01F_GEN_PROC1.
--     B83E01F2  CONTAINS THE SUBUNIT BODY FOR B83E01F_GEN_PROC2.
--     B83E01F3  CONTAINS THE SUBUNIT BODY FOR B83E01F_GEN_PROC3.
--     B83E01F4  CONTAINS THE SUBUNIT BODY FOR B83E01F_GEN_PROC4.
--     B83E01F5  CONTAINS THE SUBUNIT BODY FOR B83E01F_GEN_PROC5.
--     B83E01F6  CONTAINS THE SUBUNIT BODY FOR B83E01F_GEN_PROC6.

-- HISTORY:
--     DHH 09/15/88  CREATED ORIGINAL TEST.
--     MCH 04/09/90  SPLIT COMPILATIONS INTO SEPARATE FILES.

PROCEDURE B83E01F0M IS

     GENERIC
     PROCEDURE B83E01F_GEN_PROC1(PARAM1, PARAM2, PARAM3, PARAM4,
                                 PARAM5, PARAM6, PARAM7 : INTEGER);

     GENERIC
     PROCEDURE B83E01F_GEN_PROC2(PARAM1, PARAM2, PARAM3,
                                 PARAM4 : IN OUT INTEGER);

     GENERIC
     FUNCTION B83E01F_GEN_PROC3(PARAM1, PARAM2 : INTEGER)
                                                        RETURN BOOLEAN;

     GENERIC
          TYPE PARAM1 IS (<>);
          TYPE PARAM2 IS (<>);
          TYPE PARAM3 IS (<>);
          TYPE PARAM4 IS (<>);
          TYPE PARAM5 IS (<>);
          TYPE PARAM6 IS (<>);
          TYPE PARAM7 IS (<>);
     PROCEDURE B83E01F_GEN_PROC4;

     GENERIC
          TYPE PARAM1 IS (<>);
          TYPE PARAM2 IS (<>);
          TYPE PARAM3 IS (<>);
          TYPE PARAM4 IS (<>);
     PROCEDURE B83E01F_GEN_PROC5;

     GENERIC
          TYPE PARAM1 IS (<>);
          TYPE PARAM2 IS (<>);
     FUNCTION B83E01F_GEN_PROC6 RETURN BOOLEAN;

     PROCEDURE B83E01F_GEN_PROC1(PARAM1, PARAM2, PARAM3, PARAM4,
                                 PARAM5, PARAM6, PARAM7 : INTEGER)
                                                           IS SEPARATE;

     PROCEDURE B83E01F_GEN_PROC2(PARAM1, PARAM2, PARAM3,
                                 PARAM4 :IN OUT INTEGER) IS SEPARATE;

     FUNCTION B83E01F_GEN_PROC3(PARAM1, 
                                PARAM2 : INTEGER) RETURN BOOLEAN
                                                  IS SEPARATE;

     PROCEDURE B83E01F_GEN_PROC4 IS SEPARATE;

     PROCEDURE B83E01F_GEN_PROC5 IS SEPARATE;

     FUNCTION B83E01F_GEN_PROC6 RETURN BOOLEAN IS SEPARATE;

BEGIN
     NULL;
END B83E01F0M;
