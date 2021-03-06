-- BC70007.A
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
--      Check that an actual instance of a generic formal package is rejected
--      if its actuals do not match the corresponding actuals in the formal
--      package actual part. Specifically, check that the following cases are
--      illegal:
--
--         For a formal object of mode IN:
--
--             - The actuals are both static expressions but do not have the
--               same value.
--             - The actuals are not both static expressions and do not
--               statically denote the same constant.
--             - The actuals are not both the literal null.
--
--
-- TEST DESCRIPTION:
--      Declare templates for formal packages which declare a formal object
--      of mode in. Declare generics containing formal package declarations,
--      where each formal package has an explicit actual part.
--
--      Instantiate the template packages with various static and nonstatic
--      entities and pass them as actuals to the formal packages. Verify
--      that all cases in which the actuals of these instances do not
--      match the actuals of the corresponding formal package are illegal.
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--
--!

package BC70007_0 is

   function Get_Integer_From_User return Integer;

end BC70007_0;


     --==================================================================--


package body BC70007_0 is

   function Get_Integer_From_User return Integer is
   begin
      -- ...Call I/O routine...
      return 10;  -- Artificial for testing.
   end Get_Integer_From_User;

end BC70007_0;


     --==================================================================--


with BC70007_0;
use  BC70007_0;
package BC70007_1 is  -- Formal object support declarations.

--
-- Support declarations:
--

   type Rec is record
      Component : Boolean;
   end record;

   type Rec_Ptr is access Rec;

   Ten : constant Integer := Get_Integer_From_User;      -- Nonstatic constant.

   ValidWord : constant String := "Acceptable";


--
-- Templates for generic formal packages:
--

   generic                                       -- Template declaring a formal
      Object : in Integer;                       -- integer object of mode in.
   package Object_Integer_Template is end;

   generic                                       -- Template declaring a formal
      Object : in String;                        -- string object of mode in.
   package Object_String_Template is end;

   generic
      Object : in Rec_Ptr;                       -- Template declaring a formal
   package Object_Access_Template is end;        -- access object of mode in.


--
-- Generics containing formal package declarations:
--

   generic                                          -- Formal package actual is
      with package Formal_Package is new            -- an integer literal
        Object_Integer_Template (10);               -- (value 10).
   package Object_Literal is end;


   generic                                          -- Formal package actual is
      with package Formal_Package is new            -- a string constant
        Object_String_Template (ValidWord);         -- (value "Acceptable").
   package Object_String is end;


   generic                                          -- Formal package actual is
      with package Formal_Package is new            -- a nonstatic integer
        Object_Integer_Template (Ten);              -- constant.
   package Object_Nonstatic_Constant is end;


   generic                                          -- Formal package actual is
      with package Formal_Package is new            -- a literal null.
        Object_Access_Template (null);
   package Object_Null is end;

end BC70007_1;


     --==================================================================--


with BC70007_0;
with BC70007_1;

package BC70007 is

--
-- Support declarations:
--

   Null_Ptr : BC70007_1.Rec_Ptr := null;

   subtype A_Range is Integer range 1 .. 10;
   type Static_Array is array (A_Range) of Boolean;

   My_Ten : constant Integer  := BC70007_0.Get_Integer_From_User; -- Nonstatic.
   Min    : constant Integer  := A_Range'First;                   -- Static.
   Max    : constant          := 10;                              -- Static.

   Word   : constant String   := "Acceptable";                    -- Static.

   type New_Integer is new Integer;

   Value  : constant New_Integer := 10;                           -- Static.


--
-- Instances to be passed as actuals to formal packages:
--

   package Object_Instance_Same_Nonstatic_Constant       -- Instance actual is
     is new BC70007_1.Object_Integer_Template            -- nonstatic constant.
       (Object => BC70007_1.Ten);

   package Object_Instance_Different_Nonstatic_Constant  -- Instance actual is
     is new BC70007_1.Object_Integer_Template            -- nonstatic constant.
       (Object => My_Ten);

   package Object_Instance_Named_Number                  -- Instance actual is
     is new BC70007_1.Object_Integer_Template            -- a static named
       (Object => Max);                                  -- number (value 10).

   package Object_Instance_Constant                      -- Instance actual is
     is new BC70007_1.Object_Integer_Template            -- a static constant
       (Object => Min);                                  -- (value 1).

   package Object_Instance_Attribute                     -- Instance actual is
     is new BC70007_1.Object_Integer_Template            -- a static attribute
       (Object => A_Range'Last);                         -- ref. (value 10).

   package Object_Instance_Array_Bound                   -- Instance actual is
     is new BC70007_1.Object_Integer_Template            -- a static attribute
       (Object => Static_Array'Length);                  -- ref. (value 10).

   package Object_Instance_Operations                    -- Instance actual
     is new BC70007_1.Object_Integer_Template            -- calls static func-
       (Object => Max*2-4);                              -- tions (value 16).

   package Object_Instance_Conversion                    -- Instance actual is
     is new BC70007_1.Object_Integer_Template            -- a type conversion
       (Object => Integer(Value));                       -- (value 10).

   package Object_Instance_Good_String                   -- Instance actual is
     is new BC70007_1.Object_String_Template             -- a static constant.
       (Object => Word);                                 -- ("Acceptable").

   package Object_Instance_Bad_String                    -- Instance actual is
     is new BC70007_1.Object_String_Template             -- a string literal.
       (Object => "ACCEPTABLE");

   package Object_Instance_Literal_Null                  -- Instance actual is
     is new BC70007_1.Object_Access_Template             -- a literal null.
       (Object => null);

   package Object_Instance_Nonliteral_Null               -- Instance actual is
     is new BC70007_1.Object_Access_Template             -- nonstatic (access)
       (Object => Null_Ptr);       -- Null.              -- obj. (value null).


--
-- Instances of generics declaring formal packages:
--

   -- Package BC70007_1.Object_Literal:
   --
   -- The formal package is declared as follows:
   --    with package Formal_Package is new Object_Integer_Template (10);
   --
   -- The formal package actual is the literal 10.


   package Object_Static_Same_Value_1 is new
     BC70007_1.Object_Literal (Object_Instance_Named_Number);         -- OK.

   package Object_Static_Same_Value_2 is new
     BC70007_1.Object_Literal (Object_Instance_Attribute);            -- OK.

   package Object_Static_Same_Value_3 is new
     BC70007_1.Object_Literal (Object_Instance_Array_Bound);          -- OK.

   package Object_Static_Same_Value_4 is new
     BC70007_1.Object_Literal (Object_Instance_Conversion);           -- OK.

   package Object_Static_Different_Values_1 is new
     BC70007_1.Object_Literal (Object_Instance_Constant);             -- ERROR:
                                -- Corresponding actuals have different values.

   package Object_Static_Different_Values_2 is new
     BC70007_1.Object_Literal (Object_Instance_Operations);           -- ERROR:
                                -- Corresponding actuals have different values.

   package Object_Not_Both_Static_Expressions_1 is new
     BC70007_1.Object_Literal
       (Object_Instance_Different_Nonstatic_Constant);                -- ERROR:
                                 -- Instance actual is not a static expression,
                                 -- but formal package actual is.



   -- Package BC70007_1.Object_Nonstatic_Constant:
   --
   -- The formal package is declared as follows:
   --    with package Formal_Package is new Object_Integer_Template (Ten);
   --
   -- The formal package actual is the nonstatic constant BC70007_1.Ten.


   package Object_Not_Both_Static_Expressions_2 is new
     BC70007_1.Object_Nonstatic_Constant
       (Object_Instance_Attribute);                                   -- ERROR:
                                       -- Formal package actual is not a static
                                       -- expression, but instance actual is.

   package Object_Statically_Denote_Same_Constant is new
     BC70007_1.Object_Nonstatic_Constant
       (Object_Instance_Same_Nonstatic_Constant);                     -- OK.

   package Object_Statically_Denote_Different_Constant is new
     BC70007_1.Object_Nonstatic_Constant
       (Object_Instance_Different_Nonstatic_Constant);                -- ERROR:
                             -- Actuals do not statically denote same constant.



   -- Package BC70007_1.Object_String:
   --
   -- The formal package is declared as follows:
   --    with package Formal_Package is new Object_String_Template (ValidWord);
   --
   -- The formal package actual is the static constant Word ("Acceptable").

   package Object_Static_String_Same_Value is new
     BC70007_1.Object_String (Object_Instance_Good_String);           -- OK.

   package Object_Static_String_Different_Value is new
     BC70007_1.Object_String (Object_Instance_Bad_String);            -- ERROR:
                                -- Corresponding actuals have different values.



   -- Package BC70007_1.Object_Null:
   --
   -- The formal package is declared as follows:
   --    with package Formal_Package is new Object_Access_Template (null);
   --
   -- The formal package actual is the literal null.


   package Object_Both_Literal_Null is new
     BC70007_1.Object_Null (Object_Instance_Literal_Null);            -- OK.

   package Object_Not_Both_Literal_Null is new
     BC70007_1.Object_Null (Object_Instance_Nonliteral_Null);         -- ERROR:
                                    -- Instance actual is not the literal null.

end BC70007;
