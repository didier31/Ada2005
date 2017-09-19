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
import org.xtext.ada2005.adb.DeclarativeBlock;
import org.xtext.ada2005.adb.DeclarativeItem;
import org.xtext.ada2005.adb.HandledSequenceOfStatements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declarative Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.DeclarativeBlockImpl#getDeclarativeItems <em>Declarative Items</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.DeclarativeBlockImpl#getHandledSequenceOfStatements <em>Handled Sequence Of Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclarativeBlockImpl extends MinimalEObjectImpl.Container implements DeclarativeBlock
{
  /**
   * The cached value of the '{@link #getDeclarativeItems() <em>Declarative Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarativeItems()
   * @generated
   * @ordered
   */
  protected EList<DeclarativeItem> declarativeItems;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclarativeBlockImpl()
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
    return AdbPackage.eINSTANCE.getDeclarativeBlock();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeclarativeItem> getDeclarativeItems()
  {
    if (declarativeItems == null)
    {
      declarativeItems = new EObjectContainmentEList<DeclarativeItem>(DeclarativeItem.class, this, AdbPackage.DECLARATIVE_BLOCK__DECLARATIVE_ITEMS);
    }
    return declarativeItems;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.DECLARATIVE_BLOCK__HANDLED_SEQUENCE_OF_STATEMENTS, oldHandledSequenceOfStatements, newHandledSequenceOfStatements);
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
        msgs = ((InternalEObject)handledSequenceOfStatements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DECLARATIVE_BLOCK__HANDLED_SEQUENCE_OF_STATEMENTS, null, msgs);
      if (newHandledSequenceOfStatements != null)
        msgs = ((InternalEObject)newHandledSequenceOfStatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.DECLARATIVE_BLOCK__HANDLED_SEQUENCE_OF_STATEMENTS, null, msgs);
      msgs = basicSetHandledSequenceOfStatements(newHandledSequenceOfStatements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.DECLARATIVE_BLOCK__HANDLED_SEQUENCE_OF_STATEMENTS, newHandledSequenceOfStatements, newHandledSequenceOfStatements));
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
      case AdbPackage.DECLARATIVE_BLOCK__DECLARATIVE_ITEMS:
        return ((InternalEList<?>)getDeclarativeItems()).basicRemove(otherEnd, msgs);
      case AdbPackage.DECLARATIVE_BLOCK__HANDLED_SEQUENCE_OF_STATEMENTS:
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
      case AdbPackage.DECLARATIVE_BLOCK__DECLARATIVE_ITEMS:
        return getDeclarativeItems();
      case AdbPackage.DECLARATIVE_BLOCK__HANDLED_SEQUENCE_OF_STATEMENTS:
        return getHandledSequenceOfStatements();
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
      case AdbPackage.DECLARATIVE_BLOCK__DECLARATIVE_ITEMS:
        getDeclarativeItems().clear();
        getDeclarativeItems().addAll((Collection<? extends DeclarativeItem>)newValue);
        return;
      case AdbPackage.DECLARATIVE_BLOCK__HANDLED_SEQUENCE_OF_STATEMENTS:
        setHandledSequenceOfStatements((HandledSequenceOfStatements)newValue);
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
      case AdbPackage.DECLARATIVE_BLOCK__DECLARATIVE_ITEMS:
        getDeclarativeItems().clear();
        return;
      case AdbPackage.DECLARATIVE_BLOCK__HANDLED_SEQUENCE_OF_STATEMENTS:
        setHandledSequenceOfStatements((HandledSequenceOfStatements)null);
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
      case AdbPackage.DECLARATIVE_BLOCK__DECLARATIVE_ITEMS:
        return declarativeItems != null && !declarativeItems.isEmpty();
      case AdbPackage.DECLARATIVE_BLOCK__HANDLED_SEQUENCE_OF_STATEMENTS:
        return handledSequenceOfStatements != null;
    }
    return super.eIsSet(featureID);
  }

} //DeclarativeBlockImpl
