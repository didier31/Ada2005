/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Object Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.FormalObjectDeclaration#getIdList <em>Id List</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.FormalObjectDeclaration#getMode <em>Mode</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.FormalObjectDeclaration#getOptNullExclusion <em>Opt Null Exclusion</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.FormalObjectDeclaration#getSubtypeMark <em>Subtype Mark</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.FormalObjectDeclaration#getAnonymousAccessDefinition <em>Anonymous Access Definition</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.FormalObjectDeclaration#getDefaultExpression <em>Default Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getFormalObjectDeclaration()
 * @model
 * @generated
 */
public interface FormalObjectDeclaration extends GenericFormalParameterDeclaration
{
  /**
   * Returns the value of the '<em><b>Id List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id List</em>' containment reference.
   * @see #setIdList(DefiningIdentifierList)
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalObjectDeclaration_IdList()
   * @model containment="true"
   * @generated
   */
  DefiningIdentifierList getIdList();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalObjectDeclaration#getIdList <em>Id List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id List</em>' containment reference.
   * @see #getIdList()
   * @generated
   */
  void setIdList(DefiningIdentifierList value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalObjectDeclaration_Mode()
   * @model containment="true"
   * @generated
   */
  Mode getMode();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalObjectDeclaration#getMode <em>Mode</em>}' containment reference.
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
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalObjectDeclaration_OptNullExclusion()
   * @model containment="true"
   * @generated
   */
  OptNullExclusion getOptNullExclusion();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalObjectDeclaration#getOptNullExclusion <em>Opt Null Exclusion</em>}' containment reference.
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
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalObjectDeclaration_SubtypeMark()
   * @model containment="true"
   * @generated
   */
  Name getSubtypeMark();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalObjectDeclaration#getSubtypeMark <em>Subtype Mark</em>}' containment reference.
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
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalObjectDeclaration_AnonymousAccessDefinition()
   * @model containment="true"
   * @generated
   */
  AnonymousAccessDefinition getAnonymousAccessDefinition();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalObjectDeclaration#getAnonymousAccessDefinition <em>Anonymous Access Definition</em>}' containment reference.
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
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalObjectDeclaration_DefaultExpression()
   * @model containment="true"
   * @generated
   */
  Expression getDefaultExpression();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalObjectDeclaration#getDefaultExpression <em>Default Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Expression</em>' containment reference.
   * @see #getDefaultExpression()
   * @generated
   */
  void setDefaultExpression(Expression value);

} // FormalObjectDeclaration
