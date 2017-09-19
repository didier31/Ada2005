/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delta Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.DeltaConstraint#getDelta <em>Delta</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.DeltaConstraint#getRangeConstraint <em>Range Constraint</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getDeltaConstraint()
 * @model
 * @generated
 */
public interface DeltaConstraint extends ScalarConstraint
{
  /**
   * Returns the value of the '<em><b>Delta</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delta</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delta</em>' containment reference.
   * @see #setDelta(SimpleExpression)
   * @see org.xtext.ada2005.adb.AdbPackage#getDeltaConstraint_Delta()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getDelta();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DeltaConstraint#getDelta <em>Delta</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delta</em>' containment reference.
   * @see #getDelta()
   * @generated
   */
  void setDelta(SimpleExpression value);

  /**
   * Returns the value of the '<em><b>Range Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range Constraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range Constraint</em>' containment reference.
   * @see #setRangeConstraint(RangeConstraint)
   * @see org.xtext.ada2005.adb.AdbPackage#getDeltaConstraint_RangeConstraint()
   * @model containment="true"
   * @generated
   */
  RangeConstraint getRangeConstraint();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DeltaConstraint#getRangeConstraint <em>Range Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range Constraint</em>' containment reference.
   * @see #getRangeConstraint()
   * @generated
   */
  void setRangeConstraint(RangeConstraint value);

} // DeltaConstraint
