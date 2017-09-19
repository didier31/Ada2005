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
import org.xtext.ada2005.adb.DiscreteRange;
import org.xtext.ada2005.adb.IndexConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.IndexConstraintImpl#getDiscreteRange <em>Discrete Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndexConstraintImpl extends CompositeConstraintImpl implements IndexConstraint
{
  /**
   * The cached value of the '{@link #getDiscreteRange() <em>Discrete Range</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscreteRange()
   * @generated
   * @ordered
   */
  protected EList<DiscreteRange> discreteRange;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IndexConstraintImpl()
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
    return AdbPackage.eINSTANCE.getIndexConstraint();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DiscreteRange> getDiscreteRange()
  {
    if (discreteRange == null)
    {
      discreteRange = new EObjectContainmentEList<DiscreteRange>(DiscreteRange.class, this, AdbPackage.INDEX_CONSTRAINT__DISCRETE_RANGE);
    }
    return discreteRange;
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
      case AdbPackage.INDEX_CONSTRAINT__DISCRETE_RANGE:
        return ((InternalEList<?>)getDiscreteRange()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.INDEX_CONSTRAINT__DISCRETE_RANGE:
        return getDiscreteRange();
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
      case AdbPackage.INDEX_CONSTRAINT__DISCRETE_RANGE:
        getDiscreteRange().clear();
        getDiscreteRange().addAll((Collection<? extends DiscreteRange>)newValue);
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
      case AdbPackage.INDEX_CONSTRAINT__DISCRETE_RANGE:
        getDiscreteRange().clear();
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
      case AdbPackage.INDEX_CONSTRAINT__DISCRETE_RANGE:
        return discreteRange != null && !discreteRange.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IndexConstraintImpl
