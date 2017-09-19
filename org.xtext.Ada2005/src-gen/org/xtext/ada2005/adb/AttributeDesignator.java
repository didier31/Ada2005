/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Designator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.AttributeDesignator#getStaticExpression <em>Static Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getAttributeDesignator()
 * @model
 * @generated
 */
public interface AttributeDesignator extends EObject
{
  /**
   * Returns the value of the '<em><b>Static Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Static Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Static Expression</em>' containment reference.
   * @see #setStaticExpression(ParenthesizedExpression)
   * @see org.xtext.ada2005.adb.AdbPackage#getAttributeDesignator_StaticExpression()
   * @model containment="true"
   * @generated
   */
  ParenthesizedExpression getStaticExpression();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.AttributeDesignator#getStaticExpression <em>Static Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Static Expression</em>' containment reference.
   * @see #getStaticExpression()
   * @generated
   */
  void setStaticExpression(ParenthesizedExpression value);

} // AttributeDesignator
