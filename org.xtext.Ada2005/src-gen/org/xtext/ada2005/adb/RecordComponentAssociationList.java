/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Component Association List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.RecordComponentAssociationList#getRecordComponentAssociation <em>Record Component Association</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.RecordComponentAssociationList#isNullRecord <em>Null Record</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getRecordComponentAssociationList()
 * @model
 * @generated
 */
public interface RecordComponentAssociationList extends RecordAggregate
{
  /**
   * Returns the value of the '<em><b>Record Component Association</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.RecordComponentAssociation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record Component Association</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record Component Association</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getRecordComponentAssociationList_RecordComponentAssociation()
   * @model containment="true"
   * @generated
   */
  EList<RecordComponentAssociation> getRecordComponentAssociation();

  /**
   * Returns the value of the '<em><b>Null Record</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Null Record</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Null Record</em>' attribute.
   * @see #setNullRecord(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getRecordComponentAssociationList_NullRecord()
   * @model
   * @generated
   */
  boolean isNullRecord();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.RecordComponentAssociationList#isNullRecord <em>Null Record</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Null Record</em>' attribute.
   * @see #isNullRecord()
   * @generated
   */
  void setNullRecord(boolean value);

} // RecordComponentAssociationList
