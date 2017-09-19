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
import org.xtext.ada2005.adb.LoopParameterSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Parameter Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.LoopParameterSpecificationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.LoopParameterSpecificationImpl#getDiscreteSubtypeDefinition <em>Discrete Subtype Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopParameterSpecificationImpl extends MinimalEObjectImpl.Container implements LoopParameterSpecification
{
  /**
   * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected String identifier = IDENTIFIER_EDEFAULT;

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
  protected LoopParameterSpecificationImpl()
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
    return AdbPackage.eINSTANCE.getLoopParameterSpecification();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(String newIdentifier)
  {
    String oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.LOOP_PARAMETER_SPECIFICATION__IDENTIFIER, oldIdentifier, identifier));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.LOOP_PARAMETER_SPECIFICATION__DISCRETE_SUBTYPE_DEFINITION, oldDiscreteSubtypeDefinition, newDiscreteSubtypeDefinition);
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
        msgs = ((InternalEObject)discreteSubtypeDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.LOOP_PARAMETER_SPECIFICATION__DISCRETE_SUBTYPE_DEFINITION, null, msgs);
      if (newDiscreteSubtypeDefinition != null)
        msgs = ((InternalEObject)newDiscreteSubtypeDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.LOOP_PARAMETER_SPECIFICATION__DISCRETE_SUBTYPE_DEFINITION, null, msgs);
      msgs = basicSetDiscreteSubtypeDefinition(newDiscreteSubtypeDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.LOOP_PARAMETER_SPECIFICATION__DISCRETE_SUBTYPE_DEFINITION, newDiscreteSubtypeDefinition, newDiscreteSubtypeDefinition));
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
      case AdbPackage.LOOP_PARAMETER_SPECIFICATION__DISCRETE_SUBTYPE_DEFINITION:
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
      case AdbPackage.LOOP_PARAMETER_SPECIFICATION__IDENTIFIER:
        return getIdentifier();
      case AdbPackage.LOOP_PARAMETER_SPECIFICATION__DISCRETE_SUBTYPE_DEFINITION:
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
      case AdbPackage.LOOP_PARAMETER_SPECIFICATION__IDENTIFIER:
        setIdentifier((String)newValue);
        return;
      case AdbPackage.LOOP_PARAMETER_SPECIFICATION__DISCRETE_SUBTYPE_DEFINITION:
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
      case AdbPackage.LOOP_PARAMETER_SPECIFICATION__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case AdbPackage.LOOP_PARAMETER_SPECIFICATION__DISCRETE_SUBTYPE_DEFINITION:
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
      case AdbPackage.LOOP_PARAMETER_SPECIFICATION__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case AdbPackage.LOOP_PARAMETER_SPECIFICATION__DISCRETE_SUBTYPE_DEFINITION:
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
    result.append(" (identifier: ");
    result.append(identifier);
    result.append(')');
    return result.toString();
  }

} //LoopParameterSpecificationImpl
