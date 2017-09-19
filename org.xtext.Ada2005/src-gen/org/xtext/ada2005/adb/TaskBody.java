/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.TaskBody#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.TaskBody#getEndId <em>End Id</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getTaskBody()
 * @model
 * @generated
 */
public interface TaskBody extends DeclarativeBlock, ProperBody
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(TaskDeclaration)
   * @see org.xtext.ada2005.adb.AdbPackage#getTaskBody_Name()
   * @model
   * @generated
   */
  TaskDeclaration getName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.TaskBody#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(TaskDeclaration value);

  /**
   * Returns the value of the '<em><b>End Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Id</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Id</em>' reference.
   * @see #setEndId(TaskDeclaration)
   * @see org.xtext.ada2005.adb.AdbPackage#getTaskBody_EndId()
   * @model
   * @generated
   */
  TaskDeclaration getEndId();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.TaskBody#getEndId <em>End Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Id</em>' reference.
   * @see #getEndId()
   * @generated
   */
  void setEndId(TaskDeclaration value);

} // TaskBody
