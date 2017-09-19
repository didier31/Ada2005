/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.AccessTypeDefinition#getOptNullExclusion <em>Opt Null Exclusion</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.AccessTypeDefinition#getAccessDefinition <em>Access Definition</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getAccessTypeDefinition()
 * @model
 * @generated
 */
public interface AccessTypeDefinition extends FormalTypeDefinition, TypeDefinition
{
  /**
   * Returns the value of the '<em><b>Opt Null Exclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opt Null Exclusion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opt Null Exclusion</em>' containment reference.
   * @see #setOptNullExclusion(OptNullExclusion)
   * @see org.xtext.ada2005.adb.AdbPackage#getAccessTypeDefinition_OptNullExclusion()
   * @model containment="true"
   * @generated
   */
  OptNullExclusion getOptNullExclusion();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.AccessTypeDefinition#getOptNullExclusion <em>Opt Null Exclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opt Null Exclusion</em>' containment reference.
   * @see #getOptNullExclusion()
   * @generated
   */
  void setOptNullExclusion(OptNullExclusion value);

  /**
   * Returns the value of the '<em><b>Access Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access Definition</em>' containment reference.
   * @see #setAccessDefinition(AccessSpecification)
   * @see org.xtext.ada2005.adb.AdbPackage#getAccessTypeDefinition_AccessDefinition()
   * @model containment="true"
   * @generated
   */
  AccessSpecification getAccessDefinition();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.AccessTypeDefinition#getAccessDefinition <em>Access Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access Definition</em>' containment reference.
   * @see #getAccessDefinition()
   * @generated
   */
  void setAccessDefinition(AccessSpecification value);

} // AccessTypeDefinition
