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
import org.xtext.ada2005.adb.DefiningIdentifierList;
import org.xtext.ada2005.adb.DiscriminantSpecification;
import org.xtext.ada2005.adb.Expression;
import org.xtext.ada2005.adb.Name;
import org.xtext.ada2005.adb.NotNullAccessDefinition;
import org.xtext.ada2005.adb.OptNullExclusion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discriminant Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.DiscriminantSpecificationImpl#getDefiningIdentifiers <em>Defining Identifiers</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.DiscriminantSpecificationImpl#getOptNullExclusion <em>Opt Null Exclusion</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.DiscriminantSpecificationImpl#getAccessDefinition <em>Access Definition</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.DiscriminantSpecificationImpl#getSubtypeMark <em>Subtype Mark</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.DiscriminantSpecificationImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscriminantSpecificationImpl extends MinimalEObjectImpl.Container implements DiscriminantSpecification
{
  /**
   * The cached value of the '{@link #getDefiningIdentifiers() <em>Defining Identifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefiningIdentifiers()
   * @generated
   * @ordered
   */
  protected DefiningIdentifierList definingIdentifiers;

  /**
   * The cached value of the '{@link #getOptNullExclusion() <em>Opt Null Exclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptNullExclusion()
   * @generated
   * @ordered
   */
  protected OptNullExclusion optNullExclusion;

  /**
   * The cached value of the '{@link #getAccessDefinition() <em>Access Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccessDefinition()
   * @generated
   * @ordered
   */
  protected NotNullAccessDefinition accessDefinition;

  /**
   * The cached value of the '{@link #getSubtypeMark() <em>Subtype Mark</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtypeMark()
   * @generated
   * @ordered
   */
  protected Name subtypeMark;

  /**
   * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected Expression defaultValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DiscriminantSpecificationImpl()
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
    return AdbPackage.eINSTANCE.getDiscriminantSpecification();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefiningIdentifierList getDefiningIdentifiers()
  {
    return definingIdentifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefiningIdentifiers(DefiningIdentifierList newDefiningIdentifiers, NotificationChain msgs)
  {
    DefiningIdentifierList oldDefiningIdentifiers = definingIdentifiers;
    definingIdentifiers = newDefiningIdentifiers;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.DISCRIMINANT_SPECIFICATION__DEFINING_IDENTIFIERS, oldDefiningIdentifiers, newDefiningIdentifiers);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefiningIdentifiers(DefiningIdentifierList newDefiningIdentifiers)
  {
    if (newDefiningIdentifiers != definingIdentifiers)
    {
      NotificationChain msgs = null;
      if (definingIdentifiers != null)
        msgs = ((InternalEObject)definingIdentifiers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DISCRIMINANT_SPECIFICATION__DEFINING_IDENTIFIERS, null, msgs);
      if (newDefiningIdentifiers != null)
        msgs = ((InternalEObject)newDefiningIdentifiers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DISCRIMINANT_SPECIFICATION__DEFINING_IDENTIFIERS, null, msgs);
      msgs = basicSetDefiningIdentifiers(newDefiningIdentifiers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DISCRIMINANT_SPECIFICATION__DEFINING_IDENTIFIERS, newDefiningIdentifiers, newDefiningIdentifiers));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptNullExclusion getOptNullExclusion()
  {
    return optNullExclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOptNullExclusion(OptNullExclusion newOptNullExclusion, NotificationChain msgs)
  {
    OptNullExclusion oldOptNullExclusion = optNullExclusion;
    optNullExclusion = newOptNullExclusion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.DISCRIMINANT_SPECIFICATION__OPT_NULL_EXCLUSION, oldOptNullExclusion, newOptNullExclusion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptNullExclusion(OptNullExclusion newOptNullExclusion)
  {
    if (newOptNullExclusion != optNullExclusion)
    {
      NotificationChain msgs = null;
      if (optNullExclusion != null)
        msgs = ((InternalEObject)optNullExclusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DISCRIMINANT_SPECIFICATION__OPT_NULL_EXCLUSION, null, msgs);
      if (newOptNullExclusion != null)
        msgs = ((InternalEObject)newOptNullExclusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DISCRIMINANT_SPECIFICATION__OPT_NULL_EXCLUSION, null, msgs);
      msgs = basicSetOptNullExclusion(newOptNullExclusion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DISCRIMINANT_SPECIFICATION__OPT_NULL_EXCLUSION, newOptNullExclusion, newOptNullExclusion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotNullAccessDefinition getAccessDefinition()
  {
    return accessDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAccessDefinition(NotNullAccessDefinition newAccessDefinition, NotificationChain msgs)
  {
    NotNullAccessDefinition oldAccessDefinition = accessDefinition;
    accessDefinition = newAccessDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.DISCRIMINANT_SPECIFICATION__ACCESS_DEFINITION, oldAccessDefinition, newAccessDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccessDefinition(NotNullAccessDefinition newAccessDefinition)
  {
    if (newAccessDefinition != accessDefinition)
    {
      NotificationChain msgs = null;
      if (accessDefinition != null)
        msgs = ((InternalEObject)accessDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DISCRIMINANT_SPECIFICATION__ACCESS_DEFINITION, null, msgs);
      if (newAccessDefinition != null)
        msgs = ((InternalEObject)newAccessDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DISCRIMINANT_SPECIFICATION__ACCESS_DEFINITION, null, msgs);
      msgs = basicSetAccessDefinition(newAccessDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DISCRIMINANT_SPECIFICATION__ACCESS_DEFINITION, newAccessDefinition, newAccessDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getSubtypeMark()
  {
    return subtypeMark;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubtypeMark(Name newSubtypeMark, NotificationChain msgs)
  {
    Name oldSubtypeMark = subtypeMark;
    subtypeMark = newSubtypeMark;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.DISCRIMINANT_SPECIFICATION__SUBTYPE_MARK, oldSubtypeMark, newSubtypeMark);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubtypeMark(Name newSubtypeMark)
  {
    if (newSubtypeMark != subtypeMark)
    {
      NotificationChain msgs = null;
      if (subtypeMark != null)
        msgs = ((InternalEObject)subtypeMark).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DISCRIMINANT_SPECIFICATION__SUBTYPE_MARK, null, msgs);
      if (newSubtypeMark != null)
        msgs = ((InternalEObject)newSubtypeMark).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DISCRIMINANT_SPECIFICATION__SUBTYPE_MARK, null, msgs);
      msgs = basicSetSubtypeMark(newSubtypeMark, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DISCRIMINANT_SPECIFICATION__SUBTYPE_MARK, newSubtypeMark, newSubtypeMark));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getDefaultValue()
  {
    return defaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultValue(Expression newDefaultValue, NotificationChain msgs)
  {
    Expression oldDefaultValue = defaultValue;
    defaultValue = newDefaultValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.DISCRIMINANT_SPECIFICATION__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultValue(Expression newDefaultValue)
  {
    if (newDefaultValue != defaultValue)
    {
      NotificationChain msgs = null;
      if (defaultValue != null)
        msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DISCRIMINANT_SPECIFICATION__DEFAULT_VALUE, null, msgs);
      if (newDefaultValue != null)
        msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DISCRIMINANT_SPECIFICATION__DEFAULT_VALUE, null, msgs);
      msgs = basicSetDefaultValue(newDefaultValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DISCRIMINANT_SPECIFICATION__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
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
      case AdbPackage.DISCRIMINANT_SPECIFICATION__DEFINING_IDENTIFIERS:
        return basicSetDefiningIdentifiers(null, msgs);
      case AdbPackage.DISCRIMINANT_SPECIFICATION__OPT_NULL_EXCLUSION:
        return basicSetOptNullExclusion(null, msgs);
      case AdbPackage.DISCRIMINANT_SPECIFICATION__ACCESS_DEFINITION:
        return basicSetAccessDefinition(null, msgs);
      case AdbPackage.DISCRIMINANT_SPECIFICATION__SUBTYPE_MARK:
        return basicSetSubtypeMark(null, msgs);
      case AdbPackage.DISCRIMINANT_SPECIFICATION__DEFAULT_VALUE:
        return basicSetDefaultValue(null, msgs);
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
      case AdbPackage.DISCRIMINANT_SPECIFICATION__DEFINING_IDENTIFIERS:
        return getDefiningIdentifiers();
      case AdbPackage.DISCRIMINANT_SPECIFICATION__OPT_NULL_EXCLUSION:
        return getOptNullExclusion();
      case AdbPackage.DISCRIMINANT_SPECIFICATION__ACCESS_DEFINITION:
        return getAccessDefinition();
      case AdbPackage.DISCRIMINANT_SPECIFICATION__SUBTYPE_MARK:
        return getSubtypeMark();
      case AdbPackage.DISCRIMINANT_SPECIFICATION__DEFAULT_VALUE:
        return getDefaultValue();
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
      case AdbPackage.DISCRIMINANT_SPECIFICATION__DEFINING_IDENTIFIERS:
        setDefiningIdentifiers((DefiningIdentifierList)newValue);
        return;
      case AdbPackage.DISCRIMINANT_SPECIFICATION__OPT_NULL_EXCLUSION:
        setOptNullExclusion((OptNullExclusion)newValue);
        return;
      case AdbPackage.DISCRIMINANT_SPECIFICATION__ACCESS_DEFINITION:
        setAccessDefinition((NotNullAccessDefinition)newValue);
        return;
      case AdbPackage.DISCRIMINANT_SPECIFICATION__SUBTYPE_MARK:
        setSubtypeMark((Name)newValue);
        return;
      case AdbPackage.DISCRIMINANT_SPECIFICATION__DEFAULT_VALUE:
        setDefaultValue((Expression)newValue);
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
      case AdbPackage.DISCRIMINANT_SPECIFICATION__DEFINING_IDENTIFIERS:
        setDefiningIdentifiers((DefiningIdentifierList)null);
        return;
      case AdbPackage.DISCRIMINANT_SPECIFICATION__OPT_NULL_EXCLUSION:
        setOptNullExclusion((OptNullExclusion)null);
        return;
      case AdbPackage.DISCRIMINANT_SPECIFICATION__ACCESS_DEFINITION:
        setAccessDefinition((NotNullAccessDefinition)null);
        return;
      case AdbPackage.DISCRIMINANT_SPECIFICATION__SUBTYPE_MARK:
        setSubtypeMark((Name)null);
        return;
      case AdbPackage.DISCRIMINANT_SPECIFICATION__DEFAULT_VALUE:
        setDefaultValue((Expression)null);
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
      case AdbPackage.DISCRIMINANT_SPECIFICATION__DEFINING_IDENTIFIERS:
        return definingIdentifiers != null;
      case AdbPackage.DISCRIMINANT_SPECIFICATION__OPT_NULL_EXCLUSION:
        return optNullExclusion != null;
      case AdbPackage.DISCRIMINANT_SPECIFICATION__ACCESS_DEFINITION:
        return accessDefinition != null;
      case AdbPackage.DISCRIMINANT_SPECIFICATION__SUBTYPE_MARK:
        return subtypeMark != null;
      case AdbPackage.DISCRIMINANT_SPECIFICATION__DEFAULT_VALUE:
        return defaultValue != null;
    }
    return super.eIsSet(featureID);
  }

} //DiscriminantSpecificationImpl
