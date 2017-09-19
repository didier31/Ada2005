/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Component Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.ArrayComponentAssociation#getDiscreteChoiceList <em>Discrete Choice List</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ArrayComponentAssociation#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ArrayComponentAssociation#isBox <em>Box</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getArrayComponentAssociation()
 * @model
 * @generated
 */
public interface ArrayComponentAssociation extends EObject
{
  /**
   * Returns the value of the '<em><b>Discrete Choice List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Discrete Choice List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Discrete Choice List</em>' containment reference.
   * @see #setDiscreteChoiceList(DiscreteChoiceList)
   * @see org.xtext.ada2005.adb.AdbPackage#getArrayComponentAssociation_DiscreteChoiceList()
   * @model containment="true"
   * @generated
   */
  DiscreteChoiceList getDiscreteChoiceList();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ArrayComponentAssociation#getDiscreteChoiceList <em>Discrete Choice List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Discrete Choice List</em>' containment reference.
   * @see #getDiscreteChoiceList()
   * @generated
   */
  void setDiscreteChoiceList(DiscreteChoiceList value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.xtext.ada2005.adb.AdbPackage#getArrayComponentAssociation_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ArrayComponentAssociation#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Box</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Box</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Box</em>' attribute.
   * @see #setBox(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getArrayComponentAssociation_Box()
   * @model
   * @generated
   */
  boolean isBox();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ArrayComponentAssociation#isBox <em>Box</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Box</em>' attribute.
   * @see #isBox()
   * @generated
   */
  void setBox(boolean value);

} // ArrayComponentAssociation
