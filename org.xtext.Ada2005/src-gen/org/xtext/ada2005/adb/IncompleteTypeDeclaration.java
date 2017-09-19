/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incomplete Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.IncompleteTypeDeclaration#getDiscriminantPart <em>Discriminant Part</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.IncompleteTypeDeclaration#isTagged <em>Tagged</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getIncompleteTypeDeclaration()
 * @model
 * @generated
 */
public interface IncompleteTypeDeclaration extends NewTypeDeclaration
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
   * @see org.xtext.ada2005.adb.AdbPackage#getIncompleteTypeDeclaration_DiscriminantPart()
   * @model containment="true"
   * @generated
   */
  DiscriminantPart getDiscriminantPart();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.IncompleteTypeDeclaration#getDiscriminantPart <em>Discriminant Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Discriminant Part</em>' containment reference.
   * @see #getDiscriminantPart()
   * @generated
   */
  void setDiscriminantPart(DiscriminantPart value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getIncompleteTypeDeclaration_Tagged()
   * @model
   * @generated
   */
  boolean isTagged();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.IncompleteTypeDeclaration#isTagged <em>Tagged</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tagged</em>' attribute.
   * @see #isTagged()
   * @generated
   */
  void setTagged(boolean value);

} // IncompleteTypeDeclaration
