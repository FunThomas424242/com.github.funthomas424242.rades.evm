/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rades.evm.evm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.Service#getClassName <em>Class Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.Service#getMethodName <em>Method Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject
{
  /**
   * Returns the value of the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Name</em>' attribute.
   * @see #setClassName(String)
   * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getService_ClassName()
   * @model required="true"
   * @generated
   */
  String getClassName();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rades.evm.evm.Service#getClassName <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Name</em>' attribute.
   * @see #getClassName()
   * @generated
   */
  void setClassName(String value);

  /**
   * Returns the value of the '<em><b>Method Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method Name</em>' attribute.
   * @see #setMethodName(String)
   * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getService_MethodName()
   * @model required="true"
   * @generated
   */
  String getMethodName();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rades.evm.evm.Service#getMethodName <em>Method Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method Name</em>' attribute.
   * @see #getMethodName()
   * @generated
   */
  void setMethodName(String value);

} // Service
