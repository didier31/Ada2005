/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.TaskDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.TaskDeclaration#getKnownDiscriminantPart <em>Known Discriminant Part</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.TaskDeclaration#getInterfaceList <em>Interface List</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.TaskDeclaration#getTaskDefinition <em>Task Definition</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.TaskDeclaration#getEndid <em>Endid</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getTaskDeclaration()
 * @model
 * @generated
 */
public interface TaskDeclaration extends BasicDeclaration
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
   * @see org.xtext.ada2005.adb.AdbPackage#getTaskDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.TaskDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Known Discriminant Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Known Discriminant Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Known Discriminant Part</em>' containment reference.
   * @see #setKnownDiscriminantPart(KnownDiscriminantPart)
   * @see org.xtext.ada2005.adb.AdbPackage#getTaskDeclaration_KnownDiscriminantPart()
   * @model containment="true"
   * @generated
   */
  KnownDiscriminantPart getKnownDiscriminantPart();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.TaskDeclaration#getKnownDiscriminantPart <em>Known Discriminant Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Known Discriminant Part</em>' containment reference.
   * @see #getKnownDiscriminantPart()
   * @generated
   */
  void setKnownDiscriminantPart(KnownDiscriminantPart value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getTaskDeclaration_InterfaceList()
   * @model containment="true"
   * @generated
   */
  InterfaceList getInterfaceList();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.TaskDeclaration#getInterfaceList <em>Interface List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface List</em>' containment reference.
   * @see #getInterfaceList()
   * @generated
   */
  void setInterfaceList(InterfaceList value);

  /**
   * Returns the value of the '<em><b>Task Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Definition</em>' containment reference.
   * @see #setTaskDefinition(TaskDefinition)
   * @see org.xtext.ada2005.adb.AdbPackage#getTaskDeclaration_TaskDefinition()
   * @model containment="true"
   * @generated
   */
  TaskDefinition getTaskDefinition();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.TaskDeclaration#getTaskDefinition <em>Task Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task Definition</em>' containment reference.
   * @see #getTaskDefinition()
   * @generated
   */
  void setTaskDefinition(TaskDefinition value);

  /**
   * Returns the value of the '<em><b>Endid</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Endid</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Endid</em>' reference.
   * @see #setEndid(TaskDeclaration)
   * @see org.xtext.ada2005.adb.AdbPackage#getTaskDeclaration_Endid()
   * @model
   * @generated
   */
  TaskDeclaration getEndid();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.TaskDeclaration#getEndid <em>Endid</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Endid</em>' reference.
   * @see #getEndid()
   * @generated
   */
  void setEndid(TaskDeclaration value);

} // TaskDeclaration
