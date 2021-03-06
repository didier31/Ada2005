--% 06/03/96  [OCS   2.2.1 ]   All errors generated.
--% 06/03/96  [Inmet 1.756+]   All errors generated with 4 extra.
--% 06/03/96  [Gnat  3.04w ]   All errors generated.
--%
-- B460004.A
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
--      Check that if the target type of a type conversion is tagged, the
--      operand type must be covered by or descended from the target type,
--      or the operand type must be a class-wide type that covers the
--      target type.
--
--      Check that if the target designated type of a general access type
--      conversion is tagged, the operand designated type must be convertible 
--      to the target designated type.
--
-- TEST DESCRIPTION:
--      This test declares tagged types and general access types in a package.
--      The test verifies that type conversions are illegal when the operand
--      types are not covered or descended from the target types.
--
--6 4.6(21-23);6.0
--6 4.6(15);6.0
--
-- CHANGE HISTORY:
--      03 Aug 95   SAIC    Initial prerelease version.
--      03 May 96   Dianne  Modified error cases.
--
--@ INTERNAL CHANGE HISTORY
--@     31 Jul 95   Jim     Initial design.
--@     03 Aug 95   Dianne  Initial version.
--@     03 May 96   Dianne  Added comments to ok cases and modified error cases
--@                         to ok; Added compiler results.
--!

package B460004_0 is

   type Tag_Type is tagged record
      C1 : Natural := 5;
   end record;

   type DTag_Type is new Tag_Type with record
      C2 : String (1 .. 5) := "Hello";
   end record;

   type DDTag_Type is new DTag_Type with record
      C3 : Integer := 24;
   end record;

   type Acc_Tag is access all Tag_Type;
   type Acc_DTag is access all DTag_Type;
   type Acc_DDTag is access all DDTag_Type;

end B460004_0;

     --==================================================================--

with B460004_0;

procedure B460004 is

   Tag_Type_Operand   : B460004_0.Tag_Type;
   DTag_Type_Operand  : B460004_0.DTag_Type;
   DDTag_Type_Operand : B460004_0.DDTag_Type;

   Tag_Type_Target    : B460004_0.Tag_Type;
   DTag_Type_Target   : B460004_0.DTag_Type;
   DDTag_Type_Target  : B460004_0.DDTag_Type;

   Acc_Tag_Operand   : B460004_0.Acc_Tag;
   Acc_DTag_Operand  : B460004_0.Acc_DTag;
   Acc_DDTag_Operand : B460004_0.Acc_DDTag;

   Acc_Tag_Target    : B460004_0.Acc_Tag;   
   Acc_DTag_Target   : B460004_0.Acc_DTag;
   Acc_DDTag_Target  : B460004_0.Acc_DDTag;

   --------------------------------------------------------------------------

   function CW_Tag_Func (P : B460004_0.Tag_Type'Class) 
     return B460004_0.Tag_Type'Class is
      Operand : B460004_0.Tag_Type'Class := P;
   begin
      return Operand;
   end CW_Tag_Func;

   --------------------------------------------------------------------------

   function CW_DTag_Func (P : B460004_0.DTag_Type'Class) 
     return B460004_0.DTag_Type'Class is
      Operand : B460004_0.DTag_Type'Class := P;
   begin
      return Operand;
   end CW_DTag_Func;

   --------------------------------------------------------------------------

   function CW_DDTag_Func (P : B460004_0.DDTag_Type'Class) 
     return B460004_0.DDTag_Type'Class is
      Operand : B460004_0.DDTag_Type'Class := P;
   begin
      return Operand;
   end CW_DDTag_Func;

   --------------------------------------------------------------------------

   CW_Tag_Type_Operand   : B460004_0.Tag_Type'Class
                         := CW_Tag_Func (Tag_Type_Target);
   CW_DTag_Type_Operand  : B460004_0.DTag_Type'Class
                         := CW_DTag_Func (DTag_Type_Target);
   CW_DDTag_Type_Operand : B460004_0.DDTag_Type'Class
                         := CW_DDTag_Func (DDTag_Type_Target);

begin

   Tag_Type_Target   := B460004_0.Tag_Type (DTag_Type_Operand);       -- OK.
                            -- Operand type is a descendant of the target type.

   Tag_Type_Target   := B460004_0.Tag_Type (DDTag_Type_Operand);      -- OK.
                            -- Operand type is a descendant of the target type.

   DTag_Type_Target  := B460004_0.DTag_Type (DDTag_Type_Operand);     -- OK.
                            -- Operand type is a descendant of the target type.

   DTag_Type_Target  := B460004_0.DTag_Type (Tag_Type_Operand);       -- ERROR:
                             -- Operand type is not descended from target type.
 
   DDTag_Type_Target := B460004_0.DDTag_Type (Tag_Type_Operand);      -- ERROR:
                             -- Operand type is not descended from target type.

   DDTag_Type_Target := B460004_0.DDTag_Type (DTag_Type_Operand);     -- ERROR:
                             -- Operand type is not descended from target type.

   --------------------------------------------------------------------------

   Tag_Type_Target   := B460004_0.Tag_Type
                     (B460004_0.DTag_Type'Class(DDTag_Type_Operand)); -- OK.
                        -- Operand type is class-wide covering the target type.

   DTag_Type_Target  := B460004_0.DTag_Type 
                     (B460004_0.Tag_Type'Class(Tag_Type_Operand));    -- OK.
                        -- Operand type is class-wide covering the target type.

   DTag_Type_Target  := B460004_0.DTag_Type 
                     (B460004_0.DTag_Type'Class(DDTag_Type_Operand)); -- OK.
                        -- Operand type is class-wide covering the target type.

   DDTag_Type_Target := B460004_0.DDTag_Type 
                     (B460004_0.Tag_Type'Class(Tag_Type_Operand));    -- OK.
                        -- Operand type is class-wide covering the target type.

   DDTag_Type_Target := B460004_0.DDTag_Type 
                     (B460004_0.Tag_Type'Class(DTag_Type_Operand));   -- OK.
                        -- Operand type is class-wide covering the target type.

   --------------------------------------------------------------------------

   DTag_Type_Target  := B460004_0.DTag_Type (CW_Tag_Type_Operand);    -- OK.
                            -- Operand type is a descendant of the target type.

   DDTag_Type_Target := B460004_0.DDTag_Type (CW_Tag_Type_Operand);   -- OK.

   DDTag_Type_Target := B460004_0.DDTag_Type (CW_DTag_Type_Operand);  -- OK.

   Tag_Type_Target   := B460004_0.Tag_Type (CW_DTag_Type_Operand);    -- OK.
                            -- Operand type is a descendant of the target type.

   Tag_Type_Target   := B460004_0.Tag_Type (CW_DDTag_Type_Operand);   -- OK.
                            -- Operand type is a descendant of the target type.

   DTag_Type_Target  := B460004_0.DTag_Type (CW_DDTag_Type_Operand);  -- OK.
                            -- Operand type is a descendant of the target type.

   --------------------------------------------------------------------------

   Acc_Tag_Target   := B460004_0.Acc_Tag (Acc_DTag_Operand);          -- OK.
                            -- Operand type is a descendant of the target type.

   Acc_Tag_Target   := B460004_0.Acc_Tag (Acc_DDTag_Operand);         -- OK.
                            -- Operand type is a descendant of the target type.

   Acc_DTag_Target  := B460004_0.Acc_DTag (Acc_DDTag_Operand);        -- OK.
                            -- Operand type is a descendant of the target type.

   Acc_DTag_Target  := B460004_0.Acc_DTag (Acc_Tag_Operand);          -- ERROR:
                           -- Operand type is not convertible from target type.
 
   Acc_DDTag_Target := B460004_0.Acc_DDTag (Acc_Tag_Operand);         -- ERROR:
                           -- Operand type is not convertible from target type.

   Acc_DDTag_Target := B460004_0.Acc_DDTag (Acc_DTag_Operand);        -- ERROR:
                           -- Operand type is not convertible from target type.

end B460004;
