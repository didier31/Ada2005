package org.xtext.contrib.patchers;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.apache.commons.io.FileUtils;

public class PatchJFlexReader implements IWorkflowComponent {

	private String javaFilename = "";
	private String javaPackageName = "";
	private String javaProjectName = "";
	private String sourceFolder = "";

	public String getSourceFolder() {
		return sourceFolder;
	}

	public void setSourceFolder(String argSourceFolder) {
		sourceFolder = argSourceFolder;
	}

	public void setJavaFilename(String argJavaFilename) {
		javaFilename = argJavaFilename;
	}

	public String getJavaFilename() {
		return javaFilename;
	}

	public void setJavaPackageName(String argJavaPackageName) {
		javaPackageName = argJavaPackageName;
	}

	public String getJavaPackageName() {
		return javaPackageName;
	}

	public void setJavaProjectName(String argJavaProjectName) {
		javaProjectName = argJavaProjectName;
	}

	public String getJavaProjectName() {
		return javaProjectName;
	}

	public void invoke(IWorkflowContext ctx) {

		String sourceFilename = "../" + getJavaProjectName() + '/'
				+ getSourceFolder() + '/'
				+ getJavaPackageName().replace('.', '/') + '/'
				+ getJavaFilename();

		File file = new File(sourceFilename);

		System.out.println("source : " + file.getAbsolutePath());

		String sourceCode = null;
		try {
			sourceCode = FileUtils.readFileToString(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

		ASTParser parser = ASTParser.newParser(AST.JLS8);

		parser.setSource(sourceCode.toCharArray());
		Map<String, String> options = JavaCore.getOptions();
		JavaCore.setComplianceOptions(JavaCore.VERSION_1_5, options);
		parser.setCompilerOptions(options);
		CompilationUnit compilationUnitToCorrect = (CompilationUnit) parser.createAST(null);
		String name = null;
		Type fieldType = null;
		
		for (Object son : compilationUnitToCorrect.types()) {
			TypeDeclaration type = (TypeDeclaration) son;
			
			MethodDeclaration[] methods = type.getMethods();
			
			for (MethodDeclaration method : methods)
			{
				name = method.getName().getIdentifier();
				boolean yyresetFound = name.matches("yyreset");
				boolean JFlexInternalAdbLexerFound = name.matches(getJavaFilename().substring(0, getJavaFilename().length() - 5));
				
				if (yyresetFound)
				{
					@SuppressWarnings("unchecked")
					List<SingleVariableDeclaration> params = method.parameters();
					SingleVariableDeclaration param = params.get(0);
					fieldType = param.getAST().newSimpleType(param.getAST().newName("org.xtext.ada2005.parser.antlr.lexer.jflex.Reader"));
					param.setType(fieldType);					
				} else
				
				if (JFlexInternalAdbLexerFound && method.parameters().size() == 1)
				{
					@SuppressWarnings("unchecked")
					List<SingleVariableDeclaration> params = method.parameters();
					SingleVariableDeclaration param = params.get(0);
					SimpleType paramType = (SimpleType) param.getType();
					if (paramType.getName().getFullyQualifiedName().matches("java.io.Reader"))
					{
						fieldType = param.getAST().newSimpleType(param.getAST().newName("org.xtext.ada2005.parser.antlr.lexer.jflex.Reader"));
						param.setType(fieldType);	
					}
				}
			}

			
			FieldDeclaration[] fields = type.getFields();
			for (FieldDeclaration field : fields) {
				@SuppressWarnings("unchecked")
				List<VariableDeclarationFragment> fragments = field
						.fragments();
				name = fragments.get(0).getName().getIdentifier();
				boolean zzReaderFound = name.matches("zzReader");				
				if (zzReaderFound)
				{
					fieldType = field.getAST().newSimpleType(field.getAST().newName("org.xtext.ada2005.parser.antlr.lexer.jflex.Reader"));
					field.setType(fieldType);
					@SuppressWarnings("unchecked")
					List<Modifier> modifiers = field.modifiers();

					for (Modifier modifier : modifiers) 
					{
						if (modifier.isPrivate())
						   modifier.setKeyword(ModifierKeyword.PROTECTED_KEYWORD);
					}					
				}
			}
		}

		// Write the refactored compilation unit.
		try {
			FileUtils.writeStringToFile(file,
					compilationUnitToCorrect.toString());
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public void postInvoke() {
	}

	public void preInvoke() {
	}
}