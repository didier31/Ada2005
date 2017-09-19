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
import org.xtext.ada2005.adb.KnownDiscriminantPart;
import org.xtext.ada2005.adb.TaskDeclaration;
import org.xtext.ada2005.adb.TaskDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.TaskDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.TaskDeclarationImpl#getKnownDiscriminantPart <em>Known Discriminant Part</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.TaskDeclarationImpl#getInterfaceList <em>Interface List</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.TaskDeclarationImpl#getTaskDefinition <em>Task Definition</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.TaskDeclarationImpl#getEndid <em>Endid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskDeclarationImpl extends BasicDeclarationImpl implements TaskDeclaration
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
   * The cached value of the '{@link #getKnownDiscriminantPart() <em>Known Discriminant Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKnownDiscriminantPart()
   * @generated
   * @ordered
   */
  protected KnownDiscriminantPart knownDiscriminantPart;

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
   * The cached value of the '{@link #getTaskDefinition() <em>Task Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskDefinition()
   * @generated
   * @ordered
   */
  protected TaskDefinition taskDefinition;

  /**
   * The cached value of the '{@link #getEndid() <em>Endid</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndid()
   * @generated
   * @ordered
   */
  protected TaskDeclaration endid;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskDeclarationImpl()
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
    return AdbPackage.eINSTANCE.getTaskDeclaration();
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.TASK_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KnownDiscriminantPart getKnownDiscriminantPart()
  {
    return knownDiscriminantPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKnownDiscriminantPart(KnownDiscriminantPart newKnownDiscriminantPart, NotificationChain msgs)
  {
    KnownDiscriminantPart oldKnownDiscriminantPart = knownDiscriminantPart;
    knownDiscriminantPart = newKnownDiscriminantPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.TASK_DECLARATION__KNOWN_DISCRIMINANT_PART, oldKnownDiscriminantPart, newKnownDiscriminantPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKnownDiscriminantPart(KnownDiscriminantPart newKnownDiscriminantPart)
  {
    if (newKnownDiscriminantPart != knownDiscriminantPart)
    {
      NotificationChain msgs = null;
      if (knownDiscriminantPart != null)
        msgs = ((InternalEObject)knownDiscriminantPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.TASK_DECLARATION__KNOWN_DISCRIMINANT_PART, null, msgs);
      if (newKnownDiscriminantPart != null)
        msgs = ((InternalEObject)newKnownDiscriminantPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.TASK_DECLARATION__KNOWN_DISCRIMINANT_PART, null, msgs);
      msgs = basicSetKnownDiscriminantPart(newKnownDiscriminantPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.TASK_DECLARATION__KNOWN_DISCRIMINANT_PART, newKnownDiscriminantPart, newKnownDiscriminantPart));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.TASK_DECLARATION__INTERFACE_LIST, oldInterfaceList, newInterfaceList);
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
        msgs = ((InternalEObject)interfaceList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.TASK_DECLARATION__INTERFACE_LIST, null, msgs);
      if (newInterfaceList != null)
        msgs = ((InternalEObject)newInterfaceList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.TASK_DECLARATION__INTERFACE_LIST, null, msgs);
      msgs = basicSetInterfaceList(newInterfaceList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.TASK_DECLARATION__INTERFACE_LIST, newInterfaceList, newInterfaceList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskDefinition getTaskDefinition()
  {
    return taskDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTaskDefinition(TaskDefinition newTaskDefinition, NotificationChain msgs)
  {
    TaskDefinition oldTaskDefinition = taskDefinition;
    taskDefinition = newTaskDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.TASK_DECLARATION__TASK_DEFINITION, oldTaskDefinition, newTaskDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTaskDefinition(TaskDefinition newTaskDefinition)
  {
    if (newTaskDefinition != taskDefinition)
    {
      NotificationChain msgs = null;
      if (taskDefinition != null)
        msgs = ((InternalEObject)taskDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.TASK_DECLARATION__TASK_DEFINITION, null, msgs);
      if (newTaskDefinition != null)
        msgs = ((InternalEObject)newTaskDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.TASK_DECLARATION__TASK_DEFINITION, null, msgs);
      msgs = basicSetTaskDefinition(newTaskDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.TASK_DECLARATION__TASK_DEFINITION, newTaskDefinition, newTaskDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskDeclaration getEndid()
  {
    if (endid != null && endid.eIsProxy())
    {
      InternalEObject oldEndid = (InternalEObject)endid;
      endid = (TaskDeclaration)eResolveProxy(oldEndid);
      if (endid != oldEndid)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdbPackage.TASK_DECLARATION__ENDID, oldEndid, endid));
      }
    }
    return endid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskDeclaration basicGetEndid()
  {
    return endid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndid(TaskDeclaration newEndid)
  {
    TaskDeclaration oldEndid = endid;
    endid = newEndid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.TASK_DECLARATION__ENDID, oldEndid, endid));
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
      case AdbPackage.TASK_DECLARATION__KNOWN_DISCRIMINANT_PART:
        return basicSetKnownDiscriminantPart(null, msgs);
      case AdbPackage.TASK_DECLARATION__INTERFACE_LIST:
        return basicSetInterfaceList(null, msgs);
      case AdbPackage.TASK_DECLARATION__TASK_DEFINITION:
        return basicSetTaskDefinition(null, msgs);
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
      case AdbPackage.TASK_DECLARATION__NAME:
        return getName();
      case AdbPackage.TASK_DECLARATION__KNOWN_DISCRIMINANT_PART:
        return getKnownDiscriminantPart();
      case AdbPackage.TASK_DECLARATION__INTERFACE_LIST:
        return getInterfaceList();
      case AdbPackage.TASK_DECLARATION__TASK_DEFINITION:
        return getTaskDefinition();
      case AdbPackage.TASK_DECLARATION__ENDID:
        if (resolve) return getEndid();
        return basicGetEndid();
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
      case AdbPackage.TASK_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case AdbPackage.TASK_DECLARATION__KNOWN_DISCRIMINANT_PART:
        setKnownDiscriminantPart((KnownDiscriminantPart)newValue);
        return;
      case AdbPackage.TASK_DECLARATION__INTERFACE_LIST:
        setInterfaceList((InterfaceList)newValue);
        return;
      case AdbPackage.TASK_DECLARATION__TASK_DEFINITION:
        setTaskDefinition((TaskDefinition)newValue);
        return;
      case AdbPackage.TASK_DECLARATION__ENDID:
        setEndid((TaskDeclaration)newValue);
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
      case AdbPackage.TASK_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdbPackage.TASK_DECLARATION__KNOWN_DISCRIMINANT_PART:
        setKnownDiscriminantPart((KnownDiscriminantPart)null);
        return;
      case AdbPackage.TASK_DECLARATION__INTERFACE_LIST:
        setInterfaceList((InterfaceList)null);
        return;
      case AdbPackage.TASK_DECLARATION__TASK_DEFINITION:
        setTaskDefinition((TaskDefinition)null);
        return;
      case AdbPackage.TASK_DECLARATION__ENDID:
        setEndid((TaskDeclaration)null);
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
      case AdbPackage.TASK_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdbPackage.TASK_DECLARATION__KNOWN_DISCRIMINANT_PART:
        return knownDiscriminantPart != null;
      case AdbPackage.TASK_DECLARATION__INTERFACE_LIST:
        return interfaceList != null;
      case AdbPackage.TASK_DECLARATION__TASK_DEFINITION:
        return taskDefinition != null;
      case AdbPackage.TASK_DECLARATION__ENDID:
        return endid != null;
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

} //TaskDeclarationImpl
