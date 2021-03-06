-- BXE2009.A
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
--      Check that a declared Remote_Call_Interface library unit may not
--      contain:
--      variable declarations, task type declarations, protected type
--      declarations, nested generic declarations, limited types,
--      subprogram declarations to which a pragma inline applies,
--      non-preelaborable constant declarations,
--      a subprogram declaration with a formal parameter
--      of an access type, or a subprogram declaration with a formal
--      parameter of a type that does not support external streaming.
--
--      Check that a Remote_Call_Interface library unit may not depend
--      upon a normal package.
--
--      Check that a declared Remote_Call_Interface library unit may
--      contain:
--      subprogram declaration with a formal parameter of a limited type
--      with available READ and WRITE attributes.
--
--      Check that pragma Asynchronous can only be applied to RCI procedures
--      containing only mode in parameters.
--
-- TEST DESCRIPTION:
--      This test consists of three package specifications. The first two
--      packages are support packages providing declarations to the
--      third package. The third package is the package containing the
--      Remote_Call_Interface pragma. This package specification contains
--      declarations of one of each of the items that should not be
--      allowed and one of each of the specific items that should be
--      allowed.
--
-- APPLICABILITY CRITERIA:
--      This test applies only to implementations supporting the
--      Distribution Annex and the Remote_Call_Interface pragma.
--
--
-- CHANGE HISTORY:
--     11 MAR 95   SAIC    Initial version
--     20 DEC 95   SAIC    Added additional checks for E.2.3(8)
--     02 MAY 96   SAIC    Incorporated Reviewer comments.
--     02 DEC 97   EDS     Item parameter for write must be of a base subtype
--                         (13.3.2:36).
--     05 MAR 07   RLB     Corrected "normal" package, because the one
--                         chosen was changed to Remote_Types by Corrigendum 1.
--     21 MAR 08   RLB     Corrected Is_Limited_with_Attrs to actually have
--                         available stream attributes, and revised comments
--                         to reflect the current rules.
--
--!

with Ada.Streams;
package BXE2009_Types is
  pragma Remote_Types;
  -- this package should compile without error
  type Ok_Parameter_Type is private;
              -- This type will have access type components. 'read and
              -- 'write are provided for that access type so that this
              -- type can be used as the type of a parameter for a
              -- remote procedure call.
  type Is_Limited is limited private;
              -- This type does not have available 'read and 'write
              -- attributes.

  type Is_Limited_With_Attrs is limited private;
              -- This type does have available 'read and 'write attributes.

  procedure Write1 (
     Stream : access Ada.Streams.Root_Stream_Type'Class;
     Item   : in Is_Limited_With_Attrs);
  for Is_Limited_With_Attrs'WRITE use Write1;

  procedure Read1 (
     Stream : access Ada.Streams.Root_Stream_Type'Class;
     Item   : out Is_Limited_With_Attrs);
  for Is_Limited_With_Attrs'READ use Read1;

  function Non_Static_Function return Integer;
              -- Used where we need a value to be non-preelaborable.

private
  -- note that Is_Limited does not have 'Read and 'Write attributes
  type Is_Limited is range 5..7;

  type Is_Limited_With_Attrs is range 9..13;

  type Non_Remote_Access_Type_with_Attributes is access Integer;
  -- This access type has specified 'READ and 'WRITE attributes,
  -- so it supports external streaming.

  procedure Write (
     Stream : access Ada.Streams.Root_Stream_Type'Class;
     Item   : in Non_Remote_Access_Type_with_Attributes);
  for Non_Remote_Access_Type_with_Attributes'WRITE use Write;

  procedure Read (
     Stream : access Ada.Streams.Root_Stream_Type'Class;
     Item   : out Non_Remote_Access_Type_with_Attributes);
  for Non_Remote_Access_Type_with_Attributes'READ use Read;

  type Ok_Parameter_Type is
    record
      Component : Non_Remote_Access_Type_with_Attributes;
    end record;

end BXE2009_Types;

-----------------------------------------------------------------

package BXE2009_SP is
  pragma Shared_Passive;
  -- This package should compile without error
  Four : constant := 4;
end BXE2009_SP;

-----------------------------------------------------------------

with BXE2009_Types;  use BXE2009_Types;
with Ada.Streams;

with BXE2009_SP;                                                     -- OK.
                                 -- OK to depend upon a shared passive package
with Ada.Command_Line;                                               -- ERROR:
                                        -- Cannot depend upon a normal package
package BXE2009 is
  pragma Remote_Call_Interface;

  -----
  -- first, some legal declarations
  -----

  Non_Variable : constant Integer := 19;                             -- OK.


  procedure No_Parameters;                                           -- OK.
  pragma Asynchronous(No_Parameters);                                -- OK.

  procedure Simple (X, Y : in Integer);                              -- OK.
  function "+"(X, Y : Integer) return Float;                         -- OK.
  procedure Has_Private_Parameters (P : Ok_Parameter_Type);          -- OK.
  pragma Asynchronous(Has_Private_Parameters);                       -- OK.

  procedure Has_Ok_Limited (P : Is_Limited_With_Attrs);              -- OK.


  -----
  -- now, some illegal declarations
  -----

  type Integer_Pointer is access Integer;                            -- ERROR:
                -- Not an access to subprogram or access to class wide limited
                -- private type.

  Not_Preelaborable : constant Integer := Non_Static_Function;       -- ERROR:
                                                        -- Not preelaborable.

  A_Visible_Variable : Integer;                                      -- ERROR:
                                                -- Variables are not allowed.

  type Limited_Type is limited private;                              -- ERROR:
                                          -- Limited types are not permitted.

  task type Any_Task_Type;                                           -- ERROR:
                                               -- Task types are not allowed.


  protected type Shared_Counter is                                   -- ERROR:
    procedure Increment;                  -- Protected types are not allowed.
  private
    The_Counter : Integer := 2;
  end Shared_Counter;


  generic                                                            -- ERROR:
                              -- Nested generic declarations are not allowed.
    type Element is private;
  procedure Swap (A, B : in out Element);


  procedure Is_Inlined (T : Integer);                                -- ERROR:
               -- Subprograms to which pragma inline applies are not allowed.
  pragma Inline (Is_Inlined);

  procedure Has_Access_Parameters (T : access Integer);              -- ERROR:
                                      -- Access parameters are not permitted.

  procedure Has_Out_Parameters (P : out Integer);                    -- OK.
  pragma Asynchronous(Has_Out_Parameters);                           -- ERROR:
               -- The parameters for a procedure named in pragma Asynchronous
               -- must be of mode in.

  procedure Has_Limited_Parm (P : in out Is_Limited);                -- ERROR:
               -- The parameter type does not support external streaming
               -- (it is limited and the limited type does not have
               -- available 'read and 'write attributes).

private
  type Limited_Type is new Integer;                         -- OPTIONAL ERROR:
            -- The declaration of Limited_Type should have been flagged as not
            -- allowed in a RCI package.  This declaration may or may not be
            -- flagged as well.
end BXE2009;
