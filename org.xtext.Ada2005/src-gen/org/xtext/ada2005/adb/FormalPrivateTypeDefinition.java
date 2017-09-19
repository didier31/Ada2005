/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Private Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.FormalPrivateTypeDefinition#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.FormalPrivateTypeDefinition#isTagged <em>Tagged</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.FormalPrivateTypeDefinition#isLimited <em>Limited</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getFormalPrivateTypeDefinition()
 * @model
 * @generated
 */
public interface FormalPrivateTypeDefinition extends FormalTypeDefinition
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
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalPrivateTypeDefinition_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalPrivateTypeDefinition#isAbstract <em>Abstract</em>}' attribute.
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
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalPrivateTypeDefinition_Tagged()
   * @model
   * @generated
   */
  boolean isTagged();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalPrivateTypeDefinition#isTagged <em>Tagged</em>}' attribute.
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
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalPrivateTypeDefinition_Limited()
   * @model
   * @generated
   */
  boolean isLimited();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalPrivateTypeDefinition#isLimited <em>Limited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limited</em>' attribute.
   * @see #isLimited()
   * @generated
   */
  void setLimited(boolean value);

} // FormalPrivateTypeDefinition
