-- BC70004.A
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
--      Check that the template in a formal package declaration must be a
--      generic package. Check for the case where the formal package is
--      declared in a library-level generic subprogram.
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
--      Declare various entities to be named as templates in formal package
--      declarations:
--
--         (1) A generic package.
--         (2) A nongeneric package.
--         (3) A generic subprogram.
--         (4) An instance of a generic package.
--
--      Declare a library-level generic subprogram which declares several
--      formal packages using each of the entities above as template.
--      Include a case where the formal package which uses (1) above
--      as its template is itself used as a template.
--
--      All cases except (1) are illegal.
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--
--!

generic                                                -- Generic package which
   type Element_Type is private;                       -- serves as template
package BC70004_0 is                                   -- for formal package.
   Object : Element_Type;
end BC70004_0;


     --==================================================================--


package BC70004_1 is                                   -- Non-generic package.
   Object : String (1 .. 5);
end BC70004_1;


     --==================================================================--


generic                                                -- Generic subprogram.
   type Elem_Type is (<>);
procedure BC70004_2 (E : in out Elem_Type);


     --==================================================================--


procedure BC70004_2 (E : in out Elem_Type) is
begin
   null;
end BC70004_2;


     --==================================================================--


with BC70004_0;  -- Generic package.                   -- Package instance.
package BC70004_3 is new BC70004_0 (Integer);


     --==================================================================--


with BC70004_0;  -- Generic package.
with BC70004_1;  -- Non-generic package.
with BC70004_2;  -- Generic subprogram.
with BC70004_3;  -- Instance of generic package.

generic                                              
   with package Valid_Declaration   is new BC70004_0 (<>);            -- OK.


   with package Package_Not_Generic is new BC70004_1 (<>);            -- ERROR:
                                          -- Template is not a generic package.

   with package Generic_Not_Package is new BC70004_2 (<>);            -- ERROR:
                                          -- Template is not a generic package.

   with package Formal_Package      is new Valid_Declaration (<>);    -- ERROR:
                                          -- Template is not a generic package.

   with package Instance            is new BC70004_3 (<>);            -- ERROR:
                                          -- Template is not a generic package.

procedure BC70004;
