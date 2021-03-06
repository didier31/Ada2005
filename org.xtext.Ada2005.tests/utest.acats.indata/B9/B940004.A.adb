-- B940004.A
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
--      Check that protected declarations (in a package) require 
--      completion by a protected body and vice versa.
--
-- TEST DESCRIPTION:
--      Instances of a protected object are defined in separate packages
--      The first two each have a protected object which has a
--      specification and a body defined but the individual components are
--      missing either their specifications or their bodies.  The second two
--      are identical to the first two except that the protected object is
--      declared as a type.  In the next two, either the whole of the
--      specification or the body of the complete protected object is missing
--      and in the last case the body of an object declared as a type is
--      missing.
--
--
-- PASS/FAIL CRITERIA:                
--      The ERROR (optional):  An implementation must report that
--      Whole_Object_No_Body and Whole_Object_Type_No_Body are both protected
--      object declarations without their associated bodies and that
--      Whole_Object_No_Spec is a protected object body without an associated
--      specification.  An implementation may additionally report that
--      Might_Not_Be_Flagged is a subprogram specification/body within these
--      objects which is missing the associated body/specification.
--
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--
--!

   --==============================================================
  
   -- Check for incomplete specifications within the object
   package B940004_1 is

      protected Object_No_Internal_Bodies is
         function  Func_No_Body return Boolean;
         procedure Proc_No_Body;               
         entry     Entry_No_Body;              
         --=======
         -- one valid subprogram to avoid null Object body
         function Good_One return boolean;        -- OK
      private
         function  Func_No_Body_in_Private return Boolean;
         procedure Proc_No_Body_in_Private;               
         entry     Entry_No_Body_in_Private;              
      end Object_No_Internal_Bodies;

   end B940004_1;
      

   package body B940004_1 is

      protected body Object_No_Internal_Bodies is
         -- internal bodies missing
         --=======
         function Good_One return boolean is     -- OK
         begin
            return true;
         end Good_One;
      end Object_No_Internal_Bodies;                                 -- ERROR:
                                              -- Missing bodies for:
                                              --      Func_No_Body
                                              --      Proc_No_Body
                                              --      Entry_No_Body
                                              --      Func_No_Body_in_Private
                                              --      Proc_No_Body_in_Private
                                              --      Entry_No_Body_in_Private

   end B940004_1;

   --==============================================================

   -- Check for bodies with no specifications within the object
   package B940004_2 is

      protected Object_No_Internal_Specs is
         -- one valid subprogram to avoid null Object spec
         function Good_One return boolean;        -- OK
      end Object_No_Internal_Specs;
      
   end B940004_2;


   package body B940004_2 is

      protected body Object_No_Internal_Specs is
         -- an entry body must have a specification 
         entry Entry_No_Spec when true is                            -- ERROR:
                                                      -- Missing Specification
         begin
            null;
         end Entry_No_Spec;
         -- Note: there are no corresponding subprograms with missing
         --       specifications - they are just treated as local
         --       subprograms.
         --=======
         function Good_One return boolean is     -- OK
         begin
            return true;
         end Good_One;
      end Object_No_Internal_Specs; 

   end B940004_2;
   
   --==============================================================

   -- Check for incomplete specifications within the object when the 
   -- object is declared as a type

   package B940004_3 is
      protected type  Object_Type_No_Internal_Bodies is
         function  Func_No_Body return Boolean;
         procedure Proc_No_Body;               
         entry     Entry_No_Body;              
         --=======
         -- one valid subprogram to avoid null Object body
         function Good_One return boolean;        -- OK
      private
         function  Func_No_Body_in_Private return Boolean;
         procedure Proc_No_Body_in_Private;               
         entry     Entry_No_Body_in_Private;              
      end Object_Type_No_Internal_Bodies;

   end B940004_3;


   package body B940004_3 is

      protected body Object_Type_No_Internal_Bodies is
         -- internal bodies missing
         --=======
         function Good_One return boolean is     -- OK
         begin
            return true;
         end Good_One;
      end Object_Type_No_Internal_Bodies;                            -- ERROR:
                                              -- Missing bodies for:
                                              --      Func_No_Body
                                              --      Proc_No_Body
                                              --      Entry_No_Body
                                              --      Func_No_Body_in_Private
                                              --      Proc_No_Body_in_Private
                                              --      Entry_No_Body_in_Private


   end B940004_3;
   --==============================================================

   -- Check for bodies with no specifications within the object when 
   -- the object is declared as a type

   package B940004_4 is

      protected Object_Type_No_Internal_Specs is
         -- one valid subprogram to avoid null Object spec
         function Good_One return boolean;        -- OK
      end Object_Type_No_Internal_Specs;

   end B940004_4;
      
   package body B940004_4 is

      protected body Object_Type_No_Internal_Specs is
         -- an entry body must have a specification 
         entry Entry_No_Spec when true is                            -- ERROR:
                                                      -- Missing Specification
         begin
            null;
         end Entry_No_Spec;
         -- Note: there are no corresponding subprograms with missing
         --       specifications - they just are just treated as local
         --       subprograms.
         --=======
         function Good_One return boolean is     -- OK
         begin
            return true;
         end Good_One;
      end Object_Type_No_Internal_Specs; 
   end B940004_4;

   --==============================================================

   -- Check the object (as a whole) with missing body
   package B940004_5 is

      protected Whole_Object_No_Body is
         function Might_Not_Be_Flagged return boolean;
      end Whole_Object_No_Body;
   
      -- include one valid definition to avoid empty package body
      function Good_One return boolean;     -- OK

   end B940004_5;


   package body B940004_5 is

      function Good_One return boolean is     -- OK
      begin
         return true;
      end Good_One;

   begin                                                             -- ERROR:
                                      -- Missing body for Whole_Object_No_Body 
                                                -- (optional) missing body for 
                                                -- Might_Not_Be_Flagged 
      null;

   end B940004_5;

   --==============================================================

   -- Check the object (as a whole) with missing spec.

   package B940004_6 is
   
      -- include one valid definition to avoid empty package spec
      function Good_One return boolean;     -- OK

   end B940004_6;


   package body B940004_6 is

      protected body Whole_Object_No_Spec is                         -- ERROR:
                                                                    -- No spec
         function Might_Not_Be_Flagged return boolean is             -- ERROR:
                                                         -- (optional) no spec
         begin
            return true;            
         end Might_Not_Be_Flagged;
      end Whole_Object_No_Spec;

      --=======

      function Good_One return boolean is     -- OK
      begin
         return true;
      end Good_One;

   end B940004_6;

   --==============================================================

   -- Check the object (as a whole) with missing body when the object is
   -- declared as a type

   package B940004_7 is

      protected type Whole_Object_Type_No_Body is 
         function Might_Not_Be_Flagged return boolean; 
      end Whole_Object_Type_No_Body;

      -- include one valid definition to avoid empty package body
      function Good_One return boolean;     -- OK

   end B940004_7;


   package body B940004_7 is

      function Good_One return boolean is     -- OK
      begin
         return true;
      end Good_One;

   begin                                                             -- ERROR:
                                                  -- Missing body for 
                                                  -- Whole_Object_Type_No_Body 
                                                  -- (optional) missing body 
                                                  -- for Might_Not_Be_Flagged 
      null;

   end B940004_7;
