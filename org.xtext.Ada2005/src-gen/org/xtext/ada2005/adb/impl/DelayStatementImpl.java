/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.DelayStatement;
import org.xtext.ada2005.adb.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delay Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.DelayStatementImpl#getUntil <em>Until</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.DelayStatementImpl#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DelayStatementImpl extends SimpleStatementImpl implements DelayStatement
{
  /**
   * The default value of the '{@link #getUntil() <em>Until</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUntil()
   * @generated
   * @ordered
   */
  protected static final String UNTIL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUntil() <em>Until</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUntil()
   * @generated
   * @ordered
   */
  protected String until = UNTIL_EDEFAULT;

  /**
   * The cached value of the '{@link #getDelay() <em>Delay</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelay()
   * @generated
   * @ordered
   */
  protected Expression delay;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DelayStatementImpl()
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
    return AdbPackage.eINSTANCE.getDelayStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUntil()
  {
    return until;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUntil(String newUntil)
  {
    String oldUntil = until;
    until = newUntil;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DELAY_STATEMENT__UNTIL, oldUntil, until));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getDelay()
  {
    return delay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDelay(Expression newDelay, NotificationChain msgs)
  {
    Expression oldDelay = delay;
    delay = newDelay;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.DELAY_STATEMENT__DELAY, oldDelay, newDelay);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelay(Expression newDelay)
  {
    if (newDelay != delay)
    {
      NotificationChain msgs = null;
      if (delay != null)
        msgs = ((InternalEObject)delay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DELAY_STATEMENT__DELAY, null, msgs);
      if (newDelay != null)
        msgs = ((InternalEObject)newDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DELAY_STATEMENT__DELAY, null, msgs);
      msgs = basicSetDelay(newDelay, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DELAY_STATEMENT__DELAY, newDelay, newDelay));
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
      case AdbPackage.DELAY_STATEMENT__DELAY:
        return basicSetDelay(null, msgs);
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
      case AdbPackage.DELAY_STATEMENT__UNTIL:
        return getUntil();
      case AdbPackage.DELAY_STATEMENT__DELAY:
        return getDelay();
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
      case AdbPackage.DELAY_STATEMENT__UNTIL:
        setUntil((String)newValue);
        return;
      case AdbPackage.DELAY_STATEMENT__DELAY:
        setDelay((Expression)newValue);
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
      case AdbPackage.DELAY_STATEMENT__UNTIL:
        setUntil(UNTIL_EDEFAULT);
        return;
      case AdbPackage.DELAY_STATEMENT__DELAY:
        setDelay((Expression)null);
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
      case AdbPackage.DELAY_STATEMENT__UNTIL:
        return UNTIL_EDEFAULT == null ? until != null : !UNTIL_EDEFAULT.equals(until);
      case AdbPackage.DELAY_STATEMENT__DELAY:
        return delay != null;
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
    result.append(" (until: ");
    result.append(until);
    result.append(')');
    return result.toString();
  }

} //DelayStatementImpl
