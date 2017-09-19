/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Protected Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.SingleProtectedDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.SingleProtectedDeclaration#getInterfaceList <em>Interface List</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.SingleProtectedDeclaration#getProtectedDefinition <em>Protected Definition</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getSingleProtectedDeclaration()
 * @model
 * @generated
 */
public interface SingleProtectedDeclaration extends ObjectDeclaration
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
   * @see org.xtext.ada2005.adb.AdbPackage#getSingleProtectedDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SingleProtectedDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Interface List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface List</em>' containment reference.
   * @see #setInterfaceList(InterfaceList)
   * @see org.xtext.ada2005.adb.AdbPackage#getSingleProtectedDeclaration_InterfaceList()
   * @model containment="true"
   * @generated
   */
  InterfaceList getInterfaceList();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SingleProtectedDeclaration#getInterfaceList <em>Interface List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface List</em>' containment reference.
   * @see #getInterfaceList()
   * @generated
   */
  void setInterfaceList(InterfaceList value);

  /**
   * Returns the value of the '<em><b>Protected Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Protected Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protected Definition</em>' containment reference.
   * @see #setProtectedDefinition(ProtectedDefinition)
   * @see org.xtext.ada2005.adb.AdbPackage#getSingleProtectedDeclaration_ProtectedDefinition()
   * @model containment="true"
   * @generated
   */
  ProtectedDefinition getProtectedDefinition();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SingleProtectedDeclaration#getProtectedDefinition <em>Protected Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Protected Definition</em>' containment reference.
   * @see #getProtectedDefinition()
   * @generated
   */
  void setProtectedDefinition(ProtectedDefinition value);

} // SingleProtectedDeclaration
