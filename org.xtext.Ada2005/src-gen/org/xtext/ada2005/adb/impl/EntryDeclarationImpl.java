/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.DiscreteSubtypeDefinition;
import org.xtext.ada2005.adb.EntryDeclaration;
import org.xtext.ada2005.adb.FormalPart;
import org.xtext.ada2005.adb.OverridingIndicator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.EntryDeclarationImpl#getOverriding <em>Overriding</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.EntryDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.EntryDeclarationImpl#getDiscreteSubtypeDefinition <em>Discrete Subtype Definition</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.EntryDeclarationImpl#getFormalPart <em>Formal Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryDeclarationImpl extends TaskItemImpl implements EntryDeclaration
{
  /**
   * The cached value of the '{@link #getOverriding() <em>Overriding</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOverriding()
   * @generated
   * @ordered
   */
  protected OverridingIndicator overriding;

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
   * The cached value of the '{@link #getFormalPart() <em>Formal Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormalPart()
   * @generated
   * @ordered
   */
  protected FormalPart formalPart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntryDeclarationImpl()
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
    return AdbPackage.eINSTANCE.getEntryDeclaration();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OverridingIndicator getOverriding()
  {
    return overriding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOverriding(OverridingIndicator newOverriding, NotificationChain msgs)
  {
    OverridingIndicator oldOverriding = overriding;
    overriding = newOverriding;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_DECLARATION__OVERRIDING, oldOverriding, newOverriding);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOverriding(OverridingIndicator newOverriding)
  {
    if (newOverriding != overriding)
    {
      NotificationChain msgs = null;
      if (overriding != null)
        msgs = ((InternalEObject)overriding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ENTRY_DECLARATION__OVERRIDING, null, msgs);
      if (newOverriding != null)
        msgs = ((InternalEObject)newOverriding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ENTRY_DECLARATION__OVERRIDING, null, msgs);
      msgs = basicSetOverriding(newOverriding, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_DECLARATION__OVERRIDING, newOverriding, newOverriding));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_DECLARATION__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_DECLARATION__DISCRETE_SUBTYPE_DEFINITION, oldDiscreteSubtypeDefinition, newDiscreteSubtypeDefinition);
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
        msgs = ((InternalEObject)discreteSubtypeDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ENTRY_DECLARATION__DISCRETE_SUBTYPE_DEFINITION, null, msgs);
      if (newDiscreteSubtypeDefinition != null)
        msgs = ((InternalEObject)newDiscreteSubtypeDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ENTRY_DECLARATION__DISCRETE_SUBTYPE_DEFINITION, null, msgs);
      msgs = basicSetDiscreteSubtypeDefinition(newDiscreteSubtypeDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_DECLARATION__DISCRETE_SUBTYPE_DEFINITION, newDiscreteSubtypeDefinition, newDiscreteSubtypeDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalPart getFormalPart()
  {
    return formalPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormalPart(FormalPart newFormalPart, NotificationChain msgs)
  {
    FormalPart oldFormalPart = formalPart;
    formalPart = newFormalPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_DECLARATION__FORMAL_PART, oldFormalPart, newFormalPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormalPart(FormalPart newFormalPart)
  {
    if (newFormalPart != formalPart)
    {
      NotificationChain msgs = null;
      if (formalPart != null)
        msgs = ((InternalEObject)formalPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ENTRY_DECLARATION__FORMAL_PART, null, msgs);
      if (newFormalPart != null)
        msgs = ((InternalEObject)newFormalPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ENTRY_DECLARATION__FORMAL_PART, null, msgs);
      msgs = basicSetFormalPart(newFormalPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ENTRY_DECLARATION__FORMAL_PART, newFormalPart, newFormalPart));
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
      case AdbPackage.ENTRY_DECLARATION__OVERRIDING:
        return basicSetOverriding(null, msgs);
      case AdbPackage.ENTRY_DECLARATION__DISCRETE_SUBTYPE_DEFINITION:
        return basicSetDiscreteSubtypeDefinition(null, msgs);
      case AdbPackage.ENTRY_DECLARATION__FORMAL_PART:
        return basicSetFormalPart(null, msgs);
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
      case AdbPackage.ENTRY_DECLARATION__OVERRIDING:
        return getOverriding();
      case AdbPackage.ENTRY_DECLARATION__NAME:
        return getName();
      case AdbPackage.ENTRY_DECLARATION__DISCRETE_SUBTYPE_DEFINITION:
        return getDiscreteSubtypeDefinition();
      case AdbPackage.ENTRY_DECLARATION__FORMAL_PART:
        return getFormalPart();
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
      case AdbPackage.ENTRY_DECLARATION__OVERRIDING:
        setOverriding((OverridingIndicator)newValue);
        return;
      case AdbPackage.ENTRY_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case AdbPackage.ENTRY_DECLARATION__DISCRETE_SUBTYPE_DEFINITION:
        setDiscreteSubtypeDefinition((DiscreteSubtypeDefinition)newValue);
        return;
      case AdbPackage.ENTRY_DECLARATION__FORMAL_PART:
        setFormalPart((FormalPart)newValue);
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
      case AdbPackage.ENTRY_DECLARATION__OVERRIDING:
        setOverriding((OverridingIndicator)null);
        return;
      case AdbPackage.ENTRY_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdbPackage.ENTRY_DECLARATION__DISCRETE_SUBTYPE_DEFINITION:
        setDiscreteSubtypeDefinition((DiscreteSubtypeDefinition)null);
        return;
      case AdbPackage.ENTRY_DECLARATION__FORMAL_PART:
        setFormalPart((FormalPart)null);
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
      case AdbPackage.ENTRY_DECLARATION__OVERRIDING:
        return overriding != null;
      case AdbPackage.ENTRY_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdbPackage.ENTRY_DECLARATION__DISCRETE_SUBTYPE_DEFINITION:
        return discreteSubtypeDefinition != null;
      case AdbPackage.ENTRY_DECLARATION__FORMAL_PART:
        return formalPart != null;
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

} //EntryDeclarationImpl
