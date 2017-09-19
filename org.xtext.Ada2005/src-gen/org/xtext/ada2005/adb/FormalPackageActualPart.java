/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Package Actual Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.FormalPackageActualPart#isBox <em>Box</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.FormalPackageActualPart#getGenericActualPart <em>Generic Actual Part</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.FormalPackageActualPart#getFormalPackageAssociation <em>Formal Package Association</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getFormalPackageActualPart()
 * @model
 * @generated
 */
public interface FormalPackageActualPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Box</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Box</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Box</em>' attribute.
   * @see #setBox(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalPackageActualPart_Box()
   * @model
   * @generated
   */
  boolean isBox();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalPackageActualPart#isBox <em>Box</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Box</em>' attribute.
   * @see #isBox()
   * @generated
   */
  void setBox(boolean value);

  /**
   * Returns the value of the '<em><b>Generic Actual Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generic Actual Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic Actual Part</em>' containment reference.
   * @see #setGenericActualPart(GenericActualPart)
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalPackageActualPart_GenericActualPart()
   * @model containment="true"
   * @generated
   */
  GenericActualPart getGenericActualPart();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalPackageActualPart#getGenericActualPart <em>Generic Actual Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generic Actual Part</em>' containment reference.
   * @see #getGenericActualPart()
   * @generated
   */
  void setGenericActualPart(GenericActualPart value);

  /**
   * Returns the value of the '<em><b>Formal Package Association</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.FormalPackageAssociation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formal Package Association</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formal Package Association</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalPackageActualPart_FormalPackageAssociation()
   * @model containment="true"
   * @generated
   */
  EList<FormalPackageAssociation> getFormalPackageAssociation();

} // FormalPackageActualPart
