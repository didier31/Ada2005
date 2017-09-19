/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explicit Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.ExplicitRange#getFirst <em>First</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ExplicitRange#getLast <em>Last</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getExplicitRange()
 * @model
 * @generated
 */
public interface ExplicitRange extends Range
{
  /**
   * Returns the value of the '<em><b>First</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First</em>' containment reference.
   * @see #setFirst(SimpleExpression)
   * @see org.xtext.ada2005.adb.AdbPackage#getExplicitRange_First()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getFirst();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ExplicitRange#getFirst <em>First</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First</em>' containment reference.
   * @see #getFirst()
   * @generated
   */
  void setFirst(SimpleExpression value);

  /**
   * Returns the value of the '<em><b>Last</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Last</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Last</em>' containment reference.
   * @see #setLast(SimpleExpression)
   * @see org.xtext.ada2005.adb.AdbPackage#getExplicitRange_Last()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getLast();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ExplicitRange#getLast <em>Last</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last</em>' containment reference.
   * @see #getLast()
   * @generated
   */
  void setLast(SimpleExpression value);

} // ExplicitRange
