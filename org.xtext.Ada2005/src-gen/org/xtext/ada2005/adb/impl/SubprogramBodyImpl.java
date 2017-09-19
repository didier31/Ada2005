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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.Body;
import org.xtext.ada2005.adb.DeclarativeBlock;
import org.xtext.ada2005.adb.DeclarativeItem;
import org.xtext.ada2005.adb.HandledSequenceOfStatements;
import org.xtext.ada2005.adb.ProperBody;
import org.xtext.ada2005.adb.ProtectedOperationItem;
import org.xtext.ada2005.adb.SubprogramBody;
import org.xtext.ada2005.adb.SubprogramSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprogram Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.SubprogramBodyImpl#getDeclarativeItems <em>Declarative Items</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.SubprogramBodyImpl#getHandledSequenceOfStatements <em>Handled Sequence Of Statements</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.SubprogramBodyImpl#getSubprogramSpecification <em>Subprogram Specification</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.SubprogramBodyImpl#getEndname <em>Endname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprogramBodyImpl extends UnitImpl implements SubprogramBody
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
   * The cached value of the '{@link #getSubprogramSpecification() <em>Subprogram Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubprogramSpecification()
   * @generated
   * @ordered
   */
  protected SubprogramSpecification subprogramSpecification;

  /**
   * The default value of the '{@link #getEndname() <em>Endname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndname()
   * @generated
   * @ordered
   */
  protected static final String ENDNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEndname() <em>Endname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndname()
   * @generated
   * @ordered
   */
  protected String endname = ENDNAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubprogramBodyImpl()
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
    return AdbPackage.eINSTANCE.getSubprogramBody();
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
      declarativeItems = new EObjectContainmentEList<DeclarativeItem>(DeclarativeItem.class, this, AdbPackage.SUBPROGRAM_BODY__DECLARATIVE_ITEMS);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.SUBPROGRAM_BODY__HANDLED_SEQUENCE_OF_STATEMENTS, oldHandledSequenceOfStatements, newHandledSequenceOfStatements);
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
        msgs = ((InternalEObject)handledSequenceOfStatements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SUBPROGRAM_BODY__HANDLED_SEQUENCE_OF_STATEMENTS, null, msgs);
      if (newHandledSequenceOfStatements != null)
        msgs = ((InternalEObject)newHandledSequenceOfStatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SUBPROGRAM_BODY__HANDLED_SEQUENCE_OF_STATEMENTS, null, msgs);
      msgs = basicSetHandledSequenceOfStatements(newHandledSequenceOfStatements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SUBPROGRAM_BODY__HANDLED_SEQUENCE_OF_STATEMENTS, newHandledSequenceOfStatements, newHandledSequenceOfStatements));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubprogramSpecification getSubprogramSpecification()
  {
    return subprogramSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubprogramSpecification(SubprogramSpecification newSubprogramSpecification, NotificationChain msgs)
  {
    SubprogramSpecification oldSubprogramSpecification = subprogramSpecification;
    subprogramSpecification = newSubprogramSpecification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.SUBPROGRAM_BODY__SUBPROGRAM_SPECIFICATION, oldSubprogramSpecification, newSubprogramSpecification);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubprogramSpecification(SubprogramSpecification newSubprogramSpecification)
  {
    if (newSubprogramSpecification != subprogramSpecification)
    {
      NotificationChain msgs = null;
      if (subprogramSpecification != null)
        msgs = ((InternalEObject)subprogramSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SUBPROGRAM_BODY__SUBPROGRAM_SPECIFICATION, null, msgs);
      if (newSubprogramSpecification != null)
        msgs = ((InternalEObject)newSubprogramSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.SUBPROGRAM_BODY__SUBPROGRAM_SPECIFICATION, null, msgs);
      msgs = basicSetSubprogramSpecification(newSubprogramSpecification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SUBPROGRAM_BODY__SUBPROGRAM_SPECIFICATION, newSubprogramSpecification, newSubprogramSpecification));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEndname()
  {
    return endname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndname(String newEndname)
  {
    String oldEndname = endname;
    endname = newEndname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.SUBPROGRAM_BODY__ENDNAME, oldEndname, endname));
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
      case AdbPackage.SUBPROGRAM_BODY__DECLARATIVE_ITEMS:
        return ((InternalEList<?>)getDeclarativeItems()).basicRemove(otherEnd, msgs);
      case AdbPackage.SUBPROGRAM_BODY__HANDLED_SEQUENCE_OF_STATEMENTS:
        return basicSetHandledSequenceOfStatements(null, msgs);
      case AdbPackage.SUBPROGRAM_BODY__SUBPROGRAM_SPECIFICATION:
        return basicSetSubprogramSpecification(null, msgs);
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
      case AdbPackage.SUBPROGRAM_BODY__DECLARATIVE_ITEMS:
        return getDeclarativeItems();
      case AdbPackage.SUBPROGRAM_BODY__HANDLED_SEQUENCE_OF_STATEMENTS:
        return getHandledSequenceOfStatements();
      case AdbPackage.SUBPROGRAM_BODY__SUBPROGRAM_SPECIFICATION:
        return getSubprogramSpecification();
      case AdbPackage.SUBPROGRAM_BODY__ENDNAME:
        return getEndname();
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
      case AdbPackage.SUBPROGRAM_BODY__DECLARATIVE_ITEMS:
        getDeclarativeItems().clear();
        getDeclarativeItems().addAll((Collection<? extends DeclarativeItem>)newValue);
        return;
      case AdbPackage.SUBPROGRAM_BODY__HANDLED_SEQUENCE_OF_STATEMENTS:
        setHandledSequenceOfStatements((HandledSequenceOfStatements)newValue);
        return;
      case AdbPackage.SUBPROGRAM_BODY__SUBPROGRAM_SPECIFICATION:
        setSubprogramSpecification((SubprogramSpecification)newValue);
        return;
      case AdbPackage.SUBPROGRAM_BODY__ENDNAME:
        setEndname((String)newValue);
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
      case AdbPackage.SUBPROGRAM_BODY__DECLARATIVE_ITEMS:
        getDeclarativeItems().clear();
        return;
      case AdbPackage.SUBPROGRAM_BODY__HANDLED_SEQUENCE_OF_STATEMENTS:
        setHandledSequenceOfStatements((HandledSequenceOfStatements)null);
        return;
      case AdbPackage.SUBPROGRAM_BODY__SUBPROGRAM_SPECIFICATION:
        setSubprogramSpecification((SubprogramSpecification)null);
        return;
      case AdbPackage.SUBPROGRAM_BODY__ENDNAME:
        setEndname(ENDNAME_EDEFAULT);
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
      case AdbPackage.SUBPROGRAM_BODY__DECLARATIVE_ITEMS:
        return declarativeItems != null && !declarativeItems.isEmpty();
      case AdbPackage.SUBPROGRAM_BODY__HANDLED_SEQUENCE_OF_STATEMENTS:
        return handledSequenceOfStatements != null;
      case AdbPackage.SUBPROGRAM_BODY__SUBPROGRAM_SPECIFICATION:
        return subprogramSpecification != null;
      case AdbPackage.SUBPROGRAM_BODY__ENDNAME:
        return ENDNAME_EDEFAULT == null ? endname != null : !ENDNAME_EDEFAULT.equals(endname);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == DeclarativeBlock.class)
    {
      switch (derivedFeatureID)
      {
        case AdbPackage.SUBPROGRAM_BODY__DECLARATIVE_ITEMS: return AdbPackage.DECLARATIVE_BLOCK__DECLARATIVE_ITEMS;
        case AdbPackage.SUBPROGRAM_BODY__HANDLED_SEQUENCE_OF_STATEMENTS: return AdbPackage.DECLARATIVE_BLOCK__HANDLED_SEQUENCE_OF_STATEMENTS;
        default: return -1;
      }
    }
    if (baseClass == DeclarativeItem.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Body.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ProperBody.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ProtectedOperationItem.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == DeclarativeBlock.class)
    {
      switch (baseFeatureID)
      {
        case AdbPackage.DECLARATIVE_BLOCK__DECLARATIVE_ITEMS: return AdbPackage.SUBPROGRAM_BODY__DECLARATIVE_ITEMS;
        case AdbPackage.DECLARATIVE_BLOCK__HANDLED_SEQUENCE_OF_STATEMENTS: return AdbPackage.SUBPROGRAM_BODY__HANDLED_SEQUENCE_OF_STATEMENTS;
        default: return -1;
      }
    }
    if (baseClass == DeclarativeItem.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Body.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ProperBody.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ProtectedOperationItem.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (endname: ");
    result.append(endname);
    result.append(')');
    return result.toString();
  }

} //SubprogramBodyImpl
