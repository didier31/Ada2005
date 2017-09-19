/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.ArrayIndexes;
import org.xtext.ada2005.adb.ArrayTypeDefinition;
import org.xtext.ada2005.adb.ComponentDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.ArrayTypeDefinitionImpl#getArrayIndexes <em>Array Indexes</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.ArrayTypeDefinitionImpl#getComponentDefinition <em>Component Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayTypeDefinitionImpl extends FormalTypeDefinitionImpl implements ArrayTypeDefinition
{
  /**
   * The cached value of the '{@link #getArrayIndexes() <em>Array Indexes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayIndexes()
   * @generated
   * @ordered
   */
  protected ArrayIndexes arrayIndexes;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayTypeDefinitionImpl()
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
    return AdbPackage.eINSTANCE.getArrayTypeDefinition();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayIndexes getArrayIndexes()
  {
    return arrayIndexes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrayIndexes(ArrayIndexes newArrayIndexes, NotificationChain msgs)
  {
    ArrayIndexes oldArrayIndexes = arrayIndexes;
    arrayIndexes = newArrayIndexes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ARRAY_TYPE_DEFINITION__ARRAY_INDEXES, oldArrayIndexes, newArrayIndexes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrayIndexes(ArrayIndexes newArrayIndexes)
  {
    if (newArrayIndexes != arrayIndexes)
    {
      NotificationChain msgs = null;
      if (arrayIndexes != null)
        msgs = ((InternalEObject)arrayIndexes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ARRAY_TYPE_DEFINITION__ARRAY_INDEXES, null, msgs);
      if (newArrayIndexes != null)
        msgs = ((InternalEObject)newArrayIndexes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ARRAY_TYPE_DEFINITION__ARRAY_INDEXES, null, msgs);
      msgs = basicSetArrayIndexes(newArrayIndexes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ARRAY_TYPE_DEFINITION__ARRAY_INDEXES, newArrayIndexes, newArrayIndexes));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.ARRAY_TYPE_DEFINITION__COMPONENT_DEFINITION, oldComponentDefinition, newComponentDefinition);
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
        msgs = ((InternalEObject)componentDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ARRAY_TYPE_DEFINITION__COMPONENT_DEFINITION, null, msgs);
      if (newComponentDefinition != null)
        msgs = ((InternalEObject)newComponentDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.ARRAY_TYPE_DEFINITION__COMPONENT_DEFINITION, null, msgs);
      msgs = basicSetComponentDefinition(newComponentDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.ARRAY_TYPE_DEFINITION__COMPONENT_DEFINITION, newComponentDefinition, newComponentDefinition));
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
      case AdbPackage.ARRAY_TYPE_DEFINITION__ARRAY_INDEXES:
        return basicSetArrayIndexes(null, msgs);
      case AdbPackage.ARRAY_TYPE_DEFINITION__COMPONENT_DEFINITION:
        return basicSetComponentDefinition(null, msgs);
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
      case AdbPackage.ARRAY_TYPE_DEFINITION__ARRAY_INDEXES:
        return getArrayIndexes();
      case AdbPackage.ARRAY_TYPE_DEFINITION__COMPONENT_DEFINITION:
        return getComponentDefinition();
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
      case AdbPackage.ARRAY_TYPE_DEFINITION__ARRAY_INDEXES:
        setArrayIndexes((ArrayIndexes)newValue);
        return;
      case AdbPackage.ARRAY_TYPE_DEFINITION__COMPONENT_DEFINITION:
        setComponentDefinition((ComponentDefinition)newValue);
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
      case AdbPackage.ARRAY_TYPE_DEFINITION__ARRAY_INDEXES:
        setArrayIndexes((ArrayIndexes)null);
        return;
      case AdbPackage.ARRAY_TYPE_DEFINITION__COMPONENT_DEFINITION:
        setComponentDefinition((ComponentDefinition)null);
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
      case AdbPackage.ARRAY_TYPE_DEFINITION__ARRAY_INDEXES:
        return arrayIndexes != null;
      case AdbPackage.ARRAY_TYPE_DEFINITION__COMPONENT_DEFINITION:
        return componentDefinition != null;
    }
    return super.eIsSet(featureID);
  }

} //ArrayTypeDefinitionImpl
