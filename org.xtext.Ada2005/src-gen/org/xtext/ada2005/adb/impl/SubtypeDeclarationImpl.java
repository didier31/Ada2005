/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.SubtypeDeclaration;
import org.xtext.ada2005.adb.SubtypeIndication;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subtype Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.SubtypeDeclarationImpl#getSubtypeIndication <em>Subtype Indication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubtypeDeclarationImpl extends TypeDeclarationImpl implements SubtypeDeclaration
{
  /**
   * The cached value of the '{@link #getSubtypeIndication() <em>Subtype Indication</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtypeIndication()
   * @generated
   * @ordered
   */
  protected SubtypeIndication subtypeIndication;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubtypeDeclarationImpl()
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
    return AdbPackage.eINSTANCE.getSubtypeDeclaration();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubtypeIndication getSubtypeIndication()
  {
    return subtypeIndication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubtypeIndication(SubtypeIndication newSubtypeIndication, NotificationChain msgs)
  {
    SubtypeIndication oldSubtypeIndication = subtypeIndication;
    subtypeIndication = newSubtypeIndication;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.SUBTYPE_DECLARATION__SUBTYPE_INDICATION, oldSubtypeIndication, newSubtypeIndication);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubtypeIndication(SubtypeIndication newSubtypeIndication)
  {
    if (newSubtypeIndication != subtypeIndication)
    {
      NotificationChain msgs = null;
      if (subtypeIndication != null)
        msgs = ((InternalEObject)subtypeIndication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SUBTYPE_DECLARATION__SUBTYPE_INDICATION, null, msgs);
      if (newSubtypeIndication != null)
        msgs = ((InternalEObject)newSubtypeIndication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SUBTYPE_DECLARATION__SUBTYPE_INDICATION, null, msgs);
      msgs = basicSetSubtypeIndication(newSubtypeIndication, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SUBTYPE_DECLARATION__SUBTYPE_INDICATION, newSubtypeIndication, newSubtypeIndication));
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
      case AdbPackage.SUBTYPE_DECLARATION__SUBTYPE_INDICATION:
        return basicSetSubtypeIndication(null, msgs);
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
      case AdbPackage.SUBTYPE_DECLARATION__SUBTYPE_INDICATION:
        return getSubtypeIndication();
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
      case AdbPackage.SUBTYPE_DECLARATION__SUBTYPE_INDICATION:
        setSubtypeIndication((SubtypeIndication)newValue);
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
      case AdbPackage.SUBTYPE_DECLARATION__SUBTYPE_INDICATION:
        setSubtypeIndication((SubtypeIndication)null);
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
      case AdbPackage.SUBTYPE_DECLARATION__SUBTYPE_INDICATION:
        return subtypeIndication != null;
    }
    return super.eIsSet(featureID);
  }

} //SubtypeDeclarationImpl
