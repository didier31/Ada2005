/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.GenericActualPart;
import org.xtext.ada2005.adb.GenericInstantiation;
import org.xtext.ada2005.adb.OverridingIndicator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.GenericInstantiationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.GenericInstantiationImpl#getGenericName <em>Generic Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.GenericInstantiationImpl#getOverriding <em>Overriding</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.GenericInstantiationImpl#getGenericActualPart <em>Generic Actual Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericInstantiationImpl extends LibraryUnitSpecificationImpl implements GenericInstantiation
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getGenericName() <em>Generic Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericName()
   * @generated
   * @ordered
   */
  protected static final String GENERIC_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGenericName() <em>Generic Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericName()
   * @generated
   * @ordered
   */
  protected String genericName = GENERIC_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getOverriding() <em>Overriding</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOverriding()
   * @generated
   * @ordered
   */
  protected OverridingIndicator overriding;

  /**
   * The cached value of the '{@link #getGenericActualPart() <em>Generic Actual Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericActualPart()
   * @generated
   * @ordered
   */
  protected GenericActualPart genericActualPart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenericInstantiationImpl()
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
    return AdbPackage.eINSTANCE.getGenericInstantiation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.GENERIC_INSTANTIATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGenericName()
  {
    return genericName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenericName(String newGenericName)
  {
    String oldGenericName = genericName;
    genericName = newGenericName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.GENERIC_INSTANTIATION__GENERIC_NAME, oldGenericName, genericName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OverridingIndicator getOverriding()
  {
    return overriding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOverriding(OverridingIndicator newOverriding, NotificationChain msgs)
  {
    OverridingIndicator oldOverriding = overriding;
    overriding = newOverriding;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.GENERIC_INSTANTIATION__OVERRIDING, oldOverriding, newOverriding);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOverriding(OverridingIndicator newOverriding)
  {
    if (newOverriding != overriding)
    {
      NotificationChain msgs = null;
      if (overriding != null)
        msgs = ((InternalEObject)overriding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.GENERIC_INSTANTIATION__OVERRIDING, null, msgs);
      if (newOverriding != null)
        msgs = ((InternalEObject)newOverriding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.GENERIC_INSTANTIATION__OVERRIDING, null, msgs);
      msgs = basicSetOverriding(newOverriding, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.GENERIC_INSTANTIATION__OVERRIDING, newOverriding, newOverriding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericActualPart getGenericActualPart()
  {
    return genericActualPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGenericActualPart(GenericActualPart newGenericActualPart, NotificationChain msgs)
  {
    GenericActualPart oldGenericActualPart = genericActualPart;
    genericActualPart = newGenericActualPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.GENERIC_INSTANTIATION__GENERIC_ACTUAL_PART, oldGenericActualPart, newGenericActualPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenericActualPart(GenericActualPart newGenericActualPart)
  {
    if (newGenericActualPart != genericActualPart)
    {
      NotificationChain msgs = null;
      if (genericActualPart != null)
        msgs = ((InternalEObject)genericActualPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.GENERIC_INSTANTIATION__GENERIC_ACTUAL_PART, null, msgs);
      if (newGenericActualPart != null)
        msgs = ((InternalEObject)newGenericActualPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.GENERIC_INSTANTIATION__GENERIC_ACTUAL_PART, null, msgs);
      msgs = basicSetGenericActualPart(newGenericActualPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.GENERIC_INSTANTIATION__GENERIC_ACTUAL_PART, newGenericActualPart, newGenericActualPart));
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
      case AdbPackage.GENERIC_INSTANTIATION__OVERRIDING:
        return basicSetOverriding(null, msgs);
      case AdbPackage.GENERIC_INSTANTIATION__GENERIC_ACTUAL_PART:
        return basicSetGenericActualPart(null, msgs);
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
      case AdbPackage.GENERIC_INSTANTIATION__NAME:
        return getName();
      case AdbPackage.GENERIC_INSTANTIATION__GENERIC_NAME:
        return getGenericName();
      case AdbPackage.GENERIC_INSTANTIATION__OVERRIDING:
        return getOverriding();
      case AdbPackage.GENERIC_INSTANTIATION__GENERIC_ACTUAL_PART:
        return getGenericActualPart();
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
      case AdbPackage.GENERIC_INSTANTIATION__NAME:
        setName((String)newValue);
        return;
      case AdbPackage.GENERIC_INSTANTIATION__GENERIC_NAME:
        setGenericName((String)newValue);
        return;
      case AdbPackage.GENERIC_INSTANTIATION__OVERRIDING:
        setOverriding((OverridingIndicator)newValue);
        return;
      case AdbPackage.GENERIC_INSTANTIATION__GENERIC_ACTUAL_PART:
        setGenericActualPart((GenericActualPart)newValue);
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
      case AdbPackage.GENERIC_INSTANTIATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdbPackage.GENERIC_INSTANTIATION__GENERIC_NAME:
        setGenericName(GENERIC_NAME_EDEFAULT);
        return;
      case AdbPackage.GENERIC_INSTANTIATION__OVERRIDING:
        setOverriding((OverridingIndicator)null);
        return;
      case AdbPackage.GENERIC_INSTANTIATION__GENERIC_ACTUAL_PART:
        setGenericActualPart((GenericActualPart)null);
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
      case AdbPackage.GENERIC_INSTANTIATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdbPackage.GENERIC_INSTANTIATION__GENERIC_NAME:
        return GENERIC_NAME_EDEFAULT == null ? genericName != null : !GENERIC_NAME_EDEFAULT.equals(genericName);
      case AdbPackage.GENERIC_INSTANTIATION__OVERRIDING:
        return overriding != null;
      case AdbPackage.GENERIC_INSTANTIATION__GENERIC_ACTUAL_PART:
        return genericActualPart != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", genericName: ");
    result.append(genericName);
    result.append(')');
    return result.toString();
  }

} //GenericInstantiationImpl
