/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.ada2005.adb.AdbPackage
 * @generated
 */
public interface AdbFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AdbFactory eINSTANCE = org.xtext.ada2005.adb.impl.AdbFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Compilation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compilation</em>'.
   * @generated
   */
  Compilation createCompilation();

  /**
   * Returns a new object of class '<em>Compilation Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compilation Unit</em>'.
   * @generated
   */
  CompilationUnit createCompilationUnit();

  /**
   * Returns a new object of class '<em>Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unit</em>'.
   * @generated
   */
  Unit createUnit();

  /**
   * Returns a new object of class '<em>Context Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Clause</em>'.
   * @generated
   */
  ContextClause createContextClause();

  /**
   * Returns a new object of class '<em>Context Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Item</em>'.
   * @generated
   */
  ContextItem createContextItem();

  /**
   * Returns a new object of class '<em>With Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>With Clause</em>'.
   * @generated
   */
  WithClause createWithClause();

  /**
   * Returns a new object of class '<em>Use Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Use Clause</em>'.
   * @generated
   */
  UseClause createUseClause();

  /**
   * Returns a new object of class '<em>Use Package Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Use Package Clause</em>'.
   * @generated
   */
  UsePackageClause createUsePackageClause();

  /**
   * Returns a new object of class '<em>Use Type Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Use Type Clause</em>'.
   * @generated
   */
  UseTypeClause createUseTypeClause();

  /**
   * Returns a new object of class '<em>Library Unit Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Library Unit Declaration</em>'.
   * @generated
   */
  LibraryUnitDeclaration createLibraryUnitDeclaration();

  /**
   * Returns a new object of class '<em>Library Unit Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Library Unit Specification</em>'.
   * @generated
   */
  LibraryUnitSpecification createLibraryUnitSpecification();

  /**
   * Returns a new object of class '<em>Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Declaration</em>'.
   * @generated
   */
  PackageDeclaration createPackageDeclaration();

  /**
   * Returns a new object of class '<em>Package Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Definition</em>'.
   * @generated
   */
  PackageDefinition createPackageDefinition();

  /**
   * Returns a new object of class '<em>Renaming</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Renaming</em>'.
   * @generated
   */
  Renaming createRenaming();

  /**
   * Returns a new object of class '<em>Generic Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generic Declaration</em>'.
   * @generated
   */
  GenericDeclaration createGenericDeclaration();

  /**
   * Returns a new object of class '<em>Generic Instantiation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generic Instantiation</em>'.
   * @generated
   */
  GenericInstantiation createGenericInstantiation();

  /**
   * Returns a new object of class '<em>Package Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Specification</em>'.
   * @generated
   */
  PackageSpecification createPackageSpecification();

  /**
   * Returns a new object of class '<em>Subprogram Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subprogram Body</em>'.
   * @generated
   */
  SubprogramBody createSubprogramBody();

  /**
   * Returns a new object of class '<em>Declarative Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declarative Block</em>'.
   * @generated
   */
  DeclarativeBlock createDeclarativeBlock();

  /**
   * Returns a new object of class '<em>Basic Declarative Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Declarative Item</em>'.
   * @generated
   */
  BasicDeclarativeItem createBasicDeclarativeItem();

  /**
   * Returns a new object of class '<em>Basic Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Declaration</em>'.
   * @generated
   */
  BasicDeclaration createBasicDeclaration();

  /**
   * Returns a new object of class '<em>Task Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Declaration</em>'.
   * @generated
   */
  TaskDeclaration createTaskDeclaration();

  /**
   * Returns a new object of class '<em>Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Declaration</em>'.
   * @generated
   */
  TypeDeclaration createTypeDeclaration();

  /**
   * Returns a new object of class '<em>New Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New Type Declaration</em>'.
   * @generated
   */
  NewTypeDeclaration createNewTypeDeclaration();

  /**
   * Returns a new object of class '<em>Full Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Full Type Declaration</em>'.
   * @generated
   */
  FullTypeDeclaration createFullTypeDeclaration();

  /**
   * Returns a new object of class '<em>Full Data Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Full Data Type Declaration</em>'.
   * @generated
   */
  FullDataTypeDeclaration createFullDataTypeDeclaration();

  /**
   * Returns a new object of class '<em>Incomplete Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Incomplete Type Declaration</em>'.
   * @generated
   */
  IncompleteTypeDeclaration createIncompleteTypeDeclaration();

  /**
   * Returns a new object of class '<em>Private Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Private Type Declaration</em>'.
   * @generated
   */
  PrivateTypeDeclaration createPrivateTypeDeclaration();

  /**
   * Returns a new object of class '<em>Private Extension Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Private Extension Declaration</em>'.
   * @generated
   */
  PrivateExtensionDeclaration createPrivateExtensionDeclaration();

  /**
   * Returns a new object of class '<em>Task Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Item</em>'.
   * @generated
   */
  TaskItem createTaskItem();

  /**
   * Returns a new object of class '<em>Entry Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entry Declaration</em>'.
   * @generated
   */
  EntryDeclaration createEntryDeclaration();

  /**
   * Returns a new object of class '<em>Overriding Indicator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Overriding Indicator</em>'.
   * @generated
   */
  OverridingIndicator createOverridingIndicator();

  /**
   * Returns a new object of class '<em>Protected Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protected Type Declaration</em>'.
   * @generated
   */
  ProtectedTypeDeclaration createProtectedTypeDeclaration();

  /**
   * Returns a new object of class '<em>Protected Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protected Definition</em>'.
   * @generated
   */
  ProtectedDefinition createProtectedDefinition();

  /**
   * Returns a new object of class '<em>Protected Element Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protected Element Declaration</em>'.
   * @generated
   */
  ProtectedElementDeclaration createProtectedElementDeclaration();

  /**
   * Returns a new object of class '<em>Protected Operation Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protected Operation Declaration</em>'.
   * @generated
   */
  ProtectedOperationDeclaration createProtectedOperationDeclaration();

  /**
   * Returns a new object of class '<em>Subprogram Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subprogram Declaration</em>'.
   * @generated
   */
  SubprogramDeclaration createSubprogramDeclaration();

  /**
   * Returns a new object of class '<em>Subprogram Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subprogram Specification</em>'.
   * @generated
   */
  SubprogramSpecification createSubprogramSpecification();

  /**
   * Returns a new object of class '<em>Procedure Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Procedure Specification</em>'.
   * @generated
   */
  ProcedureSpecification createProcedureSpecification();

  /**
   * Returns a new object of class '<em>Function Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Specification</em>'.
   * @generated
   */
  FunctionSpecification createFunctionSpecification();

  /**
   * Returns a new object of class '<em>Handled Sequence Of Statements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Handled Sequence Of Statements</em>'.
   * @generated
   */
  HandledSequenceOfStatements createHandledSequenceOfStatements();

  /**
   * Returns a new object of class '<em>Exception Choice</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exception Choice</em>'.
   * @generated
   */
  ExceptionChoice createExceptionChoice();

  /**
   * Returns a new object of class '<em>Exception Handler</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exception Handler</em>'.
   * @generated
   */
  ExceptionHandler createExceptionHandler();

  /**
   * Returns a new object of class '<em>Declarative Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declarative Item</em>'.
   * @generated
   */
  DeclarativeItem createDeclarativeItem();

  /**
   * Returns a new object of class '<em>Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Body</em>'.
   * @generated
   */
  Body createBody();

  /**
   * Returns a new object of class '<em>Proper Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Proper Body</em>'.
   * @generated
   */
  ProperBody createProperBody();

  /**
   * Returns a new object of class '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label</em>'.
   * @generated
   */
  Label createLabel();

  /**
   * Returns a new object of class '<em>Sequence Of Statements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence Of Statements</em>'.
   * @generated
   */
  SequenceOfStatements createSequenceOfStatements();

  /**
   * Returns a new object of class '<em>Labelisable Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Labelisable Statement</em>'.
   * @generated
   */
  LabelisableStatement createLabelisableStatement();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Simple Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Statement</em>'.
   * @generated
   */
  SimpleStatement createSimpleStatement();

  /**
   * Returns a new object of class '<em>Compound Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compound Statement</em>'.
   * @generated
   */
  CompoundStatement createCompoundStatement();

  /**
   * Returns a new object of class '<em>Null Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null Statement</em>'.
   * @generated
   */
  NullStatement createNullStatement();

  /**
   * Returns a new object of class '<em>Library Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Library Specification</em>'.
   * @generated
   */
  LibrarySpecification createLibrarySpecification();

  /**
   * Returns a new object of class '<em>Generic Items</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generic Items</em>'.
   * @generated
   */
  GenericItems createGenericItems();

  /**
   * Returns a new object of class '<em>Generic Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generic Item</em>'.
   * @generated
   */
  GenericItem createGenericItem();

  /**
   * Returns a new object of class '<em>Generic Formal Parameter Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generic Formal Parameter Declaration</em>'.
   * @generated
   */
  GenericFormalParameterDeclaration createGenericFormalParameterDeclaration();

  /**
   * Returns a new object of class '<em>Formal Object Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formal Object Declaration</em>'.
   * @generated
   */
  FormalObjectDeclaration createFormalObjectDeclaration();

  /**
   * Returns a new object of class '<em>Formal Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formal Type Declaration</em>'.
   * @generated
   */
  FormalTypeDeclaration createFormalTypeDeclaration();

  /**
   * Returns a new object of class '<em>Formal Type Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formal Type Definition</em>'.
   * @generated
   */
  FormalTypeDefinition createFormalTypeDefinition();

  /**
   * Returns a new object of class '<em>Formal Private Type Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formal Private Type Definition</em>'.
   * @generated
   */
  FormalPrivateTypeDefinition createFormalPrivateTypeDefinition();

  /**
   * Returns a new object of class '<em>Formal Derived Type Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formal Derived Type Definition</em>'.
   * @generated
   */
  FormalDerivedTypeDefinition createFormalDerivedTypeDefinition();

  /**
   * Returns a new object of class '<em>Formal Subprogram Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formal Subprogram Declaration</em>'.
   * @generated
   */
  FormalSubprogramDeclaration createFormalSubprogramDeclaration();

  /**
   * Returns a new object of class '<em>Subprogram Default</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subprogram Default</em>'.
   * @generated
   */
  SubprogramDefault createSubprogramDefault();

  /**
   * Returns a new object of class '<em>Formal Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formal Package Declaration</em>'.
   * @generated
   */
  FormalPackageDeclaration createFormalPackageDeclaration();

  /**
   * Returns a new object of class '<em>Formal Package Actual Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formal Package Actual Part</em>'.
   * @generated
   */
  FormalPackageActualPart createFormalPackageActualPart();

  /**
   * Returns a new object of class '<em>Formal Package Association</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formal Package Association</em>'.
   * @generated
   */
  FormalPackageAssociation createFormalPackageAssociation();

  /**
   * Returns a new object of class '<em>Exception Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exception Declaration</em>'.
   * @generated
   */
  ExceptionDeclaration createExceptionDeclaration();

  /**
   * Returns a new object of class '<em>Object Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Declaration</em>'.
   * @generated
   */
  ObjectDeclaration createObjectDeclaration();

  /**
   * Returns a new object of class '<em>Data Instance Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Instance Declaration</em>'.
   * @generated
   */
  DataInstanceDeclaration createDataInstanceDeclaration();

  /**
   * Returns a new object of class '<em>Single Protected Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Protected Declaration</em>'.
   * @generated
   */
  SingleProtectedDeclaration createSingleProtectedDeclaration();

  /**
   * Returns a new object of class '<em>Pragma</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pragma</em>'.
   * @generated
   */
  Pragma createPragma();

  /**
   * Returns a new object of class '<em>Pragma Argument Association</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pragma Argument Association</em>'.
   * @generated
   */
  PragmaArgumentAssociation createPragmaArgumentAssociation();

  /**
   * Returns a new object of class '<em>Subtype Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subtype Declaration</em>'.
   * @generated
   */
  SubtypeDeclaration createSubtypeDeclaration();

  /**
   * Returns a new object of class '<em>Number Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Declaration</em>'.
   * @generated
   */
  NumberDeclaration createNumberDeclaration();

  /**
   * Returns a new object of class '<em>Assignment Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment Statement</em>'.
   * @generated
   */
  AssignmentStatement createAssignmentStatement();

  /**
   * Returns a new object of class '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Statement</em>'.
   * @generated
   */
  IfStatement createIfStatement();

  /**
   * Returns a new object of class '<em>Case Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Statement</em>'.
   * @generated
   */
  CaseStatement createCaseStatement();

  /**
   * Returns a new object of class '<em>Case Statement Alternative</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Statement Alternative</em>'.
   * @generated
   */
  CaseStatementAlternative createCaseStatementAlternative();

  /**
   * Returns a new object of class '<em>Loop Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loop Statement</em>'.
   * @generated
   */
  LoopStatement createLoopStatement();

  /**
   * Returns a new object of class '<em>Iteration Scheme</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Iteration Scheme</em>'.
   * @generated
   */
  IterationScheme createIterationScheme();

  /**
   * Returns a new object of class '<em>Loop Parameter Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loop Parameter Specification</em>'.
   * @generated
   */
  LoopParameterSpecification createLoopParameterSpecification();

  /**
   * Returns a new object of class '<em>Block Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Statement</em>'.
   * @generated
   */
  BlockStatement createBlockStatement();

  /**
   * Returns a new object of class '<em>Exit Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exit Statement</em>'.
   * @generated
   */
  ExitStatement createExitStatement();

  /**
   * Returns a new object of class '<em>Goto Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goto Statement</em>'.
   * @generated
   */
  GotoStatement createGotoStatement();

  /**
   * Returns a new object of class '<em>Procedure Or Entry Call Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Procedure Or Entry Call Statement</em>'.
   * @generated
   */
  ProcedureOrEntryCallStatement createProcedureOrEntryCallStatement();

  /**
   * Returns a new object of class '<em>Simple Return Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Return Statement</em>'.
   * @generated
   */
  SimpleReturnStatement createSimpleReturnStatement();

  /**
   * Returns a new object of class '<em>Extended Return Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extended Return Statement</em>'.
   * @generated
   */
  ExtendedReturnStatement createExtendedReturnStatement();

  /**
   * Returns a new object of class '<em>Return Subtype Indication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Subtype Indication</em>'.
   * @generated
   */
  ReturnSubtypeIndication createReturnSubtypeIndication();

  /**
   * Returns a new object of class '<em>Package Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Body</em>'.
   * @generated
   */
  PackageBody createPackageBody();

  /**
   * Returns a new object of class '<em>Task Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Definition</em>'.
   * @generated
   */
  TaskDefinition createTaskDefinition();

  /**
   * Returns a new object of class '<em>Task Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Body</em>'.
   * @generated
   */
  TaskBody createTaskBody();

  /**
   * Returns a new object of class '<em>Protected Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protected Body</em>'.
   * @generated
   */
  ProtectedBody createProtectedBody();

  /**
   * Returns a new object of class '<em>Protected Operation Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protected Operation Item</em>'.
   * @generated
   */
  ProtectedOperationItem createProtectedOperationItem();

  /**
   * Returns a new object of class '<em>Accept Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Accept Statement</em>'.
   * @generated
   */
  AcceptStatement createAcceptStatement();

  /**
   * Returns a new object of class '<em>Entry Index</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entry Index</em>'.
   * @generated
   */
  EntryIndex createEntryIndex();

  /**
   * Returns a new object of class '<em>Entry Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entry Body</em>'.
   * @generated
   */
  EntryBody createEntryBody();

  /**
   * Returns a new object of class '<em>Entry Body Formal Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entry Body Formal Part</em>'.
   * @generated
   */
  EntryBodyFormalPart createEntryBodyFormalPart();

  /**
   * Returns a new object of class '<em>Entry Barrier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entry Barrier</em>'.
   * @generated
   */
  EntryBarrier createEntryBarrier();

  /**
   * Returns a new object of class '<em>Entry Index Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entry Index Specification</em>'.
   * @generated
   */
  EntryIndexSpecification createEntryIndexSpecification();

  /**
   * Returns a new object of class '<em>Requeue Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Requeue Statement</em>'.
   * @generated
   */
  RequeueStatement createRequeueStatement();

  /**
   * Returns a new object of class '<em>Delay Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delay Statement</em>'.
   * @generated
   */
  DelayStatement createDelayStatement();

  /**
   * Returns a new object of class '<em>Select Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Statement</em>'.
   * @generated
   */
  SelectStatement createSelectStatement();

  /**
   * Returns a new object of class '<em>Selective Accept</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selective Accept</em>'.
   * @generated
   */
  SelectiveAccept createSelectiveAccept();

  /**
   * Returns a new object of class '<em>Guarded Alternative</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Guarded Alternative</em>'.
   * @generated
   */
  GuardedAlternative createGuardedAlternative();

  /**
   * Returns a new object of class '<em>Guard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Guard</em>'.
   * @generated
   */
  Guard createGuard();

  /**
   * Returns a new object of class '<em>Select Alternative</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Alternative</em>'.
   * @generated
   */
  SelectAlternative createSelectAlternative();

  /**
   * Returns a new object of class '<em>Accept Alternative</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Accept Alternative</em>'.
   * @generated
   */
  AcceptAlternative createAcceptAlternative();

  /**
   * Returns a new object of class '<em>Delay Alternative</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delay Alternative</em>'.
   * @generated
   */
  DelayAlternative createDelayAlternative();

  /**
   * Returns a new object of class '<em>Timed Entry Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Timed Entry Call</em>'.
   * @generated
   */
  TimedEntryCall createTimedEntryCall();

  /**
   * Returns a new object of class '<em>Entry Call Alternative</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entry Call Alternative</em>'.
   * @generated
   */
  EntryCallAlternative createEntryCallAlternative();

  /**
   * Returns a new object of class '<em>Conditional Entry Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional Entry Call</em>'.
   * @generated
   */
  ConditionalEntryCall createConditionalEntryCall();

  /**
   * Returns a new object of class '<em>Asynchronous Select</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Asynchronous Select</em>'.
   * @generated
   */
  AsynchronousSelect createAsynchronousSelect();

  /**
   * Returns a new object of class '<em>Triggering Alternative</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Triggering Alternative</em>'.
   * @generated
   */
  TriggeringAlternative createTriggeringAlternative();

  /**
   * Returns a new object of class '<em>Triggering Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Triggering Statement</em>'.
   * @generated
   */
  TriggeringStatement createTriggeringStatement();

  /**
   * Returns a new object of class '<em>Abortable Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abortable Part</em>'.
   * @generated
   */
  AbortablePart createAbortablePart();

  /**
   * Returns a new object of class '<em>Abort Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abort Statement</em>'.
   * @generated
   */
  AbortStatement createAbortStatement();

  /**
   * Returns a new object of class '<em>Task Names</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Names</em>'.
   * @generated
   */
  TaskNames createTaskNames();

  /**
   * Returns a new object of class '<em>Body Stub</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Body Stub</em>'.
   * @generated
   */
  BodyStub createBodyStub();

  /**
   * Returns a new object of class '<em>Package Body Stub</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Body Stub</em>'.
   * @generated
   */
  PackageBodyStub createPackageBodyStub();

  /**
   * Returns a new object of class '<em>Task Body Stub</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Body Stub</em>'.
   * @generated
   */
  TaskBodyStub createTaskBodyStub();

  /**
   * Returns a new object of class '<em>Protected Body Stub</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protected Body Stub</em>'.
   * @generated
   */
  ProtectedBodyStub createProtectedBodyStub();

  /**
   * Returns a new object of class '<em>Separate Subunit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Separate Subunit</em>'.
   * @generated
   */
  SeparateSubunit createSeparateSubunit();

  /**
   * Returns a new object of class '<em>Raise Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Raise Statement</em>'.
   * @generated
   */
  RaiseStatement createRaiseStatement();

  /**
   * Returns a new object of class '<em>Generic Actual Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generic Actual Part</em>'.
   * @generated
   */
  GenericActualPart createGenericActualPart();

  /**
   * Returns a new object of class '<em>Generic Association</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generic Association</em>'.
   * @generated
   */
  GenericAssociation createGenericAssociation();

  /**
   * Returns a new object of class '<em>Explicit Generic Actual Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Explicit Generic Actual Parameter</em>'.
   * @generated
   */
  ExplicitGenericActualParameter createExplicitGenericActualParameter();

  /**
   * Returns a new object of class '<em>Type Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Definition</em>'.
   * @generated
   */
  TypeDefinition createTypeDefinition();

  /**
   * Returns a new object of class '<em>Discriminant Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Discriminant Part</em>'.
   * @generated
   */
  DiscriminantPart createDiscriminantPart();

  /**
   * Returns a new object of class '<em>Unknown Discriminant Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unknown Discriminant Part</em>'.
   * @generated
   */
  UnknownDiscriminantPart createUnknownDiscriminantPart();

  /**
   * Returns a new object of class '<em>Known Discriminant Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Known Discriminant Part</em>'.
   * @generated
   */
  KnownDiscriminantPart createKnownDiscriminantPart();

  /**
   * Returns a new object of class '<em>Discriminant Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Discriminant Specification</em>'.
   * @generated
   */
  DiscriminantSpecification createDiscriminantSpecification();

  /**
   * Returns a new object of class '<em>Interface List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface List</em>'.
   * @generated
   */
  InterfaceList createInterfaceList();

  /**
   * Returns a new object of class '<em>Interface Type Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Type Definition</em>'.
   * @generated
   */
  InterfaceTypeDefinition createInterfaceTypeDefinition();

  /**
   * Returns a new object of class '<em>Derived Type Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Derived Type Definition</em>'.
   * @generated
   */
  DerivedTypeDefinition createDerivedTypeDefinition();

  /**
   * Returns a new object of class '<em>Record Extension Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Record Extension Part</em>'.
   * @generated
   */
  RecordExtensionPart createRecordExtensionPart();

  /**
   * Returns a new object of class '<em>Access Type Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Access Type Definition</em>'.
   * @generated
   */
  AccessTypeDefinition createAccessTypeDefinition();

  /**
   * Returns a new object of class '<em>Access Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Access Specification</em>'.
   * @generated
   */
  AccessSpecification createAccessSpecification();

  /**
   * Returns a new object of class '<em>Access To Subprogram Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Access To Subprogram Definition</em>'.
   * @generated
   */
  AccessToSubprogramDefinition createAccessToSubprogramDefinition();

  /**
   * Returns a new object of class '<em>Access To Data Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Access To Data Definition</em>'.
   * @generated
   */
  AccessToDataDefinition createAccessToDataDefinition();

  /**
   * Returns a new object of class '<em>Array Type Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Type Definition</em>'.
   * @generated
   */
  ArrayTypeDefinition createArrayTypeDefinition();

  /**
   * Returns a new object of class '<em>Array Indexes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Indexes</em>'.
   * @generated
   */
  ArrayIndexes createArrayIndexes();

  /**
   * Returns a new object of class '<em>Unconstrained Indexes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unconstrained Indexes</em>'.
   * @generated
   */
  UnconstrainedIndexes createUnconstrainedIndexes();

  /**
   * Returns a new object of class '<em>Constrained Indexes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constrained Indexes</em>'.
   * @generated
   */
  ConstrainedIndexes createConstrainedIndexes();

  /**
   * Returns a new object of class '<em>Discrete Subtype Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Discrete Subtype Definition</em>'.
   * @generated
   */
  DiscreteSubtypeDefinition createDiscreteSubtypeDefinition();

  /**
   * Returns a new object of class '<em>Component Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component Definition</em>'.
   * @generated
   */
  ComponentDefinition createComponentDefinition();

  /**
   * Returns a new object of class '<em>Anonymous Access Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Anonymous Access Definition</em>'.
   * @generated
   */
  AnonymousAccessDefinition createAnonymousAccessDefinition();

  /**
   * Returns a new object of class '<em>Not Null Access Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Null Access Definition</em>'.
   * @generated
   */
  NotNullAccessDefinition createNotNullAccessDefinition();

  /**
   * Returns a new object of class '<em>Access To Data Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Access To Data Instance</em>'.
   * @generated
   */
  AccessToDataInstance createAccessToDataInstance();

  /**
   * Returns a new object of class '<em>Parameter And Result Profile</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter And Result Profile</em>'.
   * @generated
   */
  ParameterAndResultProfile createParameterAndResultProfile();

  /**
   * Returns a new object of class '<em>Formal Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formal Part</em>'.
   * @generated
   */
  FormalPart createFormalPart();

  /**
   * Returns a new object of class '<em>Parameter Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Specification</em>'.
   * @generated
   */
  ParameterSpecification createParameterSpecification();

  /**
   * Returns a new object of class '<em>Mode</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mode</em>'.
   * @generated
   */
  Mode createMode();

  /**
   * Returns a new object of class '<em>Integer Type Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Type Definition</em>'.
   * @generated
   */
  IntegerTypeDefinition createIntegerTypeDefinition();

  /**
   * Returns a new object of class '<em>Signed Integer Type Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signed Integer Type Definition</em>'.
   * @generated
   */
  SignedIntegerTypeDefinition createSignedIntegerTypeDefinition();

  /**
   * Returns a new object of class '<em>Modular Type Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Modular Type Definition</em>'.
   * @generated
   */
  ModularTypeDefinition createModularTypeDefinition();

  /**
   * Returns a new object of class '<em>Enumeration Type Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumeration Type Definition</em>'.
   * @generated
   */
  EnumerationTypeDefinition createEnumerationTypeDefinition();

  /**
   * Returns a new object of class '<em>Record Type Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Record Type Definition</em>'.
   * @generated
   */
  RecordTypeDefinition createRecordTypeDefinition();

  /**
   * Returns a new object of class '<em>Record Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Record Definition</em>'.
   * @generated
   */
  RecordDefinition createRecordDefinition();

  /**
   * Returns a new object of class '<em>Component List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component List</em>'.
   * @generated
   */
  ComponentList createComponentList();

  /**
   * Returns a new object of class '<em>Opt Variant Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Opt Variant Part</em>'.
   * @generated
   */
  OptVariantPart createOptVariantPart();

  /**
   * Returns a new object of class '<em>Component Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component Item</em>'.
   * @generated
   */
  ComponentItem createComponentItem();

  /**
   * Returns a new object of class '<em>Component Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component Declaration</em>'.
   * @generated
   */
  ComponentDeclaration createComponentDeclaration();

  /**
   * Returns a new object of class '<em>Defining Identifier List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Defining Identifier List</em>'.
   * @generated
   */
  DefiningIdentifierList createDefiningIdentifierList();

  /**
   * Returns a new object of class '<em>Aspect Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aspect Clause</em>'.
   * @generated
   */
  AspectClause createAspectClause();

  /**
   * Returns a new object of class '<em>Mod Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mod Clause</em>'.
   * @generated
   */
  ModClause createModClause();

  /**
   * Returns a new object of class '<em>Component Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component Clause</em>'.
   * @generated
   */
  ComponentClause createComponentClause();

  /**
   * Returns a new object of class '<em>Variant Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variant Part</em>'.
   * @generated
   */
  VariantPart createVariantPart();

  /**
   * Returns a new object of class '<em>Variant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variant</em>'.
   * @generated
   */
  Variant createVariant();

  /**
   * Returns a new object of class '<em>Discrete Choice List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Discrete Choice List</em>'.
   * @generated
   */
  DiscreteChoiceList createDiscreteChoiceList();

  /**
   * Returns a new object of class '<em>Real Type Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Type Definition</em>'.
   * @generated
   */
  RealTypeDefinition createRealTypeDefinition();

  /**
   * Returns a new object of class '<em>Floating Point Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Floating Point Definition</em>'.
   * @generated
   */
  FloatingPointDefinition createFloatingPointDefinition();

  /**
   * Returns a new object of class '<em>Real Range Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Range Specification</em>'.
   * @generated
   */
  RealRangeSpecification createRealRangeSpecification();

  /**
   * Returns a new object of class '<em>Fixed Point Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fixed Point Definition</em>'.
   * @generated
   */
  FixedPointDefinition createFixedPointDefinition();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relation</em>'.
   * @generated
   */
  Relation createRelation();

  /**
   * Returns a new object of class '<em>Membership</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Membership</em>'.
   * @generated
   */
  Membership createMembership();

  /**
   * Returns a new object of class '<em>Interval</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interval</em>'.
   * @generated
   */
  Interval createInterval();

  /**
   * Returns a new object of class '<em>Simple Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Expression</em>'.
   * @generated
   */
  SimpleExpression createSimpleExpression();

  /**
   * Returns a new object of class '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Term</em>'.
   * @generated
   */
  Term createTerm();

  /**
   * Returns a new object of class '<em>Factor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Factor</em>'.
   * @generated
   */
  Factor createFactor();

  /**
   * Returns a new object of class '<em>Primary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary</em>'.
   * @generated
   */
  Primary createPrimary();

  /**
   * Returns a new object of class '<em>Numeric Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numeric Literal</em>'.
   * @generated
   */
  NumericLiteral createNumericLiteral();

  /**
   * Returns a new object of class '<em>Null</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null</em>'.
   * @generated
   */
  Null createNull();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>Qualified Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualified Name</em>'.
   * @generated
   */
  QualifiedName createQualifiedName();

  /**
   * Returns a new object of class '<em>Parenthesized Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parenthesized Expression</em>'.
   * @generated
   */
  ParenthesizedExpression createParenthesizedExpression();

  /**
   * Returns a new object of class '<em>Qualifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualifier</em>'.
   * @generated
   */
  Qualifier createQualifier();

  /**
   * Returns a new object of class '<em>Allocator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Allocator</em>'.
   * @generated
   */
  Allocator createAllocator();

  /**
   * Returns a new object of class '<em>Subtype Indication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subtype Indication</em>'.
   * @generated
   */
  SubtypeIndication createSubtypeIndication();

  /**
   * Returns a new object of class '<em>Opt Null Exclusion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Opt Null Exclusion</em>'.
   * @generated
   */
  OptNullExclusion createOptNullExclusion();

  /**
   * Returns a new object of class '<em>Opt Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Opt Constraint</em>'.
   * @generated
   */
  OptConstraint createOptConstraint();

  /**
   * Returns a new object of class '<em>Scalar Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scalar Constraint</em>'.
   * @generated
   */
  ScalarConstraint createScalarConstraint();

  /**
   * Returns a new object of class '<em>Digits Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Digits Constraint</em>'.
   * @generated
   */
  DigitsConstraint createDigitsConstraint();

  /**
   * Returns a new object of class '<em>Delta Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delta Constraint</em>'.
   * @generated
   */
  DeltaConstraint createDeltaConstraint();

  /**
   * Returns a new object of class '<em>Range Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range Constraint</em>'.
   * @generated
   */
  RangeConstraint createRangeConstraint();

  /**
   * Returns a new object of class '<em>Composite Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composite Constraint</em>'.
   * @generated
   */
  CompositeConstraint createCompositeConstraint();

  /**
   * Returns a new object of class '<em>Discriminant Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Discriminant Constraint</em>'.
   * @generated
   */
  DiscriminantConstraint createDiscriminantConstraint();

  /**
   * Returns a new object of class '<em>Index Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Index Constraint</em>'.
   * @generated
   */
  IndexConstraint createIndexConstraint();

  /**
   * Returns a new object of class '<em>Discriminant Association</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Discriminant Association</em>'.
   * @generated
   */
  DiscriminantAssociation createDiscriminantAssociation();

  /**
   * Returns a new object of class '<em>Discriminant Selectors</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Discriminant Selectors</em>'.
   * @generated
   */
  DiscriminantSelectors createDiscriminantSelectors();

  /**
   * Returns a new object of class '<em>Discrete Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Discrete Range</em>'.
   * @generated
   */
  DiscreteRange createDiscreteRange();

  /**
   * Returns a new object of class '<em>Component Choice List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component Choice List</em>'.
   * @generated
   */
  ComponentChoiceList createComponentChoiceList();

  /**
   * Returns a new object of class '<em>Discrete Choice</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Discrete Choice</em>'.
   * @generated
   */
  DiscreteChoice createDiscreteChoice();

  /**
   * Returns a new object of class '<em>Aggregate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aggregate</em>'.
   * @generated
   */
  Aggregate createAggregate();

  /**
   * Returns a new object of class '<em>Record Aggregate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Record Aggregate</em>'.
   * @generated
   */
  RecordAggregate createRecordAggregate();

  /**
   * Returns a new object of class '<em>Record Component Association List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Record Component Association List</em>'.
   * @generated
   */
  RecordComponentAssociationList createRecordComponentAssociationList();

  /**
   * Returns a new object of class '<em>Record Component Association</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Record Component Association</em>'.
   * @generated
   */
  RecordComponentAssociation createRecordComponentAssociation();

  /**
   * Returns a new object of class '<em>Initialized Components</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Initialized Components</em>'.
   * @generated
   */
  InitializedComponents createInitializedComponents();

  /**
   * Returns a new object of class '<em>Uninitialized Components</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Uninitialized Components</em>'.
   * @generated
   */
  UninitializedComponents createUninitializedComponents();

  /**
   * Returns a new object of class '<em>Extension Aggregate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extension Aggregate</em>'.
   * @generated
   */
  ExtensionAggregate createExtensionAggregate();

  /**
   * Returns a new object of class '<em>Array Aggregate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Aggregate</em>'.
   * @generated
   */
  ArrayAggregate createArrayAggregate();

  /**
   * Returns a new object of class '<em>Positional Array Aggregate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Positional Array Aggregate</em>'.
   * @generated
   */
  PositionalArrayAggregate createPositionalArrayAggregate();

  /**
   * Returns a new object of class '<em>Named Array Aggregate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Array Aggregate</em>'.
   * @generated
   */
  NamedArrayAggregate createNamedArrayAggregate();

  /**
   * Returns a new object of class '<em>Array Component Association</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Component Association</em>'.
   * @generated
   */
  ArrayComponentAssociation createArrayComponentAssociation();

  /**
   * Returns a new object of class '<em>Ancestor Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ancestor Part</em>'.
   * @generated
   */
  AncestorPart createAncestorPart();

  /**
   * Returns a new object of class '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name</em>'.
   * @generated
   */
  Name createName();

  /**
   * Returns a new object of class '<em>Primary Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Name</em>'.
   * @generated
   */
  PrimaryName createPrimaryName();

  /**
   * Returns a new object of class '<em>Parameter Association</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Association</em>'.
   * @generated
   */
  ParameterAssociation createParameterAssociation();

  /**
   * Returns a new object of class '<em>Parameter Effective Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Effective Value</em>'.
   * @generated
   */
  ParameterEffectiveValue createParameterEffectiveValue();

  /**
   * Returns a new object of class '<em>Attribute Designator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Designator</em>'.
   * @generated
   */
  AttributeDesignator createAttributeDesignator();

  /**
   * Returns a new object of class '<em>Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range</em>'.
   * @generated
   */
  Range createRange();

  /**
   * Returns a new object of class '<em>Entity Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Range</em>'.
   * @generated
   */
  EntityRange createEntityRange();

  /**
   * Returns a new object of class '<em>Explicit Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Explicit Range</em>'.
   * @generated
   */
  ExplicitRange createExplicitRange();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AdbPackage getAdbPackage();

} //AdbFactory
