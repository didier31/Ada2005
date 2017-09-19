/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.LoopStatement#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.LoopStatement#getIterationScheme <em>Iteration Scheme</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.LoopStatement#getSequenceOfStatements <em>Sequence Of Statements</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.LoopStatement#getSameName <em>Same Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getLoopStatement()
 * @model
 * @generated
 */
public interface LoopStatement extends CompoundStatement
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
   * @see org.xtext.ada2005.adb.AdbPackage#getLoopStatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.LoopStatement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Iteration Scheme</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iteration Scheme</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iteration Scheme</em>' containment reference.
   * @see #setIterationScheme(IterationScheme)
   * @see org.xtext.ada2005.adb.AdbPackage#getLoopStatement_IterationScheme()
   * @model containment="true"
   * @generated
   */
  IterationScheme getIterationScheme();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.LoopStatement#getIterationScheme <em>Iteration Scheme</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iteration Scheme</em>' containment reference.
   * @see #getIterationScheme()
   * @generated
   */
  void setIterationScheme(IterationScheme value);

  /**
   * Returns the value of the '<em><b>Sequence Of Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequence Of Statements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequence Of Statements</em>' containment reference.
   * @see #setSequenceOfStatements(SequenceOfStatements)
   * @see org.xtext.ada2005.adb.AdbPackage#getLoopStatement_SequenceOfStatements()
   * @model containment="true"
   * @generated
   */
  SequenceOfStatements getSequenceOfStatements();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.LoopStatement#getSequenceOfStatements <em>Sequence Of Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequence Of Statements</em>' containment reference.
   * @see #getSequenceOfStatements()
   * @generated
   */
  void setSequenceOfStatements(SequenceOfStatements value);

  /**
   * Returns the value of the '<em><b>Same Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Same Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Same Name</em>' attribute.
   * @see #setSameName(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getLoopStatement_SameName()
   * @model
   * @generated
   */
  String getSameName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.LoopStatement#getSameName <em>Same Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Same Name</em>' attribute.
   * @see #getSameName()
   * @generated
   */
  void setSameName(String value);

} // LoopStatement
