/**
 */
package org.xtext.ada2005.adb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.LibraryUnitDeclaration;
import org.xtext.ada2005.adb.WithClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>With Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.WithClauseImpl#isLimited <em>Limited</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.WithClauseImpl#isPrivate <em>Private</em>}</li>
 *   <li>{@link org.xtext.ada2005.adb.impl.WithClauseImpl#getImportURI <em>Import URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WithClauseImpl extends ContextItemImpl implements WithClause
{
  /**
   * The default value of the '{@link #isLimited() <em>Limited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLimited()
   * @generated
   * @ordered
   */
  protected static final boolean LIMITED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLimited() <em>Limited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLimited()
   * @generated
   * @ordered
   */
  protected boolean limited = LIMITED_EDEFAULT;

  /**
   * The default value of the '{@link #isPrivate() <em>Private</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrivate()
   * @generated
   * @ordered
   */
  protected static final boolean PRIVATE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPrivate() <em>Private</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrivate()
   * @generated
   * @ordered
   */
  protected boolean private_ = PRIVATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getImportURI() <em>Import URI</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportURI()
   * @generated
   * @ordered
   */
  protected EList<LibraryUnitDeclaration> importURI;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WithClauseImpl()
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
    return AdbPackage.eINSTANCE.getWithClause();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLimited()
  {
    return limited;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLimited(boolean newLimited)
  {
    boolean oldLimited = limited;
    limited = newLimited;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.WITH_CLAUSE__LIMITED, oldLimited, limited));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPrivate()
  {
    return private_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrivate(boolean newPrivate)
  {
    boolean oldPrivate = private_;
    private_ = newPrivate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.WITH_CLAUSE__PRIVATE, oldPrivate, private_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LibraryUnitDeclaration> getImportURI()
  {
    if (importURI == null)
    {
      importURI = new EObjectResolvingEList<LibraryUnitDeclaration>(LibraryUnitDeclaration.class, this, AdbPackage.WITH_CLAUSE__IMPORT_URI);
    }
    return importURI;
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
      case AdbPackage.WITH_CLAUSE__LIMITED:
        return isLimited();
      case AdbPackage.WITH_CLAUSE__PRIVATE:
        return isPrivate();
      case AdbPackage.WITH_CLAUSE__IMPORT_URI:
        return getImportURI();
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
      case AdbPackage.WITH_CLAUSE__LIMITED:
        setLimited((Boolean)newValue);
        return;
      case AdbPackage.WITH_CLAUSE__PRIVATE:
        setPrivate((Boolean)newValue);
        return;
      case AdbPackage.WITH_CLAUSE__IMPORT_URI:
        getImportURI().clear();
        getImportURI().addAll((Collection<? extends LibraryUnitDeclaration>)newValue);
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
      case AdbPackage.WITH_CLAUSE__LIMITED:
        setLimited(LIMITED_EDEFAULT);
        return;
      case AdbPackage.WITH_CLAUSE__PRIVATE:
        setPrivate(PRIVATE_EDEFAULT);
        return;
      case AdbPackage.WITH_CLAUSE__IMPORT_URI:
        getImportURI().clear();
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
      case AdbPackage.WITH_CLAUSE__LIMITED:
        return limited != LIMITED_EDEFAULT;
      case AdbPackage.WITH_CLAUSE__PRIVATE:
        return private_ != PRIVATE_EDEFAULT;
      case AdbPackage.WITH_CLAUSE__IMPORT_URI:
        return importURI != null && !importURI.isEmpty();
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
    result.append(" (limited: ");
    result.append(limited);
    result.append(", private: ");
    result.append(private_);
    result.append(')');
    return result.toString();
  }

} //WithClauseImpl
