/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subtype Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.SubtypeDeclaration#getSubtypeIndication <em>Subtype Indication</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getSubtypeDeclaration()
 * @model
 * @generated
 */
public interface SubtypeDeclaration extends TypeDeclaration
{
  /**
   * Returns the value of the '<em><b>Subtype Indication</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subtype Indication</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subtype Indication</em>' containment reference.
   * @see #setSubtypeIndication(SubtypeIndication)
   * @see org.xtext.ada2005.adb.AdbPackage#getSubtypeDeclaration_SubtypeIndication()
   * @model containment="true"
   * @generated
   */
  SubtypeIndication getSubtypeIndication();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SubtypeDeclaration#getSubtypeIndication <em>Subtype Indication</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subtype Indication</em>' containment reference.
   * @see #getSubtypeIndication()
   * @generated
   */
  void setSubtypeIndication(SubtypeIndication value);

} // SubtypeDeclaration
