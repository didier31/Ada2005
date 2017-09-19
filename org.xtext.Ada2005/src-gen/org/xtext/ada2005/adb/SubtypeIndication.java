/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subtype Indication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.SubtypeIndication#getOpt_nullExclusion <em>Opt null Exclusion</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.SubtypeIndication#getSubtypeMark <em>Subtype Mark</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.SubtypeIndication#getOpt_constraint <em>Opt constraint</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getSubtypeIndication()
 * @model
 * @generated
 */
public interface SubtypeIndication extends ReturnSubtypeIndication, DiscreteSubtypeDefinition, DiscreteRange, DiscreteChoice
{
  /**
   * Returns the value of the '<em><b>Opt null Exclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opt null Exclusion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opt null Exclusion</em>' containment reference.
   * @see #setOpt_nullExclusion(OptNullExclusion)
   * @see org.xtext.ada2005.adb.AdbPackage#getSubtypeIndication_Opt_nullExclusion()
   * @model containment="true"
   * @generated
   */
  OptNullExclusion getOpt_nullExclusion();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SubtypeIndication#getOpt_nullExclusion <em>Opt null Exclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opt null Exclusion</em>' containment reference.
   * @see #getOpt_nullExclusion()
   * @generated
   */
  void setOpt_nullExclusion(OptNullExclusion value);

  /**
   * Returns the value of the '<em><b>Subtype Mark</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subtype Mark</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subtype Mark</em>' attribute.
   * @see #setSubtypeMark(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getSubtypeIndication_SubtypeMark()
   * @model
   * @generated
   */
  String getSubtypeMark();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SubtypeIndication#getSubtypeMark <em>Subtype Mark</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subtype Mark</em>' attribute.
   * @see #getSubtypeMark()
   * @generated
   */
  void setSubtypeMark(String value);

  /**
   * Returns the value of the '<em><b>Opt constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opt constraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opt constraint</em>' containment reference.
   * @see #setOpt_constraint(OptConstraint)
   * @see org.xtext.ada2005.adb.AdbPackage#getSubtypeIndication_Opt_constraint()
   * @model containment="true"
   * @generated
   */
  OptConstraint getOpt_constraint();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.SubtypeIndication#getOpt_constraint <em>Opt constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opt constraint</em>' containment reference.
   * @see #getOpt_constraint()
   * @generated
   */
  void setOpt_constraint(OptConstraint value);

} // SubtypeIndication
