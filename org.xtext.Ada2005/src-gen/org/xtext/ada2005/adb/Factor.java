/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.Factor#getPrimary <em>Primary</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.Factor#getExponent <em>Exponent</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.Factor#isAbs <em>Abs</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.Factor#isNot <em>Not</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getFactor()
 * @model
 * @generated
 */
public interface Factor extends EObject
{
  /**
   * Returns the value of the '<em><b>Primary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary</em>' containment reference.
   * @see #setPrimary(Primary)
   * @see org.xtext.ada2005.adb.AdbPackage#getFactor_Primary()
   * @model containment="true"
   * @generated
   */
  Primary getPrimary();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.Factor#getPrimary <em>Primary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary</em>' containment reference.
   * @see #getPrimary()
   * @generated
   */
  void setPrimary(Primary value);

  /**
   * Returns the value of the '<em><b>Exponent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exponent</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exponent</em>' containment reference.
   * @see #setExponent(Primary)
   * @see org.xtext.ada2005.adb.AdbPackage#getFactor_Exponent()
   * @model containment="true"
   * @generated
   */
  Primary getExponent();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.Factor#getExponent <em>Exponent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exponent</em>' containment reference.
   * @see #getExponent()
   * @generated
   */
  void setExponent(Primary value);

  /**
   * Returns the value of the '<em><b>Abs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abs</em>' attribute.
   * @see #setAbs(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getFactor_Abs()
   * @model
   * @generated
   */
  boolean isAbs();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.Factor#isAbs <em>Abs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abs</em>' attribute.
   * @see #isAbs()
   * @generated
   */
  void setAbs(boolean value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getFactor_Not()
   * @model
   * @generated
   */
  boolean isNot();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.Factor#isNot <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not</em>' attribute.
   * @see #isNot()
   * @generated
   */
  void setNot(boolean value);

} // Factor
