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
import org.xtext.ada2005.adb.FormalPart;
import org.xtext.ada2005.adb.ParameterSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalPartImpl#getParameterSpecifications <em>Parameter Specifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormalPartImpl extends MinimalEObjectImpl.Container implements FormalPart
{
  /**
   * The cached value of the '{@link #getParameterSpecifications() <em>Parameter Specifications</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterSpecifications()
   * @generated
   * @ordered
   */
  protected EList<ParameterSpecification> parameterSpecifications;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormalPartImpl()
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
    return AdbPackage.eINSTANCE.getFormalPart();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterSpecification> getParameterSpecifications()
  {
    if (parameterSpecifications == null)
    {
      parameterSpecifications = new EObjectContainmentEList<ParameterSpecification>(ParameterSpecification.class, this, AdbPackage.FORMAL_PART__PARAMETER_SPECIFICATIONS);
    }
    return parameterSpecifications;
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
      case AdbPackage.FORMAL_PART__PARAMETER_SPECIFICATIONS:
        return ((InternalEList<?>)getParameterSpecifications()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.FORMAL_PART__PARAMETER_SPECIFICATIONS:
        return getParameterSpecifications();
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
      case AdbPackage.FORMAL_PART__PARAMETER_SPECIFICATIONS:
        getParameterSpecifications().clear();
        getParameterSpecifications().addAll((Collection<? extends ParameterSpecification>)newValue);
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
      case AdbPackage.FORMAL_PART__PARAMETER_SPECIFICATIONS:
        getParameterSpecifications().clear();
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
      case AdbPackage.FORMAL_PART__PARAMETER_SPECIFICATIONS:
        return parameterSpecifications != null && !parameterSpecifications.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FormalPartImpl
