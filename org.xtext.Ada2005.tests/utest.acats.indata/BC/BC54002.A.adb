-- BC54002.A
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
--      Check that, for a formal access-to-subprogram subtype, the designated
--      profiles of the formal and actual must be subtype conformant.
--
-- TEST DESCRIPTION:
--      Two profiles are subtype conformant if:
--         (a) They have the same number of parameters;
--         (b) Both have a result if either does;
--         (c) The corresponding parameter and result types are the same and
--             the subtypes statically match;
--         (d) Corresponding parameters have identical modes and both or
--             neither are explicitly aliased parameters;
--         (e) For access parameters, the designated subtypes statically
--             match;
--         (f) The associated calling conventions are the same.
--
--      The test declares generics with formal access-to-subprogram types
--      (access-to-procedure and access-to-function). Types are declared
--      to be passed as actuals, each with a designated profile which varies
--      in some way from the designated profile of their corresponding formal.
--
--      Note: Ada 95 only required mode conformance in this case. This
--      was changed by AI05-0288-1. We have changed the test as little as
--      possible (which means it doesn't quite match the revised objective),
--      and for ACATS 3.0, we are not requiring any specific
--      behavior for actual types whose profile is mode conformant but not
--      subtype conformant. ACATS 4.0 will require subtype conformance only,
--      and should add test cases for explicitly aliased parameters
--      (part of (d)).
--
--      The following illegal cases are checked:
--
--         - Designated profile of actual has more parameters than that
--           of formal
--         - Designated profile of actual has fewer parameters than that
--           of formal
--         - Modes of corresponding parameters are not the same (e.g., order
--           is swapped; in vs. in out, out vs. in out)
--         - Calling convention of one designated subprogram is protected and
--           and the other is not
--         - Types of corresponding parameters are not the same (e.g., order
--           is swapped)
--
--
--      In addition, the following legal cases are checked:
--
--         - Number of parameters is the same (although names and defaults
--           are different)
--         - One designated profile uses multiple declarations (e.g.,
--           (X, Y: Bool)) but other does not (e.g., (X: Bool; Y: Bool))
--         - Explicit mode "in" versus default mode "in"
--         - Calling convention of both formal and actual is protected
--
--      The following case is not checked by this test as its legality is
--      changed by AI05-0288-1:
--
--         - Parameters have same type but different subtypes
--
-- CHANGE HISTORY:
--      06 Dec 94   SAIC    ACVC 2.0
--      25 Mar 13   RLB     Modified as AI05-0288-1 requires subtype conformance
--                          in this case. Conflicting cases are commented out.
--
--!

package BC54002_0 is

--
-- Support declarations:
--

   subtype Str_Length is Natural range 0 .. 25;

   type Rec (Len : Str_Length) is tagged record
      C : String (1 .. Len);
   end record;


--
-- Generics declaring formal access-to-subprogram types:
--

   generic
      type Access_To_Proc is access
        procedure (P1: in out String; P2: Natural := 0);    -- Two parameters.
   package Procedure_Access is end;

   generic
      type Access_To_Func is access                         -- Two parameters
        function (P1, P2: in Rec) return Integer;           -- plus result.
   package Function_Access is end;

   generic
      type Access_To_Protected is access protected          -- Access-to-
        procedure (P: Boolean);                             -- protected-
   package Protected_Subprogram is end;                     -- subprogram.


end BC54002_0;


     --===================================================================--


with BC54002_0;
package BC54002 is

--
-- Support declarations:
--

   type New_Integer is new Integer;
   subtype New_Natural is New_Integer range 0 .. New_Integer'Last;

   subtype My_String is String (1 .. 20);

   subtype Rec_10 is BC54002_0.Rec(Len => 10);
   type New_Rec   is new BC54002_0.Rec(Len => 20) with null record;


--
-- Access-to-subprogram types to be passed as actuals:
--

   -- Access-to-procedure types:

   type Proc_Missing_Parameter is access
     procedure (A: in out String);

   type Proc_Extra_Parameter is access
     procedure (A: in out String; B, C: Natural);

   type Proc_Different_Default is access
     procedure (A: in out String; B: Natural := 25);

   type Wrong_Order is access
     procedure (A: Natural; B: in out String);

   type B_Has_Wrong_Type is access
     procedure (A: in out String; B: New_Natural);

   type Proc_Subtype_OK is access
     procedure (A: in out My_String; B: in Integer);

   type Modes_Are_Swapped is access
     procedure (A: String; B: in out Natural);

   type A_Has_Wrong_Mode is access
     procedure (A: out String; B: Natural);

   type B_Has_Explicit_In_Mode is access
     procedure (A: in out String; B: in Natural);

   type Proc_Protected_Error is access protected
     procedure (A: in out String; B: Natural);

   type Proc_Protected_OK is access protected
     procedure (A: in Boolean);

   type Proc_Not_Protected_Error is access
     procedure (A: Boolean);


   -- Access-to-function types:

   type Func_Missing_Parameter is access
     function (A: BC54002_0.Rec) return Integer;

   type Func_Extra_Parameter is access
     function (A, B: BC54002_0.Rec; C: BC54002_0.Rec) return Integer;

   type Func_Has_Defaults is access
     function (A: BC54002_0.Rec := (3,"Nil");
               B: BC54002_0.Rec := (4,"None")) return Integer;

   type Wrong_Result_Type is access
     function (A, B: BC54002_0.Rec) return New_Integer;

   type A_And_B_Have_Wrong_Type is access
     function (A, B: New_Rec) return Integer;

   type Func_Subtype_OK is access
     function (A: BC54002_0.Rec; B: Rec_10) return Natural;

   type Func_Protected_Error is access protected
     function (A, B: BC54002_0.Rec) return Integer;


--
-- Instantiations:
--

   -- Number of parameters; presence of defaults:

   package Instance01 is new
     BC54002_0.Procedure_Access (Proc_Missing_Parameter);             -- ERROR:
                                   -- Profile of actual has too few parameters.

   package Instance02 is new
     BC54002_0.Procedure_Access (Proc_Extra_Parameter);               -- ERROR:
                                  -- Profile of actual has too many parameters.

   package Instance03 is new
     BC54002_0.Procedure_Access (Proc_Different_Default);             -- OK.


   package Instance04 is new
     BC54002_0.Function_Access (Func_Missing_Parameter);              -- ERROR:
                                   -- Profile of actual has too few parameters.

   package Instance05 is new
     BC54002_0.Function_Access (Func_Extra_Parameter);                -- ERROR:
                                  -- Profile of actual has too many parameters.

   package Instance06 is new
     BC54002_0.Function_Access (Func_Has_Defaults);                   -- OK.


   -- Type/subtype of corresponding parameters:

   package Instance07 is new
     BC54002_0.Procedure_Access (Wrong_Order);                        -- ERROR:
             -- Corresponding parameters do not have same type (order swapped).

   package Instance08 is new
     BC54002_0.Procedure_Access (B_Has_Wrong_Type);                   -- ERROR:
            -- 2nd parameter in profile of actual has wrong type (New_Natural).

-- The following is illegal by AI05-0288-1, OK in Ada 95:
--   package Instance09 is new
--     BC54002_0.Procedure_Access (Proc_Subtype_OK);                    -- OK.

   package Instance10 is new
     BC54002_0.Function_Access (Wrong_Result_Type);                   -- ERROR:
                   -- Result in profile of actual has wrong type (New_Integer).

   package Instance11 is new
     BC54002_0.Function_Access (A_And_B_Have_Wrong_Type);             -- ERROR:
                  -- Parameters in profile of actual have wrong type (New_Rec).

-- The following is illegal by AI05-0288-1, OK in Ada 95:
--   package Instance12 is new
--     BC54002_0.Function_Access (Func_Subtype_OK);                     -- OK.


   -- Mode of corresponding parameters:

   package Instance13 is new
     BC54002_0.Procedure_Access (Modes_Are_Swapped);                  -- ERROR:
             -- Corresponding parameters do not have same mode (order swapped).

   package Instance14 is new
     BC54002_0.Procedure_Access (A_Has_Wrong_Mode);                   -- ERROR:
                    -- 1st parameter in profile of actual has wrong mode (out).

   package Instance15 is new
     BC54002_0.Procedure_Access (B_Has_Explicit_In_Mode);             -- OK.


   -- Protected vs. non-protected calling conventions:

   package Instance16 is new
     BC54002_0.Procedure_Access (Proc_Protected_Error);               -- ERROR:
                                  -- Calling convention of actual is protected.

   package Instance17 is new
     BC54002_0.Protected_Subprogram (Proc_Protected_OK);              -- OK.


   package Instance18 is new
     BC54002_0.Protected_Subprogram (Proc_Not_Protected_Error);       -- ERROR:
                              -- Calling convention of actual is not protected.

   package Instance19 is new
     BC54002_0.Function_Access (Func_Protected_Error);                -- ERROR:
                                  -- Calling convention of actual is protected.


end BC54002;
