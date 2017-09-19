/**
 */
package org.xtext.ada2005.adb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.ComponentItem;
import org.xtext.ada2005.adb.ComponentList;
import org.xtext.ada2005.adb.OptVariantPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.ComponentListImpl#getComponentItems <em>Component Items</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ComponentListImpl#getOptVariantPart <em>Opt Variant Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentListImpl extends MinimalEObjectImpl.Container implements ComponentList
{
  /**
   * The cached value of the '{@link #getComponentItems() <em>Component Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentItems()
   * @generated
   * @ordered
   */
  protected EList<ComponentItem> componentItems;

  /**
   * The cached value of the '{@link #getOptVariantPart() <em>Opt Variant Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptVariantPart()
   * @generated
   * @ordered
   */
  protected OptVariantPart optVariantPart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentListImpl()
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
    return AdbPackage.eINSTANCE.getComponentList();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentItem> getComponentItems()
  {
    if (componentItems == null)
    {
      componentItems = new EObjectContainmentEList<ComponentItem>(ComponentItem.class, this, AdbPackage.COMPONENT_LIST__COMPONENT_ITEMS);
    }
    return componentItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptVariantPart getOptVariantPart()
  {
    return optVariantPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOptVariantPart(OptVariantPart newOptVariantPart, NotificationChain msgs)
  {
    OptVariantPart oldOptVariantPart = optVariantPart;
    optVariantPart = newOptVariantPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.COMPONENT_LIST__OPT_VARIANT_PART, oldOptVariantPart, newOptVariantPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptVariantPart(OptVariantPart newOptVariantPart)
  {
    if (newOptVariantPart != optVariantPart)
    {
      NotificationChain msgs = null;
      if (optVariantPart != null)
        msgs = ((InternalEObject)optVariantPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.COMPONENT_LIST__OPT_VARIANT_PART, null, msgs);
      if (newOptVariantPart != null)
        msgs = ((InternalEObject)newOptVariantPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.COMPONENT_LIST__OPT_VARIANT_PART, null, msgs);
      msgs = basicSetOptVariantPart(newOptVariantPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.COMPONENT_LIST__OPT_VARIANT_PART, newOptVariantPart, newOptVariantPart));
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
      case AdbPackage.COMPONENT_LIST__COMPONENT_ITEMS:
        return ((InternalEList<?>)getComponentItems()).basicRemove(otherEnd, msgs);
      case AdbPackage.COMPONENT_LIST__OPT_VARIANT_PART:
        return basicSetOptVariantPart(null, msgs);
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
      case AdbPackage.COMPONENT_LIST__COMPONENT_ITEMS:
        return getComponentItems();
      case AdbPackage.COMPONENT_LIST__OPT_VARIANT_PART:
        return getOptVariantPart();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AdbPackage.COMPONENT_LIST__COMPONENT_ITEMS:
        getComponentItems().clear();
        getComponentItems().addAll((Collection<? extends ComponentItem>)newValue);
        return;
      case AdbPackage.COMPONENT_LIST__OPT_VARIANT_PART:
        setOptVariantPart((OptVariantPart)newValue);
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
      case AdbPackage.COMPONENT_LIST__COMPONENT_ITEMS:
        getComponentItems().clear();
        return;
      case AdbPackage.COMPONENT_LIST__OPT_VARIANT_PART:
        setOptVariantPart((OptVariantPart)null);
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
      case AdbPackage.COMPONENT_LIST__COMPONENT_ITEMS:
        return componentItems != null && !componentItems.isEmpty();
      case AdbPackage.COMPONENT_LIST__OPT_VARIANT_PART:
        return optVariantPart != null;
    }
    return super.eIsSet(featureID);
  }

} //ComponentListImpl
