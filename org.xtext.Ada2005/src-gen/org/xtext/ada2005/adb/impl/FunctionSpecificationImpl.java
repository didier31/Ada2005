/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.FunctionSpecification;
import org.xtext.ada2005.adb.ParameterAndResultProfile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.FunctionSpecificationImpl#getParameterAndResultProfile <em>Parameter And Result Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionSpecificationImpl extends SubprogramSpecificationImpl implements FunctionSpecification
{
  /**
   * The cached value of the '{@link #getParameterAndResultProfile() <em>Parameter And Result Profile</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterAndResultProfile()
   * @generated
   * @ordered
   */
  protected ParameterAndResultProfile parameterAndResultProfile;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionSpecificationImpl()
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
    return AdbPackage.eINSTANCE.getFunctionSpecification();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterAndResultProfile getParameterAndResultProfile()
  {
    return parameterAndResultProfile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterAndResultProfile(ParameterAndResultProfile newParameterAndResultProfile, NotificationChain msgs)
  {
    ParameterAndResultProfile oldParameterAndResultProfile = parameterAndResultProfile;
    parameterAndResultProfile = newParameterAndResultProfile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.FUNCTION_SPECIFICATION__PARAMETER_AND_RESULT_PROFILE, oldParameterAndResultProfile, newParameterAndResultProfile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterAndResultProfile(ParameterAndResultProfile newParameterAndResultProfile)
  {
    if (newParameterAndResultProfile != parameterAndResultProfile)
    {
      NotificationChain msgs = null;
      if (parameterAndResultProfile != null)
        msgs = ((InternalEObject)parameterAndResultProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FUNCTION_SPECIFICATION__PARAMETER_AND_RESULT_PROFILE, null, msgs);
      if (newParameterAndResultProfile != null)
        msgs = ((InternalEObject)newParameterAndResultProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FUNCTION_SPECIFICATION__PARAMETER_AND_RESULT_PROFILE, null, msgs);
      msgs = basicSetParameterAndResultProfile(newParameterAndResultProfile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FUNCTION_SPECIFICATION__PARAMETER_AND_RESULT_PROFILE, newParameterAndResultProfile, newParameterAndResultProfile));
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
      case AdbPackage.FUNCTION_SPECIFICATION__PARAMETER_AND_RESULT_PROFILE:
        return basicSetParameterAndResultProfile(null, msgs);
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
      case AdbPackage.FUNCTION_SPECIFICATION__PARAMETER_AND_RESULT_PROFILE:
        return getParameterAndResultProfile();
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
      case AdbPackage.FUNCTION_SPECIFICATION__PARAMETER_AND_RESULT_PROFILE:
        setParameterAndResultProfile((ParameterAndResultProfile)newValue);
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
      case AdbPackage.FUNCTION_SPECIFICATION__PARAMETER_AND_RESULT_PROFILE:
        setParameterAndResultProfile((ParameterAndResultProfile)null);
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
      case AdbPackage.FUNCTION_SPECIFICATION__PARAMETER_AND_RESULT_PROFILE:
        return parameterAndResultProfile != null;
    }
    return super.eIsSet(featureID);
  }

} //FunctionSpecificationImpl
