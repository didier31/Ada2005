/**
 */
package org.xtext.ada2005.adb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Instance Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.DataInstanceDeclaration#getDefiningIdentifierList <em>Defining Identifier List</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.DataInstanceDeclaration#isAliased <em>Aliased</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.DataInstanceDeclaration#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.DataInstanceDeclaration#getSubtypeIndication <em>Subtype Indication</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.DataInstanceDeclaration#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.DataInstanceDeclaration#getObjectName <em>Object Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.DataInstanceDeclaration#getAnonymousAccessDefinition <em>Anonymous Access Definition</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.DataInstanceDeclaration#getArrayTypeDefinition <em>Array Type Definition</em>}</li>
 * </ul>
 *
 * @see org.xtext.ada2005.adb.AdbPackage#getDataInstanceDeclaration()
 * @model
 * @generated
 */
public interface DataInstanceDeclaration extends ObjectDeclaration
{
  /**
   * Returns the value of the '<em><b>Defining Identifier List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Defining Identifier List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defining Identifier List</em>' containment reference.
   * @see #setDefiningIdentifierList(DefiningIdentifierList)
   * @see org.xtext.ada2005.adb.AdbPackage#getDataInstanceDeclaration_DefiningIdentifierList()
   * @model containment="true"
   * @generated
   */
  DefiningIdentifierList getDefiningIdentifierList();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DataInstanceDeclaration#getDefiningIdentifierList <em>Defining Identifier List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Defining Identifier List</em>' containment reference.
   * @see #getDefiningIdentifierList()
   * @generated
   */
  void setDefiningIdentifierList(DefiningIdentifierList value);

  /**
   * Returns the value of the '<em><b>Aliased</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aliased</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aliased</em>' attribute.
   * @see #setAliased(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getDataInstanceDeclaration_Aliased()
   * @model
   * @generated
   */
  boolean isAliased();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DataInstanceDeclaration#isAliased <em>Aliased</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aliased</em>' attribute.
   * @see #isAliased()
   * @generated
   */
  void setAliased(boolean value);

  /**
   * Returns the value of the '<em><b>Constant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' attribute.
   * @see #setConstant(boolean)
   * @see org.xtext.ada2005.adb.AdbPackage#getDataInstanceDeclaration_Constant()
   * @model
   * @generated
   */
  boolean isConstant();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DataInstanceDeclaration#isConstant <em>Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' attribute.
   * @see #isConstant()
   * @generated
   */
  void setConstant(boolean value);

  /**
   * Returns the value of the '<em><b>Subtype Indication</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subtype Indication</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subtype Indication</em>' containment reference.
   * @see #setSubtypeIndication(SubtypeIndication)
   * @see org.xtext.ada2005.adb.AdbPackage#getDataInstanceDeclaration_SubtypeIndication()
   * @model containment="true"
   * @generated
   */
  SubtypeIndication getSubtypeIndication();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DataInstanceDeclaration#getSubtypeIndication <em>Subtype Indication</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subtype Indication</em>' containment reference.
   * @see #getSubtypeIndication()
   * @generated
   */
  void setSubtypeIndication(SubtypeIndication value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.xtext.ada2005.adb.AdbPackage#getDataInstanceDeclaration_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DataInstanceDeclaration#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Object Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Name</em>' containment reference.
   * @see #setObjectName(Name)
   * @see org.xtext.ada2005.adb.AdbPackage#getDataInstanceDeclaration_ObjectName()
   * @model containment="true"
   * @generated
   */
  Name getObjectName();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DataInstanceDeclaration#getObjectName <em>Object Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Name</em>' containment reference.
   * @see #getObjectName()
   * @generated
   */
  void setObjectName(Name value);

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
   * @see org.xtext.ada2005.adb.AdbPackage#getDataInstanceDeclaration_AnonymousAccessDefinition()
   * @model containment="true"
   * @generated
   */
  AnonymousAccessDefinition getAnonymousAccessDefinition();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DataInstanceDeclaration#getAnonymousAccessDefinition <em>Anonymous Access Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anonymous Access Definition</em>' containment reference.
   * @see #getAnonymousAccessDefinition()
   * @generated
   */
  void setAnonymousAccessDefinition(AnonymousAccessDefinition value);

  /**
   * Returns the value of the '<em><b>Array Type Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array Type Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Type Definition</em>' containment reference.
   * @see #setArrayTypeDefinition(ArrayTypeDefinition)
   * @see org.xtext.ada2005.adb.AdbPackage#getDataInstanceDeclaration_ArrayTypeDefinition()
   * @model containment="true"
   * @generated
   */
  ArrayTypeDefinition getArrayTypeDefinition();

  /**
   * Sets the value of the '{@link org.xtext.ada2005.adb.DataInstanceDeclaration#getArrayTypeDefinition <em>Array Type Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array Type Definition</em>' containment reference.
   * @see #getArrayTypeDefinition()
   * @generated
   */
  void setArrayTypeDefinition(ArrayTypeDefinition value);

} // DataInstanceDeclaration
