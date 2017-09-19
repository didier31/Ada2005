/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access To Data Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.AccessToDataDefinition#getGeneralAccessModifier <em>General Access Modifier</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.AccessToDataDefinition#getSubtypeIndication <em>Subtype Indication</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getAccessToDataDefinition()
 * @model
 * @generated
 */
public interface AccessToDataDefinition extends AccessSpecification
{
  /**
   * Returns the value of the '<em><b>General Access Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>General Access Modifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>General Access Modifier</em>' attribute.
   * @see #setGeneralAccessModifier(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getAccessToDataDefinition_GeneralAccessModifier()
   * @model
   * @generated
   */
  String getGeneralAccessModifier();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.AccessToDataDefinition#getGeneralAccessModifier <em>General Access Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>General Access Modifier</em>' attribute.
   * @see #getGeneralAccessModifier()
   * @generated
   */
  void setGeneralAccessModifier(String value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getAccessToDataDefinition_SubtypeIndication()
   * @model containment="true"
   * @generated
   */
  SubtypeIndication getSubtypeIndication();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.AccessToDataDefinition#getSubtypeIndication <em>Subtype Indication</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subtype Indication</em>' containment reference.
   * @see #getSubtypeIndication()
   * @generated
   */
  void setSubtypeIndication(SubtypeIndication value);

} // AccessToDataDefinition
