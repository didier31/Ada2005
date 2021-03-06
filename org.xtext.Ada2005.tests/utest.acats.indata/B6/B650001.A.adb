-- B650001
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
--     Check that the return_subtype_indication of an extended return
--     statement cannot:
--        (A) have a different type than the result subtype of the function
--            it appears in if that result subtype is given by a subtype_mark;
--        (B) be unconstrained if the result subtype of the function it
--            appears in is given by a subtype_mark and is constrained;
--        (C) fail to statically match the result subtype of the function
--            that it appears in if that subtype is given by a subtype_mark and
--            is constrained or is given by an access_definition;
--        (D) be indefinite unless an expression is given in the return
--            statement;
--        (E) be a subtype_indication if the result subtype of the function
--            is given by an access_definition, and vice-versa.
--
-- CHANGE HISTORY:
--      21 Sep 2007   RLB   Created test (none submitted).
--
--!
with Report;
procedure B650001 is

    type Arr is array (Positive range <>) of Integer;
    subtype SArr is Arr(1..3);
    subtype SArr_DBounds is Arr(2..4);
    subtype SArr_Dyn is Arr(1..Report.Ident_Int(3));
    subtype SArr_OK is Arr(1..3);
    type Arr2 is array (Positive range <>) of Integer;
    type Rec (D : Boolean) is record
        A : Arr (1..2);
        case D is
            when True =>
                Depth : Integer;
            when False => null;
        end case;
    end record;
    subtype DRec is Rec(D => True);
    subtype DRec_Bad is Rec(D => False);
    subtype DRec_OK is Rec(D => True);
    type Acc is access all Integer;
    subtype NAcc is not null Acc;
    type Acc2 is access all Integer;

    function Return_Arr  (P : in Natural) return Arr;

    function Return_SArr (P : in Natural) return SArr;

    function Return_Rec  (P : in Natural) return Rec;

    function Return_DRec (P : in Natural) return DRec;

    function Return_Acc  (P : in Natural) return Acc;

    function Return_NAcc (P : in Natural) return not null Acc;

    function Return_AAcc (P : in Natural) return access Integer;

    function Return_Arr  (P : in Natural) return Arr is
    begin
        case P is
            when 1 =>
                return R : Arr2 := (1, 2, 3) do                 -- ERROR: A
                    null;
                end return;
            when 2 =>
                return R : Arr do                               -- ERROR: D
                    null;
                end return;
            when 3 =>
                return R : SArr do                              -- OK.
                    null;
                end return;
            when others =>
                return R : Arr := (1, 2, 3) do                  -- OK.
                    null;
                end return;
        end case;
    end Return_Arr;


    function Return_SArr (P : in Natural) return SArr is
    begin
        case P is
            when 1 =>
                return R : Arr2(1..3) do                        -- ERROR: A
                    null;
                end return;
            when 2 =>
                return R : Arr := (1, 2, 3) do                  -- ERROR: B
                    null;
                end return;
            when 3 =>
                return R : SArr_DBounds do                      -- ERROR: C
                    null;
                end return;
            when 4 =>
                return R : SArr_Dyn do                          -- ERROR: C
                    null;
                end return;
            when 5 =>
                return R : SArr_OK do                           -- OK.
                    null;
                end return;
            when others =>
                return R : SArr do                              -- OK.
                    null;
                end return;
        end case;
    end Return_SArr;


    function Return_Rec  (P : in Natural) return Rec is
    begin
        case P is
            when 1 =>
                return R : Rec do                               -- ERROR: D
                    null;
                end return;
            when 2 =>
                return R : DRec do                              -- OK.
                    null;
                end return;
            when 3 =>
                return R : Rec(False) do                        -- OK.
                    null;
                end return;
            when others =>
                return R : Rec := (D => False, A => (1,2)) do   -- OK.
                    null;
                end return;
        end case;
    end Return_Rec;


    function Return_DRec (P : in Natural) return DRec is
    begin
        case P is
            when 1 =>
                return R : Rec := (D => False, A => (1,2)) do   -- ERROR: B
                    null;
                end return;
            when 2 =>
                return R : DRec_Bad do                          -- ERROR: C
                    null;
                end return;
            when 3 =>
                return R : DRec_OK do                           -- OK.
                    null;
                end return;
            when others =>
                return R : DRec do                              -- OK.
                    null;
                end return;
        end case;
    end Return_DRec;


    function Return_Acc  (P : in Natural) return Acc is
    begin
        case P is
            when 1 =>
                return R : Acc2 := null do                      -- ERROR: A
                    null;
                end return;
            when 2 =>
                return R : NAcc := new Integer'(1) do           -- ERROR: C
                    null;
                end return;
            when 3 =>
                return R : not null Acc := new Integer'(1) do   -- ERROR: C
                    null;
                end return;
            when 4 =>
                return R : access Integer := null do            -- ERROR: E
                    null;
                end return;
            when others =>
                return R : Acc := null do                       -- OK.
                    null;
                end return;
        end case;
    end Return_Acc;


    function Return_NAcc (P : in Natural) return not null Acc is
    begin
        case P is
            when 1 =>
                return R : not null Acc2 := new Integer'(80) do -- ERROR: A
                    null;
                end return;
            when 2 =>
                return R : NAcc := new Integer'(1) do           -- OK.
                    null;
                end return;
            when 3 =>
                return R : not null access Integer := null do   -- ERROR: E
                    null;
                end return;
            when others =>
                return R : not null Acc := new Integer'(4) do   -- OK.
                    null;
                end return;
        end case;
    end Return_NAcc;


    function Return_AAcc (P : in Natural) return access Integer is
    begin
        case P is
            when 1 =>
                return R : Acc := null do                       -- ERROR: E
                    null;
                end return;
            when 2 =>
                return R : not null access Integer := null do   -- ERROR: C
                    null;
                end return;
            when 3 =>
                return R : access constant Integer := null do   -- ERROR: C
                    null;
                end return;
            when others =>
                return R : access Integer := null do            -- OK.
                    null;
                end return;
        end case;
    end Return_AAcc;

begin
    null;
end B650001;

