/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unconstrained Indexes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.UnconstrainedIndexes#getSubtypeMark <em>Subtype Mark</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getUnconstrainedIndexes()
 * @model
 * @generated
 */
public interface UnconstrainedIndexes extends ArrayIndexes
{
  /**
   * Returns the value of the '<em><b>Subtype Mark</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.Name}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subtype Mark</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subtype Mark</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getUnconstrainedIndexes_SubtypeMark()
   * @model containment="true"
   * @generated
   */
  EList<Name> getSubtypeMark();

} // UnconstrainedIndexes
