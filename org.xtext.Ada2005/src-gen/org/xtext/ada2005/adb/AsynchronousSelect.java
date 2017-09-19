/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asynchronous Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.AsynchronousSelect#getTriggeringAlternative <em>Triggering Alternative</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.AsynchronousSelect#getAbortablePart <em>Abortable Part</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getAsynchronousSelect()
 * @model
 * @generated
 */
public interface AsynchronousSelect extends SelectStatement
{
  /**
   * Returns the value of the '<em><b>Triggering Alternative</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Triggering Alternative</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triggering Alternative</em>' containment reference.
   * @see #setTriggeringAlternative(TriggeringAlternative)
   * @see org.xtext.ada2005.adb.AdbPackage#getAsynchronousSelect_TriggeringAlternative()
   * @model containment="true"
   * @generated
   */
  TriggeringAlternative getTriggeringAlternative();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.AsynchronousSelect#getTriggeringAlternative <em>Triggering Alternative</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Triggering Alternative</em>' containment reference.
   * @see #getTriggeringAlternative()
   * @generated
   */
  void setTriggeringAlternative(TriggeringAlternative value);

  /**
   * Returns the value of the '<em><b>Abortable Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abortable Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abortable Part</em>' containment reference.
   * @see #setAbortablePart(AbortablePart)
   * @see org.xtext.ada2005.adb.AdbPackage#getAsynchronousSelect_AbortablePart()
   * @model containment="true"
   * @generated
   */
  AbortablePart getAbortablePart();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.AsynchronousSelect#getAbortablePart <em>Abortable Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abortable Part</em>' containment reference.
   * @see #getAbortablePart()
   * @generated
   */
  void setAbortablePart(AbortablePart value);

} // AsynchronousSelect
