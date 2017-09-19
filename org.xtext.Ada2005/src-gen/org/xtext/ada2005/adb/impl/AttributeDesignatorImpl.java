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
import org.xtext.ada2005.adb.AttributeDesignator;
import org.xtext.ada2005.adb.ParenthesizedExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Designator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.AttributeDesignatorImpl#getStaticExpression <em>Static Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeDesignatorImpl extends MinimalEObjectImpl.Container implements AttributeDesignator
{
  /**
   * The cached value of the '{@link #getStaticExpression() <em>Static Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStaticExpression()
   * @generated
   * @ordered
   */
  protected ParenthesizedExpression staticExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeDesignatorImpl()
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
    return AdbPackage.eINSTANCE.getAttributeDesignator();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParenthesizedExpression getStaticExpression()
  {
    return staticExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStaticExpression(ParenthesizedExpression newStaticExpression, NotificationChain msgs)
  {
    ParenthesizedExpression oldStaticExpression = staticExpression;
    staticExpression = newStaticExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ATTRIBUTE_DESIGNATOR__STATIC_EXPRESSION, oldStaticExpression, newStaticExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStaticExpression(ParenthesizedExpression newStaticExpression)
  {
    if (newStaticExpression != staticExpression)
    {
      NotificationChain msgs = null;
      if (staticExpression != null)
        msgs = ((InternalEObject)staticExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ATTRIBUTE_DESIGNATOR__STATIC_EXPRESSION, null, msgs);
      if (newStaticExpression != null)
        msgs = ((InternalEObject)newStaticExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ATTRIBUTE_DESIGNATOR__STATIC_EXPRESSION, null, msgs);
      msgs = basicSetStaticExpression(newStaticExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ATTRIBUTE_DESIGNATOR__STATIC_EXPRESSION, newStaticExpression, newStaticExpression));
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
      case AdbPackage.ATTRIBUTE_DESIGNATOR__STATIC_EXPRESSION:
        return basicSetStaticExpression(null, msgs);
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
      case AdbPackage.ATTRIBUTE_DESIGNATOR__STATIC_EXPRESSION:
        return getStaticExpression();
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
      case AdbPackage.ATTRIBUTE_DESIGNATOR__STATIC_EXPRESSION:
        setStaticExpression((ParenthesizedExpression)newValue);
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
      case AdbPackage.ATTRIBUTE_DESIGNATOR__STATIC_EXPRESSION:
        setStaticExpression((ParenthesizedExpression)null);
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
      case AdbPackage.ATTRIBUTE_DESIGNATOR__STATIC_EXPRESSION:
        return staticExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //AttributeDesignatorImpl
