/**
 */
package org.xtext.ada2005.adb.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.DiscriminantSelectors;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discriminant Selectors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.DiscriminantSelectorsImpl#getDiscriminantSelectorName <em>Discriminant Selector Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscriminantSelectorsImpl extends MinimalEObjectImpl.Container implements DiscriminantSelectors
{
  /**
   * The cached value of the '{@link #getDiscriminantSelectorName() <em>Discriminant Selector Name</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscriminantSelectorName()
   * @generated
   * @ordered
   */
  protected EList<String> discriminantSelectorName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DiscriminantSelectorsImpl()
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
    return AdbPackage.eINSTANCE.getDiscriminantSelectors();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDiscriminantSelectorName()
  {
    if (discriminantSelectorName == null)
    {
      discriminantSelectorName = new EDataTypeEList<String>(String.class, this, AdbPackage.DISCRIMINANT_SELECTORS__DISCRIMINANT_SELECTOR_NAME);
    }
    return discriminantSelectorName;
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
      case AdbPackage.DISCRIMINANT_SELECTORS__DISCRIMINANT_SELECTOR_NAME:
        return getDiscriminantSelectorName();
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
      case AdbPackage.DISCRIMINANT_SELECTORS__DISCRIMINANT_SELECTOR_NAME:
        getDiscriminantSelectorName().clear();
        getDiscriminantSelectorName().addAll((Collection<? extends String>)newValue);
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
      case AdbPackage.DISCRIMINANT_SELECTORS__DISCRIMINANT_SELECTOR_NAME:
        getDiscriminantSelectorName().clear();
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
      case AdbPackage.DISCRIMINANT_SELECTORS__DISCRIMINANT_SELECTOR_NAME:
        return discriminantSelectorName != null && !discriminantSelectorName.isEmpty();
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
    result.append(" (discriminantSelectorName: ");
    result.append(discriminantSelectorName);
    result.append(')');
    return result.toString();
  }

} //DiscriminantSelectorsImpl
