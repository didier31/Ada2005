/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Subprogram Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.FormalSubprogramDeclaration#getSubprogramSpecification <em>Subprogram Specification</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.FormalSubprogramDeclaration#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.FormalSubprogramDeclaration#getSubprogramDefault <em>Subprogram Default</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getFormalSubprogramDeclaration()
 * @model
 * @generated
 */
public interface FormalSubprogramDeclaration extends GenericFormalParameterDeclaration
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
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalSubprogramDeclaration_SubprogramSpecification()
   * @model containment="true"
   * @generated
   */
  SubprogramSpecification getSubprogramSpecification();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalSubprogramDeclaration#getSubprogramSpecification <em>Subprogram Specification</em>}' containment reference.
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
   * @see #setAbstract(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalSubprogramDeclaration_Abstract()
   * @model
   * @generated
   */
  String getAbstract();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalSubprogramDeclaration#getAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #getAbstract()
   * @generated
   */
  void setAbstract(String value);

  /**
   * Returns the value of the '<em><b>Subprogram Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subprogram Default</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subprogram Default</em>' containment reference.
   * @see #setSubprogramDefault(SubprogramDefault)
   * @see org.xtext.ada2005.adb.AdbPackage#getFormalSubprogramDeclaration_SubprogramDefault()
   * @model containment="true"
   * @generated
   */
  SubprogramDefault getSubprogramDefault();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.FormalSubprogramDeclaration#getSubprogramDefault <em>Subprogram Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subprogram Default</em>' containment reference.
   * @see #getSubprogramDefault()
   * @generated
   */
  void setSubprogramDefault(SubprogramDefault value);

} // FormalSubprogramDeclaration
