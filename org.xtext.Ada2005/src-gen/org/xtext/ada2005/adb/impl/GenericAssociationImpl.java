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
import org.xtext.ada2005.adb.ExplicitGenericActualParameter;
import org.xtext.ada2005.adb.GenericAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.GenericAssociationImpl#getSelectorName <em>Selector Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.GenericAssociationImpl#getExpplicitGenericActualParam <em>Expplicit Generic Actual Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericAssociationImpl extends MinimalEObjectImpl.Container implements GenericAssociation
{
  /**
   * The default value of the '{@link #getSelectorName() <em>Selector Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectorName()
   * @generated
   * @ordered
   */
  protected static final String SELECTOR_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSelectorName() <em>Selector Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectorName()
   * @generated
   * @ordered
   */
  protected String selectorName = SELECTOR_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpplicitGenericActualParam() <em>Expplicit Generic Actual Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpplicitGenericActualParam()
   * @generated
   * @ordered
   */
  protected ExplicitGenericActualParameter expplicitGenericActualParam;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenericAssociationImpl()
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
    return AdbPackage.eINSTANCE.getGenericAssociation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSelectorName()
  {
    return selectorName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelectorName(String newSelectorName)
  {
    String oldSelectorName = selectorName;
    selectorName = newSelectorName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.GENERIC_ASSOCIATION__SELECTOR_NAME, oldSelectorName, selectorName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExplicitGenericActualParameter getExpplicitGenericActualParam()
  {
    return expplicitGenericActualParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpplicitGenericActualParam(ExplicitGenericActualParameter newExpplicitGenericActualParam, NotificationChain msgs)
  {
    ExplicitGenericActualParameter oldExpplicitGenericActualParam = expplicitGenericActualParam;
    expplicitGenericActualParam = newExpplicitGenericActualParam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.GENERIC_ASSOCIATION__EXPPLICIT_GENERIC_ACTUAL_PARAM, oldExpplicitGenericActualParam, newExpplicitGenericActualParam);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpplicitGenericActualParam(ExplicitGenericActualParameter newExpplicitGenericActualParam)
  {
    if (newExpplicitGenericActualParam != expplicitGenericActualParam)
    {
      NotificationChain msgs = null;
      if (expplicitGenericActualParam != null)
        msgs = ((InternalEObject)expplicitGenericActualParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.GENERIC_ASSOCIATION__EXPPLICIT_GENERIC_ACTUAL_PARAM, null, msgs);
      if (newExpplicitGenericActualParam != null)
        msgs = ((InternalEObject)newExpplicitGenericActualParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.GENERIC_ASSOCIATION__EXPPLICIT_GENERIC_ACTUAL_PARAM, null, msgs);
      msgs = basicSetExpplicitGenericActualParam(newExpplicitGenericActualParam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.GENERIC_ASSOCIATION__EXPPLICIT_GENERIC_ACTUAL_PARAM, newExpplicitGenericActualParam, newExpplicitGenericActualParam));
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
      case AdbPackage.GENERIC_ASSOCIATION__EXPPLICIT_GENERIC_ACTUAL_PARAM:
        return basicSetExpplicitGenericActualParam(null, msgs);
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
      case AdbPackage.GENERIC_ASSOCIATION__SELECTOR_NAME:
        return getSelectorName();
      case AdbPackage.GENERIC_ASSOCIATION__EXPPLICIT_GENERIC_ACTUAL_PARAM:
        return getExpplicitGenericActualParam();
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
      case AdbPackage.GENERIC_ASSOCIATION__SELECTOR_NAME:
        setSelectorName((String)newValue);
        return;
      case AdbPackage.GENERIC_ASSOCIATION__EXPPLICIT_GENERIC_ACTUAL_PARAM:
        setExpplicitGenericActualParam((ExplicitGenericActualParameter)newValue);
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
      case AdbPackage.GENERIC_ASSOCIATION__SELECTOR_NAME:
        setSelectorName(SELECTOR_NAME_EDEFAULT);
        return;
      case AdbPackage.GENERIC_ASSOCIATION__EXPPLICIT_GENERIC_ACTUAL_PARAM:
        setExpplicitGenericActualParam((ExplicitGenericActualParameter)null);
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
      case AdbPackage.GENERIC_ASSOCIATION__SELECTOR_NAME:
        return SELECTOR_NAME_EDEFAULT == null ? selectorName != null : !SELECTOR_NAME_EDEFAULT.equals(selectorName);
      case AdbPackage.GENERIC_ASSOCIATION__EXPPLICIT_GENERIC_ACTUAL_PARAM:
        return expplicitGenericActualParam != null;
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
    result.append(" (selectorName: ");
    result.append(selectorName);
    result.append(')');
    return result.toString();
  }

} //GenericAssociationImpl
