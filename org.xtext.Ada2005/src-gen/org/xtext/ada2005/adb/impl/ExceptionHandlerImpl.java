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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.ExceptionChoice;
import org.xtext.ada2005.adb.ExceptionHandler;
import org.xtext.ada2005.adb.SequenceOfStatements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.ExceptionHandlerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ExceptionHandlerImpl#getExceptionChoice <em>Exception Choice</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ExceptionHandlerImpl#getSequenceOfStatements <em>Sequence Of Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExceptionHandlerImpl extends MinimalEObjectImpl.Container implements ExceptionHandler
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getExceptionChoice() <em>Exception Choice</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExceptionChoice()
   * @generated
   * @ordered
   */
  protected EList<ExceptionChoice> exceptionChoice;

  /**
   * The cached value of the '{@link #getSequenceOfStatements() <em>Sequence Of Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSequenceOfStatements()
   * @generated
   * @ordered
   */
  protected SequenceOfStatements sequenceOfStatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExceptionHandlerImpl()
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
    return AdbPackage.eINSTANCE.getExceptionHandler();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.EXCEPTION_HANDLER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExceptionChoice> getExceptionChoice()
  {
    if (exceptionChoice == null)
    {
      exceptionChoice = new EObjectContainmentEList<ExceptionChoice>(ExceptionChoice.class, this, AdbPackage.EXCEPTION_HANDLER__EXCEPTION_CHOICE);
    }
    return exceptionChoice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceOfStatements getSequenceOfStatements()
  {
    return sequenceOfStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSequenceOfStatements(SequenceOfStatements newSequenceOfStatements, NotificationChain msgs)
  {
    SequenceOfStatements oldSequenceOfStatements = sequenceOfStatements;
    sequenceOfStatements = newSequenceOfStatements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.EXCEPTION_HANDLER__SEQUENCE_OF_STATEMENTS, oldSequenceOfStatements, newSequenceOfStatements);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSequenceOfStatements(SequenceOfStatements newSequenceOfStatements)
  {
    if (newSequenceOfStatements != sequenceOfStatements)
    {
      NotificationChain msgs = null;
      if (sequenceOfStatements != null)
        msgs = ((InternalEObject)sequenceOfStatements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.EXCEPTION_HANDLER__SEQUENCE_OF_STATEMENTS, null, msgs);
      if (newSequenceOfStatements != null)
        msgs = ((InternalEObject)newSequenceOfStatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.EXCEPTION_HANDLER__SEQUENCE_OF_STATEMENTS, null, msgs);
      msgs = basicSetSequenceOfStatements(newSequenceOfStatements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.EXCEPTION_HANDLER__SEQUENCE_OF_STATEMENTS, newSequenceOfStatements, newSequenceOfStatements));
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
      case AdbPackage.EXCEPTION_HANDLER__EXCEPTION_CHOICE:
        return ((InternalEList<?>)getExceptionChoice()).basicRemove(otherEnd, msgs);
      case AdbPackage.EXCEPTION_HANDLER__SEQUENCE_OF_STATEMENTS:
        return basicSetSequenceOfStatements(null, msgs);
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
      case AdbPackage.EXCEPTION_HANDLER__NAME:
        return getName();
      case AdbPackage.EXCEPTION_HANDLER__EXCEPTION_CHOICE:
        return getExceptionChoice();
      case AdbPackage.EXCEPTION_HANDLER__SEQUENCE_OF_STATEMENTS:
        return getSequenceOfStatements();
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
      case AdbPackage.EXCEPTION_HANDLER__NAME:
        setName((String)newValue);
        return;
      case AdbPackage.EXCEPTION_HANDLER__EXCEPTION_CHOICE:
        getExceptionChoice().clear();
        getExceptionChoice().addAll((Collection<? extends ExceptionChoice>)newValue);
        return;
      case AdbPackage.EXCEPTION_HANDLER__SEQUENCE_OF_STATEMENTS:
        setSequenceOfStatements((SequenceOfStatements)newValue);
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
      case AdbPackage.EXCEPTION_HANDLER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdbPackage.EXCEPTION_HANDLER__EXCEPTION_CHOICE:
        getExceptionChoice().clear();
        return;
      case AdbPackage.EXCEPTION_HANDLER__SEQUENCE_OF_STATEMENTS:
        setSequenceOfStatements((SequenceOfStatements)null);
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
      case AdbPackage.EXCEPTION_HANDLER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdbPackage.EXCEPTION_HANDLER__EXCEPTION_CHOICE:
        return exceptionChoice != null && !exceptionChoice.isEmpty();
      case AdbPackage.EXCEPTION_HANDLER__SEQUENCE_OF_STATEMENTS:
        return sequenceOfStatements != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ExceptionHandlerImpl
