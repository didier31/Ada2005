-- BC51005.A
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
--      part, if the ancestor subtype is an unconstrained access or record
--      subtype, the actual subtype must be unconstrained.
--
-- TEST DESCRIPTION:
--      For each type category considered, two unconstrained types are
--      declared, one with defaulted discriminants and one without, which will
--      serve as ancestor types in formal derived type declarations. Next,
--      various constrained and unconstrained subtypes are declared which will
--      be passed as actuals. The unconstrained subtypes are as follows:
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
--      28 Feb 96   SAIC    ACVC 2.0.1 fixes: In declaration of subtype
--                          Ten_Num, changed subtype mark from Msg_Type to
--                          List_Type.
--
--!

package BC51005_0 is  -- Type definitions.

--
-- Support declarations:
--

   subtype Msg_Len is Natural range 0 .. 50;

   subtype Number is Positive range 1 .. 10;
   type Number_List is array (Number range <>) of Integer;

--
-- Record Types :
--

   type Msg_Type (Len : Msg_Len := 20) is record    -- Unconstrained record
      Text : String(1 .. Len);                      -- (ancestor) type with
   end record;                                      -- defaulted discriminants.

   subtype My_Messages is Msg_Type;                 -- Unconstrained record
                                                    -- subtype.

   subtype Msg_Len6 is Msg_Type(6);                 -- Constrained record
                                                    -- subtype.

   type Msg_Len50 is new Msg_Type(Msg_Len'Last);    -- Constrained record
                                                    -- derived type (derived
                                                    -- from "ancestor" type).


   type List_Type (Num : Number) is record          -- Unconstrained record
      Numbers : Number_List(1 .. Num);              -- (ancestor) type with
   end record;                                      -- undefaulted discrim.

   type My_List is new List_Type;                   -- Unconstrained record
                                                    -- derived type.

   subtype Ten_Num is List_Type(Number'Last);       -- Constrained record
                                                    -- subtype.

   type My_Ten_Num is new Ten_Num;                  -- Constrained record
                                                    -- derived type (derived
                                                    -- from constr. subtype).

--
-- Access Types :
--

   type Msg_Ptr is access Msg_Type;                 -- Unconstrained access
                                                    -- (ancestor) type.

   type New_Msg_Ptr is new Msg_Ptr;                 -- Unconstrained access
                                                    -- derived type.

   subtype Msg_Len6_Ptr is Msg_Ptr(6);              -- Constrained access
                                                    -- subtype.

   type Msg_Len8_Ptr is new Msg_Ptr(8);             -- Constrained access
                                                    -- derived type (derived
                                                    -- from "ancestor" type).


end BC51005_0;

-- No body for BC51005_0.


     --==================================================================--


with BC51005_0;  -- Type definitions.
generic
   type Record_Dflt_Unconstrained_Subtype is new BC51005_0.Msg_Type;
package BC51005_1 is
end BC51005_1;

-- No body for BC51005_1.


     --==================================================================--


with BC51005_0;  -- Type definitions.
generic
   type Record_NoDflt_Unconstrained_Subtype is new BC51005_0.List_Type;
package BC51005_2 is
end BC51005_2;

-- No body for BC51005_2.


     --==================================================================--


with BC51005_0;  -- Type definitions.
generic
   type Access_Unconstrained_Subtype is new BC51005_0.Msg_Ptr;
package BC51005_3 is
end BC51005_3;

-- No body for BC51005_3.


     --==================================================================--


with BC51005_0;  -- Type definitions.
with BC51005_1;  -- Defaulted record formal types.
with BC51005_2;  -- Undefaulted record formal types.
with BC51005_3;  -- Access formal types.
procedure BC51005 is

--
-- Record Types :
--

   package Record_Dflt_Unconstrained_Subtype is new
     BC51005_1 (BC51005_0.My_Messages);                               -- OK.
 

   package Record_Dflt_Ancestor is new
     BC51005_1 (BC51005_0.Msg_Type);                                  -- OK.

 
   package Record_Dflt_Constrained_Subtype is new
     BC51005_1 (BC51005_0.Msg_Len6);                                  -- ERROR:
                                                         -- Actual constrained.

   package Record_Dflt_Constrained_Derived is new
     BC51005_1 (BC51005_0.Msg_Len50);                                 -- ERROR:
                                                         -- Actual constrained.



   package Record_NoDflt_Unconstrained_Derived is new
     BC51005_2 (BC51005_0.My_List);                                   -- OK.


   package Record_NoDflt_Ancestor is new
     BC51005_2 (BC51005_0.List_Type);                                 -- OK.


   package Record_NoDflt_Constrained_Subtype is new
     BC51005_2 (BC51005_0.Ten_Num);                                   -- ERROR:
                                                         -- Actual constrained.

   package Record_NoDflt_Constrained_Derived is new
     BC51005_2 (BC51005_0.My_Ten_Num);                                -- ERROR:
                                                         -- Actual constrained.


--
-- Access Types :
--

   package Access_Unconstrained_Derived is new
     BC51005_3 (BC51005_0.New_Msg_Ptr);                               -- OK.


   package Access_Ancestor is new
     BC51005_3 (BC51005_0.Msg_Ptr);                                   -- OK.


   package Access_Constrained_Subtype is new
     BC51005_3 (BC51005_0.Msg_Len6_Ptr);                              -- ERROR:
                                                         -- Actual constrained.

   package Access_Constrained_Derived is new
     BC51005_3 (BC51005_0.Msg_Len8_Ptr);                              -- ERROR:
                                                         -- Actual constrained.

begin
   null;
end BC51005;
