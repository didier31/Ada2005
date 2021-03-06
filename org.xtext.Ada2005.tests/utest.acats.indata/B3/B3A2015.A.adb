-- B3A2015.A
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
--      Check that, for X'Access of a general access type A, the view denoted
--      by X must not be a subcomponent that depends on discriminants of an
--      object unless the object is known to be constrained.
--
--      Check that, for a renaming of an object, the renamed entity must not
--      be a subcomponent that depends on discriminants of an object
--      unless the object is known to be constrained.
--
--      Check that if the view denoted by X is that of a subcomponent of an
--      aliased composite object, the word aliased must appear in the
--      subcomponent's component definition. Check for objects which are
--      declared aliased, objects created by an allocator, and formal
--      parameters of a tagged type.
--
-- TEST DESCRIPTION:
--      A component definition depends on a discriminant if its constraint
--      names the discriminant as a bound or discriminant value, or names
--      a discriminant that corresponds to it.
--
--      A component depends on a discriminant if:
--        - its component definition depends on it.
--        - it is declared in a variant part that is governed by the
--          discriminant.
--        - it is a component inherited as part of a derived type definition,
--          and a constraint of the parent depends on the discriminant.
--        - it is a subcomponent of a component that depends on the
--          discriminant.
--
--
--      Declare indefinite tagged type, and both definite and indefinite
--      untagged composite types, containing components which depend on a
--      discriminant in each of the ways described above.
--
--      Verify that if X in X'Access is a view that denotes an aliased
--      subcomponent of a variable with an unconstrained nominal subtype,
--      either the subtype must be indefinite, or the object is a dereference
--      of a pool-specific access type.
--
--      Verify that when an object renaming denotes a subcomponent of a
--      variable with an unconstrained nominal subtype, either the subtype
--      must be indefinite, or the object is a dereference of a
--      pool-specific access type.
--
--      Verify that a subcomponent of an aliased view is not itself
--      aliased, unless the component definition includes the word
--      aliased. Check for tagged and untagged record types, and array
--      types. Check for views that denote objects created by an object
--      declaration, formal tagged parameter declaration, and an allocator.
--
--      This test covers only part of the definition of
--      known-to-be-constrained; specifically, 3.3(23.1-3/3) and 3.3(23.9/3)
--      only.
--
-- CHANGE HISTORY:
--      11 May 95   SAIC    Initial prerelease version.
--      27 Sep 96   SAIC    Modified test description and type definitions.
--      27 Feb 97   PWB.CTA Corrected discriminant and renaming errors.
--      28 Sep 07   RLB     Updated comments to reflect Amendment and
--                          AI05-0008 changes, added test cases and changed
--                          results as needed.
--!

package B3A2015 is

   subtype Disc is Natural range 0 .. 10;

--
-- Tagged types:
--

   type Tag_Type (D1 : Disc) is tagged record
      C           : aliased String (1 .. D1);
      Not_Aliased :         String (1 .. 10);
   end record;

   procedure Op (P: in out Tag_Type);

   type New_Tag_Type (D2 : Disc) is new Tag_Type (D1 => 5) with record
      I: Integer;
   end record;


--
-- Record types:
--

   type R_Indef (D1 : Disc) is record
      C: aliased Tag_Type (D1);
   end record;

   -- Definite derivative of indefinite parent:
   type NDef_RIndef (D2: Disc := 0) is new R_Indef (D1 => D2);

   type R_Def (D1 : Disc := 3) is record
      C1 : aliased String (1 .. D1);
      C2 : aliased NDef_RIndef (D1);        -- By-reference type.
      C3 :         R_Indef (D1);            -- By-reference type.
   end record;

   type NewR_Def (D2 : Disc := 3) is new R_Def (D1 => D2);

   type Var_Rec (Choice : Boolean := True) is record
      Not_Aliased : Tag_Type (10);
      case Choice is
         when True  =>
            CT: aliased String (1 .. 10);
         when False =>
            CF: aliased String (1 .. 20);
      end case;
   end record;


   type AccStr      is access all String;
   type AccTag_Type is access all Tag_Type;
   type AccRP_Def   is access R_Def;        -- Pool-specific access
   type AccRG_Def   is access all R_Def;    -- General access
   type AccR_Indef  is access all NDef_RIndef;

   XNew_Tag_Type : New_Tag_Type := (C           => "hello",
                                    Not_Aliased => "1234567890",
                                    D2          => 2,
                                    I           => 0);

   XAccRP_Def    : AccRP_Def := new R_Def;   -- Object created by allocator.
   XAccRG_Def    : AccRG_Def := new R_Def;   -- Object created by allocator,
                                             --   but that doesn't matter.

   Tag_Obj       : Tag_Type(5);
   XR_Indef      : R_Indef  := (D1 => 5, C => Tag_Obj);
   XNDef_RIndef  : NDef_RIndef;
   XR_Def        : R_Def;
   ANewR_Def     : aliased NewR_Def;

   XVar_Rec      : Var_Rec;
   AVar_Rec      : aliased Var_Rec (True);


--
-- Array types:
--

   type Tag_Array is array (1 .. 5) of Tag_Type (25);
   type AccTag_Array is access all Tag_Array;

   XTag_Arr : AccTag_Array := new Tag_Array; -- Object created by allocator.

end B3A2015;


     --==================================================================--


package body B3A2015 is

--
-- Tagged type subtests:
--

   RNew_Tag_Type : String renames XNew_Tag_Type.C;                    -- OK.
                 -- Nominal subtype of variable XNew_Tag_Type is indefinite.


   procedure Op (P : in out Tag_Type) is  -- Formal parameter of a tagged type
      Ptr : AccStr;                       -- is aliased.  -- LM 3.10(9);6.0

      Ren : Tag_Type renames P;                                       -- OK.
                         -- Variable view P is indefinite.
   begin

      Ptr := P.Not_Aliased'Access;                                    -- ERROR:
                                 -- Component of aliased object is not aliased.
   end Op;


--
-- Record type subtests:
--

   PR_Indef    : AccTag_Type := XR_Indef.C'Access;                    -- OK.
                      -- Nominal subtype of variable XR_Indef is indefinite.

   ----------------------------------------------------------------------
   -- XNDef_RIndef.C depends on discriminants of XNDef_RIndef (old discriminant
   -- defined in terms of new discriminant), whose subtype is unconstrained but
   -- definite; XNDef_RIndef is not aliased.

   PNDef_RIndef : AccTag_Type := XNDef_RIndef.C'Access;               -- ERROR:
            -- Subtype of XNDef_RIndef is unconstrained, definite.

   ----------------------------------------------------------------------
   -- XR_Def.C1 and XR_Def.C2 depend on discriminants of XR_Def, whose
   -- subtype is unconstrained but definite; XR_Def is not aliased.

   PR_Def1     : AccStr      := XR_Def.C1'Access;                     -- ERROR:
                  -- Subtype of XR_Def is unconstrained, definite.

   PR_Def2     : AccR_Indef  := XR_Def.C2'Access;                     -- ERROR:
                  -- Subtype of XR_Def is unconstrained, definite.

   ----------------------------------------------------------------------
   -- XR_Def.C3.C depends on discriminants of XR_Def.C3, whose subtype is
   -- indefinite. But XR_Def.C3 depends on discriminants of XR_Def, whose
   -- subtype is unconstrained but definite; XR_Def is not aliased.

   PR_Def3     : AccTag_Type := XR_Def.C3.C'Access;                   -- ERROR:
                  -- Subtype of XR_Def is unconstrained, definite.

   ----------------------------------------------------------------------
   -- ANewR_Def.C1 and AnewR_Def.C2 depend on discriminants of AnewR_Def,
   -- whose subtype is unconstrained but definite; ANewR_Def is aliased.

   PNewR_Def2  : AccR_Indef  := ANewR_Def.C2'Access;                  -- ERROR:
       -- Subtype of ANewR_Def is unconstrained, definite. Change from Ada 95.

   ----------------------------------------------------------------------
   -- XVar_Rec.CT depends on discriminants of XVar_Rec, whose subtype is
   -- unconstrained but definite; XVar_Rec is not aliased.

   PVar_Rec    : AccStr      := XVar_Rec.CT'Access;                   -- ERROR:
                -- Subtype of XVar_Rec is unconstrained, definite.

   ----------------------------------------------------------------------
   -- Implicit dereference:

   PR_Def4    : AccR_Indef  := XAccRP_Def.C2'Access;                  -- OK.
          -- Nominal subtype of XAccRP_Def.all is unconstrained and definite,
          -- but XAccRP_Def.all is a dereference of a pool-specific access type.

   PR_Def5    : AccR_Indef  := XAccRG_Def.C2'Access;                  -- ERROR:
          -- Nominal subtype of XAccRG_Def.all is unconstrained and definite,
          -- and XAccRG_Def.all is not a dereference of a pool-specific
          -- access type. Change from Ada 95.

   RPoolR_Def : String renames XAccRP_Def.C1;                         -- OK.
          -- Nominal subtype of XAccRP_Def.all is unconstrained and definite,
          -- but XAccRP_Def.all is a dereference of a pool-specific access type.

   RGenR_Def : String renames XAccRG_Def.C1;                          -- ERROR:
          -- Nominal subtype of XAccRG_Def.all is unconstrained and definite,
          -- and XAccRG_Def.all is not a dereference of a pool-specific
          -- access type. Change from Ada 95.

   ----------------------------------------------------------------------

   RR_Indef    : Tag_Type renames XR_Indef.C;                         -- OK.
                      -- Nominal subtype of variable XR_Indef is indefinite.

   ----------------------------------------------------------------------
   -- XNDef_RIndef.C depends on discriminants of XNDef_RIndef (old discriminant
   -- defined in terms of new discriminant), whose subtype is unconstrained
   -- but definite; XNewR_Idef is not aliased.

   RNDef_RIndef : Tag_Type renames XNDef_RIndef.C;                    -- ERROR:
            -- Subtype of XNDef_RIndef is unconstrained, definite.

   ----------------------------------------------------------------------
   -- XR_Def.C1 and XR_Def.C2 depend on discriminants of XR_Def, whose
   -- subtype is unconstrained but definite; XR_Def is not aliased.

   RR_Def1     : String renames XR_Def.C1;                            -- ERROR:
                  -- Subtype of XR_Def is unconstrained, definite.

   RR_Def2     : NDef_RIndef renames XR_Def.C2;                       -- ERROR:
                  -- Subtype of XR_Def is unconstrained, definite.

   ----------------------------------------------------------------------
   -- XR_Def.C3.C depends on discriminants of XR_Def.C3, whose subtype is
   -- indefinite. But XR_Def.C3 depends on discriminants of XR_Def, whose
   -- subtype is unconstrained but definite; XR_Def is not aliased.

   RR_Def3     : Tag_Type renames XR_Def.C3.C;                        -- ERROR:
                  -- Subtype of XR_Def is unconstrained, definite.

   ----------------------------------------------------------------------
   -- ANewR_Def.C1 and AnewR_Def.C2 depend on discriminants of AnewR_Def,
   -- whose subtype is unconstrained but definite; ANewR_Def is aliased.

   RNewR_Def1  : String renames ANewR_Def.C1;                         -- ERROR:
       -- Subtype of ANewR_Def is unconstrained, definite. Change from Ada 95.

   RNewR_Def2  : NDef_RIndef renames ANewR_Def.C2;                    -- ERROR:
       -- Subtype of ANewR_Def is unconstrained, definite. Change from Ada 95.

   ----------------------------------------------------------------------
   -- XVar_Rec.CT depends on discriminants of XVar_Rec, whose subtype is
   -- unconstrained but definite; XVar_Rec is not aliased.

   RVar_Rec    : String renames XVar_Rec.CT;                          -- ERROR:
                -- Subtype of XVar_Rec is unconstrained, definite.

   ----------------------------------------------------------------------
   PAVar_Rec   : AccTag_Type := AVar_Rec.Not_Aliased'Access;          -- ERROR:
                                 -- Component of aliased object is not aliased.


--
-- Array type subtests:
--

   -- Implicit deference:
   PTag_Arr    : AccTag_Type := XTag_Arr(1)'Access;                   -- ERROR:
                                 -- Component of aliased object is not aliased.

end B3A2015;
