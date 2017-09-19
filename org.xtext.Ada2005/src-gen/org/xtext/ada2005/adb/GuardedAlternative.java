/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guarded Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.GuardedAlternative#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.GuardedAlternative#getAlternative <em>Alternative</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getGuardedAlternative()
 * @model
 * @generated
 */
public interface GuardedAlternative extends EObject
{
  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(Guard)
   * @see org.xtext.ada2005.adb.AdbPackage#getGuardedAlternative_Guard()
   * @model containment="true"
   * @generated
   */
  Guard getGuard();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.GuardedAlternative#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(Guard value);

  /**
   * Returns the value of the '<em><b>Alternative</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alternative</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alternative</em>' containment reference.
   * @see #setAlternative(SelectAlternative)
   * @see org.xtext.ada2005.adb.AdbPackage#getGuardedAlternative_Alternative()
   * @model containment="true"
   * @generated
   */
  SelectAlternative getAlternative();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.GuardedAlternative#getAlternative <em>Alternative</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alternative</em>' containment reference.
   * @see #getAlternative()
   * @generated
   */
  void setAlternative(SelectAlternative value);

} // GuardedAlternative
