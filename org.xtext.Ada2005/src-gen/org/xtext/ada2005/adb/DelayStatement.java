/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.DelayStatement#getUntil <em>Until</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.DelayStatement#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getDelayStatement()
 * @model
 * @generated
 */
public interface DelayStatement extends SimpleStatement, TriggeringStatement
{
  /**
   * Returns the value of the '<em><b>Until</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Until</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Until</em>' attribute.
   * @see #setUntil(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getDelayStatement_Until()
   * @model
   * @generated
   */
  String getUntil();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DelayStatement#getUntil <em>Until</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Until</em>' attribute.
   * @see #getUntil()
   * @generated
   */
  void setUntil(String value);

  /**
   * Returns the value of the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delay</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delay</em>' containment reference.
   * @see #setDelay(Expression)
   * @see org.xtext.ada2005.adb.AdbPackage#getDelayStatement_Delay()
   * @model containment="true"
   * @generated
   */
  Expression getDelay();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DelayStatement#getDelay <em>Delay</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delay</em>' containment reference.
   * @see #getDelay()
   * @generated
   */
  void setDelay(Expression value);

} // DelayStatement
