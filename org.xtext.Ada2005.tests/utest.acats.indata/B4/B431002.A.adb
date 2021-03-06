-- B431002
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
--    The ACAA has created and maintains the Ada Conformity Assessment Test
--    Suite for the purpose of conformity assessments conducted in accordance
--    with the International Standard ISO/IEC 18009 - Ada: Conformity
--    assessment of a language processor. This test suite should not be used
--    to make claims of conformance unless used in accordance with
--    ISO/IEC 18009 and any applicable ACAA procedures.
--
--*
--
-- OBJECTIVE:
--    Check that syntax rules for the record component association list are
--    enforced for an extension aggregate. Specifically:
--      (A) A positional component association cannot have a <> rather than
--          an expression;
--      (B) Named components cannot precede any positional components;
--      (C) An others component association cannot appear anywhere other
--          than last.
--
-- TEST DESCRIPTION:
--    This objective is testing syntax errors. However, these errors is
--    much more likely to occur in practice than most syntax errors, so we
--    test for them. Moreover, the complex grammar of aggregates and the fact
--    that some of these rules are described in text rather than BNF suggests
--    that it is likely that many implementations will implement them as
--    legality checks, rather than as part of the syntax.
--
--    Illegal aggregates have been surrounded by correct code to ease
--    error recovery.
--
--    This test may appear to belong to 4.3.2 (which defines extension
--    aggregates), but the rules being tested are for record component
--    association list, and those are given in 4.3.1. Thus the test is
--    named as part of 4.3.1.
--
-- CHANGE HISTORY:
--    26 Apr 2007   RLB   Created test from outline of existing ACATS test.
--!

package B431002_Root is

   type Base is tagged record
      A : Integer := 11;
      C : Character := 'C';
   end record;

end B431002_Root;


with B431002_Root;
package B431002_B is
   type Der2 is new B431002_Root.Base with record
      D : Boolean := True;
   end record;
end B431002_B;


with B431002_B;
package B431002_C is
    type Der3 is new B431002_B.Der2 with record
        E : Character := 'E';
    end record;
end B431002_C;


with B431002_C;
package B431002_D is
    type Der4 is new B431002_C.Der3 with record
        B : Boolean := True;
    end record;
end B431002_D;


with B431002_Root, B431002_B, B431002_C, B431002_D;
procedure B431002 is
    Bn : B431002_Root.Base := (A => 1, C => 'A');
begin
    declare
        O1 : B431002_B.Der2 := (Bn with D => <>);                  -- OK.
        O2 : B431002_B.Der2 := (Bn with <>);                       -- ERROR: A
    begin
        if O1.D then
            null;
        end if;
    end;
    declare
        O3 : B431002_C.Der3 := (B431002_Root.Base with True, 'A'); -- OK.
        O4 : B431002_C.Der3 := (B431002_Root.Base with True, <>);  -- ERROR: A
    begin
        if O3.D then
            null;
        end if;
    end;
    declare
        O5 : B431002_D.Der4 := (Bn with True, B => True, E => <>); -- OK.
        O6 : B431002_D.Der4 := (Bn with <>, B => True, E => <>);   -- ERROR: A
    begin
        if O5.D then
            null;
        end if;
    end;
    declare
        O7 : B431002_D.Der4 := (Bn with True, E => <>, B => True); -- OK.
        O8 : B431002_D.Der4 := (Bn with D => True, E => <>, True); -- ERROR: B
    begin
        if O7.D then
            null;
        end if;
    end;
    declare
        O9 : B431002_D.Der4 := (B431002_B.Der2 with
                                  E => 'D', others => True);       -- OK.
        OA : B431002_D.Der4 := (B431002_B.Der2 with
                                  E => 'D', True);                 -- ERROR: B
    begin
        if O9.D then
            null;
        end if;
    end;
    declare
        O9A: B431002_D.Der4 := (Bn with True, E => 'A', B => True);-- OK.
        OAA: B431002_D.Der4 := (Bn with True, E => 'A', True);     -- ERROR: B
    begin
        if O9A.D then
            null;
        end if;
    end;
    declare
        OB : B431002_D.Der4 := (Bn with E => <>, others => True);  -- OK.
        OC : B431002_D.Der4 := (Bn with others => True, E => <>);  -- ERROR: C
    begin
        if OB.D then
            null;
        end if;
    end;
    declare
        OD : B431002_D.Der4 := (Bn with True, others => <>);       -- OK.
        OE : B431002_D.Der4 := (Bn with others => <>, True);       -- ERROR: C
    begin
        if OD.D then
            null;
        end if;
    end;
    declare
        OG : B431002_D.Der4 := (Bn with
                                B | D => True, others => 'A');     -- OK.
        OH : B431002_D.Der4 := (Bn with
                                others => True, others => 'A');    -- ERROR: C
    begin
        if OG.D then
            null;
        end if;
    end;
    declare
        OI : B431002_D.Der4 := (Bn with E => <>,
                                      D => False, B => True);      -- OK.
        OJ : B431002_D.Der4 := (Bn with E => <>,
                                      others => False, B => True); -- ERROR: C
    begin
        if OI.D then
            null;
        end if;
    end;
    declare
        OK : B431002_D.Der4 := (Bn with
                                 True, E => <>, B => True);        -- OK.
        OL : B431002_D.Der4 := (Bn with
                                 False, others => <>, B => True);  -- ERROR: C
    begin
        if OK.D then
            null;
        end if;
    end;
    declare
        OM : B431002_B.Der2 := (Bn with D => False, others => <>); -- OK.
        ON : B431002_B.Der2 := (Bn with others => <>, D => False); -- ERROR: C
    begin
        if OM.D then
            null;
        end if;
    end;
end B431002;

