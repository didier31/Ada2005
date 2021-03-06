-- B380001.A
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
--      Check that the name of a non-inherited discriminant can be the
--      same as the name of a newly added component.
--
--      Check that the name of the current instance of a type used to
--      define the constraint of a component may only be used as a
--      direct_name that is the prefix of an attribute_reference whose
--      result is of an access type, and that the attribute_reference must
--      appear alone.
--
--      Check that the name of a non-inherited discriminant is not
--      allowed within the discriminant part.
--
-- TEST DESCRIPTION:
--      This test creates examples where non_access_type result attributes
--      are used.  This test also creates examples where the current
--      instance value is passed to an access typed function, and other
--      forms of expression.  Test checks that the name of a non-inherited
--      discriminant _may_ be used as the name of a newly added component
--      using the form: type R(X:Int) is tagged...
--                      type S(Y:Int) is new R(Y) with record X: Float;...
--      This test checks that if the discriminant is inherited, the name may
--      _not_ be otherwise used.
--
--
--
-- CHANGE HISTORY:
--      03 MAY 95   SAIC   Initial version
--      28 JUL 95   SAIC   Revised version
--      01 DEC 95   SAIC   Revised for 2.0.1
--
--!

package B380001_0 is -- legal cases

  type Root( Disc_Name : Boolean ) is tagged record
    Component : Natural;
  end record;

  type Branch( New_Disc : Boolean ) is
    new Root( New_Disc ) with record
      Disc_Name : String(1..10);                                  -- OK
    end record;     -- OK to use the name of the noninherited discriminant

---------------------------------------------------------------------------

  type Legal_Enclosure;

  type Used_For_Component( X: access Legal_Enclosure ) is         -- OK
    limited null record;

  type Legal_Enclosure is limited record
    UFC: Used_For_Component( Legal_Enclosure'Access );            -- OK
  end record;

---------------------------------------------------------------------------

  type Unchecked_Enclosure;

  type Unchecked_Component( X: access Unchecked_Enclosure ) is    -- OK
    limited null record;

  type Unchecked_Enclosure is limited record
    UFC: Unchecked_Component( Unchecked_Enclosure'Unchecked_Access ); -- OK
  end record;

end B380001_0;

with B380001_0;
package B380001 is
  use B380001_0;

  type Illegal_Reuse( New_Disc : Boolean ) is
    new Root( New_Disc ) with record
      Component : String(1..10);                                  -- ERROR:
                                        -- component names must be distinct
    end record;

---------------------------------------------------------------------------

  type Illegal_Use_Of_Name is new Root
    with record
      Disc_Name : Character;                                      -- ERROR:
                          -- name of inherited discriminant may not be used
    end record;

---------------------------------------------------------------------------

  type Illegal_Enclosure;

  type Component( X: access Illegal_Enclosure ) is
    limited null record;

  type Illegal_Enclosure is limited record
    UFC: Component( B380001.Illegal_Enclosure'Access );           -- ERROR:
                                 -- attribute_reference must be direct_name
  end record;

---------------------------------------------------------------------------

  type Illegal_Enclosure_2;
  type Access_IE2 is access all Illegal_Enclosure_2;

  type Component_2( X: access Illegal_Enclosure_2 ) is
    limited null record;

  type Illegal_Enclosure_2 is limited record
    UFC: Component_2( Access_IE2'(Illegal_Enclosure_2'Access) );  -- ERROR:
                -- attribute_reference must be direct name and appear alone
  end record;

---------------------------------------------------------------------------

  type Illegal_Enclosure_3;

  type Component_3( X: access Illegal_Enclosure_3 ) is
    limited null record;

  type Illegal_Enclosure_3 is limited record
    UFC: Component_3( Illegal_Enclosure_3'Address );              -- ERROR:
                                 -- attribute_reference must be access type
  end record;

---------------------------------------------------------------------------

  type Illegal_Enclosure_4;

  type Component_4( X: access Illegal_Enclosure_4 ) is
    limited null record;

  type Illegal_Enclosure_4 is limited record
    UFC: Component_4( Component_4'Access );                       -- ERROR:
                                          -- attribute_reference wrong type
  end record;

---------------------------------------------------------------------------

  type Illegal_Enclosure_5;

  type Access_IE5 is access Illegal_Enclosure_5;

  function Fn(X: access Illegal_Enclosure_5)
    return Access_IE5;

  type Component_5( X: access Illegal_Enclosure_5 ) is
    limited null record;

  type Illegal_Enclosure_5 is limited record
    UFC: Component_5( Fn(Illegal_Enclosure_5'Access) );           -- ERROR:
                -- current instance attribute_reference must be direct name
  end record;

---------------------------------------------------------------------------

  type Illegal_Enclosure_6 is limited private;

  type Access_IE6 is access all Illegal_Enclosure_6;

  function Fx(X: access Illegal_Enclosure_6)
    return Illegal_Enclosure_6;

  type Component_6( X: access Illegal_Enclosure_6 ) is
    limited null record;

private


  type Illegal_Enclosure_6 is limited record
    UFC: Component_6( Fx(Illegal_Enclosure_6'Access)'Access );    -- ERROR:
                                                     -- must be direct_name
  end record;

--      Check that the name of a non-inherited discriminant is not
--      allowed within the discriminant part.

  type Rad_Branch( Disc_Name : Natural ) is                       -- OK
                  -- discriminant name not inherited in this derivation
    new Root( False ) with record
      Stuff : String(1..10);
    end record;

end B380001;
