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
import org.xtext.ada2005.adb.ProtectedDefinition;
import org.xtext.ada2005.adb.ProtectedElementDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protected Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.ProtectedDefinitionImpl#getProtectedOperationDeclaration <em>Protected Operation Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtectedDefinitionImpl extends MinimalEObjectImpl.Container implements ProtectedDefinition
{
  /**
   * The cached value of the '{@link #getProtectedOperationDeclaration() <em>Protected Operation Declaration</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtectedOperationDeclaration()
   * @generated
   * @ordered
   */
  protected EList<ProtectedElementDeclaration> protectedOperationDeclaration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProtectedDefinitionImpl()
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
    return AdbPackage.eINSTANCE.getProtectedDefinition();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProtectedElementDeclaration> getProtectedOperationDeclaration()
  {
    if (protectedOperationDeclaration == null)
    {
      protectedOperationDeclaration = new EObjectContainmentEList<ProtectedElementDeclaration>(ProtectedElementDeclaration.class, this, AdbPackage.PROTECTED_DEFINITION__PROTECTED_OPERATION_DECLARATION);
    }
    return protectedOperationDeclaration;
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
      case AdbPackage.PROTECTED_DEFINITION__PROTECTED_OPERATION_DECLARATION:
        return ((InternalEList<?>)getProtectedOperationDeclaration()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.PROTECTED_DEFINITION__PROTECTED_OPERATION_DECLARATION:
        return getProtectedOperationDeclaration();
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
      case AdbPackage.PROTECTED_DEFINITION__PROTECTED_OPERATION_DECLARATION:
        getProtectedOperationDeclaration().clear();
        getProtectedOperationDeclaration().addAll((Collection<? extends ProtectedElementDeclaration>)newValue);
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
      case AdbPackage.PROTECTED_DEFINITION__PROTECTED_OPERATION_DECLARATION:
        getProtectedOperationDeclaration().clear();
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
      case AdbPackage.PROTECTED_DEFINITION__PROTECTED_OPERATION_DECLARATION:
        return protectedOperationDeclaration != null && !protectedOperationDeclaration.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProtectedDefinitionImpl
