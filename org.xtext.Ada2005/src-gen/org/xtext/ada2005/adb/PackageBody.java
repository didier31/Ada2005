/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.PackageBody#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.PackageBody#getEndName <em>End Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getPackageBody()
 * @model
 * @generated
 */
public interface PackageBody extends Unit, DeclarativeBlock, ProperBody
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(PackageDeclaration)
   * @see org.xtext.ada2005.adb.AdbPackage#getPackageBody_Name()
   * @model
   * @generated
   */
  PackageDeclaration getName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.PackageBody#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(PackageDeclaration value);

  /**
   * Returns the value of the '<em><b>End Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Name</em>' reference.
   * @see #setEndName(PackageDeclaration)
   * @see org.xtext.ada2005.adb.AdbPackage#getPackageBody_EndName()
   * @model
   * @generated
   */
  PackageDeclaration getEndName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.PackageBody#getEndName <em>End Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Name</em>' reference.
   * @see #getEndName()
   * @generated
   */
  void setEndName(PackageDeclaration value);

} // PackageBody
