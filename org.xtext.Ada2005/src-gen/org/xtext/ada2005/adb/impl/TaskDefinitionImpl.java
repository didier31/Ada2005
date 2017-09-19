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
import org.xtext.ada2005.adb.TaskDefinition;
import org.xtext.ada2005.adb.TaskItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.TaskDefinitionImpl#getTaskItems <em>Task Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskDefinitionImpl extends MinimalEObjectImpl.Container implements TaskDefinition
{
  /**
   * The cached value of the '{@link #getTaskItems() <em>Task Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskItems()
   * @generated
   * @ordered
   */
  protected EList<TaskItem> taskItems;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskDefinitionImpl()
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
    return AdbPackage.eINSTANCE.getTaskDefinition();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TaskItem> getTaskItems()
  {
    if (taskItems == null)
    {
      taskItems = new EObjectContainmentEList<TaskItem>(TaskItem.class, this, AdbPackage.TASK_DEFINITION__TASK_ITEMS);
    }
    return taskItems;
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
      case AdbPackage.TASK_DEFINITION__TASK_ITEMS:
        return ((InternalEList<?>)getTaskItems()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.TASK_DEFINITION__TASK_ITEMS:
        return getTaskItems();
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
      case AdbPackage.TASK_DEFINITION__TASK_ITEMS:
        getTaskItems().clear();
        getTaskItems().addAll((Collection<? extends TaskItem>)newValue);
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
      case AdbPackage.TASK_DEFINITION__TASK_ITEMS:
        getTaskItems().clear();
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
      case AdbPackage.TASK_DEFINITION__TASK_ITEMS:
        return taskItems != null && !taskItems.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TaskDefinitionImpl
