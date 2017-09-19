/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Package Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.UsePackageClause#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getUsePackageClause()
 * @model
 * @generated
 */
public interface UsePackageClause extends UseClause
{
  /**
   * Returns the value of the '<em><b>Imported Namespace</b></em>' reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.LibraryUnitDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Namespace</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Namespace</em>' reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getUsePackageClause_ImportedNamespace()
   * @model
   * @generated
   */
  EList<LibraryUnitDeclaration> getImportedNamespace();

} // UsePackageClause
