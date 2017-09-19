/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labelisable Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.LabelisableStatement#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.LabelisableStatement#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getLabelisableStatement()
 * @model
 * @generated
 */
public interface LabelisableStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.Label}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Labels</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getLabelisableStatement_Labels()
   * @model containment="true"
   * @generated
   */
  EList<Label> getLabels();

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(Statement)
   * @see org.xtext.ada2005.adb.AdbPackage#getLabelisableStatement_Statement()
   * @model containment="true"
   * @generated
   */
  Statement getStatement();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.LabelisableStatement#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(Statement value);

} // LabelisableStatement
