-- BC51012.A
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
--      Check that, if the reserved word "abstract" does not appear in the
--      declaration of a formal derived type, the actual type must not be
--      an abstract type. Check that, if the ancestor type is abstract, and the
--      formal derived type is not, neither the ancestor type nor its abstract
--      descendants may be passed as actuals. Check that, if the formal derived
--      type is abstract, then the following entities that are of the formal
--      type are illegal: a component, an object created by an object
--      declaration or an allocator, a generic formal object of mode in, the
--      the result type of a non-abstract function.
--
-- TEST DESCRIPTION:
--      Verify that both specific abstract types and formal abstract types
--      are illegal as actuals in instantiations of generics declaring formal
--      non-abstract derived types. Include a case where the formal type of a
--      formal package is used as an actual. Verify that both basic and aliased
--      object declarations are illegal if the type is a formal abstract type.
--      Verify that components of a formal abstract type are illegal for both
--      records and arrays.
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--
--!

package BC51012_0 is

   type Ancestor is abstract tagged record                   -- Abstract type.
      Field : String (1 .. 5);
   end record;

   type Abstract_Child is abstract new Ancestor with record  -- Abstract type.
      Len : Natural;
   end record;

   type Concrete_Child is new Ancestor with record        -- Non-abstract type.
      My_Len : Natural;
   end record;

end BC51012_0;


     --==================================================================--


with BC51012_0;
generic
   type A_Formal_Type is new                          -- Non-abstract formal
     BC51012_0.Ancestor with private;                 -- tagged derived type.   
package BC51012_1 is
  type Derived_Type is new A_Formal_Type with null record;
end BC51012_1;


     --==================================================================--


with BC51012_0;
generic                                               -- Template for formal
   type A_Formal_Type is abstract new                 -- package: has an
     BC51012_0.Ancestor with private;                 -- abstract formal type.
package BC51012_2 is end;


     --==================================================================--


with BC51012_0;
with BC51012_1;
with BC51012_2;
generic
   type Formal_Type is abstract new BC51012_0.Ancestor with private;  -- OK.
   with package Formal_Package is new BC51012_2 (<>);

   Gen_Obj1 : in out Formal_Type;                                     -- OK.

   Gen_Obj2 : Formal_Type;                                            -- ERROR:
                       -- Type of generic formal object of mode in is abstract.

package BC51012 is

   type Abstract_Access is access Formal_Type;

   Object1 : Formal_Type;                                             -- ERROR:
                                                 -- Type of object is abstract.
   Object2 : aliased Formal_Type;                                     -- ERROR:
                                                 -- Type of object is abstract.

   Abs_Ptr : Abstract_Access := new Formal_Type;                      -- ERROR:
                                       -- Type of allocated object is abstract.

   type Rec is record
      Component : Formal_Type;                                        -- ERROR:
   end record;                                -- Type of component is abstract.

   type Arr is array (1 .. 5) of Formal_Type;                         -- ERROR:
                                              -- Type of component is abstract.

   Abs_Arr : array (1 .. 5) of Formal_Type;                           -- ERROR:
                                              -- Type of component is abstract.
                                   

   function Non_Abstract_Function return Formal_Type;                 -- ERROR:
                                -- Result type is abstract but function is not.

   function Abstract_Function return Formal_Type is abstract;         -- OK.


   package Derived_Actual_Is_Type_1 is new
     BC51012_1 (BC51012_0.Ancestor);                                  -- ERROR:
                                                    -- Actual type is abstract.

   package Derived_Actual_Is_Type_2 is new
     BC51012_1 (BC51012_0.Abstract_Child);                            -- ERROR:
                                                    -- Actual type is abstract.

   package Derived_Actual_Is_Type_3 is new
     BC51012_1 (BC51012_0.Concrete_Child);                            -- OK.


   package Derived_Actual_Is_Formal is new
     BC51012_1 (Formal_Type);                                         -- ERROR:
                                                    -- Actual type is abstract.

   package Derived_Actual_Is_Formal_Package_Formal is new
     BC51012_1 (Formal_Package.A_Formal_Type);                        -- ERROR:
                                                    -- Actual type is abstract.

end BC51012;
