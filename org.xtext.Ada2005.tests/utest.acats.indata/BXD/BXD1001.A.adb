-- BXD1001.A
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
--      Check that a Priority pragma is allowed immediately within 
--      a task_definition, a protected_definition, and the 
--      declarative_part of a subprogram_body.
--      Check that a Priority pragma is not allowed in other places.
--      Check that an Interrupt_Priority pragma is allowed immediately 
--      within a task_definition or a protected_definition.
--      Check that an Interrupt_Priority pragma is not allowed in the 
--      declarative part of a subprogram_body.
--      Check that only one such pragma is allowed within a given 
--      construct.
--
-- TEST DESCRIPTION:
--      This test attempts to specify a priority and interrupt_priority
--      in a variety of places, only some of which are legal.
--
-- APPLICABILITY CRITERIA:
--      This test applies only to implementations supporting the
--      Real-Time Systems Annex.
--
-- GRADING CRITERIA:
--      If an implementation invokes D.2.1(10) to restrict the use
--      of tasks with interrupt priorities, it may produce error messages
--      for the pragmas marked "Optional Error" (but is not required to).
--      Otherwise, the implementation may not produce error messages for
--      the lines marked Optional Error.
--
-- CHANGE HISTORY:
--      02 AUG 95   SAIC    Initial version
--      08 MAY 96   SAIC    Incorporated Reviewers comments
--      25 NOV 98   RLB     Added optional errors to interrupt priority
--                          pragmas in tasks.
--!


-- This package specification should compile without error 
with System;
package BXD1001_1 is

  -- 
  -- Legal cases for protected_definition
  -- 

  protected Shared_Counter is                 
    pragma Priority (System.Priority'First);                         -- OK.
    procedure Increment;
  private
    The_Counter : Integer := 2;
  end Shared_Counter;

  protected type Resource is
    pragma Interrupt_Priority (System.Interrupt_Priority'First);     -- OK.
    entry Sieze;
    procedure Release;
  private
    Busy : Boolean := False;
  end Resource;

  protected type Resource_2 is
    entry Sieze;
    procedure Release;
  private
    Busy : Boolean := False;
    pragma Interrupt_Priority (System.Interrupt_Priority'First);     -- OK.
  end Resource_2;

  -- 
  -- Legal cases for task_definition
  -- 

  task Helper_1 is
    pragma Priority (System.Priority'Last);                          -- OK.
    entry Start_Work;
  end Helper_1;

  task type Helper_2 is
    pragma Interrupt_Priority (System.Interrupt_Priority'Last);      -- OPTIONAL ERROR: See above.
    entry Start_Work;
  end Helper_2;

  task type Helper_3 is
    entry Start_Work;
    pragma Interrupt_Priority;                                       -- OPTIONAL ERROR: See above.
  end Helper_3;
  
end BXD1001_1;


-- This procedure should compile without error
with System;
procedure BXD1001_2 is
  pragma Priority (System.Default_Priority);                         -- OK.
begin
  null;
end BXD1001_2;


with System;
procedure BXD1001_3 is
  pragma Interrupt_Priority(System.Interrupt_Priority'First);     -- ERROR:
          -- pragma Interrupt_Priority is only allowed in a task_definition
          -- or a protected_definition.
begin 
  null; 
end BXD1001_3;


with System;
package BXD1001_4 is
  task type Helper_1 is
    pragma Priority (System.Priority'Last);
    pragma Priority (System.Priority'Last);                       -- ERROR:
            -- only one priority pragma is allowed within a given construct
    entry Start_Work;
  end Helper_1;

  protected type Resource is
    pragma Interrupt_Priority (System.Interrupt_Priority'First);
    pragma Priority (System.Priority'Last);                       -- ERROR:
            -- only one priority pragma is allowed within a given construct
    entry Sieze;
    procedure Release;
  private
    Busy : Boolean := False;
  end Resource;
end BXD1001_4;


with System;
package BXD1001_5 is
  pragma Interrupt_Priority (System.Interrupt_Priority'Last);     -- ERROR:
           -- a package is not one of the allowed constructs for containing
           -- a priority declaration
  task type A_Task_Type;
end BXD1001_5;


with System;
procedure BXD1001_6 is
  type A_Record is 
    record
      pragma Priority (System.Default_Priority);                  -- ERROR:
             -- pragma Priority not immediately within an allowed construct
      Field : Integer;
    end record;
begin
  null;
end BXD1001_6;


with System;
procedure BXD1001_7 is
  task T is
    entry E;
  end T;

  task body T is
     pragma Priority (System.Default_Priority);                   -- ERROR:
                              -- pragma priority not allowed in a task body
  begin
    accept E do
       pragma Priority (System.Priority'Last);                    -- ERROR:
                      -- pragma priority not allowed in an accept statement
       null;
    end E;
  end T;
begin
  T.E;
end BXD1001_7;

with System;
package BXD1001_8 is

  task type Helper_2 is
    pragma Interrupt_Priority (System.Interrupt_Priority'Last); -- OPTIONAL ERROR:
					-- See grading criteria.
    entry Start_Work;
  end Helper_2;

  task type Helper_3 is
    entry Start_Work;
    pragma Interrupt_Priority;          -- OPTIONAL ERROR: 
					-- See grading criteria.
  end Helper_3;
  
end BXD1001_8;
