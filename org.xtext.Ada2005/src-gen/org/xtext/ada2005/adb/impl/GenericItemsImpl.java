/**
 */
package org.xtext.ada2005.adb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.GenericItem;
import org.xtext.ada2005.adb.GenericItems;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.GenericItemsImpl#getGenericItems <em>Generic Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericItemsImpl extends MinimalEObjectImpl.Container implements GenericItems
{
  /**
   * The cached value of the '{@link #getGenericItems() <em>Generic Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericItems()
   * @generated
   * @ordered
   */
  protected EList<GenericItem> genericItems;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenericItemsImpl()
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
    return AdbPackage.eINSTANCE.getGenericItems();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GenericItem> getGenericItems()
  {
    if (genericItems == null)
    {
      genericItems = new EObjectContainmentEList<GenericItem>(GenericItem.class, this, AdbPackage.GENERIC_ITEMS__GENERIC_ITEMS);
    }
    return genericItems;
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
      case AdbPackage.GENERIC_ITEMS__GENERIC_ITEMS:
        return ((InternalEList<?>)getGenericItems()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.GENERIC_ITEMS__GENERIC_ITEMS:
        return getGenericItems();
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
      case AdbPackage.GENERIC_ITEMS__GENERIC_ITEMS:
        getGenericItems().clear();
        getGenericItems().addAll((Collection<? extends GenericItem>)newValue);
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
      case AdbPackage.GENERIC_ITEMS__GENERIC_ITEMS:
        getGenericItems().clear();
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
      case AdbPackage.GENERIC_ITEMS__GENERIC_ITEMS:
        return genericItems != null && !genericItems.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GenericItemsImpl
