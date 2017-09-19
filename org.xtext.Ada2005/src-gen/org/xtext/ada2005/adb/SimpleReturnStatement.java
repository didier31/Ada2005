/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Return Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.SimpleReturnStatement#getReturnValue <em>Return Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getSimpleReturnStatement()
 * @model
 * @generated
 */
public interface SimpleReturnStatement extends SimpleStatement
{
  /**
   * Returns the value of the '<em><b>Return Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Value</em>' containment reference.
   * @see #setReturnValue(Expression)
   * @see org.xtext.ada2005.adb.AdbPackage#getSimpleReturnStatement_ReturnValue()
   * @model containment="true"
   * @generated
   */
  Expression getReturnValue();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SimpleReturnStatement#getReturnValue <em>Return Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Value</em>' containment reference.
   * @see #getReturnValue()
   * @generated
   */
  void setReturnValue(Expression value);

} // SimpleReturnStatement
