/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modular Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.ModularTypeDefinition#getStaticExpression <em>Static Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getModularTypeDefinition()
 * @model
 * @generated
 */
public interface ModularTypeDefinition extends IntegerTypeDefinition
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
   * @see #setStaticExpression(Expression)
   * @see org.xtext.ada2005.adb.AdbPackage#getModularTypeDefinition_StaticExpression()
   * @model containment="true"
   * @generated
   */
  Expression getStaticExpression();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ModularTypeDefinition#getStaticExpression <em>Static Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Static Expression</em>' containment reference.
   * @see #getStaticExpression()
   * @generated
   */
  void setStaticExpression(Expression value);

} // ModularTypeDefinition
