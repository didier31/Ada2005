/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AcceptStatement;
import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.EntryDeclaration;
import org.xtext.ada2005.adb.EntryIndex;
import org.xtext.ada2005.adb.FormalPart;
import org.xtext.ada2005.adb.HandledSequenceOfStatements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accept Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.AcceptStatementImpl#getEntryName <em>Entry Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.AcceptStatementImpl#getEntryIndex <em>Entry Index</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.AcceptStatementImpl#getFormalPart <em>Formal Part</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.AcceptStatementImpl#getHandledSequenceOfStatements <em>Handled Sequence Of Statements</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.AcceptStatementImpl#getEntryidentifier <em>Entryidentifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcceptStatementImpl extends CompoundStatementImpl implements AcceptStatement
{
  /**
   * The cached value of the '{@link #getEntryName() <em>Entry Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryName()
   * @generated
   * @ordered
   */
  protected EntryDeclaration entryName;

  /**
   * The cached value of the '{@link #getEntryIndex() <em>Entry Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryIndex()
   * @generated
   * @ordered
   */
  protected EntryIndex entryIndex;

  /**
   * The cached value of the '{@link #getFormalPart() <em>Formal Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormalPart()
   * @generated
   * @ordered
   */
  protected FormalPart formalPart;

  /**
   * The cached value of the '{@link #getHandledSequenceOfStatements() <em>Handled Sequence Of Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandledSequenceOfStatements()
   * @generated
   * @ordered
   */
  protected HandledSequenceOfStatements handledSequenceOfStatements;

  /**
   * The default value of the '{@link #getEntryidentifier() <em>Entryidentifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryidentifier()
   * @generated
   * @ordered
   */
  protected static final String ENTRYIDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEntryidentifier() <em>Entryidentifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryidentifier()
   * @generated
   * @ordered
   */
  protected String entryidentifier = ENTRYIDENTIFIER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AcceptStatementImpl()
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
    return AdbPackage.eINSTANCE.getAcceptStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntryDeclaration getEntryName()
  {
    if (entryName != null && entryName.eIsProxy())
    {
      InternalEObject oldEntryName = (InternalEObject)entryName;
      entryName = (EntryDeclaration)eResolveProxy(oldEntryName);
      if (entryName != oldEntryName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdbPackage.ACCEPT_STATEMENT__ENTRY_NAME, oldEntryName, entryName));
      }
    }
    return entryName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntryDeclaration basicGetEntryName()
  {
    return entryName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntryName(EntryDeclaration newEntryName)
  {
    EntryDeclaration oldEntryName = entryName;
    entryName = newEntryName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ACCEPT_STATEMENT__ENTRY_NAME, oldEntryName, entryName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntryIndex getEntryIndex()
  {
    return entryIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntryIndex(EntryIndex newEntryIndex, NotificationChain msgs)
  {
    EntryIndex oldEntryIndex = entryIndex;
    entryIndex = newEntryIndex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ACCEPT_STATEMENT__ENTRY_INDEX, oldEntryIndex, newEntryIndex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntryIndex(EntryIndex newEntryIndex)
  {
    if (newEntryIndex != entryIndex)
    {
      NotificationChain msgs = null;
      if (entryIndex != null)
        msgs = ((InternalEObject)entryIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ACCEPT_STATEMENT__ENTRY_INDEX, null, msgs);
      if (newEntryIndex != null)
        msgs = ((InternalEObject)newEntryIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ACCEPT_STATEMENT__ENTRY_INDEX, null, msgs);
      msgs = basicSetEntryIndex(newEntryIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ACCEPT_STATEMENT__ENTRY_INDEX, newEntryIndex, newEntryIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalPart getFormalPart()
  {
    return formalPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormalPart(FormalPart newFormalPart, NotificationChain msgs)
  {
    FormalPart oldFormalPart = formalPart;
    formalPart = newFormalPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ACCEPT_STATEMENT__FORMAL_PART, oldFormalPart, newFormalPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormalPart(FormalPart newFormalPart)
  {
    if (newFormalPart != formalPart)
    {
      NotificationChain msgs = null;
      if (formalPart != null)
        msgs = ((InternalEObject)formalPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ACCEPT_STATEMENT__FORMAL_PART, null, msgs);
      if (newFormalPart != null)
        msgs = ((InternalEObject)newFormalPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ACCEPT_STATEMENT__FORMAL_PART, null, msgs);
      msgs = basicSetFormalPart(newFormalPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ACCEPT_STATEMENT__FORMAL_PART, newFormalPart, newFormalPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HandledSequenceOfStatements getHandledSequenceOfStatements()
  {
    return handledSequenceOfStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHandledSequenceOfStatements(HandledSequenceOfStatements newHandledSequenceOfStatements, NotificationChain msgs)
  {
    HandledSequenceOfStatements oldHandledSequenceOfStatements = handledSequenceOfStatements;
    handledSequenceOfStatements = newHandledSequenceOfStatements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ACCEPT_STATEMENT__HANDLED_SEQUENCE_OF_STATEMENTS, oldHandledSequenceOfStatements, newHandledSequenceOfStatements);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHandledSequenceOfStatements(HandledSequenceOfStatements newHandledSequenceOfStatements)
  {
    if (newHandledSequenceOfStatements != handledSequenceOfStatements)
    {
      NotificationChain msgs = null;
      if (handledSequenceOfStatements != null)
        msgs = ((InternalEObject)handledSequenceOfStatements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ACCEPT_STATEMENT__HANDLED_SEQUENCE_OF_STATEMENTS, null, msgs);
      if (newHandledSequenceOfStatements != null)
        msgs = ((InternalEObject)newHandledSequenceOfStatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ACCEPT_STATEMENT__HANDLED_SEQUENCE_OF_STATEMENTS, null, msgs);
      msgs = basicSetHandledSequenceOfStatements(newHandledSequenceOfStatements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ACCEPT_STATEMENT__HANDLED_SEQUENCE_OF_STATEMENTS, newHandledSequenceOfStatements, newHandledSequenceOfStatements));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEntryidentifier()
  {
    return entryidentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntryidentifier(String newEntryidentifier)
  {
    String oldEntryidentifier = entryidentifier;
    entryidentifier = newEntryidentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ACCEPT_STATEMENT__ENTRYIDENTIFIER, oldEntryidentifier, entryidentifier));
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
      case AdbPackage.ACCEPT_STATEMENT__ENTRY_INDEX:
        return basicSetEntryIndex(null, msgs);
      case AdbPackage.ACCEPT_STATEMENT__FORMAL_PART:
        return basicSetFormalPart(null, msgs);
      case AdbPackage.ACCEPT_STATEMENT__HANDLED_SEQUENCE_OF_STATEMENTS:
        return basicSetHandledSequenceOfStatements(null, msgs);
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
      case AdbPackage.ACCEPT_STATEMENT__ENTRY_NAME:
        if (resolve) return getEntryName();
        return basicGetEntryName();
      case AdbPackage.ACCEPT_STATEMENT__ENTRY_INDEX:
        return getEntryIndex();
      case AdbPackage.ACCEPT_STATEMENT__FORMAL_PART:
        return getFormalPart();
      case AdbPackage.ACCEPT_STATEMENT__HANDLED_SEQUENCE_OF_STATEMENTS:
        return getHandledSequenceOfStatements();
      case AdbPackage.ACCEPT_STATEMENT__ENTRYIDENTIFIER:
        return getEntryidentifier();
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
      case AdbPackage.ACCEPT_STATEMENT__ENTRY_NAME:
        setEntryName((EntryDeclaration)newValue);
        return;
      case AdbPackage.ACCEPT_STATEMENT__ENTRY_INDEX:
        setEntryIndex((EntryIndex)newValue);
        return;
      case AdbPackage.ACCEPT_STATEMENT__FORMAL_PART:
        setFormalPart((FormalPart)newValue);
        return;
      case AdbPackage.ACCEPT_STATEMENT__HANDLED_SEQUENCE_OF_STATEMENTS:
        setHandledSequenceOfStatements((HandledSequenceOfStatements)newValue);
        return;
      case AdbPackage.ACCEPT_STATEMENT__ENTRYIDENTIFIER:
        setEntryidentifier((String)newValue);
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
      case AdbPackage.ACCEPT_STATEMENT__ENTRY_NAME:
        setEntryName((EntryDeclaration)null);
        return;
      case AdbPackage.ACCEPT_STATEMENT__ENTRY_INDEX:
        setEntryIndex((EntryIndex)null);
        return;
      case AdbPackage.ACCEPT_STATEMENT__FORMAL_PART:
        setFormalPart((FormalPart)null);
        return;
      case AdbPackage.ACCEPT_STATEMENT__HANDLED_SEQUENCE_OF_STATEMENTS:
        setHandledSequenceOfStatements((HandledSequenceOfStatements)null);
        return;
      case AdbPackage.ACCEPT_STATEMENT__ENTRYIDENTIFIER:
        setEntryidentifier(ENTRYIDENTIFIER_EDEFAULT);
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
      case AdbPackage.ACCEPT_STATEMENT__ENTRY_NAME:
        return entryName != null;
      case AdbPackage.ACCEPT_STATEMENT__ENTRY_INDEX:
        return entryIndex != null;
      case AdbPackage.ACCEPT_STATEMENT__FORMAL_PART:
        return formalPart != null;
      case AdbPackage.ACCEPT_STATEMENT__HANDLED_SEQUENCE_OF_STATEMENTS:
        return handledSequenceOfStatements != null;
      case AdbPackage.ACCEPT_STATEMENT__ENTRYIDENTIFIER:
        return ENTRYIDENTIFIER_EDEFAULT == null ? entryidentifier != null : !ENTRYIDENTIFIER_EDEFAULT.equals(entryidentifier);
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
    result.append(" (entryidentifier: ");
    result.append(entryidentifier);
    result.append(')');
    return result.toString();
  }

} //AcceptStatementImpl
