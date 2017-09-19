/**
 */
package org.xtext.ada2005.adb.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.LibraryUnitDeclaration;
import org.xtext.ada2005.adb.UsePackageClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Package Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.UsePackageClauseImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsePackageClauseImpl extends UseClauseImpl implements UsePackageClause
{
  /**
   * The cached value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNamespace()
   * @generated
   * @ordered
   */
  protected EList<LibraryUnitDeclaration> importedNamespace;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UsePackageClauseImpl()
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
    return AdbPackage.eINSTANCE.getUsePackageClause();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LibraryUnitDeclaration> getImportedNamespace()
  {
    if (importedNamespace == null)
    {
      importedNamespace = new EObjectResolvingEList<LibraryUnitDeclaration>(LibraryUnitDeclaration.class, this, AdbPackage.USE_PACKAGE_CLAUSE__IMPORTED_NAMESPACE);
    }
    return importedNamespace;
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
      case AdbPackage.USE_PACKAGE_CLAUSE__IMPORTED_NAMESPACE:
        return getImportedNamespace();
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
      case AdbPackage.USE_PACKAGE_CLAUSE__IMPORTED_NAMESPACE:
        getImportedNamespace().clear();
        getImportedNamespace().addAll((Collection<? extends LibraryUnitDeclaration>)newValue);
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
      case AdbPackage.USE_PACKAGE_CLAUSE__IMPORTED_NAMESPACE:
        getImportedNamespace().clear();
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
      case AdbPackage.USE_PACKAGE_CLAUSE__IMPORTED_NAMESPACE:
        return importedNamespace != null && !importedNamespace.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UsePackageClauseImpl
