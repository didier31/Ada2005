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
import org.xtext.ada2005.adb.Expression;
import org.xtext.ada2005.adb.PragmaArgumentAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pragma Argument Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.PragmaArgumentAssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.PragmaArgumentAssociationImpl#getEffectiveArgument <em>Effective Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PragmaArgumentAssociationImpl extends MinimalEObjectImpl.Container implements PragmaArgumentAssociation
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getEffectiveArgument() <em>Effective Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffectiveArgument()
   * @generated
   * @ordered
   */
  protected Expression effectiveArgument;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PragmaArgumentAssociationImpl()
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
    return AdbPackage.eINSTANCE.getPragmaArgumentAssociation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PRAGMA_ARGUMENT_ASSOCIATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getEffectiveArgument()
  {
    return effectiveArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEffectiveArgument(Expression newEffectiveArgument, NotificationChain msgs)
  {
    Expression oldEffectiveArgument = effectiveArgument;
    effectiveArgument = newEffectiveArgument;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.PRAGMA_ARGUMENT_ASSOCIATION__EFFECTIVE_ARGUMENT, oldEffectiveArgument, newEffectiveArgument);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEffectiveArgument(Expression newEffectiveArgument)
  {
    if (newEffectiveArgument != effectiveArgument)
    {
      NotificationChain msgs = null;
      if (effectiveArgument != null)
        msgs = ((InternalEObject)effectiveArgument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PRAGMA_ARGUMENT_ASSOCIATION__EFFECTIVE_ARGUMENT, null, msgs);
      if (newEffectiveArgument != null)
        msgs = ((InternalEObject)newEffectiveArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PRAGMA_ARGUMENT_ASSOCIATION__EFFECTIVE_ARGUMENT, null, msgs);
      msgs = basicSetEffectiveArgument(newEffectiveArgument, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PRAGMA_ARGUMENT_ASSOCIATION__EFFECTIVE_ARGUMENT, newEffectiveArgument, newEffectiveArgument));
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
      case AdbPackage.PRAGMA_ARGUMENT_ASSOCIATION__EFFECTIVE_ARGUMENT:
        return basicSetEffectiveArgument(null, msgs);
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
      case AdbPackage.PRAGMA_ARGUMENT_ASSOCIATION__NAME:
        return getName();
      case AdbPackage.PRAGMA_ARGUMENT_ASSOCIATION__EFFECTIVE_ARGUMENT:
        return getEffectiveArgument();
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
      case AdbPackage.PRAGMA_ARGUMENT_ASSOCIATION__NAME:
        setName((String)newValue);
        return;
      case AdbPackage.PRAGMA_ARGUMENT_ASSOCIATION__EFFECTIVE_ARGUMENT:
        setEffectiveArgument((Expression)newValue);
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
      case AdbPackage.PRAGMA_ARGUMENT_ASSOCIATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdbPackage.PRAGMA_ARGUMENT_ASSOCIATION__EFFECTIVE_ARGUMENT:
        setEffectiveArgument((Expression)null);
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
      case AdbPackage.PRAGMA_ARGUMENT_ASSOCIATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdbPackage.PRAGMA_ARGUMENT_ASSOCIATION__EFFECTIVE_ARGUMENT:
        return effectiveArgument != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PragmaArgumentAssociationImpl
