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
import org.xtext.ada2005.adb.Guard;
import org.xtext.ada2005.adb.GuardedAlternative;
import org.xtext.ada2005.adb.SelectAlternative;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guarded Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.GuardedAlternativeImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.GuardedAlternativeImpl#getAlternative <em>Alternative</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuardedAlternativeImpl extends MinimalEObjectImpl.Container implements GuardedAlternative
{
  /**
   * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuard()
   * @generated
   * @ordered
   */
  protected Guard guard;

  /**
   * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlternative()
   * @generated
   * @ordered
   */
  protected SelectAlternative alternative;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GuardedAlternativeImpl()
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
    return AdbPackage.eINSTANCE.getGuardedAlternative();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Guard getGuard()
  {
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGuard(Guard newGuard, NotificationChain msgs)
  {
    Guard oldGuard = guard;
    guard = newGuard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.GUARDED_ALTERNATIVE__GUARD, oldGuard, newGuard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuard(Guard newGuard)
  {
    if (newGuard != guard)
    {
      NotificationChain msgs = null;
      if (guard != null)
        msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.GUARDED_ALTERNATIVE__GUARD, null, msgs);
      if (newGuard != null)
        msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.GUARDED_ALTERNATIVE__GUARD, null, msgs);
      msgs = basicSetGuard(newGuard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.GUARDED_ALTERNATIVE__GUARD, newGuard, newGuard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectAlternative getAlternative()
  {
    return alternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlternative(SelectAlternative newAlternative, NotificationChain msgs)
  {
    SelectAlternative oldAlternative = alternative;
    alternative = newAlternative;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.GUARDED_ALTERNATIVE__ALTERNATIVE, oldAlternative, newAlternative);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlternative(SelectAlternative newAlternative)
  {
    if (newAlternative != alternative)
    {
      NotificationChain msgs = null;
      if (alternative != null)
        msgs = ((InternalEObject)alternative).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.GUARDED_ALTERNATIVE__ALTERNATIVE, null, msgs);
      if (newAlternative != null)
        msgs = ((InternalEObject)newAlternative).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.GUARDED_ALTERNATIVE__ALTERNATIVE, null, msgs);
      msgs = basicSetAlternative(newAlternative, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.GUARDED_ALTERNATIVE__ALTERNATIVE, newAlternative, newAlternative));
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
      case AdbPackage.GUARDED_ALTERNATIVE__GUARD:
        return basicSetGuard(null, msgs);
      case AdbPackage.GUARDED_ALTERNATIVE__ALTERNATIVE:
        return basicSetAlternative(null, msgs);
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
      case AdbPackage.GUARDED_ALTERNATIVE__GUARD:
        return getGuard();
      case AdbPackage.GUARDED_ALTERNATIVE__ALTERNATIVE:
        return getAlternative();
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
      case AdbPackage.GUARDED_ALTERNATIVE__GUARD:
        setGuard((Guard)newValue);
        return;
      case AdbPackage.GUARDED_ALTERNATIVE__ALTERNATIVE:
        setAlternative((SelectAlternative)newValue);
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
      case AdbPackage.GUARDED_ALTERNATIVE__GUARD:
        setGuard((Guard)null);
        return;
      case AdbPackage.GUARDED_ALTERNATIVE__ALTERNATIVE:
        setAlternative((SelectAlternative)null);
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
      case AdbPackage.GUARDED_ALTERNATIVE__GUARD:
        return guard != null;
      case AdbPackage.GUARDED_ALTERNATIVE__ALTERNATIVE:
        return alternative != null;
    }
    return super.eIsSet(featureID);
  }

} //GuardedAlternativeImpl
