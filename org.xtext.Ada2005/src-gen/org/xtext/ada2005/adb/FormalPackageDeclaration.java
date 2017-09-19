/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Package Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.FormalPackageDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.FormalPackageDeclaration#getGenericPackageName <em>Generic Package Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.FormalPackageDeclaration#getFormalPackageActualPart <em>Formal Package Actual Part</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getFormalPackageDeclaration()
 * @model
 * @generated
 */
public interface FormalPackageDeclaration extends GenericFormalParameterDeclaration
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalPackageDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalPackageDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Generic Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generic Package Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic Package Name</em>' attribute.
   * @see #setGenericPackageName(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalPackageDeclaration_GenericPackageName()
   * @model
   * @generated
   */
  String getGenericPackageName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalPackageDeclaration#getGenericPackageName <em>Generic Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generic Package Name</em>' attribute.
   * @see #getGenericPackageName()
   * @generated
   */
  void setGenericPackageName(String value);

  /**
   * Returns the value of the '<em><b>Formal Package Actual Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formal Package Actual Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formal Package Actual Part</em>' containment reference.
   * @see #setFormalPackageActualPart(FormalPackageActualPart)
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalPackageDeclaration_FormalPackageActualPart()
   * @model containment="true"
   * @generated
   */
  FormalPackageActualPart getFormalPackageActualPart();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalPackageDeclaration#getFormalPackageActualPart <em>Formal Package Actual Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formal Package Actual Part</em>' containment reference.
   * @see #getFormalPackageActualPart()
   * @generated
   */
  void setFormalPackageActualPart(FormalPackageActualPart value);

} // FormalPackageDeclaration
