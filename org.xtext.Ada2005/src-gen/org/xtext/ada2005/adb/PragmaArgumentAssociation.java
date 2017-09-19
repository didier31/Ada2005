/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pragma Argument Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.PragmaArgumentAssociation#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.PragmaArgumentAssociation#getEffectiveArgument <em>Effective Argument</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getPragmaArgumentAssociation()
 * @model
 * @generated
 */
public interface PragmaArgumentAssociation extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getPragmaArgumentAssociation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.PragmaArgumentAssociation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Effective Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Effective Argument</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Effective Argument</em>' containment reference.
   * @see #setEffectiveArgument(Expression)
   * @see org.xtext.ada2005.adb.AdbPackage#getPragmaArgumentAssociation_EffectiveArgument()
   * @model containment="true"
   * @generated
   */
  Expression getEffectiveArgument();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.PragmaArgumentAssociation#getEffectiveArgument <em>Effective Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Effective Argument</em>' containment reference.
   * @see #getEffectiveArgument()
   * @generated
   */
  void setEffectiveArgument(Expression value);

} // PragmaArgumentAssociation
