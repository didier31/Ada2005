-- B810001.A
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
--      Check that a choice_parameter_specification in an exception handler 
--      hides outer declarations with the same name. 
--      Check that two choice parameters within exception handlers of the same
--      handled_sequence_of_statements can have the same name.
--      Check that a choice_parameter_specification in an exception handler is
--      not visible outside the handler.
--
-- TEST DESCRIPTION:
--      Declare the first procedure with an exception choice which has the same
--      name as an outer integer declaration.  Declare a second procedure with
--      an exception handler that is nested inside another exception handler.
--      In the nested exception handler, declare an exception choice which has
--      the same name as an outer integer declaration.  Declare a third
--      procedure which renames an outer exception having the same name as an
--      inner exception choice.  Declare a fourth procedure with an exception
--      choice which has the same name as an outer exception declaration.
--      Declare a fifth procedure with two exception choices that use the same
--      name.  Declare a sixth procedure with an exception choice and check for
--      its name in another exception handler within the same sequence of
--      exception handlers.  Declare a main program with an inner exception
--      choice and check for its name in the main body.
--
--
-- CHANGE HISTORY:
--      25 Jul 95   SAIC    Initial prerelease version.
--      17 Apr 96   SAIC    Modified test description, error messages.
--
--!

procedure B810001_0 is

   Choice   : Integer := 0;
   My_Error : exception;

begin
   null;

exception

   when My_Error =>
      declare
         J : Integer := Choice;                                       -- OK.
      begin
         null;
      end;
 
   when Choice : Constraint_Error =>                                  -- OK.
      declare
         I : Integer := Choice;                                       -- ERROR:
                                         -- Type mismatch: Homograph of Choice.
      begin
         null;
      end;
    
end B810001_0;


     --==================================================================--

procedure B810001_1 is

   Choice : Integer := 0;

begin
   null;

exception

   when My_Error : Constraint_Error =>
      declare
         I : Integer := Choice;                                       -- OK.
      begin
         null;
      exception
         when Choice : others =>                                      -- OK.
         declare
            K : Integer := Choice;                                    -- ERROR:
                                         -- Type mismatch: Homograph of Choice.
         begin
            null;
         end;
      end;
    
end B810001_1;


     --==================================================================--

procedure B810001_2 is

   My_Error : exception;

begin
   null;

exception

   when My_Error : Constraint_Error =>
      declare
         Exc : exception renames My_Error;                            -- ERROR:
                                       -- Type mismatch: Homograph of My_Error.
      begin
         null;
      end;
 
end B810001_2;


     --==================================================================--

procedure B810001_3 is

   My_Error : exception;

begin
   null;

exception

   when My_Error : My_Error =>                                        -- ERROR:
                                       -- Type mismatch: Homograph of My_Error.
      null;

end B810001_3;


     --==================================================================--

procedure B810001_4 is

begin

   null;

exception

   when Choice_Param : Constraint_Error => null;

   when Choice_Param : others           => null;                      -- OK.

end B810001_4;


     --==================================================================--

with Ada.Exceptions;

procedure B810001_5 is

begin

   declare
   begin
      null;

   exception
      when Choice_Param : Constraint_Error => null;
      when others                      =>
         if Ada.Exceptions.Exception_Name (Choice_Param)              -- ERROR:
            /= "Constraint_Error" then null;    -- Choice_Param is not visible.
         end if;

   end;

end B810001_5;

     --==================================================================--

with Ada.Exceptions;

procedure B810001 is

begin

   declare
   begin
      null;

   exception
      when Choice_Param : Constraint_Error => null;

   end;

   if Ada.Exceptions.Exception_Name (Choice_Param)                    -- ERROR:
     /= "Constraint_Error" then null;           -- Choice_Param is not visible.
   end if;

end B810001;
