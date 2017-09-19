/**
 */
package org.xtext.ada2005.adb.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.EnumerationTypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.EnumerationTypeDefinitionImpl#getEnumerationliteralspecifications <em>Enumerationliteralspecifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationTypeDefinitionImpl extends TypeDefinitionImpl implements EnumerationTypeDefinition
{
  /**
   * The cached value of the '{@link #getEnumerationliteralspecifications() <em>Enumerationliteralspecifications</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumerationliteralspecifications()
   * @generated
   * @ordered
   */
  protected EList<String> enumerationliteralspecifications;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumerationTypeDefinitionImpl()
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
    return AdbPackage.eINSTANCE.getEnumerationTypeDefinition();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getEnumerationliteralspecifications()
  {
    if (enumerationliteralspecifications == null)
    {
      enumerationliteralspecifications = new EDataTypeEList<String>(String.class, this, AdbPackage.ENUMERATION_TYPE_DEFINITION__ENUMERATIONLITERALSPECIFICATIONS);
    }
    return enumerationliteralspecifications;
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
      case AdbPackage.ENUMERATION_TYPE_DEFINITION__ENUMERATIONLITERALSPECIFICATIONS:
        return getEnumerationliteralspecifications();
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
      case AdbPackage.ENUMERATION_TYPE_DEFINITION__ENUMERATIONLITERALSPECIFICATIONS:
        getEnumerationliteralspecifications().clear();
        getEnumerationliteralspecifications().addAll((Collection<? extends String>)newValue);
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
      case AdbPackage.ENUMERATION_TYPE_DEFINITION__ENUMERATIONLITERALSPECIFICATIONS:
        getEnumerationliteralspecifications().clear();
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
      case AdbPackage.ENUMERATION_TYPE_DEFINITION__ENUMERATIONLITERALSPECIFICATIONS:
        return enumerationliteralspecifications != null && !enumerationliteralspecifications.isEmpty();
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
    result.append(" (enumerationliteralspecifications: ");
    result.append(enumerationliteralspecifications);
    result.append(')');
    return result.toString();
  }

} //EnumerationTypeDefinitionImpl
