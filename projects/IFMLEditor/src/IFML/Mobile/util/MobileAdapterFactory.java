/**
 */
package IFML.Mobile.util;

import IFML.Core.ActionEvent;
import IFML.Core.CatchingEvent;
import IFML.Core.Element;
import IFML.Core.Event;
import IFML.Core.IFMLAction;
import IFML.Core.InteractionFlowElement;
import IFML.Core.InteractionFlowModelElement;
import IFML.Core.NamedElement;
import IFML.Core.SystemEvent;
import IFML.Core.ViewComponent;
import IFML.Core.ViewContainer;
import IFML.Core.ViewElement;
import IFML.Core.ViewElementEvent;

import IFML.Mobile.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see IFML.Mobile.MobilePackage
 * @generated
 */
public class MobileAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MobilePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobileAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MobilePackage.eINSTANCE;
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
	protected MobileSwitch<Adapter> modelSwitch =
		new MobileSwitch<Adapter>() {
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
			public Adapter caseViewElement(ViewElement object) {
				return createViewElementAdapter();
			}
			@Override
			public Adapter caseViewContainer(ViewContainer object) {
				return createViewContainerAdapter();
			}
			@Override
			public Adapter caseViewComponent(ViewComponent object) {
				return createViewComponentAdapter();
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
			public Adapter caseSystemEvent(SystemEvent object) {
				return createSystemEventAdapter();
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
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.Screen <em>Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.Screen
	 * @generated
	 */
	public Adapter createScreenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.ToolBar <em>Tool Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.ToolBar
	 * @generated
	 */
	public Adapter createToolBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MobileComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MobileComponent
	 * @generated
	 */
	public Adapter createMobileComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MobileElementEvent <em>Element Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MobileElementEvent
	 * @generated
	 */
	public Adapter createMobileElementEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MobileSystemEvent <em>System Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MobileSystemEvent
	 * @generated
	 */
	public Adapter createMobileSystemEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.BatteryEvent <em>Battery Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.BatteryEvent
	 * @generated
	 */
	public Adapter createBatteryEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.StorageEvent <em>Storage Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.StorageEvent
	 * @generated
	 */
	public Adapter createStorageEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MobileAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MobileAction
	 * @generated
	 */
	public Adapter createMobileActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.CameraAction <em>Camera Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.CameraAction
	 * @generated
	 */
	public Adapter createCameraActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MicrophoneAction <em>Microphone Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MicrophoneAction
	 * @generated
	 */
	public Adapter createMicrophoneActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MobileActionEvent <em>Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MobileActionEvent
	 * @generated
	 */
	public Adapter createMobileActionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.CameraActionEvent <em>Camera Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.CameraActionEvent
	 * @generated
	 */
	public Adapter createCameraActionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MicrophoneActionEvent <em>Microphone Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MicrophoneActionEvent
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

} //MobileAdapterFactory
