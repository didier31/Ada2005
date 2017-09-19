/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.Term#getFactors <em>Factors</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.Term#getMultiplyingOperators <em>Multiplying Operators</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getTerm()
 * @model
 * @generated
 */
public interface Term extends EObject
{
  /**
   * Returns the value of the '<em><b>Factors</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.Factor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factors</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getTerm_Factors()
   * @model containment="true"
   * @generated
   */
  EList<Factor> getFactors();

  /**
   * Returns the value of the '<em><b>Multiplying Operators</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplying Operators</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplying Operators</em>' attribute list.
   * @see org.xtext.ada2005.adb.AdbPackage#getTerm_MultiplyingOperators()
   * @model unique="false"
   * @generated
   */
  EList<String> getMultiplyingOperators();

} // Term
