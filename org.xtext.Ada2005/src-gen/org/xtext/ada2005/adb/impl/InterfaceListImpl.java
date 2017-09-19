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
import org.xtext.ada2005.adb.InterfaceList;
import org.xtext.ada2005.adb.Name;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.InterfaceListImpl#getInterfaceSubtypeMark <em>Interface Subtype Mark</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceListImpl extends MinimalEObjectImpl.Container implements InterfaceList
{
  /**
   * The cached value of the '{@link #getInterfaceSubtypeMark() <em>Interface Subtype Mark</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceSubtypeMark()
   * @generated
   * @ordered
   */
  protected EList<Name> interfaceSubtypeMark;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterfaceListImpl()
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
    return AdbPackage.eINSTANCE.getInterfaceList();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Name> getInterfaceSubtypeMark()
  {
    if (interfaceSubtypeMark == null)
    {
      interfaceSubtypeMark = new EObjectContainmentEList<Name>(Name.class, this, AdbPackage.INTERFACE_LIST__INTERFACE_SUBTYPE_MARK);
    }
    return interfaceSubtypeMark;
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
      case AdbPackage.INTERFACE_LIST__INTERFACE_SUBTYPE_MARK:
        return ((InternalEList<?>)getInterfaceSubtypeMark()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.INTERFACE_LIST__INTERFACE_SUBTYPE_MARK:
        return getInterfaceSubtypeMark();
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
      case AdbPackage.INTERFACE_LIST__INTERFACE_SUBTYPE_MARK:
        getInterfaceSubtypeMark().clear();
        getInterfaceSubtypeMark().addAll((Collection<? extends Name>)newValue);
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
      case AdbPackage.INTERFACE_LIST__INTERFACE_SUBTYPE_MARK:
        getInterfaceSubtypeMark().clear();
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
      case AdbPackage.INTERFACE_LIST__INTERFACE_SUBTYPE_MARK:
        return interfaceSubtypeMark != null && !interfaceSubtypeMark.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InterfaceListImpl
