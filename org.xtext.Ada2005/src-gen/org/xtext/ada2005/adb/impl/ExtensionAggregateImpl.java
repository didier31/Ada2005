/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.AncestorPart;
import org.xtext.ada2005.adb.ExtensionAggregate;
import org.xtext.ada2005.adb.RecordComponentAssociationList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Aggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.ExtensionAggregateImpl#getAncestorPart <em>Ancestor Part</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ExtensionAggregateImpl#getRecordComponentAssociationList <em>Record Component Association List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionAggregateImpl extends AggregateImpl implements ExtensionAggregate
{
  /**
   * The cached value of the '{@link #getAncestorPart() <em>Ancestor Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAncestorPart()
   * @generated
   * @ordered
   */
  protected AncestorPart ancestorPart;

  /**
   * The cached value of the '{@link #getRecordComponentAssociationList() <em>Record Component Association List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecordComponentAssociationList()
   * @generated
   * @ordered
   */
  protected RecordComponentAssociationList recordComponentAssociationList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtensionAggregateImpl()
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
    return AdbPackage.eINSTANCE.getExtensionAggregate();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AncestorPart getAncestorPart()
  {
    return ancestorPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAncestorPart(AncestorPart newAncestorPart, NotificationChain msgs)
  {
    AncestorPart oldAncestorPart = ancestorPart;
    ancestorPart = newAncestorPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.EXTENSION_AGGREGATE__ANCESTOR_PART, oldAncestorPart, newAncestorPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAncestorPart(AncestorPart newAncestorPart)
  {
    if (newAncestorPart != ancestorPart)
    {
      NotificationChain msgs = null;
      if (ancestorPart != null)
        msgs = ((InternalEObject)ancestorPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.EXTENSION_AGGREGATE__ANCESTOR_PART, null, msgs);
      if (newAncestorPart != null)
        msgs = ((InternalEObject)newAncestorPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.EXTENSION_AGGREGATE__ANCESTOR_PART, null, msgs);
      msgs = basicSetAncestorPart(newAncestorPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.EXTENSION_AGGREGATE__ANCESTOR_PART, newAncestorPart, newAncestorPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordComponentAssociationList getRecordComponentAssociationList()
  {
    return recordComponentAssociationList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecordComponentAssociationList(RecordComponentAssociationList newRecordComponentAssociationList, NotificationChain msgs)
  {
    RecordComponentAssociationList oldRecordComponentAssociationList = recordComponentAssociationList;
    recordComponentAssociationList = newRecordComponentAssociationList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.EXTENSION_AGGREGATE__RECORD_COMPONENT_ASSOCIATION_LIST, oldRecordComponentAssociationList, newRecordComponentAssociationList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecordComponentAssociationList(RecordComponentAssociationList newRecordComponentAssociationList)
  {
    if (newRecordComponentAssociationList != recordComponentAssociationList)
    {
      NotificationChain msgs = null;
      if (recordComponentAssociationList != null)
        msgs = ((InternalEObject)recordComponentAssociationList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.EXTENSION_AGGREGATE__RECORD_COMPONENT_ASSOCIATION_LIST, null, msgs);
      if (newRecordComponentAssociationList != null)
        msgs = ((InternalEObject)newRecordComponentAssociationList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.EXTENSION_AGGREGATE__RECORD_COMPONENT_ASSOCIATION_LIST, null, msgs);
      msgs = basicSetRecordComponentAssociationList(newRecordComponentAssociationList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.EXTENSION_AGGREGATE__RECORD_COMPONENT_ASSOCIATION_LIST, newRecordComponentAssociationList, newRecordComponentAssociationList));
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
      case AdbPackage.EXTENSION_AGGREGATE__ANCESTOR_PART:
        return basicSetAncestorPart(null, msgs);
      case AdbPackage.EXTENSION_AGGREGATE__RECORD_COMPONENT_ASSOCIATION_LIST:
        return basicSetRecordComponentAssociationList(null, msgs);
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
      case AdbPackage.EXTENSION_AGGREGATE__ANCESTOR_PART:
        return getAncestorPart();
      case AdbPackage.EXTENSION_AGGREGATE__RECORD_COMPONENT_ASSOCIATION_LIST:
        return getRecordComponentAssociationList();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AdbPackage.EXTENSION_AGGREGATE__ANCESTOR_PART:
        setAncestorPart((AncestorPart)newValue);
        return;
      case AdbPackage.EXTENSION_AGGREGATE__RECORD_COMPONENT_ASSOCIATION_LIST:
        setRecordComponentAssociationList((RecordComponentAssociationList)newValue);
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
      case AdbPackage.EXTENSION_AGGREGATE__ANCESTOR_PART:
        setAncestorPart((AncestorPart)null);
        return;
      case AdbPackage.EXTENSION_AGGREGATE__RECORD_COMPONENT_ASSOCIATION_LIST:
        setRecordComponentAssociationList((RecordComponentAssociationList)null);
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
      case AdbPackage.EXTENSION_AGGREGATE__ANCESTOR_PART:
        return ancestorPart != null;
      case AdbPackage.EXTENSION_AGGREGATE__RECORD_COMPONENT_ASSOCIATION_LIST:
        return recordComponentAssociationList != null;
    }
    return super.eIsSet(featureID);
  }

} //ExtensionAggregateImpl
