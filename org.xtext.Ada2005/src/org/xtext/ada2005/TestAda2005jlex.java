package org.xtext.ada2005;

import java.io.IOException;
import java.io.StringReader;

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.xtext.ada2005.parser.antlr.lexer.jflex.AntlrJflexReader;
import org.xtext.ada2005.parser.antlr.lexer.jflex.JFlexInternalAdbLexer;
//import org.xtext.ada2005.parser.antlr.lexer.jflex.Reader;

public class TestAda2005jlex implements IWorkflowComponent {

	public class MyJFlexAdbLexer extends JFlexInternalAdbLexer {

		public MyJFlexAdbLexer(org.xtext.ada2005.parser.antlr.lexer.jflex.Reader in) {
			super(in);
			// TODO Auto-generated constructor stub
		}};
	
	@Override
	public void invoke(IWorkflowContext arg0) {
		// TODO Auto-generated method stub
	    
	    StringReader reader = new StringReader("WITH REPORT:; USE REPORT:,;\n"
	    		                              +"PROCEDURE A22006B, IS\n"
	    		                              +"myInterger:Integer;"
	    		                              +"BEGIN\n"
	                                          +"TEST (\"A22006B\", \"CHECK USE OF HT IN AND OUT OF COMMENTS\");\n"    
                                              + "RESULT;\n"
                                              + "END A22006B;");
		
		JFlexInternalAdbLexer lexer;
		AntlrJflexReader r = null;
		try {
			r = new AntlrJflexReader(reader);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		lexer = new MyJFlexAdbLexer(r);
		
		int token;
		try {
			while ((token = lexer.yylex()) != JFlexInternalAdbLexer.YYEOF)
			{
				System.out.println(lexer.yytext() + " = " + token);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}		
	}

	@Override
	public void postInvoke() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void preInvoke() {
		// TODO Auto-generated method stub
		
	}

}
