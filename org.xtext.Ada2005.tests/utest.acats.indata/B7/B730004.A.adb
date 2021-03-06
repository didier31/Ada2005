-- B730004.A
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
--      Check that if a public child is "with"ed by a client, the client 
--      does not have visibility into the private part of the child's parent.
--
--      Check that the full view of a private type defined in a parent and
--      extended in a child is not visible outside the child.
--
-- TEST DESCRIPTION:
--      Declare a parent package with a private part.  Declare a public 
--      child package.  Declare two kinds of extensions in the public child:
--      (a) An extension from parent visible tagged type, and (b) An extension
--      from parent private tagged type.  In the main program, "with" the 
--      child and incorrectly use its parent's private declarations and its
--      extensions.
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--
--!

-- Parent package

package B730004_0 is

   -- Type definitions.

   type Visible_Integer is range 1 .. 10;

   type Private_Record is private;

   type Visible_Tagged is tagged
      record
         PR : Private_Record;
      end record;

   type Private_Tagged is tagged private;

   type Private_Extension is new Visible_Tagged with private;

private

   -- Type definitions.

   type Private_Integer is range 11 .. 20;

   type Private_Record is
      record
         VI : Visible_Integer;
      end record;

   type Private_Tagged is tagged
      record
         VI : Visible_Integer;
      end record;

   type Private_Extension is new Visible_Tagged with
      record
         VI : Visible_Integer;
      end record;

   -- Object definitions.

   Private_Integer_Num : Visible_Integer :=  6;

end B730004_0;

-- No bodies provided for B730004_0.

     --=================================================================--

-- Public child

package B730004_0.B730004_1 is

   -- Type definitions.

   type Color is (White, Black, Red);

   type Child_Extension1 is new Visible_Tagged with  
      record 
         VI : Visible_Integer;
      end record;

   type Child_Extension2 is new Private_Tagged with 
      record 
         C  : Color; 
      end record;

   -- Object definitions.

   Visible_Integer_Num : Visible_Integer := 7;

   -- Subprogram definitions.

   function Assign_Private_Tagged (I : Visible_Integer) 
     return Private_Tagged;

   function Assign_Private_Extension (I : Visible_Integer) 
     return Private_Extension;

   function Assign_Visible_Tagged (I : Visible_Integer) 
     return Visible_Tagged;

   function Assign_Integer (I : Visible_Integer) return Child_Extension1;

   function Assign_Color (C : Color) return Child_Extension2;

   function Assign_Child_Extension1 (I : Visible_Integer) 
     return Child_Extension1;

   function Assign_Child_Extension2 (I : Visible_Integer) 
     return Child_Extension2;

end B730004_0.B730004_1;

-- No bodies provided for B730004_0.B730004_1.

     --=================================================================--

with B730004_0.B730004_1;     -- public child package
                              -- implicit with parent package (B730004_0).

package B730004 is

   Client_Var1 : B730004_0.Visible_Integer 
               := B730004_0.B730004_1.Visible_Integer_Num; -- OK
                                                    -- parent's visible type
   Client_Var2 : B730004_0.Visible_Integer 
               := B730004_0.Private_Integer_Num;                   -- ERROR:
                                                  -- parent's private object
   Client_Var3 : B730004_0.Private_Record
               := (VI => 3);                                       -- ERROR:
                                                    -- parent's private type

   Client_Var4 : B730004_0.Private_Tagged;                 -- OK

   Client_Var5 : B730004_0.Private_Tagged
               := B730004_0.B730004_1.Assign_Private_Tagged
                    (Client_Var4.VI);                              -- ERROR:
                                        -- parent's private record component

   Client_Var6 : B730004_0.Private_Extension;              -- OK

   Client_Var7 : B730004_0.Private_Extension
               := B730004_0.B730004_1.Assign_Private_Extension
                    (Client_Var6.VI);                              -- ERROR:
                                        -- parent's private record component

   Client_Var8 : B730004_0.Visible_Tagged;                 -- OK

   Client_Var9 : B730004_0.Visible_Tagged   
               := B730004_0.B730004_1.Assign_Visible_Tagged
                    (Client_Var8.PR.VI);                           -- ERROR:
                                        -- parent's private record component

   Client_Var10 : B730004_0.B730004_1.Child_Extension1;    -- OK

   Client_Var11 : B730004_0.B730004_1.Child_Extension1
                := B730004_0.B730004_1.Assign_Integer
                    (Client_Var10.VI);                     -- OK

   Client_Var12 : B730004_0.B730004_1.Child_Extension1
                := B730004_0.B730004_1.Assign_Child_Extension1
                    (Client_Var10.PR.VI);                          -- ERROR:
    -- child's extension from parent vis. tagged type with private component

   Client_Var13 : B730004_0.B730004_1.Child_Extension2;    -- OK

   Client_Var14 : B730004_0.B730004_1.Child_Extension2
                := B730004_0.B730004_1.Assign_Color 
                    (Client_Var13.C);                      -- OK

   Client_Var15 : B730004_0.B730004_1.Child_Extension2
                := B730004_0.B730004_1.Assign_Child_Extension2
                    (Client_Var13.VI);                             -- ERROR:
                        -- child's extension from parent private tagged type

end B730004;

-- No bodies provided for B730004.
