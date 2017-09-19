package org.xtext.ada2005.parser.antlr.lexer.jflex;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.xtext.ada2005.parser.antlr.lexer.jflex.JFlexInternalAdbLexer;

public class JFlexInternalAdbLexerWithAntlrReader extends JFlexInternalAdbLexer {

	int tokenIndex = 0;
	
	public JFlexInternalAdbLexerWithAntlrReader(Reader input)
	{
		super(input);
	}
	
	public JFlexInternalAdbLexerWithAntlrReader(CharStream input)
	{
		this(input,new RecognizerSharedState());
		this.zzReader = (Reader) input; // this input should be a org.xtext.ada2005.parser.antlr.lexer.jflex.Reader
	}

	public JFlexInternalAdbLexerWithAntlrReader(CharStream input, RecognizerSharedState state) 
	{
	super(input,state);
	}

	@Override	
	public void setCharStream(CharStream input)
	{
		super.setCharStream(input);
		this.zzReader = (Reader) input;
	}	
	
	@Override
	public Token nextToken() 
	{
	Token token = null;
	try 
	   {
	int lexeme = this.yylex();
	   if (lexeme == Token.EOF)
	   {
		   return Token.EOF_TOKEN;
	   }
	   else
	   {
	   token = new CommonToken(input, lexeme, Token.DEFAULT_CHANNEL, this.getCharIndex(), this.getCharIndex()+yylength() - 1);
	   token.setCharPositionInLine(this.getCharPositionInLine());
	   token.setText(this.yytext());
	   token.setTokenIndex(this.tokenIndex);
	   tokenIndex++;
	   }
	   }
	catch (java.io.IOException e) 
	   {
	   token = CommonToken.INVALID_TOKEN;
	   }
	return token;
	}
}
