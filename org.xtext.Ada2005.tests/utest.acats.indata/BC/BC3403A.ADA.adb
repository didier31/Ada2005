-- BC3403A.ADA

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
-- WHEN A GENERIC FORMAL TYPE IS AN ARRAY TYPE, CHECK THAT CORRESPONDING
-- INDEX POSITIONS HAVE THE SAME BASE TYPE.

-- CHECK FOR WHEN THE INDEX BASE TYPE IS NOT A GENERIC FORMAL PARAMETER.

-- SPS 6/8/82
-- JRL 11/14/95  Removed Ada95-incompatible cases (corresponding index
--               subtypes and ranges must statically match).
-- PWN 03/28/96  Restored checks in Ada95 legal format.

PROCEDURE BC3403A IS

     TYPE ENUM IS (E1, E2, E3, E4);
     SUBTYPE EN IS ENUM RANGE E1..E4;
     SUBTYPE BB IS BOOLEAN;
     SUBTYPE INT IS INTEGER;
     SUBTYPE NATURAL IS INTEGER RANGE 1..INTEGER'LAST;
     TYPE NI IS NEW INTEGER;
     SUBTYPE CC IS CHARACTER;
     TYPE NC IS NEW CHARACTER;

     TYPE AIU IS ARRAY (INTEGER RANGE <>) OF NATURAL;
     TYPE AI IS ARRAY (INTEGER) OF NATURAL;
     TYPE AN IS ARRAY (NATURAL) OF NATURAL;
     TYPE ANU IS ARRAY (NATURAL RANGE <>) OF NATURAL;
     TYPE A_I IS ARRAY (INT) OF NATURAL;
     TYPE A_IU IS ARRAY (INT RANGE <>) OF NATURAL;
     TYPE AB IS ARRAY (BOOLEAN) OF NATURAL;
     TYPE AE IS ARRAY (ENUM) OF NATURAL;
     TYPE AEU IS ARRAY (ENUM RANGE <>) OF NATURAL;
     TYPE AEN IS ARRAY (EN RANGE <>) OF NATURAL;
     TYPE AC IS ARRAY (CHARACTER) OF NATURAL;
     TYPE NAI IS ARRAY (NI) OF NATURAL;

     TYPE AII IS ARRAY (INTEGER, INTEGER) OF NATURAL;
     TYPE AI_I IS ARRAY (INTEGER, INT) OF NATURAL;
     TYPE AIN IS ARRAY (INTEGER, NATURAL) OF NATURAL;
     TYPE AIB IS ARRAY (INTEGER, BOOLEAN) OF NATURAL;
     TYPE AIC IS ARRAY (INTEGER, CHARACTER) OF NATURAL;
     TYPE ABI IS ARRAY (BOOLEAN, INTEGER) OF NATURAL;
     TYPE ACI IS ARRAY (CHARACTER, INTEGER) OF NATURAL;
     TYPE A_II IS ARRAY (INT, INTEGER) OF NATURAL;
     TYPE ANI IS ARRAY (NATURAL, INTEGER) OF NATURAL;
     TYPE ABC IS ARRAY (BOOLEAN, CHARACTER) OF NATURAL;
     TYPE ABBI IS ARRAY (BB, INTEGER) OF NATURAL;
     TYPE ANII IS ARRAY (NI, INTEGER) OF NATURAL;
     TYPE AINI IS ARRAY (INTEGER, NI) OF NATURAL;
     TYPE AINC IS ARRAY (INTEGER, NC) OF NATURAL;
     TYPE AICC IS ARRAY (INTEGER, CC) OF NATURAL;

     GENERIC
          TYPE AR IS ARRAY (INTEGER) OF NATURAL;
     PACKAGE P IS END P;

     GENERIC
          TYPE AR IS ARRAY (INTEGER RANGE <>) OF NATURAL;
     PACKAGE PIU IS END PIU;

     GENERIC
          TYPE AR IS ARRAY (ENUM RANGE <>) OF NATURAL;
     PACKAGE PE IS END PE;

     GENERIC
          TYPE AR IS ARRAY (INTEGER, INTEGER) OF NATURAL;
     PACKAGE PI IS END PI;

     GENERIC
          TYPE AR IS ARRAY (BOOLEAN, INTEGER) OF NATURAL;
     PACKAGE PB IS END PB;

     GENERIC
          TYPE AR IS ARRAY (INTEGER, CHARACTER) OF NATURAL;
     PACKAGE PC IS END PC;

     PACKAGE P1 IS NEW P (AI);          -- OK.
     PACKAGE P2 IS NEW P (A_I);         -- OK.
     PACKAGE P3 IS NEW P (AN);          -- ERROR: AN.
     PACKAGE P4 IS NEW P (AB);          -- ERROR: BOOLEAN.
     PACKAGE P5 IS NEW P (AC);          -- ERROR: CHARACTER.
     PACKAGE P6 IS NEW P (AE);          -- ERROR: ENUM.
     PACKAGE P7 IS NEW P (NAI);         -- ERROR: NI.

     PACKAGE PE1 IS NEW PE (AIU);       -- ERROR: AIU.
     PACKAGE PE2 IS NEW PE (AEU);       -- OK.
     PACKAGE PE3 IS NEW PE (AEN);       -- OK.
     PACKAGE PE4 IS NEW PE (ANU);       -- ERROR: ANU.

     PACKAGE PI1 IS NEW PI (AII);       -- OK.
     PACKAGE PI2 IS NEW PI (AIN);       -- ERROR: AIN.
     PACKAGE PI3 IS NEW PI (ANI);       -- ERROR: ANI.
     PACKAGE PI4 IS NEW PI (AI_I);      -- OK.
     PACKAGE PI5 IS NEW PI (A_II);      -- OK.
     PACKAGE PI6 IS NEW PI (AIB);       -- ERROR: BOOLEAN.
     PACKAGE PI7 IS NEW PI (AIC);       -- ERROR: CHARACTER.
     PACKAGE PI8 IS NEW PI (ABI);       -- ERROR: BOOLEAN.
     PACKAGE PI9 IS NEW PI (ACI);       -- ERROR: CHARACTER.
     PACKAGE PI10 IS NEW PI (ANII);     -- ERROR: NI.
     PACKAGE PI11 IS NEW PI (AINI);     -- ERROR: NI.

     PACKAGE PIU1 IS NEW PIU (AIU);     -- OK.
     PACKAGE PIU2 IS NEW PIU (ANU);     -- ERROR: ANU.
     PACKAGE PIU3 IS NEW PIU (A_IU);    -- OK.
     PACKAGE PIU4 IS NEW PIU (AEU);     -- ERROR: AEU.
     PACKAGE PIU5 IS NEW PIU (AEN);     -- ERROR: AEN.

     PACKAGE PB1 IS NEW PB (ABI);       -- OK.
     PACKAGE PB2 IS NEW PB (ABBI);      -- OK.
     PACKAGE PB3 IS NEW PB (ABC);       -- ERROR: CHARACTER.
     PACKAGE PB4 IS NEW PB (AII);       -- ERROR: INTEGER.

     PACKAGE PC1 IS NEW PC (AIC);       -- OK.
     PACKAGE PC2 IS NEW PC (ABC);       -- ERROR: BOOLEAN.
     PACKAGE PC3 IS NEW PC (AII);       -- ERROR: INTEGER.
     PACKAGE PC4 IS NEW PC (AINC);      -- ERROR: NC.
     PACKAGE PC5 IS NEW PC (AICC);      -- OK.

BEGIN
     NULL;
END BC3403A;
