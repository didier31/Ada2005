/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.EntryBody#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.EntryBody#getEntryBodyFormalPart <em>Entry Body Formal Part</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.EntryBody#getEntryBarrier <em>Entry Barrier</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.EntryBody#getEndid <em>Endid</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getEntryBody()
 * @model
 * @generated
 */
public interface EntryBody extends DeclarativeBlock, ProtectedOperationItem
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(EntryDeclaration)
   * @see org.xtext.ada2005.adb.AdbPackage#getEntryBody_Name()
   * @model
   * @generated
   */
  EntryDeclaration getName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.EntryBody#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(EntryDeclaration value);

  /**
   * Returns the value of the '<em><b>Entry Body Formal Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entry Body Formal Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry Body Formal Part</em>' containment reference.
   * @see #setEntryBodyFormalPart(EntryBodyFormalPart)
   * @see org.xtext.ada2005.adb.AdbPackage#getEntryBody_EntryBodyFormalPart()
   * @model containment="true"
   * @generated
   */
  EntryBodyFormalPart getEntryBodyFormalPart();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.EntryBody#getEntryBodyFormalPart <em>Entry Body Formal Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entry Body Formal Part</em>' containment reference.
   * @see #getEntryBodyFormalPart()
   * @generated
   */
  void setEntryBodyFormalPart(EntryBodyFormalPart value);

  /**
   * Returns the value of the '<em><b>Entry Barrier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entry Barrier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry Barrier</em>' containment reference.
   * @see #setEntryBarrier(EntryBarrier)
   * @see org.xtext.ada2005.adb.AdbPackage#getEntryBody_EntryBarrier()
   * @model containment="true"
   * @generated
   */
  EntryBarrier getEntryBarrier();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.EntryBody#getEntryBarrier <em>Entry Barrier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entry Barrier</em>' containment reference.
   * @see #getEntryBarrier()
   * @generated
   */
  void setEntryBarrier(EntryBarrier value);

  /**
   * Returns the value of the '<em><b>Endid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Endid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Endid</em>' attribute.
   * @see #setEndid(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getEntryBody_Endid()
   * @model
   * @generated
   */
  String getEndid();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.EntryBody#getEndid <em>Endid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Endid</em>' attribute.
   * @see #getEndid()
   * @generated
   */
  void setEndid(String value);

} // EntryBody
