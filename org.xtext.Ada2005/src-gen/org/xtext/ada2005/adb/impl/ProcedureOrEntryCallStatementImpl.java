/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.Name;
import org.xtext.ada2005.adb.ProcedureOrEntryCallStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Or Entry Call Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.ProcedureOrEntryCallStatementImpl#getCallee <em>Callee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureOrEntryCallStatementImpl extends SimpleStatementImpl implements ProcedureOrEntryCallStatement
{
  /**
   * The cached value of the '{@link #getCallee() <em>Callee</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCallee()
   * @generated
   * @ordered
   */
  protected Name callee;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcedureOrEntryCallStatementImpl()
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
    return AdbPackage.eINSTANCE.getProcedureOrEntryCallStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getCallee()
  {
    return callee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCallee(Name newCallee, NotificationChain msgs)
  {
    Name oldCallee = callee;
    callee = newCallee;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.PROCEDURE_OR_ENTRY_CALL_STATEMENT__CALLEE, oldCallee, newCallee);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCallee(Name newCallee)
  {
    if (newCallee != callee)
    {
      NotificationChain msgs = null;
      if (callee != null)
        msgs = ((InternalEObject)callee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PROCEDURE_OR_ENTRY_CALL_STATEMENT__CALLEE, null, msgs);
      if (newCallee != null)
        msgs = ((InternalEObject)newCallee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PROCEDURE_OR_ENTRY_CALL_STATEMENT__CALLEE, null, msgs);
      msgs = basicSetCallee(newCallee, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PROCEDURE_OR_ENTRY_CALL_STATEMENT__CALLEE, newCallee, newCallee));
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
      case AdbPackage.PROCEDURE_OR_ENTRY_CALL_STATEMENT__CALLEE:
        return basicSetCallee(null, msgs);
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
      case AdbPackage.PROCEDURE_OR_ENTRY_CALL_STATEMENT__CALLEE:
        return getCallee();
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
      case AdbPackage.PROCEDURE_OR_ENTRY_CALL_STATEMENT__CALLEE:
        setCallee((Name)newValue);
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
      case AdbPackage.PROCEDURE_OR_ENTRY_CALL_STATEMENT__CALLEE:
        setCallee((Name)null);
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
      case AdbPackage.PROCEDURE_OR_ENTRY_CALL_STATEMENT__CALLEE:
        return callee != null;
    }
    return super.eIsSet(featureID);
  }

} //ProcedureOrEntryCallStatementImpl
