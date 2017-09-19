/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Full Data Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.FullDataTypeDeclaration#getTypeDefinition <em>Type Definition</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getFullDataTypeDeclaration()
 * @model
 * @generated
 */
public interface FullDataTypeDeclaration extends FullTypeDeclaration
{
  /**
   * Returns the value of the '<em><b>Type Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Definition</em>' containment reference.
   * @see #setTypeDefinition(TypeDefinition)
   * @see org.xtext.ada2005.adb.AdbPackage#getFullDataTypeDeclaration_TypeDefinition()
   * @model containment="true"
   * @generated
   */
  TypeDefinition getTypeDefinition();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FullDataTypeDeclaration#getTypeDefinition <em>Type Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Definition</em>' containment reference.
   * @see #getTypeDefinition()
   * @generated
   */
  void setTypeDefinition(TypeDefinition value);

} // FullDataTypeDeclaration
