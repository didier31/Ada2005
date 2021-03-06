-- B26005A.ADA

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
-- CHECK THAT NON-PRINTING (CONTROL) CHARACTERS (CHARACTERS 0-31
-- AND 127) CANNOT BE INCLUDED IN STRING LITERALS.
-- THIS TEST CHECKS THE CONTROL CHARACTERS OF THE FULL 128 CHAR
-- ASCII SET.

-- DCB  1/25/80
-- TBN 10/14/85     RENAMED FROM B26005A.ADA AND FIXED LINE LENGTH.
-- PWB  6/18/86     ADDED CHARACTERS 0 AND 127 (NUL AND DEL).

PROCEDURE B26005A IS

     C1 : STRING (1..5);

BEGIN

     C1 := "=> <=";     -- ERROR: CONTROL AT SIGN (NUL) USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL A (SOH) USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL B (STX) USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL C (ETX) USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL D (EOT) USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL E (ENQ) USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL F (ACK) USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL G (BEL) USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL H (BS)  USED IN STRING.
     C1 := "=>	<=";     -- ERROR: CONTROL I (HT)  USED IN STRING.
     C1 := "=>
<=";     -- ERROR: CONTROL J (LF) USED IN STRING.
     NULL;
     C1 := "=><=";     -- ERROR: CONTROL K (VT)  USED IN STRING.
     NULL;
     C1 := "=><=";     -- ERROR: CONTROL L (FF) USED IN STRING.
     NULL;
     C1 := "=><=";
                       -- ERROR: CONTROL M (CR) USED IN STRING.
     NULL;
     C1 := "=><=";     -- ERROR: CONTROL N (SO) USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL O (SI) USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL P (DLE) USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL Q (DC1) USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL R (DC2) USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL S (DC3) USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL T (DC4) USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL U (NAK) USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL V (SYN) USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL W (ETB) USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL X (CAN) USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL Y (EM)  USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL Z (SUB) USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL LEFT BRACKET (ESC)
                            --        USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL BACKSLASH (FS) USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL RIGHT BRACKET (GS)
                         --        USED IN STRING.
     C1 := "=><=";     -- ERROR: CONTROL CIRCUMFLEX (RS) USED IN
                         --        STRING.
     C1 := "=><=";     -- ERROR: CONTROL UNDERLINE (US) USED IN STRING.
     C1 := "=><=";  -- ERROR: RUBOUT/DELETE (DEL) USED IN STRING.

END B26005A;
