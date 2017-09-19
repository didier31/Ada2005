/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.EntryBarrier;
import org.xtext.ada2005.adb.EntryBody;
import org.xtext.ada2005.adb.EntryBodyFormalPart;
import org.xtext.ada2005.adb.EntryDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.EntryBodyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.EntryBodyImpl#getEntryBodyFormalPart <em>Entry Body Formal Part</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.EntryBodyImpl#getEntryBarrier <em>Entry Barrier</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.EntryBodyImpl#getEndid <em>Endid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryBodyImpl extends DeclarativeBlockImpl implements EntryBody
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected EntryDeclaration name;

  /**
   * The cached value of the '{@link #getEntryBodyFormalPart() <em>Entry Body Formal Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryBodyFormalPart()
   * @generated
   * @ordered
   */
  protected EntryBodyFormalPart entryBodyFormalPart;

  /**
   * The cached value of the '{@link #getEntryBarrier() <em>Entry Barrier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryBarrier()
   * @generated
   * @ordered
   */
  protected EntryBarrier entryBarrier;

  /**
   * The default value of the '{@link #getEndid() <em>Endid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndid()
   * @generated
   * @ordered
   */
  protected static final String ENDID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEndid() <em>Endid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndid()
   * @generated
   * @ordered
   */
  protected String endid = ENDID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntryBodyImpl()
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
    return AdbPackage.eINSTANCE.getEntryBody();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntryDeclaration getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (EntryDeclaration)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdbPackage.ENTRY_BODY__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntryDeclaration basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(EntryDeclaration newName)
  {
    EntryDeclaration oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_BODY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntryBodyFormalPart getEntryBodyFormalPart()
  {
    return entryBodyFormalPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntryBodyFormalPart(EntryBodyFormalPart newEntryBodyFormalPart, NotificationChain msgs)
  {
    EntryBodyFormalPart oldEntryBodyFormalPart = entryBodyFormalPart;
    entryBodyFormalPart = newEntryBodyFormalPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_BODY__ENTRY_BODY_FORMAL_PART, oldEntryBodyFormalPart, newEntryBodyFormalPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntryBodyFormalPart(EntryBodyFormalPart newEntryBodyFormalPart)
  {
    if (newEntryBodyFormalPart != entryBodyFormalPart)
    {
      NotificationChain msgs = null;
      if (entryBodyFormalPart != null)
        msgs = ((InternalEObject)entryBodyFormalPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ENTRY_BODY__ENTRY_BODY_FORMAL_PART, null, msgs);
      if (newEntryBodyFormalPart != null)
        msgs = ((InternalEObject)newEntryBodyFormalPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ENTRY_BODY__ENTRY_BODY_FORMAL_PART, null, msgs);
      msgs = basicSetEntryBodyFormalPart(newEntryBodyFormalPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_BODY__ENTRY_BODY_FORMAL_PART, newEntryBodyFormalPart, newEntryBodyFormalPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntryBarrier getEntryBarrier()
  {
    return entryBarrier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntryBarrier(EntryBarrier newEntryBarrier, NotificationChain msgs)
  {
    EntryBarrier oldEntryBarrier = entryBarrier;
    entryBarrier = newEntryBarrier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_BODY__ENTRY_BARRIER, oldEntryBarrier, newEntryBarrier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntryBarrier(EntryBarrier newEntryBarrier)
  {
    if (newEntryBarrier != entryBarrier)
    {
      NotificationChain msgs = null;
      if (entryBarrier != null)
        msgs = ((InternalEObject)entryBarrier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ENTRY_BODY__ENTRY_BARRIER, null, msgs);
      if (newEntryBarrier != null)
        msgs = ((InternalEObject)newEntryBarrier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ENTRY_BODY__ENTRY_BARRIER, null, msgs);
      msgs = basicSetEntryBarrier(newEntryBarrier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_BODY__ENTRY_BARRIER, newEntryBarrier, newEntryBarrier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEndid()
  {
    return endid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndid(String newEndid)
  {
    String oldEndid = endid;
    endid = newEndid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_BODY__ENDID, oldEndid, endid));
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
      case AdbPackage.ENTRY_BODY__ENTRY_BODY_FORMAL_PART:
        return basicSetEntryBodyFormalPart(null, msgs);
      case AdbPackage.ENTRY_BODY__ENTRY_BARRIER:
        return basicSetEntryBarrier(null, msgs);
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
      case AdbPackage.ENTRY_BODY__NAME:
        if (resolve) return getName();
        return basicGetName();
      case AdbPackage.ENTRY_BODY__ENTRY_BODY_FORMAL_PART:
        return getEntryBodyFormalPart();
      case AdbPackage.ENTRY_BODY__ENTRY_BARRIER:
        return getEntryBarrier();
      case AdbPackage.ENTRY_BODY__ENDID:
        return getEndid();
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
      case AdbPackage.ENTRY_BODY__NAME:
        setName((EntryDeclaration)newValue);
        return;
      case AdbPackage.ENTRY_BODY__ENTRY_BODY_FORMAL_PART:
        setEntryBodyFormalPart((EntryBodyFormalPart)newValue);
        return;
      case AdbPackage.ENTRY_BODY__ENTRY_BARRIER:
        setEntryBarrier((EntryBarrier)newValue);
        return;
      case AdbPackage.ENTRY_BODY__ENDID:
        setEndid((String)newValue);
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
      case AdbPackage.ENTRY_BODY__NAME:
        setName((EntryDeclaration)null);
        return;
      case AdbPackage.ENTRY_BODY__ENTRY_BODY_FORMAL_PART:
        setEntryBodyFormalPart((EntryBodyFormalPart)null);
        return;
      case AdbPackage.ENTRY_BODY__ENTRY_BARRIER:
        setEntryBarrier((EntryBarrier)null);
        return;
      case AdbPackage.ENTRY_BODY__ENDID:
        setEndid(ENDID_EDEFAULT);
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
      case AdbPackage.ENTRY_BODY__NAME:
        return name != null;
      case AdbPackage.ENTRY_BODY__ENTRY_BODY_FORMAL_PART:
        return entryBodyFormalPart != null;
      case AdbPackage.ENTRY_BODY__ENTRY_BARRIER:
        return entryBarrier != null;
      case AdbPackage.ENTRY_BODY__ENDID:
        return ENDID_EDEFAULT == null ? endid != null : !ENDID_EDEFAULT.equals(endid);
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
    result.append(" (endid: ");
    result.append(endid);
    result.append(')');
    return result.toString();
  }

} //EntryBodyImpl
