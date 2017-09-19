/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.InterfaceList;
import org.xtext.ada2005.adb.ProtectedDefinition;
import org.xtext.ada2005.adb.SingleProtectedDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Protected Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.SingleProtectedDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.SingleProtectedDeclarationImpl#getInterfaceList <em>Interface List</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.SingleProtectedDeclarationImpl#getProtectedDefinition <em>Protected Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleProtectedDeclarationImpl extends ObjectDeclarationImpl implements SingleProtectedDeclaration
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The cached value of the '{@link #getProtectedDefinition() <em>Protected Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtectedDefinition()
   * @generated
   * @ordered
   */
  protected ProtectedDefinition protectedDefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SingleProtectedDeclarationImpl()
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
    return AdbPackage.eINSTANCE.getSingleProtectedDeclaration();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SINGLE_PROTECTED_DECLARATION__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.SINGLE_PROTECTED_DECLARATION__INTERFACE_LIST, oldInterfaceList, newInterfaceList);
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
        msgs = ((InternalEObject)interfaceList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SINGLE_PROTECTED_DECLARATION__INTERFACE_LIST, null, msgs);
      if (newInterfaceList != null)
        msgs = ((InternalEObject)newInterfaceList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SINGLE_PROTECTED_DECLARATION__INTERFACE_LIST, null, msgs);
      msgs = basicSetInterfaceList(newInterfaceList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SINGLE_PROTECTED_DECLARATION__INTERFACE_LIST, newInterfaceList, newInterfaceList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtectedDefinition getProtectedDefinition()
  {
    return protectedDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProtectedDefinition(ProtectedDefinition newProtectedDefinition, NotificationChain msgs)
  {
    ProtectedDefinition oldProtectedDefinition = protectedDefinition;
    protectedDefinition = newProtectedDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.SINGLE_PROTECTED_DECLARATION__PROTECTED_DEFINITION, oldProtectedDefinition, newProtectedDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProtectedDefinition(ProtectedDefinition newProtectedDefinition)
  {
    if (newProtectedDefinition != protectedDefinition)
    {
      NotificationChain msgs = null;
      if (protectedDefinition != null)
        msgs = ((InternalEObject)protectedDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SINGLE_PROTECTED_DECLARATION__PROTECTED_DEFINITION, null, msgs);
      if (newProtectedDefinition != null)
        msgs = ((InternalEObject)newProtectedDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SINGLE_PROTECTED_DECLARATION__PROTECTED_DEFINITION, null, msgs);
      msgs = basicSetProtectedDefinition(newProtectedDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SINGLE_PROTECTED_DECLARATION__PROTECTED_DEFINITION, newProtectedDefinition, newProtectedDefinition));
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
      case AdbPackage.SINGLE_PROTECTED_DECLARATION__INTERFACE_LIST:
        return basicSetInterfaceList(null, msgs);
      case AdbPackage.SINGLE_PROTECTED_DECLARATION__PROTECTED_DEFINITION:
        return basicSetProtectedDefinition(null, msgs);
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
      case AdbPackage.SINGLE_PROTECTED_DECLARATION__NAME:
        return getName();
      case AdbPackage.SINGLE_PROTECTED_DECLARATION__INTERFACE_LIST:
        return getInterfaceList();
      case AdbPackage.SINGLE_PROTECTED_DECLARATION__PROTECTED_DEFINITION:
        return getProtectedDefinition();
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
      case AdbPackage.SINGLE_PROTECTED_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case AdbPackage.SINGLE_PROTECTED_DECLARATION__INTERFACE_LIST:
        setInterfaceList((InterfaceList)newValue);
        return;
      case AdbPackage.SINGLE_PROTECTED_DECLARATION__PROTECTED_DEFINITION:
        setProtectedDefinition((ProtectedDefinition)newValue);
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
      case AdbPackage.SINGLE_PROTECTED_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdbPackage.SINGLE_PROTECTED_DECLARATION__INTERFACE_LIST:
        setInterfaceList((InterfaceList)null);
        return;
      case AdbPackage.SINGLE_PROTECTED_DECLARATION__PROTECTED_DEFINITION:
        setProtectedDefinition((ProtectedDefinition)null);
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
      case AdbPackage.SINGLE_PROTECTED_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdbPackage.SINGLE_PROTECTED_DECLARATION__INTERFACE_LIST:
        return interfaceList != null;
      case AdbPackage.SINGLE_PROTECTED_DECLARATION__PROTECTED_DEFINITION:
        return protectedDefinition != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SingleProtectedDeclarationImpl
