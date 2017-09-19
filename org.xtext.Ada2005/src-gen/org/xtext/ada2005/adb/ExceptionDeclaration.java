/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.ExceptionDeclaration#getIdList <em>Id List</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ExceptionDeclaration#getRenamedName <em>Renamed Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getExceptionDeclaration()
 * @model
 * @generated
 */
public interface ExceptionDeclaration extends BasicDeclaration
{
  /**
   * Returns the value of the '<em><b>Id List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id List</em>' containment reference.
   * @see #setIdList(DefiningIdentifierList)
   * @see org.xtext.ada2005.adb.AdbPackage#getExceptionDeclaration_IdList()
   * @model containment="true"
   * @generated
   */
  DefiningIdentifierList getIdList();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ExceptionDeclaration#getIdList <em>Id List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id List</em>' containment reference.
   * @see #getIdList()
   * @generated
   */
  void setIdList(DefiningIdentifierList value);

  /**
   * Returns the value of the '<em><b>Renamed Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Renamed Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Renamed Name</em>' containment reference.
   * @see #setRenamedName(Name)
   * @see org.xtext.ada2005.adb.AdbPackage#getExceptionDeclaration_RenamedName()
   * @model containment="true"
   * @generated
   */
  Name getRenamedName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ExceptionDeclaration#getRenamedName <em>Renamed Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Renamed Name</em>' containment reference.
   * @see #getRenamedName()
   * @generated
   */
  void setRenamedName(Name value);

} // ExceptionDeclaration
