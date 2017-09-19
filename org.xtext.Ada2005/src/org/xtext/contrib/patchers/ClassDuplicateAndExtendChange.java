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
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.PackageDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;


public class ClassDuplicateAndExtendChange implements IWorkflowComponent {

	private String javaFilename = "";
	private String javaPackageName = "";
	private String javaProjectName = "";
	private String sourceFolder = "";
	
	private String newExtend = "";
	
	private String newJavaFilename = "";
	private String newJavaPackageName = "";
	private String newJavaProjectName = "";
	private String newSourceFolder = "";
	
	/**
	 * @return the javaFilename
	 */
	public String getJavaFilename() {
		return javaFilename;
	}

	/**
	 * @param javaFilename the javaFilename to set
	 */
	public void setJavaFilename(String javaFilename) {
		this.javaFilename = javaFilename;
	}

	/**
	 * @return the javaPackageName
	 */
	public String getJavaPackageName() {
		return javaPackageName;
	}

	/**
	 * @param javaPackageName the javaPackageName to set
	 */
	public void setJavaPackageName(String javaPackageName) {
		this.javaPackageName = javaPackageName;
	}

	/**
	 * @return the javaProjectName
	 */
	public String getJavaProjectName() {
		return javaProjectName;
	}

	/**
	 * @param javaProjectName the javaProjectName to set
	 */
	public void setJavaProjectName(String javaProjectName) {
		this.javaProjectName = javaProjectName;
	}

	/**
	 * @return the sourceFolder
	 */
	public String getSourceFolder() {
		return sourceFolder;
	}

	/**
	 * @param sourceFolder the sourceFolder to set
	 */
	public void setSourceFolder(String sourceFolder) {
		this.sourceFolder = sourceFolder;
	}

	/**
	 * @return the newExtend
	 */
	public String getNewExtend() {
		return newExtend;
	}

	/**
	 * @param newExtend the newExtend to set
	 */
	public void setNewExtend(String newExtend) {
		this.newExtend = newExtend;
	}

	/**
	 * @return the newJavaFilename
	 */
	public String getNewJavaFilename() {
		return newJavaFilename;
	}

	/**
	 * @param newJavaFilename the newJavaFilename to set
	 */
	public void setNewJavaFilename(String newJavaFilename) {
		this.newJavaFilename = newJavaFilename;
	}

	/**
	 * @return the newJavaPackageName
	 */
	public String getNewJavaPackageName() {
		return newJavaPackageName;
	}

	/**
	 * @param newJavaPackageName the newJavaPackageName to set
	 */
	public void setNewJavaPackageName(String newJavaPackageName) {
		this.newJavaPackageName = newJavaPackageName;
	}

	/**
	 * @return the newJavaProjectName
	 */
	public String getNewJavaProjectName() {
		return newJavaProjectName;
	}

	/**
	 * @param newJavaProjectName the newJavaProjectName to set
	 */
	public void setNewJavaProjectName(String newJavaProjectName) {
		this.newJavaProjectName = newJavaProjectName;
	}

	/**
	 * @return the newSourceFolder
	 */
	public String getNewSourceFolder() {
		return newSourceFolder;
	}

	/**
	 * @param newSourceFolder the newSourceFolder to set
	 */
	public void setNewSourceFolder(String newSourceFolder) {
		this.newSourceFolder = newSourceFolder;
	}

	public ClassDuplicateAndExtendChange() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void invoke(IWorkflowContext arg0) {
		// TODO Auto-generated method stub
		String sourceFilename = "../" + getJavaProjectName() + '/'
				+ getSourceFolder() + '/'
				+ getJavaPackageName().replace('.', '/') + '/'
				+ getJavaFilename();

		File originalJavaFile = new File(sourceFilename);
		
		String newFilename = "../" + getNewJavaProjectName() + '/'
				+ getNewSourceFolder() + '/'
				+ getNewJavaPackageName().replace('.', '/') + '/'
				+ getNewJavaFilename();
		
		File newJavaFile = new File(newFilename);
		try {
			FileUtils.copyFile(originalJavaFile, newJavaFile);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String sourceCode = null;
		try {
			sourceCode = FileUtils.readFileToString(newJavaFile);
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
		
		// Set the package's name.
		PackageDeclaration newPackageDecl = compilationUnitToCorrect.getAST().newPackageDeclaration();
		Name name = newPackageDecl.getAST().newName(getNewJavaPackageName().split("\\."));
		newPackageDecl.setName(name);
		compilationUnitToCorrect.setPackage(newPackageDecl);
		
		for (Object son : compilationUnitToCorrect.types()) {
			TypeDeclaration type = (TypeDeclaration) son;
			String newClassName = getNewJavaFilename().replaceAll("\\.java$", "");
			// Change class's name.
			type.getName().setIdentifier(newClassName);

			// Change extended type
			String qualifiedName = getNewExtend();	
			String[] qualifier = qualifiedName.split("\\.");
			Name qualifiedname = type.getAST().newName(qualifier);    		
    		Type extendedType = type.getAST().newSimpleType(qualifiedname);
			type.setSuperclassType(extendedType);
			
			// Change constructers name.
			
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
			FileUtils.writeStringToFile(newJavaFile,
					compilationUnitToCorrect.toString());
			
		} catch (IOException e) {
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
