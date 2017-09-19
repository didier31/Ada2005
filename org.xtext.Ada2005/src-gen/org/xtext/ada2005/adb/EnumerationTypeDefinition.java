/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.EnumerationTypeDefinition#getEnumerationliteralspecifications <em>Enumerationliteralspecifications</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getEnumerationTypeDefinition()
 * @model
 * @generated
 */
public interface EnumerationTypeDefinition extends TypeDefinition
{
  /**
   * Returns the value of the '<em><b>Enumerationliteralspecifications</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumerationliteralspecifications</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumerationliteralspecifications</em>' attribute list.
   * @see org.xtext.ada2005.adb.AdbPackage#getEnumerationTypeDefinition_Enumerationliteralspecifications()
   * @model unique="false"
   * @generated
   */
  EList<String> getEnumerationliteralspecifications();

} // EnumerationTypeDefinition
