/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.RealTypeDefinition#getDigits <em>Digits</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.RealTypeDefinition#getRealRangeSpecification <em>Real Range Specification</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getRealTypeDefinition()
 * @model
 * @generated
 */
public interface RealTypeDefinition extends TypeDefinition
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
   * @see #setDigits(Expression)
   * @see org.xtext.ada2005.adb.AdbPackage#getRealTypeDefinition_Digits()
   * @model containment="true"
   * @generated
   */
  Expression getDigits();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.RealTypeDefinition#getDigits <em>Digits</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Digits</em>' containment reference.
   * @see #getDigits()
   * @generated
   */
  void setDigits(Expression value);

  /**
   * Returns the value of the '<em><b>Real Range Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Real Range Specification</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Real Range Specification</em>' containment reference.
   * @see #setRealRangeSpecification(RealRangeSpecification)
   * @see org.xtext.ada2005.adb.AdbPackage#getRealTypeDefinition_RealRangeSpecification()
   * @model containment="true"
   * @generated
   */
  RealRangeSpecification getRealRangeSpecification();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.RealTypeDefinition#getRealRangeSpecification <em>Real Range Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Real Range Specification</em>' containment reference.
   * @see #getRealRangeSpecification()
   * @generated
   */
  void setRealRangeSpecification(RealRangeSpecification value);

} // RealTypeDefinition
