/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variant Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.VariantPart#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.VariantPart#getVariants <em>Variants</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getVariantPart()
 * @model
 * @generated
 */
public interface VariantPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getVariantPart_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.VariantPart#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Variants</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.Variant}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variants</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getVariantPart_Variants()
   * @model containment="true"
   * @generated
   */
  EList<Variant> getVariants();

} // VariantPart
