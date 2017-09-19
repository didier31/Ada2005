/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.Expression#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.Expression#getBooleanOperator <em>Boolean Operator</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EntryIndex, ExplicitGenericActualParameter, DiscreteChoice, AncestorPart, ParameterEffectiveValue
{
  /**
   * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.Relation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relations</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getExpression_Relations()
   * @model containment="true"
   * @generated
   */
  EList<Relation> getRelations();

  /**
   * Returns the value of the '<em><b>Boolean Operator</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean Operator</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean Operator</em>' attribute list.
   * @see org.xtext.ada2005.adb.AdbPackage#getExpression_BooleanOperator()
   * @model unique="false"
   * @generated
   */
  EList<String> getBooleanOperator();

} // Expression
