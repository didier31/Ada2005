/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.BlockStatement#getBlockStatementIdentifier <em>Block Statement Identifier</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getBlockStatement()
 * @model
 * @generated
 */
public interface BlockStatement extends DeclarativeBlock, CompoundStatement
{
  /**
   * Returns the value of the '<em><b>Block Statement Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block Statement Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block Statement Identifier</em>' attribute.
   * @see #setBlockStatementIdentifier(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getBlockStatement_BlockStatementIdentifier()
   * @model
   * @generated
   */
  String getBlockStatementIdentifier();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.BlockStatement#getBlockStatementIdentifier <em>Block Statement Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block Statement Identifier</em>' attribute.
   * @see #getBlockStatementIdentifier()
   * @generated
   */
  void setBlockStatementIdentifier(String value);

} // BlockStatement
