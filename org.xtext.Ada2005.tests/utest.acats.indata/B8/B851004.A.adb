-- B851004.A
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
-- OBJECTIVE:
--     For an object renaming with a null_exclusion or an access_definition
--     with a null_exclusion, check that the renaming is illegal if the
--     subtype of the renamed object does not exclude null.
--
--     For an object renaming with a null_exclusion or an access_definition
--     with a null_exclusion that renames a formal object in a generic package
--     specification, check that an instance is illegal if the subtype of the
--     actual object does not exclude null.
--
--     For an object renaming with a null_exclusion or an access_definition
--     with a null_exclusion that renames a formal object in a generic package
--     body, check that the renaming is illegal if the formal object does
--     not include a null_exclusion.
--
-- CHANGE HISTORY:
--     21 Jul 2008 RLB Created test.
--
procedure B851004 is

   type Int_Ptr is access all Integer;
   subtype NN_Int_Ptr is not null Int_Ptr;
   subtype NN2_Int_Ptr is NN_Int_Ptr;

   Obj1 : Int_Ptr;
   Obj2 : NN_Int_Ptr;
   Obj3 : NN2_Int_Ptr;
   Obj4 : access Integer;
   Obj5 : not null access Integer;

   type Func_Ptr is access function (X : Float) return Float;
   subtype NN_Func_Ptr is not null Func_Ptr;
   subtype NN2_Func_Ptr is NN_Func_Ptr;

   ObjA : Func_Ptr;
   ObjB : NN_Func_Ptr;
   ObjC : NN2_Func_Ptr;
   ObjD : access function (X : Float) return Float;
   ObjE : not null access function (X : Float) return Float;

begin

   declare
      Ren11 : not null Int_Ptr renames Obj1;                   -- ERROR:
      Ren21 : not null Int_Ptr renames Obj2;                   -- OK.
      Ren31 : not null Int_Ptr renames Obj3;                   -- OK.
      Ren41 : not null access Integer renames Obj4;            -- ERROR:
      Ren51 : not null access Integer renames Obj5;            -- OK.

      package Pack is
         type A_Tagged is tagged null record;

          procedure Prim (A : access A_Tagged; B : access Integer);
      end Pack;

      package body Pack is
         procedure Prim (A : access A_Tagged; B : access Integer) is
            RenPA : not null access A_Tagged renames A;        -- OK.
               -- (A is a controlling parameter, see 3.10(13.1/2).
            RenPB : not null access Integer renames B;         -- ERROR:
         begin
            null;
         end Prim;
      end Pack;

      RenA1 : not null Func_Ptr renames ObjA;                  -- ERROR:
      RenB1 : not null Func_Ptr renames ObjB;                  -- OK.
      RenC1 : not null Func_Ptr renames ObjC;                  -- OK.
      RenD1 : not null access function (X : Float) return Float
                   renames ObjD;                               -- ERROR:
      RenE1 : not null access function (X : Float) return Float
                   renames ObjE;                               -- OK.

      -- Second objective:

      generic
         Obj1 : NN_Int_Ptr;
      package Gen1 is
         Ren1 : not null Int_Ptr renames Obj1;                 -- OK.
      private
         Ren1P : Int_Ptr renames Obj1;                         -- OK.
      end Gen1;

      package Pack11 is new Gen1(Obj2);                        -- OK.
      package Pack12 is new Gen1(Obj1);                        -- ERROR: (Ren1)

      generic
         Obj2 : NN2_Int_Ptr;
      package Gen2 is
         Ren2OK : Int_Ptr renames Obj2;                        -- OK.
      private
         Ren2 : not null Int_Ptr renames Obj2;                 -- OK.
      end Gen2;

      package Pack21 is new Gen2(Obj2);                        -- OK.
      package Pack22 is new Gen2(Obj1);                        -- ERROR: (Ren2)


      generic
         Obj3 : NN_Func_Ptr;
      package Gen3 is
         Ren3 : not null Func_Ptr renames Obj3;                -- OK.
      private
         Ren3P : Func_Ptr renames Obj3;                        -- OK.
      end Gen3;

      package Pack31 is new Gen3(ObjB);                        -- OK.
      package Pack32 is new Gen3(ObjA);                        -- ERROR: (Ren3)

      generic
         Obj4 : NN2_Func_Ptr;
      package Gen4 is
         Ren4OK : Func_Ptr renames Obj4;                       -- OK.
      private
         Ren4 : not null Func_Ptr renames Obj4;                -- OK.
      end Gen4;

      package Pack41 is new Gen4(ObjB);                        -- OK.
      package Pack42 is new Gen4(ObjA);                        -- ERROR: (Ren4)


      -- Third objective:

      generic
         Obj1 : NN_Int_Ptr;
         Obj2 : not null Int_Ptr;
         Obj3 : not null access Integer;
         Obj4 : access Integer;
      package GenA is
         procedure Dummy;
      end GenA;

      package body GenA is

         RenG11 : not null Int_Ptr renames Obj1;               -- ERROR:
         RenG12 : Int_Ptr renames Obj1;                        -- OK.
         RenG21 : not null Int_Ptr renames Obj2;               -- OK.
         RenG31 : not null access Integer renames Obj3;        -- OK.
         RenG32 : access Integer renames Obj3;                 -- OK.
         RenG41 : not null access Integer renames Obj4;        -- ERROR:
         RenG42 : access Integer renames Obj4;                 -- OK.

         procedure Dummy is
         begin
            null;
         end Dummy;

      end GenA;

      generic
         Obj1 : NN_Func_Ptr;
         Obj2 : not null Func_Ptr;
         Obj3 : not null access function (X : Float) return Float;
         Obj4 : access function (X : Float) return Float;
      package GenB is
         procedure Dummy;
      end GenB;

      package body GenB is

         RenG11 : not null Func_Ptr renames Obj1;              -- ERROR:
         RenG12 : Func_Ptr renames Obj1;                       -- OK.
         RenG21 : not null Func_Ptr renames Obj2;              -- OK.
         RenG31 : not null access function (X : Float)
                      return Float renames Obj3;               -- OK.
         RenG32 : access function (X : Float) return Float
                      renames Obj3;                            -- OK.
         RenG41 : not null access function (X : Float)
                      return Float renames Obj4;               -- ERROR:
         RenG42 : access function (X : Float)
                      return Float renames Obj4;               -- OK.

         procedure Dummy is
         begin
            null;
         end Dummy;

      end GenB;


   begin
      null;
   end;
end B851004;
