/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.FormalPart#getParameterSpecifications <em>Parameter Specifications</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getFormalPart()
 * @model
 * @generated
 */
public interface FormalPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter Specifications</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.ParameterSpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Specifications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Specifications</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalPart_ParameterSpecifications()
   * @model containment="true"
   * @generated
   */
  EList<ParameterSpecification> getParameterSpecifications();

} // FormalPart
