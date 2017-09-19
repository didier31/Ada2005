/**
 */
package org.xtext.ada2005.adb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.Factor;
import org.xtext.ada2005.adb.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.TermImpl#getFactors <em>Factors</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.TermImpl#getMultiplyingOperators <em>Multiplying Operators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TermImpl extends MinimalEObjectImpl.Container implements Term
{
  /**
   * The cached value of the '{@link #getFactors() <em>Factors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactors()
   * @generated
   * @ordered
   */
  protected EList<Factor> factors;

  /**
   * The cached value of the '{@link #getMultiplyingOperators() <em>Multiplying Operators</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplyingOperators()
   * @generated
   * @ordered
   */
  protected EList<String> multiplyingOperators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TermImpl()
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
    return AdbPackage.eINSTANCE.getTerm();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Factor> getFactors()
  {
    if (factors == null)
    {
      factors = new EObjectContainmentEList<Factor>(Factor.class, this, AdbPackage.TERM__FACTORS);
    }
    return factors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getMultiplyingOperators()
  {
    if (multiplyingOperators == null)
    {
      multiplyingOperators = new EDataTypeEList<String>(String.class, this, AdbPackage.TERM__MULTIPLYING_OPERATORS);
    }
    return multiplyingOperators;
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
      case AdbPackage.TERM__FACTORS:
        return ((InternalEList<?>)getFactors()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.TERM__FACTORS:
        return getFactors();
      case AdbPackage.TERM__MULTIPLYING_OPERATORS:
        return getMultiplyingOperators();
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
      case AdbPackage.TERM__FACTORS:
        getFactors().clear();
        getFactors().addAll((Collection<? extends Factor>)newValue);
        return;
      case AdbPackage.TERM__MULTIPLYING_OPERATORS:
        getMultiplyingOperators().clear();
        getMultiplyingOperators().addAll((Collection<? extends String>)newValue);
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
      case AdbPackage.TERM__FACTORS:
        getFactors().clear();
        return;
      case AdbPackage.TERM__MULTIPLYING_OPERATORS:
        getMultiplyingOperators().clear();
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
      case AdbPackage.TERM__FACTORS:
        return factors != null && !factors.isEmpty();
      case AdbPackage.TERM__MULTIPLYING_OPERATORS:
        return multiplyingOperators != null && !multiplyingOperators.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (multiplyingOperators: ");
    result.append(multiplyingOperators);
    result.append(')');
    return result.toString();
  }

} //TermImpl
