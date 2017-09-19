/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.AnonymousAccessDefinition;
import org.xtext.ada2005.adb.ArrayTypeDefinition;
import org.xtext.ada2005.adb.DataInstanceDeclaration;
import org.xtext.ada2005.adb.DefiningIdentifierList;
import org.xtext.ada2005.adb.Expression;
import org.xtext.ada2005.adb.Name;
import org.xtext.ada2005.adb.SubtypeIndication;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Instance Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.DataInstanceDeclarationImpl#getDefiningIdentifierList <em>Defining Identifier List</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.DataInstanceDeclarationImpl#isAliased <em>Aliased</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.DataInstanceDeclarationImpl#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.DataInstanceDeclarationImpl#getSubtypeIndication <em>Subtype Indication</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.DataInstanceDeclarationImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.DataInstanceDeclarationImpl#getObjectName <em>Object Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.DataInstanceDeclarationImpl#getAnonymousAccessDefinition <em>Anonymous Access Definition</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.DataInstanceDeclarationImpl#getArrayTypeDefinition <em>Array Type Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataInstanceDeclarationImpl extends ObjectDeclarationImpl implements DataInstanceDeclaration
{
  /**
   * The cached value of the '{@link #getDefiningIdentifierList() <em>Defining Identifier List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefiningIdentifierList()
   * @generated
   * @ordered
   */
  protected DefiningIdentifierList definingIdentifierList;

  /**
   * The default value of the '{@link #isAliased() <em>Aliased</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAliased()
   * @generated
   * @ordered
   */
  protected static final boolean ALIASED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAliased() <em>Aliased</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAliased()
   * @generated
   * @ordered
   */
  protected boolean aliased = ALIASED_EDEFAULT;

  /**
   * The default value of the '{@link #isConstant() <em>Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConstant()
   * @generated
   * @ordered
   */
  protected static final boolean CONSTANT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isConstant() <em>Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConstant()
   * @generated
   * @ordered
   */
  protected boolean constant = CONSTANT_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubtypeIndication() <em>Subtype Indication</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtypeIndication()
   * @generated
   * @ordered
   */
  protected SubtypeIndication subtypeIndication;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The cached value of the '{@link #getObjectName() <em>Object Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectName()
   * @generated
   * @ordered
   */
  protected Name objectName;

  /**
   * The cached value of the '{@link #getAnonymousAccessDefinition() <em>Anonymous Access Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnonymousAccessDefinition()
   * @generated
   * @ordered
   */
  protected AnonymousAccessDefinition anonymousAccessDefinition;

  /**
   * The cached value of the '{@link #getArrayTypeDefinition() <em>Array Type Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayTypeDefinition()
   * @generated
   * @ordered
   */
  protected ArrayTypeDefinition arrayTypeDefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataInstanceDeclarationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AdbPackage.eINSTANCE.getDataInstanceDeclaration();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefiningIdentifierList getDefiningIdentifierList()
  {
    return definingIdentifierList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefiningIdentifierList(DefiningIdentifierList newDefiningIdentifierList, NotificationChain msgs)
  {
    DefiningIdentifierList oldDefiningIdentifierList = definingIdentifierList;
    definingIdentifierList = newDefiningIdentifierList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.DATA_INSTANCE_DECLARATION__DEFINING_IDENTIFIER_LIST, oldDefiningIdentifierList, newDefiningIdentifierList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefiningIdentifierList(DefiningIdentifierList newDefiningIdentifierList)
  {
    if (newDefiningIdentifierList != definingIdentifierList)
    {
      NotificationChain msgs = null;
      if (definingIdentifierList != null)
        msgs = ((InternalEObject)definingIdentifierList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DATA_INSTANCE_DECLARATION__DEFINING_IDENTIFIER_LIST, null, msgs);
      if (newDefiningIdentifierList != null)
        msgs = ((InternalEObject)newDefiningIdentifierList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DATA_INSTANCE_DECLARATION__DEFINING_IDENTIFIER_LIST, null, msgs);
      msgs = basicSetDefiningIdentifierList(newDefiningIdentifierList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DATA_INSTANCE_DECLARATION__DEFINING_IDENTIFIER_LIST, newDefiningIdentifierList, newDefiningIdentifierList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAliased()
  {
    return aliased;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAliased(boolean newAliased)
  {
    boolean oldAliased = aliased;
    aliased = newAliased;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DATA_INSTANCE_DECLARATION__ALIASED, oldAliased, aliased));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isConstant()
  {
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstant(boolean newConstant)
  {
    boolean oldConstant = constant;
    constant = newConstant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DATA_INSTANCE_DECLARATION__CONSTANT, oldConstant, constant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubtypeIndication getSubtypeIndication()
  {
    return subtypeIndication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubtypeIndication(SubtypeIndication newSubtypeIndication, NotificationChain msgs)
  {
    SubtypeIndication oldSubtypeIndication = subtypeIndication;
    subtypeIndication = newSubtypeIndication;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.DATA_INSTANCE_DECLARATION__SUBTYPE_INDICATION, oldSubtypeIndication, newSubtypeIndication);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubtypeIndication(SubtypeIndication newSubtypeIndication)
  {
    if (newSubtypeIndication != subtypeIndication)
    {
      NotificationChain msgs = null;
      if (subtypeIndication != null)
        msgs = ((InternalEObject)subtypeIndication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DATA_INSTANCE_DECLARATION__SUBTYPE_INDICATION, null, msgs);
      if (newSubtypeIndication != null)
        msgs = ((InternalEObject)newSubtypeIndication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DATA_INSTANCE_DECLARATION__SUBTYPE_INDICATION, null, msgs);
      msgs = basicSetSubtypeIndication(newSubtypeIndication, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DATA_INSTANCE_DECLARATION__SUBTYPE_INDICATION, newSubtypeIndication, newSubtypeIndication));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.DATA_INSTANCE_DECLARATION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DATA_INSTANCE_DECLARATION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DATA_INSTANCE_DECLARATION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DATA_INSTANCE_DECLARATION__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getObjectName()
  {
    return objectName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjectName(Name newObjectName, NotificationChain msgs)
  {
    Name oldObjectName = objectName;
    objectName = newObjectName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.DATA_INSTANCE_DECLARATION__OBJECT_NAME, oldObjectName, newObjectName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjectName(Name newObjectName)
  {
    if (newObjectName != objectName)
    {
      NotificationChain msgs = null;
      if (objectName != null)
        msgs = ((InternalEObject)objectName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DATA_INSTANCE_DECLARATION__OBJECT_NAME, null, msgs);
      if (newObjectName != null)
        msgs = ((InternalEObject)newObjectName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DATA_INSTANCE_DECLARATION__OBJECT_NAME, null, msgs);
      msgs = basicSetObjectName(newObjectName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DATA_INSTANCE_DECLARATION__OBJECT_NAME, newObjectName, newObjectName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnonymousAccessDefinition getAnonymousAccessDefinition()
  {
    return anonymousAccessDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnonymousAccessDefinition(AnonymousAccessDefinition newAnonymousAccessDefinition, NotificationChain msgs)
  {
    AnonymousAccessDefinition oldAnonymousAccessDefinition = anonymousAccessDefinition;
    anonymousAccessDefinition = newAnonymousAccessDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.DATA_INSTANCE_DECLARATION__ANONYMOUS_ACCESS_DEFINITION, oldAnonymousAccessDefinition, newAnonymousAccessDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnonymousAccessDefinition(AnonymousAccessDefinition newAnonymousAccessDefinition)
  {
    if (newAnonymousAccessDefinition != anonymousAccessDefinition)
    {
      NotificationChain msgs = null;
      if (anonymousAccessDefinition != null)
        msgs = ((InternalEObject)anonymousAccessDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DATA_INSTANCE_DECLARATION__ANONYMOUS_ACCESS_DEFINITION, null, msgs);
      if (newAnonymousAccessDefinition != null)
        msgs = ((InternalEObject)newAnonymousAccessDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DATA_INSTANCE_DECLARATION__ANONYMOUS_ACCESS_DEFINITION, null, msgs);
      msgs = basicSetAnonymousAccessDefinition(newAnonymousAccessDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DATA_INSTANCE_DECLARATION__ANONYMOUS_ACCESS_DEFINITION, newAnonymousAccessDefinition, newAnonymousAccessDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayTypeDefinition getArrayTypeDefinition()
  {
    return arrayTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrayTypeDefinition(ArrayTypeDefinition newArrayTypeDefinition, NotificationChain msgs)
  {
    ArrayTypeDefinition oldArrayTypeDefinition = arrayTypeDefinition;
    arrayTypeDefinition = newArrayTypeDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.DATA_INSTANCE_DECLARATION__ARRAY_TYPE_DEFINITION, oldArrayTypeDefinition, newArrayTypeDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrayTypeDefinition(ArrayTypeDefinition newArrayTypeDefinition)
  {
    if (newArrayTypeDefinition != arrayTypeDefinition)
    {
      NotificationChain msgs = null;
      if (arrayTypeDefinition != null)
        msgs = ((InternalEObject)arrayTypeDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DATA_INSTANCE_DECLARATION__ARRAY_TYPE_DEFINITION, null, msgs);
      if (newArrayTypeDefinition != null)
        msgs = ((InternalEObject)newArrayTypeDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DATA_INSTANCE_DECLARATION__ARRAY_TYPE_DEFINITION, null, msgs);
      msgs = basicSetArrayTypeDefinition(newArrayTypeDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DATA_INSTANCE_DECLARATION__ARRAY_TYPE_DEFINITION, newArrayTypeDefinition, newArrayTypeDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AdbPackage.DATA_INSTANCE_DECLARATION__DEFINING_IDENTIFIER_LIST:
        return basicSetDefiningIdentifierList(null, msgs);
      case AdbPackage.DATA_INSTANCE_DECLARATION__SUBTYPE_INDICATION:
        return basicSetSubtypeIndication(null, msgs);
      case AdbPackage.DATA_INSTANCE_DECLARATION__EXPRESSION:
        return basicSetExpression(null, msgs);
      case AdbPackage.DATA_INSTANCE_DECLARATION__OBJECT_NAME:
        return basicSetObjectName(null, msgs);
      case AdbPackage.DATA_INSTANCE_DECLARATION__ANONYMOUS_ACCESS_DEFINITION:
        return basicSetAnonymousAccessDefinition(null, msgs);
      case AdbPackage.DATA_INSTANCE_DECLARATION__ARRAY_TYPE_DEFINITION:
        return basicSetArrayTypeDefinition(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AdbPackage.DATA_INSTANCE_DECLARATION__DEFINING_IDENTIFIER_LIST:
        return getDefiningIdentifierList();
      case AdbPackage.DATA_INSTANCE_DECLARATION__ALIASED:
        return isAliased();
      case AdbPackage.DATA_INSTANCE_DECLARATION__CONSTANT:
        return isConstant();
      case AdbPackage.DATA_INSTANCE_DECLARATION__SUBTYPE_INDICATION:
        return getSubtypeIndication();
      case AdbPackage.DATA_INSTANCE_DECLARATION__EXPRESSION:
        return getExpression();
      case AdbPackage.DATA_INSTANCE_DECLARATION__OBJECT_NAME:
        return getObjectName();
      case AdbPackage.DATA_INSTANCE_DECLARATION__ANONYMOUS_ACCESS_DEFINITION:
        return getAnonymousAccessDefinition();
      case AdbPackage.DATA_INSTANCE_DECLARATION__ARRAY_TYPE_DEFINITION:
        return getArrayTypeDefinition();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AdbPackage.DATA_INSTANCE_DECLARATION__DEFINING_IDENTIFIER_LIST:
        setDefiningIdentifierList((DefiningIdentifierList)newValue);
        return;
      case AdbPackage.DATA_INSTANCE_DECLARATION__ALIASED:
        setAliased((Boolean)newValue);
        return;
      case AdbPackage.DATA_INSTANCE_DECLARATION__CONSTANT:
        setConstant((Boolean)newValue);
        return;
      case AdbPackage.DATA_INSTANCE_DECLARATION__SUBTYPE_INDICATION:
        setSubtypeIndication((SubtypeIndication)newValue);
        return;
      case AdbPackage.DATA_INSTANCE_DECLARATION__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case AdbPackage.DATA_INSTANCE_DECLARATION__OBJECT_NAME:
        setObjectName((Name)newValue);
        return;
      case AdbPackage.DATA_INSTANCE_DECLARATION__ANONYMOUS_ACCESS_DEFINITION:
        setAnonymousAccessDefinition((AnonymousAccessDefinition)newValue);
        return;
      case AdbPackage.DATA_INSTANCE_DECLARATION__ARRAY_TYPE_DEFINITION:
        setArrayTypeDefinition((ArrayTypeDefinition)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AdbPackage.DATA_INSTANCE_DECLARATION__DEFINING_IDENTIFIER_LIST:
        setDefiningIdentifierList((DefiningIdentifierList)null);
        return;
      case AdbPackage.DATA_INSTANCE_DECLARATION__ALIASED:
        setAliased(ALIASED_EDEFAULT);
        return;
      case AdbPackage.DATA_INSTANCE_DECLARATION__CONSTANT:
        setConstant(CONSTANT_EDEFAULT);
        return;
      case AdbPackage.DATA_INSTANCE_DECLARATION__SUBTYPE_INDICATION:
        setSubtypeIndication((SubtypeIndication)null);
        return;
      case AdbPackage.DATA_INSTANCE_DECLARATION__EXPRESSION:
        setExpression((Expression)null);
        return;
      case AdbPackage.DATA_INSTANCE_DECLARATION__OBJECT_NAME:
        setObjectName((Name)null);
        return;
      case AdbPackage.DATA_INSTANCE_DECLARATION__ANONYMOUS_ACCESS_DEFINITION:
        setAnonymousAccessDefinition((AnonymousAccessDefinition)null);
        return;
      case AdbPackage.DATA_INSTANCE_DECLARATION__ARRAY_TYPE_DEFINITION:
        setArrayTypeDefinition((ArrayTypeDefinition)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AdbPackage.DATA_INSTANCE_DECLARATION__DEFINING_IDENTIFIER_LIST:
        return definingIdentifierList != null;
      case AdbPackage.DATA_INSTANCE_DECLARATION__ALIASED:
        return aliased != ALIASED_EDEFAULT;
      case AdbPackage.DATA_INSTANCE_DECLARATION__CONSTANT:
        return constant != CONSTANT_EDEFAULT;
      case AdbPackage.DATA_INSTANCE_DECLARATION__SUBTYPE_INDICATION:
        return subtypeIndication != null;
      case AdbPackage.DATA_INSTANCE_DECLARATION__EXPRESSION:
        return expression != null;
      case AdbPackage.DATA_INSTANCE_DECLARATION__OBJECT_NAME:
        return objectName != null;
      case AdbPackage.DATA_INSTANCE_DECLARATION__ANONYMOUS_ACCESS_DEFINITION:
        return anonymousAccessDefinition != null;
      case AdbPackage.DATA_INSTANCE_DECLARATION__ARRAY_TYPE_DEFINITION:
        return arrayTypeDefinition != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (aliased: ");
    result.append(aliased);
    result.append(", constant: ");
    result.append(constant);
    result.append(')');
    return result.toString();
  }

} //DataInstanceDeclarationImpl
