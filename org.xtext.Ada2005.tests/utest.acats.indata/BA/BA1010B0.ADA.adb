-- BA1010B0M.ADA

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
--     CHECK THAT THE SPECIFICATION OF A SEPARATELY COMPILED PROCEDURE
--     BODY MUST CONFORM TO THAT OF THE DECLARED SPECIFICATION.

-- SEPARATE FILES ARE:
--     BA1010B0M.ADA - SPECIFICATION FOR SUBPROGRAM BA1010B.  THIS
--                     FILE SHOULD COMPILE WITHOUT ERRORS.
--     BA1010B1.ADA  - BODY FOR SUBPROGRAM BA1010B.
--     BA1010B2.ADA  - BODY FOR SUBPROGRAM BA1010B.
--     BA1010B4.ADA  - BODY FOR SUBPROGRAM BA1010B.
--     BA1010B5.ADA  - BODY FOR SUBPROGRAM BA1010B.
--     BA1010B6.ADA  - BODY FOR SUBPROGRAM BA1010B.
--     BA1010B7.ADA  - BODY FOR SUBPROGRAM BA1010B.
--     BA1010B8.ADA  - BODY FOR SUBPROGRAM BA1010B.

-- HISTORY:
--     THS 04/12/90  CREATED TEST FROM SPLIT OF BA1010A0M.ADA.
--     THS 09/21/90  REMOVED CODE NOT NEEDED.
--     PWN 11/05/95  REMOVED CHECK THAT CONFORMS IN ADA95.

PROCEDURE BA1010B (I : IN INTEGER);
