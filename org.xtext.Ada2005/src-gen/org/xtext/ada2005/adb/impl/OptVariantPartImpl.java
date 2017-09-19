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
import org.xtext.ada2005.adb.OptVariantPart;
import org.xtext.ada2005.adb.VariantPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opt Variant Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.OptVariantPartImpl#getVariantPart <em>Variant Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptVariantPartImpl extends MinimalEObjectImpl.Container implements OptVariantPart
{
  /**
   * The cached value of the '{@link #getVariantPart() <em>Variant Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariantPart()
   * @generated
   * @ordered
   */
  protected VariantPart variantPart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OptVariantPartImpl()
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
    return AdbPackage.eINSTANCE.getOptVariantPart();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariantPart getVariantPart()
  {
    return variantPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariantPart(VariantPart newVariantPart, NotificationChain msgs)
  {
    VariantPart oldVariantPart = variantPart;
    variantPart = newVariantPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.OPT_VARIANT_PART__VARIANT_PART, oldVariantPart, newVariantPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariantPart(VariantPart newVariantPart)
  {
    if (newVariantPart != variantPart)
    {
      NotificationChain msgs = null;
      if (variantPart != null)
        msgs = ((InternalEObject)variantPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.OPT_VARIANT_PART__VARIANT_PART, null, msgs);
      if (newVariantPart != null)
        msgs = ((InternalEObject)newVariantPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.OPT_VARIANT_PART__VARIANT_PART, null, msgs);
      msgs = basicSetVariantPart(newVariantPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.OPT_VARIANT_PART__VARIANT_PART, newVariantPart, newVariantPart));
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
      case AdbPackage.OPT_VARIANT_PART__VARIANT_PART:
        return basicSetVariantPart(null, msgs);
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
      case AdbPackage.OPT_VARIANT_PART__VARIANT_PART:
        return getVariantPart();
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
      case AdbPackage.OPT_VARIANT_PART__VARIANT_PART:
        setVariantPart((VariantPart)newValue);
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
      case AdbPackage.OPT_VARIANT_PART__VARIANT_PART:
        setVariantPart((VariantPart)null);
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
      case AdbPackage.OPT_VARIANT_PART__VARIANT_PART:
        return variantPart != null;
    }
    return super.eIsSet(featureID);
  }

} //OptVariantPartImpl
