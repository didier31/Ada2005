/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.Relation#getSimpleExpression <em>Simple Expression</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.Relation#getRelationalOperator <em>Relational Operator</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.Relation#getSubSimpleExpression <em>Sub Simple Expression</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.Relation#getMembership <em>Membership</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject
{
  /**
   * Returns the value of the '<em><b>Simple Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Expression</em>' containment reference.
   * @see #setSimpleExpression(SimpleExpression)
   * @see org.xtext.ada2005.adb.AdbPackage#getRelation_SimpleExpression()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getSimpleExpression();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.Relation#getSimpleExpression <em>Simple Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple Expression</em>' containment reference.
   * @see #getSimpleExpression()
   * @generated
   */
  void setSimpleExpression(SimpleExpression value);

  /**
   * Returns the value of the '<em><b>Relational Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relational Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relational Operator</em>' attribute.
   * @see #setRelationalOperator(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getRelation_RelationalOperator()
   * @model
   * @generated
   */
  String getRelationalOperator();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.Relation#getRelationalOperator <em>Relational Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relational Operator</em>' attribute.
   * @see #getRelationalOperator()
   * @generated
   */
  void setRelationalOperator(String value);

  /**
   * Returns the value of the '<em><b>Sub Simple Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Simple Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Simple Expression</em>' containment reference.
   * @see #setSubSimpleExpression(SimpleExpression)
   * @see org.xtext.ada2005.adb.AdbPackage#getRelation_SubSimpleExpression()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getSubSimpleExpression();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.Relation#getSubSimpleExpression <em>Sub Simple Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Simple Expression</em>' containment reference.
   * @see #getSubSimpleExpression()
   * @generated
   */
  void setSubSimpleExpression(SimpleExpression value);

  /**
   * Returns the value of the '<em><b>Membership</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Membership</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Membership</em>' containment reference.
   * @see #setMembership(Membership)
   * @see org.xtext.ada2005.adb.AdbPackage#getRelation_Membership()
   * @model containment="true"
   * @generated
   */
  Membership getMembership();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.Relation#getMembership <em>Membership</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Membership</em>' containment reference.
   * @see #getMembership()
   * @generated
   */
  void setMembership(Membership value);

} // Relation
