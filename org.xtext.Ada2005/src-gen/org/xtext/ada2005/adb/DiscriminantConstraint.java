/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discriminant Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.DiscriminantConstraint#getDiscriminantAssociation <em>Discriminant Association</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getDiscriminantConstraint()
 * @model
 * @generated
 */
public interface DiscriminantConstraint extends CompositeConstraint
{
  /**
   * Returns the value of the '<em><b>Discriminant Association</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.DiscriminantAssociation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Discriminant Association</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Discriminant Association</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getDiscriminantConstraint_DiscriminantAssociation()
   * @model containment="true"
   * @generated
   */
  EList<DiscriminantAssociation> getDiscriminantAssociation();

} // DiscriminantConstraint
