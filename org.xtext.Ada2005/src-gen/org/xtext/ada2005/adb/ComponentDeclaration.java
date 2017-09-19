/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.ComponentDeclaration#getDefiningIdentifiers <em>Defining Identifiers</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ComponentDeclaration#getComponentDefinition <em>Component Definition</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ComponentDeclaration#getDefaultExpression <em>Default Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getComponentDeclaration()
 * @model
 * @generated
 */
public interface ComponentDeclaration extends ProtectedElementDeclaration, ComponentItem
{
  /**
   * Returns the value of the '<em><b>Defining Identifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Defining Identifiers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defining Identifiers</em>' containment reference.
   * @see #setDefiningIdentifiers(DefiningIdentifierList)
   * @see org.xtext.ada2005.adb.AdbPackage#getComponentDeclaration_DefiningIdentifiers()
   * @model containment="true"
   * @generated
   */
  DefiningIdentifierList getDefiningIdentifiers();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ComponentDeclaration#getDefiningIdentifiers <em>Defining Identifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Defining Identifiers</em>' containment reference.
   * @see #getDefiningIdentifiers()
   * @generated
   */
  void setDefiningIdentifiers(DefiningIdentifierList value);

  /**
   * Returns the value of the '<em><b>Component Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component Definition</em>' containment reference.
   * @see #setComponentDefinition(ComponentDefinition)
   * @see org.xtext.ada2005.adb.AdbPackage#getComponentDeclaration_ComponentDefinition()
   * @model containment="true"
   * @generated
   */
  ComponentDefinition getComponentDefinition();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ComponentDeclaration#getComponentDefinition <em>Component Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component Definition</em>' containment reference.
   * @see #getComponentDefinition()
   * @generated
   */
  void setComponentDefinition(ComponentDefinition value);

  /**
   * Returns the value of the '<em><b>Default Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Expression</em>' containment reference.
   * @see #setDefaultExpression(Expression)
   * @see org.xtext.ada2005.adb.AdbPackage#getComponentDeclaration_DefaultExpression()
   * @model containment="true"
   * @generated
   */
  Expression getDefaultExpression();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ComponentDeclaration#getDefaultExpression <em>Default Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Expression</em>' containment reference.
   * @see #getDefaultExpression()
   * @generated
   */
  void setDefaultExpression(Expression value);

} // ComponentDeclaration
