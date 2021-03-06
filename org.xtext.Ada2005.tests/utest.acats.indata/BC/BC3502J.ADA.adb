-- BC3502J.ADA

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
-- CHECK THAT WHEN A GENERIC FORMAL TYPE IS AN ACCESS TYPE, THE FORMAL
-- TYPE IS ONLY MATCHED WHEN ITS DESIGNATED BASE TYPE IS THE SAME AS
-- THE DESIGNATED BASE TYPE OF THE ACTUAL PARAMETER.

-- CHECK FOR WHEN THE DESIGNATED TYPE IS A GENERIC FORMAL TYPE DECLARED
-- IN THE SAME FORMAL PART.

-- CHECK FOR WHEN THE DESIGNATED TYPE IS A PRIVATE OR LIMITED PRIVATE
-- TYPE.

-- SPS 5/25/82

PROCEDURE BC3502J IS

     PACKAGE PRIV IS

          TYPE PV1 IS PRIVATE;
          TYPE PV2 IS PRIVATE;
          TYPE PV3 IS PRIVATE;
          TYPE PV4 IS PRIVATE;
          TYPE PV5 (D : INTEGER := 3) IS PRIVATE;
          TYPE LP1 IS LIMITED PRIVATE;
          TYPE LP2 IS LIMITED PRIVATE;
          TYPE LP3 IS LIMITED PRIVATE;
          TYPE LP4 IS LIMITED PRIVATE;
          TYPE LP5 IS LIMITED PRIVATE;

     PRIVATE

          TYPE PV1 IS NEW INTEGER RANGE 1 ..2;
          TYPE PV2 IS ARRAY (PV1) OF CHARACTER;
          TYPE PV3 IS 
          RECORD
               C1 : PV1;
               C2 : PV2;
          END RECORD;
          TYPE PV4 IS ACCESS PV3;
          TYPE PV5 (D: INTEGER := 3) IS
          RECORD
               C1 : PV3;
               CASE D IS
                    WHEN 1 .. 10 => C2 : PV4;
                    WHEN OTHERS => NULL;
               END CASE;
          END RECORD;
          TYPE LP1 IS ACCESS PV1;
          TYPE LP2 IS NEW PV2;
          TYPE LP3 IS NEW CHARACTER;
          TYPE LP4 IS NEW PV4;
          TYPE LP5 IS ACCESS PV5;

     END PRIV;

     USE PRIV;

     TYPE APV1 IS ACCESS PV1;
     TYPE APV2 IS ACCESS PV2;
     TYPE APV3 IS ACCESS PV3;
     TYPE APV4 IS ACCESS PV4;
     TYPE APV5 IS ACCESS PV5;
     TYPE ALP1 IS ACCESS LP1;
     TYPE ALP2 IS ACCESS LP2;
     TYPE ALP3 IS ACCESS LP3;
     TYPE ALP4 IS ACCESS LP4;
     TYPE ALP5 IS ACCESS LP5;
     TYPE CAPV5 IS ACCESS PV5 (D => 3);

     TYPE NPV2 IS NEW PV2;
     TYPE ANPV2 IS ACCESS NPV2;
     TYPE NAPV2 IS NEW APV2;
     TYPE NPV4 IS NEW PV4;
     TYPE ANPV4 IS ACCESS NPV4;
     TYPE NAPV4 IS NEW APV4;
     TYPE NLP1 IS NEW LP1;
     TYPE ANLP1 IS ACCESS NLP1;
     TYPE NALP1 IS NEW ALP1;
     TYPE NLP3 IS NEW LP3;
     TYPE ANLP3 IS ACCESS NLP3;
     TYPE NALP3 IS NEW ALP3;
     TYPE NLP5 IS NEW LP5;
     TYPE ANLP5 IS ACCESS NLP5;
     TYPE NALP5 IS NEW ALP5;

     GENERIC
          TYPE T IS LIMITED PRIVATE;
          TYPE FT IS ACCESS T;
     PACKAGE P IS END P;

     PACKAGE PPV21 IS NEW P (PV2, APV2);       -- OK.
     PACKAGE PPV22 IS NEW P (PV2, APV1);       -- ERROR: APV1.
     PACKAGE PPV23 IS NEW P (PV2, APV3);       -- ERROR: APV3.
     PACKAGE PPV24 IS NEW P (PV2, ALP2);       -- ERROR: ALP2.
     PACKAGE PPV25 IS NEW P (PV2, ANPV2);      -- ERROR: ANPV2.
     PACKAGE PPV26 IS NEW P (PV2, NAPV2);      -- OK.

     PACKAGE PPV41 IS NEW P (PV4, APV4);       -- OK.
     PACKAGE PPV42 IS NEW P (PV4, APV3);       -- ERROR: APV3.
     PACKAGE PPV43 IS NEW P (PV4, ALP4);       -- ERROR: ALP4.
     PACKAGE PPV44 IS NEW P (PV4, ANPV4);      -- ERROR: ANPV4.
     PACKAGE PPV45 IS NEW P (PV4, NAPV4);      -- OK.

     PACKAGE PLP11 IS NEW P (LP1, ALP1);       -- OK.
     PACKAGE PLP12 IS NEW P (LP1, APV1);       -- ERROR: APV1.
     PACKAGE PLP13 IS NEW P (LP1, ALP2);       -- ERROR: ALP2.
     PACKAGE PLP14 IS NEW P (LP1, ANLP1);      -- ERROR: ANLP1.
     PACKAGE PLP15 IS NEW P (LP1, NALP1);      -- OK.

     PACKAGE PLP31 IS NEW P (LP3, ALP3);       -- OK.
     PACKAGE PLP32 IS NEW P (LP3, APV2);       -- ERROR: APV2.
     PACKAGE PLP33 IS NEW P (LP3, ALP2);       -- ERROR: ALP2.
     PACKAGE PLP34 IS NEW P (LP3, ANLP3);      -- ERROR: ANLP3.
     PACKAGE PLP35 IS NEW P (LP3, NALP3);      -- OK.

     PACKAGE PLP51 IS NEW P (LP5, ALP5);       -- OK.
     PACKAGE PLP52 IS NEW P (LP5, APV5);       -- ERROR: APV5.
     PACKAGE PLP53 IS NEW P (LP5, APV3);       -- ERROR: APV3.
     PACKAGE PLP54 IS NEW P (LP5, ANLP5);      -- ERROR: ANLP5.
     PACKAGE PLP55 IS NEW P (LP5, NALP5);      -- OK.


BEGIN
     NULL;
END BC3502J;
