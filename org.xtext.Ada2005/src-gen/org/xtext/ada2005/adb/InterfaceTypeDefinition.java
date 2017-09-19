/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.InterfaceTypeDefinition#isLimited <em>Limited</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.InterfaceTypeDefinition#isTask <em>Task</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.InterfaceTypeDefinition#isProtected <em>Protected</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.InterfaceTypeDefinition#isSynchro <em>Synchro</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.InterfaceTypeDefinition#getInterfaceList <em>Interface List</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getInterfaceTypeDefinition()
 * @model
 * @generated
 */
public interface InterfaceTypeDefinition extends FormalTypeDefinition, TypeDefinition
{
  /**
   * Returns the value of the '<em><b>Limited</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Limited</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Limited</em>' attribute.
   * @see #setLimited(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getInterfaceTypeDefinition_Limited()
   * @model
   * @generated
   */
  boolean isLimited();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.InterfaceTypeDefinition#isLimited <em>Limited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limited</em>' attribute.
   * @see #isLimited()
   * @generated
   */
  void setLimited(boolean value);

  /**
   * Returns the value of the '<em><b>Task</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task</em>' attribute.
   * @see #setTask(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getInterfaceTypeDefinition_Task()
   * @model
   * @generated
   */
  boolean isTask();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.InterfaceTypeDefinition#isTask <em>Task</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task</em>' attribute.
   * @see #isTask()
   * @generated
   */
  void setTask(boolean value);

  /**
   * Returns the value of the '<em><b>Protected</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Protected</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protected</em>' attribute.
   * @see #setProtected(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getInterfaceTypeDefinition_Protected()
   * @model
   * @generated
   */
  boolean isProtected();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.InterfaceTypeDefinition#isProtected <em>Protected</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Protected</em>' attribute.
   * @see #isProtected()
   * @generated
   */
  void setProtected(boolean value);

  /**
   * Returns the value of the '<em><b>Synchro</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Synchro</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Synchro</em>' attribute.
   * @see #setSynchro(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getInterfaceTypeDefinition_Synchro()
   * @model
   * @generated
   */
  boolean isSynchro();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.InterfaceTypeDefinition#isSynchro <em>Synchro</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Synchro</em>' attribute.
   * @see #isSynchro()
   * @generated
   */
  void setSynchro(boolean value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getInterfaceTypeDefinition_InterfaceList()
   * @model containment="true"
   * @generated
   */
  InterfaceList getInterfaceList();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.InterfaceTypeDefinition#getInterfaceList <em>Interface List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface List</em>' containment reference.
   * @see #getInterfaceList()
   * @generated
   */
  void setInterfaceList(InterfaceList value);

} // InterfaceTypeDefinition
