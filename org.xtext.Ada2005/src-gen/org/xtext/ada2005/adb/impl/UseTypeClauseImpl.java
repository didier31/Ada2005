/**
 */
package org.xtext.ada2005.adb.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.UseTypeClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Type Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.UseTypeClauseImpl#getTypesNames <em>Types Names</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.UseTypeClauseImpl#getUseTypeRefs <em>Use Type Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseTypeClauseImpl extends UseClauseImpl implements UseTypeClause
{
  /**
   * The cached value of the '{@link #getTypesNames() <em>Types Names</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypesNames()
   * @generated
   * @ordered
   */
  protected EList<String> typesNames;

  /**
   * The cached value of the '{@link #getUseTypeRefs() <em>Use Type Refs</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUseTypeRefs()
   * @generated
   * @ordered
   */
  protected EList<String> useTypeRefs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UseTypeClauseImpl()
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
    return AdbPackage.eINSTANCE.getUseTypeClause();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getTypesNames()
  {
    if (typesNames == null)
    {
      typesNames = new EDataTypeEList<String>(String.class, this, AdbPackage.USE_TYPE_CLAUSE__TYPES_NAMES);
    }
    return typesNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getUseTypeRefs()
  {
    if (useTypeRefs == null)
    {
      useTypeRefs = new EDataTypeEList<String>(String.class, this, AdbPackage.USE_TYPE_CLAUSE__USE_TYPE_REFS);
    }
    return useTypeRefs;
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
      case AdbPackage.USE_TYPE_CLAUSE__TYPES_NAMES:
        return getTypesNames();
      case AdbPackage.USE_TYPE_CLAUSE__USE_TYPE_REFS:
        return getUseTypeRefs();
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
      case AdbPackage.USE_TYPE_CLAUSE__TYPES_NAMES:
        getTypesNames().clear();
        getTypesNames().addAll((Collection<? extends String>)newValue);
        return;
      case AdbPackage.USE_TYPE_CLAUSE__USE_TYPE_REFS:
        getUseTypeRefs().clear();
        getUseTypeRefs().addAll((Collection<? extends String>)newValue);
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
      case AdbPackage.USE_TYPE_CLAUSE__TYPES_NAMES:
        getTypesNames().clear();
        return;
      case AdbPackage.USE_TYPE_CLAUSE__USE_TYPE_REFS:
        getUseTypeRefs().clear();
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
      case AdbPackage.USE_TYPE_CLAUSE__TYPES_NAMES:
        return typesNames != null && !typesNames.isEmpty();
      case AdbPackage.USE_TYPE_CLAUSE__USE_TYPE_REFS:
        return useTypeRefs != null && !useTypeRefs.isEmpty();
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
    result.append(" (typesNames: ");
    result.append(typesNames);
    result.append(", useTypeRefs: ");
    result.append(useTypeRefs);
    result.append(')');
    return result.toString();
  }

} //UseTypeClauseImpl
