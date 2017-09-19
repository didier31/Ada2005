/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.InterfaceList#getInterfaceSubtypeMark <em>Interface Subtype Mark</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getInterfaceList()
 * @model
 * @generated
 */
public interface InterfaceList extends EObject
{
  /**
   * Returns the value of the '<em><b>Interface Subtype Mark</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.Name}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Subtype Mark</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Subtype Mark</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getInterfaceList_InterfaceSubtypeMark()
   * @model containment="true"
   * @generated
   */
  EList<Name> getInterfaceSubtypeMark();

} // InterfaceList
