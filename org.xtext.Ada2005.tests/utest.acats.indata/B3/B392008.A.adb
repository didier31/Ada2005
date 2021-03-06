-- B392008.A
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
--      Check that a subprogram call through a dereference of an access-to-
--      subprogram value is not considered a call on a dispatching operation;
--      therefore, the actual parameter in such a subprogram call may not be
--      dynamically tagged. Check for the case where the access-to-subprogram
--      type is a generic formal type.
--
-- TEST DESCRIPTION:
--      The designated profile of an access-to-subprogram type may contain
--      parameters of a tagged type. However, the subprogram designated by
--      a given access-to-subprogram value may or may not be a dispatching
--      operation of the tagged type. The actual parameter in a subprogram
--      call which is a dereference of such an access-to-subprogram value
--      must not be dynamically tagged unless the subprogram is a dispatching
--      operation -- this is a compile-time check. But it is not determinable
--      at compile time whether any given access-to-subprogram value designates
--      a dispatching or non-dispatching operation. Therefore all calls to
--      such an access-to-subprogram value involving dynamically tagged
--      operands must be disallowed.
--
--      Cases involving both generic subprograms and subprograms declared in
--      generic packages, and both formal private and derived types, are
--      included.
--
--      The subprograms defined by the generics call subprograms through an
--      access-to-subprogram value with various actuals which are dynamically
--      tagged (formal parameter, local class-wide object, type conversion to
--      a class-wide type, dynamically tagged function call, dereference of
--      an access-to-class-wide value).
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--      04 Dec 95   SAIC    Modify comments for ACVC 2.0.1
--
--!

package B392008_0 is

   type Ancestor is tagged record
      Component : Boolean := False;
   end record;

   function Dyn_Tag_Func (A: Ancestor) return Ancestor;  -- Function with
                                                         -- controlling result.

end B392008_0;


     --===================================================================--


package body B392008_0 is

   function Dyn_Tag_Func (A: Ancestor) return Ancestor is
   begin
      return A;
   end Dyn_Tag_Func;

end B392008_0;


     --===================================================================--


with B392008_0;
package B392008 is

--
-- Generic subprogram declaring formal derived type:
--

   generic
      type Tag is new B392008_0.Ancestor with private;
      -- Implicit Dyn_Tag_Func (A: Tag) return Tag declared here.

      type CW_Access is access Tag'Class;

      type Access_Proc is access procedure (A: in Tag);
      type Access_Func is access function (A: Tag) return Tag;
   procedure Derived_Class_Wide_Formal (AP     : in     Access_Proc;
                                        AF     : in     Access_Func;
                                        Ptr    : in out CW_Access;
                                        Operand: in out Tag'Class);

--
-- Generic package declaring formal private type:
--

   generic
      type Tag is tagged private;

      type CW_Access is access Tag'Class;

      type Access_Proc is access procedure (A: in Tag);
      type Access_Func is access function (A: Tag) return Tag;
   package Private_Class_Wide_Formal is

      function Dyn_Tag_Func (A: Tag) return Tag;       

      procedure Inner_Proc (AP     : in     Access_Proc;
                            AF     : in     Access_Func;
                            Ptr    : in out CW_Access;
                            Operand: in out Tag'Class);

   end Private_Class_Wide_Formal;

end B392008;


     --===================================================================--


package body B392008 is

   procedure Derived_Class_Wide_Formal (AP     : in     Access_Proc;
                                        AF     : in     Access_Func;
                                        Ptr    : in out CW_Access;
                                        Operand: in out Tag'Class) is

      Local_Spec  : Tag;
      Local_Class : Tag'Class := Local_Spec;
      Temp        : Tag := AF (Operand);                              -- ERROR:
                    -- Actual parameter in function call is dynamically tagged.
   begin
      AP (Operand);                                                   -- ERROR:
                   -- Actual parameter in procedure call is dynamically tagged.

      AP (Tag'Class(Local_Spec));                                     -- ERROR:
                   -- Actual parameter in procedure call is dynamically tagged.

      Local_Spec := AF (Local_Class);                                 -- ERROR:
                    -- Actual parameter in function call is dynamically tagged.

      AP (Dyn_Tag_Func (Local_Class));                                -- ERROR:
                   -- Actual parameter in procedure call is dynamically tagged.

      Local_Spec := AF (Ptr.all);                                     -- ERROR:
                    -- Actual parameter in function call is dynamically tagged.
   end Derived_Class_Wide_Formal;



   package body Private_Class_Wide_Formal is

      function Dyn_Tag_Func (A: Tag) return Tag is
      begin
         return A;
      end Dyn_Tag_Func;


      procedure Inner_Proc (AP     : in     Access_Proc;
                            AF     : in     Access_Func;
                            Ptr    : in out CW_Access;
                            Operand: in out Tag'Class) is

         Local_Spec  : Tag;
         Local_Class : Tag'Class := Local_Spec;
         Temp        : Tag := AF (Operand);                           -- ERROR:
                    -- Actual parameter in function call is dynamically tagged.
      begin
         AP (Operand);                                                -- ERROR:
                   -- Actual parameter in procedure call is dynamically tagged.

         Local_Spec := AF (Tag'Class(Local_Spec));                    -- ERROR:
                    -- Actual parameter in function call is dynamically tagged.

         AP (Local_Class);                                            -- ERROR:
                                             -- Call with class-wide parameter.

         Local_Spec := AF (Dyn_Tag_Func (Local_Class));               -- ERROR:
                                             -- Call with class-wide parameter.

         AP (Ptr.all);                                                -- ERROR:
                   -- Actual parameter in procedure call is dynamically tagged.
      end Inner_Proc;

   end Private_Class_Wide_Formal;

end B392008;
