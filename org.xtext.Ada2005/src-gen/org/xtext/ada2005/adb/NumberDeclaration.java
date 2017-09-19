/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.NumberDeclaration#getIdList <em>Id List</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.NumberDeclaration#getStaticExpression <em>Static Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getNumberDeclaration()
 * @model
 * @generated
 */
public interface NumberDeclaration extends BasicDeclaration
{
  /**
   * Returns the value of the '<em><b>Id List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id List</em>' containment reference.
   * @see #setIdList(DefiningIdentifierList)
   * @see org.xtext.ada2005.adb.AdbPackage#getNumberDeclaration_IdList()
   * @model containment="true"
   * @generated
   */
  DefiningIdentifierList getIdList();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.NumberDeclaration#getIdList <em>Id List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id List</em>' containment reference.
   * @see #getIdList()
   * @generated
   */
  void setIdList(DefiningIdentifierList value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getNumberDeclaration_StaticExpression()
   * @model containment="true"
   * @generated
   */
  Expression getStaticExpression();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.NumberDeclaration#getStaticExpression <em>Static Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Static Expression</em>' containment reference.
   * @see #getStaticExpression()
   * @generated
   */
  void setStaticExpression(Expression value);

} // NumberDeclaration
