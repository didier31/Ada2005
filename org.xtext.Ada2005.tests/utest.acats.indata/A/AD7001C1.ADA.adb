-- AD7001C1.ADA

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
--     CHECK THAT A DECLARATION IN PACKAGE SYSTEM IS ACCESSIBLE
--     IN A LIBRARY PACKAGE BODY IF A WITH CLAUSE NAMING SYSTEM
--     IS PROVIDED FOR THE PACKAGE SPECIFICATION, ALTHOUGH IN ANOTHER
--     FILE.

-- HISTORY:
--     JET 09/09/87  CREATED ORIGINAL TEST.
--     RJW 05/03/88  REVISED AND ENTERED IN ACVC.
--     PWN 05/25/94  ADDED A PROCEDURE TO KEEP PACKAGE BODIES LEGAL.

-- THIS FILE CONTAINS THE PACKAGE BODY FOR PACKAGE AD7001C_PACKAGE.
--     FILE AD7001C0M.ADA CONTAINS THE PACKAGE SPEC AND MAIN PROCEDURE
--     FOR TEST AD7001C AND IS ALSO REQUIRED FOR TEST EXECUTION.

PACKAGE BODY AD7001C_PACKAGE IS

     CHECK_ADDRESS  : SYSTEM.ADDRESS;
     CHECK_NAME     : SYSTEM.NAME := SYSTEM.SYSTEM_NAME;
     CHECK_PRIORITY : SYSTEM.PRIORITY;
     MEM_SIZE       : CONSTANT := SYSTEM.MEMORY_SIZE;

     TYPE INTRANGE IS RANGE SYSTEM.MIN_INT..SYSTEM.MAX_INT;

     PROCEDURE REQUIRE_BODY IS
     BEGIN
          NULL;
     END;

BEGIN
     I := SYSTEM.STORAGE_UNIT;
     I := SYSTEM.MAX_DIGITS;
     I := SYSTEM.MAX_MANTISSA;
     F := SYSTEM.FINE_DELTA;
     F := SYSTEM.TICK;
END AD7001C_PACKAGE;
