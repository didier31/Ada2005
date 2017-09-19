/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goto Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.GotoStatement#getLabelId <em>Label Id</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getGotoStatement()
 * @model
 * @generated
 */
public interface GotoStatement extends SimpleStatement
{
  /**
   * Returns the value of the '<em><b>Label Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label Id</em>' attribute.
   * @see #setLabelId(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getGotoStatement_LabelId()
   * @model
   * @generated
   */
  String getLabelId();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.GotoStatement#getLabelId <em>Label Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Id</em>' attribute.
   * @see #getLabelId()
   * @generated
   */
  void setLabelId(String value);

} // GotoStatement
