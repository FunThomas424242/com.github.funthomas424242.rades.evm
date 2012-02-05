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
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.Layout#getContent <em>Content</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.Layout#getSublayout <em>Sublayout</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getLayout()
 * @model abstract="true"
 * @generated
 */
public interface Layout extends EObject
{
  /**
   * Returns the value of the '<em><b>Content</b></em>' reference list.
   * The list contents are of type {@link com.github.funthomas424242.rades.evm.evm.InteractionElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' reference list.
   * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getLayout_Content()
   * @model
   * @generated
   */
  EList<InteractionElement> getContent();

  /**
   * Returns the value of the '<em><b>Sublayout</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.rades.evm.evm.Layout}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sublayout</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sublayout</em>' containment reference list.
   * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getLayout_Sublayout()
   * @model containment="true"
   * @generated
   */
  EList<Layout> getSublayout();

} // Layout
