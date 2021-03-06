-- BA11003.A
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
--      Check that a child library unit may not have anything other than a
--      library package or generic library package as its parent unit.
--      Check that nested units cannot have child units.
--      Check that child of a generic package may not be anything other than
--      a generic unit or a renaming of some other child of the same generic
--      unit.
--      Check that a child of an instance of a generic package must be an
--      instance or a renaming of a library unit.
--
-- TEST DESCRIPTION:
--      Declare public children subprograms.  Declare a public child
--      of a nested package.  Declare a public non-generic child package
--      of a generic package.  Instantiate the generic package.  Declare
--      a child of this instance.
--
--      LEGAL ITEMS:      _0 _2 _4 _5 _7 _9 _11 _12 _13 _14
--      ILLEGAL ITEMS:    _1 _3 _6 _8 _10
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--      08 Nov 95   SAIC    Update and repair for ACVC 2.0.1
--
--!

-- Procedure as a parent.

procedure BA11003_0 is
   I : Integer := 1;
begin
   I := I + I;
   -- Real body of procedure goes here.
end BA11003_0;

procedure BA11003_0.BA11003_1;                                        -- ERROR:
                                             -- parent is not a library package
     ---------------------------------------------------------------------

-- Function as a parent.

function BA11003_2 return Integer is
begin
   -- Real body of function goes here.
   return 1;
end BA11003_2;

function BA11003_2.BA11003_3 return Integer;                          -- ERROR:
                                             -- parent is not a library package
     ---------------------------------------------------------------------

package BA11003_4 is
 
   -- Nested package as a parent.

   package BA11003_5 is

      My_Exception : Exception;

   end BA11003_5;

   -- ... Other package, subprogram definitions.

end BA11003_4;

-- No body for BA11003_4.

     --=================================================================--

-- Public child of the nested unit.

package BA11003_4.BA11003_5.BA11003_6  is                             -- ERROR:
                                             -- parent is not a library package
   Var : Integer := 7;
end;

     --=================================================================--

-- Generic as a parent.

generic

package BA11003_7 is
 
   type Boolean_Arr is array (1 .. 2) of Boolean;

end BA11003_7;

     --=================================================================--

-- Child of a generic package must be a generic package. 

package BA11003_7.BA11003_8 is                                        -- ERROR:
                                                          -- parent is generic
   My_Boolean : Boolean := True;
end;

generic 
package BA11003_7.BA11003_11 is                                       -- OK.
   type GT is tagged record
      Date : Float;
   end record;
end BA11003_7.BA11003_11;

     --=================================================================--

with BA11003_7.BA11003_11;
generic package BA11003_7.BA11003_13
  renames BA11003_7.BA11003_11;                                       -- OK.

     --=================================================================--

with BA11003_7;

-- Instance as a parent.

package BA11003_9 is new BA11003_7;                                   -- OK.

     --=================================================================--

with BA11003_7.BA11003_11;
with BA11003_9;

-- Child of an instance must be an instance.       

package BA11003_9.BA11003_12 is new BA11003_9.BA11003_11;             -- OK.

package BA11003_9.BA11003_10 is                                       -- ERROR:
                                             -- parent is instance of a generic
   type Small is range 1 .. 10;
end;

     --=================================================================--

with BA11003_9.BA11003_12;
package BA11003_9.BA11003_14 renames BA11003_9.BA11003_12;            -- OK.
