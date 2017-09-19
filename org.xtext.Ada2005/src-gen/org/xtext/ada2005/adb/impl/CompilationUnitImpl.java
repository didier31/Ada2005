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
import org.xtext.ada2005.adb.CompilationUnit;
import org.xtext.ada2005.adb.ContextClause;
import org.xtext.ada2005.adb.Pragma;
import org.xtext.ada2005.adb.Unit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.CompilationUnitImpl#getContextClause <em>Context Clause</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.CompilationUnitImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.CompilationUnitImpl#getPragmas <em>Pragmas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompilationUnitImpl extends MinimalEObjectImpl.Container implements CompilationUnit
{
  /**
   * The cached value of the '{@link #getContextClause() <em>Context Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContextClause()
   * @generated
   * @ordered
   */
  protected ContextClause contextClause;

  /**
   * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected Unit unit;

  /**
   * The cached value of the '{@link #getPragmas() <em>Pragmas</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPragmas()
   * @generated
   * @ordered
   */
  protected EList<Pragma> pragmas;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompilationUnitImpl()
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
    return AdbPackage.eINSTANCE.getCompilationUnit();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextClause getContextClause()
  {
    return contextClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContextClause(ContextClause newContextClause, NotificationChain msgs)
  {
    ContextClause oldContextClause = contextClause;
    contextClause = newContextClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.COMPILATION_UNIT__CONTEXT_CLAUSE, oldContextClause, newContextClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContextClause(ContextClause newContextClause)
  {
    if (newContextClause != contextClause)
    {
      NotificationChain msgs = null;
      if (contextClause != null)
        msgs = ((InternalEObject)contextClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.COMPILATION_UNIT__CONTEXT_CLAUSE, null, msgs);
      if (newContextClause != null)
        msgs = ((InternalEObject)newContextClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.COMPILATION_UNIT__CONTEXT_CLAUSE, null, msgs);
      msgs = basicSetContextClause(newContextClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.COMPILATION_UNIT__CONTEXT_CLAUSE, newContextClause, newContextClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unit getUnit()
  {
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnit(Unit newUnit, NotificationChain msgs)
  {
    Unit oldUnit = unit;
    unit = newUnit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.COMPILATION_UNIT__UNIT, oldUnit, newUnit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnit(Unit newUnit)
  {
    if (newUnit != unit)
    {
      NotificationChain msgs = null;
      if (unit != null)
        msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.COMPILATION_UNIT__UNIT, null, msgs);
      if (newUnit != null)
        msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.COMPILATION_UNIT__UNIT, null, msgs);
      msgs = basicSetUnit(newUnit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.COMPILATION_UNIT__UNIT, newUnit, newUnit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Pragma> getPragmas()
  {
    if (pragmas == null)
    {
      pragmas = new EObjectContainmentEList<Pragma>(Pragma.class, this, AdbPackage.COMPILATION_UNIT__PRAGMAS);
    }
    return pragmas;
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
      case AdbPackage.COMPILATION_UNIT__CONTEXT_CLAUSE:
        return basicSetContextClause(null, msgs);
      case AdbPackage.COMPILATION_UNIT__UNIT:
        return basicSetUnit(null, msgs);
      case AdbPackage.COMPILATION_UNIT__PRAGMAS:
        return ((InternalEList<?>)getPragmas()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.COMPILATION_UNIT__CONTEXT_CLAUSE:
        return getContextClause();
      case AdbPackage.COMPILATION_UNIT__UNIT:
        return getUnit();
      case AdbPackage.COMPILATION_UNIT__PRAGMAS:
        return getPragmas();
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
      case AdbPackage.COMPILATION_UNIT__CONTEXT_CLAUSE:
        setContextClause((ContextClause)newValue);
        return;
      case AdbPackage.COMPILATION_UNIT__UNIT:
        setUnit((Unit)newValue);
        return;
      case AdbPackage.COMPILATION_UNIT__PRAGMAS:
        getPragmas().clear();
        getPragmas().addAll((Collection<? extends Pragma>)newValue);
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
      case AdbPackage.COMPILATION_UNIT__CONTEXT_CLAUSE:
        setContextClause((ContextClause)null);
        return;
      case AdbPackage.COMPILATION_UNIT__UNIT:
        setUnit((Unit)null);
        return;
      case AdbPackage.COMPILATION_UNIT__PRAGMAS:
        getPragmas().clear();
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
      case AdbPackage.COMPILATION_UNIT__CONTEXT_CLAUSE:
        return contextClause != null;
      case AdbPackage.COMPILATION_UNIT__UNIT:
        return unit != null;
      case AdbPackage.COMPILATION_UNIT__PRAGMAS:
        return pragmas != null && !pragmas.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CompilationUnitImpl
