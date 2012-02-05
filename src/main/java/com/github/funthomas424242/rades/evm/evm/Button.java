/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rades.evm.evm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.Button#getText <em>Text</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.Button#getImg <em>Img</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.Button#getValidationService <em>Validation Service</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.Button#getActionService <em>Action Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends InteractionElement
{
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
   * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getButton_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rades.evm.evm.Button#getText <em>Text</em>}' attribute.
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
   * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getButton_Img()
   * @model
   * @generated
   */
  String getImg();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rades.evm.evm.Button#getImg <em>Img</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Img</em>' attribute.
   * @see #getImg()
   * @generated
   */
  void setImg(String value);

  /**
   * Returns the value of the '<em><b>Validation Service</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Validation Service</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validation Service</em>' containment reference.
   * @see #setValidationService(Service)
   * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getButton_ValidationService()
   * @model containment="true"
   * @generated
   */
  Service getValidationService();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rades.evm.evm.Button#getValidationService <em>Validation Service</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Validation Service</em>' containment reference.
   * @see #getValidationService()
   * @generated
   */
  void setValidationService(Service value);

  /**
   * Returns the value of the '<em><b>Action Service</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Service</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Service</em>' containment reference.
   * @see #setActionService(Service)
   * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getButton_ActionService()
   * @model containment="true" required="true"
   * @generated
   */
  Service getActionService();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rades.evm.evm.Button#getActionService <em>Action Service</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action Service</em>' containment reference.
   * @see #getActionService()
   * @generated
   */
  void setActionService(Service value);

} // Button
