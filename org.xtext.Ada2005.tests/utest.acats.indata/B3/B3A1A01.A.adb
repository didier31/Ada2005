-- B3A1A01.A
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
--     Check that the name of an untagged incomplete view cannot be used as
--     the subtype_mark of a parameter in a formal part.
--
--     Check that the name of an incomplete view cannot be used as
--     the subtype_mark of the result of a function.
--
-- TEST DESCRIPTION:
--
--     We test both normal and tagged incomplete types, and untagged and
--     tagged incomplete views from the limited view of a package.
--
--     We also test named and anonymous access-to-subprogram types,
--     excepting cases allowed by 3.10.1(9.2/2) [when the completion
--     is given in the same declaration list].
--
-- CHANGE HISTORY:
--     29 May 2008  RLB  Created test.
--     01 Oct 2008  RLB  Corrected test errors.
--
limited with F3A1A00;
package B3A1A01 is

    procedure Proc1 (A : F3A1A00.An_Untagged_Type);            -- ERROR:

    procedure Proc2 (A : F3A1A00.A_Tagged_Type);               -- OK.

    procedure Proc3 (Cnt : in Natural;
                     Obj : out F3A1A00.Untagged_Private);      -- ERROR:

    procedure Proc4 (Cnt : in Natural;
                     Obj : out F3A1A00.Tagged_Private);        -- OK.

    procedure Proc5 (Wobble : in out
                                 F3A1A00.An_Access_to_Tagged); -- ERROR:

    procedure Proc6 (Wobble : access F3A1A00.A_Tagged_Type);   -- OK.

    function Func1 (Ouch : Boolean)
                   return F3A1A00.An_Untagged_Type;            -- ERROR:

    function Func2 (Rash : Character)
                   return F3A1A00.A_Tagged_Type;               -- ERROR:

    function Func3 (Flat : Natural)
                   return F3A1A00.An_Access_to_Untagged;       -- ERROR:

    function Func4 (Curve : Float)
                   return access F3A1A00.An_Untagged_Type;     -- OK.

    type Acc1 is access procedure
                  (Obj : F3A1A00.An_Untagged_Type);            -- ERROR:

    type Acc2 is access procedure
                  (Obj : in F3A1A00.Tagged_Private);           -- OK.

    type Acc3 is access procedure
                  (Obj : in F3A1A00.An_Access_to_Untagged);    -- ERROR:

    type Acc4 is access function return
                  F3A1A00.A_Tagged_Type;                       -- ERROR:

    type Acc5 is access function return
                  F3A1A00.Untagged_Private;                    -- ERROR:

    type Acc6 is access function return
                  F3A1A00.An_Access_to_Tagged;                 -- ERROR:

    type Acc7 is access function return
                  access F3A1A00.Tagged_Private;               -- OK.

    Obj1 : access procedure
                  (Obj : F3A1A00.An_Untagged_Type);            -- ERROR:

    Obj2 : access procedure
                  (Obj : in F3A1A00.Tagged_Private);           -- OK.

    Obj3 : access procedure
                  (Obj : in F3A1A00.An_Access_to_Untagged);    -- ERROR:

    Obj4 : access function return F3A1A00.A_Tagged_Type;       -- ERROR:

    Obj5 : access function return F3A1A00.Untagged_Private;    -- ERROR:

    Obj6 : access function return F3A1A00.An_Access_to_Tagged; -- ERROR:


    type Untagged_Inc;

    type Tagged_Inc is tagged;


    procedure Proc11 (A : Untagged_Inc);                       -- ERROR:

    procedure Proc12 (A : Tagged_Inc);                         -- OK.

    procedure Proc13 (Grab : access Untagged_Inc);             -- OK.

    function Func11 return Untagged_Inc;                       -- ERROR:

    function Func12 return Tagged_Inc;                         -- ERROR:

    function Func13 (Shape : Natural)
                   return access Untagged_Inc;                 -- OK.

    type Acc11 is access procedure (Obj : Untagged_Inc);       -- OK.

    type Acc12 is access procedure (Obj : in out Tagged_Inc);  -- OK.

    type Acc13 is access function return Untagged_Inc;         -- OK.

    type Acc14 is access function return Tagged_Inc;           -- OK.


    type Untagged_Inc is null record;

    type Tagged_Inc is tagged null record;


private

    type Untagged_Taft_Inc;

    type Tagged_Taft_Inc is tagged;


    -- Note: Primitive subprograms of these types are illegal by
    -- 3.10.1(9.3/2), thus they are omitted here. Also, 3.10.1(9.2/2)
    -- does not apply to these types, so most of the following are illegal:

    type Acc21 is access procedure
                  (Obj : Untagged_Taft_Inc);                   -- ERROR:

    type Acc22 is access procedure
                  (Obj : in out Tagged_Taft_Inc);              -- OK.

    type Acc23 is access function return Untagged_Taft_Inc;    -- ERROR:

    type Acc24 is access function return Tagged_Taft_Inc;      -- ERROR:

    Obj21 : access procedure (Obj : Untagged_Taft_Inc);        -- ERROR:

    Obj22 : access procedure (Obj : Tagged_Taft_Inc);          -- OK.

    Obj23 : access function return Untagged_Taft_Inc;          -- ERROR:

    Obj24 : access function return Tagged_Taft_Inc;            -- ERROR:

end B3A1A01;
