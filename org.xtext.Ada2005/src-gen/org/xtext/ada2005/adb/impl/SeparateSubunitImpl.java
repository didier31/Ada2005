/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.ProperBody;
import org.xtext.ada2005.adb.SeparateSubunit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Separate Subunit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.SeparateSubunitImpl#getParentUnitName <em>Parent Unit Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.SeparateSubunitImpl#getProperBody <em>Proper Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeparateSubunitImpl extends UnitImpl implements SeparateSubunit
{
  /**
   * The default value of the '{@link #getParentUnitName() <em>Parent Unit Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParentUnitName()
   * @generated
   * @ordered
   */
  protected static final String PARENT_UNIT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParentUnitName() <em>Parent Unit Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParentUnitName()
   * @generated
   * @ordered
   */
  protected String parentUnitName = PARENT_UNIT_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getProperBody() <em>Proper Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperBody()
   * @generated
   * @ordered
   */
  protected ProperBody properBody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SeparateSubunitImpl()
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
    return AdbPackage.eINSTANCE.getSeparateSubunit();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParentUnitName()
  {
    return parentUnitName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentUnitName(String newParentUnitName)
  {
    String oldParentUnitName = parentUnitName;
    parentUnitName = newParentUnitName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SEPARATE_SUBUNIT__PARENT_UNIT_NAME, oldParentUnitName, parentUnitName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProperBody getProperBody()
  {
    return properBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProperBody(ProperBody newProperBody, NotificationChain msgs)
  {
    ProperBody oldProperBody = properBody;
    properBody = newProperBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.SEPARATE_SUBUNIT__PROPER_BODY, oldProperBody, newProperBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperBody(ProperBody newProperBody)
  {
    if (newProperBody != properBody)
    {
      NotificationChain msgs = null;
      if (properBody != null)
        msgs = ((InternalEObject)properBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SEPARATE_SUBUNIT__PROPER_BODY, null, msgs);
      if (newProperBody != null)
        msgs = ((InternalEObject)newProperBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SEPARATE_SUBUNIT__PROPER_BODY, null, msgs);
      msgs = basicSetProperBody(newProperBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SEPARATE_SUBUNIT__PROPER_BODY, newProperBody, newProperBody));
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
      case AdbPackage.SEPARATE_SUBUNIT__PROPER_BODY:
        return basicSetProperBody(null, msgs);
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
      case AdbPackage.SEPARATE_SUBUNIT__PARENT_UNIT_NAME:
        return getParentUnitName();
      case AdbPackage.SEPARATE_SUBUNIT__PROPER_BODY:
        return getProperBody();
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
      case AdbPackage.SEPARATE_SUBUNIT__PARENT_UNIT_NAME:
        setParentUnitName((String)newValue);
        return;
      case AdbPackage.SEPARATE_SUBUNIT__PROPER_BODY:
        setProperBody((ProperBody)newValue);
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
      case AdbPackage.SEPARATE_SUBUNIT__PARENT_UNIT_NAME:
        setParentUnitName(PARENT_UNIT_NAME_EDEFAULT);
        return;
      case AdbPackage.SEPARATE_SUBUNIT__PROPER_BODY:
        setProperBody((ProperBody)null);
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
      case AdbPackage.SEPARATE_SUBUNIT__PARENT_UNIT_NAME:
        return PARENT_UNIT_NAME_EDEFAULT == null ? parentUnitName != null : !PARENT_UNIT_NAME_EDEFAULT.equals(parentUnitName);
      case AdbPackage.SEPARATE_SUBUNIT__PROPER_BODY:
        return properBody != null;
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
    result.append(" (parentUnitName: ");
    result.append(parentUnitName);
    result.append(')');
    return result.toString();
  }

} //SeparateSubunitImpl
