/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.DerivedTypeDefinition;
import org.xtext.ada2005.adb.InterfaceList;
import org.xtext.ada2005.adb.RecordExtensionPart;
import org.xtext.ada2005.adb.SubtypeIndication;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.DerivedTypeDefinitionImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.DerivedTypeDefinitionImpl#getLimited <em>Limited</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.DerivedTypeDefinitionImpl#getSubtypeIndication <em>Subtype Indication</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.DerivedTypeDefinitionImpl#getInterfaceList <em>Interface List</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.DerivedTypeDefinitionImpl#getRecordExtentionPart <em>Record Extention Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivedTypeDefinitionImpl extends TypeDefinitionImpl implements DerivedTypeDefinition
{
  /**
   * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstract()
   * @generated
   * @ordered
   */
  protected static final String ABSTRACT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstract()
   * @generated
   * @ordered
   */
  protected String abstract_ = ABSTRACT_EDEFAULT;

  /**
   * The default value of the '{@link #getLimited() <em>Limited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLimited()
   * @generated
   * @ordered
   */
  protected static final String LIMITED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLimited() <em>Limited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLimited()
   * @generated
   * @ordered
   */
  protected String limited = LIMITED_EDEFAULT;

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
   * The cached value of the '{@link #getInterfaceList() <em>Interface List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceList()
   * @generated
   * @ordered
   */
  protected InterfaceList interfaceList;

  /**
   * The cached value of the '{@link #getRecordExtentionPart() <em>Record Extention Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecordExtentionPart()
   * @generated
   * @ordered
   */
  protected RecordExtensionPart recordExtentionPart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DerivedTypeDefinitionImpl()
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
    return AdbPackage.eINSTANCE.getDerivedTypeDefinition();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(String newAbstract)
  {
    String oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DERIVED_TYPE_DEFINITION__ABSTRACT, oldAbstract, abstract_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLimited()
  {
    return limited;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLimited(String newLimited)
  {
    String oldLimited = limited;
    limited = newLimited;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DERIVED_TYPE_DEFINITION__LIMITED, oldLimited, limited));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.DERIVED_TYPE_DEFINITION__SUBTYPE_INDICATION, oldSubtypeIndication, newSubtypeIndication);
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
        msgs = ((InternalEObject)subtypeIndication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DERIVED_TYPE_DEFINITION__SUBTYPE_INDICATION, null, msgs);
      if (newSubtypeIndication != null)
        msgs = ((InternalEObject)newSubtypeIndication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DERIVED_TYPE_DEFINITION__SUBTYPE_INDICATION, null, msgs);
      msgs = basicSetSubtypeIndication(newSubtypeIndication, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DERIVED_TYPE_DEFINITION__SUBTYPE_INDICATION, newSubtypeIndication, newSubtypeIndication));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceList getInterfaceList()
  {
    return interfaceList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterfaceList(InterfaceList newInterfaceList, NotificationChain msgs)
  {
    InterfaceList oldInterfaceList = interfaceList;
    interfaceList = newInterfaceList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.DERIVED_TYPE_DEFINITION__INTERFACE_LIST, oldInterfaceList, newInterfaceList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfaceList(InterfaceList newInterfaceList)
  {
    if (newInterfaceList != interfaceList)
    {
      NotificationChain msgs = null;
      if (interfaceList != null)
        msgs = ((InternalEObject)interfaceList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DERIVED_TYPE_DEFINITION__INTERFACE_LIST, null, msgs);
      if (newInterfaceList != null)
        msgs = ((InternalEObject)newInterfaceList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DERIVED_TYPE_DEFINITION__INTERFACE_LIST, null, msgs);
      msgs = basicSetInterfaceList(newInterfaceList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DERIVED_TYPE_DEFINITION__INTERFACE_LIST, newInterfaceList, newInterfaceList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordExtensionPart getRecordExtentionPart()
  {
    return recordExtentionPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecordExtentionPart(RecordExtensionPart newRecordExtentionPart, NotificationChain msgs)
  {
    RecordExtensionPart oldRecordExtentionPart = recordExtentionPart;
    recordExtentionPart = newRecordExtentionPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.DERIVED_TYPE_DEFINITION__RECORD_EXTENTION_PART, oldRecordExtentionPart, newRecordExtentionPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecordExtentionPart(RecordExtensionPart newRecordExtentionPart)
  {
    if (newRecordExtentionPart != recordExtentionPart)
    {
      NotificationChain msgs = null;
      if (recordExtentionPart != null)
        msgs = ((InternalEObject)recordExtentionPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DERIVED_TYPE_DEFINITION__RECORD_EXTENTION_PART, null, msgs);
      if (newRecordExtentionPart != null)
        msgs = ((InternalEObject)newRecordExtentionPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DERIVED_TYPE_DEFINITION__RECORD_EXTENTION_PART, null, msgs);
      msgs = basicSetRecordExtentionPart(newRecordExtentionPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DERIVED_TYPE_DEFINITION__RECORD_EXTENTION_PART, newRecordExtentionPart, newRecordExtentionPart));
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
      case AdbPackage.DERIVED_TYPE_DEFINITION__SUBTYPE_INDICATION:
        return basicSetSubtypeIndication(null, msgs);
      case AdbPackage.DERIVED_TYPE_DEFINITION__INTERFACE_LIST:
        return basicSetInterfaceList(null, msgs);
      case AdbPackage.DERIVED_TYPE_DEFINITION__RECORD_EXTENTION_PART:
        return basicSetRecordExtentionPart(null, msgs);
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
      case AdbPackage.DERIVED_TYPE_DEFINITION__ABSTRACT:
        return getAbstract();
      case AdbPackage.DERIVED_TYPE_DEFINITION__LIMITED:
        return getLimited();
      case AdbPackage.DERIVED_TYPE_DEFINITION__SUBTYPE_INDICATION:
        return getSubtypeIndication();
      case AdbPackage.DERIVED_TYPE_DEFINITION__INTERFACE_LIST:
        return getInterfaceList();
      case AdbPackage.DERIVED_TYPE_DEFINITION__RECORD_EXTENTION_PART:
        return getRecordExtentionPart();
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
      case AdbPackage.DERIVED_TYPE_DEFINITION__ABSTRACT:
        setAbstract((String)newValue);
        return;
      case AdbPackage.DERIVED_TYPE_DEFINITION__LIMITED:
        setLimited((String)newValue);
        return;
      case AdbPackage.DERIVED_TYPE_DEFINITION__SUBTYPE_INDICATION:
        setSubtypeIndication((SubtypeIndication)newValue);
        return;
      case AdbPackage.DERIVED_TYPE_DEFINITION__INTERFACE_LIST:
        setInterfaceList((InterfaceList)newValue);
        return;
      case AdbPackage.DERIVED_TYPE_DEFINITION__RECORD_EXTENTION_PART:
        setRecordExtentionPart((RecordExtensionPart)newValue);
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
      case AdbPackage.DERIVED_TYPE_DEFINITION__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case AdbPackage.DERIVED_TYPE_DEFINITION__LIMITED:
        setLimited(LIMITED_EDEFAULT);
        return;
      case AdbPackage.DERIVED_TYPE_DEFINITION__SUBTYPE_INDICATION:
        setSubtypeIndication((SubtypeIndication)null);
        return;
      case AdbPackage.DERIVED_TYPE_DEFINITION__INTERFACE_LIST:
        setInterfaceList((InterfaceList)null);
        return;
      case AdbPackage.DERIVED_TYPE_DEFINITION__RECORD_EXTENTION_PART:
        setRecordExtentionPart((RecordExtensionPart)null);
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
      case AdbPackage.DERIVED_TYPE_DEFINITION__ABSTRACT:
        return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
      case AdbPackage.DERIVED_TYPE_DEFINITION__LIMITED:
        return LIMITED_EDEFAULT == null ? limited != null : !LIMITED_EDEFAULT.equals(limited);
      case AdbPackage.DERIVED_TYPE_DEFINITION__SUBTYPE_INDICATION:
        return subtypeIndication != null;
      case AdbPackage.DERIVED_TYPE_DEFINITION__INTERFACE_LIST:
        return interfaceList != null;
      case AdbPackage.DERIVED_TYPE_DEFINITION__RECORD_EXTENTION_PART:
        return recordExtentionPart != null;
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
    result.append(" (abstract: ");
    result.append(abstract_);
    result.append(", limited: ");
    result.append(limited);
    result.append(')');
    return result.toString();
  }

} //DerivedTypeDefinitionImpl
