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
import org.xtext.ada2005.adb.ParameterAssociation;
import org.xtext.ada2005.adb.ParameterEffectiveValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.ParameterAssociationImpl#getSelectorName <em>Selector Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ParameterAssociationImpl#getParameterEffectiveValue <em>Parameter Effective Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterAssociationImpl extends MinimalEObjectImpl.Container implements ParameterAssociation
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
   * The cached value of the '{@link #getParameterEffectiveValue() <em>Parameter Effective Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterEffectiveValue()
   * @generated
   * @ordered
   */
  protected ParameterEffectiveValue parameterEffectiveValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterAssociationImpl()
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
    return AdbPackage.eINSTANCE.getParameterAssociation();
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PARAMETER_ASSOCIATION__SELECTOR_NAME, oldSelectorName, selectorName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterEffectiveValue getParameterEffectiveValue()
  {
    return parameterEffectiveValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterEffectiveValue(ParameterEffectiveValue newParameterEffectiveValue, NotificationChain msgs)
  {
    ParameterEffectiveValue oldParameterEffectiveValue = parameterEffectiveValue;
    parameterEffectiveValue = newParameterEffectiveValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.PARAMETER_ASSOCIATION__PARAMETER_EFFECTIVE_VALUE, oldParameterEffectiveValue, newParameterEffectiveValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterEffectiveValue(ParameterEffectiveValue newParameterEffectiveValue)
  {
    if (newParameterEffectiveValue != parameterEffectiveValue)
    {
      NotificationChain msgs = null;
      if (parameterEffectiveValue != null)
        msgs = ((InternalEObject)parameterEffectiveValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PARAMETER_ASSOCIATION__PARAMETER_EFFECTIVE_VALUE, null, msgs);
      if (newParameterEffectiveValue != null)
        msgs = ((InternalEObject)newParameterEffectiveValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PARAMETER_ASSOCIATION__PARAMETER_EFFECTIVE_VALUE, null, msgs);
      msgs = basicSetParameterEffectiveValue(newParameterEffectiveValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PARAMETER_ASSOCIATION__PARAMETER_EFFECTIVE_VALUE, newParameterEffectiveValue, newParameterEffectiveValue));
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
      case AdbPackage.PARAMETER_ASSOCIATION__PARAMETER_EFFECTIVE_VALUE:
        return basicSetParameterEffectiveValue(null, msgs);
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
      case AdbPackage.PARAMETER_ASSOCIATION__SELECTOR_NAME:
        return getSelectorName();
      case AdbPackage.PARAMETER_ASSOCIATION__PARAMETER_EFFECTIVE_VALUE:
        return getParameterEffectiveValue();
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
      case AdbPackage.PARAMETER_ASSOCIATION__SELECTOR_NAME:
        setSelectorName((String)newValue);
        return;
      case AdbPackage.PARAMETER_ASSOCIATION__PARAMETER_EFFECTIVE_VALUE:
        setParameterEffectiveValue((ParameterEffectiveValue)newValue);
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
      case AdbPackage.PARAMETER_ASSOCIATION__SELECTOR_NAME:
        setSelectorName(SELECTOR_NAME_EDEFAULT);
        return;
      case AdbPackage.PARAMETER_ASSOCIATION__PARAMETER_EFFECTIVE_VALUE:
        setParameterEffectiveValue((ParameterEffectiveValue)null);
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
      case AdbPackage.PARAMETER_ASSOCIATION__SELECTOR_NAME:
        return SELECTOR_NAME_EDEFAULT == null ? selectorName != null : !SELECTOR_NAME_EDEFAULT.equals(selectorName);
      case AdbPackage.PARAMETER_ASSOCIATION__PARAMETER_EFFECTIVE_VALUE:
        return parameterEffectiveValue != null;
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

} //ParameterAssociationImpl
