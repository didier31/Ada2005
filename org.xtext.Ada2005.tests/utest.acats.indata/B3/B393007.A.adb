-- B393007.A
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
--     DISCLOSED ARE AS IS.  THE GOVERNMENT MAKES NO EXPRESS OR IMPLIED
--     WARRANTY AS TO ANY MATTER WHATSOEVER, INCLUDING THE CONDITIONS OF THE
--     SOFTWARE, DOCUMENTATION OR OTHER INFORMATION RELEASED, MADE AVAILABLE
--     OR DISCLOSED, OR THE OWNERSHIP, MERCHANTABILITY, OR FITNESS FOR A
--     PARTICULAR PURPOSE OF SAID MATERIAL.
--*
--
-- OBJECTIVE:
--      Check that abstract primitive subprograms for an abstract type declared
--      in a visible part are not allowed in the private part (unless they are
--      overriding an inherited subprogram).
--
--      Check that primitive functions with controlling results for a tagged
--      type declared in a visible part are not allowed in the private part
--	(unless they are overriding an inherited subprogram).
--
--      Check that a subprogram that requires overriding cannot be renamed
--      [8.5.4(5.1/2)].
--
-- TEST DESCRIPTION:
--      Declare packages containing various tagged and abstract types.
--      Attempt to declare various illegal operations.
--
--      The errors are marked:
--      A - Abstract primitive subprogram in private part.
--      B - Primitive function with a controlling result in private part.
--      C - Renaming of "requires overriding" subprogram (8.5.4(5.1/2)).
--      D - Illegal homograph with Renaming of "requires overriding" subprogram.
--
--
-- CHANGE HISTORY:
--      17 Dec 99   RLB     Created initial test in response to an Ada user
--                          problem report.
--      08 Dec 00   RLB     Eliminated multiple error cases.
--      21 Mar 07   RLB     Revised to ensure errors remain after Amendment 1
--                          changes.
--      18 Aug 07   RLB     Fixed comment.
--      22 Oct 07   RLB     Fixed more comments.
--
--!

package B393007 is

   package Pkg1 is
      type Root is abstract tagged null record;

      procedure My_Op (Obj : in Root) is abstract; -- OK.
      function "+" (Obj : in Root) return Root is abstract; -- OK.
   end Pkg1;

   package Pkg2 is
      type New_Tagged is abstract new Pkg1.Root with null record;
      -- Inherits My_Op & "+"
   private
      procedure My_Op (Obj : in New_Tagged) is abstract; -- OK.
      function "+" (Obj : in New_Tagged) return New_Tagged is abstract; -- OK.
      procedure Another_Op (Obj : in New_Tagged) is abstract; -- ERROR: A
      function My_Func (Flag : Boolean) return New_Tagged is abstract;-- ERROR:A

      type Private_New_Tagged is abstract new Pkg1.Root with null record;
      procedure Another_Op (Obj : in Private_New_Tagged) is abstract; -- OK.
      function My_Func (Flag : Boolean) return Private_New_Tagged
           is abstract; -- OK.
   end Pkg2;

   package Pkg3 is
      type Root_3 is tagged null record;
      function "+" (Op : Root_3) return Root_3; -- OK.
   private
      function "-" (Op : Root_3) return Root_3; -- ERROR: B
   end Pkg3;

   package Pkg4 is
      type New_Tagged4 is new Pkg1.Root with null record;
   private
      procedure My_Op (Obj : in New_Tagged4); -- OK.
      function "+" (Obj : in New_Tagged4) return New_Tagged4; -- OK.
   end Pkg4;

   package Pkg5 is
      type New_Tagged5 is new Pkg1.Root with null record;
      procedure Old_Op (Obj : in New_Tagged5) renames My_Op;  -- ERROR: C
      procedure My_Op (Obj : in New_Tagged5); -- OK.

      function "-" (Obj : in New_Tagged5) return New_Tagged5
         renames "+";                                         -- ERROR: C
      function "+" (Obj : in New_Tagged5) return New_Tagged5;
      function "-" (Obj : in New_Tagged5) return New_Tagged5; -- ERROR: D
   end Pkg5;

   package Pkg6 is
      type Root_6 is tagged null record;
      function "+" (Op : Root_6) return Root_6; -- OK.
      function "-" (Op : Root_6) return Root_6; -- OK.
   end Pkg6;

   package Pkg7 is
      type New_Tagged7 is new Pkg6.Root_6 with record
          C : Character := 'A'; -- Ensure functions require overriding.
      end record;
      function Old_Plus (Op : New_Tagged7) return New_Tagged7
          renames "+";                                       -- ERROR: C
      function "+" (Op : New_Tagged7) return New_Tagged7;    -- OK.

      function Old_Minus (Op : New_Tagged7) return New_Tagged7
          renames "-";                                       -- ERROR: C
      function "-" (Op : New_Tagged7) return New_Tagged7;    -- OK.

      -- Attempt the required overriding:
      function Old_Minus (Op : New_Tagged7) return New_Tagged7; -- ERROR: D
   end Pkg7;

end B393007;

