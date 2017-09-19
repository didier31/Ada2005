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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.AttributeDesignator;
import org.xtext.ada2005.adb.Name;
import org.xtext.ada2005.adb.ParameterAssociation;
import org.xtext.ada2005.adb.PrimaryName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.PrimaryNameImpl#getParameterAssociation <em>Parameter Association</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.PrimaryNameImpl#getPrimaryName <em>Primary Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.PrimaryNameImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.PrimaryNameImpl#getAttributeDesignator <em>Attribute Designator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimaryNameImpl extends MinimalEObjectImpl.Container implements PrimaryName
{
  /**
   * The cached value of the '{@link #getParameterAssociation() <em>Parameter Association</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterAssociation()
   * @generated
   * @ordered
   */
  protected EList<ParameterAssociation> parameterAssociation;

  /**
   * The cached value of the '{@link #getPrimaryName() <em>Primary Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryName()
   * @generated
   * @ordered
   */
  protected PrimaryName primaryName;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Name name;

  /**
   * The cached value of the '{@link #getAttributeDesignator() <em>Attribute Designator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeDesignator()
   * @generated
   * @ordered
   */
  protected AttributeDesignator attributeDesignator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimaryNameImpl()
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
    return AdbPackage.eINSTANCE.getPrimaryName();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterAssociation> getParameterAssociation()
  {
    if (parameterAssociation == null)
    {
      parameterAssociation = new EObjectContainmentEList<ParameterAssociation>(ParameterAssociation.class, this, AdbPackage.PRIMARY_NAME__PARAMETER_ASSOCIATION);
    }
    return parameterAssociation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryName getPrimaryName()
  {
    return primaryName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimaryName(PrimaryName newPrimaryName, NotificationChain msgs)
  {
    PrimaryName oldPrimaryName = primaryName;
    primaryName = newPrimaryName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.PRIMARY_NAME__PRIMARY_NAME, oldPrimaryName, newPrimaryName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryName(PrimaryName newPrimaryName)
  {
    if (newPrimaryName != primaryName)
    {
      NotificationChain msgs = null;
      if (primaryName != null)
        msgs = ((InternalEObject)primaryName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PRIMARY_NAME__PRIMARY_NAME, null, msgs);
      if (newPrimaryName != null)
        msgs = ((InternalEObject)newPrimaryName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PRIMARY_NAME__PRIMARY_NAME, null, msgs);
      msgs = basicSetPrimaryName(newPrimaryName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PRIMARY_NAME__PRIMARY_NAME, newPrimaryName, newPrimaryName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(Name newName, NotificationChain msgs)
  {
    Name oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.PRIMARY_NAME__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Name newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PRIMARY_NAME__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PRIMARY_NAME__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PRIMARY_NAME__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeDesignator getAttributeDesignator()
  {
    return attributeDesignator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributeDesignator(AttributeDesignator newAttributeDesignator, NotificationChain msgs)
  {
    AttributeDesignator oldAttributeDesignator = attributeDesignator;
    attributeDesignator = newAttributeDesignator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.PRIMARY_NAME__ATTRIBUTE_DESIGNATOR, oldAttributeDesignator, newAttributeDesignator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeDesignator(AttributeDesignator newAttributeDesignator)
  {
    if (newAttributeDesignator != attributeDesignator)
    {
      NotificationChain msgs = null;
      if (attributeDesignator != null)
        msgs = ((InternalEObject)attributeDesignator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PRIMARY_NAME__ATTRIBUTE_DESIGNATOR, null, msgs);
      if (newAttributeDesignator != null)
        msgs = ((InternalEObject)newAttributeDesignator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PRIMARY_NAME__ATTRIBUTE_DESIGNATOR, null, msgs);
      msgs = basicSetAttributeDesignator(newAttributeDesignator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PRIMARY_NAME__ATTRIBUTE_DESIGNATOR, newAttributeDesignator, newAttributeDesignator));
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
      case AdbPackage.PRIMARY_NAME__PARAMETER_ASSOCIATION:
        return ((InternalEList<?>)getParameterAssociation()).basicRemove(otherEnd, msgs);
      case AdbPackage.PRIMARY_NAME__PRIMARY_NAME:
        return basicSetPrimaryName(null, msgs);
      case AdbPackage.PRIMARY_NAME__NAME:
        return basicSetName(null, msgs);
      case AdbPackage.PRIMARY_NAME__ATTRIBUTE_DESIGNATOR:
        return basicSetAttributeDesignator(null, msgs);
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
      case AdbPackage.PRIMARY_NAME__PARAMETER_ASSOCIATION:
        return getParameterAssociation();
      case AdbPackage.PRIMARY_NAME__PRIMARY_NAME:
        return getPrimaryName();
      case AdbPackage.PRIMARY_NAME__NAME:
        return getName();
      case AdbPackage.PRIMARY_NAME__ATTRIBUTE_DESIGNATOR:
        return getAttributeDesignator();
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
      case AdbPackage.PRIMARY_NAME__PARAMETER_ASSOCIATION:
        getParameterAssociation().clear();
        getParameterAssociation().addAll((Collection<? extends ParameterAssociation>)newValue);
        return;
      case AdbPackage.PRIMARY_NAME__PRIMARY_NAME:
        setPrimaryName((PrimaryName)newValue);
        return;
      case AdbPackage.PRIMARY_NAME__NAME:
        setName((Name)newValue);
        return;
      case AdbPackage.PRIMARY_NAME__ATTRIBUTE_DESIGNATOR:
        setAttributeDesignator((AttributeDesignator)newValue);
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
      case AdbPackage.PRIMARY_NAME__PARAMETER_ASSOCIATION:
        getParameterAssociation().clear();
        return;
      case AdbPackage.PRIMARY_NAME__PRIMARY_NAME:
        setPrimaryName((PrimaryName)null);
        return;
      case AdbPackage.PRIMARY_NAME__NAME:
        setName((Name)null);
        return;
      case AdbPackage.PRIMARY_NAME__ATTRIBUTE_DESIGNATOR:
        setAttributeDesignator((AttributeDesignator)null);
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
      case AdbPackage.PRIMARY_NAME__PARAMETER_ASSOCIATION:
        return parameterAssociation != null && !parameterAssociation.isEmpty();
      case AdbPackage.PRIMARY_NAME__PRIMARY_NAME:
        return primaryName != null;
      case AdbPackage.PRIMARY_NAME__NAME:
        return name != null;
      case AdbPackage.PRIMARY_NAME__ATTRIBUTE_DESIGNATOR:
        return attributeDesignator != null;
    }
    return super.eIsSet(featureID);
  }

} //PrimaryNameImpl
