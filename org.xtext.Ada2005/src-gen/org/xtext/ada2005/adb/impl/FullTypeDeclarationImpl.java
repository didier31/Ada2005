/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.FullTypeDeclaration;
import org.xtext.ada2005.adb.KnownDiscriminantPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Full Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.FullTypeDeclarationImpl#getKnownDiscriminantPart <em>Known Discriminant Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FullTypeDeclarationImpl extends NewTypeDeclarationImpl implements FullTypeDeclaration
{
  /**
   * The cached value of the '{@link #getKnownDiscriminantPart() <em>Known Discriminant Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKnownDiscriminantPart()
   * @generated
   * @ordered
   */
  protected KnownDiscriminantPart knownDiscriminantPart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FullTypeDeclarationImpl()
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
    return AdbPackage.eINSTANCE.getFullTypeDeclaration();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KnownDiscriminantPart getKnownDiscriminantPart()
  {
    return knownDiscriminantPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKnownDiscriminantPart(KnownDiscriminantPart newKnownDiscriminantPart, NotificationChain msgs)
  {
    KnownDiscriminantPart oldKnownDiscriminantPart = knownDiscriminantPart;
    knownDiscriminantPart = newKnownDiscriminantPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.FULL_TYPE_DECLARATION__KNOWN_DISCRIMINANT_PART, oldKnownDiscriminantPart, newKnownDiscriminantPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKnownDiscriminantPart(KnownDiscriminantPart newKnownDiscriminantPart)
  {
    if (newKnownDiscriminantPart != knownDiscriminantPart)
    {
      NotificationChain msgs = null;
      if (knownDiscriminantPart != null)
        msgs = ((InternalEObject)knownDiscriminantPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FULL_TYPE_DECLARATION__KNOWN_DISCRIMINANT_PART, null, msgs);
      if (newKnownDiscriminantPart != null)
        msgs = ((InternalEObject)newKnownDiscriminantPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FULL_TYPE_DECLARATION__KNOWN_DISCRIMINANT_PART, null, msgs);
      msgs = basicSetKnownDiscriminantPart(newKnownDiscriminantPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FULL_TYPE_DECLARATION__KNOWN_DISCRIMINANT_PART, newKnownDiscriminantPart, newKnownDiscriminantPart));
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
      case AdbPackage.FULL_TYPE_DECLARATION__KNOWN_DISCRIMINANT_PART:
        return basicSetKnownDiscriminantPart(null, msgs);
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
      case AdbPackage.FULL_TYPE_DECLARATION__KNOWN_DISCRIMINANT_PART:
        return getKnownDiscriminantPart();
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
      case AdbPackage.FULL_TYPE_DECLARATION__KNOWN_DISCRIMINANT_PART:
        setKnownDiscriminantPart((KnownDiscriminantPart)newValue);
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
      case AdbPackage.FULL_TYPE_DECLARATION__KNOWN_DISCRIMINANT_PART:
        setKnownDiscriminantPart((KnownDiscriminantPart)null);
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
      case AdbPackage.FULL_TYPE_DECLARATION__KNOWN_DISCRIMINANT_PART:
        return knownDiscriminantPart != null;
    }
    return super.eIsSet(featureID);
  }

} //FullTypeDeclarationImpl
