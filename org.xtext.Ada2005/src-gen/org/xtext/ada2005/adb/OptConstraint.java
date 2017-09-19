/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opt Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.OptConstraint#getOptConstraint <em>Opt Constraint</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getOptConstraint()
 * @model
 * @generated
 */
public interface OptConstraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Opt Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opt Constraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opt Constraint</em>' containment reference.
   * @see #setOptConstraint(EObject)
   * @see org.xtext.ada2005.adb.AdbPackage#getOptConstraint_OptConstraint()
   * @model containment="true"
   * @generated
   */
  EObject getOptConstraint();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.OptConstraint#getOptConstraint <em>Opt Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opt Constraint</em>' containment reference.
   * @see #getOptConstraint()
   * @generated
   */
  void setOptConstraint(EObject value);

} // OptConstraint
