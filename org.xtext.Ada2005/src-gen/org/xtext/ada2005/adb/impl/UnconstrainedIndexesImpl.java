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
import org.xtext.ada2005.adb.Name;
import org.xtext.ada2005.adb.UnconstrainedIndexes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unconstrained Indexes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.UnconstrainedIndexesImpl#getSubtypeMark <em>Subtype Mark</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnconstrainedIndexesImpl extends ArrayIndexesImpl implements UnconstrainedIndexes
{
  /**
   * The cached value of the '{@link #getSubtypeMark() <em>Subtype Mark</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtypeMark()
   * @generated
   * @ordered
   */
  protected EList<Name> subtypeMark;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnconstrainedIndexesImpl()
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
    return AdbPackage.eINSTANCE.getUnconstrainedIndexes();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Name> getSubtypeMark()
  {
    if (subtypeMark == null)
    {
      subtypeMark = new EObjectContainmentEList<Name>(Name.class, this, AdbPackage.UNCONSTRAINED_INDEXES__SUBTYPE_MARK);
    }
    return subtypeMark;
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
      case AdbPackage.UNCONSTRAINED_INDEXES__SUBTYPE_MARK:
        return ((InternalEList<?>)getSubtypeMark()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.UNCONSTRAINED_INDEXES__SUBTYPE_MARK:
        return getSubtypeMark();
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
      case AdbPackage.UNCONSTRAINED_INDEXES__SUBTYPE_MARK:
        getSubtypeMark().clear();
        getSubtypeMark().addAll((Collection<? extends Name>)newValue);
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
      case AdbPackage.UNCONSTRAINED_INDEXES__SUBTYPE_MARK:
        getSubtypeMark().clear();
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
      case AdbPackage.UNCONSTRAINED_INDEXES__SUBTYPE_MARK:
        return subtypeMark != null && !subtypeMark.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UnconstrainedIndexesImpl
