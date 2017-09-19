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
import org.xtext.ada2005.adb.ComponentList;
import org.xtext.ada2005.adb.DiscreteChoiceList;
import org.xtext.ada2005.adb.Variant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.VariantImpl#getDiscreteChoiceList <em>Discrete Choice List</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.VariantImpl#getComponentList <em>Component List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariantImpl extends MinimalEObjectImpl.Container implements Variant
{
  /**
   * The cached value of the '{@link #getDiscreteChoiceList() <em>Discrete Choice List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscreteChoiceList()
   * @generated
   * @ordered
   */
  protected DiscreteChoiceList discreteChoiceList;

  /**
   * The cached value of the '{@link #getComponentList() <em>Component List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentList()
   * @generated
   * @ordered
   */
  protected ComponentList componentList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariantImpl()
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
    return AdbPackage.eINSTANCE.getVariant();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiscreteChoiceList getDiscreteChoiceList()
  {
    return discreteChoiceList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDiscreteChoiceList(DiscreteChoiceList newDiscreteChoiceList, NotificationChain msgs)
  {
    DiscreteChoiceList oldDiscreteChoiceList = discreteChoiceList;
    discreteChoiceList = newDiscreteChoiceList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.VARIANT__DISCRETE_CHOICE_LIST, oldDiscreteChoiceList, newDiscreteChoiceList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiscreteChoiceList(DiscreteChoiceList newDiscreteChoiceList)
  {
    if (newDiscreteChoiceList != discreteChoiceList)
    {
      NotificationChain msgs = null;
      if (discreteChoiceList != null)
        msgs = ((InternalEObject)discreteChoiceList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.VARIANT__DISCRETE_CHOICE_LIST, null, msgs);
      if (newDiscreteChoiceList != null)
        msgs = ((InternalEObject)newDiscreteChoiceList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.VARIANT__DISCRETE_CHOICE_LIST, null, msgs);
      msgs = basicSetDiscreteChoiceList(newDiscreteChoiceList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.VARIANT__DISCRETE_CHOICE_LIST, newDiscreteChoiceList, newDiscreteChoiceList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentList getComponentList()
  {
    return componentList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComponentList(ComponentList newComponentList, NotificationChain msgs)
  {
    ComponentList oldComponentList = componentList;
    componentList = newComponentList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.VARIANT__COMPONENT_LIST, oldComponentList, newComponentList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponentList(ComponentList newComponentList)
  {
    if (newComponentList != componentList)
    {
      NotificationChain msgs = null;
      if (componentList != null)
        msgs = ((InternalEObject)componentList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.VARIANT__COMPONENT_LIST, null, msgs);
      if (newComponentList != null)
        msgs = ((InternalEObject)newComponentList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.VARIANT__COMPONENT_LIST, null, msgs);
      msgs = basicSetComponentList(newComponentList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.VARIANT__COMPONENT_LIST, newComponentList, newComponentList));
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
      case AdbPackage.VARIANT__DISCRETE_CHOICE_LIST:
        return basicSetDiscreteChoiceList(null, msgs);
      case AdbPackage.VARIANT__COMPONENT_LIST:
        return basicSetComponentList(null, msgs);
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
      case AdbPackage.VARIANT__DISCRETE_CHOICE_LIST:
        return getDiscreteChoiceList();
      case AdbPackage.VARIANT__COMPONENT_LIST:
        return getComponentList();
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
      case AdbPackage.VARIANT__DISCRETE_CHOICE_LIST:
        setDiscreteChoiceList((DiscreteChoiceList)newValue);
        return;
      case AdbPackage.VARIANT__COMPONENT_LIST:
        setComponentList((ComponentList)newValue);
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
      case AdbPackage.VARIANT__DISCRETE_CHOICE_LIST:
        setDiscreteChoiceList((DiscreteChoiceList)null);
        return;
      case AdbPackage.VARIANT__COMPONENT_LIST:
        setComponentList((ComponentList)null);
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
      case AdbPackage.VARIANT__DISCRETE_CHOICE_LIST:
        return discreteChoiceList != null;
      case AdbPackage.VARIANT__COMPONENT_LIST:
        return componentList != null;
    }
    return super.eIsSet(featureID);
  }

} //VariantImpl
