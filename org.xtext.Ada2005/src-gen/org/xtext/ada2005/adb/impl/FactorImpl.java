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
import org.xtext.ada2005.adb.Factor;
import org.xtext.ada2005.adb.Primary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.FactorImpl#getPrimary <em>Primary</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.FactorImpl#getExponent <em>Exponent</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.FactorImpl#isAbs <em>Abs</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.FactorImpl#isNot <em>Not</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactorImpl extends MinimalEObjectImpl.Container implements Factor
{
  /**
   * The cached value of the '{@link #getPrimary() <em>Primary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimary()
   * @generated
   * @ordered
   */
  protected Primary primary;

  /**
   * The cached value of the '{@link #getExponent() <em>Exponent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExponent()
   * @generated
   * @ordered
   */
  protected Primary exponent;

  /**
   * The default value of the '{@link #isAbs() <em>Abs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbs()
   * @generated
   * @ordered
   */
  protected static final boolean ABS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAbs() <em>Abs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbs()
   * @generated
   * @ordered
   */
  protected boolean abs = ABS_EDEFAULT;

  /**
   * The default value of the '{@link #isNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNot()
   * @generated
   * @ordered
   */
  protected static final boolean NOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNot()
   * @generated
   * @ordered
   */
  protected boolean not = NOT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FactorImpl()
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
    return AdbPackage.eINSTANCE.getFactor();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primary getPrimary()
  {
    return primary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimary(Primary newPrimary, NotificationChain msgs)
  {
    Primary oldPrimary = primary;
    primary = newPrimary;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.FACTOR__PRIMARY, oldPrimary, newPrimary);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimary(Primary newPrimary)
  {
    if (newPrimary != primary)
    {
      NotificationChain msgs = null;
      if (primary != null)
        msgs = ((InternalEObject)primary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FACTOR__PRIMARY, null, msgs);
      if (newPrimary != null)
        msgs = ((InternalEObject)newPrimary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FACTOR__PRIMARY, null, msgs);
      msgs = basicSetPrimary(newPrimary, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FACTOR__PRIMARY, newPrimary, newPrimary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primary getExponent()
  {
    return exponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExponent(Primary newExponent, NotificationChain msgs)
  {
    Primary oldExponent = exponent;
    exponent = newExponent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.FACTOR__EXPONENT, oldExponent, newExponent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExponent(Primary newExponent)
  {
    if (newExponent != exponent)
    {
      NotificationChain msgs = null;
      if (exponent != null)
        msgs = ((InternalEObject)exponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FACTOR__EXPONENT, null, msgs);
      if (newExponent != null)
        msgs = ((InternalEObject)newExponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FACTOR__EXPONENT, null, msgs);
      msgs = basicSetExponent(newExponent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FACTOR__EXPONENT, newExponent, newExponent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAbs()
  {
    return abs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbs(boolean newAbs)
  {
    boolean oldAbs = abs;
    abs = newAbs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FACTOR__ABS, oldAbs, abs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNot()
  {
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNot(boolean newNot)
  {
    boolean oldNot = not;
    not = newNot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FACTOR__NOT, oldNot, not));
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
      case AdbPackage.FACTOR__PRIMARY:
        return basicSetPrimary(null, msgs);
      case AdbPackage.FACTOR__EXPONENT:
        return basicSetExponent(null, msgs);
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
      case AdbPackage.FACTOR__PRIMARY:
        return getPrimary();
      case AdbPackage.FACTOR__EXPONENT:
        return getExponent();
      case AdbPackage.FACTOR__ABS:
        return isAbs();
      case AdbPackage.FACTOR__NOT:
        return isNot();
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
      case AdbPackage.FACTOR__PRIMARY:
        setPrimary((Primary)newValue);
        return;
      case AdbPackage.FACTOR__EXPONENT:
        setExponent((Primary)newValue);
        return;
      case AdbPackage.FACTOR__ABS:
        setAbs((Boolean)newValue);
        return;
      case AdbPackage.FACTOR__NOT:
        setNot((Boolean)newValue);
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
      case AdbPackage.FACTOR__PRIMARY:
        setPrimary((Primary)null);
        return;
      case AdbPackage.FACTOR__EXPONENT:
        setExponent((Primary)null);
        return;
      case AdbPackage.FACTOR__ABS:
        setAbs(ABS_EDEFAULT);
        return;
      case AdbPackage.FACTOR__NOT:
        setNot(NOT_EDEFAULT);
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
      case AdbPackage.FACTOR__PRIMARY:
        return primary != null;
      case AdbPackage.FACTOR__EXPONENT:
        return exponent != null;
      case AdbPackage.FACTOR__ABS:
        return abs != ABS_EDEFAULT;
      case AdbPackage.FACTOR__NOT:
        return not != NOT_EDEFAULT;
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
    result.append(" (abs: ");
    result.append(abs);
    result.append(", not: ");
    result.append(not);
    result.append(')');
    return result.toString();
  }

} //FactorImpl
