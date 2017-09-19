/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Overriding Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.OverridingIndicator#isNot <em>Not</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getOverridingIndicator()
 * @model
 * @generated
 */
public interface OverridingIndicator extends EObject
{
  /**
   * Returns the value of the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not</em>' attribute.
   * @see #setNot(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getOverridingIndicator_Not()
   * @model
   * @generated
   */
  boolean isNot();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.OverridingIndicator#isNot <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not</em>' attribute.
   * @see #isNot()
   * @generated
   */
  void setNot(boolean value);

} // OverridingIndicator
