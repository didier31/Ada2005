-- BC51006.A
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
--      part, if the ancestor subtype is an unconstrained array or tagged
--      subtype, the actual subtype must be unconstrained.
--
-- TEST DESCRIPTION:
--      For each type category considered, an unconstrained type is declared
--      which will serve as the ancestor type in a formal derived type
--      declaration. Next, various constrained and unconstrained subtypes are
--      declared which will be passed as actuals. The unconstrained subtypes
--      are as follows:
--
--         (a) Subtype with no constraints.
--         (b) Derived type with no constraints.
--         (c) The ancestor type itself.
--
--      The constrained subtypes are as follows:
--
--         (d) Subtype with constraints.
--         (e) Derived type with constraints.
--
--      Since the "unconstrainedness" of the ancestor subtype is considered
--      part of the generic "contract," cases (d)-(e) should result in
--      compile-time errors.
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--      09 Nov 95   SAIC    ACVC 2.0.1 fixes: Changed type New_Node so that
--                          discriminants of New_Node and its parent
--                          correspond.
--
--!

package BC51006_0 is  -- Type definitions.

--
-- Support declarations:
--

   subtype Msg_Len is Natural range 0 .. 50;

   type Node (Len : Msg_Len);
   type Node_Ptr is access Node;

   type Msg_Type (Len : Msg_Len := 20) is record
      Text : String (1 .. Len);
   end record;

   subtype Number is Positive range 1 .. 10;


--
-- Array Types :
--

   type Message_Table is array                      -- Unconstrained array
     (Number range <>) of Msg_Type;                 -- (ancestor) type.

   subtype My_Messages is Message_Table;            -- Unconstrained array
                                                    -- subtype.

   subtype Six_Messages is Message_Table(1 .. 6);   -- Constrained array
                                                    -- subtype.

   type Ten_Messages is new Message_Table(Number);  -- Constrained array
                                                    -- derived type (derived
                                                    -- from "ancestor" type).
--
-- Tagged Types :
--

   type Node (Len : Msg_Len) is tagged record       -- Unconstrained tagged
      Msg : Msg_Type (Len);                         -- (ancestor) type.
   end record;

   type New_Node (Len2 : Msg_Len) is new Node(Len2) -- Unconstrained tagged
     with record                                    -- derived type.
      Msg2 : Msg_Type (Len2);
   end record;


   subtype Len15_Node is Node(15);                  -- Constrained tagged
                                                    -- subtype.

   type List_Node is new Len15_Node with record     -- Constrained tagged
      Next : Node_Ptr;                              -- derived type (derived
   end record;                                      -- from constr. subtype).

end BC51006_0;

-- No body for BC51006_0.


     --==================================================================--


with BC51006_0;  -- Type definitions.
generic
   type Array_Unconstrained_Subtype is new BC51006_0.Message_Table;
package BC51006_1 is
end BC51006_1;

-- No body for BC51006_1.


     --==================================================================--


with BC51006_0;  -- Type definitions.
generic
   type Tagged_Unconstrained_Subtype is new BC51006_0.Node with private;
package BC51006_2 is
end BC51006_2;

-- No body for BC51006_2.


     --==================================================================--


with BC51006_0;  -- Type definitions.
with BC51006_1;  -- Array formal types.
with BC51006_2;  -- Tagged formal types.
procedure BC51006 is

--
-- Array Types :
--

   package Array_Unconstrained_Subtype is new
     BC51006_1 (BC51006_0.My_Messages);                               -- OK.


   package Array_Ancestor is new
     BC51006_1 (BC51006_0.Message_Table);                             -- OK.


   package Array_Constrained_Subtype is new
     BC51006_1 (BC51006_0.Six_Messages);                              -- ERROR:
                                                         -- Actual constrained.

   package Array_Constrained_Derived is new
     BC51006_1 (BC51006_0.Ten_Messages);                              -- ERROR:
                                                         -- Actual constrained.


--
-- Tagged Types :
--

   package Tagged_Unconstrained_Derived is new
     BC51006_2 (BC51006_0.New_Node);                                  -- OK.

   package Tagged_Ancestor is new
     BC51006_2 (BC51006_0.Node);                                      -- OK.

   package Tagged_Constrained_Subtype is new
     BC51006_2 (BC51006_0.Len15_Node);                                -- ERROR:
                                                         -- Actual constrained.

   package Tagged_Constrained_Derived is new
     BC51006_2 (BC51006_0.List_Node);                                 -- ERROR:
                                                         -- Actual constrained.

begin
   null;
end BC51006;
