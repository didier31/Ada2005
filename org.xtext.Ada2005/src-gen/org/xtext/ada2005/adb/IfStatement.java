/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.IfStatement#getIfCondition <em>If Condition</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.IfStatement#getThenStatements <em>Then Statements</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.IfStatement#getElsifConditions <em>Elsif Conditions</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.IfStatement#getElsifStatements <em>Elsif Statements</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.IfStatement#getElseStatements <em>Else Statements</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends CompoundStatement
{
  /**
   * Returns the value of the '<em><b>If Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Condition</em>' containment reference.
   * @see #setIfCondition(Expression)
   * @see org.xtext.ada2005.adb.AdbPackage#getIfStatement_IfCondition()
   * @model containment="true"
   * @generated
   */
  Expression getIfCondition();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.IfStatement#getIfCondition <em>If Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If Condition</em>' containment reference.
   * @see #getIfCondition()
   * @generated
   */
  void setIfCondition(Expression value);

  /**
   * Returns the value of the '<em><b>Then Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Statements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Statements</em>' containment reference.
   * @see #setThenStatements(SequenceOfStatements)
   * @see org.xtext.ada2005.adb.AdbPackage#getIfStatement_ThenStatements()
   * @model containment="true"
   * @generated
   */
  SequenceOfStatements getThenStatements();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.IfStatement#getThenStatements <em>Then Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Statements</em>' containment reference.
   * @see #getThenStatements()
   * @generated
   */
  void setThenStatements(SequenceOfStatements value);

  /**
   * Returns the value of the '<em><b>Elsif Conditions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elsif Conditions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elsif Conditions</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getIfStatement_ElsifConditions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getElsifConditions();

  /**
   * Returns the value of the '<em><b>Elsif Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.SequenceOfStatements}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elsif Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elsif Statements</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getIfStatement_ElsifStatements()
   * @model containment="true"
   * @generated
   */
  EList<SequenceOfStatements> getElsifStatements();

  /**
   * Returns the value of the '<em><b>Else Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Statements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Statements</em>' containment reference.
   * @see #setElseStatements(SequenceOfStatements)
   * @see org.xtext.ada2005.adb.AdbPackage#getIfStatement_ElseStatements()
   * @model containment="true"
   * @generated
   */
  SequenceOfStatements getElseStatements();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.IfStatement#getElseStatements <em>Else Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Statements</em>' containment reference.
   * @see #getElseStatements()
   * @generated
   */
  void setElseStatements(SequenceOfStatements value);

} // IfStatement
