/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Positional Array Aggregate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.PositionalArrayAggregate#getInitialValues <em>Initial Values</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.PositionalArrayAggregate#getOthersValue <em>Others Value</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.PositionalArrayAggregate#isOthersBox <em>Others Box</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getPositionalArrayAggregate()
 * @model
 * @generated
 */
public interface PositionalArrayAggregate extends ArrayAggregate
{
  /**
   * Returns the value of the '<em><b>Initial Values</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial Values</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getPositionalArrayAggregate_InitialValues()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getInitialValues();

  /**
   * Returns the value of the '<em><b>Others Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Others Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Others Value</em>' containment reference.
   * @see #setOthersValue(Expression)
   * @see org.xtext.ada2005.adb.AdbPackage#getPositionalArrayAggregate_OthersValue()
   * @model containment="true"
   * @generated
   */
  Expression getOthersValue();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.PositionalArrayAggregate#getOthersValue <em>Others Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Others Value</em>' containment reference.
   * @see #getOthersValue()
   * @generated
   */
  void setOthersValue(Expression value);

  /**
   * Returns the value of the '<em><b>Others Box</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Others Box</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Others Box</em>' attribute.
   * @see #setOthersBox(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getPositionalArrayAggregate_OthersBox()
   * @model
   * @generated
   */
  boolean isOthersBox();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.PositionalArrayAggregate#isOthersBox <em>Others Box</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Others Box</em>' attribute.
   * @see #isOthersBox()
   * @generated
   */
  void setOthersBox(boolean value);

} // PositionalArrayAggregate
