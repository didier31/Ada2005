-- BXE2012.A
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
--      Check that a remote access-to-class-wide type must designate
--      a limited private type.
--      Check that the primitive subprograms of the limited private type
--      designated by a remote access-to-class-wide type can have
--      access parameters only if they are controlling parameters.
--      Check that non-controlling parameters of the primitive subprograms
--      of a limited private type designated by a remote access-to-class-
--      wide type are required to have user-defined Read and Write attributes.
--      Check that a value of a remote access-to-class-wide type can be
--      implicitly converted only as part of a dispatching call where the
--      value designates a controlling operand of the call.
--
-- TEST DESCRIPTION:
--      This test consists of the following compilation units:
--        BXE2012_Pure - definitions used by other units
--        BXE2012_RT1  - remote types unit
--        BXE2012_SP2  - shared passive unit used by BXE2012_RT2
--        BXE2012_RT2  - remote types unit
--        BXE2012_RT3  - remote types unit
--        BXE2012_RT4  - procedure
--      BXE2012_Pure, BXE2012_SP2, and BXE2012_RT3 should compile successfully.
--      The remaining units should fail to compile due to errors as
--      marked in the source.
--      Note that AI-47 is relevant to this test.
--
-- APPLICABILITY CRITERIA:
--      This test applies only to implementations
--          supporting the Distribution Annex.
--
--
-- CHANGE HISTORY:
--      12 JUN 95   SAIC    Initial version
--      27 FEB 97   PWB.CTA Corrected wording of objective and changed
--                          two related "ERROR:" comments to "OK".
--      01 Jun 98   EDS     Changed Tagged_Type_1 to Tagged_Type_2 in line 178.
--      05 Jul 12   RLB     Made stream attributes of Good_Private_Type visible
--                          in order that the type supports external streaming.
--!

package BXE2012_Pure is
  -- This package should compile without error
  pragma Pure;

  -- ok for remote access type
  type Root_Tagged_Type_1 is tagged limited private;
  procedure Primitive_1 (X : access Root_Tagged_Type_1);

  -- not ok for remote access type
  type Root_Tagged_Type_2 is tagged limited private;
  procedure Primitive_2 (X : in Root_Tagged_Type_2);

private
  type Root_Tagged_Type_1 is tagged limited
    record
      XX : Integer;
    end record;

  type Root_Tagged_Type_2 is tagged limited
    record
      YY : Integer;
    end record;
end BXE2012_Pure;


package body BXE2012_Pure is
  procedure Primitive_1 (X : access Root_Tagged_Type_1) is
  begin null; end Primitive_1;

  procedure Primitive_2 (X : in Root_Tagged_Type_2) is
  begin null; end Primitive_2;
end BXE2012_Pure;

---------------------------------------------------------------------------

with BXE2012_Pure;
package BXE2012_RT1 is
  pragma Remote_Types;

  -- tagged types
  type Tagged_Type_1 is tagged limited private;
  procedure Primitive_1A (TT : access Tagged_Type_1);
  procedure Primitive_1B (TT : in out Tagged_Type_1);

  -- remote access to class wide type
  type Class_Wide_Ptr_1 is access all Tagged_Type_1'Class;           -- OK.

  type Tagged_Type_2 is tagged record
       ZZ : Integer;
    end record;
  procedure Primitive_2A (TT : access Tagged_Type_2);
  type Class_Wide_Ptr_2 is access all Tagged_Type_2'Class;        -- ERROR:
                                  -- the tagged type is not limited private


  type Class_Wide_Ptr_3 is
     access all BXE2012_Pure.Root_Tagged_Type_1'Class;               -- OK.

  type Class_Wide_Ptr_4 is
     access all BXE2012_Pure.Root_Tagged_Type_2'Class;               -- OK.
            -- not all the primitive operations have only access parameters

private
  type Tagged_Type_1 is tagged limited
    record
       B_Field : Boolean;
    end record;

end BXE2012_RT1;


---------------------------------------------------------------------------

with Ada.Streams;
package BXE2012_SP2 is
-- This package should compile without error
  pragma Shared_Passive;
  type Good_Private_Type is limited private;

  procedure Write (
     Stream : access Ada.Streams.Root_Stream_Type'Class;
     Item   : in Good_Private_Type);
  for Good_Private_Type'WRITE use Write;

  procedure Read (
     Stream : access Ada.Streams.Root_Stream_Type'Class;
     Item   : out Good_Private_Type);
  for Good_Private_Type'READ use Read;

  type Bad_Private_Type is limited private;
        -- This type does not have
        -- specified READ and WRITE attributes.

private
  type Good_Private_Type is tagged limited
    record
      F : Integer;
    end record;

  type Bad_Private_Type is tagged limited
    record
      F : Integer;
    end record;

end BXE2012_SP2;


with BXE2012_SP2;   use BXE2012_SP2;
package BXE2012_RT2 is
  pragma Remote_Types;

  type Tagged_Type_1 is tagged limited private;
  procedure Primitive_Op_1 (Controlling_Parm : access Tagged_Type_1;
                            Non_Controlling  : Good_Private_Type);

  type Remote_Class_Wide_Ptr_1 is access all Tagged_Type_1'Class;    -- OK.

  type Tagged_Type_2 is tagged limited private;
  procedure Primitive_Op_2 (Controlling_Parm : access Tagged_Type_2;
                            Non_Controlling  : Bad_Private_Type);

  type Remote_Class_Wide_Ptr_2 is access all Tagged_Type_2'Class; -- ERROR:
          -- Non-controlling parameters of limited private types designated
          -- by a remote access-to-class-wide type are required to
          -- have Read and Write attributes.

private
  type Tagged_Type_1 is tagged limited
    record
      F : Integer;
    end record;

  type Tagged_Type_2 is tagged limited
    record
      F : Integer;
    end record;
end BXE2012_RT2;

---------------------------------------------------------------------------

package BXE2012_RT3 is
  -- This package spec should compile without error
  pragma Remote_Types;

  type Tagged_Type_1 is tagged limited private;
  procedure Primitive_Op_1 (Controlling_Parm : access Tagged_Type_1);

  type Remote_Class_Wide_Ptr_1 is access all Tagged_Type_1'Class;

  function Some_Remote_Ptr return Remote_Class_Wide_Ptr_1;
private
  type Tagged_Type_1 is tagged limited
    record
      F : Integer;
    end record;
end BXE2012_RT3;


with BXE2012_RT3;
procedure BXE2012_RT4 is
  Tagged_Obj : aliased BXE2012_RT3.Tagged_Type_1;
  Remote_Ptr : BXE2012_RT3.Remote_Class_Wide_Ptr_1 :=
           BXE2012_RT3.Some_Remote_Ptr;
  type Local_Access is access all BXE2012_RT3.Tagged_Type_1;
  Local_Ptr : Local_Access := Tagged_Obj'Access;

  procedure Non_Dispatching (T : access BXE2012_RT3.Tagged_Type_1)
     is begin null; end Non_Dispatching;
  procedure Class_Wide (T : BXE2012_RT3.Tagged_Type_1'Class)
     is begin null; end Class_Wide;
begin

  Non_Dispatching (Remote_Ptr);                                  -- ERROR:
                   -- A value of a remote access-to-class-wide type can be
                   -- dereferenced only as part of a dispatching call
                   -- where the value designates a controlling operand of
                   -- the call.
  Class_Wide (Remote_Ptr.all);                                   -- ERROR:
                   -- A value of a remote access-to-class-wide type can be
                   -- dereferenced only as part of a dispatching call
                   -- where the value designates a controlling operand of
                   -- the call.

  BXE2012_RT3.Primitive_Op_1(Remote_Ptr);                           -- OK.

  Non_Dispatching (Local_Ptr);                                      -- OK.
  Class_Wide (Local_Ptr.all);                                       -- OK.

  Non_Dispatching (Tagged_Obj'access);                              -- OK.
  Class_Wide (Tagged_Obj);                                          -- OK.
end BXE2012_RT4;
