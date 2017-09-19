/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discriminant Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.DiscriminantSpecification#getDefiningIdentifiers <em>Defining Identifiers</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.DiscriminantSpecification#getOptNullExclusion <em>Opt Null Exclusion</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.DiscriminantSpecification#getAccessDefinition <em>Access Definition</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.DiscriminantSpecification#getSubtypeMark <em>Subtype Mark</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.DiscriminantSpecification#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getDiscriminantSpecification()
 * @model
 * @generated
 */
public interface DiscriminantSpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Defining Identifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Defining Identifiers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defining Identifiers</em>' containment reference.
   * @see #setDefiningIdentifiers(DefiningIdentifierList)
   * @see org.xtext.ada2005.adb.AdbPackage#getDiscriminantSpecification_DefiningIdentifiers()
   * @model containment="true"
   * @generated
   */
  DefiningIdentifierList getDefiningIdentifiers();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DiscriminantSpecification#getDefiningIdentifiers <em>Defining Identifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Defining Identifiers</em>' containment reference.
   * @see #getDefiningIdentifiers()
   * @generated
   */
  void setDefiningIdentifiers(DefiningIdentifierList value);

  /**
   * Returns the value of the '<em><b>Opt Null Exclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opt Null Exclusion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opt Null Exclusion</em>' containment reference.
   * @see #setOptNullExclusion(OptNullExclusion)
   * @see org.xtext.ada2005.adb.AdbPackage#getDiscriminantSpecification_OptNullExclusion()
   * @model containment="true"
   * @generated
   */
  OptNullExclusion getOptNullExclusion();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DiscriminantSpecification#getOptNullExclusion <em>Opt Null Exclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opt Null Exclusion</em>' containment reference.
   * @see #getOptNullExclusion()
   * @generated
   */
  void setOptNullExclusion(OptNullExclusion value);

  /**
   * Returns the value of the '<em><b>Access Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access Definition</em>' containment reference.
   * @see #setAccessDefinition(NotNullAccessDefinition)
   * @see org.xtext.ada2005.adb.AdbPackage#getDiscriminantSpecification_AccessDefinition()
   * @model containment="true"
   * @generated
   */
  NotNullAccessDefinition getAccessDefinition();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DiscriminantSpecification#getAccessDefinition <em>Access Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access Definition</em>' containment reference.
   * @see #getAccessDefinition()
   * @generated
   */
  void setAccessDefinition(NotNullAccessDefinition value);

  /**
   * Returns the value of the '<em><b>Subtype Mark</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subtype Mark</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subtype Mark</em>' containment reference.
   * @see #setSubtypeMark(Name)
   * @see org.xtext.ada2005.adb.AdbPackage#getDiscriminantSpecification_SubtypeMark()
   * @model containment="true"
   * @generated
   */
  Name getSubtypeMark();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DiscriminantSpecification#getSubtypeMark <em>Subtype Mark</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subtype Mark</em>' containment reference.
   * @see #getSubtypeMark()
   * @generated
   */
  void setSubtypeMark(Name value);

  /**
   * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' containment reference.
   * @see #setDefaultValue(Expression)
   * @see org.xtext.ada2005.adb.AdbPackage#getDiscriminantSpecification_DefaultValue()
   * @model containment="true"
   * @generated
   */
  Expression getDefaultValue();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DiscriminantSpecification#getDefaultValue <em>Default Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' containment reference.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(Expression value);

} // DiscriminantSpecification
