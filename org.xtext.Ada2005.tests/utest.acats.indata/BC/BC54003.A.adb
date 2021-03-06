-- BC54003.A
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
--      Check that, for a formal access-to-subprogram subtype, the
--      corresponding parameter and result types of the designated
--      profiles of the formal and actual must be the same. Specifically,
--      check for the case where the parameters in the profile of the formal
--      type are themselves formal types.
--
-- TEST DESCRIPTION:
--      Two profiles are subtype conformant if:
--         (a) They have the same number of parameters;
--         (b) Both have a result if either does;
--         (c) The corresponding parameter and result types are the same and
--             the subtypes statically match;
--         (d) Corresponding parameters have identical modes and both or
--             neither are explicitly aliased parameters;
--         (e) For access parameters, the designated subtypes statically
--             match;
--         (f) The associated calling conventions are the same.
--
--      The test declares generics with formal access-to-subprogram types
--      (access-to-procedure and access-to-function). Access-to-subprogram
--      types are declared to be passed as actuals, each with a designated
--      profile in which the parameter/result types are the same as, are
--      subtypes of, or are derived types of the parameter/result types in
--      the profile of the formal. Cases where the types are explicitly the
--      same or where one is a subtype of the other are legal, whereas cases
--      where one type is derived from the other are illegal.
--
--      Note: Ada 95 only required mode conformance in this case. This
--      was changed by AI05-0288-1. We have changed the test as little as
--      possible and for ACATS 3.0, we are not requiring any specific
--      behavior for actual types whose profile is mode conformant but not
--      subtype conformant. ACATS 4.0 will require subtype conformance only,
--      and should add test cases for explicitly aliased parameters
--      (part of (d)).
--
--      The following situations are checked:
--
--         - A parameter type in the profile of the formal access-to-subprogram
--           type is an abstract formal derived type declared in the same
--           formal part.
--         - A parameter type in the profile of the formal access-to-subprogram
--           type is a formal private type declared in the same formal part.
--         - A parameter type in the profile of the formal access-to-subprogram
--           type is a formal discrete type declared in the formal part of
--           a formal package (one level of indirection).
--         - A parameter type in the profile of the formal access-to-subprogram
--           type is a formal array type declared in the formal part of
--           a formal package, which is itself declared in the formal part of
--           a formal package (two levels of indirection).
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--      05 Nov 95   SAIC    ACVC 2.0.1 fixes: Added unknown discriminant part
--                          to generic BC54003_3.Formal_Derived_Parameter.
--      25 Mar 13   RLB     Modified as AI05-0288-1 requires subtype conformance
--                          in this case. Conflicting cases are commented out.
--
--!

package BC54003_0 is

--
-- Support declarations:
--

   type Parent is abstract tagged null record;

   -- ...(Abstract) operations of Parent type.


   type Child is new Parent with record
      Component : Integer;
   end record;

   -- ...(Overriding) operations of Child type.


   type Child_Op_Ptr is access                     -- Access-to-subprogram type
     procedure (Parm: in Child);                   -- to be passed as actual.

   type Class_Op_Ptr is access                     -- Access-to-subprogram type
     procedure (Parm: in Parent'Class);            -- to be passed as actual.



   subtype Message   is     String (1 .. 25);
   subtype Short_Msg is     String (1 .. 10);
   type New_String   is new String (1 .. 25);

   type String_Op_Ptr  is access                   -- Access-to-subprogram type
     procedure (Parm: in out String);              -- to be passed as actual.

   type Message_Op_Ptr is access                   -- Access-to-subprogram type
     procedure (Parm: in out Message);             -- to be passed as actual.

end BC54003_0;


     --===================================================================--


generic
   type Item is private;
   type Index is (<>);                             -- Template for generic
   type Formal_Array is array (Index) of Item;     -- formal package.
package BC54003_1 is end;


     --===================================================================--


with BC54003_1;
generic                                            -- Template for generic
   with package Outer_FP is new BC54003_1 (<>);    -- formal package (also
   type Formal_Discrete is (<>);                   -- declares a generic formal
package BC54003_2 is end;                          -- formal package).


     --===================================================================--


with BC54003_0;
with BC54003_2;
package BC54003_3 is

--
-- Generics declaring formal access-to-subprogram types:
--

   -- Parameter in designated profile is a formal derived type declared in the
   -- same formal part:

   generic
      type Formal_Derived (<>) is abstract new BC54003_0.Parent with private;
      type Access_To_Proc is access procedure (P: in Formal_Derived);
   package Formal_Derived_Parameter is end;



   -- Parameter in designated profile is a formal private type declared in the
   -- same formal part:

   generic
      type Formal_Private (<>) is private;
      type Access_To_Proc is access procedure (P: in out Formal_Private);
   package Formal_Private_Parameter is end;



   -- Parameter in designated profile is a formal discrete type declared in the
   -- formal part of a formal package:

   generic
      with package Formal_Package is new BC54003_2 (<>);

      type Access_To_Func is access function
        (L, R: Formal_Package.Formal_Discrete)
          return Formal_Package.Formal_Discrete;
   package Formal_Discrete_Parameter is end;



   -- Parameter in designated profile is a formal array type declared in the
   -- formal part of a formal package, which is itself declared in the formal
   -- part of a formal package:

   generic
     with package Formal_Package is new BC54003_2 (<>);

      type Access_To_Proc is access function
        (P: Formal_Package.Outer_FP.Formal_Array;
         Q: Formal_Package.Outer_FP.Index)
          return Formal_Package.Outer_FP.Item;
   package Formal_Array_Parameter is end;


end BC54003_3;


     --===================================================================--


with BC54003_1;
with BC54003_2;
package BC54003_4 is

--
-- Support declarations:
--

   type Rec     is record null; end record;
   type Rec_Ptr is access Rec;

   type    Count is new Natural range 0 .. 100;

   type    Table     is array (Count) of Rec_Ptr;
   subtype Sub_Table is Table;
   type    New_Table is new Table;

   type Array_Op_Ptr is access function            -- Access-to-subprogram type
     (P: Table; Q: Count) return Rec_Ptr;          -- to be passed as actual.



   type Dollars is new Integer range 0 .. 5000;
   subtype Thousand is Dollars range 0 .. 1000;

   package Rec_Tables   is new BC54003_1 (Rec_Ptr, Count, Table);
   package Sub_Tables   is new BC54003_1 (Rec_Ptr, Count, Sub_Table);
   package New_Tables   is new BC54003_1 (Rec_Ptr, Count, New_Table);

   package Dollar_Support_1 is new BC54003_2 (Rec_Tables, Dollars);
   package Dollar_Support_2 is new BC54003_2 (Sub_Tables, Dollars);
   package Dollar_Support_3 is new BC54003_2 (New_Tables, Dollars);

   package Thousand_Support is new BC54003_2 (Rec_Tables, Thousand);
   package Integer_Support  is new BC54003_2 (Rec_Tables, Integer);

   type Dollar_Op_Ptr is access function           -- Access-to-subprogram type
     (Left, Right: Dollars) return Dollars;        -- to be passed as actual.


end BC54003_4;


     --===================================================================--


with BC54003_0;
with BC54003_3;
with BC54003_4;
package BC54003 is

--
-- Instantiations:
--


   -- Parameter in profile is a formal derived type:

   package Instance01 is new BC54003_3.Formal_Derived_Parameter
     (BC54003_0.Child, BC54003_0.Child_Op_Ptr);                       -- OK.


   package Instance02 is new BC54003_3.Formal_Derived_Parameter
     (BC54003_0.Parent, BC54003_0.Child_Op_Ptr);                      -- ERROR:
                    -- Parameters in designated profiles do not have same type.

   package Instance03 is new BC54003_3.Formal_Derived_Parameter
     (BC54003_0.Parent, BC54003_0.Class_Op_Ptr);                      -- ERROR:
                    -- Parameters in designated profiles do not have same type.

   package Instance04 is new BC54003_3.Formal_Derived_Parameter
     (BC54003_0.Child'Class, BC54003_0.Child_Op_Ptr);                 -- ERROR:
                    -- Parameters in designated profiles do not have same type.

   package Instance05 is new BC54003_3.Formal_Derived_Parameter
     (BC54003_0.Parent'Class, BC54003_0.Class_Op_Ptr);                -- OK.



   -- Parameter in profile is a formal private type:

   package Instance06 is new BC54003_3.Formal_Private_Parameter
     (String, BC54003_0.String_Op_Ptr);                               -- OK.


-- The following is illegal by AI05-0288-1, OK in Ada 95:
--   package Instance07 is new BC54003_3.Formal_Private_Parameter
--     (String, BC54003_0.Message_Op_Ptr);                              -- OK.


-- The following is illegal by AI05-0288-1, OK in Ada 95:
--   package Instance08 is new BC54003_3.Formal_Private_Parameter
--     (BC54003_0.Message, BC54003_0.String_Op_Ptr);                    -- OK.


   package Instance09 is new BC54003_3.Formal_Private_Parameter
     (BC54003_0.Message, BC54003_0.Message_Op_Ptr);                   -- OK.


   package Instance10 is new BC54003_3.Formal_Private_Parameter
     (BC54003_0.New_String, BC54003_0.String_Op_Ptr);                 -- ERROR:
                    -- Parameters in designated profiles do not have same type.

   package Instance11 is new BC54003_3.Formal_Private_Parameter
     (BC54003_0.New_String, BC54003_0.Message_Op_Ptr);                -- ERROR:
                    -- Parameters in designated profiles do not have same type.

-- The following is illegal by AI05-0288-1, OK in Ada 95:
--   package Instance12 is new BC54003_3.Formal_Private_Parameter
--     (BC54003_0.Short_Msg, BC54003_0.Message_Op_Ptr);                 -- OK.



   -- Parameter in profile is a formal discrete type
   -- (one level of indirection through formal package):

   package Instance13 is new BC54003_3.Formal_Discrete_Parameter
     (BC54003_4.Dollar_Support_1, BC54003_4.Dollar_Op_Ptr);           -- OK.

-- The following is illegal by AI05-0288-1, OK in Ada 95:
--   package Instance14 is new BC54003_3.Formal_Discrete_Parameter
--     (BC54003_4.Thousand_Support, BC54003_4.Dollar_Op_Ptr);           -- OK.

   package Instance15 is new BC54003_3.Formal_Discrete_Parameter
     (BC54003_4.Integer_Support, BC54003_4.Dollar_Op_Ptr);            -- ERROR:
                    -- Parameters in designated profiles do not have same type.



   -- Parameter in profile is a formal array type
   -- (two levels of indirection through formal packages):

   package Instance16 is new BC54003_3.Formal_Array_Parameter
     (BC54003_4.Dollar_Support_1, BC54003_4.Array_Op_Ptr);            -- OK.

   package Instance17 is new BC54003_3.Formal_Array_Parameter
     (BC54003_4.Dollar_Support_2, BC54003_4.Array_Op_Ptr);            -- OK.

   package Instance18 is new BC54003_3.Formal_Array_Parameter
     (BC54003_4.Dollar_Support_3, BC54003_4.Array_Op_Ptr);            -- ERROR:
                    -- Parameters in designated profiles do not have same type.


end BC54003;
