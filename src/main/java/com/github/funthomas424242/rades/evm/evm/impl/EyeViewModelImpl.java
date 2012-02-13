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

import com.github.funthomas424242.rades.evm.evm.ProjectMetaData;
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
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.impl.EyeViewModelImpl#getProjectData <em>Project Data</em>}</li>
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
   * The cached value of the '{@link #getProjectData() <em>Project Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectData()
   * @generated
   * @ordered
   */
  protected ProjectMetaData projectData;

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
  public ProjectMetaData getProjectData()
  {
    return projectData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProjectData(ProjectMetaData newProjectData, NotificationChain msgs)
  {
    ProjectMetaData oldProjectData = projectData;
    projectData = newProjectData;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvmPackage.EYE_VIEW_MODEL__PROJECT_DATA, oldProjectData, newProjectData);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProjectData(ProjectMetaData newProjectData)
  {
    if (newProjectData != projectData)
    {
      NotificationChain msgs = null;
      if (projectData != null)
        msgs = ((InternalEObject)projectData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvmPackage.EYE_VIEW_MODEL__PROJECT_DATA, null, msgs);
      if (newProjectData != null)
        msgs = ((InternalEObject)newProjectData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvmPackage.EYE_VIEW_MODEL__PROJECT_DATA, null, msgs);
      msgs = basicSetProjectData(newProjectData, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvmPackage.EYE_VIEW_MODEL__PROJECT_DATA, newProjectData, newProjectData));
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
      case EvmPackage.EYE_VIEW_MODEL__PROJECT_DATA:
        return basicSetProjectData(null, msgs);
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
      case EvmPackage.EYE_VIEW_MODEL__PROJECT_DATA:
        return getProjectData();
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
      case EvmPackage.EYE_VIEW_MODEL__PROJECT_DATA:
        setProjectData((ProjectMetaData)newValue);
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
      case EvmPackage.EYE_VIEW_MODEL__PROJECT_DATA:
        setProjectData((ProjectMetaData)null);
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
      case EvmPackage.EYE_VIEW_MODEL__PROJECT_DATA:
        return projectData != null;
    }
    return super.eIsSet(featureID);
  }

} //EyeViewModelImpl
