/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.ComponentDefinition#isAliased <em>Aliased</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ComponentDefinition#getSubtypeIndication <em>Subtype Indication</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ComponentDefinition#getAnonymousAccessDefinition <em>Anonymous Access Definition</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getComponentDefinition()
 * @model
 * @generated
 */
public interface ComponentDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Aliased</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aliased</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aliased</em>' attribute.
   * @see #setAliased(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getComponentDefinition_Aliased()
   * @model
   * @generated
   */
  boolean isAliased();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ComponentDefinition#isAliased <em>Aliased</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aliased</em>' attribute.
   * @see #isAliased()
   * @generated
   */
  void setAliased(boolean value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getComponentDefinition_SubtypeIndication()
   * @model containment="true"
   * @generated
   */
  SubtypeIndication getSubtypeIndication();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ComponentDefinition#getSubtypeIndication <em>Subtype Indication</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subtype Indication</em>' containment reference.
   * @see #getSubtypeIndication()
   * @generated
   */
  void setSubtypeIndication(SubtypeIndication value);

  /**
   * Returns the value of the '<em><b>Anonymous Access Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anonymous Access Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anonymous Access Definition</em>' containment reference.
   * @see #setAnonymousAccessDefinition(AnonymousAccessDefinition)
   * @see org.xtext.ada2005.adb.AdbPackage#getComponentDefinition_AnonymousAccessDefinition()
   * @model containment="true"
   * @generated
   */
  AnonymousAccessDefinition getAnonymousAccessDefinition();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ComponentDefinition#getAnonymousAccessDefinition <em>Anonymous Access Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anonymous Access Definition</em>' containment reference.
   * @see #getAnonymousAccessDefinition()
   * @generated
   */
  void setAnonymousAccessDefinition(AnonymousAccessDefinition value);

} // ComponentDefinition
