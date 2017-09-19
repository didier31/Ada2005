/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Default</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.SubprogramDefault#getDefaultName <em>Default Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getSubprogramDefault()
 * @model
 * @generated
 */
public interface SubprogramDefault extends EObject
{
  /**
   * Returns the value of the '<em><b>Default Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Name</em>' attribute.
   * @see #setDefaultName(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getSubprogramDefault_DefaultName()
   * @model
   * @generated
   */
  String getDefaultName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SubprogramDefault#getDefaultName <em>Default Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Name</em>' attribute.
   * @see #getDefaultName()
   * @generated
   */
  void setDefaultName(String value);

} // SubprogramDefault
