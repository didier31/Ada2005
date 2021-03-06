-- BA21A02.A
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
--      Check that the body corresponding to a generic library package
--      declaration to which a pragma Preelaborate applies is illegal if it
--      contains any of the following constructs (if the construct would
--      be elaborated upon instantiation):
--
--         (a) A statement other than a null statement.
--         (b) A call to a nonstatic function.
--         (c) A call to a formal function.
--         (d) A primary that is a name of an object, including within the
--             default expression for a default-initialized component, if the
--             name is not a static expression and does not statically denote
--             a discriminant of an enclosing type.
--         (e) A declaration of a default-initialized object of a type
--             that does not have preelaborable initialization.
--         (f) An extension aggregate with an ancestor subtype mark denoting
--             a subtype of a tagged private type.
--
--      Check that each of the following constructs is legal within the visible
--      part, private part, or body of a generic library package to which a
--      pragma Preelaborate applies, as well as within a corresponding
--      instance to which a pragma Preelaborate also applies (do not check
--      (m), (o), or cases of (q) that depend on formals in the body, since
--      they are illegal there):
--
--         (k) A null statement.
--         (l) A call to a static function.
--         (m) A call to a formal function, if the corresponding actual is a
--             static function.
--         (n) A primary that is a name of an object, if the name is a static
--             expression or statically denotes a discriminant of an enclosing
--             type.
--         (o) A primary that is the name of a formal object of a formal
--             private type, if the corresponding actual type is not a private
--             type, private extension, controlled type, task type, or
--             protected type with entry declarations, and the corresponding
--             actual object is a static constant.
--         (p) A reference to an attribute of an object, in particular 'Access,
--             'Unchecked_Access, and 'Address.
--         (q) A declaration of a default-initialized object of a type that
--             has preelaborable initialization.
--         (r) An extension aggregate with an ancestor subtype mark denoting a
--             subtype that has preelaborable initialization.
--         (s) A declaration of an explicitly-initialized object of a type
--             that does not have preelaborable initialization.
--
-- TEST DESCRIPTION:
--      A default-initialized object is one which is not explicitly
--      initialized (the presence of default expressions is irrelevant).
--
--      Since the elaboration of a generic declaration has no effect,
--      constructs which are illegal in other units to which a pragma
--      Preelaborate applies are legal in a generic declaration. An
--      instantiation of such a generic, however, may or may not be legal
--      depending on whether a pragma Preelaborate applies to it. The
--      pragma only applies to an instance if it is explicitly provided
--      for the instance (the pragma in a generic does not automatically
--      apply to its instances).
--
--      Declare various supporting types, objects, and subprograms in a
--      preelaborated package declaration (foundation code). Verify the
--      legality of each of the constructs (k)-(s) above in the visible part,
--      private part, or body (but do not check (m), (o), or cases of (q) that
--      depend on formals in the body) of a preelaborated generic library
--      package. Verify that a preelaborated, library-level instance of
--      this generic package is also legal.
--
--      Declare a preelaborated second generic library package. Within the
--      body of this package, verify the illegality of each of the constructs
--      (a)-(f) above.
--
-- TEST FILES:
--      The following files comprise this test:
--
--         FA21A00.A
--         BA21A02.A
--
--
-- CHANGE HISTORY:
--      30 Mar 95   SAIC    Initial prerelease version.
--      08 May 95   SAIC    Added non-static function call cases as part of
--                          range/constraint evaluation/elaboration. Changed
--                          parent of Private_Extension from private extension
--                          to non-private tagged type. Modified objective
--                          wording.
--      19 Feb 97   PWB.CTA Deleted declaration with illegal extension aggr.
--      26 Oct 07   RLB     Updated the test objective, description, and
--                          expected errors to use the preelaborable
--                          initialization description from Amendment 1.
--
--!

with FA21A00;
use type FA21A00.My_Int;

with System;
generic
   type Form_Priv   is private;
   type Form_PriExt is new FA21A00.Tag with private;

   type Int_Actual is private;
   FObj: in Int_Actual;

   type Int_Type is range <>;
   IObj: Int_Type;
   with function Add (L, R : Int_Type) return Int_Type;
package BA21A02_0 is

   pragma Preelaborate (BA21A02_0);


   procedure Dummy; -- Needed to allow package body.

   type Form_PriExt_Comp is record
      C: Form_PriExt;
   end record;

   type Private_Type      is tagged private;
   type Private_Extension is new FA21A00.Tag with private;

   Nine  : FA21A00.My_Int := FA21A00.Three**2;                        -- OK.
                       -- Call to static function (predefined operator) (l).

   Call  : Int_Type := Add (IObj, IObj);                              -- OK.
                                             -- Call to formal function (m).

   PObj  : Int_Actual := FObj;                                        -- OK.
                                -- Name of a formal object as a primary (o).

   Acc1  : FA21A00.AccTag := FA21A00.Tag1'Access;                     -- OK.
                             -- Name of an object, but not as a primary (p).

   Dflt1 : FA21A00.RecCallDefault := (5, 0);                          -- OK.
                        -- Default expression would call nonstatic function,
                        -- but object is explicitly initialized (s).

   PExtC : Form_PriExt_Comp;                                          -- OK.
                              -- Default-initialized object with a component
                              -- of a formal private extension (q).

private

   type Private_Type is tagged record
      B: Boolean;
   end record;

   type Deriv_Priv is new Private_Type with record
      S: String (1 .. 5);
   end record;

   type Private_Extension is new FA21A00.Tag with record
      N: String (1 .. 7) := "Goodbye";
   end record;

   Yes   : Boolean := True;                                           -- OK.
                       -- Call to static function (enumeration literal) (l).

   Disc  : FA21A00.RecWithDisc(2) := (2, FA21A00.Three);              -- OK.
                       -- Name of an object that is a static expression (n).

   Addr  : System.Address := FA21A00.Tag1'Address;                    -- OK.
                             -- Name of an object, but not as a primary (p).

   PType : Form_Priv;                                                 -- OK.
                 -- Default-initialized object of a formal private type (q).

end BA21A02_0;


     --===================================================================--


package body BA21A02_0 is

   procedure Dummy is
   begin
      null;
   end Dummy;


   Five  : FA21A00.My_Int := FA21A00.Three + 2;                       -- OK.
                       -- Call to static function (predefined operator) (l).

   Stat  : Boolean := (FA21A00.Three = 3);                            -- OK.
                       -- Name of an object that is a static expression (n).

   Acc2  : FA21A00.AccTag := FA21A00.Tag1'Unchecked_Access;           -- OK.
                             -- Name of an object, but not as a primary (p).

   PrObj : Private_Type;                                              -- OK.
                             -- Default-initialized object of a private type
                             -- (within scope of full view) (q).

   PEObj : Private_Extension;                                         -- OK.
                        -- Default-initialized object of a private extension
                        -- (within scope of full view) (q).

   PrXAgg: Deriv_Priv := (Private_Type with "Hello");                 -- OK.
                           -- Extension aggregate with ancestor subtype of a
                           -- private type (within scope of full view) (r).

begin
   null;                                                              -- OK.
end BA21A02_0;                                        -- Null statement (k).


     --===================================================================--


with FA21A00;

with BA21A02_0;
package BA21A02_1 is new BA21A02_0 (Form_Priv   => FA21A00.My_Int,
                                    Form_PriExt => FA21A00.Tag,
                                    Int_Actual  => FA21A00.My_Int,
                                    FObj        => FA21A00.Three,
                                    Int_Type    => FA21A00.My_Int,
                                    IObj        => FA21A00.Three,
                                    Add         => FA21A00."+");      -- OK.
pragma Preelaborate (BA21A02_1);


     --===================================================================--


with FA21A00;
use type FA21A00.My_Int;
generic
   type Form_Priv   is private;
   type Form_PriExt is new FA21A00.Tag with private;

   type Int_Type is range <>;
   with function Init return Int_Type;

   type Index is (<>);
   type Array_Type is array (Index) of FA21A00.Priv;
package BA21A02 is
   pragma Preelaborate (BA21A02);

   type DerPriv is new FA21A00.Priv with record
      S: String (1 .. 7);
   end record;

   procedure Dummy; -- Needed to allow package body.
end BA21A02;


     --===================================================================--


package body BA21A02 is

   procedure Dummy is
   begin
      null;
   end Dummy;

   type ArrType is array (1 .. FA21A00.Func) of Boolean;              -- ERROR:
                                  -- Call to nonstatic function in a range (b).

   IntX  : FA21A00.My_Int range 10 .. FA21A00.Func;                   -- ERROR:
                             -- Call to nonstatic function in a constraint (b).

   Call1 : FA21A00.My_Int := FA21A00.Func;                            -- ERROR:
                                             -- Call to nonstatic function (b).

   Call2 : Int_Type := Init;                                          -- ERROR:
                                                -- Call to formal function (c).

   Bool  : Boolean := (FA21A00.Ten = 10);                             -- ERROR:
                                       -- Primary that is a name of an object
                                       -- which is not a static expression (d).

   Rec   : FA21A00.RecPrimDefault;                                    -- ERROR:
                                        -- Primary that is a name of an object
                                        -- which is not a static expression (in
                                        -- component's default expression) (d).

   TObj  : FA21A00.Tsk(5);                                            -- ERROR:
                                                  -- Object of a task type (e).

   Cont  : FA21A00.ContComp;                                          -- ERROR:
                     -- Default-initialized component of a controlled type (e).

   Arr   : Array_Type;                                                -- ERROR:
                        -- Default-initialized component of a private type (e).

   PExt  : FA21A00.Pri_Ext;                                           -- ERROR:
                      -- Default-initialized object of a private extension (e).

   PAgg  : DerPriv := (FA21A00.Priv with "mistake");                  -- ERROR:
                -- Extension aggregate with ancestor denoting private type (f).

   PType : Form_Priv;                                                 -- ERROR:
                    -- Default-initialized object of a formal private type (e).

   FPExt : Form_PriExt;                                               -- ERROR:
               -- Default-initialized object of a formal private extension (e).

begin
   Dummy;                                                             -- ERROR:
                                                     -- Non-null statement (a).
end BA21A02;
