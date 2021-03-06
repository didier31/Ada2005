-- BC51C02.A
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
--      Check that the actual type passed to an abstract generic formal
--      private type may be either abstract or non-abstract, as may
--      record and private extensions of the formal type. Check that,
--      for a non-abstract type derived from an abstract formal private type,
--      all abstract primitive subprograms inherited from the actual type must
--      be overridden in the instance.
--
-- TEST DESCRIPTION:
--      The actual corresponding to an abstract formal type may be either
--      abstract or non-abstract. Record and private extensions of the formal
--      private type may be either abstract or non-abstract.
--
--      In an instance, all abstract primitive subprograms of the actual
--      type must be overridden for non-abstract extensions, as well as
--      any functions with a controlling result if the extensions are not
--      null extensions.
--
-- TEST FILES:
--      This test consists of the following files:
--
--         FC51C00.A
--      -> BC51C02.A
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--      04 Mar 96   SAIC    ACVC 2.0.1 fixes: Moved all subprograms in
--                          PriExt_Overrides_Explicit and PriExt_Overrides_All
--                          from private to visible part. Added Func to private
--                          part of PriExt_Overrides_Explicit. Added
--                          commentary.
--      11 Aug 96   SAIC    ACVC 2.1: Updated prologue. Corrected position of
--                          ERROR comments.
--      01 Jun 98   EDS     Remove Function Func from private part of package
--                          PriExt_Overrides_Explicit.
--      22 Mar 07   RLB     Corrected to avoid problems with 3.9.3(4/2);
--                          updated terminology.
--!

with FC51C00;
package BC51C02_0 is

-- Check that both abstract and non-abstract actual types may be passed to
-- an abstract formal private type.
--
-- Check that record and private extensions of an abstract formal private
-- type may be abstract.

   generic
      type Formal_Private is abstract tagged private;
   package Formal_Private_Parm is
      type Rec_Ext  is abstract new Formal_Private with
        record
          B : Boolean;
        end record;                                                   -- OK.
      type Priv_Ext is abstract new Formal_Private with private;      -- OK.
   private
      type Priv_Ext is abstract new Formal_Private with
        record
          B : Boolean;
        end record;                                                   -- OK.
   end Formal_Private_Parm;


   package Concrete_Actual is new Formal_Private_Parm
     (FC51C00.Concrete_Root);                                         -- OK.

   package Abstract_Actual is new Formal_Private_Parm
     (FC51C00.Abstract_Child);                                        -- OK.


end BC51C02_0;


     --===================================================================--


package BC51C02_1 is

-- Check that a type derived from an abstract formal private type may be
-- either abstract or non-abstract.


-- Within each generic below, a non-abstract type is derived from the
-- formal type.
--
-- When each generic is instantiated with an abstract actual type, each of
-- the abstract primitive subprograms of the actual type must be overridden
-- for the derived type, or else the instantiation must be rejected.
-- Similarly, all functions with controlled results must be overridden
-- for the derived type.
--
-- Each of the generics below will be instantiated with the abstract type
-- FC51C00.Abstract_Child. Each generic overrides some set of the abstract
-- primitive subprograms of this actual type:
--
--     (1) *_No_Overrides does not override any of the primitive subprograms
--         of the actual.
--     (2) *_Overrides_Explicit only overrides the procedures which are
--         explicitly declared as abstract for the actual type; it does
--         not override the function with a controlling result.
--     (3) *_Overrides_All overrides all the abstract procedures inherited
--         as abstract from the actual, as well as the non-abstract function
--         which requires overriding when it is inherited from the actual.
--
-- For this test, the only generics for which an instantiation with the
-- abstract type FC51C00.Abstract_Child is legal are those in category (3).


--
-- Type derived from formal type is a record extension:
--

   generic
      type Formal_Private is abstract tagged private;
   package RecExt_No_Overrides is

      type Concrete_Derived is new Formal_Private with
        record
          B : Boolean;
        end record;

   end RecExt_No_Overrides;


   generic
      type Formal_Private is abstract tagged private;
   package RecExt_Overrides_Explicit is

      type Concrete_Derived is new Formal_Private with
        record
          B : Boolean;
        end record;

      procedure Proc (P: in out Concrete_Derived);
      procedure New_Proc (P: out Concrete_Derived);

   end RecExt_Overrides_Explicit;


   generic
      type Formal_Private is abstract tagged private;
   package RecExt_Overrides_All is

      type Concrete_Derived is new Formal_Private with
        record
          B : Boolean;
        end record;

      procedure Proc (P: in out Concrete_Derived);
      procedure New_Proc (P: out Concrete_Derived);

      function Func (P: Concrete_Derived) return Concrete_Derived;

   end RecExt_Overrides_All;


--
-- Type derived from formal type is a private extension:
--

   generic
      type Formal_Private is abstract tagged private;
   package PriExt_No_Overrides is

      type Concrete_Derived is new Formal_Private with private;

   private

      type Concrete_Derived is new Formal_Private with
        record
          B : Boolean;
        end record;

   end PriExt_No_Overrides;


   generic
      type Formal_Private is abstract tagged private;
   package PriExt_Overrides_Explicit is

      type Concrete_Derived is new Formal_Private with private;

      procedure Proc (P: in out Concrete_Derived);
      procedure New_Proc (P: out Concrete_Derived);

   private

      type Concrete_Derived is new Formal_Private with
        record
          B : Boolean;
        end record;

   end PriExt_Overrides_Explicit;


   generic
      type Formal_Private is abstract tagged private;
   package PriExt_Overrides_All is

      type Concrete_Derived is new Formal_Private with private;

      procedure Proc (P: in out Concrete_Derived);
      procedure New_Proc (P: out Concrete_Derived);

      function Func (P: Concrete_Derived) return Concrete_Derived;

   private

      type Concrete_Derived is new Formal_Private with
        record
          B : Boolean;
        end record;

   end PriExt_Overrides_All;


end BC51C02_1;


     --===================================================================--


package body BC51C02_1 is

   package body RecExt_Overrides_Explicit is

      procedure Proc (P: in out Concrete_Derived) is
      begin
         null;
      end Proc;

      procedure New_Proc (P: out Concrete_Derived) is
      begin
         null;
      end New_Proc;

   end RecExt_Overrides_Explicit;


   package body RecExt_Overrides_All is

      procedure Proc (P: in out Concrete_Derived) is
      begin
         null;
      end Proc;

      procedure New_Proc (P: out Concrete_Derived) is
      begin
         null;
      end New_Proc;

      function Func (P: Concrete_Derived) return Concrete_Derived is
      begin
         return P;
      end Func;

   end RecExt_Overrides_All;


   package body PriExt_Overrides_Explicit is

      procedure Proc (P: in out Concrete_Derived) is
      begin
         null;
      end Proc;

      procedure New_Proc (P: out Concrete_Derived) is
      begin
         null;
      end New_Proc;

   end PriExt_Overrides_Explicit;


   package body PriExt_Overrides_All is

      procedure Proc (P: in out Concrete_Derived) is
      begin
         null;
      end Proc;

      procedure New_Proc (P: out Concrete_Derived) is
      begin
         null;
      end New_Proc;

      function Func (P: Concrete_Derived) return Concrete_Derived is
      begin
         return P;
      end Func;

   end PriExt_Overrides_All;

end BC51C02_1;


     --===================================================================--


with FC51C00;
with BC51C02_1;
package BC51C02 is

--
-- Generics which declare a record extension of the formal private type:
--

   package Instance01 is new BC51C02_1.RecExt_No_Overrides
     (FC51C00.Abstract_Child);                                        -- ERROR:
                            -- Derived type in instance has primitive
                            -- subprograms that require overriding (Proc,
			    -- New_Proc, Func).


   package Instance02 is new BC51C02_1.RecExt_Overrides_Explicit
     (FC51C00.Abstract_Child);                                        -- ERROR:
                            -- Derived type in instance has a primitive
                            -- subprogram that requires overriding (Func).


   package Instance03 is new BC51C02_1.RecExt_Overrides_All
     (FC51C00.Abstract_Child);                                        -- OK.



--
-- Generics which declare a record extension of the formal private type:
--

   package Instance04 is new BC51C02_1.PriExt_No_Overrides
     (FC51C00.Abstract_Child);                                        -- ERROR:
                            -- Derived type in instance has primitive
                            -- subprograms that require overriding (Proc,
			    -- New_Proc, Func).


   package Instance05 is new BC51C02_1.PriExt_Overrides_Explicit
     (FC51C00.Abstract_Child);                                        -- ERROR:
                            -- Derived type in instance has a primitive
                            -- subprogram that requires overriding (Func).


   package Instance06 is new BC51C02_1.PriExt_Overrides_All
     (FC51C00.Abstract_Child);                                        -- OK.


end BC51C02;
