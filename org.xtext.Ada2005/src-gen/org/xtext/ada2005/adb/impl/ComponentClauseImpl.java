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
import org.xtext.ada2005.adb.ComponentClause;
import org.xtext.ada2005.adb.Expression;
import org.xtext.ada2005.adb.SimpleExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.ComponentClauseImpl#getLocalName <em>Local Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ComponentClauseImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ComponentClauseImpl#getFirstBit <em>First Bit</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ComponentClauseImpl#getLastBit <em>Last Bit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentClauseImpl extends MinimalEObjectImpl.Container implements ComponentClause
{
  /**
   * The default value of the '{@link #getLocalName() <em>Local Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalName()
   * @generated
   * @ordered
   */
  protected static final String LOCAL_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocalName() <em>Local Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalName()
   * @generated
   * @ordered
   */
  protected String localName = LOCAL_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected Expression position;

  /**
   * The cached value of the '{@link #getFirstBit() <em>First Bit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstBit()
   * @generated
   * @ordered
   */
  protected SimpleExpression firstBit;

  /**
   * The cached value of the '{@link #getLastBit() <em>Last Bit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastBit()
   * @generated
   * @ordered
   */
  protected SimpleExpression lastBit;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentClauseImpl()
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
    return AdbPackage.eINSTANCE.getComponentClause();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLocalName()
  {
    return localName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocalName(String newLocalName)
  {
    String oldLocalName = localName;
    localName = newLocalName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.COMPONENT_CLAUSE__LOCAL_NAME, oldLocalName, localName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getPosition()
  {
    return position;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPosition(Expression newPosition, NotificationChain msgs)
  {
    Expression oldPosition = position;
    position = newPosition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.COMPONENT_CLAUSE__POSITION, oldPosition, newPosition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPosition(Expression newPosition)
  {
    if (newPosition != position)
    {
      NotificationChain msgs = null;
      if (position != null)
        msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.COMPONENT_CLAUSE__POSITION, null, msgs);
      if (newPosition != null)
        msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.COMPONENT_CLAUSE__POSITION, null, msgs);
      msgs = basicSetPosition(newPosition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.COMPONENT_CLAUSE__POSITION, newPosition, newPosition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleExpression getFirstBit()
  {
    return firstBit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstBit(SimpleExpression newFirstBit, NotificationChain msgs)
  {
    SimpleExpression oldFirstBit = firstBit;
    firstBit = newFirstBit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.COMPONENT_CLAUSE__FIRST_BIT, oldFirstBit, newFirstBit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstBit(SimpleExpression newFirstBit)
  {
    if (newFirstBit != firstBit)
    {
      NotificationChain msgs = null;
      if (firstBit != null)
        msgs = ((InternalEObject)firstBit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.COMPONENT_CLAUSE__FIRST_BIT, null, msgs);
      if (newFirstBit != null)
        msgs = ((InternalEObject)newFirstBit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.COMPONENT_CLAUSE__FIRST_BIT, null, msgs);
      msgs = basicSetFirstBit(newFirstBit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.COMPONENT_CLAUSE__FIRST_BIT, newFirstBit, newFirstBit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleExpression getLastBit()
  {
    return lastBit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLastBit(SimpleExpression newLastBit, NotificationChain msgs)
  {
    SimpleExpression oldLastBit = lastBit;
    lastBit = newLastBit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.COMPONENT_CLAUSE__LAST_BIT, oldLastBit, newLastBit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLastBit(SimpleExpression newLastBit)
  {
    if (newLastBit != lastBit)
    {
      NotificationChain msgs = null;
      if (lastBit != null)
        msgs = ((InternalEObject)lastBit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.COMPONENT_CLAUSE__LAST_BIT, null, msgs);
      if (newLastBit != null)
        msgs = ((InternalEObject)newLastBit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.COMPONENT_CLAUSE__LAST_BIT, null, msgs);
      msgs = basicSetLastBit(newLastBit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.COMPONENT_CLAUSE__LAST_BIT, newLastBit, newLastBit));
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
      case AdbPackage.COMPONENT_CLAUSE__POSITION:
        return basicSetPosition(null, msgs);
      case AdbPackage.COMPONENT_CLAUSE__FIRST_BIT:
        return basicSetFirstBit(null, msgs);
      case AdbPackage.COMPONENT_CLAUSE__LAST_BIT:
        return basicSetLastBit(null, msgs);
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
      case AdbPackage.COMPONENT_CLAUSE__LOCAL_NAME:
        return getLocalName();
      case AdbPackage.COMPONENT_CLAUSE__POSITION:
        return getPosition();
      case AdbPackage.COMPONENT_CLAUSE__FIRST_BIT:
        return getFirstBit();
      case AdbPackage.COMPONENT_CLAUSE__LAST_BIT:
        return getLastBit();
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
      case AdbPackage.COMPONENT_CLAUSE__LOCAL_NAME:
        setLocalName((String)newValue);
        return;
      case AdbPackage.COMPONENT_CLAUSE__POSITION:
        setPosition((Expression)newValue);
        return;
      case AdbPackage.COMPONENT_CLAUSE__FIRST_BIT:
        setFirstBit((SimpleExpression)newValue);
        return;
      case AdbPackage.COMPONENT_CLAUSE__LAST_BIT:
        setLastBit((SimpleExpression)newValue);
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
      case AdbPackage.COMPONENT_CLAUSE__LOCAL_NAME:
        setLocalName(LOCAL_NAME_EDEFAULT);
        return;
      case AdbPackage.COMPONENT_CLAUSE__POSITION:
        setPosition((Expression)null);
        return;
      case AdbPackage.COMPONENT_CLAUSE__FIRST_BIT:
        setFirstBit((SimpleExpression)null);
        return;
      case AdbPackage.COMPONENT_CLAUSE__LAST_BIT:
        setLastBit((SimpleExpression)null);
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
      case AdbPackage.COMPONENT_CLAUSE__LOCAL_NAME:
        return LOCAL_NAME_EDEFAULT == null ? localName != null : !LOCAL_NAME_EDEFAULT.equals(localName);
      case AdbPackage.COMPONENT_CLAUSE__POSITION:
        return position != null;
      case AdbPackage.COMPONENT_CLAUSE__FIRST_BIT:
        return firstBit != null;
      case AdbPackage.COMPONENT_CLAUSE__LAST_BIT:
        return lastBit != null;
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
    result.append(" (localName: ");
    result.append(localName);
    result.append(')');
    return result.toString();
  }

} //ComponentClauseImpl
