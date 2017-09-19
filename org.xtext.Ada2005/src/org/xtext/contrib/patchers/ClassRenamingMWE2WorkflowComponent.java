package org.xtext.contrib.patchers;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;


public class ClassRenamingMWE2WorkflowComponent implements IWorkflowComponent {

	private String javaFilename = "";
	private String javaPackageName = "";
	private String javaProjectName = "";
	private String sourceFolder = "";
	private String regexp = "";
	private String replacedBy = "";

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

	public String getRegexp() {
		return regexp;
	}

	public void setRegexp(String regexp) {
		this.regexp = regexp;
	}

	public String getReplacedBy() {
		return replacedBy;
	}

	public void setReplacedBy(String replacedBy) {
		this.replacedBy = replacedBy;
	}

	public void invoke(IWorkflowContext ctx) {

		String sourceFilename = "../" + getJavaProjectName() + '/'
				+ getSourceFolder() + '/'
				+ getJavaPackageName().replace('.', '/') + '/'
				+ getJavaFilename();

		File file = new File(sourceFilename);

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
		CompilationUnit compilationUnitToCorrect = (CompilationUnit) parser
				.createAST(null);
		
		for (Object son : compilationUnitToCorrect.types()) {
			TypeDeclaration type = (TypeDeclaration) son;
			String newClassName = type.getName().getIdentifier().replaceAll(getRegexp(), getReplacedBy());
			type.getName().setIdentifier(newClassName);
			@SuppressWarnings({ "unchecked" })
			List<BodyDeclaration> bodyDecls = type.bodyDeclarations();
			for (BodyDeclaration bodyDecl : bodyDecls)
			{
				if (bodyDecl instanceof MethodDeclaration)
				{
					MethodDeclaration methodDecl = (MethodDeclaration) bodyDecl;
					if (methodDecl.isConstructor())
					{
						methodDecl.setName(methodDecl.getAST().newSimpleName(newClassName));
					}
				}
			}
		}

		// Write the refactored compilation unit.
		try {
			FileUtils.writeStringToFile(file,
					compilationUnitToCorrect.toString());
			
			String renamedFilename = file.getParentFile().getAbsolutePath() 
					               + File.separatorChar +
					                 file.getName().replaceAll(getRegexp(), getReplacedBy());
			file.renameTo(new File(renamedFilename));
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
