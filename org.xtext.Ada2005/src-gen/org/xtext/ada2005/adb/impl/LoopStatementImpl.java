/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.IterationScheme;
import org.xtext.ada2005.adb.LoopStatement;
import org.xtext.ada2005.adb.SequenceOfStatements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.LoopStatementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.LoopStatementImpl#getIterationScheme <em>Iteration Scheme</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.LoopStatementImpl#getSequenceOfStatements <em>Sequence Of Statements</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.LoopStatementImpl#getSameName <em>Same Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopStatementImpl extends CompoundStatementImpl implements LoopStatement
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
   * The cached value of the '{@link #getIterationScheme() <em>Iteration Scheme</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIterationScheme()
   * @generated
   * @ordered
   */
  protected IterationScheme iterationScheme;

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
   * The default value of the '{@link #getSameName() <em>Same Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSameName()
   * @generated
   * @ordered
   */
  protected static final String SAME_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSameName() <em>Same Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSameName()
   * @generated
   * @ordered
   */
  protected String sameName = SAME_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LoopStatementImpl()
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
    return AdbPackage.eINSTANCE.getLoopStatement();
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.LOOP_STATEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IterationScheme getIterationScheme()
  {
    return iterationScheme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIterationScheme(IterationScheme newIterationScheme, NotificationChain msgs)
  {
    IterationScheme oldIterationScheme = iterationScheme;
    iterationScheme = newIterationScheme;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.LOOP_STATEMENT__ITERATION_SCHEME, oldIterationScheme, newIterationScheme);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIterationScheme(IterationScheme newIterationScheme)
  {
    if (newIterationScheme != iterationScheme)
    {
      NotificationChain msgs = null;
      if (iterationScheme != null)
        msgs = ((InternalEObject)iterationScheme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.LOOP_STATEMENT__ITERATION_SCHEME, null, msgs);
      if (newIterationScheme != null)
        msgs = ((InternalEObject)newIterationScheme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.LOOP_STATEMENT__ITERATION_SCHEME, null, msgs);
      msgs = basicSetIterationScheme(newIterationScheme, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.LOOP_STATEMENT__ITERATION_SCHEME, newIterationScheme, newIterationScheme));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.LOOP_STATEMENT__SEQUENCE_OF_STATEMENTS, oldSequenceOfStatements, newSequenceOfStatements);
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
        msgs = ((InternalEObject)sequenceOfStatements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.LOOP_STATEMENT__SEQUENCE_OF_STATEMENTS, null, msgs);
      if (newSequenceOfStatements != null)
        msgs = ((InternalEObject)newSequenceOfStatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.LOOP_STATEMENT__SEQUENCE_OF_STATEMENTS, null, msgs);
      msgs = basicSetSequenceOfStatements(newSequenceOfStatements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.LOOP_STATEMENT__SEQUENCE_OF_STATEMENTS, newSequenceOfStatements, newSequenceOfStatements));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSameName()
  {
    return sameName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSameName(String newSameName)
  {
    String oldSameName = sameName;
    sameName = newSameName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.LOOP_STATEMENT__SAME_NAME, oldSameName, sameName));
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
      case AdbPackage.LOOP_STATEMENT__ITERATION_SCHEME:
        return basicSetIterationScheme(null, msgs);
      case AdbPackage.LOOP_STATEMENT__SEQUENCE_OF_STATEMENTS:
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
      case AdbPackage.LOOP_STATEMENT__NAME:
        return getName();
      case AdbPackage.LOOP_STATEMENT__ITERATION_SCHEME:
        return getIterationScheme();
      case AdbPackage.LOOP_STATEMENT__SEQUENCE_OF_STATEMENTS:
        return getSequenceOfStatements();
      case AdbPackage.LOOP_STATEMENT__SAME_NAME:
        return getSameName();
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
      case AdbPackage.LOOP_STATEMENT__NAME:
        setName((String)newValue);
        return;
      case AdbPackage.LOOP_STATEMENT__ITERATION_SCHEME:
        setIterationScheme((IterationScheme)newValue);
        return;
      case AdbPackage.LOOP_STATEMENT__SEQUENCE_OF_STATEMENTS:
        setSequenceOfStatements((SequenceOfStatements)newValue);
        return;
      case AdbPackage.LOOP_STATEMENT__SAME_NAME:
        setSameName((String)newValue);
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
      case AdbPackage.LOOP_STATEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdbPackage.LOOP_STATEMENT__ITERATION_SCHEME:
        setIterationScheme((IterationScheme)null);
        return;
      case AdbPackage.LOOP_STATEMENT__SEQUENCE_OF_STATEMENTS:
        setSequenceOfStatements((SequenceOfStatements)null);
        return;
      case AdbPackage.LOOP_STATEMENT__SAME_NAME:
        setSameName(SAME_NAME_EDEFAULT);
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
      case AdbPackage.LOOP_STATEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdbPackage.LOOP_STATEMENT__ITERATION_SCHEME:
        return iterationScheme != null;
      case AdbPackage.LOOP_STATEMENT__SEQUENCE_OF_STATEMENTS:
        return sequenceOfStatements != null;
      case AdbPackage.LOOP_STATEMENT__SAME_NAME:
        return SAME_NAME_EDEFAULT == null ? sameName != null : !SAME_NAME_EDEFAULT.equals(sameName);
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
    result.append(", sameName: ");
    result.append(sameName);
    result.append(')');
    return result.toString();
  }

} //LoopStatementImpl
