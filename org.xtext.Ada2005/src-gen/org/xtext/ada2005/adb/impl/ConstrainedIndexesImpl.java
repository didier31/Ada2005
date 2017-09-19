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
import org.xtext.ada2005.adb.ConstrainedIndexes;
import org.xtext.ada2005.adb.DiscreteSubtypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constrained Indexes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.ConstrainedIndexesImpl#getConstrainedIndex <em>Constrained Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstrainedIndexesImpl extends ArrayIndexesImpl implements ConstrainedIndexes
{
  /**
   * The cached value of the '{@link #getConstrainedIndex() <em>Constrained Index</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstrainedIndex()
   * @generated
   * @ordered
   */
  protected EList<DiscreteSubtypeDefinition> constrainedIndex;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstrainedIndexesImpl()
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
    return AdbPackage.eINSTANCE.getConstrainedIndexes();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DiscreteSubtypeDefinition> getConstrainedIndex()
  {
    if (constrainedIndex == null)
    {
      constrainedIndex = new EObjectContainmentEList<DiscreteSubtypeDefinition>(DiscreteSubtypeDefinition.class, this, AdbPackage.CONSTRAINED_INDEXES__CONSTRAINED_INDEX);
    }
    return constrainedIndex;
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
      case AdbPackage.CONSTRAINED_INDEXES__CONSTRAINED_INDEX:
        return ((InternalEList<?>)getConstrainedIndex()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.CONSTRAINED_INDEXES__CONSTRAINED_INDEX:
        return getConstrainedIndex();
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
      case AdbPackage.CONSTRAINED_INDEXES__CONSTRAINED_INDEX:
        getConstrainedIndex().clear();
        getConstrainedIndex().addAll((Collection<? extends DiscreteSubtypeDefinition>)newValue);
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
      case AdbPackage.CONSTRAINED_INDEXES__CONSTRAINED_INDEX:
        getConstrainedIndex().clear();
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
      case AdbPackage.CONSTRAINED_INDEXES__CONSTRAINED_INDEX:
        return constrainedIndex != null && !constrainedIndex.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConstrainedIndexesImpl
