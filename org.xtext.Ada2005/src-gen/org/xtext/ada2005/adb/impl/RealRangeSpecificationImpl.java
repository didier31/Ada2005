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
import org.xtext.ada2005.adb.RealRangeSpecification;
import org.xtext.ada2005.adb.SimpleExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Real Range Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.RealRangeSpecificationImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.RealRangeSpecificationImpl#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RealRangeSpecificationImpl extends MinimalEObjectImpl.Container implements RealRangeSpecification
{
  /**
   * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected SimpleExpression lowerBound;

  /**
   * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected SimpleExpression upperBound;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RealRangeSpecificationImpl()
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
    return AdbPackage.eINSTANCE.getRealRangeSpecification();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleExpression getLowerBound()
  {
    return lowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLowerBound(SimpleExpression newLowerBound, NotificationChain msgs)
  {
    SimpleExpression oldLowerBound = lowerBound;
    lowerBound = newLowerBound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.REAL_RANGE_SPECIFICATION__LOWER_BOUND, oldLowerBound, newLowerBound);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowerBound(SimpleExpression newLowerBound)
  {
    if (newLowerBound != lowerBound)
    {
      NotificationChain msgs = null;
      if (lowerBound != null)
        msgs = ((InternalEObject)lowerBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.REAL_RANGE_SPECIFICATION__LOWER_BOUND, null, msgs);
      if (newLowerBound != null)
        msgs = ((InternalEObject)newLowerBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.REAL_RANGE_SPECIFICATION__LOWER_BOUND, null, msgs);
      msgs = basicSetLowerBound(newLowerBound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.REAL_RANGE_SPECIFICATION__LOWER_BOUND, newLowerBound, newLowerBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleExpression getUpperBound()
  {
    return upperBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpperBound(SimpleExpression newUpperBound, NotificationChain msgs)
  {
    SimpleExpression oldUpperBound = upperBound;
    upperBound = newUpperBound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.REAL_RANGE_SPECIFICATION__UPPER_BOUND, oldUpperBound, newUpperBound);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpperBound(SimpleExpression newUpperBound)
  {
    if (newUpperBound != upperBound)
    {
      NotificationChain msgs = null;
      if (upperBound != null)
        msgs = ((InternalEObject)upperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.REAL_RANGE_SPECIFICATION__UPPER_BOUND, null, msgs);
      if (newUpperBound != null)
        msgs = ((InternalEObject)newUpperBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.REAL_RANGE_SPECIFICATION__UPPER_BOUND, null, msgs);
      msgs = basicSetUpperBound(newUpperBound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.REAL_RANGE_SPECIFICATION__UPPER_BOUND, newUpperBound, newUpperBound));
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
      case AdbPackage.REAL_RANGE_SPECIFICATION__LOWER_BOUND:
        return basicSetLowerBound(null, msgs);
      case AdbPackage.REAL_RANGE_SPECIFICATION__UPPER_BOUND:
        return basicSetUpperBound(null, msgs);
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
      case AdbPackage.REAL_RANGE_SPECIFICATION__LOWER_BOUND:
        return getLowerBound();
      case AdbPackage.REAL_RANGE_SPECIFICATION__UPPER_BOUND:
        return getUpperBound();
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
      case AdbPackage.REAL_RANGE_SPECIFICATION__LOWER_BOUND:
        setLowerBound((SimpleExpression)newValue);
        return;
      case AdbPackage.REAL_RANGE_SPECIFICATION__UPPER_BOUND:
        setUpperBound((SimpleExpression)newValue);
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
      case AdbPackage.REAL_RANGE_SPECIFICATION__LOWER_BOUND:
        setLowerBound((SimpleExpression)null);
        return;
      case AdbPackage.REAL_RANGE_SPECIFICATION__UPPER_BOUND:
        setUpperBound((SimpleExpression)null);
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
      case AdbPackage.REAL_RANGE_SPECIFICATION__LOWER_BOUND:
        return lowerBound != null;
      case AdbPackage.REAL_RANGE_SPECIFICATION__UPPER_BOUND:
        return upperBound != null;
    }
    return super.eIsSet(featureID);
  }

} //RealRangeSpecificationImpl
