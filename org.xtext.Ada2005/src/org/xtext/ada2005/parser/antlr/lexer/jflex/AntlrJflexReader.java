package org.xtext.ada2005.parser.antlr.lexer.jflex;

import java.io.IOException;
import java.nio.CharBuffer;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CharStream;

public class AntlrJflexReader extends ANTLRReaderStream implements Reader {

	public AntlrJflexReader(java.io.Reader reader) throws IOException
	{
		super(reader);
	}

	@Override
	public int read(CharBuffer cb) throws IOException 
	{
	int c = 0;
	int i = 0;
	   for (i = 0; i < cb.length() && ((c = LA(1)) != CharStream.EOF); i++)
	    {
		   cb.put(i, (char) c);
	       consume();
	    }
	   return (i == 0 && c == CharStream.EOF) ? -1 : i;
	}

	@Override
	public void close() throws IOException {
		// Nothing to do : an ANTLR stream never be supposed to be closed.
	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException 
	{
		int c = 0;
		int i = 0;
		   for (; i < len && ((c = LA(1)) != CharStream.EOF); i++)
		    {
		       cbuf[off+i] = (char) c;
		       consume();
		    }
	    return (i == 0 && c == CharStream.EOF) ? -1 : i;
	}

	@Override
	public int read() throws IOException {
		// TODO Auto-generated method stub
		int c = LA(1);
		if (c != CharStream.EOF)
		{
		   consume();
		   return c;
		}
		else
		   return -1;
	}

}
