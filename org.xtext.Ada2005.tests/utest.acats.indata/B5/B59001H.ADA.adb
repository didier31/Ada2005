-- B59001H.ADA

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
-- CHECK THAT JUMPS FROM INSIDE BODIES OF ACCEPT STATEMENTS ARE NOT
--    ALLOWED.


-- RM 08/17/82
-- SPS 3/8/83

PROCEDURE  B59001H  IS
BEGIN

     DECLARE

          TASK  T  IS
               ENTRY  E1 ;
               ENTRY  E2 ;
               ENTRY  E3 ;
          END  T ;

          TASK BODY  T  IS
          BEGIN

               SELECT 
                    ACCEPT  E1  DO
                         GOTO  L111 ;      -- ERROR: JUMP FROM INSIDE
                                           --     ACCEPT BODY.
                    END;
                    << L111 >>  NULL ;
               OR
                    ACCEPT  E2 ;
                    << L222 >>  NULL ;
               OR
                    ACCEPT  E3  DO
                         GOTO  L222 ;      -- ERROR: JUMP FROM INSIDE
                                           --     ACCEPT BODY.
                    END;
               END SELECT;

          END T;

     BEGIN

          NULL ;

     END;


END  B59001H ;
