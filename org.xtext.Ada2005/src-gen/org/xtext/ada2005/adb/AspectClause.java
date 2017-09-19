/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.AspectClause#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.AspectClause#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.AspectClause#getMod <em>Mod</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.AspectClause#getComponentClause <em>Component Clause</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getAspectClause()
 * @model
 * @generated
 */
public interface AspectClause extends BasicDeclarativeItem, TaskItem, ProtectedOperationDeclaration, ProtectedOperationItem, ComponentItem
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getAspectClause_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.AspectClause#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getAspectClause_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.AspectClause#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Mod</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mod</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mod</em>' containment reference.
   * @see #setMod(ModClause)
   * @see org.xtext.ada2005.adb.AdbPackage#getAspectClause_Mod()
   * @model containment="true"
   * @generated
   */
  ModClause getMod();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.AspectClause#getMod <em>Mod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mod</em>' containment reference.
   * @see #getMod()
   * @generated
   */
  void setMod(ModClause value);

  /**
   * Returns the value of the '<em><b>Component Clause</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.ComponentClause}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component Clause</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component Clause</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getAspectClause_ComponentClause()
   * @model containment="true"
   * @generated
   */
  EList<ComponentClause> getComponentClause();

} // AspectClause
