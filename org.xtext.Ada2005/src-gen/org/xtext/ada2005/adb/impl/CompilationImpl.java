/**
 */
package org.xtext.ada2005.adb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.Compilation;
import org.xtext.ada2005.adb.CompilationUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.CompilationImpl#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompilationImpl extends MinimalEObjectImpl.Container implements Compilation
{
  /**
   * The cached value of the '{@link #getCompilationUnits() <em>Compilation Units</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompilationUnits()
   * @generated
   * @ordered
   */
  protected EList<CompilationUnit> compilationUnits;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompilationImpl()
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
    return AdbPackage.eINSTANCE.getCompilation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CompilationUnit> getCompilationUnits()
  {
    if (compilationUnits == null)
    {
      compilationUnits = new EObjectContainmentEList<CompilationUnit>(CompilationUnit.class, this, AdbPackage.COMPILATION__COMPILATION_UNITS);
    }
    return compilationUnits;
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
      case AdbPackage.COMPILATION__COMPILATION_UNITS:
        return ((InternalEList<?>)getCompilationUnits()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.COMPILATION__COMPILATION_UNITS:
        return getCompilationUnits();
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
      case AdbPackage.COMPILATION__COMPILATION_UNITS:
        getCompilationUnits().clear();
        getCompilationUnits().addAll((Collection<? extends CompilationUnit>)newValue);
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
      case AdbPackage.COMPILATION__COMPILATION_UNITS:
        getCompilationUnits().clear();
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
      case AdbPackage.COMPILATION__COMPILATION_UNITS:
        return compilationUnits != null && !compilationUnits.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CompilationImpl
