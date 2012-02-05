/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rades.evm.evm.impl;

import com.github.funthomas424242.rades.evm.evm.EvmPackage;
import com.github.funthomas424242.rades.evm.evm.InputField;
import com.github.funthomas424242.rades.evm.evm.Service;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.impl.InputFieldImpl#getValidationService <em>Validation Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputFieldImpl extends InteractionElementImpl implements InputField
{
  /**
   * The cached value of the '{@link #getValidationService() <em>Validation Service</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValidationService()
   * @generated
   * @ordered
   */
  protected Service validationService;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InputFieldImpl()
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
    return EvmPackage.Literals.INPUT_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service getValidationService()
  {
    return validationService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValidationService(Service newValidationService, NotificationChain msgs)
  {
    Service oldValidationService = validationService;
    validationService = newValidationService;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvmPackage.INPUT_FIELD__VALIDATION_SERVICE, oldValidationService, newValidationService);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValidationService(Service newValidationService)
  {
    if (newValidationService != validationService)
    {
      NotificationChain msgs = null;
      if (validationService != null)
        msgs = ((InternalEObject)validationService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvmPackage.INPUT_FIELD__VALIDATION_SERVICE, null, msgs);
      if (newValidationService != null)
        msgs = ((InternalEObject)newValidationService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvmPackage.INPUT_FIELD__VALIDATION_SERVICE, null, msgs);
      msgs = basicSetValidationService(newValidationService, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvmPackage.INPUT_FIELD__VALIDATION_SERVICE, newValidationService, newValidationService));
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
      case EvmPackage.INPUT_FIELD__VALIDATION_SERVICE:
        return basicSetValidationService(null, msgs);
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
      case EvmPackage.INPUT_FIELD__VALIDATION_SERVICE:
        return getValidationService();
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
      case EvmPackage.INPUT_FIELD__VALIDATION_SERVICE:
        setValidationService((Service)newValue);
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
      case EvmPackage.INPUT_FIELD__VALIDATION_SERVICE:
        setValidationService((Service)null);
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
      case EvmPackage.INPUT_FIELD__VALIDATION_SERVICE:
        return validationService != null;
    }
    return super.eIsSet(featureID);
  }

} //InputFieldImpl
