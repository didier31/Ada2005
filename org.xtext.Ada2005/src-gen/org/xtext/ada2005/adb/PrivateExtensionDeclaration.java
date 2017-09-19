/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Private Extension Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.PrivateExtensionDeclaration#getDiscriminantPart <em>Discriminant Part</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.PrivateExtensionDeclaration#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.PrivateExtensionDeclaration#isLimited <em>Limited</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.PrivateExtensionDeclaration#isSynchronized <em>Synchronized</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.PrivateExtensionDeclaration#getAncestorSubtypeIndication <em>Ancestor Subtype Indication</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.PrivateExtensionDeclaration#getInterfaceList <em>Interface List</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getPrivateExtensionDeclaration()
 * @model
 * @generated
 */
public interface PrivateExtensionDeclaration extends NewTypeDeclaration
{
  /**
   * Returns the value of the '<em><b>Discriminant Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Discriminant Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Discriminant Part</em>' containment reference.
   * @see #setDiscriminantPart(DiscriminantPart)
   * @see org.xtext.ada2005.adb.AdbPackage#getPrivateExtensionDeclaration_DiscriminantPart()
   * @model containment="true"
   * @generated
   */
  DiscriminantPart getDiscriminantPart();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.PrivateExtensionDeclaration#getDiscriminantPart <em>Discriminant Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Discriminant Part</em>' containment reference.
   * @see #getDiscriminantPart()
   * @generated
   */
  void setDiscriminantPart(DiscriminantPart value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getPrivateExtensionDeclaration_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.PrivateExtensionDeclaration#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getPrivateExtensionDeclaration_Limited()
   * @model
   * @generated
   */
  boolean isLimited();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.PrivateExtensionDeclaration#isLimited <em>Limited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limited</em>' attribute.
   * @see #isLimited()
   * @generated
   */
  void setLimited(boolean value);

  /**
   * Returns the value of the '<em><b>Synchronized</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Synchronized</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Synchronized</em>' attribute.
   * @see #setSynchronized(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getPrivateExtensionDeclaration_Synchronized()
   * @model
   * @generated
   */
  boolean isSynchronized();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.PrivateExtensionDeclaration#isSynchronized <em>Synchronized</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Synchronized</em>' attribute.
   * @see #isSynchronized()
   * @generated
   */
  void setSynchronized(boolean value);

  /**
   * Returns the value of the '<em><b>Ancestor Subtype Indication</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ancestor Subtype Indication</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ancestor Subtype Indication</em>' containment reference.
   * @see #setAncestorSubtypeIndication(SubtypeIndication)
   * @see org.xtext.ada2005.adb.AdbPackage#getPrivateExtensionDeclaration_AncestorSubtypeIndication()
   * @model containment="true"
   * @generated
   */
  SubtypeIndication getAncestorSubtypeIndication();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.PrivateExtensionDeclaration#getAncestorSubtypeIndication <em>Ancestor Subtype Indication</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ancestor Subtype Indication</em>' containment reference.
   * @see #getAncestorSubtypeIndication()
   * @generated
   */
  void setAncestorSubtypeIndication(SubtypeIndication value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getPrivateExtensionDeclaration_InterfaceList()
   * @model containment="true"
   * @generated
   */
  InterfaceList getInterfaceList();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.PrivateExtensionDeclaration#getInterfaceList <em>Interface List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface List</em>' containment reference.
   * @see #getInterfaceList()
   * @generated
   */
  void setInterfaceList(InterfaceList value);

} // PrivateExtensionDeclaration
