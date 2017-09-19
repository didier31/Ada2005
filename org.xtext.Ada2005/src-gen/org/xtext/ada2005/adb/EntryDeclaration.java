/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.EntryDeclaration#getOverriding <em>Overriding</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.EntryDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.EntryDeclaration#getDiscreteSubtypeDefinition <em>Discrete Subtype Definition</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.EntryDeclaration#getFormalPart <em>Formal Part</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getEntryDeclaration()
 * @model
 * @generated
 */
public interface EntryDeclaration extends TaskItem, ProtectedOperationDeclaration
{
  /**
   * Returns the value of the '<em><b>Overriding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Overriding</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Overriding</em>' containment reference.
   * @see #setOverriding(OverridingIndicator)
   * @see org.xtext.ada2005.adb.AdbPackage#getEntryDeclaration_Overriding()
   * @model containment="true"
   * @generated
   */
  OverridingIndicator getOverriding();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.EntryDeclaration#getOverriding <em>Overriding</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Overriding</em>' containment reference.
   * @see #getOverriding()
   * @generated
   */
  void setOverriding(OverridingIndicator value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getEntryDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.EntryDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Discrete Subtype Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Discrete Subtype Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Discrete Subtype Definition</em>' containment reference.
   * @see #setDiscreteSubtypeDefinition(DiscreteSubtypeDefinition)
   * @see org.xtext.ada2005.adb.AdbPackage#getEntryDeclaration_DiscreteSubtypeDefinition()
   * @model containment="true"
   * @generated
   */
  DiscreteSubtypeDefinition getDiscreteSubtypeDefinition();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.EntryDeclaration#getDiscreteSubtypeDefinition <em>Discrete Subtype Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Discrete Subtype Definition</em>' containment reference.
   * @see #getDiscreteSubtypeDefinition()
   * @generated
   */
  void setDiscreteSubtypeDefinition(DiscreteSubtypeDefinition value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getEntryDeclaration_FormalPart()
   * @model containment="true"
   * @generated
   */
  FormalPart getFormalPart();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.EntryDeclaration#getFormalPart <em>Formal Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formal Part</em>' containment reference.
   * @see #getFormalPart()
   * @generated
   */
  void setFormalPart(FormalPart value);

} // EntryDeclaration
