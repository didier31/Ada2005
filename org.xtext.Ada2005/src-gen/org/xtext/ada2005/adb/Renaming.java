/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Renaming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.Renaming#getRenamed <em>Renamed</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getRenaming()
 * @model
 * @generated
 */
public interface Renaming extends PackageDeclaration
{
  /**
   * Returns the value of the '<em><b>Renamed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Renamed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Renamed</em>' attribute.
   * @see #setRenamed(String)
   * @see org.xtext.ada2005.adb.AdbPackage#getRenaming_Renamed()
   * @model
   * @generated
   */
  String getRenamed();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.Renaming#getRenamed <em>Renamed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Renamed</em>' attribute.
   * @see #getRenamed()
   * @generated
   */
  void setRenamed(String value);

} // Renaming
