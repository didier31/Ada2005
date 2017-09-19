/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Body Formal Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.EntryBodyFormalPart#getEntryIndexSpecification <em>Entry Index Specification</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.EntryBodyFormalPart#getFormalPart <em>Formal Part</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getEntryBodyFormalPart()
 * @model
 * @generated
 */
public interface EntryBodyFormalPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Entry Index Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entry Index Specification</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry Index Specification</em>' containment reference.
   * @see #setEntryIndexSpecification(EntryIndexSpecification)
   * @see org.xtext.ada2005.adb.AdbPackage#getEntryBodyFormalPart_EntryIndexSpecification()
   * @model containment="true"
   * @generated
   */
  EntryIndexSpecification getEntryIndexSpecification();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.EntryBodyFormalPart#getEntryIndexSpecification <em>Entry Index Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entry Index Specification</em>' containment reference.
   * @see #getEntryIndexSpecification()
   * @generated
   */
  void setEntryIndexSpecification(EntryIndexSpecification value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getEntryBodyFormalPart_FormalPart()
   * @model containment="true"
   * @generated
   */
  FormalPart getFormalPart();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.EntryBodyFormalPart#getFormalPart <em>Formal Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formal Part</em>' containment reference.
   * @see #getFormalPart()
   * @generated
   */
  void setFormalPart(FormalPart value);

} // EntryBodyFormalPart
