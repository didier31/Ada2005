/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.RecordTypeDefinition#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.RecordTypeDefinition#isTagged <em>Tagged</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.RecordTypeDefinition#isLimited <em>Limited</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.RecordTypeDefinition#getRecordDefinition <em>Record Definition</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getRecordTypeDefinition()
 * @model
 * @generated
 */
public interface RecordTypeDefinition extends TypeDefinition
{
  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getRecordTypeDefinition_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.RecordTypeDefinition#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Tagged</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tagged</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tagged</em>' attribute.
   * @see #setTagged(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getRecordTypeDefinition_Tagged()
   * @model
   * @generated
   */
  boolean isTagged();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.RecordTypeDefinition#isTagged <em>Tagged</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tagged</em>' attribute.
   * @see #isTagged()
   * @generated
   */
  void setTagged(boolean value);

  /**
   * Returns the value of the '<em><b>Limited</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Limited</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Limited</em>' attribute.
   * @see #setLimited(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getRecordTypeDefinition_Limited()
   * @model
   * @generated
   */
  boolean isLimited();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.RecordTypeDefinition#isLimited <em>Limited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limited</em>' attribute.
   * @see #isLimited()
   * @generated
   */
  void setLimited(boolean value);

  /**
   * Returns the value of the '<em><b>Record Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record Definition</em>' containment reference.
   * @see #setRecordDefinition(RecordDefinition)
   * @see org.xtext.ada2005.adb.AdbPackage#getRecordTypeDefinition_RecordDefinition()
   * @model containment="true"
   * @generated
   */
  RecordDefinition getRecordDefinition();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.RecordTypeDefinition#getRecordDefinition <em>Record Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record Definition</em>' containment reference.
   * @see #getRecordDefinition()
   * @generated
   */
  void setRecordDefinition(RecordDefinition value);

} // RecordTypeDefinition
