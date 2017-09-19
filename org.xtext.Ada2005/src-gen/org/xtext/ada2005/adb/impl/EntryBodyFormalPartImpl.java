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
import org.xtext.ada2005.adb.EntryBodyFormalPart;
import org.xtext.ada2005.adb.EntryIndexSpecification;
import org.xtext.ada2005.adb.FormalPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Body Formal Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.EntryBodyFormalPartImpl#getEntryIndexSpecification <em>Entry Index Specification</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.EntryBodyFormalPartImpl#getFormalPart <em>Formal Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryBodyFormalPartImpl extends MinimalEObjectImpl.Container implements EntryBodyFormalPart
{
  /**
   * The cached value of the '{@link #getEntryIndexSpecification() <em>Entry Index Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryIndexSpecification()
   * @generated
   * @ordered
   */
  protected EntryIndexSpecification entryIndexSpecification;

  /**
   * The cached value of the '{@link #getFormalPart() <em>Formal Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormalPart()
   * @generated
   * @ordered
   */
  protected FormalPart formalPart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntryBodyFormalPartImpl()
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
    return AdbPackage.eINSTANCE.getEntryBodyFormalPart();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntryIndexSpecification getEntryIndexSpecification()
  {
    return entryIndexSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntryIndexSpecification(EntryIndexSpecification newEntryIndexSpecification, NotificationChain msgs)
  {
    EntryIndexSpecification oldEntryIndexSpecification = entryIndexSpecification;
    entryIndexSpecification = newEntryIndexSpecification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_BODY_FORMAL_PART__ENTRY_INDEX_SPECIFICATION, oldEntryIndexSpecification, newEntryIndexSpecification);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntryIndexSpecification(EntryIndexSpecification newEntryIndexSpecification)
  {
    if (newEntryIndexSpecification != entryIndexSpecification)
    {
      NotificationChain msgs = null;
      if (entryIndexSpecification != null)
        msgs = ((InternalEObject)entryIndexSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ENTRY_BODY_FORMAL_PART__ENTRY_INDEX_SPECIFICATION, null, msgs);
      if (newEntryIndexSpecification != null)
        msgs = ((InternalEObject)newEntryIndexSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ENTRY_BODY_FORMAL_PART__ENTRY_INDEX_SPECIFICATION, null, msgs);
      msgs = basicSetEntryIndexSpecification(newEntryIndexSpecification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_BODY_FORMAL_PART__ENTRY_INDEX_SPECIFICATION, newEntryIndexSpecification, newEntryIndexSpecification));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalPart getFormalPart()
  {
    return formalPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormalPart(FormalPart newFormalPart, NotificationChain msgs)
  {
    FormalPart oldFormalPart = formalPart;
    formalPart = newFormalPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_BODY_FORMAL_PART__FORMAL_PART, oldFormalPart, newFormalPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormalPart(FormalPart newFormalPart)
  {
    if (newFormalPart != formalPart)
    {
      NotificationChain msgs = null;
      if (formalPart != null)
        msgs = ((InternalEObject)formalPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ENTRY_BODY_FORMAL_PART__FORMAL_PART, null, msgs);
      if (newFormalPart != null)
        msgs = ((InternalEObject)newFormalPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ENTRY_BODY_FORMAL_PART__FORMAL_PART, null, msgs);
      msgs = basicSetFormalPart(newFormalPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_BODY_FORMAL_PART__FORMAL_PART, newFormalPart, newFormalPart));
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
      case AdbPackage.ENTRY_BODY_FORMAL_PART__ENTRY_INDEX_SPECIFICATION:
        return basicSetEntryIndexSpecification(null, msgs);
      case AdbPackage.ENTRY_BODY_FORMAL_PART__FORMAL_PART:
        return basicSetFormalPart(null, msgs);
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
      case AdbPackage.ENTRY_BODY_FORMAL_PART__ENTRY_INDEX_SPECIFICATION:
        return getEntryIndexSpecification();
      case AdbPackage.ENTRY_BODY_FORMAL_PART__FORMAL_PART:
        return getFormalPart();
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
      case AdbPackage.ENTRY_BODY_FORMAL_PART__ENTRY_INDEX_SPECIFICATION:
        setEntryIndexSpecification((EntryIndexSpecification)newValue);
        return;
      case AdbPackage.ENTRY_BODY_FORMAL_PART__FORMAL_PART:
        setFormalPart((FormalPart)newValue);
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
      case AdbPackage.ENTRY_BODY_FORMAL_PART__ENTRY_INDEX_SPECIFICATION:
        setEntryIndexSpecification((EntryIndexSpecification)null);
        return;
      case AdbPackage.ENTRY_BODY_FORMAL_PART__FORMAL_PART:
        setFormalPart((FormalPart)null);
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
      case AdbPackage.ENTRY_BODY_FORMAL_PART__ENTRY_INDEX_SPECIFICATION:
        return entryIndexSpecification != null;
      case AdbPackage.ENTRY_BODY_FORMAL_PART__FORMAL_PART:
        return formalPart != null;
    }
    return super.eIsSet(featureID);
  }

} //EntryBodyFormalPartImpl
