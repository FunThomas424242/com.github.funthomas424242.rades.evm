/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rades.evm.evm.impl;

import com.github.funthomas424242.rades.evm.evm.Button;
import com.github.funthomas424242.rades.evm.evm.EvmPackage;
import com.github.funthomas424242.rades.evm.evm.Service;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.impl.ButtonImpl#getText <em>Text</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.impl.ButtonImpl#getImg <em>Img</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.impl.ButtonImpl#getValidationService <em>Validation Service</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.impl.ButtonImpl#getActionService <em>Action Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ButtonImpl extends InteractionElementImpl implements Button
{
  /**
   * The default value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected static final String TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected String text = TEXT_EDEFAULT;

  /**
   * The default value of the '{@link #getImg() <em>Img</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImg()
   * @generated
   * @ordered
   */
  protected static final String IMG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImg() <em>Img</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImg()
   * @generated
   * @ordered
   */
  protected String img = IMG_EDEFAULT;

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
   * The cached value of the '{@link #getActionService() <em>Action Service</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionService()
   * @generated
   * @ordered
   */
  protected Service actionService;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ButtonImpl()
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
    return EvmPackage.Literals.BUTTON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(String newText)
  {
    String oldText = text;
    text = newText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvmPackage.BUTTON__TEXT, oldText, text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImg()
  {
    return img;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImg(String newImg)
  {
    String oldImg = img;
    img = newImg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvmPackage.BUTTON__IMG, oldImg, img));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvmPackage.BUTTON__VALIDATION_SERVICE, oldValidationService, newValidationService);
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
        msgs = ((InternalEObject)validationService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvmPackage.BUTTON__VALIDATION_SERVICE, null, msgs);
      if (newValidationService != null)
        msgs = ((InternalEObject)newValidationService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvmPackage.BUTTON__VALIDATION_SERVICE, null, msgs);
      msgs = basicSetValidationService(newValidationService, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvmPackage.BUTTON__VALIDATION_SERVICE, newValidationService, newValidationService));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service getActionService()
  {
    return actionService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActionService(Service newActionService, NotificationChain msgs)
  {
    Service oldActionService = actionService;
    actionService = newActionService;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvmPackage.BUTTON__ACTION_SERVICE, oldActionService, newActionService);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActionService(Service newActionService)
  {
    if (newActionService != actionService)
    {
      NotificationChain msgs = null;
      if (actionService != null)
        msgs = ((InternalEObject)actionService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvmPackage.BUTTON__ACTION_SERVICE, null, msgs);
      if (newActionService != null)
        msgs = ((InternalEObject)newActionService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvmPackage.BUTTON__ACTION_SERVICE, null, msgs);
      msgs = basicSetActionService(newActionService, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvmPackage.BUTTON__ACTION_SERVICE, newActionService, newActionService));
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
      case EvmPackage.BUTTON__VALIDATION_SERVICE:
        return basicSetValidationService(null, msgs);
      case EvmPackage.BUTTON__ACTION_SERVICE:
        return basicSetActionService(null, msgs);
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
      case EvmPackage.BUTTON__TEXT:
        return getText();
      case EvmPackage.BUTTON__IMG:
        return getImg();
      case EvmPackage.BUTTON__VALIDATION_SERVICE:
        return getValidationService();
      case EvmPackage.BUTTON__ACTION_SERVICE:
        return getActionService();
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
      case EvmPackage.BUTTON__TEXT:
        setText((String)newValue);
        return;
      case EvmPackage.BUTTON__IMG:
        setImg((String)newValue);
        return;
      case EvmPackage.BUTTON__VALIDATION_SERVICE:
        setValidationService((Service)newValue);
        return;
      case EvmPackage.BUTTON__ACTION_SERVICE:
        setActionService((Service)newValue);
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
      case EvmPackage.BUTTON__TEXT:
        setText(TEXT_EDEFAULT);
        return;
      case EvmPackage.BUTTON__IMG:
        setImg(IMG_EDEFAULT);
        return;
      case EvmPackage.BUTTON__VALIDATION_SERVICE:
        setValidationService((Service)null);
        return;
      case EvmPackage.BUTTON__ACTION_SERVICE:
        setActionService((Service)null);
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
      case EvmPackage.BUTTON__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
      case EvmPackage.BUTTON__IMG:
        return IMG_EDEFAULT == null ? img != null : !IMG_EDEFAULT.equals(img);
      case EvmPackage.BUTTON__VALIDATION_SERVICE:
        return validationService != null;
      case EvmPackage.BUTTON__ACTION_SERVICE:
        return actionService != null;
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
    result.append(" (text: ");
    result.append(text);
    result.append(", img: ");
    result.append(img);
    result.append(')');
    return result.toString();
  }

} //ButtonImpl
