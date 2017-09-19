/**
 */
package org.xtext.ada2005.adb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.ComponentChoiceList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Choice List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.ComponentChoiceListImpl#getComponentSelectorName <em>Component Selector Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ComponentChoiceListImpl#isOthers <em>Others</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentChoiceListImpl extends MinimalEObjectImpl.Container implements ComponentChoiceList
{
  /**
   * The cached value of the '{@link #getComponentSelectorName() <em>Component Selector Name</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentSelectorName()
   * @generated
   * @ordered
   */
  protected EList<String> componentSelectorName;

  /**
   * The default value of the '{@link #isOthers() <em>Others</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOthers()
   * @generated
   * @ordered
   */
  protected static final boolean OTHERS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOthers() <em>Others</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOthers()
   * @generated
   * @ordered
   */
  protected boolean others = OTHERS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentChoiceListImpl()
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
    return AdbPackage.eINSTANCE.getComponentChoiceList();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getComponentSelectorName()
  {
    if (componentSelectorName == null)
    {
      componentSelectorName = new EDataTypeEList<String>(String.class, this, AdbPackage.COMPONENT_CHOICE_LIST__COMPONENT_SELECTOR_NAME);
    }
    return componentSelectorName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOthers()
  {
    return others;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOthers(boolean newOthers)
  {
    boolean oldOthers = others;
    others = newOthers;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.COMPONENT_CHOICE_LIST__OTHERS, oldOthers, others));
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
      case AdbPackage.COMPONENT_CHOICE_LIST__COMPONENT_SELECTOR_NAME:
        return getComponentSelectorName();
      case AdbPackage.COMPONENT_CHOICE_LIST__OTHERS:
        return isOthers();
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
      case AdbPackage.COMPONENT_CHOICE_LIST__COMPONENT_SELECTOR_NAME:
        getComponentSelectorName().clear();
        getComponentSelectorName().addAll((Collection<? extends String>)newValue);
        return;
      case AdbPackage.COMPONENT_CHOICE_LIST__OTHERS:
        setOthers((Boolean)newValue);
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
      case AdbPackage.COMPONENT_CHOICE_LIST__COMPONENT_SELECTOR_NAME:
        getComponentSelectorName().clear();
        return;
      case AdbPackage.COMPONENT_CHOICE_LIST__OTHERS:
        setOthers(OTHERS_EDEFAULT);
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
      case AdbPackage.COMPONENT_CHOICE_LIST__COMPONENT_SELECTOR_NAME:
        return componentSelectorName != null && !componentSelectorName.isEmpty();
      case AdbPackage.COMPONENT_CHOICE_LIST__OTHERS:
        return others != OTHERS_EDEFAULT;
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
    result.append(" (componentSelectorName: ");
    result.append(componentSelectorName);
    result.append(", others: ");
    result.append(others);
    result.append(')');
    return result.toString();
  }

} //ComponentChoiceListImpl
