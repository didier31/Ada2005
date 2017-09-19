/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.ParameterSpecification#getDefiningIdentifiers <em>Defining Identifiers</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ParameterSpecification#getMode <em>Mode</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ParameterSpecification#getOptNullExclusion <em>Opt Null Exclusion</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ParameterSpecification#getSubtypeMark <em>Subtype Mark</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ParameterSpecification#getAnonymousAccessDefinition <em>Anonymous Access Definition</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ParameterSpecification#getDefaultExpression <em>Default Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getParameterSpecification()
 * @model
 * @generated
 */
public interface ParameterSpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Defining Identifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Defining Identifiers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defining Identifiers</em>' containment reference.
   * @see #setDefiningIdentifiers(DefiningIdentifierList)
   * @see org.xtext.ada2005.adb.AdbPackage#getParameterSpecification_DefiningIdentifiers()
   * @model containment="true"
   * @generated
   */
  DefiningIdentifierList getDefiningIdentifiers();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ParameterSpecification#getDefiningIdentifiers <em>Defining Identifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Defining Identifiers</em>' containment reference.
   * @see #getDefiningIdentifiers()
   * @generated
   */
  void setDefiningIdentifiers(DefiningIdentifierList value);

  /**
   * Returns the value of the '<em><b>Mode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mode</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mode</em>' containment reference.
   * @see #setMode(Mode)
   * @see org.xtext.ada2005.adb.AdbPackage#getParameterSpecification_Mode()
   * @model containment="true"
   * @generated
   */
  Mode getMode();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ParameterSpecification#getMode <em>Mode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode</em>' containment reference.
   * @see #getMode()
   * @generated
   */
  void setMode(Mode value);

  /**
   * Returns the value of the '<em><b>Opt Null Exclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opt Null Exclusion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opt Null Exclusion</em>' containment reference.
   * @see #setOptNullExclusion(OptNullExclusion)
   * @see org.xtext.ada2005.adb.AdbPackage#getParameterSpecification_OptNullExclusion()
   * @model containment="true"
   * @generated
   */
  OptNullExclusion getOptNullExclusion();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ParameterSpecification#getOptNullExclusion <em>Opt Null Exclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opt Null Exclusion</em>' containment reference.
   * @see #getOptNullExclusion()
   * @generated
   */
  void setOptNullExclusion(OptNullExclusion value);

  /**
   * Returns the value of the '<em><b>Subtype Mark</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subtype Mark</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subtype Mark</em>' containment reference.
   * @see #setSubtypeMark(Name)
   * @see org.xtext.ada2005.adb.AdbPackage#getParameterSpecification_SubtypeMark()
   * @model containment="true"
   * @generated
   */
  Name getSubtypeMark();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ParameterSpecification#getSubtypeMark <em>Subtype Mark</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subtype Mark</em>' containment reference.
   * @see #getSubtypeMark()
   * @generated
   */
  void setSubtypeMark(Name value);

  /**
   * Returns the value of the '<em><b>Anonymous Access Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anonymous Access Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anonymous Access Definition</em>' containment reference.
   * @see #setAnonymousAccessDefinition(AnonymousAccessDefinition)
   * @see org.xtext.ada2005.adb.AdbPackage#getParameterSpecification_AnonymousAccessDefinition()
   * @model containment="true"
   * @generated
   */
  AnonymousAccessDefinition getAnonymousAccessDefinition();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ParameterSpecification#getAnonymousAccessDefinition <em>Anonymous Access Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anonymous Access Definition</em>' containment reference.
   * @see #getAnonymousAccessDefinition()
   * @generated
   */
  void setAnonymousAccessDefinition(AnonymousAccessDefinition value);

  /**
   * Returns the value of the '<em><b>Default Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Expression</em>' containment reference.
   * @see #setDefaultExpression(Expression)
   * @see org.xtext.ada2005.adb.AdbPackage#getParameterSpecification_DefaultExpression()
   * @model containment="true"
   * @generated
   */
  Expression getDefaultExpression();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ParameterSpecification#getDefaultExpression <em>Default Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Expression</em>' containment reference.
   * @see #getDefaultExpression()
   * @generated
   */
  void setDefaultExpression(Expression value);

} // ParameterSpecification
