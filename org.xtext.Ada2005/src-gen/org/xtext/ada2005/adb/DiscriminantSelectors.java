/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discriminant Selectors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.DiscriminantSelectors#getDiscriminantSelectorName <em>Discriminant Selector Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getDiscriminantSelectors()
 * @model
 * @generated
 */
public interface DiscriminantSelectors extends EObject
{
  /**
   * Returns the value of the '<em><b>Discriminant Selector Name</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Discriminant Selector Name</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Discriminant Selector Name</em>' attribute list.
   * @see org.xtext.ada2005.adb.AdbPackage#getDiscriminantSelectors_DiscriminantSelectorName()
   * @model unique="false"
   * @generated
   */
  EList<String> getDiscriminantSelectorName();

} // DiscriminantSelectors
