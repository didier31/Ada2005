/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.Body;
import org.xtext.ada2005.adb.BodyStub;
import org.xtext.ada2005.adb.DeclarativeItem;
import org.xtext.ada2005.adb.LibrarySpecification;
import org.xtext.ada2005.adb.OverridingIndicator;
import org.xtext.ada2005.adb.SubprogramSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprogram Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.SubprogramSpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.SubprogramSpecificationImpl#getOverridingIndicator <em>Overriding Indicator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprogramSpecificationImpl extends LibraryUnitSpecificationImpl implements SubprogramSpecification
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
   * The cached value of the '{@link #getOverridingIndicator() <em>Overriding Indicator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOverridingIndicator()
   * @generated
   * @ordered
   */
  protected OverridingIndicator overridingIndicator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubprogramSpecificationImpl()
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
    return AdbPackage.eINSTANCE.getSubprogramSpecification();
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SUBPROGRAM_SPECIFICATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OverridingIndicator getOverridingIndicator()
  {
    return overridingIndicator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOverridingIndicator(OverridingIndicator newOverridingIndicator, NotificationChain msgs)
  {
    OverridingIndicator oldOverridingIndicator = overridingIndicator;
    overridingIndicator = newOverridingIndicator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.SUBPROGRAM_SPECIFICATION__OVERRIDING_INDICATOR, oldOverridingIndicator, newOverridingIndicator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOverridingIndicator(OverridingIndicator newOverridingIndicator)
  {
    if (newOverridingIndicator != overridingIndicator)
    {
      NotificationChain msgs = null;
      if (overridingIndicator != null)
        msgs = ((InternalEObject)overridingIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SUBPROGRAM_SPECIFICATION__OVERRIDING_INDICATOR, null, msgs);
      if (newOverridingIndicator != null)
        msgs = ((InternalEObject)newOverridingIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SUBPROGRAM_SPECIFICATION__OVERRIDING_INDICATOR, null, msgs);
      msgs = basicSetOverridingIndicator(newOverridingIndicator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SUBPROGRAM_SPECIFICATION__OVERRIDING_INDICATOR, newOverridingIndicator, newOverridingIndicator));
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
      case AdbPackage.SUBPROGRAM_SPECIFICATION__OVERRIDING_INDICATOR:
        return basicSetOverridingIndicator(null, msgs);
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
      case AdbPackage.SUBPROGRAM_SPECIFICATION__NAME:
        return getName();
      case AdbPackage.SUBPROGRAM_SPECIFICATION__OVERRIDING_INDICATOR:
        return getOverridingIndicator();
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
      case AdbPackage.SUBPROGRAM_SPECIFICATION__NAME:
        setName((String)newValue);
        return;
      case AdbPackage.SUBPROGRAM_SPECIFICATION__OVERRIDING_INDICATOR:
        setOverridingIndicator((OverridingIndicator)newValue);
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
      case AdbPackage.SUBPROGRAM_SPECIFICATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdbPackage.SUBPROGRAM_SPECIFICATION__OVERRIDING_INDICATOR:
        setOverridingIndicator((OverridingIndicator)null);
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
      case AdbPackage.SUBPROGRAM_SPECIFICATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdbPackage.SUBPROGRAM_SPECIFICATION__OVERRIDING_INDICATOR:
        return overridingIndicator != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == LibrarySpecification.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == DeclarativeItem.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Body.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BodyStub.class)
    {
      switch (derivedFeatureID)
      {
        case AdbPackage.SUBPROGRAM_SPECIFICATION__NAME: return AdbPackage.BODY_STUB__NAME;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == LibrarySpecification.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == DeclarativeItem.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Body.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BodyStub.class)
    {
      switch (baseFeatureID)
      {
        case AdbPackage.BODY_STUB__NAME: return AdbPackage.SUBPROGRAM_SPECIFICATION__NAME;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(')');
    return result.toString();
  }

} //SubprogramSpecificationImpl
