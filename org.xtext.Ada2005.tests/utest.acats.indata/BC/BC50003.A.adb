-- BC50003.A
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
--      Check that the actual corresponding to a formal signed integer type
--      may not be a modular type.
--
--      Check that the actual corresponding to a formal modular type
--      may not be a signed integer type.
--
-- TEST DESCRIPTION:
--      Declare formal signed integer and modular types. Verify that the
--      actual type passed to each formal must be in the class of types
--      implied by the syntactic category of the formal type definition
--      (e.g., the actual for a formal modular type must be a modular type).
--
--
-- CHANGE HISTORY:
--      01 Feb 95   SAIC    Initial version.
--
--!

package BC50003_0 is

   type Signed_Integer is range 0 .. 15;          -- First subtypes have
   type Modular_Integer is mod 16;                -- identical ranges.

end BC50003_0;


     --==================================================================--


package BC50003_1 is

   generic
      type Formal_Signed_Integer is range <>;
   package Signed_Integer_Formal is end;

   generic
      type Formal_Modular_Integer is mod <>;
   package Modular_Integer_Formal is end;

end BC50003_1;


     --==================================================================--


with BC50003_0;
with BC50003_1;
package BC50003 is

   package Signed_OK_Actual is new BC50003_1.Signed_Integer_Formal
      (Formal_Signed_Integer => BC50003_0.Signed_Integer);            -- OK.

   package Signed_Bad_Actual is new BC50003_1.Signed_Integer_Formal
      (BC50003_0.Modular_Integer);                                    -- ERROR:
                                        -- Actual is modular; formal is signed.


   package Modular_OK_Actual is new BC50003_1.Modular_Integer_Formal
      (Formal_Modular_Integer => BC50003_0.Modular_Integer);          -- OK.

   package Modular_Bad_Actual is new BC50003_1.Modular_Integer_Formal
      (BC50003_0.Signed_Integer);                                     -- ERROR:
                                        -- Actual is signed; formal is modular.

end BC50003;
