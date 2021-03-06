/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.Variant#getDiscreteChoiceList <em>Discrete Choice List</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.Variant#getComponentList <em>Component List</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getVariant()
 * @model
 * @generated
 */
public interface Variant extends EObject
{
  /**
   * Returns the value of the '<em><b>Discrete Choice List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Discrete Choice List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Discrete Choice List</em>' containment reference.
   * @see #setDiscreteChoiceList(DiscreteChoiceList)
   * @see org.xtext.ada2005.adb.AdbPackage#getVariant_DiscreteChoiceList()
   * @model containment="true"
   * @generated
   */
  DiscreteChoiceList getDiscreteChoiceList();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.Variant#getDiscreteChoiceList <em>Discrete Choice List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Discrete Choice List</em>' containment reference.
   * @see #getDiscreteChoiceList()
   * @generated
   */
  void setDiscreteChoiceList(DiscreteChoiceList value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getVariant_ComponentList()
   * @model containment="true"
   * @generated
   */
  ComponentList getComponentList();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.Variant#getComponentList <em>Component List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component List</em>' containment reference.
   * @see #getComponentList()
   * @generated
   */
  void setComponentList(ComponentList value);

} // Variant
