-- BXH4008.A
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
-- OBJECTIVE
--     Check pragma Restrictions.
--     Check that the application of the configuration pragma Restrictions
--     with the specific restriction:
--       No_Unchecked_Conversion
--     does not allow the use of Unchecked_Conversion.
--
-- TEST DESCRIPTION
--     The test requires that the configuration pragma
--     Restrictions(No_Unchecked_Conversion) be processed.  Any attempt to
--     use an instance of Ada.Unchecked_Conversion or Unchecked_Conversion
--     should be disallowed.  The software is a "sample" of what a user
--     might include.
--
-- APPLICABILITY CRITERIA:
--      This test is only applicable for a compiler attempting validation
--      for the Safety and Security Annex.
--
-- SPECIAL REQUIREMENTS
--      The implementation must process a configuration pragma which is not
--      part of any Compilation Unit; the method employed is implementation
--      defined.
--
--
-- CHANGE HISTORY:
--      26 OCT 95   SAIC   Initial version
--      05 NOV 96   SAIC   Revised for release 2.1
--
--!

---------------------------- CONFIGURATION PRAGMAS -----------------------

pragma Restrictions(No_Unchecked_Conversion);                     -- OK
                                                -- configuration pragma

------------------------ END OF CONFIGURATION PRAGMAS --------------------

------------------------------------------------------------------- BXH4008

procedure BXH4008 is

  type UByte is mod 256;

  type IByte is new Character;

  function BXH4008_1(I: IByte) return UByte is separate;

  U : UByte;
  I : IByte := 'X';

begin  -- Main test procedure.

  U := BXH4008_1(I);

end BXH4008;

----------------------------------------------------------------- BXH4008_1

with Ada.Unchecked_Conversion;                                    -- ERROR:
                   -- pragma Restrictions(No_Unchecked_Conversion) in force

separate (BXH4008)
  function BXH4008_1(I: IByte) return UByte is

    function Doit is
      new Ada.Unchecked_Conversion(IByte, UByte);        -- OPTIONAL ERROR:
                   -- pragma Restrictions(No_Unchecked_Conversion) in force
               -- if the context clause was flagged, this error is optional

  begin
    return Doit(I);                                      -- OPTIONAL ERROR:

  end BXH4008_1;
