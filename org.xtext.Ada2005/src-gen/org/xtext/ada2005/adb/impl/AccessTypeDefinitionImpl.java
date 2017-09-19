/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AccessSpecification;
import org.xtext.ada2005.adb.AccessTypeDefinition;
import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.OptNullExclusion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.AccessTypeDefinitionImpl#getOptNullExclusion <em>Opt Null Exclusion</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.AccessTypeDefinitionImpl#getAccessDefinition <em>Access Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessTypeDefinitionImpl extends FormalTypeDefinitionImpl implements AccessTypeDefinition
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
   * The cached value of the '{@link #getAccessDefinition() <em>Access Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccessDefinition()
   * @generated
   * @ordered
   */
  protected AccessSpecification accessDefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AccessTypeDefinitionImpl()
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
    return AdbPackage.eINSTANCE.getAccessTypeDefinition();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ACCESS_TYPE_DEFINITION__OPT_NULL_EXCLUSION, oldOptNullExclusion, newOptNullExclusion);
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
        msgs = ((InternalEObject)optNullExclusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ACCESS_TYPE_DEFINITION__OPT_NULL_EXCLUSION, null, msgs);
      if (newOptNullExclusion != null)
        msgs = ((InternalEObject)newOptNullExclusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ACCESS_TYPE_DEFINITION__OPT_NULL_EXCLUSION, null, msgs);
      msgs = basicSetOptNullExclusion(newOptNullExclusion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ACCESS_TYPE_DEFINITION__OPT_NULL_EXCLUSION, newOptNullExclusion, newOptNullExclusion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessSpecification getAccessDefinition()
  {
    return accessDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAccessDefinition(AccessSpecification newAccessDefinition, NotificationChain msgs)
  {
    AccessSpecification oldAccessDefinition = accessDefinition;
    accessDefinition = newAccessDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ACCESS_TYPE_DEFINITION__ACCESS_DEFINITION, oldAccessDefinition, newAccessDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccessDefinition(AccessSpecification newAccessDefinition)
  {
    if (newAccessDefinition != accessDefinition)
    {
      NotificationChain msgs = null;
      if (accessDefinition != null)
        msgs = ((InternalEObject)accessDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ACCESS_TYPE_DEFINITION__ACCESS_DEFINITION, null, msgs);
      if (newAccessDefinition != null)
        msgs = ((InternalEObject)newAccessDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ACCESS_TYPE_DEFINITION__ACCESS_DEFINITION, null, msgs);
      msgs = basicSetAccessDefinition(newAccessDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ACCESS_TYPE_DEFINITION__ACCESS_DEFINITION, newAccessDefinition, newAccessDefinition));
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
      case AdbPackage.ACCESS_TYPE_DEFINITION__OPT_NULL_EXCLUSION:
        return basicSetOptNullExclusion(null, msgs);
      case AdbPackage.ACCESS_TYPE_DEFINITION__ACCESS_DEFINITION:
        return basicSetAccessDefinition(null, msgs);
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
      case AdbPackage.ACCESS_TYPE_DEFINITION__OPT_NULL_EXCLUSION:
        return getOptNullExclusion();
      case AdbPackage.ACCESS_TYPE_DEFINITION__ACCESS_DEFINITION:
        return getAccessDefinition();
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
      case AdbPackage.ACCESS_TYPE_DEFINITION__OPT_NULL_EXCLUSION:
        setOptNullExclusion((OptNullExclusion)newValue);
        return;
      case AdbPackage.ACCESS_TYPE_DEFINITION__ACCESS_DEFINITION:
        setAccessDefinition((AccessSpecification)newValue);
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
      case AdbPackage.ACCESS_TYPE_DEFINITION__OPT_NULL_EXCLUSION:
        setOptNullExclusion((OptNullExclusion)null);
        return;
      case AdbPackage.ACCESS_TYPE_DEFINITION__ACCESS_DEFINITION:
        setAccessDefinition((AccessSpecification)null);
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
      case AdbPackage.ACCESS_TYPE_DEFINITION__OPT_NULL_EXCLUSION:
        return optNullExclusion != null;
      case AdbPackage.ACCESS_TYPE_DEFINITION__ACCESS_DEFINITION:
        return accessDefinition != null;
    }
    return super.eIsSet(featureID);
  }

} //AccessTypeDefinitionImpl
