-- B432001
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
--    Check rules related to the type of the ancestor expression or subtype
--    in an extension aggregate:
--       (A) the ancestor type cannot be unrelated to the type of the aggregate;
--       (B) the type of the aggregate cannot be derived from the type of
--           the ancestor through one or more private extensions;
--       (C) the type of the ancestor cannot be untagged;
--       (D) the ancestor subtype cannot be classwide;
--       (E) the ancestor expression cannot be dynamically tagged;
--       (F) the type of the ancestor cannot be the same as or derived from
--           the type of the aggregate;
--       (G) the type of the aggregate or the components given cannot be used
--           to resolve the ancestor expression.
--    Also, check that the type of an extension aggregate cannot be a
--    tagged record type or a private extension. (H)
--
-- CHANGE HISTORY:
--    25 Apr 2007   RLB   Created test from test donated by RR Software, Inc.
--!

package B432001_Root is

   type Base is tagged record
      A : Integer := 11;
      C : Character := 'C';
   end record;
   function New_One return Base;
   function Factory return Base'Class;

   type Unrelated is tagged record
      A : Integer := 12;
      B : Boolean := False;
      C : Character := 'D';
   end record;

   package Nested is
      function Wild return Base;
      function Wild return Natural;

      function Loaded return Base;
      function Loaded return Unrelated;

      function Val return Integer;
   end Nested;

end B432001_Root;


package body B432001_Root is
   function New_One return Base is
   begin
      return (A => 1, C => 'A');
   end New_One;

   function Factory return Base'Class is
   begin
      return New_One;
   end Factory;

   package body Nested is
      function Wild return Base is
      begin
         return (A => 23, C => 'C');
      end Wild;

      function Wild return Natural is
      begin
         return 2;
      end Wild;

      function Loaded return Base is
      begin
         return New_One;
      end Loaded;

      function Loaded return Unrelated is
      begin
         return (A => 4, B => False, C => '2');
      end Loaded;

      function Val return Integer is
      begin
         return 5;
      end Val;
   end Nested;

end B432001_Root;


with B432001_Root;
package B432001_B is
   type Der2 is new B432001_Root.Base with record
      B : Boolean := True;
   end record;
   function New_One return Der2;
end B432001_B;


package body B432001_B is
   function New_One return Der2 is
   begin
      return (A => 1, C => 'A', B => True);
   end New_One;
end B432001_B;


with B432001_B;
package B432001_C is
   type Der3 is new B432001_B.Der2 with record
      D : Boolean := True;
   end record;
   function New_One return Der3;

   type Der4 is new B432001_B.Der2 with null record;
   function New_One return Der4;

   type Der6 is new B432001_B.Der2 with private;
   function New_One return Der6;
private
   type Der6 is new B432001_B.Der2 with record
      D : Boolean := True;
   end record;
end B432001_C;


package body B432001_C is
    function New_One return Der3 is
    begin
        return (A => 1, C => 'A', B => False, D => True);
    end New_One;

    function New_One return Der4 is
    begin
        return (A => 1, C => 'A', B => True);
    end New_One;

    function New_One return Der6 is
    begin
        return (A => 1, C => 'A', B => True, D => False);
    end New_One;
end B432001_C;


with B432001_C;
package B432001_D is
    type Der5 is new B432001_C.Der4 with record
        E : Character := 'E';
    end record;
    function New_One return Der5;

    type Der7 is new B432001_C.Der6 with record
        E : Character := 'E';
    end record;
    function New_One return Der7;

    type Der8 is new B432001_C.Der4 with null record;
    function New_One return Der8;

end B432001_D;


package body B432001_D is
    function New_One return Der5 is
    begin
        return (A => 1, C => 'A', B => True, E => 'F');
    end New_One;

    function New_One return Der7 is
        On : Der7;
    begin
        return On;
    end New_One;

    function New_One return Der8 is
    begin
        return (A => 1, C => 'A', B => True);
    end New_One;
end B432001_D;


with B432001_Root, B432001_B, B432001_C, B432001_D;
use  B432001_Root, B432001_B, B432001_C, B432001_D;
procedure B432001 is
    Un : B432001_Root.Unrelated;
    Bn : B432001_Root.Base := (A => 1, C => 'A');
    D2 : B432001_B.Der2 := (Bn with B => False);             -- OK.
    D4 : B432001_C.Der4 := (Bn with B => True);              -- OK.
    D8 : B432001_D.Der8 := (D4 with others => <>);           -- OK.
    O1 : B432001_C.Der3 :=
                  (Bn with B => True, D => True);            -- OK.
    O2 : B432001_C.Der3 :=
                  (B432001_Root.Base with others => <>);     -- OK.
    O3 : B432001_C.Der3 :=
                  (B432001_Root.Base'Class with B | D => <>);-- ERROR: D.
    O4 : B432001_C.Der3 :=
                  (B432001_Root.Factory with B | D => <>);   -- ERROR: E.
    O5 : B432001_C.Der3 :=
                  (New_One with B => True, D => True);       -- ERROR: G.
    O6 : B432001_C.Der3 :=
                  (B432001_Root.New_One with B => True, D => True); -- OK.
    O7 : B432001_C.Der4 := (D4 with null record);            -- ERROR: F.
    O8 : B432001_C.Der4 := (Nested.Loaded with B => True);   -- ERROR: G.
    O9 : B432001_C.Der4 :=
                  (D8 with null record);                     -- ERROR: F.
    OA : B432001_C.Der4 :=
                  (B432001_D.Der8 with null record);         -- ERROR: F.
    OB : B432001_C.Der4 := (Nested.Val with others => <>);   -- ERROR: C.
    OC : B432001_C.Der4 := (Natural with others => <>);      -- ERROR: C.
    OD : B432001_C.Der4 :=
                  (B432001_Root.Base'Class(Bn) with B => <>);-- ERROR: E.
    OE : B432001_C.Der4 :=
                  (B432001_B.Der2'Class with null record);   -- ERROR: D.
    OG : B432001_D.Der5 := (Bn with B => True, E => 'E');    -- OK.
    OH : B432001_D.Der5 := (D4 with E => 'F');               -- OK.
    OI : B432001_C.Der6 := (Bn with others => <>);           -- ERROR: H.
    OJ : B432001_C.Der6 :=
                  (B432001_Root.Base with others => <>);     -- ERROR: H.
    OK : B432001_D.Der7 :=
                  (B432001_C.Der6 with E => 'F');            -- OK.
    OL : B432001_D.Der7 :=
                  (Bn with B => True, D => False, E => 'F'); -- ERROR: B.
    OM : B432001_D.Der7 :=
                  (D2 with D => False, E => 'F');            -- ERROR: B.
    ON : B432001_Root.Base :=
                  (null with A => 1, C => 'A');              -- ERROR: C, H.
    OV : B432001_C.Der3 :=
                  (B432001_Root.Unrelated with D => True);   -- ERROR: A.
    OW : B432001_C.Der3 :=
                  (Un with D => <>);                         -- ERROR: A.
    OX : B432001_Root.Base := (Nested.Wild with C => 'E');   -- ERROR: H.
    OY : B432001_Root.Base := (A => Nested.Wild, C => 'D');  -- OK.
    OZ : B432001_C.Der4 := (Nested.Wild with B => True);     -- OK.
	    -- (Wild return Natural is not considered, it's not tagged.)
begin
    null;
end B432001;

