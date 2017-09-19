/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.ArrayTypeDefinition#getArrayIndexes <em>Array Indexes</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.ArrayTypeDefinition#getComponentDefinition <em>Component Definition</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getArrayTypeDefinition()
 * @model
 * @generated
 */
public interface ArrayTypeDefinition extends FormalTypeDefinition, TypeDefinition
{
  /**
   * Returns the value of the '<em><b>Array Indexes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array Indexes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Indexes</em>' containment reference.
   * @see #setArrayIndexes(ArrayIndexes)
   * @see org.xtext.ada2005.adb.AdbPackage#getArrayTypeDefinition_ArrayIndexes()
   * @model containment="true"
   * @generated
   */
  ArrayIndexes getArrayIndexes();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ArrayTypeDefinition#getArrayIndexes <em>Array Indexes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array Indexes</em>' containment reference.
   * @see #getArrayIndexes()
   * @generated
   */
  void setArrayIndexes(ArrayIndexes value);

  /**
   * Returns the value of the '<em><b>Component Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component Definition</em>' containment reference.
   * @see #setComponentDefinition(ComponentDefinition)
   * @see org.xtext.ada2005.adb.AdbPackage#getArrayTypeDefinition_ComponentDefinition()
   * @model containment="true"
   * @generated
   */
  ComponentDefinition getComponentDefinition();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.ArrayTypeDefinition#getComponentDefinition <em>Component Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component Definition</em>' containment reference.
   * @see #getComponentDefinition()
   * @generated
   */
  void setComponentDefinition(ComponentDefinition value);

} // ArrayTypeDefinition
