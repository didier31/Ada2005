/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.Mode#isIn <em>In</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.Mode#isOut <em>Out</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getMode()
 * @model
 * @generated
 */
public interface Mode extends EObject
{
  /**
   * Returns the value of the '<em><b>In</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In</em>' attribute.
   * @see #setIn(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getMode_In()
   * @model
   * @generated
   */
  boolean isIn();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.Mode#isIn <em>In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In</em>' attribute.
   * @see #isIn()
   * @generated
   */
  void setIn(boolean value);

  /**
   * Returns the value of the '<em><b>Out</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out</em>' attribute.
   * @see #setOut(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getMode_Out()
   * @model
   * @generated
   */
  boolean isOut();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.Mode#isOut <em>Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out</em>' attribute.
   * @see #isOut()
   * @generated
   */
  void setOut(boolean value);

} // Mode
