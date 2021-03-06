-- B740001.A
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
--      Check that a deferred constant may be declared of any type and that,
--      if it is completed by a full constant declaration, its completion must
--      occur immediately within the private part of the same package. Check
--      that the deferred and full constants must have the same type.
--      
-- TEST DESCRIPTION:
--      This test declares deferred constants of various non-private types
--      in the visible part of a package specification, and completes the
--      majority of them with full constant declarations in the private
--      part of the same package. The test verifies that the deferred
--      constants lacking a completion are illegal.
--
--      The test also verifies that it is impossible to declare a deferred
--      constant using an array type definition, since the deferred and
--      full constants cannot have the same type. 
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--
--!

package B740001 is

   type Priv_Comp is private;

   type List_Of_Priv_Comp is array (Positive range <>) of Priv_Comp;

   Null_List_OK : constant List_Of_Priv_Comp;                         -- OK.
   Null_List_NO : constant List_Of_Priv_Comp;                         -- ERROR:
                                              -- No completion in private part.

   type Tagged_Type is tagged record
      C : Priv_Comp;
   end record;

   Tagged_OK : constant Tagged_Type'Class;                            -- OK.
   Tagged_NO : constant Tagged_Type'Class;                            -- ERROR:
                                              -- No completion in private part.

   type Rec is record
      C : Integer;
   end record;

   Rec_OK : constant Rec;                                             -- OK.
   Rec_NO : constant Rec;                                             -- ERROR:
                                              -- No completion in private part.

   Aliased_Rec : aliased constant Rec;                                -- OK.

   Aliased_Rec_2 : aliased constant Rec;                              -- OK.

   Full_Is_Aliased : constant Rec;                                    -- OK.

   subtype Short_Int is Integer range 1 .. 512;
   type Dis_Rec (Disc : Short_Int := 100) is
     record
        C : String (1 .. Disc);
     end record;

   Constr_Rec : constant Dis_Rec;                                     -- OK.

   type Unconstr_Arr is array (Positive range <>) of Short_Int;

   Constr_Arr : constant Unconstr_Arr (5 .. 8);                       -- OK.

   type Access_To_Constant is access constant Priv_Comp;

   AToC : constant Access_To_Constant;                                -- OK.


   ID : constant String (1 .. 12);                                    -- OK.

   RC : constant array (1 .. 2) of Integer := (0, 1);                 -- OK.
   DC : constant array (1 .. 2) of Integer;                  -- OPTIONAL ERROR:
                                        -- Full declaration has different type.


private

   type Priv_Comp is (Anything);      -- Enumeration type.

   Null_List_OK : constant List_Of_Priv_Comp := (1 .. 0 => Anything);


   Tagged_OK : constant Tagged_Type'Class := Tagged_Type'(C => Anything);

   Rec_OK : constant Rec := (C => 12);

   Aliased_Rec : aliased constant Rec := (C => 99);

   Aliased_Rec_2 : constant Rec := (C => 32);                         -- ERROR:
                                           -- Full declaration must be aliased.

   Full_Is_Aliased : aliased constant Rec := (C => 23);

   Constr_Rec : constant Dis_Rec := (Disc => 19, 
                                     C    => "Constraints Allowed");

   Constr_Arr : constant Unconstr_Arr (5 .. 8) := (others => 17);

   Private_Variable : Priv_Comp;

   AToC : constant Access_To_Constant := new Priv_Comp'(Private_Variable);


   ID : constant String (1 .. 12) := "YourNameHere";

   DC : constant array (1 .. 2) of Integer := (0, 1);                 -- ERROR:
                                        -- Full declaration has different type.

end B740001;
