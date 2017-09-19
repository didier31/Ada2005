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
import org.xtext.ada2005.adb.Expression;
import org.xtext.ada2005.adb.IfStatement;
import org.xtext.ada2005.adb.SequenceOfStatements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.IfStatementImpl#getIfCondition <em>If Condition</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.IfStatementImpl#getThenStatements <em>Then Statements</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.IfStatementImpl#getElsifConditions <em>Elsif Conditions</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.IfStatementImpl#getElsifStatements <em>Elsif Statements</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.IfStatementImpl#getElseStatements <em>Else Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStatementImpl extends CompoundStatementImpl implements IfStatement
{
  /**
   * The cached value of the '{@link #getIfCondition() <em>If Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfCondition()
   * @generated
   * @ordered
   */
  protected Expression ifCondition;

  /**
   * The cached value of the '{@link #getThenStatements() <em>Then Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThenStatements()
   * @generated
   * @ordered
   */
  protected SequenceOfStatements thenStatements;

  /**
   * The cached value of the '{@link #getElsifConditions() <em>Elsif Conditions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElsifConditions()
   * @generated
   * @ordered
   */
  protected EList<Expression> elsifConditions;

  /**
   * The cached value of the '{@link #getElsifStatements() <em>Elsif Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElsifStatements()
   * @generated
   * @ordered
   */
  protected EList<SequenceOfStatements> elsifStatements;

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
  protected IfStatementImpl()
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
    return AdbPackage.eINSTANCE.getIfStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getIfCondition()
  {
    return ifCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfCondition(Expression newIfCondition, NotificationChain msgs)
  {
    Expression oldIfCondition = ifCondition;
    ifCondition = newIfCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.IF_STATEMENT__IF_CONDITION, oldIfCondition, newIfCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfCondition(Expression newIfCondition)
  {
    if (newIfCondition != ifCondition)
    {
      NotificationChain msgs = null;
      if (ifCondition != null)
        msgs = ((InternalEObject)ifCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.IF_STATEMENT__IF_CONDITION, null, msgs);
      if (newIfCondition != null)
        msgs = ((InternalEObject)newIfCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.IF_STATEMENT__IF_CONDITION, null, msgs);
      msgs = basicSetIfCondition(newIfCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.IF_STATEMENT__IF_CONDITION, newIfCondition, newIfCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceOfStatements getThenStatements()
  {
    return thenStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThenStatements(SequenceOfStatements newThenStatements, NotificationChain msgs)
  {
    SequenceOfStatements oldThenStatements = thenStatements;
    thenStatements = newThenStatements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.IF_STATEMENT__THEN_STATEMENTS, oldThenStatements, newThenStatements);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThenStatements(SequenceOfStatements newThenStatements)
  {
    if (newThenStatements != thenStatements)
    {
      NotificationChain msgs = null;
      if (thenStatements != null)
        msgs = ((InternalEObject)thenStatements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.IF_STATEMENT__THEN_STATEMENTS, null, msgs);
      if (newThenStatements != null)
        msgs = ((InternalEObject)newThenStatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.IF_STATEMENT__THEN_STATEMENTS, null, msgs);
      msgs = basicSetThenStatements(newThenStatements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.IF_STATEMENT__THEN_STATEMENTS, newThenStatements, newThenStatements));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getElsifConditions()
  {
    if (elsifConditions == null)
    {
      elsifConditions = new EObjectContainmentEList<Expression>(Expression.class, this, AdbPackage.IF_STATEMENT__ELSIF_CONDITIONS);
    }
    return elsifConditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SequenceOfStatements> getElsifStatements()
  {
    if (elsifStatements == null)
    {
      elsifStatements = new EObjectContainmentEList<SequenceOfStatements>(SequenceOfStatements.class, this, AdbPackage.IF_STATEMENT__ELSIF_STATEMENTS);
    }
    return elsifStatements;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.IF_STATEMENT__ELSE_STATEMENTS, oldElseStatements, newElseStatements);
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
        msgs = ((InternalEObject)elseStatements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.IF_STATEMENT__ELSE_STATEMENTS, null, msgs);
      if (newElseStatements != null)
        msgs = ((InternalEObject)newElseStatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.IF_STATEMENT__ELSE_STATEMENTS, null, msgs);
      msgs = basicSetElseStatements(newElseStatements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.IF_STATEMENT__ELSE_STATEMENTS, newElseStatements, newElseStatements));
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
      case AdbPackage.IF_STATEMENT__IF_CONDITION:
        return basicSetIfCondition(null, msgs);
      case AdbPackage.IF_STATEMENT__THEN_STATEMENTS:
        return basicSetThenStatements(null, msgs);
      case AdbPackage.IF_STATEMENT__ELSIF_CONDITIONS:
        return ((InternalEList<?>)getElsifConditions()).basicRemove(otherEnd, msgs);
      case AdbPackage.IF_STATEMENT__ELSIF_STATEMENTS:
        return ((InternalEList<?>)getElsifStatements()).basicRemove(otherEnd, msgs);
      case AdbPackage.IF_STATEMENT__ELSE_STATEMENTS:
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
      case AdbPackage.IF_STATEMENT__IF_CONDITION:
        return getIfCondition();
      case AdbPackage.IF_STATEMENT__THEN_STATEMENTS:
        return getThenStatements();
      case AdbPackage.IF_STATEMENT__ELSIF_CONDITIONS:
        return getElsifConditions();
      case AdbPackage.IF_STATEMENT__ELSIF_STATEMENTS:
        return getElsifStatements();
      case AdbPackage.IF_STATEMENT__ELSE_STATEMENTS:
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
      case AdbPackage.IF_STATEMENT__IF_CONDITION:
        setIfCondition((Expression)newValue);
        return;
      case AdbPackage.IF_STATEMENT__THEN_STATEMENTS:
        setThenStatements((SequenceOfStatements)newValue);
        return;
      case AdbPackage.IF_STATEMENT__ELSIF_CONDITIONS:
        getElsifConditions().clear();
        getElsifConditions().addAll((Collection<? extends Expression>)newValue);
        return;
      case AdbPackage.IF_STATEMENT__ELSIF_STATEMENTS:
        getElsifStatements().clear();
        getElsifStatements().addAll((Collection<? extends SequenceOfStatements>)newValue);
        return;
      case AdbPackage.IF_STATEMENT__ELSE_STATEMENTS:
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
      case AdbPackage.IF_STATEMENT__IF_CONDITION:
        setIfCondition((Expression)null);
        return;
      case AdbPackage.IF_STATEMENT__THEN_STATEMENTS:
        setThenStatements((SequenceOfStatements)null);
        return;
      case AdbPackage.IF_STATEMENT__ELSIF_CONDITIONS:
        getElsifConditions().clear();
        return;
      case AdbPackage.IF_STATEMENT__ELSIF_STATEMENTS:
        getElsifStatements().clear();
        return;
      case AdbPackage.IF_STATEMENT__ELSE_STATEMENTS:
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
      case AdbPackage.IF_STATEMENT__IF_CONDITION:
        return ifCondition != null;
      case AdbPackage.IF_STATEMENT__THEN_STATEMENTS:
        return thenStatements != null;
      case AdbPackage.IF_STATEMENT__ELSIF_CONDITIONS:
        return elsifConditions != null && !elsifConditions.isEmpty();
      case AdbPackage.IF_STATEMENT__ELSIF_STATEMENTS:
        return elsifStatements != null && !elsifStatements.isEmpty();
      case AdbPackage.IF_STATEMENT__ELSE_STATEMENTS:
        return elseStatements != null;
    }
    return super.eIsSet(featureID);
  }

} //IfStatementImpl
