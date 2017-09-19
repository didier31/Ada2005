/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.DelayAlternative;
import org.xtext.ada2005.adb.DelayStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delay Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.DelayAlternativeImpl#getDelayStatement <em>Delay Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DelayAlternativeImpl extends SelectAlternativeImpl implements DelayAlternative
{
  /**
   * The cached value of the '{@link #getDelayStatement() <em>Delay Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelayStatement()
   * @generated
   * @ordered
   */
  protected DelayStatement delayStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DelayAlternativeImpl()
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
    return AdbPackage.eINSTANCE.getDelayAlternative();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DelayStatement getDelayStatement()
  {
    return delayStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDelayStatement(DelayStatement newDelayStatement, NotificationChain msgs)
  {
    DelayStatement oldDelayStatement = delayStatement;
    delayStatement = newDelayStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.DELAY_ALTERNATIVE__DELAY_STATEMENT, oldDelayStatement, newDelayStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelayStatement(DelayStatement newDelayStatement)
  {
    if (newDelayStatement != delayStatement)
    {
      NotificationChain msgs = null;
      if (delayStatement != null)
        msgs = ((InternalEObject)delayStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DELAY_ALTERNATIVE__DELAY_STATEMENT, null, msgs);
      if (newDelayStatement != null)
        msgs = ((InternalEObject)newDelayStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DELAY_ALTERNATIVE__DELAY_STATEMENT, null, msgs);
      msgs = basicSetDelayStatement(newDelayStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DELAY_ALTERNATIVE__DELAY_STATEMENT, newDelayStatement, newDelayStatement));
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
      case AdbPackage.DELAY_ALTERNATIVE__DELAY_STATEMENT:
        return basicSetDelayStatement(null, msgs);
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
      case AdbPackage.DELAY_ALTERNATIVE__DELAY_STATEMENT:
        return getDelayStatement();
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
      case AdbPackage.DELAY_ALTERNATIVE__DELAY_STATEMENT:
        setDelayStatement((DelayStatement)newValue);
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
      case AdbPackage.DELAY_ALTERNATIVE__DELAY_STATEMENT:
        setDelayStatement((DelayStatement)null);
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
      case AdbPackage.DELAY_ALTERNATIVE__DELAY_STATEMENT:
        return delayStatement != null;
    }
    return super.eIsSet(featureID);
  }

} //DelayAlternativeImpl
