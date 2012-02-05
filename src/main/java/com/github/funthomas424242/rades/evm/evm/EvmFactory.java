/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rades.evm.evm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.github.funthomas424242.rades.evm.evm.EvmPackage
 * @generated
 */
public interface EvmFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EvmFactory eINSTANCE = com.github.funthomas424242.rades.evm.evm.impl.EvmFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Navigationpath</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Navigationpath</em>'.
   * @generated
   */
  Navigationpath createNavigationpath();

  /**
   * Returns a new object of class '<em>Eye View Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Eye View Model</em>'.
   * @generated
   */
  EyeViewModel createEyeViewModel();

  /**
   * Returns a new object of class '<em>Formular</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formular</em>'.
   * @generated
   */
  Formular createFormular();

  /**
   * Returns a new object of class '<em>Pop Up</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pop Up</em>'.
   * @generated
   */
  PopUp createPopUp();

  /**
   * Returns a new object of class '<em>Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Report</em>'.
   * @generated
   */
  Report createReport();

  /**
   * Returns a new object of class '<em>Vertical Layout</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vertical Layout</em>'.
   * @generated
   */
  VerticalLayout createVerticalLayout();

  /**
   * Returns a new object of class '<em>Horizontal Layout</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Horizontal Layout</em>'.
   * @generated
   */
  HorizontalLayout createHorizontalLayout();

  /**
   * Returns a new object of class '<em>Button</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Button</em>'.
   * @generated
   */
  Button createButton();

  /**
   * Returns a new object of class '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label</em>'.
   * @generated
   */
  Label createLabel();

  /**
   * Returns a new object of class '<em>Input Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Field</em>'.
   * @generated
   */
  InputField createInputField();

  /**
   * Returns a new object of class '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service</em>'.
   * @generated
   */
  Service createService();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EvmPackage getEvmPackage();

} //EvmFactory
