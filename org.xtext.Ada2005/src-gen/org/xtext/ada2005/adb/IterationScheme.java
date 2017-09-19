/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iteration Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.IterationScheme#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.IterationScheme#getIterationSpecification <em>Iteration Specification</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getIterationScheme()
 * @model
 * @generated
 */
public interface IterationScheme extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Expression)
   * @see org.xtext.ada2005.adb.AdbPackage#getIterationScheme_Condition()
   * @model containment="true"
   * @generated
   */
  Expression getCondition();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.IterationScheme#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Expression value);

  /**
   * Returns the value of the '<em><b>Iteration Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iteration Specification</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iteration Specification</em>' containment reference.
   * @see #setIterationSpecification(LoopParameterSpecification)
   * @see org.xtext.ada2005.adb.AdbPackage#getIterationScheme_IterationSpecification()
   * @model containment="true"
   * @generated
   */
  LoopParameterSpecification getIterationSpecification();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.IterationScheme#getIterationSpecification <em>Iteration Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iteration Specification</em>' containment reference.
   * @see #getIterationSpecification()
   * @generated
   */
  void setIterationSpecification(LoopParameterSpecification value);

} // IterationScheme
