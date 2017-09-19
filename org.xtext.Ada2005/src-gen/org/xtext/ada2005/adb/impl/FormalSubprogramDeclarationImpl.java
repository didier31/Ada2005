/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.FormalSubprogramDeclaration;
import org.xtext.ada2005.adb.SubprogramDefault;
import org.xtext.ada2005.adb.SubprogramSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Subprogram Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalSubprogramDeclarationImpl#getSubprogramSpecification <em>Subprogram Specification</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalSubprogramDeclarationImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalSubprogramDeclarationImpl#getSubprogramDefault <em>Subprogram Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormalSubprogramDeclarationImpl extends GenericFormalParameterDeclarationImpl implements FormalSubprogramDeclaration
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
   * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstract()
   * @generated
   * @ordered
   */
  protected static final String ABSTRACT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstract()
   * @generated
   * @ordered
   */
  protected String abstract_ = ABSTRACT_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubprogramDefault() <em>Subprogram Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubprogramDefault()
   * @generated
   * @ordered
   */
  protected SubprogramDefault subprogramDefault;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormalSubprogramDeclarationImpl()
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
    return AdbPackage.eINSTANCE.getFormalSubprogramDeclaration();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_SUBPROGRAM_DECLARATION__SUBPROGRAM_SPECIFICATION, oldSubprogramSpecification, newSubprogramSpecification);
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
        msgs = ((InternalEObject)subprogramSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_SUBPROGRAM_DECLARATION__SUBPROGRAM_SPECIFICATION, null, msgs);
      if (newSubprogramSpecification != null)
        msgs = ((InternalEObject)newSubprogramSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_SUBPROGRAM_DECLARATION__SUBPROGRAM_SPECIFICATION, null, msgs);
      msgs = basicSetSubprogramSpecification(newSubprogramSpecification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_SUBPROGRAM_DECLARATION__SUBPROGRAM_SPECIFICATION, newSubprogramSpecification, newSubprogramSpecification));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(String newAbstract)
  {
    String oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_SUBPROGRAM_DECLARATION__ABSTRACT, oldAbstract, abstract_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubprogramDefault getSubprogramDefault()
  {
    return subprogramDefault;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubprogramDefault(SubprogramDefault newSubprogramDefault, NotificationChain msgs)
  {
    SubprogramDefault oldSubprogramDefault = subprogramDefault;
    subprogramDefault = newSubprogramDefault;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_SUBPROGRAM_DECLARATION__SUBPROGRAM_DEFAULT, oldSubprogramDefault, newSubprogramDefault);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubprogramDefault(SubprogramDefault newSubprogramDefault)
  {
    if (newSubprogramDefault != subprogramDefault)
    {
      NotificationChain msgs = null;
      if (subprogramDefault != null)
        msgs = ((InternalEObject)subprogramDefault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_SUBPROGRAM_DECLARATION__SUBPROGRAM_DEFAULT, null, msgs);
      if (newSubprogramDefault != null)
        msgs = ((InternalEObject)newSubprogramDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_SUBPROGRAM_DECLARATION__SUBPROGRAM_DEFAULT, null, msgs);
      msgs = basicSetSubprogramDefault(newSubprogramDefault, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_SUBPROGRAM_DECLARATION__SUBPROGRAM_DEFAULT, newSubprogramDefault, newSubprogramDefault));
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
      case AdbPackage.FORMAL_SUBPROGRAM_DECLARATION__SUBPROGRAM_SPECIFICATION:
        return basicSetSubprogramSpecification(null, msgs);
      case AdbPackage.FORMAL_SUBPROGRAM_DECLARATION__SUBPROGRAM_DEFAULT:
        return basicSetSubprogramDefault(null, msgs);
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
      case AdbPackage.FORMAL_SUBPROGRAM_DECLARATION__SUBPROGRAM_SPECIFICATION:
        return getSubprogramSpecification();
      case AdbPackage.FORMAL_SUBPROGRAM_DECLARATION__ABSTRACT:
        return getAbstract();
      case AdbPackage.FORMAL_SUBPROGRAM_DECLARATION__SUBPROGRAM_DEFAULT:
        return getSubprogramDefault();
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
      case AdbPackage.FORMAL_SUBPROGRAM_DECLARATION__SUBPROGRAM_SPECIFICATION:
        setSubprogramSpecification((SubprogramSpecification)newValue);
        return;
      case AdbPackage.FORMAL_SUBPROGRAM_DECLARATION__ABSTRACT:
        setAbstract((String)newValue);
        return;
      case AdbPackage.FORMAL_SUBPROGRAM_DECLARATION__SUBPROGRAM_DEFAULT:
        setSubprogramDefault((SubprogramDefault)newValue);
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
      case AdbPackage.FORMAL_SUBPROGRAM_DECLARATION__SUBPROGRAM_SPECIFICATION:
        setSubprogramSpecification((SubprogramSpecification)null);
        return;
      case AdbPackage.FORMAL_SUBPROGRAM_DECLARATION__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case AdbPackage.FORMAL_SUBPROGRAM_DECLARATION__SUBPROGRAM_DEFAULT:
        setSubprogramDefault((SubprogramDefault)null);
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
      case AdbPackage.FORMAL_SUBPROGRAM_DECLARATION__SUBPROGRAM_SPECIFICATION:
        return subprogramSpecification != null;
      case AdbPackage.FORMAL_SUBPROGRAM_DECLARATION__ABSTRACT:
        return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
      case AdbPackage.FORMAL_SUBPROGRAM_DECLARATION__SUBPROGRAM_DEFAULT:
        return subprogramDefault != null;
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
    result.append(')');
    return result.toString();
  }

} //FormalSubprogramDeclarationImpl
