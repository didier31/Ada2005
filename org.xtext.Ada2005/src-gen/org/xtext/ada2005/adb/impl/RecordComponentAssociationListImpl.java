/**
 */
package org.xtext.ada2005.adb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.RecordComponentAssociation;
import org.xtext.ada2005.adb.RecordComponentAssociationList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Component Association List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.RecordComponentAssociationListImpl#getRecordComponentAssociation <em>Record Component Association</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.RecordComponentAssociationListImpl#isNullRecord <em>Null Record</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordComponentAssociationListImpl extends RecordAggregateImpl implements RecordComponentAssociationList
{
  /**
   * The cached value of the '{@link #getRecordComponentAssociation() <em>Record Component Association</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecordComponentAssociation()
   * @generated
   * @ordered
   */
  protected EList<RecordComponentAssociation> recordComponentAssociation;

  /**
   * The default value of the '{@link #isNullRecord() <em>Null Record</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNullRecord()
   * @generated
   * @ordered
   */
  protected static final boolean NULL_RECORD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNullRecord() <em>Null Record</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNullRecord()
   * @generated
   * @ordered
   */
  protected boolean nullRecord = NULL_RECORD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecordComponentAssociationListImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AdbPackage.eINSTANCE.getRecordComponentAssociationList();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RecordComponentAssociation> getRecordComponentAssociation()
  {
    if (recordComponentAssociation == null)
    {
      recordComponentAssociation = new EObjectContainmentEList<RecordComponentAssociation>(RecordComponentAssociation.class, this, AdbPackage.RECORD_COMPONENT_ASSOCIATION_LIST__RECORD_COMPONENT_ASSOCIATION);
    }
    return recordComponentAssociation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNullRecord()
  {
    return nullRecord;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNullRecord(boolean newNullRecord)
  {
    boolean oldNullRecord = nullRecord;
    nullRecord = newNullRecord;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.RECORD_COMPONENT_ASSOCIATION_LIST__NULL_RECORD, oldNullRecord, nullRecord));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AdbPackage.RECORD_COMPONENT_ASSOCIATION_LIST__RECORD_COMPONENT_ASSOCIATION:
        return ((InternalEList<?>)getRecordComponentAssociation()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AdbPackage.RECORD_COMPONENT_ASSOCIATION_LIST__RECORD_COMPONENT_ASSOCIATION:
        return getRecordComponentAssociation();
      case AdbPackage.RECORD_COMPONENT_ASSOCIATION_LIST__NULL_RECORD:
        return isNullRecord();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AdbPackage.RECORD_COMPONENT_ASSOCIATION_LIST__RECORD_COMPONENT_ASSOCIATION:
        getRecordComponentAssociation().clear();
        getRecordComponentAssociation().addAll((Collection<? extends RecordComponentAssociation>)newValue);
        return;
      case AdbPackage.RECORD_COMPONENT_ASSOCIATION_LIST__NULL_RECORD:
        setNullRecord((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AdbPackage.RECORD_COMPONENT_ASSOCIATION_LIST__RECORD_COMPONENT_ASSOCIATION:
        getRecordComponentAssociation().clear();
        return;
      case AdbPackage.RECORD_COMPONENT_ASSOCIATION_LIST__NULL_RECORD:
        setNullRecord(NULL_RECORD_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AdbPackage.RECORD_COMPONENT_ASSOCIATION_LIST__RECORD_COMPONENT_ASSOCIATION:
        return recordComponentAssociation != null && !recordComponentAssociation.isEmpty();
      case AdbPackage.RECORD_COMPONENT_ASSOCIATION_LIST__NULL_RECORD:
        return nullRecord != NULL_RECORD_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (nullRecord: ");
    result.append(nullRecord);
    result.append(')');
    return result.toString();
  }

} //RecordComponentAssociationListImpl
