/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Private Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.PrivateTypeDeclaration#getDiscriminantPart <em>Discriminant Part</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.PrivateTypeDeclaration#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.PrivateTypeDeclaration#isTagged <em>Tagged</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.PrivateTypeDeclaration#isLimited <em>Limited</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getPrivateTypeDeclaration()
 * @model
 * @generated
 */
public interface PrivateTypeDeclaration extends NewTypeDeclaration
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
   * @see org.xtext.ada2005.adb.AdbPackage#getPrivateTypeDeclaration_DiscriminantPart()
   * @model containment="true"
   * @generated
   */
  DiscriminantPart getDiscriminantPart();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.PrivateTypeDeclaration#getDiscriminantPart <em>Discriminant Part</em>}' containment reference.
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
   * @see org.xtext.ada2005.adb.AdbPackage#getPrivateTypeDeclaration_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.PrivateTypeDeclaration#isAbstract <em>Abstract</em>}' attribute.
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
   * @see org.xtext.ada2005.adb.AdbPackage#getPrivateTypeDeclaration_Tagged()
   * @model
   * @generated
   */
  boolean isTagged();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.PrivateTypeDeclaration#isTagged <em>Tagged</em>}' attribute.
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
   * @see org.xtext.ada2005.adb.AdbPackage#getPrivateTypeDeclaration_Limited()
   * @model
   * @generated
   */
  boolean isLimited();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.PrivateTypeDeclaration#isLimited <em>Limited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limited</em>' attribute.
   * @see #isLimited()
   * @generated
   */
  void setLimited(boolean value);

} // PrivateTypeDeclaration
