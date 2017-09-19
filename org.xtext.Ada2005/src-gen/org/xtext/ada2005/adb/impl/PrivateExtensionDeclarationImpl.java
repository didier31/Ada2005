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
import org.xtext.ada2005.adb.InterfaceList;
import org.xtext.ada2005.adb.PrivateExtensionDeclaration;
import org.xtext.ada2005.adb.SubtypeIndication;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Private Extension Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.PrivateExtensionDeclarationImpl#getDiscriminantPart <em>Discriminant Part</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.PrivateExtensionDeclarationImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.PrivateExtensionDeclarationImpl#isLimited <em>Limited</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.PrivateExtensionDeclarationImpl#isSynchronized <em>Synchronized</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.PrivateExtensionDeclarationImpl#getAncestorSubtypeIndication <em>Ancestor Subtype Indication</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.PrivateExtensionDeclarationImpl#getInterfaceList <em>Interface List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrivateExtensionDeclarationImpl extends NewTypeDeclarationImpl implements PrivateExtensionDeclaration
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
   * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected boolean abstract_ = ABSTRACT_EDEFAULT;

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
   * The cached value of the '{@link #getAncestorSubtypeIndication() <em>Ancestor Subtype Indication</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAncestorSubtypeIndication()
   * @generated
   * @ordered
   */
  protected SubtypeIndication ancestorSubtypeIndication;

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
  protected PrivateExtensionDeclarationImpl()
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
    return AdbPackage.eINSTANCE.getPrivateExtensionDeclaration();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.PRIVATE_EXTENSION_DECLARATION__DISCRIMINANT_PART, oldDiscriminantPart, newDiscriminantPart);
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
        msgs = ((InternalEObject)discriminantPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PRIVATE_EXTENSION_DECLARATION__DISCRIMINANT_PART, null, msgs);
      if (newDiscriminantPart != null)
        msgs = ((InternalEObject)newDiscriminantPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PRIVATE_EXTENSION_DECLARATION__DISCRIMINANT_PART, null, msgs);
      msgs = basicSetDiscriminantPart(newDiscriminantPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PRIVATE_EXTENSION_DECLARATION__DISCRIMINANT_PART, newDiscriminantPart, newDiscriminantPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(boolean newAbstract)
  {
    boolean oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PRIVATE_EXTENSION_DECLARATION__ABSTRACT, oldAbstract, abstract_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PRIVATE_EXTENSION_DECLARATION__LIMITED, oldLimited, limited));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PRIVATE_EXTENSION_DECLARATION__SYNCHRONIZED, oldSynchronized, synchronized_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubtypeIndication getAncestorSubtypeIndication()
  {
    return ancestorSubtypeIndication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAncestorSubtypeIndication(SubtypeIndication newAncestorSubtypeIndication, NotificationChain msgs)
  {
    SubtypeIndication oldAncestorSubtypeIndication = ancestorSubtypeIndication;
    ancestorSubtypeIndication = newAncestorSubtypeIndication;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.PRIVATE_EXTENSION_DECLARATION__ANCESTOR_SUBTYPE_INDICATION, oldAncestorSubtypeIndication, newAncestorSubtypeIndication);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAncestorSubtypeIndication(SubtypeIndication newAncestorSubtypeIndication)
  {
    if (newAncestorSubtypeIndication != ancestorSubtypeIndication)
    {
      NotificationChain msgs = null;
      if (ancestorSubtypeIndication != null)
        msgs = ((InternalEObject)ancestorSubtypeIndication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PRIVATE_EXTENSION_DECLARATION__ANCESTOR_SUBTYPE_INDICATION, null, msgs);
      if (newAncestorSubtypeIndication != null)
        msgs = ((InternalEObject)newAncestorSubtypeIndication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PRIVATE_EXTENSION_DECLARATION__ANCESTOR_SUBTYPE_INDICATION, null, msgs);
      msgs = basicSetAncestorSubtypeIndication(newAncestorSubtypeIndication, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PRIVATE_EXTENSION_DECLARATION__ANCESTOR_SUBTYPE_INDICATION, newAncestorSubtypeIndication, newAncestorSubtypeIndication));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.PRIVATE_EXTENSION_DECLARATION__INTERFACE_LIST, oldInterfaceList, newInterfaceList);
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
        msgs = ((InternalEObject)interfaceList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PRIVATE_EXTENSION_DECLARATION__INTERFACE_LIST, null, msgs);
      if (newInterfaceList != null)
        msgs = ((InternalEObject)newInterfaceList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PRIVATE_EXTENSION_DECLARATION__INTERFACE_LIST, null, msgs);
      msgs = basicSetInterfaceList(newInterfaceList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PRIVATE_EXTENSION_DECLARATION__INTERFACE_LIST, newInterfaceList, newInterfaceList));
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
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__DISCRIMINANT_PART:
        return basicSetDiscriminantPart(null, msgs);
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__ANCESTOR_SUBTYPE_INDICATION:
        return basicSetAncestorSubtypeIndication(null, msgs);
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__INTERFACE_LIST:
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
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__DISCRIMINANT_PART:
        return getDiscriminantPart();
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__ABSTRACT:
        return isAbstract();
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__LIMITED:
        return isLimited();
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__SYNCHRONIZED:
        return isSynchronized();
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__ANCESTOR_SUBTYPE_INDICATION:
        return getAncestorSubtypeIndication();
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__INTERFACE_LIST:
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
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__DISCRIMINANT_PART:
        setDiscriminantPart((DiscriminantPart)newValue);
        return;
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__LIMITED:
        setLimited((Boolean)newValue);
        return;
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__SYNCHRONIZED:
        setSynchronized((Boolean)newValue);
        return;
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__ANCESTOR_SUBTYPE_INDICATION:
        setAncestorSubtypeIndication((SubtypeIndication)newValue);
        return;
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__INTERFACE_LIST:
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
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__DISCRIMINANT_PART:
        setDiscriminantPart((DiscriminantPart)null);
        return;
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__LIMITED:
        setLimited(LIMITED_EDEFAULT);
        return;
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__SYNCHRONIZED:
        setSynchronized(SYNCHRONIZED_EDEFAULT);
        return;
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__ANCESTOR_SUBTYPE_INDICATION:
        setAncestorSubtypeIndication((SubtypeIndication)null);
        return;
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__INTERFACE_LIST:
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
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__DISCRIMINANT_PART:
        return discriminantPart != null;
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__LIMITED:
        return limited != LIMITED_EDEFAULT;
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__SYNCHRONIZED:
        return synchronized_ != SYNCHRONIZED_EDEFAULT;
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__ANCESTOR_SUBTYPE_INDICATION:
        return ancestorSubtypeIndication != null;
      case AdbPackage.PRIVATE_EXTENSION_DECLARATION__INTERFACE_LIST:
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
    result.append(" (abstract: ");
    result.append(abstract_);
    result.append(", limited: ");
    result.append(limited);
    result.append(", synchronized: ");
    result.append(synchronized_);
    result.append(')');
    return result.toString();
  }

} //PrivateExtensionDeclarationImpl
