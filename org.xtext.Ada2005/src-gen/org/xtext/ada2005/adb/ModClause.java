/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mod Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.ModClause#getMod <em>Mod</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getModClause()
 * @model
 * @generated
 */
public interface ModClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Mod</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mod</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mod</em>' containment reference.
   * @see #setMod(Expression)
   * @see org.xtext.ada2005.adb.AdbPackage#getModClause_Mod()
   * @model containment="true"
   * @generated
   */
  Expression getMod();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ModClause#getMod <em>Mod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mod</em>' containment reference.
   * @see #getMod()
   * @generated
   */
  void setMod(Expression value);

} // ModClause
