-- BC70006.A
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
--      Check that if a formal package actual part is not (<>), the generic
--      formal part of the template is not part of the visible part of the
--      formal package. Check for the case where the formal package is
--      declared in a library-level generic subprogram.
--
-- TEST DESCRIPTION:
--      The ramification of this rule is that the declarations immediately
--      within the generic formal part of the template are not visible
--      outside the formal package (in particular, within the generic unit
--      declaring the formal package). Such declarations are visible only
--      if the formal package actual part is (<>).
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--
--!

generic                                                -- Generic package which
   type Group_Type is private;                         -- serves as template
   Identity : Group_Type;                              -- for formal package.
   with function Operation (L, R : Group_Type) return Group_Type;
package BC70006_0 is end;


     --==================================================================--


generic                                                -- Generic package which
   type Element_Type is range <>;                      -- serves as template
   type Rows_Type    is range <>;                      -- for 2nd formal pack.
   type Columns_Type is range <>;
   type Matrix_Type  is array (Rows_Type, Columns_Type) of Element_Type;
package BC70006_1 is

   Add_Ident : Matrix_Type;

   function "+" (A, B : Matrix_Type) return Matrix_Type;

end BC70006_1;

     --==================================================================--


package body BC70006_1 is

   function "+" (A, B : Matrix_Type) return Matrix_Type is
   begin
      return Add_Ident;
   end "+";

end BC70006_1;


     --==================================================================--


with BC70006_0;  -- Template for formal package with explicit actual part.
with BC70006_1;  -- Template for formal package with (<>) actual part.

package BC70006 is

   generic
       with package Matrices is new BC70006_1 (<>);

       with package Math_Sig  is new BC70006_0
          (Group_Type => Matrices.Matrix_Type,
           Identity   => Matrices.Add_Ident,
           Operation  => Matrices."+");

       use Math_Sig;          -- Math_Sig package directly visible.
   procedure Matrix_Manipulator;

end BC70006;


     --==================================================================--


package body BC70006 is

   procedure Matrix_Manipulator is

      A : Matrices.Matrix_Type := Matrices.Add_Ident;                 -- OK.
      B : Matrices.Matrix_Type := A;                                  -- OK.


      -- Attempt to reference the formal part of the formal package using
      -- expanded names. All references to Group_Type, Identity, and Operation
      -- are illegal.

      ID1 : Math_Sig.Group_Type;                                      -- ERROR:
                                            -- Math_Sig.Group_Type not visible.

      ID5 : Matrices.Matrix_Type;                                     -- OK.


      ID2 : Matrices.Matrix_Type :=
              Math_Sig.Operation (A, B);                              -- ERROR:
                                             -- Math_Sig.Operation not visible.



      -- Attempt to reference the formal part of the formal package using
      -- direct names. All references to Group_Type, Identity, and Operation
      -- are illegal.

      ID3 : Group_Type;                                               -- ERROR:
                                                     -- Group_Type not visible.

      ID4 : Matrices.Matrix_Type := Identity;                         -- ERROR:
                                                       -- Identity not visible.

      ID6 : Matrices.Matrix_Type;                                     -- OK.

   begin
      -- Attempt to reference Identity using expanded name.
      ID5 := Math_Sig.Identity;                                       -- ERROR:
                                                       -- Identity not visible.

      -- Attempt to reference Operation using direct name.
      ID6 := Operation (A, B);                                        -- ERROR:
                                                      -- Operation not visible.

   end Matrix_Manipulator;

end BC70006;
