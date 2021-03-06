-- BC53002.A
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
--      Check that if a formal array type has aliased components, the
--      corresponding actual type must also have aliased components.
--      Check that if a formal array type does not have aliased components,
--      the corresponding actual type may nevertheless have aliased components.
--
-- TEST DESCRIPTION:
--      Declare an unconstrained formal array type for which the component
--      definition includes the reserved word aliased. Verify that the
--      component definition for the corresponding actual type must also
--      include the reserved word aliased.
--
--      Declare a constrained (for variety) formal array type for which the
--      component definition does not include the reserved word aliased.
--      Verify that the component definition for the corresponding actual type
--      may either include or omit the reserved word aliased.
--
--
-- CHANGE HISTORY:
--      01 Feb 95   SAIC    Initial version.
--
--!

package BC53002_0 is

   subtype Index is Natural range 1 .. 100;

   type Tagged_Type is tagged record
      C: Index := 100;
   end record;

   type Nonaliased_C  is array (Index) of Tagged_Type;
   type Nonaliased_UC is array (Index range <>) of Tagged_Type;

   type Aliased_C     is array (Index) of aliased Tagged_Type;
   type Aliased_UC    is array (Index range <>) of aliased Tagged_Type;


   generic
      type F_Aliased_Uncons is array (Index range <>) of aliased Tagged_Type;
   package Aliased_Unconstrained_Formal is end;

   generic
      type F_Nonaliased_Cons is array (Index) of Tagged_Type;
   package NonAliased_Constrained_Formal is end;

end BC53002_0;


     --==================================================================--


with BC53002_0;
use  BC53002_0;
package BC53002 is

   --
   -- Cases where formal does not have aliased components:
   --

   package Formal_NonAliased_Actual_Aliased is new
     NonAliased_Constrained_Formal (F_Nonaliased_Cons => Aliased_C);  -- OK.


   package Formal_NonAliased_Actual_NonAliased is new
     NonAliased_Constrained_Formal (Nonaliased_C);                    -- OK.



   --
   -- Cases where formal has aliased components:
   --


   package Formal_Aliased_Actual_Aliased is new
     Aliased_Unconstrained_Formal (Aliased_UC);                       -- OK.


   package Formal_Aliased_Actual_Nonaliased is new
     Aliased_Unconstrained_Formal 
       (F_Aliased_Uncons => Nonaliased_UC);                           -- ERROR:
                             -- Formal has aliased components; actual does not.

end BC53002;
