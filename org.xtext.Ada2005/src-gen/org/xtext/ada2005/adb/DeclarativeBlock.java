/**
 */
package org.xtext.ada2005.adb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declarative Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.DeclarativeBlock#getDeclarativeItems <em>Declarative Items</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.DeclarativeBlock#getHandledSequenceOfStatements <em>Handled Sequence Of Statements</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getDeclarativeBlock()
 * @model
 * @generated
 */
public interface DeclarativeBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Declarative Items</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ada2005.adb.DeclarativeItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarative Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarative Items</em>' containment reference list.
   * @see org.xtext.ada2005.adb.AdbPackage#getDeclarativeBlock_DeclarativeItems()
   * @model containment="true"
   * @generated
   */
  EList<DeclarativeItem> getDeclarativeItems();

  /**
   * Returns the value of the '<em><b>Handled Sequence Of Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Handled Sequence Of Statements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Handled Sequence Of Statements</em>' containment reference.
   * @see #setHandledSequenceOfStatements(HandledSequenceOfStatements)
   * @see org.xtext.ada2005.adb.AdbPackage#getDeclarativeBlock_HandledSequenceOfStatements()
   * @model containment="true"
   * @generated
   */
  HandledSequenceOfStatements getHandledSequenceOfStatements();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DeclarativeBlock#getHandledSequenceOfStatements <em>Handled Sequence Of Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Handled Sequence Of Statements</em>' containment reference.
   * @see #getHandledSequenceOfStatements()
   * @generated
   */
  void setHandledSequenceOfStatements(HandledSequenceOfStatements value);

} // DeclarativeBlock
