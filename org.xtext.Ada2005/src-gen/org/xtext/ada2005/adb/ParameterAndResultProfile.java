/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter And Result Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.ParameterAndResultProfile#getFormalPart <em>Formal Part</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ParameterAndResultProfile#getOpt_nullExclusion <em>Opt null Exclusion</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ParameterAndResultProfile#getSubtypeMark <em>Subtype Mark</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ParameterAndResultProfile#getAnonymousAccessDefinition <em>Anonymous Access Definition</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getParameterAndResultProfile()
 * @model
 * @generated
 */
public interface ParameterAndResultProfile extends EObject
{
  /**
   * Returns the value of the '<em><b>Formal Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formal Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formal Part</em>' containment reference.
   * @see #setFormalPart(FormalPart)
   * @see org.xtext.ada2005.adb.AdbPackage#getParameterAndResultProfile_FormalPart()
   * @model containment="true"
   * @generated
   */
  FormalPart getFormalPart();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ParameterAndResultProfile#getFormalPart <em>Formal Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formal Part</em>' containment reference.
   * @see #getFormalPart()
   * @generated
   */
  void setFormalPart(FormalPart value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getParameterAndResultProfile_Opt_nullExclusion()
   * @model containment="true"
   * @generated
   */
  OptNullExclusion getOpt_nullExclusion();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ParameterAndResultProfile#getOpt_nullExclusion <em>Opt null Exclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opt null Exclusion</em>' containment reference.
   * @see #getOpt_nullExclusion()
   * @generated
   */
  void setOpt_nullExclusion(OptNullExclusion value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getParameterAndResultProfile_SubtypeMark()
   * @model containment="true"
   * @generated
   */
  Name getSubtypeMark();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ParameterAndResultProfile#getSubtypeMark <em>Subtype Mark</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subtype Mark</em>' containment reference.
   * @see #getSubtypeMark()
   * @generated
   */
  void setSubtypeMark(Name value);

  /**
   * Returns the value of the '<em><b>Anonymous Access Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anonymous Access Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anonymous Access Definition</em>' containment reference.
   * @see #setAnonymousAccessDefinition(AnonymousAccessDefinition)
   * @see org.xtext.ada2005.adb.AdbPackage#getParameterAndResultProfile_AnonymousAccessDefinition()
   * @model containment="true"
   * @generated
   */
  AnonymousAccessDefinition getAnonymousAccessDefinition();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ParameterAndResultProfile#getAnonymousAccessDefinition <em>Anonymous Access Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anonymous Access Definition</em>' containment reference.
   * @see #getAnonymousAccessDefinition()
   * @generated
   */
  void setAnonymousAccessDefinition(AnonymousAccessDefinition value);

} // ParameterAndResultProfile
