/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.SimpleExpression#getUnaryAddingOperator <em>Unary Adding Operator</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.SimpleExpression#getTerms <em>Terms</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.SimpleExpression#getBinaryAddingOperators <em>Binary Adding Operators</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getSimpleExpression()
 * @model
 * @generated
 */
public interface SimpleExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Unary Adding Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary Adding Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary Adding Operator</em>' attribute.
   * @see #setUnaryAddingOperator(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getSimpleExpression_UnaryAddingOperator()
   * @model
   * @generated
   */
  String getUnaryAddingOperator();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SimpleExpression#getUnaryAddingOperator <em>Unary Adding Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary Adding Operator</em>' attribute.
   * @see #getUnaryAddingOperator()
   * @generated
   */
  void setUnaryAddingOperator(String value);

  /**
   * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.Term}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Terms</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getSimpleExpression_Terms()
   * @model containment="true"
   * @generated
   */
  EList<Term> getTerms();

  /**
   * Returns the value of the '<em><b>Binary Adding Operators</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binary Adding Operators</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binary Adding Operators</em>' attribute list.
   * @see org.xtext.ada2005.adb.AdbPackage#getSimpleExpression_BinaryAddingOperators()
   * @model unique="false"
   * @generated
   */
  EList<String> getBinaryAddingOperators();

} // SimpleExpression
