/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Known Discriminant Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.KnownDiscriminantPart#getDiscriminantsSpecification <em>Discriminants Specification</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getKnownDiscriminantPart()
 * @model
 * @generated
 */
public interface KnownDiscriminantPart extends DiscriminantPart
{
  /**
   * Returns the value of the '<em><b>Discriminants Specification</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.DiscriminantSpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Discriminants Specification</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Discriminants Specification</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getKnownDiscriminantPart_DiscriminantsSpecification()
   * @model containment="true"
   * @generated
   */
  EList<DiscriminantSpecification> getDiscriminantsSpecification();

} // KnownDiscriminantPart
