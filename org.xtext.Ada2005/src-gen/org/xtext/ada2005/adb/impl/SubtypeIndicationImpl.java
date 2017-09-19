/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.OptConstraint;
import org.xtext.ada2005.adb.OptNullExclusion;
import org.xtext.ada2005.adb.SubtypeIndication;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subtype Indication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.SubtypeIndicationImpl#getOpt_nullExclusion <em>Opt null Exclusion</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.SubtypeIndicationImpl#getSubtypeMark <em>Subtype Mark</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.SubtypeIndicationImpl#getOpt_constraint <em>Opt constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubtypeIndicationImpl extends ReturnSubtypeIndicationImpl implements SubtypeIndication
{
  /**
   * The cached value of the '{@link #getOpt_nullExclusion() <em>Opt null Exclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpt_nullExclusion()
   * @generated
   * @ordered
   */
  protected OptNullExclusion opt_nullExclusion;

  /**
   * The default value of the '{@link #getSubtypeMark() <em>Subtype Mark</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtypeMark()
   * @generated
   * @ordered
   */
  protected static final String SUBTYPE_MARK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSubtypeMark() <em>Subtype Mark</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtypeMark()
   * @generated
   * @ordered
   */
  protected String subtypeMark = SUBTYPE_MARK_EDEFAULT;

  /**
   * The cached value of the '{@link #getOpt_constraint() <em>Opt constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpt_constraint()
   * @generated
   * @ordered
   */
  protected OptConstraint opt_constraint;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubtypeIndicationImpl()
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
    return AdbPackage.eINSTANCE.getSubtypeIndication();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptNullExclusion getOpt_nullExclusion()
  {
    return opt_nullExclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpt_nullExclusion(OptNullExclusion newOpt_nullExclusion, NotificationChain msgs)
  {
    OptNullExclusion oldOpt_nullExclusion = opt_nullExclusion;
    opt_nullExclusion = newOpt_nullExclusion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.SUBTYPE_INDICATION__OPT_NULL_EXCLUSION, oldOpt_nullExclusion, newOpt_nullExclusion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpt_nullExclusion(OptNullExclusion newOpt_nullExclusion)
  {
    if (newOpt_nullExclusion != opt_nullExclusion)
    {
      NotificationChain msgs = null;
      if (opt_nullExclusion != null)
        msgs = ((InternalEObject)opt_nullExclusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SUBTYPE_INDICATION__OPT_NULL_EXCLUSION, null, msgs);
      if (newOpt_nullExclusion != null)
        msgs = ((InternalEObject)newOpt_nullExclusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SUBTYPE_INDICATION__OPT_NULL_EXCLUSION, null, msgs);
      msgs = basicSetOpt_nullExclusion(newOpt_nullExclusion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SUBTYPE_INDICATION__OPT_NULL_EXCLUSION, newOpt_nullExclusion, newOpt_nullExclusion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSubtypeMark()
  {
    return subtypeMark;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubtypeMark(String newSubtypeMark)
  {
    String oldSubtypeMark = subtypeMark;
    subtypeMark = newSubtypeMark;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SUBTYPE_INDICATION__SUBTYPE_MARK, oldSubtypeMark, subtypeMark));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptConstraint getOpt_constraint()
  {
    return opt_constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpt_constraint(OptConstraint newOpt_constraint, NotificationChain msgs)
  {
    OptConstraint oldOpt_constraint = opt_constraint;
    opt_constraint = newOpt_constraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.SUBTYPE_INDICATION__OPT_CONSTRAINT, oldOpt_constraint, newOpt_constraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpt_constraint(OptConstraint newOpt_constraint)
  {
    if (newOpt_constraint != opt_constraint)
    {
      NotificationChain msgs = null;
      if (opt_constraint != null)
        msgs = ((InternalEObject)opt_constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SUBTYPE_INDICATION__OPT_CONSTRAINT, null, msgs);
      if (newOpt_constraint != null)
        msgs = ((InternalEObject)newOpt_constraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SUBTYPE_INDICATION__OPT_CONSTRAINT, null, msgs);
      msgs = basicSetOpt_constraint(newOpt_constraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SUBTYPE_INDICATION__OPT_CONSTRAINT, newOpt_constraint, newOpt_constraint));
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
      case AdbPackage.SUBTYPE_INDICATION__OPT_NULL_EXCLUSION:
        return basicSetOpt_nullExclusion(null, msgs);
      case AdbPackage.SUBTYPE_INDICATION__OPT_CONSTRAINT:
        return basicSetOpt_constraint(null, msgs);
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
      case AdbPackage.SUBTYPE_INDICATION__OPT_NULL_EXCLUSION:
        return getOpt_nullExclusion();
      case AdbPackage.SUBTYPE_INDICATION__SUBTYPE_MARK:
        return getSubtypeMark();
      case AdbPackage.SUBTYPE_INDICATION__OPT_CONSTRAINT:
        return getOpt_constraint();
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
      case AdbPackage.SUBTYPE_INDICATION__OPT_NULL_EXCLUSION:
        setOpt_nullExclusion((OptNullExclusion)newValue);
        return;
      case AdbPackage.SUBTYPE_INDICATION__SUBTYPE_MARK:
        setSubtypeMark((String)newValue);
        return;
      case AdbPackage.SUBTYPE_INDICATION__OPT_CONSTRAINT:
        setOpt_constraint((OptConstraint)newValue);
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
      case AdbPackage.SUBTYPE_INDICATION__OPT_NULL_EXCLUSION:
        setOpt_nullExclusion((OptNullExclusion)null);
        return;
      case AdbPackage.SUBTYPE_INDICATION__SUBTYPE_MARK:
        setSubtypeMark(SUBTYPE_MARK_EDEFAULT);
        return;
      case AdbPackage.SUBTYPE_INDICATION__OPT_CONSTRAINT:
        setOpt_constraint((OptConstraint)null);
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
      case AdbPackage.SUBTYPE_INDICATION__OPT_NULL_EXCLUSION:
        return opt_nullExclusion != null;
      case AdbPackage.SUBTYPE_INDICATION__SUBTYPE_MARK:
        return SUBTYPE_MARK_EDEFAULT == null ? subtypeMark != null : !SUBTYPE_MARK_EDEFAULT.equals(subtypeMark);
      case AdbPackage.SUBTYPE_INDICATION__OPT_CONSTRAINT:
        return opt_constraint != null;
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
    result.append(" (subtypeMark: ");
    result.append(subtypeMark);
    result.append(')');
    return result.toString();
  }

} //SubtypeIndicationImpl
