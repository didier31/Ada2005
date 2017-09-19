/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Actual Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.GenericActualPart#getGenericAssociation <em>Generic Association</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getGenericActualPart()
 * @model
 * @generated
 */
public interface GenericActualPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Generic Association</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.GenericAssociation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generic Association</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic Association</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getGenericActualPart_GenericAssociation()
   * @model containment="true"
   * @generated
   */
  EList<GenericAssociation> getGenericAssociation();

} // GenericActualPart
