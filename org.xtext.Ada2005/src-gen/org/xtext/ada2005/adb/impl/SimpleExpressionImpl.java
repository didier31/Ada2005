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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.SimpleExpression;
import org.xtext.ada2005.adb.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.SimpleExpressionImpl#getUnaryAddingOperator <em>Unary Adding Operator</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.SimpleExpressionImpl#getTerms <em>Terms</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.SimpleExpressionImpl#getBinaryAddingOperators <em>Binary Adding Operators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleExpressionImpl extends MinimalEObjectImpl.Container implements SimpleExpression
{
  /**
   * The default value of the '{@link #getUnaryAddingOperator() <em>Unary Adding Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryAddingOperator()
   * @generated
   * @ordered
   */
  protected static final String UNARY_ADDING_OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnaryAddingOperator() <em>Unary Adding Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryAddingOperator()
   * @generated
   * @ordered
   */
  protected String unaryAddingOperator = UNARY_ADDING_OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getTerms() <em>Terms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerms()
   * @generated
   * @ordered
   */
  protected EList<Term> terms;

  /**
   * The cached value of the '{@link #getBinaryAddingOperators() <em>Binary Adding Operators</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinaryAddingOperators()
   * @generated
   * @ordered
   */
  protected EList<String> binaryAddingOperators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleExpressionImpl()
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
    return AdbPackage.eINSTANCE.getSimpleExpression();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUnaryAddingOperator()
  {
    return unaryAddingOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaryAddingOperator(String newUnaryAddingOperator)
  {
    String oldUnaryAddingOperator = unaryAddingOperator;
    unaryAddingOperator = newUnaryAddingOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SIMPLE_EXPRESSION__UNARY_ADDING_OPERATOR, oldUnaryAddingOperator, unaryAddingOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Term> getTerms()
  {
    if (terms == null)
    {
      terms = new EObjectContainmentEList<Term>(Term.class, this, AdbPackage.SIMPLE_EXPRESSION__TERMS);
    }
    return terms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getBinaryAddingOperators()
  {
    if (binaryAddingOperators == null)
    {
      binaryAddingOperators = new EDataTypeEList<String>(String.class, this, AdbPackage.SIMPLE_EXPRESSION__BINARY_ADDING_OPERATORS);
    }
    return binaryAddingOperators;
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
      case AdbPackage.SIMPLE_EXPRESSION__TERMS:
        return ((InternalEList<?>)getTerms()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.SIMPLE_EXPRESSION__UNARY_ADDING_OPERATOR:
        return getUnaryAddingOperator();
      case AdbPackage.SIMPLE_EXPRESSION__TERMS:
        return getTerms();
      case AdbPackage.SIMPLE_EXPRESSION__BINARY_ADDING_OPERATORS:
        return getBinaryAddingOperators();
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
      case AdbPackage.SIMPLE_EXPRESSION__UNARY_ADDING_OPERATOR:
        setUnaryAddingOperator((String)newValue);
        return;
      case AdbPackage.SIMPLE_EXPRESSION__TERMS:
        getTerms().clear();
        getTerms().addAll((Collection<? extends Term>)newValue);
        return;
      case AdbPackage.SIMPLE_EXPRESSION__BINARY_ADDING_OPERATORS:
        getBinaryAddingOperators().clear();
        getBinaryAddingOperators().addAll((Collection<? extends String>)newValue);
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
      case AdbPackage.SIMPLE_EXPRESSION__UNARY_ADDING_OPERATOR:
        setUnaryAddingOperator(UNARY_ADDING_OPERATOR_EDEFAULT);
        return;
      case AdbPackage.SIMPLE_EXPRESSION__TERMS:
        getTerms().clear();
        return;
      case AdbPackage.SIMPLE_EXPRESSION__BINARY_ADDING_OPERATORS:
        getBinaryAddingOperators().clear();
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
      case AdbPackage.SIMPLE_EXPRESSION__UNARY_ADDING_OPERATOR:
        return UNARY_ADDING_OPERATOR_EDEFAULT == null ? unaryAddingOperator != null : !UNARY_ADDING_OPERATOR_EDEFAULT.equals(unaryAddingOperator);
      case AdbPackage.SIMPLE_EXPRESSION__TERMS:
        return terms != null && !terms.isEmpty();
      case AdbPackage.SIMPLE_EXPRESSION__BINARY_ADDING_OPERATORS:
        return binaryAddingOperators != null && !binaryAddingOperators.isEmpty();
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
    result.append(" (unaryAddingOperator: ");
    result.append(unaryAddingOperator);
    result.append(", binaryAddingOperators: ");
    result.append(binaryAddingOperators);
    result.append(')');
    return result.toString();
  }

} //SimpleExpressionImpl
