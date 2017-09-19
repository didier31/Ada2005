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
import org.xtext.ada2005.adb.AnonymousAccessDefinition;
import org.xtext.ada2005.adb.ComponentDefinition;
import org.xtext.ada2005.adb.SubtypeIndication;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.ComponentDefinitionImpl#isAliased <em>Aliased</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ComponentDefinitionImpl#getSubtypeIndication <em>Subtype Indication</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ComponentDefinitionImpl#getAnonymousAccessDefinition <em>Anonymous Access Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentDefinitionImpl extends MinimalEObjectImpl.Container implements ComponentDefinition
{
  /**
   * The default value of the '{@link #isAliased() <em>Aliased</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAliased()
   * @generated
   * @ordered
   */
  protected static final boolean ALIASED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAliased() <em>Aliased</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAliased()
   * @generated
   * @ordered
   */
  protected boolean aliased = ALIASED_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubtypeIndication() <em>Subtype Indication</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtypeIndication()
   * @generated
   * @ordered
   */
  protected SubtypeIndication subtypeIndication;

  /**
   * The cached value of the '{@link #getAnonymousAccessDefinition() <em>Anonymous Access Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnonymousAccessDefinition()
   * @generated
   * @ordered
   */
  protected AnonymousAccessDefinition anonymousAccessDefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentDefinitionImpl()
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
    return AdbPackage.eINSTANCE.getComponentDefinition();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAliased()
  {
    return aliased;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAliased(boolean newAliased)
  {
    boolean oldAliased = aliased;
    aliased = newAliased;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.COMPONENT_DEFINITION__ALIASED, oldAliased, aliased));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubtypeIndication getSubtypeIndication()
  {
    return subtypeIndication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubtypeIndication(SubtypeIndication newSubtypeIndication, NotificationChain msgs)
  {
    SubtypeIndication oldSubtypeIndication = subtypeIndication;
    subtypeIndication = newSubtypeIndication;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.COMPONENT_DEFINITION__SUBTYPE_INDICATION, oldSubtypeIndication, newSubtypeIndication);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubtypeIndication(SubtypeIndication newSubtypeIndication)
  {
    if (newSubtypeIndication != subtypeIndication)
    {
      NotificationChain msgs = null;
      if (subtypeIndication != null)
        msgs = ((InternalEObject)subtypeIndication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.COMPONENT_DEFINITION__SUBTYPE_INDICATION, null, msgs);
      if (newSubtypeIndication != null)
        msgs = ((InternalEObject)newSubtypeIndication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.COMPONENT_DEFINITION__SUBTYPE_INDICATION, null, msgs);
      msgs = basicSetSubtypeIndication(newSubtypeIndication, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.COMPONENT_DEFINITION__SUBTYPE_INDICATION, newSubtypeIndication, newSubtypeIndication));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnonymousAccessDefinition getAnonymousAccessDefinition()
  {
    return anonymousAccessDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnonymousAccessDefinition(AnonymousAccessDefinition newAnonymousAccessDefinition, NotificationChain msgs)
  {
    AnonymousAccessDefinition oldAnonymousAccessDefinition = anonymousAccessDefinition;
    anonymousAccessDefinition = newAnonymousAccessDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.COMPONENT_DEFINITION__ANONYMOUS_ACCESS_DEFINITION, oldAnonymousAccessDefinition, newAnonymousAccessDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnonymousAccessDefinition(AnonymousAccessDefinition newAnonymousAccessDefinition)
  {
    if (newAnonymousAccessDefinition != anonymousAccessDefinition)
    {
      NotificationChain msgs = null;
      if (anonymousAccessDefinition != null)
        msgs = ((InternalEObject)anonymousAccessDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.COMPONENT_DEFINITION__ANONYMOUS_ACCESS_DEFINITION, null, msgs);
      if (newAnonymousAccessDefinition != null)
        msgs = ((InternalEObject)newAnonymousAccessDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.COMPONENT_DEFINITION__ANONYMOUS_ACCESS_DEFINITION, null, msgs);
      msgs = basicSetAnonymousAccessDefinition(newAnonymousAccessDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.COMPONENT_DEFINITION__ANONYMOUS_ACCESS_DEFINITION, newAnonymousAccessDefinition, newAnonymousAccessDefinition));
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
      case AdbPackage.COMPONENT_DEFINITION__SUBTYPE_INDICATION:
        return basicSetSubtypeIndication(null, msgs);
      case AdbPackage.COMPONENT_DEFINITION__ANONYMOUS_ACCESS_DEFINITION:
        return basicSetAnonymousAccessDefinition(null, msgs);
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
      case AdbPackage.COMPONENT_DEFINITION__ALIASED:
        return isAliased();
      case AdbPackage.COMPONENT_DEFINITION__SUBTYPE_INDICATION:
        return getSubtypeIndication();
      case AdbPackage.COMPONENT_DEFINITION__ANONYMOUS_ACCESS_DEFINITION:
        return getAnonymousAccessDefinition();
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
      case AdbPackage.COMPONENT_DEFINITION__ALIASED:
        setAliased((Boolean)newValue);
        return;
      case AdbPackage.COMPONENT_DEFINITION__SUBTYPE_INDICATION:
        setSubtypeIndication((SubtypeIndication)newValue);
        return;
      case AdbPackage.COMPONENT_DEFINITION__ANONYMOUS_ACCESS_DEFINITION:
        setAnonymousAccessDefinition((AnonymousAccessDefinition)newValue);
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
      case AdbPackage.COMPONENT_DEFINITION__ALIASED:
        setAliased(ALIASED_EDEFAULT);
        return;
      case AdbPackage.COMPONENT_DEFINITION__SUBTYPE_INDICATION:
        setSubtypeIndication((SubtypeIndication)null);
        return;
      case AdbPackage.COMPONENT_DEFINITION__ANONYMOUS_ACCESS_DEFINITION:
        setAnonymousAccessDefinition((AnonymousAccessDefinition)null);
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
      case AdbPackage.COMPONENT_DEFINITION__ALIASED:
        return aliased != ALIASED_EDEFAULT;
      case AdbPackage.COMPONENT_DEFINITION__SUBTYPE_INDICATION:
        return subtypeIndication != null;
      case AdbPackage.COMPONENT_DEFINITION__ANONYMOUS_ACCESS_DEFINITION:
        return anonymousAccessDefinition != null;
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
    result.append(" (aliased: ");
    result.append(aliased);
    result.append(')');
    return result.toString();
  }

} //ComponentDefinitionImpl
