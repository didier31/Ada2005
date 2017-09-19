/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Range Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.RealRangeSpecification#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.RealRangeSpecification#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getRealRangeSpecification()
 * @model
 * @generated
 */
public interface RealRangeSpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower Bound</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower Bound</em>' containment reference.
   * @see #setLowerBound(SimpleExpression)
   * @see org.xtext.ada2005.adb.AdbPackage#getRealRangeSpecification_LowerBound()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getLowerBound();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.RealRangeSpecification#getLowerBound <em>Lower Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower Bound</em>' containment reference.
   * @see #getLowerBound()
   * @generated
   */
  void setLowerBound(SimpleExpression value);

  /**
   * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper Bound</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper Bound</em>' containment reference.
   * @see #setUpperBound(SimpleExpression)
   * @see org.xtext.ada2005.adb.AdbPackage#getRealRangeSpecification_UpperBound()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getUpperBound();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.RealRangeSpecification#getUpperBound <em>Upper Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper Bound</em>' containment reference.
   * @see #getUpperBound()
   * @generated
   */
  void setUpperBound(SimpleExpression value);

} // RealRangeSpecification
