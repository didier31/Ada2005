/**
 */
package org.xtext.ada2005.adb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.Guard;
import org.xtext.ada2005.adb.GuardedAlternative;
import org.xtext.ada2005.adb.SelectAlternative;
import org.xtext.ada2005.adb.SelectiveAccept;
import org.xtext.ada2005.adb.SequenceOfStatements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selective Accept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.SelectiveAcceptImpl#getSelectguard <em>Selectguard</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.SelectiveAcceptImpl#getSelectAlternative <em>Select Alternative</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.SelectiveAcceptImpl#getGuardedAlternatives <em>Guarded Alternatives</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.SelectiveAcceptImpl#getElseStatements <em>Else Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectiveAcceptImpl extends SelectStatementImpl implements SelectiveAccept
{
  /**
   * The cached value of the '{@link #getSelectguard() <em>Selectguard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectguard()
   * @generated
   * @ordered
   */
  protected Guard selectguard;

  /**
   * The cached value of the '{@link #getSelectAlternative() <em>Select Alternative</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectAlternative()
   * @generated
   * @ordered
   */
  protected SelectAlternative selectAlternative;

  /**
   * The cached value of the '{@link #getGuardedAlternatives() <em>Guarded Alternatives</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuardedAlternatives()
   * @generated
   * @ordered
   */
  protected EList<GuardedAlternative> guardedAlternatives;

  /**
   * The cached value of the '{@link #getElseStatements() <em>Else Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseStatements()
   * @generated
   * @ordered
   */
  protected SequenceOfStatements elseStatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectiveAcceptImpl()
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
    return AdbPackage.eINSTANCE.getSelectiveAccept();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Guard getSelectguard()
  {
    return selectguard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelectguard(Guard newSelectguard, NotificationChain msgs)
  {
    Guard oldSelectguard = selectguard;
    selectguard = newSelectguard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.SELECTIVE_ACCEPT__SELECTGUARD, oldSelectguard, newSelectguard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelectguard(Guard newSelectguard)
  {
    if (newSelectguard != selectguard)
    {
      NotificationChain msgs = null;
      if (selectguard != null)
        msgs = ((InternalEObject)selectguard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SELECTIVE_ACCEPT__SELECTGUARD, null, msgs);
      if (newSelectguard != null)
        msgs = ((InternalEObject)newSelectguard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SELECTIVE_ACCEPT__SELECTGUARD, null, msgs);
      msgs = basicSetSelectguard(newSelectguard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SELECTIVE_ACCEPT__SELECTGUARD, newSelectguard, newSelectguard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectAlternative getSelectAlternative()
  {
    return selectAlternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelectAlternative(SelectAlternative newSelectAlternative, NotificationChain msgs)
  {
    SelectAlternative oldSelectAlternative = selectAlternative;
    selectAlternative = newSelectAlternative;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.SELECTIVE_ACCEPT__SELECT_ALTERNATIVE, oldSelectAlternative, newSelectAlternative);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelectAlternative(SelectAlternative newSelectAlternative)
  {
    if (newSelectAlternative != selectAlternative)
    {
      NotificationChain msgs = null;
      if (selectAlternative != null)
        msgs = ((InternalEObject)selectAlternative).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SELECTIVE_ACCEPT__SELECT_ALTERNATIVE, null, msgs);
      if (newSelectAlternative != null)
        msgs = ((InternalEObject)newSelectAlternative).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SELECTIVE_ACCEPT__SELECT_ALTERNATIVE, null, msgs);
      msgs = basicSetSelectAlternative(newSelectAlternative, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SELECTIVE_ACCEPT__SELECT_ALTERNATIVE, newSelectAlternative, newSelectAlternative));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GuardedAlternative> getGuardedAlternatives()
  {
    if (guardedAlternatives == null)
    {
      guardedAlternatives = new EObjectContainmentEList<GuardedAlternative>(GuardedAlternative.class, this, AdbPackage.SELECTIVE_ACCEPT__GUARDED_ALTERNATIVES);
    }
    return guardedAlternatives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceOfStatements getElseStatements()
  {
    return elseStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseStatements(SequenceOfStatements newElseStatements, NotificationChain msgs)
  {
    SequenceOfStatements oldElseStatements = elseStatements;
    elseStatements = newElseStatements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.SELECTIVE_ACCEPT__ELSE_STATEMENTS, oldElseStatements, newElseStatements);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseStatements(SequenceOfStatements newElseStatements)
  {
    if (newElseStatements != elseStatements)
    {
      NotificationChain msgs = null;
      if (elseStatements != null)
        msgs = ((InternalEObject)elseStatements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SELECTIVE_ACCEPT__ELSE_STATEMENTS, null, msgs);
      if (newElseStatements != null)
        msgs = ((InternalEObject)newElseStatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SELECTIVE_ACCEPT__ELSE_STATEMENTS, null, msgs);
      msgs = basicSetElseStatements(newElseStatements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SELECTIVE_ACCEPT__ELSE_STATEMENTS, newElseStatements, newElseStatements));
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
      case AdbPackage.SELECTIVE_ACCEPT__SELECTGUARD:
        return basicSetSelectguard(null, msgs);
      case AdbPackage.SELECTIVE_ACCEPT__SELECT_ALTERNATIVE:
        return basicSetSelectAlternative(null, msgs);
      case AdbPackage.SELECTIVE_ACCEPT__GUARDED_ALTERNATIVES:
        return ((InternalEList<?>)getGuardedAlternatives()).basicRemove(otherEnd, msgs);
      case AdbPackage.SELECTIVE_ACCEPT__ELSE_STATEMENTS:
        return basicSetElseStatements(null, msgs);
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
      case AdbPackage.SELECTIVE_ACCEPT__SELECTGUARD:
        return getSelectguard();
      case AdbPackage.SELECTIVE_ACCEPT__SELECT_ALTERNATIVE:
        return getSelectAlternative();
      case AdbPackage.SELECTIVE_ACCEPT__GUARDED_ALTERNATIVES:
        return getGuardedAlternatives();
      case AdbPackage.SELECTIVE_ACCEPT__ELSE_STATEMENTS:
        return getElseStatements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AdbPackage.SELECTIVE_ACCEPT__SELECTGUARD:
        setSelectguard((Guard)newValue);
        return;
      case AdbPackage.SELECTIVE_ACCEPT__SELECT_ALTERNATIVE:
        setSelectAlternative((SelectAlternative)newValue);
        return;
      case AdbPackage.SELECTIVE_ACCEPT__GUARDED_ALTERNATIVES:
        getGuardedAlternatives().clear();
        getGuardedAlternatives().addAll((Collection<? extends GuardedAlternative>)newValue);
        return;
      case AdbPackage.SELECTIVE_ACCEPT__ELSE_STATEMENTS:
        setElseStatements((SequenceOfStatements)newValue);
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
      case AdbPackage.SELECTIVE_ACCEPT__SELECTGUARD:
        setSelectguard((Guard)null);
        return;
      case AdbPackage.SELECTIVE_ACCEPT__SELECT_ALTERNATIVE:
        setSelectAlternative((SelectAlternative)null);
        return;
      case AdbPackage.SELECTIVE_ACCEPT__GUARDED_ALTERNATIVES:
        getGuardedAlternatives().clear();
        return;
      case AdbPackage.SELECTIVE_ACCEPT__ELSE_STATEMENTS:
        setElseStatements((SequenceOfStatements)null);
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
      case AdbPackage.SELECTIVE_ACCEPT__SELECTGUARD:
        return selectguard != null;
      case AdbPackage.SELECTIVE_ACCEPT__SELECT_ALTERNATIVE:
        return selectAlternative != null;
      case AdbPackage.SELECTIVE_ACCEPT__GUARDED_ALTERNATIVES:
        return guardedAlternatives != null && !guardedAlternatives.isEmpty();
      case AdbPackage.SELECTIVE_ACCEPT__ELSE_STATEMENTS:
        return elseStatements != null;
    }
    return super.eIsSet(featureID);
  }

} //SelectiveAcceptImpl
