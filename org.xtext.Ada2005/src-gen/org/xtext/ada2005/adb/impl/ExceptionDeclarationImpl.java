/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.DefiningIdentifierList;
import org.xtext.ada2005.adb.ExceptionDeclaration;
import org.xtext.ada2005.adb.Name;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.ExceptionDeclarationImpl#getIdList <em>Id List</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ExceptionDeclarationImpl#getRenamedName <em>Renamed Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExceptionDeclarationImpl extends BasicDeclarationImpl implements ExceptionDeclaration
{
  /**
   * The cached value of the '{@link #getIdList() <em>Id List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdList()
   * @generated
   * @ordered
   */
  protected DefiningIdentifierList idList;

  /**
   * The cached value of the '{@link #getRenamedName() <em>Renamed Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRenamedName()
   * @generated
   * @ordered
   */
  protected Name renamedName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExceptionDeclarationImpl()
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
    return AdbPackage.eINSTANCE.getExceptionDeclaration();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefiningIdentifierList getIdList()
  {
    return idList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdList(DefiningIdentifierList newIdList, NotificationChain msgs)
  {
    DefiningIdentifierList oldIdList = idList;
    idList = newIdList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.EXCEPTION_DECLARATION__ID_LIST, oldIdList, newIdList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdList(DefiningIdentifierList newIdList)
  {
    if (newIdList != idList)
    {
      NotificationChain msgs = null;
      if (idList != null)
        msgs = ((InternalEObject)idList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.EXCEPTION_DECLARATION__ID_LIST, null, msgs);
      if (newIdList != null)
        msgs = ((InternalEObject)newIdList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.EXCEPTION_DECLARATION__ID_LIST, null, msgs);
      msgs = basicSetIdList(newIdList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.EXCEPTION_DECLARATION__ID_LIST, newIdList, newIdList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getRenamedName()
  {
    return renamedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRenamedName(Name newRenamedName, NotificationChain msgs)
  {
    Name oldRenamedName = renamedName;
    renamedName = newRenamedName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.EXCEPTION_DECLARATION__RENAMED_NAME, oldRenamedName, newRenamedName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRenamedName(Name newRenamedName)
  {
    if (newRenamedName != renamedName)
    {
      NotificationChain msgs = null;
      if (renamedName != null)
        msgs = ((InternalEObject)renamedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.EXCEPTION_DECLARATION__RENAMED_NAME, null, msgs);
      if (newRenamedName != null)
        msgs = ((InternalEObject)newRenamedName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.EXCEPTION_DECLARATION__RENAMED_NAME, null, msgs);
      msgs = basicSetRenamedName(newRenamedName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.EXCEPTION_DECLARATION__RENAMED_NAME, newRenamedName, newRenamedName));
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
      case AdbPackage.EXCEPTION_DECLARATION__ID_LIST:
        return basicSetIdList(null, msgs);
      case AdbPackage.EXCEPTION_DECLARATION__RENAMED_NAME:
        return basicSetRenamedName(null, msgs);
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
      case AdbPackage.EXCEPTION_DECLARATION__ID_LIST:
        return getIdList();
      case AdbPackage.EXCEPTION_DECLARATION__RENAMED_NAME:
        return getRenamedName();
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
      case AdbPackage.EXCEPTION_DECLARATION__ID_LIST:
        setIdList((DefiningIdentifierList)newValue);
        return;
      case AdbPackage.EXCEPTION_DECLARATION__RENAMED_NAME:
        setRenamedName((Name)newValue);
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
      case AdbPackage.EXCEPTION_DECLARATION__ID_LIST:
        setIdList((DefiningIdentifierList)null);
        return;
      case AdbPackage.EXCEPTION_DECLARATION__RENAMED_NAME:
        setRenamedName((Name)null);
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
      case AdbPackage.EXCEPTION_DECLARATION__ID_LIST:
        return idList != null;
      case AdbPackage.EXCEPTION_DECLARATION__RENAMED_NAME:
        return renamedName != null;
    }
    return super.eIsSet(featureID);
  }

} //ExceptionDeclarationImpl
