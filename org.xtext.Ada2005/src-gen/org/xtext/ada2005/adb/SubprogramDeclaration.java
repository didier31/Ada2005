/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.SubprogramDeclaration#getSubprogramSpecification <em>Subprogram Specification</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.SubprogramDeclaration#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.SubprogramDeclaration#getRenamedName <em>Renamed Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.SubprogramDeclaration#isNull <em>Null</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getSubprogramDeclaration()
 * @model
 * @generated
 */
public interface SubprogramDeclaration extends BasicDeclaration, ProtectedOperationDeclaration, ProtectedOperationItem
{
  /**
   * Returns the value of the '<em><b>Subprogram Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subprogram Specification</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subprogram Specification</em>' containment reference.
   * @see #setSubprogramSpecification(SubprogramSpecification)
   * @see org.xtext.ada2005.adb.AdbPackage#getSubprogramDeclaration_SubprogramSpecification()
   * @model containment="true"
   * @generated
   */
  SubprogramSpecification getSubprogramSpecification();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SubprogramDeclaration#getSubprogramSpecification <em>Subprogram Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subprogram Specification</em>' containment reference.
   * @see #getSubprogramSpecification()
   * @generated
   */
  void setSubprogramSpecification(SubprogramSpecification value);

  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getSubprogramDeclaration_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SubprogramDeclaration#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Renamed Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Renamed Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Renamed Name</em>' attribute.
   * @see #setRenamedName(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getSubprogramDeclaration_RenamedName()
   * @model
   * @generated
   */
  String getRenamedName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SubprogramDeclaration#getRenamedName <em>Renamed Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Renamed Name</em>' attribute.
   * @see #getRenamedName()
   * @generated
   */
  void setRenamedName(String value);

  /**
   * Returns the value of the '<em><b>Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Null</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Null</em>' attribute.
   * @see #setNull(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getSubprogramDeclaration_Null()
   * @model
   * @generated
   */
  boolean isNull();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SubprogramDeclaration#isNull <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Null</em>' attribute.
   * @see #isNull()
   * @generated
   */
  void setNull(boolean value);

} // SubprogramDeclaration
