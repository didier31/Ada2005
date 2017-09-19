/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.ada2005.adb.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdbFactoryImpl extends EFactoryImpl implements AdbFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AdbFactory init()
  {
    try
    {
      AdbFactory theAdbFactory = (AdbFactory)EPackage.Registry.INSTANCE.getEFactory(AdbPackage.eNS_URI);
      if (theAdbFactory != null)
      {
        return theAdbFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AdbFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdbFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AdbPackage.COMPILATION: return createCompilation();
      case AdbPackage.COMPILATION_UNIT: return createCompilationUnit();
      case AdbPackage.UNIT: return createUnit();
      case AdbPackage.CONTEXT_CLAUSE: return createContextClause();
      case AdbPackage.CONTEXT_ITEM: return createContextItem();
      case AdbPackage.WITH_CLAUSE: return createWithClause();
      case AdbPackage.USE_CLAUSE: return createUseClause();
      case AdbPackage.USE_PACKAGE_CLAUSE: return createUsePackageClause();
      case AdbPackage.USE_TYPE_CLAUSE: return createUseTypeClause();
      case AdbPackage.LIBRARY_UNIT_DECLARATION: return createLibraryUnitDeclaration();
      case AdbPackage.LIBRARY_UNIT_SPECIFICATION: return createLibraryUnitSpecification();
      case AdbPackage.PACKAGE_DECLARATION: return createPackageDeclaration();
      case AdbPackage.PACKAGE_DEFINITION: return createPackageDefinition();
      case AdbPackage.RENAMING: return createRenaming();
      case AdbPackage.GENERIC_DECLARATION: return createGenericDeclaration();
      case AdbPackage.GENERIC_INSTANTIATION: return createGenericInstantiation();
      case AdbPackage.PACKAGE_SPECIFICATION: return createPackageSpecification();
      case AdbPackage.SUBPROGRAM_BODY: return createSubprogramBody();
      case AdbPackage.DECLARATIVE_BLOCK: return createDeclarativeBlock();
      case AdbPackage.BASIC_DECLARATIVE_ITEM: return createBasicDeclarativeItem();
      case AdbPackage.BASIC_DECLARATION: return createBasicDeclaration();
      case AdbPackage.TASK_DECLARATION: return createTaskDeclaration();
      case AdbPackage.TYPE_DECLARATION: return createTypeDeclaration();
      case AdbPackage.NEW_TYPE_DECLARATION: return createNewTypeDeclaration();
      case AdbPackage.FULL_TYPE_DECLARATION: return createFullTypeDeclaration();
      case AdbPackage.FULL_DATA_TYPE_DECLARATION: return createFullDataTypeDeclaration();
      case AdbPackage.INCOMPLETE_TYPE_DECLARATION: return createIncompleteTypeDeclaration();
      case AdbPackage.PRIVATE_TYPE_DECLARATION: return createPrivateTypeDeclaration();
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION: return createPrivateExtensionDeclaration();
      case AdbPackage.TASK_ITEM: return createTaskItem();
      case AdbPackage.ENTRY_DECLARATION: return createEntryDeclaration();
      case AdbPackage.OVERRIDING_INDICATOR: return createOverridingIndicator();
      case AdbPackage.PROTECTED_TYPE_DECLARATION: return createProtectedTypeDeclaration();
      case AdbPackage.PROTECTED_DEFINITION: return createProtectedDefinition();
      case AdbPackage.PROTECTED_ELEMENT_DECLARATION: return createProtectedElementDeclaration();
      case AdbPackage.PROTECTED_OPERATION_DECLARATION: return createProtectedOperationDeclaration();
      case AdbPackage.SUBPROGRAM_DECLARATION: return createSubprogramDeclaration();
      case AdbPackage.SUBPROGRAM_SPECIFICATION: return createSubprogramSpecification();
      case AdbPackage.PROCEDURE_SPECIFICATION: return createProcedureSpecification();
      case AdbPackage.FUNCTION_SPECIFICATION: return createFunctionSpecification();
      case AdbPackage.HANDLED_SEQUENCE_OF_STATEMENTS: return createHandledSequenceOfStatements();
      case AdbPackage.EXCEPTION_CHOICE: return createExceptionChoice();
      case AdbPackage.EXCEPTION_HANDLER: return createExceptionHandler();
      case AdbPackage.DECLARATIVE_ITEM: return createDeclarativeItem();
      case AdbPackage.BODY: return createBody();
      case AdbPackage.PROPER_BODY: return createProperBody();
      case AdbPackage.LABEL: return createLabel();
      case AdbPackage.SEQUENCE_OF_STATEMENTS: return createSequenceOfStatements();
      case AdbPackage.LABELISABLE_STATEMENT: return createLabelisableStatement();
      case AdbPackage.STATEMENT: return createStatement();
      case AdbPackage.SIMPLE_STATEMENT: return createSimpleStatement();
      case AdbPackage.COMPOUND_STATEMENT: return createCompoundStatement();
      case AdbPackage.NULL_STATEMENT: return createNullStatement();
      case AdbPackage.LIBRARY_SPECIFICATION: return createLibrarySpecification();
      case AdbPackage.GENERIC_ITEMS: return createGenericItems();
      case AdbPackage.GENERIC_ITEM: return createGenericItem();
      case AdbPackage.GENERIC_FORMAL_PARAMETER_DECLARATION: return createGenericFormalParameterDeclaration();
      case AdbPackage.FORMAL_OBJECT_DECLARATION: return createFormalObjectDeclaration();
      case AdbPackage.FORMAL_TYPE_DECLARATION: return createFormalTypeDeclaration();
      case AdbPackage.FORMAL_TYPE_DEFINITION: return createFormalTypeDefinition();
      case AdbPackage.FORMAL_PRIVATE_TYPE_DEFINITION: return createFormalPrivateTypeDefinition();
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION: return createFormalDerivedTypeDefinition();
      case AdbPackage.FORMAL_SUBPROGRAM_DECLARATION: return createFormalSubprogramDeclaration();
      case AdbPackage.SUBPROGRAM_DEFAULT: return createSubprogramDefault();
      case AdbPackage.FORMAL_PACKAGE_DECLARATION: return createFormalPackageDeclaration();
      case AdbPackage.FORMAL_PACKAGE_ACTUAL_PART: return createFormalPackageActualPart();
      case AdbPackage.FORMAL_PACKAGE_ASSOCIATION: return createFormalPackageAssociation();
      case AdbPackage.EXCEPTION_DECLARATION: return createExceptionDeclaration();
      case AdbPackage.OBJECT_DECLARATION: return createObjectDeclaration();
      case AdbPackage.DATA_INSTANCE_DECLARATION: return createDataInstanceDeclaration();
      case AdbPackage.SINGLE_PROTECTED_DECLARATION: return createSingleProtectedDeclaration();
      case AdbPackage.PRAGMA: return createPragma();
      case AdbPackage.PRAGMA_ARGUMENT_ASSOCIATION: return createPragmaArgumentAssociation();
      case AdbPackage.SUBTYPE_DECLARATION: return createSubtypeDeclaration();
      case AdbPackage.NUMBER_DECLARATION: return createNumberDeclaration();
      case AdbPackage.ASSIGNMENT_STATEMENT: return createAssignmentStatement();
      case AdbPackage.IF_STATEMENT: return createIfStatement();
      case AdbPackage.CASE_STATEMENT: return createCaseStatement();
      case AdbPackage.CASE_STATEMENT_ALTERNATIVE: return createCaseStatementAlternative();
      case AdbPackage.LOOP_STATEMENT: return createLoopStatement();
      case AdbPackage.ITERATION_SCHEME: return createIterationScheme();
      case AdbPackage.LOOP_PARAMETER_SPECIFICATION: return createLoopParameterSpecification();
      case AdbPackage.BLOCK_STATEMENT: return createBlockStatement();
      case AdbPackage.EXIT_STATEMENT: return createExitStatement();
      case AdbPackage.GOTO_STATEMENT: return createGotoStatement();
      case AdbPackage.PROCEDURE_OR_ENTRY_CALL_STATEMENT: return createProcedureOrEntryCallStatement();
      case AdbPackage.SIMPLE_RETURN_STATEMENT: return createSimpleReturnStatement();
      case AdbPackage.EXTENDED_RETURN_STATEMENT: return createExtendedReturnStatement();
      case AdbPackage.RETURN_SUBTYPE_INDICATION: return createReturnSubtypeIndication();
      case AdbPackage.PACKAGE_BODY: return createPackageBody();
      case AdbPackage.TASK_DEFINITION: return createTaskDefinition();
      case AdbPackage.TASK_BODY: return createTaskBody();
      case AdbPackage.PROTECTED_BODY: return createProtectedBody();
      case AdbPackage.PROTECTED_OPERATION_ITEM: return createProtectedOperationItem();
      case AdbPackage.ACCEPT_STATEMENT: return createAcceptStatement();
      case AdbPackage.ENTRY_INDEX: return createEntryIndex();
      case AdbPackage.ENTRY_BODY: return createEntryBody();
      case AdbPackage.ENTRY_BODY_FORMAL_PART: return createEntryBodyFormalPart();
      case AdbPackage.ENTRY_BARRIER: return createEntryBarrier();
      case AdbPackage.ENTRY_INDEX_SPECIFICATION: return createEntryIndexSpecification();
      case AdbPackage.REQUEUE_STATEMENT: return createRequeueStatement();
      case AdbPackage.DELAY_STATEMENT: return createDelayStatement();
      case AdbPackage.SELECT_STATEMENT: return createSelectStatement();
      case AdbPackage.SELECTIVE_ACCEPT: return createSelectiveAccept();
      case AdbPackage.GUARDED_ALTERNATIVE: return createGuardedAlternative();
      case AdbPackage.GUARD: return createGuard();
      case AdbPackage.SELECT_ALTERNATIVE: return createSelectAlternative();
      case AdbPackage.ACCEPT_ALTERNATIVE: return createAcceptAlternative();
      case AdbPackage.DELAY_ALTERNATIVE: return createDelayAlternative();
      case AdbPackage.TIMED_ENTRY_CALL: return createTimedEntryCall();
      case AdbPackage.ENTRY_CALL_ALTERNATIVE: return createEntryCallAlternative();
      case AdbPackage.CONDITIONAL_ENTRY_CALL: return createConditionalEntryCall();
      case AdbPackage.ASYNCHRONOUS_SELECT: return createAsynchronousSelect();
      case AdbPackage.TRIGGERING_ALTERNATIVE: return createTriggeringAlternative();
      case AdbPackage.TRIGGERING_STATEMENT: return createTriggeringStatement();
      case AdbPackage.ABORTABLE_PART: return createAbortablePart();
      case AdbPackage.ABORT_STATEMENT: return createAbortStatement();
      case AdbPackage.TASK_NAMES: return createTaskNames();
      case AdbPackage.BODY_STUB: return createBodyStub();
      case AdbPackage.PACKAGE_BODY_STUB: return createPackageBodyStub();
      case AdbPackage.TASK_BODY_STUB: return createTaskBodyStub();
      case AdbPackage.PROTECTED_BODY_STUB: return createProtectedBodyStub();
      case AdbPackage.SEPARATE_SUBUNIT: return createSeparateSubunit();
      case AdbPackage.RAISE_STATEMENT: return createRaiseStatement();
      case AdbPackage.GENERIC_ACTUAL_PART: return createGenericActualPart();
      case AdbPackage.GENERIC_ASSOCIATION: return createGenericAssociation();
      case AdbPackage.EXPLICIT_GENERIC_ACTUAL_PARAMETER: return createExplicitGenericActualParameter();
      case AdbPackage.TYPE_DEFINITION: return createTypeDefinition();
      case AdbPackage.DISCRIMINANT_PART: return createDiscriminantPart();
      case AdbPackage.UNKNOWN_DISCRIMINANT_PART: return createUnknownDiscriminantPart();
      case AdbPackage.KNOWN_DISCRIMINANT_PART: return createKnownDiscriminantPart();
      case AdbPackage.DISCRIMINANT_SPECIFICATION: return createDiscriminantSpecification();
      case AdbPackage.INTERFACE_LIST: return createInterfaceList();
      case AdbPackage.INTERFACE_TYPE_DEFINITION: return createInterfaceTypeDefinition();
      case AdbPackage.DERIVED_TYPE_DEFINITION: return createDerivedTypeDefinition();
      case AdbPackage.RECORD_EXTENSION_PART: return createRecordExtensionPart();
      case AdbPackage.ACCESS_TYPE_DEFINITION: return createAccessTypeDefinition();
      case AdbPackage.ACCESS_SPECIFICATION: return createAccessSpecification();
      case AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION: return createAccessToSubprogramDefinition();
      case AdbPackage.ACCESS_TO_DATA_DEFINITION: return createAccessToDataDefinition();
      case AdbPackage.ARRAY_TYPE_DEFINITION: return createArrayTypeDefinition();
      case AdbPackage.ARRAY_INDEXES: return createArrayIndexes();
      case AdbPackage.UNCONSTRAINED_INDEXES: return createUnconstrainedIndexes();
      case AdbPackage.CONSTRAINED_INDEXES: return createConstrainedIndexes();
      case AdbPackage.DISCRETE_SUBTYPE_DEFINITION: return createDiscreteSubtypeDefinition();
      case AdbPackage.COMPONENT_DEFINITION: return createComponentDefinition();
      case AdbPackage.ANONYMOUS_ACCESS_DEFINITION: return createAnonymousAccessDefinition();
      case AdbPackage.NOT_NULL_ACCESS_DEFINITION: return createNotNullAccessDefinition();
      case AdbPackage.ACCESS_TO_DATA_INSTANCE: return createAccessToDataInstance();
      case AdbPackage.PARAMETER_AND_RESULT_PROFILE: return createParameterAndResultProfile();
      case AdbPackage.FORMAL_PART: return createFormalPart();
      case AdbPackage.PARAMETER_SPECIFICATION: return createParameterSpecification();
      case AdbPackage.MODE: return createMode();
      case AdbPackage.INTEGER_TYPE_DEFINITION: return createIntegerTypeDefinition();
      case AdbPackage.SIGNED_INTEGER_TYPE_DEFINITION: return createSignedIntegerTypeDefinition();
      case AdbPackage.MODULAR_TYPE_DEFINITION: return createModularTypeDefinition();
      case AdbPackage.ENUMERATION_TYPE_DEFINITION: return createEnumerationTypeDefinition();
      case AdbPackage.RECORD_TYPE_DEFINITION: return createRecordTypeDefinition();
      case AdbPackage.RECORD_DEFINITION: return createRecordDefinition();
      case AdbPackage.COMPONENT_LIST: return createComponentList();
      case AdbPackage.OPT_VARIANT_PART: return createOptVariantPart();
      case AdbPackage.COMPONENT_ITEM: return createComponentItem();
      case AdbPackage.COMPONENT_DECLARATION: return createComponentDeclaration();
      case AdbPackage.DEFINING_IDENTIFIER_LIST: return createDefiningIdentifierList();
      case AdbPackage.ASPECT_CLAUSE: return createAspectClause();
      case AdbPackage.MOD_CLAUSE: return createModClause();
      case AdbPackage.COMPONENT_CLAUSE: return createComponentClause();
      case AdbPackage.VARIANT_PART: return createVariantPart();
      case AdbPackage.VARIANT: return createVariant();
      case AdbPackage.DISCRETE_CHOICE_LIST: return createDiscreteChoiceList();
      case AdbPackage.REAL_TYPE_DEFINITION: return createRealTypeDefinition();
      case AdbPackage.FLOATING_POINT_DEFINITION: return createFloatingPointDefinition();
      case AdbPackage.REAL_RANGE_SPECIFICATION: return createRealRangeSpecification();
      case AdbPackage.FIXED_POINT_DEFINITION: return createFixedPointDefinition();
      case AdbPackage.EXPRESSION: return createExpression();
      case AdbPackage.RELATION: return createRelation();
      case AdbPackage.MEMBERSHIP: return createMembership();
      case AdbPackage.INTERVAL: return createInterval();
      case AdbPackage.SIMPLE_EXPRESSION: return createSimpleExpression();
      case AdbPackage.TERM: return createTerm();
      case AdbPackage.FACTOR: return createFactor();
      case AdbPackage.PRIMARY: return createPrimary();
      case AdbPackage.NUMERIC_LITERAL: return createNumericLiteral();
      case AdbPackage.NULL: return createNull();
      case AdbPackage.STRING_LITERAL: return createStringLiteral();
      case AdbPackage.QUALIFIED_NAME: return createQualifiedName();
      case AdbPackage.PARENTHESIZED_EXPRESSION: return createParenthesizedExpression();
      case AdbPackage.QUALIFIER: return createQualifier();
      case AdbPackage.ALLOCATOR: return createAllocator();
      case AdbPackage.SUBTYPE_INDICATION: return createSubtypeIndication();
      case AdbPackage.OPT_NULL_EXCLUSION: return createOptNullExclusion();
      case AdbPackage.OPT_CONSTRAINT: return createOptConstraint();
      case AdbPackage.SCALAR_CONSTRAINT: return createScalarConstraint();
      case AdbPackage.DIGITS_CONSTRAINT: return createDigitsConstraint();
      case AdbPackage.DELTA_CONSTRAINT: return createDeltaConstraint();
      case AdbPackage.RANGE_CONSTRAINT: return createRangeConstraint();
      case AdbPackage.COMPOSITE_CONSTRAINT: return createCompositeConstraint();
      case AdbPackage.DISCRIMINANT_CONSTRAINT: return createDiscriminantConstraint();
      case AdbPackage.INDEX_CONSTRAINT: return createIndexConstraint();
      case AdbPackage.DISCRIMINANT_ASSOCIATION: return createDiscriminantAssociation();
      case AdbPackage.DISCRIMINANT_SELECTORS: return createDiscriminantSelectors();
      case AdbPackage.DISCRETE_RANGE: return createDiscreteRange();
      case AdbPackage.COMPONENT_CHOICE_LIST: return createComponentChoiceList();
      case AdbPackage.DISCRETE_CHOICE: return createDiscreteChoice();
      case AdbPackage.AGGREGATE: return createAggregate();
      case AdbPackage.RECORD_AGGREGATE: return createRecordAggregate();
      case AdbPackage.RECORD_COMPONENT_ASSOCIATION_LIST: return createRecordComponentAssociationList();
      case AdbPackage.RECORD_COMPONENT_ASSOCIATION: return createRecordComponentAssociation();
      case AdbPackage.INITIALIZED_COMPONENTS: return createInitializedComponents();
      case AdbPackage.UNINITIALIZED_COMPONENTS: return createUninitializedComponents();
      case AdbPackage.EXTENSION_AGGREGATE: return createExtensionAggregate();
      case AdbPackage.ARRAY_AGGREGATE: return createArrayAggregate();
      case AdbPackage.POSITIONAL_ARRAY_AGGREGATE: return createPositionalArrayAggregate();
      case AdbPackage.NAMED_ARRAY_AGGREGATE: return createNamedArrayAggregate();
      case AdbPackage.ARRAY_COMPONENT_ASSOCIATION: return createArrayComponentAssociation();
      case AdbPackage.ANCESTOR_PART: return createAncestorPart();
      case AdbPackage.NAME: return createName();
      case AdbPackage.PRIMARY_NAME: return createPrimaryName();
      case AdbPackage.PARAMETER_ASSOCIATION: return createParameterAssociation();
      case AdbPackage.PARAMETER_EFFECTIVE_VALUE: return createParameterEffectiveValue();
      case AdbPackage.ATTRIBUTE_DESIGNATOR: return createAttributeDesignator();
      case AdbPackage.RANGE: return createRange();
      case AdbPackage.ENTITY_RANGE: return createEntityRange();
      case AdbPackage.EXPLICIT_RANGE: return createExplicitRange();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Compilation createCompilation()
  {
    CompilationImpl compilation = new CompilationImpl();
    return compilation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompilationUnit createCompilationUnit()
  {
    CompilationUnitImpl compilationUnit = new CompilationUnitImpl();
    return compilationUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unit createUnit()
  {
    UnitImpl unit = new UnitImpl();
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextClause createContextClause()
  {
    ContextClauseImpl contextClause = new ContextClauseImpl();
    return contextClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextItem createContextItem()
  {
    ContextItemImpl contextItem = new ContextItemImpl();
    return contextItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithClause createWithClause()
  {
    WithClauseImpl withClause = new WithClauseImpl();
    return withClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseClause createUseClause()
  {
    UseClauseImpl useClause = new UseClauseImpl();
    return useClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UsePackageClause createUsePackageClause()
  {
    UsePackageClauseImpl usePackageClause = new UsePackageClauseImpl();
    return usePackageClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseTypeClause createUseTypeClause()
  {
    UseTypeClauseImpl useTypeClause = new UseTypeClauseImpl();
    return useTypeClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LibraryUnitDeclaration createLibraryUnitDeclaration()
  {
    LibraryUnitDeclarationImpl libraryUnitDeclaration = new LibraryUnitDeclarationImpl();
    return libraryUnitDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LibraryUnitSpecification createLibraryUnitSpecification()
  {
    LibraryUnitSpecificationImpl libraryUnitSpecification = new LibraryUnitSpecificationImpl();
    return libraryUnitSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDefinition createPackageDefinition()
  {
    PackageDefinitionImpl packageDefinition = new PackageDefinitionImpl();
    return packageDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Renaming createRenaming()
  {
    RenamingImpl renaming = new RenamingImpl();
    return renaming;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericDeclaration createGenericDeclaration()
  {
    GenericDeclarationImpl genericDeclaration = new GenericDeclarationImpl();
    return genericDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericInstantiation createGenericInstantiation()
  {
    GenericInstantiationImpl genericInstantiation = new GenericInstantiationImpl();
    return genericInstantiation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageSpecification createPackageSpecification()
  {
    PackageSpecificationImpl packageSpecification = new PackageSpecificationImpl();
    return packageSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubprogramBody createSubprogramBody()
  {
    SubprogramBodyImpl subprogramBody = new SubprogramBodyImpl();
    return subprogramBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclarativeBlock createDeclarativeBlock()
  {
    DeclarativeBlockImpl declarativeBlock = new DeclarativeBlockImpl();
    return declarativeBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicDeclarativeItem createBasicDeclarativeItem()
  {
    BasicDeclarativeItemImpl basicDeclarativeItem = new BasicDeclarativeItemImpl();
    return basicDeclarativeItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicDeclaration createBasicDeclaration()
  {
    BasicDeclarationImpl basicDeclaration = new BasicDeclarationImpl();
    return basicDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskDeclaration createTaskDeclaration()
  {
    TaskDeclarationImpl taskDeclaration = new TaskDeclarationImpl();
    return taskDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDeclaration createTypeDeclaration()
  {
    TypeDeclarationImpl typeDeclaration = new TypeDeclarationImpl();
    return typeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewTypeDeclaration createNewTypeDeclaration()
  {
    NewTypeDeclarationImpl newTypeDeclaration = new NewTypeDeclarationImpl();
    return newTypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FullTypeDeclaration createFullTypeDeclaration()
  {
    FullTypeDeclarationImpl fullTypeDeclaration = new FullTypeDeclarationImpl();
    return fullTypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FullDataTypeDeclaration createFullDataTypeDeclaration()
  {
    FullDataTypeDeclarationImpl fullDataTypeDeclaration = new FullDataTypeDeclarationImpl();
    return fullDataTypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncompleteTypeDeclaration createIncompleteTypeDeclaration()
  {
    IncompleteTypeDeclarationImpl incompleteTypeDeclaration = new IncompleteTypeDeclarationImpl();
    return incompleteTypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrivateTypeDeclaration createPrivateTypeDeclaration()
  {
    PrivateTypeDeclarationImpl privateTypeDeclaration = new PrivateTypeDeclarationImpl();
    return privateTypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrivateExtensionDeclaration createPrivateExtensionDeclaration()
  {
    PrivateExtensionDeclarationImpl privateExtensionDeclaration = new PrivateExtensionDeclarationImpl();
    return privateExtensionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskItem createTaskItem()
  {
    TaskItemImpl taskItem = new TaskItemImpl();
    return taskItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntryDeclaration createEntryDeclaration()
  {
    EntryDeclarationImpl entryDeclaration = new EntryDeclarationImpl();
    return entryDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OverridingIndicator createOverridingIndicator()
  {
    OverridingIndicatorImpl overridingIndicator = new OverridingIndicatorImpl();
    return overridingIndicator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtectedTypeDeclaration createProtectedTypeDeclaration()
  {
    ProtectedTypeDeclarationImpl protectedTypeDeclaration = new ProtectedTypeDeclarationImpl();
    return protectedTypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtectedDefinition createProtectedDefinition()
  {
    ProtectedDefinitionImpl protectedDefinition = new ProtectedDefinitionImpl();
    return protectedDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtectedElementDeclaration createProtectedElementDeclaration()
  {
    ProtectedElementDeclarationImpl protectedElementDeclaration = new ProtectedElementDeclarationImpl();
    return protectedElementDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtectedOperationDeclaration createProtectedOperationDeclaration()
  {
    ProtectedOperationDeclarationImpl protectedOperationDeclaration = new ProtectedOperationDeclarationImpl();
    return protectedOperationDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubprogramDeclaration createSubprogramDeclaration()
  {
    SubprogramDeclarationImpl subprogramDeclaration = new SubprogramDeclarationImpl();
    return subprogramDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubprogramSpecification createSubprogramSpecification()
  {
    SubprogramSpecificationImpl subprogramSpecification = new SubprogramSpecificationImpl();
    return subprogramSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureSpecification createProcedureSpecification()
  {
    ProcedureSpecificationImpl procedureSpecification = new ProcedureSpecificationImpl();
    return procedureSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionSpecification createFunctionSpecification()
  {
    FunctionSpecificationImpl functionSpecification = new FunctionSpecificationImpl();
    return functionSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HandledSequenceOfStatements createHandledSequenceOfStatements()
  {
    HandledSequenceOfStatementsImpl handledSequenceOfStatements = new HandledSequenceOfStatementsImpl();
    return handledSequenceOfStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExceptionChoice createExceptionChoice()
  {
    ExceptionChoiceImpl exceptionChoice = new ExceptionChoiceImpl();
    return exceptionChoice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExceptionHandler createExceptionHandler()
  {
    ExceptionHandlerImpl exceptionHandler = new ExceptionHandlerImpl();
    return exceptionHandler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclarativeItem createDeclarativeItem()
  {
    DeclarativeItemImpl declarativeItem = new DeclarativeItemImpl();
    return declarativeItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body createBody()
  {
    BodyImpl body = new BodyImpl();
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProperBody createProperBody()
  {
    ProperBodyImpl properBody = new ProperBodyImpl();
    return properBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label createLabel()
  {
    LabelImpl label = new LabelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceOfStatements createSequenceOfStatements()
  {
    SequenceOfStatementsImpl sequenceOfStatements = new SequenceOfStatementsImpl();
    return sequenceOfStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelisableStatement createLabelisableStatement()
  {
    LabelisableStatementImpl labelisableStatement = new LabelisableStatementImpl();
    return labelisableStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleStatement createSimpleStatement()
  {
    SimpleStatementImpl simpleStatement = new SimpleStatementImpl();
    return simpleStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompoundStatement createCompoundStatement()
  {
    CompoundStatementImpl compoundStatement = new CompoundStatementImpl();
    return compoundStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullStatement createNullStatement()
  {
    NullStatementImpl nullStatement = new NullStatementImpl();
    return nullStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LibrarySpecification createLibrarySpecification()
  {
    LibrarySpecificationImpl librarySpecification = new LibrarySpecificationImpl();
    return librarySpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericItems createGenericItems()
  {
    GenericItemsImpl genericItems = new GenericItemsImpl();
    return genericItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericItem createGenericItem()
  {
    GenericItemImpl genericItem = new GenericItemImpl();
    return genericItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericFormalParameterDeclaration createGenericFormalParameterDeclaration()
  {
    GenericFormalParameterDeclarationImpl genericFormalParameterDeclaration = new GenericFormalParameterDeclarationImpl();
    return genericFormalParameterDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalObjectDeclaration createFormalObjectDeclaration()
  {
    FormalObjectDeclarationImpl formalObjectDeclaration = new FormalObjectDeclarationImpl();
    return formalObjectDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalTypeDeclaration createFormalTypeDeclaration()
  {
    FormalTypeDeclarationImpl formalTypeDeclaration = new FormalTypeDeclarationImpl();
    return formalTypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalTypeDefinition createFormalTypeDefinition()
  {
    FormalTypeDefinitionImpl formalTypeDefinition = new FormalTypeDefinitionImpl();
    return formalTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalPrivateTypeDefinition createFormalPrivateTypeDefinition()
  {
    FormalPrivateTypeDefinitionImpl formalPrivateTypeDefinition = new FormalPrivateTypeDefinitionImpl();
    return formalPrivateTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalDerivedTypeDefinition createFormalDerivedTypeDefinition()
  {
    FormalDerivedTypeDefinitionImpl formalDerivedTypeDefinition = new FormalDerivedTypeDefinitionImpl();
    return formalDerivedTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalSubprogramDeclaration createFormalSubprogramDeclaration()
  {
    FormalSubprogramDeclarationImpl formalSubprogramDeclaration = new FormalSubprogramDeclarationImpl();
    return formalSubprogramDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubprogramDefault createSubprogramDefault()
  {
    SubprogramDefaultImpl subprogramDefault = new SubprogramDefaultImpl();
    return subprogramDefault;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalPackageDeclaration createFormalPackageDeclaration()
  {
    FormalPackageDeclarationImpl formalPackageDeclaration = new FormalPackageDeclarationImpl();
    return formalPackageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalPackageActualPart createFormalPackageActualPart()
  {
    FormalPackageActualPartImpl formalPackageActualPart = new FormalPackageActualPartImpl();
    return formalPackageActualPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalPackageAssociation createFormalPackageAssociation()
  {
    FormalPackageAssociationImpl formalPackageAssociation = new FormalPackageAssociationImpl();
    return formalPackageAssociation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExceptionDeclaration createExceptionDeclaration()
  {
    ExceptionDeclarationImpl exceptionDeclaration = new ExceptionDeclarationImpl();
    return exceptionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectDeclaration createObjectDeclaration()
  {
    ObjectDeclarationImpl objectDeclaration = new ObjectDeclarationImpl();
    return objectDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataInstanceDeclaration createDataInstanceDeclaration()
  {
    DataInstanceDeclarationImpl dataInstanceDeclaration = new DataInstanceDeclarationImpl();
    return dataInstanceDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleProtectedDeclaration createSingleProtectedDeclaration()
  {
    SingleProtectedDeclarationImpl singleProtectedDeclaration = new SingleProtectedDeclarationImpl();
    return singleProtectedDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pragma createPragma()
  {
    PragmaImpl pragma = new PragmaImpl();
    return pragma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PragmaArgumentAssociation createPragmaArgumentAssociation()
  {
    PragmaArgumentAssociationImpl pragmaArgumentAssociation = new PragmaArgumentAssociationImpl();
    return pragmaArgumentAssociation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubtypeDeclaration createSubtypeDeclaration()
  {
    SubtypeDeclarationImpl subtypeDeclaration = new SubtypeDeclarationImpl();
    return subtypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberDeclaration createNumberDeclaration()
  {
    NumberDeclarationImpl numberDeclaration = new NumberDeclarationImpl();
    return numberDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentStatement createAssignmentStatement()
  {
    AssignmentStatementImpl assignmentStatement = new AssignmentStatementImpl();
    return assignmentStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatement createIfStatement()
  {
    IfStatementImpl ifStatement = new IfStatementImpl();
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaseStatement createCaseStatement()
  {
    CaseStatementImpl caseStatement = new CaseStatementImpl();
    return caseStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaseStatementAlternative createCaseStatementAlternative()
  {
    CaseStatementAlternativeImpl caseStatementAlternative = new CaseStatementAlternativeImpl();
    return caseStatementAlternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopStatement createLoopStatement()
  {
    LoopStatementImpl loopStatement = new LoopStatementImpl();
    return loopStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IterationScheme createIterationScheme()
  {
    IterationSchemeImpl iterationScheme = new IterationSchemeImpl();
    return iterationScheme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopParameterSpecification createLoopParameterSpecification()
  {
    LoopParameterSpecificationImpl loopParameterSpecification = new LoopParameterSpecificationImpl();
    return loopParameterSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockStatement createBlockStatement()
  {
    BlockStatementImpl blockStatement = new BlockStatementImpl();
    return blockStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExitStatement createExitStatement()
  {
    ExitStatementImpl exitStatement = new ExitStatementImpl();
    return exitStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GotoStatement createGotoStatement()
  {
    GotoStatementImpl gotoStatement = new GotoStatementImpl();
    return gotoStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureOrEntryCallStatement createProcedureOrEntryCallStatement()
  {
    ProcedureOrEntryCallStatementImpl procedureOrEntryCallStatement = new ProcedureOrEntryCallStatementImpl();
    return procedureOrEntryCallStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleReturnStatement createSimpleReturnStatement()
  {
    SimpleReturnStatementImpl simpleReturnStatement = new SimpleReturnStatementImpl();
    return simpleReturnStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendedReturnStatement createExtendedReturnStatement()
  {
    ExtendedReturnStatementImpl extendedReturnStatement = new ExtendedReturnStatementImpl();
    return extendedReturnStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnSubtypeIndication createReturnSubtypeIndication()
  {
    ReturnSubtypeIndicationImpl returnSubtypeIndication = new ReturnSubtypeIndicationImpl();
    return returnSubtypeIndication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageBody createPackageBody()
  {
    PackageBodyImpl packageBody = new PackageBodyImpl();
    return packageBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskDefinition createTaskDefinition()
  {
    TaskDefinitionImpl taskDefinition = new TaskDefinitionImpl();
    return taskDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskBody createTaskBody()
  {
    TaskBodyImpl taskBody = new TaskBodyImpl();
    return taskBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtectedBody createProtectedBody()
  {
    ProtectedBodyImpl protectedBody = new ProtectedBodyImpl();
    return protectedBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtectedOperationItem createProtectedOperationItem()
  {
    ProtectedOperationItemImpl protectedOperationItem = new ProtectedOperationItemImpl();
    return protectedOperationItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AcceptStatement createAcceptStatement()
  {
    AcceptStatementImpl acceptStatement = new AcceptStatementImpl();
    return acceptStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntryIndex createEntryIndex()
  {
    EntryIndexImpl entryIndex = new EntryIndexImpl();
    return entryIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntryBody createEntryBody()
  {
    EntryBodyImpl entryBody = new EntryBodyImpl();
    return entryBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntryBodyFormalPart createEntryBodyFormalPart()
  {
    EntryBodyFormalPartImpl entryBodyFormalPart = new EntryBodyFormalPartImpl();
    return entryBodyFormalPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntryBarrier createEntryBarrier()
  {
    EntryBarrierImpl entryBarrier = new EntryBarrierImpl();
    return entryBarrier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntryIndexSpecification createEntryIndexSpecification()
  {
    EntryIndexSpecificationImpl entryIndexSpecification = new EntryIndexSpecificationImpl();
    return entryIndexSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequeueStatement createRequeueStatement()
  {
    RequeueStatementImpl requeueStatement = new RequeueStatementImpl();
    return requeueStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DelayStatement createDelayStatement()
  {
    DelayStatementImpl delayStatement = new DelayStatementImpl();
    return delayStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectStatement createSelectStatement()
  {
    SelectStatementImpl selectStatement = new SelectStatementImpl();
    return selectStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectiveAccept createSelectiveAccept()
  {
    SelectiveAcceptImpl selectiveAccept = new SelectiveAcceptImpl();
    return selectiveAccept;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuardedAlternative createGuardedAlternative()
  {
    GuardedAlternativeImpl guardedAlternative = new GuardedAlternativeImpl();
    return guardedAlternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Guard createGuard()
  {
    GuardImpl guard = new GuardImpl();
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectAlternative createSelectAlternative()
  {
    SelectAlternativeImpl selectAlternative = new SelectAlternativeImpl();
    return selectAlternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AcceptAlternative createAcceptAlternative()
  {
    AcceptAlternativeImpl acceptAlternative = new AcceptAlternativeImpl();
    return acceptAlternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DelayAlternative createDelayAlternative()
  {
    DelayAlternativeImpl delayAlternative = new DelayAlternativeImpl();
    return delayAlternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimedEntryCall createTimedEntryCall()
  {
    TimedEntryCallImpl timedEntryCall = new TimedEntryCallImpl();
    return timedEntryCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntryCallAlternative createEntryCallAlternative()
  {
    EntryCallAlternativeImpl entryCallAlternative = new EntryCallAlternativeImpl();
    return entryCallAlternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalEntryCall createConditionalEntryCall()
  {
    ConditionalEntryCallImpl conditionalEntryCall = new ConditionalEntryCallImpl();
    return conditionalEntryCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AsynchronousSelect createAsynchronousSelect()
  {
    AsynchronousSelectImpl asynchronousSelect = new AsynchronousSelectImpl();
    return asynchronousSelect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TriggeringAlternative createTriggeringAlternative()
  {
    TriggeringAlternativeImpl triggeringAlternative = new TriggeringAlternativeImpl();
    return triggeringAlternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TriggeringStatement createTriggeringStatement()
  {
    TriggeringStatementImpl triggeringStatement = new TriggeringStatementImpl();
    return triggeringStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbortablePart createAbortablePart()
  {
    AbortablePartImpl abortablePart = new AbortablePartImpl();
    return abortablePart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbortStatement createAbortStatement()
  {
    AbortStatementImpl abortStatement = new AbortStatementImpl();
    return abortStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskNames createTaskNames()
  {
    TaskNamesImpl taskNames = new TaskNamesImpl();
    return taskNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyStub createBodyStub()
  {
    BodyStubImpl bodyStub = new BodyStubImpl();
    return bodyStub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageBodyStub createPackageBodyStub()
  {
    PackageBodyStubImpl packageBodyStub = new PackageBodyStubImpl();
    return packageBodyStub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskBodyStub createTaskBodyStub()
  {
    TaskBodyStubImpl taskBodyStub = new TaskBodyStubImpl();
    return taskBodyStub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtectedBodyStub createProtectedBodyStub()
  {
    ProtectedBodyStubImpl protectedBodyStub = new ProtectedBodyStubImpl();
    return protectedBodyStub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeparateSubunit createSeparateSubunit()
  {
    SeparateSubunitImpl separateSubunit = new SeparateSubunitImpl();
    return separateSubunit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RaiseStatement createRaiseStatement()
  {
    RaiseStatementImpl raiseStatement = new RaiseStatementImpl();
    return raiseStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericActualPart createGenericActualPart()
  {
    GenericActualPartImpl genericActualPart = new GenericActualPartImpl();
    return genericActualPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericAssociation createGenericAssociation()
  {
    GenericAssociationImpl genericAssociation = new GenericAssociationImpl();
    return genericAssociation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExplicitGenericActualParameter createExplicitGenericActualParameter()
  {
    ExplicitGenericActualParameterImpl explicitGenericActualParameter = new ExplicitGenericActualParameterImpl();
    return explicitGenericActualParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDefinition createTypeDefinition()
  {
    TypeDefinitionImpl typeDefinition = new TypeDefinitionImpl();
    return typeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiscriminantPart createDiscriminantPart()
  {
    DiscriminantPartImpl discriminantPart = new DiscriminantPartImpl();
    return discriminantPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnknownDiscriminantPart createUnknownDiscriminantPart()
  {
    UnknownDiscriminantPartImpl unknownDiscriminantPart = new UnknownDiscriminantPartImpl();
    return unknownDiscriminantPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KnownDiscriminantPart createKnownDiscriminantPart()
  {
    KnownDiscriminantPartImpl knownDiscriminantPart = new KnownDiscriminantPartImpl();
    return knownDiscriminantPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiscriminantSpecification createDiscriminantSpecification()
  {
    DiscriminantSpecificationImpl discriminantSpecification = new DiscriminantSpecificationImpl();
    return discriminantSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceList createInterfaceList()
  {
    InterfaceListImpl interfaceList = new InterfaceListImpl();
    return interfaceList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceTypeDefinition createInterfaceTypeDefinition()
  {
    InterfaceTypeDefinitionImpl interfaceTypeDefinition = new InterfaceTypeDefinitionImpl();
    return interfaceTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DerivedTypeDefinition createDerivedTypeDefinition()
  {
    DerivedTypeDefinitionImpl derivedTypeDefinition = new DerivedTypeDefinitionImpl();
    return derivedTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordExtensionPart createRecordExtensionPart()
  {
    RecordExtensionPartImpl recordExtensionPart = new RecordExtensionPartImpl();
    return recordExtensionPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessTypeDefinition createAccessTypeDefinition()
  {
    AccessTypeDefinitionImpl accessTypeDefinition = new AccessTypeDefinitionImpl();
    return accessTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessSpecification createAccessSpecification()
  {
    AccessSpecificationImpl accessSpecification = new AccessSpecificationImpl();
    return accessSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessToSubprogramDefinition createAccessToSubprogramDefinition()
  {
    AccessToSubprogramDefinitionImpl accessToSubprogramDefinition = new AccessToSubprogramDefinitionImpl();
    return accessToSubprogramDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessToDataDefinition createAccessToDataDefinition()
  {
    AccessToDataDefinitionImpl accessToDataDefinition = new AccessToDataDefinitionImpl();
    return accessToDataDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayTypeDefinition createArrayTypeDefinition()
  {
    ArrayTypeDefinitionImpl arrayTypeDefinition = new ArrayTypeDefinitionImpl();
    return arrayTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayIndexes createArrayIndexes()
  {
    ArrayIndexesImpl arrayIndexes = new ArrayIndexesImpl();
    return arrayIndexes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnconstrainedIndexes createUnconstrainedIndexes()
  {
    UnconstrainedIndexesImpl unconstrainedIndexes = new UnconstrainedIndexesImpl();
    return unconstrainedIndexes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstrainedIndexes createConstrainedIndexes()
  {
    ConstrainedIndexesImpl constrainedIndexes = new ConstrainedIndexesImpl();
    return constrainedIndexes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiscreteSubtypeDefinition createDiscreteSubtypeDefinition()
  {
    DiscreteSubtypeDefinitionImpl discreteSubtypeDefinition = new DiscreteSubtypeDefinitionImpl();
    return discreteSubtypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDefinition createComponentDefinition()
  {
    ComponentDefinitionImpl componentDefinition = new ComponentDefinitionImpl();
    return componentDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnonymousAccessDefinition createAnonymousAccessDefinition()
  {
    AnonymousAccessDefinitionImpl anonymousAccessDefinition = new AnonymousAccessDefinitionImpl();
    return anonymousAccessDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotNullAccessDefinition createNotNullAccessDefinition()
  {
    NotNullAccessDefinitionImpl notNullAccessDefinition = new NotNullAccessDefinitionImpl();
    return notNullAccessDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessToDataInstance createAccessToDataInstance()
  {
    AccessToDataInstanceImpl accessToDataInstance = new AccessToDataInstanceImpl();
    return accessToDataInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterAndResultProfile createParameterAndResultProfile()
  {
    ParameterAndResultProfileImpl parameterAndResultProfile = new ParameterAndResultProfileImpl();
    return parameterAndResultProfile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalPart createFormalPart()
  {
    FormalPartImpl formalPart = new FormalPartImpl();
    return formalPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterSpecification createParameterSpecification()
  {
    ParameterSpecificationImpl parameterSpecification = new ParameterSpecificationImpl();
    return parameterSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mode createMode()
  {
    ModeImpl mode = new ModeImpl();
    return mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerTypeDefinition createIntegerTypeDefinition()
  {
    IntegerTypeDefinitionImpl integerTypeDefinition = new IntegerTypeDefinitionImpl();
    return integerTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignedIntegerTypeDefinition createSignedIntegerTypeDefinition()
  {
    SignedIntegerTypeDefinitionImpl signedIntegerTypeDefinition = new SignedIntegerTypeDefinitionImpl();
    return signedIntegerTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModularTypeDefinition createModularTypeDefinition()
  {
    ModularTypeDefinitionImpl modularTypeDefinition = new ModularTypeDefinitionImpl();
    return modularTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationTypeDefinition createEnumerationTypeDefinition()
  {
    EnumerationTypeDefinitionImpl enumerationTypeDefinition = new EnumerationTypeDefinitionImpl();
    return enumerationTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordTypeDefinition createRecordTypeDefinition()
  {
    RecordTypeDefinitionImpl recordTypeDefinition = new RecordTypeDefinitionImpl();
    return recordTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordDefinition createRecordDefinition()
  {
    RecordDefinitionImpl recordDefinition = new RecordDefinitionImpl();
    return recordDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentList createComponentList()
  {
    ComponentListImpl componentList = new ComponentListImpl();
    return componentList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptVariantPart createOptVariantPart()
  {
    OptVariantPartImpl optVariantPart = new OptVariantPartImpl();
    return optVariantPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentItem createComponentItem()
  {
    ComponentItemImpl componentItem = new ComponentItemImpl();
    return componentItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDeclaration createComponentDeclaration()
  {
    ComponentDeclarationImpl componentDeclaration = new ComponentDeclarationImpl();
    return componentDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefiningIdentifierList createDefiningIdentifierList()
  {
    DefiningIdentifierListImpl definingIdentifierList = new DefiningIdentifierListImpl();
    return definingIdentifierList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AspectClause createAspectClause()
  {
    AspectClauseImpl aspectClause = new AspectClauseImpl();
    return aspectClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModClause createModClause()
  {
    ModClauseImpl modClause = new ModClauseImpl();
    return modClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentClause createComponentClause()
  {
    ComponentClauseImpl componentClause = new ComponentClauseImpl();
    return componentClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariantPart createVariantPart()
  {
    VariantPartImpl variantPart = new VariantPartImpl();
    return variantPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variant createVariant()
  {
    VariantImpl variant = new VariantImpl();
    return variant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiscreteChoiceList createDiscreteChoiceList()
  {
    DiscreteChoiceListImpl discreteChoiceList = new DiscreteChoiceListImpl();
    return discreteChoiceList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealTypeDefinition createRealTypeDefinition()
  {
    RealTypeDefinitionImpl realTypeDefinition = new RealTypeDefinitionImpl();
    return realTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatingPointDefinition createFloatingPointDefinition()
  {
    FloatingPointDefinitionImpl floatingPointDefinition = new FloatingPointDefinitionImpl();
    return floatingPointDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealRangeSpecification createRealRangeSpecification()
  {
    RealRangeSpecificationImpl realRangeSpecification = new RealRangeSpecificationImpl();
    return realRangeSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FixedPointDefinition createFixedPointDefinition()
  {
    FixedPointDefinitionImpl fixedPointDefinition = new FixedPointDefinitionImpl();
    return fixedPointDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relation createRelation()
  {
    RelationImpl relation = new RelationImpl();
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Membership createMembership()
  {
    MembershipImpl membership = new MembershipImpl();
    return membership;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interval createInterval()
  {
    IntervalImpl interval = new IntervalImpl();
    return interval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleExpression createSimpleExpression()
  {
    SimpleExpressionImpl simpleExpression = new SimpleExpressionImpl();
    return simpleExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term createTerm()
  {
    TermImpl term = new TermImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Factor createFactor()
  {
    FactorImpl factor = new FactorImpl();
    return factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primary createPrimary()
  {
    PrimaryImpl primary = new PrimaryImpl();
    return primary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericLiteral createNumericLiteral()
  {
    NumericLiteralImpl numericLiteral = new NumericLiteralImpl();
    return numericLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Null createNull()
  {
    NullImpl null_ = new NullImpl();
    return null_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedName createQualifiedName()
  {
    QualifiedNameImpl qualifiedName = new QualifiedNameImpl();
    return qualifiedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParenthesizedExpression createParenthesizedExpression()
  {
    ParenthesizedExpressionImpl parenthesizedExpression = new ParenthesizedExpressionImpl();
    return parenthesizedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Qualifier createQualifier()
  {
    QualifierImpl qualifier = new QualifierImpl();
    return qualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Allocator createAllocator()
  {
    AllocatorImpl allocator = new AllocatorImpl();
    return allocator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubtypeIndication createSubtypeIndication()
  {
    SubtypeIndicationImpl subtypeIndication = new SubtypeIndicationImpl();
    return subtypeIndication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptNullExclusion createOptNullExclusion()
  {
    OptNullExclusionImpl optNullExclusion = new OptNullExclusionImpl();
    return optNullExclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptConstraint createOptConstraint()
  {
    OptConstraintImpl optConstraint = new OptConstraintImpl();
    return optConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarConstraint createScalarConstraint()
  {
    ScalarConstraintImpl scalarConstraint = new ScalarConstraintImpl();
    return scalarConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DigitsConstraint createDigitsConstraint()
  {
    DigitsConstraintImpl digitsConstraint = new DigitsConstraintImpl();
    return digitsConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeltaConstraint createDeltaConstraint()
  {
    DeltaConstraintImpl deltaConstraint = new DeltaConstraintImpl();
    return deltaConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeConstraint createRangeConstraint()
  {
    RangeConstraintImpl rangeConstraint = new RangeConstraintImpl();
    return rangeConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeConstraint createCompositeConstraint()
  {
    CompositeConstraintImpl compositeConstraint = new CompositeConstraintImpl();
    return compositeConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiscriminantConstraint createDiscriminantConstraint()
  {
    DiscriminantConstraintImpl discriminantConstraint = new DiscriminantConstraintImpl();
    return discriminantConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndexConstraint createIndexConstraint()
  {
    IndexConstraintImpl indexConstraint = new IndexConstraintImpl();
    return indexConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiscriminantAssociation createDiscriminantAssociation()
  {
    DiscriminantAssociationImpl discriminantAssociation = new DiscriminantAssociationImpl();
    return discriminantAssociation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiscriminantSelectors createDiscriminantSelectors()
  {
    DiscriminantSelectorsImpl discriminantSelectors = new DiscriminantSelectorsImpl();
    return discriminantSelectors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiscreteRange createDiscreteRange()
  {
    DiscreteRangeImpl discreteRange = new DiscreteRangeImpl();
    return discreteRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentChoiceList createComponentChoiceList()
  {
    ComponentChoiceListImpl componentChoiceList = new ComponentChoiceListImpl();
    return componentChoiceList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiscreteChoice createDiscreteChoice()
  {
    DiscreteChoiceImpl discreteChoice = new DiscreteChoiceImpl();
    return discreteChoice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aggregate createAggregate()
  {
    AggregateImpl aggregate = new AggregateImpl();
    return aggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordAggregate createRecordAggregate()
  {
    RecordAggregateImpl recordAggregate = new RecordAggregateImpl();
    return recordAggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordComponentAssociationList createRecordComponentAssociationList()
  {
    RecordComponentAssociationListImpl recordComponentAssociationList = new RecordComponentAssociationListImpl();
    return recordComponentAssociationList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordComponentAssociation createRecordComponentAssociation()
  {
    RecordComponentAssociationImpl recordComponentAssociation = new RecordComponentAssociationImpl();
    return recordComponentAssociation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitializedComponents createInitializedComponents()
  {
    InitializedComponentsImpl initializedComponents = new InitializedComponentsImpl();
    return initializedComponents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UninitializedComponents createUninitializedComponents()
  {
    UninitializedComponentsImpl uninitializedComponents = new UninitializedComponentsImpl();
    return uninitializedComponents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtensionAggregate createExtensionAggregate()
  {
    ExtensionAggregateImpl extensionAggregate = new ExtensionAggregateImpl();
    return extensionAggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayAggregate createArrayAggregate()
  {
    ArrayAggregateImpl arrayAggregate = new ArrayAggregateImpl();
    return arrayAggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PositionalArrayAggregate createPositionalArrayAggregate()
  {
    PositionalArrayAggregateImpl positionalArrayAggregate = new PositionalArrayAggregateImpl();
    return positionalArrayAggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedArrayAggregate createNamedArrayAggregate()
  {
    NamedArrayAggregateImpl namedArrayAggregate = new NamedArrayAggregateImpl();
    return namedArrayAggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayComponentAssociation createArrayComponentAssociation()
  {
    ArrayComponentAssociationImpl arrayComponentAssociation = new ArrayComponentAssociationImpl();
    return arrayComponentAssociation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AncestorPart createAncestorPart()
  {
    AncestorPartImpl ancestorPart = new AncestorPartImpl();
    return ancestorPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name createName()
  {
    NameImpl name = new NameImpl();
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryName createPrimaryName()
  {
    PrimaryNameImpl primaryName = new PrimaryNameImpl();
    return primaryName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterAssociation createParameterAssociation()
  {
    ParameterAssociationImpl parameterAssociation = new ParameterAssociationImpl();
    return parameterAssociation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterEffectiveValue createParameterEffectiveValue()
  {
    ParameterEffectiveValueImpl parameterEffectiveValue = new ParameterEffectiveValueImpl();
    return parameterEffectiveValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeDesignator createAttributeDesignator()
  {
    AttributeDesignatorImpl attributeDesignator = new AttributeDesignatorImpl();
    return attributeDesignator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Range createRange()
  {
    RangeImpl range = new RangeImpl();
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityRange createEntityRange()
  {
    EntityRangeImpl entityRange = new EntityRangeImpl();
    return entityRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExplicitRange createExplicitRange()
  {
    ExplicitRangeImpl explicitRange = new ExplicitRangeImpl();
    return explicitRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdbPackage getAdbPackage()
  {
    return (AdbPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AdbPackage getPackage()
  {
    return AdbPackage.eINSTANCE;
  }

} //AdbFactoryImpl
