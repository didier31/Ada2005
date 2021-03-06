-- B650004.A
--
--                             Grant of Unlimited Rights
--
--     The Ada Conformity Assessment Authority (ACAA) holds unlimited
--     rights in the software and documentation contained herein. Unlimited
--     rights are the same as those granted by the U.S. Government for older
--     parts of the Ada Conformity Assessment Test Suite, and are defined
--     in DFAR 252.227-7013(a)(19). By making this public release, the ACAA
--     intends to confer upon all recipients unlimited rights equal to those
--     held by the ACAA. These rights include rights to use, duplicate,
--     release or disclose the released technical data and computer software
--     in whole or in part, in any manner and for any purpose whatsoever, and
--     to have or permit others to do so.
--
--                                    DISCLAIMER
--
--     ALL MATERIALS OR INFORMATION HEREIN RELEASED, MADE AVAILABLE OR
--     DISCLOSED ARE AS IS. THE ACAA MAKES NO EXPRESS OR IMPLIED
--     WARRANTY AS TO ANY MATTER WHATSOEVER, INCLUDING THE CONDITIONS OF THE
--     SOFTWARE, DOCUMENTATION OR OTHER INFORMATION RELEASED, MADE AVAILABLE
--     OR DISCLOSED, OR THE OWNERSHIP, MERCHANTABILITY, OR FITNESS FOR A
--     PARTICULAR PURPOSE OF SAID MATERIAL.
--
--                                     Notice
--
--     The ACAA has created and maintains the Ada Conformity Assessment Test
--     Suite for the purpose of conformity assessments conducted in accordance
--     with the International Standard ISO/IEC 18009 - Ada: Conformity
--     assessment of a language processor. This test suite should not be used
--     to make claims of conformance unless used in accordance with
--     ISO/IEC 18009 and any applicable ACAA procedures.
--*
--
-- OBJECTIVE:
--
--     Check that a return statement is illegal if it is not within a
--     callable construct.
--
--     Check that a return statement is illegal if it is within a body
--     that is within the construct to which it applies.
--
-- TEST DESCRIPTION:
--
--     Package bodies and task bodies are non-callable bodies that can
--     contain return statements. (Protected bodies don't have elaboration
--     statements; entry bodies and accept statements are considered
--     callable constructs.)
--
--     We try all forms of return statement, and place the returns within
--     package and task bodies inside of declarative parts and declare blocks
--     nested in procedures, functions, entry bodies, accept statements,
--     and extended return statements for which the return would be legal.
--
--     We also try returning from a library-level package.
--
-- CHANGE HISTORY:
--      24 Mar 2008   RLB   Created test, covering cases from old test B58001A
--                          and many others.
--
--!

package B650004 is
   procedure Proc;

   function Func return Natural;

   task type Tsk is
      entry Ent;
   end Tsk;

   protected type Prot is
      entry Ent;
   end Prot;

   Obj : Natural := 10;

end B650004;

package body B650004 is

   -- Note: All errors are because of a return statement that is in a body
   -- that is within the construct that the return statement applies to,
   -- unless otherwise noted.

   procedure Proc is
      package Pack is
         procedure Dummy;
      end Pack;

      package body Pack is
         procedure Dummy is
         begin
            null;
         end Dummy;
      begin
         return;                               -- ERROR:
      end Pack;

      task Tsk1;

      task body Tsk1 is
      begin
         return;                               -- ERROR:
      end Tsk1;

   begin
      declare
         package Pack2 is
            procedure Dummy;
         end Pack2;

         package body Pack2 is
            procedure Dummy is
            begin
               null;
            end Dummy;
         begin
            return;                            -- ERROR:
         end Pack2;

         task Tsk2;

         task body Tsk2 is
         begin
            return;                            -- ERROR:
         end Tsk2;
      begin
         return;                               -- OK.
      end;
   end Proc;


   function Func return Natural is
      package Pack3 is
         procedure Dummy;
      end Pack3;

      package body Pack3 is
         procedure Dummy is
         begin
            null;
         end Dummy;
      begin
         if Obj = 10 then
            return 3;                          -- ERROR:
         else
            return Ret : Natural do            -- ERROR:
               Ret := 3;
            end return;
         end if;
      end Pack3;

      task Tsk3;

      task body Tsk3 is
      begin
         if Obj = 10 then
            return 3;                          -- ERROR:
         else
            return Ret : Natural do            -- ERROR:
               Ret := 3;
            end return;
         end if;
      end Tsk3;

   begin
      declare
         package Pack4 is
            procedure Dummy;
         end Pack4;

         package body Pack4 is
            procedure Dummy is
            begin
               null;
            end Dummy;
         begin
            if Obj = 10 then
               return 4;                       -- ERROR:
            else
               return Ret : Natural do         -- ERROR:
                  Ret := 4;
               end return;
            end if;
         end Pack4;

         task Tsk4;

         task body Tsk4 is
         begin
            if Obj = 10 then
               return 4;                       -- ERROR:
            else
               return Ret : Natural do         -- ERROR:
                  Ret := 4;
               end return;
            end if;
         end Tsk4;
      begin
         null;
      end;

      if Obj = 10 then
         return 10;                            -- OK.
      else
         return Ret : Natural do               -- OK.
            declare
               package Pack5 is
                  procedure Dummy;
               end Pack5;

               package body Pack5 is
                  procedure Dummy is
                  begin
                     null;
                  end Dummy;
               begin
                  return;                      -- ERROR:
               end Pack5;

               task Tsk5;

               task body Tsk5 is
               begin
                  return;                      -- ERROR:
               end Tsk5;
            begin
              Ret := 4;
              return;                          -- OK.
            end;
         end return;
      end if;
   end Func;

   task body Tsk is
   begin
      accept Ent do
         declare
            package Pack6 is
               procedure Dummy;
            end Pack6;

            package body Pack6 is
               procedure Dummy is
               begin
                  null;
               end Dummy;
            begin
               return;                         -- ERROR:
            end Pack6;

            task Tsk6;

            task body Tsk6 is
            begin
               return;                         -- ERROR:
            end Tsk6;
         begin
            null;
         end;
         return;                               -- OK.
      end Ent;

      return;                  -- ERROR: Not in a callable construct.
   end Tsk;

   protected body Prot is
      entry Ent when True is
         package Pack is
            procedure Dummy;
         end Pack;

         package body Pack is
            procedure Dummy is
            begin
               null;
            end Dummy;
         begin
            return;                            -- ERROR:
         end Pack;

         task Tsk6;

         task body Tsk6 is
         begin
            return;                            -- ERROR:
         end Tsk6;

      begin
         declare
            package Pack7 is
               procedure Dummy;
            end Pack7;

            package body Pack7 is
               procedure Dummy is
               begin
                  null;
               end Dummy;
            begin
               return;                         -- ERROR:
            end Pack7;

            task Tsk7;

            task body Tsk7 is
            begin
               return;                         -- ERROR:
            end Tsk7;
         begin
            return;                            -- OK.
         end;
      end Ent;
   end Prot;

begin
   return;                     -- ERROR: Not in a callable construct.
end B650004;



