/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.SubprogramDeclaration;
import org.xtext.ada2005.adb.SubprogramSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprogram Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.SubprogramDeclarationImpl#getSubprogramSpecification <em>Subprogram Specification</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.SubprogramDeclarationImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.SubprogramDeclarationImpl#getRenamedName <em>Renamed Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.SubprogramDeclarationImpl#isNull <em>Null</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprogramDeclarationImpl extends BasicDeclarationImpl implements SubprogramDeclaration
{
  /**
   * The cached value of the '{@link #getSubprogramSpecification() <em>Subprogram Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubprogramSpecification()
   * @generated
   * @ordered
   */
  protected SubprogramSpecification subprogramSpecification;

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
   * The default value of the '{@link #getRenamedName() <em>Renamed Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRenamedName()
   * @generated
   * @ordered
   */
  protected static final String RENAMED_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRenamedName() <em>Renamed Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRenamedName()
   * @generated
   * @ordered
   */
  protected String renamedName = RENAMED_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isNull() <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNull()
   * @generated
   * @ordered
   */
  protected static final boolean NULL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNull() <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNull()
   * @generated
   * @ordered
   */
  protected boolean null_ = NULL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubprogramDeclarationImpl()
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
    return AdbPackage.eINSTANCE.getSubprogramDeclaration();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubprogramSpecification getSubprogramSpecification()
  {
    return subprogramSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubprogramSpecification(SubprogramSpecification newSubprogramSpecification, NotificationChain msgs)
  {
    SubprogramSpecification oldSubprogramSpecification = subprogramSpecification;
    subprogramSpecification = newSubprogramSpecification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.SUBPROGRAM_DECLARATION__SUBPROGRAM_SPECIFICATION, oldSubprogramSpecification, newSubprogramSpecification);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubprogramSpecification(SubprogramSpecification newSubprogramSpecification)
  {
    if (newSubprogramSpecification != subprogramSpecification)
    {
      NotificationChain msgs = null;
      if (subprogramSpecification != null)
        msgs = ((InternalEObject)subprogramSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SUBPROGRAM_DECLARATION__SUBPROGRAM_SPECIFICATION, null, msgs);
      if (newSubprogramSpecification != null)
        msgs = ((InternalEObject)newSubprogramSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SUBPROGRAM_DECLARATION__SUBPROGRAM_SPECIFICATION, null, msgs);
      msgs = basicSetSubprogramSpecification(newSubprogramSpecification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SUBPROGRAM_DECLARATION__SUBPROGRAM_SPECIFICATION, newSubprogramSpecification, newSubprogramSpecification));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SUBPROGRAM_DECLARATION__ABSTRACT, oldAbstract, abstract_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRenamedName()
  {
    return renamedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRenamedName(String newRenamedName)
  {
    String oldRenamedName = renamedName;
    renamedName = newRenamedName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SUBPROGRAM_DECLARATION__RENAMED_NAME, oldRenamedName, renamedName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNull()
  {
    return null_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNull(boolean newNull)
  {
    boolean oldNull = null_;
    null_ = newNull;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SUBPROGRAM_DECLARATION__NULL, oldNull, null_));
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
      case AdbPackage.SUBPROGRAM_DECLARATION__SUBPROGRAM_SPECIFICATION:
        return basicSetSubprogramSpecification(null, msgs);
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
      case AdbPackage.SUBPROGRAM_DECLARATION__SUBPROGRAM_SPECIFICATION:
        return getSubprogramSpecification();
      case AdbPackage.SUBPROGRAM_DECLARATION__ABSTRACT:
        return isAbstract();
      case AdbPackage.SUBPROGRAM_DECLARATION__RENAMED_NAME:
        return getRenamedName();
      case AdbPackage.SUBPROGRAM_DECLARATION__NULL:
        return isNull();
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
      case AdbPackage.SUBPROGRAM_DECLARATION__SUBPROGRAM_SPECIFICATION:
        setSubprogramSpecification((SubprogramSpecification)newValue);
        return;
      case AdbPackage.SUBPROGRAM_DECLARATION__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case AdbPackage.SUBPROGRAM_DECLARATION__RENAMED_NAME:
        setRenamedName((String)newValue);
        return;
      case AdbPackage.SUBPROGRAM_DECLARATION__NULL:
        setNull((Boolean)newValue);
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
      case AdbPackage.SUBPROGRAM_DECLARATION__SUBPROGRAM_SPECIFICATION:
        setSubprogramSpecification((SubprogramSpecification)null);
        return;
      case AdbPackage.SUBPROGRAM_DECLARATION__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case AdbPackage.SUBPROGRAM_DECLARATION__RENAMED_NAME:
        setRenamedName(RENAMED_NAME_EDEFAULT);
        return;
      case AdbPackage.SUBPROGRAM_DECLARATION__NULL:
        setNull(NULL_EDEFAULT);
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
      case AdbPackage.SUBPROGRAM_DECLARATION__SUBPROGRAM_SPECIFICATION:
        return subprogramSpecification != null;
      case AdbPackage.SUBPROGRAM_DECLARATION__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case AdbPackage.SUBPROGRAM_DECLARATION__RENAMED_NAME:
        return RENAMED_NAME_EDEFAULT == null ? renamedName != null : !RENAMED_NAME_EDEFAULT.equals(renamedName);
      case AdbPackage.SUBPROGRAM_DECLARATION__NULL:
        return null_ != NULL_EDEFAULT;
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
    result.append(", renamedName: ");
    result.append(renamedName);
    result.append(", null: ");
    result.append(null_);
    result.append(')');
    return result.toString();
  }

} //SubprogramDeclarationImpl
