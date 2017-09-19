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
import org.xtext.ada2005.adb.FormalPackageActualPart;
import org.xtext.ada2005.adb.FormalPackageAssociation;
import org.xtext.ada2005.adb.GenericActualPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Package Actual Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalPackageActualPartImpl#isBox <em>Box</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalPackageActualPartImpl#getGenericActualPart <em>Generic Actual Part</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalPackageActualPartImpl#getFormalPackageAssociation <em>Formal Package Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormalPackageActualPartImpl extends MinimalEObjectImpl.Container implements FormalPackageActualPart
{
  /**
   * The default value of the '{@link #isBox() <em>Box</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBox()
   * @generated
   * @ordered
   */
  protected static final boolean BOX_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBox() <em>Box</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBox()
   * @generated
   * @ordered
   */
  protected boolean box = BOX_EDEFAULT;

  /**
   * The cached value of the '{@link #getGenericActualPart() <em>Generic Actual Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericActualPart()
   * @generated
   * @ordered
   */
  protected GenericActualPart genericActualPart;

  /**
   * The cached value of the '{@link #getFormalPackageAssociation() <em>Formal Package Association</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormalPackageAssociation()
   * @generated
   * @ordered
   */
  protected EList<FormalPackageAssociation> formalPackageAssociation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormalPackageActualPartImpl()
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
    return AdbPackage.eINSTANCE.getFormalPackageActualPart();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBox()
  {
    return box;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBox(boolean newBox)
  {
    boolean oldBox = box;
    box = newBox;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_PACKAGE_ACTUAL_PART__BOX, oldBox, box));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericActualPart getGenericActualPart()
  {
    return genericActualPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGenericActualPart(GenericActualPart newGenericActualPart, NotificationChain msgs)
  {
    GenericActualPart oldGenericActualPart = genericActualPart;
    genericActualPart = newGenericActualPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_PACKAGE_ACTUAL_PART__GENERIC_ACTUAL_PART, oldGenericActualPart, newGenericActualPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenericActualPart(GenericActualPart newGenericActualPart)
  {
    if (newGenericActualPart != genericActualPart)
    {
      NotificationChain msgs = null;
      if (genericActualPart != null)
        msgs = ((InternalEObject)genericActualPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_PACKAGE_ACTUAL_PART__GENERIC_ACTUAL_PART, null, msgs);
      if (newGenericActualPart != null)
        msgs = ((InternalEObject)newGenericActualPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_PACKAGE_ACTUAL_PART__GENERIC_ACTUAL_PART, null, msgs);
      msgs = basicSetGenericActualPart(newGenericActualPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_PACKAGE_ACTUAL_PART__GENERIC_ACTUAL_PART, newGenericActualPart, newGenericActualPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FormalPackageAssociation> getFormalPackageAssociation()
  {
    if (formalPackageAssociation == null)
    {
      formalPackageAssociation = new EObjectContainmentEList<FormalPackageAssociation>(FormalPackageAssociation.class, this, AdbPackage.FORMAL_PACKAGE_ACTUAL_PART__FORMAL_PACKAGE_ASSOCIATION);
    }
    return formalPackageAssociation;
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
      case AdbPackage.FORMAL_PACKAGE_ACTUAL_PART__GENERIC_ACTUAL_PART:
        return basicSetGenericActualPart(null, msgs);
      case AdbPackage.FORMAL_PACKAGE_ACTUAL_PART__FORMAL_PACKAGE_ASSOCIATION:
        return ((InternalEList<?>)getFormalPackageAssociation()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.FORMAL_PACKAGE_ACTUAL_PART__BOX:
        return isBox();
      case AdbPackage.FORMAL_PACKAGE_ACTUAL_PART__GENERIC_ACTUAL_PART:
        return getGenericActualPart();
      case AdbPackage.FORMAL_PACKAGE_ACTUAL_PART__FORMAL_PACKAGE_ASSOCIATION:
        return getFormalPackageAssociation();
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
      case AdbPackage.FORMAL_PACKAGE_ACTUAL_PART__BOX:
        setBox((Boolean)newValue);
        return;
      case AdbPackage.FORMAL_PACKAGE_ACTUAL_PART__GENERIC_ACTUAL_PART:
        setGenericActualPart((GenericActualPart)newValue);
        return;
      case AdbPackage.FORMAL_PACKAGE_ACTUAL_PART__FORMAL_PACKAGE_ASSOCIATION:
        getFormalPackageAssociation().clear();
        getFormalPackageAssociation().addAll((Collection<? extends FormalPackageAssociation>)newValue);
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
      case AdbPackage.FORMAL_PACKAGE_ACTUAL_PART__BOX:
        setBox(BOX_EDEFAULT);
        return;
      case AdbPackage.FORMAL_PACKAGE_ACTUAL_PART__GENERIC_ACTUAL_PART:
        setGenericActualPart((GenericActualPart)null);
        return;
      case AdbPackage.FORMAL_PACKAGE_ACTUAL_PART__FORMAL_PACKAGE_ASSOCIATION:
        getFormalPackageAssociation().clear();
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
      case AdbPackage.FORMAL_PACKAGE_ACTUAL_PART__BOX:
        return box != BOX_EDEFAULT;
      case AdbPackage.FORMAL_PACKAGE_ACTUAL_PART__GENERIC_ACTUAL_PART:
        return genericActualPart != null;
      case AdbPackage.FORMAL_PACKAGE_ACTUAL_PART__FORMAL_PACKAGE_ASSOCIATION:
        return formalPackageAssociation != null && !formalPackageAssociation.isEmpty();
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
    result.append(" (box: ");
    result.append(box);
    result.append(')');
    return result.toString();
  }

} //FormalPackageActualPartImpl
