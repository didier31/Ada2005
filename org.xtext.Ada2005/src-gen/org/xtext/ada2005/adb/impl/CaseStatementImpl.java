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
import org.xtext.ada2005.adb.CaseStatement;
import org.xtext.ada2005.adb.CaseStatementAlternative;
import org.xtext.ada2005.adb.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.CaseStatementImpl#getCaseValue <em>Case Value</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.CaseStatementImpl#getCaseStatementAlternatives <em>Case Statement Alternatives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseStatementImpl extends CompoundStatementImpl implements CaseStatement
{
  /**
   * The cached value of the '{@link #getCaseValue() <em>Case Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaseValue()
   * @generated
   * @ordered
   */
  protected Expression caseValue;

  /**
   * The cached value of the '{@link #getCaseStatementAlternatives() <em>Case Statement Alternatives</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaseStatementAlternatives()
   * @generated
   * @ordered
   */
  protected EList<CaseStatementAlternative> caseStatementAlternatives;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CaseStatementImpl()
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
    return AdbPackage.eINSTANCE.getCaseStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getCaseValue()
  {
    return caseValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCaseValue(Expression newCaseValue, NotificationChain msgs)
  {
    Expression oldCaseValue = caseValue;
    caseValue = newCaseValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.CASE_STATEMENT__CASE_VALUE, oldCaseValue, newCaseValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaseValue(Expression newCaseValue)
  {
    if (newCaseValue != caseValue)
    {
      NotificationChain msgs = null;
      if (caseValue != null)
        msgs = ((InternalEObject)caseValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.CASE_STATEMENT__CASE_VALUE, null, msgs);
      if (newCaseValue != null)
        msgs = ((InternalEObject)newCaseValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.CASE_STATEMENT__CASE_VALUE, null, msgs);
      msgs = basicSetCaseValue(newCaseValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.CASE_STATEMENT__CASE_VALUE, newCaseValue, newCaseValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CaseStatementAlternative> getCaseStatementAlternatives()
  {
    if (caseStatementAlternatives == null)
    {
      caseStatementAlternatives = new EObjectContainmentEList<CaseStatementAlternative>(CaseStatementAlternative.class, this, AdbPackage.CASE_STATEMENT__CASE_STATEMENT_ALTERNATIVES);
    }
    return caseStatementAlternatives;
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
      case AdbPackage.CASE_STATEMENT__CASE_VALUE:
        return basicSetCaseValue(null, msgs);
      case AdbPackage.CASE_STATEMENT__CASE_STATEMENT_ALTERNATIVES:
        return ((InternalEList<?>)getCaseStatementAlternatives()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.CASE_STATEMENT__CASE_VALUE:
        return getCaseValue();
      case AdbPackage.CASE_STATEMENT__CASE_STATEMENT_ALTERNATIVES:
        return getCaseStatementAlternatives();
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
      case AdbPackage.CASE_STATEMENT__CASE_VALUE:
        setCaseValue((Expression)newValue);
        return;
      case AdbPackage.CASE_STATEMENT__CASE_STATEMENT_ALTERNATIVES:
        getCaseStatementAlternatives().clear();
        getCaseStatementAlternatives().addAll((Collection<? extends CaseStatementAlternative>)newValue);
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
      case AdbPackage.CASE_STATEMENT__CASE_VALUE:
        setCaseValue((Expression)null);
        return;
      case AdbPackage.CASE_STATEMENT__CASE_STATEMENT_ALTERNATIVES:
        getCaseStatementAlternatives().clear();
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
      case AdbPackage.CASE_STATEMENT__CASE_VALUE:
        return caseValue != null;
      case AdbPackage.CASE_STATEMENT__CASE_STATEMENT_ALTERNATIVES:
        return caseStatementAlternatives != null && !caseStatementAlternatives.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CaseStatementImpl
