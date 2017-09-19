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
import org.xtext.ada2005.adb.PackageBody;
import org.xtext.ada2005.adb.PackageDeclaration;
import org.xtext.ada2005.adb.ProperBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.PackageBodyImpl#getDeclarativeItems <em>Declarative Items</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.PackageBodyImpl#getHandledSequenceOfStatements <em>Handled Sequence Of Statements</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.PackageBodyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.PackageBodyImpl#getEndName <em>End Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageBodyImpl extends UnitImpl implements PackageBody
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
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected PackageDeclaration name;

  /**
   * The cached value of the '{@link #getEndName() <em>End Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndName()
   * @generated
   * @ordered
   */
  protected PackageDeclaration endName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageBodyImpl()
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
    return AdbPackage.eINSTANCE.getPackageBody();
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
      declarativeItems = new EObjectContainmentEList<DeclarativeItem>(DeclarativeItem.class, this, AdbPackage.PACKAGE_BODY__DECLARATIVE_ITEMS);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.PACKAGE_BODY__HANDLED_SEQUENCE_OF_STATEMENTS, oldHandledSequenceOfStatements, newHandledSequenceOfStatements);
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
        msgs = ((InternalEObject)handledSequenceOfStatements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PACKAGE_BODY__HANDLED_SEQUENCE_OF_STATEMENTS, null, msgs);
      if (newHandledSequenceOfStatements != null)
        msgs = ((InternalEObject)newHandledSequenceOfStatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.PACKAGE_BODY__HANDLED_SEQUENCE_OF_STATEMENTS, null, msgs);
      msgs = basicSetHandledSequenceOfStatements(newHandledSequenceOfStatements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PACKAGE_BODY__HANDLED_SEQUENCE_OF_STATEMENTS, newHandledSequenceOfStatements, newHandledSequenceOfStatements));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (PackageDeclaration)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdbPackage.PACKAGE_BODY__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(PackageDeclaration newName)
  {
    PackageDeclaration oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PACKAGE_BODY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration getEndName()
  {
    if (endName != null && endName.eIsProxy())
    {
      InternalEObject oldEndName = (InternalEObject)endName;
      endName = (PackageDeclaration)eResolveProxy(oldEndName);
      if (endName != oldEndName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdbPackage.PACKAGE_BODY__END_NAME, oldEndName, endName));
      }
    }
    return endName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration basicGetEndName()
  {
    return endName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndName(PackageDeclaration newEndName)
  {
    PackageDeclaration oldEndName = endName;
    endName = newEndName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.PACKAGE_BODY__END_NAME, oldEndName, endName));
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
      case AdbPackage.PACKAGE_BODY__DECLARATIVE_ITEMS:
        return ((InternalEList<?>)getDeclarativeItems()).basicRemove(otherEnd, msgs);
      case AdbPackage.PACKAGE_BODY__HANDLED_SEQUENCE_OF_STATEMENTS:
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
      case AdbPackage.PACKAGE_BODY__DECLARATIVE_ITEMS:
        return getDeclarativeItems();
      case AdbPackage.PACKAGE_BODY__HANDLED_SEQUENCE_OF_STATEMENTS:
        return getHandledSequenceOfStatements();
      case AdbPackage.PACKAGE_BODY__NAME:
        if (resolve) return getName();
        return basicGetName();
      case AdbPackage.PACKAGE_BODY__END_NAME:
        if (resolve) return getEndName();
        return basicGetEndName();
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
      case AdbPackage.PACKAGE_BODY__DECLARATIVE_ITEMS:
        getDeclarativeItems().clear();
        getDeclarativeItems().addAll((Collection<? extends DeclarativeItem>)newValue);
        return;
      case AdbPackage.PACKAGE_BODY__HANDLED_SEQUENCE_OF_STATEMENTS:
        setHandledSequenceOfStatements((HandledSequenceOfStatements)newValue);
        return;
      case AdbPackage.PACKAGE_BODY__NAME:
        setName((PackageDeclaration)newValue);
        return;
      case AdbPackage.PACKAGE_BODY__END_NAME:
        setEndName((PackageDeclaration)newValue);
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
      case AdbPackage.PACKAGE_BODY__DECLARATIVE_ITEMS:
        getDeclarativeItems().clear();
        return;
      case AdbPackage.PACKAGE_BODY__HANDLED_SEQUENCE_OF_STATEMENTS:
        setHandledSequenceOfStatements((HandledSequenceOfStatements)null);
        return;
      case AdbPackage.PACKAGE_BODY__NAME:
        setName((PackageDeclaration)null);
        return;
      case AdbPackage.PACKAGE_BODY__END_NAME:
        setEndName((PackageDeclaration)null);
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
      case AdbPackage.PACKAGE_BODY__DECLARATIVE_ITEMS:
        return declarativeItems != null && !declarativeItems.isEmpty();
      case AdbPackage.PACKAGE_BODY__HANDLED_SEQUENCE_OF_STATEMENTS:
        return handledSequenceOfStatements != null;
      case AdbPackage.PACKAGE_BODY__NAME:
        return name != null;
      case AdbPackage.PACKAGE_BODY__END_NAME:
        return endName != null;
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
        case AdbPackage.PACKAGE_BODY__DECLARATIVE_ITEMS: return AdbPackage.DECLARATIVE_BLOCK__DECLARATIVE_ITEMS;
        case AdbPackage.PACKAGE_BODY__HANDLED_SEQUENCE_OF_STATEMENTS: return AdbPackage.DECLARATIVE_BLOCK__HANDLED_SEQUENCE_OF_STATEMENTS;
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
        case AdbPackage.DECLARATIVE_BLOCK__DECLARATIVE_ITEMS: return AdbPackage.PACKAGE_BODY__DECLARATIVE_ITEMS;
        case AdbPackage.DECLARATIVE_BLOCK__HANDLED_SEQUENCE_OF_STATEMENTS: return AdbPackage.PACKAGE_BODY__HANDLED_SEQUENCE_OF_STATEMENTS;
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
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //PackageBodyImpl
