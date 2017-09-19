/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Array Aggregate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.NamedArrayAggregate#getArrayComponentAssociation <em>Array Component Association</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getNamedArrayAggregate()
 * @model
 * @generated
 */
public interface NamedArrayAggregate extends ArrayAggregate
{
  /**
   * Returns the value of the '<em><b>Array Component Association</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.ArrayComponentAssociation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array Component Association</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Component Association</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getNamedArrayAggregate_ArrayComponentAssociation()
   * @model containment="true"
   * @generated
   */
  EList<ArrayComponentAssociation> getArrayComponentAssociation();

} // NamedArrayAggregate
