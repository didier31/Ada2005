/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.RecordDefinition#getComponentList <em>Component List</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.RecordDefinition#getNull <em>Null</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getRecordDefinition()
 * @model
 * @generated
 */
public interface RecordDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Component List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component List</em>' containment reference.
   * @see #setComponentList(ComponentList)
   * @see org.xtext.ada2005.adb.AdbPackage#getRecordDefinition_ComponentList()
   * @model containment="true"
   * @generated
   */
  ComponentList getComponentList();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.RecordDefinition#getComponentList <em>Component List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component List</em>' containment reference.
   * @see #getComponentList()
   * @generated
   */
  void setComponentList(ComponentList value);

  /**
   * Returns the value of the '<em><b>Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Null</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Null</em>' attribute.
   * @see #setNull(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getRecordDefinition_Null()
   * @model
   * @generated
   */
  String getNull();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.RecordDefinition#getNull <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Null</em>' attribute.
   * @see #getNull()
   * @generated
   */
  void setNull(String value);

} // RecordDefinition
