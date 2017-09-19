/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.AssignmentStatement#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.AssignmentStatement#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getAssignmentStatement()
 * @model
 * @generated
 */
public interface AssignmentStatement extends SimpleStatement
{
  /**
   * Returns the value of the '<em><b>Variable Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Name</em>' containment reference.
   * @see #setVariableName(Name)
   * @see org.xtext.ada2005.adb.AdbPackage#getAssignmentStatement_VariableName()
   * @model containment="true"
   * @generated
   */
  Name getVariableName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.AssignmentStatement#getVariableName <em>Variable Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Name</em>' containment reference.
   * @see #getVariableName()
   * @generated
   */
  void setVariableName(Name value);

  /**
   * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial Value</em>' containment reference.
   * @see #setInitialValue(Expression)
   * @see org.xtext.ada2005.adb.AdbPackage#getAssignmentStatement_InitialValue()
   * @model containment="true"
   * @generated
   */
  Expression getInitialValue();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.AssignmentStatement#getInitialValue <em>Initial Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial Value</em>' containment reference.
   * @see #getInitialValue()
   * @generated
   */
  void setInitialValue(Expression value);

} // AssignmentStatement
