/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.Mode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.ModeImpl#isIn <em>In</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ModeImpl#isOut <em>Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModeImpl extends MinimalEObjectImpl.Container implements Mode
{
  /**
   * The default value of the '{@link #isIn() <em>In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIn()
   * @generated
   * @ordered
   */
  protected static final boolean IN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIn() <em>In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIn()
   * @generated
   * @ordered
   */
  protected boolean in = IN_EDEFAULT;

  /**
   * The default value of the '{@link #isOut() <em>Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOut()
   * @generated
   * @ordered
   */
  protected static final boolean OUT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOut() <em>Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOut()
   * @generated
   * @ordered
   */
  protected boolean out = OUT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModeImpl()
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
    return AdbPackage.eINSTANCE.getMode();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIn()
  {
    return in;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIn(boolean newIn)
  {
    boolean oldIn = in;
    in = newIn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.MODE__IN, oldIn, in));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOut()
  {
    return out;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOut(boolean newOut)
  {
    boolean oldOut = out;
    out = newOut;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.MODE__OUT, oldOut, out));
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
      case AdbPackage.MODE__IN:
        return isIn();
      case AdbPackage.MODE__OUT:
        return isOut();
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
      case AdbPackage.MODE__IN:
        setIn((Boolean)newValue);
        return;
      case AdbPackage.MODE__OUT:
        setOut((Boolean)newValue);
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
      case AdbPackage.MODE__IN:
        setIn(IN_EDEFAULT);
        return;
      case AdbPackage.MODE__OUT:
        setOut(OUT_EDEFAULT);
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
      case AdbPackage.MODE__IN:
        return in != IN_EDEFAULT;
      case AdbPackage.MODE__OUT:
        return out != OUT_EDEFAULT;
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
    result.append(" (in: ");
    result.append(in);
    result.append(", out: ");
    result.append(out);
    result.append(')');
    return result.toString();
  }

} //ModeImpl
