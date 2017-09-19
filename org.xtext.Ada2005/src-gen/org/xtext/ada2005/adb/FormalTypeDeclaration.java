/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.FormalTypeDeclaration#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.FormalTypeDeclaration#getDiscriminantPart <em>Discriminant Part</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.FormalTypeDeclaration#getFormalTypeDefinition <em>Formal Type Definition</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getFormalTypeDeclaration()
 * @model
 * @generated
 */
public interface FormalTypeDeclaration extends GenericFormalParameterDeclaration
{
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute.
   * @see #setIdentifier(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalTypeDeclaration_Identifier()
   * @model
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalTypeDeclaration#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalTypeDeclaration_DiscriminantPart()
   * @model containment="true"
   * @generated
   */
  DiscriminantPart getDiscriminantPart();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalTypeDeclaration#getDiscriminantPart <em>Discriminant Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Discriminant Part</em>' containment reference.
   * @see #getDiscriminantPart()
   * @generated
   */
  void setDiscriminantPart(DiscriminantPart value);

  /**
   * Returns the value of the '<em><b>Formal Type Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formal Type Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formal Type Definition</em>' containment reference.
   * @see #setFormalTypeDefinition(FormalTypeDefinition)
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalTypeDeclaration_FormalTypeDefinition()
   * @model containment="true"
   * @generated
   */
  FormalTypeDefinition getFormalTypeDefinition();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalTypeDeclaration#getFormalTypeDefinition <em>Formal Type Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formal Type Definition</em>' containment reference.
   * @see #getFormalTypeDefinition()
   * @generated
   */
  void setFormalTypeDefinition(FormalTypeDefinition value);

} // FormalTypeDeclaration
