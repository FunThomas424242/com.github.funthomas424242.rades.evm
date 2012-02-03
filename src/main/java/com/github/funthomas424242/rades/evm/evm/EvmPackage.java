/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rades.evm.evm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
   * The meta object id for the '{@link com.github.funthomas424242.rades.evm.evm.impl.NamedElementImpl <em>Named Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rades.evm.evm.impl.NamedElementImpl
   * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getNamedElement()
   * @generated
   */
  int NAMED_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rades.evm.evm.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rades.evm.evm.impl.TypeImpl
   * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getType()
   * @generated
   */
  int TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rades.evm.evm.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rades.evm.evm.impl.DataTypeImpl
   * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = TYPE__NAME;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rades.evm.evm.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rades.evm.evm.impl.EntityImpl
   * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ABSTRACT = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FEATURES = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rades.evm.evm.impl.EntityModelImpl <em>Entity Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rades.evm.evm.impl.EntityModelImpl
   * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getEntityModel()
   * @generated
   */
  int ENTITY_MODEL = 4;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MODEL__TYPES = 0;

  /**
   * The number of structural features of the '<em>Entity Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rades.evm.evm.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rades.evm.evm.impl.FeatureImpl
   * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__KIND = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.rades.evm.evm.FeatureKind <em>Feature Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.rades.evm.evm.FeatureKind
   * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getFeatureKind()
   * @generated
   */
  int FEATURE_KIND = 6;


  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rades.evm.evm.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.NamedElement
   * @generated
   */
  EClass getNamedElement();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rades.evm.evm.NamedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.NamedElement#getName()
   * @see #getNamedElement()
   * @generated
   */
  EAttribute getNamedElement_Name();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rades.evm.evm.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rades.evm.evm.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rades.evm.evm.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rades.evm.evm.Entity#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Entity#isAbstract()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Abstract();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.rades.evm.evm.Entity#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Entity#getFeatures()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Features();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rades.evm.evm.EntityModel <em>Entity Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Model</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.EntityModel
   * @generated
   */
  EClass getEntityModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.rades.evm.evm.EntityModel#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.EntityModel#getTypes()
   * @see #getEntityModel()
   * @generated
   */
  EReference getEntityModel_Types();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.rades.evm.evm.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.rades.evm.evm.Feature#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Feature#getKind()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Kind();

  /**
   * Returns the meta object for the reference '{@link com.github.funthomas424242.rades.evm.evm.Feature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.Feature#getType()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Type();

  /**
   * Returns the meta object for enum '{@link com.github.funthomas424242.rades.evm.evm.FeatureKind <em>Feature Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Feature Kind</em>'.
   * @see com.github.funthomas424242.rades.evm.evm.FeatureKind
   * @generated
   */
  EEnum getFeatureKind();

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
     * The meta object literal for the '{@link com.github.funthomas424242.rades.evm.evm.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rades.evm.evm.impl.NamedElementImpl
     * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getNamedElement()
     * @generated
     */
    EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rades.evm.evm.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rades.evm.evm.impl.TypeImpl
     * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rades.evm.evm.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rades.evm.evm.impl.DataTypeImpl
     * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rades.evm.evm.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rades.evm.evm.impl.EntityImpl
     * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__ABSTRACT = eINSTANCE.getEntity_Abstract();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__FEATURES = eINSTANCE.getEntity_Features();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rades.evm.evm.impl.EntityModelImpl <em>Entity Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rades.evm.evm.impl.EntityModelImpl
     * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getEntityModel()
     * @generated
     */
    EClass ENTITY_MODEL = eINSTANCE.getEntityModel();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_MODEL__TYPES = eINSTANCE.getEntityModel_Types();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rades.evm.evm.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rades.evm.evm.impl.FeatureImpl
     * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__KIND = eINSTANCE.getFeature_Kind();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__TYPE = eINSTANCE.getFeature_Type();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.rades.evm.evm.FeatureKind <em>Feature Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.rades.evm.evm.FeatureKind
     * @see com.github.funthomas424242.rades.evm.evm.impl.EvmPackageImpl#getFeatureKind()
     * @generated
     */
    EEnum FEATURE_KIND = eINSTANCE.getFeatureKind();

  }

} //EvmPackage
