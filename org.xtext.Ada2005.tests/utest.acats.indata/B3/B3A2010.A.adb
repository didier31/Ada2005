-- B3A2010.A
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
--      statically deeper than that of S. Check for cases where P'Access
--      occurs in the visible and private part of an instance.
--
-- TEST DESCRIPTION:
--      In order to satisfy accessibility requirements, the designated
--      subprogram P must be at the same or a less deep nesting level than the
--      access-to-subprogram type S -- P must "live" as long as S. Nesting
--      levels are the run-time nestings of masters: block statements;
--      subprogram, task, and entry bodies; and accept statements. Packages
--      are invisible to accessibility rules.
--
--      This test declares two generic packages in which P is declared in
--      the instance itself: one in which P'Access occurs in the visible
--      part, and one in which P'Access occurs in the private part.  In both 
--      cases the type S of P'Access is also passed as an actual parameter,
--      and the accessibility level of P is that of the instance.
--
--      The test declares access-to-subprogram types in various packages and 
--      subprogram bodies. These types are passed as actuals to instantiations, 
--      which are attempted at various nesting levels. The test verifies that 
--      P'Access is illegal when P is declared at a nesting level deeper than 
--      that of the type of P'Access, and legal otherwise.
--
--      The nesting structure is as follows:
--
--          - Library-level package         (Level = 0)
--         |
--          - end package
--
--          - Main subprogram               (Level = 1)
--         |
--         |     *** testing here
--         |
--         |    - Nested procedure          (Level = 2)
--         |   |     *** testing here
--         |   |  begin
--         |    - end procedure
--         |
--         |  begin
--          - end main subprogram
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--
--!

package B3A2010_0 is

   type Acc_L0 is access procedure (I : Integer);               -- Level = 0.

end B3A2010_0;


     --==================================================================--


-- For the generic below, the subprogram P used in P'Access will be declared
-- within the instance itself. The accessibility of P is therefore tied to the
-- nesting level of the instance. The access type S of P'Access is also passed
-- as an actual. The nesting level of P must be at least as high as that of S.

generic
   type Formal_Acc is access procedure (I : Integer); 
package B3A2010_1 is

   procedure Designated_Proc_A (I : Integer);

   AP_GA : constant Formal_Acc := Designated_Proc_A'Access;

end B3A2010_1;


package body B3A2010_1 is

   procedure Designated_Proc_A (I : Integer) is                           
   begin
      null; -- Artificial for brevity.
   end Designated_Proc_A;

end B3A2010_1;

     --==================================================================--


-- For the generic below, the subprogram P used in P'Access will be declared
-- within the instance itself. The accessibility of P is therefore tied to the
-- nesting level of the instance. The access type S of P'Access is also passed
-- as an actual. The nesting level of P must be at least as high as that of S.

generic
   type Formal_Acc is access procedure (I : Integer); 
package B3A2010_2 is

   procedure Designated_GB (I : Integer);

private
   AP_GB : constant Formal_Acc := Designated_GB'Access;
end B3A2010_2;


package body B3A2010_2 is

   procedure Designated_GB (I : Integer) is                           
   begin
      null; -- Artificial for brevity.
   end Designated_GB;

end B3A2010_2;

     --==================================================================--


with B3A2010_0;
with B3A2010_1;
with B3A2010_2;

procedure B3A2010 is

   type Acc_L1 is access procedure (I : Integer);               -- Level = 1.

   --
   -- Cases where P'Access is in the visible part:
   --
   
   package Proc_Vis_A is new B3A2010_1 (B3A2010_0.Acc_L0);          -- ERROR:
                      -- Accessibility level of Proc_Vis_A.Designated_Proc_A
                      -- is deeper than that of B3A2010_0.Acc_L0.

   package Prov_Vis_B is new B3A2010_1 (Acc_L1);                      -- OK.

   --
   -- Cases where P'Access is in the private part:
   --   

   package Proc_Private_A is new B3A2010_2 (B3A2010_0.Acc_L0);      -- ERROR:
                      -- Accessibility level of Proc_Private_A.Designated_GB
                      -- is deeper than that of B3A2010_0.Acc_L0.

   package Proc_Private_B is new B3A2010_2 (Acc_L1);                  -- OK.

--
-- Nested subprogram:
--

   procedure Nested is

      type Acc_L2 is access procedure (I : Integer);            -- Level = 2.

      --
      -- Cases where P'Access is in the visible part:
      --

      package Proc_Vis_C is new B3A2010_1 (B3A2010_0.Acc_L0);        -- ERROR:
                       -- Accessibility level of Proc_Vis_C.Designated_Proc_A
                       -- is deeper than that of B3A2010_0.Acc_L0.

      package Proc_Vis_D is new B3A2010_1 (Acc_L1);                  -- ERROR:
                       -- Accessibility level of Proc_Vis_D.Designated_Proc_A
                       -- is deeper than that of Acc_L1.

      package Proc_Vis_E is new B3A2010_1 (Acc_L2);                    -- OK.

      --
      -- Cases where P'Access is in the private part:
      --   

      package Proc_Private_C is new B3A2010_2 (B3A2010_0.Acc_L0);   -- ERROR:
                       -- Accessibility level of Proc_Private_C.Designated_GB
                       -- is deeper than that of B3A2010_0.Acc_L0.

      package Proc_Private_D is new B3A2010_2 (Acc_L1);             -- ERROR:
                       -- Accessibility level of Proc_Private_C.Designated_GB
                       -- is deeper than that of Acc_L1.

      package Proc_Private_E is new B3A2010_2 (Acc_L2);                -- OK.


   begin -- Nested.
      null;
   end Nested;


begin -- B3A2010
   null;
end B3A2010;
