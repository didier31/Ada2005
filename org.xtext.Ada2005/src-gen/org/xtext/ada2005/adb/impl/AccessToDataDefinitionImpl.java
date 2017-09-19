/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AccessToDataDefinition;
import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.SubtypeIndication;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access To Data Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.AccessToDataDefinitionImpl#getGeneralAccessModifier <em>General Access Modifier</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.AccessToDataDefinitionImpl#getSubtypeIndication <em>Subtype Indication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessToDataDefinitionImpl extends AccessSpecificationImpl implements AccessToDataDefinition
{
  /**
   * The default value of the '{@link #getGeneralAccessModifier() <em>General Access Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeneralAccessModifier()
   * @generated
   * @ordered
   */
  protected static final String GENERAL_ACCESS_MODIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGeneralAccessModifier() <em>General Access Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeneralAccessModifier()
   * @generated
   * @ordered
   */
  protected String generalAccessModifier = GENERAL_ACCESS_MODIFIER_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AccessToDataDefinitionImpl()
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
    return AdbPackage.eINSTANCE.getAccessToDataDefinition();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGeneralAccessModifier()
  {
    return generalAccessModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGeneralAccessModifier(String newGeneralAccessModifier)
  {
    String oldGeneralAccessModifier = generalAccessModifier;
    generalAccessModifier = newGeneralAccessModifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ACCESS_TO_DATA_DEFINITION__GENERAL_ACCESS_MODIFIER, oldGeneralAccessModifier, generalAccessModifier));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ACCESS_TO_DATA_DEFINITION__SUBTYPE_INDICATION, oldSubtypeIndication, newSubtypeIndication);
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
        msgs = ((InternalEObject)subtypeIndication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ACCESS_TO_DATA_DEFINITION__SUBTYPE_INDICATION, null, msgs);
      if (newSubtypeIndication != null)
        msgs = ((InternalEObject)newSubtypeIndication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ACCESS_TO_DATA_DEFINITION__SUBTYPE_INDICATION, null, msgs);
      msgs = basicSetSubtypeIndication(newSubtypeIndication, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ACCESS_TO_DATA_DEFINITION__SUBTYPE_INDICATION, newSubtypeIndication, newSubtypeIndication));
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
      case AdbPackage.ACCESS_TO_DATA_DEFINITION__SUBTYPE_INDICATION:
        return basicSetSubtypeIndication(null, msgs);
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
      case AdbPackage.ACCESS_TO_DATA_DEFINITION__GENERAL_ACCESS_MODIFIER:
        return getGeneralAccessModifier();
      case AdbPackage.ACCESS_TO_DATA_DEFINITION__SUBTYPE_INDICATION:
        return getSubtypeIndication();
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
      case AdbPackage.ACCESS_TO_DATA_DEFINITION__GENERAL_ACCESS_MODIFIER:
        setGeneralAccessModifier((String)newValue);
        return;
      case AdbPackage.ACCESS_TO_DATA_DEFINITION__SUBTYPE_INDICATION:
        setSubtypeIndication((SubtypeIndication)newValue);
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
      case AdbPackage.ACCESS_TO_DATA_DEFINITION__GENERAL_ACCESS_MODIFIER:
        setGeneralAccessModifier(GENERAL_ACCESS_MODIFIER_EDEFAULT);
        return;
      case AdbPackage.ACCESS_TO_DATA_DEFINITION__SUBTYPE_INDICATION:
        setSubtypeIndication((SubtypeIndication)null);
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
      case AdbPackage.ACCESS_TO_DATA_DEFINITION__GENERAL_ACCESS_MODIFIER:
        return GENERAL_ACCESS_MODIFIER_EDEFAULT == null ? generalAccessModifier != null : !GENERAL_ACCESS_MODIFIER_EDEFAULT.equals(generalAccessModifier);
      case AdbPackage.ACCESS_TO_DATA_DEFINITION__SUBTYPE_INDICATION:
        return subtypeIndication != null;
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
    result.append(" (generalAccessModifier: ");
    result.append(generalAccessModifier);
    result.append(')');
    return result.toString();
  }

} //AccessToDataDefinitionImpl
