/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signed Integer Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.SignedIntegerTypeDefinition#getFirst <em>First</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.SignedIntegerTypeDefinition#getLast <em>Last</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getSignedIntegerTypeDefinition()
 * @model
 * @generated
 */
public interface SignedIntegerTypeDefinition extends IntegerTypeDefinition
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
   * @see org.xtext.ada2005.adb.AdbPackage#getSignedIntegerTypeDefinition_First()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getFirst();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SignedIntegerTypeDefinition#getFirst <em>First</em>}' containment reference.
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
   * @see org.xtext.ada2005.adb.AdbPackage#getSignedIntegerTypeDefinition_Last()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getLast();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SignedIntegerTypeDefinition#getLast <em>Last</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last</em>' containment reference.
   * @see #getLast()
   * @generated
   */
  void setLast(SimpleExpression value);

} // SignedIntegerTypeDefinition
