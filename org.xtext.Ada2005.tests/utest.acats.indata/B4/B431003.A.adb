-- B431003
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
--    Check that the type of a record aggregate cannot be for a record
--    extension that is descended from any private type or private extension.
--
-- TEST DESCRIPTION:
--    We try both giving all of the components (whether or not they ought
--    to be visible) and just giving the visible components, as either
--    of these would be likely ways for a compiler to believe that an
--    aggregaate is legal.

-- CHANGE HISTORY:
--    26 Apr 2007   RLB   Created test from outline of existing ACATS test.
--    07 Apr 2009   RLB   Added additional test cases after finding that
--                        at least one implementation passed the test without
--                        implementing the objective.
--!

package B431003_Root is

   type Base is tagged record
      A : Integer := 11;
      C : Character := 'C';
   end record;

   type Private_Root is tagged private;

private
   type Private_Root is tagged record
      A : Integer := 12;
      C : Character := 'D';
   end record;
end B431003_Root;


with B431003_Root;
package B431003_B is
   type Der2 is new B431003_Root.Base with record
      D : Boolean := True;
   end record;

   type Der4 is new B431003_Root.Private_Root with record
      D : Boolean := True;
   end record;

   type Der6 is new B431003_Root.Base with private;
private
   type Der6 is new B431003_Root.Base with record
      D : Boolean := True;
   end record;
end B431003_B;


with B431003_B;
package B431003_C is
    type Der3 is new B431003_B.Der2 with record
        E : Character := 'E';
    end record;

    type Der5 is new B431003_B.Der4 with record
        E : Character := 'E';
    end record;

    type Der7 is new B431003_B.Der6 with record
        E : Character := 'E';
    end record;
end B431003_C;


with B431003_C;
package B431003_D is
    type Der8 is new B431003_C.Der5 with record
        B : Boolean := True;
    end record;

    type Der9 is new B431003_C.Der7 with record
        B : Boolean := True;
    end record;
end B431003_D;


with B431003_Root, B431003_B, B431003_C, B431003_D;
procedure B431003 is
    -- Giving all components:
    OB : B431003_Root.Base := (A => 1, C => 'A');            -- OK.
    OP : B431003_Root.Private_Root := (A => 1, C => 'A');    -- ERROR:
    O2 : B431003_B.Der2 :=
                  (A => 1, C => 'A', D => True);             -- OK.
    O3 : B431003_C.Der3 :=
                  (A => 1, C => 'A', D => True, E => 'A');   -- OK.
    O4 : B431003_B.Der4 :=
                  (A => 1, C => 'A', D => True);             -- ERROR:
    O5 : B431003_C.Der5 :=
                  (A => 1, C => 'A', D => True, E => 'A');   -- ERROR:
    O6 : B431003_B.Der6 :=
                  (A => 1, C => 'A', D => True);             -- ERROR:
    O7 : B431003_C.Der7 :=
                  (A => 1, C => 'A', D => True, E => 'A');   -- ERROR:
    O8 : B431003_D.Der8 :=
                  (A => 1, B => True, C|E => 'A', D => True);-- ERROR:
    O9 : B431003_D.Der9 :=
                  (A => 1, B => True, C|E => 'A', D => True);-- ERROR:

    -- Giving just visible components:
    O14 : B431003_B.Der4 :=
                  (D => True);                               -- ERROR:
    O15 : B431003_C.Der5 :=
                  (D => True, E => 'A');                     -- ERROR:
    O16 : B431003_B.Der6 :=
                  (A => 1, C => 'A');                        -- ERROR:
    O17 : B431003_C.Der7 :=
                  (A => 1, C => 'A', E => 'A');              -- ERROR:
    O18 : B431003_D.Der8 :=
                  (B => True, E => 'A', D => True);          -- ERROR:
    O19 : B431003_D.Der9 :=
                  (A => 1, B => True, C|E => 'A');           -- ERROR:
begin
    null;
end B431003;

