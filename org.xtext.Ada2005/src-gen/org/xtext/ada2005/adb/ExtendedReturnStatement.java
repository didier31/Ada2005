/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Return Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.ExtendedReturnStatement#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ExtendedReturnStatement#getReturnSubtype <em>Return Subtype</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ExtendedReturnStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ExtendedReturnStatement#getHandledSequenceOfStatements <em>Handled Sequence Of Statements</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getExtendedReturnStatement()
 * @model
 * @generated
 */
public interface ExtendedReturnStatement extends CompoundStatement
{
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute.
   * @see #setIdentifier(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getExtendedReturnStatement_Identifier()
   * @model
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ExtendedReturnStatement#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Return Subtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Subtype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Subtype</em>' containment reference.
   * @see #setReturnSubtype(ReturnSubtypeIndication)
   * @see org.xtext.ada2005.adb.AdbPackage#getExtendedReturnStatement_ReturnSubtype()
   * @model containment="true"
   * @generated
   */
  ReturnSubtypeIndication getReturnSubtype();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ExtendedReturnStatement#getReturnSubtype <em>Return Subtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Subtype</em>' containment reference.
   * @see #getReturnSubtype()
   * @generated
   */
  void setReturnSubtype(ReturnSubtypeIndication value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getExtendedReturnStatement_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ExtendedReturnStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Handled Sequence Of Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Handled Sequence Of Statements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Handled Sequence Of Statements</em>' containment reference.
   * @see #setHandledSequenceOfStatements(HandledSequenceOfStatements)
   * @see org.xtext.ada2005.adb.AdbPackage#getExtendedReturnStatement_HandledSequenceOfStatements()
   * @model containment="true"
   * @generated
   */
  HandledSequenceOfStatements getHandledSequenceOfStatements();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ExtendedReturnStatement#getHandledSequenceOfStatements <em>Handled Sequence Of Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Handled Sequence Of Statements</em>' containment reference.
   * @see #getHandledSequenceOfStatements()
   * @generated
   */
  void setHandledSequenceOfStatements(HandledSequenceOfStatements value);

} // ExtendedReturnStatement
