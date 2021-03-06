-- B3A2008.A
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
--      of A.  Check for cases where X'Access occurs in the private part of
--      an instance and X is declared in the instance itself.
--
--      Check for cases where X is:
--         (a) a view defined by an object declaration.
--         (b) a view defined by a component definition.
--         (c) a dereference of an access-to-object value.
--
--
-- TEST DESCRIPTION:
--      In order to satisfy accessibility requirements, the designated
--      object X must be at the same or a less deep nesting level than the
--      general access type A -- X must "live" as long as A. Nesting
--      levels are the run-time nestings of masters: block statements;
--      subprogram, task, and entry bodies; and accept statements. Packages
--      are invisible to accessibility rules.
--
--      If X is an object declared by an object declaration, its accessibility
--      level is that of the innermost enclosing master execution.
--
--      If X is a view of an object denoted by a dereference of an access
--      value, its accessibility level is that of the associated access type.
--
--      The accessibility level of the anonymous type of an access discriminant
--      is that of the containing object.
--
--      This test declares a generic package which utilizes X'Access in its
--      private part, where X is declared in the instance itself and the type 
--      A of X'Access is a generic formal type.  The accessibility levels of 
--      X depends on the nesting depth of the instance.  The test covers 
--      cases where X is a view defined by an object declaration, a view 
--      defined by a component definition, and a dereference of an 
--      access-to-object value.
--
--      The test declares general access types in packages, subprograms, and
--      a nested task body. These types are passed as actuals to
--      instantiations, which are attempted at various nesting levels. The
--      test verifies that X'Access is illegal when X is declared at a nesting
--      level deeper than that of the type of X'Access, and legal otherwise.
--
--      The nesting structure is as follows:
--
--          - Library-level package         
--         |                                                 (Level = 0)
--          - end package
--
--          - Main subprogram               
--         |      *** testing here                           (Level = 1)
--         |
--         |     - Nested task
--         |    |     *** testing here                       (Level = 2)
--         |    |
--         |    |  begin
--         |     - end task
--         |  begin
--          - end main subprogram
--
--
-- CHANGE HISTORY:
--      18 JAN 95   SAIC    Initial prerelease version.
--      29 Mar 95   SAIC    Modified test description; Declared a general
--                          access type in the generic and made this the
--                          type of Gen_Deref.                          
--
--!

package B3A2008_0 is

   type Rec is record
      C : Boolean;
   end record;

   type Tagged_Rec is tagged record
      C : aliased Rec;
   end record;

   type New_Tagged_Rec is new Tagged_Rec with private;

   type Acc_NTag_L0 is access all New_Tagged_Rec;                 -- Level = 0.
   type Acc1_Rec_L0 is access all Rec;                            -- Level = 0.
   type Acc2_Rec_L0 is access all Rec;                            -- Level = 0.

private
   type New_Tagged_Rec is new Tagged_Rec with record
      I : Integer;
   end record;

end B3A2008_0;


     --==================================================================--


-- For the generic below, the aliased view X used in X'Access will be declared
-- within the instance itself. The accessibility of X is therefore tied to the
-- nesting level of the instance. The access type A of X'Access is passed as
-- an actual. The nesting level of X must be at least as high (shallow) as 
-- that of A.

with B3A2008_0;
generic

   type Gen_NewTag is new B3A2008_0.Tagged_Rec with private;
   type FormalAccType_for_Obj is access all Gen_NewTag;

   type Gen_NewRec is new B3A2008_0.Rec;
   type FormalAccType_for_Comp is access all Gen_NewRec;
   type FormalAccType_for_Deref is access all Gen_NewRec;

package B3A2008_1 is

   -- The accessibility level of an aliased component is that of the enclosing
   -- composite *object*, not that of the enclosing composite type.

   type Rec_With_Comp is record
      C : aliased Gen_NewRec;        -- Aliased component of a composite type.
   end record;

   type LocalAccType is access all Gen_NewRec;

   Gen_Obj   : aliased Gen_NewTag;
   Gen_Rec   : Rec_With_Comp;
   Gen_Deref : LocalAccType := new Gen_NewRec;

private

   AObj   : FormalAccType_for_Obj   := Gen_Obj'Access;
   AComp  : FormalAccType_for_Comp  := Gen_Rec.C'Access;
   ADeref : FormalAccType_for_Deref := Gen_Deref.all'Access;


   -- These declarations are OK in the generic, but won't necessarily be
   -- OK in an instance.

end B3A2008_1;


     --==================================================================--


with B3A2008_0;
with B3A2008_1;
package B3A2008_2 is 
  new B3A2008_1 (B3A2008_0.New_Tagged_Rec, 
                 B3A2008_0.Acc_NTag_L0,     
                 B3A2008_0.Rec,            
                 B3A2008_0.Acc1_Rec_L0,     
                 B3A2008_0.Acc2_Rec_L0);                              -- OK.



     --==================================================================--


with B3A2008_0;
with B3A2008_1;
procedure B3A2008 is

   type Acc_NTag_L1  is access all B3A2008_0.New_Tagged_Rec;      -- Level = 1.
   type Acc1_Rec_L1  is access all B3A2008_0.Rec;                 -- Level = 1.
   type Acc2_Rec_L1  is access all B3A2008_0.Rec;                 -- Level = 1.

   package Inst_L1_OK is
     new B3A2008_1 (B3A2008_0.New_Tagged_Rec, 
                    Acc_NTag_L1,     
                    B3A2008_0.Rec,            
                    Acc1_Rec_L1,     
                    Acc2_Rec_L1);                                     -- OK.
   -- In the private part of Inst_L1_OK, after the above instantiation:
   -- AObj  : Acc_NTag_L1 := Gen_Obj'Access   (Gen_Obj level = 1)
   -- AComp : Acc1_Rec_L1 := Gen_Rec.C'Access (Gen_Rec.C level = 1)
   -- ADeref: Acc2_Rec_L1 := Gen_Deref.all'Access (Gen_Deref.all level = 1)


   package Inst_L1_Obj is
     new B3A2008_1 (B3A2008_0.New_Tagged_Rec, 
                    B3A2008_0.Acc_NTag_L0,                            -- ERROR:
                               -- Accessibility level of Gen_Obj is deeper than
                               -- that of B3A2008_0.Acc_NTag_L0.
                    B3A2008_0.Rec,            
                    Acc1_Rec_L1,     
                    Acc2_Rec_L1); 
   -- In the private part of Inst_L1_Obj, after the above instantiation:
   -- AObj  : Acc_NTag_L0 := Gen_Obj'Access   (Gen_Obj level = 1)   <= Illegal
   -- AComp : Acc1_Rec_L1 := Gen_Rec.C'Access (Gen_Rec.C level = 1)
   -- ADeref: Acc2_Rec_L1 := Gen_Deref.all'Access (Gen_Deref.all level = 1)


   package Inst_L1_Comp is 
     new B3A2008_1 (B3A2008_0.New_Tagged_Rec, 
                    Acc_NTag_L1,           
                    B3A2008_0.Rec,            
                    B3A2008_0.Acc1_Rec_L0,                            -- ERROR:
                             -- Accessibility level of Gen_Rec.C is deeper than
                             -- that of B3A2008_0.Acc1_Rec_L0.
                    Acc2_Rec_L1);                                           
   -- In the private part of Inst_L1_Comp, after the above instantiation:
   -- AObj  : Acc_NTag_L1 := Gen_Obj'Access   (Gen_Obj level = 1)     
   -- AComp : Acc1_Rec_L0 := Gen_Rec.C'Access (Gen_Rec.C level = 1) <= Illegal
   -- ADeref: Acc2_Rec_L1 := Gen_Deref.all'Access (Gen_Deref.all level = 1)


   package Inst_L1_Deref is 
     new B3A2008_1 (B3A2008_0.New_Tagged_Rec, 
                    Acc_NTag_L1,     
                    B3A2008_0.Rec,            
                    Acc1_Rec_L1,     
                    B3A2008_0.Acc2_Rec_L0);                           -- ERROR:
                              -- Accessibility level of Gen_Deref.all is deeper
                              -- than that of B3A2008_0.Acc2_Rec_L0.
   -- In the private part of Inst_L1_Deref, after the above instantiation:
   -- AObj  : Acc_NTag_L1 := Gen_Obj'Access   (Gen_Obj level = 1)
   -- AComp : Acc1_Rec_L1 := Gen_Rec.C'Access (Gen_Rec.C level = 1)
   -- ADeref: Acc2_Rec_L0 := Gen_Deref.all'Access 
   --                                   (Gen_Deref.all level = 1)   <= Illegal

   --
   -- Nested task:
   --

   task Tsk;

   task body Tsk is

      type Acc_NTag_L2  is access all B3A2008_0.New_Tagged_Rec;   -- Level = 2.
      type Acc1_Rec_L2  is access all B3A2008_0.Rec;              -- Level = 2.
      type Acc2_Rec_L2  is access all B3A2008_0.Rec;              -- Level = 2.

      package Inst_L2_OK is 
        new B3A2008_1 (B3A2008_0.New_Tagged_Rec, 
                       Acc_NTag_L2,     
                       B3A2008_0.Rec,            
                       Acc1_Rec_L2,     
                       Acc2_Rec_L2);                                  -- OK.
      -- In the private part of Inst_L2_OK, after the above instantiation:
      -- AObj  : Acc_NTag_L2 := Gen_Obj'Access   (Gen_Obj level = 2)
      -- AComp : Acc1_Rec_L2 := Gen_Rec.C'Access (Gen_Rec.C level = 2)
      -- ADeref: Acc2_Rec_L2 := Gen_Deref.all'Access (Gen_Deref.all level = 2)


      package Inst_L2_Obj is
        new B3A2008_1 (B3A2008_0.New_Tagged_Rec, 
                       Acc_NTag_L1,                                   -- ERROR:
                               -- Accessibility level of Gen_Obj is deeper than
                               -- that of Acc_NTag_L1.
                       B3A2008_0.Rec,            
                       Acc1_Rec_L2,     
                       Acc2_Rec_L2);   
      -- In the private part of Inst_L2_Obj, after the above instantiation:
      -- AObj  : Acc_NTag_L1 := Gen_Obj'Access   (Gen_Obj level = 2) <= Illegal
      -- AComp : Acc1_Rec_L2 := Gen_Rec.C'Access (Gen_Rec.C level = 2)
      -- ADeref: Acc2_Rec_L2 := Gen_Deref.all'Access (Gen_Deref.all level = 2)


      package Inst_L2_Comp is
        new B3A2008_1 (B3A2008_0.New_Tagged_Rec, 
                       Acc_NTag_L2,           
                       B3A2008_0.Rec,            
                       B3A2008_0.Acc1_Rec_L0,                         -- ERROR:
                             -- Accessibility level of Gen_Rec.C is deeper than
                             -- that of B3A2008_0.Acc1_Rec_L0.
                       Acc2_Rec_L2);                                        
      -- In the private part of Inst_L2_Comp, after the above instantiation:
      -- AObj  : Acc_NTag_L2 := Gen_Obj'Access (Gen_Obj level = 2)
      -- AComp : Acc1_Rec_L0 := Gen_Rec.C'Access 
      --                                   (Gen_Rec.C level = 2)     <= Illegal
      -- ADeref: Acc2_Rec_L2 := Gen_Deref.all'Access (Gen_Deref.all level = 2)


      package Inst_L2_Deref is
        new B3A2008_1 (B3A2008_0.New_Tagged_Rec, 
                       Acc_NTag_L2,     
                       B3A2008_0.Rec,            
                       Acc1_Rec_L2,     
                       Acc1_Rec_L1);                                  -- ERROR:
                              -- Accessibility level of Gen_Deref.all is deeper
                              -- than that of B3A2008_0.Acc1_Rec_L1.
      -- In the private part of Inst_L2_Deref, after the above instantiation:
      -- AObj  : Acc_NTag_L2:= Gen_Obj'Access   (Gen_Obj level = 2)
      -- AComp : Acc1_Rec_L2:= Gen_Rec.C'Access (Gen_Rec.C level = 2)
      -- ADeref: Acc1_Rec_L1:= Gen_Deref.all'Access 
      --                                 (Gen_Deref.all level = 2)   <= Illegal

    begin -- Tsk.
      null;
    end Tsk;


begin -- B3A2008 
   null;
end B3A2008;
