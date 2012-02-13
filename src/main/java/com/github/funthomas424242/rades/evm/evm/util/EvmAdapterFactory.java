/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.rades.evm.evm.util;

import com.github.funthomas424242.rades.evm.evm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.github.funthomas424242.rades.evm.evm.EvmPackage
 * @generated
 */
public class EvmAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EvmPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvmAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EvmPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EvmSwitch<Adapter> modelSwitch =
    new EvmSwitch<Adapter>()
    {
      @Override
      public Adapter caseModelElement(ModelElement object)
      {
        return createModelElementAdapter();
      }
      @Override
      public Adapter caseNavigationpath(Navigationpath object)
      {
        return createNavigationpathAdapter();
      }
      @Override
      public Adapter caseDesignPattern(DesignPattern object)
      {
        return createDesignPatternAdapter();
      }
      @Override
      public Adapter caseEyeViewModel(EyeViewModel object)
      {
        return createEyeViewModelAdapter();
      }
      @Override
      public Adapter caseFormular(Formular object)
      {
        return createFormularAdapter();
      }
      @Override
      public Adapter casePopUp(PopUp object)
      {
        return createPopUpAdapter();
      }
      @Override
      public Adapter caseReport(Report object)
      {
        return createReportAdapter();
      }
      @Override
      public Adapter caseLayout(Layout object)
      {
        return createLayoutAdapter();
      }
      @Override
      public Adapter caseVerticalLayout(VerticalLayout object)
      {
        return createVerticalLayoutAdapter();
      }
      @Override
      public Adapter caseHorizontalLayout(HorizontalLayout object)
      {
        return createHorizontalLayoutAdapter();
      }
      @Override
      public Adapter caseButton(Button object)
      {
        return createButtonAdapter();
      }
      @Override
      public Adapter caseLabel(Label object)
      {
        return createLabelAdapter();
      }
      @Override
      public Adapter caseInputField(InputField object)
      {
        return createInputFieldAdapter();
      }
      @Override
      public Adapter caseInteractionElement(InteractionElement object)
      {
        return createInteractionElementAdapter();
      }
      @Override
      public Adapter caseService(Service object)
      {
        return createServiceAdapter();
      }
      @Override
      public Adapter caseProjectMetaData(ProjectMetaData object)
      {
        return createProjectMetaDataAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rades.evm.evm.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rades.evm.evm.ModelElement
   * @generated
   */
  public Adapter createModelElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rades.evm.evm.Navigationpath <em>Navigationpath</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rades.evm.evm.Navigationpath
   * @generated
   */
  public Adapter createNavigationpathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rades.evm.evm.DesignPattern <em>Design Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rades.evm.evm.DesignPattern
   * @generated
   */
  public Adapter createDesignPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rades.evm.evm.EyeViewModel <em>Eye View Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rades.evm.evm.EyeViewModel
   * @generated
   */
  public Adapter createEyeViewModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rades.evm.evm.Formular <em>Formular</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rades.evm.evm.Formular
   * @generated
   */
  public Adapter createFormularAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rades.evm.evm.PopUp <em>Pop Up</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rades.evm.evm.PopUp
   * @generated
   */
  public Adapter createPopUpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rades.evm.evm.Report <em>Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rades.evm.evm.Report
   * @generated
   */
  public Adapter createReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rades.evm.evm.Layout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rades.evm.evm.Layout
   * @generated
   */
  public Adapter createLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rades.evm.evm.VerticalLayout <em>Vertical Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rades.evm.evm.VerticalLayout
   * @generated
   */
  public Adapter createVerticalLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rades.evm.evm.HorizontalLayout <em>Horizontal Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rades.evm.evm.HorizontalLayout
   * @generated
   */
  public Adapter createHorizontalLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rades.evm.evm.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rades.evm.evm.Button
   * @generated
   */
  public Adapter createButtonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rades.evm.evm.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rades.evm.evm.Label
   * @generated
   */
  public Adapter createLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rades.evm.evm.InputField <em>Input Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rades.evm.evm.InputField
   * @generated
   */
  public Adapter createInputFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rades.evm.evm.InteractionElement <em>Interaction Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rades.evm.evm.InteractionElement
   * @generated
   */
  public Adapter createInteractionElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rades.evm.evm.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rades.evm.evm.Service
   * @generated
   */
  public Adapter createServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.rades.evm.evm.ProjectMetaData <em>Project Meta Data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.rades.evm.evm.ProjectMetaData
   * @generated
   */
  public Adapter createProjectMetaDataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EvmAdapterFactory
