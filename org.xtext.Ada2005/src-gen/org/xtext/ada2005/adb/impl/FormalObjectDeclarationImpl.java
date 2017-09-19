/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.AnonymousAccessDefinition;
import org.xtext.ada2005.adb.DefiningIdentifierList;
import org.xtext.ada2005.adb.Expression;
import org.xtext.ada2005.adb.FormalObjectDeclaration;
import org.xtext.ada2005.adb.Mode;
import org.xtext.ada2005.adb.Name;
import org.xtext.ada2005.adb.OptNullExclusion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Object Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalObjectDeclarationImpl#getIdList <em>Id List</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalObjectDeclarationImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalObjectDeclarationImpl#getOptNullExclusion <em>Opt Null Exclusion</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalObjectDeclarationImpl#getSubtypeMark <em>Subtype Mark</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalObjectDeclarationImpl#getAnonymousAccessDefinition <em>Anonymous Access Definition</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalObjectDeclarationImpl#getDefaultExpression <em>Default Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormalObjectDeclarationImpl extends GenericFormalParameterDeclarationImpl implements FormalObjectDeclaration
{
  /**
   * The cached value of the '{@link #getIdList() <em>Id List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdList()
   * @generated
   * @ordered
   */
  protected DefiningIdentifierList idList;

  /**
   * The cached value of the '{@link #getMode() <em>Mode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMode()
   * @generated
   * @ordered
   */
  protected Mode mode;

  /**
   * The cached value of the '{@link #getOptNullExclusion() <em>Opt Null Exclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptNullExclusion()
   * @generated
   * @ordered
   */
  protected OptNullExclusion optNullExclusion;

  /**
   * The cached value of the '{@link #getSubtypeMark() <em>Subtype Mark</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtypeMark()
   * @generated
   * @ordered
   */
  protected Name subtypeMark;

  /**
   * The cached value of the '{@link #getAnonymousAccessDefinition() <em>Anonymous Access Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnonymousAccessDefinition()
   * @generated
   * @ordered
   */
  protected AnonymousAccessDefinition anonymousAccessDefinition;

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
  protected FormalObjectDeclarationImpl()
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
    return AdbPackage.eINSTANCE.getFormalObjectDeclaration();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefiningIdentifierList getIdList()
  {
    return idList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdList(DefiningIdentifierList newIdList, NotificationChain msgs)
  {
    DefiningIdentifierList oldIdList = idList;
    idList = newIdList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_OBJECT_DECLARATION__ID_LIST, oldIdList, newIdList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdList(DefiningIdentifierList newIdList)
  {
    if (newIdList != idList)
    {
      NotificationChain msgs = null;
      if (idList != null)
        msgs = ((InternalEObject)idList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_OBJECT_DECLARATION__ID_LIST, null, msgs);
      if (newIdList != null)
        msgs = ((InternalEObject)newIdList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_OBJECT_DECLARATION__ID_LIST, null, msgs);
      msgs = basicSetIdList(newIdList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_OBJECT_DECLARATION__ID_LIST, newIdList, newIdList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mode getMode()
  {
    return mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMode(Mode newMode, NotificationChain msgs)
  {
    Mode oldMode = mode;
    mode = newMode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_OBJECT_DECLARATION__MODE, oldMode, newMode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMode(Mode newMode)
  {
    if (newMode != mode)
    {
      NotificationChain msgs = null;
      if (mode != null)
        msgs = ((InternalEObject)mode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_OBJECT_DECLARATION__MODE, null, msgs);
      if (newMode != null)
        msgs = ((InternalEObject)newMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_OBJECT_DECLARATION__MODE, null, msgs);
      msgs = basicSetMode(newMode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_OBJECT_DECLARATION__MODE, newMode, newMode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptNullExclusion getOptNullExclusion()
  {
    return optNullExclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOptNullExclusion(OptNullExclusion newOptNullExclusion, NotificationChain msgs)
  {
    OptNullExclusion oldOptNullExclusion = optNullExclusion;
    optNullExclusion = newOptNullExclusion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_OBJECT_DECLARATION__OPT_NULL_EXCLUSION, oldOptNullExclusion, newOptNullExclusion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptNullExclusion(OptNullExclusion newOptNullExclusion)
  {
    if (newOptNullExclusion != optNullExclusion)
    {
      NotificationChain msgs = null;
      if (optNullExclusion != null)
        msgs = ((InternalEObject)optNullExclusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_OBJECT_DECLARATION__OPT_NULL_EXCLUSION, null, msgs);
      if (newOptNullExclusion != null)
        msgs = ((InternalEObject)newOptNullExclusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_OBJECT_DECLARATION__OPT_NULL_EXCLUSION, null, msgs);
      msgs = basicSetOptNullExclusion(newOptNullExclusion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_OBJECT_DECLARATION__OPT_NULL_EXCLUSION, newOptNullExclusion, newOptNullExclusion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getSubtypeMark()
  {
    return subtypeMark;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubtypeMark(Name newSubtypeMark, NotificationChain msgs)
  {
    Name oldSubtypeMark = subtypeMark;
    subtypeMark = newSubtypeMark;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_OBJECT_DECLARATION__SUBTYPE_MARK, oldSubtypeMark, newSubtypeMark);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubtypeMark(Name newSubtypeMark)
  {
    if (newSubtypeMark != subtypeMark)
    {
      NotificationChain msgs = null;
      if (subtypeMark != null)
        msgs = ((InternalEObject)subtypeMark).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_OBJECT_DECLARATION__SUBTYPE_MARK, null, msgs);
      if (newSubtypeMark != null)
        msgs = ((InternalEObject)newSubtypeMark).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_OBJECT_DECLARATION__SUBTYPE_MARK, null, msgs);
      msgs = basicSetSubtypeMark(newSubtypeMark, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_OBJECT_DECLARATION__SUBTYPE_MARK, newSubtypeMark, newSubtypeMark));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnonymousAccessDefinition getAnonymousAccessDefinition()
  {
    return anonymousAccessDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnonymousAccessDefinition(AnonymousAccessDefinition newAnonymousAccessDefinition, NotificationChain msgs)
  {
    AnonymousAccessDefinition oldAnonymousAccessDefinition = anonymousAccessDefinition;
    anonymousAccessDefinition = newAnonymousAccessDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_OBJECT_DECLARATION__ANONYMOUS_ACCESS_DEFINITION, oldAnonymousAccessDefinition, newAnonymousAccessDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnonymousAccessDefinition(AnonymousAccessDefinition newAnonymousAccessDefinition)
  {
    if (newAnonymousAccessDefinition != anonymousAccessDefinition)
    {
      NotificationChain msgs = null;
      if (anonymousAccessDefinition != null)
        msgs = ((InternalEObject)anonymousAccessDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_OBJECT_DECLARATION__ANONYMOUS_ACCESS_DEFINITION, null, msgs);
      if (newAnonymousAccessDefinition != null)
        msgs = ((InternalEObject)newAnonymousAccessDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_OBJECT_DECLARATION__ANONYMOUS_ACCESS_DEFINITION, null, msgs);
      msgs = basicSetAnonymousAccessDefinition(newAnonymousAccessDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_OBJECT_DECLARATION__ANONYMOUS_ACCESS_DEFINITION, newAnonymousAccessDefinition, newAnonymousAccessDefinition));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_OBJECT_DECLARATION__DEFAULT_EXPRESSION, oldDefaultExpression, newDefaultExpression);
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
        msgs = ((InternalEObject)defaultExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_OBJECT_DECLARATION__DEFAULT_EXPRESSION, null, msgs);
      if (newDefaultExpression != null)
        msgs = ((InternalEObject)newDefaultExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_OBJECT_DECLARATION__DEFAULT_EXPRESSION, null, msgs);
      msgs = basicSetDefaultExpression(newDefaultExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_OBJECT_DECLARATION__DEFAULT_EXPRESSION, newDefaultExpression, newDefaultExpression));
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
      case AdbPackage.FORMAL_OBJECT_DECLARATION__ID_LIST:
        return basicSetIdList(null, msgs);
      case AdbPackage.FORMAL_OBJECT_DECLARATION__MODE:
        return basicSetMode(null, msgs);
      case AdbPackage.FORMAL_OBJECT_DECLARATION__OPT_NULL_EXCLUSION:
        return basicSetOptNullExclusion(null, msgs);
      case AdbPackage.FORMAL_OBJECT_DECLARATION__SUBTYPE_MARK:
        return basicSetSubtypeMark(null, msgs);
      case AdbPackage.FORMAL_OBJECT_DECLARATION__ANONYMOUS_ACCESS_DEFINITION:
        return basicSetAnonymousAccessDefinition(null, msgs);
      case AdbPackage.FORMAL_OBJECT_DECLARATION__DEFAULT_EXPRESSION:
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
      case AdbPackage.FORMAL_OBJECT_DECLARATION__ID_LIST:
        return getIdList();
      case AdbPackage.FORMAL_OBJECT_DECLARATION__MODE:
        return getMode();
      case AdbPackage.FORMAL_OBJECT_DECLARATION__OPT_NULL_EXCLUSION:
        return getOptNullExclusion();
      case AdbPackage.FORMAL_OBJECT_DECLARATION__SUBTYPE_MARK:
        return getSubtypeMark();
      case AdbPackage.FORMAL_OBJECT_DECLARATION__ANONYMOUS_ACCESS_DEFINITION:
        return getAnonymousAccessDefinition();
      case AdbPackage.FORMAL_OBJECT_DECLARATION__DEFAULT_EXPRESSION:
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
      case AdbPackage.FORMAL_OBJECT_DECLARATION__ID_LIST:
        setIdList((DefiningIdentifierList)newValue);
        return;
      case AdbPackage.FORMAL_OBJECT_DECLARATION__MODE:
        setMode((Mode)newValue);
        return;
      case AdbPackage.FORMAL_OBJECT_DECLARATION__OPT_NULL_EXCLUSION:
        setOptNullExclusion((OptNullExclusion)newValue);
        return;
      case AdbPackage.FORMAL_OBJECT_DECLARATION__SUBTYPE_MARK:
        setSubtypeMark((Name)newValue);
        return;
      case AdbPackage.FORMAL_OBJECT_DECLARATION__ANONYMOUS_ACCESS_DEFINITION:
        setAnonymousAccessDefinition((AnonymousAccessDefinition)newValue);
        return;
      case AdbPackage.FORMAL_OBJECT_DECLARATION__DEFAULT_EXPRESSION:
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
      case AdbPackage.FORMAL_OBJECT_DECLARATION__ID_LIST:
        setIdList((DefiningIdentifierList)null);
        return;
      case AdbPackage.FORMAL_OBJECT_DECLARATION__MODE:
        setMode((Mode)null);
        return;
      case AdbPackage.FORMAL_OBJECT_DECLARATION__OPT_NULL_EXCLUSION:
        setOptNullExclusion((OptNullExclusion)null);
        return;
      case AdbPackage.FORMAL_OBJECT_DECLARATION__SUBTYPE_MARK:
        setSubtypeMark((Name)null);
        return;
      case AdbPackage.FORMAL_OBJECT_DECLARATION__ANONYMOUS_ACCESS_DEFINITION:
        setAnonymousAccessDefinition((AnonymousAccessDefinition)null);
        return;
      case AdbPackage.FORMAL_OBJECT_DECLARATION__DEFAULT_EXPRESSION:
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
      case AdbPackage.FORMAL_OBJECT_DECLARATION__ID_LIST:
        return idList != null;
      case AdbPackage.FORMAL_OBJECT_DECLARATION__MODE:
        return mode != null;
      case AdbPackage.FORMAL_OBJECT_DECLARATION__OPT_NULL_EXCLUSION:
        return optNullExclusion != null;
      case AdbPackage.FORMAL_OBJECT_DECLARATION__SUBTYPE_MARK:
        return subtypeMark != null;
      case AdbPackage.FORMAL_OBJECT_DECLARATION__ANONYMOUS_ACCESS_DEFINITION:
        return anonymousAccessDefinition != null;
      case AdbPackage.FORMAL_OBJECT_DECLARATION__DEFAULT_EXPRESSION:
        return defaultExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //FormalObjectDeclarationImpl
