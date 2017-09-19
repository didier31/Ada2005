/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.DerivedTypeDefinition#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.DerivedTypeDefinition#getLimited <em>Limited</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.DerivedTypeDefinition#getSubtypeIndication <em>Subtype Indication</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.DerivedTypeDefinition#getInterfaceList <em>Interface List</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.DerivedTypeDefinition#getRecordExtentionPart <em>Record Extention Part</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getDerivedTypeDefinition()
 * @model
 * @generated
 */
public interface DerivedTypeDefinition extends TypeDefinition
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
   * @see #setAbstract(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getDerivedTypeDefinition_Abstract()
   * @model
   * @generated
   */
  String getAbstract();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DerivedTypeDefinition#getAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #getAbstract()
   * @generated
   */
  void setAbstract(String value);

  /**
   * Returns the value of the '<em><b>Limited</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Limited</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Limited</em>' attribute.
   * @see #setLimited(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getDerivedTypeDefinition_Limited()
   * @model
   * @generated
   */
  String getLimited();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DerivedTypeDefinition#getLimited <em>Limited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limited</em>' attribute.
   * @see #getLimited()
   * @generated
   */
  void setLimited(String value);

  /**
   * Returns the value of the '<em><b>Subtype Indication</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subtype Indication</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subtype Indication</em>' containment reference.
   * @see #setSubtypeIndication(SubtypeIndication)
   * @see org.xtext.ada2005.adb.AdbPackage#getDerivedTypeDefinition_SubtypeIndication()
   * @model containment="true"
   * @generated
   */
  SubtypeIndication getSubtypeIndication();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DerivedTypeDefinition#getSubtypeIndication <em>Subtype Indication</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subtype Indication</em>' containment reference.
   * @see #getSubtypeIndication()
   * @generated
   */
  void setSubtypeIndication(SubtypeIndication value);

  /**
   * Returns the value of the '<em><b>Interface List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface List</em>' containment reference.
   * @see #setInterfaceList(InterfaceList)
   * @see org.xtext.ada2005.adb.AdbPackage#getDerivedTypeDefinition_InterfaceList()
   * @model containment="true"
   * @generated
   */
  InterfaceList getInterfaceList();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DerivedTypeDefinition#getInterfaceList <em>Interface List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface List</em>' containment reference.
   * @see #getInterfaceList()
   * @generated
   */
  void setInterfaceList(InterfaceList value);

  /**
   * Returns the value of the '<em><b>Record Extention Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record Extention Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record Extention Part</em>' containment reference.
   * @see #setRecordExtentionPart(RecordExtensionPart)
   * @see org.xtext.ada2005.adb.AdbPackage#getDerivedTypeDefinition_RecordExtentionPart()
   * @model containment="true"
   * @generated
   */
  RecordExtensionPart getRecordExtentionPart();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DerivedTypeDefinition#getRecordExtentionPart <em>Record Extention Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record Extention Part</em>' containment reference.
   * @see #getRecordExtentionPart()
   * @generated
   */
  void setRecordExtentionPart(RecordExtensionPart value);

} // DerivedTypeDefinition
