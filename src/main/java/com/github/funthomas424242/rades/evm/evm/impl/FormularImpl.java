/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rades.evm.evm.impl;

import com.github.funthomas424242.rades.evm.evm.Button;
import com.github.funthomas424242.rades.evm.evm.EvmPackage;
import com.github.funthomas424242.rades.evm.evm.Formular;
import com.github.funthomas424242.rades.evm.evm.InputField;
import com.github.funthomas424242.rades.evm.evm.Label;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formular</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.impl.FormularImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.impl.FormularImpl#getButtons <em>Buttons</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.impl.FormularImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormularImpl extends DesignPatternImpl implements Formular
{
  /**
   * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabels()
   * @generated
   * @ordered
   */
  protected EList<Label> labels;

  /**
   * The cached value of the '{@link #getButtons() <em>Buttons</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getButtons()
   * @generated
   * @ordered
   */
  protected EList<Button> buttons;

  /**
   * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputs()
   * @generated
   * @ordered
   */
  protected EList<InputField> inputs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormularImpl()
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
    return EvmPackage.Literals.FORMULAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Label> getLabels()
  {
    if (labels == null)
    {
      labels = new EObjectContainmentEList<Label>(Label.class, this, EvmPackage.FORMULAR__LABELS);
    }
    return labels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Button> getButtons()
  {
    if (buttons == null)
    {
      buttons = new EObjectContainmentEList<Button>(Button.class, this, EvmPackage.FORMULAR__BUTTONS);
    }
    return buttons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InputField> getInputs()
  {
    if (inputs == null)
    {
      inputs = new EObjectContainmentEList<InputField>(InputField.class, this, EvmPackage.FORMULAR__INPUTS);
    }
    return inputs;
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
      case EvmPackage.FORMULAR__LABELS:
        return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
      case EvmPackage.FORMULAR__BUTTONS:
        return ((InternalEList<?>)getButtons()).basicRemove(otherEnd, msgs);
      case EvmPackage.FORMULAR__INPUTS:
        return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
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
      case EvmPackage.FORMULAR__LABELS:
        return getLabels();
      case EvmPackage.FORMULAR__BUTTONS:
        return getButtons();
      case EvmPackage.FORMULAR__INPUTS:
        return getInputs();
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
      case EvmPackage.FORMULAR__LABELS:
        getLabels().clear();
        getLabels().addAll((Collection<? extends Label>)newValue);
        return;
      case EvmPackage.FORMULAR__BUTTONS:
        getButtons().clear();
        getButtons().addAll((Collection<? extends Button>)newValue);
        return;
      case EvmPackage.FORMULAR__INPUTS:
        getInputs().clear();
        getInputs().addAll((Collection<? extends InputField>)newValue);
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
      case EvmPackage.FORMULAR__LABELS:
        getLabels().clear();
        return;
      case EvmPackage.FORMULAR__BUTTONS:
        getButtons().clear();
        return;
      case EvmPackage.FORMULAR__INPUTS:
        getInputs().clear();
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
      case EvmPackage.FORMULAR__LABELS:
        return labels != null && !labels.isEmpty();
      case EvmPackage.FORMULAR__BUTTONS:
        return buttons != null && !buttons.isEmpty();
      case EvmPackage.FORMULAR__INPUTS:
        return inputs != null && !inputs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FormularImpl
