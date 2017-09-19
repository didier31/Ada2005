/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.PackageDefinition#getPackageSpecification <em>Package Specification</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getPackageDefinition()
 * @model
 * @generated
 */
public interface PackageDefinition extends PackageDeclaration, LibrarySpecification
{
  /**
   * Returns the value of the '<em><b>Package Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Specification</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Specification</em>' containment reference.
   * @see #setPackageSpecification(PackageSpecification)
   * @see org.xtext.ada2005.adb.AdbPackage#getPackageDefinition_PackageSpecification()
   * @model containment="true"
   * @generated
   */
  PackageSpecification getPackageSpecification();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.PackageDefinition#getPackageSpecification <em>Package Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Specification</em>' containment reference.
   * @see #getPackageSpecification()
   * @generated
   */
  void setPackageSpecification(PackageSpecification value);

} // PackageDefinition
