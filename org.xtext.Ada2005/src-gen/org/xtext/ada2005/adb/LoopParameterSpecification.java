/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Parameter Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.LoopParameterSpecification#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.LoopParameterSpecification#getDiscreteSubtypeDefinition <em>Discrete Subtype Definition</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getLoopParameterSpecification()
 * @model
 * @generated
 */
public interface LoopParameterSpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute.
   * @see #setIdentifier(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getLoopParameterSpecification_Identifier()
   * @model
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.LoopParameterSpecification#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Discrete Subtype Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Discrete Subtype Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Discrete Subtype Definition</em>' containment reference.
   * @see #setDiscreteSubtypeDefinition(DiscreteSubtypeDefinition)
   * @see org.xtext.ada2005.adb.AdbPackage#getLoopParameterSpecification_DiscreteSubtypeDefinition()
   * @model containment="true"
   * @generated
   */
  DiscreteSubtypeDefinition getDiscreteSubtypeDefinition();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.LoopParameterSpecification#getDiscreteSubtypeDefinition <em>Discrete Subtype Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Discrete Subtype Definition</em>' containment reference.
   * @see #getDiscreteSubtypeDefinition()
   * @generated
   */
  void setDiscreteSubtypeDefinition(DiscreteSubtypeDefinition value);

} // LoopParameterSpecification
