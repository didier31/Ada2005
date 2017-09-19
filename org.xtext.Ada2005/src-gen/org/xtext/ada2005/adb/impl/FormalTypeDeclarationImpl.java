/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.DiscriminantPart;
import org.xtext.ada2005.adb.FormalTypeDeclaration;
import org.xtext.ada2005.adb.FormalTypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalTypeDeclarationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalTypeDeclarationImpl#getDiscriminantPart <em>Discriminant Part</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.FormalTypeDeclarationImpl#getFormalTypeDefinition <em>Formal Type Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormalTypeDeclarationImpl extends GenericFormalParameterDeclarationImpl implements FormalTypeDeclaration
{
  /**
   * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected String identifier = IDENTIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getDiscriminantPart() <em>Discriminant Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscriminantPart()
   * @generated
   * @ordered
   */
  protected DiscriminantPart discriminantPart;

  /**
   * The cached value of the '{@link #getFormalTypeDefinition() <em>Formal Type Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormalTypeDefinition()
   * @generated
   * @ordered
   */
  protected FormalTypeDefinition formalTypeDefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormalTypeDeclarationImpl()
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
    return AdbPackage.eINSTANCE.getFormalTypeDeclaration();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(String newIdentifier)
  {
    String oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_TYPE_DECLARATION__IDENTIFIER, oldIdentifier, identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiscriminantPart getDiscriminantPart()
  {
    return discriminantPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDiscriminantPart(DiscriminantPart newDiscriminantPart, NotificationChain msgs)
  {
    DiscriminantPart oldDiscriminantPart = discriminantPart;
    discriminantPart = newDiscriminantPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_TYPE_DECLARATION__DISCRIMINANT_PART, oldDiscriminantPart, newDiscriminantPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiscriminantPart(DiscriminantPart newDiscriminantPart)
  {
    if (newDiscriminantPart != discriminantPart)
    {
      NotificationChain msgs = null;
      if (discriminantPart != null)
        msgs = ((InternalEObject)discriminantPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_TYPE_DECLARATION__DISCRIMINANT_PART, null, msgs);
      if (newDiscriminantPart != null)
        msgs = ((InternalEObject)newDiscriminantPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_TYPE_DECLARATION__DISCRIMINANT_PART, null, msgs);
      msgs = basicSetDiscriminantPart(newDiscriminantPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_TYPE_DECLARATION__DISCRIMINANT_PART, newDiscriminantPart, newDiscriminantPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalTypeDefinition getFormalTypeDefinition()
  {
    return formalTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormalTypeDefinition(FormalTypeDefinition newFormalTypeDefinition, NotificationChain msgs)
  {
    FormalTypeDefinition oldFormalTypeDefinition = formalTypeDefinition;
    formalTypeDefinition = newFormalTypeDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_TYPE_DECLARATION__FORMAL_TYPE_DEFINITION, oldFormalTypeDefinition, newFormalTypeDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormalTypeDefinition(FormalTypeDefinition newFormalTypeDefinition)
  {
    if (newFormalTypeDefinition != formalTypeDefinition)
    {
      NotificationChain msgs = null;
      if (formalTypeDefinition != null)
        msgs = ((InternalEObject)formalTypeDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_TYPE_DECLARATION__FORMAL_TYPE_DEFINITION, null, msgs);
      if (newFormalTypeDefinition != null)
        msgs = ((InternalEObject)newFormalTypeDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdbPackage.FORMAL_TYPE_DECLARATION__FORMAL_TYPE_DEFINITION, null, msgs);
      msgs = basicSetFormalTypeDefinition(newFormalTypeDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.FORMAL_TYPE_DECLARATION__FORMAL_TYPE_DEFINITION, newFormalTypeDefinition, newFormalTypeDefinition));
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
      case AdbPackage.FORMAL_TYPE_DECLARATION__DISCRIMINANT_PART:
        return basicSetDiscriminantPart(null, msgs);
      case AdbPackage.FORMAL_TYPE_DECLARATION__FORMAL_TYPE_DEFINITION:
        return basicSetFormalTypeDefinition(null, msgs);
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
      case AdbPackage.FORMAL_TYPE_DECLARATION__IDENTIFIER:
        return getIdentifier();
      case AdbPackage.FORMAL_TYPE_DECLARATION__DISCRIMINANT_PART:
        return getDiscriminantPart();
      case AdbPackage.FORMAL_TYPE_DECLARATION__FORMAL_TYPE_DEFINITION:
        return getFormalTypeDefinition();
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
      case AdbPackage.FORMAL_TYPE_DECLARATION__IDENTIFIER:
        setIdentifier((String)newValue);
        return;
      case AdbPackage.FORMAL_TYPE_DECLARATION__DISCRIMINANT_PART:
        setDiscriminantPart((DiscriminantPart)newValue);
        return;
      case AdbPackage.FORMAL_TYPE_DECLARATION__FORMAL_TYPE_DEFINITION:
        setFormalTypeDefinition((FormalTypeDefinition)newValue);
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
      case AdbPackage.FORMAL_TYPE_DECLARATION__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case AdbPackage.FORMAL_TYPE_DECLARATION__DISCRIMINANT_PART:
        setDiscriminantPart((DiscriminantPart)null);
        return;
      case AdbPackage.FORMAL_TYPE_DECLARATION__FORMAL_TYPE_DEFINITION:
        setFormalTypeDefinition((FormalTypeDefinition)null);
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
      case AdbPackage.FORMAL_TYPE_DECLARATION__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case AdbPackage.FORMAL_TYPE_DECLARATION__DISCRIMINANT_PART:
        return discriminantPart != null;
      case AdbPackage.FORMAL_TYPE_DECLARATION__FORMAL_TYPE_DEFINITION:
        return formalTypeDefinition != null;
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
    result.append(" (identifier: ");
    result.append(identifier);
    result.append(')');
    return result.toString();
  }

} //FormalTypeDeclarationImpl
