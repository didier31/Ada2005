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
import org.xtext.ada2005.adb.DiscreteChoice;
import org.xtext.ada2005.adb.DiscreteChoiceList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Choice List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.DiscreteChoiceListImpl#getDiscreteChoiceList <em>Discrete Choice List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscreteChoiceListImpl extends MinimalEObjectImpl.Container implements DiscreteChoiceList
{
  /**
   * The cached value of the '{@link #getDiscreteChoiceList() <em>Discrete Choice List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscreteChoiceList()
   * @generated
   * @ordered
   */
  protected EList<DiscreteChoice> discreteChoiceList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DiscreteChoiceListImpl()
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
    return AdbPackage.eINSTANCE.getDiscreteChoiceList();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DiscreteChoice> getDiscreteChoiceList()
  {
    if (discreteChoiceList == null)
    {
      discreteChoiceList = new EObjectContainmentEList<DiscreteChoice>(DiscreteChoice.class, this, AdbPackage.DISCRETE_CHOICE_LIST__DISCRETE_CHOICE_LIST);
    }
    return discreteChoiceList;
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
      case AdbPackage.DISCRETE_CHOICE_LIST__DISCRETE_CHOICE_LIST:
        return ((InternalEList<?>)getDiscreteChoiceList()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.DISCRETE_CHOICE_LIST__DISCRETE_CHOICE_LIST:
        return getDiscreteChoiceList();
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
      case AdbPackage.DISCRETE_CHOICE_LIST__DISCRETE_CHOICE_LIST:
        getDiscreteChoiceList().clear();
        getDiscreteChoiceList().addAll((Collection<? extends DiscreteChoice>)newValue);
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
      case AdbPackage.DISCRETE_CHOICE_LIST__DISCRETE_CHOICE_LIST:
        getDiscreteChoiceList().clear();
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
      case AdbPackage.DISCRETE_CHOICE_LIST__DISCRETE_CHOICE_LIST:
        return discreteChoiceList != null && !discreteChoiceList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DiscreteChoiceListImpl
