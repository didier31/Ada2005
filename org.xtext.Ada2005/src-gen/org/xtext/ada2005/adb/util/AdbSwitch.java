/**
 */
package org.xtext.ada2005.adb.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.ada2005.adb.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.ada2005.adb.AdbPackage
 * @generated
 */
public class AdbSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AdbPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdbSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AdbPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AdbPackage.COMPILATION:
      {
        Compilation compilation = (Compilation)theEObject;
        T result = caseCompilation(compilation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.COMPILATION_UNIT:
      {
        CompilationUnit compilationUnit = (CompilationUnit)theEObject;
        T result = caseCompilationUnit(compilationUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.UNIT:
      {
        Unit unit = (Unit)theEObject;
        T result = caseUnit(unit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.CONTEXT_CLAUSE:
      {
        ContextClause contextClause = (ContextClause)theEObject;
        T result = caseContextClause(contextClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.CONTEXT_ITEM:
      {
        ContextItem contextItem = (ContextItem)theEObject;
        T result = caseContextItem(contextItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.WITH_CLAUSE:
      {
        WithClause withClause = (WithClause)theEObject;
        T result = caseWithClause(withClause);
        if (result == null) result = caseContextItem(withClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.USE_CLAUSE:
      {
        UseClause useClause = (UseClause)theEObject;
        T result = caseUseClause(useClause);
        if (result == null) result = caseContextItem(useClause);
        if (result == null) result = caseBasicDeclarativeItem(useClause);
        if (result == null) result = caseGenericItem(useClause);
        if (result == null) result = caseDeclarativeItem(useClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.USE_PACKAGE_CLAUSE:
      {
        UsePackageClause usePackageClause = (UsePackageClause)theEObject;
        T result = caseUsePackageClause(usePackageClause);
        if (result == null) result = caseUseClause(usePackageClause);
        if (result == null) result = caseContextItem(usePackageClause);
        if (result == null) result = caseBasicDeclarativeItem(usePackageClause);
        if (result == null) result = caseGenericItem(usePackageClause);
        if (result == null) result = caseDeclarativeItem(usePackageClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.USE_TYPE_CLAUSE:
      {
        UseTypeClause useTypeClause = (UseTypeClause)theEObject;
        T result = caseUseTypeClause(useTypeClause);
        if (result == null) result = caseUseClause(useTypeClause);
        if (result == null) result = caseContextItem(useTypeClause);
        if (result == null) result = caseBasicDeclarativeItem(useTypeClause);
        if (result == null) result = caseGenericItem(useTypeClause);
        if (result == null) result = caseDeclarativeItem(useTypeClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.LIBRARY_UNIT_DECLARATION:
      {
        LibraryUnitDeclaration libraryUnitDeclaration = (LibraryUnitDeclaration)theEObject;
        T result = caseLibraryUnitDeclaration(libraryUnitDeclaration);
        if (result == null) result = caseUnit(libraryUnitDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.LIBRARY_UNIT_SPECIFICATION:
      {
        LibraryUnitSpecification libraryUnitSpecification = (LibraryUnitSpecification)theEObject;
        T result = caseLibraryUnitSpecification(libraryUnitSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PACKAGE_DECLARATION:
      {
        PackageDeclaration packageDeclaration = (PackageDeclaration)theEObject;
        T result = casePackageDeclaration(packageDeclaration);
        if (result == null) result = caseLibraryUnitSpecification(packageDeclaration);
        if (result == null) result = caseBasicDeclaration(packageDeclaration);
        if (result == null) result = caseBasicDeclarativeItem(packageDeclaration);
        if (result == null) result = caseDeclarativeItem(packageDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PACKAGE_DEFINITION:
      {
        PackageDefinition packageDefinition = (PackageDefinition)theEObject;
        T result = casePackageDefinition(packageDefinition);
        if (result == null) result = casePackageDeclaration(packageDefinition);
        if (result == null) result = caseLibrarySpecification(packageDefinition);
        if (result == null) result = caseLibraryUnitSpecification(packageDefinition);
        if (result == null) result = caseBasicDeclaration(packageDefinition);
        if (result == null) result = caseBasicDeclarativeItem(packageDefinition);
        if (result == null) result = caseDeclarativeItem(packageDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.RENAMING:
      {
        Renaming renaming = (Renaming)theEObject;
        T result = caseRenaming(renaming);
        if (result == null) result = casePackageDeclaration(renaming);
        if (result == null) result = caseLibraryUnitSpecification(renaming);
        if (result == null) result = caseBasicDeclaration(renaming);
        if (result == null) result = caseBasicDeclarativeItem(renaming);
        if (result == null) result = caseDeclarativeItem(renaming);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.GENERIC_DECLARATION:
      {
        GenericDeclaration genericDeclaration = (GenericDeclaration)theEObject;
        T result = caseGenericDeclaration(genericDeclaration);
        if (result == null) result = caseLibraryUnitSpecification(genericDeclaration);
        if (result == null) result = caseBasicDeclaration(genericDeclaration);
        if (result == null) result = caseBasicDeclarativeItem(genericDeclaration);
        if (result == null) result = caseDeclarativeItem(genericDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.GENERIC_INSTANTIATION:
      {
        GenericInstantiation genericInstantiation = (GenericInstantiation)theEObject;
        T result = caseGenericInstantiation(genericInstantiation);
        if (result == null) result = caseLibraryUnitSpecification(genericInstantiation);
        if (result == null) result = caseBasicDeclaration(genericInstantiation);
        if (result == null) result = caseBasicDeclarativeItem(genericInstantiation);
        if (result == null) result = caseDeclarativeItem(genericInstantiation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PACKAGE_SPECIFICATION:
      {
        PackageSpecification packageSpecification = (PackageSpecification)theEObject;
        T result = casePackageSpecification(packageSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.SUBPROGRAM_BODY:
      {
        SubprogramBody subprogramBody = (SubprogramBody)theEObject;
        T result = caseSubprogramBody(subprogramBody);
        if (result == null) result = caseUnit(subprogramBody);
        if (result == null) result = caseDeclarativeBlock(subprogramBody);
        if (result == null) result = caseProperBody(subprogramBody);
        if (result == null) result = caseProtectedOperationItem(subprogramBody);
        if (result == null) result = caseBody(subprogramBody);
        if (result == null) result = caseDeclarativeItem(subprogramBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.DECLARATIVE_BLOCK:
      {
        DeclarativeBlock declarativeBlock = (DeclarativeBlock)theEObject;
        T result = caseDeclarativeBlock(declarativeBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.BASIC_DECLARATIVE_ITEM:
      {
        BasicDeclarativeItem basicDeclarativeItem = (BasicDeclarativeItem)theEObject;
        T result = caseBasicDeclarativeItem(basicDeclarativeItem);
        if (result == null) result = caseDeclarativeItem(basicDeclarativeItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.BASIC_DECLARATION:
      {
        BasicDeclaration basicDeclaration = (BasicDeclaration)theEObject;
        T result = caseBasicDeclaration(basicDeclaration);
        if (result == null) result = caseBasicDeclarativeItem(basicDeclaration);
        if (result == null) result = caseDeclarativeItem(basicDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.TASK_DECLARATION:
      {
        TaskDeclaration taskDeclaration = (TaskDeclaration)theEObject;
        T result = caseTaskDeclaration(taskDeclaration);
        if (result == null) result = caseBasicDeclaration(taskDeclaration);
        if (result == null) result = caseBasicDeclarativeItem(taskDeclaration);
        if (result == null) result = caseDeclarativeItem(taskDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.TYPE_DECLARATION:
      {
        TypeDeclaration typeDeclaration = (TypeDeclaration)theEObject;
        T result = caseTypeDeclaration(typeDeclaration);
        if (result == null) result = caseBasicDeclaration(typeDeclaration);
        if (result == null) result = caseBasicDeclarativeItem(typeDeclaration);
        if (result == null) result = caseDeclarativeItem(typeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.NEW_TYPE_DECLARATION:
      {
        NewTypeDeclaration newTypeDeclaration = (NewTypeDeclaration)theEObject;
        T result = caseNewTypeDeclaration(newTypeDeclaration);
        if (result == null) result = caseTypeDeclaration(newTypeDeclaration);
        if (result == null) result = caseBasicDeclaration(newTypeDeclaration);
        if (result == null) result = caseBasicDeclarativeItem(newTypeDeclaration);
        if (result == null) result = caseDeclarativeItem(newTypeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.FULL_TYPE_DECLARATION:
      {
        FullTypeDeclaration fullTypeDeclaration = (FullTypeDeclaration)theEObject;
        T result = caseFullTypeDeclaration(fullTypeDeclaration);
        if (result == null) result = caseNewTypeDeclaration(fullTypeDeclaration);
        if (result == null) result = caseTypeDeclaration(fullTypeDeclaration);
        if (result == null) result = caseBasicDeclaration(fullTypeDeclaration);
        if (result == null) result = caseBasicDeclarativeItem(fullTypeDeclaration);
        if (result == null) result = caseDeclarativeItem(fullTypeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.FULL_DATA_TYPE_DECLARATION:
      {
        FullDataTypeDeclaration fullDataTypeDeclaration = (FullDataTypeDeclaration)theEObject;
        T result = caseFullDataTypeDeclaration(fullDataTypeDeclaration);
        if (result == null) result = caseFullTypeDeclaration(fullDataTypeDeclaration);
        if (result == null) result = caseNewTypeDeclaration(fullDataTypeDeclaration);
        if (result == null) result = caseTypeDeclaration(fullDataTypeDeclaration);
        if (result == null) result = caseBasicDeclaration(fullDataTypeDeclaration);
        if (result == null) result = caseBasicDeclarativeItem(fullDataTypeDeclaration);
        if (result == null) result = caseDeclarativeItem(fullDataTypeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.INCOMPLETE_TYPE_DECLARATION:
      {
        IncompleteTypeDeclaration incompleteTypeDeclaration = (IncompleteTypeDeclaration)theEObject;
        T result = caseIncompleteTypeDeclaration(incompleteTypeDeclaration);
        if (result == null) result = caseNewTypeDeclaration(incompleteTypeDeclaration);
        if (result == null) result = caseTypeDeclaration(incompleteTypeDeclaration);
        if (result == null) result = caseBasicDeclaration(incompleteTypeDeclaration);
        if (result == null) result = caseBasicDeclarativeItem(incompleteTypeDeclaration);
        if (result == null) result = caseDeclarativeItem(incompleteTypeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PRIVATE_TYPE_DECLARATION:
      {
        PrivateTypeDeclaration privateTypeDeclaration = (PrivateTypeDeclaration)theEObject;
        T result = casePrivateTypeDeclaration(privateTypeDeclaration);
        if (result == null) result = caseNewTypeDeclaration(privateTypeDeclaration);
        if (result == null) result = caseTypeDeclaration(privateTypeDeclaration);
        if (result == null) result = caseBasicDeclaration(privateTypeDeclaration);
        if (result == null) result = caseBasicDeclarativeItem(privateTypeDeclaration);
        if (result == null) result = caseDeclarativeItem(privateTypeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION:
      {
        PrivateExtensionDeclaration privateExtensionDeclaration = (PrivateExtensionDeclaration)theEObject;
        T result = casePrivateExtensionDeclaration(privateExtensionDeclaration);
        if (result == null) result = caseNewTypeDeclaration(privateExtensionDeclaration);
        if (result == null) result = caseTypeDeclaration(privateExtensionDeclaration);
        if (result == null) result = caseBasicDeclaration(privateExtensionDeclaration);
        if (result == null) result = caseBasicDeclarativeItem(privateExtensionDeclaration);
        if (result == null) result = caseDeclarativeItem(privateExtensionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.TASK_ITEM:
      {
        TaskItem taskItem = (TaskItem)theEObject;
        T result = caseTaskItem(taskItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ENTRY_DECLARATION:
      {
        EntryDeclaration entryDeclaration = (EntryDeclaration)theEObject;
        T result = caseEntryDeclaration(entryDeclaration);
        if (result == null) result = caseTaskItem(entryDeclaration);
        if (result == null) result = caseProtectedOperationDeclaration(entryDeclaration);
        if (result == null) result = caseProtectedElementDeclaration(entryDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.OVERRIDING_INDICATOR:
      {
        OverridingIndicator overridingIndicator = (OverridingIndicator)theEObject;
        T result = caseOverridingIndicator(overridingIndicator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PROTECTED_TYPE_DECLARATION:
      {
        ProtectedTypeDeclaration protectedTypeDeclaration = (ProtectedTypeDeclaration)theEObject;
        T result = caseProtectedTypeDeclaration(protectedTypeDeclaration);
        if (result == null) result = caseFullTypeDeclaration(protectedTypeDeclaration);
        if (result == null) result = caseNewTypeDeclaration(protectedTypeDeclaration);
        if (result == null) result = caseTypeDeclaration(protectedTypeDeclaration);
        if (result == null) result = caseBasicDeclaration(protectedTypeDeclaration);
        if (result == null) result = caseBasicDeclarativeItem(protectedTypeDeclaration);
        if (result == null) result = caseDeclarativeItem(protectedTypeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PROTECTED_DEFINITION:
      {
        ProtectedDefinition protectedDefinition = (ProtectedDefinition)theEObject;
        T result = caseProtectedDefinition(protectedDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PROTECTED_ELEMENT_DECLARATION:
      {
        ProtectedElementDeclaration protectedElementDeclaration = (ProtectedElementDeclaration)theEObject;
        T result = caseProtectedElementDeclaration(protectedElementDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PROTECTED_OPERATION_DECLARATION:
      {
        ProtectedOperationDeclaration protectedOperationDeclaration = (ProtectedOperationDeclaration)theEObject;
        T result = caseProtectedOperationDeclaration(protectedOperationDeclaration);
        if (result == null) result = caseProtectedElementDeclaration(protectedOperationDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.SUBPROGRAM_DECLARATION:
      {
        SubprogramDeclaration subprogramDeclaration = (SubprogramDeclaration)theEObject;
        T result = caseSubprogramDeclaration(subprogramDeclaration);
        if (result == null) result = caseBasicDeclaration(subprogramDeclaration);
        if (result == null) result = caseProtectedOperationDeclaration(subprogramDeclaration);
        if (result == null) result = caseProtectedOperationItem(subprogramDeclaration);
        if (result == null) result = caseBasicDeclarativeItem(subprogramDeclaration);
        if (result == null) result = caseProtectedElementDeclaration(subprogramDeclaration);
        if (result == null) result = caseDeclarativeItem(subprogramDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.SUBPROGRAM_SPECIFICATION:
      {
        SubprogramSpecification subprogramSpecification = (SubprogramSpecification)theEObject;
        T result = caseSubprogramSpecification(subprogramSpecification);
        if (result == null) result = caseLibraryUnitSpecification(subprogramSpecification);
        if (result == null) result = caseLibrarySpecification(subprogramSpecification);
        if (result == null) result = caseBodyStub(subprogramSpecification);
        if (result == null) result = caseBody(subprogramSpecification);
        if (result == null) result = caseDeclarativeItem(subprogramSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PROCEDURE_SPECIFICATION:
      {
        ProcedureSpecification procedureSpecification = (ProcedureSpecification)theEObject;
        T result = caseProcedureSpecification(procedureSpecification);
        if (result == null) result = caseSubprogramSpecification(procedureSpecification);
        if (result == null) result = caseLibraryUnitSpecification(procedureSpecification);
        if (result == null) result = caseLibrarySpecification(procedureSpecification);
        if (result == null) result = caseBodyStub(procedureSpecification);
        if (result == null) result = caseBody(procedureSpecification);
        if (result == null) result = caseDeclarativeItem(procedureSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.FUNCTION_SPECIFICATION:
      {
        FunctionSpecification functionSpecification = (FunctionSpecification)theEObject;
        T result = caseFunctionSpecification(functionSpecification);
        if (result == null) result = caseSubprogramSpecification(functionSpecification);
        if (result == null) result = caseLibraryUnitSpecification(functionSpecification);
        if (result == null) result = caseLibrarySpecification(functionSpecification);
        if (result == null) result = caseBodyStub(functionSpecification);
        if (result == null) result = caseBody(functionSpecification);
        if (result == null) result = caseDeclarativeItem(functionSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.HANDLED_SEQUENCE_OF_STATEMENTS:
      {
        HandledSequenceOfStatements handledSequenceOfStatements = (HandledSequenceOfStatements)theEObject;
        T result = caseHandledSequenceOfStatements(handledSequenceOfStatements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.EXCEPTION_CHOICE:
      {
        ExceptionChoice exceptionChoice = (ExceptionChoice)theEObject;
        T result = caseExceptionChoice(exceptionChoice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.EXCEPTION_HANDLER:
      {
        ExceptionHandler exceptionHandler = (ExceptionHandler)theEObject;
        T result = caseExceptionHandler(exceptionHandler);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.DECLARATIVE_ITEM:
      {
        DeclarativeItem declarativeItem = (DeclarativeItem)theEObject;
        T result = caseDeclarativeItem(declarativeItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.BODY:
      {
        Body body = (Body)theEObject;
        T result = caseBody(body);
        if (result == null) result = caseDeclarativeItem(body);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PROPER_BODY:
      {
        ProperBody properBody = (ProperBody)theEObject;
        T result = caseProperBody(properBody);
        if (result == null) result = caseBody(properBody);
        if (result == null) result = caseDeclarativeItem(properBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.LABEL:
      {
        Label label = (Label)theEObject;
        T result = caseLabel(label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.SEQUENCE_OF_STATEMENTS:
      {
        SequenceOfStatements sequenceOfStatements = (SequenceOfStatements)theEObject;
        T result = caseSequenceOfStatements(sequenceOfStatements);
        if (result == null) result = caseHandledSequenceOfStatements(sequenceOfStatements);
        if (result == null) result = caseAbortablePart(sequenceOfStatements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.LABELISABLE_STATEMENT:
      {
        LabelisableStatement labelisableStatement = (LabelisableStatement)theEObject;
        T result = caseLabelisableStatement(labelisableStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.SIMPLE_STATEMENT:
      {
        SimpleStatement simpleStatement = (SimpleStatement)theEObject;
        T result = caseSimpleStatement(simpleStatement);
        if (result == null) result = caseStatement(simpleStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.COMPOUND_STATEMENT:
      {
        CompoundStatement compoundStatement = (CompoundStatement)theEObject;
        T result = caseCompoundStatement(compoundStatement);
        if (result == null) result = caseStatement(compoundStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.NULL_STATEMENT:
      {
        NullStatement nullStatement = (NullStatement)theEObject;
        T result = caseNullStatement(nullStatement);
        if (result == null) result = caseSimpleStatement(nullStatement);
        if (result == null) result = caseStatement(nullStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.LIBRARY_SPECIFICATION:
      {
        LibrarySpecification librarySpecification = (LibrarySpecification)theEObject;
        T result = caseLibrarySpecification(librarySpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.GENERIC_ITEMS:
      {
        GenericItems genericItems = (GenericItems)theEObject;
        T result = caseGenericItems(genericItems);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.GENERIC_ITEM:
      {
        GenericItem genericItem = (GenericItem)theEObject;
        T result = caseGenericItem(genericItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.GENERIC_FORMAL_PARAMETER_DECLARATION:
      {
        GenericFormalParameterDeclaration genericFormalParameterDeclaration = (GenericFormalParameterDeclaration)theEObject;
        T result = caseGenericFormalParameterDeclaration(genericFormalParameterDeclaration);
        if (result == null) result = caseGenericItem(genericFormalParameterDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.FORMAL_OBJECT_DECLARATION:
      {
        FormalObjectDeclaration formalObjectDeclaration = (FormalObjectDeclaration)theEObject;
        T result = caseFormalObjectDeclaration(formalObjectDeclaration);
        if (result == null) result = caseGenericFormalParameterDeclaration(formalObjectDeclaration);
        if (result == null) result = caseGenericItem(formalObjectDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.FORMAL_TYPE_DECLARATION:
      {
        FormalTypeDeclaration formalTypeDeclaration = (FormalTypeDeclaration)theEObject;
        T result = caseFormalTypeDeclaration(formalTypeDeclaration);
        if (result == null) result = caseGenericFormalParameterDeclaration(formalTypeDeclaration);
        if (result == null) result = caseGenericItem(formalTypeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.FORMAL_TYPE_DEFINITION:
      {
        FormalTypeDefinition formalTypeDefinition = (FormalTypeDefinition)theEObject;
        T result = caseFormalTypeDefinition(formalTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.FORMAL_PRIVATE_TYPE_DEFINITION:
      {
        FormalPrivateTypeDefinition formalPrivateTypeDefinition = (FormalPrivateTypeDefinition)theEObject;
        T result = caseFormalPrivateTypeDefinition(formalPrivateTypeDefinition);
        if (result == null) result = caseFormalTypeDefinition(formalPrivateTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION:
      {
        FormalDerivedTypeDefinition formalDerivedTypeDefinition = (FormalDerivedTypeDefinition)theEObject;
        T result = caseFormalDerivedTypeDefinition(formalDerivedTypeDefinition);
        if (result == null) result = caseFormalTypeDefinition(formalDerivedTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.FORMAL_SUBPROGRAM_DECLARATION:
      {
        FormalSubprogramDeclaration formalSubprogramDeclaration = (FormalSubprogramDeclaration)theEObject;
        T result = caseFormalSubprogramDeclaration(formalSubprogramDeclaration);
        if (result == null) result = caseGenericFormalParameterDeclaration(formalSubprogramDeclaration);
        if (result == null) result = caseGenericItem(formalSubprogramDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.SUBPROGRAM_DEFAULT:
      {
        SubprogramDefault subprogramDefault = (SubprogramDefault)theEObject;
        T result = caseSubprogramDefault(subprogramDefault);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.FORMAL_PACKAGE_DECLARATION:
      {
        FormalPackageDeclaration formalPackageDeclaration = (FormalPackageDeclaration)theEObject;
        T result = caseFormalPackageDeclaration(formalPackageDeclaration);
        if (result == null) result = caseGenericFormalParameterDeclaration(formalPackageDeclaration);
        if (result == null) result = caseGenericItem(formalPackageDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.FORMAL_PACKAGE_ACTUAL_PART:
      {
        FormalPackageActualPart formalPackageActualPart = (FormalPackageActualPart)theEObject;
        T result = caseFormalPackageActualPart(formalPackageActualPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.FORMAL_PACKAGE_ASSOCIATION:
      {
        FormalPackageAssociation formalPackageAssociation = (FormalPackageAssociation)theEObject;
        T result = caseFormalPackageAssociation(formalPackageAssociation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.EXCEPTION_DECLARATION:
      {
        ExceptionDeclaration exceptionDeclaration = (ExceptionDeclaration)theEObject;
        T result = caseExceptionDeclaration(exceptionDeclaration);
        if (result == null) result = caseBasicDeclaration(exceptionDeclaration);
        if (result == null) result = caseBasicDeclarativeItem(exceptionDeclaration);
        if (result == null) result = caseDeclarativeItem(exceptionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.OBJECT_DECLARATION:
      {
        ObjectDeclaration objectDeclaration = (ObjectDeclaration)theEObject;
        T result = caseObjectDeclaration(objectDeclaration);
        if (result == null) result = caseBasicDeclaration(objectDeclaration);
        if (result == null) result = caseBasicDeclarativeItem(objectDeclaration);
        if (result == null) result = caseDeclarativeItem(objectDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.DATA_INSTANCE_DECLARATION:
      {
        DataInstanceDeclaration dataInstanceDeclaration = (DataInstanceDeclaration)theEObject;
        T result = caseDataInstanceDeclaration(dataInstanceDeclaration);
        if (result == null) result = caseObjectDeclaration(dataInstanceDeclaration);
        if (result == null) result = caseBasicDeclaration(dataInstanceDeclaration);
        if (result == null) result = caseBasicDeclarativeItem(dataInstanceDeclaration);
        if (result == null) result = caseDeclarativeItem(dataInstanceDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.SINGLE_PROTECTED_DECLARATION:
      {
        SingleProtectedDeclaration singleProtectedDeclaration = (SingleProtectedDeclaration)theEObject;
        T result = caseSingleProtectedDeclaration(singleProtectedDeclaration);
        if (result == null) result = caseObjectDeclaration(singleProtectedDeclaration);
        if (result == null) result = caseBasicDeclaration(singleProtectedDeclaration);
        if (result == null) result = caseBasicDeclarativeItem(singleProtectedDeclaration);
        if (result == null) result = caseDeclarativeItem(singleProtectedDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PRAGMA:
      {
        Pragma pragma = (Pragma)theEObject;
        T result = casePragma(pragma);
        if (result == null) result = caseContextItem(pragma);
        if (result == null) result = caseBasicDeclarativeItem(pragma);
        if (result == null) result = caseStatement(pragma);
        if (result == null) result = caseDeclarativeItem(pragma);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PRAGMA_ARGUMENT_ASSOCIATION:
      {
        PragmaArgumentAssociation pragmaArgumentAssociation = (PragmaArgumentAssociation)theEObject;
        T result = casePragmaArgumentAssociation(pragmaArgumentAssociation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.SUBTYPE_DECLARATION:
      {
        SubtypeDeclaration subtypeDeclaration = (SubtypeDeclaration)theEObject;
        T result = caseSubtypeDeclaration(subtypeDeclaration);
        if (result == null) result = caseTypeDeclaration(subtypeDeclaration);
        if (result == null) result = caseBasicDeclaration(subtypeDeclaration);
        if (result == null) result = caseBasicDeclarativeItem(subtypeDeclaration);
        if (result == null) result = caseDeclarativeItem(subtypeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.NUMBER_DECLARATION:
      {
        NumberDeclaration numberDeclaration = (NumberDeclaration)theEObject;
        T result = caseNumberDeclaration(numberDeclaration);
        if (result == null) result = caseBasicDeclaration(numberDeclaration);
        if (result == null) result = caseBasicDeclarativeItem(numberDeclaration);
        if (result == null) result = caseDeclarativeItem(numberDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ASSIGNMENT_STATEMENT:
      {
        AssignmentStatement assignmentStatement = (AssignmentStatement)theEObject;
        T result = caseAssignmentStatement(assignmentStatement);
        if (result == null) result = caseSimpleStatement(assignmentStatement);
        if (result == null) result = caseStatement(assignmentStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.IF_STATEMENT:
      {
        IfStatement ifStatement = (IfStatement)theEObject;
        T result = caseIfStatement(ifStatement);
        if (result == null) result = caseCompoundStatement(ifStatement);
        if (result == null) result = caseStatement(ifStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.CASE_STATEMENT:
      {
        CaseStatement caseStatement = (CaseStatement)theEObject;
        T result = caseCaseStatement(caseStatement);
        if (result == null) result = caseCompoundStatement(caseStatement);
        if (result == null) result = caseStatement(caseStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.CASE_STATEMENT_ALTERNATIVE:
      {
        CaseStatementAlternative caseStatementAlternative = (CaseStatementAlternative)theEObject;
        T result = caseCaseStatementAlternative(caseStatementAlternative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.LOOP_STATEMENT:
      {
        LoopStatement loopStatement = (LoopStatement)theEObject;
        T result = caseLoopStatement(loopStatement);
        if (result == null) result = caseCompoundStatement(loopStatement);
        if (result == null) result = caseStatement(loopStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ITERATION_SCHEME:
      {
        IterationScheme iterationScheme = (IterationScheme)theEObject;
        T result = caseIterationScheme(iterationScheme);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.LOOP_PARAMETER_SPECIFICATION:
      {
        LoopParameterSpecification loopParameterSpecification = (LoopParameterSpecification)theEObject;
        T result = caseLoopParameterSpecification(loopParameterSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.BLOCK_STATEMENT:
      {
        BlockStatement blockStatement = (BlockStatement)theEObject;
        T result = caseBlockStatement(blockStatement);
        if (result == null) result = caseDeclarativeBlock(blockStatement);
        if (result == null) result = caseCompoundStatement(blockStatement);
        if (result == null) result = caseStatement(blockStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.EXIT_STATEMENT:
      {
        ExitStatement exitStatement = (ExitStatement)theEObject;
        T result = caseExitStatement(exitStatement);
        if (result == null) result = caseSimpleStatement(exitStatement);
        if (result == null) result = caseStatement(exitStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.GOTO_STATEMENT:
      {
        GotoStatement gotoStatement = (GotoStatement)theEObject;
        T result = caseGotoStatement(gotoStatement);
        if (result == null) result = caseSimpleStatement(gotoStatement);
        if (result == null) result = caseStatement(gotoStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PROCEDURE_OR_ENTRY_CALL_STATEMENT:
      {
        ProcedureOrEntryCallStatement procedureOrEntryCallStatement = (ProcedureOrEntryCallStatement)theEObject;
        T result = caseProcedureOrEntryCallStatement(procedureOrEntryCallStatement);
        if (result == null) result = caseSimpleStatement(procedureOrEntryCallStatement);
        if (result == null) result = caseTriggeringStatement(procedureOrEntryCallStatement);
        if (result == null) result = caseStatement(procedureOrEntryCallStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.SIMPLE_RETURN_STATEMENT:
      {
        SimpleReturnStatement simpleReturnStatement = (SimpleReturnStatement)theEObject;
        T result = caseSimpleReturnStatement(simpleReturnStatement);
        if (result == null) result = caseSimpleStatement(simpleReturnStatement);
        if (result == null) result = caseStatement(simpleReturnStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.EXTENDED_RETURN_STATEMENT:
      {
        ExtendedReturnStatement extendedReturnStatement = (ExtendedReturnStatement)theEObject;
        T result = caseExtendedReturnStatement(extendedReturnStatement);
        if (result == null) result = caseCompoundStatement(extendedReturnStatement);
        if (result == null) result = caseStatement(extendedReturnStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.RETURN_SUBTYPE_INDICATION:
      {
        ReturnSubtypeIndication returnSubtypeIndication = (ReturnSubtypeIndication)theEObject;
        T result = caseReturnSubtypeIndication(returnSubtypeIndication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PACKAGE_BODY:
      {
        PackageBody packageBody = (PackageBody)theEObject;
        T result = casePackageBody(packageBody);
        if (result == null) result = caseUnit(packageBody);
        if (result == null) result = caseDeclarativeBlock(packageBody);
        if (result == null) result = caseProperBody(packageBody);
        if (result == null) result = caseBody(packageBody);
        if (result == null) result = caseDeclarativeItem(packageBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.TASK_DEFINITION:
      {
        TaskDefinition taskDefinition = (TaskDefinition)theEObject;
        T result = caseTaskDefinition(taskDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.TASK_BODY:
      {
        TaskBody taskBody = (TaskBody)theEObject;
        T result = caseTaskBody(taskBody);
        if (result == null) result = caseDeclarativeBlock(taskBody);
        if (result == null) result = caseProperBody(taskBody);
        if (result == null) result = caseBody(taskBody);
        if (result == null) result = caseDeclarativeItem(taskBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PROTECTED_BODY:
      {
        ProtectedBody protectedBody = (ProtectedBody)theEObject;
        T result = caseProtectedBody(protectedBody);
        if (result == null) result = caseProperBody(protectedBody);
        if (result == null) result = caseBody(protectedBody);
        if (result == null) result = caseDeclarativeItem(protectedBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PROTECTED_OPERATION_ITEM:
      {
        ProtectedOperationItem protectedOperationItem = (ProtectedOperationItem)theEObject;
        T result = caseProtectedOperationItem(protectedOperationItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ACCEPT_STATEMENT:
      {
        AcceptStatement acceptStatement = (AcceptStatement)theEObject;
        T result = caseAcceptStatement(acceptStatement);
        if (result == null) result = caseCompoundStatement(acceptStatement);
        if (result == null) result = caseStatement(acceptStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ENTRY_INDEX:
      {
        EntryIndex entryIndex = (EntryIndex)theEObject;
        T result = caseEntryIndex(entryIndex);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ENTRY_BODY:
      {
        EntryBody entryBody = (EntryBody)theEObject;
        T result = caseEntryBody(entryBody);
        if (result == null) result = caseDeclarativeBlock(entryBody);
        if (result == null) result = caseProtectedOperationItem(entryBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ENTRY_BODY_FORMAL_PART:
      {
        EntryBodyFormalPart entryBodyFormalPart = (EntryBodyFormalPart)theEObject;
        T result = caseEntryBodyFormalPart(entryBodyFormalPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ENTRY_BARRIER:
      {
        EntryBarrier entryBarrier = (EntryBarrier)theEObject;
        T result = caseEntryBarrier(entryBarrier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ENTRY_INDEX_SPECIFICATION:
      {
        EntryIndexSpecification entryIndexSpecification = (EntryIndexSpecification)theEObject;
        T result = caseEntryIndexSpecification(entryIndexSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.REQUEUE_STATEMENT:
      {
        RequeueStatement requeueStatement = (RequeueStatement)theEObject;
        T result = caseRequeueStatement(requeueStatement);
        if (result == null) result = caseSimpleStatement(requeueStatement);
        if (result == null) result = caseStatement(requeueStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.DELAY_STATEMENT:
      {
        DelayStatement delayStatement = (DelayStatement)theEObject;
        T result = caseDelayStatement(delayStatement);
        if (result == null) result = caseSimpleStatement(delayStatement);
        if (result == null) result = caseTriggeringStatement(delayStatement);
        if (result == null) result = caseStatement(delayStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.SELECT_STATEMENT:
      {
        SelectStatement selectStatement = (SelectStatement)theEObject;
        T result = caseSelectStatement(selectStatement);
        if (result == null) result = caseCompoundStatement(selectStatement);
        if (result == null) result = caseStatement(selectStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.SELECTIVE_ACCEPT:
      {
        SelectiveAccept selectiveAccept = (SelectiveAccept)theEObject;
        T result = caseSelectiveAccept(selectiveAccept);
        if (result == null) result = caseSelectStatement(selectiveAccept);
        if (result == null) result = caseCompoundStatement(selectiveAccept);
        if (result == null) result = caseStatement(selectiveAccept);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.GUARDED_ALTERNATIVE:
      {
        GuardedAlternative guardedAlternative = (GuardedAlternative)theEObject;
        T result = caseGuardedAlternative(guardedAlternative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.GUARD:
      {
        Guard guard = (Guard)theEObject;
        T result = caseGuard(guard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.SELECT_ALTERNATIVE:
      {
        SelectAlternative selectAlternative = (SelectAlternative)theEObject;
        T result = caseSelectAlternative(selectAlternative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ACCEPT_ALTERNATIVE:
      {
        AcceptAlternative acceptAlternative = (AcceptAlternative)theEObject;
        T result = caseAcceptAlternative(acceptAlternative);
        if (result == null) result = caseSelectAlternative(acceptAlternative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.DELAY_ALTERNATIVE:
      {
        DelayAlternative delayAlternative = (DelayAlternative)theEObject;
        T result = caseDelayAlternative(delayAlternative);
        if (result == null) result = caseSelectAlternative(delayAlternative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.TIMED_ENTRY_CALL:
      {
        TimedEntryCall timedEntryCall = (TimedEntryCall)theEObject;
        T result = caseTimedEntryCall(timedEntryCall);
        if (result == null) result = caseSelectStatement(timedEntryCall);
        if (result == null) result = caseCompoundStatement(timedEntryCall);
        if (result == null) result = caseStatement(timedEntryCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ENTRY_CALL_ALTERNATIVE:
      {
        EntryCallAlternative entryCallAlternative = (EntryCallAlternative)theEObject;
        T result = caseEntryCallAlternative(entryCallAlternative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.CONDITIONAL_ENTRY_CALL:
      {
        ConditionalEntryCall conditionalEntryCall = (ConditionalEntryCall)theEObject;
        T result = caseConditionalEntryCall(conditionalEntryCall);
        if (result == null) result = caseSelectStatement(conditionalEntryCall);
        if (result == null) result = caseCompoundStatement(conditionalEntryCall);
        if (result == null) result = caseStatement(conditionalEntryCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ASYNCHRONOUS_SELECT:
      {
        AsynchronousSelect asynchronousSelect = (AsynchronousSelect)theEObject;
        T result = caseAsynchronousSelect(asynchronousSelect);
        if (result == null) result = caseSelectStatement(asynchronousSelect);
        if (result == null) result = caseCompoundStatement(asynchronousSelect);
        if (result == null) result = caseStatement(asynchronousSelect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.TRIGGERING_ALTERNATIVE:
      {
        TriggeringAlternative triggeringAlternative = (TriggeringAlternative)theEObject;
        T result = caseTriggeringAlternative(triggeringAlternative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.TRIGGERING_STATEMENT:
      {
        TriggeringStatement triggeringStatement = (TriggeringStatement)theEObject;
        T result = caseTriggeringStatement(triggeringStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ABORTABLE_PART:
      {
        AbortablePart abortablePart = (AbortablePart)theEObject;
        T result = caseAbortablePart(abortablePart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ABORT_STATEMENT:
      {
        AbortStatement abortStatement = (AbortStatement)theEObject;
        T result = caseAbortStatement(abortStatement);
        if (result == null) result = caseSimpleStatement(abortStatement);
        if (result == null) result = caseStatement(abortStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.TASK_NAMES:
      {
        TaskNames taskNames = (TaskNames)theEObject;
        T result = caseTaskNames(taskNames);
        if (result == null) result = caseAbortStatement(taskNames);
        if (result == null) result = caseSimpleStatement(taskNames);
        if (result == null) result = caseStatement(taskNames);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.BODY_STUB:
      {
        BodyStub bodyStub = (BodyStub)theEObject;
        T result = caseBodyStub(bodyStub);
        if (result == null) result = caseBody(bodyStub);
        if (result == null) result = caseDeclarativeItem(bodyStub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PACKAGE_BODY_STUB:
      {
        PackageBodyStub packageBodyStub = (PackageBodyStub)theEObject;
        T result = casePackageBodyStub(packageBodyStub);
        if (result == null) result = caseBodyStub(packageBodyStub);
        if (result == null) result = caseBody(packageBodyStub);
        if (result == null) result = caseDeclarativeItem(packageBodyStub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.TASK_BODY_STUB:
      {
        TaskBodyStub taskBodyStub = (TaskBodyStub)theEObject;
        T result = caseTaskBodyStub(taskBodyStub);
        if (result == null) result = caseBodyStub(taskBodyStub);
        if (result == null) result = caseBody(taskBodyStub);
        if (result == null) result = caseDeclarativeItem(taskBodyStub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PROTECTED_BODY_STUB:
      {
        ProtectedBodyStub protectedBodyStub = (ProtectedBodyStub)theEObject;
        T result = caseProtectedBodyStub(protectedBodyStub);
        if (result == null) result = caseBodyStub(protectedBodyStub);
        if (result == null) result = caseBody(protectedBodyStub);
        if (result == null) result = caseDeclarativeItem(protectedBodyStub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.SEPARATE_SUBUNIT:
      {
        SeparateSubunit separateSubunit = (SeparateSubunit)theEObject;
        T result = caseSeparateSubunit(separateSubunit);
        if (result == null) result = caseUnit(separateSubunit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.RAISE_STATEMENT:
      {
        RaiseStatement raiseStatement = (RaiseStatement)theEObject;
        T result = caseRaiseStatement(raiseStatement);
        if (result == null) result = caseSimpleStatement(raiseStatement);
        if (result == null) result = caseStatement(raiseStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.GENERIC_ACTUAL_PART:
      {
        GenericActualPart genericActualPart = (GenericActualPart)theEObject;
        T result = caseGenericActualPart(genericActualPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.GENERIC_ASSOCIATION:
      {
        GenericAssociation genericAssociation = (GenericAssociation)theEObject;
        T result = caseGenericAssociation(genericAssociation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.EXPLICIT_GENERIC_ACTUAL_PARAMETER:
      {
        ExplicitGenericActualParameter explicitGenericActualParameter = (ExplicitGenericActualParameter)theEObject;
        T result = caseExplicitGenericActualParameter(explicitGenericActualParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.TYPE_DEFINITION:
      {
        TypeDefinition typeDefinition = (TypeDefinition)theEObject;
        T result = caseTypeDefinition(typeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.DISCRIMINANT_PART:
      {
        DiscriminantPart discriminantPart = (DiscriminantPart)theEObject;
        T result = caseDiscriminantPart(discriminantPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.UNKNOWN_DISCRIMINANT_PART:
      {
        UnknownDiscriminantPart unknownDiscriminantPart = (UnknownDiscriminantPart)theEObject;
        T result = caseUnknownDiscriminantPart(unknownDiscriminantPart);
        if (result == null) result = caseDiscriminantPart(unknownDiscriminantPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.KNOWN_DISCRIMINANT_PART:
      {
        KnownDiscriminantPart knownDiscriminantPart = (KnownDiscriminantPart)theEObject;
        T result = caseKnownDiscriminantPart(knownDiscriminantPart);
        if (result == null) result = caseDiscriminantPart(knownDiscriminantPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.DISCRIMINANT_SPECIFICATION:
      {
        DiscriminantSpecification discriminantSpecification = (DiscriminantSpecification)theEObject;
        T result = caseDiscriminantSpecification(discriminantSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.INTERFACE_LIST:
      {
        InterfaceList interfaceList = (InterfaceList)theEObject;
        T result = caseInterfaceList(interfaceList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.INTERFACE_TYPE_DEFINITION:
      {
        InterfaceTypeDefinition interfaceTypeDefinition = (InterfaceTypeDefinition)theEObject;
        T result = caseInterfaceTypeDefinition(interfaceTypeDefinition);
        if (result == null) result = caseFormalTypeDefinition(interfaceTypeDefinition);
        if (result == null) result = caseTypeDefinition(interfaceTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.DERIVED_TYPE_DEFINITION:
      {
        DerivedTypeDefinition derivedTypeDefinition = (DerivedTypeDefinition)theEObject;
        T result = caseDerivedTypeDefinition(derivedTypeDefinition);
        if (result == null) result = caseTypeDefinition(derivedTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.RECORD_EXTENSION_PART:
      {
        RecordExtensionPart recordExtensionPart = (RecordExtensionPart)theEObject;
        T result = caseRecordExtensionPart(recordExtensionPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ACCESS_TYPE_DEFINITION:
      {
        AccessTypeDefinition accessTypeDefinition = (AccessTypeDefinition)theEObject;
        T result = caseAccessTypeDefinition(accessTypeDefinition);
        if (result == null) result = caseFormalTypeDefinition(accessTypeDefinition);
        if (result == null) result = caseTypeDefinition(accessTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ACCESS_SPECIFICATION:
      {
        AccessSpecification accessSpecification = (AccessSpecification)theEObject;
        T result = caseAccessSpecification(accessSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION:
      {
        AccessToSubprogramDefinition accessToSubprogramDefinition = (AccessToSubprogramDefinition)theEObject;
        T result = caseAccessToSubprogramDefinition(accessToSubprogramDefinition);
        if (result == null) result = caseAccessSpecification(accessToSubprogramDefinition);
        if (result == null) result = caseNotNullAccessDefinition(accessToSubprogramDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ACCESS_TO_DATA_DEFINITION:
      {
        AccessToDataDefinition accessToDataDefinition = (AccessToDataDefinition)theEObject;
        T result = caseAccessToDataDefinition(accessToDataDefinition);
        if (result == null) result = caseAccessSpecification(accessToDataDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ARRAY_TYPE_DEFINITION:
      {
        ArrayTypeDefinition arrayTypeDefinition = (ArrayTypeDefinition)theEObject;
        T result = caseArrayTypeDefinition(arrayTypeDefinition);
        if (result == null) result = caseFormalTypeDefinition(arrayTypeDefinition);
        if (result == null) result = caseTypeDefinition(arrayTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ARRAY_INDEXES:
      {
        ArrayIndexes arrayIndexes = (ArrayIndexes)theEObject;
        T result = caseArrayIndexes(arrayIndexes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.UNCONSTRAINED_INDEXES:
      {
        UnconstrainedIndexes unconstrainedIndexes = (UnconstrainedIndexes)theEObject;
        T result = caseUnconstrainedIndexes(unconstrainedIndexes);
        if (result == null) result = caseArrayIndexes(unconstrainedIndexes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.CONSTRAINED_INDEXES:
      {
        ConstrainedIndexes constrainedIndexes = (ConstrainedIndexes)theEObject;
        T result = caseConstrainedIndexes(constrainedIndexes);
        if (result == null) result = caseArrayIndexes(constrainedIndexes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.DISCRETE_SUBTYPE_DEFINITION:
      {
        DiscreteSubtypeDefinition discreteSubtypeDefinition = (DiscreteSubtypeDefinition)theEObject;
        T result = caseDiscreteSubtypeDefinition(discreteSubtypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.COMPONENT_DEFINITION:
      {
        ComponentDefinition componentDefinition = (ComponentDefinition)theEObject;
        T result = caseComponentDefinition(componentDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ANONYMOUS_ACCESS_DEFINITION:
      {
        AnonymousAccessDefinition anonymousAccessDefinition = (AnonymousAccessDefinition)theEObject;
        T result = caseAnonymousAccessDefinition(anonymousAccessDefinition);
        if (result == null) result = caseReturnSubtypeIndication(anonymousAccessDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.NOT_NULL_ACCESS_DEFINITION:
      {
        NotNullAccessDefinition notNullAccessDefinition = (NotNullAccessDefinition)theEObject;
        T result = caseNotNullAccessDefinition(notNullAccessDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ACCESS_TO_DATA_INSTANCE:
      {
        AccessToDataInstance accessToDataInstance = (AccessToDataInstance)theEObject;
        T result = caseAccessToDataInstance(accessToDataInstance);
        if (result == null) result = caseNotNullAccessDefinition(accessToDataInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PARAMETER_AND_RESULT_PROFILE:
      {
        ParameterAndResultProfile parameterAndResultProfile = (ParameterAndResultProfile)theEObject;
        T result = caseParameterAndResultProfile(parameterAndResultProfile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.FORMAL_PART:
      {
        FormalPart formalPart = (FormalPart)theEObject;
        T result = caseFormalPart(formalPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PARAMETER_SPECIFICATION:
      {
        ParameterSpecification parameterSpecification = (ParameterSpecification)theEObject;
        T result = caseParameterSpecification(parameterSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.MODE:
      {
        Mode mode = (Mode)theEObject;
        T result = caseMode(mode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.INTEGER_TYPE_DEFINITION:
      {
        IntegerTypeDefinition integerTypeDefinition = (IntegerTypeDefinition)theEObject;
        T result = caseIntegerTypeDefinition(integerTypeDefinition);
        if (result == null) result = caseTypeDefinition(integerTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.SIGNED_INTEGER_TYPE_DEFINITION:
      {
        SignedIntegerTypeDefinition signedIntegerTypeDefinition = (SignedIntegerTypeDefinition)theEObject;
        T result = caseSignedIntegerTypeDefinition(signedIntegerTypeDefinition);
        if (result == null) result = caseIntegerTypeDefinition(signedIntegerTypeDefinition);
        if (result == null) result = caseTypeDefinition(signedIntegerTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.MODULAR_TYPE_DEFINITION:
      {
        ModularTypeDefinition modularTypeDefinition = (ModularTypeDefinition)theEObject;
        T result = caseModularTypeDefinition(modularTypeDefinition);
        if (result == null) result = caseIntegerTypeDefinition(modularTypeDefinition);
        if (result == null) result = caseTypeDefinition(modularTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ENUMERATION_TYPE_DEFINITION:
      {
        EnumerationTypeDefinition enumerationTypeDefinition = (EnumerationTypeDefinition)theEObject;
        T result = caseEnumerationTypeDefinition(enumerationTypeDefinition);
        if (result == null) result = caseTypeDefinition(enumerationTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.RECORD_TYPE_DEFINITION:
      {
        RecordTypeDefinition recordTypeDefinition = (RecordTypeDefinition)theEObject;
        T result = caseRecordTypeDefinition(recordTypeDefinition);
        if (result == null) result = caseTypeDefinition(recordTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.RECORD_DEFINITION:
      {
        RecordDefinition recordDefinition = (RecordDefinition)theEObject;
        T result = caseRecordDefinition(recordDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.COMPONENT_LIST:
      {
        ComponentList componentList = (ComponentList)theEObject;
        T result = caseComponentList(componentList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.OPT_VARIANT_PART:
      {
        OptVariantPart optVariantPart = (OptVariantPart)theEObject;
        T result = caseOptVariantPart(optVariantPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.COMPONENT_ITEM:
      {
        ComponentItem componentItem = (ComponentItem)theEObject;
        T result = caseComponentItem(componentItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.COMPONENT_DECLARATION:
      {
        ComponentDeclaration componentDeclaration = (ComponentDeclaration)theEObject;
        T result = caseComponentDeclaration(componentDeclaration);
        if (result == null) result = caseProtectedElementDeclaration(componentDeclaration);
        if (result == null) result = caseComponentItem(componentDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.DEFINING_IDENTIFIER_LIST:
      {
        DefiningIdentifierList definingIdentifierList = (DefiningIdentifierList)theEObject;
        T result = caseDefiningIdentifierList(definingIdentifierList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ASPECT_CLAUSE:
      {
        AspectClause aspectClause = (AspectClause)theEObject;
        T result = caseAspectClause(aspectClause);
        if (result == null) result = caseBasicDeclarativeItem(aspectClause);
        if (result == null) result = caseTaskItem(aspectClause);
        if (result == null) result = caseProtectedOperationDeclaration(aspectClause);
        if (result == null) result = caseProtectedOperationItem(aspectClause);
        if (result == null) result = caseComponentItem(aspectClause);
        if (result == null) result = caseDeclarativeItem(aspectClause);
        if (result == null) result = caseProtectedElementDeclaration(aspectClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.MOD_CLAUSE:
      {
        ModClause modClause = (ModClause)theEObject;
        T result = caseModClause(modClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.COMPONENT_CLAUSE:
      {
        ComponentClause componentClause = (ComponentClause)theEObject;
        T result = caseComponentClause(componentClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.VARIANT_PART:
      {
        VariantPart variantPart = (VariantPart)theEObject;
        T result = caseVariantPart(variantPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.VARIANT:
      {
        Variant variant = (Variant)theEObject;
        T result = caseVariant(variant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.DISCRETE_CHOICE_LIST:
      {
        DiscreteChoiceList discreteChoiceList = (DiscreteChoiceList)theEObject;
        T result = caseDiscreteChoiceList(discreteChoiceList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.REAL_TYPE_DEFINITION:
      {
        RealTypeDefinition realTypeDefinition = (RealTypeDefinition)theEObject;
        T result = caseRealTypeDefinition(realTypeDefinition);
        if (result == null) result = caseTypeDefinition(realTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.FLOATING_POINT_DEFINITION:
      {
        FloatingPointDefinition floatingPointDefinition = (FloatingPointDefinition)theEObject;
        T result = caseFloatingPointDefinition(floatingPointDefinition);
        if (result == null) result = caseRealTypeDefinition(floatingPointDefinition);
        if (result == null) result = caseTypeDefinition(floatingPointDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.REAL_RANGE_SPECIFICATION:
      {
        RealRangeSpecification realRangeSpecification = (RealRangeSpecification)theEObject;
        T result = caseRealRangeSpecification(realRangeSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.FIXED_POINT_DEFINITION:
      {
        FixedPointDefinition fixedPointDefinition = (FixedPointDefinition)theEObject;
        T result = caseFixedPointDefinition(fixedPointDefinition);
        if (result == null) result = caseRealTypeDefinition(fixedPointDefinition);
        if (result == null) result = caseTypeDefinition(fixedPointDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseEntryIndex(expression);
        if (result == null) result = caseExplicitGenericActualParameter(expression);
        if (result == null) result = caseDiscreteChoice(expression);
        if (result == null) result = caseAncestorPart(expression);
        if (result == null) result = caseParameterEffectiveValue(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.RELATION:
      {
        Relation relation = (Relation)theEObject;
        T result = caseRelation(relation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.MEMBERSHIP:
      {
        Membership membership = (Membership)theEObject;
        T result = caseMembership(membership);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.INTERVAL:
      {
        Interval interval = (Interval)theEObject;
        T result = caseInterval(interval);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.SIMPLE_EXPRESSION:
      {
        SimpleExpression simpleExpression = (SimpleExpression)theEObject;
        T result = caseSimpleExpression(simpleExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.TERM:
      {
        Term term = (Term)theEObject;
        T result = caseTerm(term);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.FACTOR:
      {
        Factor factor = (Factor)theEObject;
        T result = caseFactor(factor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PRIMARY:
      {
        Primary primary = (Primary)theEObject;
        T result = casePrimary(primary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.NUMERIC_LITERAL:
      {
        NumericLiteral numericLiteral = (NumericLiteral)theEObject;
        T result = caseNumericLiteral(numericLiteral);
        if (result == null) result = casePrimary(numericLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.NULL:
      {
        Null null_ = (Null)theEObject;
        T result = caseNull(null_);
        if (result == null) result = casePrimary(null_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = casePrimary(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.QUALIFIED_NAME:
      {
        QualifiedName qualifiedName = (QualifiedName)theEObject;
        T result = caseQualifiedName(qualifiedName);
        if (result == null) result = casePrimary(qualifiedName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PARENTHESIZED_EXPRESSION:
      {
        ParenthesizedExpression parenthesizedExpression = (ParenthesizedExpression)theEObject;
        T result = caseParenthesizedExpression(parenthesizedExpression);
        if (result == null) result = casePrimary(parenthesizedExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.QUALIFIER:
      {
        Qualifier qualifier = (Qualifier)theEObject;
        T result = caseQualifier(qualifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ALLOCATOR:
      {
        Allocator allocator = (Allocator)theEObject;
        T result = caseAllocator(allocator);
        if (result == null) result = casePrimary(allocator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.SUBTYPE_INDICATION:
      {
        SubtypeIndication subtypeIndication = (SubtypeIndication)theEObject;
        T result = caseSubtypeIndication(subtypeIndication);
        if (result == null) result = caseReturnSubtypeIndication(subtypeIndication);
        if (result == null) result = caseDiscreteRange(subtypeIndication);
        if (result == null) result = caseDiscreteChoice(subtypeIndication);
        if (result == null) result = caseDiscreteSubtypeDefinition(subtypeIndication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.OPT_NULL_EXCLUSION:
      {
        OptNullExclusion optNullExclusion = (OptNullExclusion)theEObject;
        T result = caseOptNullExclusion(optNullExclusion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.OPT_CONSTRAINT:
      {
        OptConstraint optConstraint = (OptConstraint)theEObject;
        T result = caseOptConstraint(optConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.SCALAR_CONSTRAINT:
      {
        ScalarConstraint scalarConstraint = (ScalarConstraint)theEObject;
        T result = caseScalarConstraint(scalarConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.DIGITS_CONSTRAINT:
      {
        DigitsConstraint digitsConstraint = (DigitsConstraint)theEObject;
        T result = caseDigitsConstraint(digitsConstraint);
        if (result == null) result = caseScalarConstraint(digitsConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.DELTA_CONSTRAINT:
      {
        DeltaConstraint deltaConstraint = (DeltaConstraint)theEObject;
        T result = caseDeltaConstraint(deltaConstraint);
        if (result == null) result = caseScalarConstraint(deltaConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.RANGE_CONSTRAINT:
      {
        RangeConstraint rangeConstraint = (RangeConstraint)theEObject;
        T result = caseRangeConstraint(rangeConstraint);
        if (result == null) result = caseScalarConstraint(rangeConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.COMPOSITE_CONSTRAINT:
      {
        CompositeConstraint compositeConstraint = (CompositeConstraint)theEObject;
        T result = caseCompositeConstraint(compositeConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.DISCRIMINANT_CONSTRAINT:
      {
        DiscriminantConstraint discriminantConstraint = (DiscriminantConstraint)theEObject;
        T result = caseDiscriminantConstraint(discriminantConstraint);
        if (result == null) result = caseCompositeConstraint(discriminantConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.INDEX_CONSTRAINT:
      {
        IndexConstraint indexConstraint = (IndexConstraint)theEObject;
        T result = caseIndexConstraint(indexConstraint);
        if (result == null) result = caseCompositeConstraint(indexConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.DISCRIMINANT_ASSOCIATION:
      {
        DiscriminantAssociation discriminantAssociation = (DiscriminantAssociation)theEObject;
        T result = caseDiscriminantAssociation(discriminantAssociation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.DISCRIMINANT_SELECTORS:
      {
        DiscriminantSelectors discriminantSelectors = (DiscriminantSelectors)theEObject;
        T result = caseDiscriminantSelectors(discriminantSelectors);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.DISCRETE_RANGE:
      {
        DiscreteRange discreteRange = (DiscreteRange)theEObject;
        T result = caseDiscreteRange(discreteRange);
        if (result == null) result = caseDiscreteSubtypeDefinition(discreteRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.COMPONENT_CHOICE_LIST:
      {
        ComponentChoiceList componentChoiceList = (ComponentChoiceList)theEObject;
        T result = caseComponentChoiceList(componentChoiceList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.DISCRETE_CHOICE:
      {
        DiscreteChoice discreteChoice = (DiscreteChoice)theEObject;
        T result = caseDiscreteChoice(discreteChoice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.AGGREGATE:
      {
        Aggregate aggregate = (Aggregate)theEObject;
        T result = caseAggregate(aggregate);
        if (result == null) result = caseParenthesizedExpression(aggregate);
        if (result == null) result = caseQualifier(aggregate);
        if (result == null) result = casePrimary(aggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.RECORD_AGGREGATE:
      {
        RecordAggregate recordAggregate = (RecordAggregate)theEObject;
        T result = caseRecordAggregate(recordAggregate);
        if (result == null) result = caseAggregate(recordAggregate);
        if (result == null) result = caseParenthesizedExpression(recordAggregate);
        if (result == null) result = caseQualifier(recordAggregate);
        if (result == null) result = casePrimary(recordAggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.RECORD_COMPONENT_ASSOCIATION_LIST:
      {
        RecordComponentAssociationList recordComponentAssociationList = (RecordComponentAssociationList)theEObject;
        T result = caseRecordComponentAssociationList(recordComponentAssociationList);
        if (result == null) result = caseRecordAggregate(recordComponentAssociationList);
        if (result == null) result = caseAggregate(recordComponentAssociationList);
        if (result == null) result = caseParenthesizedExpression(recordComponentAssociationList);
        if (result == null) result = caseQualifier(recordComponentAssociationList);
        if (result == null) result = casePrimary(recordComponentAssociationList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.RECORD_COMPONENT_ASSOCIATION:
      {
        RecordComponentAssociation recordComponentAssociation = (RecordComponentAssociation)theEObject;
        T result = caseRecordComponentAssociation(recordComponentAssociation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.INITIALIZED_COMPONENTS:
      {
        InitializedComponents initializedComponents = (InitializedComponents)theEObject;
        T result = caseInitializedComponents(initializedComponents);
        if (result == null) result = caseRecordComponentAssociation(initializedComponents);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.UNINITIALIZED_COMPONENTS:
      {
        UninitializedComponents uninitializedComponents = (UninitializedComponents)theEObject;
        T result = caseUninitializedComponents(uninitializedComponents);
        if (result == null) result = caseRecordComponentAssociation(uninitializedComponents);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.EXTENSION_AGGREGATE:
      {
        ExtensionAggregate extensionAggregate = (ExtensionAggregate)theEObject;
        T result = caseExtensionAggregate(extensionAggregate);
        if (result == null) result = caseAggregate(extensionAggregate);
        if (result == null) result = caseParenthesizedExpression(extensionAggregate);
        if (result == null) result = caseQualifier(extensionAggregate);
        if (result == null) result = casePrimary(extensionAggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ARRAY_AGGREGATE:
      {
        ArrayAggregate arrayAggregate = (ArrayAggregate)theEObject;
        T result = caseArrayAggregate(arrayAggregate);
        if (result == null) result = caseAggregate(arrayAggregate);
        if (result == null) result = caseParenthesizedExpression(arrayAggregate);
        if (result == null) result = caseQualifier(arrayAggregate);
        if (result == null) result = casePrimary(arrayAggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.POSITIONAL_ARRAY_AGGREGATE:
      {
        PositionalArrayAggregate positionalArrayAggregate = (PositionalArrayAggregate)theEObject;
        T result = casePositionalArrayAggregate(positionalArrayAggregate);
        if (result == null) result = caseArrayAggregate(positionalArrayAggregate);
        if (result == null) result = caseAggregate(positionalArrayAggregate);
        if (result == null) result = caseParenthesizedExpression(positionalArrayAggregate);
        if (result == null) result = caseQualifier(positionalArrayAggregate);
        if (result == null) result = casePrimary(positionalArrayAggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.NAMED_ARRAY_AGGREGATE:
      {
        NamedArrayAggregate namedArrayAggregate = (NamedArrayAggregate)theEObject;
        T result = caseNamedArrayAggregate(namedArrayAggregate);
        if (result == null) result = caseArrayAggregate(namedArrayAggregate);
        if (result == null) result = caseAggregate(namedArrayAggregate);
        if (result == null) result = caseParenthesizedExpression(namedArrayAggregate);
        if (result == null) result = caseQualifier(namedArrayAggregate);
        if (result == null) result = casePrimary(namedArrayAggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ARRAY_COMPONENT_ASSOCIATION:
      {
        ArrayComponentAssociation arrayComponentAssociation = (ArrayComponentAssociation)theEObject;
        T result = caseArrayComponentAssociation(arrayComponentAssociation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ANCESTOR_PART:
      {
        AncestorPart ancestorPart = (AncestorPart)theEObject;
        T result = caseAncestorPart(ancestorPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.NAME:
      {
        Name name = (Name)theEObject;
        T result = caseName(name);
        if (result == null) result = caseInterval(name);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PRIMARY_NAME:
      {
        PrimaryName primaryName = (PrimaryName)theEObject;
        T result = casePrimaryName(primaryName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PARAMETER_ASSOCIATION:
      {
        ParameterAssociation parameterAssociation = (ParameterAssociation)theEObject;
        T result = caseParameterAssociation(parameterAssociation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.PARAMETER_EFFECTIVE_VALUE:
      {
        ParameterEffectiveValue parameterEffectiveValue = (ParameterEffectiveValue)theEObject;
        T result = caseParameterEffectiveValue(parameterEffectiveValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ATTRIBUTE_DESIGNATOR:
      {
        AttributeDesignator attributeDesignator = (AttributeDesignator)theEObject;
        T result = caseAttributeDesignator(attributeDesignator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.RANGE:
      {
        Range range = (Range)theEObject;
        T result = caseRange(range);
        if (result == null) result = caseInterval(range);
        if (result == null) result = caseRangeConstraint(range);
        if (result == null) result = caseDiscreteRange(range);
        if (result == null) result = caseDiscreteChoice(range);
        if (result == null) result = caseParameterEffectiveValue(range);
        if (result == null) result = caseScalarConstraint(range);
        if (result == null) result = caseDiscreteSubtypeDefinition(range);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.ENTITY_RANGE:
      {
        EntityRange entityRange = (EntityRange)theEObject;
        T result = caseEntityRange(entityRange);
        if (result == null) result = caseRange(entityRange);
        if (result == null) result = caseInterval(entityRange);
        if (result == null) result = caseRangeConstraint(entityRange);
        if (result == null) result = caseDiscreteRange(entityRange);
        if (result == null) result = caseDiscreteChoice(entityRange);
        if (result == null) result = caseParameterEffectiveValue(entityRange);
        if (result == null) result = caseScalarConstraint(entityRange);
        if (result == null) result = caseDiscreteSubtypeDefinition(entityRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdbPackage.EXPLICIT_RANGE:
      {
        ExplicitRange explicitRange = (ExplicitRange)theEObject;
        T result = caseExplicitRange(explicitRange);
        if (result == null) result = caseRange(explicitRange);
        if (result == null) result = caseInterval(explicitRange);
        if (result == null) result = caseRangeConstraint(explicitRange);
        if (result == null) result = caseDiscreteRange(explicitRange);
        if (result == null) result = caseDiscreteChoice(explicitRange);
        if (result == null) result = caseParameterEffectiveValue(explicitRange);
        if (result == null) result = caseScalarConstraint(explicitRange);
        if (result == null) result = caseDiscreteSubtypeDefinition(explicitRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compilation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compilation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompilation(Compilation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompilationUnit(CompilationUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnit(Unit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextClause(ContextClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextItem(ContextItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>With Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>With Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWithClause(WithClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Use Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Use Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUseClause(UseClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Use Package Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Use Package Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUsePackageClause(UsePackageClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Use Type Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Use Type Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUseTypeClause(UseTypeClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Library Unit Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Library Unit Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLibraryUnitDeclaration(LibraryUnitDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Library Unit Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Library Unit Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLibraryUnitSpecification(LibraryUnitSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageDeclaration(PackageDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageDefinition(PackageDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Renaming</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Renaming</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRenaming(Renaming object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generic Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generic Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenericDeclaration(GenericDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generic Instantiation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generic Instantiation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenericInstantiation(GenericInstantiation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageSpecification(PackageSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subprogram Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subprogram Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubprogramBody(SubprogramBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declarative Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declarative Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclarativeBlock(DeclarativeBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Declarative Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Declarative Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicDeclarativeItem(BasicDeclarativeItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicDeclaration(BasicDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskDeclaration(TaskDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDeclaration(TypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Type Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewTypeDeclaration(NewTypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Full Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Full Type Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFullTypeDeclaration(FullTypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Full Data Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Full Data Type Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFullDataTypeDeclaration(FullDataTypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Incomplete Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Incomplete Type Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIncompleteTypeDeclaration(IncompleteTypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Private Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Private Type Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrivateTypeDeclaration(PrivateTypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Private Extension Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Private Extension Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrivateExtensionDeclaration(PrivateExtensionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskItem(TaskItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entry Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entry Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntryDeclaration(EntryDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Overriding Indicator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Overriding Indicator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOverridingIndicator(OverridingIndicator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Protected Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Protected Type Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProtectedTypeDeclaration(ProtectedTypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Protected Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Protected Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProtectedDefinition(ProtectedDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Protected Element Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Protected Element Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProtectedElementDeclaration(ProtectedElementDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Protected Operation Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Protected Operation Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProtectedOperationDeclaration(ProtectedOperationDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subprogram Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subprogram Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubprogramDeclaration(SubprogramDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subprogram Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subprogram Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubprogramSpecification(SubprogramSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedureSpecification(ProcedureSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionSpecification(FunctionSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Handled Sequence Of Statements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Handled Sequence Of Statements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHandledSequenceOfStatements(HandledSequenceOfStatements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exception Choice</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exception Choice</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExceptionChoice(ExceptionChoice object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exception Handler</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exception Handler</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExceptionHandler(ExceptionHandler object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declarative Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declarative Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclarativeItem(DeclarativeItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBody(Body object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Proper Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Proper Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperBody(ProperBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabel(Label object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Of Statements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Of Statements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequenceOfStatements(SequenceOfStatements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Labelisable Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Labelisable Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabelisableStatement(LabelisableStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleStatement(SimpleStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compound Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compound Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompoundStatement(CompoundStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Null Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Null Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNullStatement(NullStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Library Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Library Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLibrarySpecification(LibrarySpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generic Items</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generic Items</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenericItems(GenericItems object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generic Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generic Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenericItem(GenericItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generic Formal Parameter Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generic Formal Parameter Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenericFormalParameterDeclaration(GenericFormalParameterDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formal Object Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formal Object Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormalObjectDeclaration(FormalObjectDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formal Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formal Type Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormalTypeDeclaration(FormalTypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formal Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formal Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormalTypeDefinition(FormalTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formal Private Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formal Private Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormalPrivateTypeDefinition(FormalPrivateTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formal Derived Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formal Derived Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormalDerivedTypeDefinition(FormalDerivedTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formal Subprogram Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formal Subprogram Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormalSubprogramDeclaration(FormalSubprogramDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subprogram Default</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subprogram Default</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubprogramDefault(SubprogramDefault object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formal Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formal Package Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormalPackageDeclaration(FormalPackageDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formal Package Actual Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formal Package Actual Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormalPackageActualPart(FormalPackageActualPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formal Package Association</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formal Package Association</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormalPackageAssociation(FormalPackageAssociation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exception Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exception Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExceptionDeclaration(ExceptionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectDeclaration(ObjectDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Instance Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Instance Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataInstanceDeclaration(DataInstanceDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Protected Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Protected Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleProtectedDeclaration(SingleProtectedDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pragma</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pragma</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePragma(Pragma object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pragma Argument Association</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pragma Argument Association</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePragmaArgumentAssociation(PragmaArgumentAssociation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subtype Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subtype Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubtypeDeclaration(SubtypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberDeclaration(NumberDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignmentStatement(AssignmentStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfStatement(IfStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaseStatement(CaseStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case Statement Alternative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case Statement Alternative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaseStatementAlternative(CaseStatementAlternative object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loop Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loop Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoopStatement(LoopStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Iteration Scheme</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Iteration Scheme</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIterationScheme(IterationScheme object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loop Parameter Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loop Parameter Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoopParameterSpecification(LoopParameterSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlockStatement(BlockStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exit Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exit Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExitStatement(ExitStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goto Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goto Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGotoStatement(GotoStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure Or Entry Call Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure Or Entry Call Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedureOrEntryCallStatement(ProcedureOrEntryCallStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Return Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Return Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleReturnStatement(SimpleReturnStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extended Return Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extended Return Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtendedReturnStatement(ExtendedReturnStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return Subtype Indication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return Subtype Indication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturnSubtypeIndication(ReturnSubtypeIndication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageBody(PackageBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskDefinition(TaskDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskBody(TaskBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Protected Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Protected Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProtectedBody(ProtectedBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Protected Operation Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Protected Operation Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProtectedOperationItem(ProtectedOperationItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Accept Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Accept Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAcceptStatement(AcceptStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entry Index</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entry Index</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntryIndex(EntryIndex object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entry Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entry Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntryBody(EntryBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entry Body Formal Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entry Body Formal Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntryBodyFormalPart(EntryBodyFormalPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entry Barrier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entry Barrier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntryBarrier(EntryBarrier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entry Index Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entry Index Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntryIndexSpecification(EntryIndexSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requeue Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requeue Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequeueStatement(RequeueStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delay Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delay Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDelayStatement(DelayStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectStatement(SelectStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selective Accept</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selective Accept</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectiveAccept(SelectiveAccept object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Guarded Alternative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Guarded Alternative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGuardedAlternative(GuardedAlternative object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Guard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Guard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGuard(Guard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Alternative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Alternative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectAlternative(SelectAlternative object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Accept Alternative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Accept Alternative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAcceptAlternative(AcceptAlternative object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delay Alternative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delay Alternative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDelayAlternative(DelayAlternative object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Timed Entry Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Timed Entry Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimedEntryCall(TimedEntryCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entry Call Alternative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entry Call Alternative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntryCallAlternative(EntryCallAlternative object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Entry Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Entry Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalEntryCall(ConditionalEntryCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Asynchronous Select</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Asynchronous Select</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAsynchronousSelect(AsynchronousSelect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Triggering Alternative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Triggering Alternative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTriggeringAlternative(TriggeringAlternative object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Triggering Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Triggering Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTriggeringStatement(TriggeringStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abortable Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abortable Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbortablePart(AbortablePart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abort Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abort Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbortStatement(AbortStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task Names</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Names</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskNames(TaskNames object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body Stub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body Stub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBodyStub(BodyStub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Body Stub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Body Stub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageBodyStub(PackageBodyStub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task Body Stub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Body Stub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskBodyStub(TaskBodyStub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Protected Body Stub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Protected Body Stub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProtectedBodyStub(ProtectedBodyStub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Separate Subunit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Separate Subunit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeparateSubunit(SeparateSubunit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Raise Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Raise Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRaiseStatement(RaiseStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generic Actual Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generic Actual Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenericActualPart(GenericActualPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generic Association</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generic Association</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenericAssociation(GenericAssociation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Explicit Generic Actual Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Explicit Generic Actual Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExplicitGenericActualParameter(ExplicitGenericActualParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDefinition(TypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Discriminant Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Discriminant Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiscriminantPart(DiscriminantPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unknown Discriminant Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unknown Discriminant Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnknownDiscriminantPart(UnknownDiscriminantPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Known Discriminant Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Known Discriminant Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKnownDiscriminantPart(KnownDiscriminantPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Discriminant Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Discriminant Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiscriminantSpecification(DiscriminantSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceList(InterfaceList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceTypeDefinition(InterfaceTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Derived Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Derived Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDerivedTypeDefinition(DerivedTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Record Extension Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Record Extension Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecordExtensionPart(RecordExtensionPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Access Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Access Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccessTypeDefinition(AccessTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Access Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Access Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccessSpecification(AccessSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Access To Subprogram Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Access To Subprogram Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccessToSubprogramDefinition(AccessToSubprogramDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Access To Data Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Access To Data Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccessToDataDefinition(AccessToDataDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayTypeDefinition(ArrayTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Indexes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Indexes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayIndexes(ArrayIndexes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unconstrained Indexes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unconstrained Indexes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnconstrainedIndexes(UnconstrainedIndexes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constrained Indexes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constrained Indexes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstrainedIndexes(ConstrainedIndexes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Discrete Subtype Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Discrete Subtype Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiscreteSubtypeDefinition(DiscreteSubtypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentDefinition(ComponentDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Anonymous Access Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Anonymous Access Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnonymousAccessDefinition(AnonymousAccessDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not Null Access Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not Null Access Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotNullAccessDefinition(NotNullAccessDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Access To Data Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Access To Data Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccessToDataInstance(AccessToDataInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter And Result Profile</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter And Result Profile</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterAndResultProfile(ParameterAndResultProfile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formal Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formal Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormalPart(FormalPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterSpecification(ParameterSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mode</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mode</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMode(Mode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerTypeDefinition(IntegerTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signed Integer Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signed Integer Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignedIntegerTypeDefinition(SignedIntegerTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Modular Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modular Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModularTypeDefinition(ModularTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumerationTypeDefinition(EnumerationTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Record Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Record Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecordTypeDefinition(RecordTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Record Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Record Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecordDefinition(RecordDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentList(ComponentList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Opt Variant Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Opt Variant Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptVariantPart(OptVariantPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentItem(ComponentItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentDeclaration(ComponentDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Defining Identifier List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Defining Identifier List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefiningIdentifierList(DefiningIdentifierList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aspect Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aspect Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAspectClause(AspectClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mod Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mod Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModClause(ModClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentClause(ComponentClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variant Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variant Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariantPart(VariantPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariant(Variant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Discrete Choice List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Discrete Choice List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiscreteChoiceList(DiscreteChoiceList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealTypeDefinition(RealTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Floating Point Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Floating Point Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloatingPointDefinition(FloatingPointDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Range Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Range Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealRangeSpecification(RealRangeSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fixed Point Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fixed Point Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFixedPointDefinition(FixedPointDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelation(Relation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Membership</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Membership</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMembership(Membership object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interval</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interval</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterval(Interval object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleExpression(SimpleExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerm(Term object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Factor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Factor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFactor(Factor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimary(Primary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumericLiteral(NumericLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Null</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Null</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNull(Null object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualified Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualified Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualifiedName(QualifiedName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parenthesized Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parenthesized Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParenthesizedExpression(ParenthesizedExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualifier(Qualifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Allocator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Allocator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAllocator(Allocator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subtype Indication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subtype Indication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubtypeIndication(SubtypeIndication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Opt Null Exclusion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Opt Null Exclusion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptNullExclusion(OptNullExclusion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Opt Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Opt Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptConstraint(OptConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scalar Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scalar Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScalarConstraint(ScalarConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Digits Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Digits Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDigitsConstraint(DigitsConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delta Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delta Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeltaConstraint(DeltaConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRangeConstraint(RangeConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositeConstraint(CompositeConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Discriminant Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Discriminant Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiscriminantConstraint(DiscriminantConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Index Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Index Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndexConstraint(IndexConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Discriminant Association</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Discriminant Association</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiscriminantAssociation(DiscriminantAssociation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Discriminant Selectors</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Discriminant Selectors</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiscriminantSelectors(DiscriminantSelectors object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Discrete Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Discrete Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiscreteRange(DiscreteRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Choice List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Choice List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentChoiceList(ComponentChoiceList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Discrete Choice</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Discrete Choice</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiscreteChoice(DiscreteChoice object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aggregate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aggregate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAggregate(Aggregate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Record Aggregate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Record Aggregate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecordAggregate(RecordAggregate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Record Component Association List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Record Component Association List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecordComponentAssociationList(RecordComponentAssociationList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Record Component Association</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Record Component Association</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecordComponentAssociation(RecordComponentAssociation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Initialized Components</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Initialized Components</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitializedComponents(InitializedComponents object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Uninitialized Components</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Uninitialized Components</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUninitializedComponents(UninitializedComponents object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extension Aggregate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extension Aggregate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtensionAggregate(ExtensionAggregate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Aggregate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Aggregate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayAggregate(ArrayAggregate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Positional Array Aggregate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Positional Array Aggregate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePositionalArrayAggregate(PositionalArrayAggregate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Array Aggregate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Array Aggregate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedArrayAggregate(NamedArrayAggregate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Component Association</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Component Association</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayComponentAssociation(ArrayComponentAssociation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ancestor Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ancestor Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAncestorPart(AncestorPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseName(Name object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimaryName(PrimaryName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Association</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Association</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterAssociation(ParameterAssociation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Effective Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Effective Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterEffectiveValue(ParameterEffectiveValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Designator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Designator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeDesignator(AttributeDesignator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRange(Range object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityRange(EntityRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Explicit Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Explicit Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExplicitRange(ExplicitRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AdbSwitch
