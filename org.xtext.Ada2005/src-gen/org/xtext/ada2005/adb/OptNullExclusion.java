/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opt Null Exclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.OptNullExclusion#getNot_null <em>Not null</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getOptNullExclusion()
 * @model
 * @generated
 */
public interface OptNullExclusion extends EObject
{
  /**
   * Returns the value of the '<em><b>Not null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not null</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not null</em>' attribute.
   * @see #setNot_null(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getOptNullExclusion_Not_null()
   * @model
   * @generated
   */
  String getNot_null();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.OptNullExclusion#getNot_null <em>Not null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not null</em>' attribute.
   * @see #getNot_null()
   * @generated
   */
  void setNot_null(String value);

} // OptNullExclusion
