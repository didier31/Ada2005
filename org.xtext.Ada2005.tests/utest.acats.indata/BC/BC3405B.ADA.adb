-- BC3405B.ADA

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
-- CHECK THAT THE COMPONENT TYPE OF A GENERIC FORMAL ARRAY TYPE AND THE
-- ACTUAL ARRAY TYPE MUST BOTH BE EITHER CONSTRAINED OR UNCONSTRAINED.

-- CHECK WHEN THE COMPONENT TYPE IS A PRIVATE, LIMITED PRIVATE, OR
-- RECORD WITH DISCRIMINANTS.

-- CHECK WHEN THE COMPONENT TYPE IS A GENERIC FORMAL TYPE DECLARED IN
-- THE SAME GENERIC UNIT.  NOTE THAT IN THIS CASE, ANY INSTANTIATION
-- WITH AN UNCONSTRAINED COMPONENT TYPE IS ILLEGAL BY 12.3.2(4), EXCEPT
-- WHEN THE UNCONSTRAINED TYPE HAS DISCRIMINANTS WITH DEFAULTS (SEE
-- AI-00037). 

-- SPS 6/28/82
-- JBG 4/26/83
-- JBG 2/13/84
-- JBG 5/29/85

PROCEDURE BC3405B IS

     TYPE REC (D: INTEGER  := 3) IS
     RECORD NULL; END RECORD;
     SUBTYPE CREC IS REC (D => 3);
     PACKAGE PRIV IS
          TYPE PV (D : INTEGER := 3) IS PRIVATE;
          TYPE LP (D : INTEGER := 3) IS LIMITED PRIVATE;
     PRIVATE
          TYPE PV (D: INTEGER := 3) IS RECORD NULL; END RECORD;
          TYPE LP (D: INTEGER := 3) IS RECORD NULL; END RECORD;
     END PRIV;
     USE PRIV;
     SUBTYPE CPV IS PV (D => 3);
     SUBTYPE CLP IS LP (D => 3);
     SUBTYPE NATURAL IS INTEGER RANGE 1 .. INTEGER'LAST;

     TYPE AR_REC IS ARRAY (NATURAL) OF REC;
     TYPE AR_CREC IS ARRAY (NATURAL) OF CREC;
     TYPE AR_RECC IS ARRAY (NATURAL) OF REC (D => 3);
     TYPE AR_PV IS ARRAY (NATURAL) OF PV;
     TYPE AR_CPV IS ARRAY (NATURAL) OF CPV;
     TYPE AR_PVC IS ARRAY (NATURAL) OF PV (D => 3);
     TYPE AR_LP IS ARRAY (NATURAL) OF LP;
     TYPE AR_CLP IS ARRAY (NATURAL) OF CLP;
     TYPE AR_LPC IS ARRAY (NATURAL) OF LP (D => 3);

     GENERIC
          TYPE T  IS LIMITED PRIVATE;
          TYPE FT IS ARRAY (NATURAL) OF T;
     PACKAGE P IS END P;

     PACKAGE PREC1 IS NEW P (REC, AR_REC);     -- OK AI-00037.
     PACKAGE PREC2 IS NEW P (REC, AR_CREC);    -- ERROR: AR_CREC.
     PACKAGE PREC3 IS NEW P (REC, AR_RECC);    -- ERROR: AR_RECC.

     PACKAGE PCREC1 IS NEW P (CREC, AR_REC);   -- ERROR: AR_REC.

     PACKAGE PPV1 IS NEW P (PV, AR_PV);        -- OK. AI-00037.
     PACKAGE PPV2 IS NEW P (PV, AR_CPV);       -- ERROR: AR_CPV.
     PACKAGE PPV3 IS NEW P (PV, AR_PVC);       -- ERROR: AR_PVC.

     PACKAGE PCPV1 IS NEW P (CPV, AR_PV);      -- ERROR: AR_PV.

     PACKAGE PLP1 IS NEW P (LP, AR_LP);        -- OK. AI-00037.
     PACKAGE PLP2 IS NEW P (LP, AR_CLP);       -- ERROR: AR_CLP.
     PACKAGE PLP3 IS NEW P (LP, AR_LPC);       -- ERROR: AR_LPC.

     PACKAGE PCLP1 IS NEW P (CLP, AR_LP);      -- ERROR: AR_LP.

BEGIN
     NULL;
END BC3405B;
