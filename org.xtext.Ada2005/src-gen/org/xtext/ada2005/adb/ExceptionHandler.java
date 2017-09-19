/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.ExceptionHandler#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ExceptionHandler#getExceptionChoice <em>Exception Choice</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ExceptionHandler#getSequenceOfStatements <em>Sequence Of Statements</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getExceptionHandler()
 * @model
 * @generated
 */
public interface ExceptionHandler extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getExceptionHandler_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ExceptionHandler#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Exception Choice</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.ExceptionChoice}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception Choice</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception Choice</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getExceptionHandler_ExceptionChoice()
   * @model containment="true"
   * @generated
   */
  EList<ExceptionChoice> getExceptionChoice();

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
   * @see org.xtext.ada2005.adb.AdbPackage#getExceptionHandler_SequenceOfStatements()
   * @model containment="true"
   * @generated
   */
  SequenceOfStatements getSequenceOfStatements();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ExceptionHandler#getSequenceOfStatements <em>Sequence Of Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequence Of Statements</em>' containment reference.
   * @see #getSequenceOfStatements()
   * @generated
   */
  void setSequenceOfStatements(SequenceOfStatements value);

} // ExceptionHandler
