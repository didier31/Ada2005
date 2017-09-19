/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discriminant Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.DiscriminantAssociation#getDiscriminantSelectors <em>Discriminant Selectors</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.DiscriminantAssociation#getActualParameter <em>Actual Parameter</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getDiscriminantAssociation()
 * @model
 * @generated
 */
public interface DiscriminantAssociation extends EObject
{
  /**
   * Returns the value of the '<em><b>Discriminant Selectors</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Discriminant Selectors</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Discriminant Selectors</em>' containment reference.
   * @see #setDiscriminantSelectors(DiscriminantSelectors)
   * @see org.xtext.ada2005.adb.AdbPackage#getDiscriminantAssociation_DiscriminantSelectors()
   * @model containment="true"
   * @generated
   */
  DiscriminantSelectors getDiscriminantSelectors();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DiscriminantAssociation#getDiscriminantSelectors <em>Discriminant Selectors</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Discriminant Selectors</em>' containment reference.
   * @see #getDiscriminantSelectors()
   * @generated
   */
  void setDiscriminantSelectors(DiscriminantSelectors value);

  /**
   * Returns the value of the '<em><b>Actual Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actual Parameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actual Parameter</em>' containment reference.
   * @see #setActualParameter(Expression)
   * @see org.xtext.ada2005.adb.AdbPackage#getDiscriminantAssociation_ActualParameter()
   * @model containment="true"
   * @generated
   */
  Expression getActualParameter();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DiscriminantAssociation#getActualParameter <em>Actual Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actual Parameter</em>' containment reference.
   * @see #getActualParameter()
   * @generated
   */
  void setActualParameter(Expression value);

} // DiscriminantAssociation
