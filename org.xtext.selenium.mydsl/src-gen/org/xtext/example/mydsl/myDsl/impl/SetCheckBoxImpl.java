/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.SetCheckBox;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Check Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SetCheckBoxImpl#getNametag <em>Nametag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetCheckBoxImpl extends ActionImpl implements SetCheckBox
{
  /**
   * The default value of the '{@link #getNametag() <em>Nametag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNametag()
   * @generated
   * @ordered
   */
  protected static final String NAMETAG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNametag() <em>Nametag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNametag()
   * @generated
   * @ordered
   */
  protected String nametag = NAMETAG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SetCheckBoxImpl()
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
    return MyDslPackage.Literals.SET_CHECK_BOX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNametag()
  {
    return nametag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNametag(String newNametag)
  {
    String oldNametag = nametag;
    nametag = newNametag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SET_CHECK_BOX__NAMETAG, oldNametag, nametag));
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
      case MyDslPackage.SET_CHECK_BOX__NAMETAG:
        return getNametag();
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
      case MyDslPackage.SET_CHECK_BOX__NAMETAG:
        setNametag((String)newValue);
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
      case MyDslPackage.SET_CHECK_BOX__NAMETAG:
        setNametag(NAMETAG_EDEFAULT);
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
      case MyDslPackage.SET_CHECK_BOX__NAMETAG:
        return NAMETAG_EDEFAULT == null ? nametag != null : !NAMETAG_EDEFAULT.equals(nametag);
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
    result.append(" (nametag: ");
    result.append(nametag);
    result.append(')');
    return result.toString();
  }

} //SetCheckBoxImpl