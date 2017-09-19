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
import org.xtext.ada2005.adb.ModularTypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modular Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.ModularTypeDefinitionImpl#getStaticExpression <em>Static Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModularTypeDefinitionImpl extends IntegerTypeDefinitionImpl implements ModularTypeDefinition
{
  /**
   * The cached value of the '{@link #getStaticExpression() <em>Static Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStaticExpression()
   * @generated
   * @ordered
   */
  protected Expression staticExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModularTypeDefinitionImpl()
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
    return AdbPackage.eINSTANCE.getModularTypeDefinition();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getStaticExpression()
  {
    return staticExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStaticExpression(Expression newStaticExpression, NotificationChain msgs)
  {
    Expression oldStaticExpression = staticExpression;
    staticExpression = newStaticExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.MODULAR_TYPE_DEFINITION__STATIC_EXPRESSION, oldStaticExpression, newStaticExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStaticExpression(Expression newStaticExpression)
  {
    if (newStaticExpression != staticExpression)
    {
      NotificationChain msgs = null;
      if (staticExpression != null)
        msgs = ((InternalEObject)staticExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.MODULAR_TYPE_DEFINITION__STATIC_EXPRESSION, null, msgs);
      if (newStaticExpression != null)
        msgs = ((InternalEObject)newStaticExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.MODULAR_TYPE_DEFINITION__STATIC_EXPRESSION, null, msgs);
      msgs = basicSetStaticExpression(newStaticExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.MODULAR_TYPE_DEFINITION__STATIC_EXPRESSION, newStaticExpression, newStaticExpression));
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
      case AdbPackage.MODULAR_TYPE_DEFINITION__STATIC_EXPRESSION:
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
      case AdbPackage.MODULAR_TYPE_DEFINITION__STATIC_EXPRESSION:
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
      case AdbPackage.MODULAR_TYPE_DEFINITION__STATIC_EXPRESSION:
        setStaticExpression((Expression)newValue);
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
      case AdbPackage.MODULAR_TYPE_DEFINITION__STATIC_EXPRESSION:
        setStaticExpression((Expression)null);
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
      case AdbPackage.MODULAR_TYPE_DEFINITION__STATIC_EXPRESSION:
        return staticExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //ModularTypeDefinitionImpl
