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
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.EyeViewModel#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.EyeViewModel#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.EyeViewModel#getVersion <em>Version</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.EyeViewModel#getProjectName <em>Project Name</em>}</li>
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
   * Returns the value of the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group Id</em>' attribute.
   * @see #setGroupId(String)
   * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getEyeViewModel_GroupId()
   * @model required="true"
   * @generated
   */
  String getGroupId();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rades.evm.evm.EyeViewModel#getGroupId <em>Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group Id</em>' attribute.
   * @see #getGroupId()
   * @generated
   */
  void setGroupId(String value);

  /**
   * Returns the value of the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artifact Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artifact Id</em>' attribute.
   * @see #setArtifactId(String)
   * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getEyeViewModel_ArtifactId()
   * @model required="true"
   * @generated
   */
  String getArtifactId();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rades.evm.evm.EyeViewModel#getArtifactId <em>Artifact Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Artifact Id</em>' attribute.
   * @see #getArtifactId()
   * @generated
   */
  void setArtifactId(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getEyeViewModel_Version()
   * @model required="true"
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rades.evm.evm.EyeViewModel#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project Name</em>' attribute.
   * @see #setProjectName(String)
   * @see com.github.funthomas424242.rades.evm.evm.EvmPackage#getEyeViewModel_ProjectName()
   * @model required="true"
   * @generated
   */
  String getProjectName();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.rades.evm.evm.EyeViewModel#getProjectName <em>Project Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project Name</em>' attribute.
   * @see #getProjectName()
   * @generated
   */
  void setProjectName(String value);

} // EyeViewModel
