/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rades.evm.evm.impl;

import com.github.funthomas424242.rades.evm.evm.EvmPackage;
import com.github.funthomas424242.rades.evm.evm.InteractionElement;
import com.github.funthomas424242.rades.evm.evm.Layout;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.impl.LayoutImpl#getContent <em>Content</em>}</li>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.impl.LayoutImpl#getSublayout <em>Sublayout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LayoutImpl extends EObjectImpl implements Layout
{
  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected EList<InteractionElement> content;

  /**
   * The cached value of the '{@link #getSublayout() <em>Sublayout</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSublayout()
   * @generated
   * @ordered
   */
  protected EList<Layout> sublayout;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LayoutImpl()
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
    return EvmPackage.Literals.LAYOUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InteractionElement> getContent()
  {
    if (content == null)
    {
      content = new EObjectResolvingEList<InteractionElement>(InteractionElement.class, this, EvmPackage.LAYOUT__CONTENT);
    }
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Layout> getSublayout()
  {
    if (sublayout == null)
    {
      sublayout = new EObjectContainmentEList<Layout>(Layout.class, this, EvmPackage.LAYOUT__SUBLAYOUT);
    }
    return sublayout;
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
      case EvmPackage.LAYOUT__SUBLAYOUT:
        return ((InternalEList<?>)getSublayout()).basicRemove(otherEnd, msgs);
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
      case EvmPackage.LAYOUT__CONTENT:
        return getContent();
      case EvmPackage.LAYOUT__SUBLAYOUT:
        return getSublayout();
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
      case EvmPackage.LAYOUT__CONTENT:
        getContent().clear();
        getContent().addAll((Collection<? extends InteractionElement>)newValue);
        return;
      case EvmPackage.LAYOUT__SUBLAYOUT:
        getSublayout().clear();
        getSublayout().addAll((Collection<? extends Layout>)newValue);
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
      case EvmPackage.LAYOUT__CONTENT:
        getContent().clear();
        return;
      case EvmPackage.LAYOUT__SUBLAYOUT:
        getSublayout().clear();
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
      case EvmPackage.LAYOUT__CONTENT:
        return content != null && !content.isEmpty();
      case EvmPackage.LAYOUT__SUBLAYOUT:
        return sublayout != null && !sublayout.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LayoutImpl
