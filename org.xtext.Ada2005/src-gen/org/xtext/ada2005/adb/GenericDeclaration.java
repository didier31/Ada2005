/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.GenericDeclaration#getGenericItems <em>Generic Items</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.GenericDeclaration#getLibrarySpecification <em>Library Specification</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getGenericDeclaration()
 * @model
 * @generated
 */
public interface GenericDeclaration extends LibraryUnitSpecification, BasicDeclaration
{
  /**
   * Returns the value of the '<em><b>Generic Items</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generic Items</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic Items</em>' containment reference.
   * @see #setGenericItems(GenericItems)
   * @see org.xtext.ada2005.adb.AdbPackage#getGenericDeclaration_GenericItems()
   * @model containment="true"
   * @generated
   */
  GenericItems getGenericItems();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.GenericDeclaration#getGenericItems <em>Generic Items</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generic Items</em>' containment reference.
   * @see #getGenericItems()
   * @generated
   */
  void setGenericItems(GenericItems value);

  /**
   * Returns the value of the '<em><b>Library Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Library Specification</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Library Specification</em>' containment reference.
   * @see #setLibrarySpecification(LibrarySpecification)
   * @see org.xtext.ada2005.adb.AdbPackage#getGenericDeclaration_LibrarySpecification()
   * @model containment="true"
   * @generated
   */
  LibrarySpecification getLibrarySpecification();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.GenericDeclaration#getLibrarySpecification <em>Library Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Library Specification</em>' containment reference.
   * @see #getLibrarySpecification()
   * @generated
   */
  void setLibrarySpecification(LibrarySpecification value);

} // GenericDeclaration
