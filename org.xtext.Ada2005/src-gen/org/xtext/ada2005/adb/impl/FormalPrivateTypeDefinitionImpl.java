/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.FormalPrivateTypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Private Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalPrivateTypeDefinitionImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalPrivateTypeDefinitionImpl#isTagged <em>Tagged</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalPrivateTypeDefinitionImpl#isLimited <em>Limited</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormalPrivateTypeDefinitionImpl extends FormalTypeDefinitionImpl implements FormalPrivateTypeDefinition
{
  /**
   * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected boolean abstract_ = ABSTRACT_EDEFAULT;

  /**
   * The default value of the '{@link #isTagged() <em>Tagged</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTagged()
   * @generated
   * @ordered
   */
  protected static final boolean TAGGED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTagged() <em>Tagged</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTagged()
   * @generated
   * @ordered
   */
  protected boolean tagged = TAGGED_EDEFAULT;

  /**
   * The default value of the '{@link #isLimited() <em>Limited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLimited()
   * @generated
   * @ordered
   */
  protected static final boolean LIMITED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLimited() <em>Limited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLimited()
   * @generated
   * @ordered
   */
  protected boolean limited = LIMITED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormalPrivateTypeDefinitionImpl()
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
    return AdbPackage.eINSTANCE.getFormalPrivateTypeDefinition();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(boolean newAbstract)
  {
    boolean oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_PRIVATE_TYPE_DEFINITION__ABSTRACT, oldAbstract, abstract_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTagged()
  {
    return tagged;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTagged(boolean newTagged)
  {
    boolean oldTagged = tagged;
    tagged = newTagged;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_PRIVATE_TYPE_DEFINITION__TAGGED, oldTagged, tagged));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLimited()
  {
    return limited;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLimited(boolean newLimited)
  {
    boolean oldLimited = limited;
    limited = newLimited;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_PRIVATE_TYPE_DEFINITION__LIMITED, oldLimited, limited));
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
      case AdbPackage.FORMAL_PRIVATE_TYPE_DEFINITION__ABSTRACT:
        return isAbstract();
      case AdbPackage.FORMAL_PRIVATE_TYPE_DEFINITION__TAGGED:
        return isTagged();
      case AdbPackage.FORMAL_PRIVATE_TYPE_DEFINITION__LIMITED:
        return isLimited();
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
      case AdbPackage.FORMAL_PRIVATE_TYPE_DEFINITION__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case AdbPackage.FORMAL_PRIVATE_TYPE_DEFINITION__TAGGED:
        setTagged((Boolean)newValue);
        return;
      case AdbPackage.FORMAL_PRIVATE_TYPE_DEFINITION__LIMITED:
        setLimited((Boolean)newValue);
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
      case AdbPackage.FORMAL_PRIVATE_TYPE_DEFINITION__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case AdbPackage.FORMAL_PRIVATE_TYPE_DEFINITION__TAGGED:
        setTagged(TAGGED_EDEFAULT);
        return;
      case AdbPackage.FORMAL_PRIVATE_TYPE_DEFINITION__LIMITED:
        setLimited(LIMITED_EDEFAULT);
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
      case AdbPackage.FORMAL_PRIVATE_TYPE_DEFINITION__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case AdbPackage.FORMAL_PRIVATE_TYPE_DEFINITION__TAGGED:
        return tagged != TAGGED_EDEFAULT;
      case AdbPackage.FORMAL_PRIVATE_TYPE_DEFINITION__LIMITED:
        return limited != LIMITED_EDEFAULT;
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
    result.append(" (abstract: ");
    result.append(abstract_);
    result.append(", tagged: ");
    result.append(tagged);
    result.append(", limited: ");
    result.append(limited);
    result.append(')');
    return result.toString();
  }

} //FormalPrivateTypeDefinitionImpl
