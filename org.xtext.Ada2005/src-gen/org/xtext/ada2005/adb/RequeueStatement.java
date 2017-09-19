/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requeue Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.RequeueStatement#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.RequeueStatement#isAbort <em>Abort</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getRequeueStatement()
 * @model
 * @generated
 */
public interface RequeueStatement extends SimpleStatement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Name)
   * @see org.xtext.ada2005.adb.AdbPackage#getRequeueStatement_Name()
   * @model containment="true"
   * @generated
   */
  Name getName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.RequeueStatement#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Name value);

  /**
   * Returns the value of the '<em><b>Abort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abort</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abort</em>' attribute.
   * @see #setAbort(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getRequeueStatement_Abort()
   * @model
   * @generated
   */
  boolean isAbort();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.RequeueStatement#isAbort <em>Abort</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abort</em>' attribute.
   * @see #isAbort()
   * @generated
   */
  void setAbort(boolean value);

} // RequeueStatement
