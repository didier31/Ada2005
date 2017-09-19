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
import org.xtext.ada2005.adb.FormalPackageAssociation;
import org.xtext.ada2005.adb.GenericAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Package Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalPackageAssociationImpl#getGenericAssociation <em>Generic Association</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalPackageAssociationImpl#getGenericFormalParameterSelectorName <em>Generic Formal Parameter Selector Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormalPackageAssociationImpl extends MinimalEObjectImpl.Container implements FormalPackageAssociation
{
  /**
   * The cached value of the '{@link #getGenericAssociation() <em>Generic Association</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericAssociation()
   * @generated
   * @ordered
   */
  protected GenericAssociation genericAssociation;

  /**
   * The default value of the '{@link #getGenericFormalParameterSelectorName() <em>Generic Formal Parameter Selector Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericFormalParameterSelectorName()
   * @generated
   * @ordered
   */
  protected static final String GENERIC_FORMAL_PARAMETER_SELECTOR_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGenericFormalParameterSelectorName() <em>Generic Formal Parameter Selector Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericFormalParameterSelectorName()
   * @generated
   * @ordered
   */
  protected String genericFormalParameterSelectorName = GENERIC_FORMAL_PARAMETER_SELECTOR_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormalPackageAssociationImpl()
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
    return AdbPackage.eINSTANCE.getFormalPackageAssociation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericAssociation getGenericAssociation()
  {
    return genericAssociation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGenericAssociation(GenericAssociation newGenericAssociation, NotificationChain msgs)
  {
    GenericAssociation oldGenericAssociation = genericAssociation;
    genericAssociation = newGenericAssociation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_PACKAGE_ASSOCIATION__GENERIC_ASSOCIATION, oldGenericAssociation, newGenericAssociation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenericAssociation(GenericAssociation newGenericAssociation)
  {
    if (newGenericAssociation != genericAssociation)
    {
      NotificationChain msgs = null;
      if (genericAssociation != null)
        msgs = ((InternalEObject)genericAssociation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_PACKAGE_ASSOCIATION__GENERIC_ASSOCIATION, null, msgs);
      if (newGenericAssociation != null)
        msgs = ((InternalEObject)newGenericAssociation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_PACKAGE_ASSOCIATION__GENERIC_ASSOCIATION, null, msgs);
      msgs = basicSetGenericAssociation(newGenericAssociation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_PACKAGE_ASSOCIATION__GENERIC_ASSOCIATION, newGenericAssociation, newGenericAssociation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGenericFormalParameterSelectorName()
  {
    return genericFormalParameterSelectorName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenericFormalParameterSelectorName(String newGenericFormalParameterSelectorName)
  {
    String oldGenericFormalParameterSelectorName = genericFormalParameterSelectorName;
    genericFormalParameterSelectorName = newGenericFormalParameterSelectorName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_PACKAGE_ASSOCIATION__GENERIC_FORMAL_PARAMETER_SELECTOR_NAME, oldGenericFormalParameterSelectorName, genericFormalParameterSelectorName));
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
      case AdbPackage.FORMAL_PACKAGE_ASSOCIATION__GENERIC_ASSOCIATION:
        return basicSetGenericAssociation(null, msgs);
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
      case AdbPackage.FORMAL_PACKAGE_ASSOCIATION__GENERIC_ASSOCIATION:
        return getGenericAssociation();
      case AdbPackage.FORMAL_PACKAGE_ASSOCIATION__GENERIC_FORMAL_PARAMETER_SELECTOR_NAME:
        return getGenericFormalParameterSelectorName();
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
      case AdbPackage.FORMAL_PACKAGE_ASSOCIATION__GENERIC_ASSOCIATION:
        setGenericAssociation((GenericAssociation)newValue);
        return;
      case AdbPackage.FORMAL_PACKAGE_ASSOCIATION__GENERIC_FORMAL_PARAMETER_SELECTOR_NAME:
        setGenericFormalParameterSelectorName((String)newValue);
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
      case AdbPackage.FORMAL_PACKAGE_ASSOCIATION__GENERIC_ASSOCIATION:
        setGenericAssociation((GenericAssociation)null);
        return;
      case AdbPackage.FORMAL_PACKAGE_ASSOCIATION__GENERIC_FORMAL_PARAMETER_SELECTOR_NAME:
        setGenericFormalParameterSelectorName(GENERIC_FORMAL_PARAMETER_SELECTOR_NAME_EDEFAULT);
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
      case AdbPackage.FORMAL_PACKAGE_ASSOCIATION__GENERIC_ASSOCIATION:
        return genericAssociation != null;
      case AdbPackage.FORMAL_PACKAGE_ASSOCIATION__GENERIC_FORMAL_PARAMETER_SELECTOR_NAME:
        return GENERIC_FORMAL_PARAMETER_SELECTOR_NAME_EDEFAULT == null ? genericFormalParameterSelectorName != null : !GENERIC_FORMAL_PARAMETER_SELECTOR_NAME_EDEFAULT.equals(genericFormalParameterSelectorName);
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
    result.append(" (genericFormalParameterSelectorName: ");
    result.append(genericFormalParameterSelectorName);
    result.append(')');
    return result.toString();
  }

} //FormalPackageAssociationImpl
