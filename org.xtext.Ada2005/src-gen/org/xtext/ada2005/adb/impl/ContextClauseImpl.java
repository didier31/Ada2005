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
import org.xtext.ada2005.adb.ContextClause;
import org.xtext.ada2005.adb.ContextItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.ContextClauseImpl#getContextItems <em>Context Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextClauseImpl extends MinimalEObjectImpl.Container implements ContextClause
{
  /**
   * The cached value of the '{@link #getContextItems() <em>Context Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContextItems()
   * @generated
   * @ordered
   */
  protected EList<ContextItem> contextItems;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContextClauseImpl()
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
    return AdbPackage.eINSTANCE.getContextClause();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContextItem> getContextItems()
  {
    if (contextItems == null)
    {
      contextItems = new EObjectContainmentEList<ContextItem>(ContextItem.class, this, AdbPackage.CONTEXT_CLAUSE__CONTEXT_ITEMS);
    }
    return contextItems;
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
      case AdbPackage.CONTEXT_CLAUSE__CONTEXT_ITEMS:
        return ((InternalEList<?>)getContextItems()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.CONTEXT_CLAUSE__CONTEXT_ITEMS:
        return getContextItems();
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
      case AdbPackage.CONTEXT_CLAUSE__CONTEXT_ITEMS:
        getContextItems().clear();
        getContextItems().addAll((Collection<? extends ContextItem>)newValue);
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
      case AdbPackage.CONTEXT_CLAUSE__CONTEXT_ITEMS:
        getContextItems().clear();
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
      case AdbPackage.CONTEXT_CLAUSE__CONTEXT_ITEMS:
        return contextItems != null && !contextItems.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ContextClauseImpl
