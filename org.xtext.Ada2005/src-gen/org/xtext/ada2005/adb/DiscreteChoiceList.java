/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Choice List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.DiscreteChoiceList#getDiscreteChoiceList <em>Discrete Choice List</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getDiscreteChoiceList()
 * @model
 * @generated
 */
public interface DiscreteChoiceList extends EObject
{
  /**
   * Returns the value of the '<em><b>Discrete Choice List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.DiscreteChoice}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Discrete Choice List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Discrete Choice List</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getDiscreteChoiceList_DiscreteChoiceList()
   * @model containment="true"
   * @generated
   */
  EList<DiscreteChoice> getDiscreteChoiceList();

} // DiscreteChoiceList
