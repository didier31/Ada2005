/**
 */
package org.xtext.ada2005.adb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.DiscriminantAssociation;
import org.xtext.ada2005.adb.DiscriminantConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discriminant Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.DiscriminantConstraintImpl#getDiscriminantAssociation <em>Discriminant Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscriminantConstraintImpl extends CompositeConstraintImpl implements DiscriminantConstraint
{
  /**
   * The cached value of the '{@link #getDiscriminantAssociation() <em>Discriminant Association</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscriminantAssociation()
   * @generated
   * @ordered
   */
  protected EList<DiscriminantAssociation> discriminantAssociation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DiscriminantConstraintImpl()
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
    return AdbPackage.eINSTANCE.getDiscriminantConstraint();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DiscriminantAssociation> getDiscriminantAssociation()
  {
    if (discriminantAssociation == null)
    {
      discriminantAssociation = new EObjectContainmentEList<DiscriminantAssociation>(DiscriminantAssociation.class, this, AdbPackage.DISCRIMINANT_CONSTRAINT__DISCRIMINANT_ASSOCIATION);
    }
    return discriminantAssociation;
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
      case AdbPackage.DISCRIMINANT_CONSTRAINT__DISCRIMINANT_ASSOCIATION:
        return ((InternalEList<?>)getDiscriminantAssociation()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.DISCRIMINANT_CONSTRAINT__DISCRIMINANT_ASSOCIATION:
        return getDiscriminantAssociation();
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
      case AdbPackage.DISCRIMINANT_CONSTRAINT__DISCRIMINANT_ASSOCIATION:
        getDiscriminantAssociation().clear();
        getDiscriminantAssociation().addAll((Collection<? extends DiscriminantAssociation>)newValue);
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
      case AdbPackage.DISCRIMINANT_CONSTRAINT__DISCRIMINANT_ASSOCIATION:
        getDiscriminantAssociation().clear();
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
      case AdbPackage.DISCRIMINANT_CONSTRAINT__DISCRIMINANT_ASSOCIATION:
        return discriminantAssociation != null && !discriminantAssociation.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DiscriminantConstraintImpl
