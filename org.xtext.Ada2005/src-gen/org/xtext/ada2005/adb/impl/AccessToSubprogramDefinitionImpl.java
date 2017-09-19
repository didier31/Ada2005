/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AccessToSubprogramDefinition;
import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.FormalPart;
import org.xtext.ada2005.adb.ParameterAndResultProfile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access To Subprogram Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.AccessToSubprogramDefinitionImpl#isProtected <em>Protected</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.AccessToSubprogramDefinitionImpl#getFormalPart <em>Formal Part</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.AccessToSubprogramDefinitionImpl#getParameterAndResultProfile <em>Parameter And Result Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessToSubprogramDefinitionImpl extends AccessSpecificationImpl implements AccessToSubprogramDefinition
{
  /**
   * The default value of the '{@link #isProtected() <em>Protected</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProtected()
   * @generated
   * @ordered
   */
  protected static final boolean PROTECTED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isProtected() <em>Protected</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProtected()
   * @generated
   * @ordered
   */
  protected boolean protected_ = PROTECTED_EDEFAULT;

  /**
   * The cached value of the '{@link #getFormalPart() <em>Formal Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormalPart()
   * @generated
   * @ordered
   */
  protected FormalPart formalPart;

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
  protected AccessToSubprogramDefinitionImpl()
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
    return AdbPackage.eINSTANCE.getAccessToSubprogramDefinition();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isProtected()
  {
    return protected_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProtected(boolean newProtected)
  {
    boolean oldProtected = protected_;
    protected_ = newProtected;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION__PROTECTED, oldProtected, protected_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalPart getFormalPart()
  {
    return formalPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormalPart(FormalPart newFormalPart, NotificationChain msgs)
  {
    FormalPart oldFormalPart = formalPart;
    formalPart = newFormalPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION__FORMAL_PART, oldFormalPart, newFormalPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormalPart(FormalPart newFormalPart)
  {
    if (newFormalPart != formalPart)
    {
      NotificationChain msgs = null;
      if (formalPart != null)
        msgs = ((InternalEObject)formalPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION__FORMAL_PART, null, msgs);
      if (newFormalPart != null)
        msgs = ((InternalEObject)newFormalPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION__FORMAL_PART, null, msgs);
      msgs = basicSetFormalPart(newFormalPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION__FORMAL_PART, newFormalPart, newFormalPart));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION__PARAMETER_AND_RESULT_PROFILE, oldParameterAndResultProfile, newParameterAndResultProfile);
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
        msgs = ((InternalEObject)parameterAndResultProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION__PARAMETER_AND_RESULT_PROFILE, null, msgs);
      if (newParameterAndResultProfile != null)
        msgs = ((InternalEObject)newParameterAndResultProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION__PARAMETER_AND_RESULT_PROFILE, null, msgs);
      msgs = basicSetParameterAndResultProfile(newParameterAndResultProfile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION__PARAMETER_AND_RESULT_PROFILE, newParameterAndResultProfile, newParameterAndResultProfile));
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
      case AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION__FORMAL_PART:
        return basicSetFormalPart(null, msgs);
      case AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION__PARAMETER_AND_RESULT_PROFILE:
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
      case AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION__PROTECTED:
        return isProtected();
      case AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION__FORMAL_PART:
        return getFormalPart();
      case AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION__PARAMETER_AND_RESULT_PROFILE:
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
      case AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION__PROTECTED:
        setProtected((Boolean)newValue);
        return;
      case AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION__FORMAL_PART:
        setFormalPart((FormalPart)newValue);
        return;
      case AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION__PARAMETER_AND_RESULT_PROFILE:
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
      case AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION__PROTECTED:
        setProtected(PROTECTED_EDEFAULT);
        return;
      case AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION__FORMAL_PART:
        setFormalPart((FormalPart)null);
        return;
      case AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION__PARAMETER_AND_RESULT_PROFILE:
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
      case AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION__PROTECTED:
        return protected_ != PROTECTED_EDEFAULT;
      case AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION__FORMAL_PART:
        return formalPart != null;
      case AdbPackage.ACCESS_TO_SUBPROGRAM_DEFINITION__PARAMETER_AND_RESULT_PROFILE:
        return parameterAndResultProfile != null;
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
    result.append(" (protected: ");
    result.append(protected_);
    result.append(')');
    return result.toString();
  }

} //AccessToSubprogramDefinitionImpl
