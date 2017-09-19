/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.DelayAlternative#getDelayStatement <em>Delay Statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getDelayAlternative()
 * @model
 * @generated
 */
public interface DelayAlternative extends SelectAlternative
{
  /**
   * Returns the value of the '<em><b>Delay Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delay Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delay Statement</em>' containment reference.
   * @see #setDelayStatement(DelayStatement)
   * @see org.xtext.ada2005.adb.AdbPackage#getDelayAlternative_DelayStatement()
   * @model containment="true"
   * @generated
   */
  DelayStatement getDelayStatement();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DelayAlternative#getDelayStatement <em>Delay Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delay Statement</em>' containment reference.
   * @see #getDelayStatement()
   * @generated
   */
  void setDelayStatement(DelayStatement value);

} // DelayAlternative
