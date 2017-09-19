/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.ParameterAssociation#getSelectorName <em>Selector Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ParameterAssociation#getParameterEffectiveValue <em>Parameter Effective Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getParameterAssociation()
 * @model
 * @generated
 */
public interface ParameterAssociation extends EObject
{
  /**
   * Returns the value of the '<em><b>Selector Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selector Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selector Name</em>' attribute.
   * @see #setSelectorName(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getParameterAssociation_SelectorName()
   * @model
   * @generated
   */
  String getSelectorName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ParameterAssociation#getSelectorName <em>Selector Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selector Name</em>' attribute.
   * @see #getSelectorName()
   * @generated
   */
  void setSelectorName(String value);

  /**
   * Returns the value of the '<em><b>Parameter Effective Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Effective Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Effective Value</em>' containment reference.
   * @see #setParameterEffectiveValue(ParameterEffectiveValue)
   * @see org.xtext.ada2005.adb.AdbPackage#getParameterAssociation_ParameterEffectiveValue()
   * @model containment="true"
   * @generated
   */
  ParameterEffectiveValue getParameterEffectiveValue();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ParameterAssociation#getParameterEffectiveValue <em>Parameter Effective Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Effective Value</em>' containment reference.
   * @see #getParameterEffectiveValue()
   * @generated
   */
  void setParameterEffectiveValue(ParameterEffectiveValue value);

} // ParameterAssociation
