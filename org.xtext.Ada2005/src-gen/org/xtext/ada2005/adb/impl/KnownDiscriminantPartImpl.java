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
import org.xtext.ada2005.adb.DiscriminantSpecification;
import org.xtext.ada2005.adb.KnownDiscriminantPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Known Discriminant Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.KnownDiscriminantPartImpl#getDiscriminantsSpecification <em>Discriminants Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KnownDiscriminantPartImpl extends DiscriminantPartImpl implements KnownDiscriminantPart
{
  /**
   * The cached value of the '{@link #getDiscriminantsSpecification() <em>Discriminants Specification</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscriminantsSpecification()
   * @generated
   * @ordered
   */
  protected EList<DiscriminantSpecification> discriminantsSpecification;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KnownDiscriminantPartImpl()
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
    return AdbPackage.eINSTANCE.getKnownDiscriminantPart();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DiscriminantSpecification> getDiscriminantsSpecification()
  {
    if (discriminantsSpecification == null)
    {
      discriminantsSpecification = new EObjectContainmentEList<DiscriminantSpecification>(DiscriminantSpecification.class, this, AdbPackage.KNOWN_DISCRIMINANT_PART__DISCRIMINANTS_SPECIFICATION);
    }
    return discriminantsSpecification;
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
      case AdbPackage.KNOWN_DISCRIMINANT_PART__DISCRIMINANTS_SPECIFICATION:
        return ((InternalEList<?>)getDiscriminantsSpecification()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.KNOWN_DISCRIMINANT_PART__DISCRIMINANTS_SPECIFICATION:
        return getDiscriminantsSpecification();
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
      case AdbPackage.KNOWN_DISCRIMINANT_PART__DISCRIMINANTS_SPECIFICATION:
        getDiscriminantsSpecification().clear();
        getDiscriminantsSpecification().addAll((Collection<? extends DiscriminantSpecification>)newValue);
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
      case AdbPackage.KNOWN_DISCRIMINANT_PART__DISCRIMINANTS_SPECIFICATION:
        getDiscriminantsSpecification().clear();
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
      case AdbPackage.KNOWN_DISCRIMINANT_PART__DISCRIMINANTS_SPECIFICATION:
        return discriminantsSpecification != null && !discriminantsSpecification.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //KnownDiscriminantPartImpl
