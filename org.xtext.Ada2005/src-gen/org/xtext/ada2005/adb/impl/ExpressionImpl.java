/**
 */
package org.xtext.ada2005.adb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.Expression;
import org.xtext.ada2005.adb.Relation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.ExpressionImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ExpressionImpl#getBooleanOperator <em>Boolean Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends EntryIndexImpl implements Expression
{
  /**
   * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelations()
   * @generated
   * @ordered
   */
  protected EList<Relation> relations;

  /**
   * The cached value of the '{@link #getBooleanOperator() <em>Boolean Operator</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleanOperator()
   * @generated
   * @ordered
   */
  protected EList<String> booleanOperator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return AdbPackage.eINSTANCE.getExpression();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Relation> getRelations()
  {
    if (relations == null)
    {
      relations = new EObjectContainmentEList<Relation>(Relation.class, this, AdbPackage.EXPRESSION__RELATIONS);
    }
    return relations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getBooleanOperator()
  {
    if (booleanOperator == null)
    {
      booleanOperator = new EDataTypeEList<String>(String.class, this, AdbPackage.EXPRESSION__BOOLEAN_OPERATOR);
    }
    return booleanOperator;
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
      case AdbPackage.EXPRESSION__RELATIONS:
        return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.EXPRESSION__RELATIONS:
        return getRelations();
      case AdbPackage.EXPRESSION__BOOLEAN_OPERATOR:
        return getBooleanOperator();
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
      case AdbPackage.EXPRESSION__RELATIONS:
        getRelations().clear();
        getRelations().addAll((Collection<? extends Relation>)newValue);
        return;
      case AdbPackage.EXPRESSION__BOOLEAN_OPERATOR:
        getBooleanOperator().clear();
        getBooleanOperator().addAll((Collection<? extends String>)newValue);
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
      case AdbPackage.EXPRESSION__RELATIONS:
        getRelations().clear();
        return;
      case AdbPackage.EXPRESSION__BOOLEAN_OPERATOR:
        getBooleanOperator().clear();
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
      case AdbPackage.EXPRESSION__RELATIONS:
        return relations != null && !relations.isEmpty();
      case AdbPackage.EXPRESSION__BOOLEAN_OPERATOR:
        return booleanOperator != null && !booleanOperator.isEmpty();
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
    result.append(" (booleanOperator: ");
    result.append(booleanOperator);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl
