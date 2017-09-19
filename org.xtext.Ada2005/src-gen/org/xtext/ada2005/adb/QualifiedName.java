/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.QualifiedName#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.QualifiedName#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getQualifiedName()
 * @model
 * @generated
 */
public interface QualifiedName extends Primary
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Name)
   * @see org.xtext.ada2005.adb.AdbPackage#getQualifiedName_Name()
   * @model containment="true"
   * @generated
   */
  Name getName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.QualifiedName#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Name value);

  /**
   * Returns the value of the '<em><b>Qualifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifier</em>' containment reference.
   * @see #setQualifier(Qualifier)
   * @see org.xtext.ada2005.adb.AdbPackage#getQualifiedName_Qualifier()
   * @model containment="true"
   * @generated
   */
  Qualifier getQualifier();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.QualifiedName#getQualifier <em>Qualifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualifier</em>' containment reference.
   * @see #getQualifier()
   * @generated
   */
  void setQualifier(Qualifier value);

} // QualifiedName
