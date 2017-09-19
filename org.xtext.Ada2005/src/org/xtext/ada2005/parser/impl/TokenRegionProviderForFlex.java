package org.xtext.ada2005.parser.impl;

import java.io.IOException;
import java.io.StringReader;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.eclipse.xtext.parser.antlr.Lexer;
import org.eclipse.xtext.parser.antlr.LexerBindings;
import org.eclipse.xtext.parser.impl.TokenRegionProvider;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.TextRegion;
import org.xtext.ada2005.parser.antlr.lexer.jflex.AntlrJflexReader;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

public class TokenRegionProviderForFlex extends TokenRegionProvider {
	@Inject
	@Named(LexerBindings.RUNTIME)
	private Provider<Lexer> lexerProvider;
	
	public ITextRegion getTokenRegion(String text, ITextRegion region) {
		Lexer lexer = lexerProvider.get();
		try {
			lexer.setCharStream(new AntlrJflexReader(new StringReader(text)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int currentStart = 0;
		int currentEnd = 0;
		CommonToken currentToken = (CommonToken) lexer.nextToken();
		int regionStartOffset = region.getOffset();
		int regionEnd = regionStartOffset + region.getLength();
		while (currentToken != Token.EOF_TOKEN) {
			currentStart = currentToken.getStartIndex();
			currentEnd = currentToken.getStopIndex() + 1;
			if (currentToken.getStopIndex() >= regionStartOffset) 
				break;
			currentToken = (CommonToken) lexer.nextToken();
		}
		if (region.getLength() == 0 && regionStartOffset == currentToken.getStopIndex() + 1) {
			currentEnd = currentStart;
		} else {
			// currentToken is first token overlapping with the region or EOF
			while (currentToken != Token.EOF_TOKEN) {
				currentEnd = currentToken.getStopIndex() + 1;
				if (currentEnd >= regionEnd) {
					break;
				}
				currentToken = (CommonToken) lexer.nextToken();
			}
		}
		if (currentStart != regionStartOffset || currentEnd != regionEnd) 
			return new TextRegion(currentStart, currentEnd - currentStart);
		else 
			return region;
	}
}
