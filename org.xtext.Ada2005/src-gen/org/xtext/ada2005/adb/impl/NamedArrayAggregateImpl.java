/**
 */
package org.xtext.ada2005.adb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.ArrayComponentAssociation;
import org.xtext.ada2005.adb.NamedArrayAggregate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Array Aggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.NamedArrayAggregateImpl#getArrayComponentAssociation <em>Array Component Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedArrayAggregateImpl extends ArrayAggregateImpl implements NamedArrayAggregate
{
  /**
   * The cached value of the '{@link #getArrayComponentAssociation() <em>Array Component Association</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayComponentAssociation()
   * @generated
   * @ordered
   */
  protected EList<ArrayComponentAssociation> arrayComponentAssociation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamedArrayAggregateImpl()
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
    return AdbPackage.eINSTANCE.getNamedArrayAggregate();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArrayComponentAssociation> getArrayComponentAssociation()
  {
    if (arrayComponentAssociation == null)
    {
      arrayComponentAssociation = new EObjectContainmentEList<ArrayComponentAssociation>(ArrayComponentAssociation.class, this, AdbPackage.NAMED_ARRAY_AGGREGATE__ARRAY_COMPONENT_ASSOCIATION);
    }
    return arrayComponentAssociation;
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
      case AdbPackage.NAMED_ARRAY_AGGREGATE__ARRAY_COMPONENT_ASSOCIATION:
        return ((InternalEList<?>)getArrayComponentAssociation()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.NAMED_ARRAY_AGGREGATE__ARRAY_COMPONENT_ASSOCIATION:
        return getArrayComponentAssociation();
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
      case AdbPackage.NAMED_ARRAY_AGGREGATE__ARRAY_COMPONENT_ASSOCIATION:
        getArrayComponentAssociation().clear();
        getArrayComponentAssociation().addAll((Collection<? extends ArrayComponentAssociation>)newValue);
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
      case AdbPackage.NAMED_ARRAY_AGGREGATE__ARRAY_COMPONENT_ASSOCIATION:
        getArrayComponentAssociation().clear();
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
      case AdbPackage.NAMED_ARRAY_AGGREGATE__ARRAY_COMPONENT_ASSOCIATION:
        return arrayComponentAssociation != null && !arrayComponentAssociation.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NamedArrayAggregateImpl
