/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.AnonymousAccessDefinition;
import org.xtext.ada2005.adb.NotNullAccessDefinition;
import org.xtext.ada2005.adb.OptNullExclusion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymous Access Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.AnonymousAccessDefinitionImpl#getOptNullExclusion <em>Opt Null Exclusion</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.AnonymousAccessDefinitionImpl#getAccessDef <em>Access Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnonymousAccessDefinitionImpl extends ReturnSubtypeIndicationImpl implements AnonymousAccessDefinition
{
  /**
   * The cached value of the '{@link #getOptNullExclusion() <em>Opt Null Exclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptNullExclusion()
   * @generated
   * @ordered
   */
  protected OptNullExclusion optNullExclusion;

  /**
   * The cached value of the '{@link #getAccessDef() <em>Access Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccessDef()
   * @generated
   * @ordered
   */
  protected NotNullAccessDefinition accessDef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnonymousAccessDefinitionImpl()
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
    return AdbPackage.eINSTANCE.getAnonymousAccessDefinition();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptNullExclusion getOptNullExclusion()
  {
    return optNullExclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOptNullExclusion(OptNullExclusion newOptNullExclusion, NotificationChain msgs)
  {
    OptNullExclusion oldOptNullExclusion = optNullExclusion;
    optNullExclusion = newOptNullExclusion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ANONYMOUS_ACCESS_DEFINITION__OPT_NULL_EXCLUSION, oldOptNullExclusion, newOptNullExclusion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptNullExclusion(OptNullExclusion newOptNullExclusion)
  {
    if (newOptNullExclusion != optNullExclusion)
    {
      NotificationChain msgs = null;
      if (optNullExclusion != null)
        msgs = ((InternalEObject)optNullExclusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ANONYMOUS_ACCESS_DEFINITION__OPT_NULL_EXCLUSION, null, msgs);
      if (newOptNullExclusion != null)
        msgs = ((InternalEObject)newOptNullExclusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ANONYMOUS_ACCESS_DEFINITION__OPT_NULL_EXCLUSION, null, msgs);
      msgs = basicSetOptNullExclusion(newOptNullExclusion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ANONYMOUS_ACCESS_DEFINITION__OPT_NULL_EXCLUSION, newOptNullExclusion, newOptNullExclusion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotNullAccessDefinition getAccessDef()
  {
    return accessDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAccessDef(NotNullAccessDefinition newAccessDef, NotificationChain msgs)
  {
    NotNullAccessDefinition oldAccessDef = accessDef;
    accessDef = newAccessDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ANONYMOUS_ACCESS_DEFINITION__ACCESS_DEF, oldAccessDef, newAccessDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccessDef(NotNullAccessDefinition newAccessDef)
  {
    if (newAccessDef != accessDef)
    {
      NotificationChain msgs = null;
      if (accessDef != null)
        msgs = ((InternalEObject)accessDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ANONYMOUS_ACCESS_DEFINITION__ACCESS_DEF, null, msgs);
      if (newAccessDef != null)
        msgs = ((InternalEObject)newAccessDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ANONYMOUS_ACCESS_DEFINITION__ACCESS_DEF, null, msgs);
      msgs = basicSetAccessDef(newAccessDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ANONYMOUS_ACCESS_DEFINITION__ACCESS_DEF, newAccessDef, newAccessDef));
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
      case AdbPackage.ANONYMOUS_ACCESS_DEFINITION__OPT_NULL_EXCLUSION:
        return basicSetOptNullExclusion(null, msgs);
      case AdbPackage.ANONYMOUS_ACCESS_DEFINITION__ACCESS_DEF:
        return basicSetAccessDef(null, msgs);
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
      case AdbPackage.ANONYMOUS_ACCESS_DEFINITION__OPT_NULL_EXCLUSION:
        return getOptNullExclusion();
      case AdbPackage.ANONYMOUS_ACCESS_DEFINITION__ACCESS_DEF:
        return getAccessDef();
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
      case AdbPackage.ANONYMOUS_ACCESS_DEFINITION__OPT_NULL_EXCLUSION:
        setOptNullExclusion((OptNullExclusion)newValue);
        return;
      case AdbPackage.ANONYMOUS_ACCESS_DEFINITION__ACCESS_DEF:
        setAccessDef((NotNullAccessDefinition)newValue);
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
      case AdbPackage.ANONYMOUS_ACCESS_DEFINITION__OPT_NULL_EXCLUSION:
        setOptNullExclusion((OptNullExclusion)null);
        return;
      case AdbPackage.ANONYMOUS_ACCESS_DEFINITION__ACCESS_DEF:
        setAccessDef((NotNullAccessDefinition)null);
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
      case AdbPackage.ANONYMOUS_ACCESS_DEFINITION__OPT_NULL_EXCLUSION:
        return optNullExclusion != null;
      case AdbPackage.ANONYMOUS_ACCESS_DEFINITION__ACCESS_DEF:
        return accessDef != null;
    }
    return super.eIsSet(featureID);
  }

} //AnonymousAccessDefinitionImpl
