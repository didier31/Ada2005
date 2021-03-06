-- B3A0003.A
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
--      Check that a designated object cannot be updated through a value of
--      an access-to-constant type. Check for the cases where the access-to-
--      constant type is a generic formal type, or a non-formal type declared
--      within a formal package.
--
-- TEST DESCRIPTION:
--      An object is considered to be updated if the object or any of its
--      components, or an enclosing object, is the target of an assignment.
--
--      This test checks that the designated object of a value of a generic
--      formal access-to-constant type may not be updated through the value.
--      Three scenarios are tested:
--
--         (1) The designated type is non-private (thus, the components of
--             the designated type are known to the generic), and the formal
--             access-to-constant type is part of the generic in which the
--             assignment is attempted.
--
--         (2) The designated type is private (the components of the designated
--             type are not known to the generic), and the formal access-to-
--             constant type is declared in a formal package.
--
--         (3) The designated type is non-private, and the (non-formal)
--             access-to-constant type is declared within a formal package.
--
--      As appropriate for access-to-constant objects in each of the above
--      scenarios, attempts are made to assign to the access object (legal),
--      the designated object (illegal), and a component of the designated
--      object (illegal). The targets of assignment are both direct references
--      to and dereferences of stand-alone objects, generic formal objects,
--      and formal (subprogram) parameters.
--      
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--
--!

package B3A0003_0 is

   type Component is range 0 .. 10;

   type Designated is record
      Item : Component := 0;
   end record;

   type Acc_Constant is access constant Designated;

   Rec : aliased Designated;

end B3A0003_0;


     --===================================================================--


with B3A0003_0;
generic                                                   -- Template for
                                                          -- formal package.
   type FP_Formal_Desig is private;
   type FP_Formal_Acc is access constant FP_Formal_Desig;

   FP_Formal_Obj : in out FP_Formal_Acc;

package B3A0003_1 is

   Priv : aliased FP_Formal_Desig;


   type FP_Local_Desig is tagged record
      Item : B3A0003_0.Component := 5;
   end record;

   type FP_Local_Acc is access constant FP_Local_Desig;

   Tag : aliased FP_Local_Desig;

end B3A0003_1;


     --===================================================================--


with B3A0003_0;
with B3A0003_1;
generic                                                   -- Generic in which
                                                          -- illegal updating
   with package Formal_Package is new B3A0003_1 (<>);     -- is attempted.

   type Acc_Type is access constant B3A0003_0.Designated;

   Local_Formal_Obj    : in out Acc_Type;
   FP_Local_Formal_Obj : in out Formal_Package.FP_Local_Acc;

package B3A0003 is

--
-- Declarations using formal type local to B3A0003:
--

   Local_AC  : Acc_Type;
   Local_Val : Acc_Type := B3A0003_0.Rec'Access;

   procedure Local_Op (Acc_Parm : in out Acc_Type);


--
-- Declarations using formal type of Formal_Package:
--

   FP_Formal_AC  : Formal_Package.FP_Formal_Acc;
   FP_Formal_Val : Formal_Package.FP_Formal_Acc := Formal_Package.Priv'Access;

   procedure FP_Formal_Op (Acc_Parm : in out Formal_Package.FP_Formal_Acc);


--
-- Declarations using type declared within Formal_Package:
--

   FP_Local_AC  : Formal_Package.FP_Local_Acc;
   FP_Local_Val : Formal_Package.FP_Local_Acc := Formal_Package.Tag'Access;

   procedure FP_Local_Op (Acc_Parm : in out Formal_Package.FP_Local_Acc);

end B3A0003;


     --===================================================================--


package body B3A0003 is

--
-- Subprogram with parameters of formal type local to B3A0003:
--

   procedure Local_Op (Acc_Parm : in out Acc_Type) is
   begin

   --
   -- Update of access object:
   --

      Local_AC         := Local_Val;                                  -- OK.
      Local_Formal_Obj := Local_Val;                                  -- OK.
      Acc_Parm         := Local_Val;                                  -- OK.


   --
   -- Update of designated object (explicit dereference):
   --

      Local_AC.all         := Local_Val.all;                          -- ERROR:
      Local_Formal_Obj.all := Local_Val.all;                          -- ERROR:
      Acc_Parm.all         := Local_Val.all;                          -- ERROR:


   --
   -- Update of component of designated object (implicit dereference):
   --

      Local_AC.Item         := Local_Val.Item;                        -- ERROR:
      Local_Formal_Obj.Item := Local_Val.Item;                        -- ERROR:
      Acc_Parm.Item         := Local_Val.Item;                        -- ERROR:

   end Local_Op;



--
-- Subprogram with parameters of formal type of Formal_Package:
--

   procedure FP_Formal_Op (Acc_Parm : in out Formal_Package.FP_Formal_Acc) is
   begin

   --
   -- Update of access object:
   --

      FP_Formal_AC                 := FP_Formal_Val;                  -- OK.
      Formal_Package.FP_Formal_Obj := FP_Formal_Val;                  -- OK.
      Acc_Parm                     := FP_Formal_Val;                  -- OK.


   --
   -- Update of designated object (explicit dereference):
   --

      FP_Formal_AC.all                 := FP_Formal_Val.all;          -- ERROR:
      Formal_Package.FP_Formal_Obj.all := FP_Formal_Val.all;          -- ERROR:
      Acc_Parm.all                     := FP_Formal_Val.all;          -- ERROR:

   end FP_Formal_Op;


--
-- Subprogram with parameters of type declared in Formal_Package:
--

   procedure FP_Local_Op (Acc_Parm : in out Formal_Package.FP_Local_Acc) is
   begin

   --
   -- Update of access object:
   --

      FP_Local_AC         := FP_Local_Val;                            -- OK.
      FP_Local_Formal_Obj := FP_Local_Val;                            -- OK.
      Acc_Parm            := FP_Local_Val;                            -- OK.


   --
   -- Update of designated object (explicit dereference):
   --

      FP_Local_AC.all         := FP_Local_Val.all;                    -- ERROR:
      FP_Local_Formal_Obj.all := FP_Local_Val.all;                    -- ERROR:
      Acc_Parm.all            := FP_Local_Val.all;                    -- ERROR:


   --
   -- Update of component of designated object (implicit dereference):
   --

      FP_Local_AC.Item         := FP_Local_Val.Item;                  -- ERROR:
      FP_Local_Formal_Obj.Item := FP_Local_Val.Item;                  -- ERROR:
      Acc_Parm.Item            := FP_Local_Val.Item;                  -- ERROR:

   end FP_Local_Op;

end B3A0003;
