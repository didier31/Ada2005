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
import org.xtext.ada2005.adb.Name;
import org.xtext.ada2005.adb.RaiseStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Raise Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.RaiseStatementImpl#getExceptionName <em>Exception Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.RaiseStatementImpl#getWithExpression <em>With Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RaiseStatementImpl extends SimpleStatementImpl implements RaiseStatement
{
  /**
   * The cached value of the '{@link #getExceptionName() <em>Exception Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExceptionName()
   * @generated
   * @ordered
   */
  protected Name exceptionName;

  /**
   * The cached value of the '{@link #getWithExpression() <em>With Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWithExpression()
   * @generated
   * @ordered
   */
  protected Expression withExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RaiseStatementImpl()
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
    return AdbPackage.eINSTANCE.getRaiseStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getExceptionName()
  {
    return exceptionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExceptionName(Name newExceptionName, NotificationChain msgs)
  {
    Name oldExceptionName = exceptionName;
    exceptionName = newExceptionName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.RAISE_STATEMENT__EXCEPTION_NAME, oldExceptionName, newExceptionName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExceptionName(Name newExceptionName)
  {
    if (newExceptionName != exceptionName)
    {
      NotificationChain msgs = null;
      if (exceptionName != null)
        msgs = ((InternalEObject)exceptionName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.RAISE_STATEMENT__EXCEPTION_NAME, null, msgs);
      if (newExceptionName != null)
        msgs = ((InternalEObject)newExceptionName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.RAISE_STATEMENT__EXCEPTION_NAME, null, msgs);
      msgs = basicSetExceptionName(newExceptionName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.RAISE_STATEMENT__EXCEPTION_NAME, newExceptionName, newExceptionName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getWithExpression()
  {
    return withExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWithExpression(Expression newWithExpression, NotificationChain msgs)
  {
    Expression oldWithExpression = withExpression;
    withExpression = newWithExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.RAISE_STATEMENT__WITH_EXPRESSION, oldWithExpression, newWithExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWithExpression(Expression newWithExpression)
  {
    if (newWithExpression != withExpression)
    {
      NotificationChain msgs = null;
      if (withExpression != null)
        msgs = ((InternalEObject)withExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.RAISE_STATEMENT__WITH_EXPRESSION, null, msgs);
      if (newWithExpression != null)
        msgs = ((InternalEObject)newWithExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.RAISE_STATEMENT__WITH_EXPRESSION, null, msgs);
      msgs = basicSetWithExpression(newWithExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.RAISE_STATEMENT__WITH_EXPRESSION, newWithExpression, newWithExpression));
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
      case AdbPackage.RAISE_STATEMENT__EXCEPTION_NAME:
        return basicSetExceptionName(null, msgs);
      case AdbPackage.RAISE_STATEMENT__WITH_EXPRESSION:
        return basicSetWithExpression(null, msgs);
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
      case AdbPackage.RAISE_STATEMENT__EXCEPTION_NAME:
        return getExceptionName();
      case AdbPackage.RAISE_STATEMENT__WITH_EXPRESSION:
        return getWithExpression();
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
      case AdbPackage.RAISE_STATEMENT__EXCEPTION_NAME:
        setExceptionName((Name)newValue);
        return;
      case AdbPackage.RAISE_STATEMENT__WITH_EXPRESSION:
        setWithExpression((Expression)newValue);
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
      case AdbPackage.RAISE_STATEMENT__EXCEPTION_NAME:
        setExceptionName((Name)null);
        return;
      case AdbPackage.RAISE_STATEMENT__WITH_EXPRESSION:
        setWithExpression((Expression)null);
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
      case AdbPackage.RAISE_STATEMENT__EXCEPTION_NAME:
        return exceptionName != null;
      case AdbPackage.RAISE_STATEMENT__WITH_EXPRESSION:
        return withExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //RaiseStatementImpl
