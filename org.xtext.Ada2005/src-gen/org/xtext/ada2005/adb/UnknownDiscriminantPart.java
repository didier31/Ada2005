/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unknown Discriminant Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.UnknownDiscriminantPart#isBox <em>Box</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getUnknownDiscriminantPart()
 * @model
 * @generated
 */
public interface UnknownDiscriminantPart extends DiscriminantPart
{
  /**
   * Returns the value of the '<em><b>Box</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Box</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Box</em>' attribute.
   * @see #setBox(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getUnknownDiscriminantPart_Box()
   * @model
   * @generated
   */
  boolean isBox();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.UnknownDiscriminantPart#isBox <em>Box</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Box</em>' attribute.
   * @see #isBox()
   * @generated
   */
  void setBox(boolean value);

} // UnknownDiscriminantPart
