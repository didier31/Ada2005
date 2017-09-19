/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.ArrayComponentAssociation;
import org.xtext.ada2005.adb.DiscreteChoiceList;
import org.xtext.ada2005.adb.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Component Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.ArrayComponentAssociationImpl#getDiscreteChoiceList <em>Discrete Choice List</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ArrayComponentAssociationImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ArrayComponentAssociationImpl#isBox <em>Box</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayComponentAssociationImpl extends MinimalEObjectImpl.Container implements ArrayComponentAssociation
{
  /**
   * The cached value of the '{@link #getDiscreteChoiceList() <em>Discrete Choice List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscreteChoiceList()
   * @generated
   * @ordered
   */
  protected DiscreteChoiceList discreteChoiceList;

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
   * The default value of the '{@link #isBox() <em>Box</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBox()
   * @generated
   * @ordered
   */
  protected static final boolean BOX_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBox() <em>Box</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBox()
   * @generated
   * @ordered
   */
  protected boolean box = BOX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayComponentAssociationImpl()
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
    return AdbPackage.eINSTANCE.getArrayComponentAssociation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiscreteChoiceList getDiscreteChoiceList()
  {
    return discreteChoiceList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDiscreteChoiceList(DiscreteChoiceList newDiscreteChoiceList, NotificationChain msgs)
  {
    DiscreteChoiceList oldDiscreteChoiceList = discreteChoiceList;
    discreteChoiceList = newDiscreteChoiceList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ARRAY_COMPONENT_ASSOCIATION__DISCRETE_CHOICE_LIST, oldDiscreteChoiceList, newDiscreteChoiceList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiscreteChoiceList(DiscreteChoiceList newDiscreteChoiceList)
  {
    if (newDiscreteChoiceList != discreteChoiceList)
    {
      NotificationChain msgs = null;
      if (discreteChoiceList != null)
        msgs = ((InternalEObject)discreteChoiceList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ARRAY_COMPONENT_ASSOCIATION__DISCRETE_CHOICE_LIST, null, msgs);
      if (newDiscreteChoiceList != null)
        msgs = ((InternalEObject)newDiscreteChoiceList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ARRAY_COMPONENT_ASSOCIATION__DISCRETE_CHOICE_LIST, null, msgs);
      msgs = basicSetDiscreteChoiceList(newDiscreteChoiceList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ARRAY_COMPONENT_ASSOCIATION__DISCRETE_CHOICE_LIST, newDiscreteChoiceList, newDiscreteChoiceList));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ARRAY_COMPONENT_ASSOCIATION__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ARRAY_COMPONENT_ASSOCIATION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ARRAY_COMPONENT_ASSOCIATION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ARRAY_COMPONENT_ASSOCIATION__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBox()
  {
    return box;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBox(boolean newBox)
  {
    boolean oldBox = box;
    box = newBox;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ARRAY_COMPONENT_ASSOCIATION__BOX, oldBox, box));
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
      case AdbPackage.ARRAY_COMPONENT_ASSOCIATION__DISCRETE_CHOICE_LIST:
        return basicSetDiscreteChoiceList(null, msgs);
      case AdbPackage.ARRAY_COMPONENT_ASSOCIATION__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case AdbPackage.ARRAY_COMPONENT_ASSOCIATION__DISCRETE_CHOICE_LIST:
        return getDiscreteChoiceList();
      case AdbPackage.ARRAY_COMPONENT_ASSOCIATION__EXPRESSION:
        return getExpression();
      case AdbPackage.ARRAY_COMPONENT_ASSOCIATION__BOX:
        return isBox();
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
      case AdbPackage.ARRAY_COMPONENT_ASSOCIATION__DISCRETE_CHOICE_LIST:
        setDiscreteChoiceList((DiscreteChoiceList)newValue);
        return;
      case AdbPackage.ARRAY_COMPONENT_ASSOCIATION__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case AdbPackage.ARRAY_COMPONENT_ASSOCIATION__BOX:
        setBox((Boolean)newValue);
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
      case AdbPackage.ARRAY_COMPONENT_ASSOCIATION__DISCRETE_CHOICE_LIST:
        setDiscreteChoiceList((DiscreteChoiceList)null);
        return;
      case AdbPackage.ARRAY_COMPONENT_ASSOCIATION__EXPRESSION:
        setExpression((Expression)null);
        return;
      case AdbPackage.ARRAY_COMPONENT_ASSOCIATION__BOX:
        setBox(BOX_EDEFAULT);
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
      case AdbPackage.ARRAY_COMPONENT_ASSOCIATION__DISCRETE_CHOICE_LIST:
        return discreteChoiceList != null;
      case AdbPackage.ARRAY_COMPONENT_ASSOCIATION__EXPRESSION:
        return expression != null;
      case AdbPackage.ARRAY_COMPONENT_ASSOCIATION__BOX:
        return box != BOX_EDEFAULT;
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
    result.append(" (box: ");
    result.append(box);
    result.append(')');
    return result.toString();
  }

} //ArrayComponentAssociationImpl
