-- BC3302B.ADA

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
-- CHECK THAT IN A GENERIC INSTANTIATION, A GENERIC ACTUAL TYPE
-- PARAMETER MUST BE AN INTEGER TYPE IF THE CORRESPONDING GENERIC 
-- FORMAL TYPE PARAMETER IS DEFINED BY A GENERIC TYPE DEFINITION
-- OF FORM "RANGE <>".

-- CHECK WHEN THE ACTUAL PARAMETER IS A GENERIC FORMAL PRIVATE OR
-- DISCRETE TYPE DECLARED IN AN ENCLOSING GENERIC UNIT.

-- SPS 7/14/82

PROCEDURE BC3302B IS

     GENERIC
          TYPE PV IS PRIVATE;
          TYPE LP IS LIMITED PRIVATE;
          TYPE I IS (<>);
          TYPE INT IS RANGE <>;
          TYPE ARR IS ARRAY(INTEGER) OF INT;
          TYPE ACC IS ACCESS INT;

     PACKAGE PK IS
          TYPE NEW_INT IS NEW INT;
          TYPE NEW_I IS NEW I;

          GENERIC
               TYPE GFT IS RANGE <>;
          PACKAGE GP IS END GP;

          PACKAGE OK1 IS NEW GP(INT);             -- OK.
          PACKAGE OK2 IS NEW GP(NEW_INT);         -- OK.

          PACKAGE Z1 IS NEW GP(ARR);              -- ERROR: ARR.
          PACKAGE Z2 IS NEW GP(ACC);              -- ERROR: ACC.
          PACKAGE Z3 IS NEW GP(PV);               -- ERROR: PV.
          PACKAGE Z4 IS NEW GP(LP);               -- ERROR: LP.
          PACKAGE Z5 IS NEW GP(I);                -- ERROR: I.
          PACKAGE Z6 IS NEW GP(NEW_I);            -- ERROR: NEW_I.
     END PK;
BEGIN
     NULL;
END BC3302B;
