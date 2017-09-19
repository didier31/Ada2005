-- BC3202A.ADA

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
-- CHECK THAT IF A GENERIC FORMAL TYPE HAS DISCRIMINANTS, THE ACTUAL
-- PARAMETER MUST BE AN UNCONSTRAINED TYPE, HAVE THE SAME NUMBER OF
-- DISCRIMINANTS, AND THE CORRESPONDING DISCRIMINANTS MUST HAVE THE SAME
-- BASE TYPE.

-- SPS 7/8/82
-- JRL 11/30/95  Removed Ada95-incompatible cases (corresponding discriminant
--               subtypes must statically match).
-- PWN 03/28/96  Restored checks in Ada95 legal format.

PROCEDURE BC3202A IS
     TYPE NI IS NEW INTEGER;
     SUBTYPE NATURAL IS INTEGER RANGE 1..INTEGER'LAST;

     TYPE REC (C : INTEGER) IS RECORD NULL; END RECORD;
     TYPE DREC (D : INTEGER :=3) IS RECORD NULL; END RECORD;
     SUBTYPE CREC IS REC (C => 3);
     TYPE NREC (D : NATURAL) IS RECORD NULL; END RECORD;
     TYPE NDREC IS RECORD NULL; END RECORD;
     TYPE D2REC (A : INTEGER; B : BOOLEAN) IS RECORD NULL;
          END RECORD;
     SUBTYPE SREC IS D2REC (A => 3, B => TRUE);
     TYPE RECB (D : BOOLEAN) IS RECORD NULL; END RECORD;
     TYPE RECNI (D : NI) IS RECORD NULL; END RECORD;

     GENERIC
          TYPE PV (D : INTEGER) IS PRIVATE;
     PACKAGE PPV IS END PPV;

     GENERIC
          TYPE LP (D : INTEGER) IS LIMITED PRIVATE;
     PACKAGE PLP IS END PLP;

     GENERIC
          TYPE PV (A : INTEGER; B : BOOLEAN) IS PRIVATE;
     PACKAGE GPV IS END GPV;

     GENERIC
          TYPE LP (A : INTEGER; B : BOOLEAN) IS LIMITED PRIVATE;
     PACKAGE GLP IS END GLP;

     PACKAGE PPV1 IS NEW PPV(REC);   -- OK.
     PACKAGE PPV2 IS NEW PPV(DREC);  -- OK.
     PACKAGE PPV3 IS NEW PPV(NREC);  -- ERROR: NREC MUST STATICLY MATCH.
     PACKAGE PPV4 IS NEW PPV(NDREC); -- ERROR: NDREC NO DISCRIMINANT.
     PACKAGE PPV5 IS NEW PPV(D2REC); -- ERROR: D2REC 2 DISCRIMINANTS.
     PACKAGE PPV6 IS NEW PPV(RECB);  -- ERROR: RECB HAS BOOLEAN BASE.
     PACKAGE PPV7 IS NEW PPV(RECNI); -- ERROR: RECNI HAS NI BASE.
     PACKAGE PPV8 IS NEW PPV (CREC); -- ERROR: CREC IS CONSTRAINED.

     PACKAGE PLP1 IS NEW PLP(REC);   -- OK.
     PACKAGE PLP2 IS NEW PLP(DREC);  -- OK.
     PACKAGE PLP3 IS NEW PLP(NREC);  -- ERROR: NREC MUST STATICLY MATCH.
     PACKAGE PLP4 IS NEW PLP(RECB);  -- ERROR: RECB HAS BOOLEAN BASE.
     PACKAGE PLP5 IS NEW PLP(RECNI); -- ERROR: RECNI HAS NI BASE.
     PACKAGE PLP6 IS NEW PLP(NDREC); -- ERROR: NO DISCRIMINANT.
     PACKAGE PLP7 IS NEW PLP(D2REC); -- ERROR: 2 DISCRIMINANTS.
     PACKAGE PLP8 IS NEW PLP(CREC);  -- ERROR: CREC IS CONSTRAINED.

     PACKAGE GPV1 IS NEW GPV(D2REC); -- OK.
     PACKAGE GPV2 IS NEW GPV(REC);   -- ERROR: WRONG NUMBER OF
                                     -- DISCRIMINANTS.
     PACKAGE GPV3 IS NEW GPV(RECB);  -- ERROR: WRONG NUMBER OF
                                     -- DISCRIMINANTS.
     PACKAGE GPV4 IS NEW GPV(SREC);  -- ERROR: SREC IS CONSTRAINED.

     PACKAGE GLP1 IS NEW GLP(D2REC); -- OK.
     PACKAGE GLP2 IS NEW GLP(REC);   -- ERROR: WRONG NUMBER OF
                                     -- DISCRIMINANTS.
     PACKAGE GLP3 IS NEW GLP(RECB);  -- ERROR: WRONG NUMBER OF
                                     -- DISCRIMINANTS.
     PACKAGE GLP4 IS NEW GLP(SREC);  -- ERROR: SREC IS CONSTRAINED.

BEGIN
     NULL;
END BC3202A;
