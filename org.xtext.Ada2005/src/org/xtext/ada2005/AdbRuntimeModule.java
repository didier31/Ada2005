/*
 * generated by Xtext
 */
package org.xtext.ada2005;

import org.eclipse.xtext.parser.antlr.LexerProvider;
import org.eclipse.xtext.parser.impl.TokenRegionProvider;
import org.xtext.ada2005.naming.Ada2005DeclarativeQualifiedNameProvider;
import org.xtext.ada2005.parser.antlr.lexer.jflex.JFlexInternalAdbLexerWithAntlrReader;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class AdbRuntimeModule extends org.xtext.ada2005.AbstractAdbRuntimeModule {
	// contributed by org.eclipse.xtext.generator.parser.antlr.ex.rt.AntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.IParser> bindIParser() {
		return org.xtext.ada2005.parser.antlr.StreamReaderAdbParser.class;
	}
	
	// contributed by org.eclipse.xtext.generator.parser.antlr.ex.rt.AntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.Lexer> bindLexer() {
		return org.xtext.ada2005.parser.antlr.lexer.InternalAdbLexer.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.ex.rt.AntlrGeneratorFragment
	public LexerProvider<JFlexInternalAdbLexerWithAntlrReader> provideJFlexInternalAdbLexer() {
		return org.eclipse.xtext.parser.antlr.LexerProvider.create(org.xtext.ada2005.parser.antlr.lexer.jflex.JFlexInternalAdbLexerWithAntlrReader.class);
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.ex.rt.AntlrGeneratorFragment
	public void configureRuntimeLexer(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.parser.antlr.Lexer.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.parser.antlr.LexerBindings.RUNTIME)).to(org.xtext.ada2005.parser.antlr.lexer.jflex.JFlexInternalAdbLexerWithAntlrReader.class);
	}
	
	// contributed by org.eclipse.xtext.generator.exporting.QualifiedNamesFragment
	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return Ada2005DeclarativeQualifiedNameProvider.class;
	}
	
	public Class<? extends TokenRegionProvider> bindTokenRegionProvider(){
		return org.xtext.ada2005.parser.impl.TokenRegionProviderForFlex.class;
	}
}