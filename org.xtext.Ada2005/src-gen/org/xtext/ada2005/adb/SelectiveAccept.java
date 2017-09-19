/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selective Accept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.SelectiveAccept#getSelectguard <em>Selectguard</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.SelectiveAccept#getSelectAlternative <em>Select Alternative</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.SelectiveAccept#getGuardedAlternatives <em>Guarded Alternatives</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.SelectiveAccept#getElseStatements <em>Else Statements</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getSelectiveAccept()
 * @model
 * @generated
 */
public interface SelectiveAccept extends SelectStatement
{
  /**
   * Returns the value of the '<em><b>Selectguard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selectguard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selectguard</em>' containment reference.
   * @see #setSelectguard(Guard)
   * @see org.xtext.ada2005.adb.AdbPackage#getSelectiveAccept_Selectguard()
   * @model containment="true"
   * @generated
   */
  Guard getSelectguard();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SelectiveAccept#getSelectguard <em>Selectguard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selectguard</em>' containment reference.
   * @see #getSelectguard()
   * @generated
   */
  void setSelectguard(Guard value);

  /**
   * Returns the value of the '<em><b>Select Alternative</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select Alternative</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select Alternative</em>' containment reference.
   * @see #setSelectAlternative(SelectAlternative)
   * @see org.xtext.ada2005.adb.AdbPackage#getSelectiveAccept_SelectAlternative()
   * @model containment="true"
   * @generated
   */
  SelectAlternative getSelectAlternative();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SelectiveAccept#getSelectAlternative <em>Select Alternative</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select Alternative</em>' containment reference.
   * @see #getSelectAlternative()
   * @generated
   */
  void setSelectAlternative(SelectAlternative value);

  /**
   * Returns the value of the '<em><b>Guarded Alternatives</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.GuardedAlternative}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guarded Alternatives</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guarded Alternatives</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getSelectiveAccept_GuardedAlternatives()
   * @model containment="true"
   * @generated
   */
  EList<GuardedAlternative> getGuardedAlternatives();

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
   * @see org.xtext.ada2005.adb.AdbPackage#getSelectiveAccept_ElseStatements()
   * @model containment="true"
   * @generated
   */
  SequenceOfStatements getElseStatements();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SelectiveAccept#getElseStatements <em>Else Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Statements</em>' containment reference.
   * @see #getElseStatements()
   * @generated
   */
  void setElseStatements(SequenceOfStatements value);

} // SelectiveAccept
