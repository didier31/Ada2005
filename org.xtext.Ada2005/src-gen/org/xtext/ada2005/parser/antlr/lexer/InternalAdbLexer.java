package org.xtext.ada2005.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAdbLexer extends Lexer {
    public static final int RULE_NULL_=42;
    public static final int RULE_PG=112;
    public static final int RULE_MOD_=39;
    public static final int RULE_RETURN_=59;
    public static final int RULE_ACCESS_=8;
    public static final int RULE_RENAMES_=57;
    public static final int RULE_GOTO_=32;
    public static final int RULE_PD=113;
    public static final int RULE_ETOI=117;
    public static final int RULE_RAISE_=53;
    public static final int RULE_UNTIL_=70;
    public static final int RULE_USE_=71;
    public static final int RULE_LIMITED_=37;
    public static final int RULE_RECORD_=55;
    public static final int RULE_LETTER_UPPERCASE=85;
    public static final int RULE_SUPE=131;
    public static final int RULE_TAGGED_=65;
    public static final int RULE_BASE=98;
    public static final int RULE_EXCEPTION_=27;
    public static final int RULE_TERMINATE_=67;
    public static final int RULE_FOR_=29;
    public static final int RULE_OR_=44;
    public static final int RULE_INFE=129;
    public static final int RULE_IF_=33;
    public static final int RULE_DIGIT=82;
    public static final int RULE_LETTER_LOWERCASE=86;
    public static final int RULE_ACCEPT_=7;
    public static final int RULE_REVERSE_=60;
    public static final int RULE_IN_=34;
    public static final int RULE_PV=109;
    public static final int RULE_OPERATOR_SYMBOL=103;
    public static final int RULE_NUMERIC_LITERAL=78;
    public static final int RULE_NONQUOTATION_MARKGRAPHIC_CHARACTER=106;
    public static final int RULE_OTHERS_=45;
    public static final int RULE_PP=124;
    public static final int RULE_ABORT_=4;
    public static final int RULE_BEGIN_=14;
    public static final int RULE_CASE_=16;
    public static final int RULE_RANGE_=54;
    public static final int RULE_ALL_=10;
    public static final int RULE_ARRAY_=12;
    public static final int RULE_END_=25;
    public static final int RULE_NOT_=41;
    public static final int RULE_GRAPHIC_CHARACTER=101;
    public static final int RULE_DIFF=127;
    public static final int RULE_DO_=22;
    public static final int RULE_WHEN_=72;
    public static final int RULE_DPE=123;
    public static final int RULE_MOINS=116;
    public static final int RULE_BASED_NUMERAL=99;
    public static final int RULE_SUP=130;
    public static final int RULE_OTHER_FORMAT=96;
    public static final int RULE_ELSIF_=24;
    public static final int RULE_MARKSPACING_COMBINING=93;
    public static final int RULE_PRAGMA_=49;
    public static final int RULE_REQUEUE_=58;
    public static final int RULE_FLECHE=121;
    public static final int RULE_CHARACTER_LITERAL=102;
    public static final int RULE_NEW_=40;
    public static final int RULE_LETTER_TITLECASE=87;
    public static final int RULE_DELTA_=20;
    public static final int RULE_IDENTIFIER_EXTEND=97;
    public static final int RULE_V=111;
    public static final int RULE_BV=122;
    public static final int RULE_TYPE_=69;
    public static final int RULE_ELSE_=23;
    public static final int RULE_SYNCHRONIZED_=64;
    public static final int RULE_PUNCTUATION_CONNECTOR=95;
    public static final int RULE_EXPONENT=81;
    public static final int RULE_OUT_=46;
    public static final int RULE_P=80;
    public static final int RULE_TASK_=66;
    public static final int RULE_EXTENDED_DIGIT=100;
    public static final int RULE_WITH_=74;
    public static final int RULE_NUMBER_DECIMAL=94;
    public static final int RULE_CHG=132;
    public static final int RULE_CHD=133;
    public static final int RULE_IS_=36;
    public static final int RULE_NUMERAL=79;
    public static final int RULE_ALIASED_=9;
    public static final int RULE_ABS_=5;
    public static final int RULE_IDENTIFIER_START=90;
    public static final int RULE_SEPARATE_=62;
    public static final int RULE_OVERRIDING_=47;
    public static final int RULE_STRING_ELEMENT=104;
    public static final int RULE_OF_=43;
    public static final int RULE_DECIMAL_LITERAL=76;
    public static final int RULE_DIGITS_=21;
    public static final int RULE_REM_=56;
    public static final int RULE_CONSTANT_=17;
    public static final int RULE_LETTER_OTHER=91;
    public static final int RULE_PRIVATE_=50;
    public static final int RULE_PACKAGE_=48;
    public static final int RULE_SLASH=119;
    public static final int RULE_LOOP_=38;
    public static final int RULE_ETOI2=118;
    public static final int RULE_DECLARE_=18;
    public static final int RULE_WHILE_=73;
    public static final int RULE_DP=110;
    public static final int RULE_ENTRY_=26;
    public static final int RULE_QUOTE=120;
    public static final int RULE_INTERFACE_=35;
    public static final int RULE_PROTECTED_=52;
    public static final int RULE_BOIT=125;
    public static final int RULE_ABSTRACT_=6;
    public static final int RULE_INF=128;
    public static final int RULE_EXIT_=28;
    public static final int RULE_IDENTIFIER=84;
    public static final int RULE_AND_=11;
    public static final int RULE_XOR_=75;
    public static final int RULE_STRING_LITERAL=105;
    public static final int RULE_SUBTYPE_=63;
    public static final int RULE_SL_COMMENT=108;
    public static final int RULE_ET_COM=114;
    public static final int RULE_LETTER_MODIFIER=88;
    public static final int RULE_NONEND_OFLINE_CHARACTER=107;
    public static final int RULE_PLUS=115;
    public static final int RULE_THEN_=68;
    public static final int EOF=-1;
    public static final int RULE_EG=126;
    public static final int RULE_FUNCTION_=30;
    public static final int RULE_WS=83;
    public static final int RULE_DELAY_=19;
    public static final int RULE_MARKNON_SPACING=92;
    public static final int RULE_AT_=13;
    public static final int RULE_BODY_=15;
    public static final int RULE_SELECT_=61;
    public static final int RULE_GENERIC_=31;
    public static final int RULE_PROCEDURE_=51;
    public static final int RULE_BASED_LITERAL=77;
    public static final int RULE_NUMBER_LETTER=89;

    // delegates
    // delegators

    public InternalAdbLexer() {;} 
    public InternalAdbLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAdbLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalAdbLexer.g"; }

    // $ANTLR start "RULE_ABORT_"
    public final void mRULE_ABORT_() throws RecognitionException {
        try {
            int _type = RULE_ABORT_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:21:13: ( 'abort' )
            // InternalAdbLexer.g:21:15: 'abort'
            {
            match("abort"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ABORT_"

    // $ANTLR start "RULE_ABS_"
    public final void mRULE_ABS_() throws RecognitionException {
        try {
            int _type = RULE_ABS_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:23:11: ( 'abs' )
            // InternalAdbLexer.g:23:13: 'abs'
            {
            match("abs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ABS_"

    // $ANTLR start "RULE_ABSTRACT_"
    public final void mRULE_ABSTRACT_() throws RecognitionException {
        try {
            int _type = RULE_ABSTRACT_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:25:16: ( 'abstract' )
            // InternalAdbLexer.g:25:18: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ABSTRACT_"

    // $ANTLR start "RULE_ACCEPT_"
    public final void mRULE_ACCEPT_() throws RecognitionException {
        try {
            int _type = RULE_ACCEPT_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:27:14: ( 'accept' )
            // InternalAdbLexer.g:27:16: 'accept'
            {
            match("accept"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ACCEPT_"

    // $ANTLR start "RULE_ACCESS_"
    public final void mRULE_ACCESS_() throws RecognitionException {
        try {
            int _type = RULE_ACCESS_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:29:14: ( 'access' )
            // InternalAdbLexer.g:29:16: 'access'
            {
            match("access"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ACCESS_"

    // $ANTLR start "RULE_ALIASED_"
    public final void mRULE_ALIASED_() throws RecognitionException {
        try {
            int _type = RULE_ALIASED_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:31:15: ( 'aliased' )
            // InternalAdbLexer.g:31:17: 'aliased'
            {
            match("aliased"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALIASED_"

    // $ANTLR start "RULE_ALL_"
    public final void mRULE_ALL_() throws RecognitionException {
        try {
            int _type = RULE_ALL_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:33:11: ( 'all' )
            // InternalAdbLexer.g:33:13: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALL_"

    // $ANTLR start "RULE_AND_"
    public final void mRULE_AND_() throws RecognitionException {
        try {
            int _type = RULE_AND_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:35:11: ( 'and' )
            // InternalAdbLexer.g:35:13: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND_"

    // $ANTLR start "RULE_ARRAY_"
    public final void mRULE_ARRAY_() throws RecognitionException {
        try {
            int _type = RULE_ARRAY_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:37:13: ( 'array' )
            // InternalAdbLexer.g:37:15: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ARRAY_"

    // $ANTLR start "RULE_AT_"
    public final void mRULE_AT_() throws RecognitionException {
        try {
            int _type = RULE_AT_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:39:10: ( 'at' )
            // InternalAdbLexer.g:39:12: 'at'
            {
            match("at"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AT_"

    // $ANTLR start "RULE_BEGIN_"
    public final void mRULE_BEGIN_() throws RecognitionException {
        try {
            int _type = RULE_BEGIN_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:41:13: ( 'begin' )
            // InternalAdbLexer.g:41:15: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN_"

    // $ANTLR start "RULE_BODY_"
    public final void mRULE_BODY_() throws RecognitionException {
        try {
            int _type = RULE_BODY_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:43:12: ( 'body' )
            // InternalAdbLexer.g:43:14: 'body'
            {
            match("body"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BODY_"

    // $ANTLR start "RULE_CASE_"
    public final void mRULE_CASE_() throws RecognitionException {
        try {
            int _type = RULE_CASE_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:45:12: ( 'case' )
            // InternalAdbLexer.g:45:14: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CASE_"

    // $ANTLR start "RULE_CONSTANT_"
    public final void mRULE_CONSTANT_() throws RecognitionException {
        try {
            int _type = RULE_CONSTANT_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:47:16: ( 'constant' )
            // InternalAdbLexer.g:47:18: 'constant'
            {
            match("constant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONSTANT_"

    // $ANTLR start "RULE_DECLARE_"
    public final void mRULE_DECLARE_() throws RecognitionException {
        try {
            int _type = RULE_DECLARE_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:49:15: ( 'declare' )
            // InternalAdbLexer.g:49:17: 'declare'
            {
            match("declare"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECLARE_"

    // $ANTLR start "RULE_DELAY_"
    public final void mRULE_DELAY_() throws RecognitionException {
        try {
            int _type = RULE_DELAY_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:51:13: ( 'delay' )
            // InternalAdbLexer.g:51:15: 'delay'
            {
            match("delay"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DELAY_"

    // $ANTLR start "RULE_DELTA_"
    public final void mRULE_DELTA_() throws RecognitionException {
        try {
            int _type = RULE_DELTA_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:53:13: ( 'delta' )
            // InternalAdbLexer.g:53:15: 'delta'
            {
            match("delta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DELTA_"

    // $ANTLR start "RULE_DIGITS_"
    public final void mRULE_DIGITS_() throws RecognitionException {
        try {
            int _type = RULE_DIGITS_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:55:14: ( 'digits' )
            // InternalAdbLexer.g:55:16: 'digits'
            {
            match("digits"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGITS_"

    // $ANTLR start "RULE_DO_"
    public final void mRULE_DO_() throws RecognitionException {
        try {
            int _type = RULE_DO_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:57:10: ( 'do' )
            // InternalAdbLexer.g:57:12: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DO_"

    // $ANTLR start "RULE_ELSE_"
    public final void mRULE_ELSE_() throws RecognitionException {
        try {
            int _type = RULE_ELSE_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:59:12: ( 'else' )
            // InternalAdbLexer.g:59:14: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ELSE_"

    // $ANTLR start "RULE_ELSIF_"
    public final void mRULE_ELSIF_() throws RecognitionException {
        try {
            int _type = RULE_ELSIF_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:61:13: ( 'elsif' )
            // InternalAdbLexer.g:61:15: 'elsif'
            {
            match("elsif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ELSIF_"

    // $ANTLR start "RULE_END_"
    public final void mRULE_END_() throws RecognitionException {
        try {
            int _type = RULE_END_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:63:11: ( 'end' )
            // InternalAdbLexer.g:63:13: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_END_"

    // $ANTLR start "RULE_ENTRY_"
    public final void mRULE_ENTRY_() throws RecognitionException {
        try {
            int _type = RULE_ENTRY_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:65:13: ( 'entry' )
            // InternalAdbLexer.g:65:15: 'entry'
            {
            match("entry"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENTRY_"

    // $ANTLR start "RULE_EXCEPTION_"
    public final void mRULE_EXCEPTION_() throws RecognitionException {
        try {
            int _type = RULE_EXCEPTION_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:67:17: ( 'exception' )
            // InternalAdbLexer.g:67:19: 'exception'
            {
            match("exception"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXCEPTION_"

    // $ANTLR start "RULE_EXIT_"
    public final void mRULE_EXIT_() throws RecognitionException {
        try {
            int _type = RULE_EXIT_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:69:12: ( 'exit' )
            // InternalAdbLexer.g:69:14: 'exit'
            {
            match("exit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXIT_"

    // $ANTLR start "RULE_FOR_"
    public final void mRULE_FOR_() throws RecognitionException {
        try {
            int _type = RULE_FOR_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:71:11: ( 'for' )
            // InternalAdbLexer.g:71:13: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FOR_"

    // $ANTLR start "RULE_FUNCTION_"
    public final void mRULE_FUNCTION_() throws RecognitionException {
        try {
            int _type = RULE_FUNCTION_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:73:16: ( 'function' )
            // InternalAdbLexer.g:73:18: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FUNCTION_"

    // $ANTLR start "RULE_GENERIC_"
    public final void mRULE_GENERIC_() throws RecognitionException {
        try {
            int _type = RULE_GENERIC_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:75:15: ( 'generic' )
            // InternalAdbLexer.g:75:17: 'generic'
            {
            match("generic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GENERIC_"

    // $ANTLR start "RULE_GOTO_"
    public final void mRULE_GOTO_() throws RecognitionException {
        try {
            int _type = RULE_GOTO_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:77:12: ( 'goto' )
            // InternalAdbLexer.g:77:14: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GOTO_"

    // $ANTLR start "RULE_IF_"
    public final void mRULE_IF_() throws RecognitionException {
        try {
            int _type = RULE_IF_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:79:10: ( 'if' )
            // InternalAdbLexer.g:79:12: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IF_"

    // $ANTLR start "RULE_IN_"
    public final void mRULE_IN_() throws RecognitionException {
        try {
            int _type = RULE_IN_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:81:10: ( 'in' )
            // InternalAdbLexer.g:81:12: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IN_"

    // $ANTLR start "RULE_INTERFACE_"
    public final void mRULE_INTERFACE_() throws RecognitionException {
        try {
            int _type = RULE_INTERFACE_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:83:17: ( 'interface' )
            // InternalAdbLexer.g:83:19: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTERFACE_"

    // $ANTLR start "RULE_IS_"
    public final void mRULE_IS_() throws RecognitionException {
        try {
            int _type = RULE_IS_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:85:10: ( 'is' )
            // InternalAdbLexer.g:85:12: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IS_"

    // $ANTLR start "RULE_LIMITED_"
    public final void mRULE_LIMITED_() throws RecognitionException {
        try {
            int _type = RULE_LIMITED_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:87:15: ( 'limited' )
            // InternalAdbLexer.g:87:17: 'limited'
            {
            match("limited"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LIMITED_"

    // $ANTLR start "RULE_LOOP_"
    public final void mRULE_LOOP_() throws RecognitionException {
        try {
            int _type = RULE_LOOP_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:89:12: ( 'loop' )
            // InternalAdbLexer.g:89:14: 'loop'
            {
            match("loop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOOP_"

    // $ANTLR start "RULE_MOD_"
    public final void mRULE_MOD_() throws RecognitionException {
        try {
            int _type = RULE_MOD_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:91:11: ( 'mod' )
            // InternalAdbLexer.g:91:13: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MOD_"

    // $ANTLR start "RULE_NEW_"
    public final void mRULE_NEW_() throws RecognitionException {
        try {
            int _type = RULE_NEW_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:93:11: ( 'new' )
            // InternalAdbLexer.g:93:13: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEW_"

    // $ANTLR start "RULE_NOT_"
    public final void mRULE_NOT_() throws RecognitionException {
        try {
            int _type = RULE_NOT_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:95:11: ( 'not' )
            // InternalAdbLexer.g:95:13: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT_"

    // $ANTLR start "RULE_NULL_"
    public final void mRULE_NULL_() throws RecognitionException {
        try {
            int _type = RULE_NULL_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:97:12: ( 'null' )
            // InternalAdbLexer.g:97:14: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NULL_"

    // $ANTLR start "RULE_OF_"
    public final void mRULE_OF_() throws RecognitionException {
        try {
            int _type = RULE_OF_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:99:10: ( 'of' )
            // InternalAdbLexer.g:99:12: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OF_"

    // $ANTLR start "RULE_OR_"
    public final void mRULE_OR_() throws RecognitionException {
        try {
            int _type = RULE_OR_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:101:10: ( 'or' )
            // InternalAdbLexer.g:101:12: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR_"

    // $ANTLR start "RULE_OTHERS_"
    public final void mRULE_OTHERS_() throws RecognitionException {
        try {
            int _type = RULE_OTHERS_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:103:14: ( 'others' )
            // InternalAdbLexer.g:103:16: 'others'
            {
            match("others"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OTHERS_"

    // $ANTLR start "RULE_OUT_"
    public final void mRULE_OUT_() throws RecognitionException {
        try {
            int _type = RULE_OUT_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:105:11: ( 'out' )
            // InternalAdbLexer.g:105:13: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OUT_"

    // $ANTLR start "RULE_OVERRIDING_"
    public final void mRULE_OVERRIDING_() throws RecognitionException {
        try {
            int _type = RULE_OVERRIDING_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:107:18: ( 'overriding' )
            // InternalAdbLexer.g:107:20: 'overriding'
            {
            match("overriding"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OVERRIDING_"

    // $ANTLR start "RULE_PACKAGE_"
    public final void mRULE_PACKAGE_() throws RecognitionException {
        try {
            int _type = RULE_PACKAGE_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:109:15: ( 'package' )
            // InternalAdbLexer.g:109:17: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PACKAGE_"

    // $ANTLR start "RULE_PRAGMA_"
    public final void mRULE_PRAGMA_() throws RecognitionException {
        try {
            int _type = RULE_PRAGMA_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:111:14: ( 'pragma' )
            // InternalAdbLexer.g:111:16: 'pragma'
            {
            match("pragma"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PRAGMA_"

    // $ANTLR start "RULE_PRIVATE_"
    public final void mRULE_PRIVATE_() throws RecognitionException {
        try {
            int _type = RULE_PRIVATE_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:113:15: ( 'private' )
            // InternalAdbLexer.g:113:17: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PRIVATE_"

    // $ANTLR start "RULE_PROCEDURE_"
    public final void mRULE_PROCEDURE_() throws RecognitionException {
        try {
            int _type = RULE_PROCEDURE_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:115:17: ( 'procedure' )
            // InternalAdbLexer.g:115:19: 'procedure'
            {
            match("procedure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PROCEDURE_"

    // $ANTLR start "RULE_PROTECTED_"
    public final void mRULE_PROTECTED_() throws RecognitionException {
        try {
            int _type = RULE_PROTECTED_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:117:17: ( 'protected' )
            // InternalAdbLexer.g:117:19: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PROTECTED_"

    // $ANTLR start "RULE_RAISE_"
    public final void mRULE_RAISE_() throws RecognitionException {
        try {
            int _type = RULE_RAISE_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:119:13: ( 'raise' )
            // InternalAdbLexer.g:119:15: 'raise'
            {
            match("raise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RAISE_"

    // $ANTLR start "RULE_RANGE_"
    public final void mRULE_RANGE_() throws RecognitionException {
        try {
            int _type = RULE_RANGE_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:121:13: ( 'range' )
            // InternalAdbLexer.g:121:15: 'range'
            {
            match("range"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RANGE_"

    // $ANTLR start "RULE_RECORD_"
    public final void mRULE_RECORD_() throws RecognitionException {
        try {
            int _type = RULE_RECORD_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:123:14: ( 'record' )
            // InternalAdbLexer.g:123:16: 'record'
            {
            match("record"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RECORD_"

    // $ANTLR start "RULE_REM_"
    public final void mRULE_REM_() throws RecognitionException {
        try {
            int _type = RULE_REM_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:125:11: ( 'rem' )
            // InternalAdbLexer.g:125:13: 'rem'
            {
            match("rem"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REM_"

    // $ANTLR start "RULE_RENAMES_"
    public final void mRULE_RENAMES_() throws RecognitionException {
        try {
            int _type = RULE_RENAMES_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:127:15: ( 'renames' )
            // InternalAdbLexer.g:127:17: 'renames'
            {
            match("renames"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RENAMES_"

    // $ANTLR start "RULE_REQUEUE_"
    public final void mRULE_REQUEUE_() throws RecognitionException {
        try {
            int _type = RULE_REQUEUE_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:129:15: ( 'requeue' )
            // InternalAdbLexer.g:129:17: 'requeue'
            {
            match("requeue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REQUEUE_"

    // $ANTLR start "RULE_RETURN_"
    public final void mRULE_RETURN_() throws RecognitionException {
        try {
            int _type = RULE_RETURN_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:131:14: ( 'return' )
            // InternalAdbLexer.g:131:16: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RETURN_"

    // $ANTLR start "RULE_REVERSE_"
    public final void mRULE_REVERSE_() throws RecognitionException {
        try {
            int _type = RULE_REVERSE_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:133:15: ( 'reverse' )
            // InternalAdbLexer.g:133:17: 'reverse'
            {
            match("reverse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REVERSE_"

    // $ANTLR start "RULE_SELECT_"
    public final void mRULE_SELECT_() throws RecognitionException {
        try {
            int _type = RULE_SELECT_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:135:14: ( 'select' )
            // InternalAdbLexer.g:135:16: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SELECT_"

    // $ANTLR start "RULE_SEPARATE_"
    public final void mRULE_SEPARATE_() throws RecognitionException {
        try {
            int _type = RULE_SEPARATE_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:137:16: ( 'separate' )
            // InternalAdbLexer.g:137:18: 'separate'
            {
            match("separate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEPARATE_"

    // $ANTLR start "RULE_SUBTYPE_"
    public final void mRULE_SUBTYPE_() throws RecognitionException {
        try {
            int _type = RULE_SUBTYPE_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:139:15: ( 'subtype' )
            // InternalAdbLexer.g:139:17: 'subtype'
            {
            match("subtype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SUBTYPE_"

    // $ANTLR start "RULE_SYNCHRONIZED_"
    public final void mRULE_SYNCHRONIZED_() throws RecognitionException {
        try {
            int _type = RULE_SYNCHRONIZED_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:141:20: ( 'synchronized' )
            // InternalAdbLexer.g:141:22: 'synchronized'
            {
            match("synchronized"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SYNCHRONIZED_"

    // $ANTLR start "RULE_TAGGED_"
    public final void mRULE_TAGGED_() throws RecognitionException {
        try {
            int _type = RULE_TAGGED_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:143:14: ( 'tagged' )
            // InternalAdbLexer.g:143:16: 'tagged'
            {
            match("tagged"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAGGED_"

    // $ANTLR start "RULE_TASK_"
    public final void mRULE_TASK_() throws RecognitionException {
        try {
            int _type = RULE_TASK_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:145:12: ( 'task' )
            // InternalAdbLexer.g:145:14: 'task'
            {
            match("task"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TASK_"

    // $ANTLR start "RULE_TERMINATE_"
    public final void mRULE_TERMINATE_() throws RecognitionException {
        try {
            int _type = RULE_TERMINATE_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:147:17: ( 'terminate' )
            // InternalAdbLexer.g:147:19: 'terminate'
            {
            match("terminate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TERMINATE_"

    // $ANTLR start "RULE_THEN_"
    public final void mRULE_THEN_() throws RecognitionException {
        try {
            int _type = RULE_THEN_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:149:12: ( 'then' )
            // InternalAdbLexer.g:149:14: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_THEN_"

    // $ANTLR start "RULE_TYPE_"
    public final void mRULE_TYPE_() throws RecognitionException {
        try {
            int _type = RULE_TYPE_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:151:12: ( 'type' )
            // InternalAdbLexer.g:151:14: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPE_"

    // $ANTLR start "RULE_UNTIL_"
    public final void mRULE_UNTIL_() throws RecognitionException {
        try {
            int _type = RULE_UNTIL_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:153:13: ( 'until' )
            // InternalAdbLexer.g:153:15: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNTIL_"

    // $ANTLR start "RULE_USE_"
    public final void mRULE_USE_() throws RecognitionException {
        try {
            int _type = RULE_USE_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:155:11: ( 'use' )
            // InternalAdbLexer.g:155:13: 'use'
            {
            match("use"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_USE_"

    // $ANTLR start "RULE_WHEN_"
    public final void mRULE_WHEN_() throws RecognitionException {
        try {
            int _type = RULE_WHEN_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:157:12: ( 'when' )
            // InternalAdbLexer.g:157:14: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHEN_"

    // $ANTLR start "RULE_WHILE_"
    public final void mRULE_WHILE_() throws RecognitionException {
        try {
            int _type = RULE_WHILE_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:159:13: ( 'while' )
            // InternalAdbLexer.g:159:15: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHILE_"

    // $ANTLR start "RULE_WITH_"
    public final void mRULE_WITH_() throws RecognitionException {
        try {
            int _type = RULE_WITH_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:161:12: ( 'with' )
            // InternalAdbLexer.g:161:14: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WITH_"

    // $ANTLR start "RULE_XOR_"
    public final void mRULE_XOR_() throws RecognitionException {
        try {
            int _type = RULE_XOR_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:163:11: ( 'xor' )
            // InternalAdbLexer.g:163:13: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_XOR_"

    // $ANTLR start "RULE_NUMERIC_LITERAL"
    public final void mRULE_NUMERIC_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_NUMERIC_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:165:22: ( ( RULE_DECIMAL_LITERAL | RULE_BASED_LITERAL ) )
            // InternalAdbLexer.g:165:24: ( RULE_DECIMAL_LITERAL | RULE_BASED_LITERAL )
            {
            // InternalAdbLexer.g:165:24: ( RULE_DECIMAL_LITERAL | RULE_BASED_LITERAL )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalAdbLexer.g:165:25: RULE_DECIMAL_LITERAL
                    {
                    mRULE_DECIMAL_LITERAL(); 

                    }
                    break;
                case 2 :
                    // InternalAdbLexer.g:165:46: RULE_BASED_LITERAL
                    {
                    mRULE_BASED_LITERAL(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMERIC_LITERAL"

    // $ANTLR start "RULE_DECIMAL_LITERAL"
    public final void mRULE_DECIMAL_LITERAL() throws RecognitionException {
        try {
            // InternalAdbLexer.g:167:31: ( RULE_NUMERAL ( RULE_P RULE_NUMERAL )? ( RULE_EXPONENT )? )
            // InternalAdbLexer.g:167:33: RULE_NUMERAL ( RULE_P RULE_NUMERAL )? ( RULE_EXPONENT )?
            {
            mRULE_NUMERAL(); 
            // InternalAdbLexer.g:167:46: ( RULE_P RULE_NUMERAL )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='.') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAdbLexer.g:167:47: RULE_P RULE_NUMERAL
                    {
                    mRULE_P(); 
                    mRULE_NUMERAL(); 

                    }
                    break;

            }

            // InternalAdbLexer.g:167:69: ( RULE_EXPONENT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='E'||LA3_0=='e') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAdbLexer.g:167:69: RULE_EXPONENT
                    {
                    mRULE_EXPONENT(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_LITERAL"

    // $ANTLR start "RULE_NUMERAL"
    public final void mRULE_NUMERAL() throws RecognitionException {
        try {
            // InternalAdbLexer.g:169:23: ( RULE_DIGIT ( ( '_' )? RULE_DIGIT )* )
            // InternalAdbLexer.g:169:25: RULE_DIGIT ( ( '_' )? RULE_DIGIT )*
            {
            mRULE_DIGIT(); 
            // InternalAdbLexer.g:169:36: ( ( '_' )? RULE_DIGIT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||LA5_0=='_') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAdbLexer.g:169:37: ( '_' )? RULE_DIGIT
            	    {
            	    // InternalAdbLexer.g:169:37: ( '_' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0=='_') ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalAdbLexer.g:169:37: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMERAL"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:171:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAdbLexer.g:171:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAdbLexer.g:171:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAdbLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:173:17: ( '^' )
            // InternalAdbLexer.g:173:19: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_IDENTIFIER_START"
    public final void mRULE_IDENTIFIER_START() throws RecognitionException {
        try {
            // InternalAdbLexer.g:175:32: ( ( RULE_LETTER_UPPERCASE | RULE_LETTER_LOWERCASE | RULE_LETTER_TITLECASE | RULE_LETTER_MODIFIER | RULE_NUMBER_LETTER ) )
            // InternalAdbLexer.g:175:34: ( RULE_LETTER_UPPERCASE | RULE_LETTER_LOWERCASE | RULE_LETTER_TITLECASE | RULE_LETTER_MODIFIER | RULE_NUMBER_LETTER )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u01C5'||input.LA(1)=='\u01C8'||input.LA(1)=='\u01CB'||input.LA(1)=='\u01F2'||(input.LA(1)>='\u02B0' && input.LA(1)<='\u02C1')||(input.LA(1)>='\u02C6' && input.LA(1)<='\u02D1')||(input.LA(1)>='\u02E0' && input.LA(1)<='\u02E4')||input.LA(1)=='\u02EC'||input.LA(1)=='\u02EE'||input.LA(1)=='\u0374'||input.LA(1)=='\u037A'||input.LA(1)=='\u0559'||input.LA(1)=='\u0640'||(input.LA(1)>='\u06E5' && input.LA(1)<='\u06E6')||(input.LA(1)>='\u07F4' && input.LA(1)<='\u07F5')||input.LA(1)=='\u07FA'||input.LA(1)=='\u081A'||input.LA(1)=='\u0824'||input.LA(1)=='\u0828'||input.LA(1)=='\u0971'||input.LA(1)=='\u0E46'||input.LA(1)=='\u0EC6'||input.LA(1)=='\u10FC'||(input.LA(1)>='\u16EE' && input.LA(1)<='\u16F0')||input.LA(1)=='\u17D7'||input.LA(1)=='\u1843'||input.LA(1)=='\u1AA7'||(input.LA(1)>='\u1C78' && input.LA(1)<='\u1C7D')||(input.LA(1)>='\u1D2C' && input.LA(1)<='\u1D6A')||input.LA(1)=='\u1D78'||(input.LA(1)>='\u1D9B' && input.LA(1)<='\u1DBF')||(input.LA(1)>='\u1F88' && input.LA(1)<='\u1F8F')||(input.LA(1)>='\u1F98' && input.LA(1)<='\u1F9F')||(input.LA(1)>='\u1FA8' && input.LA(1)<='\u1FAF')||input.LA(1)=='\u1FBC'||input.LA(1)=='\u1FCC'||input.LA(1)=='\u1FFC'||input.LA(1)=='\u2071'||input.LA(1)=='\u207F'||(input.LA(1)>='\u2090' && input.LA(1)<='\u209C')||(input.LA(1)>='\u2160' && input.LA(1)<='\u2182')||(input.LA(1)>='\u2185' && input.LA(1)<='\u2188')||(input.LA(1)>='\u2C7C' && input.LA(1)<='\u2C7D')||input.LA(1)=='\u2D6F'||input.LA(1)=='\u2E2F'||input.LA(1)=='\u3005'||input.LA(1)=='\u3007'||(input.LA(1)>='\u3021' && input.LA(1)<='\u3029')||(input.LA(1)>='\u3031' && input.LA(1)<='\u3035')||(input.LA(1)>='\u3038' && input.LA(1)<='\u303B')||(input.LA(1)>='\u309D' && input.LA(1)<='\u309E')||(input.LA(1)>='\u30FC' && input.LA(1)<='\u30FE')||input.LA(1)=='\uA015'||(input.LA(1)>='\uA4F8' && input.LA(1)<='\uA4FD')||input.LA(1)=='\uA60C'||input.LA(1)=='\uA67F'||(input.LA(1)>='\uA6E6' && input.LA(1)<='\uA6EF')||(input.LA(1)>='\uA717' && input.LA(1)<='\uA71F')||input.LA(1)=='\uA770'||input.LA(1)=='\uA788'||(input.LA(1)>='\uA7F8' && input.LA(1)<='\uA7F9')||input.LA(1)=='\uA9CF'||input.LA(1)=='\uAA70'||input.LA(1)=='\uAADD'||(input.LA(1)>='\uAAF3' && input.LA(1)<='\uAAF4')||input.LA(1)=='\uFF70'||(input.LA(1)>='\uFF9E' && input.LA(1)<='\uFF9F') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTIFIER_START"

    // $ANTLR start "RULE_LETTER_UPPERCASE"
    public final void mRULE_LETTER_UPPERCASE() throws RecognitionException {
        try {
            // InternalAdbLexer.g:177:32: ( 'A' .. 'Z' )
            // InternalAdbLexer.g:177:34: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER_UPPERCASE"

    // $ANTLR start "RULE_LETTER_LOWERCASE"
    public final void mRULE_LETTER_LOWERCASE() throws RecognitionException {
        try {
            // InternalAdbLexer.g:179:32: ( 'a' .. 'z' )
            // InternalAdbLexer.g:179:34: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER_LOWERCASE"

    // $ANTLR start "RULE_LETTER_TITLECASE"
    public final void mRULE_LETTER_TITLECASE() throws RecognitionException {
        try {
            // InternalAdbLexer.g:181:32: ( ( '\\u01C5' | '\\u01C8' | '\\u01CB' | '\\u01F2' | '\\u1F88' .. '\\u1F8F' | '\\u1F98' .. '\\u1F9F' | '\\u1FA8' .. '\\u1FAF' | '\\u1FBC' | '\\u1FCC' | '\\u1FFC' ) )
            // InternalAdbLexer.g:181:34: ( '\\u01C5' | '\\u01C8' | '\\u01CB' | '\\u01F2' | '\\u1F88' .. '\\u1F8F' | '\\u1F98' .. '\\u1F9F' | '\\u1FA8' .. '\\u1FAF' | '\\u1FBC' | '\\u1FCC' | '\\u1FFC' )
            {
            if ( input.LA(1)=='\u01C5'||input.LA(1)=='\u01C8'||input.LA(1)=='\u01CB'||input.LA(1)=='\u01F2'||(input.LA(1)>='\u1F88' && input.LA(1)<='\u1F8F')||(input.LA(1)>='\u1F98' && input.LA(1)<='\u1F9F')||(input.LA(1)>='\u1FA8' && input.LA(1)<='\u1FAF')||input.LA(1)=='\u1FBC'||input.LA(1)=='\u1FCC'||input.LA(1)=='\u1FFC' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER_TITLECASE"

    // $ANTLR start "RULE_LETTER_MODIFIER"
    public final void mRULE_LETTER_MODIFIER() throws RecognitionException {
        try {
            // InternalAdbLexer.g:183:31: ( ( '\\u02B0' .. '\\u02C1' | '\\u02C6' .. '\\u02D1' | '\\u02E0' .. '\\u02E4' | '\\u02EC' | '\\u02EE' | '\\u0374' | '\\u037A' | '\\u0559' | '\\u0640' | '\\u06E5' | '\\u06E6' | '\\u07F4' | '\\u07F5' | '\\u07FA' | '\\u081A' | '\\u0824' | '\\u0828' | '\\u0971' | '\\u0E46' | '\\u0EC6' | '\\u10FC' | '\\u17D7' | '\\u1843' | '\\u1AA7' | '\\u1C78' .. '\\u1C7D' | '\\u1D2C' .. '\\u1D6A' | '\\u1D78' | '\\u1D9B' .. '\\u1DBF' | '\\u2071' | '\\u207F' | '\\u2090' .. '\\u209C' | '\\u2C7C' | '\\u2C7D' | '\\u2D6F' | '\\u2E2F' | '\\u3005' | '\\u3031' .. '\\u3035' | '\\u303B' | '\\u309D' | '\\u309E' | '\\u30FC' .. '\\u30FE' | '\\uA015' | '\\uA4F8' .. '\\uA4FD' | '\\uA60C' | '\\uA67F' | '\\uA717' .. '\\uA71F' | '\\uA770' | '\\uA788' | '\\uA7F8' | '\\uA7F9' | '\\uA9CF' | '\\uAA70' | '\\uAADD' | '\\uAAF3' | '\\uAAF4' | '\\uFF70' | '\\uFF9E' | '\\uFF9F' ) )
            // InternalAdbLexer.g:183:33: ( '\\u02B0' .. '\\u02C1' | '\\u02C6' .. '\\u02D1' | '\\u02E0' .. '\\u02E4' | '\\u02EC' | '\\u02EE' | '\\u0374' | '\\u037A' | '\\u0559' | '\\u0640' | '\\u06E5' | '\\u06E6' | '\\u07F4' | '\\u07F5' | '\\u07FA' | '\\u081A' | '\\u0824' | '\\u0828' | '\\u0971' | '\\u0E46' | '\\u0EC6' | '\\u10FC' | '\\u17D7' | '\\u1843' | '\\u1AA7' | '\\u1C78' .. '\\u1C7D' | '\\u1D2C' .. '\\u1D6A' | '\\u1D78' | '\\u1D9B' .. '\\u1DBF' | '\\u2071' | '\\u207F' | '\\u2090' .. '\\u209C' | '\\u2C7C' | '\\u2C7D' | '\\u2D6F' | '\\u2E2F' | '\\u3005' | '\\u3031' .. '\\u3035' | '\\u303B' | '\\u309D' | '\\u309E' | '\\u30FC' .. '\\u30FE' | '\\uA015' | '\\uA4F8' .. '\\uA4FD' | '\\uA60C' | '\\uA67F' | '\\uA717' .. '\\uA71F' | '\\uA770' | '\\uA788' | '\\uA7F8' | '\\uA7F9' | '\\uA9CF' | '\\uAA70' | '\\uAADD' | '\\uAAF3' | '\\uAAF4' | '\\uFF70' | '\\uFF9E' | '\\uFF9F' )
            {
            if ( (input.LA(1)>='\u02B0' && input.LA(1)<='\u02C1')||(input.LA(1)>='\u02C6' && input.LA(1)<='\u02D1')||(input.LA(1)>='\u02E0' && input.LA(1)<='\u02E4')||input.LA(1)=='\u02EC'||input.LA(1)=='\u02EE'||input.LA(1)=='\u0374'||input.LA(1)=='\u037A'||input.LA(1)=='\u0559'||input.LA(1)=='\u0640'||(input.LA(1)>='\u06E5' && input.LA(1)<='\u06E6')||(input.LA(1)>='\u07F4' && input.LA(1)<='\u07F5')||input.LA(1)=='\u07FA'||input.LA(1)=='\u081A'||input.LA(1)=='\u0824'||input.LA(1)=='\u0828'||input.LA(1)=='\u0971'||input.LA(1)=='\u0E46'||input.LA(1)=='\u0EC6'||input.LA(1)=='\u10FC'||input.LA(1)=='\u17D7'||input.LA(1)=='\u1843'||input.LA(1)=='\u1AA7'||(input.LA(1)>='\u1C78' && input.LA(1)<='\u1C7D')||(input.LA(1)>='\u1D2C' && input.LA(1)<='\u1D6A')||input.LA(1)=='\u1D78'||(input.LA(1)>='\u1D9B' && input.LA(1)<='\u1DBF')||input.LA(1)=='\u2071'||input.LA(1)=='\u207F'||(input.LA(1)>='\u2090' && input.LA(1)<='\u209C')||(input.LA(1)>='\u2C7C' && input.LA(1)<='\u2C7D')||input.LA(1)=='\u2D6F'||input.LA(1)=='\u2E2F'||input.LA(1)=='\u3005'||(input.LA(1)>='\u3031' && input.LA(1)<='\u3035')||input.LA(1)=='\u303B'||(input.LA(1)>='\u309D' && input.LA(1)<='\u309E')||(input.LA(1)>='\u30FC' && input.LA(1)<='\u30FE')||input.LA(1)=='\uA015'||(input.LA(1)>='\uA4F8' && input.LA(1)<='\uA4FD')||input.LA(1)=='\uA60C'||input.LA(1)=='\uA67F'||(input.LA(1)>='\uA717' && input.LA(1)<='\uA71F')||input.LA(1)=='\uA770'||input.LA(1)=='\uA788'||(input.LA(1)>='\uA7F8' && input.LA(1)<='\uA7F9')||input.LA(1)=='\uA9CF'||input.LA(1)=='\uAA70'||input.LA(1)=='\uAADD'||(input.LA(1)>='\uAAF3' && input.LA(1)<='\uAAF4')||input.LA(1)=='\uFF70'||(input.LA(1)>='\uFF9E' && input.LA(1)<='\uFF9F') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER_MODIFIER"

    // $ANTLR start "RULE_LETTER_OTHER"
    public final void mRULE_LETTER_OTHER() throws RecognitionException {
        try {
            // InternalAdbLexer.g:185:28: ( ( '\\u00AA' | '\\u00BA' | '\\u01BB' | '\\u01C0' | '\\u01C3' | '\\u0294' | '\\u05D0' | '\\u05EA' | '\\u05F0' | '\\u05F2' | '\\u0620' | '\\u063F' | '\\u0641' | '\\u064A' | '\\u066E' | '\\u066F' | '\\u0671' | '\\u06D3' | '\\u06D5' | '\\u06EE' | '\\u06EF' | '\\u06FA' | '\\u06FC' | '\\u06FF' | '\\u0710' | '\\u0712' | '\\u072F' | '\\u074D' | '\\u07A5' | '\\u07B1' | '\\u07CA' | '\\u07EA' | '\\u0800' | '\\u0815' | '\\u0840' | '\\u0858' | '\\u08A0' | '\\u08A2' | '\\u08AC' | '\\u0904' | '\\u0939' | '\\u093D' | '\\u0950' | '\\u0958' | '\\u0961' | '\\u0972' | '\\u0977' | '\\u0979' | '\\u097F' | '\\u0985' | '\\u098C' | '\\u098F' | '\\u0990' | '\\u0993' | '\\u09A8' | '\\u09AA' | '\\u09B0' | '\\u09B2' | '\\u09B6' | '\\u09B9' | '\\u09BD' | '\\u09CE' | '\\u09DC' | '\\u09DD' | '\\u09DF' | '\\u09E1' | '\\u09F0' | '\\u09F1' | '\\u0A05' | '\\u0A0A' | '\\u0A0F' | '\\u0A10' | '\\u0A13' | '\\u0A28' | '\\u0A2A' | '\\u0A30' | '\\u0A32' | '\\u0A33' | '\\u0A35' | '\\u0A36' | '\\u0A38' | '\\u0A39' | '\\u0A59' | '\\u0A5C' | '\\u0A5E' | '\\u0A72' | '\\u0A74' | '\\u0A85' | '\\u0A8D' | '\\u0A8F' | '\\u0A91' | '\\u0A93' | '\\u0AA8' | '\\u0AAA' | '\\u0AB0' | '\\u0AB2' | '\\u0AB3' | '\\u0AB5' | '\\u0AB9' | '\\u0ABD' | '\\u0AD0' | '\\u0AE0' | '\\u0AE1' | '\\u0B05' | '\\u0B0C' | '\\u0B0F' | '\\u0B10' | '\\u0B13' | '\\u0B28' | '\\u0B2A' | '\\u0B30' | '\\u0B32' | '\\u0B33' | '\\u0B35' | '\\u0B39' | '\\u0B3D' | '\\u0B5C' | '\\u0B5D' | '\\u0B5F' | '\\u0B61' | '\\u0B71' | '\\u0B83' | '\\u0B85' | '\\u0B8A' | '\\u0B8E' | '\\u0B90' | '\\u0B92' | '\\u0B95' | '\\u0B99' | '\\u0B9A' | '\\u0B9C' | '\\u0B9E' | '\\u0B9F' | '\\u0BA3' | '\\u0BA4' | '\\u0BA8' | '\\u0BAA' | '\\u0BAE' | '\\u0BB9' | '\\u0BD0' | '\\u0C05' | '\\u0C0C' | '\\u0C0E' | '\\u0C10' | '\\u0C12' | '\\u0C28' | '\\u0C2A' | '\\u0C33' | '\\u0C35' | '\\u0C39' | '\\u0C3D' | '\\u0C58' | '\\u0C59' | '\\u0C60' | '\\u0C61' | '\\u0C85' | '\\u0C8C' | '\\u0C8E' | '\\u0C90' | '\\u0C92' | '\\u0CA8' | '\\u0CAA' | '\\u0CB3' | '\\u0CB5' | '\\u0CB9' | '\\u0CBD' | '\\u0CDE' | '\\u0CE0' | '\\u0CE1' | '\\u0CF1' | '\\u0CF2' | '\\u0D05' | '\\u0D0C' | '\\u0D0E' | '\\u0D10' | '\\u0D12' | '\\u0D3A' | '\\u0D3D' | '\\u0D4E' | '\\u0D60' | '\\u0D61' | '\\u0D7A' | '\\u0D7F' | '\\u0D85' | '\\u0D96' | '\\u0D9A' | '\\u0DB1' | '\\u0DB3' | '\\u0DBB' | '\\u0DBD' | '\\u0DC0' | '\\u0DC6' | '\\u0E01' | '\\u0E30' | '\\u0E32' | '\\u0E33' | '\\u0E40' | '\\u0E45' | '\\u0E81' | '\\u0E82' | '\\u0E84' | '\\u0E87' | '\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94' | '\\u0E97' | '\\u0E99' | '\\u0E9F' | '\\u0EA1' | '\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA' | '\\u0EAB' | '\\u0EAD' | '\\u0EB0' | '\\u0EB2' | '\\u0EB3' | '\\u0EBD' | '\\u0EC0' | '\\u0EC4' | '\\u0EDC' | '\\u0EDF' | '\\u0F00' | '\\u0F40' | '\\u0F47' | '\\u0F49' | '\\u0F6C' | '\\u0F88' | '\\u0F8C' | '\\u1000' | '\\u102A' | '\\u103F' | '\\u1050' | '\\u1055' | '\\u105A' | '\\u105D' | '\\u1061' | '\\u1065' | '\\u1066' | '\\u106E' | '\\u1070' | '\\u1075' | '\\u1081' | '\\u108E' | '\\u10D0' | '\\u10FA' | '\\u10FD' | '\\u1248' | '\\u124A' | '\\u124D' | '\\u1250' | '\\u1256' | '\\u1258' | '\\u125A' | '\\u125D' | '\\u1260' | '\\u1288' | '\\u128A' | '\\u128D' | '\\u1290' | '\\u12B0' | '\\u12B2' | '\\u12B5' | '\\u12B8' | '\\u12BE' | '\\u12C0' | '\\u12C2' | '\\u12C5' | '\\u12C8' | '\\u12D6' | '\\u12D8' | '\\u1310' | '\\u1312' | '\\u1315' | '\\u1318' | '\\u135A' | '\\u1380' | '\\u138F' | '\\u13A0' | '\\u13F4' | '\\u1401' | '\\u166C' | '\\u166F' | '\\u167F' | '\\u1681' | '\\u169A' | '\\u16A0' | '\\u16EA' | '\\u1700' | '\\u170C' | '\\u170E' | '\\u1711' | '\\u1720' | '\\u1731' | '\\u1740' | '\\u1751' | '\\u1760' | '\\u176C' | '\\u176E' | '\\u1770' | '\\u1780' | '\\u17B3' | '\\u17DC' | '\\u1820' | '\\u1842' | '\\u1844' | '\\u1877' | '\\u1880' | '\\u18A8' | '\\u18AA' | '\\u18B0' | '\\u18F5' | '\\u1900' | '\\u191C' | '\\u1950' | '\\u196D' | '\\u1970' | '\\u1974' | '\\u1980' | '\\u19AB' | '\\u19C1' | '\\u19C7' | '\\u1A00' | '\\u1A16' | '\\u1A20' | '\\u1A54' | '\\u1B05' | '\\u1B33' | '\\u1B45' | '\\u1B4B' | '\\u1B83' | '\\u1BA0' | '\\u1BAE' | '\\u1BAF' | '\\u1BBA' | '\\u1BE5' | '\\u1C00' | '\\u1C23' | '\\u1C4D' | '\\u1C4F' | '\\u1C5A' | '\\u1C77' | '\\u1CE9' | '\\u1CEC' | '\\u1CEE' | '\\u1CF1' | '\\u1CF5' | '\\u1CF6' | '\\u2135' | '\\u2138' | '\\u2D30' | '\\u2D67' | '\\u2D80' | '\\u2D96' | '\\u2DA0' | '\\u2DA6' | '\\u2DA8' | '\\u2DAE' | '\\u2DB0' | '\\u2DB6' | '\\u2DB8' | '\\u2DBE' | '\\u2DC0' | '\\u2DC6' | '\\u2DC8' | '\\u2DCE' | '\\u2DD0' | '\\u2DD6' | '\\u2DD8' | '\\u2DDE' | '\\u3006' | '\\u303C' | '\\u3041' | '\\u3096' | '\\u309F' | '\\u30A1' | '\\u30FA' | '\\u30FF' | '\\u3105' | '\\u312D' | '\\u3131' | '\\u318E' | '\\u31A0' | '\\u31BA' | '\\u31F0' | '\\u31FF' | '\\u3400' | '\\u4DB5' | '\\u4E00' | '\\u9FCC' | '\\uA000' | '\\uA014' | '\\uA016' | '\\uA48C' | '\\uA4D0' | '\\uA4F7' | '\\uA500' | '\\uA60B' | '\\uA610' | '\\uA61F' | '\\uA62A' | '\\uA62B' | '\\uA66E' | '\\uA6A0' | '\\uA6E5' | '\\uA7FB' | '\\uA801' | '\\uA803' | '\\uA805' | '\\uA807' | '\\uA80A' | '\\uA80C' | '\\uA822' | '\\uA840' | '\\uA873' | '\\uA882' | '\\uA8B3' | '\\uA8F2' | '\\uA8F7' | '\\uA8FB' | '\\uA90A' | '\\uA925' | '\\uA930' | '\\uA946' | '\\uA960' | '\\uA97C' | '\\uA984' | '\\uA9B2' | '\\uAA00' | '\\uAA28' | '\\uAA40' | '\\uAA42' | '\\uAA44' | '\\uAA4B' | '\\uAA60' | '\\uAA6F' | '\\uAA71' | '\\uAA76' | '\\uAA7A' | '\\uAA80' | '\\uAAAF' | '\\uAAB1' | '\\uAAB5' | '\\uAAB6' | '\\uAAB9' | '\\uAABD' | '\\uAAC0' | '\\uAAC2' | '\\uAADB' | '\\uAADC' | '\\uAAE0' | '\\uAAEA' | '\\uAAF2' | '\\uAB01' | '\\uAB06' | '\\uAB09' | '\\uAB0E' | '\\uAB11' | '\\uAB16' | '\\uAB20' | '\\uAB26' | '\\uAB28' | '\\uAB2E' | '\\uABC0' | '\\uABE2' | '\\uAC00' | '\\uD7A3' | '\\uD7B0' | '\\uD7C6' | '\\uD7CB' | '\\uD7FB' | '\\uF900' | '\\uFA6D' | '\\uFA70' | '\\uFAD9' | '\\uFB1D' | '\\uFB1F' | '\\uFB28' | '\\uFB2A' | '\\uFB36' | '\\uFB38' | '\\uFB3C' | '\\uFB3E' | '\\uFB40' | '\\uFB41' | '\\uFB43' | '\\uFB44' | '\\uFB46' | '\\uFBB1' | '\\uFBD3' | '\\uFD3D' | '\\uFD50' | '\\uFD8F' | '\\uFD92' | '\\uFDC7' | '\\uFDF0' | '\\uFDFB' | '\\uFE70' | '\\uFE74' | '\\uFE76' | '\\uFEFC' | '\\uFF66' | '\\uFF6F' | '\\uFF71' | '\\uFF9D' | '\\uFFA0' | '\\uFFBE' | '\\uFFC2' | '\\uFFC7' | '\\uFFCA' | '\\uFFCF' | '\\uFFD2' | '\\uFFD7' | '\\uFFDA' | '\\uFFDC' | '\\u10000' | '\\u1000B' ) )
            // InternalAdbLexer.g:185:30: ( '\\u00AA' | '\\u00BA' | '\\u01BB' | '\\u01C0' | '\\u01C3' | '\\u0294' | '\\u05D0' | '\\u05EA' | '\\u05F0' | '\\u05F2' | '\\u0620' | '\\u063F' | '\\u0641' | '\\u064A' | '\\u066E' | '\\u066F' | '\\u0671' | '\\u06D3' | '\\u06D5' | '\\u06EE' | '\\u06EF' | '\\u06FA' | '\\u06FC' | '\\u06FF' | '\\u0710' | '\\u0712' | '\\u072F' | '\\u074D' | '\\u07A5' | '\\u07B1' | '\\u07CA' | '\\u07EA' | '\\u0800' | '\\u0815' | '\\u0840' | '\\u0858' | '\\u08A0' | '\\u08A2' | '\\u08AC' | '\\u0904' | '\\u0939' | '\\u093D' | '\\u0950' | '\\u0958' | '\\u0961' | '\\u0972' | '\\u0977' | '\\u0979' | '\\u097F' | '\\u0985' | '\\u098C' | '\\u098F' | '\\u0990' | '\\u0993' | '\\u09A8' | '\\u09AA' | '\\u09B0' | '\\u09B2' | '\\u09B6' | '\\u09B9' | '\\u09BD' | '\\u09CE' | '\\u09DC' | '\\u09DD' | '\\u09DF' | '\\u09E1' | '\\u09F0' | '\\u09F1' | '\\u0A05' | '\\u0A0A' | '\\u0A0F' | '\\u0A10' | '\\u0A13' | '\\u0A28' | '\\u0A2A' | '\\u0A30' | '\\u0A32' | '\\u0A33' | '\\u0A35' | '\\u0A36' | '\\u0A38' | '\\u0A39' | '\\u0A59' | '\\u0A5C' | '\\u0A5E' | '\\u0A72' | '\\u0A74' | '\\u0A85' | '\\u0A8D' | '\\u0A8F' | '\\u0A91' | '\\u0A93' | '\\u0AA8' | '\\u0AAA' | '\\u0AB0' | '\\u0AB2' | '\\u0AB3' | '\\u0AB5' | '\\u0AB9' | '\\u0ABD' | '\\u0AD0' | '\\u0AE0' | '\\u0AE1' | '\\u0B05' | '\\u0B0C' | '\\u0B0F' | '\\u0B10' | '\\u0B13' | '\\u0B28' | '\\u0B2A' | '\\u0B30' | '\\u0B32' | '\\u0B33' | '\\u0B35' | '\\u0B39' | '\\u0B3D' | '\\u0B5C' | '\\u0B5D' | '\\u0B5F' | '\\u0B61' | '\\u0B71' | '\\u0B83' | '\\u0B85' | '\\u0B8A' | '\\u0B8E' | '\\u0B90' | '\\u0B92' | '\\u0B95' | '\\u0B99' | '\\u0B9A' | '\\u0B9C' | '\\u0B9E' | '\\u0B9F' | '\\u0BA3' | '\\u0BA4' | '\\u0BA8' | '\\u0BAA' | '\\u0BAE' | '\\u0BB9' | '\\u0BD0' | '\\u0C05' | '\\u0C0C' | '\\u0C0E' | '\\u0C10' | '\\u0C12' | '\\u0C28' | '\\u0C2A' | '\\u0C33' | '\\u0C35' | '\\u0C39' | '\\u0C3D' | '\\u0C58' | '\\u0C59' | '\\u0C60' | '\\u0C61' | '\\u0C85' | '\\u0C8C' | '\\u0C8E' | '\\u0C90' | '\\u0C92' | '\\u0CA8' | '\\u0CAA' | '\\u0CB3' | '\\u0CB5' | '\\u0CB9' | '\\u0CBD' | '\\u0CDE' | '\\u0CE0' | '\\u0CE1' | '\\u0CF1' | '\\u0CF2' | '\\u0D05' | '\\u0D0C' | '\\u0D0E' | '\\u0D10' | '\\u0D12' | '\\u0D3A' | '\\u0D3D' | '\\u0D4E' | '\\u0D60' | '\\u0D61' | '\\u0D7A' | '\\u0D7F' | '\\u0D85' | '\\u0D96' | '\\u0D9A' | '\\u0DB1' | '\\u0DB3' | '\\u0DBB' | '\\u0DBD' | '\\u0DC0' | '\\u0DC6' | '\\u0E01' | '\\u0E30' | '\\u0E32' | '\\u0E33' | '\\u0E40' | '\\u0E45' | '\\u0E81' | '\\u0E82' | '\\u0E84' | '\\u0E87' | '\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94' | '\\u0E97' | '\\u0E99' | '\\u0E9F' | '\\u0EA1' | '\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA' | '\\u0EAB' | '\\u0EAD' | '\\u0EB0' | '\\u0EB2' | '\\u0EB3' | '\\u0EBD' | '\\u0EC0' | '\\u0EC4' | '\\u0EDC' | '\\u0EDF' | '\\u0F00' | '\\u0F40' | '\\u0F47' | '\\u0F49' | '\\u0F6C' | '\\u0F88' | '\\u0F8C' | '\\u1000' | '\\u102A' | '\\u103F' | '\\u1050' | '\\u1055' | '\\u105A' | '\\u105D' | '\\u1061' | '\\u1065' | '\\u1066' | '\\u106E' | '\\u1070' | '\\u1075' | '\\u1081' | '\\u108E' | '\\u10D0' | '\\u10FA' | '\\u10FD' | '\\u1248' | '\\u124A' | '\\u124D' | '\\u1250' | '\\u1256' | '\\u1258' | '\\u125A' | '\\u125D' | '\\u1260' | '\\u1288' | '\\u128A' | '\\u128D' | '\\u1290' | '\\u12B0' | '\\u12B2' | '\\u12B5' | '\\u12B8' | '\\u12BE' | '\\u12C0' | '\\u12C2' | '\\u12C5' | '\\u12C8' | '\\u12D6' | '\\u12D8' | '\\u1310' | '\\u1312' | '\\u1315' | '\\u1318' | '\\u135A' | '\\u1380' | '\\u138F' | '\\u13A0' | '\\u13F4' | '\\u1401' | '\\u166C' | '\\u166F' | '\\u167F' | '\\u1681' | '\\u169A' | '\\u16A0' | '\\u16EA' | '\\u1700' | '\\u170C' | '\\u170E' | '\\u1711' | '\\u1720' | '\\u1731' | '\\u1740' | '\\u1751' | '\\u1760' | '\\u176C' | '\\u176E' | '\\u1770' | '\\u1780' | '\\u17B3' | '\\u17DC' | '\\u1820' | '\\u1842' | '\\u1844' | '\\u1877' | '\\u1880' | '\\u18A8' | '\\u18AA' | '\\u18B0' | '\\u18F5' | '\\u1900' | '\\u191C' | '\\u1950' | '\\u196D' | '\\u1970' | '\\u1974' | '\\u1980' | '\\u19AB' | '\\u19C1' | '\\u19C7' | '\\u1A00' | '\\u1A16' | '\\u1A20' | '\\u1A54' | '\\u1B05' | '\\u1B33' | '\\u1B45' | '\\u1B4B' | '\\u1B83' | '\\u1BA0' | '\\u1BAE' | '\\u1BAF' | '\\u1BBA' | '\\u1BE5' | '\\u1C00' | '\\u1C23' | '\\u1C4D' | '\\u1C4F' | '\\u1C5A' | '\\u1C77' | '\\u1CE9' | '\\u1CEC' | '\\u1CEE' | '\\u1CF1' | '\\u1CF5' | '\\u1CF6' | '\\u2135' | '\\u2138' | '\\u2D30' | '\\u2D67' | '\\u2D80' | '\\u2D96' | '\\u2DA0' | '\\u2DA6' | '\\u2DA8' | '\\u2DAE' | '\\u2DB0' | '\\u2DB6' | '\\u2DB8' | '\\u2DBE' | '\\u2DC0' | '\\u2DC6' | '\\u2DC8' | '\\u2DCE' | '\\u2DD0' | '\\u2DD6' | '\\u2DD8' | '\\u2DDE' | '\\u3006' | '\\u303C' | '\\u3041' | '\\u3096' | '\\u309F' | '\\u30A1' | '\\u30FA' | '\\u30FF' | '\\u3105' | '\\u312D' | '\\u3131' | '\\u318E' | '\\u31A0' | '\\u31BA' | '\\u31F0' | '\\u31FF' | '\\u3400' | '\\u4DB5' | '\\u4E00' | '\\u9FCC' | '\\uA000' | '\\uA014' | '\\uA016' | '\\uA48C' | '\\uA4D0' | '\\uA4F7' | '\\uA500' | '\\uA60B' | '\\uA610' | '\\uA61F' | '\\uA62A' | '\\uA62B' | '\\uA66E' | '\\uA6A0' | '\\uA6E5' | '\\uA7FB' | '\\uA801' | '\\uA803' | '\\uA805' | '\\uA807' | '\\uA80A' | '\\uA80C' | '\\uA822' | '\\uA840' | '\\uA873' | '\\uA882' | '\\uA8B3' | '\\uA8F2' | '\\uA8F7' | '\\uA8FB' | '\\uA90A' | '\\uA925' | '\\uA930' | '\\uA946' | '\\uA960' | '\\uA97C' | '\\uA984' | '\\uA9B2' | '\\uAA00' | '\\uAA28' | '\\uAA40' | '\\uAA42' | '\\uAA44' | '\\uAA4B' | '\\uAA60' | '\\uAA6F' | '\\uAA71' | '\\uAA76' | '\\uAA7A' | '\\uAA80' | '\\uAAAF' | '\\uAAB1' | '\\uAAB5' | '\\uAAB6' | '\\uAAB9' | '\\uAABD' | '\\uAAC0' | '\\uAAC2' | '\\uAADB' | '\\uAADC' | '\\uAAE0' | '\\uAAEA' | '\\uAAF2' | '\\uAB01' | '\\uAB06' | '\\uAB09' | '\\uAB0E' | '\\uAB11' | '\\uAB16' | '\\uAB20' | '\\uAB26' | '\\uAB28' | '\\uAB2E' | '\\uABC0' | '\\uABE2' | '\\uAC00' | '\\uD7A3' | '\\uD7B0' | '\\uD7C6' | '\\uD7CB' | '\\uD7FB' | '\\uF900' | '\\uFA6D' | '\\uFA70' | '\\uFAD9' | '\\uFB1D' | '\\uFB1F' | '\\uFB28' | '\\uFB2A' | '\\uFB36' | '\\uFB38' | '\\uFB3C' | '\\uFB3E' | '\\uFB40' | '\\uFB41' | '\\uFB43' | '\\uFB44' | '\\uFB46' | '\\uFBB1' | '\\uFBD3' | '\\uFD3D' | '\\uFD50' | '\\uFD8F' | '\\uFD92' | '\\uFDC7' | '\\uFDF0' | '\\uFDFB' | '\\uFE70' | '\\uFE74' | '\\uFE76' | '\\uFEFC' | '\\uFF66' | '\\uFF6F' | '\\uFF71' | '\\uFF9D' | '\\uFFA0' | '\\uFFBE' | '\\uFFC2' | '\\uFFC7' | '\\uFFCA' | '\\uFFCF' | '\\uFFD2' | '\\uFFD7' | '\\uFFDA' | '\\uFFDC' | '\\u10000' | '\\u1000B' )
            {
            // InternalAdbLexer.g:185:30: ( '\\u00AA' | '\\u00BA' | '\\u01BB' | '\\u01C0' | '\\u01C3' | '\\u0294' | '\\u05D0' | '\\u05EA' | '\\u05F0' | '\\u05F2' | '\\u0620' | '\\u063F' | '\\u0641' | '\\u064A' | '\\u066E' | '\\u066F' | '\\u0671' | '\\u06D3' | '\\u06D5' | '\\u06EE' | '\\u06EF' | '\\u06FA' | '\\u06FC' | '\\u06FF' | '\\u0710' | '\\u0712' | '\\u072F' | '\\u074D' | '\\u07A5' | '\\u07B1' | '\\u07CA' | '\\u07EA' | '\\u0800' | '\\u0815' | '\\u0840' | '\\u0858' | '\\u08A0' | '\\u08A2' | '\\u08AC' | '\\u0904' | '\\u0939' | '\\u093D' | '\\u0950' | '\\u0958' | '\\u0961' | '\\u0972' | '\\u0977' | '\\u0979' | '\\u097F' | '\\u0985' | '\\u098C' | '\\u098F' | '\\u0990' | '\\u0993' | '\\u09A8' | '\\u09AA' | '\\u09B0' | '\\u09B2' | '\\u09B6' | '\\u09B9' | '\\u09BD' | '\\u09CE' | '\\u09DC' | '\\u09DD' | '\\u09DF' | '\\u09E1' | '\\u09F0' | '\\u09F1' | '\\u0A05' | '\\u0A0A' | '\\u0A0F' | '\\u0A10' | '\\u0A13' | '\\u0A28' | '\\u0A2A' | '\\u0A30' | '\\u0A32' | '\\u0A33' | '\\u0A35' | '\\u0A36' | '\\u0A38' | '\\u0A39' | '\\u0A59' | '\\u0A5C' | '\\u0A5E' | '\\u0A72' | '\\u0A74' | '\\u0A85' | '\\u0A8D' | '\\u0A8F' | '\\u0A91' | '\\u0A93' | '\\u0AA8' | '\\u0AAA' | '\\u0AB0' | '\\u0AB2' | '\\u0AB3' | '\\u0AB5' | '\\u0AB9' | '\\u0ABD' | '\\u0AD0' | '\\u0AE0' | '\\u0AE1' | '\\u0B05' | '\\u0B0C' | '\\u0B0F' | '\\u0B10' | '\\u0B13' | '\\u0B28' | '\\u0B2A' | '\\u0B30' | '\\u0B32' | '\\u0B33' | '\\u0B35' | '\\u0B39' | '\\u0B3D' | '\\u0B5C' | '\\u0B5D' | '\\u0B5F' | '\\u0B61' | '\\u0B71' | '\\u0B83' | '\\u0B85' | '\\u0B8A' | '\\u0B8E' | '\\u0B90' | '\\u0B92' | '\\u0B95' | '\\u0B99' | '\\u0B9A' | '\\u0B9C' | '\\u0B9E' | '\\u0B9F' | '\\u0BA3' | '\\u0BA4' | '\\u0BA8' | '\\u0BAA' | '\\u0BAE' | '\\u0BB9' | '\\u0BD0' | '\\u0C05' | '\\u0C0C' | '\\u0C0E' | '\\u0C10' | '\\u0C12' | '\\u0C28' | '\\u0C2A' | '\\u0C33' | '\\u0C35' | '\\u0C39' | '\\u0C3D' | '\\u0C58' | '\\u0C59' | '\\u0C60' | '\\u0C61' | '\\u0C85' | '\\u0C8C' | '\\u0C8E' | '\\u0C90' | '\\u0C92' | '\\u0CA8' | '\\u0CAA' | '\\u0CB3' | '\\u0CB5' | '\\u0CB9' | '\\u0CBD' | '\\u0CDE' | '\\u0CE0' | '\\u0CE1' | '\\u0CF1' | '\\u0CF2' | '\\u0D05' | '\\u0D0C' | '\\u0D0E' | '\\u0D10' | '\\u0D12' | '\\u0D3A' | '\\u0D3D' | '\\u0D4E' | '\\u0D60' | '\\u0D61' | '\\u0D7A' | '\\u0D7F' | '\\u0D85' | '\\u0D96' | '\\u0D9A' | '\\u0DB1' | '\\u0DB3' | '\\u0DBB' | '\\u0DBD' | '\\u0DC0' | '\\u0DC6' | '\\u0E01' | '\\u0E30' | '\\u0E32' | '\\u0E33' | '\\u0E40' | '\\u0E45' | '\\u0E81' | '\\u0E82' | '\\u0E84' | '\\u0E87' | '\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94' | '\\u0E97' | '\\u0E99' | '\\u0E9F' | '\\u0EA1' | '\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA' | '\\u0EAB' | '\\u0EAD' | '\\u0EB0' | '\\u0EB2' | '\\u0EB3' | '\\u0EBD' | '\\u0EC0' | '\\u0EC4' | '\\u0EDC' | '\\u0EDF' | '\\u0F00' | '\\u0F40' | '\\u0F47' | '\\u0F49' | '\\u0F6C' | '\\u0F88' | '\\u0F8C' | '\\u1000' | '\\u102A' | '\\u103F' | '\\u1050' | '\\u1055' | '\\u105A' | '\\u105D' | '\\u1061' | '\\u1065' | '\\u1066' | '\\u106E' | '\\u1070' | '\\u1075' | '\\u1081' | '\\u108E' | '\\u10D0' | '\\u10FA' | '\\u10FD' | '\\u1248' | '\\u124A' | '\\u124D' | '\\u1250' | '\\u1256' | '\\u1258' | '\\u125A' | '\\u125D' | '\\u1260' | '\\u1288' | '\\u128A' | '\\u128D' | '\\u1290' | '\\u12B0' | '\\u12B2' | '\\u12B5' | '\\u12B8' | '\\u12BE' | '\\u12C0' | '\\u12C2' | '\\u12C5' | '\\u12C8' | '\\u12D6' | '\\u12D8' | '\\u1310' | '\\u1312' | '\\u1315' | '\\u1318' | '\\u135A' | '\\u1380' | '\\u138F' | '\\u13A0' | '\\u13F4' | '\\u1401' | '\\u166C' | '\\u166F' | '\\u167F' | '\\u1681' | '\\u169A' | '\\u16A0' | '\\u16EA' | '\\u1700' | '\\u170C' | '\\u170E' | '\\u1711' | '\\u1720' | '\\u1731' | '\\u1740' | '\\u1751' | '\\u1760' | '\\u176C' | '\\u176E' | '\\u1770' | '\\u1780' | '\\u17B3' | '\\u17DC' | '\\u1820' | '\\u1842' | '\\u1844' | '\\u1877' | '\\u1880' | '\\u18A8' | '\\u18AA' | '\\u18B0' | '\\u18F5' | '\\u1900' | '\\u191C' | '\\u1950' | '\\u196D' | '\\u1970' | '\\u1974' | '\\u1980' | '\\u19AB' | '\\u19C1' | '\\u19C7' | '\\u1A00' | '\\u1A16' | '\\u1A20' | '\\u1A54' | '\\u1B05' | '\\u1B33' | '\\u1B45' | '\\u1B4B' | '\\u1B83' | '\\u1BA0' | '\\u1BAE' | '\\u1BAF' | '\\u1BBA' | '\\u1BE5' | '\\u1C00' | '\\u1C23' | '\\u1C4D' | '\\u1C4F' | '\\u1C5A' | '\\u1C77' | '\\u1CE9' | '\\u1CEC' | '\\u1CEE' | '\\u1CF1' | '\\u1CF5' | '\\u1CF6' | '\\u2135' | '\\u2138' | '\\u2D30' | '\\u2D67' | '\\u2D80' | '\\u2D96' | '\\u2DA0' | '\\u2DA6' | '\\u2DA8' | '\\u2DAE' | '\\u2DB0' | '\\u2DB6' | '\\u2DB8' | '\\u2DBE' | '\\u2DC0' | '\\u2DC6' | '\\u2DC8' | '\\u2DCE' | '\\u2DD0' | '\\u2DD6' | '\\u2DD8' | '\\u2DDE' | '\\u3006' | '\\u303C' | '\\u3041' | '\\u3096' | '\\u309F' | '\\u30A1' | '\\u30FA' | '\\u30FF' | '\\u3105' | '\\u312D' | '\\u3131' | '\\u318E' | '\\u31A0' | '\\u31BA' | '\\u31F0' | '\\u31FF' | '\\u3400' | '\\u4DB5' | '\\u4E00' | '\\u9FCC' | '\\uA000' | '\\uA014' | '\\uA016' | '\\uA48C' | '\\uA4D0' | '\\uA4F7' | '\\uA500' | '\\uA60B' | '\\uA610' | '\\uA61F' | '\\uA62A' | '\\uA62B' | '\\uA66E' | '\\uA6A0' | '\\uA6E5' | '\\uA7FB' | '\\uA801' | '\\uA803' | '\\uA805' | '\\uA807' | '\\uA80A' | '\\uA80C' | '\\uA822' | '\\uA840' | '\\uA873' | '\\uA882' | '\\uA8B3' | '\\uA8F2' | '\\uA8F7' | '\\uA8FB' | '\\uA90A' | '\\uA925' | '\\uA930' | '\\uA946' | '\\uA960' | '\\uA97C' | '\\uA984' | '\\uA9B2' | '\\uAA00' | '\\uAA28' | '\\uAA40' | '\\uAA42' | '\\uAA44' | '\\uAA4B' | '\\uAA60' | '\\uAA6F' | '\\uAA71' | '\\uAA76' | '\\uAA7A' | '\\uAA80' | '\\uAAAF' | '\\uAAB1' | '\\uAAB5' | '\\uAAB6' | '\\uAAB9' | '\\uAABD' | '\\uAAC0' | '\\uAAC2' | '\\uAADB' | '\\uAADC' | '\\uAAE0' | '\\uAAEA' | '\\uAAF2' | '\\uAB01' | '\\uAB06' | '\\uAB09' | '\\uAB0E' | '\\uAB11' | '\\uAB16' | '\\uAB20' | '\\uAB26' | '\\uAB28' | '\\uAB2E' | '\\uABC0' | '\\uABE2' | '\\uAC00' | '\\uD7A3' | '\\uD7B0' | '\\uD7C6' | '\\uD7CB' | '\\uD7FB' | '\\uF900' | '\\uFA6D' | '\\uFA70' | '\\uFAD9' | '\\uFB1D' | '\\uFB1F' | '\\uFB28' | '\\uFB2A' | '\\uFB36' | '\\uFB38' | '\\uFB3C' | '\\uFB3E' | '\\uFB40' | '\\uFB41' | '\\uFB43' | '\\uFB44' | '\\uFB46' | '\\uFBB1' | '\\uFBD3' | '\\uFD3D' | '\\uFD50' | '\\uFD8F' | '\\uFD92' | '\\uFDC7' | '\\uFDF0' | '\\uFDFB' | '\\uFE70' | '\\uFE74' | '\\uFE76' | '\\uFEFC' | '\\uFF66' | '\\uFF6F' | '\\uFF71' | '\\uFF9D' | '\\uFFA0' | '\\uFFBE' | '\\uFFC2' | '\\uFFC7' | '\\uFFCA' | '\\uFFCF' | '\\uFFD2' | '\\uFFD7' | '\\uFFDA' | '\\uFFDC' | '\\u10000' | '\\u1000B' )
            int alt7=519;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalAdbLexer.g:185:31: '\\u00AA'
                    {
                    match('\u00AA'); 

                    }
                    break;
                case 2 :
                    // InternalAdbLexer.g:185:40: '\\u00BA'
                    {
                    match('\u00BA'); 

                    }
                    break;
                case 3 :
                    // InternalAdbLexer.g:185:49: '\\u01BB'
                    {
                    match('\u01BB'); 

                    }
                    break;
                case 4 :
                    // InternalAdbLexer.g:185:58: '\\u01C0'
                    {
                    match('\u01C0'); 

                    }
                    break;
                case 5 :
                    // InternalAdbLexer.g:185:67: '\\u01C3'
                    {
                    match('\u01C3'); 

                    }
                    break;
                case 6 :
                    // InternalAdbLexer.g:185:76: '\\u0294'
                    {
                    match('\u0294'); 

                    }
                    break;
                case 7 :
                    // InternalAdbLexer.g:185:85: '\\u05D0'
                    {
                    match('\u05D0'); 

                    }
                    break;
                case 8 :
                    // InternalAdbLexer.g:185:94: '\\u05EA'
                    {
                    match('\u05EA'); 

                    }
                    break;
                case 9 :
                    // InternalAdbLexer.g:185:103: '\\u05F0'
                    {
                    match('\u05F0'); 

                    }
                    break;
                case 10 :
                    // InternalAdbLexer.g:185:112: '\\u05F2'
                    {
                    match('\u05F2'); 

                    }
                    break;
                case 11 :
                    // InternalAdbLexer.g:185:121: '\\u0620'
                    {
                    match('\u0620'); 

                    }
                    break;
                case 12 :
                    // InternalAdbLexer.g:185:130: '\\u063F'
                    {
                    match('\u063F'); 

                    }
                    break;
                case 13 :
                    // InternalAdbLexer.g:185:139: '\\u0641'
                    {
                    match('\u0641'); 

                    }
                    break;
                case 14 :
                    // InternalAdbLexer.g:185:148: '\\u064A'
                    {
                    match('\u064A'); 

                    }
                    break;
                case 15 :
                    // InternalAdbLexer.g:185:157: '\\u066E'
                    {
                    match('\u066E'); 

                    }
                    break;
                case 16 :
                    // InternalAdbLexer.g:185:166: '\\u066F'
                    {
                    match('\u066F'); 

                    }
                    break;
                case 17 :
                    // InternalAdbLexer.g:185:175: '\\u0671'
                    {
                    match('\u0671'); 

                    }
                    break;
                case 18 :
                    // InternalAdbLexer.g:185:184: '\\u06D3'
                    {
                    match('\u06D3'); 

                    }
                    break;
                case 19 :
                    // InternalAdbLexer.g:185:193: '\\u06D5'
                    {
                    match('\u06D5'); 

                    }
                    break;
                case 20 :
                    // InternalAdbLexer.g:185:202: '\\u06EE'
                    {
                    match('\u06EE'); 

                    }
                    break;
                case 21 :
                    // InternalAdbLexer.g:185:211: '\\u06EF'
                    {
                    match('\u06EF'); 

                    }
                    break;
                case 22 :
                    // InternalAdbLexer.g:185:220: '\\u06FA'
                    {
                    match('\u06FA'); 

                    }
                    break;
                case 23 :
                    // InternalAdbLexer.g:185:229: '\\u06FC'
                    {
                    match('\u06FC'); 

                    }
                    break;
                case 24 :
                    // InternalAdbLexer.g:185:238: '\\u06FF'
                    {
                    match('\u06FF'); 

                    }
                    break;
                case 25 :
                    // InternalAdbLexer.g:185:247: '\\u0710'
                    {
                    match('\u0710'); 

                    }
                    break;
                case 26 :
                    // InternalAdbLexer.g:185:256: '\\u0712'
                    {
                    match('\u0712'); 

                    }
                    break;
                case 27 :
                    // InternalAdbLexer.g:185:265: '\\u072F'
                    {
                    match('\u072F'); 

                    }
                    break;
                case 28 :
                    // InternalAdbLexer.g:185:274: '\\u074D'
                    {
                    match('\u074D'); 

                    }
                    break;
                case 29 :
                    // InternalAdbLexer.g:185:283: '\\u07A5'
                    {
                    match('\u07A5'); 

                    }
                    break;
                case 30 :
                    // InternalAdbLexer.g:185:292: '\\u07B1'
                    {
                    match('\u07B1'); 

                    }
                    break;
                case 31 :
                    // InternalAdbLexer.g:185:301: '\\u07CA'
                    {
                    match('\u07CA'); 

                    }
                    break;
                case 32 :
                    // InternalAdbLexer.g:185:310: '\\u07EA'
                    {
                    match('\u07EA'); 

                    }
                    break;
                case 33 :
                    // InternalAdbLexer.g:185:319: '\\u0800'
                    {
                    match('\u0800'); 

                    }
                    break;
                case 34 :
                    // InternalAdbLexer.g:185:328: '\\u0815'
                    {
                    match('\u0815'); 

                    }
                    break;
                case 35 :
                    // InternalAdbLexer.g:185:337: '\\u0840'
                    {
                    match('\u0840'); 

                    }
                    break;
                case 36 :
                    // InternalAdbLexer.g:185:346: '\\u0858'
                    {
                    match('\u0858'); 

                    }
                    break;
                case 37 :
                    // InternalAdbLexer.g:185:355: '\\u08A0'
                    {
                    match('\u08A0'); 

                    }
                    break;
                case 38 :
                    // InternalAdbLexer.g:185:364: '\\u08A2'
                    {
                    match('\u08A2'); 

                    }
                    break;
                case 39 :
                    // InternalAdbLexer.g:185:373: '\\u08AC'
                    {
                    match('\u08AC'); 

                    }
                    break;
                case 40 :
                    // InternalAdbLexer.g:185:382: '\\u0904'
                    {
                    match('\u0904'); 

                    }
                    break;
                case 41 :
                    // InternalAdbLexer.g:185:391: '\\u0939'
                    {
                    match('\u0939'); 

                    }
                    break;
                case 42 :
                    // InternalAdbLexer.g:185:400: '\\u093D'
                    {
                    match('\u093D'); 

                    }
                    break;
                case 43 :
                    // InternalAdbLexer.g:185:409: '\\u0950'
                    {
                    match('\u0950'); 

                    }
                    break;
                case 44 :
                    // InternalAdbLexer.g:185:418: '\\u0958'
                    {
                    match('\u0958'); 

                    }
                    break;
                case 45 :
                    // InternalAdbLexer.g:185:427: '\\u0961'
                    {
                    match('\u0961'); 

                    }
                    break;
                case 46 :
                    // InternalAdbLexer.g:185:436: '\\u0972'
                    {
                    match('\u0972'); 

                    }
                    break;
                case 47 :
                    // InternalAdbLexer.g:185:445: '\\u0977'
                    {
                    match('\u0977'); 

                    }
                    break;
                case 48 :
                    // InternalAdbLexer.g:185:454: '\\u0979'
                    {
                    match('\u0979'); 

                    }
                    break;
                case 49 :
                    // InternalAdbLexer.g:185:463: '\\u097F'
                    {
                    match('\u097F'); 

                    }
                    break;
                case 50 :
                    // InternalAdbLexer.g:185:472: '\\u0985'
                    {
                    match('\u0985'); 

                    }
                    break;
                case 51 :
                    // InternalAdbLexer.g:185:481: '\\u098C'
                    {
                    match('\u098C'); 

                    }
                    break;
                case 52 :
                    // InternalAdbLexer.g:185:490: '\\u098F'
                    {
                    match('\u098F'); 

                    }
                    break;
                case 53 :
                    // InternalAdbLexer.g:185:499: '\\u0990'
                    {
                    match('\u0990'); 

                    }
                    break;
                case 54 :
                    // InternalAdbLexer.g:185:508: '\\u0993'
                    {
                    match('\u0993'); 

                    }
                    break;
                case 55 :
                    // InternalAdbLexer.g:185:517: '\\u09A8'
                    {
                    match('\u09A8'); 

                    }
                    break;
                case 56 :
                    // InternalAdbLexer.g:185:526: '\\u09AA'
                    {
                    match('\u09AA'); 

                    }
                    break;
                case 57 :
                    // InternalAdbLexer.g:185:535: '\\u09B0'
                    {
                    match('\u09B0'); 

                    }
                    break;
                case 58 :
                    // InternalAdbLexer.g:185:544: '\\u09B2'
                    {
                    match('\u09B2'); 

                    }
                    break;
                case 59 :
                    // InternalAdbLexer.g:185:553: '\\u09B6'
                    {
                    match('\u09B6'); 

                    }
                    break;
                case 60 :
                    // InternalAdbLexer.g:185:562: '\\u09B9'
                    {
                    match('\u09B9'); 

                    }
                    break;
                case 61 :
                    // InternalAdbLexer.g:185:571: '\\u09BD'
                    {
                    match('\u09BD'); 

                    }
                    break;
                case 62 :
                    // InternalAdbLexer.g:185:580: '\\u09CE'
                    {
                    match('\u09CE'); 

                    }
                    break;
                case 63 :
                    // InternalAdbLexer.g:185:589: '\\u09DC'
                    {
                    match('\u09DC'); 

                    }
                    break;
                case 64 :
                    // InternalAdbLexer.g:185:598: '\\u09DD'
                    {
                    match('\u09DD'); 

                    }
                    break;
                case 65 :
                    // InternalAdbLexer.g:185:607: '\\u09DF'
                    {
                    match('\u09DF'); 

                    }
                    break;
                case 66 :
                    // InternalAdbLexer.g:185:616: '\\u09E1'
                    {
                    match('\u09E1'); 

                    }
                    break;
                case 67 :
                    // InternalAdbLexer.g:185:625: '\\u09F0'
                    {
                    match('\u09F0'); 

                    }
                    break;
                case 68 :
                    // InternalAdbLexer.g:185:634: '\\u09F1'
                    {
                    match('\u09F1'); 

                    }
                    break;
                case 69 :
                    // InternalAdbLexer.g:185:643: '\\u0A05'
                    {
                    match('\u0A05'); 

                    }
                    break;
                case 70 :
                    // InternalAdbLexer.g:185:652: '\\u0A0A'
                    {
                    match('\u0A0A'); 

                    }
                    break;
                case 71 :
                    // InternalAdbLexer.g:185:661: '\\u0A0F'
                    {
                    match('\u0A0F'); 

                    }
                    break;
                case 72 :
                    // InternalAdbLexer.g:185:670: '\\u0A10'
                    {
                    match('\u0A10'); 

                    }
                    break;
                case 73 :
                    // InternalAdbLexer.g:185:679: '\\u0A13'
                    {
                    match('\u0A13'); 

                    }
                    break;
                case 74 :
                    // InternalAdbLexer.g:185:688: '\\u0A28'
                    {
                    match('\u0A28'); 

                    }
                    break;
                case 75 :
                    // InternalAdbLexer.g:185:697: '\\u0A2A'
                    {
                    match('\u0A2A'); 

                    }
                    break;
                case 76 :
                    // InternalAdbLexer.g:185:706: '\\u0A30'
                    {
                    match('\u0A30'); 

                    }
                    break;
                case 77 :
                    // InternalAdbLexer.g:185:715: '\\u0A32'
                    {
                    match('\u0A32'); 

                    }
                    break;
                case 78 :
                    // InternalAdbLexer.g:185:724: '\\u0A33'
                    {
                    match('\u0A33'); 

                    }
                    break;
                case 79 :
                    // InternalAdbLexer.g:185:733: '\\u0A35'
                    {
                    match('\u0A35'); 

                    }
                    break;
                case 80 :
                    // InternalAdbLexer.g:185:742: '\\u0A36'
                    {
                    match('\u0A36'); 

                    }
                    break;
                case 81 :
                    // InternalAdbLexer.g:185:751: '\\u0A38'
                    {
                    match('\u0A38'); 

                    }
                    break;
                case 82 :
                    // InternalAdbLexer.g:185:760: '\\u0A39'
                    {
                    match('\u0A39'); 

                    }
                    break;
                case 83 :
                    // InternalAdbLexer.g:185:769: '\\u0A59'
                    {
                    match('\u0A59'); 

                    }
                    break;
                case 84 :
                    // InternalAdbLexer.g:185:778: '\\u0A5C'
                    {
                    match('\u0A5C'); 

                    }
                    break;
                case 85 :
                    // InternalAdbLexer.g:185:787: '\\u0A5E'
                    {
                    match('\u0A5E'); 

                    }
                    break;
                case 86 :
                    // InternalAdbLexer.g:185:796: '\\u0A72'
                    {
                    match('\u0A72'); 

                    }
                    break;
                case 87 :
                    // InternalAdbLexer.g:185:805: '\\u0A74'
                    {
                    match('\u0A74'); 

                    }
                    break;
                case 88 :
                    // InternalAdbLexer.g:185:814: '\\u0A85'
                    {
                    match('\u0A85'); 

                    }
                    break;
                case 89 :
                    // InternalAdbLexer.g:185:823: '\\u0A8D'
                    {
                    match('\u0A8D'); 

                    }
                    break;
                case 90 :
                    // InternalAdbLexer.g:185:832: '\\u0A8F'
                    {
                    match('\u0A8F'); 

                    }
                    break;
                case 91 :
                    // InternalAdbLexer.g:185:841: '\\u0A91'
                    {
                    match('\u0A91'); 

                    }
                    break;
                case 92 :
                    // InternalAdbLexer.g:185:850: '\\u0A93'
                    {
                    match('\u0A93'); 

                    }
                    break;
                case 93 :
                    // InternalAdbLexer.g:185:859: '\\u0AA8'
                    {
                    match('\u0AA8'); 

                    }
                    break;
                case 94 :
                    // InternalAdbLexer.g:185:868: '\\u0AAA'
                    {
                    match('\u0AAA'); 

                    }
                    break;
                case 95 :
                    // InternalAdbLexer.g:185:877: '\\u0AB0'
                    {
                    match('\u0AB0'); 

                    }
                    break;
                case 96 :
                    // InternalAdbLexer.g:185:886: '\\u0AB2'
                    {
                    match('\u0AB2'); 

                    }
                    break;
                case 97 :
                    // InternalAdbLexer.g:185:895: '\\u0AB3'
                    {
                    match('\u0AB3'); 

                    }
                    break;
                case 98 :
                    // InternalAdbLexer.g:185:904: '\\u0AB5'
                    {
                    match('\u0AB5'); 

                    }
                    break;
                case 99 :
                    // InternalAdbLexer.g:185:913: '\\u0AB9'
                    {
                    match('\u0AB9'); 

                    }
                    break;
                case 100 :
                    // InternalAdbLexer.g:185:922: '\\u0ABD'
                    {
                    match('\u0ABD'); 

                    }
                    break;
                case 101 :
                    // InternalAdbLexer.g:185:931: '\\u0AD0'
                    {
                    match('\u0AD0'); 

                    }
                    break;
                case 102 :
                    // InternalAdbLexer.g:185:940: '\\u0AE0'
                    {
                    match('\u0AE0'); 

                    }
                    break;
                case 103 :
                    // InternalAdbLexer.g:185:949: '\\u0AE1'
                    {
                    match('\u0AE1'); 

                    }
                    break;
                case 104 :
                    // InternalAdbLexer.g:185:958: '\\u0B05'
                    {
                    match('\u0B05'); 

                    }
                    break;
                case 105 :
                    // InternalAdbLexer.g:185:967: '\\u0B0C'
                    {
                    match('\u0B0C'); 

                    }
                    break;
                case 106 :
                    // InternalAdbLexer.g:185:976: '\\u0B0F'
                    {
                    match('\u0B0F'); 

                    }
                    break;
                case 107 :
                    // InternalAdbLexer.g:185:985: '\\u0B10'
                    {
                    match('\u0B10'); 

                    }
                    break;
                case 108 :
                    // InternalAdbLexer.g:185:994: '\\u0B13'
                    {
                    match('\u0B13'); 

                    }
                    break;
                case 109 :
                    // InternalAdbLexer.g:185:1003: '\\u0B28'
                    {
                    match('\u0B28'); 

                    }
                    break;
                case 110 :
                    // InternalAdbLexer.g:185:1012: '\\u0B2A'
                    {
                    match('\u0B2A'); 

                    }
                    break;
                case 111 :
                    // InternalAdbLexer.g:185:1021: '\\u0B30'
                    {
                    match('\u0B30'); 

                    }
                    break;
                case 112 :
                    // InternalAdbLexer.g:185:1030: '\\u0B32'
                    {
                    match('\u0B32'); 

                    }
                    break;
                case 113 :
                    // InternalAdbLexer.g:185:1039: '\\u0B33'
                    {
                    match('\u0B33'); 

                    }
                    break;
                case 114 :
                    // InternalAdbLexer.g:185:1048: '\\u0B35'
                    {
                    match('\u0B35'); 

                    }
                    break;
                case 115 :
                    // InternalAdbLexer.g:185:1057: '\\u0B39'
                    {
                    match('\u0B39'); 

                    }
                    break;
                case 116 :
                    // InternalAdbLexer.g:185:1066: '\\u0B3D'
                    {
                    match('\u0B3D'); 

                    }
                    break;
                case 117 :
                    // InternalAdbLexer.g:185:1075: '\\u0B5C'
                    {
                    match('\u0B5C'); 

                    }
                    break;
                case 118 :
                    // InternalAdbLexer.g:185:1084: '\\u0B5D'
                    {
                    match('\u0B5D'); 

                    }
                    break;
                case 119 :
                    // InternalAdbLexer.g:185:1093: '\\u0B5F'
                    {
                    match('\u0B5F'); 

                    }
                    break;
                case 120 :
                    // InternalAdbLexer.g:185:1102: '\\u0B61'
                    {
                    match('\u0B61'); 

                    }
                    break;
                case 121 :
                    // InternalAdbLexer.g:185:1111: '\\u0B71'
                    {
                    match('\u0B71'); 

                    }
                    break;
                case 122 :
                    // InternalAdbLexer.g:185:1120: '\\u0B83'
                    {
                    match('\u0B83'); 

                    }
                    break;
                case 123 :
                    // InternalAdbLexer.g:185:1129: '\\u0B85'
                    {
                    match('\u0B85'); 

                    }
                    break;
                case 124 :
                    // InternalAdbLexer.g:185:1138: '\\u0B8A'
                    {
                    match('\u0B8A'); 

                    }
                    break;
                case 125 :
                    // InternalAdbLexer.g:185:1147: '\\u0B8E'
                    {
                    match('\u0B8E'); 

                    }
                    break;
                case 126 :
                    // InternalAdbLexer.g:185:1156: '\\u0B90'
                    {
                    match('\u0B90'); 

                    }
                    break;
                case 127 :
                    // InternalAdbLexer.g:185:1165: '\\u0B92'
                    {
                    match('\u0B92'); 

                    }
                    break;
                case 128 :
                    // InternalAdbLexer.g:185:1174: '\\u0B95'
                    {
                    match('\u0B95'); 

                    }
                    break;
                case 129 :
                    // InternalAdbLexer.g:185:1183: '\\u0B99'
                    {
                    match('\u0B99'); 

                    }
                    break;
                case 130 :
                    // InternalAdbLexer.g:185:1192: '\\u0B9A'
                    {
                    match('\u0B9A'); 

                    }
                    break;
                case 131 :
                    // InternalAdbLexer.g:185:1201: '\\u0B9C'
                    {
                    match('\u0B9C'); 

                    }
                    break;
                case 132 :
                    // InternalAdbLexer.g:185:1210: '\\u0B9E'
                    {
                    match('\u0B9E'); 

                    }
                    break;
                case 133 :
                    // InternalAdbLexer.g:185:1219: '\\u0B9F'
                    {
                    match('\u0B9F'); 

                    }
                    break;
                case 134 :
                    // InternalAdbLexer.g:185:1228: '\\u0BA3'
                    {
                    match('\u0BA3'); 

                    }
                    break;
                case 135 :
                    // InternalAdbLexer.g:185:1237: '\\u0BA4'
                    {
                    match('\u0BA4'); 

                    }
                    break;
                case 136 :
                    // InternalAdbLexer.g:185:1246: '\\u0BA8'
                    {
                    match('\u0BA8'); 

                    }
                    break;
                case 137 :
                    // InternalAdbLexer.g:185:1255: '\\u0BAA'
                    {
                    match('\u0BAA'); 

                    }
                    break;
                case 138 :
                    // InternalAdbLexer.g:185:1264: '\\u0BAE'
                    {
                    match('\u0BAE'); 

                    }
                    break;
                case 139 :
                    // InternalAdbLexer.g:185:1273: '\\u0BB9'
                    {
                    match('\u0BB9'); 

                    }
                    break;
                case 140 :
                    // InternalAdbLexer.g:185:1282: '\\u0BD0'
                    {
                    match('\u0BD0'); 

                    }
                    break;
                case 141 :
                    // InternalAdbLexer.g:185:1291: '\\u0C05'
                    {
                    match('\u0C05'); 

                    }
                    break;
                case 142 :
                    // InternalAdbLexer.g:185:1300: '\\u0C0C'
                    {
                    match('\u0C0C'); 

                    }
                    break;
                case 143 :
                    // InternalAdbLexer.g:185:1309: '\\u0C0E'
                    {
                    match('\u0C0E'); 

                    }
                    break;
                case 144 :
                    // InternalAdbLexer.g:185:1318: '\\u0C10'
                    {
                    match('\u0C10'); 

                    }
                    break;
                case 145 :
                    // InternalAdbLexer.g:185:1327: '\\u0C12'
                    {
                    match('\u0C12'); 

                    }
                    break;
                case 146 :
                    // InternalAdbLexer.g:185:1336: '\\u0C28'
                    {
                    match('\u0C28'); 

                    }
                    break;
                case 147 :
                    // InternalAdbLexer.g:185:1345: '\\u0C2A'
                    {
                    match('\u0C2A'); 

                    }
                    break;
                case 148 :
                    // InternalAdbLexer.g:185:1354: '\\u0C33'
                    {
                    match('\u0C33'); 

                    }
                    break;
                case 149 :
                    // InternalAdbLexer.g:185:1363: '\\u0C35'
                    {
                    match('\u0C35'); 

                    }
                    break;
                case 150 :
                    // InternalAdbLexer.g:185:1372: '\\u0C39'
                    {
                    match('\u0C39'); 

                    }
                    break;
                case 151 :
                    // InternalAdbLexer.g:185:1381: '\\u0C3D'
                    {
                    match('\u0C3D'); 

                    }
                    break;
                case 152 :
                    // InternalAdbLexer.g:185:1390: '\\u0C58'
                    {
                    match('\u0C58'); 

                    }
                    break;
                case 153 :
                    // InternalAdbLexer.g:185:1399: '\\u0C59'
                    {
                    match('\u0C59'); 

                    }
                    break;
                case 154 :
                    // InternalAdbLexer.g:185:1408: '\\u0C60'
                    {
                    match('\u0C60'); 

                    }
                    break;
                case 155 :
                    // InternalAdbLexer.g:185:1417: '\\u0C61'
                    {
                    match('\u0C61'); 

                    }
                    break;
                case 156 :
                    // InternalAdbLexer.g:185:1426: '\\u0C85'
                    {
                    match('\u0C85'); 

                    }
                    break;
                case 157 :
                    // InternalAdbLexer.g:185:1435: '\\u0C8C'
                    {
                    match('\u0C8C'); 

                    }
                    break;
                case 158 :
                    // InternalAdbLexer.g:185:1444: '\\u0C8E'
                    {
                    match('\u0C8E'); 

                    }
                    break;
                case 159 :
                    // InternalAdbLexer.g:185:1453: '\\u0C90'
                    {
                    match('\u0C90'); 

                    }
                    break;
                case 160 :
                    // InternalAdbLexer.g:185:1462: '\\u0C92'
                    {
                    match('\u0C92'); 

                    }
                    break;
                case 161 :
                    // InternalAdbLexer.g:185:1471: '\\u0CA8'
                    {
                    match('\u0CA8'); 

                    }
                    break;
                case 162 :
                    // InternalAdbLexer.g:185:1480: '\\u0CAA'
                    {
                    match('\u0CAA'); 

                    }
                    break;
                case 163 :
                    // InternalAdbLexer.g:185:1489: '\\u0CB3'
                    {
                    match('\u0CB3'); 

                    }
                    break;
                case 164 :
                    // InternalAdbLexer.g:185:1498: '\\u0CB5'
                    {
                    match('\u0CB5'); 

                    }
                    break;
                case 165 :
                    // InternalAdbLexer.g:185:1507: '\\u0CB9'
                    {
                    match('\u0CB9'); 

                    }
                    break;
                case 166 :
                    // InternalAdbLexer.g:185:1516: '\\u0CBD'
                    {
                    match('\u0CBD'); 

                    }
                    break;
                case 167 :
                    // InternalAdbLexer.g:185:1525: '\\u0CDE'
                    {
                    match('\u0CDE'); 

                    }
                    break;
                case 168 :
                    // InternalAdbLexer.g:185:1534: '\\u0CE0'
                    {
                    match('\u0CE0'); 

                    }
                    break;
                case 169 :
                    // InternalAdbLexer.g:185:1543: '\\u0CE1'
                    {
                    match('\u0CE1'); 

                    }
                    break;
                case 170 :
                    // InternalAdbLexer.g:185:1552: '\\u0CF1'
                    {
                    match('\u0CF1'); 

                    }
                    break;
                case 171 :
                    // InternalAdbLexer.g:185:1561: '\\u0CF2'
                    {
                    match('\u0CF2'); 

                    }
                    break;
                case 172 :
                    // InternalAdbLexer.g:185:1570: '\\u0D05'
                    {
                    match('\u0D05'); 

                    }
                    break;
                case 173 :
                    // InternalAdbLexer.g:185:1579: '\\u0D0C'
                    {
                    match('\u0D0C'); 

                    }
                    break;
                case 174 :
                    // InternalAdbLexer.g:185:1588: '\\u0D0E'
                    {
                    match('\u0D0E'); 

                    }
                    break;
                case 175 :
                    // InternalAdbLexer.g:185:1597: '\\u0D10'
                    {
                    match('\u0D10'); 

                    }
                    break;
                case 176 :
                    // InternalAdbLexer.g:185:1606: '\\u0D12'
                    {
                    match('\u0D12'); 

                    }
                    break;
                case 177 :
                    // InternalAdbLexer.g:185:1615: '\\u0D3A'
                    {
                    match('\u0D3A'); 

                    }
                    break;
                case 178 :
                    // InternalAdbLexer.g:185:1624: '\\u0D3D'
                    {
                    match('\u0D3D'); 

                    }
                    break;
                case 179 :
                    // InternalAdbLexer.g:185:1633: '\\u0D4E'
                    {
                    match('\u0D4E'); 

                    }
                    break;
                case 180 :
                    // InternalAdbLexer.g:185:1642: '\\u0D60'
                    {
                    match('\u0D60'); 

                    }
                    break;
                case 181 :
                    // InternalAdbLexer.g:185:1651: '\\u0D61'
                    {
                    match('\u0D61'); 

                    }
                    break;
                case 182 :
                    // InternalAdbLexer.g:185:1660: '\\u0D7A'
                    {
                    match('\u0D7A'); 

                    }
                    break;
                case 183 :
                    // InternalAdbLexer.g:185:1669: '\\u0D7F'
                    {
                    match('\u0D7F'); 

                    }
                    break;
                case 184 :
                    // InternalAdbLexer.g:185:1678: '\\u0D85'
                    {
                    match('\u0D85'); 

                    }
                    break;
                case 185 :
                    // InternalAdbLexer.g:185:1687: '\\u0D96'
                    {
                    match('\u0D96'); 

                    }
                    break;
                case 186 :
                    // InternalAdbLexer.g:185:1696: '\\u0D9A'
                    {
                    match('\u0D9A'); 

                    }
                    break;
                case 187 :
                    // InternalAdbLexer.g:185:1705: '\\u0DB1'
                    {
                    match('\u0DB1'); 

                    }
                    break;
                case 188 :
                    // InternalAdbLexer.g:185:1714: '\\u0DB3'
                    {
                    match('\u0DB3'); 

                    }
                    break;
                case 189 :
                    // InternalAdbLexer.g:185:1723: '\\u0DBB'
                    {
                    match('\u0DBB'); 

                    }
                    break;
                case 190 :
                    // InternalAdbLexer.g:185:1732: '\\u0DBD'
                    {
                    match('\u0DBD'); 

                    }
                    break;
                case 191 :
                    // InternalAdbLexer.g:185:1741: '\\u0DC0'
                    {
                    match('\u0DC0'); 

                    }
                    break;
                case 192 :
                    // InternalAdbLexer.g:185:1750: '\\u0DC6'
                    {
                    match('\u0DC6'); 

                    }
                    break;
                case 193 :
                    // InternalAdbLexer.g:185:1759: '\\u0E01'
                    {
                    match('\u0E01'); 

                    }
                    break;
                case 194 :
                    // InternalAdbLexer.g:185:1768: '\\u0E30'
                    {
                    match('\u0E30'); 

                    }
                    break;
                case 195 :
                    // InternalAdbLexer.g:185:1777: '\\u0E32'
                    {
                    match('\u0E32'); 

                    }
                    break;
                case 196 :
                    // InternalAdbLexer.g:185:1786: '\\u0E33'
                    {
                    match('\u0E33'); 

                    }
                    break;
                case 197 :
                    // InternalAdbLexer.g:185:1795: '\\u0E40'
                    {
                    match('\u0E40'); 

                    }
                    break;
                case 198 :
                    // InternalAdbLexer.g:185:1804: '\\u0E45'
                    {
                    match('\u0E45'); 

                    }
                    break;
                case 199 :
                    // InternalAdbLexer.g:185:1813: '\\u0E81'
                    {
                    match('\u0E81'); 

                    }
                    break;
                case 200 :
                    // InternalAdbLexer.g:185:1822: '\\u0E82'
                    {
                    match('\u0E82'); 

                    }
                    break;
                case 201 :
                    // InternalAdbLexer.g:185:1831: '\\u0E84'
                    {
                    match('\u0E84'); 

                    }
                    break;
                case 202 :
                    // InternalAdbLexer.g:185:1840: '\\u0E87'
                    {
                    match('\u0E87'); 

                    }
                    break;
                case 203 :
                    // InternalAdbLexer.g:185:1849: '\\u0E88'
                    {
                    match('\u0E88'); 

                    }
                    break;
                case 204 :
                    // InternalAdbLexer.g:185:1858: '\\u0E8A'
                    {
                    match('\u0E8A'); 

                    }
                    break;
                case 205 :
                    // InternalAdbLexer.g:185:1867: '\\u0E8D'
                    {
                    match('\u0E8D'); 

                    }
                    break;
                case 206 :
                    // InternalAdbLexer.g:185:1876: '\\u0E94'
                    {
                    match('\u0E94'); 

                    }
                    break;
                case 207 :
                    // InternalAdbLexer.g:185:1885: '\\u0E97'
                    {
                    match('\u0E97'); 

                    }
                    break;
                case 208 :
                    // InternalAdbLexer.g:185:1894: '\\u0E99'
                    {
                    match('\u0E99'); 

                    }
                    break;
                case 209 :
                    // InternalAdbLexer.g:185:1903: '\\u0E9F'
                    {
                    match('\u0E9F'); 

                    }
                    break;
                case 210 :
                    // InternalAdbLexer.g:185:1912: '\\u0EA1'
                    {
                    match('\u0EA1'); 

                    }
                    break;
                case 211 :
                    // InternalAdbLexer.g:185:1921: '\\u0EA3'
                    {
                    match('\u0EA3'); 

                    }
                    break;
                case 212 :
                    // InternalAdbLexer.g:185:1930: '\\u0EA5'
                    {
                    match('\u0EA5'); 

                    }
                    break;
                case 213 :
                    // InternalAdbLexer.g:185:1939: '\\u0EA7'
                    {
                    match('\u0EA7'); 

                    }
                    break;
                case 214 :
                    // InternalAdbLexer.g:185:1948: '\\u0EAA'
                    {
                    match('\u0EAA'); 

                    }
                    break;
                case 215 :
                    // InternalAdbLexer.g:185:1957: '\\u0EAB'
                    {
                    match('\u0EAB'); 

                    }
                    break;
                case 216 :
                    // InternalAdbLexer.g:185:1966: '\\u0EAD'
                    {
                    match('\u0EAD'); 

                    }
                    break;
                case 217 :
                    // InternalAdbLexer.g:185:1975: '\\u0EB0'
                    {
                    match('\u0EB0'); 

                    }
                    break;
                case 218 :
                    // InternalAdbLexer.g:185:1984: '\\u0EB2'
                    {
                    match('\u0EB2'); 

                    }
                    break;
                case 219 :
                    // InternalAdbLexer.g:185:1993: '\\u0EB3'
                    {
                    match('\u0EB3'); 

                    }
                    break;
                case 220 :
                    // InternalAdbLexer.g:185:2002: '\\u0EBD'
                    {
                    match('\u0EBD'); 

                    }
                    break;
                case 221 :
                    // InternalAdbLexer.g:185:2011: '\\u0EC0'
                    {
                    match('\u0EC0'); 

                    }
                    break;
                case 222 :
                    // InternalAdbLexer.g:185:2020: '\\u0EC4'
                    {
                    match('\u0EC4'); 

                    }
                    break;
                case 223 :
                    // InternalAdbLexer.g:185:2029: '\\u0EDC'
                    {
                    match('\u0EDC'); 

                    }
                    break;
                case 224 :
                    // InternalAdbLexer.g:185:2038: '\\u0EDF'
                    {
                    match('\u0EDF'); 

                    }
                    break;
                case 225 :
                    // InternalAdbLexer.g:185:2047: '\\u0F00'
                    {
                    match('\u0F00'); 

                    }
                    break;
                case 226 :
                    // InternalAdbLexer.g:185:2056: '\\u0F40'
                    {
                    match('\u0F40'); 

                    }
                    break;
                case 227 :
                    // InternalAdbLexer.g:185:2065: '\\u0F47'
                    {
                    match('\u0F47'); 

                    }
                    break;
                case 228 :
                    // InternalAdbLexer.g:185:2074: '\\u0F49'
                    {
                    match('\u0F49'); 

                    }
                    break;
                case 229 :
                    // InternalAdbLexer.g:185:2083: '\\u0F6C'
                    {
                    match('\u0F6C'); 

                    }
                    break;
                case 230 :
                    // InternalAdbLexer.g:185:2092: '\\u0F88'
                    {
                    match('\u0F88'); 

                    }
                    break;
                case 231 :
                    // InternalAdbLexer.g:185:2101: '\\u0F8C'
                    {
                    match('\u0F8C'); 

                    }
                    break;
                case 232 :
                    // InternalAdbLexer.g:185:2110: '\\u1000'
                    {
                    match('\u1000'); 

                    }
                    break;
                case 233 :
                    // InternalAdbLexer.g:185:2119: '\\u102A'
                    {
                    match('\u102A'); 

                    }
                    break;
                case 234 :
                    // InternalAdbLexer.g:185:2128: '\\u103F'
                    {
                    match('\u103F'); 

                    }
                    break;
                case 235 :
                    // InternalAdbLexer.g:185:2137: '\\u1050'
                    {
                    match('\u1050'); 

                    }
                    break;
                case 236 :
                    // InternalAdbLexer.g:185:2146: '\\u1055'
                    {
                    match('\u1055'); 

                    }
                    break;
                case 237 :
                    // InternalAdbLexer.g:185:2155: '\\u105A'
                    {
                    match('\u105A'); 

                    }
                    break;
                case 238 :
                    // InternalAdbLexer.g:185:2164: '\\u105D'
                    {
                    match('\u105D'); 

                    }
                    break;
                case 239 :
                    // InternalAdbLexer.g:185:2173: '\\u1061'
                    {
                    match('\u1061'); 

                    }
                    break;
                case 240 :
                    // InternalAdbLexer.g:185:2182: '\\u1065'
                    {
                    match('\u1065'); 

                    }
                    break;
                case 241 :
                    // InternalAdbLexer.g:185:2191: '\\u1066'
                    {
                    match('\u1066'); 

                    }
                    break;
                case 242 :
                    // InternalAdbLexer.g:185:2200: '\\u106E'
                    {
                    match('\u106E'); 

                    }
                    break;
                case 243 :
                    // InternalAdbLexer.g:185:2209: '\\u1070'
                    {
                    match('\u1070'); 

                    }
                    break;
                case 244 :
                    // InternalAdbLexer.g:185:2218: '\\u1075'
                    {
                    match('\u1075'); 

                    }
                    break;
                case 245 :
                    // InternalAdbLexer.g:185:2227: '\\u1081'
                    {
                    match('\u1081'); 

                    }
                    break;
                case 246 :
                    // InternalAdbLexer.g:185:2236: '\\u108E'
                    {
                    match('\u108E'); 

                    }
                    break;
                case 247 :
                    // InternalAdbLexer.g:185:2245: '\\u10D0'
                    {
                    match('\u10D0'); 

                    }
                    break;
                case 248 :
                    // InternalAdbLexer.g:185:2254: '\\u10FA'
                    {
                    match('\u10FA'); 

                    }
                    break;
                case 249 :
                    // InternalAdbLexer.g:185:2263: '\\u10FD'
                    {
                    match('\u10FD'); 

                    }
                    break;
                case 250 :
                    // InternalAdbLexer.g:185:2272: '\\u1248'
                    {
                    match('\u1248'); 

                    }
                    break;
                case 251 :
                    // InternalAdbLexer.g:185:2281: '\\u124A'
                    {
                    match('\u124A'); 

                    }
                    break;
                case 252 :
                    // InternalAdbLexer.g:185:2290: '\\u124D'
                    {
                    match('\u124D'); 

                    }
                    break;
                case 253 :
                    // InternalAdbLexer.g:185:2299: '\\u1250'
                    {
                    match('\u1250'); 

                    }
                    break;
                case 254 :
                    // InternalAdbLexer.g:185:2308: '\\u1256'
                    {
                    match('\u1256'); 

                    }
                    break;
                case 255 :
                    // InternalAdbLexer.g:185:2317: '\\u1258'
                    {
                    match('\u1258'); 

                    }
                    break;
                case 256 :
                    // InternalAdbLexer.g:185:2326: '\\u125A'
                    {
                    match('\u125A'); 

                    }
                    break;
                case 257 :
                    // InternalAdbLexer.g:185:2335: '\\u125D'
                    {
                    match('\u125D'); 

                    }
                    break;
                case 258 :
                    // InternalAdbLexer.g:185:2344: '\\u1260'
                    {
                    match('\u1260'); 

                    }
                    break;
                case 259 :
                    // InternalAdbLexer.g:185:2353: '\\u1288'
                    {
                    match('\u1288'); 

                    }
                    break;
                case 260 :
                    // InternalAdbLexer.g:185:2362: '\\u128A'
                    {
                    match('\u128A'); 

                    }
                    break;
                case 261 :
                    // InternalAdbLexer.g:185:2371: '\\u128D'
                    {
                    match('\u128D'); 

                    }
                    break;
                case 262 :
                    // InternalAdbLexer.g:185:2380: '\\u1290'
                    {
                    match('\u1290'); 

                    }
                    break;
                case 263 :
                    // InternalAdbLexer.g:185:2389: '\\u12B0'
                    {
                    match('\u12B0'); 

                    }
                    break;
                case 264 :
                    // InternalAdbLexer.g:185:2398: '\\u12B2'
                    {
                    match('\u12B2'); 

                    }
                    break;
                case 265 :
                    // InternalAdbLexer.g:185:2407: '\\u12B5'
                    {
                    match('\u12B5'); 

                    }
                    break;
                case 266 :
                    // InternalAdbLexer.g:185:2416: '\\u12B8'
                    {
                    match('\u12B8'); 

                    }
                    break;
                case 267 :
                    // InternalAdbLexer.g:185:2425: '\\u12BE'
                    {
                    match('\u12BE'); 

                    }
                    break;
                case 268 :
                    // InternalAdbLexer.g:185:2434: '\\u12C0'
                    {
                    match('\u12C0'); 

                    }
                    break;
                case 269 :
                    // InternalAdbLexer.g:185:2443: '\\u12C2'
                    {
                    match('\u12C2'); 

                    }
                    break;
                case 270 :
                    // InternalAdbLexer.g:185:2452: '\\u12C5'
                    {
                    match('\u12C5'); 

                    }
                    break;
                case 271 :
                    // InternalAdbLexer.g:185:2461: '\\u12C8'
                    {
                    match('\u12C8'); 

                    }
                    break;
                case 272 :
                    // InternalAdbLexer.g:185:2470: '\\u12D6'
                    {
                    match('\u12D6'); 

                    }
                    break;
                case 273 :
                    // InternalAdbLexer.g:185:2479: '\\u12D8'
                    {
                    match('\u12D8'); 

                    }
                    break;
                case 274 :
                    // InternalAdbLexer.g:185:2488: '\\u1310'
                    {
                    match('\u1310'); 

                    }
                    break;
                case 275 :
                    // InternalAdbLexer.g:185:2497: '\\u1312'
                    {
                    match('\u1312'); 

                    }
                    break;
                case 276 :
                    // InternalAdbLexer.g:185:2506: '\\u1315'
                    {
                    match('\u1315'); 

                    }
                    break;
                case 277 :
                    // InternalAdbLexer.g:185:2515: '\\u1318'
                    {
                    match('\u1318'); 

                    }
                    break;
                case 278 :
                    // InternalAdbLexer.g:185:2524: '\\u135A'
                    {
                    match('\u135A'); 

                    }
                    break;
                case 279 :
                    // InternalAdbLexer.g:185:2533: '\\u1380'
                    {
                    match('\u1380'); 

                    }
                    break;
                case 280 :
                    // InternalAdbLexer.g:185:2542: '\\u138F'
                    {
                    match('\u138F'); 

                    }
                    break;
                case 281 :
                    // InternalAdbLexer.g:185:2551: '\\u13A0'
                    {
                    match('\u13A0'); 

                    }
                    break;
                case 282 :
                    // InternalAdbLexer.g:185:2560: '\\u13F4'
                    {
                    match('\u13F4'); 

                    }
                    break;
                case 283 :
                    // InternalAdbLexer.g:185:2569: '\\u1401'
                    {
                    match('\u1401'); 

                    }
                    break;
                case 284 :
                    // InternalAdbLexer.g:185:2578: '\\u166C'
                    {
                    match('\u166C'); 

                    }
                    break;
                case 285 :
                    // InternalAdbLexer.g:185:2587: '\\u166F'
                    {
                    match('\u166F'); 

                    }
                    break;
                case 286 :
                    // InternalAdbLexer.g:185:2596: '\\u167F'
                    {
                    match('\u167F'); 

                    }
                    break;
                case 287 :
                    // InternalAdbLexer.g:185:2605: '\\u1681'
                    {
                    match('\u1681'); 

                    }
                    break;
                case 288 :
                    // InternalAdbLexer.g:185:2614: '\\u169A'
                    {
                    match('\u169A'); 

                    }
                    break;
                case 289 :
                    // InternalAdbLexer.g:185:2623: '\\u16A0'
                    {
                    match('\u16A0'); 

                    }
                    break;
                case 290 :
                    // InternalAdbLexer.g:185:2632: '\\u16EA'
                    {
                    match('\u16EA'); 

                    }
                    break;
                case 291 :
                    // InternalAdbLexer.g:185:2641: '\\u1700'
                    {
                    match('\u1700'); 

                    }
                    break;
                case 292 :
                    // InternalAdbLexer.g:185:2650: '\\u170C'
                    {
                    match('\u170C'); 

                    }
                    break;
                case 293 :
                    // InternalAdbLexer.g:185:2659: '\\u170E'
                    {
                    match('\u170E'); 

                    }
                    break;
                case 294 :
                    // InternalAdbLexer.g:185:2668: '\\u1711'
                    {
                    match('\u1711'); 

                    }
                    break;
                case 295 :
                    // InternalAdbLexer.g:185:2677: '\\u1720'
                    {
                    match('\u1720'); 

                    }
                    break;
                case 296 :
                    // InternalAdbLexer.g:185:2686: '\\u1731'
                    {
                    match('\u1731'); 

                    }
                    break;
                case 297 :
                    // InternalAdbLexer.g:185:2695: '\\u1740'
                    {
                    match('\u1740'); 

                    }
                    break;
                case 298 :
                    // InternalAdbLexer.g:185:2704: '\\u1751'
                    {
                    match('\u1751'); 

                    }
                    break;
                case 299 :
                    // InternalAdbLexer.g:185:2713: '\\u1760'
                    {
                    match('\u1760'); 

                    }
                    break;
                case 300 :
                    // InternalAdbLexer.g:185:2722: '\\u176C'
                    {
                    match('\u176C'); 

                    }
                    break;
                case 301 :
                    // InternalAdbLexer.g:185:2731: '\\u176E'
                    {
                    match('\u176E'); 

                    }
                    break;
                case 302 :
                    // InternalAdbLexer.g:185:2740: '\\u1770'
                    {
                    match('\u1770'); 

                    }
                    break;
                case 303 :
                    // InternalAdbLexer.g:185:2749: '\\u1780'
                    {
                    match('\u1780'); 

                    }
                    break;
                case 304 :
                    // InternalAdbLexer.g:185:2758: '\\u17B3'
                    {
                    match('\u17B3'); 

                    }
                    break;
                case 305 :
                    // InternalAdbLexer.g:185:2767: '\\u17DC'
                    {
                    match('\u17DC'); 

                    }
                    break;
                case 306 :
                    // InternalAdbLexer.g:185:2776: '\\u1820'
                    {
                    match('\u1820'); 

                    }
                    break;
                case 307 :
                    // InternalAdbLexer.g:185:2785: '\\u1842'
                    {
                    match('\u1842'); 

                    }
                    break;
                case 308 :
                    // InternalAdbLexer.g:185:2794: '\\u1844'
                    {
                    match('\u1844'); 

                    }
                    break;
                case 309 :
                    // InternalAdbLexer.g:185:2803: '\\u1877'
                    {
                    match('\u1877'); 

                    }
                    break;
                case 310 :
                    // InternalAdbLexer.g:185:2812: '\\u1880'
                    {
                    match('\u1880'); 

                    }
                    break;
                case 311 :
                    // InternalAdbLexer.g:185:2821: '\\u18A8'
                    {
                    match('\u18A8'); 

                    }
                    break;
                case 312 :
                    // InternalAdbLexer.g:185:2830: '\\u18AA'
                    {
                    match('\u18AA'); 

                    }
                    break;
                case 313 :
                    // InternalAdbLexer.g:185:2839: '\\u18B0'
                    {
                    match('\u18B0'); 

                    }
                    break;
                case 314 :
                    // InternalAdbLexer.g:185:2848: '\\u18F5'
                    {
                    match('\u18F5'); 

                    }
                    break;
                case 315 :
                    // InternalAdbLexer.g:185:2857: '\\u1900'
                    {
                    match('\u1900'); 

                    }
                    break;
                case 316 :
                    // InternalAdbLexer.g:185:2866: '\\u191C'
                    {
                    match('\u191C'); 

                    }
                    break;
                case 317 :
                    // InternalAdbLexer.g:185:2875: '\\u1950'
                    {
                    match('\u1950'); 

                    }
                    break;
                case 318 :
                    // InternalAdbLexer.g:185:2884: '\\u196D'
                    {
                    match('\u196D'); 

                    }
                    break;
                case 319 :
                    // InternalAdbLexer.g:185:2893: '\\u1970'
                    {
                    match('\u1970'); 

                    }
                    break;
                case 320 :
                    // InternalAdbLexer.g:185:2902: '\\u1974'
                    {
                    match('\u1974'); 

                    }
                    break;
                case 321 :
                    // InternalAdbLexer.g:185:2911: '\\u1980'
                    {
                    match('\u1980'); 

                    }
                    break;
                case 322 :
                    // InternalAdbLexer.g:185:2920: '\\u19AB'
                    {
                    match('\u19AB'); 

                    }
                    break;
                case 323 :
                    // InternalAdbLexer.g:185:2929: '\\u19C1'
                    {
                    match('\u19C1'); 

                    }
                    break;
                case 324 :
                    // InternalAdbLexer.g:185:2938: '\\u19C7'
                    {
                    match('\u19C7'); 

                    }
                    break;
                case 325 :
                    // InternalAdbLexer.g:185:2947: '\\u1A00'
                    {
                    match('\u1A00'); 

                    }
                    break;
                case 326 :
                    // InternalAdbLexer.g:185:2956: '\\u1A16'
                    {
                    match('\u1A16'); 

                    }
                    break;
                case 327 :
                    // InternalAdbLexer.g:185:2965: '\\u1A20'
                    {
                    match('\u1A20'); 

                    }
                    break;
                case 328 :
                    // InternalAdbLexer.g:185:2974: '\\u1A54'
                    {
                    match('\u1A54'); 

                    }
                    break;
                case 329 :
                    // InternalAdbLexer.g:185:2983: '\\u1B05'
                    {
                    match('\u1B05'); 

                    }
                    break;
                case 330 :
                    // InternalAdbLexer.g:185:2992: '\\u1B33'
                    {
                    match('\u1B33'); 

                    }
                    break;
                case 331 :
                    // InternalAdbLexer.g:185:3001: '\\u1B45'
                    {
                    match('\u1B45'); 

                    }
                    break;
                case 332 :
                    // InternalAdbLexer.g:185:3010: '\\u1B4B'
                    {
                    match('\u1B4B'); 

                    }
                    break;
                case 333 :
                    // InternalAdbLexer.g:185:3019: '\\u1B83'
                    {
                    match('\u1B83'); 

                    }
                    break;
                case 334 :
                    // InternalAdbLexer.g:185:3028: '\\u1BA0'
                    {
                    match('\u1BA0'); 

                    }
                    break;
                case 335 :
                    // InternalAdbLexer.g:185:3037: '\\u1BAE'
                    {
                    match('\u1BAE'); 

                    }
                    break;
                case 336 :
                    // InternalAdbLexer.g:185:3046: '\\u1BAF'
                    {
                    match('\u1BAF'); 

                    }
                    break;
                case 337 :
                    // InternalAdbLexer.g:185:3055: '\\u1BBA'
                    {
                    match('\u1BBA'); 

                    }
                    break;
                case 338 :
                    // InternalAdbLexer.g:185:3064: '\\u1BE5'
                    {
                    match('\u1BE5'); 

                    }
                    break;
                case 339 :
                    // InternalAdbLexer.g:185:3073: '\\u1C00'
                    {
                    match('\u1C00'); 

                    }
                    break;
                case 340 :
                    // InternalAdbLexer.g:185:3082: '\\u1C23'
                    {
                    match('\u1C23'); 

                    }
                    break;
                case 341 :
                    // InternalAdbLexer.g:185:3091: '\\u1C4D'
                    {
                    match('\u1C4D'); 

                    }
                    break;
                case 342 :
                    // InternalAdbLexer.g:185:3100: '\\u1C4F'
                    {
                    match('\u1C4F'); 

                    }
                    break;
                case 343 :
                    // InternalAdbLexer.g:185:3109: '\\u1C5A'
                    {
                    match('\u1C5A'); 

                    }
                    break;
                case 344 :
                    // InternalAdbLexer.g:185:3118: '\\u1C77'
                    {
                    match('\u1C77'); 

                    }
                    break;
                case 345 :
                    // InternalAdbLexer.g:185:3127: '\\u1CE9'
                    {
                    match('\u1CE9'); 

                    }
                    break;
                case 346 :
                    // InternalAdbLexer.g:185:3136: '\\u1CEC'
                    {
                    match('\u1CEC'); 

                    }
                    break;
                case 347 :
                    // InternalAdbLexer.g:185:3145: '\\u1CEE'
                    {
                    match('\u1CEE'); 

                    }
                    break;
                case 348 :
                    // InternalAdbLexer.g:185:3154: '\\u1CF1'
                    {
                    match('\u1CF1'); 

                    }
                    break;
                case 349 :
                    // InternalAdbLexer.g:185:3163: '\\u1CF5'
                    {
                    match('\u1CF5'); 

                    }
                    break;
                case 350 :
                    // InternalAdbLexer.g:185:3172: '\\u1CF6'
                    {
                    match('\u1CF6'); 

                    }
                    break;
                case 351 :
                    // InternalAdbLexer.g:185:3181: '\\u2135'
                    {
                    match('\u2135'); 

                    }
                    break;
                case 352 :
                    // InternalAdbLexer.g:185:3190: '\\u2138'
                    {
                    match('\u2138'); 

                    }
                    break;
                case 353 :
                    // InternalAdbLexer.g:185:3199: '\\u2D30'
                    {
                    match('\u2D30'); 

                    }
                    break;
                case 354 :
                    // InternalAdbLexer.g:185:3208: '\\u2D67'
                    {
                    match('\u2D67'); 

                    }
                    break;
                case 355 :
                    // InternalAdbLexer.g:185:3217: '\\u2D80'
                    {
                    match('\u2D80'); 

                    }
                    break;
                case 356 :
                    // InternalAdbLexer.g:185:3226: '\\u2D96'
                    {
                    match('\u2D96'); 

                    }
                    break;
                case 357 :
                    // InternalAdbLexer.g:185:3235: '\\u2DA0'
                    {
                    match('\u2DA0'); 

                    }
                    break;
                case 358 :
                    // InternalAdbLexer.g:185:3244: '\\u2DA6'
                    {
                    match('\u2DA6'); 

                    }
                    break;
                case 359 :
                    // InternalAdbLexer.g:185:3253: '\\u2DA8'
                    {
                    match('\u2DA8'); 

                    }
                    break;
                case 360 :
                    // InternalAdbLexer.g:185:3262: '\\u2DAE'
                    {
                    match('\u2DAE'); 

                    }
                    break;
                case 361 :
                    // InternalAdbLexer.g:185:3271: '\\u2DB0'
                    {
                    match('\u2DB0'); 

                    }
                    break;
                case 362 :
                    // InternalAdbLexer.g:185:3280: '\\u2DB6'
                    {
                    match('\u2DB6'); 

                    }
                    break;
                case 363 :
                    // InternalAdbLexer.g:185:3289: '\\u2DB8'
                    {
                    match('\u2DB8'); 

                    }
                    break;
                case 364 :
                    // InternalAdbLexer.g:185:3298: '\\u2DBE'
                    {
                    match('\u2DBE'); 

                    }
                    break;
                case 365 :
                    // InternalAdbLexer.g:185:3307: '\\u2DC0'
                    {
                    match('\u2DC0'); 

                    }
                    break;
                case 366 :
                    // InternalAdbLexer.g:185:3316: '\\u2DC6'
                    {
                    match('\u2DC6'); 

                    }
                    break;
                case 367 :
                    // InternalAdbLexer.g:185:3325: '\\u2DC8'
                    {
                    match('\u2DC8'); 

                    }
                    break;
                case 368 :
                    // InternalAdbLexer.g:185:3334: '\\u2DCE'
                    {
                    match('\u2DCE'); 

                    }
                    break;
                case 369 :
                    // InternalAdbLexer.g:185:3343: '\\u2DD0'
                    {
                    match('\u2DD0'); 

                    }
                    break;
                case 370 :
                    // InternalAdbLexer.g:185:3352: '\\u2DD6'
                    {
                    match('\u2DD6'); 

                    }
                    break;
                case 371 :
                    // InternalAdbLexer.g:185:3361: '\\u2DD8'
                    {
                    match('\u2DD8'); 

                    }
                    break;
                case 372 :
                    // InternalAdbLexer.g:185:3370: '\\u2DDE'
                    {
                    match('\u2DDE'); 

                    }
                    break;
                case 373 :
                    // InternalAdbLexer.g:185:3379: '\\u3006'
                    {
                    match('\u3006'); 

                    }
                    break;
                case 374 :
                    // InternalAdbLexer.g:185:3388: '\\u303C'
                    {
                    match('\u303C'); 

                    }
                    break;
                case 375 :
                    // InternalAdbLexer.g:185:3397: '\\u3041'
                    {
                    match('\u3041'); 

                    }
                    break;
                case 376 :
                    // InternalAdbLexer.g:185:3406: '\\u3096'
                    {
                    match('\u3096'); 

                    }
                    break;
                case 377 :
                    // InternalAdbLexer.g:185:3415: '\\u309F'
                    {
                    match('\u309F'); 

                    }
                    break;
                case 378 :
                    // InternalAdbLexer.g:185:3424: '\\u30A1'
                    {
                    match('\u30A1'); 

                    }
                    break;
                case 379 :
                    // InternalAdbLexer.g:185:3433: '\\u30FA'
                    {
                    match('\u30FA'); 

                    }
                    break;
                case 380 :
                    // InternalAdbLexer.g:185:3442: '\\u30FF'
                    {
                    match('\u30FF'); 

                    }
                    break;
                case 381 :
                    // InternalAdbLexer.g:185:3451: '\\u3105'
                    {
                    match('\u3105'); 

                    }
                    break;
                case 382 :
                    // InternalAdbLexer.g:185:3460: '\\u312D'
                    {
                    match('\u312D'); 

                    }
                    break;
                case 383 :
                    // InternalAdbLexer.g:185:3469: '\\u3131'
                    {
                    match('\u3131'); 

                    }
                    break;
                case 384 :
                    // InternalAdbLexer.g:185:3478: '\\u318E'
                    {
                    match('\u318E'); 

                    }
                    break;
                case 385 :
                    // InternalAdbLexer.g:185:3487: '\\u31A0'
                    {
                    match('\u31A0'); 

                    }
                    break;
                case 386 :
                    // InternalAdbLexer.g:185:3496: '\\u31BA'
                    {
                    match('\u31BA'); 

                    }
                    break;
                case 387 :
                    // InternalAdbLexer.g:185:3505: '\\u31F0'
                    {
                    match('\u31F0'); 

                    }
                    break;
                case 388 :
                    // InternalAdbLexer.g:185:3514: '\\u31FF'
                    {
                    match('\u31FF'); 

                    }
                    break;
                case 389 :
                    // InternalAdbLexer.g:185:3523: '\\u3400'
                    {
                    match('\u3400'); 

                    }
                    break;
                case 390 :
                    // InternalAdbLexer.g:185:3532: '\\u4DB5'
                    {
                    match('\u4DB5'); 

                    }
                    break;
                case 391 :
                    // InternalAdbLexer.g:185:3541: '\\u4E00'
                    {
                    match('\u4E00'); 

                    }
                    break;
                case 392 :
                    // InternalAdbLexer.g:185:3550: '\\u9FCC'
                    {
                    match('\u9FCC'); 

                    }
                    break;
                case 393 :
                    // InternalAdbLexer.g:185:3559: '\\uA000'
                    {
                    match('\uA000'); 

                    }
                    break;
                case 394 :
                    // InternalAdbLexer.g:185:3568: '\\uA014'
                    {
                    match('\uA014'); 

                    }
                    break;
                case 395 :
                    // InternalAdbLexer.g:185:3577: '\\uA016'
                    {
                    match('\uA016'); 

                    }
                    break;
                case 396 :
                    // InternalAdbLexer.g:185:3586: '\\uA48C'
                    {
                    match('\uA48C'); 

                    }
                    break;
                case 397 :
                    // InternalAdbLexer.g:185:3595: '\\uA4D0'
                    {
                    match('\uA4D0'); 

                    }
                    break;
                case 398 :
                    // InternalAdbLexer.g:185:3604: '\\uA4F7'
                    {
                    match('\uA4F7'); 

                    }
                    break;
                case 399 :
                    // InternalAdbLexer.g:185:3613: '\\uA500'
                    {
                    match('\uA500'); 

                    }
                    break;
                case 400 :
                    // InternalAdbLexer.g:185:3622: '\\uA60B'
                    {
                    match('\uA60B'); 

                    }
                    break;
                case 401 :
                    // InternalAdbLexer.g:185:3631: '\\uA610'
                    {
                    match('\uA610'); 

                    }
                    break;
                case 402 :
                    // InternalAdbLexer.g:185:3640: '\\uA61F'
                    {
                    match('\uA61F'); 

                    }
                    break;
                case 403 :
                    // InternalAdbLexer.g:185:3649: '\\uA62A'
                    {
                    match('\uA62A'); 

                    }
                    break;
                case 404 :
                    // InternalAdbLexer.g:185:3658: '\\uA62B'
                    {
                    match('\uA62B'); 

                    }
                    break;
                case 405 :
                    // InternalAdbLexer.g:185:3667: '\\uA66E'
                    {
                    match('\uA66E'); 

                    }
                    break;
                case 406 :
                    // InternalAdbLexer.g:185:3676: '\\uA6A0'
                    {
                    match('\uA6A0'); 

                    }
                    break;
                case 407 :
                    // InternalAdbLexer.g:185:3685: '\\uA6E5'
                    {
                    match('\uA6E5'); 

                    }
                    break;
                case 408 :
                    // InternalAdbLexer.g:185:3694: '\\uA7FB'
                    {
                    match('\uA7FB'); 

                    }
                    break;
                case 409 :
                    // InternalAdbLexer.g:185:3703: '\\uA801'
                    {
                    match('\uA801'); 

                    }
                    break;
                case 410 :
                    // InternalAdbLexer.g:185:3712: '\\uA803'
                    {
                    match('\uA803'); 

                    }
                    break;
                case 411 :
                    // InternalAdbLexer.g:185:3721: '\\uA805'
                    {
                    match('\uA805'); 

                    }
                    break;
                case 412 :
                    // InternalAdbLexer.g:185:3730: '\\uA807'
                    {
                    match('\uA807'); 

                    }
                    break;
                case 413 :
                    // InternalAdbLexer.g:185:3739: '\\uA80A'
                    {
                    match('\uA80A'); 

                    }
                    break;
                case 414 :
                    // InternalAdbLexer.g:185:3748: '\\uA80C'
                    {
                    match('\uA80C'); 

                    }
                    break;
                case 415 :
                    // InternalAdbLexer.g:185:3757: '\\uA822'
                    {
                    match('\uA822'); 

                    }
                    break;
                case 416 :
                    // InternalAdbLexer.g:185:3766: '\\uA840'
                    {
                    match('\uA840'); 

                    }
                    break;
                case 417 :
                    // InternalAdbLexer.g:185:3775: '\\uA873'
                    {
                    match('\uA873'); 

                    }
                    break;
                case 418 :
                    // InternalAdbLexer.g:185:3784: '\\uA882'
                    {
                    match('\uA882'); 

                    }
                    break;
                case 419 :
                    // InternalAdbLexer.g:185:3793: '\\uA8B3'
                    {
                    match('\uA8B3'); 

                    }
                    break;
                case 420 :
                    // InternalAdbLexer.g:185:3802: '\\uA8F2'
                    {
                    match('\uA8F2'); 

                    }
                    break;
                case 421 :
                    // InternalAdbLexer.g:185:3811: '\\uA8F7'
                    {
                    match('\uA8F7'); 

                    }
                    break;
                case 422 :
                    // InternalAdbLexer.g:185:3820: '\\uA8FB'
                    {
                    match('\uA8FB'); 

                    }
                    break;
                case 423 :
                    // InternalAdbLexer.g:185:3829: '\\uA90A'
                    {
                    match('\uA90A'); 

                    }
                    break;
                case 424 :
                    // InternalAdbLexer.g:185:3838: '\\uA925'
                    {
                    match('\uA925'); 

                    }
                    break;
                case 425 :
                    // InternalAdbLexer.g:185:3847: '\\uA930'
                    {
                    match('\uA930'); 

                    }
                    break;
                case 426 :
                    // InternalAdbLexer.g:185:3856: '\\uA946'
                    {
                    match('\uA946'); 

                    }
                    break;
                case 427 :
                    // InternalAdbLexer.g:185:3865: '\\uA960'
                    {
                    match('\uA960'); 

                    }
                    break;
                case 428 :
                    // InternalAdbLexer.g:185:3874: '\\uA97C'
                    {
                    match('\uA97C'); 

                    }
                    break;
                case 429 :
                    // InternalAdbLexer.g:185:3883: '\\uA984'
                    {
                    match('\uA984'); 

                    }
                    break;
                case 430 :
                    // InternalAdbLexer.g:185:3892: '\\uA9B2'
                    {
                    match('\uA9B2'); 

                    }
                    break;
                case 431 :
                    // InternalAdbLexer.g:185:3901: '\\uAA00'
                    {
                    match('\uAA00'); 

                    }
                    break;
                case 432 :
                    // InternalAdbLexer.g:185:3910: '\\uAA28'
                    {
                    match('\uAA28'); 

                    }
                    break;
                case 433 :
                    // InternalAdbLexer.g:185:3919: '\\uAA40'
                    {
                    match('\uAA40'); 

                    }
                    break;
                case 434 :
                    // InternalAdbLexer.g:185:3928: '\\uAA42'
                    {
                    match('\uAA42'); 

                    }
                    break;
                case 435 :
                    // InternalAdbLexer.g:185:3937: '\\uAA44'
                    {
                    match('\uAA44'); 

                    }
                    break;
                case 436 :
                    // InternalAdbLexer.g:185:3946: '\\uAA4B'
                    {
                    match('\uAA4B'); 

                    }
                    break;
                case 437 :
                    // InternalAdbLexer.g:185:3955: '\\uAA60'
                    {
                    match('\uAA60'); 

                    }
                    break;
                case 438 :
                    // InternalAdbLexer.g:185:3964: '\\uAA6F'
                    {
                    match('\uAA6F'); 

                    }
                    break;
                case 439 :
                    // InternalAdbLexer.g:185:3973: '\\uAA71'
                    {
                    match('\uAA71'); 

                    }
                    break;
                case 440 :
                    // InternalAdbLexer.g:185:3982: '\\uAA76'
                    {
                    match('\uAA76'); 

                    }
                    break;
                case 441 :
                    // InternalAdbLexer.g:185:3991: '\\uAA7A'
                    {
                    match('\uAA7A'); 

                    }
                    break;
                case 442 :
                    // InternalAdbLexer.g:185:4000: '\\uAA80'
                    {
                    match('\uAA80'); 

                    }
                    break;
                case 443 :
                    // InternalAdbLexer.g:185:4009: '\\uAAAF'
                    {
                    match('\uAAAF'); 

                    }
                    break;
                case 444 :
                    // InternalAdbLexer.g:185:4018: '\\uAAB1'
                    {
                    match('\uAAB1'); 

                    }
                    break;
                case 445 :
                    // InternalAdbLexer.g:185:4027: '\\uAAB5'
                    {
                    match('\uAAB5'); 

                    }
                    break;
                case 446 :
                    // InternalAdbLexer.g:185:4036: '\\uAAB6'
                    {
                    match('\uAAB6'); 

                    }
                    break;
                case 447 :
                    // InternalAdbLexer.g:185:4045: '\\uAAB9'
                    {
                    match('\uAAB9'); 

                    }
                    break;
                case 448 :
                    // InternalAdbLexer.g:185:4054: '\\uAABD'
                    {
                    match('\uAABD'); 

                    }
                    break;
                case 449 :
                    // InternalAdbLexer.g:185:4063: '\\uAAC0'
                    {
                    match('\uAAC0'); 

                    }
                    break;
                case 450 :
                    // InternalAdbLexer.g:185:4072: '\\uAAC2'
                    {
                    match('\uAAC2'); 

                    }
                    break;
                case 451 :
                    // InternalAdbLexer.g:185:4081: '\\uAADB'
                    {
                    match('\uAADB'); 

                    }
                    break;
                case 452 :
                    // InternalAdbLexer.g:185:4090: '\\uAADC'
                    {
                    match('\uAADC'); 

                    }
                    break;
                case 453 :
                    // InternalAdbLexer.g:185:4099: '\\uAAE0'
                    {
                    match('\uAAE0'); 

                    }
                    break;
                case 454 :
                    // InternalAdbLexer.g:185:4108: '\\uAAEA'
                    {
                    match('\uAAEA'); 

                    }
                    break;
                case 455 :
                    // InternalAdbLexer.g:185:4117: '\\uAAF2'
                    {
                    match('\uAAF2'); 

                    }
                    break;
                case 456 :
                    // InternalAdbLexer.g:185:4126: '\\uAB01'
                    {
                    match('\uAB01'); 

                    }
                    break;
                case 457 :
                    // InternalAdbLexer.g:185:4135: '\\uAB06'
                    {
                    match('\uAB06'); 

                    }
                    break;
                case 458 :
                    // InternalAdbLexer.g:185:4144: '\\uAB09'
                    {
                    match('\uAB09'); 

                    }
                    break;
                case 459 :
                    // InternalAdbLexer.g:185:4153: '\\uAB0E'
                    {
                    match('\uAB0E'); 

                    }
                    break;
                case 460 :
                    // InternalAdbLexer.g:185:4162: '\\uAB11'
                    {
                    match('\uAB11'); 

                    }
                    break;
                case 461 :
                    // InternalAdbLexer.g:185:4171: '\\uAB16'
                    {
                    match('\uAB16'); 

                    }
                    break;
                case 462 :
                    // InternalAdbLexer.g:185:4180: '\\uAB20'
                    {
                    match('\uAB20'); 

                    }
                    break;
                case 463 :
                    // InternalAdbLexer.g:185:4189: '\\uAB26'
                    {
                    match('\uAB26'); 

                    }
                    break;
                case 464 :
                    // InternalAdbLexer.g:185:4198: '\\uAB28'
                    {
                    match('\uAB28'); 

                    }
                    break;
                case 465 :
                    // InternalAdbLexer.g:185:4207: '\\uAB2E'
                    {
                    match('\uAB2E'); 

                    }
                    break;
                case 466 :
                    // InternalAdbLexer.g:185:4216: '\\uABC0'
                    {
                    match('\uABC0'); 

                    }
                    break;
                case 467 :
                    // InternalAdbLexer.g:185:4225: '\\uABE2'
                    {
                    match('\uABE2'); 

                    }
                    break;
                case 468 :
                    // InternalAdbLexer.g:185:4234: '\\uAC00'
                    {
                    match('\uAC00'); 

                    }
                    break;
                case 469 :
                    // InternalAdbLexer.g:185:4243: '\\uD7A3'
                    {
                    match('\uD7A3'); 

                    }
                    break;
                case 470 :
                    // InternalAdbLexer.g:185:4252: '\\uD7B0'
                    {
                    match('\uD7B0'); 

                    }
                    break;
                case 471 :
                    // InternalAdbLexer.g:185:4261: '\\uD7C6'
                    {
                    match('\uD7C6'); 

                    }
                    break;
                case 472 :
                    // InternalAdbLexer.g:185:4270: '\\uD7CB'
                    {
                    match('\uD7CB'); 

                    }
                    break;
                case 473 :
                    // InternalAdbLexer.g:185:4279: '\\uD7FB'
                    {
                    match('\uD7FB'); 

                    }
                    break;
                case 474 :
                    // InternalAdbLexer.g:185:4288: '\\uF900'
                    {
                    match('\uF900'); 

                    }
                    break;
                case 475 :
                    // InternalAdbLexer.g:185:4297: '\\uFA6D'
                    {
                    match('\uFA6D'); 

                    }
                    break;
                case 476 :
                    // InternalAdbLexer.g:185:4306: '\\uFA70'
                    {
                    match('\uFA70'); 

                    }
                    break;
                case 477 :
                    // InternalAdbLexer.g:185:4315: '\\uFAD9'
                    {
                    match('\uFAD9'); 

                    }
                    break;
                case 478 :
                    // InternalAdbLexer.g:185:4324: '\\uFB1D'
                    {
                    match('\uFB1D'); 

                    }
                    break;
                case 479 :
                    // InternalAdbLexer.g:185:4333: '\\uFB1F'
                    {
                    match('\uFB1F'); 

                    }
                    break;
                case 480 :
                    // InternalAdbLexer.g:185:4342: '\\uFB28'
                    {
                    match('\uFB28'); 

                    }
                    break;
                case 481 :
                    // InternalAdbLexer.g:185:4351: '\\uFB2A'
                    {
                    match('\uFB2A'); 

                    }
                    break;
                case 482 :
                    // InternalAdbLexer.g:185:4360: '\\uFB36'
                    {
                    match('\uFB36'); 

                    }
                    break;
                case 483 :
                    // InternalAdbLexer.g:185:4369: '\\uFB38'
                    {
                    match('\uFB38'); 

                    }
                    break;
                case 484 :
                    // InternalAdbLexer.g:185:4378: '\\uFB3C'
                    {
                    match('\uFB3C'); 

                    }
                    break;
                case 485 :
                    // InternalAdbLexer.g:185:4387: '\\uFB3E'
                    {
                    match('\uFB3E'); 

                    }
                    break;
                case 486 :
                    // InternalAdbLexer.g:185:4396: '\\uFB40'
                    {
                    match('\uFB40'); 

                    }
                    break;
                case 487 :
                    // InternalAdbLexer.g:185:4405: '\\uFB41'
                    {
                    match('\uFB41'); 

                    }
                    break;
                case 488 :
                    // InternalAdbLexer.g:185:4414: '\\uFB43'
                    {
                    match('\uFB43'); 

                    }
                    break;
                case 489 :
                    // InternalAdbLexer.g:185:4423: '\\uFB44'
                    {
                    match('\uFB44'); 

                    }
                    break;
                case 490 :
                    // InternalAdbLexer.g:185:4432: '\\uFB46'
                    {
                    match('\uFB46'); 

                    }
                    break;
                case 491 :
                    // InternalAdbLexer.g:185:4441: '\\uFBB1'
                    {
                    match('\uFBB1'); 

                    }
                    break;
                case 492 :
                    // InternalAdbLexer.g:185:4450: '\\uFBD3'
                    {
                    match('\uFBD3'); 

                    }
                    break;
                case 493 :
                    // InternalAdbLexer.g:185:4459: '\\uFD3D'
                    {
                    match('\uFD3D'); 

                    }
                    break;
                case 494 :
                    // InternalAdbLexer.g:185:4468: '\\uFD50'
                    {
                    match('\uFD50'); 

                    }
                    break;
                case 495 :
                    // InternalAdbLexer.g:185:4477: '\\uFD8F'
                    {
                    match('\uFD8F'); 

                    }
                    break;
                case 496 :
                    // InternalAdbLexer.g:185:4486: '\\uFD92'
                    {
                    match('\uFD92'); 

                    }
                    break;
                case 497 :
                    // InternalAdbLexer.g:185:4495: '\\uFDC7'
                    {
                    match('\uFDC7'); 

                    }
                    break;
                case 498 :
                    // InternalAdbLexer.g:185:4504: '\\uFDF0'
                    {
                    match('\uFDF0'); 

                    }
                    break;
                case 499 :
                    // InternalAdbLexer.g:185:4513: '\\uFDFB'
                    {
                    match('\uFDFB'); 

                    }
                    break;
                case 500 :
                    // InternalAdbLexer.g:185:4522: '\\uFE70'
                    {
                    match('\uFE70'); 

                    }
                    break;
                case 501 :
                    // InternalAdbLexer.g:185:4531: '\\uFE74'
                    {
                    match('\uFE74'); 

                    }
                    break;
                case 502 :
                    // InternalAdbLexer.g:185:4540: '\\uFE76'
                    {
                    match('\uFE76'); 

                    }
                    break;
                case 503 :
                    // InternalAdbLexer.g:185:4549: '\\uFEFC'
                    {
                    match('\uFEFC'); 

                    }
                    break;
                case 504 :
                    // InternalAdbLexer.g:185:4558: '\\uFF66'
                    {
                    match('\uFF66'); 

                    }
                    break;
                case 505 :
                    // InternalAdbLexer.g:185:4567: '\\uFF6F'
                    {
                    match('\uFF6F'); 

                    }
                    break;
                case 506 :
                    // InternalAdbLexer.g:185:4576: '\\uFF71'
                    {
                    match('\uFF71'); 

                    }
                    break;
                case 507 :
                    // InternalAdbLexer.g:185:4585: '\\uFF9D'
                    {
                    match('\uFF9D'); 

                    }
                    break;
                case 508 :
                    // InternalAdbLexer.g:185:4594: '\\uFFA0'
                    {
                    match('\uFFA0'); 

                    }
                    break;
                case 509 :
                    // InternalAdbLexer.g:185:4603: '\\uFFBE'
                    {
                    match('\uFFBE'); 

                    }
                    break;
                case 510 :
                    // InternalAdbLexer.g:185:4612: '\\uFFC2'
                    {
                    match('\uFFC2'); 

                    }
                    break;
                case 511 :
                    // InternalAdbLexer.g:185:4621: '\\uFFC7'
                    {
                    match('\uFFC7'); 

                    }
                    break;
                case 512 :
                    // InternalAdbLexer.g:185:4630: '\\uFFCA'
                    {
                    match('\uFFCA'); 

                    }
                    break;
                case 513 :
                    // InternalAdbLexer.g:185:4639: '\\uFFCF'
                    {
                    match('\uFFCF'); 

                    }
                    break;
                case 514 :
                    // InternalAdbLexer.g:185:4648: '\\uFFD2'
                    {
                    match('\uFFD2'); 

                    }
                    break;
                case 515 :
                    // InternalAdbLexer.g:185:4657: '\\uFFD7'
                    {
                    match('\uFFD7'); 

                    }
                    break;
                case 516 :
                    // InternalAdbLexer.g:185:4666: '\\uFFDA'
                    {
                    match('\uFFDA'); 

                    }
                    break;
                case 517 :
                    // InternalAdbLexer.g:185:4675: '\\uFFDC'
                    {
                    match('\uFFDC'); 

                    }
                    break;
                case 518 :
                    // InternalAdbLexer.g:185:4684: '\\u10000'
                    {
                    match("\u10000"); 


                    }
                    break;
                case 519 :
                    // InternalAdbLexer.g:185:4694: '\\u1000B'
                    {
                    match("\u1000B"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER_OTHER"

    // $ANTLR start "RULE_NUMBER_LETTER"
    public final void mRULE_NUMBER_LETTER() throws RecognitionException {
        try {
            // InternalAdbLexer.g:187:29: ( ( '\\u16EE' .. '\\u16F0' | '\\u2160' .. '\\u2182' | '\\u2185' .. '\\u2188' | '\\u3007' | '\\u3021' .. '\\u3029' | '\\u3038' .. '\\u303A' | '\\uA6E6' .. '\\uA6EF' ) )
            // InternalAdbLexer.g:187:31: ( '\\u16EE' .. '\\u16F0' | '\\u2160' .. '\\u2182' | '\\u2185' .. '\\u2188' | '\\u3007' | '\\u3021' .. '\\u3029' | '\\u3038' .. '\\u303A' | '\\uA6E6' .. '\\uA6EF' )
            {
            if ( (input.LA(1)>='\u16EE' && input.LA(1)<='\u16F0')||(input.LA(1)>='\u2160' && input.LA(1)<='\u2182')||(input.LA(1)>='\u2185' && input.LA(1)<='\u2188')||input.LA(1)=='\u3007'||(input.LA(1)>='\u3021' && input.LA(1)<='\u3029')||(input.LA(1)>='\u3038' && input.LA(1)<='\u303A')||(input.LA(1)>='\uA6E6' && input.LA(1)<='\uA6EF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER_LETTER"

    // $ANTLR start "RULE_IDENTIFIER_EXTEND"
    public final void mRULE_IDENTIFIER_EXTEND() throws RecognitionException {
        try {
            // InternalAdbLexer.g:189:33: ( ( RULE_MARKNON_SPACING | RULE_MARKSPACING_COMBINING | RULE_NUMBER_DECIMAL | RULE_PUNCTUATION_CONNECTOR | RULE_OTHER_FORMAT ) )
            // InternalAdbLexer.g:189:35: ( RULE_MARKNON_SPACING | RULE_MARKSPACING_COMBINING | RULE_NUMBER_DECIMAL | RULE_PUNCTUATION_CONNECTOR | RULE_OTHER_FORMAT )
            {
            // InternalAdbLexer.g:189:35: ( RULE_MARKNON_SPACING | RULE_MARKSPACING_COMBINING | RULE_NUMBER_DECIMAL | RULE_PUNCTUATION_CONNECTOR | RULE_OTHER_FORMAT )
            int alt8=5;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>='\u0300' && LA8_0<='\u036F')||(LA8_0>='\u0483' && LA8_0<='\u0487')||(LA8_0>='\u0591' && LA8_0<='\u05BD')||LA8_0=='\u05BF'||(LA8_0>='\u05C1' && LA8_0<='\u05C2')||(LA8_0>='\u05C4' && LA8_0<='\u05C5')||LA8_0=='\u05C7'||(LA8_0>='\u0610' && LA8_0<='\u061A')||(LA8_0>='\u064B' && LA8_0<='\u065F')||LA8_0=='\u0670'||(LA8_0>='\u06D6' && LA8_0<='\u06DC')||(LA8_0>='\u06DF' && LA8_0<='\u06E4')||(LA8_0>='\u06E7' && LA8_0<='\u06E8')||(LA8_0>='\u06EA' && LA8_0<='\u06ED')||LA8_0=='\u0711'||(LA8_0>='\u0730' && LA8_0<='\u074A')||(LA8_0>='\u07A6' && LA8_0<='\u07B0')||(LA8_0>='\u07EB' && LA8_0<='\u07F3')||(LA8_0>='\u0816' && LA8_0<='\u0819')||(LA8_0>='\u081B' && LA8_0<='\u0823')||(LA8_0>='\u0825' && LA8_0<='\u0827')||(LA8_0>='\u0829' && LA8_0<='\u082D')||(LA8_0>='\u0859' && LA8_0<='\u085B')||(LA8_0>='\u08E4' && LA8_0<='\u08FE')||(LA8_0>='\u0900' && LA8_0<='\u0902')||LA8_0=='\u093A'||LA8_0=='\u093C'||(LA8_0>='\u0941' && LA8_0<='\u0948')||LA8_0=='\u094D'||(LA8_0>='\u0951' && LA8_0<='\u0957')||(LA8_0>='\u0962' && LA8_0<='\u0963')||LA8_0=='\u0981'||LA8_0=='\u09BC'||(LA8_0>='\u09C1' && LA8_0<='\u09C4')||LA8_0=='\u09CD'||(LA8_0>='\u09E2' && LA8_0<='\u09E3')||(LA8_0>='\u0A01' && LA8_0<='\u0A02')||LA8_0=='\u0A3C'||(LA8_0>='\u0A41' && LA8_0<='\u0A42')||(LA8_0>='\u0A47' && LA8_0<='\u0A48')||(LA8_0>='\u0A4B' && LA8_0<='\u0A4D')||LA8_0=='\u0A51'||(LA8_0>='\u0A70' && LA8_0<='\u0A71')||LA8_0=='\u0A75'||(LA8_0>='\u0A81' && LA8_0<='\u0A82')||LA8_0=='\u0ABC'||(LA8_0>='\u0AC1' && LA8_0<='\u0AC5')||(LA8_0>='\u0AC7' && LA8_0<='\u0AC8')||LA8_0=='\u0ACD'||(LA8_0>='\u0AE2' && LA8_0<='\u0AE3')||LA8_0=='\u0B01'||LA8_0=='\u0B3C'||LA8_0=='\u0B3F'||(LA8_0>='\u0B41' && LA8_0<='\u0B44')||LA8_0=='\u0B4D'||LA8_0=='\u0B56'||(LA8_0>='\u0B62' && LA8_0<='\u0B63')||LA8_0=='\u0B82'||LA8_0=='\u0BC0'||LA8_0=='\u0BCD'||(LA8_0>='\u0C3E' && LA8_0<='\u0C40')||(LA8_0>='\u0C46' && LA8_0<='\u0C48')||(LA8_0>='\u0C4A' && LA8_0<='\u0C4D')||(LA8_0>='\u0C55' && LA8_0<='\u0C56')||(LA8_0>='\u0C62' && LA8_0<='\u0C63')||LA8_0=='\u0CBC'||LA8_0=='\u0CBF'||LA8_0=='\u0CC6'||(LA8_0>='\u0CCC' && LA8_0<='\u0CCD')||(LA8_0>='\u0CE2' && LA8_0<='\u0CE3')||(LA8_0>='\u0D41' && LA8_0<='\u0D44')||LA8_0=='\u0D4D'||(LA8_0>='\u0D62' && LA8_0<='\u0D63')||LA8_0=='\u0DCA'||(LA8_0>='\u0DD2' && LA8_0<='\u0DD4')||LA8_0=='\u0DD6'||LA8_0=='\u0E31'||(LA8_0>='\u0E34' && LA8_0<='\u0E3A')||(LA8_0>='\u0E47' && LA8_0<='\u0E4E')||LA8_0=='\u0EB1'||(LA8_0>='\u0EB4' && LA8_0<='\u0EB9')||(LA8_0>='\u0EBB' && LA8_0<='\u0EBC')||(LA8_0>='\u0EC8' && LA8_0<='\u0ECD')||(LA8_0>='\u0F18' && LA8_0<='\u0F19')||LA8_0=='\u0F35'||LA8_0=='\u0F37'||LA8_0=='\u0F39'||(LA8_0>='\u0F71' && LA8_0<='\u0F7E')||(LA8_0>='\u0F80' && LA8_0<='\u0F84')||(LA8_0>='\u0F86' && LA8_0<='\u0F87')||(LA8_0>='\u0F8D' && LA8_0<='\u0F97')||(LA8_0>='\u0F99' && LA8_0<='\u0FBC')||LA8_0=='\u0FC6'||(LA8_0>='\u102D' && LA8_0<='\u1030')||(LA8_0>='\u1032' && LA8_0<='\u1037')||(LA8_0>='\u1039' && LA8_0<='\u103A')||(LA8_0>='\u103D' && LA8_0<='\u103E')||(LA8_0>='\u1058' && LA8_0<='\u1059')||(LA8_0>='\u105E' && LA8_0<='\u1060')||(LA8_0>='\u1071' && LA8_0<='\u1074')||LA8_0=='\u1082'||(LA8_0>='\u1085' && LA8_0<='\u1086')||LA8_0=='\u108D'||LA8_0=='\u109D'||(LA8_0>='\u135D' && LA8_0<='\u135F')||(LA8_0>='\u1712' && LA8_0<='\u1714')||(LA8_0>='\u1732' && LA8_0<='\u1734')||(LA8_0>='\u1752' && LA8_0<='\u1753')||(LA8_0>='\u1772' && LA8_0<='\u1773')||(LA8_0>='\u17B4' && LA8_0<='\u17B5')||(LA8_0>='\u17B7' && LA8_0<='\u17BD')||LA8_0=='\u17C6'||(LA8_0>='\u17C9' && LA8_0<='\u17D3')||LA8_0=='\u17DD'||(LA8_0>='\u180B' && LA8_0<='\u180D')||LA8_0=='\u18A9'||(LA8_0>='\u1920' && LA8_0<='\u1922')||(LA8_0>='\u1927' && LA8_0<='\u1928')||LA8_0=='\u1932'||(LA8_0>='\u1939' && LA8_0<='\u193B')||(LA8_0>='\u1A17' && LA8_0<='\u1A18')||LA8_0=='\u1A56'||(LA8_0>='\u1A58' && LA8_0<='\u1A5E')||LA8_0=='\u1A60'||LA8_0=='\u1A62'||(LA8_0>='\u1A65' && LA8_0<='\u1A6C')||(LA8_0>='\u1A73' && LA8_0<='\u1A7C')||LA8_0=='\u1A7F'||(LA8_0>='\u1B00' && LA8_0<='\u1B03')||LA8_0=='\u1B34'||(LA8_0>='\u1B36' && LA8_0<='\u1B3A')||LA8_0=='\u1B3C'||LA8_0=='\u1B42'||(LA8_0>='\u1B6B' && LA8_0<='\u1B73')||(LA8_0>='\u1B80' && LA8_0<='\u1B81')||(LA8_0>='\u1BA2' && LA8_0<='\u1BA5')||(LA8_0>='\u1BA8' && LA8_0<='\u1BA9')||LA8_0=='\u1BAB'||LA8_0=='\u1BE6'||(LA8_0>='\u1BE8' && LA8_0<='\u1BE9')||LA8_0=='\u1BED'||(LA8_0>='\u1BEF' && LA8_0<='\u1BF1')||(LA8_0>='\u1C2C' && LA8_0<='\u1C33')||(LA8_0>='\u1C36' && LA8_0<='\u1C37')||(LA8_0>='\u1CD0' && LA8_0<='\u1CD2')||(LA8_0>='\u1CD4' && LA8_0<='\u1CE0')||(LA8_0>='\u1CE2' && LA8_0<='\u1CE8')||LA8_0=='\u1CED'||LA8_0=='\u1CF4'||(LA8_0>='\u1DC0' && LA8_0<='\u1DE6')||(LA8_0>='\u1DFC' && LA8_0<='\u1DFF')||(LA8_0>='\u20D0' && LA8_0<='\u20DC')||LA8_0=='\u20E1'||(LA8_0>='\u20E5' && LA8_0<='\u20F0')||(LA8_0>='\u2CEF' && LA8_0<='\u2CF1')||LA8_0=='\u2D7F'||(LA8_0>='\u2DE0' && LA8_0<='\u2DFF')||(LA8_0>='\u302A' && LA8_0<='\u302D')||(LA8_0>='\u3099' && LA8_0<='\u309A')||LA8_0=='\uA66F'||(LA8_0>='\uA674' && LA8_0<='\uA67D')||LA8_0=='\uA69F'||(LA8_0>='\uA6F0' && LA8_0<='\uA6F1')||LA8_0=='\uA802'||LA8_0=='\uA806'||LA8_0=='\uA80B'||(LA8_0>='\uA825' && LA8_0<='\uA826')||LA8_0=='\uA8C4'||(LA8_0>='\uA8E0' && LA8_0<='\uA8F1')||(LA8_0>='\uA926' && LA8_0<='\uA92D')||(LA8_0>='\uA947' && LA8_0<='\uA951')||(LA8_0>='\uA980' && LA8_0<='\uA982')||LA8_0=='\uA9B3'||(LA8_0>='\uA9B6' && LA8_0<='\uA9B9')||LA8_0=='\uA9BC'||(LA8_0>='\uAA29' && LA8_0<='\uAA2E')||(LA8_0>='\uAA31' && LA8_0<='\uAA32')||(LA8_0>='\uAA35' && LA8_0<='\uAA36')||LA8_0=='\uAA43'||LA8_0=='\uAA4C'||LA8_0=='\uAAB0'||(LA8_0>='\uAAB2' && LA8_0<='\uAAB4')||(LA8_0>='\uAAB7' && LA8_0<='\uAAB8')||(LA8_0>='\uAABE' && LA8_0<='\uAABF')||LA8_0=='\uAAC1'||(LA8_0>='\uAAEC' && LA8_0<='\uAAED')||LA8_0=='\uAAF6'||LA8_0=='\uABE5'||LA8_0=='\uABE8'||LA8_0=='\uABED'||LA8_0=='\uFB1E'||(LA8_0>='\uFE00' && LA8_0<='\uFE0F')||(LA8_0>='\uFE20' && LA8_0<='\uFE26')) ) {
                alt8=1;
            }
            else if ( (LA8_0=='\u0903'||LA8_0=='\u093B'||(LA8_0>='\u093E' && LA8_0<='\u0940')||(LA8_0>='\u0949' && LA8_0<='\u094C')||(LA8_0>='\u094E' && LA8_0<='\u094F')||(LA8_0>='\u0982' && LA8_0<='\u0983')||(LA8_0>='\u09BE' && LA8_0<='\u09C0')||(LA8_0>='\u09C7' && LA8_0<='\u09C8')||(LA8_0>='\u09CB' && LA8_0<='\u09CC')||LA8_0=='\u09D7'||LA8_0=='\u0A03'||(LA8_0>='\u0A3E' && LA8_0<='\u0A40')||LA8_0=='\u0A83'||(LA8_0>='\u0ABE' && LA8_0<='\u0AC0')||LA8_0=='\u0AC9'||(LA8_0>='\u0ACB' && LA8_0<='\u0ACC')||(LA8_0>='\u0B02' && LA8_0<='\u0B03')||LA8_0=='\u0B3E'||LA8_0=='\u0B40'||(LA8_0>='\u0B47' && LA8_0<='\u0B48')||(LA8_0>='\u0B4B' && LA8_0<='\u0B4C')||LA8_0=='\u0B57'||(LA8_0>='\u0BBE' && LA8_0<='\u0BBF')||(LA8_0>='\u0BC1' && LA8_0<='\u0BC2')||(LA8_0>='\u0BC6' && LA8_0<='\u0BC8')||(LA8_0>='\u0BCA' && LA8_0<='\u0BCC')||LA8_0=='\u0BD7'||(LA8_0>='\u0C01' && LA8_0<='\u0C03')||(LA8_0>='\u0C41' && LA8_0<='\u0C44')||(LA8_0>='\u0C82' && LA8_0<='\u0C83')||LA8_0=='\u0CBE'||(LA8_0>='\u0CC0' && LA8_0<='\u0CC4')||(LA8_0>='\u0CC7' && LA8_0<='\u0CC8')||(LA8_0>='\u0CCA' && LA8_0<='\u0CCB')||(LA8_0>='\u0CD5' && LA8_0<='\u0CD6')||(LA8_0>='\u0D02' && LA8_0<='\u0D03')||(LA8_0>='\u0D3E' && LA8_0<='\u0D40')||(LA8_0>='\u0D46' && LA8_0<='\u0D48')||(LA8_0>='\u0D4A' && LA8_0<='\u0D4C')||LA8_0=='\u0D57'||(LA8_0>='\u0D82' && LA8_0<='\u0D83')||(LA8_0>='\u0DCF' && LA8_0<='\u0DD1')||(LA8_0>='\u0DD8' && LA8_0<='\u0DDF')||(LA8_0>='\u0DF2' && LA8_0<='\u0DF3')||(LA8_0>='\u0F3E' && LA8_0<='\u0F3F')||LA8_0=='\u0F7F'||(LA8_0>='\u102B' && LA8_0<='\u102C')||LA8_0=='\u1031'||LA8_0=='\u1038'||(LA8_0>='\u103B' && LA8_0<='\u103C')||(LA8_0>='\u1056' && LA8_0<='\u1057')||(LA8_0>='\u1062' && LA8_0<='\u1064')||(LA8_0>='\u1067' && LA8_0<='\u106D')||(LA8_0>='\u1083' && LA8_0<='\u1084')||(LA8_0>='\u1087' && LA8_0<='\u108C')||LA8_0=='\u108F'||(LA8_0>='\u109A' && LA8_0<='\u109C')||LA8_0=='\u1100'||LA8_0=='\u17B6'||(LA8_0>='\u17BE' && LA8_0<='\u17C5')||(LA8_0>='\u17C7' && LA8_0<='\u17C8')||(LA8_0>='\u1923' && LA8_0<='\u1926')||(LA8_0>='\u1929' && LA8_0<='\u192B')||(LA8_0>='\u1930' && LA8_0<='\u1931')||(LA8_0>='\u1933' && LA8_0<='\u1938')||(LA8_0>='\u19B0' && LA8_0<='\u19C0')||(LA8_0>='\u19C8' && LA8_0<='\u19C9')||(LA8_0>='\u1A19' && LA8_0<='\u1A1B')||LA8_0=='\u1A55'||LA8_0=='\u1A57'||LA8_0=='\u1A61'||(LA8_0>='\u1A63' && LA8_0<='\u1A64')||(LA8_0>='\u1A6D' && LA8_0<='\u1A72')||LA8_0=='\u1B04'||LA8_0=='\u1B35'||LA8_0=='\u1B3B'||(LA8_0>='\u1B3D' && LA8_0<='\u1B41')||(LA8_0>='\u1B43' && LA8_0<='\u1B44')||LA8_0=='\u1B82'||LA8_0=='\u1BA1'||(LA8_0>='\u1BA6' && LA8_0<='\u1BA7')||LA8_0=='\u1BAA'||(LA8_0>='\u1BAC' && LA8_0<='\u1BAD')||LA8_0=='\u1BE7'||(LA8_0>='\u1BEA' && LA8_0<='\u1BEC')||LA8_0=='\u1BEE'||(LA8_0>='\u1BF2' && LA8_0<='\u1BF3')||(LA8_0>='\u1C24' && LA8_0<='\u1C2B')||(LA8_0>='\u1C34' && LA8_0<='\u1C35')||LA8_0=='\u1CE1'||(LA8_0>='\u1CF2' && LA8_0<='\u1CF3')||(LA8_0>='\u302E' && LA8_0<='\u302F')||(LA8_0>='\uA823' && LA8_0<='\uA824')||LA8_0=='\uA827'||(LA8_0>='\uA880' && LA8_0<='\uA881')||(LA8_0>='\uA8B4' && LA8_0<='\uA8C3')||(LA8_0>='\uA952' && LA8_0<='\uA953')||LA8_0=='\uA983'||(LA8_0>='\uA9B4' && LA8_0<='\uA9B5')||(LA8_0>='\uA9BA' && LA8_0<='\uA9BB')||(LA8_0>='\uA9BD' && LA8_0<='\uA9C0')||(LA8_0>='\uAA2F' && LA8_0<='\uAA30')||(LA8_0>='\uAA33' && LA8_0<='\uAA34')||LA8_0=='\uAA4D'||LA8_0=='\uAA7B'||LA8_0=='\uAAEB'||(LA8_0>='\uAAEE' && LA8_0<='\uAAEF')||LA8_0=='\uAAF5'||(LA8_0>='\uABE3' && LA8_0<='\uABE4')||(LA8_0>='\uABE6' && LA8_0<='\uABE7')||(LA8_0>='\uABE9' && LA8_0<='\uABEA')||LA8_0=='\uABEC') ) {
                alt8=2;
            }
            else if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='\u0660' && LA8_0<='\u0669')||(LA8_0>='\u06F0' && LA8_0<='\u06F9')||(LA8_0>='\u07C0' && LA8_0<='\u07C9')||(LA8_0>='\u0966' && LA8_0<='\u096F')||(LA8_0>='\u09E6' && LA8_0<='\u09EF')||(LA8_0>='\u0A66' && LA8_0<='\u0A6F')||(LA8_0>='\u0AE6' && LA8_0<='\u0AEF')||(LA8_0>='\u0B66' && LA8_0<='\u0B6F')||(LA8_0>='\u0BE6' && LA8_0<='\u0BEF')||(LA8_0>='\u0C66' && LA8_0<='\u0C6F')||(LA8_0>='\u0CE6' && LA8_0<='\u0CEF')||(LA8_0>='\u0D66' && LA8_0<='\u0D6F')||(LA8_0>='\u0E50' && LA8_0<='\u0E59')||(LA8_0>='\u0ED0' && LA8_0<='\u0ED9')||(LA8_0>='\u0F20' && LA8_0<='\u0F29')||(LA8_0>='\u1040' && LA8_0<='\u1049')||(LA8_0>='\u1090' && LA8_0<='\u1099')||(LA8_0>='\u17E0' && LA8_0<='\u17E9')||(LA8_0>='\u1810' && LA8_0<='\u1819')||(LA8_0>='\u1946' && LA8_0<='\u194F')||(LA8_0>='\u19D0' && LA8_0<='\u19D9')||(LA8_0>='\u1A80' && LA8_0<='\u1A89')||(LA8_0>='\u1A90' && LA8_0<='\u1A99')||(LA8_0>='\u1B50' && LA8_0<='\u1B59')||(LA8_0>='\u1BB0' && LA8_0<='\u1BB9')||(LA8_0>='\u1C40' && LA8_0<='\u1C49')||(LA8_0>='\u1C50' && LA8_0<='\u1C59')||(LA8_0>='\uA620' && LA8_0<='\uA629')||(LA8_0>='\uA8D0' && LA8_0<='\uA8D9')||(LA8_0>='\uA900' && LA8_0<='\uA909')||(LA8_0>='\uA9D0' && LA8_0<='\uA9D9')||(LA8_0>='\uAA50' && LA8_0<='\uAA59')||(LA8_0>='\uABF0' && LA8_0<='\uABF9')||(LA8_0>='\uFF10' && LA8_0<='\uFF19')) ) {
                alt8=3;
            }
            else if ( (LA8_0=='_'||(LA8_0>='\u203F' && LA8_0<='\u2040')||LA8_0=='\u2054'||(LA8_0>='\uFE33' && LA8_0<='\uFE34')||(LA8_0>='\uFE4D' && LA8_0<='\uFE4F')||LA8_0=='\uFF3F') ) {
                alt8=4;
            }
            else if ( (LA8_0=='\u00AD'||(LA8_0>='\u0600' && LA8_0<='\u0604')||LA8_0=='\u06DD'||LA8_0=='\u070F'||(LA8_0>='\u200B' && LA8_0<='\u200F')||(LA8_0>='\u202A' && LA8_0<='\u202E')||(LA8_0>='\u2060' && LA8_0<='\u2064')||(LA8_0>='\u206A' && LA8_0<='\u206F')||LA8_0=='\uFEFF'||(LA8_0>='\uFFF9' && LA8_0<='\uFFFB')) ) {
                alt8=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAdbLexer.g:189:36: RULE_MARKNON_SPACING
                    {
                    mRULE_MARKNON_SPACING(); 

                    }
                    break;
                case 2 :
                    // InternalAdbLexer.g:189:57: RULE_MARKSPACING_COMBINING
                    {
                    mRULE_MARKSPACING_COMBINING(); 

                    }
                    break;
                case 3 :
                    // InternalAdbLexer.g:189:84: RULE_NUMBER_DECIMAL
                    {
                    mRULE_NUMBER_DECIMAL(); 

                    }
                    break;
                case 4 :
                    // InternalAdbLexer.g:189:104: RULE_PUNCTUATION_CONNECTOR
                    {
                    mRULE_PUNCTUATION_CONNECTOR(); 

                    }
                    break;
                case 5 :
                    // InternalAdbLexer.g:189:131: RULE_OTHER_FORMAT
                    {
                    mRULE_OTHER_FORMAT(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTIFIER_EXTEND"

    // $ANTLR start "RULE_NUMBER_DECIMAL"
    public final void mRULE_NUMBER_DECIMAL() throws RecognitionException {
        try {
            // InternalAdbLexer.g:191:30: ( ( '0' .. '9' | '\\u0660' .. '\\u0669' | '\\u06F0' .. '\\u06F9' | '\\u07C0' .. '\\u07C9' | '\\u0966' .. '\\u096F' | '\\u09E6' .. '\\u09EF' | '\\u0A66' .. '\\u0A6F' | '\\u0AE6' .. '\\u0AEF' | '\\u0B66' .. '\\u0B6F' | '\\u0BE6' .. '\\u0BEF' | '\\u0C66' .. '\\u0C6F' | '\\u0CE6' .. '\\u0CEF' | '\\u0D66' .. '\\u0D6F' | '\\u0E50' .. '\\u0E59' | '\\u0ED0' .. '\\u0ED9' | '\\u0F20' .. '\\u0F29' | '\\u1040' .. '\\u1049' | '\\u1090' .. '\\u1099' | '\\u17E0' .. '\\u17E9' | '\\u1810' .. '\\u1819' | '\\u1946' .. '\\u194F' | '\\u19D0' .. '\\u19D9' | '\\u1A80' .. '\\u1A89' | '\\u1A90' .. '\\u1A99' | '\\u1B50' .. '\\u1B59' | '\\u1BB0' .. '\\u1BB9' | '\\u1C40' .. '\\u1C49' | '\\u1C50' .. '\\u1C59' | '\\uA620' .. '\\uA629' | '\\uA8D0' .. '\\uA8D9' | '\\uA900' .. '\\uA909' | '\\uA9D0' .. '\\uA9D9' | '\\uAA50' .. '\\uAA59' | '\\uABF0' .. '\\uABF9' | '\\uFF10' .. '\\uFF19' ) )
            // InternalAdbLexer.g:191:32: ( '0' .. '9' | '\\u0660' .. '\\u0669' | '\\u06F0' .. '\\u06F9' | '\\u07C0' .. '\\u07C9' | '\\u0966' .. '\\u096F' | '\\u09E6' .. '\\u09EF' | '\\u0A66' .. '\\u0A6F' | '\\u0AE6' .. '\\u0AEF' | '\\u0B66' .. '\\u0B6F' | '\\u0BE6' .. '\\u0BEF' | '\\u0C66' .. '\\u0C6F' | '\\u0CE6' .. '\\u0CEF' | '\\u0D66' .. '\\u0D6F' | '\\u0E50' .. '\\u0E59' | '\\u0ED0' .. '\\u0ED9' | '\\u0F20' .. '\\u0F29' | '\\u1040' .. '\\u1049' | '\\u1090' .. '\\u1099' | '\\u17E0' .. '\\u17E9' | '\\u1810' .. '\\u1819' | '\\u1946' .. '\\u194F' | '\\u19D0' .. '\\u19D9' | '\\u1A80' .. '\\u1A89' | '\\u1A90' .. '\\u1A99' | '\\u1B50' .. '\\u1B59' | '\\u1BB0' .. '\\u1BB9' | '\\u1C40' .. '\\u1C49' | '\\u1C50' .. '\\u1C59' | '\\uA620' .. '\\uA629' | '\\uA8D0' .. '\\uA8D9' | '\\uA900' .. '\\uA909' | '\\uA9D0' .. '\\uA9D9' | '\\uAA50' .. '\\uAA59' | '\\uABF0' .. '\\uABF9' | '\\uFF10' .. '\\uFF19' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='\u0660' && input.LA(1)<='\u0669')||(input.LA(1)>='\u06F0' && input.LA(1)<='\u06F9')||(input.LA(1)>='\u07C0' && input.LA(1)<='\u07C9')||(input.LA(1)>='\u0966' && input.LA(1)<='\u096F')||(input.LA(1)>='\u09E6' && input.LA(1)<='\u09EF')||(input.LA(1)>='\u0A66' && input.LA(1)<='\u0A6F')||(input.LA(1)>='\u0AE6' && input.LA(1)<='\u0AEF')||(input.LA(1)>='\u0B66' && input.LA(1)<='\u0B6F')||(input.LA(1)>='\u0BE6' && input.LA(1)<='\u0BEF')||(input.LA(1)>='\u0C66' && input.LA(1)<='\u0C6F')||(input.LA(1)>='\u0CE6' && input.LA(1)<='\u0CEF')||(input.LA(1)>='\u0D66' && input.LA(1)<='\u0D6F')||(input.LA(1)>='\u0E50' && input.LA(1)<='\u0E59')||(input.LA(1)>='\u0ED0' && input.LA(1)<='\u0ED9')||(input.LA(1)>='\u0F20' && input.LA(1)<='\u0F29')||(input.LA(1)>='\u1040' && input.LA(1)<='\u1049')||(input.LA(1)>='\u1090' && input.LA(1)<='\u1099')||(input.LA(1)>='\u17E0' && input.LA(1)<='\u17E9')||(input.LA(1)>='\u1810' && input.LA(1)<='\u1819')||(input.LA(1)>='\u1946' && input.LA(1)<='\u194F')||(input.LA(1)>='\u19D0' && input.LA(1)<='\u19D9')||(input.LA(1)>='\u1A80' && input.LA(1)<='\u1A89')||(input.LA(1)>='\u1A90' && input.LA(1)<='\u1A99')||(input.LA(1)>='\u1B50' && input.LA(1)<='\u1B59')||(input.LA(1)>='\u1BB0' && input.LA(1)<='\u1BB9')||(input.LA(1)>='\u1C40' && input.LA(1)<='\u1C49')||(input.LA(1)>='\u1C50' && input.LA(1)<='\u1C59')||(input.LA(1)>='\uA620' && input.LA(1)<='\uA629')||(input.LA(1)>='\uA8D0' && input.LA(1)<='\uA8D9')||(input.LA(1)>='\uA900' && input.LA(1)<='\uA909')||(input.LA(1)>='\uA9D0' && input.LA(1)<='\uA9D9')||(input.LA(1)>='\uAA50' && input.LA(1)<='\uAA59')||(input.LA(1)>='\uABF0' && input.LA(1)<='\uABF9')||(input.LA(1)>='\uFF10' && input.LA(1)<='\uFF19') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER_DECIMAL"

    // $ANTLR start "RULE_MARKSPACING_COMBINING"
    public final void mRULE_MARKSPACING_COMBINING() throws RecognitionException {
        try {
            // InternalAdbLexer.g:193:37: ( ( '\\u0903' | '\\u093B' | '\\u093E' .. '\\u0940' | '\\u0949' .. '\\u094C' | '\\u094E' | '\\u094F' | '\\u0982' | '\\u0983' | '\\u09BE' .. '\\u09C0' | '\\u09C7' | '\\u09C8' | '\\u09CB' | '\\u09CC' | '\\u09D7' | '\\u0A03' | '\\u0A3E' .. '\\u0A40' | '\\u0A83' | '\\u0ABE' .. '\\u0AC0' | '\\u0AC9' | '\\u0ACB' | '\\u0ACC' | '\\u0B02' | '\\u0B03' | '\\u0B3E' | '\\u0B40' | '\\u0B47' | '\\u0B48' | '\\u0B4B' | '\\u0B4C' | '\\u0B57' | '\\u0BBE' | '\\u0BBF' | '\\u0BC1' | '\\u0BC2' | '\\u0BC6' .. '\\u0BC8' | '\\u0BCA' .. '\\u0BCC' | '\\u0BD7' | '\\u0C01' .. '\\u0C03' | '\\u0C41' .. '\\u0C44' | '\\u0C82' | '\\u0C83' | '\\u0CBE' | '\\u0CC0' .. '\\u0CC4' | '\\u0CC7' | '\\u0CC8' | '\\u0CCA' | '\\u0CCB' | '\\u0CD5' | '\\u0CD6' | '\\u0D02' | '\\u0D03' | '\\u0D3E' .. '\\u0D40' | '\\u0D46' .. '\\u0D48' | '\\u0D4A' .. '\\u0D4C' | '\\u0D57' | '\\u0D82' | '\\u0D83' | '\\u0DCF' .. '\\u0DD1' | '\\u0DD8' .. '\\u0DDF' | '\\u0DF2' | '\\u0DF3' | '\\u0F3E' | '\\u0F3F' | '\\u0F7F' | '\\u102B' | '\\u102C' | '\\u1031' | '\\u1038' | '\\u103B' | '\\u103C' | '\\u1056' | '\\u1057' | '\\u1062' .. '\\u1064' | '\\u1067' .. '\\u106D' | '\\u1083' | '\\u1084' | '\\u1087' .. '\\u108C' | '\\u108F' | '\\u109A' .. '\\u109C' | '\\u17B6' | '\\u17BE' .. '\\u17C5' | '\\u17C7' | '\\u17C8' | '\\u1923' .. '\\u1926' | '\\u1929' .. '\\u192B' | '\\u1930' | '\\u1931' | '\\u1933' .. '\\u1938' | '\\u19B0' .. '\\u19C0' | '\\u19C8' | '\\u19C9' | '\\u1A19' .. '\\u1A1B' | '\\u1A55' | '\\u1A57' | '\\u1A61' | '\\u1A63' | '\\u1A64' | '\\u1A6D' .. '\\u1A72' | '\\u1B04' | '\\u1B35' | '\\u1B3B' | '\\u1B3D' .. '\\u1B41' | '\\u1B43' | '\\u1B44' | '\\u1B82' | '\\u1BA1' | '\\u1BA6' | '\\u1BA7' | '\\u1BAA' | '\\u1BAC' | '\\u1BAD' | '\\u1BE7' | '\\u1BEA' .. '\\u1BEC' | '\\u1BEE' | '\\u1BF2' | '\\u1BF3' | '\\u1C24' .. '\\u1C2B' | '\\u1C34' | '\\u1C35' | '\\u1CE1' | '\\u1CF2' | '\\u1CF3' | '\\u302E' | '\\u302F' | '\\uA823' | '\\uA824' | '\\uA827' | '\\uA880' | '\\uA881' | '\\uA8B4' .. '\\uA8C3' | '\\uA952' | '\\uA953' | '\\uA983' | '\\uA9B4' | '\\uA9B5' | '\\uA9BA' | '\\uA9BB' | '\\uA9BD' .. '\\uA9C0' | '\\uAA2F' | '\\uAA30' | '\\uAA33' | '\\uAA34' | '\\uAA4D' | '\\uAA7B' | '\\uAAEB' | '\\uAAEE' | '\\uAAEF' | '\\uAAF5' | '\\uABE3' | '\\uABE4' | '\\uABE6' | '\\uABE7' | '\\uABE9' | '\\uABEA' | '\\uABEC' | '\\u11000' | '\\u11002' ) )
            // InternalAdbLexer.g:193:39: ( '\\u0903' | '\\u093B' | '\\u093E' .. '\\u0940' | '\\u0949' .. '\\u094C' | '\\u094E' | '\\u094F' | '\\u0982' | '\\u0983' | '\\u09BE' .. '\\u09C0' | '\\u09C7' | '\\u09C8' | '\\u09CB' | '\\u09CC' | '\\u09D7' | '\\u0A03' | '\\u0A3E' .. '\\u0A40' | '\\u0A83' | '\\u0ABE' .. '\\u0AC0' | '\\u0AC9' | '\\u0ACB' | '\\u0ACC' | '\\u0B02' | '\\u0B03' | '\\u0B3E' | '\\u0B40' | '\\u0B47' | '\\u0B48' | '\\u0B4B' | '\\u0B4C' | '\\u0B57' | '\\u0BBE' | '\\u0BBF' | '\\u0BC1' | '\\u0BC2' | '\\u0BC6' .. '\\u0BC8' | '\\u0BCA' .. '\\u0BCC' | '\\u0BD7' | '\\u0C01' .. '\\u0C03' | '\\u0C41' .. '\\u0C44' | '\\u0C82' | '\\u0C83' | '\\u0CBE' | '\\u0CC0' .. '\\u0CC4' | '\\u0CC7' | '\\u0CC8' | '\\u0CCA' | '\\u0CCB' | '\\u0CD5' | '\\u0CD6' | '\\u0D02' | '\\u0D03' | '\\u0D3E' .. '\\u0D40' | '\\u0D46' .. '\\u0D48' | '\\u0D4A' .. '\\u0D4C' | '\\u0D57' | '\\u0D82' | '\\u0D83' | '\\u0DCF' .. '\\u0DD1' | '\\u0DD8' .. '\\u0DDF' | '\\u0DF2' | '\\u0DF3' | '\\u0F3E' | '\\u0F3F' | '\\u0F7F' | '\\u102B' | '\\u102C' | '\\u1031' | '\\u1038' | '\\u103B' | '\\u103C' | '\\u1056' | '\\u1057' | '\\u1062' .. '\\u1064' | '\\u1067' .. '\\u106D' | '\\u1083' | '\\u1084' | '\\u1087' .. '\\u108C' | '\\u108F' | '\\u109A' .. '\\u109C' | '\\u17B6' | '\\u17BE' .. '\\u17C5' | '\\u17C7' | '\\u17C8' | '\\u1923' .. '\\u1926' | '\\u1929' .. '\\u192B' | '\\u1930' | '\\u1931' | '\\u1933' .. '\\u1938' | '\\u19B0' .. '\\u19C0' | '\\u19C8' | '\\u19C9' | '\\u1A19' .. '\\u1A1B' | '\\u1A55' | '\\u1A57' | '\\u1A61' | '\\u1A63' | '\\u1A64' | '\\u1A6D' .. '\\u1A72' | '\\u1B04' | '\\u1B35' | '\\u1B3B' | '\\u1B3D' .. '\\u1B41' | '\\u1B43' | '\\u1B44' | '\\u1B82' | '\\u1BA1' | '\\u1BA6' | '\\u1BA7' | '\\u1BAA' | '\\u1BAC' | '\\u1BAD' | '\\u1BE7' | '\\u1BEA' .. '\\u1BEC' | '\\u1BEE' | '\\u1BF2' | '\\u1BF3' | '\\u1C24' .. '\\u1C2B' | '\\u1C34' | '\\u1C35' | '\\u1CE1' | '\\u1CF2' | '\\u1CF3' | '\\u302E' | '\\u302F' | '\\uA823' | '\\uA824' | '\\uA827' | '\\uA880' | '\\uA881' | '\\uA8B4' .. '\\uA8C3' | '\\uA952' | '\\uA953' | '\\uA983' | '\\uA9B4' | '\\uA9B5' | '\\uA9BA' | '\\uA9BB' | '\\uA9BD' .. '\\uA9C0' | '\\uAA2F' | '\\uAA30' | '\\uAA33' | '\\uAA34' | '\\uAA4D' | '\\uAA7B' | '\\uAAEB' | '\\uAAEE' | '\\uAAEF' | '\\uAAF5' | '\\uABE3' | '\\uABE4' | '\\uABE6' | '\\uABE7' | '\\uABE9' | '\\uABEA' | '\\uABEC' | '\\u11000' | '\\u11002' )
            {
            // InternalAdbLexer.g:193:39: ( '\\u0903' | '\\u093B' | '\\u093E' .. '\\u0940' | '\\u0949' .. '\\u094C' | '\\u094E' | '\\u094F' | '\\u0982' | '\\u0983' | '\\u09BE' .. '\\u09C0' | '\\u09C7' | '\\u09C8' | '\\u09CB' | '\\u09CC' | '\\u09D7' | '\\u0A03' | '\\u0A3E' .. '\\u0A40' | '\\u0A83' | '\\u0ABE' .. '\\u0AC0' | '\\u0AC9' | '\\u0ACB' | '\\u0ACC' | '\\u0B02' | '\\u0B03' | '\\u0B3E' | '\\u0B40' | '\\u0B47' | '\\u0B48' | '\\u0B4B' | '\\u0B4C' | '\\u0B57' | '\\u0BBE' | '\\u0BBF' | '\\u0BC1' | '\\u0BC2' | '\\u0BC6' .. '\\u0BC8' | '\\u0BCA' .. '\\u0BCC' | '\\u0BD7' | '\\u0C01' .. '\\u0C03' | '\\u0C41' .. '\\u0C44' | '\\u0C82' | '\\u0C83' | '\\u0CBE' | '\\u0CC0' .. '\\u0CC4' | '\\u0CC7' | '\\u0CC8' | '\\u0CCA' | '\\u0CCB' | '\\u0CD5' | '\\u0CD6' | '\\u0D02' | '\\u0D03' | '\\u0D3E' .. '\\u0D40' | '\\u0D46' .. '\\u0D48' | '\\u0D4A' .. '\\u0D4C' | '\\u0D57' | '\\u0D82' | '\\u0D83' | '\\u0DCF' .. '\\u0DD1' | '\\u0DD8' .. '\\u0DDF' | '\\u0DF2' | '\\u0DF3' | '\\u0F3E' | '\\u0F3F' | '\\u0F7F' | '\\u102B' | '\\u102C' | '\\u1031' | '\\u1038' | '\\u103B' | '\\u103C' | '\\u1056' | '\\u1057' | '\\u1062' .. '\\u1064' | '\\u1067' .. '\\u106D' | '\\u1083' | '\\u1084' | '\\u1087' .. '\\u108C' | '\\u108F' | '\\u109A' .. '\\u109C' | '\\u17B6' | '\\u17BE' .. '\\u17C5' | '\\u17C7' | '\\u17C8' | '\\u1923' .. '\\u1926' | '\\u1929' .. '\\u192B' | '\\u1930' | '\\u1931' | '\\u1933' .. '\\u1938' | '\\u19B0' .. '\\u19C0' | '\\u19C8' | '\\u19C9' | '\\u1A19' .. '\\u1A1B' | '\\u1A55' | '\\u1A57' | '\\u1A61' | '\\u1A63' | '\\u1A64' | '\\u1A6D' .. '\\u1A72' | '\\u1B04' | '\\u1B35' | '\\u1B3B' | '\\u1B3D' .. '\\u1B41' | '\\u1B43' | '\\u1B44' | '\\u1B82' | '\\u1BA1' | '\\u1BA6' | '\\u1BA7' | '\\u1BAA' | '\\u1BAC' | '\\u1BAD' | '\\u1BE7' | '\\u1BEA' .. '\\u1BEC' | '\\u1BEE' | '\\u1BF2' | '\\u1BF3' | '\\u1C24' .. '\\u1C2B' | '\\u1C34' | '\\u1C35' | '\\u1CE1' | '\\u1CF2' | '\\u1CF3' | '\\u302E' | '\\u302F' | '\\uA823' | '\\uA824' | '\\uA827' | '\\uA880' | '\\uA881' | '\\uA8B4' .. '\\uA8C3' | '\\uA952' | '\\uA953' | '\\uA983' | '\\uA9B4' | '\\uA9B5' | '\\uA9BA' | '\\uA9BB' | '\\uA9BD' .. '\\uA9C0' | '\\uAA2F' | '\\uAA30' | '\\uAA33' | '\\uAA34' | '\\uAA4D' | '\\uAA7B' | '\\uAAEB' | '\\uAAEE' | '\\uAAEF' | '\\uAAF5' | '\\uABE3' | '\\uABE4' | '\\uABE6' | '\\uABE7' | '\\uABE9' | '\\uABEA' | '\\uABEC' | '\\u11000' | '\\u11002' )
            int alt9=157;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalAdbLexer.g:193:40: '\\u0903'
                    {
                    match('\u0903'); 

                    }
                    break;
                case 2 :
                    // InternalAdbLexer.g:193:49: '\\u093B'
                    {
                    match('\u093B'); 

                    }
                    break;
                case 3 :
                    // InternalAdbLexer.g:193:58: '\\u093E' .. '\\u0940'
                    {
                    matchRange('\u093E','\u0940'); 

                    }
                    break;
                case 4 :
                    // InternalAdbLexer.g:193:77: '\\u0949' .. '\\u094C'
                    {
                    matchRange('\u0949','\u094C'); 

                    }
                    break;
                case 5 :
                    // InternalAdbLexer.g:193:96: '\\u094E'
                    {
                    match('\u094E'); 

                    }
                    break;
                case 6 :
                    // InternalAdbLexer.g:193:105: '\\u094F'
                    {
                    match('\u094F'); 

                    }
                    break;
                case 7 :
                    // InternalAdbLexer.g:193:114: '\\u0982'
                    {
                    match('\u0982'); 

                    }
                    break;
                case 8 :
                    // InternalAdbLexer.g:193:123: '\\u0983'
                    {
                    match('\u0983'); 

                    }
                    break;
                case 9 :
                    // InternalAdbLexer.g:193:132: '\\u09BE' .. '\\u09C0'
                    {
                    matchRange('\u09BE','\u09C0'); 

                    }
                    break;
                case 10 :
                    // InternalAdbLexer.g:193:151: '\\u09C7'
                    {
                    match('\u09C7'); 

                    }
                    break;
                case 11 :
                    // InternalAdbLexer.g:193:160: '\\u09C8'
                    {
                    match('\u09C8'); 

                    }
                    break;
                case 12 :
                    // InternalAdbLexer.g:193:169: '\\u09CB'
                    {
                    match('\u09CB'); 

                    }
                    break;
                case 13 :
                    // InternalAdbLexer.g:193:178: '\\u09CC'
                    {
                    match('\u09CC'); 

                    }
                    break;
                case 14 :
                    // InternalAdbLexer.g:193:187: '\\u09D7'
                    {
                    match('\u09D7'); 

                    }
                    break;
                case 15 :
                    // InternalAdbLexer.g:193:196: '\\u0A03'
                    {
                    match('\u0A03'); 

                    }
                    break;
                case 16 :
                    // InternalAdbLexer.g:193:205: '\\u0A3E' .. '\\u0A40'
                    {
                    matchRange('\u0A3E','\u0A40'); 

                    }
                    break;
                case 17 :
                    // InternalAdbLexer.g:193:224: '\\u0A83'
                    {
                    match('\u0A83'); 

                    }
                    break;
                case 18 :
                    // InternalAdbLexer.g:193:233: '\\u0ABE' .. '\\u0AC0'
                    {
                    matchRange('\u0ABE','\u0AC0'); 

                    }
                    break;
                case 19 :
                    // InternalAdbLexer.g:193:252: '\\u0AC9'
                    {
                    match('\u0AC9'); 

                    }
                    break;
                case 20 :
                    // InternalAdbLexer.g:193:261: '\\u0ACB'
                    {
                    match('\u0ACB'); 

                    }
                    break;
                case 21 :
                    // InternalAdbLexer.g:193:270: '\\u0ACC'
                    {
                    match('\u0ACC'); 

                    }
                    break;
                case 22 :
                    // InternalAdbLexer.g:193:279: '\\u0B02'
                    {
                    match('\u0B02'); 

                    }
                    break;
                case 23 :
                    // InternalAdbLexer.g:193:288: '\\u0B03'
                    {
                    match('\u0B03'); 

                    }
                    break;
                case 24 :
                    // InternalAdbLexer.g:193:297: '\\u0B3E'
                    {
                    match('\u0B3E'); 

                    }
                    break;
                case 25 :
                    // InternalAdbLexer.g:193:306: '\\u0B40'
                    {
                    match('\u0B40'); 

                    }
                    break;
                case 26 :
                    // InternalAdbLexer.g:193:315: '\\u0B47'
                    {
                    match('\u0B47'); 

                    }
                    break;
                case 27 :
                    // InternalAdbLexer.g:193:324: '\\u0B48'
                    {
                    match('\u0B48'); 

                    }
                    break;
                case 28 :
                    // InternalAdbLexer.g:193:333: '\\u0B4B'
                    {
                    match('\u0B4B'); 

                    }
                    break;
                case 29 :
                    // InternalAdbLexer.g:193:342: '\\u0B4C'
                    {
                    match('\u0B4C'); 

                    }
                    break;
                case 30 :
                    // InternalAdbLexer.g:193:351: '\\u0B57'
                    {
                    match('\u0B57'); 

                    }
                    break;
                case 31 :
                    // InternalAdbLexer.g:193:360: '\\u0BBE'
                    {
                    match('\u0BBE'); 

                    }
                    break;
                case 32 :
                    // InternalAdbLexer.g:193:369: '\\u0BBF'
                    {
                    match('\u0BBF'); 

                    }
                    break;
                case 33 :
                    // InternalAdbLexer.g:193:378: '\\u0BC1'
                    {
                    match('\u0BC1'); 

                    }
                    break;
                case 34 :
                    // InternalAdbLexer.g:193:387: '\\u0BC2'
                    {
                    match('\u0BC2'); 

                    }
                    break;
                case 35 :
                    // InternalAdbLexer.g:193:396: '\\u0BC6' .. '\\u0BC8'
                    {
                    matchRange('\u0BC6','\u0BC8'); 

                    }
                    break;
                case 36 :
                    // InternalAdbLexer.g:193:415: '\\u0BCA' .. '\\u0BCC'
                    {
                    matchRange('\u0BCA','\u0BCC'); 

                    }
                    break;
                case 37 :
                    // InternalAdbLexer.g:193:434: '\\u0BD7'
                    {
                    match('\u0BD7'); 

                    }
                    break;
                case 38 :
                    // InternalAdbLexer.g:193:443: '\\u0C01' .. '\\u0C03'
                    {
                    matchRange('\u0C01','\u0C03'); 

                    }
                    break;
                case 39 :
                    // InternalAdbLexer.g:193:462: '\\u0C41' .. '\\u0C44'
                    {
                    matchRange('\u0C41','\u0C44'); 

                    }
                    break;
                case 40 :
                    // InternalAdbLexer.g:193:481: '\\u0C82'
                    {
                    match('\u0C82'); 

                    }
                    break;
                case 41 :
                    // InternalAdbLexer.g:193:490: '\\u0C83'
                    {
                    match('\u0C83'); 

                    }
                    break;
                case 42 :
                    // InternalAdbLexer.g:193:499: '\\u0CBE'
                    {
                    match('\u0CBE'); 

                    }
                    break;
                case 43 :
                    // InternalAdbLexer.g:193:508: '\\u0CC0' .. '\\u0CC4'
                    {
                    matchRange('\u0CC0','\u0CC4'); 

                    }
                    break;
                case 44 :
                    // InternalAdbLexer.g:193:527: '\\u0CC7'
                    {
                    match('\u0CC7'); 

                    }
                    break;
                case 45 :
                    // InternalAdbLexer.g:193:536: '\\u0CC8'
                    {
                    match('\u0CC8'); 

                    }
                    break;
                case 46 :
                    // InternalAdbLexer.g:193:545: '\\u0CCA'
                    {
                    match('\u0CCA'); 

                    }
                    break;
                case 47 :
                    // InternalAdbLexer.g:193:554: '\\u0CCB'
                    {
                    match('\u0CCB'); 

                    }
                    break;
                case 48 :
                    // InternalAdbLexer.g:193:563: '\\u0CD5'
                    {
                    match('\u0CD5'); 

                    }
                    break;
                case 49 :
                    // InternalAdbLexer.g:193:572: '\\u0CD6'
                    {
                    match('\u0CD6'); 

                    }
                    break;
                case 50 :
                    // InternalAdbLexer.g:193:581: '\\u0D02'
                    {
                    match('\u0D02'); 

                    }
                    break;
                case 51 :
                    // InternalAdbLexer.g:193:590: '\\u0D03'
                    {
                    match('\u0D03'); 

                    }
                    break;
                case 52 :
                    // InternalAdbLexer.g:193:599: '\\u0D3E' .. '\\u0D40'
                    {
                    matchRange('\u0D3E','\u0D40'); 

                    }
                    break;
                case 53 :
                    // InternalAdbLexer.g:193:618: '\\u0D46' .. '\\u0D48'
                    {
                    matchRange('\u0D46','\u0D48'); 

                    }
                    break;
                case 54 :
                    // InternalAdbLexer.g:193:637: '\\u0D4A' .. '\\u0D4C'
                    {
                    matchRange('\u0D4A','\u0D4C'); 

                    }
                    break;
                case 55 :
                    // InternalAdbLexer.g:193:656: '\\u0D57'
                    {
                    match('\u0D57'); 

                    }
                    break;
                case 56 :
                    // InternalAdbLexer.g:193:665: '\\u0D82'
                    {
                    match('\u0D82'); 

                    }
                    break;
                case 57 :
                    // InternalAdbLexer.g:193:674: '\\u0D83'
                    {
                    match('\u0D83'); 

                    }
                    break;
                case 58 :
                    // InternalAdbLexer.g:193:683: '\\u0DCF' .. '\\u0DD1'
                    {
                    matchRange('\u0DCF','\u0DD1'); 

                    }
                    break;
                case 59 :
                    // InternalAdbLexer.g:193:702: '\\u0DD8' .. '\\u0DDF'
                    {
                    matchRange('\u0DD8','\u0DDF'); 

                    }
                    break;
                case 60 :
                    // InternalAdbLexer.g:193:721: '\\u0DF2'
                    {
                    match('\u0DF2'); 

                    }
                    break;
                case 61 :
                    // InternalAdbLexer.g:193:730: '\\u0DF3'
                    {
                    match('\u0DF3'); 

                    }
                    break;
                case 62 :
                    // InternalAdbLexer.g:193:739: '\\u0F3E'
                    {
                    match('\u0F3E'); 

                    }
                    break;
                case 63 :
                    // InternalAdbLexer.g:193:748: '\\u0F3F'
                    {
                    match('\u0F3F'); 

                    }
                    break;
                case 64 :
                    // InternalAdbLexer.g:193:757: '\\u0F7F'
                    {
                    match('\u0F7F'); 

                    }
                    break;
                case 65 :
                    // InternalAdbLexer.g:193:766: '\\u102B'
                    {
                    match('\u102B'); 

                    }
                    break;
                case 66 :
                    // InternalAdbLexer.g:193:775: '\\u102C'
                    {
                    match('\u102C'); 

                    }
                    break;
                case 67 :
                    // InternalAdbLexer.g:193:784: '\\u1031'
                    {
                    match('\u1031'); 

                    }
                    break;
                case 68 :
                    // InternalAdbLexer.g:193:793: '\\u1038'
                    {
                    match('\u1038'); 

                    }
                    break;
                case 69 :
                    // InternalAdbLexer.g:193:802: '\\u103B'
                    {
                    match('\u103B'); 

                    }
                    break;
                case 70 :
                    // InternalAdbLexer.g:193:811: '\\u103C'
                    {
                    match('\u103C'); 

                    }
                    break;
                case 71 :
                    // InternalAdbLexer.g:193:820: '\\u1056'
                    {
                    match('\u1056'); 

                    }
                    break;
                case 72 :
                    // InternalAdbLexer.g:193:829: '\\u1057'
                    {
                    match('\u1057'); 

                    }
                    break;
                case 73 :
                    // InternalAdbLexer.g:193:838: '\\u1062' .. '\\u1064'
                    {
                    matchRange('\u1062','\u1064'); 

                    }
                    break;
                case 74 :
                    // InternalAdbLexer.g:193:857: '\\u1067' .. '\\u106D'
                    {
                    matchRange('\u1067','\u106D'); 

                    }
                    break;
                case 75 :
                    // InternalAdbLexer.g:193:876: '\\u1083'
                    {
                    match('\u1083'); 

                    }
                    break;
                case 76 :
                    // InternalAdbLexer.g:193:885: '\\u1084'
                    {
                    match('\u1084'); 

                    }
                    break;
                case 77 :
                    // InternalAdbLexer.g:193:894: '\\u1087' .. '\\u108C'
                    {
                    matchRange('\u1087','\u108C'); 

                    }
                    break;
                case 78 :
                    // InternalAdbLexer.g:193:913: '\\u108F'
                    {
                    match('\u108F'); 

                    }
                    break;
                case 79 :
                    // InternalAdbLexer.g:193:922: '\\u109A' .. '\\u109C'
                    {
                    matchRange('\u109A','\u109C'); 

                    }
                    break;
                case 80 :
                    // InternalAdbLexer.g:193:941: '\\u17B6'
                    {
                    match('\u17B6'); 

                    }
                    break;
                case 81 :
                    // InternalAdbLexer.g:193:950: '\\u17BE' .. '\\u17C5'
                    {
                    matchRange('\u17BE','\u17C5'); 

                    }
                    break;
                case 82 :
                    // InternalAdbLexer.g:193:969: '\\u17C7'
                    {
                    match('\u17C7'); 

                    }
                    break;
                case 83 :
                    // InternalAdbLexer.g:193:978: '\\u17C8'
                    {
                    match('\u17C8'); 

                    }
                    break;
                case 84 :
                    // InternalAdbLexer.g:193:987: '\\u1923' .. '\\u1926'
                    {
                    matchRange('\u1923','\u1926'); 

                    }
                    break;
                case 85 :
                    // InternalAdbLexer.g:193:1006: '\\u1929' .. '\\u192B'
                    {
                    matchRange('\u1929','\u192B'); 

                    }
                    break;
                case 86 :
                    // InternalAdbLexer.g:193:1025: '\\u1930'
                    {
                    match('\u1930'); 

                    }
                    break;
                case 87 :
                    // InternalAdbLexer.g:193:1034: '\\u1931'
                    {
                    match('\u1931'); 

                    }
                    break;
                case 88 :
                    // InternalAdbLexer.g:193:1043: '\\u1933' .. '\\u1938'
                    {
                    matchRange('\u1933','\u1938'); 

                    }
                    break;
                case 89 :
                    // InternalAdbLexer.g:193:1062: '\\u19B0' .. '\\u19C0'
                    {
                    matchRange('\u19B0','\u19C0'); 

                    }
                    break;
                case 90 :
                    // InternalAdbLexer.g:193:1081: '\\u19C8'
                    {
                    match('\u19C8'); 

                    }
                    break;
                case 91 :
                    // InternalAdbLexer.g:193:1090: '\\u19C9'
                    {
                    match('\u19C9'); 

                    }
                    break;
                case 92 :
                    // InternalAdbLexer.g:193:1099: '\\u1A19' .. '\\u1A1B'
                    {
                    matchRange('\u1A19','\u1A1B'); 

                    }
                    break;
                case 93 :
                    // InternalAdbLexer.g:193:1118: '\\u1A55'
                    {
                    match('\u1A55'); 

                    }
                    break;
                case 94 :
                    // InternalAdbLexer.g:193:1127: '\\u1A57'
                    {
                    match('\u1A57'); 

                    }
                    break;
                case 95 :
                    // InternalAdbLexer.g:193:1136: '\\u1A61'
                    {
                    match('\u1A61'); 

                    }
                    break;
                case 96 :
                    // InternalAdbLexer.g:193:1145: '\\u1A63'
                    {
                    match('\u1A63'); 

                    }
                    break;
                case 97 :
                    // InternalAdbLexer.g:193:1154: '\\u1A64'
                    {
                    match('\u1A64'); 

                    }
                    break;
                case 98 :
                    // InternalAdbLexer.g:193:1163: '\\u1A6D' .. '\\u1A72'
                    {
                    matchRange('\u1A6D','\u1A72'); 

                    }
                    break;
                case 99 :
                    // InternalAdbLexer.g:193:1182: '\\u1B04'
                    {
                    match('\u1B04'); 

                    }
                    break;
                case 100 :
                    // InternalAdbLexer.g:193:1191: '\\u1B35'
                    {
                    match('\u1B35'); 

                    }
                    break;
                case 101 :
                    // InternalAdbLexer.g:193:1200: '\\u1B3B'
                    {
                    match('\u1B3B'); 

                    }
                    break;
                case 102 :
                    // InternalAdbLexer.g:193:1209: '\\u1B3D' .. '\\u1B41'
                    {
                    matchRange('\u1B3D','\u1B41'); 

                    }
                    break;
                case 103 :
                    // InternalAdbLexer.g:193:1228: '\\u1B43'
                    {
                    match('\u1B43'); 

                    }
                    break;
                case 104 :
                    // InternalAdbLexer.g:193:1237: '\\u1B44'
                    {
                    match('\u1B44'); 

                    }
                    break;
                case 105 :
                    // InternalAdbLexer.g:193:1246: '\\u1B82'
                    {
                    match('\u1B82'); 

                    }
                    break;
                case 106 :
                    // InternalAdbLexer.g:193:1255: '\\u1BA1'
                    {
                    match('\u1BA1'); 

                    }
                    break;
                case 107 :
                    // InternalAdbLexer.g:193:1264: '\\u1BA6'
                    {
                    match('\u1BA6'); 

                    }
                    break;
                case 108 :
                    // InternalAdbLexer.g:193:1273: '\\u1BA7'
                    {
                    match('\u1BA7'); 

                    }
                    break;
                case 109 :
                    // InternalAdbLexer.g:193:1282: '\\u1BAA'
                    {
                    match('\u1BAA'); 

                    }
                    break;
                case 110 :
                    // InternalAdbLexer.g:193:1291: '\\u1BAC'
                    {
                    match('\u1BAC'); 

                    }
                    break;
                case 111 :
                    // InternalAdbLexer.g:193:1300: '\\u1BAD'
                    {
                    match('\u1BAD'); 

                    }
                    break;
                case 112 :
                    // InternalAdbLexer.g:193:1309: '\\u1BE7'
                    {
                    match('\u1BE7'); 

                    }
                    break;
                case 113 :
                    // InternalAdbLexer.g:193:1318: '\\u1BEA' .. '\\u1BEC'
                    {
                    matchRange('\u1BEA','\u1BEC'); 

                    }
                    break;
                case 114 :
                    // InternalAdbLexer.g:193:1337: '\\u1BEE'
                    {
                    match('\u1BEE'); 

                    }
                    break;
                case 115 :
                    // InternalAdbLexer.g:193:1346: '\\u1BF2'
                    {
                    match('\u1BF2'); 

                    }
                    break;
                case 116 :
                    // InternalAdbLexer.g:193:1355: '\\u1BF3'
                    {
                    match('\u1BF3'); 

                    }
                    break;
                case 117 :
                    // InternalAdbLexer.g:193:1364: '\\u1C24' .. '\\u1C2B'
                    {
                    matchRange('\u1C24','\u1C2B'); 

                    }
                    break;
                case 118 :
                    // InternalAdbLexer.g:193:1383: '\\u1C34'
                    {
                    match('\u1C34'); 

                    }
                    break;
                case 119 :
                    // InternalAdbLexer.g:193:1392: '\\u1C35'
                    {
                    match('\u1C35'); 

                    }
                    break;
                case 120 :
                    // InternalAdbLexer.g:193:1401: '\\u1CE1'
                    {
                    match('\u1CE1'); 

                    }
                    break;
                case 121 :
                    // InternalAdbLexer.g:193:1410: '\\u1CF2'
                    {
                    match('\u1CF2'); 

                    }
                    break;
                case 122 :
                    // InternalAdbLexer.g:193:1419: '\\u1CF3'
                    {
                    match('\u1CF3'); 

                    }
                    break;
                case 123 :
                    // InternalAdbLexer.g:193:1428: '\\u302E'
                    {
                    match('\u302E'); 

                    }
                    break;
                case 124 :
                    // InternalAdbLexer.g:193:1437: '\\u302F'
                    {
                    match('\u302F'); 

                    }
                    break;
                case 125 :
                    // InternalAdbLexer.g:193:1446: '\\uA823'
                    {
                    match('\uA823'); 

                    }
                    break;
                case 126 :
                    // InternalAdbLexer.g:193:1455: '\\uA824'
                    {
                    match('\uA824'); 

                    }
                    break;
                case 127 :
                    // InternalAdbLexer.g:193:1464: '\\uA827'
                    {
                    match('\uA827'); 

                    }
                    break;
                case 128 :
                    // InternalAdbLexer.g:193:1473: '\\uA880'
                    {
                    match('\uA880'); 

                    }
                    break;
                case 129 :
                    // InternalAdbLexer.g:193:1482: '\\uA881'
                    {
                    match('\uA881'); 

                    }
                    break;
                case 130 :
                    // InternalAdbLexer.g:193:1491: '\\uA8B4' .. '\\uA8C3'
                    {
                    matchRange('\uA8B4','\uA8C3'); 

                    }
                    break;
                case 131 :
                    // InternalAdbLexer.g:193:1510: '\\uA952'
                    {
                    match('\uA952'); 

                    }
                    break;
                case 132 :
                    // InternalAdbLexer.g:193:1519: '\\uA953'
                    {
                    match('\uA953'); 

                    }
                    break;
                case 133 :
                    // InternalAdbLexer.g:193:1528: '\\uA983'
                    {
                    match('\uA983'); 

                    }
                    break;
                case 134 :
                    // InternalAdbLexer.g:193:1537: '\\uA9B4'
                    {
                    match('\uA9B4'); 

                    }
                    break;
                case 135 :
                    // InternalAdbLexer.g:193:1546: '\\uA9B5'
                    {
                    match('\uA9B5'); 

                    }
                    break;
                case 136 :
                    // InternalAdbLexer.g:193:1555: '\\uA9BA'
                    {
                    match('\uA9BA'); 

                    }
                    break;
                case 137 :
                    // InternalAdbLexer.g:193:1564: '\\uA9BB'
                    {
                    match('\uA9BB'); 

                    }
                    break;
                case 138 :
                    // InternalAdbLexer.g:193:1573: '\\uA9BD' .. '\\uA9C0'
                    {
                    matchRange('\uA9BD','\uA9C0'); 

                    }
                    break;
                case 139 :
                    // InternalAdbLexer.g:193:1592: '\\uAA2F'
                    {
                    match('\uAA2F'); 

                    }
                    break;
                case 140 :
                    // InternalAdbLexer.g:193:1601: '\\uAA30'
                    {
                    match('\uAA30'); 

                    }
                    break;
                case 141 :
                    // InternalAdbLexer.g:193:1610: '\\uAA33'
                    {
                    match('\uAA33'); 

                    }
                    break;
                case 142 :
                    // InternalAdbLexer.g:193:1619: '\\uAA34'
                    {
                    match('\uAA34'); 

                    }
                    break;
                case 143 :
                    // InternalAdbLexer.g:193:1628: '\\uAA4D'
                    {
                    match('\uAA4D'); 

                    }
                    break;
                case 144 :
                    // InternalAdbLexer.g:193:1637: '\\uAA7B'
                    {
                    match('\uAA7B'); 

                    }
                    break;
                case 145 :
                    // InternalAdbLexer.g:193:1646: '\\uAAEB'
                    {
                    match('\uAAEB'); 

                    }
                    break;
                case 146 :
                    // InternalAdbLexer.g:193:1655: '\\uAAEE'
                    {
                    match('\uAAEE'); 

                    }
                    break;
                case 147 :
                    // InternalAdbLexer.g:193:1664: '\\uAAEF'
                    {
                    match('\uAAEF'); 

                    }
                    break;
                case 148 :
                    // InternalAdbLexer.g:193:1673: '\\uAAF5'
                    {
                    match('\uAAF5'); 

                    }
                    break;
                case 149 :
                    // InternalAdbLexer.g:193:1682: '\\uABE3'
                    {
                    match('\uABE3'); 

                    }
                    break;
                case 150 :
                    // InternalAdbLexer.g:193:1691: '\\uABE4'
                    {
                    match('\uABE4'); 

                    }
                    break;
                case 151 :
                    // InternalAdbLexer.g:193:1700: '\\uABE6'
                    {
                    match('\uABE6'); 

                    }
                    break;
                case 152 :
                    // InternalAdbLexer.g:193:1709: '\\uABE7'
                    {
                    match('\uABE7'); 

                    }
                    break;
                case 153 :
                    // InternalAdbLexer.g:193:1718: '\\uABE9'
                    {
                    match('\uABE9'); 

                    }
                    break;
                case 154 :
                    // InternalAdbLexer.g:193:1727: '\\uABEA'
                    {
                    match('\uABEA'); 

                    }
                    break;
                case 155 :
                    // InternalAdbLexer.g:193:1736: '\\uABEC'
                    {
                    match('\uABEC'); 

                    }
                    break;
                case 156 :
                    // InternalAdbLexer.g:193:1745: '\\u11000'
                    {
                    match("\u11000"); 


                    }
                    break;
                case 157 :
                    // InternalAdbLexer.g:193:1755: '\\u11002'
                    {
                    match("\u11002"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MARKSPACING_COMBINING"

    // $ANTLR start "RULE_OTHER_FORMAT"
    public final void mRULE_OTHER_FORMAT() throws RecognitionException {
        try {
            // InternalAdbLexer.g:195:28: ( ( '\\u00AD' | '\\u0600' .. '\\u0604' | '\\u06DD' | '\\u070F' | '\\u200B' .. '\\u200F' | '\\u202A' .. '\\u202E' | '\\u2060' .. '\\u2064' | '\\u206A' .. '\\u206F' | '\\uFEFF' | '\\uFFF9' .. '\\uFFFB' ) )
            // InternalAdbLexer.g:195:30: ( '\\u00AD' | '\\u0600' .. '\\u0604' | '\\u06DD' | '\\u070F' | '\\u200B' .. '\\u200F' | '\\u202A' .. '\\u202E' | '\\u2060' .. '\\u2064' | '\\u206A' .. '\\u206F' | '\\uFEFF' | '\\uFFF9' .. '\\uFFFB' )
            {
            if ( input.LA(1)=='\u00AD'||(input.LA(1)>='\u0600' && input.LA(1)<='\u0604')||input.LA(1)=='\u06DD'||input.LA(1)=='\u070F'||(input.LA(1)>='\u200B' && input.LA(1)<='\u200F')||(input.LA(1)>='\u202A' && input.LA(1)<='\u202E')||(input.LA(1)>='\u2060' && input.LA(1)<='\u2064')||(input.LA(1)>='\u206A' && input.LA(1)<='\u206F')||input.LA(1)=='\uFEFF'||(input.LA(1)>='\uFFF9' && input.LA(1)<='\uFFFB') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OTHER_FORMAT"

    // $ANTLR start "RULE_MARKNON_SPACING"
    public final void mRULE_MARKNON_SPACING() throws RecognitionException {
        try {
            // InternalAdbLexer.g:197:31: ( ( '\\u0300' .. '\\u036F' | '\\u0483' .. '\\u0487' | '\\u0591' .. '\\u05BD' | '\\u05BF' | '\\u05C1' | '\\u05C2' | '\\u05C4' | '\\u05C5' | '\\u05C7' | '\\u0610' .. '\\u061A' | '\\u064B' .. '\\u065F' | '\\u0670' | '\\u06D6' .. '\\u06DC' | '\\u06DF' .. '\\u06E4' | '\\u06E7' | '\\u06E8' | '\\u06EA' .. '\\u06ED' | '\\u0711' | '\\u0730' .. '\\u074A' | '\\u07A6' .. '\\u07B0' | '\\u07EB' .. '\\u07F3' | '\\u0816' .. '\\u0819' | '\\u081B' .. '\\u0823' | '\\u0825' .. '\\u0827' | '\\u0829' .. '\\u082D' | '\\u0859' .. '\\u085B' | '\\u08E4' .. '\\u08FE' | '\\u0900' .. '\\u0902' | '\\u093A' | '\\u093C' | '\\u0941' .. '\\u0948' | '\\u094D' | '\\u0951' .. '\\u0957' | '\\u0962' | '\\u0963' | '\\u0981' | '\\u09BC' | '\\u09C1' .. '\\u09C4' | '\\u09CD' | '\\u09E2' | '\\u09E3' | '\\u0A01' | '\\u0A02' | '\\u0A3C' | '\\u0A41' | '\\u0A42' | '\\u0A47' | '\\u0A48' | '\\u0A4B' .. '\\u0A4D' | '\\u0A51' | '\\u0A70' | '\\u0A71' | '\\u0A75' | '\\u0A81' | '\\u0A82' | '\\u0ABC' | '\\u0AC1' .. '\\u0AC5' | '\\u0AC7' | '\\u0AC8' | '\\u0ACD' | '\\u0AE2' | '\\u0AE3' | '\\u0B01' | '\\u0B3C' | '\\u0B3F' | '\\u0B41' .. '\\u0B44' | '\\u0B4D' | '\\u0B56' | '\\u0B62' | '\\u0B63' | '\\u0B82' | '\\u0BC0' | '\\u0BCD' | '\\u0C3E' .. '\\u0C40' | '\\u0C46' .. '\\u0C48' | '\\u0C4A' .. '\\u0C4D' | '\\u0C55' | '\\u0C56' | '\\u0C62' | '\\u0C63' | '\\u0CBC' | '\\u0CBF' | '\\u0CC6' | '\\u0CCC' | '\\u0CCD' | '\\u0CE2' | '\\u0CE3' | '\\u0D41' .. '\\u0D44' | '\\u0D4D' | '\\u0D62' | '\\u0D63' | '\\u0DCA' | '\\u0DD2' .. '\\u0DD4' | '\\u0DD6' | '\\u0E31' | '\\u0E34' .. '\\u0E3A' | '\\u0E47' .. '\\u0E4E' | '\\u0EB1' | '\\u0EB4' .. '\\u0EB9' | '\\u0EBB' | '\\u0EBC' | '\\u0EC8' .. '\\u0ECD' | '\\u0F18' | '\\u0F19' | '\\u0F35' | '\\u0F37' | '\\u0F39' | '\\u0F71' .. '\\u0F7E' | '\\u0F80' .. '\\u0F84' | '\\u0F86' | '\\u0F87' | '\\u0F8D' .. '\\u0F97' | '\\u0F99' .. '\\u0FBC' | '\\u0FC6' | '\\u102D' .. '\\u1030' | '\\u1032' .. '\\u1037' | '\\u1039' | '\\u103A' | '\\u103D' | '\\u103E' | '\\u1058' | '\\u1059' | '\\u105E' .. '\\u1060' | '\\u1071' .. '\\u1074' | '\\u1082' | '\\u1085' | '\\u1086' | '\\u108D' | '\\u109D' | '\\u135D' .. '\\u135F' | '\\u1712' .. '\\u1714' | '\\u1732' .. '\\u1734' | '\\u1752' | '\\u1753' | '\\u1772' | '\\u1773' | '\\u17B4' | '\\u17B5' | '\\u17B7' .. '\\u17BD' | '\\u17C6' | '\\u17C9' .. '\\u17D3' | '\\u17DD' | '\\u180B' .. '\\u180D' | '\\u18A9' | '\\u1920' .. '\\u1922' | '\\u1927' | '\\u1928' | '\\u1932' | '\\u1939' .. '\\u193B' | '\\u1A17' | '\\u1A18' | '\\u1A56' | '\\u1A58' .. '\\u1A5E' | '\\u1A60' | '\\u1A62' | '\\u1A65' .. '\\u1A6C' | '\\u1A73' .. '\\u1A7C' | '\\u1A7F' | '\\u1B00' .. '\\u1B03' | '\\u1B34' | '\\u1B36' .. '\\u1B3A' | '\\u1B3C' | '\\u1B42' | '\\u1B6B' .. '\\u1B73' | '\\u1B80' | '\\u1B81' | '\\u1BA2' .. '\\u1BA5' | '\\u1BA8' | '\\u1BA9' | '\\u1BAB' | '\\u1BE6' | '\\u1BE8' | '\\u1BE9' | '\\u1BED' | '\\u1BEF' .. '\\u1BF1' | '\\u1C2C' .. '\\u1C33' | '\\u1C36' | '\\u1C37' | '\\u1CD0' .. '\\u1CD2' | '\\u1CD4' .. '\\u1CE0' | '\\u1CE2' .. '\\u1CE8' | '\\u1CED' | '\\u1CF4' | '\\u1DC0' .. '\\u1DE6' | '\\u1DFC' .. '\\u1DFF' | '\\u20D0' .. '\\u20DC' | '\\u20E1' | '\\u20E5' .. '\\u20F0' | '\\u2CEF' .. '\\u2CF1' | '\\u2D7F' | '\\u2DE0' .. '\\u2DFF' | '\\u302A' .. '\\u302D' | '\\u3099' | '\\u309A' | '\\uA66F' | '\\uA674' .. '\\uA67D' | '\\uA69F' | '\\uA6F0' | '\\uA6F1' | '\\uA802' | '\\uA806' | '\\uA80B' | '\\uA825' | '\\uA826' | '\\uA8C4' | '\\uA8E0' .. '\\uA8F1' | '\\uA926' .. '\\uA92D' | '\\uA947' .. '\\uA951' | '\\uA980' .. '\\uA982' | '\\uA9B3' | '\\uA9B6' .. '\\uA9B9' | '\\uA9BC' | '\\uAA29' .. '\\uAA2E' | '\\uAA31' | '\\uAA32' | '\\uAA35' | '\\uAA36' | '\\uAA43' | '\\uAA4C' | '\\uAAB0' | '\\uAAB2' .. '\\uAAB4' | '\\uAAB7' | '\\uAAB8' | '\\uAABE' | '\\uAABF' | '\\uAAC1' | '\\uAAEC' | '\\uAAED' | '\\uAAF6' | '\\uABE5' | '\\uABE8' | '\\uABED' | '\\uFB1E' | '\\uFE00' .. '\\uFE0F' | '\\uFE20' .. '\\uFE26' ) )
            // InternalAdbLexer.g:197:33: ( '\\u0300' .. '\\u036F' | '\\u0483' .. '\\u0487' | '\\u0591' .. '\\u05BD' | '\\u05BF' | '\\u05C1' | '\\u05C2' | '\\u05C4' | '\\u05C5' | '\\u05C7' | '\\u0610' .. '\\u061A' | '\\u064B' .. '\\u065F' | '\\u0670' | '\\u06D6' .. '\\u06DC' | '\\u06DF' .. '\\u06E4' | '\\u06E7' | '\\u06E8' | '\\u06EA' .. '\\u06ED' | '\\u0711' | '\\u0730' .. '\\u074A' | '\\u07A6' .. '\\u07B0' | '\\u07EB' .. '\\u07F3' | '\\u0816' .. '\\u0819' | '\\u081B' .. '\\u0823' | '\\u0825' .. '\\u0827' | '\\u0829' .. '\\u082D' | '\\u0859' .. '\\u085B' | '\\u08E4' .. '\\u08FE' | '\\u0900' .. '\\u0902' | '\\u093A' | '\\u093C' | '\\u0941' .. '\\u0948' | '\\u094D' | '\\u0951' .. '\\u0957' | '\\u0962' | '\\u0963' | '\\u0981' | '\\u09BC' | '\\u09C1' .. '\\u09C4' | '\\u09CD' | '\\u09E2' | '\\u09E3' | '\\u0A01' | '\\u0A02' | '\\u0A3C' | '\\u0A41' | '\\u0A42' | '\\u0A47' | '\\u0A48' | '\\u0A4B' .. '\\u0A4D' | '\\u0A51' | '\\u0A70' | '\\u0A71' | '\\u0A75' | '\\u0A81' | '\\u0A82' | '\\u0ABC' | '\\u0AC1' .. '\\u0AC5' | '\\u0AC7' | '\\u0AC8' | '\\u0ACD' | '\\u0AE2' | '\\u0AE3' | '\\u0B01' | '\\u0B3C' | '\\u0B3F' | '\\u0B41' .. '\\u0B44' | '\\u0B4D' | '\\u0B56' | '\\u0B62' | '\\u0B63' | '\\u0B82' | '\\u0BC0' | '\\u0BCD' | '\\u0C3E' .. '\\u0C40' | '\\u0C46' .. '\\u0C48' | '\\u0C4A' .. '\\u0C4D' | '\\u0C55' | '\\u0C56' | '\\u0C62' | '\\u0C63' | '\\u0CBC' | '\\u0CBF' | '\\u0CC6' | '\\u0CCC' | '\\u0CCD' | '\\u0CE2' | '\\u0CE3' | '\\u0D41' .. '\\u0D44' | '\\u0D4D' | '\\u0D62' | '\\u0D63' | '\\u0DCA' | '\\u0DD2' .. '\\u0DD4' | '\\u0DD6' | '\\u0E31' | '\\u0E34' .. '\\u0E3A' | '\\u0E47' .. '\\u0E4E' | '\\u0EB1' | '\\u0EB4' .. '\\u0EB9' | '\\u0EBB' | '\\u0EBC' | '\\u0EC8' .. '\\u0ECD' | '\\u0F18' | '\\u0F19' | '\\u0F35' | '\\u0F37' | '\\u0F39' | '\\u0F71' .. '\\u0F7E' | '\\u0F80' .. '\\u0F84' | '\\u0F86' | '\\u0F87' | '\\u0F8D' .. '\\u0F97' | '\\u0F99' .. '\\u0FBC' | '\\u0FC6' | '\\u102D' .. '\\u1030' | '\\u1032' .. '\\u1037' | '\\u1039' | '\\u103A' | '\\u103D' | '\\u103E' | '\\u1058' | '\\u1059' | '\\u105E' .. '\\u1060' | '\\u1071' .. '\\u1074' | '\\u1082' | '\\u1085' | '\\u1086' | '\\u108D' | '\\u109D' | '\\u135D' .. '\\u135F' | '\\u1712' .. '\\u1714' | '\\u1732' .. '\\u1734' | '\\u1752' | '\\u1753' | '\\u1772' | '\\u1773' | '\\u17B4' | '\\u17B5' | '\\u17B7' .. '\\u17BD' | '\\u17C6' | '\\u17C9' .. '\\u17D3' | '\\u17DD' | '\\u180B' .. '\\u180D' | '\\u18A9' | '\\u1920' .. '\\u1922' | '\\u1927' | '\\u1928' | '\\u1932' | '\\u1939' .. '\\u193B' | '\\u1A17' | '\\u1A18' | '\\u1A56' | '\\u1A58' .. '\\u1A5E' | '\\u1A60' | '\\u1A62' | '\\u1A65' .. '\\u1A6C' | '\\u1A73' .. '\\u1A7C' | '\\u1A7F' | '\\u1B00' .. '\\u1B03' | '\\u1B34' | '\\u1B36' .. '\\u1B3A' | '\\u1B3C' | '\\u1B42' | '\\u1B6B' .. '\\u1B73' | '\\u1B80' | '\\u1B81' | '\\u1BA2' .. '\\u1BA5' | '\\u1BA8' | '\\u1BA9' | '\\u1BAB' | '\\u1BE6' | '\\u1BE8' | '\\u1BE9' | '\\u1BED' | '\\u1BEF' .. '\\u1BF1' | '\\u1C2C' .. '\\u1C33' | '\\u1C36' | '\\u1C37' | '\\u1CD0' .. '\\u1CD2' | '\\u1CD4' .. '\\u1CE0' | '\\u1CE2' .. '\\u1CE8' | '\\u1CED' | '\\u1CF4' | '\\u1DC0' .. '\\u1DE6' | '\\u1DFC' .. '\\u1DFF' | '\\u20D0' .. '\\u20DC' | '\\u20E1' | '\\u20E5' .. '\\u20F0' | '\\u2CEF' .. '\\u2CF1' | '\\u2D7F' | '\\u2DE0' .. '\\u2DFF' | '\\u302A' .. '\\u302D' | '\\u3099' | '\\u309A' | '\\uA66F' | '\\uA674' .. '\\uA67D' | '\\uA69F' | '\\uA6F0' | '\\uA6F1' | '\\uA802' | '\\uA806' | '\\uA80B' | '\\uA825' | '\\uA826' | '\\uA8C4' | '\\uA8E0' .. '\\uA8F1' | '\\uA926' .. '\\uA92D' | '\\uA947' .. '\\uA951' | '\\uA980' .. '\\uA982' | '\\uA9B3' | '\\uA9B6' .. '\\uA9B9' | '\\uA9BC' | '\\uAA29' .. '\\uAA2E' | '\\uAA31' | '\\uAA32' | '\\uAA35' | '\\uAA36' | '\\uAA43' | '\\uAA4C' | '\\uAAB0' | '\\uAAB2' .. '\\uAAB4' | '\\uAAB7' | '\\uAAB8' | '\\uAABE' | '\\uAABF' | '\\uAAC1' | '\\uAAEC' | '\\uAAED' | '\\uAAF6' | '\\uABE5' | '\\uABE8' | '\\uABED' | '\\uFB1E' | '\\uFE00' .. '\\uFE0F' | '\\uFE20' .. '\\uFE26' )
            {
            if ( (input.LA(1)>='\u0300' && input.LA(1)<='\u036F')||(input.LA(1)>='\u0483' && input.LA(1)<='\u0487')||(input.LA(1)>='\u0591' && input.LA(1)<='\u05BD')||input.LA(1)=='\u05BF'||(input.LA(1)>='\u05C1' && input.LA(1)<='\u05C2')||(input.LA(1)>='\u05C4' && input.LA(1)<='\u05C5')||input.LA(1)=='\u05C7'||(input.LA(1)>='\u0610' && input.LA(1)<='\u061A')||(input.LA(1)>='\u064B' && input.LA(1)<='\u065F')||input.LA(1)=='\u0670'||(input.LA(1)>='\u06D6' && input.LA(1)<='\u06DC')||(input.LA(1)>='\u06DF' && input.LA(1)<='\u06E4')||(input.LA(1)>='\u06E7' && input.LA(1)<='\u06E8')||(input.LA(1)>='\u06EA' && input.LA(1)<='\u06ED')||input.LA(1)=='\u0711'||(input.LA(1)>='\u0730' && input.LA(1)<='\u074A')||(input.LA(1)>='\u07A6' && input.LA(1)<='\u07B0')||(input.LA(1)>='\u07EB' && input.LA(1)<='\u07F3')||(input.LA(1)>='\u0816' && input.LA(1)<='\u0819')||(input.LA(1)>='\u081B' && input.LA(1)<='\u0823')||(input.LA(1)>='\u0825' && input.LA(1)<='\u0827')||(input.LA(1)>='\u0829' && input.LA(1)<='\u082D')||(input.LA(1)>='\u0859' && input.LA(1)<='\u085B')||(input.LA(1)>='\u08E4' && input.LA(1)<='\u08FE')||(input.LA(1)>='\u0900' && input.LA(1)<='\u0902')||input.LA(1)=='\u093A'||input.LA(1)=='\u093C'||(input.LA(1)>='\u0941' && input.LA(1)<='\u0948')||input.LA(1)=='\u094D'||(input.LA(1)>='\u0951' && input.LA(1)<='\u0957')||(input.LA(1)>='\u0962' && input.LA(1)<='\u0963')||input.LA(1)=='\u0981'||input.LA(1)=='\u09BC'||(input.LA(1)>='\u09C1' && input.LA(1)<='\u09C4')||input.LA(1)=='\u09CD'||(input.LA(1)>='\u09E2' && input.LA(1)<='\u09E3')||(input.LA(1)>='\u0A01' && input.LA(1)<='\u0A02')||input.LA(1)=='\u0A3C'||(input.LA(1)>='\u0A41' && input.LA(1)<='\u0A42')||(input.LA(1)>='\u0A47' && input.LA(1)<='\u0A48')||(input.LA(1)>='\u0A4B' && input.LA(1)<='\u0A4D')||input.LA(1)=='\u0A51'||(input.LA(1)>='\u0A70' && input.LA(1)<='\u0A71')||input.LA(1)=='\u0A75'||(input.LA(1)>='\u0A81' && input.LA(1)<='\u0A82')||input.LA(1)=='\u0ABC'||(input.LA(1)>='\u0AC1' && input.LA(1)<='\u0AC5')||(input.LA(1)>='\u0AC7' && input.LA(1)<='\u0AC8')||input.LA(1)=='\u0ACD'||(input.LA(1)>='\u0AE2' && input.LA(1)<='\u0AE3')||input.LA(1)=='\u0B01'||input.LA(1)=='\u0B3C'||input.LA(1)=='\u0B3F'||(input.LA(1)>='\u0B41' && input.LA(1)<='\u0B44')||input.LA(1)=='\u0B4D'||input.LA(1)=='\u0B56'||(input.LA(1)>='\u0B62' && input.LA(1)<='\u0B63')||input.LA(1)=='\u0B82'||input.LA(1)=='\u0BC0'||input.LA(1)=='\u0BCD'||(input.LA(1)>='\u0C3E' && input.LA(1)<='\u0C40')||(input.LA(1)>='\u0C46' && input.LA(1)<='\u0C48')||(input.LA(1)>='\u0C4A' && input.LA(1)<='\u0C4D')||(input.LA(1)>='\u0C55' && input.LA(1)<='\u0C56')||(input.LA(1)>='\u0C62' && input.LA(1)<='\u0C63')||input.LA(1)=='\u0CBC'||input.LA(1)=='\u0CBF'||input.LA(1)=='\u0CC6'||(input.LA(1)>='\u0CCC' && input.LA(1)<='\u0CCD')||(input.LA(1)>='\u0CE2' && input.LA(1)<='\u0CE3')||(input.LA(1)>='\u0D41' && input.LA(1)<='\u0D44')||input.LA(1)=='\u0D4D'||(input.LA(1)>='\u0D62' && input.LA(1)<='\u0D63')||input.LA(1)=='\u0DCA'||(input.LA(1)>='\u0DD2' && input.LA(1)<='\u0DD4')||input.LA(1)=='\u0DD6'||input.LA(1)=='\u0E31'||(input.LA(1)>='\u0E34' && input.LA(1)<='\u0E3A')||(input.LA(1)>='\u0E47' && input.LA(1)<='\u0E4E')||input.LA(1)=='\u0EB1'||(input.LA(1)>='\u0EB4' && input.LA(1)<='\u0EB9')||(input.LA(1)>='\u0EBB' && input.LA(1)<='\u0EBC')||(input.LA(1)>='\u0EC8' && input.LA(1)<='\u0ECD')||(input.LA(1)>='\u0F18' && input.LA(1)<='\u0F19')||input.LA(1)=='\u0F35'||input.LA(1)=='\u0F37'||input.LA(1)=='\u0F39'||(input.LA(1)>='\u0F71' && input.LA(1)<='\u0F7E')||(input.LA(1)>='\u0F80' && input.LA(1)<='\u0F84')||(input.LA(1)>='\u0F86' && input.LA(1)<='\u0F87')||(input.LA(1)>='\u0F8D' && input.LA(1)<='\u0F97')||(input.LA(1)>='\u0F99' && input.LA(1)<='\u0FBC')||input.LA(1)=='\u0FC6'||(input.LA(1)>='\u102D' && input.LA(1)<='\u1030')||(input.LA(1)>='\u1032' && input.LA(1)<='\u1037')||(input.LA(1)>='\u1039' && input.LA(1)<='\u103A')||(input.LA(1)>='\u103D' && input.LA(1)<='\u103E')||(input.LA(1)>='\u1058' && input.LA(1)<='\u1059')||(input.LA(1)>='\u105E' && input.LA(1)<='\u1060')||(input.LA(1)>='\u1071' && input.LA(1)<='\u1074')||input.LA(1)=='\u1082'||(input.LA(1)>='\u1085' && input.LA(1)<='\u1086')||input.LA(1)=='\u108D'||input.LA(1)=='\u109D'||(input.LA(1)>='\u135D' && input.LA(1)<='\u135F')||(input.LA(1)>='\u1712' && input.LA(1)<='\u1714')||(input.LA(1)>='\u1732' && input.LA(1)<='\u1734')||(input.LA(1)>='\u1752' && input.LA(1)<='\u1753')||(input.LA(1)>='\u1772' && input.LA(1)<='\u1773')||(input.LA(1)>='\u17B4' && input.LA(1)<='\u17B5')||(input.LA(1)>='\u17B7' && input.LA(1)<='\u17BD')||input.LA(1)=='\u17C6'||(input.LA(1)>='\u17C9' && input.LA(1)<='\u17D3')||input.LA(1)=='\u17DD'||(input.LA(1)>='\u180B' && input.LA(1)<='\u180D')||input.LA(1)=='\u18A9'||(input.LA(1)>='\u1920' && input.LA(1)<='\u1922')||(input.LA(1)>='\u1927' && input.LA(1)<='\u1928')||input.LA(1)=='\u1932'||(input.LA(1)>='\u1939' && input.LA(1)<='\u193B')||(input.LA(1)>='\u1A17' && input.LA(1)<='\u1A18')||input.LA(1)=='\u1A56'||(input.LA(1)>='\u1A58' && input.LA(1)<='\u1A5E')||input.LA(1)=='\u1A60'||input.LA(1)=='\u1A62'||(input.LA(1)>='\u1A65' && input.LA(1)<='\u1A6C')||(input.LA(1)>='\u1A73' && input.LA(1)<='\u1A7C')||input.LA(1)=='\u1A7F'||(input.LA(1)>='\u1B00' && input.LA(1)<='\u1B03')||input.LA(1)=='\u1B34'||(input.LA(1)>='\u1B36' && input.LA(1)<='\u1B3A')||input.LA(1)=='\u1B3C'||input.LA(1)=='\u1B42'||(input.LA(1)>='\u1B6B' && input.LA(1)<='\u1B73')||(input.LA(1)>='\u1B80' && input.LA(1)<='\u1B81')||(input.LA(1)>='\u1BA2' && input.LA(1)<='\u1BA5')||(input.LA(1)>='\u1BA8' && input.LA(1)<='\u1BA9')||input.LA(1)=='\u1BAB'||input.LA(1)=='\u1BE6'||(input.LA(1)>='\u1BE8' && input.LA(1)<='\u1BE9')||input.LA(1)=='\u1BED'||(input.LA(1)>='\u1BEF' && input.LA(1)<='\u1BF1')||(input.LA(1)>='\u1C2C' && input.LA(1)<='\u1C33')||(input.LA(1)>='\u1C36' && input.LA(1)<='\u1C37')||(input.LA(1)>='\u1CD0' && input.LA(1)<='\u1CD2')||(input.LA(1)>='\u1CD4' && input.LA(1)<='\u1CE0')||(input.LA(1)>='\u1CE2' && input.LA(1)<='\u1CE8')||input.LA(1)=='\u1CED'||input.LA(1)=='\u1CF4'||(input.LA(1)>='\u1DC0' && input.LA(1)<='\u1DE6')||(input.LA(1)>='\u1DFC' && input.LA(1)<='\u1DFF')||(input.LA(1)>='\u20D0' && input.LA(1)<='\u20DC')||input.LA(1)=='\u20E1'||(input.LA(1)>='\u20E5' && input.LA(1)<='\u20F0')||(input.LA(1)>='\u2CEF' && input.LA(1)<='\u2CF1')||input.LA(1)=='\u2D7F'||(input.LA(1)>='\u2DE0' && input.LA(1)<='\u2DFF')||(input.LA(1)>='\u302A' && input.LA(1)<='\u302D')||(input.LA(1)>='\u3099' && input.LA(1)<='\u309A')||input.LA(1)=='\uA66F'||(input.LA(1)>='\uA674' && input.LA(1)<='\uA67D')||input.LA(1)=='\uA69F'||(input.LA(1)>='\uA6F0' && input.LA(1)<='\uA6F1')||input.LA(1)=='\uA802'||input.LA(1)=='\uA806'||input.LA(1)=='\uA80B'||(input.LA(1)>='\uA825' && input.LA(1)<='\uA826')||input.LA(1)=='\uA8C4'||(input.LA(1)>='\uA8E0' && input.LA(1)<='\uA8F1')||(input.LA(1)>='\uA926' && input.LA(1)<='\uA92D')||(input.LA(1)>='\uA947' && input.LA(1)<='\uA951')||(input.LA(1)>='\uA980' && input.LA(1)<='\uA982')||input.LA(1)=='\uA9B3'||(input.LA(1)>='\uA9B6' && input.LA(1)<='\uA9B9')||input.LA(1)=='\uA9BC'||(input.LA(1)>='\uAA29' && input.LA(1)<='\uAA2E')||(input.LA(1)>='\uAA31' && input.LA(1)<='\uAA32')||(input.LA(1)>='\uAA35' && input.LA(1)<='\uAA36')||input.LA(1)=='\uAA43'||input.LA(1)=='\uAA4C'||input.LA(1)=='\uAAB0'||(input.LA(1)>='\uAAB2' && input.LA(1)<='\uAAB4')||(input.LA(1)>='\uAAB7' && input.LA(1)<='\uAAB8')||(input.LA(1)>='\uAABE' && input.LA(1)<='\uAABF')||input.LA(1)=='\uAAC1'||(input.LA(1)>='\uAAEC' && input.LA(1)<='\uAAED')||input.LA(1)=='\uAAF6'||input.LA(1)=='\uABE5'||input.LA(1)=='\uABE8'||input.LA(1)=='\uABED'||input.LA(1)=='\uFB1E'||(input.LA(1)>='\uFE00' && input.LA(1)<='\uFE0F')||(input.LA(1)>='\uFE20' && input.LA(1)<='\uFE26') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MARKNON_SPACING"

    // $ANTLR start "RULE_PUNCTUATION_CONNECTOR"
    public final void mRULE_PUNCTUATION_CONNECTOR() throws RecognitionException {
        try {
            // InternalAdbLexer.g:199:37: ( ( '_' | '\\u203F' | '\\u2040' | '\\u2054' | '\\uFE33' | '\\uFE34' | '\\uFE4D' .. '\\uFE4F' | '\\uFF3F' ) )
            // InternalAdbLexer.g:199:39: ( '_' | '\\u203F' | '\\u2040' | '\\u2054' | '\\uFE33' | '\\uFE34' | '\\uFE4D' .. '\\uFE4F' | '\\uFF3F' )
            {
            if ( input.LA(1)=='_'||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||input.LA(1)=='\u2054'||(input.LA(1)>='\uFE33' && input.LA(1)<='\uFE34')||(input.LA(1)>='\uFE4D' && input.LA(1)<='\uFE4F')||input.LA(1)=='\uFF3F' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_PUNCTUATION_CONNECTOR"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            // InternalAdbLexer.g:201:24: ( ( 'E' | 'e' ) ( '-' | ( '+' )? ) RULE_NUMERAL )
            // InternalAdbLexer.g:201:26: ( 'E' | 'e' ) ( '-' | ( '+' )? ) RULE_NUMERAL
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAdbLexer.g:201:36: ( '-' | ( '+' )? )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='-') ) {
                alt11=1;
            }
            else if ( (LA11_0=='+'||(LA11_0>='0' && LA11_0<='9')) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAdbLexer.g:201:37: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 2 :
                    // InternalAdbLexer.g:201:41: ( '+' )?
                    {
                    // InternalAdbLexer.g:201:41: ( '+' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='+') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalAdbLexer.g:201:41: '+'
                            {
                            match('+'); 

                            }
                            break;

                    }


                    }
                    break;

            }

            mRULE_NUMERAL(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalAdbLexer.g:203:21: ( ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) )
            // InternalAdbLexer.g:203:23: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_BASED_LITERAL"
    public final void mRULE_BASED_LITERAL() throws RecognitionException {
        try {
            // InternalAdbLexer.g:205:29: ( RULE_BASE '#' RULE_BASED_NUMERAL ( RULE_P RULE_BASED_NUMERAL )? '#' ( RULE_EXPONENT )? )
            // InternalAdbLexer.g:205:31: RULE_BASE '#' RULE_BASED_NUMERAL ( RULE_P RULE_BASED_NUMERAL )? '#' ( RULE_EXPONENT )?
            {
            mRULE_BASE(); 
            match('#'); 
            mRULE_BASED_NUMERAL(); 
            // InternalAdbLexer.g:205:64: ( RULE_P RULE_BASED_NUMERAL )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='.') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAdbLexer.g:205:65: RULE_P RULE_BASED_NUMERAL
                    {
                    mRULE_P(); 
                    mRULE_BASED_NUMERAL(); 

                    }
                    break;

            }

            match('#'); 
            // InternalAdbLexer.g:205:97: ( RULE_EXPONENT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='E'||LA13_0=='e') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAdbLexer.g:205:97: RULE_EXPONENT
                    {
                    mRULE_EXPONENT(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BASED_LITERAL"

    // $ANTLR start "RULE_BASE"
    public final void mRULE_BASE() throws RecognitionException {
        try {
            // InternalAdbLexer.g:207:20: ( RULE_NUMERAL )
            // InternalAdbLexer.g:207:22: RULE_NUMERAL
            {
            mRULE_NUMERAL(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BASE"

    // $ANTLR start "RULE_BASED_NUMERAL"
    public final void mRULE_BASED_NUMERAL() throws RecognitionException {
        try {
            // InternalAdbLexer.g:209:29: ( RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )* )
            // InternalAdbLexer.g:209:31: RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )*
            {
            mRULE_EXTENDED_DIGIT(); 
            // InternalAdbLexer.g:209:51: ( ( '_' )? RULE_EXTENDED_DIGIT )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='F')||LA15_0=='_') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAdbLexer.g:209:52: ( '_' )? RULE_EXTENDED_DIGIT
            	    {
            	    // InternalAdbLexer.g:209:52: ( '_' )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0=='_') ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalAdbLexer.g:209:52: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    mRULE_EXTENDED_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BASED_NUMERAL"

    // $ANTLR start "RULE_EXTENDED_DIGIT"
    public final void mRULE_EXTENDED_DIGIT() throws RecognitionException {
        try {
            // InternalAdbLexer.g:211:30: ( ( RULE_DIGIT | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' ) )
            // InternalAdbLexer.g:211:32: ( RULE_DIGIT | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXTENDED_DIGIT"

    // $ANTLR start "RULE_CHARACTER_LITERAL"
    public final void mRULE_CHARACTER_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_CHARACTER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:213:24: ( '\\'' RULE_GRAPHIC_CHARACTER '\\'' )
            // InternalAdbLexer.g:213:26: '\\'' RULE_GRAPHIC_CHARACTER '\\''
            {
            match('\''); 
            mRULE_GRAPHIC_CHARACTER(); 
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHARACTER_LITERAL"

    // $ANTLR start "RULE_GRAPHIC_CHARACTER"
    public final void mRULE_GRAPHIC_CHARACTER() throws RecognitionException {
        try {
            // InternalAdbLexer.g:215:33: ( ' ' .. '\\u1FFF' )
            // InternalAdbLexer.g:215:35: ' ' .. '\\u1FFF'
            {
            matchRange(' ','\u1FFF'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_GRAPHIC_CHARACTER"

    // $ANTLR start "RULE_OPERATOR_SYMBOL"
    public final void mRULE_OPERATOR_SYMBOL() throws RecognitionException {
        try {
            int _type = RULE_OPERATOR_SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:217:22: ( '\"' ( 'and' | 'or' | 'xor' | '=' | '/=' | '<' | '<=' | '>' | '>=' | '-' | '+' | '&' | '**' | '*' | '/' | 'mod' | 'rem' | 'abs' | 'not' ) '\"' )
            // InternalAdbLexer.g:217:24: '\"' ( 'and' | 'or' | 'xor' | '=' | '/=' | '<' | '<=' | '>' | '>=' | '-' | '+' | '&' | '**' | '*' | '/' | 'mod' | 'rem' | 'abs' | 'not' ) '\"'
            {
            match('\"'); 
            // InternalAdbLexer.g:217:28: ( 'and' | 'or' | 'xor' | '=' | '/=' | '<' | '<=' | '>' | '>=' | '-' | '+' | '&' | '**' | '*' | '/' | 'mod' | 'rem' | 'abs' | 'not' )
            int alt16=19;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalAdbLexer.g:217:29: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 2 :
                    // InternalAdbLexer.g:217:35: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 3 :
                    // InternalAdbLexer.g:217:40: 'xor'
                    {
                    match("xor"); 


                    }
                    break;
                case 4 :
                    // InternalAdbLexer.g:217:46: '='
                    {
                    match('='); 

                    }
                    break;
                case 5 :
                    // InternalAdbLexer.g:217:50: '/='
                    {
                    match("/="); 


                    }
                    break;
                case 6 :
                    // InternalAdbLexer.g:217:55: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 7 :
                    // InternalAdbLexer.g:217:59: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 8 :
                    // InternalAdbLexer.g:217:64: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 9 :
                    // InternalAdbLexer.g:217:68: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 10 :
                    // InternalAdbLexer.g:217:73: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 11 :
                    // InternalAdbLexer.g:217:77: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 12 :
                    // InternalAdbLexer.g:217:81: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 13 :
                    // InternalAdbLexer.g:217:85: '**'
                    {
                    match("**"); 


                    }
                    break;
                case 14 :
                    // InternalAdbLexer.g:217:90: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 15 :
                    // InternalAdbLexer.g:217:94: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 16 :
                    // InternalAdbLexer.g:217:98: 'mod'
                    {
                    match("mod"); 


                    }
                    break;
                case 17 :
                    // InternalAdbLexer.g:217:104: 'rem'
                    {
                    match("rem"); 


                    }
                    break;
                case 18 :
                    // InternalAdbLexer.g:217:110: 'abs'
                    {
                    match("abs"); 


                    }
                    break;
                case 19 :
                    // InternalAdbLexer.g:217:116: 'not'
                    {
                    match("not"); 


                    }
                    break;

            }

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPERATOR_SYMBOL"

    // $ANTLR start "RULE_STRING_LITERAL"
    public final void mRULE_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:219:21: ( '\"' ( RULE_STRING_ELEMENT )* '\"' )
            // InternalAdbLexer.g:219:23: '\"' ( RULE_STRING_ELEMENT )* '\"'
            {
            match('\"'); 
            // InternalAdbLexer.g:219:27: ( RULE_STRING_ELEMENT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=' ' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='\u1FFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAdbLexer.g:219:27: RULE_STRING_ELEMENT
            	    {
            	    mRULE_STRING_ELEMENT(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_LITERAL"

    // $ANTLR start "RULE_STRING_ELEMENT"
    public final void mRULE_STRING_ELEMENT() throws RecognitionException {
        try {
            // InternalAdbLexer.g:221:30: ( RULE_NONQUOTATION_MARKGRAPHIC_CHARACTER )
            // InternalAdbLexer.g:221:32: RULE_NONQUOTATION_MARKGRAPHIC_CHARACTER
            {
            mRULE_NONQUOTATION_MARKGRAPHIC_CHARACTER(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_ELEMENT"

    // $ANTLR start "RULE_NONQUOTATION_MARKGRAPHIC_CHARACTER"
    public final void mRULE_NONQUOTATION_MARKGRAPHIC_CHARACTER() throws RecognitionException {
        try {
            // InternalAdbLexer.g:223:50: ( ( ' ' .. '!' | '#' .. '\\u1FFF' ) )
            // InternalAdbLexer.g:223:52: ( ' ' .. '!' | '#' .. '\\u1FFF' )
            {
            if ( (input.LA(1)>=' ' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\u1FFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NONQUOTATION_MARKGRAPHIC_CHARACTER"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:225:17: ( '--' ( RULE_NONEND_OFLINE_CHARACTER )* )
            // InternalAdbLexer.g:225:19: '--' ( RULE_NONEND_OFLINE_CHARACTER )*
            {
            match("--"); 

            // InternalAdbLexer.g:225:24: ( RULE_NONEND_OFLINE_CHARACTER )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=' ' && LA18_0<='\u1FFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAdbLexer.g:225:24: RULE_NONEND_OFLINE_CHARACTER
            	    {
            	    mRULE_NONEND_OFLINE_CHARACTER(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_NONEND_OFLINE_CHARACTER"
    public final void mRULE_NONEND_OFLINE_CHARACTER() throws RecognitionException {
        try {
            // InternalAdbLexer.g:227:39: ( RULE_GRAPHIC_CHARACTER )
            // InternalAdbLexer.g:227:41: RULE_GRAPHIC_CHARACTER
            {
            mRULE_GRAPHIC_CHARACTER(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NONEND_OFLINE_CHARACTER"

    // $ANTLR start "RULE_PV"
    public final void mRULE_PV() throws RecognitionException {
        try {
            int _type = RULE_PV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:229:9: ( ';' )
            // InternalAdbLexer.g:229:11: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PV"

    // $ANTLR start "RULE_DP"
    public final void mRULE_DP() throws RecognitionException {
        try {
            int _type = RULE_DP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:231:9: ( ':' )
            // InternalAdbLexer.g:231:11: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DP"

    // $ANTLR start "RULE_P"
    public final void mRULE_P() throws RecognitionException {
        try {
            int _type = RULE_P;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:233:8: ( '.' )
            // InternalAdbLexer.g:233:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_P"

    // $ANTLR start "RULE_V"
    public final void mRULE_V() throws RecognitionException {
        try {
            int _type = RULE_V;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:235:8: ( ',' )
            // InternalAdbLexer.g:235:10: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_V"

    // $ANTLR start "RULE_PG"
    public final void mRULE_PG() throws RecognitionException {
        try {
            int _type = RULE_PG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:237:9: ( '(' )
            // InternalAdbLexer.g:237:11: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PG"

    // $ANTLR start "RULE_PD"
    public final void mRULE_PD() throws RecognitionException {
        try {
            int _type = RULE_PD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:239:9: ( ')' )
            // InternalAdbLexer.g:239:11: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PD"

    // $ANTLR start "RULE_ET_COM"
    public final void mRULE_ET_COM() throws RecognitionException {
        try {
            int _type = RULE_ET_COM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:241:13: ( '&' )
            // InternalAdbLexer.g:241:15: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ET_COM"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:243:11: ( '+' )
            // InternalAdbLexer.g:243:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_MOINS"
    public final void mRULE_MOINS() throws RecognitionException {
        try {
            int _type = RULE_MOINS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:245:12: ( '-' )
            // InternalAdbLexer.g:245:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MOINS"

    // $ANTLR start "RULE_ETOI"
    public final void mRULE_ETOI() throws RecognitionException {
        try {
            int _type = RULE_ETOI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:247:11: ( '*' )
            // InternalAdbLexer.g:247:13: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ETOI"

    // $ANTLR start "RULE_ETOI2"
    public final void mRULE_ETOI2() throws RecognitionException {
        try {
            int _type = RULE_ETOI2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:249:12: ( '**' )
            // InternalAdbLexer.g:249:14: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ETOI2"

    // $ANTLR start "RULE_SLASH"
    public final void mRULE_SLASH() throws RecognitionException {
        try {
            int _type = RULE_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:251:12: ( '/' )
            // InternalAdbLexer.g:251:14: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLASH"

    // $ANTLR start "RULE_QUOTE"
    public final void mRULE_QUOTE() throws RecognitionException {
        try {
            int _type = RULE_QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:253:12: ( '\\'' )
            // InternalAdbLexer.g:253:14: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUOTE"

    // $ANTLR start "RULE_FLECHE"
    public final void mRULE_FLECHE() throws RecognitionException {
        try {
            int _type = RULE_FLECHE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:255:13: ( '=>' )
            // InternalAdbLexer.g:255:15: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLECHE"

    // $ANTLR start "RULE_BV"
    public final void mRULE_BV() throws RecognitionException {
        try {
            int _type = RULE_BV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:257:9: ( ( '|' | '!' ) )
            // InternalAdbLexer.g:257:11: ( '|' | '!' )
            {
            if ( input.LA(1)=='!'||input.LA(1)=='|' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BV"

    // $ANTLR start "RULE_DPE"
    public final void mRULE_DPE() throws RecognitionException {
        try {
            int _type = RULE_DPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:259:10: ( ':=' )
            // InternalAdbLexer.g:259:12: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DPE"

    // $ANTLR start "RULE_PP"
    public final void mRULE_PP() throws RecognitionException {
        try {
            int _type = RULE_PP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:261:9: ( '..' )
            // InternalAdbLexer.g:261:11: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PP"

    // $ANTLR start "RULE_BOIT"
    public final void mRULE_BOIT() throws RecognitionException {
        try {
            int _type = RULE_BOIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:263:11: ( '<>' )
            // InternalAdbLexer.g:263:13: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOIT"

    // $ANTLR start "RULE_EG"
    public final void mRULE_EG() throws RecognitionException {
        try {
            int _type = RULE_EG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:265:9: ( '=' )
            // InternalAdbLexer.g:265:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EG"

    // $ANTLR start "RULE_DIFF"
    public final void mRULE_DIFF() throws RecognitionException {
        try {
            int _type = RULE_DIFF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:267:11: ( '/=' )
            // InternalAdbLexer.g:267:13: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIFF"

    // $ANTLR start "RULE_INF"
    public final void mRULE_INF() throws RecognitionException {
        try {
            int _type = RULE_INF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:269:10: ( '<' )
            // InternalAdbLexer.g:269:12: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INF"

    // $ANTLR start "RULE_INFE"
    public final void mRULE_INFE() throws RecognitionException {
        try {
            int _type = RULE_INFE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:271:11: ( '<=' )
            // InternalAdbLexer.g:271:13: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INFE"

    // $ANTLR start "RULE_SUP"
    public final void mRULE_SUP() throws RecognitionException {
        try {
            int _type = RULE_SUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:273:10: ( '>' )
            // InternalAdbLexer.g:273:12: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SUP"

    // $ANTLR start "RULE_SUPE"
    public final void mRULE_SUPE() throws RecognitionException {
        try {
            int _type = RULE_SUPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:275:11: ( '>=' )
            // InternalAdbLexer.g:275:13: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SUPE"

    // $ANTLR start "RULE_CHG"
    public final void mRULE_CHG() throws RecognitionException {
        try {
            int _type = RULE_CHG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:277:10: ( '<<' )
            // InternalAdbLexer.g:277:12: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHG"

    // $ANTLR start "RULE_CHD"
    public final void mRULE_CHD() throws RecognitionException {
        try {
            int _type = RULE_CHD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdbLexer.g:279:10: ( '>>' )
            // InternalAdbLexer.g:279:12: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHD"

    public void mTokens() throws RecognitionException {
        // InternalAdbLexer.g:1:8: ( RULE_ABORT_ | RULE_ABS_ | RULE_ABSTRACT_ | RULE_ACCEPT_ | RULE_ACCESS_ | RULE_ALIASED_ | RULE_ALL_ | RULE_AND_ | RULE_ARRAY_ | RULE_AT_ | RULE_BEGIN_ | RULE_BODY_ | RULE_CASE_ | RULE_CONSTANT_ | RULE_DECLARE_ | RULE_DELAY_ | RULE_DELTA_ | RULE_DIGITS_ | RULE_DO_ | RULE_ELSE_ | RULE_ELSIF_ | RULE_END_ | RULE_ENTRY_ | RULE_EXCEPTION_ | RULE_EXIT_ | RULE_FOR_ | RULE_FUNCTION_ | RULE_GENERIC_ | RULE_GOTO_ | RULE_IF_ | RULE_IN_ | RULE_INTERFACE_ | RULE_IS_ | RULE_LIMITED_ | RULE_LOOP_ | RULE_MOD_ | RULE_NEW_ | RULE_NOT_ | RULE_NULL_ | RULE_OF_ | RULE_OR_ | RULE_OTHERS_ | RULE_OUT_ | RULE_OVERRIDING_ | RULE_PACKAGE_ | RULE_PRAGMA_ | RULE_PRIVATE_ | RULE_PROCEDURE_ | RULE_PROTECTED_ | RULE_RAISE_ | RULE_RANGE_ | RULE_RECORD_ | RULE_REM_ | RULE_RENAMES_ | RULE_REQUEUE_ | RULE_RETURN_ | RULE_REVERSE_ | RULE_SELECT_ | RULE_SEPARATE_ | RULE_SUBTYPE_ | RULE_SYNCHRONIZED_ | RULE_TAGGED_ | RULE_TASK_ | RULE_TERMINATE_ | RULE_THEN_ | RULE_TYPE_ | RULE_UNTIL_ | RULE_USE_ | RULE_WHEN_ | RULE_WHILE_ | RULE_WITH_ | RULE_XOR_ | RULE_NUMERIC_LITERAL | RULE_WS | RULE_IDENTIFIER | RULE_CHARACTER_LITERAL | RULE_OPERATOR_SYMBOL | RULE_STRING_LITERAL | RULE_SL_COMMENT | RULE_PV | RULE_DP | RULE_P | RULE_V | RULE_PG | RULE_PD | RULE_ET_COM | RULE_PLUS | RULE_MOINS | RULE_ETOI | RULE_ETOI2 | RULE_SLASH | RULE_QUOTE | RULE_FLECHE | RULE_BV | RULE_DPE | RULE_PP | RULE_BOIT | RULE_EG | RULE_DIFF | RULE_INF | RULE_INFE | RULE_SUP | RULE_SUPE | RULE_CHG | RULE_CHD )
        int alt19=105;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // InternalAdbLexer.g:1:10: RULE_ABORT_
                {
                mRULE_ABORT_(); 

                }
                break;
            case 2 :
                // InternalAdbLexer.g:1:22: RULE_ABS_
                {
                mRULE_ABS_(); 

                }
                break;
            case 3 :
                // InternalAdbLexer.g:1:32: RULE_ABSTRACT_
                {
                mRULE_ABSTRACT_(); 

                }
                break;
            case 4 :
                // InternalAdbLexer.g:1:47: RULE_ACCEPT_
                {
                mRULE_ACCEPT_(); 

                }
                break;
            case 5 :
                // InternalAdbLexer.g:1:60: RULE_ACCESS_
                {
                mRULE_ACCESS_(); 

                }
                break;
            case 6 :
                // InternalAdbLexer.g:1:73: RULE_ALIASED_
                {
                mRULE_ALIASED_(); 

                }
                break;
            case 7 :
                // InternalAdbLexer.g:1:87: RULE_ALL_
                {
                mRULE_ALL_(); 

                }
                break;
            case 8 :
                // InternalAdbLexer.g:1:97: RULE_AND_
                {
                mRULE_AND_(); 

                }
                break;
            case 9 :
                // InternalAdbLexer.g:1:107: RULE_ARRAY_
                {
                mRULE_ARRAY_(); 

                }
                break;
            case 10 :
                // InternalAdbLexer.g:1:119: RULE_AT_
                {
                mRULE_AT_(); 

                }
                break;
            case 11 :
                // InternalAdbLexer.g:1:128: RULE_BEGIN_
                {
                mRULE_BEGIN_(); 

                }
                break;
            case 12 :
                // InternalAdbLexer.g:1:140: RULE_BODY_
                {
                mRULE_BODY_(); 

                }
                break;
            case 13 :
                // InternalAdbLexer.g:1:151: RULE_CASE_
                {
                mRULE_CASE_(); 

                }
                break;
            case 14 :
                // InternalAdbLexer.g:1:162: RULE_CONSTANT_
                {
                mRULE_CONSTANT_(); 

                }
                break;
            case 15 :
                // InternalAdbLexer.g:1:177: RULE_DECLARE_
                {
                mRULE_DECLARE_(); 

                }
                break;
            case 16 :
                // InternalAdbLexer.g:1:191: RULE_DELAY_
                {
                mRULE_DELAY_(); 

                }
                break;
            case 17 :
                // InternalAdbLexer.g:1:203: RULE_DELTA_
                {
                mRULE_DELTA_(); 

                }
                break;
            case 18 :
                // InternalAdbLexer.g:1:215: RULE_DIGITS_
                {
                mRULE_DIGITS_(); 

                }
                break;
            case 19 :
                // InternalAdbLexer.g:1:228: RULE_DO_
                {
                mRULE_DO_(); 

                }
                break;
            case 20 :
                // InternalAdbLexer.g:1:237: RULE_ELSE_
                {
                mRULE_ELSE_(); 

                }
                break;
            case 21 :
                // InternalAdbLexer.g:1:248: RULE_ELSIF_
                {
                mRULE_ELSIF_(); 

                }
                break;
            case 22 :
                // InternalAdbLexer.g:1:260: RULE_END_
                {
                mRULE_END_(); 

                }
                break;
            case 23 :
                // InternalAdbLexer.g:1:270: RULE_ENTRY_
                {
                mRULE_ENTRY_(); 

                }
                break;
            case 24 :
                // InternalAdbLexer.g:1:282: RULE_EXCEPTION_
                {
                mRULE_EXCEPTION_(); 

                }
                break;
            case 25 :
                // InternalAdbLexer.g:1:298: RULE_EXIT_
                {
                mRULE_EXIT_(); 

                }
                break;
            case 26 :
                // InternalAdbLexer.g:1:309: RULE_FOR_
                {
                mRULE_FOR_(); 

                }
                break;
            case 27 :
                // InternalAdbLexer.g:1:319: RULE_FUNCTION_
                {
                mRULE_FUNCTION_(); 

                }
                break;
            case 28 :
                // InternalAdbLexer.g:1:334: RULE_GENERIC_
                {
                mRULE_GENERIC_(); 

                }
                break;
            case 29 :
                // InternalAdbLexer.g:1:348: RULE_GOTO_
                {
                mRULE_GOTO_(); 

                }
                break;
            case 30 :
                // InternalAdbLexer.g:1:359: RULE_IF_
                {
                mRULE_IF_(); 

                }
                break;
            case 31 :
                // InternalAdbLexer.g:1:368: RULE_IN_
                {
                mRULE_IN_(); 

                }
                break;
            case 32 :
                // InternalAdbLexer.g:1:377: RULE_INTERFACE_
                {
                mRULE_INTERFACE_(); 

                }
                break;
            case 33 :
                // InternalAdbLexer.g:1:393: RULE_IS_
                {
                mRULE_IS_(); 

                }
                break;
            case 34 :
                // InternalAdbLexer.g:1:402: RULE_LIMITED_
                {
                mRULE_LIMITED_(); 

                }
                break;
            case 35 :
                // InternalAdbLexer.g:1:416: RULE_LOOP_
                {
                mRULE_LOOP_(); 

                }
                break;
            case 36 :
                // InternalAdbLexer.g:1:427: RULE_MOD_
                {
                mRULE_MOD_(); 

                }
                break;
            case 37 :
                // InternalAdbLexer.g:1:437: RULE_NEW_
                {
                mRULE_NEW_(); 

                }
                break;
            case 38 :
                // InternalAdbLexer.g:1:447: RULE_NOT_
                {
                mRULE_NOT_(); 

                }
                break;
            case 39 :
                // InternalAdbLexer.g:1:457: RULE_NULL_
                {
                mRULE_NULL_(); 

                }
                break;
            case 40 :
                // InternalAdbLexer.g:1:468: RULE_OF_
                {
                mRULE_OF_(); 

                }
                break;
            case 41 :
                // InternalAdbLexer.g:1:477: RULE_OR_
                {
                mRULE_OR_(); 

                }
                break;
            case 42 :
                // InternalAdbLexer.g:1:486: RULE_OTHERS_
                {
                mRULE_OTHERS_(); 

                }
                break;
            case 43 :
                // InternalAdbLexer.g:1:499: RULE_OUT_
                {
                mRULE_OUT_(); 

                }
                break;
            case 44 :
                // InternalAdbLexer.g:1:509: RULE_OVERRIDING_
                {
                mRULE_OVERRIDING_(); 

                }
                break;
            case 45 :
                // InternalAdbLexer.g:1:526: RULE_PACKAGE_
                {
                mRULE_PACKAGE_(); 

                }
                break;
            case 46 :
                // InternalAdbLexer.g:1:540: RULE_PRAGMA_
                {
                mRULE_PRAGMA_(); 

                }
                break;
            case 47 :
                // InternalAdbLexer.g:1:553: RULE_PRIVATE_
                {
                mRULE_PRIVATE_(); 

                }
                break;
            case 48 :
                // InternalAdbLexer.g:1:567: RULE_PROCEDURE_
                {
                mRULE_PROCEDURE_(); 

                }
                break;
            case 49 :
                // InternalAdbLexer.g:1:583: RULE_PROTECTED_
                {
                mRULE_PROTECTED_(); 

                }
                break;
            case 50 :
                // InternalAdbLexer.g:1:599: RULE_RAISE_
                {
                mRULE_RAISE_(); 

                }
                break;
            case 51 :
                // InternalAdbLexer.g:1:611: RULE_RANGE_
                {
                mRULE_RANGE_(); 

                }
                break;
            case 52 :
                // InternalAdbLexer.g:1:623: RULE_RECORD_
                {
                mRULE_RECORD_(); 

                }
                break;
            case 53 :
                // InternalAdbLexer.g:1:636: RULE_REM_
                {
                mRULE_REM_(); 

                }
                break;
            case 54 :
                // InternalAdbLexer.g:1:646: RULE_RENAMES_
                {
                mRULE_RENAMES_(); 

                }
                break;
            case 55 :
                // InternalAdbLexer.g:1:660: RULE_REQUEUE_
                {
                mRULE_REQUEUE_(); 

                }
                break;
            case 56 :
                // InternalAdbLexer.g:1:674: RULE_RETURN_
                {
                mRULE_RETURN_(); 

                }
                break;
            case 57 :
                // InternalAdbLexer.g:1:687: RULE_REVERSE_
                {
                mRULE_REVERSE_(); 

                }
                break;
            case 58 :
                // InternalAdbLexer.g:1:701: RULE_SELECT_
                {
                mRULE_SELECT_(); 

                }
                break;
            case 59 :
                // InternalAdbLexer.g:1:714: RULE_SEPARATE_
                {
                mRULE_SEPARATE_(); 

                }
                break;
            case 60 :
                // InternalAdbLexer.g:1:729: RULE_SUBTYPE_
                {
                mRULE_SUBTYPE_(); 

                }
                break;
            case 61 :
                // InternalAdbLexer.g:1:743: RULE_SYNCHRONIZED_
                {
                mRULE_SYNCHRONIZED_(); 

                }
                break;
            case 62 :
                // InternalAdbLexer.g:1:762: RULE_TAGGED_
                {
                mRULE_TAGGED_(); 

                }
                break;
            case 63 :
                // InternalAdbLexer.g:1:775: RULE_TASK_
                {
                mRULE_TASK_(); 

                }
                break;
            case 64 :
                // InternalAdbLexer.g:1:786: RULE_TERMINATE_
                {
                mRULE_TERMINATE_(); 

                }
                break;
            case 65 :
                // InternalAdbLexer.g:1:802: RULE_THEN_
                {
                mRULE_THEN_(); 

                }
                break;
            case 66 :
                // InternalAdbLexer.g:1:813: RULE_TYPE_
                {
                mRULE_TYPE_(); 

                }
                break;
            case 67 :
                // InternalAdbLexer.g:1:824: RULE_UNTIL_
                {
                mRULE_UNTIL_(); 

                }
                break;
            case 68 :
                // InternalAdbLexer.g:1:836: RULE_USE_
                {
                mRULE_USE_(); 

                }
                break;
            case 69 :
                // InternalAdbLexer.g:1:846: RULE_WHEN_
                {
                mRULE_WHEN_(); 

                }
                break;
            case 70 :
                // InternalAdbLexer.g:1:857: RULE_WHILE_
                {
                mRULE_WHILE_(); 

                }
                break;
            case 71 :
                // InternalAdbLexer.g:1:869: RULE_WITH_
                {
                mRULE_WITH_(); 

                }
                break;
            case 72 :
                // InternalAdbLexer.g:1:880: RULE_XOR_
                {
                mRULE_XOR_(); 

                }
                break;
            case 73 :
                // InternalAdbLexer.g:1:890: RULE_NUMERIC_LITERAL
                {
                mRULE_NUMERIC_LITERAL(); 

                }
                break;
            case 74 :
                // InternalAdbLexer.g:1:911: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 75 :
                // InternalAdbLexer.g:1:919: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 76 :
                // InternalAdbLexer.g:1:935: RULE_CHARACTER_LITERAL
                {
                mRULE_CHARACTER_LITERAL(); 

                }
                break;
            case 77 :
                // InternalAdbLexer.g:1:958: RULE_OPERATOR_SYMBOL
                {
                mRULE_OPERATOR_SYMBOL(); 

                }
                break;
            case 78 :
                // InternalAdbLexer.g:1:979: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 79 :
                // InternalAdbLexer.g:1:999: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 80 :
                // InternalAdbLexer.g:1:1015: RULE_PV
                {
                mRULE_PV(); 

                }
                break;
            case 81 :
                // InternalAdbLexer.g:1:1023: RULE_DP
                {
                mRULE_DP(); 

                }
                break;
            case 82 :
                // InternalAdbLexer.g:1:1031: RULE_P
                {
                mRULE_P(); 

                }
                break;
            case 83 :
                // InternalAdbLexer.g:1:1038: RULE_V
                {
                mRULE_V(); 

                }
                break;
            case 84 :
                // InternalAdbLexer.g:1:1045: RULE_PG
                {
                mRULE_PG(); 

                }
                break;
            case 85 :
                // InternalAdbLexer.g:1:1053: RULE_PD
                {
                mRULE_PD(); 

                }
                break;
            case 86 :
                // InternalAdbLexer.g:1:1061: RULE_ET_COM
                {
                mRULE_ET_COM(); 

                }
                break;
            case 87 :
                // InternalAdbLexer.g:1:1073: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 88 :
                // InternalAdbLexer.g:1:1083: RULE_MOINS
                {
                mRULE_MOINS(); 

                }
                break;
            case 89 :
                // InternalAdbLexer.g:1:1094: RULE_ETOI
                {
                mRULE_ETOI(); 

                }
                break;
            case 90 :
                // InternalAdbLexer.g:1:1104: RULE_ETOI2
                {
                mRULE_ETOI2(); 

                }
                break;
            case 91 :
                // InternalAdbLexer.g:1:1115: RULE_SLASH
                {
                mRULE_SLASH(); 

                }
                break;
            case 92 :
                // InternalAdbLexer.g:1:1126: RULE_QUOTE
                {
                mRULE_QUOTE(); 

                }
                break;
            case 93 :
                // InternalAdbLexer.g:1:1137: RULE_FLECHE
                {
                mRULE_FLECHE(); 

                }
                break;
            case 94 :
                // InternalAdbLexer.g:1:1149: RULE_BV
                {
                mRULE_BV(); 

                }
                break;
            case 95 :
                // InternalAdbLexer.g:1:1157: RULE_DPE
                {
                mRULE_DPE(); 

                }
                break;
            case 96 :
                // InternalAdbLexer.g:1:1166: RULE_PP
                {
                mRULE_PP(); 

                }
                break;
            case 97 :
                // InternalAdbLexer.g:1:1174: RULE_BOIT
                {
                mRULE_BOIT(); 

                }
                break;
            case 98 :
                // InternalAdbLexer.g:1:1184: RULE_EG
                {
                mRULE_EG(); 

                }
                break;
            case 99 :
                // InternalAdbLexer.g:1:1192: RULE_DIFF
                {
                mRULE_DIFF(); 

                }
                break;
            case 100 :
                // InternalAdbLexer.g:1:1202: RULE_INF
                {
                mRULE_INF(); 

                }
                break;
            case 101 :
                // InternalAdbLexer.g:1:1211: RULE_INFE
                {
                mRULE_INFE(); 

                }
                break;
            case 102 :
                // InternalAdbLexer.g:1:1221: RULE_SUP
                {
                mRULE_SUP(); 

                }
                break;
            case 103 :
                // InternalAdbLexer.g:1:1230: RULE_SUPE
                {
                mRULE_SUPE(); 

                }
                break;
            case 104 :
                // InternalAdbLexer.g:1:1240: RULE_CHG
                {
                mRULE_CHG(); 

                }
                break;
            case 105 :
                // InternalAdbLexer.g:1:1249: RULE_CHD
                {
                mRULE_CHD(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA1_eotS =
        "\1\uffff\1\2\2\uffff\1\2\1\uffff";
    static final String DFA1_eofS =
        "\6\uffff";
    static final String DFA1_minS =
        "\1\60\1\43\1\uffff\1\60\1\43\1\uffff";
    static final String DFA1_maxS =
        "\1\71\1\137\1\uffff\1\71\1\137\1\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\1\2\uffff\1\2";
    static final String DFA1_specialS =
        "\6\uffff}>";
    static final String[] DFA1_transitionS = {
            "\12\1",
            "\1\5\14\uffff\12\4\45\uffff\1\3",
            "",
            "\12\4",
            "\1\5\14\uffff\12\4\45\uffff\1\3",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "165:24: ( RULE_DECIMAL_LITERAL | RULE_BASED_LITERAL )";
        }
    }
    static final String DFA7_eotS =
        "\u00e8\uffff\1\u0208\u0120\uffff";
    static final String DFA7_eofS =
        "\u0209\uffff";
    static final String DFA7_minS =
        "\1\u00aa\u00e7\uffff\1\60\u0120\uffff";
    static final String DFA7_maxS =
        "\1\uffdc\u00e7\uffff\1\102\u0120\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\1\u00d3\1\u00d4\1\u00d5\1\u00d6\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db\1\u00dc\1\u00dd\1\u00de\1\u00df\1\u00e0\1\u00e1\1\u00e2\1\u00e3\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\uffff\1\u00e9\1\u00ea\1\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119\1\u011a\1\u011b\1\u011c\1\u011d\1\u011e\1\u011f\1\u0120\1\u0121\1\u0122\1\u0123\1\u0124\1\u0125\1\u0126\1\u0127\1\u0128\1\u0129\1\u012a\1\u012b\1\u012c\1\u012d\1\u012e\1\u012f\1\u0130\1\u0131\1\u0132\1\u0133\1\u0134\1\u0135\1\u0136\1\u0137\1\u0138\1\u0139\1\u013a\1\u013b\1\u013c\1\u013d\1\u013e\1\u013f\1\u0140\1\u0141\1\u0142\1\u0143\1\u0144\1\u0145\1\u0146\1\u0147\1\u0148\1\u0149\1\u014a\1\u014b\1\u014c\1\u014d\1\u014e\1\u014f\1\u0150\1\u0151\1\u0152\1\u0153\1\u0154\1\u0155\1\u0156\1\u0157\1\u0158\1\u0159\1\u015a\1\u015b\1\u015c\1\u015d\1\u015e\1\u015f\1\u0160\1\u0161\1\u0162\1\u0163\1\u0164\1\u0165\1\u0166\1\u0167\1\u0168\1\u0169\1\u016a\1\u016b\1\u016c\1\u016d\1\u016e\1\u016f\1\u0170\1\u0171\1\u0172\1\u0173\1\u0174\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\1\u017a\1\u017b\1\u017c\1\u017d\1\u017e\1\u017f\1\u0180\1\u0181\1\u0182\1\u0183\1\u0184\1\u0185\1\u0186\1\u0187\1\u0188\1\u0189\1\u018a\1\u018b\1\u018c\1\u018d\1\u018e\1\u018f\1\u0190\1\u0191\1\u0192\1\u0193\1\u0194\1\u0195\1\u0196\1\u0197\1\u0198\1\u0199\1\u019a\1\u019b\1\u019c\1\u019d\1\u019e\1\u019f\1\u01a0\1\u01a1\1\u01a2\1\u01a3\1\u01a4\1\u01a5\1\u01a6\1\u01a7\1\u01a8\1\u01a9\1\u01aa\1\u01ab\1\u01ac\1\u01ad\1\u01ae\1\u01af\1\u01b0\1\u01b1\1\u01b2\1\u01b3\1\u01b4\1\u01b5\1\u01b6\1\u01b7\1\u01b8\1\u01b9\1\u01ba\1\u01bb\1\u01bc\1\u01bd\1\u01be\1\u01bf\1\u01c0\1\u01c1\1\u01c2\1\u01c3\1\u01c4\1\u01c5\1\u01c6\1\u01c7\1\u01c8\1\u01c9\1\u01ca\1\u01cb\1\u01cc\1\u01cd\1\u01ce\1\u01cf\1\u01d0\1\u01d1\1\u01d2\1\u01d3\1\u01d4\1\u01d5\1\u01d6\1\u01d7\1\u01d8\1\u01d9\1\u01da\1\u01db\1\u01dc\1\u01dd\1\u01de\1\u01df\1\u01e0\1\u01e1\1\u01e2\1\u01e3\1\u01e4\1\u01e5\1\u01e6\1\u01e7\1\u01e8\1\u01e9\1\u01ea\1\u01eb\1\u01ec\1\u01ed\1\u01ee\1\u01ef\1\u01f0\1\u01f1\1\u01f2\1\u01f3\1\u01f4\1\u01f5\1\u01f6\1\u01f7\1\u01f8\1\u01f9\1\u01fa\1\u01fb\1\u01fc\1\u01fd\1\u01fe\1\u01ff\1\u0200\1\u0201\1\u0202\1\u0203\1\u0204\1\u0205\1\u0206\1\u0207\1\u00e8";
    static final String DFA7_specialS =
        "\u0209\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\17\uffff\1\2\u0100\uffff\1\3\4\uffff\1\4\2\uffff\1\5\u00d0\uffff\1\6\u033b\uffff\1\7\31\uffff\1\10\5\uffff\1\11\1\uffff\1\12\55\uffff\1\13\36\uffff\1\14\1\uffff\1\15\10\uffff\1\16\43\uffff\1\17\1\20\1\uffff\1\21\141\uffff\1\22\1\uffff\1\23\30\uffff\1\24\1\25\12\uffff\1\26\1\uffff\1\27\2\uffff\1\30\20\uffff\1\31\1\uffff\1\32\34\uffff\1\33\35\uffff\1\34\127\uffff\1\35\13\uffff\1\36\30\uffff\1\37\37\uffff\1\40\25\uffff\1\41\24\uffff\1\42\52\uffff\1\43\27\uffff\1\44\107\uffff\1\45\1\uffff\1\46\11\uffff\1\47\127\uffff\1\50\64\uffff\1\51\3\uffff\1\52\22\uffff\1\53\7\uffff\1\54\10\uffff\1\55\20\uffff\1\56\4\uffff\1\57\1\uffff\1\60\5\uffff\1\61\5\uffff\1\62\6\uffff\1\63\2\uffff\1\64\1\65\2\uffff\1\66\24\uffff\1\67\1\uffff\1\70\5\uffff\1\71\1\uffff\1\72\3\uffff\1\73\2\uffff\1\74\3\uffff\1\75\20\uffff\1\76\15\uffff\1\77\1\100\1\uffff\1\101\1\uffff\1\102\16\uffff\1\103\1\104\23\uffff\1\105\4\uffff\1\106\4\uffff\1\107\1\110\2\uffff\1\111\24\uffff\1\112\1\uffff\1\113\5\uffff\1\114\1\uffff\1\115\1\116\1\uffff\1\117\1\120\1\uffff\1\121\1\122\37\uffff\1\123\2\uffff\1\124\1\uffff\1\125\23\uffff\1\126\1\uffff\1\127\20\uffff\1\130\7\uffff\1\131\1\uffff\1\132\1\uffff\1\133\1\uffff\1\134\24\uffff\1\135\1\uffff\1\136\5\uffff\1\137\1\uffff\1\140\1\141\1\uffff\1\142\3\uffff\1\143\3\uffff\1\144\22\uffff\1\145\17\uffff\1\146\1\147\43\uffff\1\150\6\uffff\1\151\2\uffff\1\152\1\153\2\uffff\1\154\24\uffff\1\155\1\uffff\1\156\5\uffff\1\157\1\uffff\1\160\1\161\1\uffff\1\162\3\uffff\1\163\3\uffff\1\164\36\uffff\1\165\1\166\1\uffff\1\167\1\uffff\1\170\17\uffff\1\171\21\uffff\1\172\1\uffff\1\173\4\uffff\1\174\3\uffff\1\175\1\uffff\1\176\1\uffff\1\177\2\uffff\1\u0080\3\uffff\1\u0081\1\u0082\1\uffff\1\u0083\1\uffff\1\u0084\1\u0085\3\uffff\1\u0086\1\u0087\3\uffff\1\u0088\1\uffff\1\u0089\3\uffff\1\u008a\12\uffff\1\u008b\26\uffff\1\u008c\64\uffff\1\u008d\6\uffff\1\u008e\1\uffff\1\u008f\1\uffff\1\u0090\1\uffff\1\u0091\25\uffff\1\u0092\1\uffff\1\u0093\10\uffff\1\u0094\1\uffff\1\u0095\3\uffff\1\u0096\3\uffff\1\u0097\32\uffff\1\u0098\1\u0099\6\uffff\1\u009a\1\u009b\43\uffff\1\u009c\6\uffff\1\u009d\1\uffff\1\u009e\1\uffff\1\u009f\1\uffff\1\u00a0\25\uffff\1\u00a1\1\uffff\1\u00a2\10\uffff\1\u00a3\1\uffff\1\u00a4\3\uffff\1\u00a5\3\uffff\1\u00a6\40\uffff\1\u00a7\1\uffff\1\u00a8\1\u00a9\17\uffff\1\u00aa\1\u00ab\22\uffff\1\u00ac\6\uffff\1\u00ad\1\uffff\1\u00ae\1\uffff\1\u00af\1\uffff\1\u00b0\47\uffff\1\u00b1\2\uffff\1\u00b2\20\uffff\1\u00b3\21\uffff\1\u00b4\1\u00b5\30\uffff\1\u00b6\4\uffff\1\u00b7\5\uffff\1\u00b8\20\uffff\1\u00b9\3\uffff\1\u00ba\26\uffff\1\u00bb\1\uffff\1\u00bc\7\uffff\1\u00bd\1\uffff\1\u00be\2\uffff\1\u00bf\5\uffff\1\u00c0\72\uffff\1\u00c1\56\uffff\1\u00c2\1\uffff\1\u00c3\1\u00c4\14\uffff\1\u00c5\4\uffff\1\u00c6\73\uffff\1\u00c7\1\u00c8\1\uffff\1\u00c9\2\uffff\1\u00ca\1\u00cb\1\uffff\1\u00cc\2\uffff\1\u00cd\6\uffff\1\u00ce\2\uffff\1\u00cf\1\uffff\1\u00d0\5\uffff\1\u00d1\1\uffff\1\u00d2\1\uffff\1\u00d3\1\uffff\1\u00d4\1\uffff\1\u00d5\2\uffff\1\u00d6\1\u00d7\1\uffff\1\u00d8\2\uffff\1\u00d9\1\uffff\1\u00da\1\u00db\11\uffff\1\u00dc\2\uffff\1\u00dd\3\uffff\1\u00de\27\uffff\1\u00df\2\uffff\1\u00e0\40\uffff\1\u00e1\77\uffff\1\u00e2\6\uffff\1\u00e3\1\uffff\1\u00e4\42\uffff\1\u00e5\33\uffff\1\u00e6\3\uffff\1\u00e7\163\uffff\1\u00e8\51\uffff\1\u00e9\24\uffff\1\u00ea\20\uffff\1\u00eb\4\uffff\1\u00ec\4\uffff\1\u00ed\2\uffff\1\u00ee\3\uffff\1\u00ef\3\uffff\1\u00f0\1\u00f1\7\uffff\1\u00f2\1\uffff\1\u00f3\4\uffff\1\u00f4\13\uffff\1\u00f5\14\uffff\1\u00f6\101\uffff\1\u00f7\51\uffff\1\u00f8\2\uffff\1\u00f9\u014a\uffff\1\u00fa\1\uffff\1\u00fb\2\uffff\1\u00fc\2\uffff\1\u00fd\5\uffff\1\u00fe\1\uffff\1\u00ff\1\uffff\1\u0100\2\uffff\1\u0101\2\uffff\1\u0102\47\uffff\1\u0103\1\uffff\1\u0104\2\uffff\1\u0105\2\uffff\1\u0106\37\uffff\1\u0107\1\uffff\1\u0108\2\uffff\1\u0109\2\uffff\1\u010a\5\uffff\1\u010b\1\uffff\1\u010c\1\uffff\1\u010d\2\uffff\1\u010e\2\uffff\1\u010f\15\uffff\1\u0110\1\uffff\1\u0111\67\uffff\1\u0112\1\uffff\1\u0113\2\uffff\1\u0114\2\uffff\1\u0115\101\uffff\1\u0116\45\uffff\1\u0117\16\uffff\1\u0118\20\uffff\1\u0119\123\uffff\1\u011a\14\uffff\1\u011b\u026a\uffff\1\u011c\2\uffff\1\u011d\17\uffff\1\u011e\1\uffff\1\u011f\30\uffff\1\u0120\5\uffff\1\u0121\111\uffff\1\u0122\25\uffff\1\u0123\13\uffff\1\u0124\1\uffff\1\u0125\2\uffff\1\u0126\16\uffff\1\u0127\20\uffff\1\u0128\16\uffff\1\u0129\20\uffff\1\u012a\16\uffff\1\u012b\13\uffff\1\u012c\1\uffff\1\u012d\1\uffff\1\u012e\17\uffff\1\u012f\62\uffff\1\u0130\50\uffff\1\u0131\103\uffff\1\u0132\41\uffff\1\u0133\1\uffff\1\u0134\62\uffff\1\u0135\10\uffff\1\u0136\47\uffff\1\u0137\1\uffff\1\u0138\5\uffff\1\u0139\104\uffff\1\u013a\12\uffff\1\u013b\33\uffff\1\u013c\63\uffff\1\u013d\34\uffff\1\u013e\2\uffff\1\u013f\3\uffff\1\u0140\13\uffff\1\u0141\52\uffff\1\u0142\25\uffff\1\u0143\5\uffff\1\u0144\70\uffff\1\u0145\25\uffff\1\u0146\11\uffff\1\u0147\63\uffff\1\u0148\u00b0\uffff\1\u0149\55\uffff\1\u014a\21\uffff\1\u014b\5\uffff\1\u014c\67\uffff\1\u014d\34\uffff\1\u014e\15\uffff\1\u014f\1\u0150\12\uffff\1\u0151\52\uffff\1\u0152\32\uffff\1\u0153\42\uffff\1\u0154\51\uffff\1\u0155\1\uffff\1\u0156\12\uffff\1\u0157\34\uffff\1\u0158\161\uffff\1\u0159\2\uffff\1\u015a\1\uffff\1\u015b\2\uffff\1\u015c\3\uffff\1\u015d\1\u015e\u043e\uffff\1\u015f\2\uffff\1\u0160\u0bf7\uffff\1\u0161\66\uffff\1\u0162\30\uffff\1\u0163\25\uffff\1\u0164\11\uffff\1\u0165\5\uffff\1\u0166\1\uffff\1\u0167\5\uffff\1\u0168\1\uffff\1\u0169\5\uffff\1\u016a\1\uffff\1\u016b\5\uffff\1\u016c\1\uffff\1\u016d\5\uffff\1\u016e\1\uffff\1\u016f\5\uffff\1\u0170\1\uffff\1\u0171\5\uffff\1\u0172\1\uffff\1\u0173\5\uffff\1\u0174\u0227\uffff\1\u0175\65\uffff\1\u0176\4\uffff\1\u0177\124\uffff\1\u0178\10\uffff\1\u0179\1\uffff\1\u017a\130\uffff\1\u017b\4\uffff\1\u017c\5\uffff\1\u017d\47\uffff\1\u017e\3\uffff\1\u017f\134\uffff\1\u0180\21\uffff\1\u0181\31\uffff\1\u0182\65\uffff\1\u0183\16\uffff\1\u0184\u0200\uffff\1\u0185\u19b4\uffff\1\u0186\112\uffff\1\u0187\u51cb\uffff\1\u0188\63\uffff\1\u0189\23\uffff\1\u018a\1\uffff\1\u018b\u0475\uffff\1\u018c\103\uffff\1\u018d\46\uffff\1\u018e\10\uffff\1\u018f\u010a\uffff\1\u0190\4\uffff\1\u0191\16\uffff\1\u0192\12\uffff\1\u0193\1\u0194\102\uffff\1\u0195\61\uffff\1\u0196\104\uffff\1\u0197\u0115\uffff\1\u0198\5\uffff\1\u0199\1\uffff\1\u019a\1\uffff\1\u019b\1\uffff\1\u019c\2\uffff\1\u019d\1\uffff\1\u019e\25\uffff\1\u019f\35\uffff\1\u01a0\62\uffff\1\u01a1\16\uffff\1\u01a2\60\uffff\1\u01a3\76\uffff\1\u01a4\4\uffff\1\u01a5\3\uffff\1\u01a6\16\uffff\1\u01a7\32\uffff\1\u01a8\12\uffff\1\u01a9\25\uffff\1\u01aa\31\uffff\1\u01ab\33\uffff\1\u01ac\7\uffff\1\u01ad\55\uffff\1\u01ae\115\uffff\1\u01af\47\uffff\1\u01b0\27\uffff\1\u01b1\1\uffff\1\u01b2\1\uffff\1\u01b3\6\uffff\1\u01b4\24\uffff\1\u01b5\16\uffff\1\u01b6\1\uffff\1\u01b7\4\uffff\1\u01b8\3\uffff\1\u01b9\5\uffff\1\u01ba\56\uffff\1\u01bb\1\uffff\1\u01bc\3\uffff\1\u01bd\1\u01be\2\uffff\1\u01bf\3\uffff\1\u01c0\2\uffff\1\u01c1\1\uffff\1\u01c2\30\uffff\1\u01c3\1\u01c4\3\uffff\1\u01c5\11\uffff\1\u01c6\7\uffff\1\u01c7\16\uffff\1\u01c8\4\uffff\1\u01c9\2\uffff\1\u01ca\4\uffff\1\u01cb\2\uffff\1\u01cc\4\uffff\1\u01cd\11\uffff\1\u01ce\5\uffff\1\u01cf\1\uffff\1\u01d0\5\uffff\1\u01d1\u0091\uffff\1\u01d2\41\uffff\1\u01d3\35\uffff\1\u01d4\u2ba2\uffff\1\u01d5\14\uffff\1\u01d6\25\uffff\1\u01d7\4\uffff\1\u01d8\57\uffff\1\u01d9\u2104\uffff\1\u01da\u016c\uffff\1\u01db\2\uffff\1\u01dc\150\uffff\1\u01dd\103\uffff\1\u01de\1\uffff\1\u01df\10\uffff\1\u01e0\1\uffff\1\u01e1\13\uffff\1\u01e2\1\uffff\1\u01e3\3\uffff\1\u01e4\1\uffff\1\u01e5\1\uffff\1\u01e6\1\u01e7\1\uffff\1\u01e8\1\u01e9\1\uffff\1\u01ea\152\uffff\1\u01eb\41\uffff\1\u01ec\u0169\uffff\1\u01ed\22\uffff\1\u01ee\76\uffff\1\u01ef\2\uffff\1\u01f0\64\uffff\1\u01f1\50\uffff\1\u01f2\12\uffff\1\u01f3\164\uffff\1\u01f4\3\uffff\1\u01f5\1\uffff\1\u01f6\u0085\uffff\1\u01f7\151\uffff\1\u01f8\10\uffff\1\u01f9\1\uffff\1\u01fa\53\uffff\1\u01fb\2\uffff\1\u01fc\35\uffff\1\u01fd\3\uffff\1\u01fe\4\uffff\1\u01ff\2\uffff\1\u0200\4\uffff\1\u0201\2\uffff\1\u0202\4\uffff\1\u0203\2\uffff\1\u0204\1\uffff\1\u0205",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0206\21\uffff\1\u0207",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "185:30: ( '\\u00AA' | '\\u00BA' | '\\u01BB' | '\\u01C0' | '\\u01C3' | '\\u0294' | '\\u05D0' | '\\u05EA' | '\\u05F0' | '\\u05F2' | '\\u0620' | '\\u063F' | '\\u0641' | '\\u064A' | '\\u066E' | '\\u066F' | '\\u0671' | '\\u06D3' | '\\u06D5' | '\\u06EE' | '\\u06EF' | '\\u06FA' | '\\u06FC' | '\\u06FF' | '\\u0710' | '\\u0712' | '\\u072F' | '\\u074D' | '\\u07A5' | '\\u07B1' | '\\u07CA' | '\\u07EA' | '\\u0800' | '\\u0815' | '\\u0840' | '\\u0858' | '\\u08A0' | '\\u08A2' | '\\u08AC' | '\\u0904' | '\\u0939' | '\\u093D' | '\\u0950' | '\\u0958' | '\\u0961' | '\\u0972' | '\\u0977' | '\\u0979' | '\\u097F' | '\\u0985' | '\\u098C' | '\\u098F' | '\\u0990' | '\\u0993' | '\\u09A8' | '\\u09AA' | '\\u09B0' | '\\u09B2' | '\\u09B6' | '\\u09B9' | '\\u09BD' | '\\u09CE' | '\\u09DC' | '\\u09DD' | '\\u09DF' | '\\u09E1' | '\\u09F0' | '\\u09F1' | '\\u0A05' | '\\u0A0A' | '\\u0A0F' | '\\u0A10' | '\\u0A13' | '\\u0A28' | '\\u0A2A' | '\\u0A30' | '\\u0A32' | '\\u0A33' | '\\u0A35' | '\\u0A36' | '\\u0A38' | '\\u0A39' | '\\u0A59' | '\\u0A5C' | '\\u0A5E' | '\\u0A72' | '\\u0A74' | '\\u0A85' | '\\u0A8D' | '\\u0A8F' | '\\u0A91' | '\\u0A93' | '\\u0AA8' | '\\u0AAA' | '\\u0AB0' | '\\u0AB2' | '\\u0AB3' | '\\u0AB5' | '\\u0AB9' | '\\u0ABD' | '\\u0AD0' | '\\u0AE0' | '\\u0AE1' | '\\u0B05' | '\\u0B0C' | '\\u0B0F' | '\\u0B10' | '\\u0B13' | '\\u0B28' | '\\u0B2A' | '\\u0B30' | '\\u0B32' | '\\u0B33' | '\\u0B35' | '\\u0B39' | '\\u0B3D' | '\\u0B5C' | '\\u0B5D' | '\\u0B5F' | '\\u0B61' | '\\u0B71' | '\\u0B83' | '\\u0B85' | '\\u0B8A' | '\\u0B8E' | '\\u0B90' | '\\u0B92' | '\\u0B95' | '\\u0B99' | '\\u0B9A' | '\\u0B9C' | '\\u0B9E' | '\\u0B9F' | '\\u0BA3' | '\\u0BA4' | '\\u0BA8' | '\\u0BAA' | '\\u0BAE' | '\\u0BB9' | '\\u0BD0' | '\\u0C05' | '\\u0C0C' | '\\u0C0E' | '\\u0C10' | '\\u0C12' | '\\u0C28' | '\\u0C2A' | '\\u0C33' | '\\u0C35' | '\\u0C39' | '\\u0C3D' | '\\u0C58' | '\\u0C59' | '\\u0C60' | '\\u0C61' | '\\u0C85' | '\\u0C8C' | '\\u0C8E' | '\\u0C90' | '\\u0C92' | '\\u0CA8' | '\\u0CAA' | '\\u0CB3' | '\\u0CB5' | '\\u0CB9' | '\\u0CBD' | '\\u0CDE' | '\\u0CE0' | '\\u0CE1' | '\\u0CF1' | '\\u0CF2' | '\\u0D05' | '\\u0D0C' | '\\u0D0E' | '\\u0D10' | '\\u0D12' | '\\u0D3A' | '\\u0D3D' | '\\u0D4E' | '\\u0D60' | '\\u0D61' | '\\u0D7A' | '\\u0D7F' | '\\u0D85' | '\\u0D96' | '\\u0D9A' | '\\u0DB1' | '\\u0DB3' | '\\u0DBB' | '\\u0DBD' | '\\u0DC0' | '\\u0DC6' | '\\u0E01' | '\\u0E30' | '\\u0E32' | '\\u0E33' | '\\u0E40' | '\\u0E45' | '\\u0E81' | '\\u0E82' | '\\u0E84' | '\\u0E87' | '\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94' | '\\u0E97' | '\\u0E99' | '\\u0E9F' | '\\u0EA1' | '\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA' | '\\u0EAB' | '\\u0EAD' | '\\u0EB0' | '\\u0EB2' | '\\u0EB3' | '\\u0EBD' | '\\u0EC0' | '\\u0EC4' | '\\u0EDC' | '\\u0EDF' | '\\u0F00' | '\\u0F40' | '\\u0F47' | '\\u0F49' | '\\u0F6C' | '\\u0F88' | '\\u0F8C' | '\\u1000' | '\\u102A' | '\\u103F' | '\\u1050' | '\\u1055' | '\\u105A' | '\\u105D' | '\\u1061' | '\\u1065' | '\\u1066' | '\\u106E' | '\\u1070' | '\\u1075' | '\\u1081' | '\\u108E' | '\\u10D0' | '\\u10FA' | '\\u10FD' | '\\u1248' | '\\u124A' | '\\u124D' | '\\u1250' | '\\u1256' | '\\u1258' | '\\u125A' | '\\u125D' | '\\u1260' | '\\u1288' | '\\u128A' | '\\u128D' | '\\u1290' | '\\u12B0' | '\\u12B2' | '\\u12B5' | '\\u12B8' | '\\u12BE' | '\\u12C0' | '\\u12C2' | '\\u12C5' | '\\u12C8' | '\\u12D6' | '\\u12D8' | '\\u1310' | '\\u1312' | '\\u1315' | '\\u1318' | '\\u135A' | '\\u1380' | '\\u138F' | '\\u13A0' | '\\u13F4' | '\\u1401' | '\\u166C' | '\\u166F' | '\\u167F' | '\\u1681' | '\\u169A' | '\\u16A0' | '\\u16EA' | '\\u1700' | '\\u170C' | '\\u170E' | '\\u1711' | '\\u1720' | '\\u1731' | '\\u1740' | '\\u1751' | '\\u1760' | '\\u176C' | '\\u176E' | '\\u1770' | '\\u1780' | '\\u17B3' | '\\u17DC' | '\\u1820' | '\\u1842' | '\\u1844' | '\\u1877' | '\\u1880' | '\\u18A8' | '\\u18AA' | '\\u18B0' | '\\u18F5' | '\\u1900' | '\\u191C' | '\\u1950' | '\\u196D' | '\\u1970' | '\\u1974' | '\\u1980' | '\\u19AB' | '\\u19C1' | '\\u19C7' | '\\u1A00' | '\\u1A16' | '\\u1A20' | '\\u1A54' | '\\u1B05' | '\\u1B33' | '\\u1B45' | '\\u1B4B' | '\\u1B83' | '\\u1BA0' | '\\u1BAE' | '\\u1BAF' | '\\u1BBA' | '\\u1BE5' | '\\u1C00' | '\\u1C23' | '\\u1C4D' | '\\u1C4F' | '\\u1C5A' | '\\u1C77' | '\\u1CE9' | '\\u1CEC' | '\\u1CEE' | '\\u1CF1' | '\\u1CF5' | '\\u1CF6' | '\\u2135' | '\\u2138' | '\\u2D30' | '\\u2D67' | '\\u2D80' | '\\u2D96' | '\\u2DA0' | '\\u2DA6' | '\\u2DA8' | '\\u2DAE' | '\\u2DB0' | '\\u2DB6' | '\\u2DB8' | '\\u2DBE' | '\\u2DC0' | '\\u2DC6' | '\\u2DC8' | '\\u2DCE' | '\\u2DD0' | '\\u2DD6' | '\\u2DD8' | '\\u2DDE' | '\\u3006' | '\\u303C' | '\\u3041' | '\\u3096' | '\\u309F' | '\\u30A1' | '\\u30FA' | '\\u30FF' | '\\u3105' | '\\u312D' | '\\u3131' | '\\u318E' | '\\u31A0' | '\\u31BA' | '\\u31F0' | '\\u31FF' | '\\u3400' | '\\u4DB5' | '\\u4E00' | '\\u9FCC' | '\\uA000' | '\\uA014' | '\\uA016' | '\\uA48C' | '\\uA4D0' | '\\uA4F7' | '\\uA500' | '\\uA60B' | '\\uA610' | '\\uA61F' | '\\uA62A' | '\\uA62B' | '\\uA66E' | '\\uA6A0' | '\\uA6E5' | '\\uA7FB' | '\\uA801' | '\\uA803' | '\\uA805' | '\\uA807' | '\\uA80A' | '\\uA80C' | '\\uA822' | '\\uA840' | '\\uA873' | '\\uA882' | '\\uA8B3' | '\\uA8F2' | '\\uA8F7' | '\\uA8FB' | '\\uA90A' | '\\uA925' | '\\uA930' | '\\uA946' | '\\uA960' | '\\uA97C' | '\\uA984' | '\\uA9B2' | '\\uAA00' | '\\uAA28' | '\\uAA40' | '\\uAA42' | '\\uAA44' | '\\uAA4B' | '\\uAA60' | '\\uAA6F' | '\\uAA71' | '\\uAA76' | '\\uAA7A' | '\\uAA80' | '\\uAAAF' | '\\uAAB1' | '\\uAAB5' | '\\uAAB6' | '\\uAAB9' | '\\uAABD' | '\\uAAC0' | '\\uAAC2' | '\\uAADB' | '\\uAADC' | '\\uAAE0' | '\\uAAEA' | '\\uAAF2' | '\\uAB01' | '\\uAB06' | '\\uAB09' | '\\uAB0E' | '\\uAB11' | '\\uAB16' | '\\uAB20' | '\\uAB26' | '\\uAB28' | '\\uAB2E' | '\\uABC0' | '\\uABE2' | '\\uAC00' | '\\uD7A3' | '\\uD7B0' | '\\uD7C6' | '\\uD7CB' | '\\uD7FB' | '\\uF900' | '\\uFA6D' | '\\uFA70' | '\\uFAD9' | '\\uFB1D' | '\\uFB1F' | '\\uFB28' | '\\uFB2A' | '\\uFB36' | '\\uFB38' | '\\uFB3C' | '\\uFB3E' | '\\uFB40' | '\\uFB41' | '\\uFB43' | '\\uFB44' | '\\uFB46' | '\\uFBB1' | '\\uFBD3' | '\\uFD3D' | '\\uFD50' | '\\uFD8F' | '\\uFD92' | '\\uFDC7' | '\\uFDF0' | '\\uFDFB' | '\\uFE70' | '\\uFE74' | '\\uFE76' | '\\uFEFC' | '\\uFF66' | '\\uFF6F' | '\\uFF71' | '\\uFF9D' | '\\uFFA0' | '\\uFFBE' | '\\uFFC2' | '\\uFFC7' | '\\uFFCA' | '\\uFFCF' | '\\uFFD2' | '\\uFFD7' | '\\uFFDA' | '\\uFFDC' | '\\u10000' | '\\u1000B' )";
        }
    }
    static final String DFA9_eotS =
        "\u009f\uffff";
    static final String DFA9_eofS =
        "\u009f\uffff";
    static final String DFA9_minS =
        "\1\u0903\u009b\uffff\1\60\2\uffff";
    static final String DFA9_maxS =
        "\1\uabec\u009b\uffff\1\62\2\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\uffff\1\u009c\1\u009d";
    static final String DFA9_specialS =
        "\u009f\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\67\uffff\1\2\2\uffff\3\3\10\uffff\4\4\1\uffff\1\5\1\6\62\uffff\1\7\1\10\72\uffff\3\11\6\uffff\1\12\1\13\2\uffff\1\14\1\15\12\uffff\1\16\53\uffff\1\17\72\uffff\3\20\102\uffff\1\21\72\uffff\3\22\10\uffff\1\23\1\uffff\1\24\1\25\65\uffff\1\26\1\27\72\uffff\1\30\1\uffff\1\31\6\uffff\1\32\1\33\2\uffff\1\34\1\35\12\uffff\1\36\146\uffff\1\37\1\40\1\uffff\1\41\1\42\3\uffff\3\43\1\uffff\3\44\12\uffff\1\45\51\uffff\3\46\75\uffff\4\47\75\uffff\1\50\1\51\72\uffff\1\52\1\uffff\5\53\2\uffff\1\54\1\55\1\uffff\1\56\1\57\11\uffff\1\60\1\61\53\uffff\1\62\1\63\72\uffff\3\64\5\uffff\3\65\1\uffff\3\66\12\uffff\1\67\52\uffff\1\70\1\71\113\uffff\3\72\6\uffff\10\73\22\uffff\1\74\1\75\u014a\uffff\1\76\1\77\77\uffff\1\100\u00ab\uffff\1\101\1\102\4\uffff\1\103\6\uffff\1\104\2\uffff\1\105\1\106\31\uffff\1\107\1\110\12\uffff\3\111\2\uffff\7\112\25\uffff\1\113\1\114\2\uffff\6\115\2\uffff\1\116\12\uffff\3\117\143\uffff\1\u009c\u06b5\uffff\1\120\7\uffff\10\121\1\uffff\1\122\1\123\u015a\uffff\4\124\2\uffff\3\125\4\uffff\1\126\1\127\1\uffff\6\130\167\uffff\21\131\7\uffff\1\132\1\133\117\uffff\3\134\71\uffff\1\135\1\uffff\1\136\11\uffff\1\137\1\uffff\1\140\1\141\10\uffff\6\142\u0091\uffff\1\143\60\uffff\1\144\5\uffff\1\145\1\uffff\5\146\1\uffff\1\147\1\150\75\uffff\1\151\36\uffff\1\152\4\uffff\1\153\1\154\2\uffff\1\155\1\uffff\1\156\1\157\71\uffff\1\160\2\uffff\3\161\1\uffff\1\162\3\uffff\1\163\1\164\60\uffff\10\165\10\uffff\1\166\1\167\u00ab\uffff\1\170\20\uffff\1\171\1\172\u133a\uffff\1\173\1\174\u77f3\uffff\1\175\1\176\2\uffff\1\177\130\uffff\1\u0080\1\u0081\62\uffff\20\u0082\u008e\uffff\1\u0083\1\u0084\57\uffff\1\u0085\60\uffff\1\u0086\1\u0087\4\uffff\1\u0088\1\u0089\1\uffff\4\u008a\156\uffff\1\u008b\1\u008c\2\uffff\1\u008d\1\u008e\30\uffff\1\u008f\55\uffff\1\u0090\157\uffff\1\u0091\2\uffff\1\u0092\1\u0093\5\uffff\1\u0094\u00ed\uffff\1\u0095\1\u0096\1\uffff\1\u0097\1\u0098\1\uffff\1\u0099\1\u009a\1\uffff\1\u009b",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009d\1\uffff\1\u009e",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "193:39: ( '\\u0903' | '\\u093B' | '\\u093E' .. '\\u0940' | '\\u0949' .. '\\u094C' | '\\u094E' | '\\u094F' | '\\u0982' | '\\u0983' | '\\u09BE' .. '\\u09C0' | '\\u09C7' | '\\u09C8' | '\\u09CB' | '\\u09CC' | '\\u09D7' | '\\u0A03' | '\\u0A3E' .. '\\u0A40' | '\\u0A83' | '\\u0ABE' .. '\\u0AC0' | '\\u0AC9' | '\\u0ACB' | '\\u0ACC' | '\\u0B02' | '\\u0B03' | '\\u0B3E' | '\\u0B40' | '\\u0B47' | '\\u0B48' | '\\u0B4B' | '\\u0B4C' | '\\u0B57' | '\\u0BBE' | '\\u0BBF' | '\\u0BC1' | '\\u0BC2' | '\\u0BC6' .. '\\u0BC8' | '\\u0BCA' .. '\\u0BCC' | '\\u0BD7' | '\\u0C01' .. '\\u0C03' | '\\u0C41' .. '\\u0C44' | '\\u0C82' | '\\u0C83' | '\\u0CBE' | '\\u0CC0' .. '\\u0CC4' | '\\u0CC7' | '\\u0CC8' | '\\u0CCA' | '\\u0CCB' | '\\u0CD5' | '\\u0CD6' | '\\u0D02' | '\\u0D03' | '\\u0D3E' .. '\\u0D40' | '\\u0D46' .. '\\u0D48' | '\\u0D4A' .. '\\u0D4C' | '\\u0D57' | '\\u0D82' | '\\u0D83' | '\\u0DCF' .. '\\u0DD1' | '\\u0DD8' .. '\\u0DDF' | '\\u0DF2' | '\\u0DF3' | '\\u0F3E' | '\\u0F3F' | '\\u0F7F' | '\\u102B' | '\\u102C' | '\\u1031' | '\\u1038' | '\\u103B' | '\\u103C' | '\\u1056' | '\\u1057' | '\\u1062' .. '\\u1064' | '\\u1067' .. '\\u106D' | '\\u1083' | '\\u1084' | '\\u1087' .. '\\u108C' | '\\u108F' | '\\u109A' .. '\\u109C' | '\\u17B6' | '\\u17BE' .. '\\u17C5' | '\\u17C7' | '\\u17C8' | '\\u1923' .. '\\u1926' | '\\u1929' .. '\\u192B' | '\\u1930' | '\\u1931' | '\\u1933' .. '\\u1938' | '\\u19B0' .. '\\u19C0' | '\\u19C8' | '\\u19C9' | '\\u1A19' .. '\\u1A1B' | '\\u1A55' | '\\u1A57' | '\\u1A61' | '\\u1A63' | '\\u1A64' | '\\u1A6D' .. '\\u1A72' | '\\u1B04' | '\\u1B35' | '\\u1B3B' | '\\u1B3D' .. '\\u1B41' | '\\u1B43' | '\\u1B44' | '\\u1B82' | '\\u1BA1' | '\\u1BA6' | '\\u1BA7' | '\\u1BAA' | '\\u1BAC' | '\\u1BAD' | '\\u1BE7' | '\\u1BEA' .. '\\u1BEC' | '\\u1BEE' | '\\u1BF2' | '\\u1BF3' | '\\u1C24' .. '\\u1C2B' | '\\u1C34' | '\\u1C35' | '\\u1CE1' | '\\u1CF2' | '\\u1CF3' | '\\u302E' | '\\u302F' | '\\uA823' | '\\uA824' | '\\uA827' | '\\uA880' | '\\uA881' | '\\uA8B4' .. '\\uA8C3' | '\\uA952' | '\\uA953' | '\\uA983' | '\\uA9B4' | '\\uA9B5' | '\\uA9BA' | '\\uA9BB' | '\\uA9BD' .. '\\uA9C0' | '\\uAA2F' | '\\uAA30' | '\\uAA33' | '\\uAA34' | '\\uAA4D' | '\\uAA7B' | '\\uAAEB' | '\\uAAEE' | '\\uAAEF' | '\\uAAF5' | '\\uABE3' | '\\uABE4' | '\\uABE6' | '\\uABE7' | '\\uABE9' | '\\uABEA' | '\\uABEC' | '\\u11000' | '\\u11002' )";
        }
    }
    static final String DFA16_eotS =
        "\31\uffff";
    static final String DFA16_eofS =
        "\31\uffff";
    static final String DFA16_minS =
        "\1\46\1\142\3\uffff\3\42\3\uffff\1\42\15\uffff";
    static final String DFA16_maxS =
        "\1\170\1\156\3\uffff\3\75\3\uffff\1\52\15\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\1\3\1\4\3\uffff\1\12\1\13\1\14\1\uffff\1\20\1\21\1\23\1\1\1\22\1\5\1\17\1\7\1\6\1\11\1\10\1\15\1\16";
    static final String DFA16_specialS =
        "\31\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\12\3\uffff\1\13\1\11\1\uffff\1\10\1\uffff\1\5\14\uffff\1\6\1\4\1\7\42\uffff\1\1\13\uffff\1\14\1\16\1\2\2\uffff\1\15\5\uffff\1\3",
            "\1\20\13\uffff\1\17",
            "",
            "",
            "",
            "\1\22\32\uffff\1\21",
            "\1\24\32\uffff\1\23",
            "\1\26\32\uffff\1\25",
            "",
            "",
            "",
            "\1\30\7\uffff\1\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "217:28: ( 'and' | 'or' | 'xor' | '=' | '/=' | '<' | '<=' | '>' | '>=' | '-' | '+' | '&' | '**' | '*' | '/' | 'mod' | 'rem' | 'abs' | 'not' )";
        }
    }
    static final String DFA19_eotS =
        "\27\uffff\1\130\1\uffff\1\152\1\uffff\1\154\1\156\5\uffff\1\160\1\162\1\164\1\uffff\1\170\1\173\25\uffff\1\u0089\77\uffff\1\u00a8\73\uffff";
    static final String DFA19_eofS =
        "\u00b9\uffff";
    static final String DFA19_minS =
        "\1\11\1\142\1\145\1\141\1\145\1\154\1\157\1\145\1\146\1\151\1\uffff\1\145\1\146\2\141\1\145\1\141\1\156\1\150\4\uffff\2\40\1\55\1\uffff\1\75\1\56\5\uffff\1\52\1\75\1\76\1\uffff\1\74\1\75\1\157\1\143\1\151\7\uffff\1\143\2\uffff\1\163\1\144\1\143\5\uffff\1\164\14\uffff\1\141\1\151\1\143\1\154\2\uffff\1\147\5\uffff\1\145\3\uffff\16\40\25\uffff\1\164\1\145\3\uffff\1\141\1\145\10\uffff\1\143\16\uffff\4\40\1\uffff\7\40\2\uffff\1\160\6\uffff\3\40\1\uffff\3\40\2\uffff";
    static final String DFA19_maxS =
        "\1\174\1\164\3\157\1\170\1\165\1\157\1\163\1\157\1\uffff\1\165\1\166\1\162\1\145\2\171\1\163\1\151\4\uffff\2\u1fff\1\55\1\uffff\1\75\1\56\5\uffff\1\52\1\75\1\76\1\uffff\2\76\1\163\1\143\1\154\7\uffff\1\154\2\uffff\1\163\1\164\1\151\5\uffff\1\164\14\uffff\1\157\1\156\1\166\1\160\2\uffff\1\163\5\uffff\1\151\3\uffff\16\u1fff\25\uffff\1\164\1\145\3\uffff\1\164\1\151\10\uffff\1\164\16\uffff\4\u1fff\1\uffff\7\u1fff\2\uffff\1\163\6\uffff\3\u1fff\1\uffff\3\u1fff\2\uffff";
    static final String DFA19_acceptS =
        "\12\uffff\1\44\10\uffff\1\110\1\111\1\112\1\113\3\uffff\1\120\2\uffff\1\123\1\124\1\125\1\126\1\127\3\uffff\1\136\5\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\uffff\1\22\1\23\3\uffff\1\32\1\33\1\34\1\35\1\36\1\uffff\1\41\1\42\1\43\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\4\uffff\1\74\1\75\1\uffff\1\100\1\101\1\102\1\103\1\104\1\uffff\1\107\1\134\1\114\16\uffff\1\116\1\117\1\130\1\137\1\121\1\140\1\122\1\132\1\131\1\143\1\133\1\135\1\142\1\141\1\145\1\150\1\144\1\147\1\151\1\146\1\1\2\uffff\1\6\1\7\1\17\2\uffff\1\26\1\27\1\30\1\31\1\40\1\37\1\56\1\57\1\uffff\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\76\1\77\1\105\1\106\4\uffff\1\115\7\uffff\1\3\1\2\1\uffff\1\20\1\21\1\24\1\25\1\60\1\61\3\uffff\1\115\3\uffff\1\4\1\5";
    static final String DFA19_specialS =
        "\u00b9\uffff}>";
    static final String[] DFA19_transitionS = {
            "\2\25\2\uffff\1\25\22\uffff\1\25\1\45\1\30\3\uffff\1\40\1\27\1\36\1\37\1\42\1\41\1\35\1\31\1\34\1\43\12\24\1\33\1\32\1\46\1\44\1\47\37\uffff\1\26\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\2\uffff\1\11\1\12\1\13\1\14\1\15\1\uffff\1\16\1\17\1\20\1\21\1\uffff\1\22\1\23\3\uffff\1\45",
            "\1\50\1\51\10\uffff\1\52\1\uffff\1\53\3\uffff\1\54\1\uffff\1\55",
            "\1\56\11\uffff\1\57",
            "\1\60\15\uffff\1\61",
            "\1\62\3\uffff\1\63\5\uffff\1\64",
            "\1\65\1\uffff\1\66\11\uffff\1\67",
            "\1\70\5\uffff\1\71",
            "\1\72\11\uffff\1\73",
            "\1\74\7\uffff\1\75\4\uffff\1\76",
            "\1\77\5\uffff\1\100",
            "",
            "\1\101\11\uffff\1\102\5\uffff\1\103",
            "\1\104\13\uffff\1\105\1\uffff\1\106\1\107\1\110",
            "\1\111\20\uffff\1\112",
            "\1\113\3\uffff\1\114",
            "\1\115\17\uffff\1\116\3\uffff\1\117",
            "\1\120\3\uffff\1\121\2\uffff\1\122\20\uffff\1\123",
            "\1\124\4\uffff\1\125",
            "\1\126\1\127",
            "",
            "",
            "",
            "",
            "\u1fe0\131",
            "\6\150\1\143\3\150\1\144\1\142\1\150\1\141\1\150\1\136\14\150\1\137\1\135\1\140\42\150\1\132\13\150\1\145\1\147\1\133\2\150\1\146\5\150\1\134\u1f87\150",
            "\1\151",
            "",
            "\1\153",
            "\1\155",
            "",
            "",
            "",
            "",
            "",
            "\1\157",
            "\1\161",
            "\1\163",
            "",
            "\1\167\1\166\1\165",
            "\1\171\1\172",
            "\1\174\3\uffff\1\175",
            "\1\176",
            "\1\177\2\uffff\1\u0080",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0081\10\uffff\1\u0082",
            "",
            "",
            "\1\u0083",
            "\1\u0084\17\uffff\1\u0085",
            "\1\u0086\5\uffff\1\u0087",
            "",
            "",
            "",
            "",
            "",
            "\1\u0088",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008a\7\uffff\1\u008b\5\uffff\1\u008c",
            "\1\u008d\4\uffff\1\u008e",
            "\1\u008f\11\uffff\1\u0090\1\u0091\2\uffff\1\u0092\2\uffff\1\u0093\1\uffff\1\u0094",
            "\1\u0095\3\uffff\1\u0096",
            "",
            "",
            "\1\u0097\13\uffff\1\u0098",
            "",
            "",
            "",
            "",
            "",
            "\1\u0099\3\uffff\1\u009a",
            "",
            "",
            "",
            "\102\150\1\u009c\13\150\1\u009b\u1f91\150",
            "\122\150\1\u009d\u1f8d\150",
            "\117\150\1\u009e\u1f90\150",
            "\2\150\1\u009f\u1fdd\150",
            "\2\150\1\u009f\32\150\1\u00a0\u1fc2\150",
            "\2\150\1\u009f\32\150\1\u00a1\u1fc2\150",
            "\2\150\1\u009f\32\150\1\u00a2\u1fc2\150",
            "\2\150\1\u009f\u1fdd\150",
            "\2\150\1\u009f\u1fdd\150",
            "\2\150\1\u009f\u1fdd\150",
            "\2\150\1\u009f\7\150\1\u00a3\u1fd5\150",
            "\117\150\1\u00a4\u1f90\150",
            "\105\150\1\u00a5\u1f9a\150",
            "\117\150\1\u00a6\u1f90\150",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a7",
            "\1\u00a9",
            "",
            "",
            "",
            "\1\u00aa\22\uffff\1\u00ab",
            "\1\u00ac\3\uffff\1\u00ad",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ae\20\uffff\1\u00af",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\104\150\1\u00b0\u1f9b\150",
            "\123\150\1\u00b1\u1f8c\150",
            "\2\150\1\u009f\u1fdd\150",
            "\122\150\1\u00b2\u1f8d\150",
            "",
            "\2\150\1\u009f\u1fdd\150",
            "\2\150\1\u009f\u1fdd\150",
            "\2\150\1\u009f\u1fdd\150",
            "\2\150\1\u009f\u1fdd\150",
            "\104\150\1\u00b4\u1f9b\150",
            "\115\150\1\u00b5\u1f92\150",
            "\124\150\1\u00b6\u1f8b\150",
            "",
            "",
            "\1\u00b7\2\uffff\1\u00b8",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\150\1\u009f\u1fdd\150",
            "\2\150\1\u009f\u1fdd\150",
            "\2\150\1\u009f\u1fdd\150",
            "",
            "\2\150\1\u009f\u1fdd\150",
            "\2\150\1\u009f\u1fdd\150",
            "\2\150\1\u009f\u1fdd\150",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_ABORT_ | RULE_ABS_ | RULE_ABSTRACT_ | RULE_ACCEPT_ | RULE_ACCESS_ | RULE_ALIASED_ | RULE_ALL_ | RULE_AND_ | RULE_ARRAY_ | RULE_AT_ | RULE_BEGIN_ | RULE_BODY_ | RULE_CASE_ | RULE_CONSTANT_ | RULE_DECLARE_ | RULE_DELAY_ | RULE_DELTA_ | RULE_DIGITS_ | RULE_DO_ | RULE_ELSE_ | RULE_ELSIF_ | RULE_END_ | RULE_ENTRY_ | RULE_EXCEPTION_ | RULE_EXIT_ | RULE_FOR_ | RULE_FUNCTION_ | RULE_GENERIC_ | RULE_GOTO_ | RULE_IF_ | RULE_IN_ | RULE_INTERFACE_ | RULE_IS_ | RULE_LIMITED_ | RULE_LOOP_ | RULE_MOD_ | RULE_NEW_ | RULE_NOT_ | RULE_NULL_ | RULE_OF_ | RULE_OR_ | RULE_OTHERS_ | RULE_OUT_ | RULE_OVERRIDING_ | RULE_PACKAGE_ | RULE_PRAGMA_ | RULE_PRIVATE_ | RULE_PROCEDURE_ | RULE_PROTECTED_ | RULE_RAISE_ | RULE_RANGE_ | RULE_RECORD_ | RULE_REM_ | RULE_RENAMES_ | RULE_REQUEUE_ | RULE_RETURN_ | RULE_REVERSE_ | RULE_SELECT_ | RULE_SEPARATE_ | RULE_SUBTYPE_ | RULE_SYNCHRONIZED_ | RULE_TAGGED_ | RULE_TASK_ | RULE_TERMINATE_ | RULE_THEN_ | RULE_TYPE_ | RULE_UNTIL_ | RULE_USE_ | RULE_WHEN_ | RULE_WHILE_ | RULE_WITH_ | RULE_XOR_ | RULE_NUMERIC_LITERAL | RULE_WS | RULE_IDENTIFIER | RULE_CHARACTER_LITERAL | RULE_OPERATOR_SYMBOL | RULE_STRING_LITERAL | RULE_SL_COMMENT | RULE_PV | RULE_DP | RULE_P | RULE_V | RULE_PG | RULE_PD | RULE_ET_COM | RULE_PLUS | RULE_MOINS | RULE_ETOI | RULE_ETOI2 | RULE_SLASH | RULE_QUOTE | RULE_FLECHE | RULE_BV | RULE_DPE | RULE_PP | RULE_BOIT | RULE_EG | RULE_DIFF | RULE_INF | RULE_INFE | RULE_SUP | RULE_SUPE | RULE_CHG | RULE_CHD );";
        }
    }
 

}