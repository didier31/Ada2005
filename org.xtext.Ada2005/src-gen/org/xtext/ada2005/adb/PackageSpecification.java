/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.PackageSpecification#getPublicBasicDeclarativeItems <em>Public Basic Declarative Items</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.PackageSpecification#getPrivateBasicDeclarativeItems <em>Private Basic Declarative Items</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.PackageSpecification#getEndname <em>Endname</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getPackageSpecification()
 * @model
 * @generated
 */
public interface PackageSpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Public Basic Declarative Items</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.BasicDeclarativeItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Public Basic Declarative Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Public Basic Declarative Items</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getPackageSpecification_PublicBasicDeclarativeItems()
   * @model containment="true"
   * @generated
   */
  EList<BasicDeclarativeItem> getPublicBasicDeclarativeItems();

  /**
   * Returns the value of the '<em><b>Private Basic Declarative Items</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.BasicDeclarativeItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Private Basic Declarative Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Private Basic Declarative Items</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getPackageSpecification_PrivateBasicDeclarativeItems()
   * @model containment="true"
   * @generated
   */
  EList<BasicDeclarativeItem> getPrivateBasicDeclarativeItems();

  /**
   * Returns the value of the '<em><b>Endname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Endname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Endname</em>' attribute.
   * @see #setEndname(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getPackageSpecification_Endname()
   * @model
   * @generated
   */
  String getEndname();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.PackageSpecification#getEndname <em>Endname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Endname</em>' attribute.
   * @see #getEndname()
   * @generated
   */
  void setEndname(String value);

} // PackageSpecification
