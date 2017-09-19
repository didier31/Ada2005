/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.OptNullExclusion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opt Null Exclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.OptNullExclusionImpl#getNot_null <em>Not null</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptNullExclusionImpl extends MinimalEObjectImpl.Container implements OptNullExclusion
{
  /**
   * The default value of the '{@link #getNot_null() <em>Not null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNot_null()
   * @generated
   * @ordered
   */
  protected static final String NOT_NULL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNot_null() <em>Not null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNot_null()
   * @generated
   * @ordered
   */
  protected String not_null = NOT_NULL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OptNullExclusionImpl()
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
    return AdbPackage.eINSTANCE.getOptNullExclusion();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNot_null()
  {
    return not_null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNot_null(String newNot_null)
  {
    String oldNot_null = not_null;
    not_null = newNot_null;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.OPT_NULL_EXCLUSION__NOT_NULL, oldNot_null, not_null));
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
      case AdbPackage.OPT_NULL_EXCLUSION__NOT_NULL:
        return getNot_null();
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
      case AdbPackage.OPT_NULL_EXCLUSION__NOT_NULL:
        setNot_null((String)newValue);
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
      case AdbPackage.OPT_NULL_EXCLUSION__NOT_NULL:
        setNot_null(NOT_NULL_EDEFAULT);
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
      case AdbPackage.OPT_NULL_EXCLUSION__NOT_NULL:
        return NOT_NULL_EDEFAULT == null ? not_null != null : !NOT_NULL_EDEFAULT.equals(not_null);
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
    result.append(" (not_null: ");
    result.append(not_null);
    result.append(')');
    return result.toString();
  }

} //OptNullExclusionImpl
