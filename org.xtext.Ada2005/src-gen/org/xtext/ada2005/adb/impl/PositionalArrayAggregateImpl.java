/**
 */
package org.xtext.ada2005.adb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.Expression;
import org.xtext.ada2005.adb.PositionalArrayAggregate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Positional Array Aggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.PositionalArrayAggregateImpl#getInitialValues <em>Initial Values</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.PositionalArrayAggregateImpl#getOthersValue <em>Others Value</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.PositionalArrayAggregateImpl#isOthersBox <em>Others Box</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionalArrayAggregateImpl extends ArrayAggregateImpl implements PositionalArrayAggregate
{
  /**
   * The cached value of the '{@link #getInitialValues() <em>Initial Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialValues()
   * @generated
   * @ordered
   */
  protected EList<Expression> initialValues;

  /**
   * The cached value of the '{@link #getOthersValue() <em>Others Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOthersValue()
   * @generated
   * @ordered
   */
  protected Expression othersValue;

  /**
   * The default value of the '{@link #isOthersBox() <em>Others Box</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOthersBox()
   * @generated
   * @ordered
   */
  protected static final boolean OTHERS_BOX_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOthersBox() <em>Others Box</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOthersBox()
   * @generated
   * @ordered
   */
  protected boolean othersBox = OTHERS_BOX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PositionalArrayAggregateImpl()
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
    return AdbPackage.eINSTANCE.getPositionalArrayAggregate();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getInitialValues()
  {
    if (initialValues == null)
    {
      initialValues = new EObjectContainmentEList<Expression>(Expression.class, this, AdbPackage.POSITIONAL_ARRAY_AGGREGATE__INITIAL_VALUES);
    }
    return initialValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getOthersValue()
  {
    return othersValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOthersValue(Expression newOthersValue, NotificationChain msgs)
  {
    Expression oldOthersValue = othersValue;
    othersValue = newOthersValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.POSITIONAL_ARRAY_AGGREGATE__OTHERS_VALUE, oldOthersValue, newOthersValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOthersValue(Expression newOthersValue)
  {
    if (newOthersValue != othersValue)
    {
      NotificationChain msgs = null;
      if (othersValue != null)
        msgs = ((InternalEObject)othersValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.POSITIONAL_ARRAY_AGGREGATE__OTHERS_VALUE, null, msgs);
      if (newOthersValue != null)
        msgs = ((InternalEObject)newOthersValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.POSITIONAL_ARRAY_AGGREGATE__OTHERS_VALUE, null, msgs);
      msgs = basicSetOthersValue(newOthersValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.POSITIONAL_ARRAY_AGGREGATE__OTHERS_VALUE, newOthersValue, newOthersValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOthersBox()
  {
    return othersBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOthersBox(boolean newOthersBox)
  {
    boolean oldOthersBox = othersBox;
    othersBox = newOthersBox;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.POSITIONAL_ARRAY_AGGREGATE__OTHERS_BOX, oldOthersBox, othersBox));
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
      case AdbPackage.POSITIONAL_ARRAY_AGGREGATE__INITIAL_VALUES:
        return ((InternalEList<?>)getInitialValues()).basicRemove(otherEnd, msgs);
      case AdbPackage.POSITIONAL_ARRAY_AGGREGATE__OTHERS_VALUE:
        return basicSetOthersValue(null, msgs);
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
      case AdbPackage.POSITIONAL_ARRAY_AGGREGATE__INITIAL_VALUES:
        return getInitialValues();
      case AdbPackage.POSITIONAL_ARRAY_AGGREGATE__OTHERS_VALUE:
        return getOthersValue();
      case AdbPackage.POSITIONAL_ARRAY_AGGREGATE__OTHERS_BOX:
        return isOthersBox();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AdbPackage.POSITIONAL_ARRAY_AGGREGATE__INITIAL_VALUES:
        getInitialValues().clear();
        getInitialValues().addAll((Collection<? extends Expression>)newValue);
        return;
      case AdbPackage.POSITIONAL_ARRAY_AGGREGATE__OTHERS_VALUE:
        setOthersValue((Expression)newValue);
        return;
      case AdbPackage.POSITIONAL_ARRAY_AGGREGATE__OTHERS_BOX:
        setOthersBox((Boolean)newValue);
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
      case AdbPackage.POSITIONAL_ARRAY_AGGREGATE__INITIAL_VALUES:
        getInitialValues().clear();
        return;
      case AdbPackage.POSITIONAL_ARRAY_AGGREGATE__OTHERS_VALUE:
        setOthersValue((Expression)null);
        return;
      case AdbPackage.POSITIONAL_ARRAY_AGGREGATE__OTHERS_BOX:
        setOthersBox(OTHERS_BOX_EDEFAULT);
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
      case AdbPackage.POSITIONAL_ARRAY_AGGREGATE__INITIAL_VALUES:
        return initialValues != null && !initialValues.isEmpty();
      case AdbPackage.POSITIONAL_ARRAY_AGGREGATE__OTHERS_VALUE:
        return othersValue != null;
      case AdbPackage.POSITIONAL_ARRAY_AGGREGATE__OTHERS_BOX:
        return othersBox != OTHERS_BOX_EDEFAULT;
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
    result.append(" (othersBox: ");
    result.append(othersBox);
    result.append(')');
    return result.toString();
  }

} //PositionalArrayAggregateImpl
