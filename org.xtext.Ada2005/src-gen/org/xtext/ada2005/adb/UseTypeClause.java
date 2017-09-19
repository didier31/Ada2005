/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Type Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.UseTypeClause#getTypesNames <em>Types Names</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.UseTypeClause#getUseTypeRefs <em>Use Type Refs</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getUseTypeClause()
 * @model
 * @generated
 */
public interface UseTypeClause extends UseClause
{
  /**
   * Returns the value of the '<em><b>Types Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types Names</em>' attribute list.
   * @see org.xtext.ada2005.adb.AdbPackage#getUseTypeClause_TypesNames()
   * @model unique="false"
   * @generated
   */
  EList<String> getTypesNames();

  /**
   * Returns the value of the '<em><b>Use Type Refs</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use Type Refs</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use Type Refs</em>' attribute list.
   * @see org.xtext.ada2005.adb.AdbPackage#getUseTypeClause_UseTypeRefs()
   * @model unique="false"
   * @generated
   */
  EList<String> getUseTypeRefs();

} // UseTypeClause
