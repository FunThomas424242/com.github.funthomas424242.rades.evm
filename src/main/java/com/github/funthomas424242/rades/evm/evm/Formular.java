/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rades.evm.evm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formular</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.Formular#getLabels <em>Labels</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.Formular#getButtons <em>Buttons</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.Formular#getInputs <em>Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getFormular()
 * @model
 * @generated
 */
public interface Formular extends DesignPattern
{
  /**
   * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.rades.evm.evm.Label}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Labels</em>' containment reference list.
   * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getFormular_Labels()
   * @model containment="true"
   * @generated
   */
  EList<Label> getLabels();

  /**
   * Returns the value of the '<em><b>Buttons</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.rades.evm.evm.Button}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Buttons</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Buttons</em>' containment reference list.
   * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getFormular_Buttons()
   * @model containment="true"
   * @generated
   */
  EList<Button> getButtons();

  /**
   * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.rades.evm.evm.InputField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' containment reference list.
   * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getFormular_Inputs()
   * @model containment="true"
   * @generated
   */
  EList<InputField> getInputs();

} // Formular
