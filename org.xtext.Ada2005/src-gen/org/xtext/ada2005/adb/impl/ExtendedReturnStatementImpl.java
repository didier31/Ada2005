/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.Expression;
import org.xtext.ada2005.adb.ExtendedReturnStatement;
import org.xtext.ada2005.adb.HandledSequenceOfStatements;
import org.xtext.ada2005.adb.ReturnSubtypeIndication;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Return Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.ExtendedReturnStatementImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ExtendedReturnStatementImpl#getReturnSubtype <em>Return Subtype</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ExtendedReturnStatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ExtendedReturnStatementImpl#getHandledSequenceOfStatements <em>Handled Sequence Of Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendedReturnStatementImpl extends CompoundStatementImpl implements ExtendedReturnStatement
{
  /**
   * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected String identifier = IDENTIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getReturnSubtype() <em>Return Subtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnSubtype()
   * @generated
   * @ordered
   */
  protected ReturnSubtypeIndication returnSubtype;

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
   * The cached value of the '{@link #getHandledSequenceOfStatements() <em>Handled Sequence Of Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandledSequenceOfStatements()
   * @generated
   * @ordered
   */
  protected HandledSequenceOfStatements handledSequenceOfStatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtendedReturnStatementImpl()
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
    return AdbPackage.eINSTANCE.getExtendedReturnStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(String newIdentifier)
  {
    String oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.EXTENDED_RETURN_STATEMENT__IDENTIFIER, oldIdentifier, identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnSubtypeIndication getReturnSubtype()
  {
    return returnSubtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnSubtype(ReturnSubtypeIndication newReturnSubtype, NotificationChain msgs)
  {
    ReturnSubtypeIndication oldReturnSubtype = returnSubtype;
    returnSubtype = newReturnSubtype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.EXTENDED_RETURN_STATEMENT__RETURN_SUBTYPE, oldReturnSubtype, newReturnSubtype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnSubtype(ReturnSubtypeIndication newReturnSubtype)
  {
    if (newReturnSubtype != returnSubtype)
    {
      NotificationChain msgs = null;
      if (returnSubtype != null)
        msgs = ((InternalEObject)returnSubtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.EXTENDED_RETURN_STATEMENT__RETURN_SUBTYPE, null, msgs);
      if (newReturnSubtype != null)
        msgs = ((InternalEObject)newReturnSubtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.EXTENDED_RETURN_STATEMENT__RETURN_SUBTYPE, null, msgs);
      msgs = basicSetReturnSubtype(newReturnSubtype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.EXTENDED_RETURN_STATEMENT__RETURN_SUBTYPE, newReturnSubtype, newReturnSubtype));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.EXTENDED_RETURN_STATEMENT__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.EXTENDED_RETURN_STATEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.EXTENDED_RETURN_STATEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.EXTENDED_RETURN_STATEMENT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HandledSequenceOfStatements getHandledSequenceOfStatements()
  {
    return handledSequenceOfStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHandledSequenceOfStatements(HandledSequenceOfStatements newHandledSequenceOfStatements, NotificationChain msgs)
  {
    HandledSequenceOfStatements oldHandledSequenceOfStatements = handledSequenceOfStatements;
    handledSequenceOfStatements = newHandledSequenceOfStatements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.EXTENDED_RETURN_STATEMENT__HANDLED_SEQUENCE_OF_STATEMENTS, oldHandledSequenceOfStatements, newHandledSequenceOfStatements);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHandledSequenceOfStatements(HandledSequenceOfStatements newHandledSequenceOfStatements)
  {
    if (newHandledSequenceOfStatements != handledSequenceOfStatements)
    {
      NotificationChain msgs = null;
      if (handledSequenceOfStatements != null)
        msgs = ((InternalEObject)handledSequenceOfStatements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.EXTENDED_RETURN_STATEMENT__HANDLED_SEQUENCE_OF_STATEMENTS, null, msgs);
      if (newHandledSequenceOfStatements != null)
        msgs = ((InternalEObject)newHandledSequenceOfStatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.EXTENDED_RETURN_STATEMENT__HANDLED_SEQUENCE_OF_STATEMENTS, null, msgs);
      msgs = basicSetHandledSequenceOfStatements(newHandledSequenceOfStatements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.EXTENDED_RETURN_STATEMENT__HANDLED_SEQUENCE_OF_STATEMENTS, newHandledSequenceOfStatements, newHandledSequenceOfStatements));
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
      case AdbPackage.EXTENDED_RETURN_STATEMENT__RETURN_SUBTYPE:
        return basicSetReturnSubtype(null, msgs);
      case AdbPackage.EXTENDED_RETURN_STATEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case AdbPackage.EXTENDED_RETURN_STATEMENT__HANDLED_SEQUENCE_OF_STATEMENTS:
        return basicSetHandledSequenceOfStatements(null, msgs);
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
      case AdbPackage.EXTENDED_RETURN_STATEMENT__IDENTIFIER:
        return getIdentifier();
      case AdbPackage.EXTENDED_RETURN_STATEMENT__RETURN_SUBTYPE:
        return getReturnSubtype();
      case AdbPackage.EXTENDED_RETURN_STATEMENT__EXPRESSION:
        return getExpression();
      case AdbPackage.EXTENDED_RETURN_STATEMENT__HANDLED_SEQUENCE_OF_STATEMENTS:
        return getHandledSequenceOfStatements();
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
      case AdbPackage.EXTENDED_RETURN_STATEMENT__IDENTIFIER:
        setIdentifier((String)newValue);
        return;
      case AdbPackage.EXTENDED_RETURN_STATEMENT__RETURN_SUBTYPE:
        setReturnSubtype((ReturnSubtypeIndication)newValue);
        return;
      case AdbPackage.EXTENDED_RETURN_STATEMENT__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case AdbPackage.EXTENDED_RETURN_STATEMENT__HANDLED_SEQUENCE_OF_STATEMENTS:
        setHandledSequenceOfStatements((HandledSequenceOfStatements)newValue);
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
      case AdbPackage.EXTENDED_RETURN_STATEMENT__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case AdbPackage.EXTENDED_RETURN_STATEMENT__RETURN_SUBTYPE:
        setReturnSubtype((ReturnSubtypeIndication)null);
        return;
      case AdbPackage.EXTENDED_RETURN_STATEMENT__EXPRESSION:
        setExpression((Expression)null);
        return;
      case AdbPackage.EXTENDED_RETURN_STATEMENT__HANDLED_SEQUENCE_OF_STATEMENTS:
        setHandledSequenceOfStatements((HandledSequenceOfStatements)null);
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
      case AdbPackage.EXTENDED_RETURN_STATEMENT__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case AdbPackage.EXTENDED_RETURN_STATEMENT__RETURN_SUBTYPE:
        return returnSubtype != null;
      case AdbPackage.EXTENDED_RETURN_STATEMENT__EXPRESSION:
        return expression != null;
      case AdbPackage.EXTENDED_RETURN_STATEMENT__HANDLED_SEQUENCE_OF_STATEMENTS:
        return handledSequenceOfStatements != null;
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
    result.append(" (identifier: ");
    result.append(identifier);
    result.append(')');
    return result.toString();
  }

} //ExtendedReturnStatementImpl
