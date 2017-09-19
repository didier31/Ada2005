/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Access Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.AnonymousAccessDefinition#getOptNullExclusion <em>Opt Null Exclusion</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.AnonymousAccessDefinition#getAccessDef <em>Access Def</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getAnonymousAccessDefinition()
 * @model
 * @generated
 */
public interface AnonymousAccessDefinition extends ReturnSubtypeIndication
{
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
   * @see org.xtext.ada2005.adb.AdbPackage#getAnonymousAccessDefinition_OptNullExclusion()
   * @model containment="true"
   * @generated
   */
  OptNullExclusion getOptNullExclusion();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.AnonymousAccessDefinition#getOptNullExclusion <em>Opt Null Exclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opt Null Exclusion</em>' containment reference.
   * @see #getOptNullExclusion()
   * @generated
   */
  void setOptNullExclusion(OptNullExclusion value);

  /**
   * Returns the value of the '<em><b>Access Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access Def</em>' containment reference.
   * @see #setAccessDef(NotNullAccessDefinition)
   * @see org.xtext.ada2005.adb.AdbPackage#getAnonymousAccessDefinition_AccessDef()
   * @model containment="true"
   * @generated
   */
  NotNullAccessDefinition getAccessDef();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.AnonymousAccessDefinition#getAccessDef <em>Access Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access Def</em>' containment reference.
   * @see #getAccessDef()
   * @generated
   */
  void setAccessDef(NotNullAccessDefinition value);

} // AnonymousAccessDefinition
