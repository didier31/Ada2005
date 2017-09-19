/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Of Statements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.SequenceOfStatements#getExceptionHandler <em>Exception Handler</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.SequenceOfStatements#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getSequenceOfStatements()
 * @model
 * @generated
 */
public interface SequenceOfStatements extends HandledSequenceOfStatements, AbortablePart
{
  /**
   * Returns the value of the '<em><b>Exception Handler</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.ExceptionHandler}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception Handler</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception Handler</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getSequenceOfStatements_ExceptionHandler()
   * @model containment="true"
   * @generated
   */
  EList<ExceptionHandler> getExceptionHandler();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.LabelisableStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getSequenceOfStatements_Statements()
   * @model containment="true"
   * @generated
   */
  EList<LabelisableStatement> getStatements();

} // SequenceOfStatements
