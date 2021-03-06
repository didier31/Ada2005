-- B3A2013.A
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
--      Check that, for X'Access of a general access type A, the accessibility
--      level of the view denoted by X must not be statically deeper than that
--      of the access type A.  
--
--      Check for cases where X is:
--         (a) a current instance of a limited type.
--         (b) a current instance of a limited type in a type conversion.
--
--
-- TEST DESCRIPTION:
--      In order to satisfy accessibility requirements, the designated
--      object X must be at the same or a higher (less deep) nesting level 
--      than the general access type A -- X must "live" as long as A.  The
--      relevant nesting levels are those of block statements, subprogram 
--      and task bodies (packages are invisible to accessibility rules).
--
--      The current instance of the type is presumed to be an object created
--      at a deeper level than that of the type.
--
--      This test declares general access types with discriminants in a
--      package, and verifies that X'Access is illegal when X is a current 
--      instance of a limited type for record, task body, and type conversion 
--      declarations.
--
--
-- CHANGE HISTORY:
--      28 FEB 95   SAIC    Initial prerelease version.
--      05 MAY 96   SAIC    Modified objective and test description. Changed 
--                          AccPriv to be general access type.
--      20 OCT 96   SAIC    ACVC 2.1:  Modified to relocate error.
--
--!

package B3A2013 is

   task type Task_Type;
   type AccTaskType is access all Task_Type;

end B3A2013;
 

     --==================================================================--


package body B3A2013 is

   task body Task_Type is
      -- Current instance of a limited type is aliased. 
         C : AccTaskType := Task_Type'Access;                         -- ERROR:
                       -- Accessibility level of the current instance Task_Type
                       -- could be deeper than the level of AccTaskType.
                       -- Assume-the-worst checking.
   begin
      null;
   end Task_Type;

                      -------------------------------------


   package Nested is

   --
   -- Types with access discriminants, and associated types:
   --

      type OuterA is tagged limited private;
      type InnerA (Ptr : access OuterA'Class) is tagged limited null record;
      type AccOuterA is access OuterA;

      type OuterB is tagged limited private;
      type InnerB (Ptr : access OuterB) is limited null record;
      type AccInnerB is access InnerB;
 
      type Lim_Priv is limited private;
 
      type AccInt is access all Integer;

      type Rec (Ptr : access Integer) is limited private;
      type AccRec is access all Rec;
      function Func1 (P : access Rec) return Boolean;
      function Func2 (P : AccRec) return Boolean;

   private

      type OuterA is tagged limited record
      -- Current instance of a limited type is aliased. 
         C : InnerA (OuterA'Access);                                  -- OK.
      end record;

      type OuterB is tagged limited record
      -- Current instance of a limited type is aliased. 
         C : AccInnerB := new InnerB (OuterB'Access);                 -- ERROR:
                          -- Accessibility level of the current instance OuterB
                          -- could be deeper than the level of AccInnerB.
                          -- Assume-the-worst checking.
      end record;

      type AccPriv is access all Lim_Priv;
 
      type Lim_Priv is limited record
      -- Current instance of a limited type is aliased. 
         C : AccPriv := Lim_Priv'Access;                              -- ERROR:
                        -- Accessibility level of the current instance Lim_Priv
                        -- could be deeper than the level of AccPriv.
                        -- Assume-the-worst checking.
      end record;

      type Rec (Ptr : access Integer) is limited record
         C1 : Boolean := Func1 (Rec'Access);                          -- OK.
                                                           -- LM 3.10.2(19);6.0
         C2 : AccInt  := AccInt (Ptr);                                -- ERROR:
                           -- Possibility of a deeper level declaration of Rec.
                           -- Assume-the-worst checking.

         C3 : Boolean := Func2 (Rec'Access);                          -- ERROR:
                           -- Possibility of a deeper level declaration of Rec.
                           -- Assume-the-worst checking.      
      end record;

   end Nested;

                      -------------------------------------

   package body Nested is

      function Func1 (P : access Rec) return Boolean is
      begin
         return True;
      end Func1;


      function Func2 (P : AccRec) return Boolean is
      begin
         return False;
      end Func2;

   end Nested;
             

end B3A2013;
