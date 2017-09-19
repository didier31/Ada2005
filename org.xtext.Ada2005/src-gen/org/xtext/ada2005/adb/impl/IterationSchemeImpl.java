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
import org.xtext.ada2005.adb.Expression;
import org.xtext.ada2005.adb.IterationScheme;
import org.xtext.ada2005.adb.LoopParameterSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iteration Scheme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.IterationSchemeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.IterationSchemeImpl#getIterationSpecification <em>Iteration Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IterationSchemeImpl extends MinimalEObjectImpl.Container implements IterationScheme
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Expression condition;

  /**
   * The cached value of the '{@link #getIterationSpecification() <em>Iteration Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIterationSpecification()
   * @generated
   * @ordered
   */
  protected LoopParameterSpecification iterationSpecification;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IterationSchemeImpl()
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
    return AdbPackage.eINSTANCE.getIterationScheme();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs)
  {
    Expression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ITERATION_SCHEME__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(Expression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ITERATION_SCHEME__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ITERATION_SCHEME__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ITERATION_SCHEME__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopParameterSpecification getIterationSpecification()
  {
    return iterationSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIterationSpecification(LoopParameterSpecification newIterationSpecification, NotificationChain msgs)
  {
    LoopParameterSpecification oldIterationSpecification = iterationSpecification;
    iterationSpecification = newIterationSpecification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ITERATION_SCHEME__ITERATION_SPECIFICATION, oldIterationSpecification, newIterationSpecification);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIterationSpecification(LoopParameterSpecification newIterationSpecification)
  {
    if (newIterationSpecification != iterationSpecification)
    {
      NotificationChain msgs = null;
      if (iterationSpecification != null)
        msgs = ((InternalEObject)iterationSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ITERATION_SCHEME__ITERATION_SPECIFICATION, null, msgs);
      if (newIterationSpecification != null)
        msgs = ((InternalEObject)newIterationSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ITERATION_SCHEME__ITERATION_SPECIFICATION, null, msgs);
      msgs = basicSetIterationSpecification(newIterationSpecification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ITERATION_SCHEME__ITERATION_SPECIFICATION, newIterationSpecification, newIterationSpecification));
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
      case AdbPackage.ITERATION_SCHEME__CONDITION:
        return basicSetCondition(null, msgs);
      case AdbPackage.ITERATION_SCHEME__ITERATION_SPECIFICATION:
        return basicSetIterationSpecification(null, msgs);
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
      case AdbPackage.ITERATION_SCHEME__CONDITION:
        return getCondition();
      case AdbPackage.ITERATION_SCHEME__ITERATION_SPECIFICATION:
        return getIterationSpecification();
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
      case AdbPackage.ITERATION_SCHEME__CONDITION:
        setCondition((Expression)newValue);
        return;
      case AdbPackage.ITERATION_SCHEME__ITERATION_SPECIFICATION:
        setIterationSpecification((LoopParameterSpecification)newValue);
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
      case AdbPackage.ITERATION_SCHEME__CONDITION:
        setCondition((Expression)null);
        return;
      case AdbPackage.ITERATION_SCHEME__ITERATION_SPECIFICATION:
        setIterationSpecification((LoopParameterSpecification)null);
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
      case AdbPackage.ITERATION_SCHEME__CONDITION:
        return condition != null;
      case AdbPackage.ITERATION_SCHEME__ITERATION_SPECIFICATION:
        return iterationSpecification != null;
    }
    return super.eIsSet(featureID);
  }

} //IterationSchemeImpl
