-- BC70002.A
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
--      Check that the actual corresponding to a generic formal package
--      must be an instance of the template for the formal package. Check
--      for the case where the formal package is declared in a library-
--      level generic subprogram.
--
-- TEST DESCRIPTION:
--      The template for a formal package is the generic_package_name
--      in a formal_package_declaration:
--
--      formal_package_declaration ::=
--       with package ID is new generic_package_name formal_package_actual_part
--                              ^^^^^^^^^^^^^^^^^^^^
--                                   template
--
--      Declare a library-level generic subprogram which declares a formal
--      package with (<>) as its actual part. Declare various instances
--      of the template for the formal package and verify that they may
--      be passed as actuals in instantiations of the library-level
--      generic subprogram. Attempt to pass other entities as actuals in
--      instantiations of the library-level subprogram:
--
--         - The template for the formal package.
--         - An instance of a generic package which is identical to the
--           template.
--         - A generic subprogram.
--         - A non-generic package similar to an instance of the template.
--
--      Each of these latter entities are illegal.
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--
--!

generic                                                -- Generic package which
   type Element_Type is private;                       -- serves as template
package BC70002_0 is                                   -- for formal package.
   Object : Element_Type;
end BC70002_0;


     --==================================================================--


with BC70002_0;
generic                                                -- Generic procedure
   with package Formal_Package is new BC70002_0 (<>);  -- which declares a
procedure BC70002_1;                                   -- formal package.


     --==================================================================--


procedure BC70002_1 is
   An_Element : Formal_Package.Element_Type;
begin
   null;
end BC70002_1;


     --==================================================================--


generic                                                -- Generic subprogram.
   type Element_Type is private;
procedure BC70002_2;


     --==================================================================--


procedure BC70002_2 is
   Object : Element_Type;
begin
   null;
end BC70002_2;


     --==================================================================--


generic                                                -- Generic package
   type Element_Type is private;                       -- which is identical
package BC70002_3 is                                   -- to the template
   Object : Element_Type;                              -- package.
end BC70002_3;


     --==================================================================--


package BC70002_4 is                                   -- Non-generic package
   type Element_Type is record                         -- similar in structure
      Component : String (1 .. 6);                     -- to an instantiation
   end record;                                         -- of the template
                                                       -- package for a record
   Object : Element_Type;                              -- type.
end BC70002_4;


     --==================================================================--


with BC70002_0;  -- Template for formal package.
with BC70002_1;  -- Generic subprogram which declares formal package.
with BC70002_2;  -- Generic package.
with BC70002_3;  -- Generic package identical to template.
with BC70002_4;  -- Non-generic package.

procedure BC70002 is

   type Enum_Type    is (One, Two, Three);
   type Integer_Type is range -10 .. 10;
   type Float_Type   is digits 1;
   type Fixed_Type   is delta 0.125 range 0.0 .. 255.0;
   type Array_Type   is array (Integer_Type range 0 .. 7) of Natural;

   type Record_Type is record
      Component : String (1 .. 6);
   end record;


   procedure Gen_But_Not_Pack  is new BC70002_2 (Enum_Type);
   package   Inst_Of_Identical is new BC70002_3 (Record_Type);

   package Enum_List is new BC70002_0 (Enum_Type);
   package Char_List is new BC70002_0 (Character);
   package Bool_List is new BC70002_0 (Boolean);
   package Int_List  is new BC70002_0 (Integer_Type);
   package Flt_List  is new BC70002_0 (Float_Type);
   package Fix_List  is new BC70002_0 (Fixed_Type);
   package Arr_List  is new BC70002_0 (Array_Type);
   package Rec_List  is new BC70002_0 (Record_Type);


-- Begin legal instantiations: ---------------------------

   procedure Enum_Check is new BC70002_1 (Enum_List);                 -- OK.
   procedure Char_Check is new BC70002_1 (Char_List);                 -- OK.
   procedure Bool_Check is new BC70002_1 (Bool_List);                 -- OK.
   procedure Int_Check  is new BC70002_1 (Int_List);                  -- OK.
   procedure Flt_Check  is new BC70002_1 (Flt_List);                  -- OK.
   procedure Fix_Check  is new BC70002_1 (Fix_List);                  -- OK.
   procedure Arr_Check  is new BC70002_1 (Arr_List);                  -- OK.
   procedure Rec_Check  is new BC70002_1 (Rec_List);                  -- OK.

-- End legal instantiations. -----------------------------

-- Begin illegal instantiations: -------------------------

   procedure Template      is new BC70002_1 (BC70002_0);              -- ERROR:
                                      -- Actual is not an instance of template.

   procedure Wrong_Package is new BC70002_1 (Inst_Of_Identical);      -- ERROR:
                                      -- Actual is not an instance of template.

   procedure Not_Package   is new BC70002_1 (Gen_But_Not_Pack);       -- ERROR:
                                      -- Actual is not an instance of template.

   procedure Not_Generic   is new BC70002_1 (BC70002_4);              -- ERROR:
                                      -- Actual is not an instance of template.

-- End illegal instantiations. ---------------------------

begin
   null;
end BC70002;
