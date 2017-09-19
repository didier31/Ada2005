/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.Name#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.Name#getPrimaryName <em>Primary Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getName_()
 * @model
 * @generated
 */
public interface Name extends Interval
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getName_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.Name#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Primary Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary Name</em>' containment reference.
   * @see #setPrimaryName(PrimaryName)
   * @see org.xtext.ada2005.adb.AdbPackage#getName_PrimaryName()
   * @model containment="true"
   * @generated
   */
  PrimaryName getPrimaryName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.Name#getPrimaryName <em>Primary Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary Name</em>' containment reference.
   * @see #getPrimaryName()
   * @generated
   */
  void setPrimaryName(PrimaryName value);

} // Name
