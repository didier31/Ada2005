/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.Expression;
import org.xtext.ada2005.adb.RealRangeSpecification;
import org.xtext.ada2005.adb.RealTypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Real Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.RealTypeDefinitionImpl#getDigits <em>Digits</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.RealTypeDefinitionImpl#getRealRangeSpecification <em>Real Range Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RealTypeDefinitionImpl extends TypeDefinitionImpl implements RealTypeDefinition
{
  /**
   * The cached value of the '{@link #getDigits() <em>Digits</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDigits()
   * @generated
   * @ordered
   */
  protected Expression digits;

  /**
   * The cached value of the '{@link #getRealRangeSpecification() <em>Real Range Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealRangeSpecification()
   * @generated
   * @ordered
   */
  protected RealRangeSpecification realRangeSpecification;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RealTypeDefinitionImpl()
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
    return AdbPackage.eINSTANCE.getRealTypeDefinition();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getDigits()
  {
    return digits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDigits(Expression newDigits, NotificationChain msgs)
  {
    Expression oldDigits = digits;
    digits = newDigits;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.REAL_TYPE_DEFINITION__DIGITS, oldDigits, newDigits);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDigits(Expression newDigits)
  {
    if (newDigits != digits)
    {
      NotificationChain msgs = null;
      if (digits != null)
        msgs = ((InternalEObject)digits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.REAL_TYPE_DEFINITION__DIGITS, null, msgs);
      if (newDigits != null)
        msgs = ((InternalEObject)newDigits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.REAL_TYPE_DEFINITION__DIGITS, null, msgs);
      msgs = basicSetDigits(newDigits, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.REAL_TYPE_DEFINITION__DIGITS, newDigits, newDigits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealRangeSpecification getRealRangeSpecification()
  {
    return realRangeSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRealRangeSpecification(RealRangeSpecification newRealRangeSpecification, NotificationChain msgs)
  {
    RealRangeSpecification oldRealRangeSpecification = realRangeSpecification;
    realRangeSpecification = newRealRangeSpecification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.REAL_TYPE_DEFINITION__REAL_RANGE_SPECIFICATION, oldRealRangeSpecification, newRealRangeSpecification);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRealRangeSpecification(RealRangeSpecification newRealRangeSpecification)
  {
    if (newRealRangeSpecification != realRangeSpecification)
    {
      NotificationChain msgs = null;
      if (realRangeSpecification != null)
        msgs = ((InternalEObject)realRangeSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.REAL_TYPE_DEFINITION__REAL_RANGE_SPECIFICATION, null, msgs);
      if (newRealRangeSpecification != null)
        msgs = ((InternalEObject)newRealRangeSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.REAL_TYPE_DEFINITION__REAL_RANGE_SPECIFICATION, null, msgs);
      msgs = basicSetRealRangeSpecification(newRealRangeSpecification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.REAL_TYPE_DEFINITION__REAL_RANGE_SPECIFICATION, newRealRangeSpecification, newRealRangeSpecification));
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
      case AdbPackage.REAL_TYPE_DEFINITION__DIGITS:
        return basicSetDigits(null, msgs);
      case AdbPackage.REAL_TYPE_DEFINITION__REAL_RANGE_SPECIFICATION:
        return basicSetRealRangeSpecification(null, msgs);
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
      case AdbPackage.REAL_TYPE_DEFINITION__DIGITS:
        return getDigits();
      case AdbPackage.REAL_TYPE_DEFINITION__REAL_RANGE_SPECIFICATION:
        return getRealRangeSpecification();
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
      case AdbPackage.REAL_TYPE_DEFINITION__DIGITS:
        setDigits((Expression)newValue);
        return;
      case AdbPackage.REAL_TYPE_DEFINITION__REAL_RANGE_SPECIFICATION:
        setRealRangeSpecification((RealRangeSpecification)newValue);
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
      case AdbPackage.REAL_TYPE_DEFINITION__DIGITS:
        setDigits((Expression)null);
        return;
      case AdbPackage.REAL_TYPE_DEFINITION__REAL_RANGE_SPECIFICATION:
        setRealRangeSpecification((RealRangeSpecification)null);
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
      case AdbPackage.REAL_TYPE_DEFINITION__DIGITS:
        return digits != null;
      case AdbPackage.REAL_TYPE_DEFINITION__REAL_RANGE_SPECIFICATION:
        return realRangeSpecification != null;
    }
    return super.eIsSet(featureID);
  }

} //RealTypeDefinitionImpl
