-- BXC3002.A
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
--      Check that pragmas Interrupt_Handler and Attach_Handler are
--      recognized for protected types.  Check that the pragmas are allowed
--      only immediately in a protected definition.  Check that a protected
--      declaration for Attach_Handler must be library level.
--      Check that a protected type declaration for Interrupt_Handler must be
--      library level and that any object declaration of that type must be
--      library level.
--
-- TEST DESCRIPTION:
--      This test defines protected objects and uses them to determine
--      the correct recognition of the pragmas
--      Interrupt_Handler and Attach_Handler.
--
-- APPLICABILITY CRITERIA:
--      This test is only applicable for a compiler attempting validation
--      for the Systems Programming Annex.  Note that additional warnings
--      may occur in an implementation where Ada.Interrupts.Interrupt_ID
--      contains only a single value.
--
--      This test is not applicable for an implementation that takes
--      advantage of C.3.1(19) and provides implementations of
--      Attach_Handler and Interrupt_Handler other than those explicitly
--      defined in C.3.1.
--
--
-- CHANGE HISTORY:
--      21 FEB 96   SAIC   Initial version for 2.1
--      05 NOV 96   SAIC   Revised version for 2.1
--      21 MAR 08   RLB    Corrected for changes in Amendment 1.
--
--!

with Ada.Interrupts;
package BXC3002 is

  protected type Type_0 is
    procedure Parameterless_Procedure_1;
    pragma Interrupt_Handler( Parameterless_Procedure_1 );         -- OK
    pragma Attach_Handler( Parameterless_Procedure_1,
                           Ada.Interrupts.Interrupt_ID'Last );     -- OK
  end Type_0;

  Legal_Object : Type_0;                                           -- OK

  protected Object_2 is
    procedure Parameterless_Procedure_2;
  end Object_2;

  type Interrupt_ID is new Integer;
  Int_Handler_Var : Interrupt_ID := 1;

end BXC3002;

with Ada.Interrupts;
package body BXC3002 is

  protected body Type_0 is
    procedure Parameterless_Procedure_1 is
    begin null; end;
  end Type_0;

  protected body Object_2 is

    pragma Interrupt_Handler( Parameterless_Procedure_2 );        -- ERROR:
                              -- must be within protected object definition

    pragma Attach_Handler( Parameterless_Procedure_2,
                           Ada.Interrupts.Interrupt_ID'First );   -- ERROR:
                              -- must be within protected object definition

    procedure Parameterless_Procedure_2 is
    begin
      null;
    end Parameterless_Procedure_2;
  end Object_2;

  procedure Nested is
    Nested_Object : Type_0;                                       -- OK

    protected Object_X is
      procedure Parameterless_Procedure_3;
      pragma Interrupt_Handler( Parameterless_Procedure_3 );      -- ERROR:
                                            -- must be library level object

      pragma Attach_Handler( Parameterless_Procedure_3,
                             Ada.Interrupts.Interrupt_ID'First ); -- ERROR:
                                            -- must be library level object

    end Object_X;

    protected body Object_X is
      procedure Parameterless_Procedure_3 is
      begin null; end Parameterless_Procedure_3;
    end Object_X;

  begin
    Ada.Interrupts.Attach_Handler (New_Handler =>
      Nested_Object.Parameterless_Procedure_1'Access,             -- ERROR:
                      -- Accessibility error: handler must be library level
      Interrupt => Ada.Interrupts.Interrupt_ID'Last);
  end Nested;

end BXC3002;
