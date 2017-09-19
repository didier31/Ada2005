/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access To Subprogram Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.AccessToSubprogramDefinition#isProtected <em>Protected</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.AccessToSubprogramDefinition#getFormalPart <em>Formal Part</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.AccessToSubprogramDefinition#getParameterAndResultProfile <em>Parameter And Result Profile</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getAccessToSubprogramDefinition()
 * @model
 * @generated
 */
public interface AccessToSubprogramDefinition extends AccessSpecification, NotNullAccessDefinition
{
  /**
   * Returns the value of the '<em><b>Protected</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Protected</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protected</em>' attribute.
   * @see #setProtected(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getAccessToSubprogramDefinition_Protected()
   * @model
   * @generated
   */
  boolean isProtected();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.AccessToSubprogramDefinition#isProtected <em>Protected</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Protected</em>' attribute.
   * @see #isProtected()
   * @generated
   */
  void setProtected(boolean value);

  /**
   * Returns the value of the '<em><b>Formal Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formal Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formal Part</em>' containment reference.
   * @see #setFormalPart(FormalPart)
   * @see org.xtext.ada2005.adb.AdbPackage#getAccessToSubprogramDefinition_FormalPart()
   * @model containment="true"
   * @generated
   */
  FormalPart getFormalPart();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.AccessToSubprogramDefinition#getFormalPart <em>Formal Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formal Part</em>' containment reference.
   * @see #getFormalPart()
   * @generated
   */
  void setFormalPart(FormalPart value);

  /**
   * Returns the value of the '<em><b>Parameter And Result Profile</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter And Result Profile</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter And Result Profile</em>' containment reference.
   * @see #setParameterAndResultProfile(ParameterAndResultProfile)
   * @see org.xtext.ada2005.adb.AdbPackage#getAccessToSubprogramDefinition_ParameterAndResultProfile()
   * @model containment="true"
   * @generated
   */
  ParameterAndResultProfile getParameterAndResultProfile();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.AccessToSubprogramDefinition#getParameterAndResultProfile <em>Parameter And Result Profile</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter And Result Profile</em>' containment reference.
   * @see #getParameterAndResultProfile()
   * @generated
   */
  void setParameterAndResultProfile(ParameterAndResultProfile value);

} // AccessToSubprogramDefinition
