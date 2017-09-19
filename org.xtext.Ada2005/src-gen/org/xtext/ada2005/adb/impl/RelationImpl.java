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
import org.xtext.ada2005.adb.Membership;
import org.xtext.ada2005.adb.Relation;
import org.xtext.ada2005.adb.SimpleExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.RelationImpl#getSimpleExpression <em>Simple Expression</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.RelationImpl#getRelationalOperator <em>Relational Operator</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.RelationImpl#getSubSimpleExpression <em>Sub Simple Expression</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.RelationImpl#getMembership <em>Membership</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends MinimalEObjectImpl.Container implements Relation
{
  /**
   * The cached value of the '{@link #getSimpleExpression() <em>Simple Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleExpression()
   * @generated
   * @ordered
   */
  protected SimpleExpression simpleExpression;

  /**
   * The default value of the '{@link #getRelationalOperator() <em>Relational Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationalOperator()
   * @generated
   * @ordered
   */
  protected static final String RELATIONAL_OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRelationalOperator() <em>Relational Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationalOperator()
   * @generated
   * @ordered
   */
  protected String relationalOperator = RELATIONAL_OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubSimpleExpression() <em>Sub Simple Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubSimpleExpression()
   * @generated
   * @ordered
   */
  protected SimpleExpression subSimpleExpression;

  /**
   * The cached value of the '{@link #getMembership() <em>Membership</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembership()
   * @generated
   * @ordered
   */
  protected Membership membership;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationImpl()
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
    return AdbPackage.eINSTANCE.getRelation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleExpression getSimpleExpression()
  {
    return simpleExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSimpleExpression(SimpleExpression newSimpleExpression, NotificationChain msgs)
  {
    SimpleExpression oldSimpleExpression = simpleExpression;
    simpleExpression = newSimpleExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.RELATION__SIMPLE_EXPRESSION, oldSimpleExpression, newSimpleExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimpleExpression(SimpleExpression newSimpleExpression)
  {
    if (newSimpleExpression != simpleExpression)
    {
      NotificationChain msgs = null;
      if (simpleExpression != null)
        msgs = ((InternalEObject)simpleExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.RELATION__SIMPLE_EXPRESSION, null, msgs);
      if (newSimpleExpression != null)
        msgs = ((InternalEObject)newSimpleExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.RELATION__SIMPLE_EXPRESSION, null, msgs);
      msgs = basicSetSimpleExpression(newSimpleExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.RELATION__SIMPLE_EXPRESSION, newSimpleExpression, newSimpleExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRelationalOperator()
  {
    return relationalOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationalOperator(String newRelationalOperator)
  {
    String oldRelationalOperator = relationalOperator;
    relationalOperator = newRelationalOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.RELATION__RELATIONAL_OPERATOR, oldRelationalOperator, relationalOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleExpression getSubSimpleExpression()
  {
    return subSimpleExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubSimpleExpression(SimpleExpression newSubSimpleExpression, NotificationChain msgs)
  {
    SimpleExpression oldSubSimpleExpression = subSimpleExpression;
    subSimpleExpression = newSubSimpleExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.RELATION__SUB_SIMPLE_EXPRESSION, oldSubSimpleExpression, newSubSimpleExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubSimpleExpression(SimpleExpression newSubSimpleExpression)
  {
    if (newSubSimpleExpression != subSimpleExpression)
    {
      NotificationChain msgs = null;
      if (subSimpleExpression != null)
        msgs = ((InternalEObject)subSimpleExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.RELATION__SUB_SIMPLE_EXPRESSION, null, msgs);
      if (newSubSimpleExpression != null)
        msgs = ((InternalEObject)newSubSimpleExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.RELATION__SUB_SIMPLE_EXPRESSION, null, msgs);
      msgs = basicSetSubSimpleExpression(newSubSimpleExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.RELATION__SUB_SIMPLE_EXPRESSION, newSubSimpleExpression, newSubSimpleExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Membership getMembership()
  {
    return membership;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMembership(Membership newMembership, NotificationChain msgs)
  {
    Membership oldMembership = membership;
    membership = newMembership;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.RELATION__MEMBERSHIP, oldMembership, newMembership);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMembership(Membership newMembership)
  {
    if (newMembership != membership)
    {
      NotificationChain msgs = null;
      if (membership != null)
        msgs = ((InternalEObject)membership).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.RELATION__MEMBERSHIP, null, msgs);
      if (newMembership != null)
        msgs = ((InternalEObject)newMembership).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.RELATION__MEMBERSHIP, null, msgs);
      msgs = basicSetMembership(newMembership, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.RELATION__MEMBERSHIP, newMembership, newMembership));
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
      case AdbPackage.RELATION__SIMPLE_EXPRESSION:
        return basicSetSimpleExpression(null, msgs);
      case AdbPackage.RELATION__SUB_SIMPLE_EXPRESSION:
        return basicSetSubSimpleExpression(null, msgs);
      case AdbPackage.RELATION__MEMBERSHIP:
        return basicSetMembership(null, msgs);
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
      case AdbPackage.RELATION__SIMPLE_EXPRESSION:
        return getSimpleExpression();
      case AdbPackage.RELATION__RELATIONAL_OPERATOR:
        return getRelationalOperator();
      case AdbPackage.RELATION__SUB_SIMPLE_EXPRESSION:
        return getSubSimpleExpression();
      case AdbPackage.RELATION__MEMBERSHIP:
        return getMembership();
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
      case AdbPackage.RELATION__SIMPLE_EXPRESSION:
        setSimpleExpression((SimpleExpression)newValue);
        return;
      case AdbPackage.RELATION__RELATIONAL_OPERATOR:
        setRelationalOperator((String)newValue);
        return;
      case AdbPackage.RELATION__SUB_SIMPLE_EXPRESSION:
        setSubSimpleExpression((SimpleExpression)newValue);
        return;
      case AdbPackage.RELATION__MEMBERSHIP:
        setMembership((Membership)newValue);
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
      case AdbPackage.RELATION__SIMPLE_EXPRESSION:
        setSimpleExpression((SimpleExpression)null);
        return;
      case AdbPackage.RELATION__RELATIONAL_OPERATOR:
        setRelationalOperator(RELATIONAL_OPERATOR_EDEFAULT);
        return;
      case AdbPackage.RELATION__SUB_SIMPLE_EXPRESSION:
        setSubSimpleExpression((SimpleExpression)null);
        return;
      case AdbPackage.RELATION__MEMBERSHIP:
        setMembership((Membership)null);
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
      case AdbPackage.RELATION__SIMPLE_EXPRESSION:
        return simpleExpression != null;
      case AdbPackage.RELATION__RELATIONAL_OPERATOR:
        return RELATIONAL_OPERATOR_EDEFAULT == null ? relationalOperator != null : !RELATIONAL_OPERATOR_EDEFAULT.equals(relationalOperator);
      case AdbPackage.RELATION__SUB_SIMPLE_EXPRESSION:
        return subSimpleExpression != null;
      case AdbPackage.RELATION__MEMBERSHIP:
        return membership != null;
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
    result.append(" (relationalOperator: ");
    result.append(relationalOperator);
    result.append(')');
    return result.toString();
  }

} //RelationImpl
