/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.DiscriminantPart;
import org.xtext.ada2005.adb.IncompleteTypeDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incomplete Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.IncompleteTypeDeclarationImpl#getDiscriminantPart <em>Discriminant Part</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.IncompleteTypeDeclarationImpl#isTagged <em>Tagged</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncompleteTypeDeclarationImpl extends NewTypeDeclarationImpl implements IncompleteTypeDeclaration
{
  /**
   * The cached value of the '{@link #getDiscriminantPart() <em>Discriminant Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscriminantPart()
   * @generated
   * @ordered
   */
  protected DiscriminantPart discriminantPart;

  /**
   * The default value of the '{@link #isTagged() <em>Tagged</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTagged()
   * @generated
   * @ordered
   */
  protected static final boolean TAGGED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTagged() <em>Tagged</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTagged()
   * @generated
   * @ordered
   */
  protected boolean tagged = TAGGED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IncompleteTypeDeclarationImpl()
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
    return AdbPackage.eINSTANCE.getIncompleteTypeDeclaration();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiscriminantPart getDiscriminantPart()
  {
    return discriminantPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDiscriminantPart(DiscriminantPart newDiscriminantPart, NotificationChain msgs)
  {
    DiscriminantPart oldDiscriminantPart = discriminantPart;
    discriminantPart = newDiscriminantPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.INCOMPLETE_TYPE_DECLARATION__DISCRIMINANT_PART, oldDiscriminantPart, newDiscriminantPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiscriminantPart(DiscriminantPart newDiscriminantPart)
  {
    if (newDiscriminantPart != discriminantPart)
    {
      NotificationChain msgs = null;
      if (discriminantPart != null)
        msgs = ((InternalEObject)discriminantPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.INCOMPLETE_TYPE_DECLARATION__DISCRIMINANT_PART, null, msgs);
      if (newDiscriminantPart != null)
        msgs = ((InternalEObject)newDiscriminantPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.INCOMPLETE_TYPE_DECLARATION__DISCRIMINANT_PART, null, msgs);
      msgs = basicSetDiscriminantPart(newDiscriminantPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.INCOMPLETE_TYPE_DECLARATION__DISCRIMINANT_PART, newDiscriminantPart, newDiscriminantPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTagged()
  {
    return tagged;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTagged(boolean newTagged)
  {
    boolean oldTagged = tagged;
    tagged = newTagged;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.INCOMPLETE_TYPE_DECLARATION__TAGGED, oldTagged, tagged));
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
      case AdbPackage.INCOMPLETE_TYPE_DECLARATION__DISCRIMINANT_PART:
        return basicSetDiscriminantPart(null, msgs);
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
      case AdbPackage.INCOMPLETE_TYPE_DECLARATION__DISCRIMINANT_PART:
        return getDiscriminantPart();
      case AdbPackage.INCOMPLETE_TYPE_DECLARATION__TAGGED:
        return isTagged();
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
      case AdbPackage.INCOMPLETE_TYPE_DECLARATION__DISCRIMINANT_PART:
        setDiscriminantPart((DiscriminantPart)newValue);
        return;
      case AdbPackage.INCOMPLETE_TYPE_DECLARATION__TAGGED:
        setTagged((Boolean)newValue);
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
      case AdbPackage.INCOMPLETE_TYPE_DECLARATION__DISCRIMINANT_PART:
        setDiscriminantPart((DiscriminantPart)null);
        return;
      case AdbPackage.INCOMPLETE_TYPE_DECLARATION__TAGGED:
        setTagged(TAGGED_EDEFAULT);
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
      case AdbPackage.INCOMPLETE_TYPE_DECLARATION__DISCRIMINANT_PART:
        return discriminantPart != null;
      case AdbPackage.INCOMPLETE_TYPE_DECLARATION__TAGGED:
        return tagged != TAGGED_EDEFAULT;
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
    result.append(" (tagged: ");
    result.append(tagged);
    result.append(')');
    return result.toString();
  }

} //IncompleteTypeDeclarationImpl
