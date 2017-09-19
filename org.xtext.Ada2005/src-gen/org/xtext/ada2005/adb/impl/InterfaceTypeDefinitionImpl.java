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
import org.xtext.ada2005.adb.InterfaceTypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.InterfaceTypeDefinitionImpl#isLimited <em>Limited</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.InterfaceTypeDefinitionImpl#isTask <em>Task</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.InterfaceTypeDefinitionImpl#isProtected <em>Protected</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.InterfaceTypeDefinitionImpl#isSynchro <em>Synchro</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.InterfaceTypeDefinitionImpl#getInterfaceList <em>Interface List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceTypeDefinitionImpl extends FormalTypeDefinitionImpl implements InterfaceTypeDefinition
{
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
   * The default value of the '{@link #isTask() <em>Task</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTask()
   * @generated
   * @ordered
   */
  protected static final boolean TASK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTask() <em>Task</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTask()
   * @generated
   * @ordered
   */
  protected boolean task = TASK_EDEFAULT;

  /**
   * The default value of the '{@link #isProtected() <em>Protected</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProtected()
   * @generated
   * @ordered
   */
  protected static final boolean PROTECTED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isProtected() <em>Protected</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProtected()
   * @generated
   * @ordered
   */
  protected boolean protected_ = PROTECTED_EDEFAULT;

  /**
   * The default value of the '{@link #isSynchro() <em>Synchro</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSynchro()
   * @generated
   * @ordered
   */
  protected static final boolean SYNCHRO_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSynchro() <em>Synchro</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSynchro()
   * @generated
   * @ordered
   */
  protected boolean synchro = SYNCHRO_EDEFAULT;

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
  protected InterfaceTypeDefinitionImpl()
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
    return AdbPackage.eINSTANCE.getInterfaceTypeDefinition();
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.INTERFACE_TYPE_DEFINITION__LIMITED, oldLimited, limited));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTask()
  {
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTask(boolean newTask)
  {
    boolean oldTask = task;
    task = newTask;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.INTERFACE_TYPE_DEFINITION__TASK, oldTask, task));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isProtected()
  {
    return protected_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProtected(boolean newProtected)
  {
    boolean oldProtected = protected_;
    protected_ = newProtected;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.INTERFACE_TYPE_DEFINITION__PROTECTED, oldProtected, protected_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSynchro()
  {
    return synchro;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSynchro(boolean newSynchro)
  {
    boolean oldSynchro = synchro;
    synchro = newSynchro;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.INTERFACE_TYPE_DEFINITION__SYNCHRO, oldSynchro, synchro));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.INTERFACE_TYPE_DEFINITION__INTERFACE_LIST, oldInterfaceList, newInterfaceList);
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
        msgs = ((InternalEObject)interfaceList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.INTERFACE_TYPE_DEFINITION__INTERFACE_LIST, null, msgs);
      if (newInterfaceList != null)
        msgs = ((InternalEObject)newInterfaceList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.INTERFACE_TYPE_DEFINITION__INTERFACE_LIST, null, msgs);
      msgs = basicSetInterfaceList(newInterfaceList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.INTERFACE_TYPE_DEFINITION__INTERFACE_LIST, newInterfaceList, newInterfaceList));
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
      case AdbPackage.INTERFACE_TYPE_DEFINITION__INTERFACE_LIST:
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
      case AdbPackage.INTERFACE_TYPE_DEFINITION__LIMITED:
        return isLimited();
      case AdbPackage.INTERFACE_TYPE_DEFINITION__TASK:
        return isTask();
      case AdbPackage.INTERFACE_TYPE_DEFINITION__PROTECTED:
        return isProtected();
      case AdbPackage.INTERFACE_TYPE_DEFINITION__SYNCHRO:
        return isSynchro();
      case AdbPackage.INTERFACE_TYPE_DEFINITION__INTERFACE_LIST:
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
      case AdbPackage.INTERFACE_TYPE_DEFINITION__LIMITED:
        setLimited((Boolean)newValue);
        return;
      case AdbPackage.INTERFACE_TYPE_DEFINITION__TASK:
        setTask((Boolean)newValue);
        return;
      case AdbPackage.INTERFACE_TYPE_DEFINITION__PROTECTED:
        setProtected((Boolean)newValue);
        return;
      case AdbPackage.INTERFACE_TYPE_DEFINITION__SYNCHRO:
        setSynchro((Boolean)newValue);
        return;
      case AdbPackage.INTERFACE_TYPE_DEFINITION__INTERFACE_LIST:
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
      case AdbPackage.INTERFACE_TYPE_DEFINITION__LIMITED:
        setLimited(LIMITED_EDEFAULT);
        return;
      case AdbPackage.INTERFACE_TYPE_DEFINITION__TASK:
        setTask(TASK_EDEFAULT);
        return;
      case AdbPackage.INTERFACE_TYPE_DEFINITION__PROTECTED:
        setProtected(PROTECTED_EDEFAULT);
        return;
      case AdbPackage.INTERFACE_TYPE_DEFINITION__SYNCHRO:
        setSynchro(SYNCHRO_EDEFAULT);
        return;
      case AdbPackage.INTERFACE_TYPE_DEFINITION__INTERFACE_LIST:
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
      case AdbPackage.INTERFACE_TYPE_DEFINITION__LIMITED:
        return limited != LIMITED_EDEFAULT;
      case AdbPackage.INTERFACE_TYPE_DEFINITION__TASK:
        return task != TASK_EDEFAULT;
      case AdbPackage.INTERFACE_TYPE_DEFINITION__PROTECTED:
        return protected_ != PROTECTED_EDEFAULT;
      case AdbPackage.INTERFACE_TYPE_DEFINITION__SYNCHRO:
        return synchro != SYNCHRO_EDEFAULT;
      case AdbPackage.INTERFACE_TYPE_DEFINITION__INTERFACE_LIST:
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
    result.append(" (limited: ");
    result.append(limited);
    result.append(", task: ");
    result.append(task);
    result.append(", protected: ");
    result.append(protected_);
    result.append(", synchro: ");
    result.append(synchro);
    result.append(')');
    return result.toString();
  }

} //InterfaceTypeDefinitionImpl
