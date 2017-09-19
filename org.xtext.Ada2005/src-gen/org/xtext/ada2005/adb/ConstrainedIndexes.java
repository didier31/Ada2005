/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constrained Indexes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.ConstrainedIndexes#getConstrainedIndex <em>Constrained Index</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getConstrainedIndexes()
 * @model
 * @generated
 */
public interface ConstrainedIndexes extends ArrayIndexes
{
  /**
   * Returns the value of the '<em><b>Constrained Index</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.DiscreteSubtypeDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constrained Index</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constrained Index</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getConstrainedIndexes_ConstrainedIndex()
   * @model containment="true"
   * @generated
   */
  EList<DiscreteSubtypeDefinition> getConstrainedIndex();

} // ConstrainedIndexes
