/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.ComponentList;
import org.xtext.ada2005.adb.RecordDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.RecordDefinitionImpl#getComponentList <em>Component List</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.RecordDefinitionImpl#getNull <em>Null</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordDefinitionImpl extends MinimalEObjectImpl.Container implements RecordDefinition
{
  /**
   * The cached value of the '{@link #getComponentList() <em>Component List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentList()
   * @generated
   * @ordered
   */
  protected ComponentList componentList;

  /**
   * The default value of the '{@link #getNull() <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNull()
   * @generated
   * @ordered
   */
  protected static final String NULL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNull() <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNull()
   * @generated
   * @ordered
   */
  protected String null_ = NULL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecordDefinitionImpl()
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
    return AdbPackage.eINSTANCE.getRecordDefinition();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentList getComponentList()
  {
    return componentList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComponentList(ComponentList newComponentList, NotificationChain msgs)
  {
    ComponentList oldComponentList = componentList;
    componentList = newComponentList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.RECORD_DEFINITION__COMPONENT_LIST, oldComponentList, newComponentList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponentList(ComponentList newComponentList)
  {
    if (newComponentList != componentList)
    {
      NotificationChain msgs = null;
      if (componentList != null)
        msgs = ((InternalEObject)componentList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.RECORD_DEFINITION__COMPONENT_LIST, null, msgs);
      if (newComponentList != null)
        msgs = ((InternalEObject)newComponentList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.RECORD_DEFINITION__COMPONENT_LIST, null, msgs);
      msgs = basicSetComponentList(newComponentList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.RECORD_DEFINITION__COMPONENT_LIST, newComponentList, newComponentList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNull()
  {
    return null_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNull(String newNull)
  {
    String oldNull = null_;
    null_ = newNull;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.RECORD_DEFINITION__NULL, oldNull, null_));
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
      case AdbPackage.RECORD_DEFINITION__COMPONENT_LIST:
        return basicSetComponentList(null, msgs);
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
      case AdbPackage.RECORD_DEFINITION__COMPONENT_LIST:
        return getComponentList();
      case AdbPackage.RECORD_DEFINITION__NULL:
        return getNull();
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
      case AdbPackage.RECORD_DEFINITION__COMPONENT_LIST:
        setComponentList((ComponentList)newValue);
        return;
      case AdbPackage.RECORD_DEFINITION__NULL:
        setNull((String)newValue);
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
      case AdbPackage.RECORD_DEFINITION__COMPONENT_LIST:
        setComponentList((ComponentList)null);
        return;
      case AdbPackage.RECORD_DEFINITION__NULL:
        setNull(NULL_EDEFAULT);
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
      case AdbPackage.RECORD_DEFINITION__COMPONENT_LIST:
        return componentList != null;
      case AdbPackage.RECORD_DEFINITION__NULL:
        return NULL_EDEFAULT == null ? null_ != null : !NULL_EDEFAULT.equals(null_);
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
    result.append(" (null: ");
    result.append(null_);
    result.append(')');
    return result.toString();
  }

} //RecordDefinitionImpl
