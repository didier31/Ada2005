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
import org.xtext.ada2005.adb.GenericActualPart;
import org.xtext.ada2005.adb.GenericAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Actual Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.GenericActualPartImpl#getGenericAssociation <em>Generic Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericActualPartImpl extends MinimalEObjectImpl.Container implements GenericActualPart
{
  /**
   * The cached value of the '{@link #getGenericAssociation() <em>Generic Association</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericAssociation()
   * @generated
   * @ordered
   */
  protected EList<GenericAssociation> genericAssociation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenericActualPartImpl()
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
    return AdbPackage.eINSTANCE.getGenericActualPart();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GenericAssociation> getGenericAssociation()
  {
    if (genericAssociation == null)
    {
      genericAssociation = new EObjectContainmentEList<GenericAssociation>(GenericAssociation.class, this, AdbPackage.GENERIC_ACTUAL_PART__GENERIC_ASSOCIATION);
    }
    return genericAssociation;
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
      case AdbPackage.GENERIC_ACTUAL_PART__GENERIC_ASSOCIATION:
        return ((InternalEList<?>)getGenericAssociation()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.GENERIC_ACTUAL_PART__GENERIC_ASSOCIATION:
        return getGenericAssociation();
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
      case AdbPackage.GENERIC_ACTUAL_PART__GENERIC_ASSOCIATION:
        getGenericAssociation().clear();
        getGenericAssociation().addAll((Collection<? extends GenericAssociation>)newValue);
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
      case AdbPackage.GENERIC_ACTUAL_PART__GENERIC_ASSOCIATION:
        getGenericAssociation().clear();
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
      case AdbPackage.GENERIC_ACTUAL_PART__GENERIC_ASSOCIATION:
        return genericAssociation != null && !genericAssociation.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GenericActualPartImpl
