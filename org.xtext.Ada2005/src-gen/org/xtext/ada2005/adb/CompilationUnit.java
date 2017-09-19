/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.CompilationUnit#getContextClause <em>Context Clause</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.CompilationUnit#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.CompilationUnit#getPragmas <em>Pragmas</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getCompilationUnit()
 * @model
 * @generated
 */
public interface CompilationUnit extends EObject
{
  /**
   * Returns the value of the '<em><b>Context Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context Clause</em>' containment reference.
   * @see #setContextClause(ContextClause)
   * @see org.xtext.ada2005.adb.AdbPackage#getCompilationUnit_ContextClause()
   * @model containment="true"
   * @generated
   */
  ContextClause getContextClause();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.CompilationUnit#getContextClause <em>Context Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context Clause</em>' containment reference.
   * @see #getContextClause()
   * @generated
   */
  void setContextClause(ContextClause value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' containment reference.
   * @see #setUnit(Unit)
   * @see org.xtext.ada2005.adb.AdbPackage#getCompilationUnit_Unit()
   * @model containment="true"
   * @generated
   */
  Unit getUnit();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.CompilationUnit#getUnit <em>Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' containment reference.
   * @see #getUnit()
   * @generated
   */
  void setUnit(Unit value);

  /**
   * Returns the value of the '<em><b>Pragmas</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.Pragma}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pragmas</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pragmas</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getCompilationUnit_Pragmas()
   * @model containment="true"
   * @generated
   */
  EList<Pragma> getPragmas();

} // CompilationUnit
