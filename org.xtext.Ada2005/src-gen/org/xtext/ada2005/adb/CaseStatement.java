/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.CaseStatement#getCaseValue <em>Case Value</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.CaseStatement#getCaseStatementAlternatives <em>Case Statement Alternatives</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getCaseStatement()
 * @model
 * @generated
 */
public interface CaseStatement extends CompoundStatement
{
  /**
   * Returns the value of the '<em><b>Case Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Value</em>' containment reference.
   * @see #setCaseValue(Expression)
   * @see org.xtext.ada2005.adb.AdbPackage#getCaseStatement_CaseValue()
   * @model containment="true"
   * @generated
   */
  Expression getCaseValue();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.CaseStatement#getCaseValue <em>Case Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case Value</em>' containment reference.
   * @see #getCaseValue()
   * @generated
   */
  void setCaseValue(Expression value);

  /**
   * Returns the value of the '<em><b>Case Statement Alternatives</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.CaseStatementAlternative}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Statement Alternatives</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Statement Alternatives</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getCaseStatement_CaseStatementAlternatives()
   * @model containment="true"
   * @generated
   */
  EList<CaseStatementAlternative> getCaseStatementAlternatives();

} // CaseStatement
