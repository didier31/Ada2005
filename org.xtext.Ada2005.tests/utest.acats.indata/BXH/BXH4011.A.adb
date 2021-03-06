-- BXH4011.A
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
--       No_Dispatch
--     disallows occurrences of T'Class.
--
-- TEST DESCRIPTION
--     The test requires that the configuration pragma
--     Restrictions(No_Dispatch) be processed.  Any use of the
--     typemark 'Class should be disallowed.  Check also for predefined
--     tagged types such as Ada.Finalization.Controlled'Class.
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
--
--!

---------------------------- CONFIGURATION PRAGMAS -----------------------

pragma Restrictions(No_Dispatch);                                 -- OK
                                                -- configuration pragma

------------------------ END OF CONFIGURATION PRAGMAS --------------------

------------------------------------------------------------------- BXH4011

with Ada.Finalization;
package BXH4011 is

  type Complete is new Ada.Finalization.Controlled with record
    My_Data : Float;
  end record;

  procedure Initialize( C: in out Complete );

  type Simple_Tag is tagged record
    Left, Right : Natural;
  end record;

  procedure Update( ST: Simple_Tag );

  type Complex_Tag is new Simple_Tag with record
    Overdone : Boolean;
  end record;

  procedure Update( CT: Complex_Tag );

  generic
    type Finality (<>) is new Ada.Finalization.Controlled with private;
  procedure In_Session( X : in out Finality );

end BXH4011;

package body BXH4011 is

  procedure Initialize( C: in out Complete ) is
  begin
    null;
  end Initialize;

  procedure Update( ST: Simple_Tag ) is
  begin
    null;
  end Update;

  procedure Update( CT: Complex_Tag ) is
  begin
    null;
  end Update;

  procedure In_Session( X : in out Finality ) is
  begin
    Initialize( X );
  end In_Session;

  procedure College is new In_Session( Complete );

  procedure University is new In_Session( Complete'Class );       -- ERROR:
                               -- pragma Restrictions(No_Dispatch) in force

  subtype Bad is Complete'Class;                                  -- ERROR:
                               -- pragma Restrictions(No_Dispatch) in force

  procedure Fix( Item : Simple_Tag'Class ) is                     -- ERROR:
  begin                        -- pragma Restrictions(No_Dispatch) in force
    Update( Item );
  end Fix;

  An_Item : Simple_Tag'Class := Simple_Tag'(1,2);                 -- ERROR:
                               -- pragma Restrictions(No_Dispatch) in force

end BXH4011;
