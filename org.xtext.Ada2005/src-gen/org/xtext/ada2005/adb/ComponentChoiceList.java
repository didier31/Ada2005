/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Choice List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.ComponentChoiceList#getComponentSelectorName <em>Component Selector Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ComponentChoiceList#isOthers <em>Others</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getComponentChoiceList()
 * @model
 * @generated
 */
public interface ComponentChoiceList extends EObject
{
  /**
   * Returns the value of the '<em><b>Component Selector Name</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component Selector Name</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component Selector Name</em>' attribute list.
   * @see org.xtext.ada2005.adb.AdbPackage#getComponentChoiceList_ComponentSelectorName()
   * @model unique="false"
   * @generated
   */
  EList<String> getComponentSelectorName();

  /**
   * Returns the value of the '<em><b>Others</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Others</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Others</em>' attribute.
   * @see #setOthers(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getComponentChoiceList_Others()
   * @model
   * @generated
   */
  boolean isOthers();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ComponentChoiceList#isOthers <em>Others</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Others</em>' attribute.
   * @see #isOthers()
   * @generated
   */
  void setOthers(boolean value);

} // ComponentChoiceList
