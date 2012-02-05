/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rades.evm.evm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.InputField#getValidationService <em>Validation Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getInputField()
 * @model
 * @generated
 */
public interface InputField extends InteractionElement
{
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
   * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getInputField_ValidationService()
   * @model containment="true"
   * @generated
   */
  Service getValidationService();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rades.evm.evm.InputField#getValidationService <em>Validation Service</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Validation Service</em>' containment reference.
   * @see #getValidationService()
   * @generated
   */
  void setValidationService(Service value);

} // InputField
