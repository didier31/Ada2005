/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Package Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.FormalPackageAssociation#getGenericAssociation <em>Generic Association</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.FormalPackageAssociation#getGenericFormalParameterSelectorName <em>Generic Formal Parameter Selector Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getFormalPackageAssociation()
 * @model
 * @generated
 */
public interface FormalPackageAssociation extends EObject
{
  /**
   * Returns the value of the '<em><b>Generic Association</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generic Association</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic Association</em>' containment reference.
   * @see #setGenericAssociation(GenericAssociation)
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalPackageAssociation_GenericAssociation()
   * @model containment="true"
   * @generated
   */
  GenericAssociation getGenericAssociation();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalPackageAssociation#getGenericAssociation <em>Generic Association</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generic Association</em>' containment reference.
   * @see #getGenericAssociation()
   * @generated
   */
  void setGenericAssociation(GenericAssociation value);

  /**
   * Returns the value of the '<em><b>Generic Formal Parameter Selector Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generic Formal Parameter Selector Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic Formal Parameter Selector Name</em>' attribute.
   * @see #setGenericFormalParameterSelectorName(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalPackageAssociation_GenericFormalParameterSelectorName()
   * @model
   * @generated
   */
  String getGenericFormalParameterSelectorName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalPackageAssociation#getGenericFormalParameterSelectorName <em>Generic Formal Parameter Selector Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generic Formal Parameter Selector Name</em>' attribute.
   * @see #getGenericFormalParameterSelectorName()
   * @generated
   */
  void setGenericFormalParameterSelectorName(String value);

} // FormalPackageAssociation
