-- B610001.A
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
--     Check that access parameters may have default expressions.
--     Check that the expected type of the actual access parameter is
--     the nominal subtype of the formal anonymous access parameter.
--
-- TEST DESCRIPTION:
--     This test declares a record type, tagged types, type extensions, and
--     subprogram.  Check the following formal and actual access types:
--
--     Formal type                           Actual type                
--     ----------------------------------------------------------------------
--     Specific type T                       Correct specific type
--            "                              Wrong specific type
--            "                              Class-wide type T'Class
--            "                              Class-wide type descendent'Class
--            "                              Class-wide type ancestor'Class
--     Class-wide type T'Class               Specific type in T'Class
--            "                              Specific type in descendent'Class
--            "                              Specific type in ancestor'Class
--            "                              Class-wide type T'Class
--            "                              Class-wide type descendent'Class
--            "                              Class-wide type ancestor'Class
--            "                              Specific type not in T'Class
--            "                              Specific type unrelated'Class
--
--
-- CHANGE HISTORY:
--      07 AUG 95   SAIC   Initial version
--      17 APR 96   SAIC   Incorporated Reviewer comments for 2.1
--      26 FEB 97   PWB.CTA Flagged errors where "cover" is wrong order
--	01 JUN 98   EDS    Remove ambiguous, by ARM 3.10.2(2) and 8.6(27),
--                         procedure calls.
--!

package B610001_0 is

   type Rec is record
      C : Integer;
   end record;

   procedure Acc_Rec_Proc (P : access Rec); 

   function Acc_W_Default (P : access Rec := new Rec'(C => 25))      -- OK.
     return Integer;

   procedure Acc_Float_Proc (P : access Float); 

   --------------------------------------------------------------------------
   type Tag is tagged record
      C1 : Integer;
   end record;

   procedure Acc_CW_Tag_Proc (P : access Tag'Class); 

   --------------------------------------------------------------------------
   type TagType is tagged record
      C1 : Integer;
   end record;

   type NewTag is new Tag with record
      C2 : Boolean;
   end record;

   procedure Acc_NTag_Proc (P : access NewTag); 

   procedure Acc_CW_NTag_Proc (P : access NewTag'Class); 

   --------------------------------------------------------------------------
   type NNewTag is new NewTag with record
      C3 : String (1..5);
   end record;


end B610001_0;

     --==================================================================--

package body B610001_0 is

   procedure Acc_Float_Proc (P : access Float) is 
   begin
      null;
   end Acc_Float_Proc;

   --------------------------------------------------------------------------
   procedure Acc_Rec_Proc (P : access Rec) is 
   begin
      null;
   end Acc_Rec_Proc;

   --------------------------------------------------------------------------
   procedure Acc_NTag_Proc (P : access NewTag) is
   begin
      null;
   end Acc_NTag_Proc;

   --------------------------------------------------------------------------
   procedure Acc_CW_Tag_Proc (P : access Tag'Class) is
   begin
      null;
   end Acc_CW_Tag_Proc;

   --------------------------------------------------------------------------
   procedure Acc_CW_NTag_Proc (P : access NewTag'Class) is
   begin
      null;
   end Acc_CW_NTag_Proc;

   --------------------------------------------------------------------------
   function Acc_W_Default (P : access Rec := new Rec'(C => 25))      -- OK.
     return Integer is
   begin
      return 12;
   end Acc_W_Default;

end B610001_0;

     --==================================================================--

with B610001_0;
procedure B610001 is

   Int_Obj     : aliased Integer;

   Rec_Obj     : aliased B610001_0.Rec;
             
   Tag_Obj     : aliased B610001_0.Tag;

   TagType_Obj : aliased B610001_0.TagType;

   NTag_Obj    : aliased B610001_0.NewTag;

   NNTag_Obj   : aliased B610001_0.NNewTag;

   --------------------------------------------------------------------------
   function CW_Tag_Func (P : B610001_0.Tag'Class) 
     return B610001_0.Tag'Class is
      Operand : B610001_0.Tag'Class := P;
   begin
      return Operand;
   end CW_Tag_Func;

   --------------------------------------------------------------------------
   function CW_NTag_Func (P : B610001_0.NewTag'Class) 
     return B610001_0.NewTag'Class is
      Operand : B610001_0.NewTag'Class := P;
   begin
      return Operand;
   end CW_NTag_Func;

   --------------------------------------------------------------------------
   function CW_NNTag_Func (P : B610001_0.NNewTag'Class) 
     return B610001_0.NNewTag'Class is
      Operand : B610001_0.NNewTag'Class := P;
   begin
      return Operand;
   end CW_NNTag_Func;

   --------------------------------------------------------------------------
   function CW_TagType_Func (P : B610001_0.TagType'Class) 
     return B610001_0.TagType'Class is
      Operand : B610001_0.TagType'Class := P;
   begin
      return Operand;
   end CW_TagType_Func;

   --------------------------------------------------------------------------
   CW_Tag_Obj     : aliased B610001_0.Tag'Class     
                  := CW_Tag_Func (Tag_Obj);

   CW_NTag_Obj    : aliased B610001_0.NewTag'Class  
                  := CW_NTag_Func (NTag_Obj);

   CW_NNTag_Obj   : aliased B610001_0.NNewTag'Class 
                  := CW_NNTag_Func (NNTag_Obj);

   CW_TagType_Obj : aliased B610001_0.TagType'Class     
                  := CW_TagType_Func (TagType_Obj);
   --------------------------------------------------------------------------
   procedure Proc (P : access B610001_0.Rec) is                             
   begin
      P := new B610001_0.Rec'(C => 18);                              -- ERROR:
                                            -- Mode of access parameter is in.
   end Proc;

begin

   B610001_0.Acc_Rec_Proc (Rec_Obj'Access);                          -- OK.

   B610001_0.Acc_Rec_Proc (Rec_Obj'Unchecked_Access);                -- OK.

   B610001_0.Acc_Float_Proc (Int_Obj'Access);                        -- ERROR:
                                  -- Access parameter is not of expected type.

   B610001_0.Acc_Float_Proc (Int_Obj'Unchecked_Access);              -- ERROR:
                                  -- Access parameter is not of expected type.

   B610001_0.Acc_NTag_Proc (CW_Tag_Obj'Access);                      -- ERROR:
                                  -- Access parameter is not of expected type,
                    -- Tag'Class is not covered by nor descended from New_Tag.

   B610001_0.Acc_NTag_Proc (CW_Tag_Obj'Unchecked_Access);            -- ERROR:
                                  -- Access parameter is not of expected type,
                    -- Tag'Class is not covered by nor descended from New_Tag.

   --------------------------------------------------------------------------
   B610001_0.Acc_CW_NTag_Proc (NTag_Obj'Access);                     -- OK.

   B610001_0.Acc_CW_NTag_Proc (NTag_Obj'Unchecked_Access);           -- OK.

   B610001_0.Acc_CW_NTag_Proc (NNTag_Obj'Access);                    -- OK.

   B610001_0.Acc_CW_NTag_Proc (NNTag_Obj'Unchecked_Access);          -- OK.

   B610001_0.Acc_CW_NTag_Proc (Tag_Obj'Access);                      -- ERROR:
                                  -- Access parameter is not of expected type,
                                  -- Tag is not covered by New_Tag'Class.

   B610001_0.Acc_CW_NTag_Proc (Tag_Obj'Unchecked_Access);            -- ERROR:
                                  -- Access parameter is not of expected type,
                                  -- Tag is not covered by New_Tag'Class.

   --------------------------------------------------------------------------
   B610001_0.Acc_CW_NTag_Proc (CW_NTag_Obj'Access);                  -- OK.

   B610001_0.Acc_CW_NTag_Proc (CW_NTag_Obj'Unchecked_Access);        -- OK.

   B610001_0.Acc_CW_NTag_Proc (CW_NNTag_Obj'Access);                 -- OK.

   B610001_0.Acc_CW_NTag_Proc (CW_NNTag_Obj'Unchecked_Access);       -- OK.

   B610001_0.Acc_CW_NTag_Proc (CW_Tag_Obj'Access);                   -- ERROR:

   B610001_0.Acc_CW_NTag_Proc (CW_Tag_Obj'Unchecked_Access);         -- ERROR:
                                         -- Tag'Class covers New_Tag'Class.

   --------------------------------------------------------------------------
   B610001_0.Acc_CW_Tag_Proc (TagType_Obj'Access);                   -- ERROR:
                                 -- Access parameter is not of expected type,
                                 -- TagType is not covered by Tag'Class.

   B610001_0.Acc_CW_Tag_Proc (TagType_Obj'Unchecked_Access);         -- ERROR:
                                 -- Access parameter is not of expected type,
                                 -- TagType is not covered by Tag'Class.

   B610001_0.Acc_CW_Tag_Proc (CW_TagType_Obj'Access);                -- ERROR:
                                 -- Access parameter is not of expected type,
                                 -- TagType'Class is not covered by Tag'Class.

   B610001_0.Acc_CW_Tag_Proc (CW_TagType_Obj'Unchecked_Access);      -- ERROR:
                                 -- Access parameter is not of expected type,
                                 -- TagType'Class is not covered by Tag'Class.

end B610001;
