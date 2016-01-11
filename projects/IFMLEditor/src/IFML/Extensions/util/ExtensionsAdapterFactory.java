/**
 */
package IFML.Extensions.util;

import IFML.Core.ActionEvent;
import IFML.Core.BooleanExpression;
import IFML.Core.CatchingEvent;
import IFML.Core.Constraint;
import IFML.Core.ContextDimension;
import IFML.Core.Element;
import IFML.Core.Event;
import IFML.Core.Expression;
import IFML.Core.IFMLAction;
import IFML.Core.IFMLParameter;
import IFML.Core.InteractionFlowElement;
import IFML.Core.InteractionFlowModelElement;
import IFML.Core.NamedElement;
import IFML.Core.SystemEvent;
import IFML.Core.ThrowingEvent;
import IFML.Core.ViewComponent;
import IFML.Core.ViewComponentPart;
import IFML.Core.ViewContainer;
import IFML.Core.ViewElement;
import IFML.Core.ViewElementEvent;

import IFML.Extensions.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see IFML.Extensions.ExtensionsPackage
 * @generated
 */
public class ExtensionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExtensionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExtensionsPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
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
	protected ExtensionsSwitch<Adapter> modelSwitch =
		new ExtensionsSwitch<Adapter>() {
			@Override
			public Adapter caseOnSubmitEvent(OnSubmitEvent object) {
				return createOnSubmitEventAdapter();
			}
			@Override
			public Adapter caseValidationRule(ValidationRule object) {
				return createValidationRuleAdapter();
			}
			@Override
			public Adapter caseList(List object) {
				return createListAdapter();
			}
			@Override
			public Adapter casePosition(Position object) {
				return createPositionAdapter();
			}
			@Override
			public Adapter caseUserRole(UserRole object) {
				return createUserRoleAdapter();
			}
			@Override
			public Adapter caseIFMLSlot(IFMLSlot object) {
				return createIFMLSlotAdapter();
			}
			@Override
			public Adapter caseOnSelectEvent(OnSelectEvent object) {
				return createOnSelectEventAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter caseForm(Form object) {
				return createFormAdapter();
			}
			@Override
			public Adapter caseDevice(Device object) {
				return createDeviceAdapter();
			}
			@Override
			public Adapter caseSelectionField(SelectionField object) {
				return createSelectionFieldAdapter();
			}
			@Override
			public Adapter caseSimpleField(SimpleField object) {
				return createSimpleFieldAdapter();
			}
			@Override
			public Adapter caseDetails(Details object) {
				return createDetailsAdapter();
			}
			@Override
			public Adapter caseIFMLWindow(IFMLWindow object) {
				return createIFMLWindowAdapter();
			}
			@Override
			public Adapter caseOnLoadEvent(OnLoadEvent object) {
				return createOnLoadEventAdapter();
			}
			@Override
			public Adapter caseIFMLMenu(IFMLMenu object) {
				return createIFMLMenuAdapter();
			}
			@Override
			public Adapter caseJumpEvent(JumpEvent object) {
				return createJumpEventAdapter();
			}
			@Override
			public Adapter caseLandingEvent(LandingEvent object) {
				return createLandingEventAdapter();
			}
			@Override
			public Adapter caseSetContextEvent(SetContextEvent object) {
				return createSetContextEventAdapter();
			}
			@Override
			public Adapter caseScreen(Screen object) {
				return createScreenAdapter();
			}
			@Override
			public Adapter caseToolBar(ToolBar object) {
				return createToolBarAdapter();
			}
			@Override
			public Adapter caseMobileComponent(MobileComponent object) {
				return createMobileComponentAdapter();
			}
			@Override
			public Adapter caseMobileElementEvent(MobileElementEvent object) {
				return createMobileElementEventAdapter();
			}
			@Override
			public Adapter caseMobileSystemEvent(MobileSystemEvent object) {
				return createMobileSystemEventAdapter();
			}
			@Override
			public Adapter caseBatteryEvent(BatteryEvent object) {
				return createBatteryEventAdapter();
			}
			@Override
			public Adapter caseStorageEvent(StorageEvent object) {
				return createStorageEventAdapter();
			}
			@Override
			public Adapter caseMobileAction(MobileAction object) {
				return createMobileActionAdapter();
			}
			@Override
			public Adapter caseCameraAction(CameraAction object) {
				return createCameraActionAdapter();
			}
			@Override
			public Adapter caseMicrophoneAction(MicrophoneAction object) {
				return createMicrophoneActionAdapter();
			}
			@Override
			public Adapter caseMobileActionEvent(MobileActionEvent object) {
				return createMobileActionEventAdapter();
			}
			@Override
			public Adapter caseCameraActionEvent(CameraActionEvent object) {
				return createCameraActionEventAdapter();
			}
			@Override
			public Adapter caseMicrophoneActionEvent(MicrophoneActionEvent object) {
				return createMicrophoneActionEventAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseInteractionFlowModelElement(InteractionFlowModelElement object) {
				return createInteractionFlowModelElementAdapter();
			}
			@Override
			public Adapter caseInteractionFlowElement(InteractionFlowElement object) {
				return createInteractionFlowElementAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseCatchingEvent(CatchingEvent object) {
				return createCatchingEventAdapter();
			}
			@Override
			public Adapter caseViewElementEvent(ViewElementEvent object) {
				return createViewElementEventAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseBooleanExpression(BooleanExpression object) {
				return createBooleanExpressionAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseViewElement(ViewElement object) {
				return createViewElementAdapter();
			}
			@Override
			public Adapter caseViewComponent(ViewComponent object) {
				return createViewComponentAdapter();
			}
			@Override
			public Adapter caseContextDimension(ContextDimension object) {
				return createContextDimensionAdapter();
			}
			@Override
			public Adapter caseViewComponentPart(ViewComponentPart object) {
				return createViewComponentPartAdapter();
			}
			@Override
			public Adapter caseIFMLParameter(IFMLParameter object) {
				return createIFMLParameterAdapter();
			}
			@Override
			public Adapter caseViewContainer(ViewContainer object) {
				return createViewContainerAdapter();
			}
			@Override
			public Adapter caseSystemEvent(SystemEvent object) {
				return createSystemEventAdapter();
			}
			@Override
			public Adapter caseThrowingEvent(ThrowingEvent object) {
				return createThrowingEventAdapter();
			}
			@Override
			public Adapter caseIFMLAction(IFMLAction object) {
				return createIFMLActionAdapter();
			}
			@Override
			public Adapter caseActionEvent(ActionEvent object) {
				return createActionEventAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.OnSubmitEvent <em>On Submit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.OnSubmitEvent
	 * @generated
	 */
	public Adapter createOnSubmitEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.ValidationRule <em>Validation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.ValidationRule
	 * @generated
	 */
	public Adapter createValidationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.List
	 * @generated
	 */
	public Adapter createListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.Position
	 * @generated
	 */
	public Adapter createPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.UserRole <em>User Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.UserRole
	 * @generated
	 */
	public Adapter createUserRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.IFMLSlot <em>IFML Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.IFMLSlot
	 * @generated
	 */
	public Adapter createIFMLSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.OnSelectEvent <em>On Select Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.OnSelectEvent
	 * @generated
	 */
	public Adapter createOnSelectEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.Form
	 * @generated
	 */
	public Adapter createFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.SelectionField <em>Selection Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.SelectionField
	 * @generated
	 */
	public Adapter createSelectionFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.SimpleField <em>Simple Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.SimpleField
	 * @generated
	 */
	public Adapter createSimpleFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.Details <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.Details
	 * @generated
	 */
	public Adapter createDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.IFMLWindow <em>IFML Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.IFMLWindow
	 * @generated
	 */
	public Adapter createIFMLWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.OnLoadEvent <em>On Load Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.OnLoadEvent
	 * @generated
	 */
	public Adapter createOnLoadEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.IFMLMenu <em>IFML Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.IFMLMenu
	 * @generated
	 */
	public Adapter createIFMLMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.JumpEvent <em>Jump Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.JumpEvent
	 * @generated
	 */
	public Adapter createJumpEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.LandingEvent <em>Landing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.LandingEvent
	 * @generated
	 */
	public Adapter createLandingEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.SetContextEvent <em>Set Context Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.SetContextEvent
	 * @generated
	 */
	public Adapter createSetContextEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.Screen <em>Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.Screen
	 * @generated
	 */
	public Adapter createScreenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.ToolBar <em>Tool Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.ToolBar
	 * @generated
	 */
	public Adapter createToolBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.MobileComponent <em>Mobile Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.MobileComponent
	 * @generated
	 */
	public Adapter createMobileComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.MobileElementEvent <em>Mobile Element Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.MobileElementEvent
	 * @generated
	 */
	public Adapter createMobileElementEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.MobileSystemEvent <em>Mobile System Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.MobileSystemEvent
	 * @generated
	 */
	public Adapter createMobileSystemEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.BatteryEvent <em>Battery Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.BatteryEvent
	 * @generated
	 */
	public Adapter createBatteryEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.StorageEvent <em>Storage Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.StorageEvent
	 * @generated
	 */
	public Adapter createStorageEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.MobileAction <em>Mobile Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.MobileAction
	 * @generated
	 */
	public Adapter createMobileActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.CameraAction <em>Camera Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.CameraAction
	 * @generated
	 */
	public Adapter createCameraActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.MicrophoneAction <em>Microphone Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.MicrophoneAction
	 * @generated
	 */
	public Adapter createMicrophoneActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.MobileActionEvent <em>Mobile Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.MobileActionEvent
	 * @generated
	 */
	public Adapter createMobileActionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.CameraActionEvent <em>Camera Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.CameraActionEvent
	 * @generated
	 */
	public Adapter createCameraActionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.MicrophoneActionEvent <em>Microphone Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.MicrophoneActionEvent
	 * @generated
	 */
	public Adapter createMicrophoneActionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.InteractionFlowModelElement <em>Interaction Flow Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.InteractionFlowModelElement
	 * @generated
	 */
	public Adapter createInteractionFlowModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.InteractionFlowElement <em>Interaction Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.InteractionFlowElement
	 * @generated
	 */
	public Adapter createInteractionFlowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.CatchingEvent <em>Catching Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.CatchingEvent
	 * @generated
	 */
	public Adapter createCatchingEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ViewElementEvent <em>View Element Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ViewElementEvent
	 * @generated
	 */
	public Adapter createViewElementEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.BooleanExpression
	 * @generated
	 */
	public Adapter createBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ViewElement <em>View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ViewElement
	 * @generated
	 */
	public Adapter createViewElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ViewComponent <em>View Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ViewComponent
	 * @generated
	 */
	public Adapter createViewComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ContextDimension <em>Context Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ContextDimension
	 * @generated
	 */
	public Adapter createContextDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ViewComponentPart <em>View Component Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ViewComponentPart
	 * @generated
	 */
	public Adapter createViewComponentPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.IFMLParameter <em>IFML Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.IFMLParameter
	 * @generated
	 */
	public Adapter createIFMLParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ViewContainer <em>View Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ViewContainer
	 * @generated
	 */
	public Adapter createViewContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.SystemEvent <em>System Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.SystemEvent
	 * @generated
	 */
	public Adapter createSystemEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ThrowingEvent <em>Throwing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ThrowingEvent
	 * @generated
	 */
	public Adapter createThrowingEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.IFMLAction <em>IFML Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.IFMLAction
	 * @generated
	 */
	public Adapter createIFMLActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ActionEvent <em>Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ActionEvent
	 * @generated
	 */
	public Adapter createActionEventAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ExtensionsAdapterFactory
