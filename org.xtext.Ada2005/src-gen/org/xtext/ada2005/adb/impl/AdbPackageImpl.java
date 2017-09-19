/**
 */
package org.xtext.ada2005.adb.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.xtext.ada2005.adb.AdbFactory;
import org.xtext.ada2005.adb.AdbPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdbPackageImpl extends EPackageImpl implements AdbPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected String packageFilename = "adb.loadinitialization_ecore";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compilationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compilationUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass withClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass useClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass usePackageClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass useTypeClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass libraryUnitDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass libraryUnitSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass renamingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericInstantiationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subprogramBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarativeBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicDeclarativeItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newTypeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fullTypeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fullDataTypeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass incompleteTypeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass privateTypeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass privateExtensionDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entryDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass overridingIndicatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass protectedTypeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass protectedDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass protectedElementDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass protectedOperationDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subprogramDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subprogramSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedureSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass handledSequenceOfStatementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exceptionChoiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exceptionHandlerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarativeItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass properBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sequenceOfStatementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelisableStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compoundStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nullStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass librarySpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericItemsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericFormalParameterDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formalObjectDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formalTypeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formalTypeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formalPrivateTypeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formalDerivedTypeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formalSubprogramDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subprogramDefaultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formalPackageDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formalPackageActualPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formalPackageAssociationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exceptionDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataInstanceDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleProtectedDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pragmaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pragmaArgumentAssociationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subtypeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseStatementAlternativeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loopStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iterationSchemeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loopParameterSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exitStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gotoStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedureOrEntryCallStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleReturnStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extendedReturnStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass returnSubtypeIndicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass protectedBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass protectedOperationItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass acceptStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entryIndexEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entryBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entryBodyFormalPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entryBarrierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entryIndexSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requeueStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass delayStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectiveAcceptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass guardedAlternativeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass guardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectAlternativeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass acceptAlternativeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass delayAlternativeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timedEntryCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entryCallAlternativeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalEntryCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asynchronousSelectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass triggeringAlternativeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass triggeringStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abortablePartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abortStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskNamesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyStubEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageBodyStubEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskBodyStubEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass protectedBodyStubEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass separateSubunitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass raiseStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericActualPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericAssociationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass explicitGenericActualParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass discriminantPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unknownDiscriminantPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass knownDiscriminantPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass discriminantSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceTypeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass derivedTypeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recordExtensionPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accessTypeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accessSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accessToSubprogramDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accessToDataDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayTypeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayIndexesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unconstrainedIndexesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constrainedIndexesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass discreteSubtypeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anonymousAccessDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notNullAccessDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accessToDataInstanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterAndResultProfileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formalPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerTypeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signedIntegerTypeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modularTypeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumerationTypeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recordTypeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recordDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optVariantPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definingIdentifierListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aspectClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variantPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass discreteChoiceListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass realTypeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floatingPointDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass realRangeSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fixedPointDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass membershipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intervalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass factorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numericLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nullEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualifiedNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parenthesizedExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass allocatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subtypeIndicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optNullExclusionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scalarConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass digitsConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deltaConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rangeConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositeConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass discriminantConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indexConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass discriminantAssociationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass discriminantSelectorsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass discreteRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentChoiceListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass discreteChoiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aggregateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recordAggregateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recordComponentAssociationListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recordComponentAssociationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initializedComponentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uninitializedComponentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extensionAggregateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayAggregateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass positionalArrayAggregateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedArrayAggregateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayComponentAssociationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ancestorPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterAssociationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEffectiveValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeDesignatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass explicitRangeEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.ada2005.adb.AdbPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AdbPackageImpl()
  {
    super(eNS_URI, AdbFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link AdbPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @generated
   */
  public static AdbPackage init()
  {
    if (isInited) return (AdbPackage)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI);

    // Obtain or create and register package
    AdbPackageImpl theAdbPackage = (AdbPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AdbPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AdbPackageImpl());

    isInited = true;

    // Load packages
    theAdbPackage.loadPackage();

    // Fix loaded packages
    theAdbPackage.fixPackageContents();

    // Mark meta-data to indicate it can't be changed
    theAdbPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AdbPackage.eNS_URI, theAdbPackage);
    return theAdbPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompilation()
  {
    if (compilationEClass == null)
    {
      compilationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(0);
    }
    return compilationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompilation_CompilationUnits()
  {
        return (EReference)getCompilation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompilationUnit()
  {
    if (compilationUnitEClass == null)
    {
      compilationUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(1);
    }
    return compilationUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompilationUnit_ContextClause()
  {
        return (EReference)getCompilationUnit().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompilationUnit_Unit()
  {
        return (EReference)getCompilationUnit().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompilationUnit_Pragmas()
  {
        return (EReference)getCompilationUnit().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnit()
  {
    if (unitEClass == null)
    {
      unitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(2);
    }
    return unitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContextClause()
  {
    if (contextClauseEClass == null)
    {
      contextClauseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(3);
    }
    return contextClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContextClause_ContextItems()
  {
        return (EReference)getContextClause().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContextItem()
  {
    if (contextItemEClass == null)
    {
      contextItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(4);
    }
    return contextItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWithClause()
  {
    if (withClauseEClass == null)
    {
      withClauseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(5);
    }
    return withClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWithClause_Limited()
  {
        return (EAttribute)getWithClause().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWithClause_Private()
  {
        return (EAttribute)getWithClause().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWithClause_ImportURI()
  {
        return (EReference)getWithClause().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUseClause()
  {
    if (useClauseEClass == null)
    {
      useClauseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(6);
    }
    return useClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUsePackageClause()
  {
    if (usePackageClauseEClass == null)
    {
      usePackageClauseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(7);
    }
    return usePackageClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUsePackageClause_ImportedNamespace()
  {
        return (EReference)getUsePackageClause().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUseTypeClause()
  {
    if (useTypeClauseEClass == null)
    {
      useTypeClauseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(8);
    }
    return useTypeClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUseTypeClause_TypesNames()
  {
        return (EAttribute)getUseTypeClause().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUseTypeClause_UseTypeRefs()
  {
        return (EAttribute)getUseTypeClause().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLibraryUnitDeclaration()
  {
    if (libraryUnitDeclarationEClass == null)
    {
      libraryUnitDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(9);
    }
    return libraryUnitDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLibraryUnitDeclaration_Private()
  {
        return (EAttribute)getLibraryUnitDeclaration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLibraryUnitDeclaration_LibraryUnitSpecification()
  {
        return (EReference)getLibraryUnitDeclaration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLibraryUnitSpecification()
  {
    if (libraryUnitSpecificationEClass == null)
    {
      libraryUnitSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(10);
    }
    return libraryUnitSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageDeclaration()
  {
    if (packageDeclarationEClass == null)
    {
      packageDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(11);
    }
    return packageDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDeclaration_Name()
  {
        return (EAttribute)getPackageDeclaration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageDefinition()
  {
    if (packageDefinitionEClass == null)
    {
      packageDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(12);
    }
    return packageDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageDefinition_PackageSpecification()
  {
        return (EReference)getPackageDefinition().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRenaming()
  {
    if (renamingEClass == null)
    {
      renamingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(13);
    }
    return renamingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenaming_Renamed()
  {
        return (EAttribute)getRenaming().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenericDeclaration()
  {
    if (genericDeclarationEClass == null)
    {
      genericDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(14);
    }
    return genericDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenericDeclaration_GenericItems()
  {
        return (EReference)getGenericDeclaration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenericDeclaration_LibrarySpecification()
  {
        return (EReference)getGenericDeclaration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenericInstantiation()
  {
    if (genericInstantiationEClass == null)
    {
      genericInstantiationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(15);
    }
    return genericInstantiationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGenericInstantiation_Name()
  {
        return (EAttribute)getGenericInstantiation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGenericInstantiation_GenericName()
  {
        return (EAttribute)getGenericInstantiation().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenericInstantiation_Overriding()
  {
        return (EReference)getGenericInstantiation().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenericInstantiation_GenericActualPart()
  {
        return (EReference)getGenericInstantiation().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageSpecification()
  {
    if (packageSpecificationEClass == null)
    {
      packageSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(16);
    }
    return packageSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageSpecification_PublicBasicDeclarativeItems()
  {
        return (EReference)getPackageSpecification().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageSpecification_PrivateBasicDeclarativeItems()
  {
        return (EReference)getPackageSpecification().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageSpecification_Endname()
  {
        return (EAttribute)getPackageSpecification().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubprogramBody()
  {
    if (subprogramBodyEClass == null)
    {
      subprogramBodyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(17);
    }
    return subprogramBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubprogramBody_SubprogramSpecification()
  {
        return (EReference)getSubprogramBody().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubprogramBody_Endname()
  {
        return (EAttribute)getSubprogramBody().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclarativeBlock()
  {
    if (declarativeBlockEClass == null)
    {
      declarativeBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(18);
    }
    return declarativeBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarativeBlock_DeclarativeItems()
  {
        return (EReference)getDeclarativeBlock().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarativeBlock_HandledSequenceOfStatements()
  {
        return (EReference)getDeclarativeBlock().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicDeclarativeItem()
  {
    if (basicDeclarativeItemEClass == null)
    {
      basicDeclarativeItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(19);
    }
    return basicDeclarativeItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicDeclaration()
  {
    if (basicDeclarationEClass == null)
    {
      basicDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(20);
    }
    return basicDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskDeclaration()
  {
    if (taskDeclarationEClass == null)
    {
      taskDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(21);
    }
    return taskDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTaskDeclaration_Name()
  {
        return (EAttribute)getTaskDeclaration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskDeclaration_KnownDiscriminantPart()
  {
        return (EReference)getTaskDeclaration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskDeclaration_InterfaceList()
  {
        return (EReference)getTaskDeclaration().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskDeclaration_TaskDefinition()
  {
        return (EReference)getTaskDeclaration().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskDeclaration_Endid()
  {
        return (EReference)getTaskDeclaration().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDeclaration()
  {
    if (typeDeclarationEClass == null)
    {
      typeDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(22);
    }
    return typeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeDeclaration_Name()
  {
        return (EAttribute)getTypeDeclaration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewTypeDeclaration()
  {
    if (newTypeDeclarationEClass == null)
    {
      newTypeDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(23);
    }
    return newTypeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFullTypeDeclaration()
  {
    if (fullTypeDeclarationEClass == null)
    {
      fullTypeDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(24);
    }
    return fullTypeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFullTypeDeclaration_KnownDiscriminantPart()
  {
        return (EReference)getFullTypeDeclaration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFullDataTypeDeclaration()
  {
    if (fullDataTypeDeclarationEClass == null)
    {
      fullDataTypeDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(25);
    }
    return fullDataTypeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFullDataTypeDeclaration_TypeDefinition()
  {
        return (EReference)getFullDataTypeDeclaration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIncompleteTypeDeclaration()
  {
    if (incompleteTypeDeclarationEClass == null)
    {
      incompleteTypeDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(26);
    }
    return incompleteTypeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIncompleteTypeDeclaration_DiscriminantPart()
  {
        return (EReference)getIncompleteTypeDeclaration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIncompleteTypeDeclaration_Tagged()
  {
        return (EAttribute)getIncompleteTypeDeclaration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrivateTypeDeclaration()
  {
    if (privateTypeDeclarationEClass == null)
    {
      privateTypeDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(27);
    }
    return privateTypeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrivateTypeDeclaration_DiscriminantPart()
  {
        return (EReference)getPrivateTypeDeclaration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrivateTypeDeclaration_Abstract()
  {
        return (EAttribute)getPrivateTypeDeclaration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrivateTypeDeclaration_Tagged()
  {
        return (EAttribute)getPrivateTypeDeclaration().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrivateTypeDeclaration_Limited()
  {
        return (EAttribute)getPrivateTypeDeclaration().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrivateExtensionDeclaration()
  {
    if (privateExtensionDeclarationEClass == null)
    {
      privateExtensionDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(28);
    }
    return privateExtensionDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrivateExtensionDeclaration_DiscriminantPart()
  {
        return (EReference)getPrivateExtensionDeclaration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrivateExtensionDeclaration_Abstract()
  {
        return (EAttribute)getPrivateExtensionDeclaration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrivateExtensionDeclaration_Limited()
  {
        return (EAttribute)getPrivateExtensionDeclaration().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrivateExtensionDeclaration_Synchronized()
  {
        return (EAttribute)getPrivateExtensionDeclaration().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrivateExtensionDeclaration_AncestorSubtypeIndication()
  {
        return (EReference)getPrivateExtensionDeclaration().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrivateExtensionDeclaration_InterfaceList()
  {
        return (EReference)getPrivateExtensionDeclaration().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskItem()
  {
    if (taskItemEClass == null)
    {
      taskItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(29);
    }
    return taskItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntryDeclaration()
  {
    if (entryDeclarationEClass == null)
    {
      entryDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(30);
    }
    return entryDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntryDeclaration_Overriding()
  {
        return (EReference)getEntryDeclaration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntryDeclaration_Name()
  {
        return (EAttribute)getEntryDeclaration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntryDeclaration_DiscreteSubtypeDefinition()
  {
        return (EReference)getEntryDeclaration().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntryDeclaration_FormalPart()
  {
        return (EReference)getEntryDeclaration().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOverridingIndicator()
  {
    if (overridingIndicatorEClass == null)
    {
      overridingIndicatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(31);
    }
    return overridingIndicatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOverridingIndicator_Not()
  {
        return (EAttribute)getOverridingIndicator().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProtectedTypeDeclaration()
  {
    if (protectedTypeDeclarationEClass == null)
    {
      protectedTypeDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(32);
    }
    return protectedTypeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProtectedTypeDeclaration_InterfaceList()
  {
        return (EReference)getProtectedTypeDeclaration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProtectedTypeDeclaration_ProtectedDefinition()
  {
        return (EReference)getProtectedTypeDeclaration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProtectedDefinition()
  {
    if (protectedDefinitionEClass == null)
    {
      protectedDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(33);
    }
    return protectedDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProtectedDefinition_ProtectedOperationDeclaration()
  {
        return (EReference)getProtectedDefinition().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProtectedElementDeclaration()
  {
    if (protectedElementDeclarationEClass == null)
    {
      protectedElementDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(34);
    }
    return protectedElementDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProtectedOperationDeclaration()
  {
    if (protectedOperationDeclarationEClass == null)
    {
      protectedOperationDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(35);
    }
    return protectedOperationDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubprogramDeclaration()
  {
    if (subprogramDeclarationEClass == null)
    {
      subprogramDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(36);
    }
    return subprogramDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubprogramDeclaration_SubprogramSpecification()
  {
        return (EReference)getSubprogramDeclaration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubprogramDeclaration_Abstract()
  {
        return (EAttribute)getSubprogramDeclaration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubprogramDeclaration_RenamedName()
  {
        return (EAttribute)getSubprogramDeclaration().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubprogramDeclaration_Null()
  {
        return (EAttribute)getSubprogramDeclaration().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubprogramSpecification()
  {
    if (subprogramSpecificationEClass == null)
    {
      subprogramSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(37);
    }
    return subprogramSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubprogramSpecification_OverridingIndicator()
  {
        return (EReference)getSubprogramSpecification().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedureSpecification()
  {
    if (procedureSpecificationEClass == null)
    {
      procedureSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(38);
    }
    return procedureSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedureSpecification_FormalPart()
  {
        return (EReference)getProcedureSpecification().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionSpecification()
  {
    if (functionSpecificationEClass == null)
    {
      functionSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(39);
    }
    return functionSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionSpecification_ParameterAndResultProfile()
  {
        return (EReference)getFunctionSpecification().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHandledSequenceOfStatements()
  {
    if (handledSequenceOfStatementsEClass == null)
    {
      handledSequenceOfStatementsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(40);
    }
    return handledSequenceOfStatementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExceptionChoice()
  {
    if (exceptionChoiceEClass == null)
    {
      exceptionChoiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(41);
    }
    return exceptionChoiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExceptionChoice_Name()
  {
        return (EReference)getExceptionChoice().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExceptionChoice_Others()
  {
        return (EAttribute)getExceptionChoice().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExceptionHandler()
  {
    if (exceptionHandlerEClass == null)
    {
      exceptionHandlerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(42);
    }
    return exceptionHandlerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExceptionHandler_Name()
  {
        return (EAttribute)getExceptionHandler().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExceptionHandler_ExceptionChoice()
  {
        return (EReference)getExceptionHandler().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExceptionHandler_SequenceOfStatements()
  {
        return (EReference)getExceptionHandler().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclarativeItem()
  {
    if (declarativeItemEClass == null)
    {
      declarativeItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(43);
    }
    return declarativeItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBody()
  {
    if (bodyEClass == null)
    {
      bodyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(44);
    }
    return bodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperBody()
  {
    if (properBodyEClass == null)
    {
      properBodyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(45);
    }
    return properBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabel()
  {
    if (labelEClass == null)
    {
      labelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(46);
    }
    return labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_Identifier()
  {
        return (EAttribute)getLabel().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSequenceOfStatements()
  {
    if (sequenceOfStatementsEClass == null)
    {
      sequenceOfStatementsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(47);
    }
    return sequenceOfStatementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSequenceOfStatements_ExceptionHandler()
  {
        return (EReference)getSequenceOfStatements().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSequenceOfStatements_Statements()
  {
        return (EReference)getSequenceOfStatements().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabelisableStatement()
  {
    if (labelisableStatementEClass == null)
    {
      labelisableStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(48);
    }
    return labelisableStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelisableStatement_Labels()
  {
        return (EReference)getLabelisableStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelisableStatement_Statement()
  {
        return (EReference)getLabelisableStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    if (statementEClass == null)
    {
      statementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(49);
    }
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleStatement()
  {
    if (simpleStatementEClass == null)
    {
      simpleStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(50);
    }
    return simpleStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompoundStatement()
  {
    if (compoundStatementEClass == null)
    {
      compoundStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(51);
    }
    return compoundStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNullStatement()
  {
    if (nullStatementEClass == null)
    {
      nullStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(52);
    }
    return nullStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNullStatement_Null()
  {
        return (EAttribute)getNullStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLibrarySpecification()
  {
    if (librarySpecificationEClass == null)
    {
      librarySpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(53);
    }
    return librarySpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenericItems()
  {
    if (genericItemsEClass == null)
    {
      genericItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(54);
    }
    return genericItemsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenericItems_GenericItems()
  {
        return (EReference)getGenericItems().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenericItem()
  {
    if (genericItemEClass == null)
    {
      genericItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(55);
    }
    return genericItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenericFormalParameterDeclaration()
  {
    if (genericFormalParameterDeclarationEClass == null)
    {
      genericFormalParameterDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(56);
    }
    return genericFormalParameterDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormalObjectDeclaration()
  {
    if (formalObjectDeclarationEClass == null)
    {
      formalObjectDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(57);
    }
    return formalObjectDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormalObjectDeclaration_IdList()
  {
        return (EReference)getFormalObjectDeclaration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormalObjectDeclaration_Mode()
  {
        return (EReference)getFormalObjectDeclaration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormalObjectDeclaration_OptNullExclusion()
  {
        return (EReference)getFormalObjectDeclaration().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormalObjectDeclaration_SubtypeMark()
  {
        return (EReference)getFormalObjectDeclaration().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormalObjectDeclaration_AnonymousAccessDefinition()
  {
        return (EReference)getFormalObjectDeclaration().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormalObjectDeclaration_DefaultExpression()
  {
        return (EReference)getFormalObjectDeclaration().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormalTypeDeclaration()
  {
    if (formalTypeDeclarationEClass == null)
    {
      formalTypeDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(58);
    }
    return formalTypeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormalTypeDeclaration_Identifier()
  {
        return (EAttribute)getFormalTypeDeclaration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormalTypeDeclaration_DiscriminantPart()
  {
        return (EReference)getFormalTypeDeclaration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormalTypeDeclaration_FormalTypeDefinition()
  {
        return (EReference)getFormalTypeDeclaration().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormalTypeDefinition()
  {
    if (formalTypeDefinitionEClass == null)
    {
      formalTypeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(59);
    }
    return formalTypeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormalPrivateTypeDefinition()
  {
    if (formalPrivateTypeDefinitionEClass == null)
    {
      formalPrivateTypeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(60);
    }
    return formalPrivateTypeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormalPrivateTypeDefinition_Abstract()
  {
        return (EAttribute)getFormalPrivateTypeDefinition().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormalPrivateTypeDefinition_Tagged()
  {
        return (EAttribute)getFormalPrivateTypeDefinition().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormalPrivateTypeDefinition_Limited()
  {
        return (EAttribute)getFormalPrivateTypeDefinition().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormalDerivedTypeDefinition()
  {
    if (formalDerivedTypeDefinitionEClass == null)
    {
      formalDerivedTypeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(61);
    }
    return formalDerivedTypeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormalDerivedTypeDefinition_Absract()
  {
        return (EAttribute)getFormalDerivedTypeDefinition().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormalDerivedTypeDefinition_Limited()
  {
        return (EAttribute)getFormalDerivedTypeDefinition().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormalDerivedTypeDefinition_Synchronized()
  {
        return (EAttribute)getFormalDerivedTypeDefinition().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormalDerivedTypeDefinition_SubtypeMark()
  {
        return (EReference)getFormalDerivedTypeDefinition().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormalDerivedTypeDefinition_InterfaceList()
  {
        return (EReference)getFormalDerivedTypeDefinition().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormalSubprogramDeclaration()
  {
    if (formalSubprogramDeclarationEClass == null)
    {
      formalSubprogramDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(62);
    }
    return formalSubprogramDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormalSubprogramDeclaration_SubprogramSpecification()
  {
        return (EReference)getFormalSubprogramDeclaration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormalSubprogramDeclaration_Abstract()
  {
        return (EAttribute)getFormalSubprogramDeclaration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormalSubprogramDeclaration_SubprogramDefault()
  {
        return (EReference)getFormalSubprogramDeclaration().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubprogramDefault()
  {
    if (subprogramDefaultEClass == null)
    {
      subprogramDefaultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(63);
    }
    return subprogramDefaultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubprogramDefault_DefaultName()
  {
        return (EAttribute)getSubprogramDefault().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormalPackageDeclaration()
  {
    if (formalPackageDeclarationEClass == null)
    {
      formalPackageDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(64);
    }
    return formalPackageDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormalPackageDeclaration_Name()
  {
        return (EAttribute)getFormalPackageDeclaration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormalPackageDeclaration_GenericPackageName()
  {
        return (EAttribute)getFormalPackageDeclaration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormalPackageDeclaration_FormalPackageActualPart()
  {
        return (EReference)getFormalPackageDeclaration().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormalPackageActualPart()
  {
    if (formalPackageActualPartEClass == null)
    {
      formalPackageActualPartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(65);
    }
    return formalPackageActualPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormalPackageActualPart_Box()
  {
        return (EAttribute)getFormalPackageActualPart().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormalPackageActualPart_GenericActualPart()
  {
        return (EReference)getFormalPackageActualPart().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormalPackageActualPart_FormalPackageAssociation()
  {
        return (EReference)getFormalPackageActualPart().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormalPackageAssociation()
  {
    if (formalPackageAssociationEClass == null)
    {
      formalPackageAssociationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(66);
    }
    return formalPackageAssociationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormalPackageAssociation_GenericAssociation()
  {
        return (EReference)getFormalPackageAssociation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormalPackageAssociation_GenericFormalParameterSelectorName()
  {
        return (EAttribute)getFormalPackageAssociation().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExceptionDeclaration()
  {
    if (exceptionDeclarationEClass == null)
    {
      exceptionDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(67);
    }
    return exceptionDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExceptionDeclaration_IdList()
  {
        return (EReference)getExceptionDeclaration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExceptionDeclaration_RenamedName()
  {
        return (EReference)getExceptionDeclaration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectDeclaration()
  {
    if (objectDeclarationEClass == null)
    {
      objectDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(68);
    }
    return objectDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataInstanceDeclaration()
  {
    if (dataInstanceDeclarationEClass == null)
    {
      dataInstanceDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(69);
    }
    return dataInstanceDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataInstanceDeclaration_DefiningIdentifierList()
  {
        return (EReference)getDataInstanceDeclaration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataInstanceDeclaration_Aliased()
  {
        return (EAttribute)getDataInstanceDeclaration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataInstanceDeclaration_Constant()
  {
        return (EAttribute)getDataInstanceDeclaration().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataInstanceDeclaration_SubtypeIndication()
  {
        return (EReference)getDataInstanceDeclaration().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataInstanceDeclaration_Expression()
  {
        return (EReference)getDataInstanceDeclaration().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataInstanceDeclaration_ObjectName()
  {
        return (EReference)getDataInstanceDeclaration().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataInstanceDeclaration_AnonymousAccessDefinition()
  {
        return (EReference)getDataInstanceDeclaration().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataInstanceDeclaration_ArrayTypeDefinition()
  {
        return (EReference)getDataInstanceDeclaration().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleProtectedDeclaration()
  {
    if (singleProtectedDeclarationEClass == null)
    {
      singleProtectedDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(70);
    }
    return singleProtectedDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSingleProtectedDeclaration_Name()
  {
        return (EAttribute)getSingleProtectedDeclaration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSingleProtectedDeclaration_InterfaceList()
  {
        return (EReference)getSingleProtectedDeclaration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSingleProtectedDeclaration_ProtectedDefinition()
  {
        return (EReference)getSingleProtectedDeclaration().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPragma()
  {
    if (pragmaEClass == null)
    {
      pragmaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(71);
    }
    return pragmaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPragma_Name()
  {
        return (EAttribute)getPragma().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPragma_PragmaArgumentAssociation()
  {
        return (EReference)getPragma().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPragmaArgumentAssociation()
  {
    if (pragmaArgumentAssociationEClass == null)
    {
      pragmaArgumentAssociationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(72);
    }
    return pragmaArgumentAssociationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPragmaArgumentAssociation_Name()
  {
        return (EAttribute)getPragmaArgumentAssociation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPragmaArgumentAssociation_EffectiveArgument()
  {
        return (EReference)getPragmaArgumentAssociation().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubtypeDeclaration()
  {
    if (subtypeDeclarationEClass == null)
    {
      subtypeDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(73);
    }
    return subtypeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubtypeDeclaration_SubtypeIndication()
  {
        return (EReference)getSubtypeDeclaration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberDeclaration()
  {
    if (numberDeclarationEClass == null)
    {
      numberDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(74);
    }
    return numberDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberDeclaration_IdList()
  {
        return (EReference)getNumberDeclaration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberDeclaration_StaticExpression()
  {
        return (EReference)getNumberDeclaration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignmentStatement()
  {
    if (assignmentStatementEClass == null)
    {
      assignmentStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(75);
    }
    return assignmentStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignmentStatement_VariableName()
  {
        return (EReference)getAssignmentStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignmentStatement_InitialValue()
  {
        return (EReference)getAssignmentStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfStatement()
  {
    if (ifStatementEClass == null)
    {
      ifStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(76);
    }
    return ifStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_IfCondition()
  {
        return (EReference)getIfStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_ThenStatements()
  {
        return (EReference)getIfStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_ElsifConditions()
  {
        return (EReference)getIfStatement().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_ElsifStatements()
  {
        return (EReference)getIfStatement().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_ElseStatements()
  {
        return (EReference)getIfStatement().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCaseStatement()
  {
    if (caseStatementEClass == null)
    {
      caseStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(77);
    }
    return caseStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaseStatement_CaseValue()
  {
        return (EReference)getCaseStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaseStatement_CaseStatementAlternatives()
  {
        return (EReference)getCaseStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCaseStatementAlternative()
  {
    if (caseStatementAlternativeEClass == null)
    {
      caseStatementAlternativeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(78);
    }
    return caseStatementAlternativeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaseStatementAlternative_DiscreteChoiceList()
  {
        return (EReference)getCaseStatementAlternative().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaseStatementAlternative_SequenceOfStatements()
  {
        return (EReference)getCaseStatementAlternative().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoopStatement()
  {
    if (loopStatementEClass == null)
    {
      loopStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(79);
    }
    return loopStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoopStatement_Name()
  {
        return (EAttribute)getLoopStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoopStatement_IterationScheme()
  {
        return (EReference)getLoopStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoopStatement_SequenceOfStatements()
  {
        return (EReference)getLoopStatement().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoopStatement_SameName()
  {
        return (EAttribute)getLoopStatement().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIterationScheme()
  {
    if (iterationSchemeEClass == null)
    {
      iterationSchemeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(80);
    }
    return iterationSchemeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIterationScheme_Condition()
  {
        return (EReference)getIterationScheme().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIterationScheme_IterationSpecification()
  {
        return (EReference)getIterationScheme().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoopParameterSpecification()
  {
    if (loopParameterSpecificationEClass == null)
    {
      loopParameterSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(81);
    }
    return loopParameterSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoopParameterSpecification_Identifier()
  {
        return (EAttribute)getLoopParameterSpecification().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoopParameterSpecification_DiscreteSubtypeDefinition()
  {
        return (EReference)getLoopParameterSpecification().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlockStatement()
  {
    if (blockStatementEClass == null)
    {
      blockStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(82);
    }
    return blockStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBlockStatement_BlockStatementIdentifier()
  {
        return (EAttribute)getBlockStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExitStatement()
  {
    if (exitStatementEClass == null)
    {
      exitStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(83);
    }
    return exitStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExitStatement_Name()
  {
        return (EReference)getExitStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExitStatement_Condition()
  {
        return (EReference)getExitStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGotoStatement()
  {
    if (gotoStatementEClass == null)
    {
      gotoStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(84);
    }
    return gotoStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGotoStatement_LabelId()
  {
        return (EAttribute)getGotoStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedureOrEntryCallStatement()
  {
    if (procedureOrEntryCallStatementEClass == null)
    {
      procedureOrEntryCallStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(85);
    }
    return procedureOrEntryCallStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedureOrEntryCallStatement_Callee()
  {
        return (EReference)getProcedureOrEntryCallStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleReturnStatement()
  {
    if (simpleReturnStatementEClass == null)
    {
      simpleReturnStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(86);
    }
    return simpleReturnStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleReturnStatement_ReturnValue()
  {
        return (EReference)getSimpleReturnStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtendedReturnStatement()
  {
    if (extendedReturnStatementEClass == null)
    {
      extendedReturnStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(87);
    }
    return extendedReturnStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtendedReturnStatement_Identifier()
  {
        return (EAttribute)getExtendedReturnStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtendedReturnStatement_ReturnSubtype()
  {
        return (EReference)getExtendedReturnStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtendedReturnStatement_Expression()
  {
        return (EReference)getExtendedReturnStatement().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtendedReturnStatement_HandledSequenceOfStatements()
  {
        return (EReference)getExtendedReturnStatement().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReturnSubtypeIndication()
  {
    if (returnSubtypeIndicationEClass == null)
    {
      returnSubtypeIndicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(88);
    }
    return returnSubtypeIndicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageBody()
  {
    if (packageBodyEClass == null)
    {
      packageBodyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(89);
    }
    return packageBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageBody_Name()
  {
        return (EReference)getPackageBody().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageBody_EndName()
  {
        return (EReference)getPackageBody().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskDefinition()
  {
    if (taskDefinitionEClass == null)
    {
      taskDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(90);
    }
    return taskDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskDefinition_TaskItems()
  {
        return (EReference)getTaskDefinition().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskBody()
  {
    if (taskBodyEClass == null)
    {
      taskBodyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(91);
    }
    return taskBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskBody_Name()
  {
        return (EReference)getTaskBody().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskBody_EndId()
  {
        return (EReference)getTaskBody().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProtectedBody()
  {
    if (protectedBodyEClass == null)
    {
      protectedBodyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(92);
    }
    return protectedBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProtectedBody_Identifier()
  {
        return (EAttribute)getProtectedBody().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProtectedBody_ProtectedOperationItem()
  {
        return (EReference)getProtectedBody().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProtectedBody_IdTask()
  {
        return (EAttribute)getProtectedBody().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProtectedOperationItem()
  {
    if (protectedOperationItemEClass == null)
    {
      protectedOperationItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(93);
    }
    return protectedOperationItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAcceptStatement()
  {
    if (acceptStatementEClass == null)
    {
      acceptStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(94);
    }
    return acceptStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAcceptStatement_EntryName()
  {
        return (EReference)getAcceptStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAcceptStatement_EntryIndex()
  {
        return (EReference)getAcceptStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAcceptStatement_FormalPart()
  {
        return (EReference)getAcceptStatement().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAcceptStatement_HandledSequenceOfStatements()
  {
        return (EReference)getAcceptStatement().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAcceptStatement_Entryidentifier()
  {
        return (EAttribute)getAcceptStatement().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntryIndex()
  {
    if (entryIndexEClass == null)
    {
      entryIndexEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(95);
    }
    return entryIndexEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntryBody()
  {
    if (entryBodyEClass == null)
    {
      entryBodyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(96);
    }
    return entryBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntryBody_Name()
  {
        return (EReference)getEntryBody().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntryBody_EntryBodyFormalPart()
  {
        return (EReference)getEntryBody().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntryBody_EntryBarrier()
  {
        return (EReference)getEntryBody().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntryBody_Endid()
  {
        return (EAttribute)getEntryBody().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntryBodyFormalPart()
  {
    if (entryBodyFormalPartEClass == null)
    {
      entryBodyFormalPartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(97);
    }
    return entryBodyFormalPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntryBodyFormalPart_EntryIndexSpecification()
  {
        return (EReference)getEntryBodyFormalPart().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntryBodyFormalPart_FormalPart()
  {
        return (EReference)getEntryBodyFormalPart().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntryBarrier()
  {
    if (entryBarrierEClass == null)
    {
      entryBarrierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(98);
    }
    return entryBarrierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntryBarrier_Condition()
  {
        return (EReference)getEntryBarrier().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntryIndexSpecification()
  {
    if (entryIndexSpecificationEClass == null)
    {
      entryIndexSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(99);
    }
    return entryIndexSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntryIndexSpecification_Name()
  {
        return (EAttribute)getEntryIndexSpecification().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntryIndexSpecification_DiscreteSubtypeDefinition()
  {
        return (EReference)getEntryIndexSpecification().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequeueStatement()
  {
    if (requeueStatementEClass == null)
    {
      requeueStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(100);
    }
    return requeueStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequeueStatement_Name()
  {
        return (EReference)getRequeueStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequeueStatement_Abort()
  {
        return (EAttribute)getRequeueStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDelayStatement()
  {
    if (delayStatementEClass == null)
    {
      delayStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(101);
    }
    return delayStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDelayStatement_Until()
  {
        return (EAttribute)getDelayStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelayStatement_Delay()
  {
        return (EReference)getDelayStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectStatement()
  {
    if (selectStatementEClass == null)
    {
      selectStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(102);
    }
    return selectStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectiveAccept()
  {
    if (selectiveAcceptEClass == null)
    {
      selectiveAcceptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(103);
    }
    return selectiveAcceptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectiveAccept_Selectguard()
  {
        return (EReference)getSelectiveAccept().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectiveAccept_SelectAlternative()
  {
        return (EReference)getSelectiveAccept().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectiveAccept_GuardedAlternatives()
  {
        return (EReference)getSelectiveAccept().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectiveAccept_ElseStatements()
  {
        return (EReference)getSelectiveAccept().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGuardedAlternative()
  {
    if (guardedAlternativeEClass == null)
    {
      guardedAlternativeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(104);
    }
    return guardedAlternativeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGuardedAlternative_Guard()
  {
        return (EReference)getGuardedAlternative().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGuardedAlternative_Alternative()
  {
        return (EReference)getGuardedAlternative().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGuard()
  {
    if (guardEClass == null)
    {
      guardEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(105);
    }
    return guardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGuard_Condition()
  {
        return (EReference)getGuard().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectAlternative()
  {
    if (selectAlternativeEClass == null)
    {
      selectAlternativeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(106);
    }
    return selectAlternativeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectAlternative_SequenceOfStatements()
  {
        return (EReference)getSelectAlternative().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAcceptAlternative()
  {
    if (acceptAlternativeEClass == null)
    {
      acceptAlternativeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(107);
    }
    return acceptAlternativeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAcceptAlternative_AcceptStatement()
  {
        return (EReference)getAcceptAlternative().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDelayAlternative()
  {
    if (delayAlternativeEClass == null)
    {
      delayAlternativeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(108);
    }
    return delayAlternativeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelayAlternative_DelayStatement()
  {
        return (EReference)getDelayAlternative().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimedEntryCall()
  {
    if (timedEntryCallEClass == null)
    {
      timedEntryCallEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(109);
    }
    return timedEntryCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTimedEntryCall_EntryCallAlternative()
  {
        return (EReference)getTimedEntryCall().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTimedEntryCall_DelayAlternative()
  {
        return (EReference)getTimedEntryCall().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntryCallAlternative()
  {
    if (entryCallAlternativeEClass == null)
    {
      entryCallAlternativeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(110);
    }
    return entryCallAlternativeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntryCallAlternative_Call()
  {
        return (EReference)getEntryCallAlternative().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntryCallAlternative_SequenceOfStatements()
  {
        return (EReference)getEntryCallAlternative().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionalEntryCall()
  {
    if (conditionalEntryCallEClass == null)
    {
      conditionalEntryCallEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(111);
    }
    return conditionalEntryCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalEntryCall_EntryCallAlternative()
  {
        return (EReference)getConditionalEntryCall().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalEntryCall_ElseSequenceOfStatements()
  {
        return (EReference)getConditionalEntryCall().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAsynchronousSelect()
  {
    if (asynchronousSelectEClass == null)
    {
      asynchronousSelectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(112);
    }
    return asynchronousSelectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAsynchronousSelect_TriggeringAlternative()
  {
        return (EReference)getAsynchronousSelect().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAsynchronousSelect_AbortablePart()
  {
        return (EReference)getAsynchronousSelect().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTriggeringAlternative()
  {
    if (triggeringAlternativeEClass == null)
    {
      triggeringAlternativeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(113);
    }
    return triggeringAlternativeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTriggeringAlternative_TriggeringStatement()
  {
        return (EReference)getTriggeringAlternative().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTriggeringAlternative_SequenceOfStatements()
  {
        return (EReference)getTriggeringAlternative().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTriggeringStatement()
  {
    if (triggeringStatementEClass == null)
    {
      triggeringStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(114);
    }
    return triggeringStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbortablePart()
  {
    if (abortablePartEClass == null)
    {
      abortablePartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(115);
    }
    return abortablePartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbortStatement()
  {
    if (abortStatementEClass == null)
    {
      abortStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(116);
    }
    return abortStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskNames()
  {
    if (taskNamesEClass == null)
    {
      taskNamesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(117);
    }
    return taskNamesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskNames_TaskNames()
  {
        return (EReference)getTaskNames().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBodyStub()
  {
    if (bodyStubEClass == null)
    {
      bodyStubEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(118);
    }
    return bodyStubEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBodyStub_Name()
  {
        return (EAttribute)getBodyStub().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageBodyStub()
  {
    if (packageBodyStubEClass == null)
    {
      packageBodyStubEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(119);
    }
    return packageBodyStubEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskBodyStub()
  {
    if (taskBodyStubEClass == null)
    {
      taskBodyStubEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(120);
    }
    return taskBodyStubEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProtectedBodyStub()
  {
    if (protectedBodyStubEClass == null)
    {
      protectedBodyStubEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(121);
    }
    return protectedBodyStubEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSeparateSubunit()
  {
    if (separateSubunitEClass == null)
    {
      separateSubunitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(122);
    }
    return separateSubunitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSeparateSubunit_ParentUnitName()
  {
        return (EAttribute)getSeparateSubunit().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSeparateSubunit_ProperBody()
  {
        return (EReference)getSeparateSubunit().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRaiseStatement()
  {
    if (raiseStatementEClass == null)
    {
      raiseStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(123);
    }
    return raiseStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRaiseStatement_ExceptionName()
  {
        return (EReference)getRaiseStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRaiseStatement_WithExpression()
  {
        return (EReference)getRaiseStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenericActualPart()
  {
    if (genericActualPartEClass == null)
    {
      genericActualPartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(124);
    }
    return genericActualPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenericActualPart_GenericAssociation()
  {
        return (EReference)getGenericActualPart().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenericAssociation()
  {
    if (genericAssociationEClass == null)
    {
      genericAssociationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(125);
    }
    return genericAssociationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGenericAssociation_SelectorName()
  {
        return (EAttribute)getGenericAssociation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenericAssociation_ExpplicitGenericActualParam()
  {
        return (EReference)getGenericAssociation().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExplicitGenericActualParameter()
  {
    if (explicitGenericActualParameterEClass == null)
    {
      explicitGenericActualParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(126);
    }
    return explicitGenericActualParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDefinition()
  {
    if (typeDefinitionEClass == null)
    {
      typeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(127);
    }
    return typeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiscriminantPart()
  {
    if (discriminantPartEClass == null)
    {
      discriminantPartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(128);
    }
    return discriminantPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnknownDiscriminantPart()
  {
    if (unknownDiscriminantPartEClass == null)
    {
      unknownDiscriminantPartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(129);
    }
    return unknownDiscriminantPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnknownDiscriminantPart_Box()
  {
        return (EAttribute)getUnknownDiscriminantPart().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKnownDiscriminantPart()
  {
    if (knownDiscriminantPartEClass == null)
    {
      knownDiscriminantPartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(130);
    }
    return knownDiscriminantPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKnownDiscriminantPart_DiscriminantsSpecification()
  {
        return (EReference)getKnownDiscriminantPart().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiscriminantSpecification()
  {
    if (discriminantSpecificationEClass == null)
    {
      discriminantSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(131);
    }
    return discriminantSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiscriminantSpecification_DefiningIdentifiers()
  {
        return (EReference)getDiscriminantSpecification().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiscriminantSpecification_OptNullExclusion()
  {
        return (EReference)getDiscriminantSpecification().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiscriminantSpecification_AccessDefinition()
  {
        return (EReference)getDiscriminantSpecification().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiscriminantSpecification_SubtypeMark()
  {
        return (EReference)getDiscriminantSpecification().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiscriminantSpecification_DefaultValue()
  {
        return (EReference)getDiscriminantSpecification().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceList()
  {
    if (interfaceListEClass == null)
    {
      interfaceListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(132);
    }
    return interfaceListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceList_InterfaceSubtypeMark()
  {
        return (EReference)getInterfaceList().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceTypeDefinition()
  {
    if (interfaceTypeDefinitionEClass == null)
    {
      interfaceTypeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(133);
    }
    return interfaceTypeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterfaceTypeDefinition_Limited()
  {
        return (EAttribute)getInterfaceTypeDefinition().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterfaceTypeDefinition_Task()
  {
        return (EAttribute)getInterfaceTypeDefinition().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterfaceTypeDefinition_Protected()
  {
        return (EAttribute)getInterfaceTypeDefinition().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterfaceTypeDefinition_Synchro()
  {
        return (EAttribute)getInterfaceTypeDefinition().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceTypeDefinition_InterfaceList()
  {
        return (EReference)getInterfaceTypeDefinition().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDerivedTypeDefinition()
  {
    if (derivedTypeDefinitionEClass == null)
    {
      derivedTypeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(134);
    }
    return derivedTypeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDerivedTypeDefinition_Abstract()
  {
        return (EAttribute)getDerivedTypeDefinition().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDerivedTypeDefinition_Limited()
  {
        return (EAttribute)getDerivedTypeDefinition().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDerivedTypeDefinition_SubtypeIndication()
  {
        return (EReference)getDerivedTypeDefinition().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDerivedTypeDefinition_InterfaceList()
  {
        return (EReference)getDerivedTypeDefinition().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDerivedTypeDefinition_RecordExtentionPart()
  {
        return (EReference)getDerivedTypeDefinition().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecordExtensionPart()
  {
    if (recordExtensionPartEClass == null)
    {
      recordExtensionPartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(135);
    }
    return recordExtensionPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordExtensionPart_RecordDefinition()
  {
        return (EReference)getRecordExtensionPart().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAccessTypeDefinition()
  {
    if (accessTypeDefinitionEClass == null)
    {
      accessTypeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(136);
    }
    return accessTypeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAccessTypeDefinition_OptNullExclusion()
  {
        return (EReference)getAccessTypeDefinition().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAccessTypeDefinition_AccessDefinition()
  {
        return (EReference)getAccessTypeDefinition().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAccessSpecification()
  {
    if (accessSpecificationEClass == null)
    {
      accessSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(137);
    }
    return accessSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAccessToSubprogramDefinition()
  {
    if (accessToSubprogramDefinitionEClass == null)
    {
      accessToSubprogramDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(138);
    }
    return accessToSubprogramDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAccessToSubprogramDefinition_Protected()
  {
        return (EAttribute)getAccessToSubprogramDefinition().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAccessToSubprogramDefinition_FormalPart()
  {
        return (EReference)getAccessToSubprogramDefinition().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAccessToSubprogramDefinition_ParameterAndResultProfile()
  {
        return (EReference)getAccessToSubprogramDefinition().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAccessToDataDefinition()
  {
    if (accessToDataDefinitionEClass == null)
    {
      accessToDataDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(139);
    }
    return accessToDataDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAccessToDataDefinition_GeneralAccessModifier()
  {
        return (EAttribute)getAccessToDataDefinition().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAccessToDataDefinition_SubtypeIndication()
  {
        return (EReference)getAccessToDataDefinition().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayTypeDefinition()
  {
    if (arrayTypeDefinitionEClass == null)
    {
      arrayTypeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(140);
    }
    return arrayTypeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayTypeDefinition_ArrayIndexes()
  {
        return (EReference)getArrayTypeDefinition().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayTypeDefinition_ComponentDefinition()
  {
        return (EReference)getArrayTypeDefinition().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayIndexes()
  {
    if (arrayIndexesEClass == null)
    {
      arrayIndexesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(141);
    }
    return arrayIndexesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnconstrainedIndexes()
  {
    if (unconstrainedIndexesEClass == null)
    {
      unconstrainedIndexesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(142);
    }
    return unconstrainedIndexesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnconstrainedIndexes_SubtypeMark()
  {
        return (EReference)getUnconstrainedIndexes().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstrainedIndexes()
  {
    if (constrainedIndexesEClass == null)
    {
      constrainedIndexesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(143);
    }
    return constrainedIndexesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstrainedIndexes_ConstrainedIndex()
  {
        return (EReference)getConstrainedIndexes().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiscreteSubtypeDefinition()
  {
    if (discreteSubtypeDefinitionEClass == null)
    {
      discreteSubtypeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(144);
    }
    return discreteSubtypeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentDefinition()
  {
    if (componentDefinitionEClass == null)
    {
      componentDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(145);
    }
    return componentDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentDefinition_Aliased()
  {
        return (EAttribute)getComponentDefinition().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentDefinition_SubtypeIndication()
  {
        return (EReference)getComponentDefinition().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentDefinition_AnonymousAccessDefinition()
  {
        return (EReference)getComponentDefinition().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnonymousAccessDefinition()
  {
    if (anonymousAccessDefinitionEClass == null)
    {
      anonymousAccessDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(146);
    }
    return anonymousAccessDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnonymousAccessDefinition_OptNullExclusion()
  {
        return (EReference)getAnonymousAccessDefinition().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnonymousAccessDefinition_AccessDef()
  {
        return (EReference)getAnonymousAccessDefinition().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotNullAccessDefinition()
  {
    if (notNullAccessDefinitionEClass == null)
    {
      notNullAccessDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(147);
    }
    return notNullAccessDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAccessToDataInstance()
  {
    if (accessToDataInstanceEClass == null)
    {
      accessToDataInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(148);
    }
    return accessToDataInstanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAccessToDataInstance_Constant()
  {
        return (EAttribute)getAccessToDataInstance().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAccessToDataInstance_Name()
  {
        return (EReference)getAccessToDataInstance().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterAndResultProfile()
  {
    if (parameterAndResultProfileEClass == null)
    {
      parameterAndResultProfileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(149);
    }
    return parameterAndResultProfileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterAndResultProfile_FormalPart()
  {
        return (EReference)getParameterAndResultProfile().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterAndResultProfile_Opt_nullExclusion()
  {
        return (EReference)getParameterAndResultProfile().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterAndResultProfile_SubtypeMark()
  {
        return (EReference)getParameterAndResultProfile().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterAndResultProfile_AnonymousAccessDefinition()
  {
        return (EReference)getParameterAndResultProfile().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormalPart()
  {
    if (formalPartEClass == null)
    {
      formalPartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(150);
    }
    return formalPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormalPart_ParameterSpecifications()
  {
        return (EReference)getFormalPart().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterSpecification()
  {
    if (parameterSpecificationEClass == null)
    {
      parameterSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(151);
    }
    return parameterSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterSpecification_DefiningIdentifiers()
  {
        return (EReference)getParameterSpecification().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterSpecification_Mode()
  {
        return (EReference)getParameterSpecification().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterSpecification_OptNullExclusion()
  {
        return (EReference)getParameterSpecification().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterSpecification_SubtypeMark()
  {
        return (EReference)getParameterSpecification().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterSpecification_AnonymousAccessDefinition()
  {
        return (EReference)getParameterSpecification().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterSpecification_DefaultExpression()
  {
        return (EReference)getParameterSpecification().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMode()
  {
    if (modeEClass == null)
    {
      modeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(152);
    }
    return modeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMode_In()
  {
        return (EAttribute)getMode().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMode_Out()
  {
        return (EAttribute)getMode().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerTypeDefinition()
  {
    if (integerTypeDefinitionEClass == null)
    {
      integerTypeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(153);
    }
    return integerTypeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignedIntegerTypeDefinition()
  {
    if (signedIntegerTypeDefinitionEClass == null)
    {
      signedIntegerTypeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(154);
    }
    return signedIntegerTypeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignedIntegerTypeDefinition_First()
  {
        return (EReference)getSignedIntegerTypeDefinition().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignedIntegerTypeDefinition_Last()
  {
        return (EReference)getSignedIntegerTypeDefinition().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModularTypeDefinition()
  {
    if (modularTypeDefinitionEClass == null)
    {
      modularTypeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(155);
    }
    return modularTypeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModularTypeDefinition_StaticExpression()
  {
        return (EReference)getModularTypeDefinition().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumerationTypeDefinition()
  {
    if (enumerationTypeDefinitionEClass == null)
    {
      enumerationTypeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(156);
    }
    return enumerationTypeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumerationTypeDefinition_Enumerationliteralspecifications()
  {
        return (EAttribute)getEnumerationTypeDefinition().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecordTypeDefinition()
  {
    if (recordTypeDefinitionEClass == null)
    {
      recordTypeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(157);
    }
    return recordTypeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecordTypeDefinition_Abstract()
  {
        return (EAttribute)getRecordTypeDefinition().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecordTypeDefinition_Tagged()
  {
        return (EAttribute)getRecordTypeDefinition().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecordTypeDefinition_Limited()
  {
        return (EAttribute)getRecordTypeDefinition().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordTypeDefinition_RecordDefinition()
  {
        return (EReference)getRecordTypeDefinition().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecordDefinition()
  {
    if (recordDefinitionEClass == null)
    {
      recordDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(158);
    }
    return recordDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordDefinition_ComponentList()
  {
        return (EReference)getRecordDefinition().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecordDefinition_Null()
  {
        return (EAttribute)getRecordDefinition().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentList()
  {
    if (componentListEClass == null)
    {
      componentListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(159);
    }
    return componentListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentList_ComponentItems()
  {
        return (EReference)getComponentList().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentList_OptVariantPart()
  {
        return (EReference)getComponentList().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptVariantPart()
  {
    if (optVariantPartEClass == null)
    {
      optVariantPartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(160);
    }
    return optVariantPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptVariantPart_VariantPart()
  {
        return (EReference)getOptVariantPart().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentItem()
  {
    if (componentItemEClass == null)
    {
      componentItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(161);
    }
    return componentItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentDeclaration()
  {
    if (componentDeclarationEClass == null)
    {
      componentDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(162);
    }
    return componentDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentDeclaration_DefiningIdentifiers()
  {
        return (EReference)getComponentDeclaration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentDeclaration_ComponentDefinition()
  {
        return (EReference)getComponentDeclaration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentDeclaration_DefaultExpression()
  {
        return (EReference)getComponentDeclaration().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefiningIdentifierList()
  {
    if (definingIdentifierListEClass == null)
    {
      definingIdentifierListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(163);
    }
    return definingIdentifierListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefiningIdentifierList_Name()
  {
        return (EAttribute)getDefiningIdentifierList().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAspectClause()
  {
    if (aspectClauseEClass == null)
    {
      aspectClauseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(164);
    }
    return aspectClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAspectClause_Name()
  {
        return (EAttribute)getAspectClause().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAspectClause_Expression()
  {
        return (EReference)getAspectClause().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAspectClause_Mod()
  {
        return (EReference)getAspectClause().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAspectClause_ComponentClause()
  {
        return (EReference)getAspectClause().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModClause()
  {
    if (modClauseEClass == null)
    {
      modClauseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(165);
    }
    return modClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModClause_Mod()
  {
        return (EReference)getModClause().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentClause()
  {
    if (componentClauseEClass == null)
    {
      componentClauseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(166);
    }
    return componentClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentClause_LocalName()
  {
        return (EAttribute)getComponentClause().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentClause_Position()
  {
        return (EReference)getComponentClause().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentClause_FirstBit()
  {
        return (EReference)getComponentClause().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentClause_LastBit()
  {
        return (EReference)getComponentClause().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariantPart()
  {
    if (variantPartEClass == null)
    {
      variantPartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(167);
    }
    return variantPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariantPart_Name()
  {
        return (EAttribute)getVariantPart().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariantPart_Variants()
  {
        return (EReference)getVariantPart().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariant()
  {
    if (variantEClass == null)
    {
      variantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(168);
    }
    return variantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariant_DiscreteChoiceList()
  {
        return (EReference)getVariant().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariant_ComponentList()
  {
        return (EReference)getVariant().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiscreteChoiceList()
  {
    if (discreteChoiceListEClass == null)
    {
      discreteChoiceListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(169);
    }
    return discreteChoiceListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiscreteChoiceList_DiscreteChoiceList()
  {
        return (EReference)getDiscreteChoiceList().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRealTypeDefinition()
  {
    if (realTypeDefinitionEClass == null)
    {
      realTypeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(170);
    }
    return realTypeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRealTypeDefinition_Digits()
  {
        return (EReference)getRealTypeDefinition().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRealTypeDefinition_RealRangeSpecification()
  {
        return (EReference)getRealTypeDefinition().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFloatingPointDefinition()
  {
    if (floatingPointDefinitionEClass == null)
    {
      floatingPointDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(171);
    }
    return floatingPointDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRealRangeSpecification()
  {
    if (realRangeSpecificationEClass == null)
    {
      realRangeSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(172);
    }
    return realRangeSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRealRangeSpecification_LowerBound()
  {
        return (EReference)getRealRangeSpecification().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRealRangeSpecification_UpperBound()
  {
        return (EReference)getRealRangeSpecification().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFixedPointDefinition()
  {
    if (fixedPointDefinitionEClass == null)
    {
      fixedPointDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(173);
    }
    return fixedPointDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFixedPointDefinition_Delta()
  {
        return (EReference)getFixedPointDefinition().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    if (expressionEClass == null)
    {
      expressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(174);
    }
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Relations()
  {
        return (EReference)getExpression().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_BooleanOperator()
  {
        return (EAttribute)getExpression().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelation()
  {
    if (relationEClass == null)
    {
      relationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(175);
    }
    return relationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_SimpleExpression()
  {
        return (EReference)getRelation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelation_RelationalOperator()
  {
        return (EAttribute)getRelation().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_SubSimpleExpression()
  {
        return (EReference)getRelation().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_Membership()
  {
        return (EReference)getRelation().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMembership()
  {
    if (membershipEClass == null)
    {
      membershipEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(176);
    }
    return membershipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMembership_Not()
  {
        return (EAttribute)getMembership().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMembership_Interval()
  {
        return (EReference)getMembership().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterval()
  {
    if (intervalEClass == null)
    {
      intervalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(177);
    }
    return intervalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleExpression()
  {
    if (simpleExpressionEClass == null)
    {
      simpleExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(178);
    }
    return simpleExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleExpression_UnaryAddingOperator()
  {
        return (EAttribute)getSimpleExpression().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleExpression_Terms()
  {
        return (EReference)getSimpleExpression().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleExpression_BinaryAddingOperators()
  {
        return (EAttribute)getSimpleExpression().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTerm()
  {
    if (termEClass == null)
    {
      termEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(179);
    }
    return termEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTerm_Factors()
  {
        return (EReference)getTerm().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTerm_MultiplyingOperators()
  {
        return (EAttribute)getTerm().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFactor()
  {
    if (factorEClass == null)
    {
      factorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(180);
    }
    return factorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFactor_Primary()
  {
        return (EReference)getFactor().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFactor_Exponent()
  {
        return (EReference)getFactor().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFactor_Abs()
  {
        return (EAttribute)getFactor().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFactor_Not()
  {
        return (EAttribute)getFactor().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimary()
  {
    if (primaryEClass == null)
    {
      primaryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(181);
    }
    return primaryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumericLiteral()
  {
    if (numericLiteralEClass == null)
    {
      numericLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(182);
    }
    return numericLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumericLiteral_Value()
  {
        return (EAttribute)getNumericLiteral().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNull()
  {
    if (nullEClass == null)
    {
      nullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(183);
    }
    return nullEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNull_Value()
  {
        return (EAttribute)getNull().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLiteral()
  {
    if (stringLiteralEClass == null)
    {
      stringLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(184);
    }
    return stringLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringLiteral_Value()
  {
        return (EAttribute)getStringLiteral().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualifiedName()
  {
    if (qualifiedNameEClass == null)
    {
      qualifiedNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(185);
    }
    return qualifiedNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQualifiedName_Name()
  {
        return (EReference)getQualifiedName().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQualifiedName_Qualifier()
  {
        return (EReference)getQualifiedName().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParenthesizedExpression()
  {
    if (parenthesizedExpressionEClass == null)
    {
      parenthesizedExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(186);
    }
    return parenthesizedExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualifier()
  {
    if (qualifierEClass == null)
    {
      qualifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(187);
    }
    return qualifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAllocator()
  {
    if (allocatorEClass == null)
    {
      allocatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(188);
    }
    return allocatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAllocator_TypeName()
  {
        return (EReference)getAllocator().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAllocator_Qualifier()
  {
        return (EReference)getAllocator().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubtypeIndication()
  {
    if (subtypeIndicationEClass == null)
    {
      subtypeIndicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(189);
    }
    return subtypeIndicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubtypeIndication_Opt_nullExclusion()
  {
        return (EReference)getSubtypeIndication().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubtypeIndication_SubtypeMark()
  {
        return (EAttribute)getSubtypeIndication().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubtypeIndication_Opt_constraint()
  {
        return (EReference)getSubtypeIndication().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptNullExclusion()
  {
    if (optNullExclusionEClass == null)
    {
      optNullExclusionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(190);
    }
    return optNullExclusionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOptNullExclusion_Not_null()
  {
        return (EAttribute)getOptNullExclusion().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptConstraint()
  {
    if (optConstraintEClass == null)
    {
      optConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(191);
    }
    return optConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptConstraint_OptConstraint()
  {
        return (EReference)getOptConstraint().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScalarConstraint()
  {
    if (scalarConstraintEClass == null)
    {
      scalarConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(192);
    }
    return scalarConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDigitsConstraint()
  {
    if (digitsConstraintEClass == null)
    {
      digitsConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(193);
    }
    return digitsConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDigitsConstraint_Digits()
  {
        return (EReference)getDigitsConstraint().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDigitsConstraint_RangeConstraint()
  {
        return (EReference)getDigitsConstraint().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeltaConstraint()
  {
    if (deltaConstraintEClass == null)
    {
      deltaConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(194);
    }
    return deltaConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeltaConstraint_Delta()
  {
        return (EReference)getDeltaConstraint().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeltaConstraint_RangeConstraint()
  {
        return (EReference)getDeltaConstraint().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRangeConstraint()
  {
    if (rangeConstraintEClass == null)
    {
      rangeConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(195);
    }
    return rangeConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositeConstraint()
  {
    if (compositeConstraintEClass == null)
    {
      compositeConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(196);
    }
    return compositeConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiscriminantConstraint()
  {
    if (discriminantConstraintEClass == null)
    {
      discriminantConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(197);
    }
    return discriminantConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiscriminantConstraint_DiscriminantAssociation()
  {
        return (EReference)getDiscriminantConstraint().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndexConstraint()
  {
    if (indexConstraintEClass == null)
    {
      indexConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(198);
    }
    return indexConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndexConstraint_DiscreteRange()
  {
        return (EReference)getIndexConstraint().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiscriminantAssociation()
  {
    if (discriminantAssociationEClass == null)
    {
      discriminantAssociationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(199);
    }
    return discriminantAssociationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiscriminantAssociation_DiscriminantSelectors()
  {
        return (EReference)getDiscriminantAssociation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiscriminantAssociation_ActualParameter()
  {
        return (EReference)getDiscriminantAssociation().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiscriminantSelectors()
  {
    if (discriminantSelectorsEClass == null)
    {
      discriminantSelectorsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(200);
    }
    return discriminantSelectorsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiscriminantSelectors_DiscriminantSelectorName()
  {
        return (EAttribute)getDiscriminantSelectors().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiscreteRange()
  {
    if (discreteRangeEClass == null)
    {
      discreteRangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(201);
    }
    return discreteRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentChoiceList()
  {
    if (componentChoiceListEClass == null)
    {
      componentChoiceListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(202);
    }
    return componentChoiceListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentChoiceList_ComponentSelectorName()
  {
        return (EAttribute)getComponentChoiceList().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentChoiceList_Others()
  {
        return (EAttribute)getComponentChoiceList().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiscreteChoice()
  {
    if (discreteChoiceEClass == null)
    {
      discreteChoiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(203);
    }
    return discreteChoiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAggregate()
  {
    if (aggregateEClass == null)
    {
      aggregateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(204);
    }
    return aggregateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecordAggregate()
  {
    if (recordAggregateEClass == null)
    {
      recordAggregateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(205);
    }
    return recordAggregateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecordComponentAssociationList()
  {
    if (recordComponentAssociationListEClass == null)
    {
      recordComponentAssociationListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(206);
    }
    return recordComponentAssociationListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordComponentAssociationList_RecordComponentAssociation()
  {
        return (EReference)getRecordComponentAssociationList().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecordComponentAssociationList_NullRecord()
  {
        return (EAttribute)getRecordComponentAssociationList().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecordComponentAssociation()
  {
    if (recordComponentAssociationEClass == null)
    {
      recordComponentAssociationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(207);
    }
    return recordComponentAssociationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordComponentAssociation_ComponentChoiceList()
  {
        return (EReference)getRecordComponentAssociation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInitializedComponents()
  {
    if (initializedComponentsEClass == null)
    {
      initializedComponentsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(208);
    }
    return initializedComponentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitializedComponents_Value()
  {
        return (EReference)getInitializedComponents().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUninitializedComponents()
  {
    if (uninitializedComponentsEClass == null)
    {
      uninitializedComponentsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(209);
    }
    return uninitializedComponentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUninitializedComponents_Box()
  {
        return (EAttribute)getUninitializedComponents().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtensionAggregate()
  {
    if (extensionAggregateEClass == null)
    {
      extensionAggregateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(210);
    }
    return extensionAggregateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtensionAggregate_AncestorPart()
  {
        return (EReference)getExtensionAggregate().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtensionAggregate_RecordComponentAssociationList()
  {
        return (EReference)getExtensionAggregate().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayAggregate()
  {
    if (arrayAggregateEClass == null)
    {
      arrayAggregateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(211);
    }
    return arrayAggregateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPositionalArrayAggregate()
  {
    if (positionalArrayAggregateEClass == null)
    {
      positionalArrayAggregateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(212);
    }
    return positionalArrayAggregateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPositionalArrayAggregate_InitialValues()
  {
        return (EReference)getPositionalArrayAggregate().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPositionalArrayAggregate_OthersValue()
  {
        return (EReference)getPositionalArrayAggregate().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPositionalArrayAggregate_OthersBox()
  {
        return (EAttribute)getPositionalArrayAggregate().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedArrayAggregate()
  {
    if (namedArrayAggregateEClass == null)
    {
      namedArrayAggregateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(213);
    }
    return namedArrayAggregateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamedArrayAggregate_ArrayComponentAssociation()
  {
        return (EReference)getNamedArrayAggregate().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayComponentAssociation()
  {
    if (arrayComponentAssociationEClass == null)
    {
      arrayComponentAssociationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(214);
    }
    return arrayComponentAssociationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayComponentAssociation_DiscreteChoiceList()
  {
        return (EReference)getArrayComponentAssociation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayComponentAssociation_Expression()
  {
        return (EReference)getArrayComponentAssociation().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrayComponentAssociation_Box()
  {
        return (EAttribute)getArrayComponentAssociation().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAncestorPart()
  {
    if (ancestorPartEClass == null)
    {
      ancestorPartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(215);
    }
    return ancestorPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getName_()
  {
    if (nameEClass == null)
    {
      nameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(216);
    }
    return nameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getName_Name()
  {
        return (EAttribute)getName_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getName_PrimaryName()
  {
        return (EReference)getName_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimaryName()
  {
    if (primaryNameEClass == null)
    {
      primaryNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(217);
    }
    return primaryNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryName_ParameterAssociation()
  {
        return (EReference)getPrimaryName().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryName_PrimaryName()
  {
        return (EReference)getPrimaryName().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryName_Name()
  {
        return (EReference)getPrimaryName().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryName_AttributeDesignator()
  {
        return (EReference)getPrimaryName().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterAssociation()
  {
    if (parameterAssociationEClass == null)
    {
      parameterAssociationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(218);
    }
    return parameterAssociationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterAssociation_SelectorName()
  {
        return (EAttribute)getParameterAssociation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterAssociation_ParameterEffectiveValue()
  {
        return (EReference)getParameterAssociation().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterEffectiveValue()
  {
    if (parameterEffectiveValueEClass == null)
    {
      parameterEffectiveValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(219);
    }
    return parameterEffectiveValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeDesignator()
  {
    if (attributeDesignatorEClass == null)
    {
      attributeDesignatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(220);
    }
    return attributeDesignatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeDesignator_StaticExpression()
  {
        return (EReference)getAttributeDesignator().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRange()
  {
    if (rangeEClass == null)
    {
      rangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(221);
    }
    return rangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntityRange()
  {
    if (entityRangeEClass == null)
    {
      entityRangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(222);
    }
    return entityRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityRange_Name()
  {
        return (EReference)getEntityRange().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityRange_Index()
  {
        return (EReference)getEntityRange().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExplicitRange()
  {
    if (explicitRangeEClass == null)
    {
      explicitRangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AdbPackage.eNS_URI).getEClassifiers().get(223);
    }
    return explicitRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExplicitRange_First()
  {
        return (EReference)getExplicitRange().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExplicitRange_Last()
  {
        return (EReference)getExplicitRange().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdbFactory getAdbFactory()
  {
    return (AdbFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isLoaded = false;

  /**
   * Laods the package and any sub-packages from their serialized form.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void loadPackage()
  {
    if (isLoaded) return;
    isLoaded = true;

    URL url = getClass().getResource(packageFilename);
    if (url == null)
    {
      throw new RuntimeException("Missing serialized package: " + packageFilename);
    }
    URI uri = URI.createURI(url.toString());
    Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
    try
    {
      resource.load(null);
    }
    catch (IOException exception)
    {
      throw new WrappedException(exception);
    }
    initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
    createResource(eNS_URI);
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isFixed = false;

  /**
   * Fixes up the loaded package, to make it appear as if it had been programmatically built.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fixPackageContents()
  {
    if (isFixed) return;
    isFixed = true;
    fixEClassifiers();
  }

  /**
   * Sets the instance class on the given classifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void fixInstanceClass(EClassifier eClassifier)
  {
    if (eClassifier.getInstanceClassName() == null)
    {
      eClassifier.setInstanceClassName("org.xtext.ada2005.adb." + eClassifier.getName());
      setGeneratedClassName(eClassifier);
    }
  }

} //AdbPackageImpl
