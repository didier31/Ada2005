/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.SubprogramDefault;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprogram Default</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.SubprogramDefaultImpl#getDefaultName <em>Default Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprogramDefaultImpl extends MinimalEObjectImpl.Container implements SubprogramDefault
{
  /**
   * The default value of the '{@link #getDefaultName() <em>Default Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultName()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultName() <em>Default Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultName()
   * @generated
   * @ordered
   */
  protected String defaultName = DEFAULT_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubprogramDefaultImpl()
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
    return AdbPackage.eINSTANCE.getSubprogramDefault();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefaultName()
  {
    return defaultName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultName(String newDefaultName)
  {
    String oldDefaultName = defaultName;
    defaultName = newDefaultName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SUBPROGRAM_DEFAULT__DEFAULT_NAME, oldDefaultName, defaultName));
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
      case AdbPackage.SUBPROGRAM_DEFAULT__DEFAULT_NAME:
        return getDefaultName();
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
      case AdbPackage.SUBPROGRAM_DEFAULT__DEFAULT_NAME:
        setDefaultName((String)newValue);
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
      case AdbPackage.SUBPROGRAM_DEFAULT__DEFAULT_NAME:
        setDefaultName(DEFAULT_NAME_EDEFAULT);
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
      case AdbPackage.SUBPROGRAM_DEFAULT__DEFAULT_NAME:
        return DEFAULT_NAME_EDEFAULT == null ? defaultName != null : !DEFAULT_NAME_EDEFAULT.equals(defaultName);
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
    result.append(" (defaultName: ");
    result.append(defaultName);
    result.append(')');
    return result.toString();
  }

} //SubprogramDefaultImpl
