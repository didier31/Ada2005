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
import org.xtext.ada2005.adb.AnonymousAccessDefinition;
import org.xtext.ada2005.adb.FormalPart;
import org.xtext.ada2005.adb.Name;
import org.xtext.ada2005.adb.OptNullExclusion;
import org.xtext.ada2005.adb.ParameterAndResultProfile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter And Result Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.ParameterAndResultProfileImpl#getFormalPart <em>Formal Part</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ParameterAndResultProfileImpl#getOpt_nullExclusion <em>Opt null Exclusion</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ParameterAndResultProfileImpl#getSubtypeMark <em>Subtype Mark</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ParameterAndResultProfileImpl#getAnonymousAccessDefinition <em>Anonymous Access Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterAndResultProfileImpl extends MinimalEObjectImpl.Container implements ParameterAndResultProfile
{
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
   * The cached value of the '{@link #getOpt_nullExclusion() <em>Opt null Exclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpt_nullExclusion()
   * @generated
   * @ordered
   */
  protected OptNullExclusion opt_nullExclusion;

  /**
   * The cached value of the '{@link #getSubtypeMark() <em>Subtype Mark</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtypeMark()
   * @generated
   * @ordered
   */
  protected Name subtypeMark;

  /**
   * The cached value of the '{@link #getAnonymousAccessDefinition() <em>Anonymous Access Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnonymousAccessDefinition()
   * @generated
   * @ordered
   */
  protected AnonymousAccessDefinition anonymousAccessDefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterAndResultProfileImpl()
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
    return AdbPackage.eINSTANCE.getParameterAndResultProfile();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.PARAMETER_AND_RESULT_PROFILE__FORMAL_PART, oldFormalPart, newFormalPart);
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
        msgs = ((InternalEObject)formalPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PARAMETER_AND_RESULT_PROFILE__FORMAL_PART, null, msgs);
      if (newFormalPart != null)
        msgs = ((InternalEObject)newFormalPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PARAMETER_AND_RESULT_PROFILE__FORMAL_PART, null, msgs);
      msgs = basicSetFormalPart(newFormalPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PARAMETER_AND_RESULT_PROFILE__FORMAL_PART, newFormalPart, newFormalPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptNullExclusion getOpt_nullExclusion()
  {
    return opt_nullExclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpt_nullExclusion(OptNullExclusion newOpt_nullExclusion, NotificationChain msgs)
  {
    OptNullExclusion oldOpt_nullExclusion = opt_nullExclusion;
    opt_nullExclusion = newOpt_nullExclusion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.PARAMETER_AND_RESULT_PROFILE__OPT_NULL_EXCLUSION, oldOpt_nullExclusion, newOpt_nullExclusion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpt_nullExclusion(OptNullExclusion newOpt_nullExclusion)
  {
    if (newOpt_nullExclusion != opt_nullExclusion)
    {
      NotificationChain msgs = null;
      if (opt_nullExclusion != null)
        msgs = ((InternalEObject)opt_nullExclusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PARAMETER_AND_RESULT_PROFILE__OPT_NULL_EXCLUSION, null, msgs);
      if (newOpt_nullExclusion != null)
        msgs = ((InternalEObject)newOpt_nullExclusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PARAMETER_AND_RESULT_PROFILE__OPT_NULL_EXCLUSION, null, msgs);
      msgs = basicSetOpt_nullExclusion(newOpt_nullExclusion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PARAMETER_AND_RESULT_PROFILE__OPT_NULL_EXCLUSION, newOpt_nullExclusion, newOpt_nullExclusion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getSubtypeMark()
  {
    return subtypeMark;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubtypeMark(Name newSubtypeMark, NotificationChain msgs)
  {
    Name oldSubtypeMark = subtypeMark;
    subtypeMark = newSubtypeMark;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.PARAMETER_AND_RESULT_PROFILE__SUBTYPE_MARK, oldSubtypeMark, newSubtypeMark);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubtypeMark(Name newSubtypeMark)
  {
    if (newSubtypeMark != subtypeMark)
    {
      NotificationChain msgs = null;
      if (subtypeMark != null)
        msgs = ((InternalEObject)subtypeMark).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PARAMETER_AND_RESULT_PROFILE__SUBTYPE_MARK, null, msgs);
      if (newSubtypeMark != null)
        msgs = ((InternalEObject)newSubtypeMark).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PARAMETER_AND_RESULT_PROFILE__SUBTYPE_MARK, null, msgs);
      msgs = basicSetSubtypeMark(newSubtypeMark, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PARAMETER_AND_RESULT_PROFILE__SUBTYPE_MARK, newSubtypeMark, newSubtypeMark));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnonymousAccessDefinition getAnonymousAccessDefinition()
  {
    return anonymousAccessDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnonymousAccessDefinition(AnonymousAccessDefinition newAnonymousAccessDefinition, NotificationChain msgs)
  {
    AnonymousAccessDefinition oldAnonymousAccessDefinition = anonymousAccessDefinition;
    anonymousAccessDefinition = newAnonymousAccessDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.PARAMETER_AND_RESULT_PROFILE__ANONYMOUS_ACCESS_DEFINITION, oldAnonymousAccessDefinition, newAnonymousAccessDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnonymousAccessDefinition(AnonymousAccessDefinition newAnonymousAccessDefinition)
  {
    if (newAnonymousAccessDefinition != anonymousAccessDefinition)
    {
      NotificationChain msgs = null;
      if (anonymousAccessDefinition != null)
        msgs = ((InternalEObject)anonymousAccessDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PARAMETER_AND_RESULT_PROFILE__ANONYMOUS_ACCESS_DEFINITION, null, msgs);
      if (newAnonymousAccessDefinition != null)
        msgs = ((InternalEObject)newAnonymousAccessDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PARAMETER_AND_RESULT_PROFILE__ANONYMOUS_ACCESS_DEFINITION, null, msgs);
      msgs = basicSetAnonymousAccessDefinition(newAnonymousAccessDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PARAMETER_AND_RESULT_PROFILE__ANONYMOUS_ACCESS_DEFINITION, newAnonymousAccessDefinition, newAnonymousAccessDefinition));
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
      case AdbPackage.PARAMETER_AND_RESULT_PROFILE__FORMAL_PART:
        return basicSetFormalPart(null, msgs);
      case AdbPackage.PARAMETER_AND_RESULT_PROFILE__OPT_NULL_EXCLUSION:
        return basicSetOpt_nullExclusion(null, msgs);
      case AdbPackage.PARAMETER_AND_RESULT_PROFILE__SUBTYPE_MARK:
        return basicSetSubtypeMark(null, msgs);
      case AdbPackage.PARAMETER_AND_RESULT_PROFILE__ANONYMOUS_ACCESS_DEFINITION:
        return basicSetAnonymousAccessDefinition(null, msgs);
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
      case AdbPackage.PARAMETER_AND_RESULT_PROFILE__FORMAL_PART:
        return getFormalPart();
      case AdbPackage.PARAMETER_AND_RESULT_PROFILE__OPT_NULL_EXCLUSION:
        return getOpt_nullExclusion();
      case AdbPackage.PARAMETER_AND_RESULT_PROFILE__SUBTYPE_MARK:
        return getSubtypeMark();
      case AdbPackage.PARAMETER_AND_RESULT_PROFILE__ANONYMOUS_ACCESS_DEFINITION:
        return getAnonymousAccessDefinition();
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
      case AdbPackage.PARAMETER_AND_RESULT_PROFILE__FORMAL_PART:
        setFormalPart((FormalPart)newValue);
        return;
      case AdbPackage.PARAMETER_AND_RESULT_PROFILE__OPT_NULL_EXCLUSION:
        setOpt_nullExclusion((OptNullExclusion)newValue);
        return;
      case AdbPackage.PARAMETER_AND_RESULT_PROFILE__SUBTYPE_MARK:
        setSubtypeMark((Name)newValue);
        return;
      case AdbPackage.PARAMETER_AND_RESULT_PROFILE__ANONYMOUS_ACCESS_DEFINITION:
        setAnonymousAccessDefinition((AnonymousAccessDefinition)newValue);
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
      case AdbPackage.PARAMETER_AND_RESULT_PROFILE__FORMAL_PART:
        setFormalPart((FormalPart)null);
        return;
      case AdbPackage.PARAMETER_AND_RESULT_PROFILE__OPT_NULL_EXCLUSION:
        setOpt_nullExclusion((OptNullExclusion)null);
        return;
      case AdbPackage.PARAMETER_AND_RESULT_PROFILE__SUBTYPE_MARK:
        setSubtypeMark((Name)null);
        return;
      case AdbPackage.PARAMETER_AND_RESULT_PROFILE__ANONYMOUS_ACCESS_DEFINITION:
        setAnonymousAccessDefinition((AnonymousAccessDefinition)null);
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
      case AdbPackage.PARAMETER_AND_RESULT_PROFILE__FORMAL_PART:
        return formalPart != null;
      case AdbPackage.PARAMETER_AND_RESULT_PROFILE__OPT_NULL_EXCLUSION:
        return opt_nullExclusion != null;
      case AdbPackage.PARAMETER_AND_RESULT_PROFILE__SUBTYPE_MARK:
        return subtypeMark != null;
      case AdbPackage.PARAMETER_AND_RESULT_PROFILE__ANONYMOUS_ACCESS_DEFINITION:
        return anonymousAccessDefinition != null;
    }
    return super.eIsSet(featureID);
  }

} //ParameterAndResultProfileImpl
