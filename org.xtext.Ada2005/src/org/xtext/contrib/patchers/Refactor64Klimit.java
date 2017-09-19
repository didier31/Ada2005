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
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.Initializer;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

import org.apache.commons.io.FileUtils;

public class Refactor64Klimit implements IWorkflowComponent {

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
		CompilationUnit compilationUnitToCorrect = (CompilationUnit) parser
				.createAST(null);

		final int maxStatementsPerOperation = 1000;
		int functionCount = 0;
		int currentStatement = 0;

		MethodDeclaration method = null;
		Block body = null;

		for (Object son : compilationUnitToCorrect.types()) {
			TypeDeclaration type = (TypeDeclaration) son;
			FieldDeclaration[] fields = type.getFields();
			for (FieldDeclaration field : fields) {
				@SuppressWarnings("unchecked")
				List<VariableDeclarationFragment> fragments = field
						.fragments();
				String name = fragments.get(0).getName().getIdentifier();
				boolean keyword = name.matches("KEYWORD_[0-9]+");
				boolean rule = name.matches("RULE_[A-Z_]+");
				boolean eof = name.matches("EOF");
				if (!field.getType().isArrayType() && (!( keyword || rule || eof))){
					@SuppressWarnings("unchecked")
					List<Modifier> modifiers = field.modifiers();

					boolean isStatic = false;
					Modifier finalMod = null;

					for (Modifier modifier : modifiers) {
						isStatic = isStatic || modifier.isStatic();
						if (modifier.isFinal())
							finalMod = modifier;
					}
					// isStatic says if list of fields is static.
					// finalMod contains the 'final' modifier reference or null

					modifiers.remove(finalMod);

					if (isStatic == true && finalMod != null) {

						// if maxStatementsPerOperation is reached then
						// create a new function with a new numbering
						if (maxStatementsPerOperation < currentStatement
								+ fragments.size()
								|| currentStatement == 0) {
							if (currentStatement != 0) {
								method.setBody(body);
							}
							currentStatement = 0;
							method = type.getAST().newMethodDeclaration();
							method.setName(type.getAST().newSimpleName(
									"initializer" + functionCount));
							functionCount++;
							@SuppressWarnings("unchecked")
							List<BodyDeclaration> bodyDecl = type
									.bodyDeclarations();
							bodyDecl.add(method);
							body = method.getAST().newBlock();
						}

						@SuppressWarnings("unchecked")
						List<Statement> statements = body.statements();
						for (VariableDeclarationFragment var : fragments) {
							Expression initExpr = var.getInitializer();
							if (initExpr != null) {
								currentStatement++;
								var.setInitializer(null);
								Assignment assign = body.getAST()
										.newAssignment();
								assign.setLeftHandSide(assign
										.getAST()
										.newSimpleName(var.getName().toString()));
								assign.setOperator(Assignment.Operator.ASSIGN);
								assign.setRightHandSide(initExpr);
								ExpressionStatement assignStmt = body.getAST()
										.newExpressionStatement(assign);
								// Add fragment as statement in the current
								// function
								statements.add(assignStmt);
							}
						}
					}
				}
			}
			generateInitializer(functionCount, type);
		}

		if (currentStatement != 0) {
			method.setBody(body);
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

	void generateInitializer(int last, TypeDeclaration typeToModify) {
		Initializer initializer = typeToModify.getAST().newInitializer();
		Block body = initializer.getAST().newBlock();
		for (int i = 0; i < last; i++) {
			MethodInvocation methodCall = initializer.getAST()
					.newMethodInvocation();
			SimpleName name = methodCall.getAST().newSimpleName(
					"initializer" + i);
			methodCall.setName(name);
			@SuppressWarnings("unchecked")
			List<Statement> statements = body.statements();
			ExpressionStatement callStmt = body.getAST()
					.newExpressionStatement(methodCall);
			statements.add(callStmt);
		}
		initializer.setBody(body);
		@SuppressWarnings("unchecked")
		List<BodyDeclaration> bodyDecl = typeToModify.bodyDeclarations();
		bodyDecl.add(initializer);
	}

	public void postInvoke() {
	}

	public void preInvoke() {
	}
}