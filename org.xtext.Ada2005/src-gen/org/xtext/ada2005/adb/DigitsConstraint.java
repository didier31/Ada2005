/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digits Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.DigitsConstraint#getDigits <em>Digits</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.DigitsConstraint#getRangeConstraint <em>Range Constraint</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getDigitsConstraint()
 * @model
 * @generated
 */
public interface DigitsConstraint extends ScalarConstraint
{
  /**
   * Returns the value of the '<em><b>Digits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Digits</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Digits</em>' containment reference.
   * @see #setDigits(SimpleExpression)
   * @see org.xtext.ada2005.adb.AdbPackage#getDigitsConstraint_Digits()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getDigits();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DigitsConstraint#getDigits <em>Digits</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Digits</em>' containment reference.
   * @see #getDigits()
   * @generated
   */
  void setDigits(SimpleExpression value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getDigitsConstraint_RangeConstraint()
   * @model containment="true"
   * @generated
   */
  RangeConstraint getRangeConstraint();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DigitsConstraint#getRangeConstraint <em>Range Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range Constraint</em>' containment reference.
   * @see #getRangeConstraint()
   * @generated
   */
  void setRangeConstraint(RangeConstraint value);

} // DigitsConstraint
