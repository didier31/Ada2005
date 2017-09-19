/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.ComponentDeclaration;
import org.xtext.ada2005.adb.ComponentDefinition;
import org.xtext.ada2005.adb.DefiningIdentifierList;
import org.xtext.ada2005.adb.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.ComponentDeclarationImpl#getDefiningIdentifiers <em>Defining Identifiers</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ComponentDeclarationImpl#getComponentDefinition <em>Component Definition</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ComponentDeclarationImpl#getDefaultExpression <em>Default Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentDeclarationImpl extends ProtectedElementDeclarationImpl implements ComponentDeclaration
{
  /**
   * The cached value of the '{@link #getDefiningIdentifiers() <em>Defining Identifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefiningIdentifiers()
   * @generated
   * @ordered
   */
  protected DefiningIdentifierList definingIdentifiers;

  /**
   * The cached value of the '{@link #getComponentDefinition() <em>Component Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentDefinition()
   * @generated
   * @ordered
   */
  protected ComponentDefinition componentDefinition;

  /**
   * The cached value of the '{@link #getDefaultExpression() <em>Default Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultExpression()
   * @generated
   * @ordered
   */
  protected Expression defaultExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentDeclarationImpl()
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
    return AdbPackage.eINSTANCE.getComponentDeclaration();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefiningIdentifierList getDefiningIdentifiers()
  {
    return definingIdentifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefiningIdentifiers(DefiningIdentifierList newDefiningIdentifiers, NotificationChain msgs)
  {
    DefiningIdentifierList oldDefiningIdentifiers = definingIdentifiers;
    definingIdentifiers = newDefiningIdentifiers;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.COMPONENT_DECLARATION__DEFINING_IDENTIFIERS, oldDefiningIdentifiers, newDefiningIdentifiers);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefiningIdentifiers(DefiningIdentifierList newDefiningIdentifiers)
  {
    if (newDefiningIdentifiers != definingIdentifiers)
    {
      NotificationChain msgs = null;
      if (definingIdentifiers != null)
        msgs = ((InternalEObject)definingIdentifiers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.COMPONENT_DECLARATION__DEFINING_IDENTIFIERS, null, msgs);
      if (newDefiningIdentifiers != null)
        msgs = ((InternalEObject)newDefiningIdentifiers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.COMPONENT_DECLARATION__DEFINING_IDENTIFIERS, null, msgs);
      msgs = basicSetDefiningIdentifiers(newDefiningIdentifiers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.COMPONENT_DECLARATION__DEFINING_IDENTIFIERS, newDefiningIdentifiers, newDefiningIdentifiers));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDefinition getComponentDefinition()
  {
    return componentDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComponentDefinition(ComponentDefinition newComponentDefinition, NotificationChain msgs)
  {
    ComponentDefinition oldComponentDefinition = componentDefinition;
    componentDefinition = newComponentDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.COMPONENT_DECLARATION__COMPONENT_DEFINITION, oldComponentDefinition, newComponentDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponentDefinition(ComponentDefinition newComponentDefinition)
  {
    if (newComponentDefinition != componentDefinition)
    {
      NotificationChain msgs = null;
      if (componentDefinition != null)
        msgs = ((InternalEObject)componentDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.COMPONENT_DECLARATION__COMPONENT_DEFINITION, null, msgs);
      if (newComponentDefinition != null)
        msgs = ((InternalEObject)newComponentDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.COMPONENT_DECLARATION__COMPONENT_DEFINITION, null, msgs);
      msgs = basicSetComponentDefinition(newComponentDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.COMPONENT_DECLARATION__COMPONENT_DEFINITION, newComponentDefinition, newComponentDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getDefaultExpression()
  {
    return defaultExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultExpression(Expression newDefaultExpression, NotificationChain msgs)
  {
    Expression oldDefaultExpression = defaultExpression;
    defaultExpression = newDefaultExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.COMPONENT_DECLARATION__DEFAULT_EXPRESSION, oldDefaultExpression, newDefaultExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultExpression(Expression newDefaultExpression)
  {
    if (newDefaultExpression != defaultExpression)
    {
      NotificationChain msgs = null;
      if (defaultExpression != null)
        msgs = ((InternalEObject)defaultExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.COMPONENT_DECLARATION__DEFAULT_EXPRESSION, null, msgs);
      if (newDefaultExpression != null)
        msgs = ((InternalEObject)newDefaultExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.COMPONENT_DECLARATION__DEFAULT_EXPRESSION, null, msgs);
      msgs = basicSetDefaultExpression(newDefaultExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.COMPONENT_DECLARATION__DEFAULT_EXPRESSION, newDefaultExpression, newDefaultExpression));
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
      case AdbPackage.COMPONENT_DECLARATION__DEFINING_IDENTIFIERS:
        return basicSetDefiningIdentifiers(null, msgs);
      case AdbPackage.COMPONENT_DECLARATION__COMPONENT_DEFINITION:
        return basicSetComponentDefinition(null, msgs);
      case AdbPackage.COMPONENT_DECLARATION__DEFAULT_EXPRESSION:
        return basicSetDefaultExpression(null, msgs);
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
      case AdbPackage.COMPONENT_DECLARATION__DEFINING_IDENTIFIERS:
        return getDefiningIdentifiers();
      case AdbPackage.COMPONENT_DECLARATION__COMPONENT_DEFINITION:
        return getComponentDefinition();
      case AdbPackage.COMPONENT_DECLARATION__DEFAULT_EXPRESSION:
        return getDefaultExpression();
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
      case AdbPackage.COMPONENT_DECLARATION__DEFINING_IDENTIFIERS:
        setDefiningIdentifiers((DefiningIdentifierList)newValue);
        return;
      case AdbPackage.COMPONENT_DECLARATION__COMPONENT_DEFINITION:
        setComponentDefinition((ComponentDefinition)newValue);
        return;
      case AdbPackage.COMPONENT_DECLARATION__DEFAULT_EXPRESSION:
        setDefaultExpression((Expression)newValue);
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
      case AdbPackage.COMPONENT_DECLARATION__DEFINING_IDENTIFIERS:
        setDefiningIdentifiers((DefiningIdentifierList)null);
        return;
      case AdbPackage.COMPONENT_DECLARATION__COMPONENT_DEFINITION:
        setComponentDefinition((ComponentDefinition)null);
        return;
      case AdbPackage.COMPONENT_DECLARATION__DEFAULT_EXPRESSION:
        setDefaultExpression((Expression)null);
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
      case AdbPackage.COMPONENT_DECLARATION__DEFINING_IDENTIFIERS:
        return definingIdentifiers != null;
      case AdbPackage.COMPONENT_DECLARATION__COMPONENT_DEFINITION:
        return componentDefinition != null;
      case AdbPackage.COMPONENT_DECLARATION__DEFAULT_EXPRESSION:
        return defaultExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //ComponentDeclarationImpl
