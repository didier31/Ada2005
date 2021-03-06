-- B641001.A
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
--      Check that the actual parameter corresponding to a formal parameter of
--      mode in out or out must denote a variable; in particular, that it may
--      not be a dereference of an access-to-constant value. Check for the
--      cases where the value is of a generic formal access-to-constant type,
--      or of a non-formal access-to-constant type declared within a formal
--      package.
--
-- TEST DESCRIPTION:
--      A dereference of an access-to-constant value is a constant.
--
--      This test checks that implicit and explicit dereferences of a value of
--      a generic formal access-to-constant type may not be passed as actuals
--      to formal parameters of mode out or in out. Three scenarios are tested:
--
--         (1) The designated type is non-private (thus, the components of
--             the designated type are known to the generic), and the formal
--             access-to-constant type is part of the generic in which the
--             parameter passing is attempted.
--
--         (2) The designated type is private (the components of the designated
--             type are not known to the generic), and the formal access-to-
--             constant type is declared in a formal package.
--
--         (3) The designated type is non-private, and the (non-formal)
--             access-to-constant type is declared within a formal package.
--
--      As appropriate for access-to-constant objects in each of the above
--      scenarios, attempts are made to pass the access object (legal), a
--      dereference denoting the designated object (illegal), and a dereference
--      denoting a component of the designated object (illegal). The objects
--      passed result from both direct references to and dereferences of
--      stand-alone objects (allocated both dynamically and statically),
--      generic formal objects, and formal (subprogram) parameters.
--      
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--
--!

package B641001_0 is

   type Component is range 0 .. 10;

   type Designated is record
      Item : Component := 0;
   end record;

   type Acc_Constant is access constant Designated;

   Rec : aliased Designated;

end B641001_0;


     --===================================================================--


with B641001_0;
generic                                                   -- Template for
                                                          -- formal package.
   type FP_Formal_Des is private;
   type FP_Formal_Acc is access constant FP_Formal_Des;

   FP_Formal_Obj : in out FP_Formal_Acc;

package B641001_1 is

   Priv : aliased FP_Formal_Des;


   type FP_Local_Desig is tagged record
      Item : B641001_0.Component := 5;
   end record;

   type FP_Local_Acc is access constant FP_Local_Desig;

   Tag : aliased FP_Local_Desig;

end B641001_1;


     --===================================================================--


with B641001_0;
with B641001_1;
generic                                                   -- Generic in which
                                                          -- illegal calls
   with package Formal_Pack is new B641001_1 (<>);        -- are attempted.

   type Acc_Type is access constant B641001_0.Designated;

   Local_Form_Obj  : in out Acc_Type;
   FP_Loc_Form_Obj : in out Formal_Pack.FP_Local_Acc;

package B641001 is

--
-- Declarations using formal type local to B641001:
--

   procedure Local_Calls (Acc_Parm : in out Acc_Type);


   Local_Stat : Acc_Type := B641001_0.Rec'Access;
   Local_Dyna : Acc_Type := new B641001_0.Designated'(B641001_0.Rec);

   Loc_DVar   : B641001_0.Designated;
   Loc_CVar   : B641001_0.Component := 2;


   procedure Local_Acc_Op (P_In    : in     Acc_Type;
                           P_InOut : in out Acc_Type;
                           P_Out   :    out Acc_Type);
                       
   procedure Local_Des_Op (P_In    : in     B641001_0.Designated;
                           P_InOut : in out B641001_0.Designated;
                           P_Out   :    out B641001_0.Designated);
                       
   procedure Local_Cmp_Op (P_In    : in     B641001_0.Component;
                           P_InOut : in out B641001_0.Component;
                           P_Out   :    out B641001_0.Component);
                       

--
-- Declarations using formal type of Formal_Pack:
--

   procedure FP_Formal_Calls (Acc_Parm : in out Formal_Pack.FP_Formal_Acc);


   FP_Form_Stat : Formal_Pack.FP_Formal_Acc := 
                  Formal_Pack.Priv'Access;
   FP_Form_Dyna : Formal_Pack.FP_Formal_Acc :=
                  new Formal_Pack.FP_Formal_Des'(Formal_Pack.Priv);

   FP_Form_DVar : Formal_Pack.FP_Formal_Des;


   procedure FP_Form_Acc_Op (P_In    : in     Formal_Pack.FP_Formal_Acc;
                             P_InOut : in out Formal_Pack.FP_Formal_Acc;
                             P_Out   :    out Formal_Pack.FP_Formal_Acc);
                       
   procedure FP_Form_Des_Op (P_In    : in     Formal_Pack.FP_Formal_Des;
                             P_InOut : in out Formal_Pack.FP_Formal_Des;
                             P_Out   :    out Formal_Pack.FP_Formal_Des);


--
-- Declarations using type declared within Formal_Pack:
--

   procedure FP_Local_Calls (Acc_Parm : in out Formal_Pack.FP_Local_Acc);


   FP_Local_Stat : Formal_Pack.FP_Local_Acc :=
                   Formal_Pack.Tag'Access;
   FP_Local_Dyna : Formal_Pack.FP_Local_Acc :=
                   new Formal_Pack.FP_Local_Desig'(Formal_Pack.Tag);

   FP_Loc_DVar   : Formal_Pack.FP_Local_Desig;
   FP_Loc_CVar   : B641001_0.Component := 5;


   procedure FP_Loc_Acc_Op (P_In    : in     Formal_Pack.FP_Local_Acc;
                            P_InOut : in out Formal_Pack.FP_Local_Acc;
                            P_Out   :    out Formal_Pack.FP_Local_Acc);

   procedure FP_Loc_Des_Op (P_In    : in     Formal_Pack.FP_Local_Desig;
                            P_InOut : in out Formal_Pack.FP_Local_Desig;
                            P_Out   :    out Formal_Pack.FP_Local_Desig);

   procedure FP_Loc_Cmp_Op (P_In    : in     B641001_0.Component;
                            P_InOut : in out B641001_0.Component;
                            P_Out   :    out B641001_0.Component);

end B641001;


     --===================================================================--


package body B641001 is

--
-- Null bodies for declared subprograms (bodies not needed for test):
--

   procedure Local_Acc_Op (P_In    : in     Acc_Type;
                           P_InOut : in out Acc_Type;
                           P_Out   :    out Acc_Type) is 
   begin
      null;
   end Local_Acc_Op;


   procedure Local_Des_Op (P_In    : in     B641001_0.Designated;
                           P_InOut : in out B641001_0.Designated;
                           P_Out   :    out B641001_0.Designated) is
   begin
      null;
   end Local_Des_Op;
                       

   procedure Local_Cmp_Op (P_In    : in     B641001_0.Component;
                           P_InOut : in out B641001_0.Component;
                           P_Out   :    out B641001_0.Component) is
   begin
      null;
   end Local_Cmp_Op;
                       

   procedure FP_Form_Acc_Op (P_In    : in     Formal_Pack.FP_Formal_Acc;
                             P_InOut : in out Formal_Pack.FP_Formal_Acc;
                             P_Out   :    out Formal_Pack.FP_Formal_Acc) is
   begin
      null;
   end FP_Form_Acc_Op;
                       

   procedure FP_Form_Des_Op (P_In    : in     Formal_Pack.FP_Formal_Des;
                             P_InOut : in out Formal_Pack.FP_Formal_Des;
                             P_Out   :    out Formal_Pack.FP_Formal_Des) is
   begin
      null;
   end FP_Form_Des_Op;


   procedure FP_Loc_Acc_Op (P_In    : in     Formal_Pack.FP_Local_Acc;
                            P_InOut : in out Formal_Pack.FP_Local_Acc;
                            P_Out   :    out Formal_Pack.FP_Local_Acc) is
   begin
      null;
   end FP_Loc_Acc_Op;


   procedure FP_Loc_Des_Op (P_In    : in     Formal_Pack.FP_Local_Desig;
                            P_InOut : in out Formal_Pack.FP_Local_Desig;
                            P_Out   :    out Formal_Pack.FP_Local_Desig) is
   begin
      null;
   end FP_Loc_Des_Op;


   procedure FP_Loc_Cmp_Op (P_In    : in     B641001_0.Component;
                            P_InOut : in out B641001_0.Component;
                            P_Out   :    out B641001_0.Component) is
   begin
      null;
   end FP_Loc_Cmp_Op;



--
-- Bodies for subprograms which attempt illegal parameter-passing:
--

   procedure Local_Calls (Acc_Parm : in out Acc_Type) is
   begin

   --
   -- Actual parameter is of access-to-constant type:
   --

      -- Interested primarily in last two parameter positions;
      -- use B641001_0.Rec'Access as "placeholder" for first parameter:

      Local_Acc_Op (B641001_0.Rec'Access, Local_Stat, Local_Dyna);    -- OK.
      Local_Acc_Op (B641001_0.Rec'Access, Local_Form_Obj, Acc_Parm);  -- OK.


   --
   -- Actual parameter is of designated type (explicit dereference):
   --

      -- Use Loc_DVar as "placeholder" when not checking a particular
      -- parameter:

      Local_Des_Op (Local_Stat.all, Loc_DVar, Loc_DVar);              -- OK.
      Local_Des_Op (Loc_DVar, Local_Stat.all, Loc_DVar);              -- ERROR:
      Local_Des_Op (Loc_DVar, Loc_DVar, Local_Stat.all);              -- ERROR:

      Local_Des_Op (Local_Dyna.all, Loc_DVar, Loc_DVar);              -- OK.
      Local_Des_Op (Loc_DVar, Local_Dyna.all, Loc_DVar);              -- ERROR:
      Local_Des_Op (Loc_DVar, Loc_DVar, Local_Dyna.all);              -- ERROR:

      Local_Des_Op (Local_Form_Obj.all, Loc_DVar, Loc_DVar);          -- OK.
      Local_Des_Op (Loc_DVar, Local_Form_Obj.all, Loc_DVar);          -- ERROR:
      Local_Des_Op (Loc_DVar, Loc_DVar, Local_Form_Obj.all);          -- ERROR:

      Local_Des_Op (Acc_Parm.all, Loc_DVar, Loc_DVar);                -- OK.
      Local_Des_Op (Loc_DVar, Acc_Parm.all, Loc_DVar);                -- ERROR:
      Local_Des_Op (Loc_DVar, Loc_DVar, Acc_Parm.all);                -- ERROR:


   --
   -- Actual parameter is of component type (implicit dereference):
   --

      -- Use Loc_CVar as "placeholder" when not checking a particular
      -- parameter:

      Local_Cmp_Op (Local_Stat.Item, Loc_CVar, Loc_CVar);             -- OK.
      Local_Cmp_Op (Loc_CVar, Local_Stat.Item, Loc_CVar);             -- ERROR:
      Local_Cmp_Op (Loc_CVar, Loc_CVar, Local_Stat.Item);             -- ERROR:

      Local_Cmp_Op (Local_Dyna.Item, Loc_CVar, Loc_CVar);             -- OK.
      Local_Cmp_Op (Loc_CVar, Local_Dyna.Item, Loc_CVar);             -- ERROR:
      Local_Cmp_Op (Loc_CVar, Loc_CVar, Local_Dyna.Item);             -- ERROR:

      Local_Cmp_Op (Local_Form_Obj.Item, Loc_CVar, Loc_CVar);         -- OK.
      Local_Cmp_Op (Loc_CVar, Local_Form_Obj.Item, Loc_CVar);         -- ERROR:
      Local_Cmp_Op (Loc_CVar, Loc_CVar, Local_Form_Obj.Item);         -- ERROR:

      Local_Cmp_Op (Acc_Parm.Item, Loc_CVar, Loc_CVar);               -- OK.
      Local_Cmp_Op (Loc_CVar, Acc_Parm.Item, Loc_CVar);               -- ERROR:
      Local_Cmp_Op (Loc_CVar, Loc_CVar, Acc_Parm.Item);               -- ERROR:

   end Local_Calls;



--
-- Subprogram with parameters of formal type of Formal_Pack:
--

   procedure FP_Formal_Calls (Acc_Parm : in out Formal_Pack.FP_Formal_Acc) is
      use Formal_Pack;
   begin

   --
   -- Actual parameter is of access-to-constant type:
   --

      -- Interested primarily in last two parameter positions;
      -- use Priv'Access as "placeholder" for first parameter:

      FP_Form_Acc_Op (Priv'Access, FP_Form_Stat, FP_Form_Dyna);       -- OK.
      FP_Form_Acc_Op (Priv'Access, FP_Formal_Obj, Acc_Parm);          -- OK.


   --
   -- Actual parameter is of designated type (explicit dereference):
   --

      -- Use FP_Form_DVar as "placeholder" when not checking a particular
      -- parameter:

      FP_Form_Des_Op (FP_Form_Stat.all, FP_Form_DVar, FP_Form_DVar);  -- OK.
      FP_Form_Des_Op (FP_Form_DVar, FP_Form_Stat.all, FP_Form_DVar);  -- ERROR:
      FP_Form_Des_Op (FP_Form_DVar, FP_Form_DVar, FP_Form_Stat.all);  -- ERROR:

      FP_Form_Des_Op (FP_Form_Dyna.all, FP_Form_DVar, FP_Form_DVar);  -- OK.
      FP_Form_Des_Op (FP_Form_DVar, FP_Form_Dyna.all, FP_Form_DVar);  -- ERROR:
      FP_Form_Des_Op (FP_Form_DVar, FP_Form_DVar, FP_Form_Dyna.all);  -- ERROR:

      FP_Form_Des_Op (FP_Formal_Obj.all, FP_Form_DVar, FP_Form_DVar); -- OK.
      FP_Form_Des_Op (FP_Form_DVar, FP_Formal_Obj.all, FP_Form_DVar); -- ERROR:
      FP_Form_Des_Op (FP_Form_DVar, FP_Form_DVar, FP_Formal_Obj.all); -- ERROR:

      FP_Form_Des_Op (Acc_Parm.all, FP_Form_DVar, FP_Form_DVar);      -- OK.
      FP_Form_Des_Op (FP_Form_DVar, Acc_Parm.all, FP_Form_DVar);      -- ERROR:
      FP_Form_Des_Op (FP_Form_DVar, FP_Form_DVar, Acc_Parm.all);      -- ERROR:

   end FP_Formal_Calls;



--
-- Subprogram with parameters of type declared in Formal_Pack:
--

   procedure FP_Local_Calls (Acc_Parm : in out Formal_Pack.FP_Local_Acc) is
      use Formal_Pack;
   begin

   --
   -- Actual parameter is of access-to-constant type:
   --

      -- Interested primarily in last two parameter positions;
      -- use Tag'Access as "placeholder" for first parameter:

      FP_Loc_Acc_Op (Tag'Access, FP_Local_Stat, FP_Local_Dyna);       -- OK.
      FP_Loc_Acc_Op (Tag'Access, FP_Loc_Form_Obj, Acc_Parm);          -- OK.


   --
   -- Actual parameter is of designated type (explicit dereference):
   --

      -- Use FP_Loc_DVar as "placeholder" when not checking a particular
      -- parameter:

      FP_Loc_Des_Op (FP_Local_Stat.all, FP_Loc_DVar, FP_Loc_DVar);    -- OK.
      FP_Loc_Des_Op (FP_Loc_DVar, FP_Local_Stat.all, FP_Loc_DVar);    -- ERROR:
      FP_Loc_Des_Op (FP_Loc_DVar, FP_Loc_DVar, FP_Local_Stat.all);    -- ERROR:

      FP_Loc_Des_Op (FP_Local_Dyna.all, FP_Loc_DVar, FP_Loc_DVar);    -- OK.
      FP_Loc_Des_Op (FP_Loc_DVar, FP_Local_Dyna.all, FP_Loc_DVar);    -- ERROR:
      FP_Loc_Des_Op (FP_Loc_DVar, FP_Loc_DVar, FP_Local_Dyna.all);    -- ERROR:

      FP_Loc_Des_Op (FP_Loc_Form_Obj.all, FP_Loc_DVar, FP_Loc_DVar);  -- OK.
      FP_Loc_Des_Op (FP_Loc_DVar, FP_Loc_Form_Obj.all, FP_Loc_DVar);  -- ERROR:
      FP_Loc_Des_Op (FP_Loc_DVar, FP_Loc_DVar, FP_Loc_Form_Obj.all);  -- ERROR:

      FP_Loc_Des_Op (Acc_Parm.all, FP_Loc_DVar, FP_Loc_DVar);         -- OK.
      FP_Loc_Des_Op (FP_Loc_DVar, Acc_Parm.all, FP_Loc_DVar);         -- ERROR:
      FP_Loc_Des_Op (FP_Loc_DVar, FP_Loc_DVar, Acc_Parm.all);         -- ERROR:


   --
   -- Actual parameter is of component type (implicit dereference):
   --

      -- Use FP_Loc_CVar as "placeholder" when not checking a particular
      -- parameter:

      FP_Loc_Cmp_Op (FP_Local_Stat.Item, FP_Loc_CVar, FP_Loc_CVar);   -- OK.
      FP_Loc_Cmp_Op (FP_Loc_CVar, FP_Local_Stat.Item, FP_Loc_CVar);   -- ERROR:
      FP_Loc_Cmp_Op (FP_Loc_CVar, FP_Loc_CVar, FP_Local_Stat.Item);   -- ERROR:

      FP_Loc_Cmp_Op (FP_Local_Dyna.Item, FP_Loc_CVar, FP_Loc_CVar);   -- OK.
      FP_Loc_Cmp_Op (FP_Loc_CVar, FP_Local_Dyna.Item, FP_Loc_CVar);   -- ERROR:
      FP_Loc_Cmp_Op (FP_Loc_CVar, FP_Loc_CVar, FP_Local_Dyna.Item);   -- ERROR:

      FP_Loc_Cmp_Op (FP_Loc_Form_Obj.Item, FP_Loc_CVar, FP_Loc_CVar); -- OK.
      FP_Loc_Cmp_Op (FP_Loc_CVar, FP_Loc_Form_Obj.Item, FP_Loc_CVar); -- ERROR:
      FP_Loc_Cmp_Op (FP_Loc_CVar, FP_Loc_CVar, FP_Loc_Form_Obj.Item); -- ERROR:

      FP_Loc_Cmp_Op (Acc_Parm.Item, FP_Loc_CVar, FP_Loc_CVar);        -- OK.
      FP_Loc_Cmp_Op (FP_Loc_CVar, Acc_Parm.Item, FP_Loc_CVar);        -- ERROR:
      FP_Loc_Cmp_Op (FP_Loc_CVar, FP_Loc_CVar, Acc_Parm.Item);        -- ERROR:

   end FP_Local_Calls;


end B641001;
