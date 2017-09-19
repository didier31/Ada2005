/**
 */
package org.xtext.ada2005.adb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.ProtectedBody;
import org.xtext.ada2005.adb.ProtectedOperationItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protected Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.ProtectedBodyImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ProtectedBodyImpl#getProtectedOperationItem <em>Protected Operation Item</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ProtectedBodyImpl#getIdTask <em>Id Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtectedBodyImpl extends ProperBodyImpl implements ProtectedBody
{
  /**
   * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected String identifier = IDENTIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getProtectedOperationItem() <em>Protected Operation Item</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtectedOperationItem()
   * @generated
   * @ordered
   */
  protected EList<ProtectedOperationItem> protectedOperationItem;

  /**
   * The default value of the '{@link #getIdTask() <em>Id Task</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdTask()
   * @generated
   * @ordered
   */
  protected static final String ID_TASK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdTask() <em>Id Task</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdTask()
   * @generated
   * @ordered
   */
  protected String idTask = ID_TASK_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProtectedBodyImpl()
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
    return AdbPackage.eINSTANCE.getProtectedBody();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(String newIdentifier)
  {
    String oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PROTECTED_BODY__IDENTIFIER, oldIdentifier, identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProtectedOperationItem> getProtectedOperationItem()
  {
    if (protectedOperationItem == null)
    {
      protectedOperationItem = new EObjectContainmentEList<ProtectedOperationItem>(ProtectedOperationItem.class, this, AdbPackage.PROTECTED_BODY__PROTECTED_OPERATION_ITEM);
    }
    return protectedOperationItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdTask()
  {
    return idTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdTask(String newIdTask)
  {
    String oldIdTask = idTask;
    idTask = newIdTask;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PROTECTED_BODY__ID_TASK, oldIdTask, idTask));
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
      case AdbPackage.PROTECTED_BODY__PROTECTED_OPERATION_ITEM:
        return ((InternalEList<?>)getProtectedOperationItem()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.PROTECTED_BODY__IDENTIFIER:
        return getIdentifier();
      case AdbPackage.PROTECTED_BODY__PROTECTED_OPERATION_ITEM:
        return getProtectedOperationItem();
      case AdbPackage.PROTECTED_BODY__ID_TASK:
        return getIdTask();
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
      case AdbPackage.PROTECTED_BODY__IDENTIFIER:
        setIdentifier((String)newValue);
        return;
      case AdbPackage.PROTECTED_BODY__PROTECTED_OPERATION_ITEM:
        getProtectedOperationItem().clear();
        getProtectedOperationItem().addAll((Collection<? extends ProtectedOperationItem>)newValue);
        return;
      case AdbPackage.PROTECTED_BODY__ID_TASK:
        setIdTask((String)newValue);
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
      case AdbPackage.PROTECTED_BODY__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case AdbPackage.PROTECTED_BODY__PROTECTED_OPERATION_ITEM:
        getProtectedOperationItem().clear();
        return;
      case AdbPackage.PROTECTED_BODY__ID_TASK:
        setIdTask(ID_TASK_EDEFAULT);
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
      case AdbPackage.PROTECTED_BODY__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case AdbPackage.PROTECTED_BODY__PROTECTED_OPERATION_ITEM:
        return protectedOperationItem != null && !protectedOperationItem.isEmpty();
      case AdbPackage.PROTECTED_BODY__ID_TASK:
        return ID_TASK_EDEFAULT == null ? idTask != null : !ID_TASK_EDEFAULT.equals(idTask);
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
    result.append(" (identifier: ");
    result.append(identifier);
    result.append(", idTask: ");
    result.append(idTask);
    result.append(')');
    return result.toString();
  }

} //ProtectedBodyImpl
