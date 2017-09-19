/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Component Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.RecordComponentAssociation#getComponentChoiceList <em>Component Choice List</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getRecordComponentAssociation()
 * @model
 * @generated
 */
public interface RecordComponentAssociation extends EObject
{
  /**
   * Returns the value of the '<em><b>Component Choice List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.ComponentChoiceList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component Choice List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component Choice List</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getRecordComponentAssociation_ComponentChoiceList()
   * @model containment="true"
   * @generated
   */
  EList<ComponentChoiceList> getComponentChoiceList();

} // RecordComponentAssociation
