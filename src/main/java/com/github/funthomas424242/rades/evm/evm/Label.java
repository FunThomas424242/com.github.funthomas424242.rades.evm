/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rades.evm.evm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.Label#getButton <em>Button</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.Label#getText <em>Text</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.Label#getImg <em>Img</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends InteractionElement
{
  /**
   * Returns the value of the '<em><b>Button</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Button</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Button</em>' reference.
   * @see #setButton(Button)
   * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getLabel_Button()
   * @model
   * @generated
   */
  Button getButton();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rades.evm.evm.Label#getButton <em>Button</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Button</em>' reference.
   * @see #getButton()
   * @generated
   */
  void setButton(Button value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getLabel_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rades.evm.evm.Label#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Img</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Img</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Img</em>' attribute.
   * @see #setImg(String)
   * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getLabel_Img()
   * @model
   * @generated
   */
  String getImg();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rades.evm.evm.Label#getImg <em>Img</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Img</em>' attribute.
   * @see #getImg()
   * @generated
   */
  void setImg(String value);

} // Label
