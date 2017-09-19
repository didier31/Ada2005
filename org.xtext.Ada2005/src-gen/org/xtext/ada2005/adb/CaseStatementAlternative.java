/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Statement Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.CaseStatementAlternative#getDiscreteChoiceList <em>Discrete Choice List</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.CaseStatementAlternative#getSequenceOfStatements <em>Sequence Of Statements</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getCaseStatementAlternative()
 * @model
 * @generated
 */
public interface CaseStatementAlternative extends EObject
{
  /**
   * Returns the value of the '<em><b>Discrete Choice List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Discrete Choice List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Discrete Choice List</em>' containment reference.
   * @see #setDiscreteChoiceList(DiscreteChoiceList)
   * @see org.xtext.ada2005.adb.AdbPackage#getCaseStatementAlternative_DiscreteChoiceList()
   * @model containment="true"
   * @generated
   */
  DiscreteChoiceList getDiscreteChoiceList();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.CaseStatementAlternative#getDiscreteChoiceList <em>Discrete Choice List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Discrete Choice List</em>' containment reference.
   * @see #getDiscreteChoiceList()
   * @generated
   */
  void setDiscreteChoiceList(DiscreteChoiceList value);

  /**
   * Returns the value of the '<em><b>Sequence Of Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequence Of Statements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequence Of Statements</em>' containment reference.
   * @see #setSequenceOfStatements(SequenceOfStatements)
   * @see org.xtext.ada2005.adb.AdbPackage#getCaseStatementAlternative_SequenceOfStatements()
   * @model containment="true"
   * @generated
   */
  SequenceOfStatements getSequenceOfStatements();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.CaseStatementAlternative#getSequenceOfStatements <em>Sequence Of Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequence Of Statements</em>' containment reference.
   * @see #getSequenceOfStatements()
   * @generated
   */
  void setSequenceOfStatements(SequenceOfStatements value);

} // CaseStatementAlternative
