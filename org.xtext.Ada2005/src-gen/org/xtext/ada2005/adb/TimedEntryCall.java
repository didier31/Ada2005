/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Entry Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.TimedEntryCall#getEntryCallAlternative <em>Entry Call Alternative</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.TimedEntryCall#getDelayAlternative <em>Delay Alternative</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getTimedEntryCall()
 * @model
 * @generated
 */
public interface TimedEntryCall extends SelectStatement
{
  /**
   * Returns the value of the '<em><b>Entry Call Alternative</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entry Call Alternative</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry Call Alternative</em>' containment reference.
   * @see #setEntryCallAlternative(EntryCallAlternative)
   * @see org.xtext.ada2005.adb.AdbPackage#getTimedEntryCall_EntryCallAlternative()
   * @model containment="true"
   * @generated
   */
  EntryCallAlternative getEntryCallAlternative();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.TimedEntryCall#getEntryCallAlternative <em>Entry Call Alternative</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entry Call Alternative</em>' containment reference.
   * @see #getEntryCallAlternative()
   * @generated
   */
  void setEntryCallAlternative(EntryCallAlternative value);

  /**
   * Returns the value of the '<em><b>Delay Alternative</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delay Alternative</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delay Alternative</em>' containment reference.
   * @see #setDelayAlternative(DelayAlternative)
   * @see org.xtext.ada2005.adb.AdbPackage#getTimedEntryCall_DelayAlternative()
   * @model containment="true"
   * @generated
   */
  DelayAlternative getDelayAlternative();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.TimedEntryCall#getDelayAlternative <em>Delay Alternative</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delay Alternative</em>' containment reference.
   * @see #getDelayAlternative()
   * @generated
   */
  void setDelayAlternative(DelayAlternative value);

} // TimedEntryCall
