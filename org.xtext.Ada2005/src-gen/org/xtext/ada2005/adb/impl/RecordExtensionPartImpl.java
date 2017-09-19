/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.RecordDefinition;
import org.xtext.ada2005.adb.RecordExtensionPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Extension Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.RecordExtensionPartImpl#getRecordDefinition <em>Record Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordExtensionPartImpl extends MinimalEObjectImpl.Container implements RecordExtensionPart
{
  /**
   * The cached value of the '{@link #getRecordDefinition() <em>Record Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecordDefinition()
   * @generated
   * @ordered
   */
  protected RecordDefinition recordDefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecordExtensionPartImpl()
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
    return AdbPackage.eINSTANCE.getRecordExtensionPart();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordDefinition getRecordDefinition()
  {
    return recordDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecordDefinition(RecordDefinition newRecordDefinition, NotificationChain msgs)
  {
    RecordDefinition oldRecordDefinition = recordDefinition;
    recordDefinition = newRecordDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.RECORD_EXTENSION_PART__RECORD_DEFINITION, oldRecordDefinition, newRecordDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecordDefinition(RecordDefinition newRecordDefinition)
  {
    if (newRecordDefinition != recordDefinition)
    {
      NotificationChain msgs = null;
      if (recordDefinition != null)
        msgs = ((InternalEObject)recordDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.RECORD_EXTENSION_PART__RECORD_DEFINITION, null, msgs);
      if (newRecordDefinition != null)
        msgs = ((InternalEObject)newRecordDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.RECORD_EXTENSION_PART__RECORD_DEFINITION, null, msgs);
      msgs = basicSetRecordDefinition(newRecordDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.RECORD_EXTENSION_PART__RECORD_DEFINITION, newRecordDefinition, newRecordDefinition));
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
      case AdbPackage.RECORD_EXTENSION_PART__RECORD_DEFINITION:
        return basicSetRecordDefinition(null, msgs);
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
      case AdbPackage.RECORD_EXTENSION_PART__RECORD_DEFINITION:
        return getRecordDefinition();
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
      case AdbPackage.RECORD_EXTENSION_PART__RECORD_DEFINITION:
        setRecordDefinition((RecordDefinition)newValue);
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
      case AdbPackage.RECORD_EXTENSION_PART__RECORD_DEFINITION:
        setRecordDefinition((RecordDefinition)null);
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
      case AdbPackage.RECORD_EXTENSION_PART__RECORD_DEFINITION:
        return recordDefinition != null;
    }
    return super.eIsSet(featureID);
  }

} //RecordExtensionPartImpl
