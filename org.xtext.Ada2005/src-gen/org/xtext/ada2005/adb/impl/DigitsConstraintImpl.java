/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.DigitsConstraint;
import org.xtext.ada2005.adb.RangeConstraint;
import org.xtext.ada2005.adb.SimpleExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Digits Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.DigitsConstraintImpl#getDigits <em>Digits</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.DigitsConstraintImpl#getRangeConstraint <em>Range Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DigitsConstraintImpl extends ScalarConstraintImpl implements DigitsConstraint
{
  /**
   * The cached value of the '{@link #getDigits() <em>Digits</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDigits()
   * @generated
   * @ordered
   */
  protected SimpleExpression digits;

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
  protected DigitsConstraintImpl()
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
    return AdbPackage.eINSTANCE.getDigitsConstraint();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleExpression getDigits()
  {
    return digits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDigits(SimpleExpression newDigits, NotificationChain msgs)
  {
    SimpleExpression oldDigits = digits;
    digits = newDigits;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.DIGITS_CONSTRAINT__DIGITS, oldDigits, newDigits);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDigits(SimpleExpression newDigits)
  {
    if (newDigits != digits)
    {
      NotificationChain msgs = null;
      if (digits != null)
        msgs = ((InternalEObject)digits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DIGITS_CONSTRAINT__DIGITS, null, msgs);
      if (newDigits != null)
        msgs = ((InternalEObject)newDigits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DIGITS_CONSTRAINT__DIGITS, null, msgs);
      msgs = basicSetDigits(newDigits, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DIGITS_CONSTRAINT__DIGITS, newDigits, newDigits));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.DIGITS_CONSTRAINT__RANGE_CONSTRAINT, oldRangeConstraint, newRangeConstraint);
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
        msgs = ((InternalEObject)rangeConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DIGITS_CONSTRAINT__RANGE_CONSTRAINT, null, msgs);
      if (newRangeConstraint != null)
        msgs = ((InternalEObject)newRangeConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DIGITS_CONSTRAINT__RANGE_CONSTRAINT, null, msgs);
      msgs = basicSetRangeConstraint(newRangeConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DIGITS_CONSTRAINT__RANGE_CONSTRAINT, newRangeConstraint, newRangeConstraint));
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
      case AdbPackage.DIGITS_CONSTRAINT__DIGITS:
        return basicSetDigits(null, msgs);
      case AdbPackage.DIGITS_CONSTRAINT__RANGE_CONSTRAINT:
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
      case AdbPackage.DIGITS_CONSTRAINT__DIGITS:
        return getDigits();
      case AdbPackage.DIGITS_CONSTRAINT__RANGE_CONSTRAINT:
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
      case AdbPackage.DIGITS_CONSTRAINT__DIGITS:
        setDigits((SimpleExpression)newValue);
        return;
      case AdbPackage.DIGITS_CONSTRAINT__RANGE_CONSTRAINT:
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
      case AdbPackage.DIGITS_CONSTRAINT__DIGITS:
        setDigits((SimpleExpression)null);
        return;
      case AdbPackage.DIGITS_CONSTRAINT__RANGE_CONSTRAINT:
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
      case AdbPackage.DIGITS_CONSTRAINT__DIGITS:
        return digits != null;
      case AdbPackage.DIGITS_CONSTRAINT__RANGE_CONSTRAINT:
        return rangeConstraint != null;
    }
    return super.eIsSet(featureID);
  }

} //DigitsConstraintImpl
