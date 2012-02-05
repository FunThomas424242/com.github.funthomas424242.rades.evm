/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rades.evm.evm.impl;

import com.github.funthomas424242.rades.evm.evm.Button;
import com.github.funthomas424242.rades.evm.evm.EvmPackage;
import com.github.funthomas424242.rades.evm.evm.Label;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.impl.LabelImpl#getButton <em>Button</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.impl.LabelImpl#getText <em>Text</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.impl.LabelImpl#getImg <em>Img</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LabelImpl extends InteractionElementImpl implements Label
{
  /**
   * The cached value of the '{@link #getButton() <em>Button</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getButton()
   * @generated
   * @ordered
   */
  protected Button button;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LabelImpl()
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
    return EvmPackage.Literals.LABEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Button getButton()
  {
    if (button != null && button.eIsProxy())
    {
      InternalEObject oldButton = (InternalEObject)button;
      button = (Button)eResolveProxy(oldButton);
      if (button != oldButton)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvmPackage.LABEL__BUTTON, oldButton, button));
      }
    }
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Button basicGetButton()
  {
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setButton(Button newButton)
  {
    Button oldButton = button;
    button = newButton;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvmPackage.LABEL__BUTTON, oldButton, button));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EvmPackage.LABEL__TEXT, oldText, text));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EvmPackage.LABEL__IMG, oldImg, img));
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
      case EvmPackage.LABEL__BUTTON:
        if (resolve) return getButton();
        return basicGetButton();
      case EvmPackage.LABEL__TEXT:
        return getText();
      case EvmPackage.LABEL__IMG:
        return getImg();
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
      case EvmPackage.LABEL__BUTTON:
        setButton((Button)newValue);
        return;
      case EvmPackage.LABEL__TEXT:
        setText((String)newValue);
        return;
      case EvmPackage.LABEL__IMG:
        setImg((String)newValue);
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
      case EvmPackage.LABEL__BUTTON:
        setButton((Button)null);
        return;
      case EvmPackage.LABEL__TEXT:
        setText(TEXT_EDEFAULT);
        return;
      case EvmPackage.LABEL__IMG:
        setImg(IMG_EDEFAULT);
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
      case EvmPackage.LABEL__BUTTON:
        return button != null;
      case EvmPackage.LABEL__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
      case EvmPackage.LABEL__IMG:
        return IMG_EDEFAULT == null ? img != null : !IMG_EDEFAULT.equals(img);
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

} //LabelImpl
