/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.GenericDeclaration;
import org.xtext.ada2005.adb.GenericItems;
import org.xtext.ada2005.adb.LibrarySpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.GenericDeclarationImpl#getGenericItems <em>Generic Items</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.GenericDeclarationImpl#getLibrarySpecification <em>Library Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericDeclarationImpl extends LibraryUnitSpecificationImpl implements GenericDeclaration
{
  /**
   * The cached value of the '{@link #getGenericItems() <em>Generic Items</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericItems()
   * @generated
   * @ordered
   */
  protected GenericItems genericItems;

  /**
   * The cached value of the '{@link #getLibrarySpecification() <em>Library Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLibrarySpecification()
   * @generated
   * @ordered
   */
  protected LibrarySpecification librarySpecification;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenericDeclarationImpl()
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
    return AdbPackage.eINSTANCE.getGenericDeclaration();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericItems getGenericItems()
  {
    return genericItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGenericItems(GenericItems newGenericItems, NotificationChain msgs)
  {
    GenericItems oldGenericItems = genericItems;
    genericItems = newGenericItems;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.GENERIC_DECLARATION__GENERIC_ITEMS, oldGenericItems, newGenericItems);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenericItems(GenericItems newGenericItems)
  {
    if (newGenericItems != genericItems)
    {
      NotificationChain msgs = null;
      if (genericItems != null)
        msgs = ((InternalEObject)genericItems).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.GENERIC_DECLARATION__GENERIC_ITEMS, null, msgs);
      if (newGenericItems != null)
        msgs = ((InternalEObject)newGenericItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.GENERIC_DECLARATION__GENERIC_ITEMS, null, msgs);
      msgs = basicSetGenericItems(newGenericItems, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.GENERIC_DECLARATION__GENERIC_ITEMS, newGenericItems, newGenericItems));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LibrarySpecification getLibrarySpecification()
  {
    return librarySpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLibrarySpecification(LibrarySpecification newLibrarySpecification, NotificationChain msgs)
  {
    LibrarySpecification oldLibrarySpecification = librarySpecification;
    librarySpecification = newLibrarySpecification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.GENERIC_DECLARATION__LIBRARY_SPECIFICATION, oldLibrarySpecification, newLibrarySpecification);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLibrarySpecification(LibrarySpecification newLibrarySpecification)
  {
    if (newLibrarySpecification != librarySpecification)
    {
      NotificationChain msgs = null;
      if (librarySpecification != null)
        msgs = ((InternalEObject)librarySpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.GENERIC_DECLARATION__LIBRARY_SPECIFICATION, null, msgs);
      if (newLibrarySpecification != null)
        msgs = ((InternalEObject)newLibrarySpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.GENERIC_DECLARATION__LIBRARY_SPECIFICATION, null, msgs);
      msgs = basicSetLibrarySpecification(newLibrarySpecification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.GENERIC_DECLARATION__LIBRARY_SPECIFICATION, newLibrarySpecification, newLibrarySpecification));
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
      case AdbPackage.GENERIC_DECLARATION__GENERIC_ITEMS:
        return basicSetGenericItems(null, msgs);
      case AdbPackage.GENERIC_DECLARATION__LIBRARY_SPECIFICATION:
        return basicSetLibrarySpecification(null, msgs);
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
      case AdbPackage.GENERIC_DECLARATION__GENERIC_ITEMS:
        return getGenericItems();
      case AdbPackage.GENERIC_DECLARATION__LIBRARY_SPECIFICATION:
        return getLibrarySpecification();
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
      case AdbPackage.GENERIC_DECLARATION__GENERIC_ITEMS:
        setGenericItems((GenericItems)newValue);
        return;
      case AdbPackage.GENERIC_DECLARATION__LIBRARY_SPECIFICATION:
        setLibrarySpecification((LibrarySpecification)newValue);
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
      case AdbPackage.GENERIC_DECLARATION__GENERIC_ITEMS:
        setGenericItems((GenericItems)null);
        return;
      case AdbPackage.GENERIC_DECLARATION__LIBRARY_SPECIFICATION:
        setLibrarySpecification((LibrarySpecification)null);
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
      case AdbPackage.GENERIC_DECLARATION__GENERIC_ITEMS:
        return genericItems != null;
      case AdbPackage.GENERIC_DECLARATION__LIBRARY_SPECIFICATION:
        return librarySpecification != null;
    }
    return super.eIsSet(featureID);
  }

} //GenericDeclarationImpl
