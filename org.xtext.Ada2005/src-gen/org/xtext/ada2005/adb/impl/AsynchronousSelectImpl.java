/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AbortablePart;
import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.AsynchronousSelect;
import org.xtext.ada2005.adb.TriggeringAlternative;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asynchronous Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.AsynchronousSelectImpl#getTriggeringAlternative <em>Triggering Alternative</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.AsynchronousSelectImpl#getAbortablePart <em>Abortable Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsynchronousSelectImpl extends SelectStatementImpl implements AsynchronousSelect
{
  /**
   * The cached value of the '{@link #getTriggeringAlternative() <em>Triggering Alternative</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriggeringAlternative()
   * @generated
   * @ordered
   */
  protected TriggeringAlternative triggeringAlternative;

  /**
   * The cached value of the '{@link #getAbortablePart() <em>Abortable Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbortablePart()
   * @generated
   * @ordered
   */
  protected AbortablePart abortablePart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AsynchronousSelectImpl()
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
    return AdbPackage.eINSTANCE.getAsynchronousSelect();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TriggeringAlternative getTriggeringAlternative()
  {
    return triggeringAlternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTriggeringAlternative(TriggeringAlternative newTriggeringAlternative, NotificationChain msgs)
  {
    TriggeringAlternative oldTriggeringAlternative = triggeringAlternative;
    triggeringAlternative = newTriggeringAlternative;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ASYNCHRONOUS_SELECT__TRIGGERING_ALTERNATIVE, oldTriggeringAlternative, newTriggeringAlternative);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTriggeringAlternative(TriggeringAlternative newTriggeringAlternative)
  {
    if (newTriggeringAlternative != triggeringAlternative)
    {
      NotificationChain msgs = null;
      if (triggeringAlternative != null)
        msgs = ((InternalEObject)triggeringAlternative).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ASYNCHRONOUS_SELECT__TRIGGERING_ALTERNATIVE, null, msgs);
      if (newTriggeringAlternative != null)
        msgs = ((InternalEObject)newTriggeringAlternative).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ASYNCHRONOUS_SELECT__TRIGGERING_ALTERNATIVE, null, msgs);
      msgs = basicSetTriggeringAlternative(newTriggeringAlternative, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ASYNCHRONOUS_SELECT__TRIGGERING_ALTERNATIVE, newTriggeringAlternative, newTriggeringAlternative));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbortablePart getAbortablePart()
  {
    return abortablePart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbortablePart(AbortablePart newAbortablePart, NotificationChain msgs)
  {
    AbortablePart oldAbortablePart = abortablePart;
    abortablePart = newAbortablePart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ASYNCHRONOUS_SELECT__ABORTABLE_PART, oldAbortablePart, newAbortablePart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbortablePart(AbortablePart newAbortablePart)
  {
    if (newAbortablePart != abortablePart)
    {
      NotificationChain msgs = null;
      if (abortablePart != null)
        msgs = ((InternalEObject)abortablePart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ASYNCHRONOUS_SELECT__ABORTABLE_PART, null, msgs);
      if (newAbortablePart != null)
        msgs = ((InternalEObject)newAbortablePart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ASYNCHRONOUS_SELECT__ABORTABLE_PART, null, msgs);
      msgs = basicSetAbortablePart(newAbortablePart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ASYNCHRONOUS_SELECT__ABORTABLE_PART, newAbortablePart, newAbortablePart));
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
      case AdbPackage.ASYNCHRONOUS_SELECT__TRIGGERING_ALTERNATIVE:
        return basicSetTriggeringAlternative(null, msgs);
      case AdbPackage.ASYNCHRONOUS_SELECT__ABORTABLE_PART:
        return basicSetAbortablePart(null, msgs);
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
      case AdbPackage.ASYNCHRONOUS_SELECT__TRIGGERING_ALTERNATIVE:
        return getTriggeringAlternative();
      case AdbPackage.ASYNCHRONOUS_SELECT__ABORTABLE_PART:
        return getAbortablePart();
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
      case AdbPackage.ASYNCHRONOUS_SELECT__TRIGGERING_ALTERNATIVE:
        setTriggeringAlternative((TriggeringAlternative)newValue);
        return;
      case AdbPackage.ASYNCHRONOUS_SELECT__ABORTABLE_PART:
        setAbortablePart((AbortablePart)newValue);
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
      case AdbPackage.ASYNCHRONOUS_SELECT__TRIGGERING_ALTERNATIVE:
        setTriggeringAlternative((TriggeringAlternative)null);
        return;
      case AdbPackage.ASYNCHRONOUS_SELECT__ABORTABLE_PART:
        setAbortablePart((AbortablePart)null);
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
      case AdbPackage.ASYNCHRONOUS_SELECT__TRIGGERING_ALTERNATIVE:
        return triggeringAlternative != null;
      case AdbPackage.ASYNCHRONOUS_SELECT__ABORTABLE_PART:
        return abortablePart != null;
    }
    return super.eIsSet(featureID);
  }

} //AsynchronousSelectImpl
