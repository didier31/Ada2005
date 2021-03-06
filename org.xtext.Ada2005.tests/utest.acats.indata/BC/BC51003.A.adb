-- BC51003.A
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
--      Check that, for a generic formal derived type with no discriminant
--      part, if the ancestor subtype is constrained, the actual subtype
--      must be constrained and must be statically compatible with the
--      ancestor. Check for the case where both constraints are static and the
--      actual subtype is defined by a subtype declaration.
--
-- TEST DESCRIPTION:
--      The ancestor type must be a type for which range, index, or
--      discriminant constraints are possible. The types of most interest are
--      scalar, array, record, access, and tagged types.
--
--      For each type category considered, an unconstrained "root" type is
--      declared, followed by a constrained subtype which will serve as the
--      ancestor subtype in a formal derived type declaration. (The
--      unconstrained "root" type is needed in order to check the case where
--      an unconstrained actual subtype is passed to a constrained formal
--      subtype). Next, two additional subtypes are declared, one which
--      statically compatible with the ancestor subtype and one which is not.
--
--      Static compatibility between the actual subtype and the ancestor
--      subtype is defined as follows when both are static and the ancestor
--      subtype is constrained:
--
--         For an access or composite ancestor subtype, the ancestor's
--         constraint and the actual's constraint must have equal corresponding
--         bounds or discriminant values.
--
--         For a scalar ancestor subtype, the bounds of the actual's constraint
--         must both belong to the range of the ancestor subtype.
--
--      In the main program, a generic with a formal derived type of the
--      appropriate ancestor subtype is instantiated with the following
--      actuals:
--
--         (a) The unconstrained "root" type.
--         (b) A subtype with statically compatible constraints.
--         (c) A subtype with statically incompatible constraints.
--
--      Since any constraint on the ancestor subtype is considered part of the
--      generic "contract," cases (a) and (c) should result in compile-time
--      errors.
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--
--!

package BC51003_0 is  -- Type definitions.

--
-- Integer Types :
--

   -- For the integer case, Natural is the statically constrained integer
   -- (ancestor) subtype. There is no unconstrained "root" type, since
   -- Integer is considered to be constrained. 

   subtype Sizes is Integer range 1 .. 5;         -- Statically compatible
                                                  -- integer subtype.

   subtype Size is Integer range -1 .. 4;         -- Statically incompatible
                                                  -- integer subtype.

--
-- Floating Point Types :
--

   -- For the floating point case, Float is the unconstrained floating point
   -- "root" type.

   subtype My_Float is Float range 1.0 .. 100.0;  -- Statically constrained
                                                  -- floating point (ancestor)
                                                  -- subtype.

   Last_Float : constant Float := 100.0;

   subtype Up_To_100 is My_Float                  -- Statically compatible
     range 1.0 .. Last_Float;                     -- floating point subtype.

   subtype Top_125 is Float range 0.0 .. 125.0;   -- Statically incompatible
                                                  -- floating point subtype.

--
-- Array Types :
--

   subtype Size2 is Sizes range 1 .. 2;

   type Matrix is array                           -- Unconstrained array
     (Sizes range <>, Sizes range <>) of Integer; -- "root" type.

   subtype Matrix_2x2 is Matrix (1 .. 2, 1 .. 2); -- Statically constrained
                                                  -- array (ancestor) subtype.

   subtype Two_By_Two is Matrix (Size2, Size2);   -- Statically compatible
                                                  -- array subtype.

   subtype Shifted_2x2 is Matrix                  -- Statically incompatible
     (2 .. 3, 2 .. 3);                            -- array subtype.

--
-- Record Types :
--

   type Square (Side : Size) is record            -- Unconstrained record
      Mat : Matrix (1 .. Side, 1 .. Side);        -- "root" type.
   end record;

   subtype Square2 is Square (Side => 2);         -- Statically constrained
                                                  -- record (ancestor) subtype.

   subtype Square3 is Square(3);                  -- Statically incompatible
                                                  -- record subtype.

--
-- Access Types :
--

   type Square_Ptr is access Square;              -- Unconstrained access
                                                  -- "root" type.

   subtype Sq2_Ptr is Square_Ptr(2);              -- Statically constrained
                                                  -- access (ancestor) subtype.

   subtype Sq2_Point is Square_Ptr(Size2'Last);   -- Statically compatible
                                                  -- access subtype.

   subtype Sq4_Point is Square_Ptr(Size'Last);    -- Statically incompatible
                                                  -- access subtype.

--
-- Tagged Types :
--

   type Double_Square (Num : Size) is tagged      -- Unconstrained tagged
     record                                       -- "root" type.
       Left  : Square (Num);                       
       Right : Square (Num);
     end record;

   subtype Dbl_Sq4 is Double_Square(4);           -- Statically constrained
                                                  -- tagged (ancestor) subtype.

   subtype Dbl_Four is Double_Square(Size'Last);  -- Statically compatible
                                                  -- tagged subtype.

   subtype Dbl_Two is Double_Square(Size2'Last);  -- Statically incompatible
                                                  -- tagged subtype.

end BC51003_0;

-- No body for BC51003_0.


     --==================================================================--


with BC51003_0;  -- Type definitions.
generic
   type Integer_Constrained_Subtype is new Natural;            -- Valid ranges
package BC51003_1 is                                           -- are in 0 ..
   Rows : Integer_Constrained_Subtype;                         -- Integer'Last.
end BC51003_1;

-- No body for BC51003_1.


     --==================================================================--


with BC51003_0;  -- Type definitions.
generic
   type Float_Constrained_Subtype is new BC51003_0.My_Float;   -- Valid ranges
package BC51003_2 is                                           -- are in
   Val : Float_Constrained_Subtype;                            -- 1.0..100.0.
end BC51003_2;

-- No body for BC51003_2.


     --==================================================================--


with BC51003_0;  -- Type definitions.
generic
   type Array_Constrained_Subtype is new BC51003_0.Matrix_2x2; -- Valid index
package BC51003_3 is                                           -- constraints
   Det : Array_Constrained_Subtype;                            -- are 1..2.
end BC51003_3;

-- No body for BC51003_3.


     --==================================================================--


with BC51003_0;  -- Type definitions.
generic
   type Record_Constrained_Subtype is new BC51003_0.Square2;   -- Valid
package BC51003_4 is                                           -- discriminant
   State : Record_Constrained_Subtype;                         -- constraint is
end BC51003_4;                                                 -- 2.

-- No body for BC51003_4.


     --==================================================================--


with BC51003_0;  -- Type definitions.
generic
   type Access_Constrained_Subtype is new BC51003_0.Sq2_Ptr;   -- Valid
package BC51003_5 is                                           -- discriminant
   State_Ptr : Access_Constrained_Subtype;                     -- constraint is
end BC51003_5;                                                 -- 2.

-- No body for BC51003_5.


     --==================================================================--


with BC51003_0;  -- Type definitions.
generic
   type Tagged_Constrained_Subtype is new BC51003_0.Dbl_Sq4    -- Valid
     with private;                                             -- discriminant
package BC51003_6 is                                           -- constraint is
   State_Pair : Tagged_Constrained_Subtype;                    -- 4.
end BC51003_6;

-- No body for BC51003_6.


     --==================================================================--


with BC51003_0;  -- Type definitions.
with BC51003_1;  -- Integer formal types.
with BC51003_2;  -- Floating point formal types.
with BC51003_3;  -- Array  formal types.
with BC51003_4;  -- Record formal types.
with BC51003_5;  -- Access formal types.
with BC51003_6;  -- Tagged formal types.
procedure BC51003 is

--
-- Integer Types :
--

   package Integer_Compatible_Constraints1 is new
     BC51003_1 (Natural);                                             -- OK.


   package Integer_Compatible_Constraints2 is new
     BC51003_1 (BC51003_0.Sizes);                                     -- OK.


   package Integer_Incompatible_Constraints is new
     BC51003_1 (BC51003_0.Size);                                      -- ERROR:
                                                                -- Lower bound.


--
-- Floating Point Types :
--

   package Float_Compatible_Constraints is new
     BC51003_2 (BC51003_0.Up_To_100);                                 -- OK.


   package Float_Unconstrained is new
     BC51003_2 (Float);                                               -- ERROR:
                                                       -- Actual unconstrained.

   package Float_Incompatible_Constraints is new
     BC51003_2 (BC51003_0.Top_125);                                   -- ERROR:
                                                                -- Both bounds.


--
-- Array Types :
--

   package Array_Compatible_Constraints is new
     BC51003_3 (BC51003_0.Two_By_Two);                                -- OK.


   package Array_Unconstrained is new
     BC51003_3 (BC51003_0.Matrix);                                    -- ERROR:
                                                       -- Actual unconstrained.

   package Array_Incompatible_Constraints is new
     BC51003_3 (BC51003_0.Shifted_2x2);                               -- ERROR:
                                                               -- Index bounds.


--
-- Record Types :
--

   package Record_Compatible_Constraints is new
     BC51003_4 (BC51003_0.Square2);                                   -- OK.


   package Record_Unconstrained is new
     BC51003_4 (BC51003_0.Square);                                    -- ERROR:
                                                       -- Actual unconstrained.

   package Record_Incompatible_Constraints is new
     BC51003_4 (BC51003_0.Square3);                                   -- ERROR:
                                                    -- Discriminant constraint.


--
-- Access Types :
--

   package Access_Compatible_Constraints is new
     BC51003_5 (BC51003_0.Sq2_Point);                                 -- OK.


   package Access_Unconstrained is new
     BC51003_5 (BC51003_0.Square_Ptr);                                -- ERROR:
                                                       -- Actual unconstrained.

   package Access_Incompatible_Constraints is new
     BC51003_5 (BC51003_0.Sq4_Point);                                 -- ERROR:
                                                    -- Discriminant constraint.


--
-- Tagged Types :
--

   package Tagged_Compatible_Constraints is new
     BC51003_6 (BC51003_0.Dbl_Four);                                  -- OK.


   package Tagged_Unconstrained is new
     BC51003_6 (BC51003_0.Double_Square);                             -- ERROR:
                                                       -- Actual unconstrained.

   package Tagged_Incompatible_Constraints is new
     BC51003_6 (BC51003_0.Dbl_Two);                                   -- ERROR:
                                                    -- Discriminant constraint.


begin
   null;
end BC51003;
