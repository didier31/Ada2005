/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.RecordDefinition;
import org.xtext.ada2005.adb.RecordTypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.RecordTypeDefinitionImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.RecordTypeDefinitionImpl#isTagged <em>Tagged</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.RecordTypeDefinitionImpl#isLimited <em>Limited</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.RecordTypeDefinitionImpl#getRecordDefinition <em>Record Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordTypeDefinitionImpl extends TypeDefinitionImpl implements RecordTypeDefinition
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
   * The cached value of the '{@link #getRecordDefinition() <em>Record Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecordDefinition()
   * @generated
   * @ordered
   */
  protected RecordDefinition recordDefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecordTypeDefinitionImpl()
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
    return AdbPackage.eINSTANCE.getRecordTypeDefinition();
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.RECORD_TYPE_DEFINITION__ABSTRACT, oldAbstract, abstract_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.RECORD_TYPE_DEFINITION__TAGGED, oldTagged, tagged));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.RECORD_TYPE_DEFINITION__LIMITED, oldLimited, limited));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordDefinition getRecordDefinition()
  {
    return recordDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecordDefinition(RecordDefinition newRecordDefinition, NotificationChain msgs)
  {
    RecordDefinition oldRecordDefinition = recordDefinition;
    recordDefinition = newRecordDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.RECORD_TYPE_DEFINITION__RECORD_DEFINITION, oldRecordDefinition, newRecordDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecordDefinition(RecordDefinition newRecordDefinition)
  {
    if (newRecordDefinition != recordDefinition)
    {
      NotificationChain msgs = null;
      if (recordDefinition != null)
        msgs = ((InternalEObject)recordDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.RECORD_TYPE_DEFINITION__RECORD_DEFINITION, null, msgs);
      if (newRecordDefinition != null)
        msgs = ((InternalEObject)newRecordDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.RECORD_TYPE_DEFINITION__RECORD_DEFINITION, null, msgs);
      msgs = basicSetRecordDefinition(newRecordDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.RECORD_TYPE_DEFINITION__RECORD_DEFINITION, newRecordDefinition, newRecordDefinition));
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
      case AdbPackage.RECORD_TYPE_DEFINITION__RECORD_DEFINITION:
        return basicSetRecordDefinition(null, msgs);
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
      case AdbPackage.RECORD_TYPE_DEFINITION__ABSTRACT:
        return isAbstract();
      case AdbPackage.RECORD_TYPE_DEFINITION__TAGGED:
        return isTagged();
      case AdbPackage.RECORD_TYPE_DEFINITION__LIMITED:
        return isLimited();
      case AdbPackage.RECORD_TYPE_DEFINITION__RECORD_DEFINITION:
        return getRecordDefinition();
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
      case AdbPackage.RECORD_TYPE_DEFINITION__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case AdbPackage.RECORD_TYPE_DEFINITION__TAGGED:
        setTagged((Boolean)newValue);
        return;
      case AdbPackage.RECORD_TYPE_DEFINITION__LIMITED:
        setLimited((Boolean)newValue);
        return;
      case AdbPackage.RECORD_TYPE_DEFINITION__RECORD_DEFINITION:
        setRecordDefinition((RecordDefinition)newValue);
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
      case AdbPackage.RECORD_TYPE_DEFINITION__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case AdbPackage.RECORD_TYPE_DEFINITION__TAGGED:
        setTagged(TAGGED_EDEFAULT);
        return;
      case AdbPackage.RECORD_TYPE_DEFINITION__LIMITED:
        setLimited(LIMITED_EDEFAULT);
        return;
      case AdbPackage.RECORD_TYPE_DEFINITION__RECORD_DEFINITION:
        setRecordDefinition((RecordDefinition)null);
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
      case AdbPackage.RECORD_TYPE_DEFINITION__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case AdbPackage.RECORD_TYPE_DEFINITION__TAGGED:
        return tagged != TAGGED_EDEFAULT;
      case AdbPackage.RECORD_TYPE_DEFINITION__LIMITED:
        return limited != LIMITED_EDEFAULT;
      case AdbPackage.RECORD_TYPE_DEFINITION__RECORD_DEFINITION:
        return recordDefinition != null;
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

} //RecordTypeDefinitionImpl
