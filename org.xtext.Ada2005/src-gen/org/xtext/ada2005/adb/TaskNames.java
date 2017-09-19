/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Names</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.TaskNames#getTaskNames <em>Task Names</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getTaskNames()
 * @model
 * @generated
 */
public interface TaskNames extends AbortStatement
{
  /**
   * Returns the value of the '<em><b>Task Names</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.Name}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Names</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Names</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getTaskNames_TaskNames()
   * @model containment="true"
   * @generated
   */
  EList<Name> getTaskNames();

} // TaskNames
