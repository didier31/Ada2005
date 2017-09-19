/**
 */
package org.xtext.ada2005.adb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.BasicDeclarativeItem;
import org.xtext.ada2005.adb.PackageSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.PackageSpecificationImpl#getPublicBasicDeclarativeItems <em>Public Basic Declarative Items</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.PackageSpecificationImpl#getPrivateBasicDeclarativeItems <em>Private Basic Declarative Items</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.PackageSpecificationImpl#getEndname <em>Endname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageSpecificationImpl extends MinimalEObjectImpl.Container implements PackageSpecification
{
  /**
   * The cached value of the '{@link #getPublicBasicDeclarativeItems() <em>Public Basic Declarative Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPublicBasicDeclarativeItems()
   * @generated
   * @ordered
   */
  protected EList<BasicDeclarativeItem> publicBasicDeclarativeItems;

  /**
   * The cached value of the '{@link #getPrivateBasicDeclarativeItems() <em>Private Basic Declarative Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrivateBasicDeclarativeItems()
   * @generated
   * @ordered
   */
  protected EList<BasicDeclarativeItem> privateBasicDeclarativeItems;

  /**
   * The default value of the '{@link #getEndname() <em>Endname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndname()
   * @generated
   * @ordered
   */
  protected static final String ENDNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEndname() <em>Endname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndname()
   * @generated
   * @ordered
   */
  protected String endname = ENDNAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageSpecificationImpl()
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
    return AdbPackage.eINSTANCE.getPackageSpecification();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BasicDeclarativeItem> getPublicBasicDeclarativeItems()
  {
    if (publicBasicDeclarativeItems == null)
    {
      publicBasicDeclarativeItems = new EObjectContainmentEList<BasicDeclarativeItem>(BasicDeclarativeItem.class, this, AdbPackage.PACKAGE_SPECIFICATION__PUBLIC_BASIC_DECLARATIVE_ITEMS);
    }
    return publicBasicDeclarativeItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BasicDeclarativeItem> getPrivateBasicDeclarativeItems()
  {
    if (privateBasicDeclarativeItems == null)
    {
      privateBasicDeclarativeItems = new EObjectContainmentEList<BasicDeclarativeItem>(BasicDeclarativeItem.class, this, AdbPackage.PACKAGE_SPECIFICATION__PRIVATE_BASIC_DECLARATIVE_ITEMS);
    }
    return privateBasicDeclarativeItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEndname()
  {
    return endname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndname(String newEndname)
  {
    String oldEndname = endname;
    endname = newEndname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PACKAGE_SPECIFICATION__ENDNAME, oldEndname, endname));
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
      case AdbPackage.PACKAGE_SPECIFICATION__PUBLIC_BASIC_DECLARATIVE_ITEMS:
        return ((InternalEList<?>)getPublicBasicDeclarativeItems()).basicRemove(otherEnd, msgs);
      case AdbPackage.PACKAGE_SPECIFICATION__PRIVATE_BASIC_DECLARATIVE_ITEMS:
        return ((InternalEList<?>)getPrivateBasicDeclarativeItems()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.PACKAGE_SPECIFICATION__PUBLIC_BASIC_DECLARATIVE_ITEMS:
        return getPublicBasicDeclarativeItems();
      case AdbPackage.PACKAGE_SPECIFICATION__PRIVATE_BASIC_DECLARATIVE_ITEMS:
        return getPrivateBasicDeclarativeItems();
      case AdbPackage.PACKAGE_SPECIFICATION__ENDNAME:
        return getEndname();
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
      case AdbPackage.PACKAGE_SPECIFICATION__PUBLIC_BASIC_DECLARATIVE_ITEMS:
        getPublicBasicDeclarativeItems().clear();
        getPublicBasicDeclarativeItems().addAll((Collection<? extends BasicDeclarativeItem>)newValue);
        return;
      case AdbPackage.PACKAGE_SPECIFICATION__PRIVATE_BASIC_DECLARATIVE_ITEMS:
        getPrivateBasicDeclarativeItems().clear();
        getPrivateBasicDeclarativeItems().addAll((Collection<? extends BasicDeclarativeItem>)newValue);
        return;
      case AdbPackage.PACKAGE_SPECIFICATION__ENDNAME:
        setEndname((String)newValue);
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
      case AdbPackage.PACKAGE_SPECIFICATION__PUBLIC_BASIC_DECLARATIVE_ITEMS:
        getPublicBasicDeclarativeItems().clear();
        return;
      case AdbPackage.PACKAGE_SPECIFICATION__PRIVATE_BASIC_DECLARATIVE_ITEMS:
        getPrivateBasicDeclarativeItems().clear();
        return;
      case AdbPackage.PACKAGE_SPECIFICATION__ENDNAME:
        setEndname(ENDNAME_EDEFAULT);
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
      case AdbPackage.PACKAGE_SPECIFICATION__PUBLIC_BASIC_DECLARATIVE_ITEMS:
        return publicBasicDeclarativeItems != null && !publicBasicDeclarativeItems.isEmpty();
      case AdbPackage.PACKAGE_SPECIFICATION__PRIVATE_BASIC_DECLARATIVE_ITEMS:
        return privateBasicDeclarativeItems != null && !privateBasicDeclarativeItems.isEmpty();
      case AdbPackage.PACKAGE_SPECIFICATION__ENDNAME:
        return ENDNAME_EDEFAULT == null ? endname != null : !ENDNAME_EDEFAULT.equals(endname);
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
    result.append(" (endname: ");
    result.append(endname);
    result.append(')');
    return result.toString();
  }

} //PackageSpecificationImpl
