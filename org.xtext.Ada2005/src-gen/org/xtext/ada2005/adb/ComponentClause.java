/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.ComponentClause#getLocalName <em>Local Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ComponentClause#getPosition <em>Position</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ComponentClause#getFirstBit <em>First Bit</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ComponentClause#getLastBit <em>Last Bit</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getComponentClause()
 * @model
 * @generated
 */
public interface ComponentClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Local Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local Name</em>' attribute.
   * @see #setLocalName(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getComponentClause_LocalName()
   * @model
   * @generated
   */
  String getLocalName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ComponentClause#getLocalName <em>Local Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Local Name</em>' attribute.
   * @see #getLocalName()
   * @generated
   */
  void setLocalName(String value);

  /**
   * Returns the value of the '<em><b>Position</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Position</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position</em>' containment reference.
   * @see #setPosition(Expression)
   * @see org.xtext.ada2005.adb.AdbPackage#getComponentClause_Position()
   * @model containment="true"
   * @generated
   */
  Expression getPosition();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ComponentClause#getPosition <em>Position</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' containment reference.
   * @see #getPosition()
   * @generated
   */
  void setPosition(Expression value);

  /**
   * Returns the value of the '<em><b>First Bit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Bit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Bit</em>' containment reference.
   * @see #setFirstBit(SimpleExpression)
   * @see org.xtext.ada2005.adb.AdbPackage#getComponentClause_FirstBit()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getFirstBit();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ComponentClause#getFirstBit <em>First Bit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Bit</em>' containment reference.
   * @see #getFirstBit()
   * @generated
   */
  void setFirstBit(SimpleExpression value);

  /**
   * Returns the value of the '<em><b>Last Bit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Last Bit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Last Bit</em>' containment reference.
   * @see #setLastBit(SimpleExpression)
   * @see org.xtext.ada2005.adb.AdbPackage#getComponentClause_LastBit()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getLastBit();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ComponentClause#getLastBit <em>Last Bit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last Bit</em>' containment reference.
   * @see #getLastBit()
   * @generated
   */
  void setLastBit(SimpleExpression value);

} // ComponentClause
