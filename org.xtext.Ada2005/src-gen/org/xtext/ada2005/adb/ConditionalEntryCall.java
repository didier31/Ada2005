/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Entry Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.ConditionalEntryCall#getEntryCallAlternative <em>Entry Call Alternative</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ConditionalEntryCall#getElseSequenceOfStatements <em>Else Sequence Of Statements</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getConditionalEntryCall()
 * @model
 * @generated
 */
public interface ConditionalEntryCall extends SelectStatement
{
  /**
   * Returns the value of the '<em><b>Entry Call Alternative</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entry Call Alternative</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry Call Alternative</em>' containment reference.
   * @see #setEntryCallAlternative(EntryCallAlternative)
   * @see org.xtext.ada2005.adb.AdbPackage#getConditionalEntryCall_EntryCallAlternative()
   * @model containment="true"
   * @generated
   */
  EntryCallAlternative getEntryCallAlternative();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ConditionalEntryCall#getEntryCallAlternative <em>Entry Call Alternative</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entry Call Alternative</em>' containment reference.
   * @see #getEntryCallAlternative()
   * @generated
   */
  void setEntryCallAlternative(EntryCallAlternative value);

  /**
   * Returns the value of the '<em><b>Else Sequence Of Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Sequence Of Statements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Sequence Of Statements</em>' containment reference.
   * @see #setElseSequenceOfStatements(SequenceOfStatements)
   * @see org.xtext.ada2005.adb.AdbPackage#getConditionalEntryCall_ElseSequenceOfStatements()
   * @model containment="true"
   * @generated
   */
  SequenceOfStatements getElseSequenceOfStatements();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ConditionalEntryCall#getElseSequenceOfStatements <em>Else Sequence Of Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Sequence Of Statements</em>' containment reference.
   * @see #getElseSequenceOfStatements()
   * @generated
   */
  void setElseSequenceOfStatements(SequenceOfStatements value);

} // ConditionalEntryCall
