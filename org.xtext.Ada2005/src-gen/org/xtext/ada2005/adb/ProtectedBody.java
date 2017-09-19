/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protected Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.ProtectedBody#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ProtectedBody#getProtectedOperationItem <em>Protected Operation Item</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ProtectedBody#getIdTask <em>Id Task</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getProtectedBody()
 * @model
 * @generated
 */
public interface ProtectedBody extends ProperBody
{
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute.
   * @see #setIdentifier(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getProtectedBody_Identifier()
   * @model
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ProtectedBody#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Protected Operation Item</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.ProtectedOperationItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Protected Operation Item</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protected Operation Item</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getProtectedBody_ProtectedOperationItem()
   * @model containment="true"
   * @generated
   */
  EList<ProtectedOperationItem> getProtectedOperationItem();

  /**
   * Returns the value of the '<em><b>Id Task</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id Task</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id Task</em>' attribute.
   * @see #setIdTask(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getProtectedBody_IdTask()
   * @model
   * @generated
   */
  String getIdTask();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ProtectedBody#getIdTask <em>Id Task</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id Task</em>' attribute.
   * @see #getIdTask()
   * @generated
   */
  void setIdTask(String value);

} // ProtectedBody
