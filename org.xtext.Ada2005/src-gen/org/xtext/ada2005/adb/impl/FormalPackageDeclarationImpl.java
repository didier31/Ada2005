/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.FormalPackageActualPart;
import org.xtext.ada2005.adb.FormalPackageDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Package Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalPackageDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalPackageDeclarationImpl#getGenericPackageName <em>Generic Package Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalPackageDeclarationImpl#getFormalPackageActualPart <em>Formal Package Actual Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormalPackageDeclarationImpl extends GenericFormalParameterDeclarationImpl implements FormalPackageDeclaration
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
   * The default value of the '{@link #getGenericPackageName() <em>Generic Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericPackageName()
   * @generated
   * @ordered
   */
  protected static final String GENERIC_PACKAGE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGenericPackageName() <em>Generic Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericPackageName()
   * @generated
   * @ordered
   */
  protected String genericPackageName = GENERIC_PACKAGE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFormalPackageActualPart() <em>Formal Package Actual Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormalPackageActualPart()
   * @generated
   * @ordered
   */
  protected FormalPackageActualPart formalPackageActualPart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormalPackageDeclarationImpl()
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
    return AdbPackage.eINSTANCE.getFormalPackageDeclaration();
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_PACKAGE_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGenericPackageName()
  {
    return genericPackageName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenericPackageName(String newGenericPackageName)
  {
    String oldGenericPackageName = genericPackageName;
    genericPackageName = newGenericPackageName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_PACKAGE_DECLARATION__GENERIC_PACKAGE_NAME, oldGenericPackageName, genericPackageName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalPackageActualPart getFormalPackageActualPart()
  {
    return formalPackageActualPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormalPackageActualPart(FormalPackageActualPart newFormalPackageActualPart, NotificationChain msgs)
  {
    FormalPackageActualPart oldFormalPackageActualPart = formalPackageActualPart;
    formalPackageActualPart = newFormalPackageActualPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_PACKAGE_DECLARATION__FORMAL_PACKAGE_ACTUAL_PART, oldFormalPackageActualPart, newFormalPackageActualPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormalPackageActualPart(FormalPackageActualPart newFormalPackageActualPart)
  {
    if (newFormalPackageActualPart != formalPackageActualPart)
    {
      NotificationChain msgs = null;
      if (formalPackageActualPart != null)
        msgs = ((InternalEObject)formalPackageActualPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_PACKAGE_DECLARATION__FORMAL_PACKAGE_ACTUAL_PART, null, msgs);
      if (newFormalPackageActualPart != null)
        msgs = ((InternalEObject)newFormalPackageActualPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_PACKAGE_DECLARATION__FORMAL_PACKAGE_ACTUAL_PART, null, msgs);
      msgs = basicSetFormalPackageActualPart(newFormalPackageActualPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_PACKAGE_DECLARATION__FORMAL_PACKAGE_ACTUAL_PART, newFormalPackageActualPart, newFormalPackageActualPart));
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
      case AdbPackage.FORMAL_PACKAGE_DECLARATION__FORMAL_PACKAGE_ACTUAL_PART:
        return basicSetFormalPackageActualPart(null, msgs);
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
      case AdbPackage.FORMAL_PACKAGE_DECLARATION__NAME:
        return getName();
      case AdbPackage.FORMAL_PACKAGE_DECLARATION__GENERIC_PACKAGE_NAME:
        return getGenericPackageName();
      case AdbPackage.FORMAL_PACKAGE_DECLARATION__FORMAL_PACKAGE_ACTUAL_PART:
        return getFormalPackageActualPart();
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
      case AdbPackage.FORMAL_PACKAGE_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case AdbPackage.FORMAL_PACKAGE_DECLARATION__GENERIC_PACKAGE_NAME:
        setGenericPackageName((String)newValue);
        return;
      case AdbPackage.FORMAL_PACKAGE_DECLARATION__FORMAL_PACKAGE_ACTUAL_PART:
        setFormalPackageActualPart((FormalPackageActualPart)newValue);
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
      case AdbPackage.FORMAL_PACKAGE_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdbPackage.FORMAL_PACKAGE_DECLARATION__GENERIC_PACKAGE_NAME:
        setGenericPackageName(GENERIC_PACKAGE_NAME_EDEFAULT);
        return;
      case AdbPackage.FORMAL_PACKAGE_DECLARATION__FORMAL_PACKAGE_ACTUAL_PART:
        setFormalPackageActualPart((FormalPackageActualPart)null);
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
      case AdbPackage.FORMAL_PACKAGE_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdbPackage.FORMAL_PACKAGE_DECLARATION__GENERIC_PACKAGE_NAME:
        return GENERIC_PACKAGE_NAME_EDEFAULT == null ? genericPackageName != null : !GENERIC_PACKAGE_NAME_EDEFAULT.equals(genericPackageName);
      case AdbPackage.FORMAL_PACKAGE_DECLARATION__FORMAL_PACKAGE_ACTUAL_PART:
        return formalPackageActualPart != null;
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
    result.append(", genericPackageName: ");
    result.append(genericPackageName);
    result.append(')');
    return result.toString();
  }

} //FormalPackageDeclarationImpl
