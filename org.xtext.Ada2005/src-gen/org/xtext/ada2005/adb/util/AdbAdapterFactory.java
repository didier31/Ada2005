/**
 */
package org.xtext.ada2005.adb.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.ada2005.adb.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.ada2005.adb.AdbPackage
 * @generated
 */
public class AdbAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AdbPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdbAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AdbPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdbSwitch<Adapter> modelSwitch =
    new AdbSwitch<Adapter>()
    {
      @Override
      public Adapter caseCompilation(Compilation object)
      {
        return createCompilationAdapter();
      }
      @Override
      public Adapter caseCompilationUnit(CompilationUnit object)
      {
        return createCompilationUnitAdapter();
      }
      @Override
      public Adapter caseUnit(Unit object)
      {
        return createUnitAdapter();
      }
      @Override
      public Adapter caseContextClause(ContextClause object)
      {
        return createContextClauseAdapter();
      }
      @Override
      public Adapter caseContextItem(ContextItem object)
      {
        return createContextItemAdapter();
      }
      @Override
      public Adapter caseWithClause(WithClause object)
      {
        return createWithClauseAdapter();
      }
      @Override
      public Adapter caseUseClause(UseClause object)
      {
        return createUseClauseAdapter();
      }
      @Override
      public Adapter caseUsePackageClause(UsePackageClause object)
      {
        return createUsePackageClauseAdapter();
      }
      @Override
      public Adapter caseUseTypeClause(UseTypeClause object)
      {
        return createUseTypeClauseAdapter();
      }
      @Override
      public Adapter caseLibraryUnitDeclaration(LibraryUnitDeclaration object)
      {
        return createLibraryUnitDeclarationAdapter();
      }
      @Override
      public Adapter caseLibraryUnitSpecification(LibraryUnitSpecification object)
      {
        return createLibraryUnitSpecificationAdapter();
      }
      @Override
      public Adapter casePackageDeclaration(PackageDeclaration object)
      {
        return createPackageDeclarationAdapter();
      }
      @Override
      public Adapter casePackageDefinition(PackageDefinition object)
      {
        return createPackageDefinitionAdapter();
      }
      @Override
      public Adapter caseRenaming(Renaming object)
      {
        return createRenamingAdapter();
      }
      @Override
      public Adapter caseGenericDeclaration(GenericDeclaration object)
      {
        return createGenericDeclarationAdapter();
      }
      @Override
      public Adapter caseGenericInstantiation(GenericInstantiation object)
      {
        return createGenericInstantiationAdapter();
      }
      @Override
      public Adapter casePackageSpecification(PackageSpecification object)
      {
        return createPackageSpecificationAdapter();
      }
      @Override
      public Adapter caseSubprogramBody(SubprogramBody object)
      {
        return createSubprogramBodyAdapter();
      }
      @Override
      public Adapter caseDeclarativeBlock(DeclarativeBlock object)
      {
        return createDeclarativeBlockAdapter();
      }
      @Override
      public Adapter caseBasicDeclarativeItem(BasicDeclarativeItem object)
      {
        return createBasicDeclarativeItemAdapter();
      }
      @Override
      public Adapter caseBasicDeclaration(BasicDeclaration object)
      {
        return createBasicDeclarationAdapter();
      }
      @Override
      public Adapter caseTaskDeclaration(TaskDeclaration object)
      {
        return createTaskDeclarationAdapter();
      }
      @Override
      public Adapter caseTypeDeclaration(TypeDeclaration object)
      {
        return createTypeDeclarationAdapter();
      }
      @Override
      public Adapter caseNewTypeDeclaration(NewTypeDeclaration object)
      {
        return createNewTypeDeclarationAdapter();
      }
      @Override
      public Adapter caseFullTypeDeclaration(FullTypeDeclaration object)
      {
        return createFullTypeDeclarationAdapter();
      }
      @Override
      public Adapter caseFullDataTypeDeclaration(FullDataTypeDeclaration object)
      {
        return createFullDataTypeDeclarationAdapter();
      }
      @Override
      public Adapter caseIncompleteTypeDeclaration(IncompleteTypeDeclaration object)
      {
        return createIncompleteTypeDeclarationAdapter();
      }
      @Override
      public Adapter casePrivateTypeDeclaration(PrivateTypeDeclaration object)
      {
        return createPrivateTypeDeclarationAdapter();
      }
      @Override
      public Adapter casePrivateExtensionDeclaration(PrivateExtensionDeclaration object)
      {
        return createPrivateExtensionDeclarationAdapter();
      }
      @Override
      public Adapter caseTaskItem(TaskItem object)
      {
        return createTaskItemAdapter();
      }
      @Override
      public Adapter caseEntryDeclaration(EntryDeclaration object)
      {
        return createEntryDeclarationAdapter();
      }
      @Override
      public Adapter caseOverridingIndicator(OverridingIndicator object)
      {
        return createOverridingIndicatorAdapter();
      }
      @Override
      public Adapter caseProtectedTypeDeclaration(ProtectedTypeDeclaration object)
      {
        return createProtectedTypeDeclarationAdapter();
      }
      @Override
      public Adapter caseProtectedDefinition(ProtectedDefinition object)
      {
        return createProtectedDefinitionAdapter();
      }
      @Override
      public Adapter caseProtectedElementDeclaration(ProtectedElementDeclaration object)
      {
        return createProtectedElementDeclarationAdapter();
      }
      @Override
      public Adapter caseProtectedOperationDeclaration(ProtectedOperationDeclaration object)
      {
        return createProtectedOperationDeclarationAdapter();
      }
      @Override
      public Adapter caseSubprogramDeclaration(SubprogramDeclaration object)
      {
        return createSubprogramDeclarationAdapter();
      }
      @Override
      public Adapter caseSubprogramSpecification(SubprogramSpecification object)
      {
        return createSubprogramSpecificationAdapter();
      }
      @Override
      public Adapter caseProcedureSpecification(ProcedureSpecification object)
      {
        return createProcedureSpecificationAdapter();
      }
      @Override
      public Adapter caseFunctionSpecification(FunctionSpecification object)
      {
        return createFunctionSpecificationAdapter();
      }
      @Override
      public Adapter caseHandledSequenceOfStatements(HandledSequenceOfStatements object)
      {
        return createHandledSequenceOfStatementsAdapter();
      }
      @Override
      public Adapter caseExceptionChoice(ExceptionChoice object)
      {
        return createExceptionChoiceAdapter();
      }
      @Override
      public Adapter caseExceptionHandler(ExceptionHandler object)
      {
        return createExceptionHandlerAdapter();
      }
      @Override
      public Adapter caseDeclarativeItem(DeclarativeItem object)
      {
        return createDeclarativeItemAdapter();
      }
      @Override
      public Adapter caseBody(Body object)
      {
        return createBodyAdapter();
      }
      @Override
      public Adapter caseProperBody(ProperBody object)
      {
        return createProperBodyAdapter();
      }
      @Override
      public Adapter caseLabel(Label object)
      {
        return createLabelAdapter();
      }
      @Override
      public Adapter caseSequenceOfStatements(SequenceOfStatements object)
      {
        return createSequenceOfStatementsAdapter();
      }
      @Override
      public Adapter caseLabelisableStatement(LabelisableStatement object)
      {
        return createLabelisableStatementAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseSimpleStatement(SimpleStatement object)
      {
        return createSimpleStatementAdapter();
      }
      @Override
      public Adapter caseCompoundStatement(CompoundStatement object)
      {
        return createCompoundStatementAdapter();
      }
      @Override
      public Adapter caseNullStatement(NullStatement object)
      {
        return createNullStatementAdapter();
      }
      @Override
      public Adapter caseLibrarySpecification(LibrarySpecification object)
      {
        return createLibrarySpecificationAdapter();
      }
      @Override
      public Adapter caseGenericItems(GenericItems object)
      {
        return createGenericItemsAdapter();
      }
      @Override
      public Adapter caseGenericItem(GenericItem object)
      {
        return createGenericItemAdapter();
      }
      @Override
      public Adapter caseGenericFormalParameterDeclaration(GenericFormalParameterDeclaration object)
      {
        return createGenericFormalParameterDeclarationAdapter();
      }
      @Override
      public Adapter caseFormalObjectDeclaration(FormalObjectDeclaration object)
      {
        return createFormalObjectDeclarationAdapter();
      }
      @Override
      public Adapter caseFormalTypeDeclaration(FormalTypeDeclaration object)
      {
        return createFormalTypeDeclarationAdapter();
      }
      @Override
      public Adapter caseFormalTypeDefinition(FormalTypeDefinition object)
      {
        return createFormalTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseFormalPrivateTypeDefinition(FormalPrivateTypeDefinition object)
      {
        return createFormalPrivateTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseFormalDerivedTypeDefinition(FormalDerivedTypeDefinition object)
      {
        return createFormalDerivedTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseFormalSubprogramDeclaration(FormalSubprogramDeclaration object)
      {
        return createFormalSubprogramDeclarationAdapter();
      }
      @Override
      public Adapter caseSubprogramDefault(SubprogramDefault object)
      {
        return createSubprogramDefaultAdapter();
      }
      @Override
      public Adapter caseFormalPackageDeclaration(FormalPackageDeclaration object)
      {
        return createFormalPackageDeclarationAdapter();
      }
      @Override
      public Adapter caseFormalPackageActualPart(FormalPackageActualPart object)
      {
        return createFormalPackageActualPartAdapter();
      }
      @Override
      public Adapter caseFormalPackageAssociation(FormalPackageAssociation object)
      {
        return createFormalPackageAssociationAdapter();
      }
      @Override
      public Adapter caseExceptionDeclaration(ExceptionDeclaration object)
      {
        return createExceptionDeclarationAdapter();
      }
      @Override
      public Adapter caseObjectDeclaration(ObjectDeclaration object)
      {
        return createObjectDeclarationAdapter();
      }
      @Override
      public Adapter caseDataInstanceDeclaration(DataInstanceDeclaration object)
      {
        return createDataInstanceDeclarationAdapter();
      }
      @Override
      public Adapter caseSingleProtectedDeclaration(SingleProtectedDeclaration object)
      {
        return createSingleProtectedDeclarationAdapter();
      }
      @Override
      public Adapter casePragma(Pragma object)
      {
        return createPragmaAdapter();
      }
      @Override
      public Adapter casePragmaArgumentAssociation(PragmaArgumentAssociation object)
      {
        return createPragmaArgumentAssociationAdapter();
      }
      @Override
      public Adapter caseSubtypeDeclaration(SubtypeDeclaration object)
      {
        return createSubtypeDeclarationAdapter();
      }
      @Override
      public Adapter caseNumberDeclaration(NumberDeclaration object)
      {
        return createNumberDeclarationAdapter();
      }
      @Override
      public Adapter caseAssignmentStatement(AssignmentStatement object)
      {
        return createAssignmentStatementAdapter();
      }
      @Override
      public Adapter caseIfStatement(IfStatement object)
      {
        return createIfStatementAdapter();
      }
      @Override
      public Adapter caseCaseStatement(CaseStatement object)
      {
        return createCaseStatementAdapter();
      }
      @Override
      public Adapter caseCaseStatementAlternative(CaseStatementAlternative object)
      {
        return createCaseStatementAlternativeAdapter();
      }
      @Override
      public Adapter caseLoopStatement(LoopStatement object)
      {
        return createLoopStatementAdapter();
      }
      @Override
      public Adapter caseIterationScheme(IterationScheme object)
      {
        return createIterationSchemeAdapter();
      }
      @Override
      public Adapter caseLoopParameterSpecification(LoopParameterSpecification object)
      {
        return createLoopParameterSpecificationAdapter();
      }
      @Override
      public Adapter caseBlockStatement(BlockStatement object)
      {
        return createBlockStatementAdapter();
      }
      @Override
      public Adapter caseExitStatement(ExitStatement object)
      {
        return createExitStatementAdapter();
      }
      @Override
      public Adapter caseGotoStatement(GotoStatement object)
      {
        return createGotoStatementAdapter();
      }
      @Override
      public Adapter caseProcedureOrEntryCallStatement(ProcedureOrEntryCallStatement object)
      {
        return createProcedureOrEntryCallStatementAdapter();
      }
      @Override
      public Adapter caseSimpleReturnStatement(SimpleReturnStatement object)
      {
        return createSimpleReturnStatementAdapter();
      }
      @Override
      public Adapter caseExtendedReturnStatement(ExtendedReturnStatement object)
      {
        return createExtendedReturnStatementAdapter();
      }
      @Override
      public Adapter caseReturnSubtypeIndication(ReturnSubtypeIndication object)
      {
        return createReturnSubtypeIndicationAdapter();
      }
      @Override
      public Adapter casePackageBody(PackageBody object)
      {
        return createPackageBodyAdapter();
      }
      @Override
      public Adapter caseTaskDefinition(TaskDefinition object)
      {
        return createTaskDefinitionAdapter();
      }
      @Override
      public Adapter caseTaskBody(TaskBody object)
      {
        return createTaskBodyAdapter();
      }
      @Override
      public Adapter caseProtectedBody(ProtectedBody object)
      {
        return createProtectedBodyAdapter();
      }
      @Override
      public Adapter caseProtectedOperationItem(ProtectedOperationItem object)
      {
        return createProtectedOperationItemAdapter();
      }
      @Override
      public Adapter caseAcceptStatement(AcceptStatement object)
      {
        return createAcceptStatementAdapter();
      }
      @Override
      public Adapter caseEntryIndex(EntryIndex object)
      {
        return createEntryIndexAdapter();
      }
      @Override
      public Adapter caseEntryBody(EntryBody object)
      {
        return createEntryBodyAdapter();
      }
      @Override
      public Adapter caseEntryBodyFormalPart(EntryBodyFormalPart object)
      {
        return createEntryBodyFormalPartAdapter();
      }
      @Override
      public Adapter caseEntryBarrier(EntryBarrier object)
      {
        return createEntryBarrierAdapter();
      }
      @Override
      public Adapter caseEntryIndexSpecification(EntryIndexSpecification object)
      {
        return createEntryIndexSpecificationAdapter();
      }
      @Override
      public Adapter caseRequeueStatement(RequeueStatement object)
      {
        return createRequeueStatementAdapter();
      }
      @Override
      public Adapter caseDelayStatement(DelayStatement object)
      {
        return createDelayStatementAdapter();
      }
      @Override
      public Adapter caseSelectStatement(SelectStatement object)
      {
        return createSelectStatementAdapter();
      }
      @Override
      public Adapter caseSelectiveAccept(SelectiveAccept object)
      {
        return createSelectiveAcceptAdapter();
      }
      @Override
      public Adapter caseGuardedAlternative(GuardedAlternative object)
      {
        return createGuardedAlternativeAdapter();
      }
      @Override
      public Adapter caseGuard(Guard object)
      {
        return createGuardAdapter();
      }
      @Override
      public Adapter caseSelectAlternative(SelectAlternative object)
      {
        return createSelectAlternativeAdapter();
      }
      @Override
      public Adapter caseAcceptAlternative(AcceptAlternative object)
      {
        return createAcceptAlternativeAdapter();
      }
      @Override
      public Adapter caseDelayAlternative(DelayAlternative object)
      {
        return createDelayAlternativeAdapter();
      }
      @Override
      public Adapter caseTimedEntryCall(TimedEntryCall object)
      {
        return createTimedEntryCallAdapter();
      }
      @Override
      public Adapter caseEntryCallAlternative(EntryCallAlternative object)
      {
        return createEntryCallAlternativeAdapter();
      }
      @Override
      public Adapter caseConditionalEntryCall(ConditionalEntryCall object)
      {
        return createConditionalEntryCallAdapter();
      }
      @Override
      public Adapter caseAsynchronousSelect(AsynchronousSelect object)
      {
        return createAsynchronousSelectAdapter();
      }
      @Override
      public Adapter caseTriggeringAlternative(TriggeringAlternative object)
      {
        return createTriggeringAlternativeAdapter();
      }
      @Override
      public Adapter caseTriggeringStatement(TriggeringStatement object)
      {
        return createTriggeringStatementAdapter();
      }
      @Override
      public Adapter caseAbortablePart(AbortablePart object)
      {
        return createAbortablePartAdapter();
      }
      @Override
      public Adapter caseAbortStatement(AbortStatement object)
      {
        return createAbortStatementAdapter();
      }
      @Override
      public Adapter caseTaskNames(TaskNames object)
      {
        return createTaskNamesAdapter();
      }
      @Override
      public Adapter caseBodyStub(BodyStub object)
      {
        return createBodyStubAdapter();
      }
      @Override
      public Adapter casePackageBodyStub(PackageBodyStub object)
      {
        return createPackageBodyStubAdapter();
      }
      @Override
      public Adapter caseTaskBodyStub(TaskBodyStub object)
      {
        return createTaskBodyStubAdapter();
      }
      @Override
      public Adapter caseProtectedBodyStub(ProtectedBodyStub object)
      {
        return createProtectedBodyStubAdapter();
      }
      @Override
      public Adapter caseSeparateSubunit(SeparateSubunit object)
      {
        return createSeparateSubunitAdapter();
      }
      @Override
      public Adapter caseRaiseStatement(RaiseStatement object)
      {
        return createRaiseStatementAdapter();
      }
      @Override
      public Adapter caseGenericActualPart(GenericActualPart object)
      {
        return createGenericActualPartAdapter();
      }
      @Override
      public Adapter caseGenericAssociation(GenericAssociation object)
      {
        return createGenericAssociationAdapter();
      }
      @Override
      public Adapter caseExplicitGenericActualParameter(ExplicitGenericActualParameter object)
      {
        return createExplicitGenericActualParameterAdapter();
      }
      @Override
      public Adapter caseTypeDefinition(TypeDefinition object)
      {
        return createTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseDiscriminantPart(DiscriminantPart object)
      {
        return createDiscriminantPartAdapter();
      }
      @Override
      public Adapter caseUnknownDiscriminantPart(UnknownDiscriminantPart object)
      {
        return createUnknownDiscriminantPartAdapter();
      }
      @Override
      public Adapter caseKnownDiscriminantPart(KnownDiscriminantPart object)
      {
        return createKnownDiscriminantPartAdapter();
      }
      @Override
      public Adapter caseDiscriminantSpecification(DiscriminantSpecification object)
      {
        return createDiscriminantSpecificationAdapter();
      }
      @Override
      public Adapter caseInterfaceList(InterfaceList object)
      {
        return createInterfaceListAdapter();
      }
      @Override
      public Adapter caseInterfaceTypeDefinition(InterfaceTypeDefinition object)
      {
        return createInterfaceTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseDerivedTypeDefinition(DerivedTypeDefinition object)
      {
        return createDerivedTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseRecordExtensionPart(RecordExtensionPart object)
      {
        return createRecordExtensionPartAdapter();
      }
      @Override
      public Adapter caseAccessTypeDefinition(AccessTypeDefinition object)
      {
        return createAccessTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseAccessSpecification(AccessSpecification object)
      {
        return createAccessSpecificationAdapter();
      }
      @Override
      public Adapter caseAccessToSubprogramDefinition(AccessToSubprogramDefinition object)
      {
        return createAccessToSubprogramDefinitionAdapter();
      }
      @Override
      public Adapter caseAccessToDataDefinition(AccessToDataDefinition object)
      {
        return createAccessToDataDefinitionAdapter();
      }
      @Override
      public Adapter caseArrayTypeDefinition(ArrayTypeDefinition object)
      {
        return createArrayTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseArrayIndexes(ArrayIndexes object)
      {
        return createArrayIndexesAdapter();
      }
      @Override
      public Adapter caseUnconstrainedIndexes(UnconstrainedIndexes object)
      {
        return createUnconstrainedIndexesAdapter();
      }
      @Override
      public Adapter caseConstrainedIndexes(ConstrainedIndexes object)
      {
        return createConstrainedIndexesAdapter();
      }
      @Override
      public Adapter caseDiscreteSubtypeDefinition(DiscreteSubtypeDefinition object)
      {
        return createDiscreteSubtypeDefinitionAdapter();
      }
      @Override
      public Adapter caseComponentDefinition(ComponentDefinition object)
      {
        return createComponentDefinitionAdapter();
      }
      @Override
      public Adapter caseAnonymousAccessDefinition(AnonymousAccessDefinition object)
      {
        return createAnonymousAccessDefinitionAdapter();
      }
      @Override
      public Adapter caseNotNullAccessDefinition(NotNullAccessDefinition object)
      {
        return createNotNullAccessDefinitionAdapter();
      }
      @Override
      public Adapter caseAccessToDataInstance(AccessToDataInstance object)
      {
        return createAccessToDataInstanceAdapter();
      }
      @Override
      public Adapter caseParameterAndResultProfile(ParameterAndResultProfile object)
      {
        return createParameterAndResultProfileAdapter();
      }
      @Override
      public Adapter caseFormalPart(FormalPart object)
      {
        return createFormalPartAdapter();
      }
      @Override
      public Adapter caseParameterSpecification(ParameterSpecification object)
      {
        return createParameterSpecificationAdapter();
      }
      @Override
      public Adapter caseMode(Mode object)
      {
        return createModeAdapter();
      }
      @Override
      public Adapter caseIntegerTypeDefinition(IntegerTypeDefinition object)
      {
        return createIntegerTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseSignedIntegerTypeDefinition(SignedIntegerTypeDefinition object)
      {
        return createSignedIntegerTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseModularTypeDefinition(ModularTypeDefinition object)
      {
        return createModularTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseEnumerationTypeDefinition(EnumerationTypeDefinition object)
      {
        return createEnumerationTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseRecordTypeDefinition(RecordTypeDefinition object)
      {
        return createRecordTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseRecordDefinition(RecordDefinition object)
      {
        return createRecordDefinitionAdapter();
      }
      @Override
      public Adapter caseComponentList(ComponentList object)
      {
        return createComponentListAdapter();
      }
      @Override
      public Adapter caseOptVariantPart(OptVariantPart object)
      {
        return createOptVariantPartAdapter();
      }
      @Override
      public Adapter caseComponentItem(ComponentItem object)
      {
        return createComponentItemAdapter();
      }
      @Override
      public Adapter caseComponentDeclaration(ComponentDeclaration object)
      {
        return createComponentDeclarationAdapter();
      }
      @Override
      public Adapter caseDefiningIdentifierList(DefiningIdentifierList object)
      {
        return createDefiningIdentifierListAdapter();
      }
      @Override
      public Adapter caseAspectClause(AspectClause object)
      {
        return createAspectClauseAdapter();
      }
      @Override
      public Adapter caseModClause(ModClause object)
      {
        return createModClauseAdapter();
      }
      @Override
      public Adapter caseComponentClause(ComponentClause object)
      {
        return createComponentClauseAdapter();
      }
      @Override
      public Adapter caseVariantPart(VariantPart object)
      {
        return createVariantPartAdapter();
      }
      @Override
      public Adapter caseVariant(Variant object)
      {
        return createVariantAdapter();
      }
      @Override
      public Adapter caseDiscreteChoiceList(DiscreteChoiceList object)
      {
        return createDiscreteChoiceListAdapter();
      }
      @Override
      public Adapter caseRealTypeDefinition(RealTypeDefinition object)
      {
        return createRealTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseFloatingPointDefinition(FloatingPointDefinition object)
      {
        return createFloatingPointDefinitionAdapter();
      }
      @Override
      public Adapter caseRealRangeSpecification(RealRangeSpecification object)
      {
        return createRealRangeSpecificationAdapter();
      }
      @Override
      public Adapter caseFixedPointDefinition(FixedPointDefinition object)
      {
        return createFixedPointDefinitionAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseRelation(Relation object)
      {
        return createRelationAdapter();
      }
      @Override
      public Adapter caseMembership(Membership object)
      {
        return createMembershipAdapter();
      }
      @Override
      public Adapter caseInterval(Interval object)
      {
        return createIntervalAdapter();
      }
      @Override
      public Adapter caseSimpleExpression(SimpleExpression object)
      {
        return createSimpleExpressionAdapter();
      }
      @Override
      public Adapter caseTerm(Term object)
      {
        return createTermAdapter();
      }
      @Override
      public Adapter caseFactor(Factor object)
      {
        return createFactorAdapter();
      }
      @Override
      public Adapter casePrimary(Primary object)
      {
        return createPrimaryAdapter();
      }
      @Override
      public Adapter caseNumericLiteral(NumericLiteral object)
      {
        return createNumericLiteralAdapter();
      }
      @Override
      public Adapter caseNull(Null object)
      {
        return createNullAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseQualifiedName(QualifiedName object)
      {
        return createQualifiedNameAdapter();
      }
      @Override
      public Adapter caseParenthesizedExpression(ParenthesizedExpression object)
      {
        return createParenthesizedExpressionAdapter();
      }
      @Override
      public Adapter caseQualifier(Qualifier object)
      {
        return createQualifierAdapter();
      }
      @Override
      public Adapter caseAllocator(Allocator object)
      {
        return createAllocatorAdapter();
      }
      @Override
      public Adapter caseSubtypeIndication(SubtypeIndication object)
      {
        return createSubtypeIndicationAdapter();
      }
      @Override
      public Adapter caseOptNullExclusion(OptNullExclusion object)
      {
        return createOptNullExclusionAdapter();
      }
      @Override
      public Adapter caseOptConstraint(OptConstraint object)
      {
        return createOptConstraintAdapter();
      }
      @Override
      public Adapter caseScalarConstraint(ScalarConstraint object)
      {
        return createScalarConstraintAdapter();
      }
      @Override
      public Adapter caseDigitsConstraint(DigitsConstraint object)
      {
        return createDigitsConstraintAdapter();
      }
      @Override
      public Adapter caseDeltaConstraint(DeltaConstraint object)
      {
        return createDeltaConstraintAdapter();
      }
      @Override
      public Adapter caseRangeConstraint(RangeConstraint object)
      {
        return createRangeConstraintAdapter();
      }
      @Override
      public Adapter caseCompositeConstraint(CompositeConstraint object)
      {
        return createCompositeConstraintAdapter();
      }
      @Override
      public Adapter caseDiscriminantConstraint(DiscriminantConstraint object)
      {
        return createDiscriminantConstraintAdapter();
      }
      @Override
      public Adapter caseIndexConstraint(IndexConstraint object)
      {
        return createIndexConstraintAdapter();
      }
      @Override
      public Adapter caseDiscriminantAssociation(DiscriminantAssociation object)
      {
        return createDiscriminantAssociationAdapter();
      }
      @Override
      public Adapter caseDiscriminantSelectors(DiscriminantSelectors object)
      {
        return createDiscriminantSelectorsAdapter();
      }
      @Override
      public Adapter caseDiscreteRange(DiscreteRange object)
      {
        return createDiscreteRangeAdapter();
      }
      @Override
      public Adapter caseComponentChoiceList(ComponentChoiceList object)
      {
        return createComponentChoiceListAdapter();
      }
      @Override
      public Adapter caseDiscreteChoice(DiscreteChoice object)
      {
        return createDiscreteChoiceAdapter();
      }
      @Override
      public Adapter caseAggregate(Aggregate object)
      {
        return createAggregateAdapter();
      }
      @Override
      public Adapter caseRecordAggregate(RecordAggregate object)
      {
        return createRecordAggregateAdapter();
      }
      @Override
      public Adapter caseRecordComponentAssociationList(RecordComponentAssociationList object)
      {
        return createRecordComponentAssociationListAdapter();
      }
      @Override
      public Adapter caseRecordComponentAssociation(RecordComponentAssociation object)
      {
        return createRecordComponentAssociationAdapter();
      }
      @Override
      public Adapter caseInitializedComponents(InitializedComponents object)
      {
        return createInitializedComponentsAdapter();
      }
      @Override
      public Adapter caseUninitializedComponents(UninitializedComponents object)
      {
        return createUninitializedComponentsAdapter();
      }
      @Override
      public Adapter caseExtensionAggregate(ExtensionAggregate object)
      {
        return createExtensionAggregateAdapter();
      }
      @Override
      public Adapter caseArrayAggregate(ArrayAggregate object)
      {
        return createArrayAggregateAdapter();
      }
      @Override
      public Adapter casePositionalArrayAggregate(PositionalArrayAggregate object)
      {
        return createPositionalArrayAggregateAdapter();
      }
      @Override
      public Adapter caseNamedArrayAggregate(NamedArrayAggregate object)
      {
        return createNamedArrayAggregateAdapter();
      }
      @Override
      public Adapter caseArrayComponentAssociation(ArrayComponentAssociation object)
      {
        return createArrayComponentAssociationAdapter();
      }
      @Override
      public Adapter caseAncestorPart(AncestorPart object)
      {
        return createAncestorPartAdapter();
      }
      @Override
      public Adapter caseName(Name object)
      {
        return createNameAdapter();
      }
      @Override
      public Adapter casePrimaryName(PrimaryName object)
      {
        return createPrimaryNameAdapter();
      }
      @Override
      public Adapter caseParameterAssociation(ParameterAssociation object)
      {
        return createParameterAssociationAdapter();
      }
      @Override
      public Adapter caseParameterEffectiveValue(ParameterEffectiveValue object)
      {
        return createParameterEffectiveValueAdapter();
      }
      @Override
      public Adapter caseAttributeDesignator(AttributeDesignator object)
      {
        return createAttributeDesignatorAdapter();
      }
      @Override
      public Adapter caseRange(Range object)
      {
        return createRangeAdapter();
      }
      @Override
      public Adapter caseEntityRange(EntityRange object)
      {
        return createEntityRangeAdapter();
      }
      @Override
      public Adapter caseExplicitRange(ExplicitRange object)
      {
        return createExplicitRangeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.Compilation <em>Compilation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.Compilation
   * @generated
   */
  public Adapter createCompilationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.CompilationUnit <em>Compilation Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.CompilationUnit
   * @generated
   */
  public Adapter createCompilationUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.Unit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.Unit
   * @generated
   */
  public Adapter createUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ContextClause <em>Context Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ContextClause
   * @generated
   */
  public Adapter createContextClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ContextItem <em>Context Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ContextItem
   * @generated
   */
  public Adapter createContextItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.WithClause <em>With Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.WithClause
   * @generated
   */
  public Adapter createWithClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.UseClause <em>Use Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.UseClause
   * @generated
   */
  public Adapter createUseClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.UsePackageClause <em>Use Package Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.UsePackageClause
   * @generated
   */
  public Adapter createUsePackageClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.UseTypeClause <em>Use Type Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.UseTypeClause
   * @generated
   */
  public Adapter createUseTypeClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.LibraryUnitDeclaration <em>Library Unit Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.LibraryUnitDeclaration
   * @generated
   */
  public Adapter createLibraryUnitDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.LibraryUnitSpecification <em>Library Unit Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.LibraryUnitSpecification
   * @generated
   */
  public Adapter createLibraryUnitSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.PackageDeclaration
   * @generated
   */
  public Adapter createPackageDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.PackageDefinition <em>Package Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.PackageDefinition
   * @generated
   */
  public Adapter createPackageDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.Renaming <em>Renaming</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.Renaming
   * @generated
   */
  public Adapter createRenamingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.GenericDeclaration <em>Generic Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.GenericDeclaration
   * @generated
   */
  public Adapter createGenericDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.GenericInstantiation <em>Generic Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.GenericInstantiation
   * @generated
   */
  public Adapter createGenericInstantiationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.PackageSpecification <em>Package Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.PackageSpecification
   * @generated
   */
  public Adapter createPackageSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.SubprogramBody <em>Subprogram Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.SubprogramBody
   * @generated
   */
  public Adapter createSubprogramBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.DeclarativeBlock <em>Declarative Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.DeclarativeBlock
   * @generated
   */
  public Adapter createDeclarativeBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.BasicDeclarativeItem <em>Basic Declarative Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.BasicDeclarativeItem
   * @generated
   */
  public Adapter createBasicDeclarativeItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.BasicDeclaration <em>Basic Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.BasicDeclaration
   * @generated
   */
  public Adapter createBasicDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.TaskDeclaration <em>Task Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.TaskDeclaration
   * @generated
   */
  public Adapter createTaskDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.TypeDeclaration <em>Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.TypeDeclaration
   * @generated
   */
  public Adapter createTypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.NewTypeDeclaration <em>New Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.NewTypeDeclaration
   * @generated
   */
  public Adapter createNewTypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.FullTypeDeclaration <em>Full Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.FullTypeDeclaration
   * @generated
   */
  public Adapter createFullTypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.FullDataTypeDeclaration <em>Full Data Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.FullDataTypeDeclaration
   * @generated
   */
  public Adapter createFullDataTypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.IncompleteTypeDeclaration <em>Incomplete Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.IncompleteTypeDeclaration
   * @generated
   */
  public Adapter createIncompleteTypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.PrivateTypeDeclaration <em>Private Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.PrivateTypeDeclaration
   * @generated
   */
  public Adapter createPrivateTypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.PrivateExtensionDeclaration <em>Private Extension Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.PrivateExtensionDeclaration
   * @generated
   */
  public Adapter createPrivateExtensionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.TaskItem <em>Task Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.TaskItem
   * @generated
   */
  public Adapter createTaskItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.EntryDeclaration <em>Entry Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.EntryDeclaration
   * @generated
   */
  public Adapter createEntryDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.OverridingIndicator <em>Overriding Indicator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.OverridingIndicator
   * @generated
   */
  public Adapter createOverridingIndicatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ProtectedTypeDeclaration <em>Protected Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ProtectedTypeDeclaration
   * @generated
   */
  public Adapter createProtectedTypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ProtectedDefinition <em>Protected Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ProtectedDefinition
   * @generated
   */
  public Adapter createProtectedDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ProtectedElementDeclaration <em>Protected Element Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ProtectedElementDeclaration
   * @generated
   */
  public Adapter createProtectedElementDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ProtectedOperationDeclaration <em>Protected Operation Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ProtectedOperationDeclaration
   * @generated
   */
  public Adapter createProtectedOperationDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.SubprogramDeclaration <em>Subprogram Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.SubprogramDeclaration
   * @generated
   */
  public Adapter createSubprogramDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.SubprogramSpecification <em>Subprogram Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.SubprogramSpecification
   * @generated
   */
  public Adapter createSubprogramSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ProcedureSpecification <em>Procedure Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ProcedureSpecification
   * @generated
   */
  public Adapter createProcedureSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.FunctionSpecification <em>Function Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.FunctionSpecification
   * @generated
   */
  public Adapter createFunctionSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.HandledSequenceOfStatements <em>Handled Sequence Of Statements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.HandledSequenceOfStatements
   * @generated
   */
  public Adapter createHandledSequenceOfStatementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ExceptionChoice <em>Exception Choice</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ExceptionChoice
   * @generated
   */
  public Adapter createExceptionChoiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ExceptionHandler <em>Exception Handler</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ExceptionHandler
   * @generated
   */
  public Adapter createExceptionHandlerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.DeclarativeItem <em>Declarative Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.DeclarativeItem
   * @generated
   */
  public Adapter createDeclarativeItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.Body
   * @generated
   */
  public Adapter createBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ProperBody <em>Proper Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ProperBody
   * @generated
   */
  public Adapter createProperBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.Label
   * @generated
   */
  public Adapter createLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.SequenceOfStatements <em>Sequence Of Statements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.SequenceOfStatements
   * @generated
   */
  public Adapter createSequenceOfStatementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.LabelisableStatement <em>Labelisable Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.LabelisableStatement
   * @generated
   */
  public Adapter createLabelisableStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.SimpleStatement <em>Simple Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.SimpleStatement
   * @generated
   */
  public Adapter createSimpleStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.CompoundStatement <em>Compound Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.CompoundStatement
   * @generated
   */
  public Adapter createCompoundStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.NullStatement <em>Null Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.NullStatement
   * @generated
   */
  public Adapter createNullStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.LibrarySpecification <em>Library Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.LibrarySpecification
   * @generated
   */
  public Adapter createLibrarySpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.GenericItems <em>Generic Items</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.GenericItems
   * @generated
   */
  public Adapter createGenericItemsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.GenericItem <em>Generic Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.GenericItem
   * @generated
   */
  public Adapter createGenericItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.GenericFormalParameterDeclaration <em>Generic Formal Parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.GenericFormalParameterDeclaration
   * @generated
   */
  public Adapter createGenericFormalParameterDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.FormalObjectDeclaration <em>Formal Object Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.FormalObjectDeclaration
   * @generated
   */
  public Adapter createFormalObjectDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.FormalTypeDeclaration <em>Formal Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.FormalTypeDeclaration
   * @generated
   */
  public Adapter createFormalTypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.FormalTypeDefinition <em>Formal Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.FormalTypeDefinition
   * @generated
   */
  public Adapter createFormalTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.FormalPrivateTypeDefinition <em>Formal Private Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.FormalPrivateTypeDefinition
   * @generated
   */
  public Adapter createFormalPrivateTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.FormalDerivedTypeDefinition <em>Formal Derived Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.FormalDerivedTypeDefinition
   * @generated
   */
  public Adapter createFormalDerivedTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.FormalSubprogramDeclaration <em>Formal Subprogram Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.FormalSubprogramDeclaration
   * @generated
   */
  public Adapter createFormalSubprogramDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.SubprogramDefault <em>Subprogram Default</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.SubprogramDefault
   * @generated
   */
  public Adapter createSubprogramDefaultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.FormalPackageDeclaration <em>Formal Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.FormalPackageDeclaration
   * @generated
   */
  public Adapter createFormalPackageDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.FormalPackageActualPart <em>Formal Package Actual Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.FormalPackageActualPart
   * @generated
   */
  public Adapter createFormalPackageActualPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.FormalPackageAssociation <em>Formal Package Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.FormalPackageAssociation
   * @generated
   */
  public Adapter createFormalPackageAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ExceptionDeclaration <em>Exception Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ExceptionDeclaration
   * @generated
   */
  public Adapter createExceptionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ObjectDeclaration <em>Object Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ObjectDeclaration
   * @generated
   */
  public Adapter createObjectDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.DataInstanceDeclaration <em>Data Instance Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.DataInstanceDeclaration
   * @generated
   */
  public Adapter createDataInstanceDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.SingleProtectedDeclaration <em>Single Protected Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.SingleProtectedDeclaration
   * @generated
   */
  public Adapter createSingleProtectedDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.Pragma <em>Pragma</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.Pragma
   * @generated
   */
  public Adapter createPragmaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.PragmaArgumentAssociation <em>Pragma Argument Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.PragmaArgumentAssociation
   * @generated
   */
  public Adapter createPragmaArgumentAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.SubtypeDeclaration <em>Subtype Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.SubtypeDeclaration
   * @generated
   */
  public Adapter createSubtypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.NumberDeclaration <em>Number Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.NumberDeclaration
   * @generated
   */
  public Adapter createNumberDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.AssignmentStatement <em>Assignment Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.AssignmentStatement
   * @generated
   */
  public Adapter createAssignmentStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.IfStatement
   * @generated
   */
  public Adapter createIfStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.CaseStatement <em>Case Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.CaseStatement
   * @generated
   */
  public Adapter createCaseStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.CaseStatementAlternative <em>Case Statement Alternative</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.CaseStatementAlternative
   * @generated
   */
  public Adapter createCaseStatementAlternativeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.LoopStatement <em>Loop Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.LoopStatement
   * @generated
   */
  public Adapter createLoopStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.IterationScheme <em>Iteration Scheme</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.IterationScheme
   * @generated
   */
  public Adapter createIterationSchemeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.LoopParameterSpecification <em>Loop Parameter Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.LoopParameterSpecification
   * @generated
   */
  public Adapter createLoopParameterSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.BlockStatement <em>Block Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.BlockStatement
   * @generated
   */
  public Adapter createBlockStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ExitStatement <em>Exit Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ExitStatement
   * @generated
   */
  public Adapter createExitStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.GotoStatement <em>Goto Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.GotoStatement
   * @generated
   */
  public Adapter createGotoStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ProcedureOrEntryCallStatement <em>Procedure Or Entry Call Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ProcedureOrEntryCallStatement
   * @generated
   */
  public Adapter createProcedureOrEntryCallStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.SimpleReturnStatement <em>Simple Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.SimpleReturnStatement
   * @generated
   */
  public Adapter createSimpleReturnStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ExtendedReturnStatement <em>Extended Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ExtendedReturnStatement
   * @generated
   */
  public Adapter createExtendedReturnStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ReturnSubtypeIndication <em>Return Subtype Indication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ReturnSubtypeIndication
   * @generated
   */
  public Adapter createReturnSubtypeIndicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.PackageBody <em>Package Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.PackageBody
   * @generated
   */
  public Adapter createPackageBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.TaskDefinition <em>Task Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.TaskDefinition
   * @generated
   */
  public Adapter createTaskDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.TaskBody <em>Task Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.TaskBody
   * @generated
   */
  public Adapter createTaskBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ProtectedBody <em>Protected Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ProtectedBody
   * @generated
   */
  public Adapter createProtectedBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ProtectedOperationItem <em>Protected Operation Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ProtectedOperationItem
   * @generated
   */
  public Adapter createProtectedOperationItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.AcceptStatement <em>Accept Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.AcceptStatement
   * @generated
   */
  public Adapter createAcceptStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.EntryIndex <em>Entry Index</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.EntryIndex
   * @generated
   */
  public Adapter createEntryIndexAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.EntryBody <em>Entry Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.EntryBody
   * @generated
   */
  public Adapter createEntryBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.EntryBodyFormalPart <em>Entry Body Formal Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.EntryBodyFormalPart
   * @generated
   */
  public Adapter createEntryBodyFormalPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.EntryBarrier <em>Entry Barrier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.EntryBarrier
   * @generated
   */
  public Adapter createEntryBarrierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.EntryIndexSpecification <em>Entry Index Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.EntryIndexSpecification
   * @generated
   */
  public Adapter createEntryIndexSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.RequeueStatement <em>Requeue Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.RequeueStatement
   * @generated
   */
  public Adapter createRequeueStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.DelayStatement <em>Delay Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.DelayStatement
   * @generated
   */
  public Adapter createDelayStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.SelectStatement <em>Select Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.SelectStatement
   * @generated
   */
  public Adapter createSelectStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.SelectiveAccept <em>Selective Accept</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.SelectiveAccept
   * @generated
   */
  public Adapter createSelectiveAcceptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.GuardedAlternative <em>Guarded Alternative</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.GuardedAlternative
   * @generated
   */
  public Adapter createGuardedAlternativeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.Guard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.Guard
   * @generated
   */
  public Adapter createGuardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.SelectAlternative <em>Select Alternative</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.SelectAlternative
   * @generated
   */
  public Adapter createSelectAlternativeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.AcceptAlternative <em>Accept Alternative</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.AcceptAlternative
   * @generated
   */
  public Adapter createAcceptAlternativeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.DelayAlternative <em>Delay Alternative</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.DelayAlternative
   * @generated
   */
  public Adapter createDelayAlternativeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.TimedEntryCall <em>Timed Entry Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.TimedEntryCall
   * @generated
   */
  public Adapter createTimedEntryCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.EntryCallAlternative <em>Entry Call Alternative</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.EntryCallAlternative
   * @generated
   */
  public Adapter createEntryCallAlternativeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ConditionalEntryCall <em>Conditional Entry Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ConditionalEntryCall
   * @generated
   */
  public Adapter createConditionalEntryCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.AsynchronousSelect <em>Asynchronous Select</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.AsynchronousSelect
   * @generated
   */
  public Adapter createAsynchronousSelectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.TriggeringAlternative <em>Triggering Alternative</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.TriggeringAlternative
   * @generated
   */
  public Adapter createTriggeringAlternativeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.TriggeringStatement <em>Triggering Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.TriggeringStatement
   * @generated
   */
  public Adapter createTriggeringStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.AbortablePart <em>Abortable Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.AbortablePart
   * @generated
   */
  public Adapter createAbortablePartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.AbortStatement <em>Abort Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.AbortStatement
   * @generated
   */
  public Adapter createAbortStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.TaskNames <em>Task Names</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.TaskNames
   * @generated
   */
  public Adapter createTaskNamesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.BodyStub <em>Body Stub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.BodyStub
   * @generated
   */
  public Adapter createBodyStubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.PackageBodyStub <em>Package Body Stub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.PackageBodyStub
   * @generated
   */
  public Adapter createPackageBodyStubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.TaskBodyStub <em>Task Body Stub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.TaskBodyStub
   * @generated
   */
  public Adapter createTaskBodyStubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ProtectedBodyStub <em>Protected Body Stub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ProtectedBodyStub
   * @generated
   */
  public Adapter createProtectedBodyStubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.SeparateSubunit <em>Separate Subunit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.SeparateSubunit
   * @generated
   */
  public Adapter createSeparateSubunitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.RaiseStatement <em>Raise Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.RaiseStatement
   * @generated
   */
  public Adapter createRaiseStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.GenericActualPart <em>Generic Actual Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.GenericActualPart
   * @generated
   */
  public Adapter createGenericActualPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.GenericAssociation <em>Generic Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.GenericAssociation
   * @generated
   */
  public Adapter createGenericAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ExplicitGenericActualParameter <em>Explicit Generic Actual Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ExplicitGenericActualParameter
   * @generated
   */
  public Adapter createExplicitGenericActualParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.TypeDefinition
   * @generated
   */
  public Adapter createTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.DiscriminantPart <em>Discriminant Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.DiscriminantPart
   * @generated
   */
  public Adapter createDiscriminantPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.UnknownDiscriminantPart <em>Unknown Discriminant Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.UnknownDiscriminantPart
   * @generated
   */
  public Adapter createUnknownDiscriminantPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.KnownDiscriminantPart <em>Known Discriminant Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.KnownDiscriminantPart
   * @generated
   */
  public Adapter createKnownDiscriminantPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.DiscriminantSpecification <em>Discriminant Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.DiscriminantSpecification
   * @generated
   */
  public Adapter createDiscriminantSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.InterfaceList <em>Interface List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.InterfaceList
   * @generated
   */
  public Adapter createInterfaceListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.InterfaceTypeDefinition <em>Interface Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.InterfaceTypeDefinition
   * @generated
   */
  public Adapter createInterfaceTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.DerivedTypeDefinition <em>Derived Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.DerivedTypeDefinition
   * @generated
   */
  public Adapter createDerivedTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.RecordExtensionPart <em>Record Extension Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.RecordExtensionPart
   * @generated
   */
  public Adapter createRecordExtensionPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.AccessTypeDefinition <em>Access Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.AccessTypeDefinition
   * @generated
   */
  public Adapter createAccessTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.AccessSpecification <em>Access Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.AccessSpecification
   * @generated
   */
  public Adapter createAccessSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.AccessToSubprogramDefinition <em>Access To Subprogram Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.AccessToSubprogramDefinition
   * @generated
   */
  public Adapter createAccessToSubprogramDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.AccessToDataDefinition <em>Access To Data Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.AccessToDataDefinition
   * @generated
   */
  public Adapter createAccessToDataDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ArrayTypeDefinition <em>Array Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ArrayTypeDefinition
   * @generated
   */
  public Adapter createArrayTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ArrayIndexes <em>Array Indexes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ArrayIndexes
   * @generated
   */
  public Adapter createArrayIndexesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.UnconstrainedIndexes <em>Unconstrained Indexes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.UnconstrainedIndexes
   * @generated
   */
  public Adapter createUnconstrainedIndexesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ConstrainedIndexes <em>Constrained Indexes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ConstrainedIndexes
   * @generated
   */
  public Adapter createConstrainedIndexesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.DiscreteSubtypeDefinition <em>Discrete Subtype Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.DiscreteSubtypeDefinition
   * @generated
   */
  public Adapter createDiscreteSubtypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ComponentDefinition <em>Component Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ComponentDefinition
   * @generated
   */
  public Adapter createComponentDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.AnonymousAccessDefinition <em>Anonymous Access Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.AnonymousAccessDefinition
   * @generated
   */
  public Adapter createAnonymousAccessDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.NotNullAccessDefinition <em>Not Null Access Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.NotNullAccessDefinition
   * @generated
   */
  public Adapter createNotNullAccessDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.AccessToDataInstance <em>Access To Data Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.AccessToDataInstance
   * @generated
   */
  public Adapter createAccessToDataInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ParameterAndResultProfile <em>Parameter And Result Profile</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ParameterAndResultProfile
   * @generated
   */
  public Adapter createParameterAndResultProfileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.FormalPart <em>Formal Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.FormalPart
   * @generated
   */
  public Adapter createFormalPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ParameterSpecification <em>Parameter Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ParameterSpecification
   * @generated
   */
  public Adapter createParameterSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.Mode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.Mode
   * @generated
   */
  public Adapter createModeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.IntegerTypeDefinition <em>Integer Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.IntegerTypeDefinition
   * @generated
   */
  public Adapter createIntegerTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.SignedIntegerTypeDefinition <em>Signed Integer Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.SignedIntegerTypeDefinition
   * @generated
   */
  public Adapter createSignedIntegerTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ModularTypeDefinition <em>Modular Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ModularTypeDefinition
   * @generated
   */
  public Adapter createModularTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.EnumerationTypeDefinition <em>Enumeration Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.EnumerationTypeDefinition
   * @generated
   */
  public Adapter createEnumerationTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.RecordTypeDefinition <em>Record Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.RecordTypeDefinition
   * @generated
   */
  public Adapter createRecordTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.RecordDefinition <em>Record Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.RecordDefinition
   * @generated
   */
  public Adapter createRecordDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ComponentList <em>Component List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ComponentList
   * @generated
   */
  public Adapter createComponentListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.OptVariantPart <em>Opt Variant Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.OptVariantPart
   * @generated
   */
  public Adapter createOptVariantPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ComponentItem <em>Component Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ComponentItem
   * @generated
   */
  public Adapter createComponentItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ComponentDeclaration <em>Component Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ComponentDeclaration
   * @generated
   */
  public Adapter createComponentDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.DefiningIdentifierList <em>Defining Identifier List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.DefiningIdentifierList
   * @generated
   */
  public Adapter createDefiningIdentifierListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.AspectClause <em>Aspect Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.AspectClause
   * @generated
   */
  public Adapter createAspectClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ModClause <em>Mod Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ModClause
   * @generated
   */
  public Adapter createModClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ComponentClause <em>Component Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ComponentClause
   * @generated
   */
  public Adapter createComponentClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.VariantPart <em>Variant Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.VariantPart
   * @generated
   */
  public Adapter createVariantPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.Variant <em>Variant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.Variant
   * @generated
   */
  public Adapter createVariantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.DiscreteChoiceList <em>Discrete Choice List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.DiscreteChoiceList
   * @generated
   */
  public Adapter createDiscreteChoiceListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.RealTypeDefinition <em>Real Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.RealTypeDefinition
   * @generated
   */
  public Adapter createRealTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.FloatingPointDefinition <em>Floating Point Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.FloatingPointDefinition
   * @generated
   */
  public Adapter createFloatingPointDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.RealRangeSpecification <em>Real Range Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.RealRangeSpecification
   * @generated
   */
  public Adapter createRealRangeSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.FixedPointDefinition <em>Fixed Point Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.FixedPointDefinition
   * @generated
   */
  public Adapter createFixedPointDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.Relation
   * @generated
   */
  public Adapter createRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.Membership <em>Membership</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.Membership
   * @generated
   */
  public Adapter createMembershipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.Interval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.Interval
   * @generated
   */
  public Adapter createIntervalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.SimpleExpression <em>Simple Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.SimpleExpression
   * @generated
   */
  public Adapter createSimpleExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.Term
   * @generated
   */
  public Adapter createTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.Factor <em>Factor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.Factor
   * @generated
   */
  public Adapter createFactorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.Primary <em>Primary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.Primary
   * @generated
   */
  public Adapter createPrimaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.NumericLiteral <em>Numeric Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.NumericLiteral
   * @generated
   */
  public Adapter createNumericLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.Null <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.Null
   * @generated
   */
  public Adapter createNullAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.QualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.QualifiedName
   * @generated
   */
  public Adapter createQualifiedNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ParenthesizedExpression <em>Parenthesized Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ParenthesizedExpression
   * @generated
   */
  public Adapter createParenthesizedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.Qualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.Qualifier
   * @generated
   */
  public Adapter createQualifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.Allocator <em>Allocator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.Allocator
   * @generated
   */
  public Adapter createAllocatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.SubtypeIndication <em>Subtype Indication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.SubtypeIndication
   * @generated
   */
  public Adapter createSubtypeIndicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.OptNullExclusion <em>Opt Null Exclusion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.OptNullExclusion
   * @generated
   */
  public Adapter createOptNullExclusionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.OptConstraint <em>Opt Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.OptConstraint
   * @generated
   */
  public Adapter createOptConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ScalarConstraint <em>Scalar Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ScalarConstraint
   * @generated
   */
  public Adapter createScalarConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.DigitsConstraint <em>Digits Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.DigitsConstraint
   * @generated
   */
  public Adapter createDigitsConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.DeltaConstraint <em>Delta Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.DeltaConstraint
   * @generated
   */
  public Adapter createDeltaConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.RangeConstraint <em>Range Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.RangeConstraint
   * @generated
   */
  public Adapter createRangeConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.CompositeConstraint <em>Composite Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.CompositeConstraint
   * @generated
   */
  public Adapter createCompositeConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.DiscriminantConstraint <em>Discriminant Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.DiscriminantConstraint
   * @generated
   */
  public Adapter createDiscriminantConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.IndexConstraint <em>Index Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.IndexConstraint
   * @generated
   */
  public Adapter createIndexConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.DiscriminantAssociation <em>Discriminant Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.DiscriminantAssociation
   * @generated
   */
  public Adapter createDiscriminantAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.DiscriminantSelectors <em>Discriminant Selectors</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.DiscriminantSelectors
   * @generated
   */
  public Adapter createDiscriminantSelectorsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.DiscreteRange <em>Discrete Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.DiscreteRange
   * @generated
   */
  public Adapter createDiscreteRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ComponentChoiceList <em>Component Choice List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ComponentChoiceList
   * @generated
   */
  public Adapter createComponentChoiceListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.DiscreteChoice <em>Discrete Choice</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.DiscreteChoice
   * @generated
   */
  public Adapter createDiscreteChoiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.Aggregate <em>Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.Aggregate
   * @generated
   */
  public Adapter createAggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.RecordAggregate <em>Record Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.RecordAggregate
   * @generated
   */
  public Adapter createRecordAggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.RecordComponentAssociationList <em>Record Component Association List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.RecordComponentAssociationList
   * @generated
   */
  public Adapter createRecordComponentAssociationListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.RecordComponentAssociation <em>Record Component Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.RecordComponentAssociation
   * @generated
   */
  public Adapter createRecordComponentAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.InitializedComponents <em>Initialized Components</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.InitializedComponents
   * @generated
   */
  public Adapter createInitializedComponentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.UninitializedComponents <em>Uninitialized Components</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.UninitializedComponents
   * @generated
   */
  public Adapter createUninitializedComponentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ExtensionAggregate <em>Extension Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ExtensionAggregate
   * @generated
   */
  public Adapter createExtensionAggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ArrayAggregate <em>Array Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ArrayAggregate
   * @generated
   */
  public Adapter createArrayAggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.PositionalArrayAggregate <em>Positional Array Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.PositionalArrayAggregate
   * @generated
   */
  public Adapter createPositionalArrayAggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.NamedArrayAggregate <em>Named Array Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.NamedArrayAggregate
   * @generated
   */
  public Adapter createNamedArrayAggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ArrayComponentAssociation <em>Array Component Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ArrayComponentAssociation
   * @generated
   */
  public Adapter createArrayComponentAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.AncestorPart <em>Ancestor Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.AncestorPart
   * @generated
   */
  public Adapter createAncestorPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.Name
   * @generated
   */
  public Adapter createNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.PrimaryName <em>Primary Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.PrimaryName
   * @generated
   */
  public Adapter createPrimaryNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ParameterAssociation <em>Parameter Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ParameterAssociation
   * @generated
   */
  public Adapter createParameterAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ParameterEffectiveValue <em>Parameter Effective Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ParameterEffectiveValue
   * @generated
   */
  public Adapter createParameterEffectiveValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.AttributeDesignator <em>Attribute Designator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.AttributeDesignator
   * @generated
   */
  public Adapter createAttributeDesignatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.Range <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.Range
   * @generated
   */
  public Adapter createRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.EntityRange <em>Entity Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.EntityRange
   * @generated
   */
  public Adapter createEntityRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ada2005.adb.ExplicitRange <em>Explicit Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ada2005.adb.ExplicitRange
   * @generated
   */
  public Adapter createExplicitRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AdbAdapterFactory
