/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Full Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.FullTypeDeclaration#getKnownDiscriminantPart <em>Known Discriminant Part</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getFullTypeDeclaration()
 * @model
 * @generated
 */
public interface FullTypeDeclaration extends NewTypeDeclaration
{
  /**
   * Returns the value of the '<em><b>Known Discriminant Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Known Discriminant Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Known Discriminant Part</em>' containment reference.
   * @see #setKnownDiscriminantPart(KnownDiscriminantPart)
   * @see org.xtext.ada2005.adb.AdbPackage#getFullTypeDeclaration_KnownDiscriminantPart()
   * @model containment="true"
   * @generated
   */
  KnownDiscriminantPart getKnownDiscriminantPart();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FullTypeDeclaration#getKnownDiscriminantPart <em>Known Discriminant Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Known Discriminant Part</em>' containment reference.
   * @see #getKnownDiscriminantPart()
   * @generated
   */
  void setKnownDiscriminantPart(KnownDiscriminantPart value);

} // FullTypeDeclaration
