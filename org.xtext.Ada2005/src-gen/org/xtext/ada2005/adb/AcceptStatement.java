/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.AcceptStatement#getEntryName <em>Entry Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.AcceptStatement#getEntryIndex <em>Entry Index</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.AcceptStatement#getFormalPart <em>Formal Part</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.AcceptStatement#getHandledSequenceOfStatements <em>Handled Sequence Of Statements</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.AcceptStatement#getEntryidentifier <em>Entryidentifier</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getAcceptStatement()
 * @model
 * @generated
 */
public interface AcceptStatement extends CompoundStatement
{
  /**
   * Returns the value of the '<em><b>Entry Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entry Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry Name</em>' reference.
   * @see #setEntryName(EntryDeclaration)
   * @see org.xtext.ada2005.adb.AdbPackage#getAcceptStatement_EntryName()
   * @model
   * @generated
   */
  EntryDeclaration getEntryName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.AcceptStatement#getEntryName <em>Entry Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entry Name</em>' reference.
   * @see #getEntryName()
   * @generated
   */
  void setEntryName(EntryDeclaration value);

  /**
   * Returns the value of the '<em><b>Entry Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entry Index</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry Index</em>' containment reference.
   * @see #setEntryIndex(EntryIndex)
   * @see org.xtext.ada2005.adb.AdbPackage#getAcceptStatement_EntryIndex()
   * @model containment="true"
   * @generated
   */
  EntryIndex getEntryIndex();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.AcceptStatement#getEntryIndex <em>Entry Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entry Index</em>' containment reference.
   * @see #getEntryIndex()
   * @generated
   */
  void setEntryIndex(EntryIndex value);

  /**
   * Returns the value of the '<em><b>Formal Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formal Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formal Part</em>' containment reference.
   * @see #setFormalPart(FormalPart)
   * @see org.xtext.ada2005.adb.AdbPackage#getAcceptStatement_FormalPart()
   * @model containment="true"
   * @generated
   */
  FormalPart getFormalPart();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.AcceptStatement#getFormalPart <em>Formal Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formal Part</em>' containment reference.
   * @see #getFormalPart()
   * @generated
   */
  void setFormalPart(FormalPart value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getAcceptStatement_HandledSequenceOfStatements()
   * @model containment="true"
   * @generated
   */
  HandledSequenceOfStatements getHandledSequenceOfStatements();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.AcceptStatement#getHandledSequenceOfStatements <em>Handled Sequence Of Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Handled Sequence Of Statements</em>' containment reference.
   * @see #getHandledSequenceOfStatements()
   * @generated
   */
  void setHandledSequenceOfStatements(HandledSequenceOfStatements value);

  /**
   * Returns the value of the '<em><b>Entryidentifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entryidentifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entryidentifier</em>' attribute.
   * @see #setEntryidentifier(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getAcceptStatement_Entryidentifier()
   * @model
   * @generated
   */
  String getEntryidentifier();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.AcceptStatement#getEntryidentifier <em>Entryidentifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entryidentifier</em>' attribute.
   * @see #getEntryidentifier()
   * @generated
   */
  void setEntryidentifier(String value);

} // AcceptStatement
