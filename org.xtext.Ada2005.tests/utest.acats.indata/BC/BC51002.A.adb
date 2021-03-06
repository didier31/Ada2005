-- BC51002.A
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
--      Check that if a generic formal derived subtype is definite, the
--      actual subtype must not be indefinite. Check in cases where the formal
--      subtype appears in contexts where an indefinite subtype would be
--      legal.
--
-- TEST DESCRIPTION:
--      A definite subtype is any subtype which is not indefinite. An
--      indefinite subtype is either:
--         a) An unconstrained array subtype.
--         b) A subtype with unknown discriminants (this includes class-wide
--            types).
--         c) A subtype with unconstrained discriminants without defaults.
--
--      For this test, we must have a definite generic formal derived type
--      such that it makes sense to attempt to pass it an indefinite actual.
--      (Note that the formal derived type may not have an unknown discriminant
--      part, nor may it have a known discriminant part, since defaults may
--      not be specified for the discriminants.) 
--
--      The ancestor type of the formal derived type must therefore be either
--      a constrained array subtype, a discriminated type with defaults, or a
--      tagged type (since defaults are not allowed for discriminants of
--      tagged types, the ancestor type may not be a discriminated tagged
--      type). If the ancestor type for a tagged formal derived type has no
--      discriminants, it is unlikely that a programmer would define a type
--      with an unknown discriminant part (e.g., a private extension or a
--      formal derived type) using that ancestor type. That leaves the
--      following cases of interest:
--
--            Formal derived ancestor               Actual
--            ------------------------------------  ------
--         1) Constrained array subtype             Unconstrained type of
--                                                  the subtype                
--         2) Constrained record subtype            Unconstrained type (no
--                                                  defaults) of the subtype
--         3) Unconstrained record type w/defaults  Formal derived with same
--                                                  ancestor but unknown disc.
--         4) Tagged type                           Class-wide type of ancestor
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--
--!

package BC51002_0 is  -- Type definitions.

   subtype Size is Natural range 1 .. 4;

   type Matrix is array                                 -- Unconstrained array
     (Size range <>, Size range <>) of Integer;         -- type.

   subtype Mat2x2 is Matrix (1 .. 2, 1 .. 2);           -- Constrained array
                                                        -- subtype.

   type Square (Side : Size := 2) is record             -- Unconstrained record
      Mat : Matrix (1 .. Side, 1 .. Side);              -- with defaulted
   end record;                                          -- discriminants.

   type Any_Square (Side : Size) is record              -- Unconstrained record
      Mat : Matrix (1 .. Side, 1 .. Side);              -- with undefaulted
   end record;                                          -- discriminants.

   subtype Square3 is Any_Square(Side => 3);            -- Constrained record
                                                        -- subtype (no
                                                        -- defaults).
   type Vector is record
      Mat : Matrix (1 .. 3, 1 .. 1);
   end record;

   type Vector_Pair is tagged record                    -- Undiscriminated
      Left  : Vector;                                   -- tagged type.
      Right : Vector;
   end record;

end BC51002_0;


-- No body for BC51002_0;


     --==================================================================--


with BC51002_0;  -- Type definitions.
generic          -- Template for generic formal package.
                                                        -- Formal derived
   type Squares (<>) is new BC51002_0.Square;           -- record type with
                                                        -- unknown discrim.
package BC51002_1 is end;


     --==================================================================--


with BC51002_0;  -- Type definitions.
generic          -- Record formal types.

   type Array_Constrained_Subtype is new BC51002_0.Mat2x2;

package BC51002_2 is
   type New_Array is new Array_Constrained_Subtype;  -- This declaration could
                                                     -- be satisfied by an
                                                     -- indefinite actual.
end BC51002_2;


-- No body for BC51002_2;


     --==================================================================--


with BC51002_0;  -- Type definitions.
generic          -- Record formal types.

   type Record_Constrained_Subtype  is new BC51002_0.Square3;

package BC51002_3 is
   procedure Proc (P: Record_Constrained_Subtype);   -- This declaration could
                                                     -- be satisfied by an
                                                     -- indefinite actual.
end BC51002_3;


     --==================================================================--


package body BC51002_3 is

   procedure Proc (P: Record_Constrained_Subtype) is
   begin
      null;
   end Proc;

end BC51002_3;


     --==================================================================--


with BC51002_0;  -- Type definitions.
generic          -- Record formal types.

   type Record_Default_Discriminant is new BC51002_0.Square;

package BC51002_4 is
   type New_Record is new Record_Default_Discriminant; -- This decl. could
                                                       -- be satisfied by an
                                                       -- indefinite actual.
end BC51002_4;


     --==================================================================--


with BC51002_0;  -- Type definitions.
generic          -- Tagged types.

   type Undiscriminated_Tagged is new BC51002_0.Vector_Pair with private;

package BC51002_5 is
   procedure Proc (P: Undiscriminated_Tagged);        -- This declaration could
                                                      -- be satisfied by an
                                                      -- indefinite actual.
end BC51002_5;


     --==================================================================--


package body BC51002_5 is

   procedure Proc (P: Undiscriminated_Tagged) is
   begin
      null;
   end Proc;

end BC51002_5;


     --==================================================================--


with BC51002_0;  -- Type definitions.
with BC51002_1;  -- Formal package template.
with BC51002_2;  -- Array formal types.
with BC51002_3;  -- Record formal types (1).
with BC51002_4;  -- Record formal types (2).
with BC51002_5;  -- Tagged formal types.

procedure BC51002 is

   package Arrays is new BC51002_2
     (BC51002_0.Matrix);                                              -- ERROR:
                                                              -- Unconstrained.

   package Records is new BC51002_3
     (BC51002_0.Any_Square);                                          -- ERROR:
                                                              -- Unconstrained.

   generic
      with package Formal_Package is new BC51002_1 (<>);
   package Sig_Packs is

      package Records is new BC51002_4
         (Formal_Package.Squares);                                    -- ERROR:
                                                      -- Unknown discriminants.
   end Sig_Packs;


   package Taggeds is new BC51002_5
     (BC51002_0.Vector_Pair'Class);                                   -- ERROR:
                                                                 -- Class-wide.
begin
   null;
end BC51002;
