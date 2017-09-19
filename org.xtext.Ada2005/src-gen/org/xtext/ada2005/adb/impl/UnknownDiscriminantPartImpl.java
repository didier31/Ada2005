/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.UnknownDiscriminantPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unknown Discriminant Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.UnknownDiscriminantPartImpl#isBox <em>Box</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnknownDiscriminantPartImpl extends DiscriminantPartImpl implements UnknownDiscriminantPart
{
  /**
   * The default value of the '{@link #isBox() <em>Box</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBox()
   * @generated
   * @ordered
   */
  protected static final boolean BOX_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBox() <em>Box</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBox()
   * @generated
   * @ordered
   */
  protected boolean box = BOX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnknownDiscriminantPartImpl()
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
    return AdbPackage.eINSTANCE.getUnknownDiscriminantPart();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBox()
  {
    return box;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBox(boolean newBox)
  {
    boolean oldBox = box;
    box = newBox;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.UNKNOWN_DISCRIMINANT_PART__BOX, oldBox, box));
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
      case AdbPackage.UNKNOWN_DISCRIMINANT_PART__BOX:
        return isBox();
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
      case AdbPackage.UNKNOWN_DISCRIMINANT_PART__BOX:
        setBox((Boolean)newValue);
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
      case AdbPackage.UNKNOWN_DISCRIMINANT_PART__BOX:
        setBox(BOX_EDEFAULT);
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
      case AdbPackage.UNKNOWN_DISCRIMINANT_PART__BOX:
        return box != BOX_EDEFAULT;
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
    result.append(" (box: ");
    result.append(box);
    result.append(')');
    return result.toString();
  }

} //UnknownDiscriminantPartImpl
