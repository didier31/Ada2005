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
import org.xtext.ada2005.adb.AspectClause;
import org.xtext.ada2005.adb.ComponentClause;
import org.xtext.ada2005.adb.Expression;
import org.xtext.ada2005.adb.ModClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspect Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.AspectClauseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.AspectClauseImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.AspectClauseImpl#getMod <em>Mod</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.AspectClauseImpl#getComponentClause <em>Component Clause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AspectClauseImpl extends BasicDeclarativeItemImpl implements AspectClause
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
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The cached value of the '{@link #getMod() <em>Mod</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMod()
   * @generated
   * @ordered
   */
  protected ModClause mod;

  /**
   * The cached value of the '{@link #getComponentClause() <em>Component Clause</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentClause()
   * @generated
   * @ordered
   */
  protected EList<ComponentClause> componentClause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AspectClauseImpl()
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
    return AdbPackage.eINSTANCE.getAspectClause();
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ASPECT_CLAUSE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ASPECT_CLAUSE__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ASPECT_CLAUSE__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ASPECT_CLAUSE__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ASPECT_CLAUSE__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModClause getMod()
  {
    return mod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMod(ModClause newMod, NotificationChain msgs)
  {
    ModClause oldMod = mod;
    mod = newMod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ASPECT_CLAUSE__MOD, oldMod, newMod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMod(ModClause newMod)
  {
    if (newMod != mod)
    {
      NotificationChain msgs = null;
      if (mod != null)
        msgs = ((InternalEObject)mod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ASPECT_CLAUSE__MOD, null, msgs);
      if (newMod != null)
        msgs = ((InternalEObject)newMod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ASPECT_CLAUSE__MOD, null, msgs);
      msgs = basicSetMod(newMod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ASPECT_CLAUSE__MOD, newMod, newMod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentClause> getComponentClause()
  {
    if (componentClause == null)
    {
      componentClause = new EObjectContainmentEList<ComponentClause>(ComponentClause.class, this, AdbPackage.ASPECT_CLAUSE__COMPONENT_CLAUSE);
    }
    return componentClause;
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
      case AdbPackage.ASPECT_CLAUSE__EXPRESSION:
        return basicSetExpression(null, msgs);
      case AdbPackage.ASPECT_CLAUSE__MOD:
        return basicSetMod(null, msgs);
      case AdbPackage.ASPECT_CLAUSE__COMPONENT_CLAUSE:
        return ((InternalEList<?>)getComponentClause()).basicRemove(otherEnd, msgs);
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
      case AdbPackage.ASPECT_CLAUSE__NAME:
        return getName();
      case AdbPackage.ASPECT_CLAUSE__EXPRESSION:
        return getExpression();
      case AdbPackage.ASPECT_CLAUSE__MOD:
        return getMod();
      case AdbPackage.ASPECT_CLAUSE__COMPONENT_CLAUSE:
        return getComponentClause();
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
      case AdbPackage.ASPECT_CLAUSE__NAME:
        setName((String)newValue);
        return;
      case AdbPackage.ASPECT_CLAUSE__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case AdbPackage.ASPECT_CLAUSE__MOD:
        setMod((ModClause)newValue);
        return;
      case AdbPackage.ASPECT_CLAUSE__COMPONENT_CLAUSE:
        getComponentClause().clear();
        getComponentClause().addAll((Collection<? extends ComponentClause>)newValue);
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
      case AdbPackage.ASPECT_CLAUSE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdbPackage.ASPECT_CLAUSE__EXPRESSION:
        setExpression((Expression)null);
        return;
      case AdbPackage.ASPECT_CLAUSE__MOD:
        setMod((ModClause)null);
        return;
      case AdbPackage.ASPECT_CLAUSE__COMPONENT_CLAUSE:
        getComponentClause().clear();
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
      case AdbPackage.ASPECT_CLAUSE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdbPackage.ASPECT_CLAUSE__EXPRESSION:
        return expression != null;
      case AdbPackage.ASPECT_CLAUSE__MOD:
        return mod != null;
      case AdbPackage.ASPECT_CLAUSE__COMPONENT_CLAUSE:
        return componentClause != null && !componentClause.isEmpty();
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

} //AspectClauseImpl
