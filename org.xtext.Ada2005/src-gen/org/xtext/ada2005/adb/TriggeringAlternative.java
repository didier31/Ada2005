/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triggering Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.TriggeringAlternative#getTriggeringStatement <em>Triggering Statement</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.TriggeringAlternative#getSequenceOfStatements <em>Sequence Of Statements</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getTriggeringAlternative()
 * @model
 * @generated
 */
public interface TriggeringAlternative extends EObject
{
  /**
   * Returns the value of the '<em><b>Triggering Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Triggering Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triggering Statement</em>' containment reference.
   * @see #setTriggeringStatement(TriggeringStatement)
   * @see org.xtext.ada2005.adb.AdbPackage#getTriggeringAlternative_TriggeringStatement()
   * @model containment="true"
   * @generated
   */
  TriggeringStatement getTriggeringStatement();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.TriggeringAlternative#getTriggeringStatement <em>Triggering Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Triggering Statement</em>' containment reference.
   * @see #getTriggeringStatement()
   * @generated
   */
  void setTriggeringStatement(TriggeringStatement value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getTriggeringAlternative_SequenceOfStatements()
   * @model containment="true"
   * @generated
   */
  SequenceOfStatements getSequenceOfStatements();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.TriggeringAlternative#getSequenceOfStatements <em>Sequence Of Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequence Of Statements</em>' containment reference.
   * @see #getSequenceOfStatements()
   * @generated
   */
  void setSequenceOfStatements(SequenceOfStatements value);

} // TriggeringAlternative
