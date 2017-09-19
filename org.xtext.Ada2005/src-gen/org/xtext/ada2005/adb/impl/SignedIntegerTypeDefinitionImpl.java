/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.SignedIntegerTypeDefinition;
import org.xtext.ada2005.adb.SimpleExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signed Integer Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.SignedIntegerTypeDefinitionImpl#getFirst <em>First</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.SignedIntegerTypeDefinitionImpl#getLast <em>Last</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignedIntegerTypeDefinitionImpl extends IntegerTypeDefinitionImpl implements SignedIntegerTypeDefinition
{
  /**
   * The cached value of the '{@link #getFirst() <em>First</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirst()
   * @generated
   * @ordered
   */
  protected SimpleExpression first;

  /**
   * The cached value of the '{@link #getLast() <em>Last</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLast()
   * @generated
   * @ordered
   */
  protected SimpleExpression last;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SignedIntegerTypeDefinitionImpl()
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
    return AdbPackage.eINSTANCE.getSignedIntegerTypeDefinition();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleExpression getFirst()
  {
    return first;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirst(SimpleExpression newFirst, NotificationChain msgs)
  {
    SimpleExpression oldFirst = first;
    first = newFirst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.SIGNED_INTEGER_TYPE_DEFINITION__FIRST, oldFirst, newFirst);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirst(SimpleExpression newFirst)
  {
    if (newFirst != first)
    {
      NotificationChain msgs = null;
      if (first != null)
        msgs = ((InternalEObject)first).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SIGNED_INTEGER_TYPE_DEFINITION__FIRST, null, msgs);
      if (newFirst != null)
        msgs = ((InternalEObject)newFirst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SIGNED_INTEGER_TYPE_DEFINITION__FIRST, null, msgs);
      msgs = basicSetFirst(newFirst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SIGNED_INTEGER_TYPE_DEFINITION__FIRST, newFirst, newFirst));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleExpression getLast()
  {
    return last;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLast(SimpleExpression newLast, NotificationChain msgs)
  {
    SimpleExpression oldLast = last;
    last = newLast;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.SIGNED_INTEGER_TYPE_DEFINITION__LAST, oldLast, newLast);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLast(SimpleExpression newLast)
  {
    if (newLast != last)
    {
      NotificationChain msgs = null;
      if (last != null)
        msgs = ((InternalEObject)last).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SIGNED_INTEGER_TYPE_DEFINITION__LAST, null, msgs);
      if (newLast != null)
        msgs = ((InternalEObject)newLast).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SIGNED_INTEGER_TYPE_DEFINITION__LAST, null, msgs);
      msgs = basicSetLast(newLast, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SIGNED_INTEGER_TYPE_DEFINITION__LAST, newLast, newLast));
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
      case AdbPackage.SIGNED_INTEGER_TYPE_DEFINITION__FIRST:
        return basicSetFirst(null, msgs);
      case AdbPackage.SIGNED_INTEGER_TYPE_DEFINITION__LAST:
        return basicSetLast(null, msgs);
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
      case AdbPackage.SIGNED_INTEGER_TYPE_DEFINITION__FIRST:
        return getFirst();
      case AdbPackage.SIGNED_INTEGER_TYPE_DEFINITION__LAST:
        return getLast();
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
      case AdbPackage.SIGNED_INTEGER_TYPE_DEFINITION__FIRST:
        setFirst((SimpleExpression)newValue);
        return;
      case AdbPackage.SIGNED_INTEGER_TYPE_DEFINITION__LAST:
        setLast((SimpleExpression)newValue);
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
      case AdbPackage.SIGNED_INTEGER_TYPE_DEFINITION__FIRST:
        setFirst((SimpleExpression)null);
        return;
      case AdbPackage.SIGNED_INTEGER_TYPE_DEFINITION__LAST:
        setLast((SimpleExpression)null);
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
      case AdbPackage.SIGNED_INTEGER_TYPE_DEFINITION__FIRST:
        return first != null;
      case AdbPackage.SIGNED_INTEGER_TYPE_DEFINITION__LAST:
        return last != null;
    }
    return super.eIsSet(featureID);
  }

} //SignedIntegerTypeDefinitionImpl
