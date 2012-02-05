/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rades.evm.evm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eye View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.EyeViewModel#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getEyeViewModel()
 * @model
 * @generated
 */
public interface EyeViewModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.rades.evm.evm.ModelElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getEyeViewModel_Elements()
   * @model containment="true" required="true"
   * @generated
   */
  EList<ModelElement> getElements();

} // EyeViewModel
