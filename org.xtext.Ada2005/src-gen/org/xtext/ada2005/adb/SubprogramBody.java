/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.SubprogramBody#getSubprogramSpecification <em>Subprogram Specification</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.SubprogramBody#getEndname <em>Endname</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getSubprogramBody()
 * @model
 * @generated
 */
public interface SubprogramBody extends Unit, DeclarativeBlock, ProperBody, ProtectedOperationItem
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
   * @see org.xtext.ada2005.adb.AdbPackage#getSubprogramBody_SubprogramSpecification()
   * @model containment="true"
   * @generated
   */
  SubprogramSpecification getSubprogramSpecification();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SubprogramBody#getSubprogramSpecification <em>Subprogram Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subprogram Specification</em>' containment reference.
   * @see #getSubprogramSpecification()
   * @generated
   */
  void setSubprogramSpecification(SubprogramSpecification value);

  /**
   * Returns the value of the '<em><b>Endname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Endname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Endname</em>' attribute.
   * @see #setEndname(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getSubprogramBody_Endname()
   * @model
   * @generated
   */
  String getEndname();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SubprogramBody#getEndname <em>Endname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Endname</em>' attribute.
   * @see #getEndname()
   * @generated
   */
  void setEndname(String value);

} // SubprogramBody
