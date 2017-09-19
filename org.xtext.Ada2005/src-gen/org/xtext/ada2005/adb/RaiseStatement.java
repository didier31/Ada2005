/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raise Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.RaiseStatement#getExceptionName <em>Exception Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.RaiseStatement#getWithExpression <em>With Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getRaiseStatement()
 * @model
 * @generated
 */
public interface RaiseStatement extends SimpleStatement
{
  /**
   * Returns the value of the '<em><b>Exception Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception Name</em>' containment reference.
   * @see #setExceptionName(Name)
   * @see org.xtext.ada2005.adb.AdbPackage#getRaiseStatement_ExceptionName()
   * @model containment="true"
   * @generated
   */
  Name getExceptionName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.RaiseStatement#getExceptionName <em>Exception Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception Name</em>' containment reference.
   * @see #getExceptionName()
   * @generated
   */
  void setExceptionName(Name value);

  /**
   * Returns the value of the '<em><b>With Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>With Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>With Expression</em>' containment reference.
   * @see #setWithExpression(Expression)
   * @see org.xtext.ada2005.adb.AdbPackage#getRaiseStatement_WithExpression()
   * @model containment="true"
   * @generated
   */
  Expression getWithExpression();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.RaiseStatement#getWithExpression <em>With Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>With Expression</em>' containment reference.
   * @see #getWithExpression()
   * @generated
   */
  void setWithExpression(Expression value);

} // RaiseStatement
