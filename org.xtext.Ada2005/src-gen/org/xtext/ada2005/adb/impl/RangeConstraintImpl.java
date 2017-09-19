/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.ecore.EClass;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.RangeConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RangeConstraintImpl extends ScalarConstraintImpl implements RangeConstraint
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RangeConstraintImpl()
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
    return AdbPackage.eINSTANCE.getRangeConstraint();
  }

} //RangeConstraintImpl
