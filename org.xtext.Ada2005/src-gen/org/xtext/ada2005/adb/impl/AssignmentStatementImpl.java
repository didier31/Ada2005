/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.AssignmentStatement;
import org.xtext.ada2005.adb.Expression;
import org.xtext.ada2005.adb.Name;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.AssignmentStatementImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.AssignmentStatementImpl#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentStatementImpl extends SimpleStatementImpl implements AssignmentStatement
{
  /**
   * The cached value of the '{@link #getVariableName() <em>Variable Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableName()
   * @generated
   * @ordered
   */
  protected Name variableName;

  /**
   * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialValue()
   * @generated
   * @ordered
   */
  protected Expression initialValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignmentStatementImpl()
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
    return AdbPackage.eINSTANCE.getAssignmentStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getVariableName()
  {
    return variableName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariableName(Name newVariableName, NotificationChain msgs)
  {
    Name oldVariableName = variableName;
    variableName = newVariableName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ASSIGNMENT_STATEMENT__VARIABLE_NAME, oldVariableName, newVariableName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableName(Name newVariableName)
  {
    if (newVariableName != variableName)
    {
      NotificationChain msgs = null;
      if (variableName != null)
        msgs = ((InternalEObject)variableName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ASSIGNMENT_STATEMENT__VARIABLE_NAME, null, msgs);
      if (newVariableName != null)
        msgs = ((InternalEObject)newVariableName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ASSIGNMENT_STATEMENT__VARIABLE_NAME, null, msgs);
      msgs = basicSetVariableName(newVariableName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ASSIGNMENT_STATEMENT__VARIABLE_NAME, newVariableName, newVariableName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getInitialValue()
  {
    return initialValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitialValue(Expression newInitialValue, NotificationChain msgs)
  {
    Expression oldInitialValue = initialValue;
    initialValue = newInitialValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ASSIGNMENT_STATEMENT__INITIAL_VALUE, oldInitialValue, newInitialValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialValue(Expression newInitialValue)
  {
    if (newInitialValue != initialValue)
    {
      NotificationChain msgs = null;
      if (initialValue != null)
        msgs = ((InternalEObject)initialValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ASSIGNMENT_STATEMENT__INITIAL_VALUE, null, msgs);
      if (newInitialValue != null)
        msgs = ((InternalEObject)newInitialValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ASSIGNMENT_STATEMENT__INITIAL_VALUE, null, msgs);
      msgs = basicSetInitialValue(newInitialValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ASSIGNMENT_STATEMENT__INITIAL_VALUE, newInitialValue, newInitialValue));
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
      case AdbPackage.ASSIGNMENT_STATEMENT__VARIABLE_NAME:
        return basicSetVariableName(null, msgs);
      case AdbPackage.ASSIGNMENT_STATEMENT__INITIAL_VALUE:
        return basicSetInitialValue(null, msgs);
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
      case AdbPackage.ASSIGNMENT_STATEMENT__VARIABLE_NAME:
        return getVariableName();
      case AdbPackage.ASSIGNMENT_STATEMENT__INITIAL_VALUE:
        return getInitialValue();
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
      case AdbPackage.ASSIGNMENT_STATEMENT__VARIABLE_NAME:
        setVariableName((Name)newValue);
        return;
      case AdbPackage.ASSIGNMENT_STATEMENT__INITIAL_VALUE:
        setInitialValue((Expression)newValue);
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
      case AdbPackage.ASSIGNMENT_STATEMENT__VARIABLE_NAME:
        setVariableName((Name)null);
        return;
      case AdbPackage.ASSIGNMENT_STATEMENT__INITIAL_VALUE:
        setInitialValue((Expression)null);
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
      case AdbPackage.ASSIGNMENT_STATEMENT__VARIABLE_NAME:
        return variableName != null;
      case AdbPackage.ASSIGNMENT_STATEMENT__INITIAL_VALUE:
        return initialValue != null;
    }
    return super.eIsSet(featureID);
  }

} //AssignmentStatementImpl
