-- BC54001.A
--
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
--
-- OBJECTIVE:
--      Check that if a generic formal access type contains the general access
--      modifier "constant," the actual must be an access-to-constant type.
--      Check that if a generic formal access type contains the general access
--      modifier "all," the actual must be a general access-to-variable type.
--      Check that if a generic formal access type contains no general
--      access modifiers and is not a formal access-to-subprogram type, the
--      actual must be a general or pool-specific access-to-variable type.
--      Check that if a generic formal access type is a formal
--      access-to-subprogram type, the actual must be an access-to-subprogram
--      type.
--
-- TEST DESCRIPTION:
--      Declare generic units with each of the four kinds of formal access
--      type: general access-to-constant, general access-to-variable, pool-
--      specific, and access-to-subprogram. Attempt to instantiate each
--      generic with each of the four kinds of access type as actual.
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--
--!

package BC54001_0 is

   generic
      type Access_To_Constant is access constant String;
   package General_Access_Constant is end;
   
   generic
      type Access_To_Variable is access all String;
   package General_Access_All is end;
   
   generic
      type No_Modifier is access String;
   package Pool_Specific_Access is end;

   generic
      type Access_To_Subprog is access function return String;
   package Subprogram_Access is end;

end BC54001_0;


     --===================================================================--


with BC54001_0;
package BC54001 is

   type Msg_Ptr_Constant is access constant String;
   type Msg_Ptr_All      is access all      String;
   type Msg_Ptr_Pool     is access          String;
   type Msg_Ptr_Subprog  is access function return String;


   --
   -- Generic formal is an access-to-constant type:
   --

   package Instance_1 is new
     BC54001_0.General_Access_Constant (Msg_Ptr_Constant);            -- OK.

   package Instance_2 is new
     BC54001_0.General_Access_Constant (Msg_Ptr_All);                 -- ERROR:
                                   -- Actual is not an access-to-constant type.

   package Instance_3 is new
     BC54001_0.General_Access_Constant (Msg_Ptr_Pool);                -- ERROR:
                                   -- Actual is not an access-to-constant type.

   package Instance_4 is new
     BC54001_0.General_Access_Constant (Msg_Ptr_Subprog);             -- ERROR:
                                   -- Actual is not an access-to-constant type.


   --
   -- Generic formal is an access-to-variable type:
   --

   package Instance_5 is new
     BC54001_0.General_Access_All (Msg_Ptr_Constant);                 -- ERROR:
                            -- Actual is not a general access-to-variable type.

   package Instance_6 is new
     BC54001_0.General_Access_All (Msg_Ptr_All);                      -- OK.

   package Instance_7 is new
     BC54001_0.General_Access_All (Msg_Ptr_Pool);                     -- ERROR:
                            -- Actual is not a general access-to-variable type.

   package Instance_8 is new
     BC54001_0.General_Access_All (Msg_Ptr_Subprog);                  -- ERROR:
                            -- Actual is not a general access-to-variable type.


   --
   -- Generic formal is a pool-specific access type:
   --

   package Instance_9 is new
     BC54001_0.Pool_Specific_Access (Msg_Ptr_Constant);               -- ERROR:
                                   -- Actual is not an access-to-variable type.

   package Instance10 is new
     BC54001_0.Pool_Specific_Access (Msg_Ptr_All);                    -- OK.

   package Instance11 is new
     BC54001_0.Pool_Specific_Access (Msg_Ptr_Pool);                   -- OK.

   package Instance12 is new
     BC54001_0.Pool_Specific_Access (Msg_Ptr_Subprog);                -- ERROR:
                                   -- Actual is not an access-to-variable type.


   --
   -- Generic formal is an access-to-subprogram type:
   --

   package Instance13 is new
     BC54001_0.Subprogram_Access (Msg_Ptr_Constant);                  -- ERROR:
                                 -- Actual is not an access-to-subprogram type.

   package Instance14 is new
     BC54001_0.Subprogram_Access (Msg_Ptr_All);                       -- ERROR:
                                 -- Actual is not an access-to-subprogram type.

   package Instance15 is new
     BC54001_0.Subprogram_Access (Msg_Ptr_Pool);                      -- ERROR:
                                 -- Actual is not an access-to-subprogram type.

   package Instance16 is new
     BC54001_0.Subprogram_Access (Msg_Ptr_Subprog);                   -- OK.


end BC54001;
