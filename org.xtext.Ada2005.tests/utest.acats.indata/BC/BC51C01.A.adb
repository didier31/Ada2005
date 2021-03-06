-- BC51C01.A
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
--      derived type may be either abstract or non-abstract, as may
--      record and private extensions of the formal type. Check that,
--      for a non-abstract type derived from an abstract formal derived type,
--      all abstract primitive subprograms inherited from the actual type must
--      be overridden in the instance.
--
-- TEST DESCRIPTION:
--      The actual corresponding to an abstract formal type may be either
--      abstract or non-abstract. 
--
--      Record and private extensions of the formal derived type may be
--      either abstract or non-abstract, but for non-abstract extensions the
--      abstract primitive subprograms inherited from the formal type (which,
--      in turn, have been inherited from the ancestor type) must be
--      overridden in the generic. 
--
--      Additionally, within the instance, all abstract primitive subprograms
--      of the *actual type* must be overridden for non-abstract extensions,
--      even those which are not primitive subprograms of the ancestor type.
--      
--
-- TEST FILES:
--      The following files comprise this test:
--
--         FC51C00.A
--      -> BC51C01.A
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--      03 Nov 95   SAIC    ACVC 2.0.1 fixes: Removed redundant instance
--                          cases, updated related commentary.
--      10 Apr 96   SAIC    ACVC 2.1 fixes: Moved subprograms Proc and New_Proc
--                          in PriExt_Overrides_All from private to visible
--                          part. Added Proc and New_Proc to private
--                          part of PriExt_Overrides_Inherited. Added
--                          commentary.
--
--!

with FC51C00;
package BC51C01_0 is

-- Check that both abstract and non-abstract actual types may be passed to
-- an abstract formal derived type. Check for formal derived types with both
-- abstract and non-abstract ancestor types.
--
-- Check that record and private extensions of an abstract formal derived
-- type may be abstract.

--
-- Generic formal type has non-abstract ancestor type:
--

   generic
      type Concrete_Anc is abstract new FC51C00.Concrete_Root with private;
   package Concrete_Ancestor is
      type Rec_Ext  is abstract new Concrete_Anc with null record;    -- OK.
      type Priv_Ext is abstract new Concrete_Anc with private;        -- OK.
   private
      type Priv_Ext is abstract new Concrete_Anc with null record;    -- OK.
   end Concrete_Ancestor;


   package Concrete_Actual_A is new Concrete_Ancestor
     (FC51C00.Concrete_Root);                                         -- OK.

   package Abstract_Actual_A is new Concrete_Ancestor
     (FC51C00.Abstract_Child);                                        -- OK.


--
-- Generic formal type has abstract ancestor type:
--

   generic
      type Abstract_Anc is abstract new FC51C00.Abstract_Child with private;
   package Abstract_Ancestor is
      type Rec_Ext  is abstract new Abstract_Anc with null record;    -- OK.
      type Priv_Ext is abstract new Abstract_Anc with private;        -- OK.
   private
      type Priv_Ext is abstract new Abstract_Anc with null record;    -- OK.
   end Abstract_Ancestor;


   package Abstract_Actual_B is new Abstract_Ancestor
     (FC51C00.Abstract_Child);                                        -- OK.

   package Concrete_Actual_B is new Abstract_Ancestor
     (FC51C00.Concrete_GrandChild);                                   -- OK.


end BC51C01_0;


     --===================================================================--


with FC51C00;
package BC51C01_1 is

-- Check that a type derived from an abstract formal derived type may be
-- either abstract or non-abstract.


-- Within each generic below, a non-abstract type is derived from the
-- formal type. Each abstract primitive subprogram inherited by the derived
-- type from the *ancestor* type is overridden. Thus, each generic is legal.
--
-- However, when each generic is instantiated with an abstract descendant of
-- the ancestor, each of the abstract primitive subprograms of the
-- *actual type* must be overridden for the derived type, or else the
-- instantiation must be rejected.
--
-- Each of the generics below will be instantiated with the abstract type
-- FC51C00.Abstract_Child. Each generic overrides some set of the abstract
-- primitive subprograms of this actual type:
--
--     (1) *_Overrides_Inherited only overrides the non-abstract function
--         of the ancestor which becomes abstract when inherited.
--     (2) *_Overrides_All overrides all the abstract subprograms inherited
--         as abstract from the ancestor as well as the abstract subprograms
--         that are unique to the actual type (i.e., not abstract subprograms
--         of the ancestor).
--         
-- For this test, the only generics for which an instantiation with the
-- abstract type FC51C00.Abstract_Child is legal are those in category (2).


--
-- Type derived from formal type is a record extension:
--

   generic
      type Formal_Derived is abstract new FC51C00.Concrete_Root with private;
   package RecExt_Overrides_Inherited is

      type Concrete_Derived is new Formal_Derived with null record;

   -- Inherited Func is abstract and must be overridden:
      function Func (P: Concrete_Derived) return Concrete_Derived;

   end RecExt_Overrides_Inherited;


   generic
      type Formal_Derived is abstract new FC51C00.Concrete_Root with private;
   package RecExt_Overrides_All is

      type Concrete_Derived is new Formal_Derived with null record;

   -- Inherited Func is abstract and must be overridden:
      function Func (P: Concrete_Derived) return Concrete_Derived;

      procedure Proc (P: in out Concrete_Derived);

      procedure New_Proc (P: out Concrete_Derived);

   end RecExt_Overrides_All;


--
-- Type derived from formal type is a private extension:
--

   generic
      type Formal_Derived is abstract new FC51C00.Concrete_Root with private;
   package PriExt_Overrides_Inherited is

      type Concrete_Derived is new Formal_Derived with private;

   private

      type Concrete_Derived is new Formal_Derived with null record;

   -- Inherited Func is abstract and must be overridden:
      function Func (P: Concrete_Derived) return Concrete_Derived;

   -- Proc and New_Proc below are declared in the private part. Hence, in an
   -- instance, they will not override a corresponding implicit Proc and
   -- New_Proc inherited by Concrete_Derived from the actual, because they do
   -- do not override a corresponding Proc and New_Proc in the generic:
      procedure Proc (P: in out Concrete_Derived);

      procedure New_Proc (P: out Concrete_Derived);

   end PriExt_Overrides_Inherited;


   generic
      type Formal_Derived is abstract new FC51C00.Concrete_Root with private;
   package PriExt_Overrides_All is

      type Concrete_Derived is new Formal_Derived with private;

   -- Proc and New_Proc below are declared in the visible part. Hence, unlike
   -- in PriExt_Overrides_Inherited above, in an instance they will override
   -- a corresponding implicit Proc and New_Proc inherited by Concrete_Derived
   -- from the actual, because they override a corresponding Proc and New_Proc
   -- in the generic:

      procedure Proc (P: in out Concrete_Derived);

      procedure New_Proc (P: out Concrete_Derived);

   private

      type Concrete_Derived is new Formal_Derived with null record;

   -- Inherited Func is abstract and must be overridden:
      function Func (P: Concrete_Derived) return Concrete_Derived;

   end PriExt_Overrides_All;


end BC51C01_1;


     --===================================================================--


package body BC51C01_1 is

   package body RecExt_Overrides_Inherited is

      function Func (P: Concrete_Derived) return Concrete_Derived is
      begin
         return P;
      end Func;

   end RecExt_Overrides_Inherited;


   package body RecExt_Overrides_All is

      function Func (P: Concrete_Derived) return Concrete_Derived is
      begin
         return P;
      end Func;

      procedure Proc (P: in out Concrete_Derived) is
      begin
         null;
      end Proc;

      procedure New_Proc (P: out Concrete_Derived) is
      begin
         null;
      end New_Proc;

   end RecExt_Overrides_All;


   package body PriExt_Overrides_Inherited is

      function Func (P: Concrete_Derived) return Concrete_Derived is
      begin
         return P;
      end Func;

      procedure Proc (P: in out Concrete_Derived) is
      begin
         null;
      end Proc;

      procedure New_Proc (P: out Concrete_Derived) is
      begin
         null;
      end New_Proc;

   end PriExt_Overrides_Inherited;


   package body PriExt_Overrides_All is

      function Func (P: Concrete_Derived) return Concrete_Derived is
      begin
         return P;
      end Func;

      procedure Proc (P: in out Concrete_Derived) is
      begin
         null;
      end Proc;

      procedure New_Proc (P: out Concrete_Derived) is
      begin
         null;
      end New_Proc;

   end PriExt_Overrides_All;


end BC51C01_1;


     --===================================================================--


with FC51C00;
with BC51C01_1;
package BC51C01 is

-- Check that, for a non-abstract type derived from an abstract formal derived
-- type, all abstract primitive subprograms inherited from the actual type
-- must be overridden in the instance.

--
-- Generics which declare a record extension of the formal derived type:
--

   package Instance01 is new BC51C01_1.RecExt_Overrides_Inherited
     (FC51C00.Abstract_Child);                                        -- ERROR:
                            -- Derived type in instance has abstract primitive
                            -- subprograms (Proc, New_Proc).


   package Instance02 is new BC51C01_1.RecExt_Overrides_All
     (FC51C00.Abstract_Child);                                        -- OK.



--
-- Generics which declare a record extension of the formal derived type:
--

   package Instance03 is new BC51C01_1.PriExt_Overrides_Inherited
     (FC51C00.Abstract_Child);                                        -- ERROR:
                             -- Derived type in instance has abstract primitive
                             -- subprograms (Proc, New_Proc).


   package Instance04 is new BC51C01_1.PriExt_Overrides_All
     (FC51C00.Abstract_Child);                                        -- OK.


end BC51C01;
