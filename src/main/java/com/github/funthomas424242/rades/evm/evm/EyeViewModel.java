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
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.EyeViewModel#getProjectData <em>Project Data</em>}</li>
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

  /**
   * Returns the value of the '<em><b>Project Data</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project Data</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project Data</em>' containment reference.
   * @see #setProjectData(ProjectMetaData)
   * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getEyeViewModel_ProjectData()
   * @model containment="true" required="true"
   * @generated
   */
  ProjectMetaData getProjectData();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rades.evm.evm.EyeViewModel#getProjectData <em>Project Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project Data</em>' containment reference.
   * @see #getProjectData()
   * @generated
   */
  void setProjectData(ProjectMetaData value);

} // EyeViewModel
