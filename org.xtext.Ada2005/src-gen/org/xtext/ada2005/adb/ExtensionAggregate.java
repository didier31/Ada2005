/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Aggregate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.ExtensionAggregate#getAncestorPart <em>Ancestor Part</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ExtensionAggregate#getRecordComponentAssociationList <em>Record Component Association List</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getExtensionAggregate()
 * @model
 * @generated
 */
public interface ExtensionAggregate extends Aggregate
{
  /**
   * Returns the value of the '<em><b>Ancestor Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ancestor Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ancestor Part</em>' containment reference.
   * @see #setAncestorPart(AncestorPart)
   * @see org.xtext.ada2005.adb.AdbPackage#getExtensionAggregate_AncestorPart()
   * @model containment="true"
   * @generated
   */
  AncestorPart getAncestorPart();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ExtensionAggregate#getAncestorPart <em>Ancestor Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ancestor Part</em>' containment reference.
   * @see #getAncestorPart()
   * @generated
   */
  void setAncestorPart(AncestorPart value);

  /**
   * Returns the value of the '<em><b>Record Component Association List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record Component Association List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record Component Association List</em>' containment reference.
   * @see #setRecordComponentAssociationList(RecordComponentAssociationList)
   * @see org.xtext.ada2005.adb.AdbPackage#getExtensionAggregate_RecordComponentAssociationList()
   * @model containment="true"
   * @generated
   */
  RecordComponentAssociationList getRecordComponentAssociationList();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ExtensionAggregate#getRecordComponentAssociationList <em>Record Component Association List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record Component Association List</em>' containment reference.
   * @see #getRecordComponentAssociationList()
   * @generated
   */
  void setRecordComponentAssociationList(RecordComponentAssociationList value);

} // ExtensionAggregate
