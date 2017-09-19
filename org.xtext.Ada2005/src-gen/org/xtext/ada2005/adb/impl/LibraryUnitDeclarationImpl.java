/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.LibraryUnitDeclaration;
import org.xtext.ada2005.adb.LibraryUnitSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library Unit Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.LibraryUnitDeclarationImpl#isPrivate <em>Private</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.LibraryUnitDeclarationImpl#getLibraryUnitSpecification <em>Library Unit Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibraryUnitDeclarationImpl extends UnitImpl implements LibraryUnitDeclaration
{
  /**
   * The default value of the '{@link #isPrivate() <em>Private</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrivate()
   * @generated
   * @ordered
   */
  protected static final boolean PRIVATE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPrivate() <em>Private</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrivate()
   * @generated
   * @ordered
   */
  protected boolean private_ = PRIVATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getLibraryUnitSpecification() <em>Library Unit Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLibraryUnitSpecification()
   * @generated
   * @ordered
   */
  protected LibraryUnitSpecification libraryUnitSpecification;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LibraryUnitDeclarationImpl()
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
    return AdbPackage.eINSTANCE.getLibraryUnitDeclaration();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPrivate()
  {
    return private_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrivate(boolean newPrivate)
  {
    boolean oldPrivate = private_;
    private_ = newPrivate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.LIBRARY_UNIT_DECLARATION__PRIVATE, oldPrivate, private_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LibraryUnitSpecification getLibraryUnitSpecification()
  {
    return libraryUnitSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLibraryUnitSpecification(LibraryUnitSpecification newLibraryUnitSpecification, NotificationChain msgs)
  {
    LibraryUnitSpecification oldLibraryUnitSpecification = libraryUnitSpecification;
    libraryUnitSpecification = newLibraryUnitSpecification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.LIBRARY_UNIT_DECLARATION__LIBRARY_UNIT_SPECIFICATION, oldLibraryUnitSpecification, newLibraryUnitSpecification);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLibraryUnitSpecification(LibraryUnitSpecification newLibraryUnitSpecification)
  {
    if (newLibraryUnitSpecification != libraryUnitSpecification)
    {
      NotificationChain msgs = null;
      if (libraryUnitSpecification != null)
        msgs = ((InternalEObject)libraryUnitSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.LIBRARY_UNIT_DECLARATION__LIBRARY_UNIT_SPECIFICATION, null, msgs);
      if (newLibraryUnitSpecification != null)
        msgs = ((InternalEObject)newLibraryUnitSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.LIBRARY_UNIT_DECLARATION__LIBRARY_UNIT_SPECIFICATION, null, msgs);
      msgs = basicSetLibraryUnitSpecification(newLibraryUnitSpecification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.LIBRARY_UNIT_DECLARATION__LIBRARY_UNIT_SPECIFICATION, newLibraryUnitSpecification, newLibraryUnitSpecification));
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
      case AdbPackage.LIBRARY_UNIT_DECLARATION__LIBRARY_UNIT_SPECIFICATION:
        return basicSetLibraryUnitSpecification(null, msgs);
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
      case AdbPackage.LIBRARY_UNIT_DECLARATION__PRIVATE:
        return isPrivate();
      case AdbPackage.LIBRARY_UNIT_DECLARATION__LIBRARY_UNIT_SPECIFICATION:
        return getLibraryUnitSpecification();
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
      case AdbPackage.LIBRARY_UNIT_DECLARATION__PRIVATE:
        setPrivate((Boolean)newValue);
        return;
      case AdbPackage.LIBRARY_UNIT_DECLARATION__LIBRARY_UNIT_SPECIFICATION:
        setLibraryUnitSpecification((LibraryUnitSpecification)newValue);
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
      case AdbPackage.LIBRARY_UNIT_DECLARATION__PRIVATE:
        setPrivate(PRIVATE_EDEFAULT);
        return;
      case AdbPackage.LIBRARY_UNIT_DECLARATION__LIBRARY_UNIT_SPECIFICATION:
        setLibraryUnitSpecification((LibraryUnitSpecification)null);
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
      case AdbPackage.LIBRARY_UNIT_DECLARATION__PRIVATE:
        return private_ != PRIVATE_EDEFAULT;
      case AdbPackage.LIBRARY_UNIT_DECLARATION__LIBRARY_UNIT_SPECIFICATION:
        return libraryUnitSpecification != null;
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
    result.append(" (private: ");
    result.append(private_);
    result.append(')');
    return result.toString();
  }

} //LibraryUnitDeclarationImpl
