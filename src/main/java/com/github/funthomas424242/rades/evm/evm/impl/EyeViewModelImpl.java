/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rades.evm.evm.impl;

import com.github.funthomas424242.rades.evm.evm.EvmPackage;
import com.github.funthomas424242.rades.evm.evm.EyeViewModel;
import com.github.funthomas424242.rades.evm.evm.ModelElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eye View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.impl.EyeViewModelImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.impl.EyeViewModelImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.impl.EyeViewModelImpl#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.impl.EyeViewModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.impl.EyeViewModelImpl#getProjectName <em>Project Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EyeViewModelImpl extends EObjectImpl implements EyeViewModel
{
  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<ModelElement> elements;

  /**
   * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupId()
   * @generated
   * @ordered
   */
  protected static final String GROUP_ID_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupId()
   * @generated
   * @ordered
   */
  protected String groupId = GROUP_ID_EDEFAULT;
  /**
   * The default value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifactId()
   * @generated
   * @ordered
   */
  protected static final String ARTIFACT_ID_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifactId()
   * @generated
   * @ordered
   */
  protected String artifactId = ARTIFACT_ID_EDEFAULT;
  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;
  /**
   * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectName()
   * @generated
   * @ordered
   */
  protected static final String PROJECT_NAME_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectName()
   * @generated
   * @ordered
   */
  protected String projectName = PROJECT_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EyeViewModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EvmPackage.Literals.EYE_VIEW_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModelElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<ModelElement>(ModelElement.class, this, EvmPackage.EYE_VIEW_MODEL__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGroupId()
  {
    return groupId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroupId(String newGroupId)
  {
    String oldGroupId = groupId;
    groupId = newGroupId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvmPackage.EYE_VIEW_MODEL__GROUP_ID, oldGroupId, groupId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getArtifactId()
  {
    return artifactId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArtifactId(String newArtifactId)
  {
    String oldArtifactId = artifactId;
    artifactId = newArtifactId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvmPackage.EYE_VIEW_MODEL__ARTIFACT_ID, oldArtifactId, artifactId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvmPackage.EYE_VIEW_MODEL__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProjectName()
  {
    return projectName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProjectName(String newProjectName)
  {
    String oldProjectName = projectName;
    projectName = newProjectName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvmPackage.EYE_VIEW_MODEL__PROJECT_NAME, oldProjectName, projectName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EvmPackage.EYE_VIEW_MODEL__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EvmPackage.EYE_VIEW_MODEL__ELEMENTS:
        return getElements();
      case EvmPackage.EYE_VIEW_MODEL__GROUP_ID:
        return getGroupId();
      case EvmPackage.EYE_VIEW_MODEL__ARTIFACT_ID:
        return getArtifactId();
      case EvmPackage.EYE_VIEW_MODEL__VERSION:
        return getVersion();
      case EvmPackage.EYE_VIEW_MODEL__PROJECT_NAME:
        return getProjectName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EvmPackage.EYE_VIEW_MODEL__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends ModelElement>)newValue);
        return;
      case EvmPackage.EYE_VIEW_MODEL__GROUP_ID:
        setGroupId((String)newValue);
        return;
      case EvmPackage.EYE_VIEW_MODEL__ARTIFACT_ID:
        setArtifactId((String)newValue);
        return;
      case EvmPackage.EYE_VIEW_MODEL__VERSION:
        setVersion((String)newValue);
        return;
      case EvmPackage.EYE_VIEW_MODEL__PROJECT_NAME:
        setProjectName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EvmPackage.EYE_VIEW_MODEL__ELEMENTS:
        getElements().clear();
        return;
      case EvmPackage.EYE_VIEW_MODEL__GROUP_ID:
        setGroupId(GROUP_ID_EDEFAULT);
        return;
      case EvmPackage.EYE_VIEW_MODEL__ARTIFACT_ID:
        setArtifactId(ARTIFACT_ID_EDEFAULT);
        return;
      case EvmPackage.EYE_VIEW_MODEL__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case EvmPackage.EYE_VIEW_MODEL__PROJECT_NAME:
        setProjectName(PROJECT_NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EvmPackage.EYE_VIEW_MODEL__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case EvmPackage.EYE_VIEW_MODEL__GROUP_ID:
        return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
      case EvmPackage.EYE_VIEW_MODEL__ARTIFACT_ID:
        return ARTIFACT_ID_EDEFAULT == null ? artifactId != null : !ARTIFACT_ID_EDEFAULT.equals(artifactId);
      case EvmPackage.EYE_VIEW_MODEL__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case EvmPackage.EYE_VIEW_MODEL__PROJECT_NAME:
        return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (groupId: ");
    result.append(groupId);
    result.append(", artifactId: ");
    result.append(artifactId);
    result.append(", version: ");
    result.append(version);
    result.append(", projectName: ");
    result.append(projectName);
    result.append(')');
    return result.toString();
  }

} //EyeViewModelImpl
