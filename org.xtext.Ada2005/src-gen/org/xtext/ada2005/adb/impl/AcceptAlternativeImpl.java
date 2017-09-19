/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AcceptAlternative;
import org.xtext.ada2005.adb.AcceptStatement;
import org.xtext.ada2005.adb.AdbPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accept Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.AcceptAlternativeImpl#getAcceptStatement <em>Accept Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcceptAlternativeImpl extends SelectAlternativeImpl implements AcceptAlternative
{
  /**
   * The cached value of the '{@link #getAcceptStatement() <em>Accept Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcceptStatement()
   * @generated
   * @ordered
   */
  protected AcceptStatement acceptStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AcceptAlternativeImpl()
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
    return AdbPackage.eINSTANCE.getAcceptAlternative();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AcceptStatement getAcceptStatement()
  {
    return acceptStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAcceptStatement(AcceptStatement newAcceptStatement, NotificationChain msgs)
  {
    AcceptStatement oldAcceptStatement = acceptStatement;
    acceptStatement = newAcceptStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ACCEPT_ALTERNATIVE__ACCEPT_STATEMENT, oldAcceptStatement, newAcceptStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAcceptStatement(AcceptStatement newAcceptStatement)
  {
    if (newAcceptStatement != acceptStatement)
    {
      NotificationChain msgs = null;
      if (acceptStatement != null)
        msgs = ((InternalEObject)acceptStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ACCEPT_ALTERNATIVE__ACCEPT_STATEMENT, null, msgs);
      if (newAcceptStatement != null)
        msgs = ((InternalEObject)newAcceptStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ACCEPT_ALTERNATIVE__ACCEPT_STATEMENT, null, msgs);
      msgs = basicSetAcceptStatement(newAcceptStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ACCEPT_ALTERNATIVE__ACCEPT_STATEMENT, newAcceptStatement, newAcceptStatement));
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
      case AdbPackage.ACCEPT_ALTERNATIVE__ACCEPT_STATEMENT:
        return basicSetAcceptStatement(null, msgs);
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
      case AdbPackage.ACCEPT_ALTERNATIVE__ACCEPT_STATEMENT:
        return getAcceptStatement();
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
      case AdbPackage.ACCEPT_ALTERNATIVE__ACCEPT_STATEMENT:
        setAcceptStatement((AcceptStatement)newValue);
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
      case AdbPackage.ACCEPT_ALTERNATIVE__ACCEPT_STATEMENT:
        setAcceptStatement((AcceptStatement)null);
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
      case AdbPackage.ACCEPT_ALTERNATIVE__ACCEPT_STATEMENT:
        return acceptStatement != null;
    }
    return super.eIsSet(featureID);
  }

} //AcceptAlternativeImpl
