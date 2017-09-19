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
import org.xtext.ada2005.adb.ComponentChoiceList;
import org.xtext.ada2005.adb.RecordComponentAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Component Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.RecordComponentAssociationImpl#getComponentChoiceList <em>Component Choice List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordComponentAssociationImpl extends MinimalEObjectImpl.Container implements RecordComponentAssociation
{
  /**
   * The cached value of the '{@link #getComponentChoiceList() <em>Component Choice List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentChoiceList()
   * @generated
   * @ordered
   */
  protected EList<ComponentChoiceList> componentChoiceList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecordComponentAssociationImpl()
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
    return AdbPackage.eINSTANCE.getRecordComponentAssociation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentChoiceList> getComponentChoiceList()
  {
    if (componentChoiceList == null)
    {
      componentChoiceList = new EObjectContainmentEList<ComponentChoiceList>(ComponentChoiceList.class, this, AdbPackage.RECORD_COMPONENT_ASSOCIATION__COMPONENT_CHOICE_LIST);
    }
    return componentChoiceList;
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
      case AdbPackage.RECORD_COMPONENT_ASSOCIATION__COMPONENT_CHOICE_LIST:
        return ((InternalEList<?>)getComponentChoiceList()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.RECORD_COMPONENT_ASSOCIATION__COMPONENT_CHOICE_LIST:
        return getComponentChoiceList();
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
      case AdbPackage.RECORD_COMPONENT_ASSOCIATION__COMPONENT_CHOICE_LIST:
        getComponentChoiceList().clear();
        getComponentChoiceList().addAll((Collection<? extends ComponentChoiceList>)newValue);
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
      case AdbPackage.RECORD_COMPONENT_ASSOCIATION__COMPONENT_CHOICE_LIST:
        getComponentChoiceList().clear();
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
      case AdbPackage.RECORD_COMPONENT_ASSOCIATION__COMPONENT_CHOICE_LIST:
        return componentChoiceList != null && !componentChoiceList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RecordComponentAssociationImpl
