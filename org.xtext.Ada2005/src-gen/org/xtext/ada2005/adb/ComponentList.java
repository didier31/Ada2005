/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.ComponentList#getComponentItems <em>Component Items</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ComponentList#getOptVariantPart <em>Opt Variant Part</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getComponentList()
 * @model
 * @generated
 */
public interface ComponentList extends EObject
{
  /**
   * Returns the value of the '<em><b>Component Items</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.ComponentItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component Items</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getComponentList_ComponentItems()
   * @model containment="true"
   * @generated
   */
  EList<ComponentItem> getComponentItems();

  /**
   * Returns the value of the '<em><b>Opt Variant Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opt Variant Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opt Variant Part</em>' containment reference.
   * @see #setOptVariantPart(OptVariantPart)
   * @see org.xtext.ada2005.adb.AdbPackage#getComponentList_OptVariantPart()
   * @model containment="true"
   * @generated
   */
  OptVariantPart getOptVariantPart();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ComponentList#getOptVariantPart <em>Opt Variant Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opt Variant Part</em>' containment reference.
   * @see #getOptVariantPart()
   * @generated
   */
  void setOptVariantPart(OptVariantPart value);

} // ComponentList
