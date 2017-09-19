/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.IndexConstraint#getDiscreteRange <em>Discrete Range</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getIndexConstraint()
 * @model
 * @generated
 */
public interface IndexConstraint extends CompositeConstraint
{
  /**
   * Returns the value of the '<em><b>Discrete Range</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.DiscreteRange}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Discrete Range</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Discrete Range</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getIndexConstraint_DiscreteRange()
   * @model containment="true"
   * @generated
   */
  EList<DiscreteRange> getDiscreteRange();

} // IndexConstraint
