/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.GenericItems#getGenericItems <em>Generic Items</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getGenericItems()
 * @model
 * @generated
 */
public interface GenericItems extends EObject
{
  /**
   * Returns the value of the '<em><b>Generic Items</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.GenericItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generic Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic Items</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getGenericItems_GenericItems()
   * @model containment="true"
   * @generated
   */
  EList<GenericItem> getGenericItems();

} // GenericItems
