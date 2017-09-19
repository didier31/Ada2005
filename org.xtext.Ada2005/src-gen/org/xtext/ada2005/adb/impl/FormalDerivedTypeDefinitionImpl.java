/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.FormalDerivedTypeDefinition;
import org.xtext.ada2005.adb.InterfaceList;
import org.xtext.ada2005.adb.Name;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Derived Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalDerivedTypeDefinitionImpl#getAbsract <em>Absract</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalDerivedTypeDefinitionImpl#isLimited <em>Limited</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalDerivedTypeDefinitionImpl#isSynchronized <em>Synchronized</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalDerivedTypeDefinitionImpl#getSubtypeMark <em>Subtype Mark</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalDerivedTypeDefinitionImpl#getInterfaceList <em>Interface List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormalDerivedTypeDefinitionImpl extends FormalTypeDefinitionImpl implements FormalDerivedTypeDefinition
{
  /**
   * The default value of the '{@link #getAbsract() <em>Absract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbsract()
   * @generated
   * @ordered
   */
  protected static final String ABSRACT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAbsract() <em>Absract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbsract()
   * @generated
   * @ordered
   */
  protected String absract = ABSRACT_EDEFAULT;

  /**
   * The default value of the '{@link #isLimited() <em>Limited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLimited()
   * @generated
   * @ordered
   */
  protected static final boolean LIMITED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLimited() <em>Limited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLimited()
   * @generated
   * @ordered
   */
  protected boolean limited = LIMITED_EDEFAULT;

  /**
   * The default value of the '{@link #isSynchronized() <em>Synchronized</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSynchronized()
   * @generated
   * @ordered
   */
  protected static final boolean SYNCHRONIZED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSynchronized() <em>Synchronized</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSynchronized()
   * @generated
   * @ordered
   */
  protected boolean synchronized_ = SYNCHRONIZED_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubtypeMark() <em>Subtype Mark</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtypeMark()
   * @generated
   * @ordered
   */
  protected Name subtypeMark;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormalDerivedTypeDefinitionImpl()
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
    return AdbPackage.eINSTANCE.getFormalDerivedTypeDefinition();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAbsract()
  {
    return absract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbsract(String newAbsract)
  {
    String oldAbsract = absract;
    absract = newAbsract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__ABSRACT, oldAbsract, absract));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLimited()
  {
    return limited;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLimited(boolean newLimited)
  {
    boolean oldLimited = limited;
    limited = newLimited;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__LIMITED, oldLimited, limited));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSynchronized()
  {
    return synchronized_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSynchronized(boolean newSynchronized)
  {
    boolean oldSynchronized = synchronized_;
    synchronized_ = newSynchronized;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__SYNCHRONIZED, oldSynchronized, synchronized_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getSubtypeMark()
  {
    return subtypeMark;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubtypeMark(Name newSubtypeMark, NotificationChain msgs)
  {
    Name oldSubtypeMark = subtypeMark;
    subtypeMark = newSubtypeMark;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__SUBTYPE_MARK, oldSubtypeMark, newSubtypeMark);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubtypeMark(Name newSubtypeMark)
  {
    if (newSubtypeMark != subtypeMark)
    {
      NotificationChain msgs = null;
      if (subtypeMark != null)
        msgs = ((InternalEObject)subtypeMark).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__SUBTYPE_MARK, null, msgs);
      if (newSubtypeMark != null)
        msgs = ((InternalEObject)newSubtypeMark).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__SUBTYPE_MARK, null, msgs);
      msgs = basicSetSubtypeMark(newSubtypeMark, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__SUBTYPE_MARK, newSubtypeMark, newSubtypeMark));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__INTERFACE_LIST, oldInterfaceList, newInterfaceList);
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
        msgs = ((InternalEObject)interfaceList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__INTERFACE_LIST, null, msgs);
      if (newInterfaceList != null)
        msgs = ((InternalEObject)newInterfaceList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__INTERFACE_LIST, null, msgs);
      msgs = basicSetInterfaceList(newInterfaceList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__INTERFACE_LIST, newInterfaceList, newInterfaceList));
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
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__SUBTYPE_MARK:
        return basicSetSubtypeMark(null, msgs);
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__INTERFACE_LIST:
        return basicSetInterfaceList(null, msgs);
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
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__ABSRACT:
        return getAbsract();
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__LIMITED:
        return isLimited();
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__SYNCHRONIZED:
        return isSynchronized();
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__SUBTYPE_MARK:
        return getSubtypeMark();
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__INTERFACE_LIST:
        return getInterfaceList();
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
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__ABSRACT:
        setAbsract((String)newValue);
        return;
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__LIMITED:
        setLimited((Boolean)newValue);
        return;
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__SYNCHRONIZED:
        setSynchronized((Boolean)newValue);
        return;
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__SUBTYPE_MARK:
        setSubtypeMark((Name)newValue);
        return;
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__INTERFACE_LIST:
        setInterfaceList((InterfaceList)newValue);
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
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__ABSRACT:
        setAbsract(ABSRACT_EDEFAULT);
        return;
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__LIMITED:
        setLimited(LIMITED_EDEFAULT);
        return;
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__SYNCHRONIZED:
        setSynchronized(SYNCHRONIZED_EDEFAULT);
        return;
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__SUBTYPE_MARK:
        setSubtypeMark((Name)null);
        return;
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__INTERFACE_LIST:
        setInterfaceList((InterfaceList)null);
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
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__ABSRACT:
        return ABSRACT_EDEFAULT == null ? absract != null : !ABSRACT_EDEFAULT.equals(absract);
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__LIMITED:
        return limited != LIMITED_EDEFAULT;
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__SYNCHRONIZED:
        return synchronized_ != SYNCHRONIZED_EDEFAULT;
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__SUBTYPE_MARK:
        return subtypeMark != null;
      case AdbPackage.FORMAL_DERIVED_TYPE_DEFINITION__INTERFACE_LIST:
        return interfaceList != null;
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
    result.append(" (absract: ");
    result.append(absract);
    result.append(", limited: ");
    result.append(limited);
    result.append(", synchronized: ");
    result.append(synchronized_);
    result.append(')');
    return result.toString();
  }

} //FormalDerivedTypeDefinitionImpl
