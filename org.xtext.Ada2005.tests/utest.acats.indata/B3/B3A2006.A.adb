-- B3A2006.A
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
--      Check that, for P'Access of an access-to-subprogram type S, the
--      accessibility level of the subprogram denoted by P must not be
--      statically deeper than that of S.
--
-- TEST DESCRIPTION:
--      In order to satisfy accessibility requirements, the designated
--      subprogram P must be at the same or a less deep nesting level than the
--      access-to-subprogram type S -- P must "live" as long as S. Nesting
--      levels are the run-time nestings of masters: block statements;
--      subprogram, task, and entry bodies; and accept statements. Packages
--      are invisible to accessibility rules.
--
--      The language rules imply that downward closures (passing the identity
--      of a more nested subprogram to a less nested subprogram) using
--      P'Access are not supported. To illustrate this, the test constructs a
--      series of iterator abstractions at various levels of nesting. Each
--      ERROR case is an attempted downward closure.
--
--      Cases where P is defined by a renaming declaration are included.
--
--      If P is a view of a subprogram defined by a renaming declaration, its
--      accessibility level is that of the renamed view.
--
--      Accessibility is checked in two contexts: P'Access is passed as an
--      actual to a subprogram (the downward closure examples); P'Access is
--      assigned to an access object.
--
--      The nesting structure is as follows:
--
--          - Library-level package                          (Level = 0)
--         |
--          - end package
--
--          - Library-level procedure (to be designated)     (Level = 0)
--         |
--          - end procedure
--
--          - Library-level function
--         |     - Nested procedure (to be designated)       (Level = 1)
--         |    |
--         |     - end procedure
--         |
--         |     - Nested task
--         |    |     - Nested procedure (to be designated)  (Level = 2)
--         |    |    |
--         |    |     - end procedure
--         |    |  begin
--         |    |     *** testing here
--         |     - end task
--         |  begin          
--         |     *** testing here
--          - end function
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--
--!

package B3A2006_0 is

   type Integer_Set is private;

   type Integer_Action_L0 is access procedure (I : Integer);     -- Level = 0.

   procedure Iterate_L0 (S      : Integer_Set; 
                         Action : Integer_Action_L0);

   Result_L0 : Natural := 0;

private

   type Integer_Set is new Integer range -1000..1000;

end B3A2006_0;


     --==================================================================--


package body B3A2006_0 is

   procedure Iterate_L0 (S      : Integer_Set; 
                         Action : Integer_Action_L0) is
   begin
      null; -- Artificial for brevity.
   end Iterate_L0;

end B3A2006_0;


     --==================================================================--


with B3A2006_0;
procedure B3A2006_1 (I : Integer) is                             -- Level = 0.
begin
   B3A2006_0.Result_L0 := B3A2006_0.Result_L0 + Natural(I);
end B3A2006_1;


     --==================================================================--


with B3A2006_0;
with B3A2006_1;

function B3A2006 (S : B3A2006_0.Integer_Set) return Natural is

   procedure Rename_L0 (J : Integer) renames B3A2006_1;          -- Level = 0.

   Result_L1 : Natural := 0;

   procedure Increment_L1 (I : Integer) is                       -- Level = 1.
   begin
      Result_L1 := Result_L1 + Natural(I);
   end Increment_L1;

   type Integer_Action_L1 is access procedure (I : Integer);     -- Level = 1.

   AP1 : Integer_Action_L1;


   procedure Iterate_L1 (S      : B3A2006_0.Integer_Set; 
                         Action : Integer_Action_L1) is
   begin
      null; -- Artificial for brevity.
   end Iterate_L1;

   --
   -- Nested task:
   --

   task Tsk;

   task body Tsk is

      Result_L2 : Natural := 0;

      procedure Rename_L1 (K : Integer)  renames Increment_L1;   -- Level = 1.
                          -- Renamed at deeper level than originally declared.

      procedure Increment_L2 (I : Integer) is                    -- Level = 2.
      begin
         Result_L2 := Result_L2 + Natural(I);
      end Increment_L2;

      type Integer_Action_L2 is access procedure (I : Integer);  -- Level = 2.

      AP2 : Integer_Action_L2;

      Renamed_AP1 : Integer_Action_L1 renames AP1;               -- Level = 1.
                          -- Renamed at deeper level than originally declared.

      type New_Int_Act_L1 is new Integer_Action_L1;              -- Level = 1.
                 -- Type declared at deeper level than ultimate ancestor type.
  
      NIA_L1 : New_Int_Act_L1;

   begin -- Tsk.

      B3A2006_0.Iterate_L0 (S, Increment_L2'Access);                -- ERROR:
                        -- Accessibility level of Increment_L2 is deeper than
                        -- that of B3A2006_0.Integer_Action_L0.

      Iterate_L1 (S, Increment_L2'Access);                          -- ERROR:
                        -- Accessibility level of Increment_L2 is deeper than
                        -- that of Integer_Action_L1.

      Iterate_L1 (S, Rename_L1'Access);                             -- OK.

      AP2 := B3A2006_1'Access;                                      -- OK.
      AP2 := Increment_L1'Access;                                   -- OK.
      AP2 := Increment_L2'Access;                                   -- OK.

      AP1 := B3A2006_1'Access;                                      -- OK.
      AP1 := Increment_L1'Access;                                   -- OK.
      AP1 := Increment_L2'Access;                                   -- ERROR:
                        -- Accessibility level of Increment_L2 is deeper than
                        -- that of Integer_Action_L1.

      Renamed_AP1 := Increment_L1'Access;                           -- OK.
      Renamed_AP1 := Increment_L2'Access;                           -- ERROR:
                        -- Accessibility level of Increment_L2 is deeper than
                        -- that of Integer_Action_L1.

      NIA_L1 := Increment_L1'Access;                                -- OK.
      NIA_L1 := Increment_L2'Access;                                -- ERROR:
                        -- Accessibility level of Increment_L2 is deeper than
                        -- that of New_Int_Act_L1.

   end Tsk;

begin -- B3A2006

   B3A2006_0.Iterate_L0 (S, B3A2006_1'Access);                      -- OK.
   B3A2006_0.Iterate_L0 (S, Increment_L1'Access);                   -- ERROR:
                        -- Accessibility level of Increment_L1 is deeper than
                        -- that of B3A2006_0.Integer_Action_L0.

   B3A2006_0.Iterate_L0 (S, Rename_L0'Access);                      -- OK.

   Iterate_L1 (S, B3A2006_1'Access);                                -- OK.
   Iterate_L1 (S, Increment_L1'Access);                             -- OK.

   return Result_L1;

end B3A2006;
