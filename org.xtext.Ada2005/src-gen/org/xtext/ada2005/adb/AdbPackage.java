/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.ada2005.adb.AdbFactory
 * @model kind="package"
 * @generated
 */
public interface AdbPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "adb";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/ada2005/adb";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "adb";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AdbPackage eINSTANCE = org.xtext.ada2005.adb.impl.AdbPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.CompilationImpl <em>Compilation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.CompilationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getCompilation()
   * @generated
   */
  int COMPILATION = 0;

  /**
   * The feature id for the '<em><b>Compilation Units</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION__COMPILATION_UNITS = 0;

  /**
   * The number of structural features of the '<em>Compilation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.CompilationUnitImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getCompilationUnit()
   * @generated
   */
  int COMPILATION_UNIT = 1;

  /**
   * The feature id for the '<em><b>Context Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__CONTEXT_CLAUSE = 0;

  /**
   * The feature id for the '<em><b>Unit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__UNIT = 1;

  /**
   * The feature id for the '<em><b>Pragmas</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__PRAGMAS = 2;

  /**
   * The number of structural features of the '<em>Compilation Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.UnitImpl <em>Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.UnitImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getUnit()
   * @generated
   */
  int UNIT = 2;

  /**
   * The number of structural features of the '<em>Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ContextClauseImpl <em>Context Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ContextClauseImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getContextClause()
   * @generated
   */
  int CONTEXT_CLAUSE = 3;

  /**
   * The feature id for the '<em><b>Context Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_CLAUSE__CONTEXT_ITEMS = 0;

  /**
   * The number of structural features of the '<em>Context Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ContextItemImpl <em>Context Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ContextItemImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getContextItem()
   * @generated
   */
  int CONTEXT_ITEM = 4;

  /**
   * The number of structural features of the '<em>Context Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.WithClauseImpl <em>With Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.WithClauseImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getWithClause()
   * @generated
   */
  int WITH_CLAUSE = 5;

  /**
   * The feature id for the '<em><b>Limited</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_CLAUSE__LIMITED = CONTEXT_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Private</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_CLAUSE__PRIVATE = CONTEXT_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_CLAUSE__IMPORT_URI = CONTEXT_ITEM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>With Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_CLAUSE_FEATURE_COUNT = CONTEXT_ITEM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.UseClauseImpl <em>Use Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.UseClauseImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getUseClause()
   * @generated
   */
  int USE_CLAUSE = 6;

  /**
   * The number of structural features of the '<em>Use Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CLAUSE_FEATURE_COUNT = CONTEXT_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.UsePackageClauseImpl <em>Use Package Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.UsePackageClauseImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getUsePackageClause()
   * @generated
   */
  int USE_PACKAGE_CLAUSE = 7;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_PACKAGE_CLAUSE__IMPORTED_NAMESPACE = USE_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Use Package Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_PACKAGE_CLAUSE_FEATURE_COUNT = USE_CLAUSE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.UseTypeClauseImpl <em>Use Type Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.UseTypeClauseImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getUseTypeClause()
   * @generated
   */
  int USE_TYPE_CLAUSE = 8;

  /**
   * The feature id for the '<em><b>Types Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_TYPE_CLAUSE__TYPES_NAMES = USE_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Use Type Refs</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_TYPE_CLAUSE__USE_TYPE_REFS = USE_CLAUSE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Use Type Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_TYPE_CLAUSE_FEATURE_COUNT = USE_CLAUSE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.LibraryUnitDeclarationImpl <em>Library Unit Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.LibraryUnitDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getLibraryUnitDeclaration()
   * @generated
   */
  int LIBRARY_UNIT_DECLARATION = 9;

  /**
   * The feature id for the '<em><b>Private</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY_UNIT_DECLARATION__PRIVATE = UNIT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Library Unit Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY_UNIT_DECLARATION__LIBRARY_UNIT_SPECIFICATION = UNIT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Library Unit Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY_UNIT_DECLARATION_FEATURE_COUNT = UNIT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.LibraryUnitSpecificationImpl <em>Library Unit Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.LibraryUnitSpecificationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getLibraryUnitSpecification()
   * @generated
   */
  int LIBRARY_UNIT_SPECIFICATION = 10;

  /**
   * The number of structural features of the '<em>Library Unit Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY_UNIT_SPECIFICATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.PackageDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = LIBRARY_UNIT_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = LIBRARY_UNIT_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.PackageDefinitionImpl <em>Package Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.PackageDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getPackageDefinition()
   * @generated
   */
  int PACKAGE_DEFINITION = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEFINITION__NAME = PACKAGE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Package Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEFINITION__PACKAGE_SPECIFICATION = PACKAGE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Package Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEFINITION_FEATURE_COUNT = PACKAGE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.RenamingImpl <em>Renaming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.RenamingImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getRenaming()
   * @generated
   */
  int RENAMING = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENAMING__NAME = PACKAGE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Renamed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENAMING__RENAMED = PACKAGE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Renaming</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENAMING_FEATURE_COUNT = PACKAGE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.GenericDeclarationImpl <em>Generic Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.GenericDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getGenericDeclaration()
   * @generated
   */
  int GENERIC_DECLARATION = 14;

  /**
   * The feature id for the '<em><b>Generic Items</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_DECLARATION__GENERIC_ITEMS = LIBRARY_UNIT_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Library Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_DECLARATION__LIBRARY_SPECIFICATION = LIBRARY_UNIT_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Generic Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_DECLARATION_FEATURE_COUNT = LIBRARY_UNIT_SPECIFICATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.GenericInstantiationImpl <em>Generic Instantiation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.GenericInstantiationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getGenericInstantiation()
   * @generated
   */
  int GENERIC_INSTANTIATION = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_INSTANTIATION__NAME = LIBRARY_UNIT_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Generic Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_INSTANTIATION__GENERIC_NAME = LIBRARY_UNIT_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Overriding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_INSTANTIATION__OVERRIDING = LIBRARY_UNIT_SPECIFICATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Generic Actual Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_INSTANTIATION__GENERIC_ACTUAL_PART = LIBRARY_UNIT_SPECIFICATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Generic Instantiation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_INSTANTIATION_FEATURE_COUNT = LIBRARY_UNIT_SPECIFICATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.PackageSpecificationImpl <em>Package Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.PackageSpecificationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getPackageSpecification()
   * @generated
   */
  int PACKAGE_SPECIFICATION = 16;

  /**
   * The feature id for the '<em><b>Public Basic Declarative Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SPECIFICATION__PUBLIC_BASIC_DECLARATIVE_ITEMS = 0;

  /**
   * The feature id for the '<em><b>Private Basic Declarative Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SPECIFICATION__PRIVATE_BASIC_DECLARATIVE_ITEMS = 1;

  /**
   * The feature id for the '<em><b>Endname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SPECIFICATION__ENDNAME = 2;

  /**
   * The number of structural features of the '<em>Package Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SPECIFICATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.SubprogramBodyImpl <em>Subprogram Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.SubprogramBodyImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getSubprogramBody()
   * @generated
   */
  int SUBPROGRAM_BODY = 17;

  /**
   * The feature id for the '<em><b>Declarative Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBPROGRAM_BODY__DECLARATIVE_ITEMS = UNIT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Handled Sequence Of Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBPROGRAM_BODY__HANDLED_SEQUENCE_OF_STATEMENTS = UNIT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Subprogram Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBPROGRAM_BODY__SUBPROGRAM_SPECIFICATION = UNIT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Endname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBPROGRAM_BODY__ENDNAME = UNIT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Subprogram Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBPROGRAM_BODY_FEATURE_COUNT = UNIT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.DeclarativeBlockImpl <em>Declarative Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.DeclarativeBlockImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getDeclarativeBlock()
   * @generated
   */
  int DECLARATIVE_BLOCK = 18;

  /**
   * The feature id for the '<em><b>Declarative Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATIVE_BLOCK__DECLARATIVE_ITEMS = 0;

  /**
   * The feature id for the '<em><b>Handled Sequence Of Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATIVE_BLOCK__HANDLED_SEQUENCE_OF_STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>Declarative Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATIVE_BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.DeclarativeItemImpl <em>Declarative Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.DeclarativeItemImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getDeclarativeItem()
   * @generated
   */
  int DECLARATIVE_ITEM = 43;

  /**
   * The number of structural features of the '<em>Declarative Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATIVE_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.BasicDeclarativeItemImpl <em>Basic Declarative Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.BasicDeclarativeItemImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getBasicDeclarativeItem()
   * @generated
   */
  int BASIC_DECLARATIVE_ITEM = 19;

  /**
   * The number of structural features of the '<em>Basic Declarative Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_DECLARATIVE_ITEM_FEATURE_COUNT = DECLARATIVE_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.BasicDeclarationImpl <em>Basic Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.BasicDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getBasicDeclaration()
   * @generated
   */
  int BASIC_DECLARATION = 20;

  /**
   * The number of structural features of the '<em>Basic Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_DECLARATION_FEATURE_COUNT = BASIC_DECLARATIVE_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.TaskDeclarationImpl <em>Task Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.TaskDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getTaskDeclaration()
   * @generated
   */
  int TASK_DECLARATION = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DECLARATION__NAME = BASIC_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Known Discriminant Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DECLARATION__KNOWN_DISCRIMINANT_PART = BASIC_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Interface List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DECLARATION__INTERFACE_LIST = BASIC_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Task Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DECLARATION__TASK_DEFINITION = BASIC_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Endid</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DECLARATION__ENDID = BASIC_DECLARATION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Task Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DECLARATION_FEATURE_COUNT = BASIC_DECLARATION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.TypeDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getTypeDeclaration()
   * @generated
   */
  int TYPE_DECLARATION = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__NAME = BASIC_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION_FEATURE_COUNT = BASIC_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.NewTypeDeclarationImpl <em>New Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.NewTypeDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getNewTypeDeclaration()
   * @generated
   */
  int NEW_TYPE_DECLARATION = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_TYPE_DECLARATION__NAME = TYPE_DECLARATION__NAME;

  /**
   * The number of structural features of the '<em>New Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_TYPE_DECLARATION_FEATURE_COUNT = TYPE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.FullTypeDeclarationImpl <em>Full Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.FullTypeDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getFullTypeDeclaration()
   * @generated
   */
  int FULL_TYPE_DECLARATION = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_TYPE_DECLARATION__NAME = NEW_TYPE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Known Discriminant Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_TYPE_DECLARATION__KNOWN_DISCRIMINANT_PART = NEW_TYPE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Full Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_TYPE_DECLARATION_FEATURE_COUNT = NEW_TYPE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.FullDataTypeDeclarationImpl <em>Full Data Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.FullDataTypeDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getFullDataTypeDeclaration()
   * @generated
   */
  int FULL_DATA_TYPE_DECLARATION = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_DATA_TYPE_DECLARATION__NAME = FULL_TYPE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Known Discriminant Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_DATA_TYPE_DECLARATION__KNOWN_DISCRIMINANT_PART = FULL_TYPE_DECLARATION__KNOWN_DISCRIMINANT_PART;

  /**
   * The feature id for the '<em><b>Type Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_DATA_TYPE_DECLARATION__TYPE_DEFINITION = FULL_TYPE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Full Data Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_DATA_TYPE_DECLARATION_FEATURE_COUNT = FULL_TYPE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.IncompleteTypeDeclarationImpl <em>Incomplete Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.IncompleteTypeDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getIncompleteTypeDeclaration()
   * @generated
   */
  int INCOMPLETE_TYPE_DECLARATION = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCOMPLETE_TYPE_DECLARATION__NAME = NEW_TYPE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Discriminant Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCOMPLETE_TYPE_DECLARATION__DISCRIMINANT_PART = NEW_TYPE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tagged</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCOMPLETE_TYPE_DECLARATION__TAGGED = NEW_TYPE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Incomplete Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCOMPLETE_TYPE_DECLARATION_FEATURE_COUNT = NEW_TYPE_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.PrivateTypeDeclarationImpl <em>Private Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.PrivateTypeDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getPrivateTypeDeclaration()
   * @generated
   */
  int PRIVATE_TYPE_DECLARATION = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_TYPE_DECLARATION__NAME = NEW_TYPE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Discriminant Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_TYPE_DECLARATION__DISCRIMINANT_PART = NEW_TYPE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_TYPE_DECLARATION__ABSTRACT = NEW_TYPE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tagged</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_TYPE_DECLARATION__TAGGED = NEW_TYPE_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Limited</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_TYPE_DECLARATION__LIMITED = NEW_TYPE_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Private Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_TYPE_DECLARATION_FEATURE_COUNT = NEW_TYPE_DECLARATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.PrivateExtensionDeclarationImpl <em>Private Extension Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.PrivateExtensionDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getPrivateExtensionDeclaration()
   * @generated
   */
  int PRIVATE_EXTENSION_DECLARATION = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_EXTENSION_DECLARATION__NAME = NEW_TYPE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Discriminant Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_EXTENSION_DECLARATION__DISCRIMINANT_PART = NEW_TYPE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_EXTENSION_DECLARATION__ABSTRACT = NEW_TYPE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Limited</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_EXTENSION_DECLARATION__LIMITED = NEW_TYPE_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Synchronized</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_EXTENSION_DECLARATION__SYNCHRONIZED = NEW_TYPE_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Ancestor Subtype Indication</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_EXTENSION_DECLARATION__ANCESTOR_SUBTYPE_INDICATION = NEW_TYPE_DECLARATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Interface List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_EXTENSION_DECLARATION__INTERFACE_LIST = NEW_TYPE_DECLARATION_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Private Extension Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_EXTENSION_DECLARATION_FEATURE_COUNT = NEW_TYPE_DECLARATION_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.TaskItemImpl <em>Task Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.TaskItemImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getTaskItem()
   * @generated
   */
  int TASK_ITEM = 29;

  /**
   * The number of structural features of the '<em>Task Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.EntryDeclarationImpl <em>Entry Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.EntryDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getEntryDeclaration()
   * @generated
   */
  int ENTRY_DECLARATION = 30;

  /**
   * The feature id for the '<em><b>Overriding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_DECLARATION__OVERRIDING = TASK_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_DECLARATION__NAME = TASK_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Discrete Subtype Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_DECLARATION__DISCRETE_SUBTYPE_DEFINITION = TASK_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Formal Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_DECLARATION__FORMAL_PART = TASK_ITEM_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Entry Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_DECLARATION_FEATURE_COUNT = TASK_ITEM_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.OverridingIndicatorImpl <em>Overriding Indicator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.OverridingIndicatorImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getOverridingIndicator()
   * @generated
   */
  int OVERRIDING_INDICATOR = 31;

  /**
   * The feature id for the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OVERRIDING_INDICATOR__NOT = 0;

  /**
   * The number of structural features of the '<em>Overriding Indicator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OVERRIDING_INDICATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ProtectedTypeDeclarationImpl <em>Protected Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ProtectedTypeDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getProtectedTypeDeclaration()
   * @generated
   */
  int PROTECTED_TYPE_DECLARATION = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTECTED_TYPE_DECLARATION__NAME = FULL_TYPE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Known Discriminant Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTECTED_TYPE_DECLARATION__KNOWN_DISCRIMINANT_PART = FULL_TYPE_DECLARATION__KNOWN_DISCRIMINANT_PART;

  /**
   * The feature id for the '<em><b>Interface List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTECTED_TYPE_DECLARATION__INTERFACE_LIST = FULL_TYPE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Protected Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTECTED_TYPE_DECLARATION__PROTECTED_DEFINITION = FULL_TYPE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Protected Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTECTED_TYPE_DECLARATION_FEATURE_COUNT = FULL_TYPE_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ProtectedDefinitionImpl <em>Protected Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ProtectedDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getProtectedDefinition()
   * @generated
   */
  int PROTECTED_DEFINITION = 33;

  /**
   * The feature id for the '<em><b>Protected Operation Declaration</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTECTED_DEFINITION__PROTECTED_OPERATION_DECLARATION = 0;

  /**
   * The number of structural features of the '<em>Protected Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTECTED_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ProtectedElementDeclarationImpl <em>Protected Element Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ProtectedElementDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getProtectedElementDeclaration()
   * @generated
   */
  int PROTECTED_ELEMENT_DECLARATION = 34;

  /**
   * The number of structural features of the '<em>Protected Element Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTECTED_ELEMENT_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ProtectedOperationDeclarationImpl <em>Protected Operation Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ProtectedOperationDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getProtectedOperationDeclaration()
   * @generated
   */
  int PROTECTED_OPERATION_DECLARATION = 35;

  /**
   * The number of structural features of the '<em>Protected Operation Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTECTED_OPERATION_DECLARATION_FEATURE_COUNT = PROTECTED_ELEMENT_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.SubprogramDeclarationImpl <em>Subprogram Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.SubprogramDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getSubprogramDeclaration()
   * @generated
   */
  int SUBPROGRAM_DECLARATION = 36;

  /**
   * The feature id for the '<em><b>Subprogram Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBPROGRAM_DECLARATION__SUBPROGRAM_SPECIFICATION = BASIC_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBPROGRAM_DECLARATION__ABSTRACT = BASIC_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Renamed Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBPROGRAM_DECLARATION__RENAMED_NAME = BASIC_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBPROGRAM_DECLARATION__NULL = BASIC_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Subprogram Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBPROGRAM_DECLARATION_FEATURE_COUNT = BASIC_DECLARATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.SubprogramSpecificationImpl <em>Subprogram Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.SubprogramSpecificationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getSubprogramSpecification()
   * @generated
   */
  int SUBPROGRAM_SPECIFICATION = 37;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBPROGRAM_SPECIFICATION__NAME = LIBRARY_UNIT_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Overriding Indicator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBPROGRAM_SPECIFICATION__OVERRIDING_INDICATOR = LIBRARY_UNIT_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Subprogram Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBPROGRAM_SPECIFICATION_FEATURE_COUNT = LIBRARY_UNIT_SPECIFICATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ProcedureSpecificationImpl <em>Procedure Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ProcedureSpecificationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getProcedureSpecification()
   * @generated
   */
  int PROCEDURE_SPECIFICATION = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_SPECIFICATION__NAME = SUBPROGRAM_SPECIFICATION__NAME;

  /**
   * The feature id for the '<em><b>Overriding Indicator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_SPECIFICATION__OVERRIDING_INDICATOR = SUBPROGRAM_SPECIFICATION__OVERRIDING_INDICATOR;

  /**
   * The feature id for the '<em><b>Formal Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_SPECIFICATION__FORMAL_PART = SUBPROGRAM_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Procedure Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_SPECIFICATION_FEATURE_COUNT = SUBPROGRAM_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.FunctionSpecificationImpl <em>Function Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.FunctionSpecificationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getFunctionSpecification()
   * @generated
   */
  int FUNCTION_SPECIFICATION = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_SPECIFICATION__NAME = SUBPROGRAM_SPECIFICATION__NAME;

  /**
   * The feature id for the '<em><b>Overriding Indicator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_SPECIFICATION__OVERRIDING_INDICATOR = SUBPROGRAM_SPECIFICATION__OVERRIDING_INDICATOR;

  /**
   * The feature id for the '<em><b>Parameter And Result Profile</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_SPECIFICATION__PARAMETER_AND_RESULT_PROFILE = SUBPROGRAM_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Function Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_SPECIFICATION_FEATURE_COUNT = SUBPROGRAM_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.HandledSequenceOfStatementsImpl <em>Handled Sequence Of Statements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.HandledSequenceOfStatementsImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getHandledSequenceOfStatements()
   * @generated
   */
  int HANDLED_SEQUENCE_OF_STATEMENTS = 40;

  /**
   * The number of structural features of the '<em>Handled Sequence Of Statements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLED_SEQUENCE_OF_STATEMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ExceptionChoiceImpl <em>Exception Choice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ExceptionChoiceImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getExceptionChoice()
   * @generated
   */
  int EXCEPTION_CHOICE = 41;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_CHOICE__NAME = 0;

  /**
   * The feature id for the '<em><b>Others</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_CHOICE__OTHERS = 1;

  /**
   * The number of structural features of the '<em>Exception Choice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_CHOICE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ExceptionHandlerImpl <em>Exception Handler</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ExceptionHandlerImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getExceptionHandler()
   * @generated
   */
  int EXCEPTION_HANDLER = 42;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_HANDLER__NAME = 0;

  /**
   * The feature id for the '<em><b>Exception Choice</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_HANDLER__EXCEPTION_CHOICE = 1;

  /**
   * The feature id for the '<em><b>Sequence Of Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_HANDLER__SEQUENCE_OF_STATEMENTS = 2;

  /**
   * The number of structural features of the '<em>Exception Handler</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_HANDLER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.BodyImpl <em>Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.BodyImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getBody()
   * @generated
   */
  int BODY = 44;

  /**
   * The number of structural features of the '<em>Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FEATURE_COUNT = DECLARATIVE_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ProperBodyImpl <em>Proper Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ProperBodyImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getProperBody()
   * @generated
   */
  int PROPER_BODY = 45;

  /**
   * The number of structural features of the '<em>Proper Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPER_BODY_FEATURE_COUNT = BODY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.LabelImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 46;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__IDENTIFIER = 0;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.SequenceOfStatementsImpl <em>Sequence Of Statements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.SequenceOfStatementsImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getSequenceOfStatements()
   * @generated
   */
  int SEQUENCE_OF_STATEMENTS = 47;

  /**
   * The feature id for the '<em><b>Exception Handler</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_OF_STATEMENTS__EXCEPTION_HANDLER = HANDLED_SEQUENCE_OF_STATEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_OF_STATEMENTS__STATEMENTS = HANDLED_SEQUENCE_OF_STATEMENTS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sequence Of Statements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_OF_STATEMENTS_FEATURE_COUNT = HANDLED_SEQUENCE_OF_STATEMENTS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.LabelisableStatementImpl <em>Labelisable Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.LabelisableStatementImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getLabelisableStatement()
   * @generated
   */
  int LABELISABLE_STATEMENT = 48;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELISABLE_STATEMENT__LABELS = 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELISABLE_STATEMENT__STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Labelisable Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELISABLE_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.StatementImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 49;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.SimpleStatementImpl <em>Simple Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.SimpleStatementImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getSimpleStatement()
   * @generated
   */
  int SIMPLE_STATEMENT = 50;

  /**
   * The number of structural features of the '<em>Simple Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.CompoundStatementImpl <em>Compound Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.CompoundStatementImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getCompoundStatement()
   * @generated
   */
  int COMPOUND_STATEMENT = 51;

  /**
   * The number of structural features of the '<em>Compound Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.NullStatementImpl <em>Null Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.NullStatementImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getNullStatement()
   * @generated
   */
  int NULL_STATEMENT = 52;

  /**
   * The feature id for the '<em><b>Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_STATEMENT__NULL = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Null Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_STATEMENT_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.LibrarySpecificationImpl <em>Library Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.LibrarySpecificationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getLibrarySpecification()
   * @generated
   */
  int LIBRARY_SPECIFICATION = 53;

  /**
   * The number of structural features of the '<em>Library Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY_SPECIFICATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.GenericItemsImpl <em>Generic Items</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.GenericItemsImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getGenericItems()
   * @generated
   */
  int GENERIC_ITEMS = 54;

  /**
   * The feature id for the '<em><b>Generic Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_ITEMS__GENERIC_ITEMS = 0;

  /**
   * The number of structural features of the '<em>Generic Items</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_ITEMS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.GenericItemImpl <em>Generic Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.GenericItemImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getGenericItem()
   * @generated
   */
  int GENERIC_ITEM = 55;

  /**
   * The number of structural features of the '<em>Generic Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.GenericFormalParameterDeclarationImpl <em>Generic Formal Parameter Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.GenericFormalParameterDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getGenericFormalParameterDeclaration()
   * @generated
   */
  int GENERIC_FORMAL_PARAMETER_DECLARATION = 56;

  /**
   * The number of structural features of the '<em>Generic Formal Parameter Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_FORMAL_PARAMETER_DECLARATION_FEATURE_COUNT = GENERIC_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.FormalObjectDeclarationImpl <em>Formal Object Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.FormalObjectDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getFormalObjectDeclaration()
   * @generated
   */
  int FORMAL_OBJECT_DECLARATION = 57;

  /**
   * The feature id for the '<em><b>Id List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_OBJECT_DECLARATION__ID_LIST = GENERIC_FORMAL_PARAMETER_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_OBJECT_DECLARATION__MODE = GENERIC_FORMAL_PARAMETER_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Opt Null Exclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_OBJECT_DECLARATION__OPT_NULL_EXCLUSION = GENERIC_FORMAL_PARAMETER_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Subtype Mark</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_OBJECT_DECLARATION__SUBTYPE_MARK = GENERIC_FORMAL_PARAMETER_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Anonymous Access Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_OBJECT_DECLARATION__ANONYMOUS_ACCESS_DEFINITION = GENERIC_FORMAL_PARAMETER_DECLARATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Default Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_OBJECT_DECLARATION__DEFAULT_EXPRESSION = GENERIC_FORMAL_PARAMETER_DECLARATION_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Formal Object Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_OBJECT_DECLARATION_FEATURE_COUNT = GENERIC_FORMAL_PARAMETER_DECLARATION_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.FormalTypeDeclarationImpl <em>Formal Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.FormalTypeDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getFormalTypeDeclaration()
   * @generated
   */
  int FORMAL_TYPE_DECLARATION = 58;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_TYPE_DECLARATION__IDENTIFIER = GENERIC_FORMAL_PARAMETER_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Discriminant Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_TYPE_DECLARATION__DISCRIMINANT_PART = GENERIC_FORMAL_PARAMETER_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Formal Type Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_TYPE_DECLARATION__FORMAL_TYPE_DEFINITION = GENERIC_FORMAL_PARAMETER_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Formal Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_TYPE_DECLARATION_FEATURE_COUNT = GENERIC_FORMAL_PARAMETER_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.FormalTypeDefinitionImpl <em>Formal Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.FormalTypeDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getFormalTypeDefinition()
   * @generated
   */
  int FORMAL_TYPE_DEFINITION = 59;

  /**
   * The number of structural features of the '<em>Formal Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_TYPE_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.FormalPrivateTypeDefinitionImpl <em>Formal Private Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.FormalPrivateTypeDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getFormalPrivateTypeDefinition()
   * @generated
   */
  int FORMAL_PRIVATE_TYPE_DEFINITION = 60;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PRIVATE_TYPE_DEFINITION__ABSTRACT = FORMAL_TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tagged</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PRIVATE_TYPE_DEFINITION__TAGGED = FORMAL_TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Limited</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PRIVATE_TYPE_DEFINITION__LIMITED = FORMAL_TYPE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Formal Private Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PRIVATE_TYPE_DEFINITION_FEATURE_COUNT = FORMAL_TYPE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.FormalDerivedTypeDefinitionImpl <em>Formal Derived Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.FormalDerivedTypeDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getFormalDerivedTypeDefinition()
   * @generated
   */
  int FORMAL_DERIVED_TYPE_DEFINITION = 61;

  /**
   * The feature id for the '<em><b>Absract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_DERIVED_TYPE_DEFINITION__ABSRACT = FORMAL_TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Limited</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_DERIVED_TYPE_DEFINITION__LIMITED = FORMAL_TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Synchronized</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_DERIVED_TYPE_DEFINITION__SYNCHRONIZED = FORMAL_TYPE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Subtype Mark</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_DERIVED_TYPE_DEFINITION__SUBTYPE_MARK = FORMAL_TYPE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Interface List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_DERIVED_TYPE_DEFINITION__INTERFACE_LIST = FORMAL_TYPE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Formal Derived Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_DERIVED_TYPE_DEFINITION_FEATURE_COUNT = FORMAL_TYPE_DEFINITION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.FormalSubprogramDeclarationImpl <em>Formal Subprogram Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.FormalSubprogramDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getFormalSubprogramDeclaration()
   * @generated
   */
  int FORMAL_SUBPROGRAM_DECLARATION = 62;

  /**
   * The feature id for the '<em><b>Subprogram Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_SUBPROGRAM_DECLARATION__SUBPROGRAM_SPECIFICATION = GENERIC_FORMAL_PARAMETER_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_SUBPROGRAM_DECLARATION__ABSTRACT = GENERIC_FORMAL_PARAMETER_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Subprogram Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_SUBPROGRAM_DECLARATION__SUBPROGRAM_DEFAULT = GENERIC_FORMAL_PARAMETER_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Formal Subprogram Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_SUBPROGRAM_DECLARATION_FEATURE_COUNT = GENERIC_FORMAL_PARAMETER_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.SubprogramDefaultImpl <em>Subprogram Default</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.SubprogramDefaultImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getSubprogramDefault()
   * @generated
   */
  int SUBPROGRAM_DEFAULT = 63;

  /**
   * The feature id for the '<em><b>Default Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBPROGRAM_DEFAULT__DEFAULT_NAME = 0;

  /**
   * The number of structural features of the '<em>Subprogram Default</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBPROGRAM_DEFAULT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.FormalPackageDeclarationImpl <em>Formal Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.FormalPackageDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getFormalPackageDeclaration()
   * @generated
   */
  int FORMAL_PACKAGE_DECLARATION = 64;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PACKAGE_DECLARATION__NAME = GENERIC_FORMAL_PARAMETER_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Generic Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PACKAGE_DECLARATION__GENERIC_PACKAGE_NAME = GENERIC_FORMAL_PARAMETER_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Formal Package Actual Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PACKAGE_DECLARATION__FORMAL_PACKAGE_ACTUAL_PART = GENERIC_FORMAL_PARAMETER_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Formal Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PACKAGE_DECLARATION_FEATURE_COUNT = GENERIC_FORMAL_PARAMETER_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.FormalPackageActualPartImpl <em>Formal Package Actual Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.FormalPackageActualPartImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getFormalPackageActualPart()
   * @generated
   */
  int FORMAL_PACKAGE_ACTUAL_PART = 65;

  /**
   * The feature id for the '<em><b>Box</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PACKAGE_ACTUAL_PART__BOX = 0;

  /**
   * The feature id for the '<em><b>Generic Actual Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PACKAGE_ACTUAL_PART__GENERIC_ACTUAL_PART = 1;

  /**
   * The feature id for the '<em><b>Formal Package Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PACKAGE_ACTUAL_PART__FORMAL_PACKAGE_ASSOCIATION = 2;

  /**
   * The number of structural features of the '<em>Formal Package Actual Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PACKAGE_ACTUAL_PART_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.FormalPackageAssociationImpl <em>Formal Package Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.FormalPackageAssociationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getFormalPackageAssociation()
   * @generated
   */
  int FORMAL_PACKAGE_ASSOCIATION = 66;

  /**
   * The feature id for the '<em><b>Generic Association</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PACKAGE_ASSOCIATION__GENERIC_ASSOCIATION = 0;

  /**
   * The feature id for the '<em><b>Generic Formal Parameter Selector Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PACKAGE_ASSOCIATION__GENERIC_FORMAL_PARAMETER_SELECTOR_NAME = 1;

  /**
   * The number of structural features of the '<em>Formal Package Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PACKAGE_ASSOCIATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ExceptionDeclarationImpl <em>Exception Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ExceptionDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getExceptionDeclaration()
   * @generated
   */
  int EXCEPTION_DECLARATION = 67;

  /**
   * The feature id for the '<em><b>Id List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_DECLARATION__ID_LIST = BASIC_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Renamed Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_DECLARATION__RENAMED_NAME = BASIC_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Exception Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_DECLARATION_FEATURE_COUNT = BASIC_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ObjectDeclarationImpl <em>Object Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ObjectDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getObjectDeclaration()
   * @generated
   */
  int OBJECT_DECLARATION = 68;

  /**
   * The number of structural features of the '<em>Object Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_DECLARATION_FEATURE_COUNT = BASIC_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.DataInstanceDeclarationImpl <em>Data Instance Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.DataInstanceDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getDataInstanceDeclaration()
   * @generated
   */
  int DATA_INSTANCE_DECLARATION = 69;

  /**
   * The feature id for the '<em><b>Defining Identifier List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INSTANCE_DECLARATION__DEFINING_IDENTIFIER_LIST = OBJECT_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Aliased</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INSTANCE_DECLARATION__ALIASED = OBJECT_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Constant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INSTANCE_DECLARATION__CONSTANT = OBJECT_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Subtype Indication</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INSTANCE_DECLARATION__SUBTYPE_INDICATION = OBJECT_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INSTANCE_DECLARATION__EXPRESSION = OBJECT_DECLARATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Object Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INSTANCE_DECLARATION__OBJECT_NAME = OBJECT_DECLARATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Anonymous Access Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INSTANCE_DECLARATION__ANONYMOUS_ACCESS_DEFINITION = OBJECT_DECLARATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Array Type Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INSTANCE_DECLARATION__ARRAY_TYPE_DEFINITION = OBJECT_DECLARATION_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Data Instance Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INSTANCE_DECLARATION_FEATURE_COUNT = OBJECT_DECLARATION_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.SingleProtectedDeclarationImpl <em>Single Protected Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.SingleProtectedDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getSingleProtectedDeclaration()
   * @generated
   */
  int SINGLE_PROTECTED_DECLARATION = 70;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_PROTECTED_DECLARATION__NAME = OBJECT_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Interface List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_PROTECTED_DECLARATION__INTERFACE_LIST = OBJECT_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Protected Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_PROTECTED_DECLARATION__PROTECTED_DEFINITION = OBJECT_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Single Protected Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_PROTECTED_DECLARATION_FEATURE_COUNT = OBJECT_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.PragmaImpl <em>Pragma</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.PragmaImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getPragma()
   * @generated
   */
  int PRAGMA = 71;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRAGMA__NAME = CONTEXT_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pragma Argument Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRAGMA__PRAGMA_ARGUMENT_ASSOCIATION = CONTEXT_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Pragma</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRAGMA_FEATURE_COUNT = CONTEXT_ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.PragmaArgumentAssociationImpl <em>Pragma Argument Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.PragmaArgumentAssociationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getPragmaArgumentAssociation()
   * @generated
   */
  int PRAGMA_ARGUMENT_ASSOCIATION = 72;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRAGMA_ARGUMENT_ASSOCIATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Effective Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRAGMA_ARGUMENT_ASSOCIATION__EFFECTIVE_ARGUMENT = 1;

  /**
   * The number of structural features of the '<em>Pragma Argument Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRAGMA_ARGUMENT_ASSOCIATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.SubtypeDeclarationImpl <em>Subtype Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.SubtypeDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getSubtypeDeclaration()
   * @generated
   */
  int SUBTYPE_DECLARATION = 73;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTYPE_DECLARATION__NAME = TYPE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Subtype Indication</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTYPE_DECLARATION__SUBTYPE_INDICATION = TYPE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Subtype Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTYPE_DECLARATION_FEATURE_COUNT = TYPE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.NumberDeclarationImpl <em>Number Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.NumberDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getNumberDeclaration()
   * @generated
   */
  int NUMBER_DECLARATION = 74;

  /**
   * The feature id for the '<em><b>Id List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_DECLARATION__ID_LIST = BASIC_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Static Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_DECLARATION__STATIC_EXPRESSION = BASIC_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Number Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_DECLARATION_FEATURE_COUNT = BASIC_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.AssignmentStatementImpl <em>Assignment Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.AssignmentStatementImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getAssignmentStatement()
   * @generated
   */
  int ASSIGNMENT_STATEMENT = 75;

  /**
   * The feature id for the '<em><b>Variable Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT__VARIABLE_NAME = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT__INITIAL_VALUE = SIMPLE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assignment Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.IfStatementImpl <em>If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.IfStatementImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getIfStatement()
   * @generated
   */
  int IF_STATEMENT = 76;

  /**
   * The feature id for the '<em><b>If Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__IF_CONDITION = COMPOUND_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__THEN_STATEMENTS = COMPOUND_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Elsif Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__ELSIF_CONDITIONS = COMPOUND_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Elsif Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__ELSIF_STATEMENTS = COMPOUND_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Else Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__ELSE_STATEMENTS = COMPOUND_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>If Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = COMPOUND_STATEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.CaseStatementImpl <em>Case Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.CaseStatementImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getCaseStatement()
   * @generated
   */
  int CASE_STATEMENT = 77;

  /**
   * The feature id for the '<em><b>Case Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT__CASE_VALUE = COMPOUND_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Case Statement Alternatives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT__CASE_STATEMENT_ALTERNATIVES = COMPOUND_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Case Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_FEATURE_COUNT = COMPOUND_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.CaseStatementAlternativeImpl <em>Case Statement Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.CaseStatementAlternativeImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getCaseStatementAlternative()
   * @generated
   */
  int CASE_STATEMENT_ALTERNATIVE = 78;

  /**
   * The feature id for the '<em><b>Discrete Choice List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_ALTERNATIVE__DISCRETE_CHOICE_LIST = 0;

  /**
   * The feature id for the '<em><b>Sequence Of Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_ALTERNATIVE__SEQUENCE_OF_STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>Case Statement Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_ALTERNATIVE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.LoopStatementImpl <em>Loop Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.LoopStatementImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getLoopStatement()
   * @generated
   */
  int LOOP_STATEMENT = 79;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_STATEMENT__NAME = COMPOUND_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Iteration Scheme</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_STATEMENT__ITERATION_SCHEME = COMPOUND_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sequence Of Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_STATEMENT__SEQUENCE_OF_STATEMENTS = COMPOUND_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Same Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_STATEMENT__SAME_NAME = COMPOUND_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Loop Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_STATEMENT_FEATURE_COUNT = COMPOUND_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.IterationSchemeImpl <em>Iteration Scheme</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.IterationSchemeImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getIterationScheme()
   * @generated
   */
  int ITERATION_SCHEME = 80;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_SCHEME__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Iteration Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_SCHEME__ITERATION_SPECIFICATION = 1;

  /**
   * The number of structural features of the '<em>Iteration Scheme</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_SCHEME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.LoopParameterSpecificationImpl <em>Loop Parameter Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.LoopParameterSpecificationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getLoopParameterSpecification()
   * @generated
   */
  int LOOP_PARAMETER_SPECIFICATION = 81;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_PARAMETER_SPECIFICATION__IDENTIFIER = 0;

  /**
   * The feature id for the '<em><b>Discrete Subtype Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_PARAMETER_SPECIFICATION__DISCRETE_SUBTYPE_DEFINITION = 1;

  /**
   * The number of structural features of the '<em>Loop Parameter Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_PARAMETER_SPECIFICATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.BlockStatementImpl <em>Block Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.BlockStatementImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getBlockStatement()
   * @generated
   */
  int BLOCK_STATEMENT = 82;

  /**
   * The feature id for the '<em><b>Declarative Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_STATEMENT__DECLARATIVE_ITEMS = DECLARATIVE_BLOCK__DECLARATIVE_ITEMS;

  /**
   * The feature id for the '<em><b>Handled Sequence Of Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_STATEMENT__HANDLED_SEQUENCE_OF_STATEMENTS = DECLARATIVE_BLOCK__HANDLED_SEQUENCE_OF_STATEMENTS;

  /**
   * The feature id for the '<em><b>Block Statement Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_STATEMENT__BLOCK_STATEMENT_IDENTIFIER = DECLARATIVE_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_STATEMENT_FEATURE_COUNT = DECLARATIVE_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ExitStatementImpl <em>Exit Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ExitStatementImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getExitStatement()
   * @generated
   */
  int EXIT_STATEMENT = 83;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_STATEMENT__NAME = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_STATEMENT__CONDITION = SIMPLE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Exit Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_STATEMENT_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.GotoStatementImpl <em>Goto Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.GotoStatementImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getGotoStatement()
   * @generated
   */
  int GOTO_STATEMENT = 84;

  /**
   * The feature id for the '<em><b>Label Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_STATEMENT__LABEL_ID = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Goto Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_STATEMENT_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ProcedureOrEntryCallStatementImpl <em>Procedure Or Entry Call Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ProcedureOrEntryCallStatementImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getProcedureOrEntryCallStatement()
   * @generated
   */
  int PROCEDURE_OR_ENTRY_CALL_STATEMENT = 85;

  /**
   * The feature id for the '<em><b>Callee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_OR_ENTRY_CALL_STATEMENT__CALLEE = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Procedure Or Entry Call Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_OR_ENTRY_CALL_STATEMENT_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.SimpleReturnStatementImpl <em>Simple Return Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.SimpleReturnStatementImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getSimpleReturnStatement()
   * @generated
   */
  int SIMPLE_RETURN_STATEMENT = 86;

  /**
   * The feature id for the '<em><b>Return Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_RETURN_STATEMENT__RETURN_VALUE = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Return Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_RETURN_STATEMENT_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ExtendedReturnStatementImpl <em>Extended Return Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ExtendedReturnStatementImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getExtendedReturnStatement()
   * @generated
   */
  int EXTENDED_RETURN_STATEMENT = 87;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_RETURN_STATEMENT__IDENTIFIER = COMPOUND_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Return Subtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_RETURN_STATEMENT__RETURN_SUBTYPE = COMPOUND_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_RETURN_STATEMENT__EXPRESSION = COMPOUND_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Handled Sequence Of Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_RETURN_STATEMENT__HANDLED_SEQUENCE_OF_STATEMENTS = COMPOUND_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Extended Return Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_RETURN_STATEMENT_FEATURE_COUNT = COMPOUND_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ReturnSubtypeIndicationImpl <em>Return Subtype Indication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ReturnSubtypeIndicationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getReturnSubtypeIndication()
   * @generated
   */
  int RETURN_SUBTYPE_INDICATION = 88;

  /**
   * The number of structural features of the '<em>Return Subtype Indication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_SUBTYPE_INDICATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.PackageBodyImpl <em>Package Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.PackageBodyImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getPackageBody()
   * @generated
   */
  int PACKAGE_BODY = 89;

  /**
   * The feature id for the '<em><b>Declarative Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_BODY__DECLARATIVE_ITEMS = UNIT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Handled Sequence Of Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_BODY__HANDLED_SEQUENCE_OF_STATEMENTS = UNIT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_BODY__NAME = UNIT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>End Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_BODY__END_NAME = UNIT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Package Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_BODY_FEATURE_COUNT = UNIT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.TaskDefinitionImpl <em>Task Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.TaskDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getTaskDefinition()
   * @generated
   */
  int TASK_DEFINITION = 90;

  /**
   * The feature id for the '<em><b>Task Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DEFINITION__TASK_ITEMS = 0;

  /**
   * The number of structural features of the '<em>Task Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.TaskBodyImpl <em>Task Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.TaskBodyImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getTaskBody()
   * @generated
   */
  int TASK_BODY = 91;

  /**
   * The feature id for the '<em><b>Declarative Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_BODY__DECLARATIVE_ITEMS = DECLARATIVE_BLOCK__DECLARATIVE_ITEMS;

  /**
   * The feature id for the '<em><b>Handled Sequence Of Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_BODY__HANDLED_SEQUENCE_OF_STATEMENTS = DECLARATIVE_BLOCK__HANDLED_SEQUENCE_OF_STATEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_BODY__NAME = DECLARATIVE_BLOCK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_BODY__END_ID = DECLARATIVE_BLOCK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Task Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_BODY_FEATURE_COUNT = DECLARATIVE_BLOCK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ProtectedBodyImpl <em>Protected Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ProtectedBodyImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getProtectedBody()
   * @generated
   */
  int PROTECTED_BODY = 92;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTECTED_BODY__IDENTIFIER = PROPER_BODY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Protected Operation Item</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTECTED_BODY__PROTECTED_OPERATION_ITEM = PROPER_BODY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Id Task</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTECTED_BODY__ID_TASK = PROPER_BODY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Protected Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTECTED_BODY_FEATURE_COUNT = PROPER_BODY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ProtectedOperationItemImpl <em>Protected Operation Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ProtectedOperationItemImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getProtectedOperationItem()
   * @generated
   */
  int PROTECTED_OPERATION_ITEM = 93;

  /**
   * The number of structural features of the '<em>Protected Operation Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTECTED_OPERATION_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.AcceptStatementImpl <em>Accept Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.AcceptStatementImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getAcceptStatement()
   * @generated
   */
  int ACCEPT_STATEMENT = 94;

  /**
   * The feature id for the '<em><b>Entry Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_STATEMENT__ENTRY_NAME = COMPOUND_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Entry Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_STATEMENT__ENTRY_INDEX = COMPOUND_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Formal Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_STATEMENT__FORMAL_PART = COMPOUND_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Handled Sequence Of Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_STATEMENT__HANDLED_SEQUENCE_OF_STATEMENTS = COMPOUND_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Entryidentifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_STATEMENT__ENTRYIDENTIFIER = COMPOUND_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Accept Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_STATEMENT_FEATURE_COUNT = COMPOUND_STATEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.EntryIndexImpl <em>Entry Index</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.EntryIndexImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getEntryIndex()
   * @generated
   */
  int ENTRY_INDEX = 95;

  /**
   * The number of structural features of the '<em>Entry Index</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_INDEX_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.EntryBodyImpl <em>Entry Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.EntryBodyImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getEntryBody()
   * @generated
   */
  int ENTRY_BODY = 96;

  /**
   * The feature id for the '<em><b>Declarative Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_BODY__DECLARATIVE_ITEMS = DECLARATIVE_BLOCK__DECLARATIVE_ITEMS;

  /**
   * The feature id for the '<em><b>Handled Sequence Of Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_BODY__HANDLED_SEQUENCE_OF_STATEMENTS = DECLARATIVE_BLOCK__HANDLED_SEQUENCE_OF_STATEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_BODY__NAME = DECLARATIVE_BLOCK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Entry Body Formal Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_BODY__ENTRY_BODY_FORMAL_PART = DECLARATIVE_BLOCK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Entry Barrier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_BODY__ENTRY_BARRIER = DECLARATIVE_BLOCK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Endid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_BODY__ENDID = DECLARATIVE_BLOCK_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Entry Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_BODY_FEATURE_COUNT = DECLARATIVE_BLOCK_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.EntryBodyFormalPartImpl <em>Entry Body Formal Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.EntryBodyFormalPartImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getEntryBodyFormalPart()
   * @generated
   */
  int ENTRY_BODY_FORMAL_PART = 97;

  /**
   * The feature id for the '<em><b>Entry Index Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_BODY_FORMAL_PART__ENTRY_INDEX_SPECIFICATION = 0;

  /**
   * The feature id for the '<em><b>Formal Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_BODY_FORMAL_PART__FORMAL_PART = 1;

  /**
   * The number of structural features of the '<em>Entry Body Formal Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_BODY_FORMAL_PART_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.EntryBarrierImpl <em>Entry Barrier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.EntryBarrierImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getEntryBarrier()
   * @generated
   */
  int ENTRY_BARRIER = 98;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_BARRIER__CONDITION = 0;

  /**
   * The number of structural features of the '<em>Entry Barrier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_BARRIER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.EntryIndexSpecificationImpl <em>Entry Index Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.EntryIndexSpecificationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getEntryIndexSpecification()
   * @generated
   */
  int ENTRY_INDEX_SPECIFICATION = 99;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_INDEX_SPECIFICATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Discrete Subtype Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_INDEX_SPECIFICATION__DISCRETE_SUBTYPE_DEFINITION = 1;

  /**
   * The number of structural features of the '<em>Entry Index Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_INDEX_SPECIFICATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.RequeueStatementImpl <em>Requeue Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.RequeueStatementImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getRequeueStatement()
   * @generated
   */
  int REQUEUE_STATEMENT = 100;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEUE_STATEMENT__NAME = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Abort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEUE_STATEMENT__ABORT = SIMPLE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Requeue Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEUE_STATEMENT_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.DelayStatementImpl <em>Delay Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.DelayStatementImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getDelayStatement()
   * @generated
   */
  int DELAY_STATEMENT = 101;

  /**
   * The feature id for the '<em><b>Until</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_STATEMENT__UNTIL = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_STATEMENT__DELAY = SIMPLE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Delay Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_STATEMENT_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.SelectStatementImpl <em>Select Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.SelectStatementImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getSelectStatement()
   * @generated
   */
  int SELECT_STATEMENT = 102;

  /**
   * The number of structural features of the '<em>Select Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT_FEATURE_COUNT = COMPOUND_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.SelectiveAcceptImpl <em>Selective Accept</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.SelectiveAcceptImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getSelectiveAccept()
   * @generated
   */
  int SELECTIVE_ACCEPT = 103;

  /**
   * The feature id for the '<em><b>Selectguard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTIVE_ACCEPT__SELECTGUARD = SELECT_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Select Alternative</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTIVE_ACCEPT__SELECT_ALTERNATIVE = SELECT_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Guarded Alternatives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTIVE_ACCEPT__GUARDED_ALTERNATIVES = SELECT_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Else Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTIVE_ACCEPT__ELSE_STATEMENTS = SELECT_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Selective Accept</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTIVE_ACCEPT_FEATURE_COUNT = SELECT_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.GuardedAlternativeImpl <em>Guarded Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.GuardedAlternativeImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getGuardedAlternative()
   * @generated
   */
  int GUARDED_ALTERNATIVE = 104;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARDED_ALTERNATIVE__GUARD = 0;

  /**
   * The feature id for the '<em><b>Alternative</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARDED_ALTERNATIVE__ALTERNATIVE = 1;

  /**
   * The number of structural features of the '<em>Guarded Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARDED_ALTERNATIVE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.GuardImpl <em>Guard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.GuardImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getGuard()
   * @generated
   */
  int GUARD = 105;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__CONDITION = 0;

  /**
   * The number of structural features of the '<em>Guard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.SelectAlternativeImpl <em>Select Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.SelectAlternativeImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getSelectAlternative()
   * @generated
   */
  int SELECT_ALTERNATIVE = 106;

  /**
   * The feature id for the '<em><b>Sequence Of Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_ALTERNATIVE__SEQUENCE_OF_STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Select Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_ALTERNATIVE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.AcceptAlternativeImpl <em>Accept Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.AcceptAlternativeImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getAcceptAlternative()
   * @generated
   */
  int ACCEPT_ALTERNATIVE = 107;

  /**
   * The feature id for the '<em><b>Sequence Of Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_ALTERNATIVE__SEQUENCE_OF_STATEMENTS = SELECT_ALTERNATIVE__SEQUENCE_OF_STATEMENTS;

  /**
   * The feature id for the '<em><b>Accept Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_ALTERNATIVE__ACCEPT_STATEMENT = SELECT_ALTERNATIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Accept Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_ALTERNATIVE_FEATURE_COUNT = SELECT_ALTERNATIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.DelayAlternativeImpl <em>Delay Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.DelayAlternativeImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getDelayAlternative()
   * @generated
   */
  int DELAY_ALTERNATIVE = 108;

  /**
   * The feature id for the '<em><b>Sequence Of Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_ALTERNATIVE__SEQUENCE_OF_STATEMENTS = SELECT_ALTERNATIVE__SEQUENCE_OF_STATEMENTS;

  /**
   * The feature id for the '<em><b>Delay Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_ALTERNATIVE__DELAY_STATEMENT = SELECT_ALTERNATIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Delay Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_ALTERNATIVE_FEATURE_COUNT = SELECT_ALTERNATIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.TimedEntryCallImpl <em>Timed Entry Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.TimedEntryCallImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getTimedEntryCall()
   * @generated
   */
  int TIMED_ENTRY_CALL = 109;

  /**
   * The feature id for the '<em><b>Entry Call Alternative</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMED_ENTRY_CALL__ENTRY_CALL_ALTERNATIVE = SELECT_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Delay Alternative</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMED_ENTRY_CALL__DELAY_ALTERNATIVE = SELECT_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Timed Entry Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMED_ENTRY_CALL_FEATURE_COUNT = SELECT_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.EntryCallAlternativeImpl <em>Entry Call Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.EntryCallAlternativeImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getEntryCallAlternative()
   * @generated
   */
  int ENTRY_CALL_ALTERNATIVE = 110;

  /**
   * The feature id for the '<em><b>Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_CALL_ALTERNATIVE__CALL = 0;

  /**
   * The feature id for the '<em><b>Sequence Of Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_CALL_ALTERNATIVE__SEQUENCE_OF_STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>Entry Call Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_CALL_ALTERNATIVE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ConditionalEntryCallImpl <em>Conditional Entry Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ConditionalEntryCallImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getConditionalEntryCall()
   * @generated
   */
  int CONDITIONAL_ENTRY_CALL = 111;

  /**
   * The feature id for the '<em><b>Entry Call Alternative</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_ENTRY_CALL__ENTRY_CALL_ALTERNATIVE = SELECT_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Else Sequence Of Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_ENTRY_CALL__ELSE_SEQUENCE_OF_STATEMENTS = SELECT_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Conditional Entry Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_ENTRY_CALL_FEATURE_COUNT = SELECT_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.AsynchronousSelectImpl <em>Asynchronous Select</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.AsynchronousSelectImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getAsynchronousSelect()
   * @generated
   */
  int ASYNCHRONOUS_SELECT = 112;

  /**
   * The feature id for the '<em><b>Triggering Alternative</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASYNCHRONOUS_SELECT__TRIGGERING_ALTERNATIVE = SELECT_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Abortable Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASYNCHRONOUS_SELECT__ABORTABLE_PART = SELECT_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Asynchronous Select</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASYNCHRONOUS_SELECT_FEATURE_COUNT = SELECT_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.TriggeringAlternativeImpl <em>Triggering Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.TriggeringAlternativeImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getTriggeringAlternative()
   * @generated
   */
  int TRIGGERING_ALTERNATIVE = 113;

  /**
   * The feature id for the '<em><b>Triggering Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGERING_ALTERNATIVE__TRIGGERING_STATEMENT = 0;

  /**
   * The feature id for the '<em><b>Sequence Of Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGERING_ALTERNATIVE__SEQUENCE_OF_STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>Triggering Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGERING_ALTERNATIVE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.TriggeringStatementImpl <em>Triggering Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.TriggeringStatementImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getTriggeringStatement()
   * @generated
   */
  int TRIGGERING_STATEMENT = 114;

  /**
   * The number of structural features of the '<em>Triggering Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGERING_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.AbortablePartImpl <em>Abortable Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.AbortablePartImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getAbortablePart()
   * @generated
   */
  int ABORTABLE_PART = 115;

  /**
   * The number of structural features of the '<em>Abortable Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORTABLE_PART_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.AbortStatementImpl <em>Abort Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.AbortStatementImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getAbortStatement()
   * @generated
   */
  int ABORT_STATEMENT = 116;

  /**
   * The number of structural features of the '<em>Abort Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_STATEMENT_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.TaskNamesImpl <em>Task Names</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.TaskNamesImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getTaskNames()
   * @generated
   */
  int TASK_NAMES = 117;

  /**
   * The feature id for the '<em><b>Task Names</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_NAMES__TASK_NAMES = ABORT_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Task Names</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_NAMES_FEATURE_COUNT = ABORT_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.BodyStubImpl <em>Body Stub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.BodyStubImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getBodyStub()
   * @generated
   */
  int BODY_STUB = 118;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_STUB__NAME = BODY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Body Stub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_STUB_FEATURE_COUNT = BODY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.PackageBodyStubImpl <em>Package Body Stub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.PackageBodyStubImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getPackageBodyStub()
   * @generated
   */
  int PACKAGE_BODY_STUB = 119;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_BODY_STUB__NAME = BODY_STUB__NAME;

  /**
   * The number of structural features of the '<em>Package Body Stub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_BODY_STUB_FEATURE_COUNT = BODY_STUB_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.TaskBodyStubImpl <em>Task Body Stub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.TaskBodyStubImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getTaskBodyStub()
   * @generated
   */
  int TASK_BODY_STUB = 120;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_BODY_STUB__NAME = BODY_STUB__NAME;

  /**
   * The number of structural features of the '<em>Task Body Stub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_BODY_STUB_FEATURE_COUNT = BODY_STUB_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ProtectedBodyStubImpl <em>Protected Body Stub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ProtectedBodyStubImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getProtectedBodyStub()
   * @generated
   */
  int PROTECTED_BODY_STUB = 121;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTECTED_BODY_STUB__NAME = BODY_STUB__NAME;

  /**
   * The number of structural features of the '<em>Protected Body Stub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTECTED_BODY_STUB_FEATURE_COUNT = BODY_STUB_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.SeparateSubunitImpl <em>Separate Subunit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.SeparateSubunitImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getSeparateSubunit()
   * @generated
   */
  int SEPARATE_SUBUNIT = 122;

  /**
   * The feature id for the '<em><b>Parent Unit Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEPARATE_SUBUNIT__PARENT_UNIT_NAME = UNIT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Proper Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEPARATE_SUBUNIT__PROPER_BODY = UNIT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Separate Subunit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEPARATE_SUBUNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.RaiseStatementImpl <em>Raise Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.RaiseStatementImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getRaiseStatement()
   * @generated
   */
  int RAISE_STATEMENT = 123;

  /**
   * The feature id for the '<em><b>Exception Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAISE_STATEMENT__EXCEPTION_NAME = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>With Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAISE_STATEMENT__WITH_EXPRESSION = SIMPLE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Raise Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAISE_STATEMENT_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.GenericActualPartImpl <em>Generic Actual Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.GenericActualPartImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getGenericActualPart()
   * @generated
   */
  int GENERIC_ACTUAL_PART = 124;

  /**
   * The feature id for the '<em><b>Generic Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_ACTUAL_PART__GENERIC_ASSOCIATION = 0;

  /**
   * The number of structural features of the '<em>Generic Actual Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_ACTUAL_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.GenericAssociationImpl <em>Generic Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.GenericAssociationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getGenericAssociation()
   * @generated
   */
  int GENERIC_ASSOCIATION = 125;

  /**
   * The feature id for the '<em><b>Selector Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_ASSOCIATION__SELECTOR_NAME = 0;

  /**
   * The feature id for the '<em><b>Expplicit Generic Actual Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_ASSOCIATION__EXPPLICIT_GENERIC_ACTUAL_PARAM = 1;

  /**
   * The number of structural features of the '<em>Generic Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_ASSOCIATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ExplicitGenericActualParameterImpl <em>Explicit Generic Actual Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ExplicitGenericActualParameterImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getExplicitGenericActualParameter()
   * @generated
   */
  int EXPLICIT_GENERIC_ACTUAL_PARAMETER = 126;

  /**
   * The number of structural features of the '<em>Explicit Generic Actual Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_GENERIC_ACTUAL_PARAMETER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.TypeDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getTypeDefinition()
   * @generated
   */
  int TYPE_DEFINITION = 127;

  /**
   * The number of structural features of the '<em>Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.DiscriminantPartImpl <em>Discriminant Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.DiscriminantPartImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getDiscriminantPart()
   * @generated
   */
  int DISCRIMINANT_PART = 128;

  /**
   * The number of structural features of the '<em>Discriminant Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRIMINANT_PART_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.UnknownDiscriminantPartImpl <em>Unknown Discriminant Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.UnknownDiscriminantPartImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getUnknownDiscriminantPart()
   * @generated
   */
  int UNKNOWN_DISCRIMINANT_PART = 129;

  /**
   * The feature id for the '<em><b>Box</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_DISCRIMINANT_PART__BOX = DISCRIMINANT_PART_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unknown Discriminant Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_DISCRIMINANT_PART_FEATURE_COUNT = DISCRIMINANT_PART_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.KnownDiscriminantPartImpl <em>Known Discriminant Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.KnownDiscriminantPartImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getKnownDiscriminantPart()
   * @generated
   */
  int KNOWN_DISCRIMINANT_PART = 130;

  /**
   * The feature id for the '<em><b>Discriminants Specification</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNOWN_DISCRIMINANT_PART__DISCRIMINANTS_SPECIFICATION = DISCRIMINANT_PART_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Known Discriminant Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNOWN_DISCRIMINANT_PART_FEATURE_COUNT = DISCRIMINANT_PART_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.DiscriminantSpecificationImpl <em>Discriminant Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.DiscriminantSpecificationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getDiscriminantSpecification()
   * @generated
   */
  int DISCRIMINANT_SPECIFICATION = 131;

  /**
   * The feature id for the '<em><b>Defining Identifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRIMINANT_SPECIFICATION__DEFINING_IDENTIFIERS = 0;

  /**
   * The feature id for the '<em><b>Opt Null Exclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRIMINANT_SPECIFICATION__OPT_NULL_EXCLUSION = 1;

  /**
   * The feature id for the '<em><b>Access Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRIMINANT_SPECIFICATION__ACCESS_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Subtype Mark</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRIMINANT_SPECIFICATION__SUBTYPE_MARK = 3;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRIMINANT_SPECIFICATION__DEFAULT_VALUE = 4;

  /**
   * The number of structural features of the '<em>Discriminant Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRIMINANT_SPECIFICATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.InterfaceListImpl <em>Interface List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.InterfaceListImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getInterfaceList()
   * @generated
   */
  int INTERFACE_LIST = 132;

  /**
   * The feature id for the '<em><b>Interface Subtype Mark</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_LIST__INTERFACE_SUBTYPE_MARK = 0;

  /**
   * The number of structural features of the '<em>Interface List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.InterfaceTypeDefinitionImpl <em>Interface Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.InterfaceTypeDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getInterfaceTypeDefinition()
   * @generated
   */
  int INTERFACE_TYPE_DEFINITION = 133;

  /**
   * The feature id for the '<em><b>Limited</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_TYPE_DEFINITION__LIMITED = FORMAL_TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Task</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_TYPE_DEFINITION__TASK = FORMAL_TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Protected</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_TYPE_DEFINITION__PROTECTED = FORMAL_TYPE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Synchro</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_TYPE_DEFINITION__SYNCHRO = FORMAL_TYPE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Interface List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_TYPE_DEFINITION__INTERFACE_LIST = FORMAL_TYPE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Interface Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_TYPE_DEFINITION_FEATURE_COUNT = FORMAL_TYPE_DEFINITION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.DerivedTypeDefinitionImpl <em>Derived Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.DerivedTypeDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getDerivedTypeDefinition()
   * @generated
   */
  int DERIVED_TYPE_DEFINITION = 134;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_TYPE_DEFINITION__ABSTRACT = TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Limited</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_TYPE_DEFINITION__LIMITED = TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Subtype Indication</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_TYPE_DEFINITION__SUBTYPE_INDICATION = TYPE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Interface List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_TYPE_DEFINITION__INTERFACE_LIST = TYPE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Record Extention Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_TYPE_DEFINITION__RECORD_EXTENTION_PART = TYPE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Derived Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.RecordExtensionPartImpl <em>Record Extension Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.RecordExtensionPartImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getRecordExtensionPart()
   * @generated
   */
  int RECORD_EXTENSION_PART = 135;

  /**
   * The feature id for the '<em><b>Record Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_EXTENSION_PART__RECORD_DEFINITION = 0;

  /**
   * The number of structural features of the '<em>Record Extension Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_EXTENSION_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.AccessTypeDefinitionImpl <em>Access Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.AccessTypeDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getAccessTypeDefinition()
   * @generated
   */
  int ACCESS_TYPE_DEFINITION = 136;

  /**
   * The feature id for the '<em><b>Opt Null Exclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_TYPE_DEFINITION__OPT_NULL_EXCLUSION = FORMAL_TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Access Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_TYPE_DEFINITION__ACCESS_DEFINITION = FORMAL_TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Access Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_TYPE_DEFINITION_FEATURE_COUNT = FORMAL_TYPE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.AccessSpecificationImpl <em>Access Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.AccessSpecificationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getAccessSpecification()
   * @generated
   */
  int ACCESS_SPECIFICATION = 137;

  /**
   * The number of structural features of the '<em>Access Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_SPECIFICATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.AccessToSubprogramDefinitionImpl <em>Access To Subprogram Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.AccessToSubprogramDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getAccessToSubprogramDefinition()
   * @generated
   */
  int ACCESS_TO_SUBPROGRAM_DEFINITION = 138;

  /**
   * The feature id for the '<em><b>Protected</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_TO_SUBPROGRAM_DEFINITION__PROTECTED = ACCESS_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Formal Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_TO_SUBPROGRAM_DEFINITION__FORMAL_PART = ACCESS_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameter And Result Profile</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_TO_SUBPROGRAM_DEFINITION__PARAMETER_AND_RESULT_PROFILE = ACCESS_SPECIFICATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Access To Subprogram Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_TO_SUBPROGRAM_DEFINITION_FEATURE_COUNT = ACCESS_SPECIFICATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.AccessToDataDefinitionImpl <em>Access To Data Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.AccessToDataDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getAccessToDataDefinition()
   * @generated
   */
  int ACCESS_TO_DATA_DEFINITION = 139;

  /**
   * The feature id for the '<em><b>General Access Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_TO_DATA_DEFINITION__GENERAL_ACCESS_MODIFIER = ACCESS_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Subtype Indication</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_TO_DATA_DEFINITION__SUBTYPE_INDICATION = ACCESS_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Access To Data Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_TO_DATA_DEFINITION_FEATURE_COUNT = ACCESS_SPECIFICATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ArrayTypeDefinitionImpl <em>Array Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ArrayTypeDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getArrayTypeDefinition()
   * @generated
   */
  int ARRAY_TYPE_DEFINITION = 140;

  /**
   * The feature id for the '<em><b>Array Indexes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE_DEFINITION__ARRAY_INDEXES = FORMAL_TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Component Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE_DEFINITION__COMPONENT_DEFINITION = FORMAL_TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Array Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE_DEFINITION_FEATURE_COUNT = FORMAL_TYPE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ArrayIndexesImpl <em>Array Indexes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ArrayIndexesImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getArrayIndexes()
   * @generated
   */
  int ARRAY_INDEXES = 141;

  /**
   * The number of structural features of the '<em>Array Indexes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INDEXES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.UnconstrainedIndexesImpl <em>Unconstrained Indexes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.UnconstrainedIndexesImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getUnconstrainedIndexes()
   * @generated
   */
  int UNCONSTRAINED_INDEXES = 142;

  /**
   * The feature id for the '<em><b>Subtype Mark</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNCONSTRAINED_INDEXES__SUBTYPE_MARK = ARRAY_INDEXES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unconstrained Indexes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNCONSTRAINED_INDEXES_FEATURE_COUNT = ARRAY_INDEXES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ConstrainedIndexesImpl <em>Constrained Indexes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ConstrainedIndexesImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getConstrainedIndexes()
   * @generated
   */
  int CONSTRAINED_INDEXES = 143;

  /**
   * The feature id for the '<em><b>Constrained Index</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINED_INDEXES__CONSTRAINED_INDEX = ARRAY_INDEXES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constrained Indexes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINED_INDEXES_FEATURE_COUNT = ARRAY_INDEXES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.DiscreteSubtypeDefinitionImpl <em>Discrete Subtype Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.DiscreteSubtypeDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getDiscreteSubtypeDefinition()
   * @generated
   */
  int DISCRETE_SUBTYPE_DEFINITION = 144;

  /**
   * The number of structural features of the '<em>Discrete Subtype Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRETE_SUBTYPE_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ComponentDefinitionImpl <em>Component Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ComponentDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getComponentDefinition()
   * @generated
   */
  int COMPONENT_DEFINITION = 145;

  /**
   * The feature id for the '<em><b>Aliased</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__ALIASED = 0;

  /**
   * The feature id for the '<em><b>Subtype Indication</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__SUBTYPE_INDICATION = 1;

  /**
   * The feature id for the '<em><b>Anonymous Access Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__ANONYMOUS_ACCESS_DEFINITION = 2;

  /**
   * The number of structural features of the '<em>Component Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.AnonymousAccessDefinitionImpl <em>Anonymous Access Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.AnonymousAccessDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getAnonymousAccessDefinition()
   * @generated
   */
  int ANONYMOUS_ACCESS_DEFINITION = 146;

  /**
   * The feature id for the '<em><b>Opt Null Exclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANONYMOUS_ACCESS_DEFINITION__OPT_NULL_EXCLUSION = RETURN_SUBTYPE_INDICATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Access Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANONYMOUS_ACCESS_DEFINITION__ACCESS_DEF = RETURN_SUBTYPE_INDICATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Anonymous Access Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANONYMOUS_ACCESS_DEFINITION_FEATURE_COUNT = RETURN_SUBTYPE_INDICATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.NotNullAccessDefinitionImpl <em>Not Null Access Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.NotNullAccessDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getNotNullAccessDefinition()
   * @generated
   */
  int NOT_NULL_ACCESS_DEFINITION = 147;

  /**
   * The number of structural features of the '<em>Not Null Access Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_NULL_ACCESS_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.AccessToDataInstanceImpl <em>Access To Data Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.AccessToDataInstanceImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getAccessToDataInstance()
   * @generated
   */
  int ACCESS_TO_DATA_INSTANCE = 148;

  /**
   * The feature id for the '<em><b>Constant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_TO_DATA_INSTANCE__CONSTANT = NOT_NULL_ACCESS_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_TO_DATA_INSTANCE__NAME = NOT_NULL_ACCESS_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Access To Data Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_TO_DATA_INSTANCE_FEATURE_COUNT = NOT_NULL_ACCESS_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ParameterAndResultProfileImpl <em>Parameter And Result Profile</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ParameterAndResultProfileImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getParameterAndResultProfile()
   * @generated
   */
  int PARAMETER_AND_RESULT_PROFILE = 149;

  /**
   * The feature id for the '<em><b>Formal Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_AND_RESULT_PROFILE__FORMAL_PART = 0;

  /**
   * The feature id for the '<em><b>Opt null Exclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_AND_RESULT_PROFILE__OPT_NULL_EXCLUSION = 1;

  /**
   * The feature id for the '<em><b>Subtype Mark</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_AND_RESULT_PROFILE__SUBTYPE_MARK = 2;

  /**
   * The feature id for the '<em><b>Anonymous Access Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_AND_RESULT_PROFILE__ANONYMOUS_ACCESS_DEFINITION = 3;

  /**
   * The number of structural features of the '<em>Parameter And Result Profile</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_AND_RESULT_PROFILE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.FormalPartImpl <em>Formal Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.FormalPartImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getFormalPart()
   * @generated
   */
  int FORMAL_PART = 150;

  /**
   * The feature id for the '<em><b>Parameter Specifications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PART__PARAMETER_SPECIFICATIONS = 0;

  /**
   * The number of structural features of the '<em>Formal Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ParameterSpecificationImpl <em>Parameter Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ParameterSpecificationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getParameterSpecification()
   * @generated
   */
  int PARAMETER_SPECIFICATION = 151;

  /**
   * The feature id for the '<em><b>Defining Identifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SPECIFICATION__DEFINING_IDENTIFIERS = 0;

  /**
   * The feature id for the '<em><b>Mode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SPECIFICATION__MODE = 1;

  /**
   * The feature id for the '<em><b>Opt Null Exclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SPECIFICATION__OPT_NULL_EXCLUSION = 2;

  /**
   * The feature id for the '<em><b>Subtype Mark</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SPECIFICATION__SUBTYPE_MARK = 3;

  /**
   * The feature id for the '<em><b>Anonymous Access Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SPECIFICATION__ANONYMOUS_ACCESS_DEFINITION = 4;

  /**
   * The feature id for the '<em><b>Default Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SPECIFICATION__DEFAULT_EXPRESSION = 5;

  /**
   * The number of structural features of the '<em>Parameter Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SPECIFICATION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ModeImpl <em>Mode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ModeImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getMode()
   * @generated
   */
  int MODE = 152;

  /**
   * The feature id for the '<em><b>In</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE__IN = 0;

  /**
   * The feature id for the '<em><b>Out</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE__OUT = 1;

  /**
   * The number of structural features of the '<em>Mode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.IntegerTypeDefinitionImpl <em>Integer Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.IntegerTypeDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getIntegerTypeDefinition()
   * @generated
   */
  int INTEGER_TYPE_DEFINITION = 153;

  /**
   * The number of structural features of the '<em>Integer Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.SignedIntegerTypeDefinitionImpl <em>Signed Integer Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.SignedIntegerTypeDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getSignedIntegerTypeDefinition()
   * @generated
   */
  int SIGNED_INTEGER_TYPE_DEFINITION = 154;

  /**
   * The feature id for the '<em><b>First</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_INTEGER_TYPE_DEFINITION__FIRST = INTEGER_TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Last</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_INTEGER_TYPE_DEFINITION__LAST = INTEGER_TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Signed Integer Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_INTEGER_TYPE_DEFINITION_FEATURE_COUNT = INTEGER_TYPE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ModularTypeDefinitionImpl <em>Modular Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ModularTypeDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getModularTypeDefinition()
   * @generated
   */
  int MODULAR_TYPE_DEFINITION = 155;

  /**
   * The feature id for the '<em><b>Static Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULAR_TYPE_DEFINITION__STATIC_EXPRESSION = INTEGER_TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Modular Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULAR_TYPE_DEFINITION_FEATURE_COUNT = INTEGER_TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.EnumerationTypeDefinitionImpl <em>Enumeration Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.EnumerationTypeDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getEnumerationTypeDefinition()
   * @generated
   */
  int ENUMERATION_TYPE_DEFINITION = 156;

  /**
   * The feature id for the '<em><b>Enumerationliteralspecifications</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_TYPE_DEFINITION__ENUMERATIONLITERALSPECIFICATIONS = TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enumeration Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.RecordTypeDefinitionImpl <em>Record Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.RecordTypeDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getRecordTypeDefinition()
   * @generated
   */
  int RECORD_TYPE_DEFINITION = 157;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE_DEFINITION__ABSTRACT = TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tagged</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE_DEFINITION__TAGGED = TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Limited</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE_DEFINITION__LIMITED = TYPE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Record Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE_DEFINITION__RECORD_DEFINITION = TYPE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Record Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.RecordDefinitionImpl <em>Record Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.RecordDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getRecordDefinition()
   * @generated
   */
  int RECORD_DEFINITION = 158;

  /**
   * The feature id for the '<em><b>Component List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_DEFINITION__COMPONENT_LIST = 0;

  /**
   * The feature id for the '<em><b>Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_DEFINITION__NULL = 1;

  /**
   * The number of structural features of the '<em>Record Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ComponentListImpl <em>Component List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ComponentListImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getComponentList()
   * @generated
   */
  int COMPONENT_LIST = 159;

  /**
   * The feature id for the '<em><b>Component Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_LIST__COMPONENT_ITEMS = 0;

  /**
   * The feature id for the '<em><b>Opt Variant Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_LIST__OPT_VARIANT_PART = 1;

  /**
   * The number of structural features of the '<em>Component List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.OptVariantPartImpl <em>Opt Variant Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.OptVariantPartImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getOptVariantPart()
   * @generated
   */
  int OPT_VARIANT_PART = 160;

  /**
   * The feature id for the '<em><b>Variant Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPT_VARIANT_PART__VARIANT_PART = 0;

  /**
   * The number of structural features of the '<em>Opt Variant Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPT_VARIANT_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ComponentItemImpl <em>Component Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ComponentItemImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getComponentItem()
   * @generated
   */
  int COMPONENT_ITEM = 161;

  /**
   * The number of structural features of the '<em>Component Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ComponentDeclarationImpl <em>Component Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ComponentDeclarationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getComponentDeclaration()
   * @generated
   */
  int COMPONENT_DECLARATION = 162;

  /**
   * The feature id for the '<em><b>Defining Identifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DECLARATION__DEFINING_IDENTIFIERS = PROTECTED_ELEMENT_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Component Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DECLARATION__COMPONENT_DEFINITION = PROTECTED_ELEMENT_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DECLARATION__DEFAULT_EXPRESSION = PROTECTED_ELEMENT_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Component Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DECLARATION_FEATURE_COUNT = PROTECTED_ELEMENT_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.DefiningIdentifierListImpl <em>Defining Identifier List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.DefiningIdentifierListImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getDefiningIdentifierList()
   * @generated
   */
  int DEFINING_IDENTIFIER_LIST = 163;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINING_IDENTIFIER_LIST__NAME = 0;

  /**
   * The number of structural features of the '<em>Defining Identifier List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINING_IDENTIFIER_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.AspectClauseImpl <em>Aspect Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.AspectClauseImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getAspectClause()
   * @generated
   */
  int ASPECT_CLAUSE = 164;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_CLAUSE__NAME = BASIC_DECLARATIVE_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_CLAUSE__EXPRESSION = BASIC_DECLARATIVE_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Mod</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_CLAUSE__MOD = BASIC_DECLARATIVE_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Component Clause</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_CLAUSE__COMPONENT_CLAUSE = BASIC_DECLARATIVE_ITEM_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Aspect Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_CLAUSE_FEATURE_COUNT = BASIC_DECLARATIVE_ITEM_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ModClauseImpl <em>Mod Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ModClauseImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getModClause()
   * @generated
   */
  int MOD_CLAUSE = 165;

  /**
   * The feature id for the '<em><b>Mod</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_CLAUSE__MOD = 0;

  /**
   * The number of structural features of the '<em>Mod Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ComponentClauseImpl <em>Component Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ComponentClauseImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getComponentClause()
   * @generated
   */
  int COMPONENT_CLAUSE = 166;

  /**
   * The feature id for the '<em><b>Local Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_CLAUSE__LOCAL_NAME = 0;

  /**
   * The feature id for the '<em><b>Position</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_CLAUSE__POSITION = 1;

  /**
   * The feature id for the '<em><b>First Bit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_CLAUSE__FIRST_BIT = 2;

  /**
   * The feature id for the '<em><b>Last Bit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_CLAUSE__LAST_BIT = 3;

  /**
   * The number of structural features of the '<em>Component Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_CLAUSE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.VariantPartImpl <em>Variant Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.VariantPartImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getVariantPart()
   * @generated
   */
  int VARIANT_PART = 167;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_PART__NAME = 0;

  /**
   * The feature id for the '<em><b>Variants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_PART__VARIANTS = 1;

  /**
   * The number of structural features of the '<em>Variant Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_PART_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.VariantImpl <em>Variant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.VariantImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getVariant()
   * @generated
   */
  int VARIANT = 168;

  /**
   * The feature id for the '<em><b>Discrete Choice List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT__DISCRETE_CHOICE_LIST = 0;

  /**
   * The feature id for the '<em><b>Component List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT__COMPONENT_LIST = 1;

  /**
   * The number of structural features of the '<em>Variant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.DiscreteChoiceListImpl <em>Discrete Choice List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.DiscreteChoiceListImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getDiscreteChoiceList()
   * @generated
   */
  int DISCRETE_CHOICE_LIST = 169;

  /**
   * The feature id for the '<em><b>Discrete Choice List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRETE_CHOICE_LIST__DISCRETE_CHOICE_LIST = 0;

  /**
   * The number of structural features of the '<em>Discrete Choice List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRETE_CHOICE_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.RealTypeDefinitionImpl <em>Real Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.RealTypeDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getRealTypeDefinition()
   * @generated
   */
  int REAL_TYPE_DEFINITION = 170;

  /**
   * The feature id for the '<em><b>Digits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_TYPE_DEFINITION__DIGITS = TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Real Range Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_TYPE_DEFINITION__REAL_RANGE_SPECIFICATION = TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Real Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.FloatingPointDefinitionImpl <em>Floating Point Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.FloatingPointDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getFloatingPointDefinition()
   * @generated
   */
  int FLOATING_POINT_DEFINITION = 171;

  /**
   * The feature id for the '<em><b>Digits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOATING_POINT_DEFINITION__DIGITS = REAL_TYPE_DEFINITION__DIGITS;

  /**
   * The feature id for the '<em><b>Real Range Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOATING_POINT_DEFINITION__REAL_RANGE_SPECIFICATION = REAL_TYPE_DEFINITION__REAL_RANGE_SPECIFICATION;

  /**
   * The number of structural features of the '<em>Floating Point Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOATING_POINT_DEFINITION_FEATURE_COUNT = REAL_TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.RealRangeSpecificationImpl <em>Real Range Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.RealRangeSpecificationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getRealRangeSpecification()
   * @generated
   */
  int REAL_RANGE_SPECIFICATION = 172;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_RANGE_SPECIFICATION__LOWER_BOUND = 0;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_RANGE_SPECIFICATION__UPPER_BOUND = 1;

  /**
   * The number of structural features of the '<em>Real Range Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_RANGE_SPECIFICATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.FixedPointDefinitionImpl <em>Fixed Point Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.FixedPointDefinitionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getFixedPointDefinition()
   * @generated
   */
  int FIXED_POINT_DEFINITION = 173;

  /**
   * The feature id for the '<em><b>Digits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_POINT_DEFINITION__DIGITS = REAL_TYPE_DEFINITION__DIGITS;

  /**
   * The feature id for the '<em><b>Real Range Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_POINT_DEFINITION__REAL_RANGE_SPECIFICATION = REAL_TYPE_DEFINITION__REAL_RANGE_SPECIFICATION;

  /**
   * The feature id for the '<em><b>Delta</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_POINT_DEFINITION__DELTA = REAL_TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fixed Point Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_POINT_DEFINITION_FEATURE_COUNT = REAL_TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ExpressionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 174;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RELATIONS = ENTRY_INDEX_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Boolean Operator</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__BOOLEAN_OPERATOR = ENTRY_INDEX_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = ENTRY_INDEX_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.RelationImpl <em>Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.RelationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getRelation()
   * @generated
   */
  int RELATION = 175;

  /**
   * The feature id for the '<em><b>Simple Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__SIMPLE_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Relational Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__RELATIONAL_OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Sub Simple Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__SUB_SIMPLE_EXPRESSION = 2;

  /**
   * The feature id for the '<em><b>Membership</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__MEMBERSHIP = 3;

  /**
   * The number of structural features of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.MembershipImpl <em>Membership</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.MembershipImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getMembership()
   * @generated
   */
  int MEMBERSHIP = 176;

  /**
   * The feature id for the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBERSHIP__NOT = 0;

  /**
   * The feature id for the '<em><b>Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBERSHIP__INTERVAL = 1;

  /**
   * The number of structural features of the '<em>Membership</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBERSHIP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.IntervalImpl <em>Interval</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.IntervalImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getInterval()
   * @generated
   */
  int INTERVAL = 177;

  /**
   * The number of structural features of the '<em>Interval</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.SimpleExpressionImpl <em>Simple Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.SimpleExpressionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getSimpleExpression()
   * @generated
   */
  int SIMPLE_EXPRESSION = 178;

  /**
   * The feature id for the '<em><b>Unary Adding Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION__UNARY_ADDING_OPERATOR = 0;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION__TERMS = 1;

  /**
   * The feature id for the '<em><b>Binary Adding Operators</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION__BINARY_ADDING_OPERATORS = 2;

  /**
   * The number of structural features of the '<em>Simple Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.TermImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getTerm()
   * @generated
   */
  int TERM = 179;

  /**
   * The feature id for the '<em><b>Factors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__FACTORS = 0;

  /**
   * The feature id for the '<em><b>Multiplying Operators</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__MULTIPLYING_OPERATORS = 1;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.FactorImpl <em>Factor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.FactorImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getFactor()
   * @generated
   */
  int FACTOR = 180;

  /**
   * The feature id for the '<em><b>Primary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__PRIMARY = 0;

  /**
   * The feature id for the '<em><b>Exponent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__EXPONENT = 1;

  /**
   * The feature id for the '<em><b>Abs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__ABS = 2;

  /**
   * The feature id for the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__NOT = 3;

  /**
   * The number of structural features of the '<em>Factor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.PrimaryImpl <em>Primary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.PrimaryImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getPrimary()
   * @generated
   */
  int PRIMARY = 181;

  /**
   * The number of structural features of the '<em>Primary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.NumericLiteralImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getNumericLiteral()
   * @generated
   */
  int NUMERIC_LITERAL = 182;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_LITERAL__VALUE = PRIMARY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Numeric Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_LITERAL_FEATURE_COUNT = PRIMARY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.NullImpl <em>Null</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.NullImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getNull()
   * @generated
   */
  int NULL = 183;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL__VALUE = PRIMARY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Null</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_FEATURE_COUNT = PRIMARY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.StringLiteralImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 184;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = PRIMARY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = PRIMARY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.QualifiedNameImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getQualifiedName()
   * @generated
   */
  int QUALIFIED_NAME = 185;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME__NAME = PRIMARY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME__QUALIFIER = PRIMARY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Qualified Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_FEATURE_COUNT = PRIMARY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ParenthesizedExpressionImpl <em>Parenthesized Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ParenthesizedExpressionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getParenthesizedExpression()
   * @generated
   */
  int PARENTHESIZED_EXPRESSION = 186;

  /**
   * The number of structural features of the '<em>Parenthesized Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPRESSION_FEATURE_COUNT = PRIMARY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.QualifierImpl <em>Qualifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.QualifierImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getQualifier()
   * @generated
   */
  int QUALIFIER = 187;

  /**
   * The number of structural features of the '<em>Qualifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.AllocatorImpl <em>Allocator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.AllocatorImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getAllocator()
   * @generated
   */
  int ALLOCATOR = 188;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOCATOR__TYPE_NAME = PRIMARY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOCATOR__QUALIFIER = PRIMARY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Allocator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOCATOR_FEATURE_COUNT = PRIMARY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.SubtypeIndicationImpl <em>Subtype Indication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.SubtypeIndicationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getSubtypeIndication()
   * @generated
   */
  int SUBTYPE_INDICATION = 189;

  /**
   * The feature id for the '<em><b>Opt null Exclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTYPE_INDICATION__OPT_NULL_EXCLUSION = RETURN_SUBTYPE_INDICATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Subtype Mark</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTYPE_INDICATION__SUBTYPE_MARK = RETURN_SUBTYPE_INDICATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Opt constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTYPE_INDICATION__OPT_CONSTRAINT = RETURN_SUBTYPE_INDICATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Subtype Indication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTYPE_INDICATION_FEATURE_COUNT = RETURN_SUBTYPE_INDICATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.OptNullExclusionImpl <em>Opt Null Exclusion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.OptNullExclusionImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getOptNullExclusion()
   * @generated
   */
  int OPT_NULL_EXCLUSION = 190;

  /**
   * The feature id for the '<em><b>Not null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPT_NULL_EXCLUSION__NOT_NULL = 0;

  /**
   * The number of structural features of the '<em>Opt Null Exclusion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPT_NULL_EXCLUSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.OptConstraintImpl <em>Opt Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.OptConstraintImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getOptConstraint()
   * @generated
   */
  int OPT_CONSTRAINT = 191;

  /**
   * The feature id for the '<em><b>Opt Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPT_CONSTRAINT__OPT_CONSTRAINT = 0;

  /**
   * The number of structural features of the '<em>Opt Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPT_CONSTRAINT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ScalarConstraintImpl <em>Scalar Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ScalarConstraintImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getScalarConstraint()
   * @generated
   */
  int SCALAR_CONSTRAINT = 192;

  /**
   * The number of structural features of the '<em>Scalar Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_CONSTRAINT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.DigitsConstraintImpl <em>Digits Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.DigitsConstraintImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getDigitsConstraint()
   * @generated
   */
  int DIGITS_CONSTRAINT = 193;

  /**
   * The feature id for the '<em><b>Digits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITS_CONSTRAINT__DIGITS = SCALAR_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Range Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITS_CONSTRAINT__RANGE_CONSTRAINT = SCALAR_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Digits Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITS_CONSTRAINT_FEATURE_COUNT = SCALAR_CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.DeltaConstraintImpl <em>Delta Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.DeltaConstraintImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getDeltaConstraint()
   * @generated
   */
  int DELTA_CONSTRAINT = 194;

  /**
   * The feature id for the '<em><b>Delta</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_CONSTRAINT__DELTA = SCALAR_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Range Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_CONSTRAINT__RANGE_CONSTRAINT = SCALAR_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Delta Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_CONSTRAINT_FEATURE_COUNT = SCALAR_CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.RangeConstraintImpl <em>Range Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.RangeConstraintImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getRangeConstraint()
   * @generated
   */
  int RANGE_CONSTRAINT = 195;

  /**
   * The number of structural features of the '<em>Range Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_CONSTRAINT_FEATURE_COUNT = SCALAR_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.CompositeConstraintImpl <em>Composite Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.CompositeConstraintImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getCompositeConstraint()
   * @generated
   */
  int COMPOSITE_CONSTRAINT = 196;

  /**
   * The number of structural features of the '<em>Composite Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_CONSTRAINT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.DiscriminantConstraintImpl <em>Discriminant Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.DiscriminantConstraintImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getDiscriminantConstraint()
   * @generated
   */
  int DISCRIMINANT_CONSTRAINT = 197;

  /**
   * The feature id for the '<em><b>Discriminant Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRIMINANT_CONSTRAINT__DISCRIMINANT_ASSOCIATION = COMPOSITE_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Discriminant Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRIMINANT_CONSTRAINT_FEATURE_COUNT = COMPOSITE_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.IndexConstraintImpl <em>Index Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.IndexConstraintImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getIndexConstraint()
   * @generated
   */
  int INDEX_CONSTRAINT = 198;

  /**
   * The feature id for the '<em><b>Discrete Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX_CONSTRAINT__DISCRETE_RANGE = COMPOSITE_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Index Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX_CONSTRAINT_FEATURE_COUNT = COMPOSITE_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.DiscriminantAssociationImpl <em>Discriminant Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.DiscriminantAssociationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getDiscriminantAssociation()
   * @generated
   */
  int DISCRIMINANT_ASSOCIATION = 199;

  /**
   * The feature id for the '<em><b>Discriminant Selectors</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRIMINANT_ASSOCIATION__DISCRIMINANT_SELECTORS = 0;

  /**
   * The feature id for the '<em><b>Actual Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRIMINANT_ASSOCIATION__ACTUAL_PARAMETER = 1;

  /**
   * The number of structural features of the '<em>Discriminant Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRIMINANT_ASSOCIATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.DiscriminantSelectorsImpl <em>Discriminant Selectors</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.DiscriminantSelectorsImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getDiscriminantSelectors()
   * @generated
   */
  int DISCRIMINANT_SELECTORS = 200;

  /**
   * The feature id for the '<em><b>Discriminant Selector Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRIMINANT_SELECTORS__DISCRIMINANT_SELECTOR_NAME = 0;

  /**
   * The number of structural features of the '<em>Discriminant Selectors</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRIMINANT_SELECTORS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.DiscreteRangeImpl <em>Discrete Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.DiscreteRangeImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getDiscreteRange()
   * @generated
   */
  int DISCRETE_RANGE = 201;

  /**
   * The number of structural features of the '<em>Discrete Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRETE_RANGE_FEATURE_COUNT = DISCRETE_SUBTYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ComponentChoiceListImpl <em>Component Choice List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ComponentChoiceListImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getComponentChoiceList()
   * @generated
   */
  int COMPONENT_CHOICE_LIST = 202;

  /**
   * The feature id for the '<em><b>Component Selector Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_CHOICE_LIST__COMPONENT_SELECTOR_NAME = 0;

  /**
   * The feature id for the '<em><b>Others</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_CHOICE_LIST__OTHERS = 1;

  /**
   * The number of structural features of the '<em>Component Choice List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_CHOICE_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.DiscreteChoiceImpl <em>Discrete Choice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.DiscreteChoiceImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getDiscreteChoice()
   * @generated
   */
  int DISCRETE_CHOICE = 203;

  /**
   * The number of structural features of the '<em>Discrete Choice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRETE_CHOICE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.AggregateImpl <em>Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.AggregateImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getAggregate()
   * @generated
   */
  int AGGREGATE = 204;

  /**
   * The number of structural features of the '<em>Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_FEATURE_COUNT = PARENTHESIZED_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.RecordAggregateImpl <em>Record Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.RecordAggregateImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getRecordAggregate()
   * @generated
   */
  int RECORD_AGGREGATE = 205;

  /**
   * The number of structural features of the '<em>Record Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_AGGREGATE_FEATURE_COUNT = AGGREGATE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.RecordComponentAssociationListImpl <em>Record Component Association List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.RecordComponentAssociationListImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getRecordComponentAssociationList()
   * @generated
   */
  int RECORD_COMPONENT_ASSOCIATION_LIST = 206;

  /**
   * The feature id for the '<em><b>Record Component Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_COMPONENT_ASSOCIATION_LIST__RECORD_COMPONENT_ASSOCIATION = RECORD_AGGREGATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Null Record</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_COMPONENT_ASSOCIATION_LIST__NULL_RECORD = RECORD_AGGREGATE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Record Component Association List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_COMPONENT_ASSOCIATION_LIST_FEATURE_COUNT = RECORD_AGGREGATE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.RecordComponentAssociationImpl <em>Record Component Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.RecordComponentAssociationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getRecordComponentAssociation()
   * @generated
   */
  int RECORD_COMPONENT_ASSOCIATION = 207;

  /**
   * The feature id for the '<em><b>Component Choice List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_COMPONENT_ASSOCIATION__COMPONENT_CHOICE_LIST = 0;

  /**
   * The number of structural features of the '<em>Record Component Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_COMPONENT_ASSOCIATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.InitializedComponentsImpl <em>Initialized Components</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.InitializedComponentsImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getInitializedComponents()
   * @generated
   */
  int INITIALIZED_COMPONENTS = 208;

  /**
   * The feature id for the '<em><b>Component Choice List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZED_COMPONENTS__COMPONENT_CHOICE_LIST = RECORD_COMPONENT_ASSOCIATION__COMPONENT_CHOICE_LIST;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZED_COMPONENTS__VALUE = RECORD_COMPONENT_ASSOCIATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Initialized Components</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZED_COMPONENTS_FEATURE_COUNT = RECORD_COMPONENT_ASSOCIATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.UninitializedComponentsImpl <em>Uninitialized Components</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.UninitializedComponentsImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getUninitializedComponents()
   * @generated
   */
  int UNINITIALIZED_COMPONENTS = 209;

  /**
   * The feature id for the '<em><b>Component Choice List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNINITIALIZED_COMPONENTS__COMPONENT_CHOICE_LIST = RECORD_COMPONENT_ASSOCIATION__COMPONENT_CHOICE_LIST;

  /**
   * The feature id for the '<em><b>Box</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNINITIALIZED_COMPONENTS__BOX = RECORD_COMPONENT_ASSOCIATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Uninitialized Components</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNINITIALIZED_COMPONENTS_FEATURE_COUNT = RECORD_COMPONENT_ASSOCIATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ExtensionAggregateImpl <em>Extension Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ExtensionAggregateImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getExtensionAggregate()
   * @generated
   */
  int EXTENSION_AGGREGATE = 210;

  /**
   * The feature id for the '<em><b>Ancestor Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_AGGREGATE__ANCESTOR_PART = AGGREGATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Record Component Association List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_AGGREGATE__RECORD_COMPONENT_ASSOCIATION_LIST = AGGREGATE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Extension Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_AGGREGATE_FEATURE_COUNT = AGGREGATE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ArrayAggregateImpl <em>Array Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ArrayAggregateImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getArrayAggregate()
   * @generated
   */
  int ARRAY_AGGREGATE = 211;

  /**
   * The number of structural features of the '<em>Array Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_AGGREGATE_FEATURE_COUNT = AGGREGATE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.PositionalArrayAggregateImpl <em>Positional Array Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.PositionalArrayAggregateImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getPositionalArrayAggregate()
   * @generated
   */
  int POSITIONAL_ARRAY_AGGREGATE = 212;

  /**
   * The feature id for the '<em><b>Initial Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIONAL_ARRAY_AGGREGATE__INITIAL_VALUES = ARRAY_AGGREGATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Others Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIONAL_ARRAY_AGGREGATE__OTHERS_VALUE = ARRAY_AGGREGATE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Others Box</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIONAL_ARRAY_AGGREGATE__OTHERS_BOX = ARRAY_AGGREGATE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Positional Array Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIONAL_ARRAY_AGGREGATE_FEATURE_COUNT = ARRAY_AGGREGATE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.NamedArrayAggregateImpl <em>Named Array Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.NamedArrayAggregateImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getNamedArrayAggregate()
   * @generated
   */
  int NAMED_ARRAY_AGGREGATE = 213;

  /**
   * The feature id for the '<em><b>Array Component Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ARRAY_AGGREGATE__ARRAY_COMPONENT_ASSOCIATION = ARRAY_AGGREGATE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Array Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ARRAY_AGGREGATE_FEATURE_COUNT = ARRAY_AGGREGATE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ArrayComponentAssociationImpl <em>Array Component Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ArrayComponentAssociationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getArrayComponentAssociation()
   * @generated
   */
  int ARRAY_COMPONENT_ASSOCIATION = 214;

  /**
   * The feature id for the '<em><b>Discrete Choice List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_COMPONENT_ASSOCIATION__DISCRETE_CHOICE_LIST = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_COMPONENT_ASSOCIATION__EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Box</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_COMPONENT_ASSOCIATION__BOX = 2;

  /**
   * The number of structural features of the '<em>Array Component Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_COMPONENT_ASSOCIATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.AncestorPartImpl <em>Ancestor Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.AncestorPartImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getAncestorPart()
   * @generated
   */
  int ANCESTOR_PART = 215;

  /**
   * The number of structural features of the '<em>Ancestor Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCESTOR_PART_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.NameImpl <em>Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.NameImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getName_()
   * @generated
   */
  int NAME = 216;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__NAME = INTERVAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Primary Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__PRIMARY_NAME = INTERVAL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_FEATURE_COUNT = INTERVAL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.PrimaryNameImpl <em>Primary Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.PrimaryNameImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getPrimaryName()
   * @generated
   */
  int PRIMARY_NAME = 217;

  /**
   * The feature id for the '<em><b>Parameter Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_NAME__PARAMETER_ASSOCIATION = 0;

  /**
   * The feature id for the '<em><b>Primary Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_NAME__PRIMARY_NAME = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_NAME__NAME = 2;

  /**
   * The feature id for the '<em><b>Attribute Designator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_NAME__ATTRIBUTE_DESIGNATOR = 3;

  /**
   * The number of structural features of the '<em>Primary Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_NAME_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ParameterAssociationImpl <em>Parameter Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ParameterAssociationImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getParameterAssociation()
   * @generated
   */
  int PARAMETER_ASSOCIATION = 218;

  /**
   * The feature id for the '<em><b>Selector Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ASSOCIATION__SELECTOR_NAME = 0;

  /**
   * The feature id for the '<em><b>Parameter Effective Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ASSOCIATION__PARAMETER_EFFECTIVE_VALUE = 1;

  /**
   * The number of structural features of the '<em>Parameter Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ASSOCIATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ParameterEffectiveValueImpl <em>Parameter Effective Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ParameterEffectiveValueImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getParameterEffectiveValue()
   * @generated
   */
  int PARAMETER_EFFECTIVE_VALUE = 219;

  /**
   * The number of structural features of the '<em>Parameter Effective Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_EFFECTIVE_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.AttributeDesignatorImpl <em>Attribute Designator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.AttributeDesignatorImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getAttributeDesignator()
   * @generated
   */
  int ATTRIBUTE_DESIGNATOR = 220;

  /**
   * The feature id for the '<em><b>Static Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DESIGNATOR__STATIC_EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Attribute Designator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DESIGNATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.RangeImpl <em>Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.RangeImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getRange()
   * @generated
   */
  int RANGE = 221;

  /**
   * The number of structural features of the '<em>Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FEATURE_COUNT = INTERVAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.EntityRangeImpl <em>Entity Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.EntityRangeImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getEntityRange()
   * @generated
   */
  int ENTITY_RANGE = 222;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_RANGE__NAME = RANGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_RANGE__INDEX = RANGE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Entity Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_RANGE_FEATURE_COUNT = RANGE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ada2005.adb.impl.ExplicitRangeImpl <em>Explicit Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ada2005.adb.impl.ExplicitRangeImpl
   * @see org.xtext.ada2005.adb.impl.AdbPackageImpl#getExplicitRange()
   * @generated
   */
  int EXPLICIT_RANGE = 223;

  /**
   * The feature id for the '<em><b>First</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_RANGE__FIRST = RANGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Last</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_RANGE__LAST = RANGE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Explicit Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_RANGE_FEATURE_COUNT = RANGE_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.Compilation <em>Compilation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compilation</em>'.
   * @see org.xtext.ada2005.adb.Compilation
   * @generated
   */
  EClass getCompilation();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.Compilation#getCompilationUnits <em>Compilation Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Compilation Units</em>'.
   * @see org.xtext.ada2005.adb.Compilation#getCompilationUnits()
   * @see #getCompilation()
   * @generated
   */
  EReference getCompilation_CompilationUnits();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.CompilationUnit <em>Compilation Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compilation Unit</em>'.
   * @see org.xtext.ada2005.adb.CompilationUnit
   * @generated
   */
  EClass getCompilationUnit();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.CompilationUnit#getContextClause <em>Context Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Context Clause</em>'.
   * @see org.xtext.ada2005.adb.CompilationUnit#getContextClause()
   * @see #getCompilationUnit()
   * @generated
   */
  EReference getCompilationUnit_ContextClause();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.CompilationUnit#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unit</em>'.
   * @see org.xtext.ada2005.adb.CompilationUnit#getUnit()
   * @see #getCompilationUnit()
   * @generated
   */
  EReference getCompilationUnit_Unit();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.CompilationUnit#getPragmas <em>Pragmas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pragmas</em>'.
   * @see org.xtext.ada2005.adb.CompilationUnit#getPragmas()
   * @see #getCompilationUnit()
   * @generated
   */
  EReference getCompilationUnit_Pragmas();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.Unit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unit</em>'.
   * @see org.xtext.ada2005.adb.Unit
   * @generated
   */
  EClass getUnit();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ContextClause <em>Context Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Clause</em>'.
   * @see org.xtext.ada2005.adb.ContextClause
   * @generated
   */
  EClass getContextClause();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.ContextClause#getContextItems <em>Context Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Context Items</em>'.
   * @see org.xtext.ada2005.adb.ContextClause#getContextItems()
   * @see #getContextClause()
   * @generated
   */
  EReference getContextClause_ContextItems();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ContextItem <em>Context Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Item</em>'.
   * @see org.xtext.ada2005.adb.ContextItem
   * @generated
   */
  EClass getContextItem();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.WithClause <em>With Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>With Clause</em>'.
   * @see org.xtext.ada2005.adb.WithClause
   * @generated
   */
  EClass getWithClause();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.WithClause#isLimited <em>Limited</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Limited</em>'.
   * @see org.xtext.ada2005.adb.WithClause#isLimited()
   * @see #getWithClause()
   * @generated
   */
  EAttribute getWithClause_Limited();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.WithClause#isPrivate <em>Private</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Private</em>'.
   * @see org.xtext.ada2005.adb.WithClause#isPrivate()
   * @see #getWithClause()
   * @generated
   */
  EAttribute getWithClause_Private();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.ada2005.adb.WithClause#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Import URI</em>'.
   * @see org.xtext.ada2005.adb.WithClause#getImportURI()
   * @see #getWithClause()
   * @generated
   */
  EReference getWithClause_ImportURI();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.UseClause <em>Use Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Use Clause</em>'.
   * @see org.xtext.ada2005.adb.UseClause
   * @generated
   */
  EClass getUseClause();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.UsePackageClause <em>Use Package Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Use Package Clause</em>'.
   * @see org.xtext.ada2005.adb.UsePackageClause
   * @generated
   */
  EClass getUsePackageClause();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.ada2005.adb.UsePackageClause#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Imported Namespace</em>'.
   * @see org.xtext.ada2005.adb.UsePackageClause#getImportedNamespace()
   * @see #getUsePackageClause()
   * @generated
   */
  EReference getUsePackageClause_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.UseTypeClause <em>Use Type Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Use Type Clause</em>'.
   * @see org.xtext.ada2005.adb.UseTypeClause
   * @generated
   */
  EClass getUseTypeClause();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.ada2005.adb.UseTypeClause#getTypesNames <em>Types Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Types Names</em>'.
   * @see org.xtext.ada2005.adb.UseTypeClause#getTypesNames()
   * @see #getUseTypeClause()
   * @generated
   */
  EAttribute getUseTypeClause_TypesNames();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.ada2005.adb.UseTypeClause#getUseTypeRefs <em>Use Type Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Use Type Refs</em>'.
   * @see org.xtext.ada2005.adb.UseTypeClause#getUseTypeRefs()
   * @see #getUseTypeClause()
   * @generated
   */
  EAttribute getUseTypeClause_UseTypeRefs();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.LibraryUnitDeclaration <em>Library Unit Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Library Unit Declaration</em>'.
   * @see org.xtext.ada2005.adb.LibraryUnitDeclaration
   * @generated
   */
  EClass getLibraryUnitDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.LibraryUnitDeclaration#isPrivate <em>Private</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Private</em>'.
   * @see org.xtext.ada2005.adb.LibraryUnitDeclaration#isPrivate()
   * @see #getLibraryUnitDeclaration()
   * @generated
   */
  EAttribute getLibraryUnitDeclaration_Private();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.LibraryUnitDeclaration#getLibraryUnitSpecification <em>Library Unit Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Library Unit Specification</em>'.
   * @see org.xtext.ada2005.adb.LibraryUnitDeclaration#getLibraryUnitSpecification()
   * @see #getLibraryUnitDeclaration()
   * @generated
   */
  EReference getLibraryUnitDeclaration_LibraryUnitSpecification();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.LibraryUnitSpecification <em>Library Unit Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Library Unit Specification</em>'.
   * @see org.xtext.ada2005.adb.LibraryUnitSpecification
   * @generated
   */
  EClass getLibraryUnitSpecification();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see org.xtext.ada2005.adb.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.PackageDefinition <em>Package Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Definition</em>'.
   * @see org.xtext.ada2005.adb.PackageDefinition
   * @generated
   */
  EClass getPackageDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.PackageDefinition#getPackageSpecification <em>Package Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Package Specification</em>'.
   * @see org.xtext.ada2005.adb.PackageDefinition#getPackageSpecification()
   * @see #getPackageDefinition()
   * @generated
   */
  EReference getPackageDefinition_PackageSpecification();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.Renaming <em>Renaming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Renaming</em>'.
   * @see org.xtext.ada2005.adb.Renaming
   * @generated
   */
  EClass getRenaming();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.Renaming#getRenamed <em>Renamed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Renamed</em>'.
   * @see org.xtext.ada2005.adb.Renaming#getRenamed()
   * @see #getRenaming()
   * @generated
   */
  EAttribute getRenaming_Renamed();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.GenericDeclaration <em>Generic Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic Declaration</em>'.
   * @see org.xtext.ada2005.adb.GenericDeclaration
   * @generated
   */
  EClass getGenericDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.GenericDeclaration#getGenericItems <em>Generic Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Generic Items</em>'.
   * @see org.xtext.ada2005.adb.GenericDeclaration#getGenericItems()
   * @see #getGenericDeclaration()
   * @generated
   */
  EReference getGenericDeclaration_GenericItems();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.GenericDeclaration#getLibrarySpecification <em>Library Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Library Specification</em>'.
   * @see org.xtext.ada2005.adb.GenericDeclaration#getLibrarySpecification()
   * @see #getGenericDeclaration()
   * @generated
   */
  EReference getGenericDeclaration_LibrarySpecification();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.GenericInstantiation <em>Generic Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic Instantiation</em>'.
   * @see org.xtext.ada2005.adb.GenericInstantiation
   * @generated
   */
  EClass getGenericInstantiation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.GenericInstantiation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.GenericInstantiation#getName()
   * @see #getGenericInstantiation()
   * @generated
   */
  EAttribute getGenericInstantiation_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.GenericInstantiation#getGenericName <em>Generic Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generic Name</em>'.
   * @see org.xtext.ada2005.adb.GenericInstantiation#getGenericName()
   * @see #getGenericInstantiation()
   * @generated
   */
  EAttribute getGenericInstantiation_GenericName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.GenericInstantiation#getOverriding <em>Overriding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Overriding</em>'.
   * @see org.xtext.ada2005.adb.GenericInstantiation#getOverriding()
   * @see #getGenericInstantiation()
   * @generated
   */
  EReference getGenericInstantiation_Overriding();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.GenericInstantiation#getGenericActualPart <em>Generic Actual Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Generic Actual Part</em>'.
   * @see org.xtext.ada2005.adb.GenericInstantiation#getGenericActualPart()
   * @see #getGenericInstantiation()
   * @generated
   */
  EReference getGenericInstantiation_GenericActualPart();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.PackageSpecification <em>Package Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Specification</em>'.
   * @see org.xtext.ada2005.adb.PackageSpecification
   * @generated
   */
  EClass getPackageSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.PackageSpecification#getPublicBasicDeclarativeItems <em>Public Basic Declarative Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Public Basic Declarative Items</em>'.
   * @see org.xtext.ada2005.adb.PackageSpecification#getPublicBasicDeclarativeItems()
   * @see #getPackageSpecification()
   * @generated
   */
  EReference getPackageSpecification_PublicBasicDeclarativeItems();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.PackageSpecification#getPrivateBasicDeclarativeItems <em>Private Basic Declarative Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Private Basic Declarative Items</em>'.
   * @see org.xtext.ada2005.adb.PackageSpecification#getPrivateBasicDeclarativeItems()
   * @see #getPackageSpecification()
   * @generated
   */
  EReference getPackageSpecification_PrivateBasicDeclarativeItems();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.PackageSpecification#getEndname <em>Endname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Endname</em>'.
   * @see org.xtext.ada2005.adb.PackageSpecification#getEndname()
   * @see #getPackageSpecification()
   * @generated
   */
  EAttribute getPackageSpecification_Endname();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.SubprogramBody <em>Subprogram Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subprogram Body</em>'.
   * @see org.xtext.ada2005.adb.SubprogramBody
   * @generated
   */
  EClass getSubprogramBody();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.SubprogramBody#getSubprogramSpecification <em>Subprogram Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subprogram Specification</em>'.
   * @see org.xtext.ada2005.adb.SubprogramBody#getSubprogramSpecification()
   * @see #getSubprogramBody()
   * @generated
   */
  EReference getSubprogramBody_SubprogramSpecification();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.SubprogramBody#getEndname <em>Endname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Endname</em>'.
   * @see org.xtext.ada2005.adb.SubprogramBody#getEndname()
   * @see #getSubprogramBody()
   * @generated
   */
  EAttribute getSubprogramBody_Endname();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.DeclarativeBlock <em>Declarative Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declarative Block</em>'.
   * @see org.xtext.ada2005.adb.DeclarativeBlock
   * @generated
   */
  EClass getDeclarativeBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.DeclarativeBlock#getDeclarativeItems <em>Declarative Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarative Items</em>'.
   * @see org.xtext.ada2005.adb.DeclarativeBlock#getDeclarativeItems()
   * @see #getDeclarativeBlock()
   * @generated
   */
  EReference getDeclarativeBlock_DeclarativeItems();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.DeclarativeBlock#getHandledSequenceOfStatements <em>Handled Sequence Of Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Handled Sequence Of Statements</em>'.
   * @see org.xtext.ada2005.adb.DeclarativeBlock#getHandledSequenceOfStatements()
   * @see #getDeclarativeBlock()
   * @generated
   */
  EReference getDeclarativeBlock_HandledSequenceOfStatements();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.BasicDeclarativeItem <em>Basic Declarative Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Declarative Item</em>'.
   * @see org.xtext.ada2005.adb.BasicDeclarativeItem
   * @generated
   */
  EClass getBasicDeclarativeItem();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.BasicDeclaration <em>Basic Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Declaration</em>'.
   * @see org.xtext.ada2005.adb.BasicDeclaration
   * @generated
   */
  EClass getBasicDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.TaskDeclaration <em>Task Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Declaration</em>'.
   * @see org.xtext.ada2005.adb.TaskDeclaration
   * @generated
   */
  EClass getTaskDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.TaskDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.TaskDeclaration#getName()
   * @see #getTaskDeclaration()
   * @generated
   */
  EAttribute getTaskDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.TaskDeclaration#getKnownDiscriminantPart <em>Known Discriminant Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Known Discriminant Part</em>'.
   * @see org.xtext.ada2005.adb.TaskDeclaration#getKnownDiscriminantPart()
   * @see #getTaskDeclaration()
   * @generated
   */
  EReference getTaskDeclaration_KnownDiscriminantPart();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.TaskDeclaration#getInterfaceList <em>Interface List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface List</em>'.
   * @see org.xtext.ada2005.adb.TaskDeclaration#getInterfaceList()
   * @see #getTaskDeclaration()
   * @generated
   */
  EReference getTaskDeclaration_InterfaceList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.TaskDeclaration#getTaskDefinition <em>Task Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Task Definition</em>'.
   * @see org.xtext.ada2005.adb.TaskDeclaration#getTaskDefinition()
   * @see #getTaskDeclaration()
   * @generated
   */
  EReference getTaskDeclaration_TaskDefinition();

  /**
   * Returns the meta object for the reference '{@link org.xtext.ada2005.adb.TaskDeclaration#getEndid <em>Endid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Endid</em>'.
   * @see org.xtext.ada2005.adb.TaskDeclaration#getEndid()
   * @see #getTaskDeclaration()
   * @generated
   */
  EReference getTaskDeclaration_Endid();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.TypeDeclaration <em>Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Declaration</em>'.
   * @see org.xtext.ada2005.adb.TypeDeclaration
   * @generated
   */
  EClass getTypeDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.TypeDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.TypeDeclaration#getName()
   * @see #getTypeDeclaration()
   * @generated
   */
  EAttribute getTypeDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.NewTypeDeclaration <em>New Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Type Declaration</em>'.
   * @see org.xtext.ada2005.adb.NewTypeDeclaration
   * @generated
   */
  EClass getNewTypeDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.FullTypeDeclaration <em>Full Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Full Type Declaration</em>'.
   * @see org.xtext.ada2005.adb.FullTypeDeclaration
   * @generated
   */
  EClass getFullTypeDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.FullTypeDeclaration#getKnownDiscriminantPart <em>Known Discriminant Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Known Discriminant Part</em>'.
   * @see org.xtext.ada2005.adb.FullTypeDeclaration#getKnownDiscriminantPart()
   * @see #getFullTypeDeclaration()
   * @generated
   */
  EReference getFullTypeDeclaration_KnownDiscriminantPart();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.FullDataTypeDeclaration <em>Full Data Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Full Data Type Declaration</em>'.
   * @see org.xtext.ada2005.adb.FullDataTypeDeclaration
   * @generated
   */
  EClass getFullDataTypeDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.FullDataTypeDeclaration#getTypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Definition</em>'.
   * @see org.xtext.ada2005.adb.FullDataTypeDeclaration#getTypeDefinition()
   * @see #getFullDataTypeDeclaration()
   * @generated
   */
  EReference getFullDataTypeDeclaration_TypeDefinition();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.IncompleteTypeDeclaration <em>Incomplete Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Incomplete Type Declaration</em>'.
   * @see org.xtext.ada2005.adb.IncompleteTypeDeclaration
   * @generated
   */
  EClass getIncompleteTypeDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.IncompleteTypeDeclaration#getDiscriminantPart <em>Discriminant Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Discriminant Part</em>'.
   * @see org.xtext.ada2005.adb.IncompleteTypeDeclaration#getDiscriminantPart()
   * @see #getIncompleteTypeDeclaration()
   * @generated
   */
  EReference getIncompleteTypeDeclaration_DiscriminantPart();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.IncompleteTypeDeclaration#isTagged <em>Tagged</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tagged</em>'.
   * @see org.xtext.ada2005.adb.IncompleteTypeDeclaration#isTagged()
   * @see #getIncompleteTypeDeclaration()
   * @generated
   */
  EAttribute getIncompleteTypeDeclaration_Tagged();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.PrivateTypeDeclaration <em>Private Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Private Type Declaration</em>'.
   * @see org.xtext.ada2005.adb.PrivateTypeDeclaration
   * @generated
   */
  EClass getPrivateTypeDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.PrivateTypeDeclaration#getDiscriminantPart <em>Discriminant Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Discriminant Part</em>'.
   * @see org.xtext.ada2005.adb.PrivateTypeDeclaration#getDiscriminantPart()
   * @see #getPrivateTypeDeclaration()
   * @generated
   */
  EReference getPrivateTypeDeclaration_DiscriminantPart();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.PrivateTypeDeclaration#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.xtext.ada2005.adb.PrivateTypeDeclaration#isAbstract()
   * @see #getPrivateTypeDeclaration()
   * @generated
   */
  EAttribute getPrivateTypeDeclaration_Abstract();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.PrivateTypeDeclaration#isTagged <em>Tagged</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tagged</em>'.
   * @see org.xtext.ada2005.adb.PrivateTypeDeclaration#isTagged()
   * @see #getPrivateTypeDeclaration()
   * @generated
   */
  EAttribute getPrivateTypeDeclaration_Tagged();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.PrivateTypeDeclaration#isLimited <em>Limited</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Limited</em>'.
   * @see org.xtext.ada2005.adb.PrivateTypeDeclaration#isLimited()
   * @see #getPrivateTypeDeclaration()
   * @generated
   */
  EAttribute getPrivateTypeDeclaration_Limited();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.PrivateExtensionDeclaration <em>Private Extension Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Private Extension Declaration</em>'.
   * @see org.xtext.ada2005.adb.PrivateExtensionDeclaration
   * @generated
   */
  EClass getPrivateExtensionDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.PrivateExtensionDeclaration#getDiscriminantPart <em>Discriminant Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Discriminant Part</em>'.
   * @see org.xtext.ada2005.adb.PrivateExtensionDeclaration#getDiscriminantPart()
   * @see #getPrivateExtensionDeclaration()
   * @generated
   */
  EReference getPrivateExtensionDeclaration_DiscriminantPart();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.PrivateExtensionDeclaration#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.xtext.ada2005.adb.PrivateExtensionDeclaration#isAbstract()
   * @see #getPrivateExtensionDeclaration()
   * @generated
   */
  EAttribute getPrivateExtensionDeclaration_Abstract();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.PrivateExtensionDeclaration#isLimited <em>Limited</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Limited</em>'.
   * @see org.xtext.ada2005.adb.PrivateExtensionDeclaration#isLimited()
   * @see #getPrivateExtensionDeclaration()
   * @generated
   */
  EAttribute getPrivateExtensionDeclaration_Limited();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.PrivateExtensionDeclaration#isSynchronized <em>Synchronized</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Synchronized</em>'.
   * @see org.xtext.ada2005.adb.PrivateExtensionDeclaration#isSynchronized()
   * @see #getPrivateExtensionDeclaration()
   * @generated
   */
  EAttribute getPrivateExtensionDeclaration_Synchronized();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.PrivateExtensionDeclaration#getAncestorSubtypeIndication <em>Ancestor Subtype Indication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ancestor Subtype Indication</em>'.
   * @see org.xtext.ada2005.adb.PrivateExtensionDeclaration#getAncestorSubtypeIndication()
   * @see #getPrivateExtensionDeclaration()
   * @generated
   */
  EReference getPrivateExtensionDeclaration_AncestorSubtypeIndication();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.PrivateExtensionDeclaration#getInterfaceList <em>Interface List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface List</em>'.
   * @see org.xtext.ada2005.adb.PrivateExtensionDeclaration#getInterfaceList()
   * @see #getPrivateExtensionDeclaration()
   * @generated
   */
  EReference getPrivateExtensionDeclaration_InterfaceList();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.TaskItem <em>Task Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Item</em>'.
   * @see org.xtext.ada2005.adb.TaskItem
   * @generated
   */
  EClass getTaskItem();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.EntryDeclaration <em>Entry Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry Declaration</em>'.
   * @see org.xtext.ada2005.adb.EntryDeclaration
   * @generated
   */
  EClass getEntryDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.EntryDeclaration#getOverriding <em>Overriding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Overriding</em>'.
   * @see org.xtext.ada2005.adb.EntryDeclaration#getOverriding()
   * @see #getEntryDeclaration()
   * @generated
   */
  EReference getEntryDeclaration_Overriding();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.EntryDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.EntryDeclaration#getName()
   * @see #getEntryDeclaration()
   * @generated
   */
  EAttribute getEntryDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.EntryDeclaration#getDiscreteSubtypeDefinition <em>Discrete Subtype Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Discrete Subtype Definition</em>'.
   * @see org.xtext.ada2005.adb.EntryDeclaration#getDiscreteSubtypeDefinition()
   * @see #getEntryDeclaration()
   * @generated
   */
  EReference getEntryDeclaration_DiscreteSubtypeDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.EntryDeclaration#getFormalPart <em>Formal Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal Part</em>'.
   * @see org.xtext.ada2005.adb.EntryDeclaration#getFormalPart()
   * @see #getEntryDeclaration()
   * @generated
   */
  EReference getEntryDeclaration_FormalPart();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.OverridingIndicator <em>Overriding Indicator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Overriding Indicator</em>'.
   * @see org.xtext.ada2005.adb.OverridingIndicator
   * @generated
   */
  EClass getOverridingIndicator();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.OverridingIndicator#isNot <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not</em>'.
   * @see org.xtext.ada2005.adb.OverridingIndicator#isNot()
   * @see #getOverridingIndicator()
   * @generated
   */
  EAttribute getOverridingIndicator_Not();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ProtectedTypeDeclaration <em>Protected Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protected Type Declaration</em>'.
   * @see org.xtext.ada2005.adb.ProtectedTypeDeclaration
   * @generated
   */
  EClass getProtectedTypeDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ProtectedTypeDeclaration#getInterfaceList <em>Interface List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface List</em>'.
   * @see org.xtext.ada2005.adb.ProtectedTypeDeclaration#getInterfaceList()
   * @see #getProtectedTypeDeclaration()
   * @generated
   */
  EReference getProtectedTypeDeclaration_InterfaceList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ProtectedTypeDeclaration#getProtectedDefinition <em>Protected Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Protected Definition</em>'.
   * @see org.xtext.ada2005.adb.ProtectedTypeDeclaration#getProtectedDefinition()
   * @see #getProtectedTypeDeclaration()
   * @generated
   */
  EReference getProtectedTypeDeclaration_ProtectedDefinition();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ProtectedDefinition <em>Protected Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protected Definition</em>'.
   * @see org.xtext.ada2005.adb.ProtectedDefinition
   * @generated
   */
  EClass getProtectedDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.ProtectedDefinition#getProtectedOperationDeclaration <em>Protected Operation Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Protected Operation Declaration</em>'.
   * @see org.xtext.ada2005.adb.ProtectedDefinition#getProtectedOperationDeclaration()
   * @see #getProtectedDefinition()
   * @generated
   */
  EReference getProtectedDefinition_ProtectedOperationDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ProtectedElementDeclaration <em>Protected Element Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protected Element Declaration</em>'.
   * @see org.xtext.ada2005.adb.ProtectedElementDeclaration
   * @generated
   */
  EClass getProtectedElementDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ProtectedOperationDeclaration <em>Protected Operation Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protected Operation Declaration</em>'.
   * @see org.xtext.ada2005.adb.ProtectedOperationDeclaration
   * @generated
   */
  EClass getProtectedOperationDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.SubprogramDeclaration <em>Subprogram Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subprogram Declaration</em>'.
   * @see org.xtext.ada2005.adb.SubprogramDeclaration
   * @generated
   */
  EClass getSubprogramDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.SubprogramDeclaration#getSubprogramSpecification <em>Subprogram Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subprogram Specification</em>'.
   * @see org.xtext.ada2005.adb.SubprogramDeclaration#getSubprogramSpecification()
   * @see #getSubprogramDeclaration()
   * @generated
   */
  EReference getSubprogramDeclaration_SubprogramSpecification();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.SubprogramDeclaration#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.xtext.ada2005.adb.SubprogramDeclaration#isAbstract()
   * @see #getSubprogramDeclaration()
   * @generated
   */
  EAttribute getSubprogramDeclaration_Abstract();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.SubprogramDeclaration#getRenamedName <em>Renamed Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Renamed Name</em>'.
   * @see org.xtext.ada2005.adb.SubprogramDeclaration#getRenamedName()
   * @see #getSubprogramDeclaration()
   * @generated
   */
  EAttribute getSubprogramDeclaration_RenamedName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.SubprogramDeclaration#isNull <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Null</em>'.
   * @see org.xtext.ada2005.adb.SubprogramDeclaration#isNull()
   * @see #getSubprogramDeclaration()
   * @generated
   */
  EAttribute getSubprogramDeclaration_Null();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.SubprogramSpecification <em>Subprogram Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subprogram Specification</em>'.
   * @see org.xtext.ada2005.adb.SubprogramSpecification
   * @generated
   */
  EClass getSubprogramSpecification();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.SubprogramSpecification#getOverridingIndicator <em>Overriding Indicator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Overriding Indicator</em>'.
   * @see org.xtext.ada2005.adb.SubprogramSpecification#getOverridingIndicator()
   * @see #getSubprogramSpecification()
   * @generated
   */
  EReference getSubprogramSpecification_OverridingIndicator();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ProcedureSpecification <em>Procedure Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Specification</em>'.
   * @see org.xtext.ada2005.adb.ProcedureSpecification
   * @generated
   */
  EClass getProcedureSpecification();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ProcedureSpecification#getFormalPart <em>Formal Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal Part</em>'.
   * @see org.xtext.ada2005.adb.ProcedureSpecification#getFormalPart()
   * @see #getProcedureSpecification()
   * @generated
   */
  EReference getProcedureSpecification_FormalPart();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.FunctionSpecification <em>Function Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Specification</em>'.
   * @see org.xtext.ada2005.adb.FunctionSpecification
   * @generated
   */
  EClass getFunctionSpecification();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.FunctionSpecification#getParameterAndResultProfile <em>Parameter And Result Profile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter And Result Profile</em>'.
   * @see org.xtext.ada2005.adb.FunctionSpecification#getParameterAndResultProfile()
   * @see #getFunctionSpecification()
   * @generated
   */
  EReference getFunctionSpecification_ParameterAndResultProfile();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.HandledSequenceOfStatements <em>Handled Sequence Of Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Handled Sequence Of Statements</em>'.
   * @see org.xtext.ada2005.adb.HandledSequenceOfStatements
   * @generated
   */
  EClass getHandledSequenceOfStatements();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ExceptionChoice <em>Exception Choice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exception Choice</em>'.
   * @see org.xtext.ada2005.adb.ExceptionChoice
   * @generated
   */
  EClass getExceptionChoice();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ExceptionChoice#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.ExceptionChoice#getName()
   * @see #getExceptionChoice()
   * @generated
   */
  EReference getExceptionChoice_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.ExceptionChoice#isOthers <em>Others</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Others</em>'.
   * @see org.xtext.ada2005.adb.ExceptionChoice#isOthers()
   * @see #getExceptionChoice()
   * @generated
   */
  EAttribute getExceptionChoice_Others();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ExceptionHandler <em>Exception Handler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exception Handler</em>'.
   * @see org.xtext.ada2005.adb.ExceptionHandler
   * @generated
   */
  EClass getExceptionHandler();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.ExceptionHandler#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.ExceptionHandler#getName()
   * @see #getExceptionHandler()
   * @generated
   */
  EAttribute getExceptionHandler_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.ExceptionHandler#getExceptionChoice <em>Exception Choice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exception Choice</em>'.
   * @see org.xtext.ada2005.adb.ExceptionHandler#getExceptionChoice()
   * @see #getExceptionHandler()
   * @generated
   */
  EReference getExceptionHandler_ExceptionChoice();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ExceptionHandler#getSequenceOfStatements <em>Sequence Of Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence Of Statements</em>'.
   * @see org.xtext.ada2005.adb.ExceptionHandler#getSequenceOfStatements()
   * @see #getExceptionHandler()
   * @generated
   */
  EReference getExceptionHandler_SequenceOfStatements();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.DeclarativeItem <em>Declarative Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declarative Item</em>'.
   * @see org.xtext.ada2005.adb.DeclarativeItem
   * @generated
   */
  EClass getDeclarativeItem();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body</em>'.
   * @see org.xtext.ada2005.adb.Body
   * @generated
   */
  EClass getBody();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ProperBody <em>Proper Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Proper Body</em>'.
   * @see org.xtext.ada2005.adb.ProperBody
   * @generated
   */
  EClass getProperBody();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see org.xtext.ada2005.adb.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.Label#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.xtext.ada2005.adb.Label#getIdentifier()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Identifier();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.SequenceOfStatements <em>Sequence Of Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Of Statements</em>'.
   * @see org.xtext.ada2005.adb.SequenceOfStatements
   * @generated
   */
  EClass getSequenceOfStatements();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.SequenceOfStatements#getExceptionHandler <em>Exception Handler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exception Handler</em>'.
   * @see org.xtext.ada2005.adb.SequenceOfStatements#getExceptionHandler()
   * @see #getSequenceOfStatements()
   * @generated
   */
  EReference getSequenceOfStatements_ExceptionHandler();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.SequenceOfStatements#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.ada2005.adb.SequenceOfStatements#getStatements()
   * @see #getSequenceOfStatements()
   * @generated
   */
  EReference getSequenceOfStatements_Statements();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.LabelisableStatement <em>Labelisable Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Labelisable Statement</em>'.
   * @see org.xtext.ada2005.adb.LabelisableStatement
   * @generated
   */
  EClass getLabelisableStatement();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.LabelisableStatement#getLabels <em>Labels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Labels</em>'.
   * @see org.xtext.ada2005.adb.LabelisableStatement#getLabels()
   * @see #getLabelisableStatement()
   * @generated
   */
  EReference getLabelisableStatement_Labels();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.LabelisableStatement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.ada2005.adb.LabelisableStatement#getStatement()
   * @see #getLabelisableStatement()
   * @generated
   */
  EReference getLabelisableStatement_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.xtext.ada2005.adb.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.SimpleStatement <em>Simple Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Statement</em>'.
   * @see org.xtext.ada2005.adb.SimpleStatement
   * @generated
   */
  EClass getSimpleStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.CompoundStatement <em>Compound Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compound Statement</em>'.
   * @see org.xtext.ada2005.adb.CompoundStatement
   * @generated
   */
  EClass getCompoundStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.NullStatement <em>Null Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Statement</em>'.
   * @see org.xtext.ada2005.adb.NullStatement
   * @generated
   */
  EClass getNullStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.NullStatement#isNull <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Null</em>'.
   * @see org.xtext.ada2005.adb.NullStatement#isNull()
   * @see #getNullStatement()
   * @generated
   */
  EAttribute getNullStatement_Null();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.LibrarySpecification <em>Library Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Library Specification</em>'.
   * @see org.xtext.ada2005.adb.LibrarySpecification
   * @generated
   */
  EClass getLibrarySpecification();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.GenericItems <em>Generic Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic Items</em>'.
   * @see org.xtext.ada2005.adb.GenericItems
   * @generated
   */
  EClass getGenericItems();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.GenericItems#getGenericItems <em>Generic Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Generic Items</em>'.
   * @see org.xtext.ada2005.adb.GenericItems#getGenericItems()
   * @see #getGenericItems()
   * @generated
   */
  EReference getGenericItems_GenericItems();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.GenericItem <em>Generic Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic Item</em>'.
   * @see org.xtext.ada2005.adb.GenericItem
   * @generated
   */
  EClass getGenericItem();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.GenericFormalParameterDeclaration <em>Generic Formal Parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic Formal Parameter Declaration</em>'.
   * @see org.xtext.ada2005.adb.GenericFormalParameterDeclaration
   * @generated
   */
  EClass getGenericFormalParameterDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.FormalObjectDeclaration <em>Formal Object Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Object Declaration</em>'.
   * @see org.xtext.ada2005.adb.FormalObjectDeclaration
   * @generated
   */
  EClass getFormalObjectDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.FormalObjectDeclaration#getIdList <em>Id List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id List</em>'.
   * @see org.xtext.ada2005.adb.FormalObjectDeclaration#getIdList()
   * @see #getFormalObjectDeclaration()
   * @generated
   */
  EReference getFormalObjectDeclaration_IdList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.FormalObjectDeclaration#getMode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mode</em>'.
   * @see org.xtext.ada2005.adb.FormalObjectDeclaration#getMode()
   * @see #getFormalObjectDeclaration()
   * @generated
   */
  EReference getFormalObjectDeclaration_Mode();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.FormalObjectDeclaration#getOptNullExclusion <em>Opt Null Exclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Opt Null Exclusion</em>'.
   * @see org.xtext.ada2005.adb.FormalObjectDeclaration#getOptNullExclusion()
   * @see #getFormalObjectDeclaration()
   * @generated
   */
  EReference getFormalObjectDeclaration_OptNullExclusion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.FormalObjectDeclaration#getSubtypeMark <em>Subtype Mark</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subtype Mark</em>'.
   * @see org.xtext.ada2005.adb.FormalObjectDeclaration#getSubtypeMark()
   * @see #getFormalObjectDeclaration()
   * @generated
   */
  EReference getFormalObjectDeclaration_SubtypeMark();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.FormalObjectDeclaration#getAnonymousAccessDefinition <em>Anonymous Access Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Anonymous Access Definition</em>'.
   * @see org.xtext.ada2005.adb.FormalObjectDeclaration#getAnonymousAccessDefinition()
   * @see #getFormalObjectDeclaration()
   * @generated
   */
  EReference getFormalObjectDeclaration_AnonymousAccessDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.FormalObjectDeclaration#getDefaultExpression <em>Default Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Expression</em>'.
   * @see org.xtext.ada2005.adb.FormalObjectDeclaration#getDefaultExpression()
   * @see #getFormalObjectDeclaration()
   * @generated
   */
  EReference getFormalObjectDeclaration_DefaultExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.FormalTypeDeclaration <em>Formal Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Type Declaration</em>'.
   * @see org.xtext.ada2005.adb.FormalTypeDeclaration
   * @generated
   */
  EClass getFormalTypeDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.FormalTypeDeclaration#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.xtext.ada2005.adb.FormalTypeDeclaration#getIdentifier()
   * @see #getFormalTypeDeclaration()
   * @generated
   */
  EAttribute getFormalTypeDeclaration_Identifier();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.FormalTypeDeclaration#getDiscriminantPart <em>Discriminant Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Discriminant Part</em>'.
   * @see org.xtext.ada2005.adb.FormalTypeDeclaration#getDiscriminantPart()
   * @see #getFormalTypeDeclaration()
   * @generated
   */
  EReference getFormalTypeDeclaration_DiscriminantPart();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.FormalTypeDeclaration#getFormalTypeDefinition <em>Formal Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal Type Definition</em>'.
   * @see org.xtext.ada2005.adb.FormalTypeDeclaration#getFormalTypeDefinition()
   * @see #getFormalTypeDeclaration()
   * @generated
   */
  EReference getFormalTypeDeclaration_FormalTypeDefinition();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.FormalTypeDefinition <em>Formal Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Type Definition</em>'.
   * @see org.xtext.ada2005.adb.FormalTypeDefinition
   * @generated
   */
  EClass getFormalTypeDefinition();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.FormalPrivateTypeDefinition <em>Formal Private Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Private Type Definition</em>'.
   * @see org.xtext.ada2005.adb.FormalPrivateTypeDefinition
   * @generated
   */
  EClass getFormalPrivateTypeDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.FormalPrivateTypeDefinition#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.xtext.ada2005.adb.FormalPrivateTypeDefinition#isAbstract()
   * @see #getFormalPrivateTypeDefinition()
   * @generated
   */
  EAttribute getFormalPrivateTypeDefinition_Abstract();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.FormalPrivateTypeDefinition#isTagged <em>Tagged</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tagged</em>'.
   * @see org.xtext.ada2005.adb.FormalPrivateTypeDefinition#isTagged()
   * @see #getFormalPrivateTypeDefinition()
   * @generated
   */
  EAttribute getFormalPrivateTypeDefinition_Tagged();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.FormalPrivateTypeDefinition#isLimited <em>Limited</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Limited</em>'.
   * @see org.xtext.ada2005.adb.FormalPrivateTypeDefinition#isLimited()
   * @see #getFormalPrivateTypeDefinition()
   * @generated
   */
  EAttribute getFormalPrivateTypeDefinition_Limited();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.FormalDerivedTypeDefinition <em>Formal Derived Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Derived Type Definition</em>'.
   * @see org.xtext.ada2005.adb.FormalDerivedTypeDefinition
   * @generated
   */
  EClass getFormalDerivedTypeDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.FormalDerivedTypeDefinition#getAbsract <em>Absract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Absract</em>'.
   * @see org.xtext.ada2005.adb.FormalDerivedTypeDefinition#getAbsract()
   * @see #getFormalDerivedTypeDefinition()
   * @generated
   */
  EAttribute getFormalDerivedTypeDefinition_Absract();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.FormalDerivedTypeDefinition#isLimited <em>Limited</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Limited</em>'.
   * @see org.xtext.ada2005.adb.FormalDerivedTypeDefinition#isLimited()
   * @see #getFormalDerivedTypeDefinition()
   * @generated
   */
  EAttribute getFormalDerivedTypeDefinition_Limited();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.FormalDerivedTypeDefinition#isSynchronized <em>Synchronized</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Synchronized</em>'.
   * @see org.xtext.ada2005.adb.FormalDerivedTypeDefinition#isSynchronized()
   * @see #getFormalDerivedTypeDefinition()
   * @generated
   */
  EAttribute getFormalDerivedTypeDefinition_Synchronized();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.FormalDerivedTypeDefinition#getSubtypeMark <em>Subtype Mark</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subtype Mark</em>'.
   * @see org.xtext.ada2005.adb.FormalDerivedTypeDefinition#getSubtypeMark()
   * @see #getFormalDerivedTypeDefinition()
   * @generated
   */
  EReference getFormalDerivedTypeDefinition_SubtypeMark();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.FormalDerivedTypeDefinition#getInterfaceList <em>Interface List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface List</em>'.
   * @see org.xtext.ada2005.adb.FormalDerivedTypeDefinition#getInterfaceList()
   * @see #getFormalDerivedTypeDefinition()
   * @generated
   */
  EReference getFormalDerivedTypeDefinition_InterfaceList();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.FormalSubprogramDeclaration <em>Formal Subprogram Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Subprogram Declaration</em>'.
   * @see org.xtext.ada2005.adb.FormalSubprogramDeclaration
   * @generated
   */
  EClass getFormalSubprogramDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.FormalSubprogramDeclaration#getSubprogramSpecification <em>Subprogram Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subprogram Specification</em>'.
   * @see org.xtext.ada2005.adb.FormalSubprogramDeclaration#getSubprogramSpecification()
   * @see #getFormalSubprogramDeclaration()
   * @generated
   */
  EReference getFormalSubprogramDeclaration_SubprogramSpecification();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.FormalSubprogramDeclaration#getAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.xtext.ada2005.adb.FormalSubprogramDeclaration#getAbstract()
   * @see #getFormalSubprogramDeclaration()
   * @generated
   */
  EAttribute getFormalSubprogramDeclaration_Abstract();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.FormalSubprogramDeclaration#getSubprogramDefault <em>Subprogram Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subprogram Default</em>'.
   * @see org.xtext.ada2005.adb.FormalSubprogramDeclaration#getSubprogramDefault()
   * @see #getFormalSubprogramDeclaration()
   * @generated
   */
  EReference getFormalSubprogramDeclaration_SubprogramDefault();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.SubprogramDefault <em>Subprogram Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subprogram Default</em>'.
   * @see org.xtext.ada2005.adb.SubprogramDefault
   * @generated
   */
  EClass getSubprogramDefault();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.SubprogramDefault#getDefaultName <em>Default Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Name</em>'.
   * @see org.xtext.ada2005.adb.SubprogramDefault#getDefaultName()
   * @see #getSubprogramDefault()
   * @generated
   */
  EAttribute getSubprogramDefault_DefaultName();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.FormalPackageDeclaration <em>Formal Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Package Declaration</em>'.
   * @see org.xtext.ada2005.adb.FormalPackageDeclaration
   * @generated
   */
  EClass getFormalPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.FormalPackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.FormalPackageDeclaration#getName()
   * @see #getFormalPackageDeclaration()
   * @generated
   */
  EAttribute getFormalPackageDeclaration_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.FormalPackageDeclaration#getGenericPackageName <em>Generic Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generic Package Name</em>'.
   * @see org.xtext.ada2005.adb.FormalPackageDeclaration#getGenericPackageName()
   * @see #getFormalPackageDeclaration()
   * @generated
   */
  EAttribute getFormalPackageDeclaration_GenericPackageName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.FormalPackageDeclaration#getFormalPackageActualPart <em>Formal Package Actual Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal Package Actual Part</em>'.
   * @see org.xtext.ada2005.adb.FormalPackageDeclaration#getFormalPackageActualPart()
   * @see #getFormalPackageDeclaration()
   * @generated
   */
  EReference getFormalPackageDeclaration_FormalPackageActualPart();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.FormalPackageActualPart <em>Formal Package Actual Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Package Actual Part</em>'.
   * @see org.xtext.ada2005.adb.FormalPackageActualPart
   * @generated
   */
  EClass getFormalPackageActualPart();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.FormalPackageActualPart#isBox <em>Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Box</em>'.
   * @see org.xtext.ada2005.adb.FormalPackageActualPart#isBox()
   * @see #getFormalPackageActualPart()
   * @generated
   */
  EAttribute getFormalPackageActualPart_Box();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.FormalPackageActualPart#getGenericActualPart <em>Generic Actual Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Generic Actual Part</em>'.
   * @see org.xtext.ada2005.adb.FormalPackageActualPart#getGenericActualPart()
   * @see #getFormalPackageActualPart()
   * @generated
   */
  EReference getFormalPackageActualPart_GenericActualPart();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.FormalPackageActualPart#getFormalPackageAssociation <em>Formal Package Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Formal Package Association</em>'.
   * @see org.xtext.ada2005.adb.FormalPackageActualPart#getFormalPackageAssociation()
   * @see #getFormalPackageActualPart()
   * @generated
   */
  EReference getFormalPackageActualPart_FormalPackageAssociation();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.FormalPackageAssociation <em>Formal Package Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Package Association</em>'.
   * @see org.xtext.ada2005.adb.FormalPackageAssociation
   * @generated
   */
  EClass getFormalPackageAssociation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.FormalPackageAssociation#getGenericAssociation <em>Generic Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Generic Association</em>'.
   * @see org.xtext.ada2005.adb.FormalPackageAssociation#getGenericAssociation()
   * @see #getFormalPackageAssociation()
   * @generated
   */
  EReference getFormalPackageAssociation_GenericAssociation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.FormalPackageAssociation#getGenericFormalParameterSelectorName <em>Generic Formal Parameter Selector Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generic Formal Parameter Selector Name</em>'.
   * @see org.xtext.ada2005.adb.FormalPackageAssociation#getGenericFormalParameterSelectorName()
   * @see #getFormalPackageAssociation()
   * @generated
   */
  EAttribute getFormalPackageAssociation_GenericFormalParameterSelectorName();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ExceptionDeclaration <em>Exception Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exception Declaration</em>'.
   * @see org.xtext.ada2005.adb.ExceptionDeclaration
   * @generated
   */
  EClass getExceptionDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ExceptionDeclaration#getIdList <em>Id List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id List</em>'.
   * @see org.xtext.ada2005.adb.ExceptionDeclaration#getIdList()
   * @see #getExceptionDeclaration()
   * @generated
   */
  EReference getExceptionDeclaration_IdList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ExceptionDeclaration#getRenamedName <em>Renamed Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Renamed Name</em>'.
   * @see org.xtext.ada2005.adb.ExceptionDeclaration#getRenamedName()
   * @see #getExceptionDeclaration()
   * @generated
   */
  EReference getExceptionDeclaration_RenamedName();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ObjectDeclaration <em>Object Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Declaration</em>'.
   * @see org.xtext.ada2005.adb.ObjectDeclaration
   * @generated
   */
  EClass getObjectDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.DataInstanceDeclaration <em>Data Instance Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Instance Declaration</em>'.
   * @see org.xtext.ada2005.adb.DataInstanceDeclaration
   * @generated
   */
  EClass getDataInstanceDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.DataInstanceDeclaration#getDefiningIdentifierList <em>Defining Identifier List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Defining Identifier List</em>'.
   * @see org.xtext.ada2005.adb.DataInstanceDeclaration#getDefiningIdentifierList()
   * @see #getDataInstanceDeclaration()
   * @generated
   */
  EReference getDataInstanceDeclaration_DefiningIdentifierList();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.DataInstanceDeclaration#isAliased <em>Aliased</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aliased</em>'.
   * @see org.xtext.ada2005.adb.DataInstanceDeclaration#isAliased()
   * @see #getDataInstanceDeclaration()
   * @generated
   */
  EAttribute getDataInstanceDeclaration_Aliased();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.DataInstanceDeclaration#isConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constant</em>'.
   * @see org.xtext.ada2005.adb.DataInstanceDeclaration#isConstant()
   * @see #getDataInstanceDeclaration()
   * @generated
   */
  EAttribute getDataInstanceDeclaration_Constant();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.DataInstanceDeclaration#getSubtypeIndication <em>Subtype Indication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subtype Indication</em>'.
   * @see org.xtext.ada2005.adb.DataInstanceDeclaration#getSubtypeIndication()
   * @see #getDataInstanceDeclaration()
   * @generated
   */
  EReference getDataInstanceDeclaration_SubtypeIndication();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.DataInstanceDeclaration#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.ada2005.adb.DataInstanceDeclaration#getExpression()
   * @see #getDataInstanceDeclaration()
   * @generated
   */
  EReference getDataInstanceDeclaration_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.DataInstanceDeclaration#getObjectName <em>Object Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Name</em>'.
   * @see org.xtext.ada2005.adb.DataInstanceDeclaration#getObjectName()
   * @see #getDataInstanceDeclaration()
   * @generated
   */
  EReference getDataInstanceDeclaration_ObjectName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.DataInstanceDeclaration#getAnonymousAccessDefinition <em>Anonymous Access Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Anonymous Access Definition</em>'.
   * @see org.xtext.ada2005.adb.DataInstanceDeclaration#getAnonymousAccessDefinition()
   * @see #getDataInstanceDeclaration()
   * @generated
   */
  EReference getDataInstanceDeclaration_AnonymousAccessDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.DataInstanceDeclaration#getArrayTypeDefinition <em>Array Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array Type Definition</em>'.
   * @see org.xtext.ada2005.adb.DataInstanceDeclaration#getArrayTypeDefinition()
   * @see #getDataInstanceDeclaration()
   * @generated
   */
  EReference getDataInstanceDeclaration_ArrayTypeDefinition();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.SingleProtectedDeclaration <em>Single Protected Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Protected Declaration</em>'.
   * @see org.xtext.ada2005.adb.SingleProtectedDeclaration
   * @generated
   */
  EClass getSingleProtectedDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.SingleProtectedDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.SingleProtectedDeclaration#getName()
   * @see #getSingleProtectedDeclaration()
   * @generated
   */
  EAttribute getSingleProtectedDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.SingleProtectedDeclaration#getInterfaceList <em>Interface List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface List</em>'.
   * @see org.xtext.ada2005.adb.SingleProtectedDeclaration#getInterfaceList()
   * @see #getSingleProtectedDeclaration()
   * @generated
   */
  EReference getSingleProtectedDeclaration_InterfaceList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.SingleProtectedDeclaration#getProtectedDefinition <em>Protected Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Protected Definition</em>'.
   * @see org.xtext.ada2005.adb.SingleProtectedDeclaration#getProtectedDefinition()
   * @see #getSingleProtectedDeclaration()
   * @generated
   */
  EReference getSingleProtectedDeclaration_ProtectedDefinition();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.Pragma <em>Pragma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pragma</em>'.
   * @see org.xtext.ada2005.adb.Pragma
   * @generated
   */
  EClass getPragma();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.Pragma#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.Pragma#getName()
   * @see #getPragma()
   * @generated
   */
  EAttribute getPragma_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.Pragma#getPragmaArgumentAssociation <em>Pragma Argument Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pragma Argument Association</em>'.
   * @see org.xtext.ada2005.adb.Pragma#getPragmaArgumentAssociation()
   * @see #getPragma()
   * @generated
   */
  EReference getPragma_PragmaArgumentAssociation();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.PragmaArgumentAssociation <em>Pragma Argument Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pragma Argument Association</em>'.
   * @see org.xtext.ada2005.adb.PragmaArgumentAssociation
   * @generated
   */
  EClass getPragmaArgumentAssociation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.PragmaArgumentAssociation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.PragmaArgumentAssociation#getName()
   * @see #getPragmaArgumentAssociation()
   * @generated
   */
  EAttribute getPragmaArgumentAssociation_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.PragmaArgumentAssociation#getEffectiveArgument <em>Effective Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Effective Argument</em>'.
   * @see org.xtext.ada2005.adb.PragmaArgumentAssociation#getEffectiveArgument()
   * @see #getPragmaArgumentAssociation()
   * @generated
   */
  EReference getPragmaArgumentAssociation_EffectiveArgument();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.SubtypeDeclaration <em>Subtype Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subtype Declaration</em>'.
   * @see org.xtext.ada2005.adb.SubtypeDeclaration
   * @generated
   */
  EClass getSubtypeDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.SubtypeDeclaration#getSubtypeIndication <em>Subtype Indication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subtype Indication</em>'.
   * @see org.xtext.ada2005.adb.SubtypeDeclaration#getSubtypeIndication()
   * @see #getSubtypeDeclaration()
   * @generated
   */
  EReference getSubtypeDeclaration_SubtypeIndication();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.NumberDeclaration <em>Number Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Declaration</em>'.
   * @see org.xtext.ada2005.adb.NumberDeclaration
   * @generated
   */
  EClass getNumberDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.NumberDeclaration#getIdList <em>Id List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id List</em>'.
   * @see org.xtext.ada2005.adb.NumberDeclaration#getIdList()
   * @see #getNumberDeclaration()
   * @generated
   */
  EReference getNumberDeclaration_IdList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.NumberDeclaration#getStaticExpression <em>Static Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Static Expression</em>'.
   * @see org.xtext.ada2005.adb.NumberDeclaration#getStaticExpression()
   * @see #getNumberDeclaration()
   * @generated
   */
  EReference getNumberDeclaration_StaticExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.AssignmentStatement <em>Assignment Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Statement</em>'.
   * @see org.xtext.ada2005.adb.AssignmentStatement
   * @generated
   */
  EClass getAssignmentStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.AssignmentStatement#getVariableName <em>Variable Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Name</em>'.
   * @see org.xtext.ada2005.adb.AssignmentStatement#getVariableName()
   * @see #getAssignmentStatement()
   * @generated
   */
  EReference getAssignmentStatement_VariableName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.AssignmentStatement#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial Value</em>'.
   * @see org.xtext.ada2005.adb.AssignmentStatement#getInitialValue()
   * @see #getAssignmentStatement()
   * @generated
   */
  EReference getAssignmentStatement_InitialValue();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Statement</em>'.
   * @see org.xtext.ada2005.adb.IfStatement
   * @generated
   */
  EClass getIfStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.IfStatement#getIfCondition <em>If Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Condition</em>'.
   * @see org.xtext.ada2005.adb.IfStatement#getIfCondition()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_IfCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.IfStatement#getThenStatements <em>Then Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Statements</em>'.
   * @see org.xtext.ada2005.adb.IfStatement#getThenStatements()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_ThenStatements();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.IfStatement#getElsifConditions <em>Elsif Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elsif Conditions</em>'.
   * @see org.xtext.ada2005.adb.IfStatement#getElsifConditions()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_ElsifConditions();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.IfStatement#getElsifStatements <em>Elsif Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elsif Statements</em>'.
   * @see org.xtext.ada2005.adb.IfStatement#getElsifStatements()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_ElsifStatements();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.IfStatement#getElseStatements <em>Else Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Statements</em>'.
   * @see org.xtext.ada2005.adb.IfStatement#getElseStatements()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_ElseStatements();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.CaseStatement <em>Case Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Statement</em>'.
   * @see org.xtext.ada2005.adb.CaseStatement
   * @generated
   */
  EClass getCaseStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.CaseStatement#getCaseValue <em>Case Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case Value</em>'.
   * @see org.xtext.ada2005.adb.CaseStatement#getCaseValue()
   * @see #getCaseStatement()
   * @generated
   */
  EReference getCaseStatement_CaseValue();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.CaseStatement#getCaseStatementAlternatives <em>Case Statement Alternatives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Case Statement Alternatives</em>'.
   * @see org.xtext.ada2005.adb.CaseStatement#getCaseStatementAlternatives()
   * @see #getCaseStatement()
   * @generated
   */
  EReference getCaseStatement_CaseStatementAlternatives();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.CaseStatementAlternative <em>Case Statement Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Statement Alternative</em>'.
   * @see org.xtext.ada2005.adb.CaseStatementAlternative
   * @generated
   */
  EClass getCaseStatementAlternative();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.CaseStatementAlternative#getDiscreteChoiceList <em>Discrete Choice List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Discrete Choice List</em>'.
   * @see org.xtext.ada2005.adb.CaseStatementAlternative#getDiscreteChoiceList()
   * @see #getCaseStatementAlternative()
   * @generated
   */
  EReference getCaseStatementAlternative_DiscreteChoiceList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.CaseStatementAlternative#getSequenceOfStatements <em>Sequence Of Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence Of Statements</em>'.
   * @see org.xtext.ada2005.adb.CaseStatementAlternative#getSequenceOfStatements()
   * @see #getCaseStatementAlternative()
   * @generated
   */
  EReference getCaseStatementAlternative_SequenceOfStatements();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.LoopStatement <em>Loop Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop Statement</em>'.
   * @see org.xtext.ada2005.adb.LoopStatement
   * @generated
   */
  EClass getLoopStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.LoopStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.LoopStatement#getName()
   * @see #getLoopStatement()
   * @generated
   */
  EAttribute getLoopStatement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.LoopStatement#getIterationScheme <em>Iteration Scheme</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Iteration Scheme</em>'.
   * @see org.xtext.ada2005.adb.LoopStatement#getIterationScheme()
   * @see #getLoopStatement()
   * @generated
   */
  EReference getLoopStatement_IterationScheme();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.LoopStatement#getSequenceOfStatements <em>Sequence Of Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence Of Statements</em>'.
   * @see org.xtext.ada2005.adb.LoopStatement#getSequenceOfStatements()
   * @see #getLoopStatement()
   * @generated
   */
  EReference getLoopStatement_SequenceOfStatements();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.LoopStatement#getSameName <em>Same Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Same Name</em>'.
   * @see org.xtext.ada2005.adb.LoopStatement#getSameName()
   * @see #getLoopStatement()
   * @generated
   */
  EAttribute getLoopStatement_SameName();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.IterationScheme <em>Iteration Scheme</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Iteration Scheme</em>'.
   * @see org.xtext.ada2005.adb.IterationScheme
   * @generated
   */
  EClass getIterationScheme();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.IterationScheme#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.xtext.ada2005.adb.IterationScheme#getCondition()
   * @see #getIterationScheme()
   * @generated
   */
  EReference getIterationScheme_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.IterationScheme#getIterationSpecification <em>Iteration Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Iteration Specification</em>'.
   * @see org.xtext.ada2005.adb.IterationScheme#getIterationSpecification()
   * @see #getIterationScheme()
   * @generated
   */
  EReference getIterationScheme_IterationSpecification();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.LoopParameterSpecification <em>Loop Parameter Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop Parameter Specification</em>'.
   * @see org.xtext.ada2005.adb.LoopParameterSpecification
   * @generated
   */
  EClass getLoopParameterSpecification();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.LoopParameterSpecification#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.xtext.ada2005.adb.LoopParameterSpecification#getIdentifier()
   * @see #getLoopParameterSpecification()
   * @generated
   */
  EAttribute getLoopParameterSpecification_Identifier();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.LoopParameterSpecification#getDiscreteSubtypeDefinition <em>Discrete Subtype Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Discrete Subtype Definition</em>'.
   * @see org.xtext.ada2005.adb.LoopParameterSpecification#getDiscreteSubtypeDefinition()
   * @see #getLoopParameterSpecification()
   * @generated
   */
  EReference getLoopParameterSpecification_DiscreteSubtypeDefinition();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.BlockStatement <em>Block Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Statement</em>'.
   * @see org.xtext.ada2005.adb.BlockStatement
   * @generated
   */
  EClass getBlockStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.BlockStatement#getBlockStatementIdentifier <em>Block Statement Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Block Statement Identifier</em>'.
   * @see org.xtext.ada2005.adb.BlockStatement#getBlockStatementIdentifier()
   * @see #getBlockStatement()
   * @generated
   */
  EAttribute getBlockStatement_BlockStatementIdentifier();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ExitStatement <em>Exit Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exit Statement</em>'.
   * @see org.xtext.ada2005.adb.ExitStatement
   * @generated
   */
  EClass getExitStatement();

  /**
   * Returns the meta object for the reference '{@link org.xtext.ada2005.adb.ExitStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.ExitStatement#getName()
   * @see #getExitStatement()
   * @generated
   */
  EReference getExitStatement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ExitStatement#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.xtext.ada2005.adb.ExitStatement#getCondition()
   * @see #getExitStatement()
   * @generated
   */
  EReference getExitStatement_Condition();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.GotoStatement <em>Goto Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goto Statement</em>'.
   * @see org.xtext.ada2005.adb.GotoStatement
   * @generated
   */
  EClass getGotoStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.GotoStatement#getLabelId <em>Label Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label Id</em>'.
   * @see org.xtext.ada2005.adb.GotoStatement#getLabelId()
   * @see #getGotoStatement()
   * @generated
   */
  EAttribute getGotoStatement_LabelId();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ProcedureOrEntryCallStatement <em>Procedure Or Entry Call Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Or Entry Call Statement</em>'.
   * @see org.xtext.ada2005.adb.ProcedureOrEntryCallStatement
   * @generated
   */
  EClass getProcedureOrEntryCallStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ProcedureOrEntryCallStatement#getCallee <em>Callee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Callee</em>'.
   * @see org.xtext.ada2005.adb.ProcedureOrEntryCallStatement#getCallee()
   * @see #getProcedureOrEntryCallStatement()
   * @generated
   */
  EReference getProcedureOrEntryCallStatement_Callee();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.SimpleReturnStatement <em>Simple Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Return Statement</em>'.
   * @see org.xtext.ada2005.adb.SimpleReturnStatement
   * @generated
   */
  EClass getSimpleReturnStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.SimpleReturnStatement#getReturnValue <em>Return Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Value</em>'.
   * @see org.xtext.ada2005.adb.SimpleReturnStatement#getReturnValue()
   * @see #getSimpleReturnStatement()
   * @generated
   */
  EReference getSimpleReturnStatement_ReturnValue();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ExtendedReturnStatement <em>Extended Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extended Return Statement</em>'.
   * @see org.xtext.ada2005.adb.ExtendedReturnStatement
   * @generated
   */
  EClass getExtendedReturnStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.ExtendedReturnStatement#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.xtext.ada2005.adb.ExtendedReturnStatement#getIdentifier()
   * @see #getExtendedReturnStatement()
   * @generated
   */
  EAttribute getExtendedReturnStatement_Identifier();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ExtendedReturnStatement#getReturnSubtype <em>Return Subtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Subtype</em>'.
   * @see org.xtext.ada2005.adb.ExtendedReturnStatement#getReturnSubtype()
   * @see #getExtendedReturnStatement()
   * @generated
   */
  EReference getExtendedReturnStatement_ReturnSubtype();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ExtendedReturnStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.ada2005.adb.ExtendedReturnStatement#getExpression()
   * @see #getExtendedReturnStatement()
   * @generated
   */
  EReference getExtendedReturnStatement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ExtendedReturnStatement#getHandledSequenceOfStatements <em>Handled Sequence Of Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Handled Sequence Of Statements</em>'.
   * @see org.xtext.ada2005.adb.ExtendedReturnStatement#getHandledSequenceOfStatements()
   * @see #getExtendedReturnStatement()
   * @generated
   */
  EReference getExtendedReturnStatement_HandledSequenceOfStatements();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ReturnSubtypeIndication <em>Return Subtype Indication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Subtype Indication</em>'.
   * @see org.xtext.ada2005.adb.ReturnSubtypeIndication
   * @generated
   */
  EClass getReturnSubtypeIndication();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.PackageBody <em>Package Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Body</em>'.
   * @see org.xtext.ada2005.adb.PackageBody
   * @generated
   */
  EClass getPackageBody();

  /**
   * Returns the meta object for the reference '{@link org.xtext.ada2005.adb.PackageBody#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.PackageBody#getName()
   * @see #getPackageBody()
   * @generated
   */
  EReference getPackageBody_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.ada2005.adb.PackageBody#getEndName <em>End Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>End Name</em>'.
   * @see org.xtext.ada2005.adb.PackageBody#getEndName()
   * @see #getPackageBody()
   * @generated
   */
  EReference getPackageBody_EndName();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.TaskDefinition <em>Task Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Definition</em>'.
   * @see org.xtext.ada2005.adb.TaskDefinition
   * @generated
   */
  EClass getTaskDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.TaskDefinition#getTaskItems <em>Task Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Task Items</em>'.
   * @see org.xtext.ada2005.adb.TaskDefinition#getTaskItems()
   * @see #getTaskDefinition()
   * @generated
   */
  EReference getTaskDefinition_TaskItems();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.TaskBody <em>Task Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Body</em>'.
   * @see org.xtext.ada2005.adb.TaskBody
   * @generated
   */
  EClass getTaskBody();

  /**
   * Returns the meta object for the reference '{@link org.xtext.ada2005.adb.TaskBody#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.TaskBody#getName()
   * @see #getTaskBody()
   * @generated
   */
  EReference getTaskBody_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.ada2005.adb.TaskBody#getEndId <em>End Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>End Id</em>'.
   * @see org.xtext.ada2005.adb.TaskBody#getEndId()
   * @see #getTaskBody()
   * @generated
   */
  EReference getTaskBody_EndId();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ProtectedBody <em>Protected Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protected Body</em>'.
   * @see org.xtext.ada2005.adb.ProtectedBody
   * @generated
   */
  EClass getProtectedBody();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.ProtectedBody#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.xtext.ada2005.adb.ProtectedBody#getIdentifier()
   * @see #getProtectedBody()
   * @generated
   */
  EAttribute getProtectedBody_Identifier();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.ProtectedBody#getProtectedOperationItem <em>Protected Operation Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Protected Operation Item</em>'.
   * @see org.xtext.ada2005.adb.ProtectedBody#getProtectedOperationItem()
   * @see #getProtectedBody()
   * @generated
   */
  EReference getProtectedBody_ProtectedOperationItem();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.ProtectedBody#getIdTask <em>Id Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id Task</em>'.
   * @see org.xtext.ada2005.adb.ProtectedBody#getIdTask()
   * @see #getProtectedBody()
   * @generated
   */
  EAttribute getProtectedBody_IdTask();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ProtectedOperationItem <em>Protected Operation Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protected Operation Item</em>'.
   * @see org.xtext.ada2005.adb.ProtectedOperationItem
   * @generated
   */
  EClass getProtectedOperationItem();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.AcceptStatement <em>Accept Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Accept Statement</em>'.
   * @see org.xtext.ada2005.adb.AcceptStatement
   * @generated
   */
  EClass getAcceptStatement();

  /**
   * Returns the meta object for the reference '{@link org.xtext.ada2005.adb.AcceptStatement#getEntryName <em>Entry Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entry Name</em>'.
   * @see org.xtext.ada2005.adb.AcceptStatement#getEntryName()
   * @see #getAcceptStatement()
   * @generated
   */
  EReference getAcceptStatement_EntryName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.AcceptStatement#getEntryIndex <em>Entry Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entry Index</em>'.
   * @see org.xtext.ada2005.adb.AcceptStatement#getEntryIndex()
   * @see #getAcceptStatement()
   * @generated
   */
  EReference getAcceptStatement_EntryIndex();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.AcceptStatement#getFormalPart <em>Formal Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal Part</em>'.
   * @see org.xtext.ada2005.adb.AcceptStatement#getFormalPart()
   * @see #getAcceptStatement()
   * @generated
   */
  EReference getAcceptStatement_FormalPart();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.AcceptStatement#getHandledSequenceOfStatements <em>Handled Sequence Of Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Handled Sequence Of Statements</em>'.
   * @see org.xtext.ada2005.adb.AcceptStatement#getHandledSequenceOfStatements()
   * @see #getAcceptStatement()
   * @generated
   */
  EReference getAcceptStatement_HandledSequenceOfStatements();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.AcceptStatement#getEntryidentifier <em>Entryidentifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Entryidentifier</em>'.
   * @see org.xtext.ada2005.adb.AcceptStatement#getEntryidentifier()
   * @see #getAcceptStatement()
   * @generated
   */
  EAttribute getAcceptStatement_Entryidentifier();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.EntryIndex <em>Entry Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry Index</em>'.
   * @see org.xtext.ada2005.adb.EntryIndex
   * @generated
   */
  EClass getEntryIndex();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.EntryBody <em>Entry Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry Body</em>'.
   * @see org.xtext.ada2005.adb.EntryBody
   * @generated
   */
  EClass getEntryBody();

  /**
   * Returns the meta object for the reference '{@link org.xtext.ada2005.adb.EntryBody#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.EntryBody#getName()
   * @see #getEntryBody()
   * @generated
   */
  EReference getEntryBody_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.EntryBody#getEntryBodyFormalPart <em>Entry Body Formal Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entry Body Formal Part</em>'.
   * @see org.xtext.ada2005.adb.EntryBody#getEntryBodyFormalPart()
   * @see #getEntryBody()
   * @generated
   */
  EReference getEntryBody_EntryBodyFormalPart();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.EntryBody#getEntryBarrier <em>Entry Barrier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entry Barrier</em>'.
   * @see org.xtext.ada2005.adb.EntryBody#getEntryBarrier()
   * @see #getEntryBody()
   * @generated
   */
  EReference getEntryBody_EntryBarrier();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.EntryBody#getEndid <em>Endid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Endid</em>'.
   * @see org.xtext.ada2005.adb.EntryBody#getEndid()
   * @see #getEntryBody()
   * @generated
   */
  EAttribute getEntryBody_Endid();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.EntryBodyFormalPart <em>Entry Body Formal Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry Body Formal Part</em>'.
   * @see org.xtext.ada2005.adb.EntryBodyFormalPart
   * @generated
   */
  EClass getEntryBodyFormalPart();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.EntryBodyFormalPart#getEntryIndexSpecification <em>Entry Index Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entry Index Specification</em>'.
   * @see org.xtext.ada2005.adb.EntryBodyFormalPart#getEntryIndexSpecification()
   * @see #getEntryBodyFormalPart()
   * @generated
   */
  EReference getEntryBodyFormalPart_EntryIndexSpecification();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.EntryBodyFormalPart#getFormalPart <em>Formal Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal Part</em>'.
   * @see org.xtext.ada2005.adb.EntryBodyFormalPart#getFormalPart()
   * @see #getEntryBodyFormalPart()
   * @generated
   */
  EReference getEntryBodyFormalPart_FormalPart();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.EntryBarrier <em>Entry Barrier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry Barrier</em>'.
   * @see org.xtext.ada2005.adb.EntryBarrier
   * @generated
   */
  EClass getEntryBarrier();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.EntryBarrier#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.xtext.ada2005.adb.EntryBarrier#getCondition()
   * @see #getEntryBarrier()
   * @generated
   */
  EReference getEntryBarrier_Condition();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.EntryIndexSpecification <em>Entry Index Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry Index Specification</em>'.
   * @see org.xtext.ada2005.adb.EntryIndexSpecification
   * @generated
   */
  EClass getEntryIndexSpecification();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.EntryIndexSpecification#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.EntryIndexSpecification#getName()
   * @see #getEntryIndexSpecification()
   * @generated
   */
  EAttribute getEntryIndexSpecification_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.EntryIndexSpecification#getDiscreteSubtypeDefinition <em>Discrete Subtype Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Discrete Subtype Definition</em>'.
   * @see org.xtext.ada2005.adb.EntryIndexSpecification#getDiscreteSubtypeDefinition()
   * @see #getEntryIndexSpecification()
   * @generated
   */
  EReference getEntryIndexSpecification_DiscreteSubtypeDefinition();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.RequeueStatement <em>Requeue Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requeue Statement</em>'.
   * @see org.xtext.ada2005.adb.RequeueStatement
   * @generated
   */
  EClass getRequeueStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.RequeueStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.RequeueStatement#getName()
   * @see #getRequeueStatement()
   * @generated
   */
  EReference getRequeueStatement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.RequeueStatement#isAbort <em>Abort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abort</em>'.
   * @see org.xtext.ada2005.adb.RequeueStatement#isAbort()
   * @see #getRequeueStatement()
   * @generated
   */
  EAttribute getRequeueStatement_Abort();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.DelayStatement <em>Delay Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delay Statement</em>'.
   * @see org.xtext.ada2005.adb.DelayStatement
   * @generated
   */
  EClass getDelayStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.DelayStatement#getUntil <em>Until</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Until</em>'.
   * @see org.xtext.ada2005.adb.DelayStatement#getUntil()
   * @see #getDelayStatement()
   * @generated
   */
  EAttribute getDelayStatement_Until();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.DelayStatement#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delay</em>'.
   * @see org.xtext.ada2005.adb.DelayStatement#getDelay()
   * @see #getDelayStatement()
   * @generated
   */
  EReference getDelayStatement_Delay();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.SelectStatement <em>Select Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Statement</em>'.
   * @see org.xtext.ada2005.adb.SelectStatement
   * @generated
   */
  EClass getSelectStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.SelectiveAccept <em>Selective Accept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selective Accept</em>'.
   * @see org.xtext.ada2005.adb.SelectiveAccept
   * @generated
   */
  EClass getSelectiveAccept();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.SelectiveAccept#getSelectguard <em>Selectguard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Selectguard</em>'.
   * @see org.xtext.ada2005.adb.SelectiveAccept#getSelectguard()
   * @see #getSelectiveAccept()
   * @generated
   */
  EReference getSelectiveAccept_Selectguard();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.SelectiveAccept#getSelectAlternative <em>Select Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select Alternative</em>'.
   * @see org.xtext.ada2005.adb.SelectiveAccept#getSelectAlternative()
   * @see #getSelectiveAccept()
   * @generated
   */
  EReference getSelectiveAccept_SelectAlternative();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.SelectiveAccept#getGuardedAlternatives <em>Guarded Alternatives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Guarded Alternatives</em>'.
   * @see org.xtext.ada2005.adb.SelectiveAccept#getGuardedAlternatives()
   * @see #getSelectiveAccept()
   * @generated
   */
  EReference getSelectiveAccept_GuardedAlternatives();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.SelectiveAccept#getElseStatements <em>Else Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Statements</em>'.
   * @see org.xtext.ada2005.adb.SelectiveAccept#getElseStatements()
   * @see #getSelectiveAccept()
   * @generated
   */
  EReference getSelectiveAccept_ElseStatements();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.GuardedAlternative <em>Guarded Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guarded Alternative</em>'.
   * @see org.xtext.ada2005.adb.GuardedAlternative
   * @generated
   */
  EClass getGuardedAlternative();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.GuardedAlternative#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see org.xtext.ada2005.adb.GuardedAlternative#getGuard()
   * @see #getGuardedAlternative()
   * @generated
   */
  EReference getGuardedAlternative_Guard();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.GuardedAlternative#getAlternative <em>Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alternative</em>'.
   * @see org.xtext.ada2005.adb.GuardedAlternative#getAlternative()
   * @see #getGuardedAlternative()
   * @generated
   */
  EReference getGuardedAlternative_Alternative();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.Guard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guard</em>'.
   * @see org.xtext.ada2005.adb.Guard
   * @generated
   */
  EClass getGuard();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.Guard#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.xtext.ada2005.adb.Guard#getCondition()
   * @see #getGuard()
   * @generated
   */
  EReference getGuard_Condition();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.SelectAlternative <em>Select Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Alternative</em>'.
   * @see org.xtext.ada2005.adb.SelectAlternative
   * @generated
   */
  EClass getSelectAlternative();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.SelectAlternative#getSequenceOfStatements <em>Sequence Of Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence Of Statements</em>'.
   * @see org.xtext.ada2005.adb.SelectAlternative#getSequenceOfStatements()
   * @see #getSelectAlternative()
   * @generated
   */
  EReference getSelectAlternative_SequenceOfStatements();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.AcceptAlternative <em>Accept Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Accept Alternative</em>'.
   * @see org.xtext.ada2005.adb.AcceptAlternative
   * @generated
   */
  EClass getAcceptAlternative();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.AcceptAlternative#getAcceptStatement <em>Accept Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Accept Statement</em>'.
   * @see org.xtext.ada2005.adb.AcceptAlternative#getAcceptStatement()
   * @see #getAcceptAlternative()
   * @generated
   */
  EReference getAcceptAlternative_AcceptStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.DelayAlternative <em>Delay Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delay Alternative</em>'.
   * @see org.xtext.ada2005.adb.DelayAlternative
   * @generated
   */
  EClass getDelayAlternative();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.DelayAlternative#getDelayStatement <em>Delay Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delay Statement</em>'.
   * @see org.xtext.ada2005.adb.DelayAlternative#getDelayStatement()
   * @see #getDelayAlternative()
   * @generated
   */
  EReference getDelayAlternative_DelayStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.TimedEntryCall <em>Timed Entry Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timed Entry Call</em>'.
   * @see org.xtext.ada2005.adb.TimedEntryCall
   * @generated
   */
  EClass getTimedEntryCall();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.TimedEntryCall#getEntryCallAlternative <em>Entry Call Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entry Call Alternative</em>'.
   * @see org.xtext.ada2005.adb.TimedEntryCall#getEntryCallAlternative()
   * @see #getTimedEntryCall()
   * @generated
   */
  EReference getTimedEntryCall_EntryCallAlternative();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.TimedEntryCall#getDelayAlternative <em>Delay Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delay Alternative</em>'.
   * @see org.xtext.ada2005.adb.TimedEntryCall#getDelayAlternative()
   * @see #getTimedEntryCall()
   * @generated
   */
  EReference getTimedEntryCall_DelayAlternative();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.EntryCallAlternative <em>Entry Call Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry Call Alternative</em>'.
   * @see org.xtext.ada2005.adb.EntryCallAlternative
   * @generated
   */
  EClass getEntryCallAlternative();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.EntryCallAlternative#getCall <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Call</em>'.
   * @see org.xtext.ada2005.adb.EntryCallAlternative#getCall()
   * @see #getEntryCallAlternative()
   * @generated
   */
  EReference getEntryCallAlternative_Call();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.EntryCallAlternative#getSequenceOfStatements <em>Sequence Of Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence Of Statements</em>'.
   * @see org.xtext.ada2005.adb.EntryCallAlternative#getSequenceOfStatements()
   * @see #getEntryCallAlternative()
   * @generated
   */
  EReference getEntryCallAlternative_SequenceOfStatements();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ConditionalEntryCall <em>Conditional Entry Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Entry Call</em>'.
   * @see org.xtext.ada2005.adb.ConditionalEntryCall
   * @generated
   */
  EClass getConditionalEntryCall();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ConditionalEntryCall#getEntryCallAlternative <em>Entry Call Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entry Call Alternative</em>'.
   * @see org.xtext.ada2005.adb.ConditionalEntryCall#getEntryCallAlternative()
   * @see #getConditionalEntryCall()
   * @generated
   */
  EReference getConditionalEntryCall_EntryCallAlternative();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ConditionalEntryCall#getElseSequenceOfStatements <em>Else Sequence Of Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Sequence Of Statements</em>'.
   * @see org.xtext.ada2005.adb.ConditionalEntryCall#getElseSequenceOfStatements()
   * @see #getConditionalEntryCall()
   * @generated
   */
  EReference getConditionalEntryCall_ElseSequenceOfStatements();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.AsynchronousSelect <em>Asynchronous Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Asynchronous Select</em>'.
   * @see org.xtext.ada2005.adb.AsynchronousSelect
   * @generated
   */
  EClass getAsynchronousSelect();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.AsynchronousSelect#getTriggeringAlternative <em>Triggering Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Triggering Alternative</em>'.
   * @see org.xtext.ada2005.adb.AsynchronousSelect#getTriggeringAlternative()
   * @see #getAsynchronousSelect()
   * @generated
   */
  EReference getAsynchronousSelect_TriggeringAlternative();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.AsynchronousSelect#getAbortablePart <em>Abortable Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Abortable Part</em>'.
   * @see org.xtext.ada2005.adb.AsynchronousSelect#getAbortablePart()
   * @see #getAsynchronousSelect()
   * @generated
   */
  EReference getAsynchronousSelect_AbortablePart();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.TriggeringAlternative <em>Triggering Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Triggering Alternative</em>'.
   * @see org.xtext.ada2005.adb.TriggeringAlternative
   * @generated
   */
  EClass getTriggeringAlternative();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.TriggeringAlternative#getTriggeringStatement <em>Triggering Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Triggering Statement</em>'.
   * @see org.xtext.ada2005.adb.TriggeringAlternative#getTriggeringStatement()
   * @see #getTriggeringAlternative()
   * @generated
   */
  EReference getTriggeringAlternative_TriggeringStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.TriggeringAlternative#getSequenceOfStatements <em>Sequence Of Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence Of Statements</em>'.
   * @see org.xtext.ada2005.adb.TriggeringAlternative#getSequenceOfStatements()
   * @see #getTriggeringAlternative()
   * @generated
   */
  EReference getTriggeringAlternative_SequenceOfStatements();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.TriggeringStatement <em>Triggering Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Triggering Statement</em>'.
   * @see org.xtext.ada2005.adb.TriggeringStatement
   * @generated
   */
  EClass getTriggeringStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.AbortablePart <em>Abortable Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abortable Part</em>'.
   * @see org.xtext.ada2005.adb.AbortablePart
   * @generated
   */
  EClass getAbortablePart();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.AbortStatement <em>Abort Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abort Statement</em>'.
   * @see org.xtext.ada2005.adb.AbortStatement
   * @generated
   */
  EClass getAbortStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.TaskNames <em>Task Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Names</em>'.
   * @see org.xtext.ada2005.adb.TaskNames
   * @generated
   */
  EClass getTaskNames();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.TaskNames#getTaskNames <em>Task Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Task Names</em>'.
   * @see org.xtext.ada2005.adb.TaskNames#getTaskNames()
   * @see #getTaskNames()
   * @generated
   */
  EReference getTaskNames_TaskNames();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.BodyStub <em>Body Stub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body Stub</em>'.
   * @see org.xtext.ada2005.adb.BodyStub
   * @generated
   */
  EClass getBodyStub();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.BodyStub#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.BodyStub#getName()
   * @see #getBodyStub()
   * @generated
   */
  EAttribute getBodyStub_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.PackageBodyStub <em>Package Body Stub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Body Stub</em>'.
   * @see org.xtext.ada2005.adb.PackageBodyStub
   * @generated
   */
  EClass getPackageBodyStub();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.TaskBodyStub <em>Task Body Stub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Body Stub</em>'.
   * @see org.xtext.ada2005.adb.TaskBodyStub
   * @generated
   */
  EClass getTaskBodyStub();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ProtectedBodyStub <em>Protected Body Stub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protected Body Stub</em>'.
   * @see org.xtext.ada2005.adb.ProtectedBodyStub
   * @generated
   */
  EClass getProtectedBodyStub();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.SeparateSubunit <em>Separate Subunit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Separate Subunit</em>'.
   * @see org.xtext.ada2005.adb.SeparateSubunit
   * @generated
   */
  EClass getSeparateSubunit();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.SeparateSubunit#getParentUnitName <em>Parent Unit Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parent Unit Name</em>'.
   * @see org.xtext.ada2005.adb.SeparateSubunit#getParentUnitName()
   * @see #getSeparateSubunit()
   * @generated
   */
  EAttribute getSeparateSubunit_ParentUnitName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.SeparateSubunit#getProperBody <em>Proper Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Proper Body</em>'.
   * @see org.xtext.ada2005.adb.SeparateSubunit#getProperBody()
   * @see #getSeparateSubunit()
   * @generated
   */
  EReference getSeparateSubunit_ProperBody();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.RaiseStatement <em>Raise Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Raise Statement</em>'.
   * @see org.xtext.ada2005.adb.RaiseStatement
   * @generated
   */
  EClass getRaiseStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.RaiseStatement#getExceptionName <em>Exception Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception Name</em>'.
   * @see org.xtext.ada2005.adb.RaiseStatement#getExceptionName()
   * @see #getRaiseStatement()
   * @generated
   */
  EReference getRaiseStatement_ExceptionName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.RaiseStatement#getWithExpression <em>With Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>With Expression</em>'.
   * @see org.xtext.ada2005.adb.RaiseStatement#getWithExpression()
   * @see #getRaiseStatement()
   * @generated
   */
  EReference getRaiseStatement_WithExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.GenericActualPart <em>Generic Actual Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic Actual Part</em>'.
   * @see org.xtext.ada2005.adb.GenericActualPart
   * @generated
   */
  EClass getGenericActualPart();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.GenericActualPart#getGenericAssociation <em>Generic Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Generic Association</em>'.
   * @see org.xtext.ada2005.adb.GenericActualPart#getGenericAssociation()
   * @see #getGenericActualPart()
   * @generated
   */
  EReference getGenericActualPart_GenericAssociation();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.GenericAssociation <em>Generic Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic Association</em>'.
   * @see org.xtext.ada2005.adb.GenericAssociation
   * @generated
   */
  EClass getGenericAssociation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.GenericAssociation#getSelectorName <em>Selector Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Selector Name</em>'.
   * @see org.xtext.ada2005.adb.GenericAssociation#getSelectorName()
   * @see #getGenericAssociation()
   * @generated
   */
  EAttribute getGenericAssociation_SelectorName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.GenericAssociation#getExpplicitGenericActualParam <em>Expplicit Generic Actual Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expplicit Generic Actual Param</em>'.
   * @see org.xtext.ada2005.adb.GenericAssociation#getExpplicitGenericActualParam()
   * @see #getGenericAssociation()
   * @generated
   */
  EReference getGenericAssociation_ExpplicitGenericActualParam();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ExplicitGenericActualParameter <em>Explicit Generic Actual Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Explicit Generic Actual Parameter</em>'.
   * @see org.xtext.ada2005.adb.ExplicitGenericActualParameter
   * @generated
   */
  EClass getExplicitGenericActualParameter();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Definition</em>'.
   * @see org.xtext.ada2005.adb.TypeDefinition
   * @generated
   */
  EClass getTypeDefinition();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.DiscriminantPart <em>Discriminant Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Discriminant Part</em>'.
   * @see org.xtext.ada2005.adb.DiscriminantPart
   * @generated
   */
  EClass getDiscriminantPart();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.UnknownDiscriminantPart <em>Unknown Discriminant Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unknown Discriminant Part</em>'.
   * @see org.xtext.ada2005.adb.UnknownDiscriminantPart
   * @generated
   */
  EClass getUnknownDiscriminantPart();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.UnknownDiscriminantPart#isBox <em>Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Box</em>'.
   * @see org.xtext.ada2005.adb.UnknownDiscriminantPart#isBox()
   * @see #getUnknownDiscriminantPart()
   * @generated
   */
  EAttribute getUnknownDiscriminantPart_Box();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.KnownDiscriminantPart <em>Known Discriminant Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Known Discriminant Part</em>'.
   * @see org.xtext.ada2005.adb.KnownDiscriminantPart
   * @generated
   */
  EClass getKnownDiscriminantPart();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.KnownDiscriminantPart#getDiscriminantsSpecification <em>Discriminants Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Discriminants Specification</em>'.
   * @see org.xtext.ada2005.adb.KnownDiscriminantPart#getDiscriminantsSpecification()
   * @see #getKnownDiscriminantPart()
   * @generated
   */
  EReference getKnownDiscriminantPart_DiscriminantsSpecification();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.DiscriminantSpecification <em>Discriminant Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Discriminant Specification</em>'.
   * @see org.xtext.ada2005.adb.DiscriminantSpecification
   * @generated
   */
  EClass getDiscriminantSpecification();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.DiscriminantSpecification#getDefiningIdentifiers <em>Defining Identifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Defining Identifiers</em>'.
   * @see org.xtext.ada2005.adb.DiscriminantSpecification#getDefiningIdentifiers()
   * @see #getDiscriminantSpecification()
   * @generated
   */
  EReference getDiscriminantSpecification_DefiningIdentifiers();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.DiscriminantSpecification#getOptNullExclusion <em>Opt Null Exclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Opt Null Exclusion</em>'.
   * @see org.xtext.ada2005.adb.DiscriminantSpecification#getOptNullExclusion()
   * @see #getDiscriminantSpecification()
   * @generated
   */
  EReference getDiscriminantSpecification_OptNullExclusion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.DiscriminantSpecification#getAccessDefinition <em>Access Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Access Definition</em>'.
   * @see org.xtext.ada2005.adb.DiscriminantSpecification#getAccessDefinition()
   * @see #getDiscriminantSpecification()
   * @generated
   */
  EReference getDiscriminantSpecification_AccessDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.DiscriminantSpecification#getSubtypeMark <em>Subtype Mark</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subtype Mark</em>'.
   * @see org.xtext.ada2005.adb.DiscriminantSpecification#getSubtypeMark()
   * @see #getDiscriminantSpecification()
   * @generated
   */
  EReference getDiscriminantSpecification_SubtypeMark();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.DiscriminantSpecification#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Value</em>'.
   * @see org.xtext.ada2005.adb.DiscriminantSpecification#getDefaultValue()
   * @see #getDiscriminantSpecification()
   * @generated
   */
  EReference getDiscriminantSpecification_DefaultValue();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.InterfaceList <em>Interface List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface List</em>'.
   * @see org.xtext.ada2005.adb.InterfaceList
   * @generated
   */
  EClass getInterfaceList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.InterfaceList#getInterfaceSubtypeMark <em>Interface Subtype Mark</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interface Subtype Mark</em>'.
   * @see org.xtext.ada2005.adb.InterfaceList#getInterfaceSubtypeMark()
   * @see #getInterfaceList()
   * @generated
   */
  EReference getInterfaceList_InterfaceSubtypeMark();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.InterfaceTypeDefinition <em>Interface Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Type Definition</em>'.
   * @see org.xtext.ada2005.adb.InterfaceTypeDefinition
   * @generated
   */
  EClass getInterfaceTypeDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.InterfaceTypeDefinition#isLimited <em>Limited</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Limited</em>'.
   * @see org.xtext.ada2005.adb.InterfaceTypeDefinition#isLimited()
   * @see #getInterfaceTypeDefinition()
   * @generated
   */
  EAttribute getInterfaceTypeDefinition_Limited();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.InterfaceTypeDefinition#isTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Task</em>'.
   * @see org.xtext.ada2005.adb.InterfaceTypeDefinition#isTask()
   * @see #getInterfaceTypeDefinition()
   * @generated
   */
  EAttribute getInterfaceTypeDefinition_Task();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.InterfaceTypeDefinition#isProtected <em>Protected</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Protected</em>'.
   * @see org.xtext.ada2005.adb.InterfaceTypeDefinition#isProtected()
   * @see #getInterfaceTypeDefinition()
   * @generated
   */
  EAttribute getInterfaceTypeDefinition_Protected();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.InterfaceTypeDefinition#isSynchro <em>Synchro</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Synchro</em>'.
   * @see org.xtext.ada2005.adb.InterfaceTypeDefinition#isSynchro()
   * @see #getInterfaceTypeDefinition()
   * @generated
   */
  EAttribute getInterfaceTypeDefinition_Synchro();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.InterfaceTypeDefinition#getInterfaceList <em>Interface List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface List</em>'.
   * @see org.xtext.ada2005.adb.InterfaceTypeDefinition#getInterfaceList()
   * @see #getInterfaceTypeDefinition()
   * @generated
   */
  EReference getInterfaceTypeDefinition_InterfaceList();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.DerivedTypeDefinition <em>Derived Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Derived Type Definition</em>'.
   * @see org.xtext.ada2005.adb.DerivedTypeDefinition
   * @generated
   */
  EClass getDerivedTypeDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.DerivedTypeDefinition#getAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.xtext.ada2005.adb.DerivedTypeDefinition#getAbstract()
   * @see #getDerivedTypeDefinition()
   * @generated
   */
  EAttribute getDerivedTypeDefinition_Abstract();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.DerivedTypeDefinition#getLimited <em>Limited</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Limited</em>'.
   * @see org.xtext.ada2005.adb.DerivedTypeDefinition#getLimited()
   * @see #getDerivedTypeDefinition()
   * @generated
   */
  EAttribute getDerivedTypeDefinition_Limited();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.DerivedTypeDefinition#getSubtypeIndication <em>Subtype Indication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subtype Indication</em>'.
   * @see org.xtext.ada2005.adb.DerivedTypeDefinition#getSubtypeIndication()
   * @see #getDerivedTypeDefinition()
   * @generated
   */
  EReference getDerivedTypeDefinition_SubtypeIndication();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.DerivedTypeDefinition#getInterfaceList <em>Interface List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface List</em>'.
   * @see org.xtext.ada2005.adb.DerivedTypeDefinition#getInterfaceList()
   * @see #getDerivedTypeDefinition()
   * @generated
   */
  EReference getDerivedTypeDefinition_InterfaceList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.DerivedTypeDefinition#getRecordExtentionPart <em>Record Extention Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record Extention Part</em>'.
   * @see org.xtext.ada2005.adb.DerivedTypeDefinition#getRecordExtentionPart()
   * @see #getDerivedTypeDefinition()
   * @generated
   */
  EReference getDerivedTypeDefinition_RecordExtentionPart();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.RecordExtensionPart <em>Record Extension Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Extension Part</em>'.
   * @see org.xtext.ada2005.adb.RecordExtensionPart
   * @generated
   */
  EClass getRecordExtensionPart();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.RecordExtensionPart#getRecordDefinition <em>Record Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record Definition</em>'.
   * @see org.xtext.ada2005.adb.RecordExtensionPart#getRecordDefinition()
   * @see #getRecordExtensionPart()
   * @generated
   */
  EReference getRecordExtensionPart_RecordDefinition();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.AccessTypeDefinition <em>Access Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Access Type Definition</em>'.
   * @see org.xtext.ada2005.adb.AccessTypeDefinition
   * @generated
   */
  EClass getAccessTypeDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.AccessTypeDefinition#getOptNullExclusion <em>Opt Null Exclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Opt Null Exclusion</em>'.
   * @see org.xtext.ada2005.adb.AccessTypeDefinition#getOptNullExclusion()
   * @see #getAccessTypeDefinition()
   * @generated
   */
  EReference getAccessTypeDefinition_OptNullExclusion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.AccessTypeDefinition#getAccessDefinition <em>Access Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Access Definition</em>'.
   * @see org.xtext.ada2005.adb.AccessTypeDefinition#getAccessDefinition()
   * @see #getAccessTypeDefinition()
   * @generated
   */
  EReference getAccessTypeDefinition_AccessDefinition();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.AccessSpecification <em>Access Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Access Specification</em>'.
   * @see org.xtext.ada2005.adb.AccessSpecification
   * @generated
   */
  EClass getAccessSpecification();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.AccessToSubprogramDefinition <em>Access To Subprogram Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Access To Subprogram Definition</em>'.
   * @see org.xtext.ada2005.adb.AccessToSubprogramDefinition
   * @generated
   */
  EClass getAccessToSubprogramDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.AccessToSubprogramDefinition#isProtected <em>Protected</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Protected</em>'.
   * @see org.xtext.ada2005.adb.AccessToSubprogramDefinition#isProtected()
   * @see #getAccessToSubprogramDefinition()
   * @generated
   */
  EAttribute getAccessToSubprogramDefinition_Protected();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.AccessToSubprogramDefinition#getFormalPart <em>Formal Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal Part</em>'.
   * @see org.xtext.ada2005.adb.AccessToSubprogramDefinition#getFormalPart()
   * @see #getAccessToSubprogramDefinition()
   * @generated
   */
  EReference getAccessToSubprogramDefinition_FormalPart();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.AccessToSubprogramDefinition#getParameterAndResultProfile <em>Parameter And Result Profile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter And Result Profile</em>'.
   * @see org.xtext.ada2005.adb.AccessToSubprogramDefinition#getParameterAndResultProfile()
   * @see #getAccessToSubprogramDefinition()
   * @generated
   */
  EReference getAccessToSubprogramDefinition_ParameterAndResultProfile();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.AccessToDataDefinition <em>Access To Data Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Access To Data Definition</em>'.
   * @see org.xtext.ada2005.adb.AccessToDataDefinition
   * @generated
   */
  EClass getAccessToDataDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.AccessToDataDefinition#getGeneralAccessModifier <em>General Access Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>General Access Modifier</em>'.
   * @see org.xtext.ada2005.adb.AccessToDataDefinition#getGeneralAccessModifier()
   * @see #getAccessToDataDefinition()
   * @generated
   */
  EAttribute getAccessToDataDefinition_GeneralAccessModifier();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.AccessToDataDefinition#getSubtypeIndication <em>Subtype Indication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subtype Indication</em>'.
   * @see org.xtext.ada2005.adb.AccessToDataDefinition#getSubtypeIndication()
   * @see #getAccessToDataDefinition()
   * @generated
   */
  EReference getAccessToDataDefinition_SubtypeIndication();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ArrayTypeDefinition <em>Array Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Type Definition</em>'.
   * @see org.xtext.ada2005.adb.ArrayTypeDefinition
   * @generated
   */
  EClass getArrayTypeDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ArrayTypeDefinition#getArrayIndexes <em>Array Indexes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array Indexes</em>'.
   * @see org.xtext.ada2005.adb.ArrayTypeDefinition#getArrayIndexes()
   * @see #getArrayTypeDefinition()
   * @generated
   */
  EReference getArrayTypeDefinition_ArrayIndexes();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ArrayTypeDefinition#getComponentDefinition <em>Component Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Component Definition</em>'.
   * @see org.xtext.ada2005.adb.ArrayTypeDefinition#getComponentDefinition()
   * @see #getArrayTypeDefinition()
   * @generated
   */
  EReference getArrayTypeDefinition_ComponentDefinition();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ArrayIndexes <em>Array Indexes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Indexes</em>'.
   * @see org.xtext.ada2005.adb.ArrayIndexes
   * @generated
   */
  EClass getArrayIndexes();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.UnconstrainedIndexes <em>Unconstrained Indexes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unconstrained Indexes</em>'.
   * @see org.xtext.ada2005.adb.UnconstrainedIndexes
   * @generated
   */
  EClass getUnconstrainedIndexes();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.UnconstrainedIndexes#getSubtypeMark <em>Subtype Mark</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subtype Mark</em>'.
   * @see org.xtext.ada2005.adb.UnconstrainedIndexes#getSubtypeMark()
   * @see #getUnconstrainedIndexes()
   * @generated
   */
  EReference getUnconstrainedIndexes_SubtypeMark();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ConstrainedIndexes <em>Constrained Indexes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constrained Indexes</em>'.
   * @see org.xtext.ada2005.adb.ConstrainedIndexes
   * @generated
   */
  EClass getConstrainedIndexes();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.ConstrainedIndexes#getConstrainedIndex <em>Constrained Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constrained Index</em>'.
   * @see org.xtext.ada2005.adb.ConstrainedIndexes#getConstrainedIndex()
   * @see #getConstrainedIndexes()
   * @generated
   */
  EReference getConstrainedIndexes_ConstrainedIndex();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.DiscreteSubtypeDefinition <em>Discrete Subtype Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Discrete Subtype Definition</em>'.
   * @see org.xtext.ada2005.adb.DiscreteSubtypeDefinition
   * @generated
   */
  EClass getDiscreteSubtypeDefinition();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ComponentDefinition <em>Component Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Definition</em>'.
   * @see org.xtext.ada2005.adb.ComponentDefinition
   * @generated
   */
  EClass getComponentDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.ComponentDefinition#isAliased <em>Aliased</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aliased</em>'.
   * @see org.xtext.ada2005.adb.ComponentDefinition#isAliased()
   * @see #getComponentDefinition()
   * @generated
   */
  EAttribute getComponentDefinition_Aliased();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ComponentDefinition#getSubtypeIndication <em>Subtype Indication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subtype Indication</em>'.
   * @see org.xtext.ada2005.adb.ComponentDefinition#getSubtypeIndication()
   * @see #getComponentDefinition()
   * @generated
   */
  EReference getComponentDefinition_SubtypeIndication();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ComponentDefinition#getAnonymousAccessDefinition <em>Anonymous Access Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Anonymous Access Definition</em>'.
   * @see org.xtext.ada2005.adb.ComponentDefinition#getAnonymousAccessDefinition()
   * @see #getComponentDefinition()
   * @generated
   */
  EReference getComponentDefinition_AnonymousAccessDefinition();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.AnonymousAccessDefinition <em>Anonymous Access Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anonymous Access Definition</em>'.
   * @see org.xtext.ada2005.adb.AnonymousAccessDefinition
   * @generated
   */
  EClass getAnonymousAccessDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.AnonymousAccessDefinition#getOptNullExclusion <em>Opt Null Exclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Opt Null Exclusion</em>'.
   * @see org.xtext.ada2005.adb.AnonymousAccessDefinition#getOptNullExclusion()
   * @see #getAnonymousAccessDefinition()
   * @generated
   */
  EReference getAnonymousAccessDefinition_OptNullExclusion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.AnonymousAccessDefinition#getAccessDef <em>Access Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Access Def</em>'.
   * @see org.xtext.ada2005.adb.AnonymousAccessDefinition#getAccessDef()
   * @see #getAnonymousAccessDefinition()
   * @generated
   */
  EReference getAnonymousAccessDefinition_AccessDef();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.NotNullAccessDefinition <em>Not Null Access Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Null Access Definition</em>'.
   * @see org.xtext.ada2005.adb.NotNullAccessDefinition
   * @generated
   */
  EClass getNotNullAccessDefinition();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.AccessToDataInstance <em>Access To Data Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Access To Data Instance</em>'.
   * @see org.xtext.ada2005.adb.AccessToDataInstance
   * @generated
   */
  EClass getAccessToDataInstance();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.AccessToDataInstance#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constant</em>'.
   * @see org.xtext.ada2005.adb.AccessToDataInstance#getConstant()
   * @see #getAccessToDataInstance()
   * @generated
   */
  EAttribute getAccessToDataInstance_Constant();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.AccessToDataInstance#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.AccessToDataInstance#getName()
   * @see #getAccessToDataInstance()
   * @generated
   */
  EReference getAccessToDataInstance_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ParameterAndResultProfile <em>Parameter And Result Profile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter And Result Profile</em>'.
   * @see org.xtext.ada2005.adb.ParameterAndResultProfile
   * @generated
   */
  EClass getParameterAndResultProfile();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ParameterAndResultProfile#getFormalPart <em>Formal Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal Part</em>'.
   * @see org.xtext.ada2005.adb.ParameterAndResultProfile#getFormalPart()
   * @see #getParameterAndResultProfile()
   * @generated
   */
  EReference getParameterAndResultProfile_FormalPart();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ParameterAndResultProfile#getOpt_nullExclusion <em>Opt null Exclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Opt null Exclusion</em>'.
   * @see org.xtext.ada2005.adb.ParameterAndResultProfile#getOpt_nullExclusion()
   * @see #getParameterAndResultProfile()
   * @generated
   */
  EReference getParameterAndResultProfile_Opt_nullExclusion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ParameterAndResultProfile#getSubtypeMark <em>Subtype Mark</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subtype Mark</em>'.
   * @see org.xtext.ada2005.adb.ParameterAndResultProfile#getSubtypeMark()
   * @see #getParameterAndResultProfile()
   * @generated
   */
  EReference getParameterAndResultProfile_SubtypeMark();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ParameterAndResultProfile#getAnonymousAccessDefinition <em>Anonymous Access Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Anonymous Access Definition</em>'.
   * @see org.xtext.ada2005.adb.ParameterAndResultProfile#getAnonymousAccessDefinition()
   * @see #getParameterAndResultProfile()
   * @generated
   */
  EReference getParameterAndResultProfile_AnonymousAccessDefinition();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.FormalPart <em>Formal Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Part</em>'.
   * @see org.xtext.ada2005.adb.FormalPart
   * @generated
   */
  EClass getFormalPart();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.FormalPart#getParameterSpecifications <em>Parameter Specifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Specifications</em>'.
   * @see org.xtext.ada2005.adb.FormalPart#getParameterSpecifications()
   * @see #getFormalPart()
   * @generated
   */
  EReference getFormalPart_ParameterSpecifications();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ParameterSpecification <em>Parameter Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Specification</em>'.
   * @see org.xtext.ada2005.adb.ParameterSpecification
   * @generated
   */
  EClass getParameterSpecification();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ParameterSpecification#getDefiningIdentifiers <em>Defining Identifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Defining Identifiers</em>'.
   * @see org.xtext.ada2005.adb.ParameterSpecification#getDefiningIdentifiers()
   * @see #getParameterSpecification()
   * @generated
   */
  EReference getParameterSpecification_DefiningIdentifiers();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ParameterSpecification#getMode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mode</em>'.
   * @see org.xtext.ada2005.adb.ParameterSpecification#getMode()
   * @see #getParameterSpecification()
   * @generated
   */
  EReference getParameterSpecification_Mode();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ParameterSpecification#getOptNullExclusion <em>Opt Null Exclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Opt Null Exclusion</em>'.
   * @see org.xtext.ada2005.adb.ParameterSpecification#getOptNullExclusion()
   * @see #getParameterSpecification()
   * @generated
   */
  EReference getParameterSpecification_OptNullExclusion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ParameterSpecification#getSubtypeMark <em>Subtype Mark</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subtype Mark</em>'.
   * @see org.xtext.ada2005.adb.ParameterSpecification#getSubtypeMark()
   * @see #getParameterSpecification()
   * @generated
   */
  EReference getParameterSpecification_SubtypeMark();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ParameterSpecification#getAnonymousAccessDefinition <em>Anonymous Access Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Anonymous Access Definition</em>'.
   * @see org.xtext.ada2005.adb.ParameterSpecification#getAnonymousAccessDefinition()
   * @see #getParameterSpecification()
   * @generated
   */
  EReference getParameterSpecification_AnonymousAccessDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ParameterSpecification#getDefaultExpression <em>Default Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Expression</em>'.
   * @see org.xtext.ada2005.adb.ParameterSpecification#getDefaultExpression()
   * @see #getParameterSpecification()
   * @generated
   */
  EReference getParameterSpecification_DefaultExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.Mode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mode</em>'.
   * @see org.xtext.ada2005.adb.Mode
   * @generated
   */
  EClass getMode();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.Mode#isIn <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>In</em>'.
   * @see org.xtext.ada2005.adb.Mode#isIn()
   * @see #getMode()
   * @generated
   */
  EAttribute getMode_In();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.Mode#isOut <em>Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Out</em>'.
   * @see org.xtext.ada2005.adb.Mode#isOut()
   * @see #getMode()
   * @generated
   */
  EAttribute getMode_Out();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.IntegerTypeDefinition <em>Integer Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Type Definition</em>'.
   * @see org.xtext.ada2005.adb.IntegerTypeDefinition
   * @generated
   */
  EClass getIntegerTypeDefinition();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.SignedIntegerTypeDefinition <em>Signed Integer Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signed Integer Type Definition</em>'.
   * @see org.xtext.ada2005.adb.SignedIntegerTypeDefinition
   * @generated
   */
  EClass getSignedIntegerTypeDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.SignedIntegerTypeDefinition#getFirst <em>First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First</em>'.
   * @see org.xtext.ada2005.adb.SignedIntegerTypeDefinition#getFirst()
   * @see #getSignedIntegerTypeDefinition()
   * @generated
   */
  EReference getSignedIntegerTypeDefinition_First();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.SignedIntegerTypeDefinition#getLast <em>Last</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Last</em>'.
   * @see org.xtext.ada2005.adb.SignedIntegerTypeDefinition#getLast()
   * @see #getSignedIntegerTypeDefinition()
   * @generated
   */
  EReference getSignedIntegerTypeDefinition_Last();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ModularTypeDefinition <em>Modular Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modular Type Definition</em>'.
   * @see org.xtext.ada2005.adb.ModularTypeDefinition
   * @generated
   */
  EClass getModularTypeDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ModularTypeDefinition#getStaticExpression <em>Static Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Static Expression</em>'.
   * @see org.xtext.ada2005.adb.ModularTypeDefinition#getStaticExpression()
   * @see #getModularTypeDefinition()
   * @generated
   */
  EReference getModularTypeDefinition_StaticExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.EnumerationTypeDefinition <em>Enumeration Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration Type Definition</em>'.
   * @see org.xtext.ada2005.adb.EnumerationTypeDefinition
   * @generated
   */
  EClass getEnumerationTypeDefinition();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.ada2005.adb.EnumerationTypeDefinition#getEnumerationliteralspecifications <em>Enumerationliteralspecifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Enumerationliteralspecifications</em>'.
   * @see org.xtext.ada2005.adb.EnumerationTypeDefinition#getEnumerationliteralspecifications()
   * @see #getEnumerationTypeDefinition()
   * @generated
   */
  EAttribute getEnumerationTypeDefinition_Enumerationliteralspecifications();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.RecordTypeDefinition <em>Record Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Type Definition</em>'.
   * @see org.xtext.ada2005.adb.RecordTypeDefinition
   * @generated
   */
  EClass getRecordTypeDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.RecordTypeDefinition#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.xtext.ada2005.adb.RecordTypeDefinition#isAbstract()
   * @see #getRecordTypeDefinition()
   * @generated
   */
  EAttribute getRecordTypeDefinition_Abstract();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.RecordTypeDefinition#isTagged <em>Tagged</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tagged</em>'.
   * @see org.xtext.ada2005.adb.RecordTypeDefinition#isTagged()
   * @see #getRecordTypeDefinition()
   * @generated
   */
  EAttribute getRecordTypeDefinition_Tagged();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.RecordTypeDefinition#isLimited <em>Limited</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Limited</em>'.
   * @see org.xtext.ada2005.adb.RecordTypeDefinition#isLimited()
   * @see #getRecordTypeDefinition()
   * @generated
   */
  EAttribute getRecordTypeDefinition_Limited();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.RecordTypeDefinition#getRecordDefinition <em>Record Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record Definition</em>'.
   * @see org.xtext.ada2005.adb.RecordTypeDefinition#getRecordDefinition()
   * @see #getRecordTypeDefinition()
   * @generated
   */
  EReference getRecordTypeDefinition_RecordDefinition();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.RecordDefinition <em>Record Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Definition</em>'.
   * @see org.xtext.ada2005.adb.RecordDefinition
   * @generated
   */
  EClass getRecordDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.RecordDefinition#getComponentList <em>Component List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Component List</em>'.
   * @see org.xtext.ada2005.adb.RecordDefinition#getComponentList()
   * @see #getRecordDefinition()
   * @generated
   */
  EReference getRecordDefinition_ComponentList();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.RecordDefinition#getNull <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Null</em>'.
   * @see org.xtext.ada2005.adb.RecordDefinition#getNull()
   * @see #getRecordDefinition()
   * @generated
   */
  EAttribute getRecordDefinition_Null();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ComponentList <em>Component List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component List</em>'.
   * @see org.xtext.ada2005.adb.ComponentList
   * @generated
   */
  EClass getComponentList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.ComponentList#getComponentItems <em>Component Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component Items</em>'.
   * @see org.xtext.ada2005.adb.ComponentList#getComponentItems()
   * @see #getComponentList()
   * @generated
   */
  EReference getComponentList_ComponentItems();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ComponentList#getOptVariantPart <em>Opt Variant Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Opt Variant Part</em>'.
   * @see org.xtext.ada2005.adb.ComponentList#getOptVariantPart()
   * @see #getComponentList()
   * @generated
   */
  EReference getComponentList_OptVariantPart();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.OptVariantPart <em>Opt Variant Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Opt Variant Part</em>'.
   * @see org.xtext.ada2005.adb.OptVariantPart
   * @generated
   */
  EClass getOptVariantPart();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.OptVariantPart#getVariantPart <em>Variant Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variant Part</em>'.
   * @see org.xtext.ada2005.adb.OptVariantPart#getVariantPart()
   * @see #getOptVariantPart()
   * @generated
   */
  EReference getOptVariantPart_VariantPart();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ComponentItem <em>Component Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Item</em>'.
   * @see org.xtext.ada2005.adb.ComponentItem
   * @generated
   */
  EClass getComponentItem();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ComponentDeclaration <em>Component Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Declaration</em>'.
   * @see org.xtext.ada2005.adb.ComponentDeclaration
   * @generated
   */
  EClass getComponentDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ComponentDeclaration#getDefiningIdentifiers <em>Defining Identifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Defining Identifiers</em>'.
   * @see org.xtext.ada2005.adb.ComponentDeclaration#getDefiningIdentifiers()
   * @see #getComponentDeclaration()
   * @generated
   */
  EReference getComponentDeclaration_DefiningIdentifiers();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ComponentDeclaration#getComponentDefinition <em>Component Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Component Definition</em>'.
   * @see org.xtext.ada2005.adb.ComponentDeclaration#getComponentDefinition()
   * @see #getComponentDeclaration()
   * @generated
   */
  EReference getComponentDeclaration_ComponentDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ComponentDeclaration#getDefaultExpression <em>Default Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Expression</em>'.
   * @see org.xtext.ada2005.adb.ComponentDeclaration#getDefaultExpression()
   * @see #getComponentDeclaration()
   * @generated
   */
  EReference getComponentDeclaration_DefaultExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.DefiningIdentifierList <em>Defining Identifier List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Defining Identifier List</em>'.
   * @see org.xtext.ada2005.adb.DefiningIdentifierList
   * @generated
   */
  EClass getDefiningIdentifierList();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.ada2005.adb.DefiningIdentifierList#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.DefiningIdentifierList#getName()
   * @see #getDefiningIdentifierList()
   * @generated
   */
  EAttribute getDefiningIdentifierList_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.AspectClause <em>Aspect Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aspect Clause</em>'.
   * @see org.xtext.ada2005.adb.AspectClause
   * @generated
   */
  EClass getAspectClause();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.AspectClause#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.AspectClause#getName()
   * @see #getAspectClause()
   * @generated
   */
  EAttribute getAspectClause_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.AspectClause#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.ada2005.adb.AspectClause#getExpression()
   * @see #getAspectClause()
   * @generated
   */
  EReference getAspectClause_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.AspectClause#getMod <em>Mod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mod</em>'.
   * @see org.xtext.ada2005.adb.AspectClause#getMod()
   * @see #getAspectClause()
   * @generated
   */
  EReference getAspectClause_Mod();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.AspectClause#getComponentClause <em>Component Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component Clause</em>'.
   * @see org.xtext.ada2005.adb.AspectClause#getComponentClause()
   * @see #getAspectClause()
   * @generated
   */
  EReference getAspectClause_ComponentClause();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ModClause <em>Mod Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mod Clause</em>'.
   * @see org.xtext.ada2005.adb.ModClause
   * @generated
   */
  EClass getModClause();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ModClause#getMod <em>Mod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mod</em>'.
   * @see org.xtext.ada2005.adb.ModClause#getMod()
   * @see #getModClause()
   * @generated
   */
  EReference getModClause_Mod();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ComponentClause <em>Component Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Clause</em>'.
   * @see org.xtext.ada2005.adb.ComponentClause
   * @generated
   */
  EClass getComponentClause();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.ComponentClause#getLocalName <em>Local Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Local Name</em>'.
   * @see org.xtext.ada2005.adb.ComponentClause#getLocalName()
   * @see #getComponentClause()
   * @generated
   */
  EAttribute getComponentClause_LocalName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ComponentClause#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Position</em>'.
   * @see org.xtext.ada2005.adb.ComponentClause#getPosition()
   * @see #getComponentClause()
   * @generated
   */
  EReference getComponentClause_Position();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ComponentClause#getFirstBit <em>First Bit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First Bit</em>'.
   * @see org.xtext.ada2005.adb.ComponentClause#getFirstBit()
   * @see #getComponentClause()
   * @generated
   */
  EReference getComponentClause_FirstBit();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ComponentClause#getLastBit <em>Last Bit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Last Bit</em>'.
   * @see org.xtext.ada2005.adb.ComponentClause#getLastBit()
   * @see #getComponentClause()
   * @generated
   */
  EReference getComponentClause_LastBit();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.VariantPart <em>Variant Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variant Part</em>'.
   * @see org.xtext.ada2005.adb.VariantPart
   * @generated
   */
  EClass getVariantPart();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.VariantPart#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.VariantPart#getName()
   * @see #getVariantPart()
   * @generated
   */
  EAttribute getVariantPart_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.VariantPart#getVariants <em>Variants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variants</em>'.
   * @see org.xtext.ada2005.adb.VariantPart#getVariants()
   * @see #getVariantPart()
   * @generated
   */
  EReference getVariantPart_Variants();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.Variant <em>Variant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variant</em>'.
   * @see org.xtext.ada2005.adb.Variant
   * @generated
   */
  EClass getVariant();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.Variant#getDiscreteChoiceList <em>Discrete Choice List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Discrete Choice List</em>'.
   * @see org.xtext.ada2005.adb.Variant#getDiscreteChoiceList()
   * @see #getVariant()
   * @generated
   */
  EReference getVariant_DiscreteChoiceList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.Variant#getComponentList <em>Component List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Component List</em>'.
   * @see org.xtext.ada2005.adb.Variant#getComponentList()
   * @see #getVariant()
   * @generated
   */
  EReference getVariant_ComponentList();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.DiscreteChoiceList <em>Discrete Choice List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Discrete Choice List</em>'.
   * @see org.xtext.ada2005.adb.DiscreteChoiceList
   * @generated
   */
  EClass getDiscreteChoiceList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.DiscreteChoiceList#getDiscreteChoiceList <em>Discrete Choice List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Discrete Choice List</em>'.
   * @see org.xtext.ada2005.adb.DiscreteChoiceList#getDiscreteChoiceList()
   * @see #getDiscreteChoiceList()
   * @generated
   */
  EReference getDiscreteChoiceList_DiscreteChoiceList();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.RealTypeDefinition <em>Real Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Type Definition</em>'.
   * @see org.xtext.ada2005.adb.RealTypeDefinition
   * @generated
   */
  EClass getRealTypeDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.RealTypeDefinition#getDigits <em>Digits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Digits</em>'.
   * @see org.xtext.ada2005.adb.RealTypeDefinition#getDigits()
   * @see #getRealTypeDefinition()
   * @generated
   */
  EReference getRealTypeDefinition_Digits();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.RealTypeDefinition#getRealRangeSpecification <em>Real Range Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Real Range Specification</em>'.
   * @see org.xtext.ada2005.adb.RealTypeDefinition#getRealRangeSpecification()
   * @see #getRealTypeDefinition()
   * @generated
   */
  EReference getRealTypeDefinition_RealRangeSpecification();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.FloatingPointDefinition <em>Floating Point Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Floating Point Definition</em>'.
   * @see org.xtext.ada2005.adb.FloatingPointDefinition
   * @generated
   */
  EClass getFloatingPointDefinition();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.RealRangeSpecification <em>Real Range Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Range Specification</em>'.
   * @see org.xtext.ada2005.adb.RealRangeSpecification
   * @generated
   */
  EClass getRealRangeSpecification();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.RealRangeSpecification#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lower Bound</em>'.
   * @see org.xtext.ada2005.adb.RealRangeSpecification#getLowerBound()
   * @see #getRealRangeSpecification()
   * @generated
   */
  EReference getRealRangeSpecification_LowerBound();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.RealRangeSpecification#getUpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Upper Bound</em>'.
   * @see org.xtext.ada2005.adb.RealRangeSpecification#getUpperBound()
   * @see #getRealRangeSpecification()
   * @generated
   */
  EReference getRealRangeSpecification_UpperBound();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.FixedPointDefinition <em>Fixed Point Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fixed Point Definition</em>'.
   * @see org.xtext.ada2005.adb.FixedPointDefinition
   * @generated
   */
  EClass getFixedPointDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.FixedPointDefinition#getDelta <em>Delta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delta</em>'.
   * @see org.xtext.ada2005.adb.FixedPointDefinition#getDelta()
   * @see #getFixedPointDefinition()
   * @generated
   */
  EReference getFixedPointDefinition_Delta();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.ada2005.adb.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.Expression#getRelations <em>Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relations</em>'.
   * @see org.xtext.ada2005.adb.Expression#getRelations()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Relations();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.ada2005.adb.Expression#getBooleanOperator <em>Boolean Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Boolean Operator</em>'.
   * @see org.xtext.ada2005.adb.Expression#getBooleanOperator()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_BooleanOperator();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation</em>'.
   * @see org.xtext.ada2005.adb.Relation
   * @generated
   */
  EClass getRelation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.Relation#getSimpleExpression <em>Simple Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Simple Expression</em>'.
   * @see org.xtext.ada2005.adb.Relation#getSimpleExpression()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_SimpleExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.Relation#getRelationalOperator <em>Relational Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Relational Operator</em>'.
   * @see org.xtext.ada2005.adb.Relation#getRelationalOperator()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_RelationalOperator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.Relation#getSubSimpleExpression <em>Sub Simple Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Simple Expression</em>'.
   * @see org.xtext.ada2005.adb.Relation#getSubSimpleExpression()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_SubSimpleExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.Relation#getMembership <em>Membership</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Membership</em>'.
   * @see org.xtext.ada2005.adb.Relation#getMembership()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Membership();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.Membership <em>Membership</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Membership</em>'.
   * @see org.xtext.ada2005.adb.Membership
   * @generated
   */
  EClass getMembership();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.Membership#isNot <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not</em>'.
   * @see org.xtext.ada2005.adb.Membership#isNot()
   * @see #getMembership()
   * @generated
   */
  EAttribute getMembership_Not();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.Membership#getInterval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interval</em>'.
   * @see org.xtext.ada2005.adb.Membership#getInterval()
   * @see #getMembership()
   * @generated
   */
  EReference getMembership_Interval();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.Interval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interval</em>'.
   * @see org.xtext.ada2005.adb.Interval
   * @generated
   */
  EClass getInterval();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.SimpleExpression <em>Simple Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Expression</em>'.
   * @see org.xtext.ada2005.adb.SimpleExpression
   * @generated
   */
  EClass getSimpleExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.SimpleExpression#getUnaryAddingOperator <em>Unary Adding Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unary Adding Operator</em>'.
   * @see org.xtext.ada2005.adb.SimpleExpression#getUnaryAddingOperator()
   * @see #getSimpleExpression()
   * @generated
   */
  EAttribute getSimpleExpression_UnaryAddingOperator();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.SimpleExpression#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Terms</em>'.
   * @see org.xtext.ada2005.adb.SimpleExpression#getTerms()
   * @see #getSimpleExpression()
   * @generated
   */
  EReference getSimpleExpression_Terms();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.ada2005.adb.SimpleExpression#getBinaryAddingOperators <em>Binary Adding Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Binary Adding Operators</em>'.
   * @see org.xtext.ada2005.adb.SimpleExpression#getBinaryAddingOperators()
   * @see #getSimpleExpression()
   * @generated
   */
  EAttribute getSimpleExpression_BinaryAddingOperators();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see org.xtext.ada2005.adb.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.Term#getFactors <em>Factors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Factors</em>'.
   * @see org.xtext.ada2005.adb.Term#getFactors()
   * @see #getTerm()
   * @generated
   */
  EReference getTerm_Factors();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.ada2005.adb.Term#getMultiplyingOperators <em>Multiplying Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Multiplying Operators</em>'.
   * @see org.xtext.ada2005.adb.Term#getMultiplyingOperators()
   * @see #getTerm()
   * @generated
   */
  EAttribute getTerm_MultiplyingOperators();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.Factor <em>Factor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Factor</em>'.
   * @see org.xtext.ada2005.adb.Factor
   * @generated
   */
  EClass getFactor();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.Factor#getPrimary <em>Primary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primary</em>'.
   * @see org.xtext.ada2005.adb.Factor#getPrimary()
   * @see #getFactor()
   * @generated
   */
  EReference getFactor_Primary();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.Factor#getExponent <em>Exponent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exponent</em>'.
   * @see org.xtext.ada2005.adb.Factor#getExponent()
   * @see #getFactor()
   * @generated
   */
  EReference getFactor_Exponent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.Factor#isAbs <em>Abs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abs</em>'.
   * @see org.xtext.ada2005.adb.Factor#isAbs()
   * @see #getFactor()
   * @generated
   */
  EAttribute getFactor_Abs();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.Factor#isNot <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not</em>'.
   * @see org.xtext.ada2005.adb.Factor#isNot()
   * @see #getFactor()
   * @generated
   */
  EAttribute getFactor_Not();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.Primary <em>Primary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary</em>'.
   * @see org.xtext.ada2005.adb.Primary
   * @generated
   */
  EClass getPrimary();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.NumericLiteral <em>Numeric Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numeric Literal</em>'.
   * @see org.xtext.ada2005.adb.NumericLiteral
   * @generated
   */
  EClass getNumericLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.NumericLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.ada2005.adb.NumericLiteral#getValue()
   * @see #getNumericLiteral()
   * @generated
   */
  EAttribute getNumericLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.Null <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null</em>'.
   * @see org.xtext.ada2005.adb.Null
   * @generated
   */
  EClass getNull();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.Null#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.ada2005.adb.Null#getValue()
   * @see #getNull()
   * @generated
   */
  EAttribute getNull_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.xtext.ada2005.adb.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.ada2005.adb.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.QualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Name</em>'.
   * @see org.xtext.ada2005.adb.QualifiedName
   * @generated
   */
  EClass getQualifiedName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.QualifiedName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.QualifiedName#getName()
   * @see #getQualifiedName()
   * @generated
   */
  EReference getQualifiedName_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.QualifiedName#getQualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualifier</em>'.
   * @see org.xtext.ada2005.adb.QualifiedName#getQualifier()
   * @see #getQualifiedName()
   * @generated
   */
  EReference getQualifiedName_Qualifier();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ParenthesizedExpression <em>Parenthesized Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parenthesized Expression</em>'.
   * @see org.xtext.ada2005.adb.ParenthesizedExpression
   * @generated
   */
  EClass getParenthesizedExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.Qualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualifier</em>'.
   * @see org.xtext.ada2005.adb.Qualifier
   * @generated
   */
  EClass getQualifier();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.Allocator <em>Allocator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Allocator</em>'.
   * @see org.xtext.ada2005.adb.Allocator
   * @generated
   */
  EClass getAllocator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.Allocator#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Name</em>'.
   * @see org.xtext.ada2005.adb.Allocator#getTypeName()
   * @see #getAllocator()
   * @generated
   */
  EReference getAllocator_TypeName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.Allocator#getQualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualifier</em>'.
   * @see org.xtext.ada2005.adb.Allocator#getQualifier()
   * @see #getAllocator()
   * @generated
   */
  EReference getAllocator_Qualifier();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.SubtypeIndication <em>Subtype Indication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subtype Indication</em>'.
   * @see org.xtext.ada2005.adb.SubtypeIndication
   * @generated
   */
  EClass getSubtypeIndication();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.SubtypeIndication#getOpt_nullExclusion <em>Opt null Exclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Opt null Exclusion</em>'.
   * @see org.xtext.ada2005.adb.SubtypeIndication#getOpt_nullExclusion()
   * @see #getSubtypeIndication()
   * @generated
   */
  EReference getSubtypeIndication_Opt_nullExclusion();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.SubtypeIndication#getSubtypeMark <em>Subtype Mark</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Subtype Mark</em>'.
   * @see org.xtext.ada2005.adb.SubtypeIndication#getSubtypeMark()
   * @see #getSubtypeIndication()
   * @generated
   */
  EAttribute getSubtypeIndication_SubtypeMark();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.SubtypeIndication#getOpt_constraint <em>Opt constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Opt constraint</em>'.
   * @see org.xtext.ada2005.adb.SubtypeIndication#getOpt_constraint()
   * @see #getSubtypeIndication()
   * @generated
   */
  EReference getSubtypeIndication_Opt_constraint();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.OptNullExclusion <em>Opt Null Exclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Opt Null Exclusion</em>'.
   * @see org.xtext.ada2005.adb.OptNullExclusion
   * @generated
   */
  EClass getOptNullExclusion();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.OptNullExclusion#getNot_null <em>Not null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not null</em>'.
   * @see org.xtext.ada2005.adb.OptNullExclusion#getNot_null()
   * @see #getOptNullExclusion()
   * @generated
   */
  EAttribute getOptNullExclusion_Not_null();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.OptConstraint <em>Opt Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Opt Constraint</em>'.
   * @see org.xtext.ada2005.adb.OptConstraint
   * @generated
   */
  EClass getOptConstraint();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.OptConstraint#getOptConstraint <em>Opt Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Opt Constraint</em>'.
   * @see org.xtext.ada2005.adb.OptConstraint#getOptConstraint()
   * @see #getOptConstraint()
   * @generated
   */
  EReference getOptConstraint_OptConstraint();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ScalarConstraint <em>Scalar Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scalar Constraint</em>'.
   * @see org.xtext.ada2005.adb.ScalarConstraint
   * @generated
   */
  EClass getScalarConstraint();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.DigitsConstraint <em>Digits Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Digits Constraint</em>'.
   * @see org.xtext.ada2005.adb.DigitsConstraint
   * @generated
   */
  EClass getDigitsConstraint();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.DigitsConstraint#getDigits <em>Digits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Digits</em>'.
   * @see org.xtext.ada2005.adb.DigitsConstraint#getDigits()
   * @see #getDigitsConstraint()
   * @generated
   */
  EReference getDigitsConstraint_Digits();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.DigitsConstraint#getRangeConstraint <em>Range Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range Constraint</em>'.
   * @see org.xtext.ada2005.adb.DigitsConstraint#getRangeConstraint()
   * @see #getDigitsConstraint()
   * @generated
   */
  EReference getDigitsConstraint_RangeConstraint();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.DeltaConstraint <em>Delta Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delta Constraint</em>'.
   * @see org.xtext.ada2005.adb.DeltaConstraint
   * @generated
   */
  EClass getDeltaConstraint();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.DeltaConstraint#getDelta <em>Delta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delta</em>'.
   * @see org.xtext.ada2005.adb.DeltaConstraint#getDelta()
   * @see #getDeltaConstraint()
   * @generated
   */
  EReference getDeltaConstraint_Delta();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.DeltaConstraint#getRangeConstraint <em>Range Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range Constraint</em>'.
   * @see org.xtext.ada2005.adb.DeltaConstraint#getRangeConstraint()
   * @see #getDeltaConstraint()
   * @generated
   */
  EReference getDeltaConstraint_RangeConstraint();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.RangeConstraint <em>Range Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range Constraint</em>'.
   * @see org.xtext.ada2005.adb.RangeConstraint
   * @generated
   */
  EClass getRangeConstraint();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.CompositeConstraint <em>Composite Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Constraint</em>'.
   * @see org.xtext.ada2005.adb.CompositeConstraint
   * @generated
   */
  EClass getCompositeConstraint();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.DiscriminantConstraint <em>Discriminant Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Discriminant Constraint</em>'.
   * @see org.xtext.ada2005.adb.DiscriminantConstraint
   * @generated
   */
  EClass getDiscriminantConstraint();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.DiscriminantConstraint#getDiscriminantAssociation <em>Discriminant Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Discriminant Association</em>'.
   * @see org.xtext.ada2005.adb.DiscriminantConstraint#getDiscriminantAssociation()
   * @see #getDiscriminantConstraint()
   * @generated
   */
  EReference getDiscriminantConstraint_DiscriminantAssociation();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.IndexConstraint <em>Index Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Index Constraint</em>'.
   * @see org.xtext.ada2005.adb.IndexConstraint
   * @generated
   */
  EClass getIndexConstraint();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.IndexConstraint#getDiscreteRange <em>Discrete Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Discrete Range</em>'.
   * @see org.xtext.ada2005.adb.IndexConstraint#getDiscreteRange()
   * @see #getIndexConstraint()
   * @generated
   */
  EReference getIndexConstraint_DiscreteRange();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.DiscriminantAssociation <em>Discriminant Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Discriminant Association</em>'.
   * @see org.xtext.ada2005.adb.DiscriminantAssociation
   * @generated
   */
  EClass getDiscriminantAssociation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.DiscriminantAssociation#getDiscriminantSelectors <em>Discriminant Selectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Discriminant Selectors</em>'.
   * @see org.xtext.ada2005.adb.DiscriminantAssociation#getDiscriminantSelectors()
   * @see #getDiscriminantAssociation()
   * @generated
   */
  EReference getDiscriminantAssociation_DiscriminantSelectors();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.DiscriminantAssociation#getActualParameter <em>Actual Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actual Parameter</em>'.
   * @see org.xtext.ada2005.adb.DiscriminantAssociation#getActualParameter()
   * @see #getDiscriminantAssociation()
   * @generated
   */
  EReference getDiscriminantAssociation_ActualParameter();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.DiscriminantSelectors <em>Discriminant Selectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Discriminant Selectors</em>'.
   * @see org.xtext.ada2005.adb.DiscriminantSelectors
   * @generated
   */
  EClass getDiscriminantSelectors();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.ada2005.adb.DiscriminantSelectors#getDiscriminantSelectorName <em>Discriminant Selector Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Discriminant Selector Name</em>'.
   * @see org.xtext.ada2005.adb.DiscriminantSelectors#getDiscriminantSelectorName()
   * @see #getDiscriminantSelectors()
   * @generated
   */
  EAttribute getDiscriminantSelectors_DiscriminantSelectorName();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.DiscreteRange <em>Discrete Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Discrete Range</em>'.
   * @see org.xtext.ada2005.adb.DiscreteRange
   * @generated
   */
  EClass getDiscreteRange();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ComponentChoiceList <em>Component Choice List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Choice List</em>'.
   * @see org.xtext.ada2005.adb.ComponentChoiceList
   * @generated
   */
  EClass getComponentChoiceList();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.ada2005.adb.ComponentChoiceList#getComponentSelectorName <em>Component Selector Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Component Selector Name</em>'.
   * @see org.xtext.ada2005.adb.ComponentChoiceList#getComponentSelectorName()
   * @see #getComponentChoiceList()
   * @generated
   */
  EAttribute getComponentChoiceList_ComponentSelectorName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.ComponentChoiceList#isOthers <em>Others</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Others</em>'.
   * @see org.xtext.ada2005.adb.ComponentChoiceList#isOthers()
   * @see #getComponentChoiceList()
   * @generated
   */
  EAttribute getComponentChoiceList_Others();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.DiscreteChoice <em>Discrete Choice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Discrete Choice</em>'.
   * @see org.xtext.ada2005.adb.DiscreteChoice
   * @generated
   */
  EClass getDiscreteChoice();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.Aggregate <em>Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aggregate</em>'.
   * @see org.xtext.ada2005.adb.Aggregate
   * @generated
   */
  EClass getAggregate();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.RecordAggregate <em>Record Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Aggregate</em>'.
   * @see org.xtext.ada2005.adb.RecordAggregate
   * @generated
   */
  EClass getRecordAggregate();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.RecordComponentAssociationList <em>Record Component Association List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Component Association List</em>'.
   * @see org.xtext.ada2005.adb.RecordComponentAssociationList
   * @generated
   */
  EClass getRecordComponentAssociationList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.RecordComponentAssociationList#getRecordComponentAssociation <em>Record Component Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Record Component Association</em>'.
   * @see org.xtext.ada2005.adb.RecordComponentAssociationList#getRecordComponentAssociation()
   * @see #getRecordComponentAssociationList()
   * @generated
   */
  EReference getRecordComponentAssociationList_RecordComponentAssociation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.RecordComponentAssociationList#isNullRecord <em>Null Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Null Record</em>'.
   * @see org.xtext.ada2005.adb.RecordComponentAssociationList#isNullRecord()
   * @see #getRecordComponentAssociationList()
   * @generated
   */
  EAttribute getRecordComponentAssociationList_NullRecord();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.RecordComponentAssociation <em>Record Component Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Component Association</em>'.
   * @see org.xtext.ada2005.adb.RecordComponentAssociation
   * @generated
   */
  EClass getRecordComponentAssociation();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.RecordComponentAssociation#getComponentChoiceList <em>Component Choice List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component Choice List</em>'.
   * @see org.xtext.ada2005.adb.RecordComponentAssociation#getComponentChoiceList()
   * @see #getRecordComponentAssociation()
   * @generated
   */
  EReference getRecordComponentAssociation_ComponentChoiceList();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.InitializedComponents <em>Initialized Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Initialized Components</em>'.
   * @see org.xtext.ada2005.adb.InitializedComponents
   * @generated
   */
  EClass getInitializedComponents();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.InitializedComponents#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.ada2005.adb.InitializedComponents#getValue()
   * @see #getInitializedComponents()
   * @generated
   */
  EReference getInitializedComponents_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.UninitializedComponents <em>Uninitialized Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uninitialized Components</em>'.
   * @see org.xtext.ada2005.adb.UninitializedComponents
   * @generated
   */
  EClass getUninitializedComponents();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.UninitializedComponents#isBox <em>Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Box</em>'.
   * @see org.xtext.ada2005.adb.UninitializedComponents#isBox()
   * @see #getUninitializedComponents()
   * @generated
   */
  EAttribute getUninitializedComponents_Box();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ExtensionAggregate <em>Extension Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extension Aggregate</em>'.
   * @see org.xtext.ada2005.adb.ExtensionAggregate
   * @generated
   */
  EClass getExtensionAggregate();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ExtensionAggregate#getAncestorPart <em>Ancestor Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ancestor Part</em>'.
   * @see org.xtext.ada2005.adb.ExtensionAggregate#getAncestorPart()
   * @see #getExtensionAggregate()
   * @generated
   */
  EReference getExtensionAggregate_AncestorPart();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ExtensionAggregate#getRecordComponentAssociationList <em>Record Component Association List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record Component Association List</em>'.
   * @see org.xtext.ada2005.adb.ExtensionAggregate#getRecordComponentAssociationList()
   * @see #getExtensionAggregate()
   * @generated
   */
  EReference getExtensionAggregate_RecordComponentAssociationList();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ArrayAggregate <em>Array Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Aggregate</em>'.
   * @see org.xtext.ada2005.adb.ArrayAggregate
   * @generated
   */
  EClass getArrayAggregate();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.PositionalArrayAggregate <em>Positional Array Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Positional Array Aggregate</em>'.
   * @see org.xtext.ada2005.adb.PositionalArrayAggregate
   * @generated
   */
  EClass getPositionalArrayAggregate();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.PositionalArrayAggregate#getInitialValues <em>Initial Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Initial Values</em>'.
   * @see org.xtext.ada2005.adb.PositionalArrayAggregate#getInitialValues()
   * @see #getPositionalArrayAggregate()
   * @generated
   */
  EReference getPositionalArrayAggregate_InitialValues();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.PositionalArrayAggregate#getOthersValue <em>Others Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Others Value</em>'.
   * @see org.xtext.ada2005.adb.PositionalArrayAggregate#getOthersValue()
   * @see #getPositionalArrayAggregate()
   * @generated
   */
  EReference getPositionalArrayAggregate_OthersValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.PositionalArrayAggregate#isOthersBox <em>Others Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Others Box</em>'.
   * @see org.xtext.ada2005.adb.PositionalArrayAggregate#isOthersBox()
   * @see #getPositionalArrayAggregate()
   * @generated
   */
  EAttribute getPositionalArrayAggregate_OthersBox();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.NamedArrayAggregate <em>Named Array Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Array Aggregate</em>'.
   * @see org.xtext.ada2005.adb.NamedArrayAggregate
   * @generated
   */
  EClass getNamedArrayAggregate();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.NamedArrayAggregate#getArrayComponentAssociation <em>Array Component Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Array Component Association</em>'.
   * @see org.xtext.ada2005.adb.NamedArrayAggregate#getArrayComponentAssociation()
   * @see #getNamedArrayAggregate()
   * @generated
   */
  EReference getNamedArrayAggregate_ArrayComponentAssociation();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ArrayComponentAssociation <em>Array Component Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Component Association</em>'.
   * @see org.xtext.ada2005.adb.ArrayComponentAssociation
   * @generated
   */
  EClass getArrayComponentAssociation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ArrayComponentAssociation#getDiscreteChoiceList <em>Discrete Choice List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Discrete Choice List</em>'.
   * @see org.xtext.ada2005.adb.ArrayComponentAssociation#getDiscreteChoiceList()
   * @see #getArrayComponentAssociation()
   * @generated
   */
  EReference getArrayComponentAssociation_DiscreteChoiceList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ArrayComponentAssociation#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.ada2005.adb.ArrayComponentAssociation#getExpression()
   * @see #getArrayComponentAssociation()
   * @generated
   */
  EReference getArrayComponentAssociation_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.ArrayComponentAssociation#isBox <em>Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Box</em>'.
   * @see org.xtext.ada2005.adb.ArrayComponentAssociation#isBox()
   * @see #getArrayComponentAssociation()
   * @generated
   */
  EAttribute getArrayComponentAssociation_Box();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.AncestorPart <em>Ancestor Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ancestor Part</em>'.
   * @see org.xtext.ada2005.adb.AncestorPart
   * @generated
   */
  EClass getAncestorPart();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.Name
   * @generated
   */
  EClass getName_();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.Name#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.Name#getName()
   * @see #getName_()
   * @generated
   */
  EAttribute getName_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.Name#getPrimaryName <em>Primary Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primary Name</em>'.
   * @see org.xtext.ada2005.adb.Name#getPrimaryName()
   * @see #getName_()
   * @generated
   */
  EReference getName_PrimaryName();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.PrimaryName <em>Primary Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Name</em>'.
   * @see org.xtext.ada2005.adb.PrimaryName
   * @generated
   */
  EClass getPrimaryName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ada2005.adb.PrimaryName#getParameterAssociation <em>Parameter Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Association</em>'.
   * @see org.xtext.ada2005.adb.PrimaryName#getParameterAssociation()
   * @see #getPrimaryName()
   * @generated
   */
  EReference getPrimaryName_ParameterAssociation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.PrimaryName#getPrimaryName <em>Primary Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primary Name</em>'.
   * @see org.xtext.ada2005.adb.PrimaryName#getPrimaryName()
   * @see #getPrimaryName()
   * @generated
   */
  EReference getPrimaryName_PrimaryName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.PrimaryName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.PrimaryName#getName()
   * @see #getPrimaryName()
   * @generated
   */
  EReference getPrimaryName_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.PrimaryName#getAttributeDesignator <em>Attribute Designator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute Designator</em>'.
   * @see org.xtext.ada2005.adb.PrimaryName#getAttributeDesignator()
   * @see #getPrimaryName()
   * @generated
   */
  EReference getPrimaryName_AttributeDesignator();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ParameterAssociation <em>Parameter Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Association</em>'.
   * @see org.xtext.ada2005.adb.ParameterAssociation
   * @generated
   */
  EClass getParameterAssociation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ada2005.adb.ParameterAssociation#getSelectorName <em>Selector Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Selector Name</em>'.
   * @see org.xtext.ada2005.adb.ParameterAssociation#getSelectorName()
   * @see #getParameterAssociation()
   * @generated
   */
  EAttribute getParameterAssociation_SelectorName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ParameterAssociation#getParameterEffectiveValue <em>Parameter Effective Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter Effective Value</em>'.
   * @see org.xtext.ada2005.adb.ParameterAssociation#getParameterEffectiveValue()
   * @see #getParameterAssociation()
   * @generated
   */
  EReference getParameterAssociation_ParameterEffectiveValue();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ParameterEffectiveValue <em>Parameter Effective Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Effective Value</em>'.
   * @see org.xtext.ada2005.adb.ParameterEffectiveValue
   * @generated
   */
  EClass getParameterEffectiveValue();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.AttributeDesignator <em>Attribute Designator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Designator</em>'.
   * @see org.xtext.ada2005.adb.AttributeDesignator
   * @generated
   */
  EClass getAttributeDesignator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.AttributeDesignator#getStaticExpression <em>Static Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Static Expression</em>'.
   * @see org.xtext.ada2005.adb.AttributeDesignator#getStaticExpression()
   * @see #getAttributeDesignator()
   * @generated
   */
  EReference getAttributeDesignator_StaticExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.Range <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range</em>'.
   * @see org.xtext.ada2005.adb.Range
   * @generated
   */
  EClass getRange();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.EntityRange <em>Entity Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Range</em>'.
   * @see org.xtext.ada2005.adb.EntityRange
   * @generated
   */
  EClass getEntityRange();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.EntityRange#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.ada2005.adb.EntityRange#getName()
   * @see #getEntityRange()
   * @generated
   */
  EReference getEntityRange_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.EntityRange#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see org.xtext.ada2005.adb.EntityRange#getIndex()
   * @see #getEntityRange()
   * @generated
   */
  EReference getEntityRange_Index();

  /**
   * Returns the meta object for class '{@link org.xtext.ada2005.adb.ExplicitRange <em>Explicit Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Explicit Range</em>'.
   * @see org.xtext.ada2005.adb.ExplicitRange
   * @generated
   */
  EClass getExplicitRange();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ExplicitRange#getFirst <em>First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First</em>'.
   * @see org.xtext.ada2005.adb.ExplicitRange#getFirst()
   * @see #getExplicitRange()
   * @generated
   */
  EReference getExplicitRange_First();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ada2005.adb.ExplicitRange#getLast <em>Last</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Last</em>'.
   * @see org.xtext.ada2005.adb.ExplicitRange#getLast()
   * @see #getExplicitRange()
   * @generated
   */
  EReference getExplicitRange_Last();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AdbFactory getAdbFactory();

} //AdbPackage
