/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.ContextClause#getContextItems <em>Context Items</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getContextClause()
 * @model
 * @generated
 */
public interface ContextClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Context Items</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.ContextItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context Items</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getContextClause_ContextItems()
   * @model containment="true"
   * @generated
   */
  EList<ContextItem> getContextItems();

} // ContextClause
