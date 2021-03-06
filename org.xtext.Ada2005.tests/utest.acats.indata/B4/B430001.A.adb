-- B430001.A
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
--      Check that an aggregate may not be of a class-wide type.
--
--      Check that "null record" may appear as a record component association
--      list in record aggregates and extension aggregates. Check that if no
--      components are needed in a record component association list,
--      "null record" must appear, and that if components are needed, "null
--      record" must not appear.
--
-- TEST DESCRIPTION:
--      Attempt to use aggregates of a tagged type in contexts where the
--      expected type is class-wide. All such cases should be rejected.
--
--      Check that "null record" is legal as a component association list
--      in record aggregates and extension aggregates. Check that it must
--      appear if a component association list is required and there
--      are no needed components.
--
--
-- CHANGE HISTORY:
--      19 Jul 95   SAIC    Initial prerelease version.
--      10 May 96   SAIC    Modified Y6 case and deleted Y8 case.
--      26 Feb 97   PWB.CTA Deleted checks not meeting the objective
--!

package B430001_0 is

   type Tag_Null is tagged null record;

   type Tag_Type is tagged record
      Int1 : Integer := 0;
      Int2 : Integer := 10;
   end record;

   procedure Op (P : Tag_Type);

   type NewTag_W_Null is new Tag_Type with null record;

   type NewTag_Type is new Tag_Type with record
      Int3 : Integer := 20;
   end record;

   type NNewTag_W_Null is new NewTag_W_Null with record
      Str : String (1 .. 2) := "Hi";
   end record;

   function CW_Func return Tag_Type'Class;

end B430001_0;


     --==================================================================--

package body B430001_0 is

   procedure Op (P : Tag_Type) is
   begin
      null;
   end Op;

   -----------------------------------------
   function CW_Func return Tag_Type'Class is
   begin
      return Tag_Type'(Int1 => 100, Int2 => 100);
   end CW_Func;

end B430001_0;

     --==================================================================--

with Ada.Tags; 
use  Ada.Tags;
with B430001_0;
use  B430001_0;

procedure B430001 is

   A  :  Tag_Type;

   B  :  NNewTag_W_Null;

   BClass :  Tag_Type'Class := B;

   C  :  NewTag_Type;  

   Y1 :  Tag_Null := (null record);                                   -- OK.

   Y2 :  Tag_Type := (null record);                                   -- ERROR:
                                                      -- Components are needed.

   Y3 :  NewTag_W_Null := (Int1 => 0, Int2 => 0);                     -- OK.

   Y4 :  NewTag_W_Null 
      := (Tag_Type with null record);                                 -- OK.

   Y5 :  NewTag_W_Null := (A with null record);                       -- OK.

   Y6 :  NewTag_W_Null := A;                                          -- ERROR:
                                                             -- No null record.
   Y7 :  NewTag_W_Null 
      := (Tag_Type(B) with null record);                              -- OK.

   Y9 :  NewTag_Type                                  
      := (Tag_Type(B) with null record);                              -- ERROR:
                                                      -- Components are needed.
   Y10 :  NewTag_Type                                  
       := (Tag_Type(BClass));                                         -- ERROR:
                                                      -- Components are needed.

   --------------------------------------------------

   X1  : Tag_Type'Class := (5, 25);                                   -- ERROR:
                                  -- Aggregate may not be of a class-wide type.

   X2  : Tag_Type'Class := A;

   Ren : Tag_Type'Class renames Tag_Type'Class(A);

   subtype STag_Type is Tag_Type'Class;

   X3  : STag_Type := (33, 66);                                       -- ERROR:
                                  -- Aggregate may not be of a class-wide type.

   --------------------------------------------------
   procedure Proc (X : in out Tag_Type'Class) is
   begin
      if X'Tag = Tag_Type'Tag then
         X := (Int1 => 14, Int2 => -6);                               -- ERROR:
                                  -- Aggregate may not be of a class-wide type.
      end if;                     
   end Proc;

begin

   X2 := Tag_Type'Class'(Int1 => 10, Int2 => 20);                     -- ERROR:
                                  -- Aggregate may not be of a class-wide type.

   if X2 /= (Int1 => 0, Int2 => 10) then                              -- ERROR:
                                  -- Aggregate may not be of a class-wide type.
      null;                      
   end if;

   Op (STag_Type'(Int1 => 0, Int2 => 0));                             -- ERROR:
                                  -- Aggregate may not be of a class-wide type.

end B430001;
