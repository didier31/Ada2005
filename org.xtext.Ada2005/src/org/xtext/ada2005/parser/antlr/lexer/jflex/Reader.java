package org.xtext.ada2005.parser.antlr.lexer.jflex;

import java.io.Closeable;
import java.io.IOException;

public interface Reader extends Readable, Closeable 
{
	public abstract int read(char[] cbuf, int off, int len) throws IOException;
	
	public int read() throws IOException;
}
