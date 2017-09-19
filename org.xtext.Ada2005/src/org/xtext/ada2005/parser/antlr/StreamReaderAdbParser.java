package org.xtext.ada2005.parser.antlr;

import java.io.IOException;
import java.io.Reader;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.impl.NodeModelBuilder;
import org.eclipse.xtext.parser.IParseResult;
import org.xtext.ada2005.parser.antlr.lexer.jflex.AntlrJflexReader;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class StreamReaderAdbParser extends AdbParser {

	@Inject
	private Provider<NodeModelBuilder> nodeModelBuilder;

	@Override
	public IParseResult doParse(Reader reader) {
		try {
			return parse(getDefaultRuleName(), new AntlrJflexReader(reader));
		} catch (IOException e) {
			throw new WrappedException(e);
		}
	}
	
	@Override
	public IParseResult parse(ParserRule rule, Reader reader) {
		try {
			// Related to its ancestor, just redefine with new AntlrJflexReader(reader)
			IParseResult parseResult = parse(rule.getName(), new AntlrJflexReader(reader));
			return parseResult;
		} catch (IOException e) {
			throw new WrappedException(e);
		}
	}	

	@Override
	public IParseResult parse(RuleCall ruleCall, Reader reader, int initialLookAhead) {
		try {
			NodeModelBuilder builder = nodeModelBuilder.get();
			builder.setForcedFirstGrammarElement(ruleCall);
			// Related to its ancestor, just redefine with new AntlrJflexReader(reader)
			IParseResult parseResult = doParse(ruleCall.getRule().getName(), new AntlrJflexReader(reader), builder, initialLookAhead);
			return parseResult;
		} catch (IOException e) {
			throw new WrappedException(e);
		}
	}
	
}
