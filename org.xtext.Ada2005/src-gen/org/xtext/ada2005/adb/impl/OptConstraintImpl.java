/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.OptConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opt Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.OptConstraintImpl#getOptConstraint <em>Opt Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptConstraintImpl extends MinimalEObjectImpl.Container implements OptConstraint
{
  /**
   * The cached value of the '{@link #getOptConstraint() <em>Opt Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptConstraint()
   * @generated
   * @ordered
   */
  protected EObject optConstraint;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OptConstraintImpl()
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
    return AdbPackage.eINSTANCE.getOptConstraint();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getOptConstraint()
  {
    return optConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOptConstraint(EObject newOptConstraint, NotificationChain msgs)
  {
    EObject oldOptConstraint = optConstraint;
    optConstraint = newOptConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.OPT_CONSTRAINT__OPT_CONSTRAINT, oldOptConstraint, newOptConstraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptConstraint(EObject newOptConstraint)
  {
    if (newOptConstraint != optConstraint)
    {
      NotificationChain msgs = null;
      if (optConstraint != null)
        msgs = ((InternalEObject)optConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.OPT_CONSTRAINT__OPT_CONSTRAINT, null, msgs);
      if (newOptConstraint != null)
        msgs = ((InternalEObject)newOptConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.OPT_CONSTRAINT__OPT_CONSTRAINT, null, msgs);
      msgs = basicSetOptConstraint(newOptConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.OPT_CONSTRAINT__OPT_CONSTRAINT, newOptConstraint, newOptConstraint));
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
      case AdbPackage.OPT_CONSTRAINT__OPT_CONSTRAINT:
        return basicSetOptConstraint(null, msgs);
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
      case AdbPackage.OPT_CONSTRAINT__OPT_CONSTRAINT:
        return getOptConstraint();
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
      case AdbPackage.OPT_CONSTRAINT__OPT_CONSTRAINT:
        setOptConstraint((EObject)newValue);
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
      case AdbPackage.OPT_CONSTRAINT__OPT_CONSTRAINT:
        setOptConstraint((EObject)null);
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
      case AdbPackage.OPT_CONSTRAINT__OPT_CONSTRAINT:
        return optConstraint != null;
    }
    return super.eIsSet(featureID);
  }

} //OptConstraintImpl
