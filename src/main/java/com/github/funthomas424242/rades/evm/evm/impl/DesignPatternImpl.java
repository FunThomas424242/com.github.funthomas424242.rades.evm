/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rades.evm.evm.impl;

import com.github.funthomas424242.rades.evm.evm.DesignPattern;
import com.github.funthomas424242.rades.evm.evm.EvmPackage;
import com.github.funthomas424242.rades.evm.evm.Layout;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.rades.evm.evm.impl.DesignPatternImpl#getLayouts <em>Layouts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DesignPatternImpl extends ModelElementImpl implements DesignPattern
{
  /**
   * The cached value of the '{@link #getLayouts() <em>Layouts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayouts()
   * @generated
   * @ordered
   */
  protected Layout layouts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DesignPatternImpl()
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
    return EvmPackage.Literals.DESIGN_PATTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Layout getLayouts()
  {
    return layouts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLayouts(Layout newLayouts, NotificationChain msgs)
  {
    Layout oldLayouts = layouts;
    layouts = newLayouts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvmPackage.DESIGN_PATTERN__LAYOUTS, oldLayouts, newLayouts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayouts(Layout newLayouts)
  {
    if (newLayouts != layouts)
    {
      NotificationChain msgs = null;
      if (layouts != null)
        msgs = ((InternalEObject)layouts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvmPackage.DESIGN_PATTERN__LAYOUTS, null, msgs);
      if (newLayouts != null)
        msgs = ((InternalEObject)newLayouts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvmPackage.DESIGN_PATTERN__LAYOUTS, null, msgs);
      msgs = basicSetLayouts(newLayouts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EvmPackage.DESIGN_PATTERN__LAYOUTS, newLayouts, newLayouts));
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
      case EvmPackage.DESIGN_PATTERN__LAYOUTS:
        return basicSetLayouts(null, msgs);
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
      case EvmPackage.DESIGN_PATTERN__LAYOUTS:
        return getLayouts();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EvmPackage.DESIGN_PATTERN__LAYOUTS:
        setLayouts((Layout)newValue);
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
      case EvmPackage.DESIGN_PATTERN__LAYOUTS:
        setLayouts((Layout)null);
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
      case EvmPackage.DESIGN_PATTERN__LAYOUTS:
        return layouts != null;
    }
    return super.eIsSet(featureID);
  }

} //DesignPatternImpl
