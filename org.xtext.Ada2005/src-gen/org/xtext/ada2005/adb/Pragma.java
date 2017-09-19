/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pragma</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.Pragma#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.Pragma#getPragmaArgumentAssociation <em>Pragma Argument Association</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getPragma()
 * @model
 * @generated
 */
public interface Pragma extends ContextItem, BasicDeclarativeItem, Statement
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
   * @see org.xtext.ada2005.adb.AdbPackage#getPragma_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.Pragma#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Pragma Argument Association</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.PragmaArgumentAssociation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pragma Argument Association</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pragma Argument Association</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getPragma_PragmaArgumentAssociation()
   * @model containment="true"
   * @generated
   */
  EList<PragmaArgumentAssociation> getPragmaArgumentAssociation();

} // Pragma
