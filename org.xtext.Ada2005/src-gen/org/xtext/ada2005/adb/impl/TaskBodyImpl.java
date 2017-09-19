/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.TaskBody;
import org.xtext.ada2005.adb.TaskDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.TaskBodyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.TaskBodyImpl#getEndId <em>End Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskBodyImpl extends DeclarativeBlockImpl implements TaskBody
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected TaskDeclaration name;

  /**
   * The cached value of the '{@link #getEndId() <em>End Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndId()
   * @generated
   * @ordered
   */
  protected TaskDeclaration endId;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskBodyImpl()
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
    return AdbPackage.eINSTANCE.getTaskBody();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskDeclaration getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (TaskDeclaration)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdbPackage.TASK_BODY__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskDeclaration basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(TaskDeclaration newName)
  {
    TaskDeclaration oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.TASK_BODY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskDeclaration getEndId()
  {
    if (endId != null && endId.eIsProxy())
    {
      InternalEObject oldEndId = (InternalEObject)endId;
      endId = (TaskDeclaration)eResolveProxy(oldEndId);
      if (endId != oldEndId)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdbPackage.TASK_BODY__END_ID, oldEndId, endId));
      }
    }
    return endId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskDeclaration basicGetEndId()
  {
    return endId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndId(TaskDeclaration newEndId)
  {
    TaskDeclaration oldEndId = endId;
    endId = newEndId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.TASK_BODY__END_ID, oldEndId, endId));
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
      case AdbPackage.TASK_BODY__NAME:
        if (resolve) return getName();
        return basicGetName();
      case AdbPackage.TASK_BODY__END_ID:
        if (resolve) return getEndId();
        return basicGetEndId();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AdbPackage.TASK_BODY__NAME:
        setName((TaskDeclaration)newValue);
        return;
      case AdbPackage.TASK_BODY__END_ID:
        setEndId((TaskDeclaration)newValue);
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
      case AdbPackage.TASK_BODY__NAME:
        setName((TaskDeclaration)null);
        return;
      case AdbPackage.TASK_BODY__END_ID:
        setEndId((TaskDeclaration)null);
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
      case AdbPackage.TASK_BODY__NAME:
        return name != null;
      case AdbPackage.TASK_BODY__END_ID:
        return endId != null;
    }
    return super.eIsSet(featureID);
  }

} //TaskBodyImpl
