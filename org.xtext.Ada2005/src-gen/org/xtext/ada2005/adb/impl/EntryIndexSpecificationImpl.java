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
import org.xtext.ada2005.adb.DiscreteSubtypeDefinition;
import org.xtext.ada2005.adb.EntryIndexSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Index Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.EntryIndexSpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.EntryIndexSpecificationImpl#getDiscreteSubtypeDefinition <em>Discrete Subtype Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryIndexSpecificationImpl extends MinimalEObjectImpl.Container implements EntryIndexSpecification
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
   * The cached value of the '{@link #getDiscreteSubtypeDefinition() <em>Discrete Subtype Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscreteSubtypeDefinition()
   * @generated
   * @ordered
   */
  protected DiscreteSubtypeDefinition discreteSubtypeDefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntryIndexSpecificationImpl()
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
    return AdbPackage.eINSTANCE.getEntryIndexSpecification();
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_INDEX_SPECIFICATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiscreteSubtypeDefinition getDiscreteSubtypeDefinition()
  {
    return discreteSubtypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDiscreteSubtypeDefinition(DiscreteSubtypeDefinition newDiscreteSubtypeDefinition, NotificationChain msgs)
  {
    DiscreteSubtypeDefinition oldDiscreteSubtypeDefinition = discreteSubtypeDefinition;
    discreteSubtypeDefinition = newDiscreteSubtypeDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_INDEX_SPECIFICATION__DISCRETE_SUBTYPE_DEFINITION, oldDiscreteSubtypeDefinition, newDiscreteSubtypeDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiscreteSubtypeDefinition(DiscreteSubtypeDefinition newDiscreteSubtypeDefinition)
  {
    if (newDiscreteSubtypeDefinition != discreteSubtypeDefinition)
    {
      NotificationChain msgs = null;
      if (discreteSubtypeDefinition != null)
        msgs = ((InternalEObject)discreteSubtypeDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ENTRY_INDEX_SPECIFICATION__DISCRETE_SUBTYPE_DEFINITION, null, msgs);
      if (newDiscreteSubtypeDefinition != null)
        msgs = ((InternalEObject)newDiscreteSubtypeDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ENTRY_INDEX_SPECIFICATION__DISCRETE_SUBTYPE_DEFINITION, null, msgs);
      msgs = basicSetDiscreteSubtypeDefinition(newDiscreteSubtypeDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_INDEX_SPECIFICATION__DISCRETE_SUBTYPE_DEFINITION, newDiscreteSubtypeDefinition, newDiscreteSubtypeDefinition));
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
      case AdbPackage.ENTRY_INDEX_SPECIFICATION__DISCRETE_SUBTYPE_DEFINITION:
        return basicSetDiscreteSubtypeDefinition(null, msgs);
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
      case AdbPackage.ENTRY_INDEX_SPECIFICATION__NAME:
        return getName();
      case AdbPackage.ENTRY_INDEX_SPECIFICATION__DISCRETE_SUBTYPE_DEFINITION:
        return getDiscreteSubtypeDefinition();
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
      case AdbPackage.ENTRY_INDEX_SPECIFICATION__NAME:
        setName((String)newValue);
        return;
      case AdbPackage.ENTRY_INDEX_SPECIFICATION__DISCRETE_SUBTYPE_DEFINITION:
        setDiscreteSubtypeDefinition((DiscreteSubtypeDefinition)newValue);
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
      case AdbPackage.ENTRY_INDEX_SPECIFICATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdbPackage.ENTRY_INDEX_SPECIFICATION__DISCRETE_SUBTYPE_DEFINITION:
        setDiscreteSubtypeDefinition((DiscreteSubtypeDefinition)null);
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
      case AdbPackage.ENTRY_INDEX_SPECIFICATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdbPackage.ENTRY_INDEX_SPECIFICATION__DISCRETE_SUBTYPE_DEFINITION:
        return discreteSubtypeDefinition != null;
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

} //EntryIndexSpecificationImpl
