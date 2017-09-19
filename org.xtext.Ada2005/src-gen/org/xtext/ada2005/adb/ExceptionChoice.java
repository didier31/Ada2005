/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.ExceptionChoice#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ExceptionChoice#isOthers <em>Others</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getExceptionChoice()
 * @model
 * @generated
 */
public interface ExceptionChoice extends EObject
{
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
   * @see org.xtext.ada2005.adb.AdbPackage#getExceptionChoice_Name()
   * @model containment="true"
   * @generated
   */
  Name getName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ExceptionChoice#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Name value);

  /**
   * Returns the value of the '<em><b>Others</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Others</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Others</em>' attribute.
   * @see #setOthers(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getExceptionChoice_Others()
   * @model
   * @generated
   */
  boolean isOthers();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ExceptionChoice#isOthers <em>Others</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Others</em>' attribute.
   * @see #isOthers()
   * @generated
   */
  void setOthers(boolean value);

} // ExceptionChoice
