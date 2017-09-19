/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.AcceptAlternative#getAcceptStatement <em>Accept Statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getAcceptAlternative()
 * @model
 * @generated
 */
public interface AcceptAlternative extends SelectAlternative
{
  /**
   * Returns the value of the '<em><b>Accept Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accept Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accept Statement</em>' containment reference.
   * @see #setAcceptStatement(AcceptStatement)
   * @see org.xtext.ada2005.adb.AdbPackage#getAcceptAlternative_AcceptStatement()
   * @model containment="true"
   * @generated
   */
  AcceptStatement getAcceptStatement();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.AcceptAlternative#getAcceptStatement <em>Accept Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accept Statement</em>' containment reference.
   * @see #getAcceptStatement()
   * @generated
   */
  void setAcceptStatement(AcceptStatement value);

} // AcceptAlternative
