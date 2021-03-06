-- B3A1A04.A
--
--                             Grant of Unlimited Rights
--
--     The Ada Conformity Assessment Authority (ACAA) holds unlimited
--     rights in the software and documentation contained herein. Unlimited
--     rights are the same as those granted by the U.S. Government for older
--     parts of the Ada Conformity Assessment Test Suite, and are defined
--     in DFAR 252.227-7013(a)(19). By making this public release, the ACAA
--     intends to confer upon all recipients unlimited rights equal to those
--     held by the ACAA. These rights include rights to use, duplicate,
--     release or disclose the released technical data and computer software
--     in whole or in part, in any manner and for any purpose whatsoever, and
--     to have or permit others to do so.
--
--                                    DISCLAIMER
--
--     ALL MATERIALS OR INFORMATION HEREIN RELEASED, MADE AVAILABLE OR
--     DISCLOSED ARE AS IS. THE ACAA MAKES NO EXPRESS OR IMPLIED
--     WARRANTY AS TO ANY MATTER WHATSOEVER, INCLUDING THE CONDITIONS OF THE
--     SOFTWARE, DOCUMENTATION OR OTHER INFORMATION RELEASED, MADE AVAILABLE
--     OR DISCLOSED, OR THE OWNERSHIP, MERCHANTABILITY, OR FITNESS FOR A
--     PARTICULAR PURPOSE OF SAID MATERIAL.
--
--                                     Notice
--
--     The ACAA has created and maintains the Ada Conformity Assessment Test
--     Suite for the purpose of conformity assessments conducted in accordance
--     with the International Standard ISO/IEC 18009 - Ada: Conformity
--     assessment of a language processor. This test suite should not be used
--     to make claims of conformance unless used in accordance with
--     ISO/IEC 18009 and any applicable ACAA procedures.
--*
--
-- OBJECTIVE:
--
--     Check that the name of a tagged incomplete view cannot be used as
--     the prefix of the Class attribute used in a context that does not
--     allow the use of a tagged incomplete view.
--
-- TEST DESCRIPTION:
--
--     We test both tagged incomplete types and tagged incomplete views
--     from the limited view of a package.
--
--     We also test named and anonymous access-to-subprogram types,
--     excepting cases allowed by 3.10.1(9.2/2) [when the completion
--     is given in the same declaration list].
--
-- CHANGE HISTORY:
--     01 Oct 2008  RLB  Created test basing it on B3A1A01.
--
limited with F3A1A00;
package B3A1A04 is

    procedure Proc2 (A : F3A1A00.A_Tagged_Type'Class);         -- OK.

    procedure Proc4 (Cnt : in Natural;
                     Obj : out F3A1A00.Tagged_Private'Class);  -- OK.

    procedure Proc6 (
               Wobble : access F3A1A00.A_Tagged_Type'Class);   -- OK.

    function Func2 (Rash : Character)
                   return F3A1A00.A_Tagged_Type'Class;         -- ERROR:

    type Acc2 is access procedure
                  (Obj : in F3A1A00.Tagged_Private'Class);     -- OK.

    type Acc4 is access function return
                  F3A1A00.A_Tagged_Type'Class;                 -- ERROR:

    type Acc7 is access function return
                  access F3A1A00.Tagged_Private'Class;         -- OK.

    Obj2 : access procedure
                  (Obj : in F3A1A00.Tagged_Private'Class);     -- OK.

    Obj4 : access function return F3A1A00.A_Tagged_Type'Class; -- ERROR:


    -- Note: 3.10.1(9.2/2) applies to this type, so more
    -- of the following are legal than in the other cases:

    type Tagged_Inc is tagged;


    procedure Proc12 (A : Tagged_Inc'Class);                   -- OK.

    procedure Proc14 (Ptr : access Tagged_Inc'Class);          -- OK.

    function Func12 return Tagged_Inc'Class;                   -- ERROR:

    function Func14 return access Tagged_Inc'Class;            -- OK.

    type Acc12 is access procedure (
                              Obj : in out Tagged_Inc'Class);  -- OK.

    type Acc14 is access function return Tagged_Inc'Class;     -- OK.


    -- Note: The following are also illegal because indefinite objects
    -- are not allowed without initialization (and there is no legal
    -- initialization that can be written), as well as being illegal
    -- uses of an incomplete type.

    Obj6 : F3A1A00.A_Tagged_Type'Class;                        -- ERROR:

    Obj16 : Tagged_Inc'Class;                                  -- ERROR:

    type Rec2 is
       record
          Comp : F3A1A00.Tagged_Private'Class;                 -- ERROR:
       end record;

    type Rec12 is
       record
          Comp : Tagged_Inc'Class;                             -- ERROR:
       end record;


    -- Complete the normal incomplete type:
    type Tagged_Inc is tagged null record;


private

    type Tagged_Taft_Inc is tagged;


    -- Note: None of these are primitive operations, so 3.10.1(9.3/2)
    -- does not apply here, unlike in the specific type case.

    procedure Proc22 (A : Tagged_Taft_Inc'Class);              -- OK.

    procedure Proc24 (Ptr : access Tagged_Taft_Inc'Class);     -- OK.

    function Func22 return Tagged_Taft_Inc'Class;              -- ERROR:

    function Func24 return access Tagged_Taft_Inc'Class;       -- OK.

    type Acc22 is access procedure
                  (Obj : in out Tagged_Taft_Inc'Class);        -- OK.

    type Acc24 is access function return Tagged_Taft_Inc'Class;-- ERROR:

    Obj22 : access procedure (Obj : Tagged_Taft_Inc'Class);    -- OK.

    Obj24 : access function return Tagged_Taft_Inc'Class;      -- ERROR:

end B3A1A04;
