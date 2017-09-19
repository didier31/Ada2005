/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Null Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.NullStatement#isNull <em>Null</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getNullStatement()
 * @model
 * @generated
 */
public interface NullStatement extends SimpleStatement
{
  /**
   * Returns the value of the '<em><b>Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Null</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Null</em>' attribute.
   * @see #setNull(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getNullStatement_Null()
   * @model
   * @generated
   */
  boolean isNull();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.NullStatement#isNull <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Null</em>' attribute.
   * @see #isNull()
   * @generated
   */
  void setNull(boolean value);

} // NullStatement
