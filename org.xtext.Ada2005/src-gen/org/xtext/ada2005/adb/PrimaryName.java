/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.PrimaryName#getParameterAssociation <em>Parameter Association</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.PrimaryName#getPrimaryName <em>Primary Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.PrimaryName#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.PrimaryName#getAttributeDesignator <em>Attribute Designator</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getPrimaryName()
 * @model
 * @generated
 */
public interface PrimaryName extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter Association</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.ParameterAssociation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Association</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Association</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getPrimaryName_ParameterAssociation()
   * @model containment="true"
   * @generated
   */
  EList<ParameterAssociation> getParameterAssociation();

  /**
   * Returns the value of the '<em><b>Primary Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary Name</em>' containment reference.
   * @see #setPrimaryName(PrimaryName)
   * @see org.xtext.ada2005.adb.AdbPackage#getPrimaryName_PrimaryName()
   * @model containment="true"
   * @generated
   */
  PrimaryName getPrimaryName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.PrimaryName#getPrimaryName <em>Primary Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary Name</em>' containment reference.
   * @see #getPrimaryName()
   * @generated
   */
  void setPrimaryName(PrimaryName value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Name)
   * @see org.xtext.ada2005.adb.AdbPackage#getPrimaryName_Name()
   * @model containment="true"
   * @generated
   */
  Name getName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.PrimaryName#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Name value);

  /**
   * Returns the value of the '<em><b>Attribute Designator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Designator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Designator</em>' containment reference.
   * @see #setAttributeDesignator(AttributeDesignator)
   * @see org.xtext.ada2005.adb.AdbPackage#getPrimaryName_AttributeDesignator()
   * @model containment="true"
   * @generated
   */
  AttributeDesignator getAttributeDesignator();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.PrimaryName#getAttributeDesignator <em>Attribute Designator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Designator</em>' containment reference.
   * @see #getAttributeDesignator()
   * @generated
   */
  void setAttributeDesignator(AttributeDesignator value);

} // PrimaryName
