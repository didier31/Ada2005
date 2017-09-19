/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.SubprogramSpecification#getOverridingIndicator <em>Overriding Indicator</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getSubprogramSpecification()
 * @model
 * @generated
 */
public interface SubprogramSpecification extends LibraryUnitSpecification, LibrarySpecification, BodyStub
{
  /**
   * Returns the value of the '<em><b>Overriding Indicator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Overriding Indicator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Overriding Indicator</em>' containment reference.
   * @see #setOverridingIndicator(OverridingIndicator)
   * @see org.xtext.ada2005.adb.AdbPackage#getSubprogramSpecification_OverridingIndicator()
   * @model containment="true"
   * @generated
   */
  OverridingIndicator getOverridingIndicator();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SubprogramSpecification#getOverridingIndicator <em>Overriding Indicator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Overriding Indicator</em>' containment reference.
   * @see #getOverridingIndicator()
   * @generated
   */
  void setOverridingIndicator(OverridingIndicator value);

} // SubprogramSpecification
