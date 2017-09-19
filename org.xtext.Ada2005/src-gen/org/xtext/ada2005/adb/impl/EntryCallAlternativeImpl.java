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
import org.xtext.ada2005.adb.EntryCallAlternative;
import org.xtext.ada2005.adb.ProcedureOrEntryCallStatement;
import org.xtext.ada2005.adb.SequenceOfStatements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Call Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.EntryCallAlternativeImpl#getCall <em>Call</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.EntryCallAlternativeImpl#getSequenceOfStatements <em>Sequence Of Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryCallAlternativeImpl extends MinimalEObjectImpl.Container implements EntryCallAlternative
{
  /**
   * The cached value of the '{@link #getCall() <em>Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCall()
   * @generated
   * @ordered
   */
  protected ProcedureOrEntryCallStatement call;

  /**
   * The cached value of the '{@link #getSequenceOfStatements() <em>Sequence Of Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSequenceOfStatements()
   * @generated
   * @ordered
   */
  protected SequenceOfStatements sequenceOfStatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntryCallAlternativeImpl()
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
    return AdbPackage.eINSTANCE.getEntryCallAlternative();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureOrEntryCallStatement getCall()
  {
    return call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCall(ProcedureOrEntryCallStatement newCall, NotificationChain msgs)
  {
    ProcedureOrEntryCallStatement oldCall = call;
    call = newCall;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_CALL_ALTERNATIVE__CALL, oldCall, newCall);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCall(ProcedureOrEntryCallStatement newCall)
  {
    if (newCall != call)
    {
      NotificationChain msgs = null;
      if (call != null)
        msgs = ((InternalEObject)call).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ENTRY_CALL_ALTERNATIVE__CALL, null, msgs);
      if (newCall != null)
        msgs = ((InternalEObject)newCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ENTRY_CALL_ALTERNATIVE__CALL, null, msgs);
      msgs = basicSetCall(newCall, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_CALL_ALTERNATIVE__CALL, newCall, newCall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceOfStatements getSequenceOfStatements()
  {
    return sequenceOfStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSequenceOfStatements(SequenceOfStatements newSequenceOfStatements, NotificationChain msgs)
  {
    SequenceOfStatements oldSequenceOfStatements = sequenceOfStatements;
    sequenceOfStatements = newSequenceOfStatements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_CALL_ALTERNATIVE__SEQUENCE_OF_STATEMENTS, oldSequenceOfStatements, newSequenceOfStatements);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSequenceOfStatements(SequenceOfStatements newSequenceOfStatements)
  {
    if (newSequenceOfStatements != sequenceOfStatements)
    {
      NotificationChain msgs = null;
      if (sequenceOfStatements != null)
        msgs = ((InternalEObject)sequenceOfStatements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ENTRY_CALL_ALTERNATIVE__SEQUENCE_OF_STATEMENTS, null, msgs);
      if (newSequenceOfStatements != null)
        msgs = ((InternalEObject)newSequenceOfStatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ENTRY_CALL_ALTERNATIVE__SEQUENCE_OF_STATEMENTS, null, msgs);
      msgs = basicSetSequenceOfStatements(newSequenceOfStatements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_CALL_ALTERNATIVE__SEQUENCE_OF_STATEMENTS, newSequenceOfStatements, newSequenceOfStatements));
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
      case AdbPackage.ENTRY_CALL_ALTERNATIVE__CALL:
        return basicSetCall(null, msgs);
      case AdbPackage.ENTRY_CALL_ALTERNATIVE__SEQUENCE_OF_STATEMENTS:
        return basicSetSequenceOfStatements(null, msgs);
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
      case AdbPackage.ENTRY_CALL_ALTERNATIVE__CALL:
        return getCall();
      case AdbPackage.ENTRY_CALL_ALTERNATIVE__SEQUENCE_OF_STATEMENTS:
        return getSequenceOfStatements();
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
      case AdbPackage.ENTRY_CALL_ALTERNATIVE__CALL:
        setCall((ProcedureOrEntryCallStatement)newValue);
        return;
      case AdbPackage.ENTRY_CALL_ALTERNATIVE__SEQUENCE_OF_STATEMENTS:
        setSequenceOfStatements((SequenceOfStatements)newValue);
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
      case AdbPackage.ENTRY_CALL_ALTERNATIVE__CALL:
        setCall((ProcedureOrEntryCallStatement)null);
        return;
      case AdbPackage.ENTRY_CALL_ALTERNATIVE__SEQUENCE_OF_STATEMENTS:
        setSequenceOfStatements((SequenceOfStatements)null);
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
      case AdbPackage.ENTRY_CALL_ALTERNATIVE__CALL:
        return call != null;
      case AdbPackage.ENTRY_CALL_ALTERNATIVE__SEQUENCE_OF_STATEMENTS:
        return sequenceOfStatements != null;
    }
    return super.eIsSet(featureID);
  }

} //EntryCallAlternativeImpl
