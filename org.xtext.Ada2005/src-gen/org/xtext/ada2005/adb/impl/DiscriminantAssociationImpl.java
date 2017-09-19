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
import org.xtext.ada2005.adb.DiscriminantAssociation;
import org.xtext.ada2005.adb.DiscriminantSelectors;
import org.xtext.ada2005.adb.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discriminant Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.DiscriminantAssociationImpl#getDiscriminantSelectors <em>Discriminant Selectors</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.DiscriminantAssociationImpl#getActualParameter <em>Actual Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscriminantAssociationImpl extends MinimalEObjectImpl.Container implements DiscriminantAssociation
{
  /**
   * The cached value of the '{@link #getDiscriminantSelectors() <em>Discriminant Selectors</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscriminantSelectors()
   * @generated
   * @ordered
   */
  protected DiscriminantSelectors discriminantSelectors;

  /**
   * The cached value of the '{@link #getActualParameter() <em>Actual Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActualParameter()
   * @generated
   * @ordered
   */
  protected Expression actualParameter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DiscriminantAssociationImpl()
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
    return AdbPackage.eINSTANCE.getDiscriminantAssociation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiscriminantSelectors getDiscriminantSelectors()
  {
    return discriminantSelectors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDiscriminantSelectors(DiscriminantSelectors newDiscriminantSelectors, NotificationChain msgs)
  {
    DiscriminantSelectors oldDiscriminantSelectors = discriminantSelectors;
    discriminantSelectors = newDiscriminantSelectors;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.DISCRIMINANT_ASSOCIATION__DISCRIMINANT_SELECTORS, oldDiscriminantSelectors, newDiscriminantSelectors);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiscriminantSelectors(DiscriminantSelectors newDiscriminantSelectors)
  {
    if (newDiscriminantSelectors != discriminantSelectors)
    {
      NotificationChain msgs = null;
      if (discriminantSelectors != null)
        msgs = ((InternalEObject)discriminantSelectors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DISCRIMINANT_ASSOCIATION__DISCRIMINANT_SELECTORS, null, msgs);
      if (newDiscriminantSelectors != null)
        msgs = ((InternalEObject)newDiscriminantSelectors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DISCRIMINANT_ASSOCIATION__DISCRIMINANT_SELECTORS, null, msgs);
      msgs = basicSetDiscriminantSelectors(newDiscriminantSelectors, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DISCRIMINANT_ASSOCIATION__DISCRIMINANT_SELECTORS, newDiscriminantSelectors, newDiscriminantSelectors));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getActualParameter()
  {
    return actualParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActualParameter(Expression newActualParameter, NotificationChain msgs)
  {
    Expression oldActualParameter = actualParameter;
    actualParameter = newActualParameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.DISCRIMINANT_ASSOCIATION__ACTUAL_PARAMETER, oldActualParameter, newActualParameter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActualParameter(Expression newActualParameter)
  {
    if (newActualParameter != actualParameter)
    {
      NotificationChain msgs = null;
      if (actualParameter != null)
        msgs = ((InternalEObject)actualParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DISCRIMINANT_ASSOCIATION__ACTUAL_PARAMETER, null, msgs);
      if (newActualParameter != null)
        msgs = ((InternalEObject)newActualParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DISCRIMINANT_ASSOCIATION__ACTUAL_PARAMETER, null, msgs);
      msgs = basicSetActualParameter(newActualParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DISCRIMINANT_ASSOCIATION__ACTUAL_PARAMETER, newActualParameter, newActualParameter));
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
      case AdbPackage.DISCRIMINANT_ASSOCIATION__DISCRIMINANT_SELECTORS:
        return basicSetDiscriminantSelectors(null, msgs);
      case AdbPackage.DISCRIMINANT_ASSOCIATION__ACTUAL_PARAMETER:
        return basicSetActualParameter(null, msgs);
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
      case AdbPackage.DISCRIMINANT_ASSOCIATION__DISCRIMINANT_SELECTORS:
        return getDiscriminantSelectors();
      case AdbPackage.DISCRIMINANT_ASSOCIATION__ACTUAL_PARAMETER:
        return getActualParameter();
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
      case AdbPackage.DISCRIMINANT_ASSOCIATION__DISCRIMINANT_SELECTORS:
        setDiscriminantSelectors((DiscriminantSelectors)newValue);
        return;
      case AdbPackage.DISCRIMINANT_ASSOCIATION__ACTUAL_PARAMETER:
        setActualParameter((Expression)newValue);
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
      case AdbPackage.DISCRIMINANT_ASSOCIATION__DISCRIMINANT_SELECTORS:
        setDiscriminantSelectors((DiscriminantSelectors)null);
        return;
      case AdbPackage.DISCRIMINANT_ASSOCIATION__ACTUAL_PARAMETER:
        setActualParameter((Expression)null);
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
      case AdbPackage.DISCRIMINANT_ASSOCIATION__DISCRIMINANT_SELECTORS:
        return discriminantSelectors != null;
      case AdbPackage.DISCRIMINANT_ASSOCIATION__ACTUAL_PARAMETER:
        return actualParameter != null;
    }
    return super.eIsSet(featureID);
  }

} //DiscriminantAssociationImpl
