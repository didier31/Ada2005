/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Extension Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.RecordExtensionPart#getRecordDefinition <em>Record Definition</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getRecordExtensionPart()
 * @model
 * @generated
 */
public interface RecordExtensionPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Record Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record Definition</em>' containment reference.
   * @see #setRecordDefinition(RecordDefinition)
   * @see org.xtext.ada2005.adb.AdbPackage#getRecordExtensionPart_RecordDefinition()
   * @model containment="true"
   * @generated
   */
  RecordDefinition getRecordDefinition();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.RecordExtensionPart#getRecordDefinition <em>Record Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record Definition</em>' containment reference.
   * @see #getRecordDefinition()
   * @generated
   */
  void setRecordDefinition(RecordDefinition value);

} // RecordExtensionPart
