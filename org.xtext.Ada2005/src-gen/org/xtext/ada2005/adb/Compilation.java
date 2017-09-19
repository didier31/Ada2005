/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.Compilation#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getCompilation()
 * @model
 * @generated
 */
public interface Compilation extends EObject
{
  /**
   * Returns the value of the '<em><b>Compilation Units</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.CompilationUnit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compilation Units</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compilation Units</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getCompilation_CompilationUnits()
   * @model containment="true"
   * @generated
   */
  EList<CompilationUnit> getCompilationUnits();

} // Compilation
