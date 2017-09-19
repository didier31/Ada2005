/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.FormalPart;
import org.xtext.ada2005.adb.ProcedureSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.ProcedureSpecificationImpl#getFormalPart <em>Formal Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureSpecificationImpl extends SubprogramSpecificationImpl implements ProcedureSpecification
{
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
  protected ProcedureSpecificationImpl()
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
    return AdbPackage.eINSTANCE.getProcedureSpecification();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.PROCEDURE_SPECIFICATION__FORMAL_PART, oldFormalPart, newFormalPart);
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
        msgs = ((InternalEObject)formalPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PROCEDURE_SPECIFICATION__FORMAL_PART, null, msgs);
      if (newFormalPart != null)
        msgs = ((InternalEObject)newFormalPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PROCEDURE_SPECIFICATION__FORMAL_PART, null, msgs);
      msgs = basicSetFormalPart(newFormalPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PROCEDURE_SPECIFICATION__FORMAL_PART, newFormalPart, newFormalPart));
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
      case AdbPackage.PROCEDURE_SPECIFICATION__FORMAL_PART:
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
      case AdbPackage.PROCEDURE_SPECIFICATION__FORMAL_PART:
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
      case AdbPackage.PROCEDURE_SPECIFICATION__FORMAL_PART:
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
      case AdbPackage.PROCEDURE_SPECIFICATION__FORMAL_PART:
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
      case AdbPackage.PROCEDURE_SPECIFICATION__FORMAL_PART:
        return formalPart != null;
    }
    return super.eIsSet(featureID);
  }

} //ProcedureSpecificationImpl
