/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Derived Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.FormalDerivedTypeDefinition#getAbsract <em>Absract</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.FormalDerivedTypeDefinition#isLimited <em>Limited</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.FormalDerivedTypeDefinition#isSynchronized <em>Synchronized</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.FormalDerivedTypeDefinition#getSubtypeMark <em>Subtype Mark</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.FormalDerivedTypeDefinition#getInterfaceList <em>Interface List</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getFormalDerivedTypeDefinition()
 * @model
 * @generated
 */
public interface FormalDerivedTypeDefinition extends FormalTypeDefinition
{
  /**
   * Returns the value of the '<em><b>Absract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Absract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Absract</em>' attribute.
   * @see #setAbsract(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalDerivedTypeDefinition_Absract()
   * @model
   * @generated
   */
  String getAbsract();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalDerivedTypeDefinition#getAbsract <em>Absract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Absract</em>' attribute.
   * @see #getAbsract()
   * @generated
   */
  void setAbsract(String value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalDerivedTypeDefinition_Limited()
   * @model
   * @generated
   */
  boolean isLimited();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalDerivedTypeDefinition#isLimited <em>Limited</em>}' attribute.
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
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalDerivedTypeDefinition_Synchronized()
   * @model
   * @generated
   */
  boolean isSynchronized();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalDerivedTypeDefinition#isSynchronized <em>Synchronized</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Synchronized</em>' attribute.
   * @see #isSynchronized()
   * @generated
   */
  void setSynchronized(boolean value);

  /**
   * Returns the value of the '<em><b>Subtype Mark</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subtype Mark</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subtype Mark</em>' containment reference.
   * @see #setSubtypeMark(Name)
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalDerivedTypeDefinition_SubtypeMark()
   * @model containment="true"
   * @generated
   */
  Name getSubtypeMark();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalDerivedTypeDefinition#getSubtypeMark <em>Subtype Mark</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subtype Mark</em>' containment reference.
   * @see #getSubtypeMark()
   * @generated
   */
  void setSubtypeMark(Name value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalDerivedTypeDefinition_InterfaceList()
   * @model containment="true"
   * @generated
   */
  InterfaceList getInterfaceList();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalDerivedTypeDefinition#getInterfaceList <em>Interface List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface List</em>' containment reference.
   * @see #getInterfaceList()
   * @generated
   */
  void setInterfaceList(InterfaceList value);

} // FormalDerivedTypeDefinition
