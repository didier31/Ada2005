/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library Unit Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.LibraryUnitDeclaration#isPrivate <em>Private</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.LibraryUnitDeclaration#getLibraryUnitSpecification <em>Library Unit Specification</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getLibraryUnitDeclaration()
 * @model
 * @generated
 */
public interface LibraryUnitDeclaration extends Unit
{
  /**
   * Returns the value of the '<em><b>Private</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Private</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Private</em>' attribute.
   * @see #setPrivate(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getLibraryUnitDeclaration_Private()
   * @model
   * @generated
   */
  boolean isPrivate();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.LibraryUnitDeclaration#isPrivate <em>Private</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Private</em>' attribute.
   * @see #isPrivate()
   * @generated
   */
  void setPrivate(boolean value);

  /**
   * Returns the value of the '<em><b>Library Unit Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Library Unit Specification</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Library Unit Specification</em>' containment reference.
   * @see #setLibraryUnitSpecification(LibraryUnitSpecification)
   * @see org.xtext.ada2005.adb.AdbPackage#getLibraryUnitDeclaration_LibraryUnitSpecification()
   * @model containment="true"
   * @generated
   */
  LibraryUnitSpecification getLibraryUnitSpecification();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.LibraryUnitDeclaration#getLibraryUnitSpecification <em>Library Unit Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Library Unit Specification</em>' containment reference.
   * @see #getLibraryUnitSpecification()
   * @generated
   */
  void setLibraryUnitSpecification(LibraryUnitSpecification value);

} // LibraryUnitDeclaration
