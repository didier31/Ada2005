/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Or Entry Call Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.ProcedureOrEntryCallStatement#getCallee <em>Callee</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getProcedureOrEntryCallStatement()
 * @model
 * @generated
 */
public interface ProcedureOrEntryCallStatement extends SimpleStatement, TriggeringStatement
{
  /**
   * Returns the value of the '<em><b>Callee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Callee</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Callee</em>' containment reference.
   * @see #setCallee(Name)
   * @see org.xtext.ada2005.adb.AdbPackage#getProcedureOrEntryCallStatement_Callee()
   * @model containment="true"
   * @generated
   */
  Name getCallee();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ProcedureOrEntryCallStatement#getCallee <em>Callee</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Callee</em>' containment reference.
   * @see #getCallee()
   * @generated
   */
  void setCallee(Name value);

} // ProcedureOrEntryCallStatement
