/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.ConditionalEntryCall;
import org.xtext.ada2005.adb.EntryCallAlternative;
import org.xtext.ada2005.adb.SequenceOfStatements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Entry Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.ConditionalEntryCallImpl#getEntryCallAlternative <em>Entry Call Alternative</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ConditionalEntryCallImpl#getElseSequenceOfStatements <em>Else Sequence Of Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalEntryCallImpl extends SelectStatementImpl implements ConditionalEntryCall
{
  /**
   * The cached value of the '{@link #getEntryCallAlternative() <em>Entry Call Alternative</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryCallAlternative()
   * @generated
   * @ordered
   */
  protected EntryCallAlternative entryCallAlternative;

  /**
   * The cached value of the '{@link #getElseSequenceOfStatements() <em>Else Sequence Of Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseSequenceOfStatements()
   * @generated
   * @ordered
   */
  protected SequenceOfStatements elseSequenceOfStatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionalEntryCallImpl()
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
    return AdbPackage.eINSTANCE.getConditionalEntryCall();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntryCallAlternative getEntryCallAlternative()
  {
    return entryCallAlternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntryCallAlternative(EntryCallAlternative newEntryCallAlternative, NotificationChain msgs)
  {
    EntryCallAlternative oldEntryCallAlternative = entryCallAlternative;
    entryCallAlternative = newEntryCallAlternative;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.CONDITIONAL_ENTRY_CALL__ENTRY_CALL_ALTERNATIVE, oldEntryCallAlternative, newEntryCallAlternative);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntryCallAlternative(EntryCallAlternative newEntryCallAlternative)
  {
    if (newEntryCallAlternative != entryCallAlternative)
    {
      NotificationChain msgs = null;
      if (entryCallAlternative != null)
        msgs = ((InternalEObject)entryCallAlternative).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.CONDITIONAL_ENTRY_CALL__ENTRY_CALL_ALTERNATIVE, null, msgs);
      if (newEntryCallAlternative != null)
        msgs = ((InternalEObject)newEntryCallAlternative).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.CONDITIONAL_ENTRY_CALL__ENTRY_CALL_ALTERNATIVE, null, msgs);
      msgs = basicSetEntryCallAlternative(newEntryCallAlternative, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.CONDITIONAL_ENTRY_CALL__ENTRY_CALL_ALTERNATIVE, newEntryCallAlternative, newEntryCallAlternative));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceOfStatements getElseSequenceOfStatements()
  {
    return elseSequenceOfStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseSequenceOfStatements(SequenceOfStatements newElseSequenceOfStatements, NotificationChain msgs)
  {
    SequenceOfStatements oldElseSequenceOfStatements = elseSequenceOfStatements;
    elseSequenceOfStatements = newElseSequenceOfStatements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.CONDITIONAL_ENTRY_CALL__ELSE_SEQUENCE_OF_STATEMENTS, oldElseSequenceOfStatements, newElseSequenceOfStatements);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseSequenceOfStatements(SequenceOfStatements newElseSequenceOfStatements)
  {
    if (newElseSequenceOfStatements != elseSequenceOfStatements)
    {
      NotificationChain msgs = null;
      if (elseSequenceOfStatements != null)
        msgs = ((InternalEObject)elseSequenceOfStatements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.CONDITIONAL_ENTRY_CALL__ELSE_SEQUENCE_OF_STATEMENTS, null, msgs);
      if (newElseSequenceOfStatements != null)
        msgs = ((InternalEObject)newElseSequenceOfStatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.CONDITIONAL_ENTRY_CALL__ELSE_SEQUENCE_OF_STATEMENTS, null, msgs);
      msgs = basicSetElseSequenceOfStatements(newElseSequenceOfStatements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.CONDITIONAL_ENTRY_CALL__ELSE_SEQUENCE_OF_STATEMENTS, newElseSequenceOfStatements, newElseSequenceOfStatements));
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
      case AdbPackage.CONDITIONAL_ENTRY_CALL__ENTRY_CALL_ALTERNATIVE:
        return basicSetEntryCallAlternative(null, msgs);
      case AdbPackage.CONDITIONAL_ENTRY_CALL__ELSE_SEQUENCE_OF_STATEMENTS:
        return basicSetElseSequenceOfStatements(null, msgs);
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
      case AdbPackage.CONDITIONAL_ENTRY_CALL__ENTRY_CALL_ALTERNATIVE:
        return getEntryCallAlternative();
      case AdbPackage.CONDITIONAL_ENTRY_CALL__ELSE_SEQUENCE_OF_STATEMENTS:
        return getElseSequenceOfStatements();
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
      case AdbPackage.CONDITIONAL_ENTRY_CALL__ENTRY_CALL_ALTERNATIVE:
        setEntryCallAlternative((EntryCallAlternative)newValue);
        return;
      case AdbPackage.CONDITIONAL_ENTRY_CALL__ELSE_SEQUENCE_OF_STATEMENTS:
        setElseSequenceOfStatements((SequenceOfStatements)newValue);
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
      case AdbPackage.CONDITIONAL_ENTRY_CALL__ENTRY_CALL_ALTERNATIVE:
        setEntryCallAlternative((EntryCallAlternative)null);
        return;
      case AdbPackage.CONDITIONAL_ENTRY_CALL__ELSE_SEQUENCE_OF_STATEMENTS:
        setElseSequenceOfStatements((SequenceOfStatements)null);
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
      case AdbPackage.CONDITIONAL_ENTRY_CALL__ENTRY_CALL_ALTERNATIVE:
        return entryCallAlternative != null;
      case AdbPackage.CONDITIONAL_ENTRY_CALL__ELSE_SEQUENCE_OF_STATEMENTS:
        return elseSequenceOfStatements != null;
    }
    return super.eIsSet(featureID);
  }

} //ConditionalEntryCallImpl
