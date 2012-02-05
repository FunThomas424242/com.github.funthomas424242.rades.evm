/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rades.evm.evm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.DesignPattern#getLayouts <em>Layouts</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getDesignPattern()
 * @model abstract="true"
 * @generated
 */
public interface DesignPattern extends ModelElement
{
  /**
   * Returns the value of the '<em><b>Layouts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layouts</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layouts</em>' containment reference.
   * @see #setLayouts(Layout)
   * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getDesignPattern_Layouts()
   * @model containment="true" required="true"
   * @generated
   */
  Layout getLayouts();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rades.evm.evm.DesignPattern#getLayouts <em>Layouts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layouts</em>' containment reference.
   * @see #getLayouts()
   * @generated
   */
  void setLayouts(Layout value);

} // DesignPattern
