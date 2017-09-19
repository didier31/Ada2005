/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>With Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.WithClause#isLimited <em>Limited</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.WithClause#isPrivate <em>Private</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.WithClause#getImportURI <em>Import URI</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getWithClause()
 * @model
 * @generated
 */
public interface WithClause extends ContextItem
{
  /**
   * Returns the value of the '<em><b>Limited</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Limited</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Limited</em>' attribute.
   * @see #setLimited(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getWithClause_Limited()
   * @model
   * @generated
   */
  boolean isLimited();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.WithClause#isLimited <em>Limited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limited</em>' attribute.
   * @see #isLimited()
   * @generated
   */
  void setLimited(boolean value);

  /**
   * Returns the value of the '<em><b>Private</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Private</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Private</em>' attribute.
   * @see #setPrivate(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getWithClause_Private()
   * @model
   * @generated
   */
  boolean isPrivate();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.WithClause#isPrivate <em>Private</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Private</em>' attribute.
   * @see #isPrivate()
   * @generated
   */
  void setPrivate(boolean value);

  /**
   * Returns the value of the '<em><b>Import URI</b></em>' reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.LibraryUnitDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import URI</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import URI</em>' reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getWithClause_ImportURI()
   * @model
   * @generated
   */
  EList<LibraryUnitDeclaration> getImportURI();

} // WithClause
