/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.DelayAlternative;
import org.xtext.ada2005.adb.EntryCallAlternative;
import org.xtext.ada2005.adb.TimedEntryCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Entry Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.TimedEntryCallImpl#getEntryCallAlternative <em>Entry Call Alternative</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.TimedEntryCallImpl#getDelayAlternative <em>Delay Alternative</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimedEntryCallImpl extends SelectStatementImpl implements TimedEntryCall
{
  /**
   * The cached value of the '{@link #getEntryCallAlternative() <em>Entry Call Alternative</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryCallAlternative()
   * @generated
   * @ordered
   */
  protected EntryCallAlternative entryCallAlternative;

  /**
   * The cached value of the '{@link #getDelayAlternative() <em>Delay Alternative</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelayAlternative()
   * @generated
   * @ordered
   */
  protected DelayAlternative delayAlternative;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimedEntryCallImpl()
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
    return AdbPackage.eINSTANCE.getTimedEntryCall();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntryCallAlternative getEntryCallAlternative()
  {
    return entryCallAlternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntryCallAlternative(EntryCallAlternative newEntryCallAlternative, NotificationChain msgs)
  {
    EntryCallAlternative oldEntryCallAlternative = entryCallAlternative;
    entryCallAlternative = newEntryCallAlternative;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.TIMED_ENTRY_CALL__ENTRY_CALL_ALTERNATIVE, oldEntryCallAlternative, newEntryCallAlternative);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntryCallAlternative(EntryCallAlternative newEntryCallAlternative)
  {
    if (newEntryCallAlternative != entryCallAlternative)
    {
      NotificationChain msgs = null;
      if (entryCallAlternative != null)
        msgs = ((InternalEObject)entryCallAlternative).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.TIMED_ENTRY_CALL__ENTRY_CALL_ALTERNATIVE, null, msgs);
      if (newEntryCallAlternative != null)
        msgs = ((InternalEObject)newEntryCallAlternative).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.TIMED_ENTRY_CALL__ENTRY_CALL_ALTERNATIVE, null, msgs);
      msgs = basicSetEntryCallAlternative(newEntryCallAlternative, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.TIMED_ENTRY_CALL__ENTRY_CALL_ALTERNATIVE, newEntryCallAlternative, newEntryCallAlternative));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DelayAlternative getDelayAlternative()
  {
    return delayAlternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDelayAlternative(DelayAlternative newDelayAlternative, NotificationChain msgs)
  {
    DelayAlternative oldDelayAlternative = delayAlternative;
    delayAlternative = newDelayAlternative;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.TIMED_ENTRY_CALL__DELAY_ALTERNATIVE, oldDelayAlternative, newDelayAlternative);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelayAlternative(DelayAlternative newDelayAlternative)
  {
    if (newDelayAlternative != delayAlternative)
    {
      NotificationChain msgs = null;
      if (delayAlternative != null)
        msgs = ((InternalEObject)delayAlternative).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.TIMED_ENTRY_CALL__DELAY_ALTERNATIVE, null, msgs);
      if (newDelayAlternative != null)
        msgs = ((InternalEObject)newDelayAlternative).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.TIMED_ENTRY_CALL__DELAY_ALTERNATIVE, null, msgs);
      msgs = basicSetDelayAlternative(newDelayAlternative, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.TIMED_ENTRY_CALL__DELAY_ALTERNATIVE, newDelayAlternative, newDelayAlternative));
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
      case AdbPackage.TIMED_ENTRY_CALL__ENTRY_CALL_ALTERNATIVE:
        return basicSetEntryCallAlternative(null, msgs);
      case AdbPackage.TIMED_ENTRY_CALL__DELAY_ALTERNATIVE:
        return basicSetDelayAlternative(null, msgs);
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
      case AdbPackage.TIMED_ENTRY_CALL__ENTRY_CALL_ALTERNATIVE:
        return getEntryCallAlternative();
      case AdbPackage.TIMED_ENTRY_CALL__DELAY_ALTERNATIVE:
        return getDelayAlternative();
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
      case AdbPackage.TIMED_ENTRY_CALL__ENTRY_CALL_ALTERNATIVE:
        setEntryCallAlternative((EntryCallAlternative)newValue);
        return;
      case AdbPackage.TIMED_ENTRY_CALL__DELAY_ALTERNATIVE:
        setDelayAlternative((DelayAlternative)newValue);
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
      case AdbPackage.TIMED_ENTRY_CALL__ENTRY_CALL_ALTERNATIVE:
        setEntryCallAlternative((EntryCallAlternative)null);
        return;
      case AdbPackage.TIMED_ENTRY_CALL__DELAY_ALTERNATIVE:
        setDelayAlternative((DelayAlternative)null);
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
      case AdbPackage.TIMED_ENTRY_CALL__ENTRY_CALL_ALTERNATIVE:
        return entryCallAlternative != null;
      case AdbPackage.TIMED_ENTRY_CALL__DELAY_ALTERNATIVE:
        return delayAlternative != null;
    }
    return super.eIsSet(featureID);
  }

} //TimedEntryCallImpl
