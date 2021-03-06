-- BC51007.A
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
--      part, if the ancestor subtype is an unconstrained discriminated
--      subtype, the actual type must have the same number of discriminants,
--      and each discriminant of the actual must correspond to a discriminant
--      of the ancestor.
--
-- TEST DESCRIPTION:
--      This objective applies to situations in which the ancestor and
--      actual types may sensibly have a different set of discriminants.
--      A new set of discriminants may be introduced only by a known
--      discriminant part of a derived type declaration. For a non-tagged type,
--      the new discriminants must be used to constrain the old discriminants.
--      This is not the case for tagged types, however.
--
--      A discriminant of the actual corresponds to a discriminant of the
--      ancestor if the ancestor's discriminant is inherited by the actual,
--      if the ancestor's discriminant is constrained to equal the actual's
--      discriminant, if there is a common discriminant to which they both
--      correspond, or if the discriminants are identical (i.e., the actual
--      and ancestor subtypes are the same). For non-tagged types, the
--      discriminants of the ancestor and actual will always correspond, since
--      each new discriminant of the actual must constrain a discriminant of
--      the ancestor. If, however, the discriminants of the actual do not
--      constrain those of the ancestor (as is possible for tagged types),
--      the discriminants will not correspond, even if the actual has the
--      same number of discriminants as the ancestor, and the subtypes of the
--      actual's discriminants are statically compatible with those of the
--      ancestor.
--
--      For nontagged discriminated types, it is not possible for a
--      descendant to have more discriminants than its parent. This is not
--      the case for tagged discriminated types, however.
--
--      For each discriminated type considered, declare an unconstrained
--      "root" type and use it as the ancestor in a formal derived type
--      declaration. Derive a type from the root type with no discriminant
--      part. Derive an additional type with a new discriminant part that
--      declares the same number of discriminants as the parent, and with
--      statically compatible discriminant subtypes; for the tagged derived
--      type, do not constrain the discriminants of the parent type with those
--      of the derived type. Additionally, for the tagged type case, declare
--      a derivative with more discriminants than the ancestor possesses, and
--      a private extension with an unknown discriminant part.
--
--      For each "root" type, declare a formal derived type in a generic with
--      the "root" type as ancestor. In the main program, attempt to
--      instantiate the appropriate generic with the following actual subtypes:
--
--         (a) The ancestor subtype.
--         (b) The derivative with no discriminant part.
--         (c) The derivative with the same number of (statically compatible)
--             discriminants.
--
--         For the tagged formal type only:
--         (d) The derivative with a different number of discriminants.
--         (e) The private extension (with unknown discriminants).
--         (f) The class-wide type of the ancestor.
--
--      For the non-tagged formal type, no cases should be illegal. For the
--      tagged formal type, cases (c)-(f) should be illegal.
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--      20 Mar 95   SAIC    Updated prologue wording. Relabeled non-tagged
--                          error case (statically compatible, but not
--                          statically matching discriminant subtypes) as okay.
--                          Changed comment for analogous tagged error case to
--                          refer to non-corresponding discriminants. Changed
--                          procedure BC51007 to package.
--      03 Nov 95   SAIC    Fixed bugs for ACVC 2.0.1.
--
--!

package BC51007_0 is  -- Type definitions.

   subtype Lengths  is Natural range 0 .. 30;

   subtype Msg_Len  is Lengths range 0 .. 20;
   subtype Name_Len is Lengths range 0 .. 10;

--
-- Record types:
--

   type Msg_Type (Len : Msg_Len := 0) is record     -- Unconstrained record
      Msg : String (1 .. Len);                      -- (ancestor) type.
   end record;

   type My_Msg is new Msg_Type;                     -- Derivative with
                                                    -- inherited discriminants
                                                    -- (derived from ancestor).

   type Msg_Max10 (NLen : Name_Len := 0) is new     -- Derivative with same #
     Msg_Type(Len => NLen);                         -- of discriminants and
                                                    -- compatible subtype
                                                    -- (derived from ancestor).

--
-- Tagged types:
--

   type Ext_Msg (Len : Msg_Len) is tagged record    -- Unconstrained tagged
      Msg : String (1 .. Len);                      -- (ancestor) type.
   end record;

   type My_Ext_Msg is new Ext_Msg with null record; -- Derivative with
                                                    -- inherited discriminants
                                                    -- (derived from ancestor).

   type Attrib_Msg_Type (NLen : Msg_Len) is new     -- Derivative with same #
     Ext_Msg(Msg_Len'Last) with record              -- of discriminants and
      From : String (1 .. NLen);                    -- compatible subtype, but
   end record;                                      -- non-corresponding
                                                    -- (derived from ancestor).

   type Append_Msg_Type (Len1, Len2 : Msg_Len)      -- Derivative with
     is new My_Ext_Msg(Len1) with record            -- different # of
      PS  : String (1 .. Len1);                     -- discriminants (derived
      PPS : String (1 .. Len2);                     -- from derivative).
   end record;

   type Priv_Msg_Type (<>) is new Ext_Msg           -- Private extension with
     with private;                                  -- unknown discriminants.

private

   type Priv_Msg_Type is new Ext_Msg                -- Full view has matching
     with null record;                              -- (inherited)
                                                    -- discriminants.
end BC51007_0;

-- No body for BC51007_0.


     --==================================================================--


with BC51007_0;  -- Type definitions.
generic
   type Message is new BC51007_0.Msg_Type;                -- Formal derived
package BC51007_1 is                                      -- record type.

   Object : Message;  

   type New_Message is new Message(18);

end BC51007_1;


     --==================================================================--


with BC51007_0;  -- Type definitions.
generic
   type Message is new BC51007_0.Ext_Msg with private;    -- Formal derived
package BC51007_2 is                                      -- tagged type.

   subtype New_Message is Message;

end BC51007_2;


     --==================================================================--


with BC51007_0;  -- Type definitions.
with BC51007_1;  -- Record formal type.
with BC51007_2;  -- Tagged formal type.
package BC51007 is

--
-- Record types:
--

   package Record_Ancestor_Type is new
     BC51007_1 (BC51007_0.Msg_Type);                                  -- OK.


   package Record_Derived_No_New_Discriminants is new
     BC51007_1 (BC51007_0.My_Msg);                                    -- OK.


   package Record_Corresponding_Discriminants is new
     BC51007_1 (BC51007_0.Msg_Max10);                                 -- OK.


--
-- Tagged types:
--

   package Tagged_Ancestor_Type is new
     BC51007_2 (BC51007_0.Ext_Msg);                                   -- OK.


   package Tagged_Derived_No_New_Discriminants is new
     BC51007_2 (BC51007_0.My_Ext_Msg);                                -- OK.


   package Tagged_NonCorresponding_Discriminants is new
     BC51007_2 (BC51007_0.Attrib_Msg_Type);                           -- ERROR:
                                            -- Discriminants do not correspond.

   package Tagged_Different_Number_Of_Discriminants is new
     BC51007_2 (BC51007_0.Append_Msg_Type);                           -- ERROR:
                                          -- Actual has too many discriminants.

   package Tagged_Unknown_Discriminants is new
     BC51007_2 (BC51007_0.Priv_Msg_Type);                             -- ERROR:
                                           -- Actual has unknown discriminants.

   package Tagged_Class_Wide is new
     BC51007_2 (BC51007_0.Ext_Msg'Class);                             -- ERROR:
                              -- Actual has unknown discriminants (class-wide).

end BC51007;
