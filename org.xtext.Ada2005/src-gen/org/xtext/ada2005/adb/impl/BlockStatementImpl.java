/**
 */
package org.xtext.ada2005.adb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ada2005.adb.AdbPackage;
import org.xtext.ada2005.adb.BlockStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ada2005.adb.impl.BlockStatementImpl#getBlockStatementIdentifier <em>Block Statement Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockStatementImpl extends DeclarativeBlockImpl implements BlockStatement
{
  /**
   * The default value of the '{@link #getBlockStatementIdentifier() <em>Block Statement Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlockStatementIdentifier()
   * @generated
   * @ordered
   */
  protected static final String BLOCK_STATEMENT_IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBlockStatementIdentifier() <em>Block Statement Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlockStatementIdentifier()
   * @generated
   * @ordered
   */
  protected String blockStatementIdentifier = BLOCK_STATEMENT_IDENTIFIER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BlockStatementImpl()
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
    return AdbPackage.eINSTANCE.getBlockStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBlockStatementIdentifier()
  {
    return blockStatementIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlockStatementIdentifier(String newBlockStatementIdentifier)
  {
    String oldBlockStatementIdentifier = blockStatementIdentifier;
    blockStatementIdentifier = newBlockStatementIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdbPackage.BLOCK_STATEMENT__BLOCK_STATEMENT_IDENTIFIER, oldBlockStatementIdentifier, blockStatementIdentifier));
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
      case AdbPackage.BLOCK_STATEMENT__BLOCK_STATEMENT_IDENTIFIER:
        return getBlockStatementIdentifier();
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
      case AdbPackage.BLOCK_STATEMENT__BLOCK_STATEMENT_IDENTIFIER:
        setBlockStatementIdentifier((String)newValue);
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
      case AdbPackage.BLOCK_STATEMENT__BLOCK_STATEMENT_IDENTIFIER:
        setBlockStatementIdentifier(BLOCK_STATEMENT_IDENTIFIER_EDEFAULT);
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
      case AdbPackage.BLOCK_STATEMENT__BLOCK_STATEMENT_IDENTIFIER:
        return BLOCK_STATEMENT_IDENTIFIER_EDEFAULT == null ? blockStatementIdentifier != null : !BLOCK_STATEMENT_IDENTIFIER_EDEFAULT.equals(blockStatementIdentifier);
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
    result.append(" (blockStatementIdentifier: ");
    result.append(blockStatementIdentifier);
    result.append(')');
    return result.toString();
  }

} //BlockStatementImpl
