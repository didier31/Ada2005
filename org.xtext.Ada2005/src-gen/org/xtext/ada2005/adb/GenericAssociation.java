/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.GenericAssociation#getSelectorName <em>Selector Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.GenericAssociation#getExpplicitGenericActualParam <em>Expplicit Generic Actual Param</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getGenericAssociation()
 * @model
 * @generated
 */
public interface GenericAssociation extends EObject
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
   * @see org.xtext.ada2005.adb.AdbPackage#getGenericAssociation_SelectorName()
   * @model
   * @generated
   */
  String getSelectorName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.GenericAssociation#getSelectorName <em>Selector Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selector Name</em>' attribute.
   * @see #getSelectorName()
   * @generated
   */
  void setSelectorName(String value);

  /**
   * Returns the value of the '<em><b>Expplicit Generic Actual Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expplicit Generic Actual Param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expplicit Generic Actual Param</em>' containment reference.
   * @see #setExpplicitGenericActualParam(ExplicitGenericActualParameter)
   * @see org.xtext.ada2005.adb.AdbPackage#getGenericAssociation_ExpplicitGenericActualParam()
   * @model containment="true"
   * @generated
   */
  ExplicitGenericActualParameter getExpplicitGenericActualParam();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.GenericAssociation#getExpplicitGenericActualParam <em>Expplicit Generic Actual Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expplicit Generic Actual Param</em>' containment reference.
   * @see #getExpplicitGenericActualParam()
   * @generated
   */
  void setExpplicitGenericActualParam(ExplicitGenericActualParameter value);

} // GenericAssociation
