/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.GenericInstantiation#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.GenericInstantiation#getGenericName <em>Generic Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.GenericInstantiation#getOverriding <em>Overriding</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.GenericInstantiation#getGenericActualPart <em>Generic Actual Part</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getGenericInstantiation()
 * @model
 * @generated
 */
public interface GenericInstantiation extends LibraryUnitSpecification, BasicDeclaration
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
   * @see org.xtext.ada2005.adb.AdbPackage#getGenericInstantiation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.GenericInstantiation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Generic Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generic Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic Name</em>' attribute.
   * @see #setGenericName(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getGenericInstantiation_GenericName()
   * @model
   * @generated
   */
  String getGenericName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.GenericInstantiation#getGenericName <em>Generic Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generic Name</em>' attribute.
   * @see #getGenericName()
   * @generated
   */
  void setGenericName(String value);

  /**
   * Returns the value of the '<em><b>Overriding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Overriding</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Overriding</em>' containment reference.
   * @see #setOverriding(OverridingIndicator)
   * @see org.xtext.ada2005.adb.AdbPackage#getGenericInstantiation_Overriding()
   * @model containment="true"
   * @generated
   */
  OverridingIndicator getOverriding();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.GenericInstantiation#getOverriding <em>Overriding</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Overriding</em>' containment reference.
   * @see #getOverriding()
   * @generated
   */
  void setOverriding(OverridingIndicator value);

  /**
   * Returns the value of the '<em><b>Generic Actual Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generic Actual Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic Actual Part</em>' containment reference.
   * @see #setGenericActualPart(GenericActualPart)
   * @see org.xtext.ada2005.adb.AdbPackage#getGenericInstantiation_GenericActualPart()
   * @model containment="true"
   * @generated
   */
  GenericActualPart getGenericActualPart();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.GenericInstantiation#getGenericActualPart <em>Generic Actual Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generic Actual Part</em>' containment reference.
   * @see #getGenericActualPart()
   * @generated
   */
  void setGenericActualPart(GenericActualPart value);

} // GenericInstantiation
