/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rades.evm.evm.impl;

import com.github.funthomas424242.rades.evm.evm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvmFactoryImpl extends EFactoryImpl implements EvmFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EvmFactory init()
  {
    try
    {
      EvmFactory theEvmFactory = (EvmFactory)EPackage.Registry.INSTANCE.getEFactory("http://funthomas424242.github.com/rades/evm"); 
      if (theEvmFactory != null)
      {
        return theEvmFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EvmFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvmFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EvmPackage.NAVIGATIONPATH: return createNavigationpath();
      case EvmPackage.EYE_VIEW_MODEL: return createEyeViewModel();
      case EvmPackage.FORMULAR: return createFormular();
      case EvmPackage.POP_UP: return createPopUp();
      case EvmPackage.REPORT: return createReport();
      case EvmPackage.VERTICAL_LAYOUT: return createVerticalLayout();
      case EvmPackage.HORIZONTAL_LAYOUT: return createHorizontalLayout();
      case EvmPackage.BUTTON: return createButton();
      case EvmPackage.LABEL: return createLabel();
      case EvmPackage.INPUT_FIELD: return createInputField();
      case EvmPackage.SERVICE: return createService();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Navigationpath createNavigationpath()
  {
    NavigationpathImpl navigationpath = new NavigationpathImpl();
    return navigationpath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EyeViewModel createEyeViewModel()
  {
    EyeViewModelImpl eyeViewModel = new EyeViewModelImpl();
    return eyeViewModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Formular createFormular()
  {
    FormularImpl formular = new FormularImpl();
    return formular;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PopUp createPopUp()
  {
    PopUpImpl popUp = new PopUpImpl();
    return popUp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Report createReport()
  {
    ReportImpl report = new ReportImpl();
    return report;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerticalLayout createVerticalLayout()
  {
    VerticalLayoutImpl verticalLayout = new VerticalLayoutImpl();
    return verticalLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HorizontalLayout createHorizontalLayout()
  {
    HorizontalLayoutImpl horizontalLayout = new HorizontalLayoutImpl();
    return horizontalLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Button createButton()
  {
    ButtonImpl button = new ButtonImpl();
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label createLabel()
  {
    LabelImpl label = new LabelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputField createInputField()
  {
    InputFieldImpl inputField = new InputFieldImpl();
    return inputField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvmPackage getEvmPackage()
  {
    return (EvmPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EvmPackage getPackage()
  {
    return EvmPackage.eINSTANCE;
  }

} //EvmFactoryImpl
