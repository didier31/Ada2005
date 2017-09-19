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
import org.xtext.ada2005.adb.ExceptionHandler;
import org.xtext.ada2005.adb.LabelisableStatement;
import org.xtext.ada2005.adb.SequenceOfStatements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Of Statements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.SequenceOfStatementsImpl#getExceptionHandler <em>Exception Handler</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.SequenceOfStatementsImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceOfStatementsImpl extends HandledSequenceOfStatementsImpl implements SequenceOfStatements
{
  /**
   * The cached value of the '{@link #getExceptionHandler() <em>Exception Handler</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExceptionHandler()
   * @generated
   * @ordered
   */
  protected EList<ExceptionHandler> exceptionHandler;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<LabelisableStatement> statements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SequenceOfStatementsImpl()
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
    return AdbPackage.eINSTANCE.getSequenceOfStatements();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExceptionHandler> getExceptionHandler()
  {
    if (exceptionHandler == null)
    {
      exceptionHandler = new EObjectContainmentEList<ExceptionHandler>(ExceptionHandler.class, this, AdbPackage.SEQUENCE_OF_STATEMENTS__EXCEPTION_HANDLER);
    }
    return exceptionHandler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LabelisableStatement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<LabelisableStatement>(LabelisableStatement.class, this, AdbPackage.SEQUENCE_OF_STATEMENTS__STATEMENTS);
    }
    return statements;
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
      case AdbPackage.SEQUENCE_OF_STATEMENTS__EXCEPTION_HANDLER:
        return ((InternalEList<?>)getExceptionHandler()).basicRemove(otherEnd, msgs);
      case AdbPackage.SEQUENCE_OF_STATEMENTS__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.SEQUENCE_OF_STATEMENTS__EXCEPTION_HANDLER:
        return getExceptionHandler();
      case AdbPackage.SEQUENCE_OF_STATEMENTS__STATEMENTS:
        return getStatements();
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
      case AdbPackage.SEQUENCE_OF_STATEMENTS__EXCEPTION_HANDLER:
        getExceptionHandler().clear();
        getExceptionHandler().addAll((Collection<? extends ExceptionHandler>)newValue);
        return;
      case AdbPackage.SEQUENCE_OF_STATEMENTS__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends LabelisableStatement>)newValue);
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
      case AdbPackage.SEQUENCE_OF_STATEMENTS__EXCEPTION_HANDLER:
        getExceptionHandler().clear();
        return;
      case AdbPackage.SEQUENCE_OF_STATEMENTS__STATEMENTS:
        getStatements().clear();
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
      case AdbPackage.SEQUENCE_OF_STATEMENTS__EXCEPTION_HANDLER:
        return exceptionHandler != null && !exceptionHandler.isEmpty();
      case AdbPackage.SEQUENCE_OF_STATEMENTS__STATEMENTS:
        return statements != null && !statements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SequenceOfStatementsImpl
