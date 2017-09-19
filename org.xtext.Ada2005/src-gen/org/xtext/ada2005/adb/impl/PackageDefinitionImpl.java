/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.PackageDefinition;
import org.xtext.ada2005.adb.PackageSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.PackageDefinitionImpl#getPackageSpecification <em>Package Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageDefinitionImpl extends PackageDeclarationImpl implements PackageDefinition
{
  /**
   * The cached value of the '{@link #getPackageSpecification() <em>Package Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageSpecification()
   * @generated
   * @ordered
   */
  protected PackageSpecification packageSpecification;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageDefinitionImpl()
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
    return AdbPackage.eINSTANCE.getPackageDefinition();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageSpecification getPackageSpecification()
  {
    return packageSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPackageSpecification(PackageSpecification newPackageSpecification, NotificationChain msgs)
  {
    PackageSpecification oldPackageSpecification = packageSpecification;
    packageSpecification = newPackageSpecification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.PACKAGE_DEFINITION__PACKAGE_SPECIFICATION, oldPackageSpecification, newPackageSpecification);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackageSpecification(PackageSpecification newPackageSpecification)
  {
    if (newPackageSpecification != packageSpecification)
    {
      NotificationChain msgs = null;
      if (packageSpecification != null)
        msgs = ((InternalEObject)packageSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PACKAGE_DEFINITION__PACKAGE_SPECIFICATION, null, msgs);
      if (newPackageSpecification != null)
        msgs = ((InternalEObject)newPackageSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PACKAGE_DEFINITION__PACKAGE_SPECIFICATION, null, msgs);
      msgs = basicSetPackageSpecification(newPackageSpecification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PACKAGE_DEFINITION__PACKAGE_SPECIFICATION, newPackageSpecification, newPackageSpecification));
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
      case AdbPackage.PACKAGE_DEFINITION__PACKAGE_SPECIFICATION:
        return basicSetPackageSpecification(null, msgs);
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
      case AdbPackage.PACKAGE_DEFINITION__PACKAGE_SPECIFICATION:
        return getPackageSpecification();
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
      case AdbPackage.PACKAGE_DEFINITION__PACKAGE_SPECIFICATION:
        setPackageSpecification((PackageSpecification)newValue);
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
      case AdbPackage.PACKAGE_DEFINITION__PACKAGE_SPECIFICATION:
        setPackageSpecification((PackageSpecification)null);
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
      case AdbPackage.PACKAGE_DEFINITION__PACKAGE_SPECIFICATION:
        return packageSpecification != null;
    }
    return super.eIsSet(featureID);
  }

} //PackageDefinitionImpl
