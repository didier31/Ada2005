/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Point Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.FixedPointDefinition#getDelta <em>Delta</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getFixedPointDefinition()
 * @model
 * @generated
 */
public interface FixedPointDefinition extends RealTypeDefinition
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
   * @see #setDelta(Expression)
   * @see org.xtext.ada2005.adb.AdbPackage#getFixedPointDefinition_Delta()
   * @model containment="true"
   * @generated
   */
  Expression getDelta();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FixedPointDefinition#getDelta <em>Delta</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delta</em>' containment reference.
   * @see #getDelta()
   * @generated
   */
  void setDelta(Expression value);

} // FixedPointDefinition
