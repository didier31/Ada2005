/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opt Variant Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.OptVariantPart#getVariantPart <em>Variant Part</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getOptVariantPart()
 * @model
 * @generated
 */
public interface OptVariantPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Variant Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variant Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variant Part</em>' containment reference.
   * @see #setVariantPart(VariantPart)
   * @see org.xtext.ada2005.adb.AdbPackage#getOptVariantPart_VariantPart()
   * @model containment="true"
   * @generated
   */
  VariantPart getVariantPart();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.OptVariantPart#getVariantPart <em>Variant Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variant Part</em>' containment reference.
   * @see #getVariantPart()
   * @generated
   */
  void setVariantPart(VariantPart value);

} // OptVariantPart
