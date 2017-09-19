/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.DeltaConstraint;
import org.xtext.ada2005.adb.RangeConstraint;
import org.xtext.ada2005.adb.SimpleExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delta Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.DeltaConstraintImpl#getDelta <em>Delta</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.DeltaConstraintImpl#getRangeConstraint <em>Range Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeltaConstraintImpl extends ScalarConstraintImpl implements DeltaConstraint
{
  /**
   * The cached value of the '{@link #getDelta() <em>Delta</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelta()
   * @generated
   * @ordered
   */
  protected SimpleExpression delta;

  /**
   * The cached value of the '{@link #getRangeConstraint() <em>Range Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRangeConstraint()
   * @generated
   * @ordered
   */
  protected RangeConstraint rangeConstraint;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeltaConstraintImpl()
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
    return AdbPackage.eINSTANCE.getDeltaConstraint();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleExpression getDelta()
  {
    return delta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDelta(SimpleExpression newDelta, NotificationChain msgs)
  {
    SimpleExpression oldDelta = delta;
    delta = newDelta;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.DELTA_CONSTRAINT__DELTA, oldDelta, newDelta);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelta(SimpleExpression newDelta)
  {
    if (newDelta != delta)
    {
      NotificationChain msgs = null;
      if (delta != null)
        msgs = ((InternalEObject)delta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DELTA_CONSTRAINT__DELTA, null, msgs);
      if (newDelta != null)
        msgs = ((InternalEObject)newDelta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DELTA_CONSTRAINT__DELTA, null, msgs);
      msgs = basicSetDelta(newDelta, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DELTA_CONSTRAINT__DELTA, newDelta, newDelta));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeConstraint getRangeConstraint()
  {
    return rangeConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRangeConstraint(RangeConstraint newRangeConstraint, NotificationChain msgs)
  {
    RangeConstraint oldRangeConstraint = rangeConstraint;
    rangeConstraint = newRangeConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.DELTA_CONSTRAINT__RANGE_CONSTRAINT, oldRangeConstraint, newRangeConstraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRangeConstraint(RangeConstraint newRangeConstraint)
  {
    if (newRangeConstraint != rangeConstraint)
    {
      NotificationChain msgs = null;
      if (rangeConstraint != null)
        msgs = ((InternalEObject)rangeConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DELTA_CONSTRAINT__RANGE_CONSTRAINT, null, msgs);
      if (newRangeConstraint != null)
        msgs = ((InternalEObject)newRangeConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DELTA_CONSTRAINT__RANGE_CONSTRAINT, null, msgs);
      msgs = basicSetRangeConstraint(newRangeConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DELTA_CONSTRAINT__RANGE_CONSTRAINT, newRangeConstraint, newRangeConstraint));
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
      case AdbPackage.DELTA_CONSTRAINT__DELTA:
        return basicSetDelta(null, msgs);
      case AdbPackage.DELTA_CONSTRAINT__RANGE_CONSTRAINT:
        return basicSetRangeConstraint(null, msgs);
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
      case AdbPackage.DELTA_CONSTRAINT__DELTA:
        return getDelta();
      case AdbPackage.DELTA_CONSTRAINT__RANGE_CONSTRAINT:
        return getRangeConstraint();
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
      case AdbPackage.DELTA_CONSTRAINT__DELTA:
        setDelta((SimpleExpression)newValue);
        return;
      case AdbPackage.DELTA_CONSTRAINT__RANGE_CONSTRAINT:
        setRangeConstraint((RangeConstraint)newValue);
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
      case AdbPackage.DELTA_CONSTRAINT__DELTA:
        setDelta((SimpleExpression)null);
        return;
      case AdbPackage.DELTA_CONSTRAINT__RANGE_CONSTRAINT:
        setRangeConstraint((RangeConstraint)null);
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
      case AdbPackage.DELTA_CONSTRAINT__DELTA:
        return delta != null;
      case AdbPackage.DELTA_CONSTRAINT__RANGE_CONSTRAINT:
        return rangeConstraint != null;
    }
    return super.eIsSet(featureID);
  }

} //DeltaConstraintImpl
