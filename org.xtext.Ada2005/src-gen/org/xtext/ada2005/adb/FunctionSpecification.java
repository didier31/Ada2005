/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.FunctionSpecification#getParameterAndResultProfile <em>Parameter And Result Profile</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getFunctionSpecification()
 * @model
 * @generated
 */
public interface FunctionSpecification extends SubprogramSpecification
{
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
   * @see org.xtext.ada2005.adb.AdbPackage#getFunctionSpecification_ParameterAndResultProfile()
   * @model containment="true"
   * @generated
   */
  ParameterAndResultProfile getParameterAndResultProfile();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FunctionSpecification#getParameterAndResultProfile <em>Parameter And Result Profile</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter And Result Profile</em>' containment reference.
   * @see #getParameterAndResultProfile()
   * @generated
   */
  void setParameterAndResultProfile(ParameterAndResultProfile value);

} // FunctionSpecification
