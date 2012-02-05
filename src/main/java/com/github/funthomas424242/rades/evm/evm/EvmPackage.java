/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rades.evm.evm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.github.funthomas424242.rades.evm.evm.EvmFactory
 * @model kind="package"
 * @generated
 */
public interface EvmPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "evm";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://funthomas424242.github.com/rades/evm";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "evm";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EvmPackage eINSTANCE = com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl.init();

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rades.evm.evm.impl.ModelElementImpl <em>Model Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rades.evm.evm.impl.ModelElementImpl
   * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getModelElement()
   * @generated
   */
  int MODEL_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Model Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rades.evm.evm.impl.NavigationpathImpl <em>Navigationpath</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rades.evm.evm.impl.NavigationpathImpl
   * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getNavigationpath()
   * @generated
   */
  int NAVIGATIONPATH = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATIONPATH__NAME = MODEL_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Navigationpath</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATIONPATH_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rades.evm.evm.impl.DesignPatternImpl <em>Design Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rades.evm.evm.impl.DesignPatternImpl
   * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getDesignPattern()
   * @generated
   */
  int DESIGN_PATTERN = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGN_PATTERN__NAME = MODEL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Layouts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGN_PATTERN__LAYOUTS = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Design Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGN_PATTERN_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rades.evm.evm.impl.EyeViewModelImpl <em>Eye View Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rades.evm.evm.impl.EyeViewModelImpl
   * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getEyeViewModel()
   * @generated
   */
  int EYE_VIEW_MODEL = 3;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EYE_VIEW_MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Eye View Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EYE_VIEW_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rades.evm.evm.impl.FormularImpl <em>Formular</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rades.evm.evm.impl.FormularImpl
   * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getFormular()
   * @generated
   */
  int FORMULAR = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULAR__NAME = DESIGN_PATTERN__NAME;

  /**
   * The feature id for the '<em><b>Layouts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULAR__LAYOUTS = DESIGN_PATTERN__LAYOUTS;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULAR__LABELS = DESIGN_PATTERN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Buttons</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULAR__BUTTONS = DESIGN_PATTERN_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULAR__INPUTS = DESIGN_PATTERN_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Formular</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULAR_FEATURE_COUNT = DESIGN_PATTERN_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rades.evm.evm.impl.PopUpImpl <em>Pop Up</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rades.evm.evm.impl.PopUpImpl
   * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getPopUp()
   * @generated
   */
  int POP_UP = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP_UP__NAME = DESIGN_PATTERN__NAME;

  /**
   * The feature id for the '<em><b>Layouts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP_UP__LAYOUTS = DESIGN_PATTERN__LAYOUTS;

  /**
   * The number of structural features of the '<em>Pop Up</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP_UP_FEATURE_COUNT = DESIGN_PATTERN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rades.evm.evm.impl.ReportImpl <em>Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rades.evm.evm.impl.ReportImpl
   * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getReport()
   * @generated
   */
  int REPORT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__NAME = DESIGN_PATTERN__NAME;

  /**
   * The feature id for the '<em><b>Layouts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__LAYOUTS = DESIGN_PATTERN__LAYOUTS;

  /**
   * The number of structural features of the '<em>Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT_FEATURE_COUNT = DESIGN_PATTERN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rades.evm.evm.impl.LayoutImpl <em>Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rades.evm.evm.impl.LayoutImpl
   * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getLayout()
   * @generated
   */
  int LAYOUT = 7;

  /**
   * The feature id for the '<em><b>Content</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT__CONTENT = 0;

  /**
   * The feature id for the '<em><b>Sublayout</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT__SUBLAYOUT = 1;

  /**
   * The number of structural features of the '<em>Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rades.evm.evm.impl.VerticalLayoutImpl <em>Vertical Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rades.evm.evm.impl.VerticalLayoutImpl
   * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getVerticalLayout()
   * @generated
   */
  int VERTICAL_LAYOUT = 8;

  /**
   * The feature id for the '<em><b>Content</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTICAL_LAYOUT__CONTENT = LAYOUT__CONTENT;

  /**
   * The feature id for the '<em><b>Sublayout</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTICAL_LAYOUT__SUBLAYOUT = LAYOUT__SUBLAYOUT;

  /**
   * The number of structural features of the '<em>Vertical Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTICAL_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rades.evm.evm.impl.HorizontalLayoutImpl <em>Horizontal Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rades.evm.evm.impl.HorizontalLayoutImpl
   * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getHorizontalLayout()
   * @generated
   */
  int HORIZONTAL_LAYOUT = 9;

  /**
   * The feature id for the '<em><b>Content</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORIZONTAL_LAYOUT__CONTENT = LAYOUT__CONTENT;

  /**
   * The feature id for the '<em><b>Sublayout</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORIZONTAL_LAYOUT__SUBLAYOUT = LAYOUT__SUBLAYOUT;

  /**
   * The number of structural features of the '<em>Horizontal Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORIZONTAL_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rades.evm.evm.impl.InteractionElementImpl <em>Interaction Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rades.evm.evm.impl.InteractionElementImpl
   * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getInteractionElement()
   * @generated
   */
  int INTERACTION_ELEMENT = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Interaction Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rades.evm.evm.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rades.evm.evm.impl.ButtonImpl
   * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getButton()
   * @generated
   */
  int BUTTON = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__NAME = INTERACTION_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__TEXT = INTERACTION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Img</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__IMG = INTERACTION_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Validation Service</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__VALIDATION_SERVICE = INTERACTION_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Action Service</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__ACTION_SERVICE = INTERACTION_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = INTERACTION_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rades.evm.evm.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rades.evm.evm.impl.LabelImpl
   * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__NAME = INTERACTION_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Button</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__BUTTON = INTERACTION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__TEXT = INTERACTION_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Img</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__IMG = INTERACTION_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = INTERACTION_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rades.evm.evm.impl.InputFieldImpl <em>Input Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rades.evm.evm.impl.InputFieldImpl
   * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getInputField()
   * @generated
   */
  int INPUT_FIELD = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FIELD__NAME = INTERACTION_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Validation Service</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FIELD__VALIDATION_SERVICE = INTERACTION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Input Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FIELD_FEATURE_COUNT = INTERACTION_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rades.evm.evm.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rades.evm.evm.impl.ServiceImpl
   * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getService()
   * @generated
   */
  int SERVICE = 14;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__CLASS_NAME = 0;

  /**
   * The feature id for the '<em><b>Method Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__METHOD_NAME = 1;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rades.evm.evm.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Element</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.ModelElement
   * @generated
   */
  EClass getModelElement();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rades.evm.evm.ModelElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.ModelElement#getName()
   * @see #getModelElement()
   * @generated
   */
  EAttribute getModelElement_Name();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rades.evm.evm.Navigationpath <em>Navigationpath</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Navigationpath</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Navigationpath
   * @generated
   */
  EClass getNavigationpath();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rades.evm.evm.DesignPattern <em>Design Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Design Pattern</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.DesignPattern
   * @generated
   */
  EClass getDesignPattern();

  /**
   * Returns the meta object for the containment reference '{@link com.github.funthomas424242.rades.evm.evm.DesignPattern#getLayouts <em>Layouts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layouts</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.DesignPattern#getLayouts()
   * @see #getDesignPattern()
   * @generated
   */
  EReference getDesignPattern_Layouts();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rades.evm.evm.EyeViewModel <em>Eye View Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Eye View Model</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.EyeViewModel
   * @generated
   */
  EClass getEyeViewModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.rades.evm.evm.EyeViewModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.EyeViewModel#getElements()
   * @see #getEyeViewModel()
   * @generated
   */
  EReference getEyeViewModel_Elements();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rades.evm.evm.Formular <em>Formular</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formular</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Formular
   * @generated
   */
  EClass getFormular();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.rades.evm.evm.Formular#getLabels <em>Labels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Labels</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Formular#getLabels()
   * @see #getFormular()
   * @generated
   */
  EReference getFormular_Labels();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.rades.evm.evm.Formular#getButtons <em>Buttons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Buttons</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Formular#getButtons()
   * @see #getFormular()
   * @generated
   */
  EReference getFormular_Buttons();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.rades.evm.evm.Formular#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputs</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Formular#getInputs()
   * @see #getFormular()
   * @generated
   */
  EReference getFormular_Inputs();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rades.evm.evm.PopUp <em>Pop Up</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pop Up</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.PopUp
   * @generated
   */
  EClass getPopUp();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rades.evm.evm.Report <em>Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Report</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Report
   * @generated
   */
  EClass getReport();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rades.evm.evm.Layout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layout</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Layout
   * @generated
   */
  EClass getLayout();

  /**
   * Returns the meta object for the reference list '{@link com.github.funthomas424242.rades.evm.evm.Layout#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Content</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Layout#getContent()
   * @see #getLayout()
   * @generated
   */
  EReference getLayout_Content();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.rades.evm.evm.Layout#getSublayout <em>Sublayout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sublayout</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Layout#getSublayout()
   * @see #getLayout()
   * @generated
   */
  EReference getLayout_Sublayout();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rades.evm.evm.VerticalLayout <em>Vertical Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vertical Layout</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.VerticalLayout
   * @generated
   */
  EClass getVerticalLayout();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rades.evm.evm.HorizontalLayout <em>Horizontal Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Horizontal Layout</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.HorizontalLayout
   * @generated
   */
  EClass getHorizontalLayout();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rades.evm.evm.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Button
   * @generated
   */
  EClass getButton();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rades.evm.evm.Button#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Button#getText()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_Text();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rades.evm.evm.Button#getImg <em>Img</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Img</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Button#getImg()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_Img();

  /**
   * Returns the meta object for the containment reference '{@link com.github.funthomas424242.rades.evm.evm.Button#getValidationService <em>Validation Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Validation Service</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Button#getValidationService()
   * @see #getButton()
   * @generated
   */
  EReference getButton_ValidationService();

  /**
   * Returns the meta object for the containment reference '{@link com.github.funthomas424242.rades.evm.evm.Button#getActionService <em>Action Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action Service</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Button#getActionService()
   * @see #getButton()
   * @generated
   */
  EReference getButton_ActionService();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rades.evm.evm.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for the reference '{@link com.github.funthomas424242.rades.evm.evm.Label#getButton <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Button</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Label#getButton()
   * @see #getLabel()
   * @generated
   */
  EReference getLabel_Button();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rades.evm.evm.Label#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Label#getText()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Text();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rades.evm.evm.Label#getImg <em>Img</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Img</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Label#getImg()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Img();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rades.evm.evm.InputField <em>Input Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Field</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.InputField
   * @generated
   */
  EClass getInputField();

  /**
   * Returns the meta object for the containment reference '{@link com.github.funthomas424242.rades.evm.evm.InputField#getValidationService <em>Validation Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Validation Service</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.InputField#getValidationService()
   * @see #getInputField()
   * @generated
   */
  EReference getInputField_ValidationService();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rades.evm.evm.InteractionElement <em>Interaction Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interaction Element</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.InteractionElement
   * @generated
   */
  EClass getInteractionElement();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rades.evm.evm.InteractionElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.InteractionElement#getName()
   * @see #getInteractionElement()
   * @generated
   */
  EAttribute getInteractionElement_Name();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rades.evm.evm.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rades.evm.evm.Service#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Service#getClassName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_ClassName();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rades.evm.evm.Service#getMethodName <em>Method Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method Name</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Service#getMethodName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_MethodName();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EvmFactory getEvmFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rades.evm.evm.impl.ModelElementImpl <em>Model Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rades.evm.evm.impl.ModelElementImpl
     * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getModelElement()
     * @generated
     */
    EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rades.evm.evm.impl.NavigationpathImpl <em>Navigationpath</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rades.evm.evm.impl.NavigationpathImpl
     * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getNavigationpath()
     * @generated
     */
    EClass NAVIGATIONPATH = eINSTANCE.getNavigationpath();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rades.evm.evm.impl.DesignPatternImpl <em>Design Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rades.evm.evm.impl.DesignPatternImpl
     * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getDesignPattern()
     * @generated
     */
    EClass DESIGN_PATTERN = eINSTANCE.getDesignPattern();

    /**
     * The meta object literal for the '<em><b>Layouts</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESIGN_PATTERN__LAYOUTS = eINSTANCE.getDesignPattern_Layouts();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rades.evm.evm.impl.EyeViewModelImpl <em>Eye View Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rades.evm.evm.impl.EyeViewModelImpl
     * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getEyeViewModel()
     * @generated
     */
    EClass EYE_VIEW_MODEL = eINSTANCE.getEyeViewModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EYE_VIEW_MODEL__ELEMENTS = eINSTANCE.getEyeViewModel_Elements();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rades.evm.evm.impl.FormularImpl <em>Formular</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rades.evm.evm.impl.FormularImpl
     * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getFormular()
     * @generated
     */
    EClass FORMULAR = eINSTANCE.getFormular();

    /**
     * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULAR__LABELS = eINSTANCE.getFormular_Labels();

    /**
     * The meta object literal for the '<em><b>Buttons</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULAR__BUTTONS = eINSTANCE.getFormular_Buttons();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULAR__INPUTS = eINSTANCE.getFormular_Inputs();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rades.evm.evm.impl.PopUpImpl <em>Pop Up</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rades.evm.evm.impl.PopUpImpl
     * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getPopUp()
     * @generated
     */
    EClass POP_UP = eINSTANCE.getPopUp();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rades.evm.evm.impl.ReportImpl <em>Report</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rades.evm.evm.impl.ReportImpl
     * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getReport()
     * @generated
     */
    EClass REPORT = eINSTANCE.getReport();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rades.evm.evm.impl.LayoutImpl <em>Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rades.evm.evm.impl.LayoutImpl
     * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getLayout()
     * @generated
     */
    EClass LAYOUT = eINSTANCE.getLayout();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT__CONTENT = eINSTANCE.getLayout_Content();

    /**
     * The meta object literal for the '<em><b>Sublayout</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT__SUBLAYOUT = eINSTANCE.getLayout_Sublayout();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rades.evm.evm.impl.VerticalLayoutImpl <em>Vertical Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rades.evm.evm.impl.VerticalLayoutImpl
     * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getVerticalLayout()
     * @generated
     */
    EClass VERTICAL_LAYOUT = eINSTANCE.getVerticalLayout();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rades.evm.evm.impl.HorizontalLayoutImpl <em>Horizontal Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rades.evm.evm.impl.HorizontalLayoutImpl
     * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getHorizontalLayout()
     * @generated
     */
    EClass HORIZONTAL_LAYOUT = eINSTANCE.getHorizontalLayout();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rades.evm.evm.impl.ButtonImpl <em>Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rades.evm.evm.impl.ButtonImpl
     * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getButton()
     * @generated
     */
    EClass BUTTON = eINSTANCE.getButton();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__TEXT = eINSTANCE.getButton_Text();

    /**
     * The meta object literal for the '<em><b>Img</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__IMG = eINSTANCE.getButton_Img();

    /**
     * The meta object literal for the '<em><b>Validation Service</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__VALIDATION_SERVICE = eINSTANCE.getButton_ValidationService();

    /**
     * The meta object literal for the '<em><b>Action Service</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__ACTION_SERVICE = eINSTANCE.getButton_ActionService();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rades.evm.evm.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rades.evm.evm.impl.LabelImpl
     * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getLabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getLabel();

    /**
     * The meta object literal for the '<em><b>Button</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABEL__BUTTON = eINSTANCE.getLabel_Button();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__TEXT = eINSTANCE.getLabel_Text();

    /**
     * The meta object literal for the '<em><b>Img</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__IMG = eINSTANCE.getLabel_Img();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rades.evm.evm.impl.InputFieldImpl <em>Input Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rades.evm.evm.impl.InputFieldImpl
     * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getInputField()
     * @generated
     */
    EClass INPUT_FIELD = eINSTANCE.getInputField();

    /**
     * The meta object literal for the '<em><b>Validation Service</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_FIELD__VALIDATION_SERVICE = eINSTANCE.getInputField_ValidationService();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rades.evm.evm.impl.InteractionElementImpl <em>Interaction Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rades.evm.evm.impl.InteractionElementImpl
     * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getInteractionElement()
     * @generated
     */
    EClass INTERACTION_ELEMENT = eINSTANCE.getInteractionElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTION_ELEMENT__NAME = eINSTANCE.getInteractionElement_Name();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rades.evm.evm.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rades.evm.evm.impl.ServiceImpl
     * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__CLASS_NAME = eINSTANCE.getService_ClassName();

    /**
     * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__METHOD_NAME = eINSTANCE.getService_MethodName();

  }

} //EvmPackage
