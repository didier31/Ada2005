/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Separate Subunit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.SeparateSubunit#getParentUnitName <em>Parent Unit Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.SeparateSubunit#getProperBody <em>Proper Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getSeparateSubunit()
 * @model
 * @generated
 */
public interface SeparateSubunit extends Unit
{
  /**
   * Returns the value of the '<em><b>Parent Unit Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent Unit Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Unit Name</em>' attribute.
   * @see #setParentUnitName(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getSeparateSubunit_ParentUnitName()
   * @model
   * @generated
   */
  String getParentUnitName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SeparateSubunit#getParentUnitName <em>Parent Unit Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Unit Name</em>' attribute.
   * @see #getParentUnitName()
   * @generated
   */
  void setParentUnitName(String value);

  /**
   * Returns the value of the '<em><b>Proper Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proper Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proper Body</em>' containment reference.
   * @see #setProperBody(ProperBody)
   * @see org.xtext.ada2005.adb.AdbPackage#getSeparateSubunit_ProperBody()
   * @model containment="true"
   * @generated
   */
  ProperBody getProperBody();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SeparateSubunit#getProperBody <em>Proper Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Proper Body</em>' containment reference.
   * @see #getProperBody()
   * @generated
   */
  void setProperBody(ProperBody value);

} // SeparateSubunit
