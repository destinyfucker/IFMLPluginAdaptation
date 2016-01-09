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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see IFML.Mobile.MobilePackage
 * @generated
 */
public class MobileSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MobilePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobileSwitch() {
		if (modelPackage == null) {
			modelPackage = MobilePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MobilePackage.SCREEN: {
				Screen screen = (Screen)theEObject;
				T result = caseScreen(screen);
				if (result == null) result = caseViewContainer(screen);
				if (result == null) result = caseViewElement(screen);
				if (result == null) result = caseInteractionFlowElement(screen);
				if (result == null) result = caseNamedElement(screen);
				if (result == null) result = caseInteractionFlowModelElement(screen);
				if (result == null) result = caseElement(screen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.TOOL_BAR: {
				ToolBar toolBar = (ToolBar)theEObject;
				T result = caseToolBar(toolBar);
				if (result == null) result = caseViewContainer(toolBar);
				if (result == null) result = caseViewElement(toolBar);
				if (result == null) result = caseInteractionFlowElement(toolBar);
				if (result == null) result = caseNamedElement(toolBar);
				if (result == null) result = caseInteractionFlowModelElement(toolBar);
				if (result == null) result = caseElement(toolBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MOBILE_COMPONENT: {
				MobileComponent mobileComponent = (MobileComponent)theEObject;
				T result = caseMobileComponent(mobileComponent);
				if (result == null) result = caseViewComponent(mobileComponent);
				if (result == null) result = caseViewElement(mobileComponent);
				if (result == null) result = caseInteractionFlowElement(mobileComponent);
				if (result == null) result = caseNamedElement(mobileComponent);
				if (result == null) result = caseInteractionFlowModelElement(mobileComponent);
				if (result == null) result = caseElement(mobileComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MOBILE_ELEMENT_EVENT: {
				MobileElementEvent mobileElementEvent = (MobileElementEvent)theEObject;
				T result = caseMobileElementEvent(mobileElementEvent);
				if (result == null) result = caseViewElementEvent(mobileElementEvent);
				if (result == null) result = caseCatchingEvent(mobileElementEvent);
				if (result == null) result = caseEvent(mobileElementEvent);
				if (result == null) result = caseInteractionFlowElement(mobileElementEvent);
				if (result == null) result = caseNamedElement(mobileElementEvent);
				if (result == null) result = caseInteractionFlowModelElement(mobileElementEvent);
				if (result == null) result = caseElement(mobileElementEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MOBILE_SYSTEM_EVENT: {
				MobileSystemEvent mobileSystemEvent = (MobileSystemEvent)theEObject;
				T result = caseMobileSystemEvent(mobileSystemEvent);
				if (result == null) result = caseSystemEvent(mobileSystemEvent);
				if (result == null) result = caseCatchingEvent(mobileSystemEvent);
				if (result == null) result = caseEvent(mobileSystemEvent);
				if (result == null) result = caseInteractionFlowElement(mobileSystemEvent);
				if (result == null) result = caseNamedElement(mobileSystemEvent);
				if (result == null) result = caseInteractionFlowModelElement(mobileSystemEvent);
				if (result == null) result = caseElement(mobileSystemEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.BATTERY_EVENT: {
				BatteryEvent batteryEvent = (BatteryEvent)theEObject;
				T result = caseBatteryEvent(batteryEvent);
				if (result == null) result = caseMobileSystemEvent(batteryEvent);
				if (result == null) result = caseSystemEvent(batteryEvent);
				if (result == null) result = caseCatchingEvent(batteryEvent);
				if (result == null) result = caseEvent(batteryEvent);
				if (result == null) result = caseInteractionFlowElement(batteryEvent);
				if (result == null) result = caseNamedElement(batteryEvent);
				if (result == null) result = caseInteractionFlowModelElement(batteryEvent);
				if (result == null) result = caseElement(batteryEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.STORAGE_EVENT: {
				StorageEvent storageEvent = (StorageEvent)theEObject;
				T result = caseStorageEvent(storageEvent);
				if (result == null) result = caseMobileSystemEvent(storageEvent);
				if (result == null) result = caseSystemEvent(storageEvent);
				if (result == null) result = caseCatchingEvent(storageEvent);
				if (result == null) result = caseEvent(storageEvent);
				if (result == null) result = caseInteractionFlowElement(storageEvent);
				if (result == null) result = caseNamedElement(storageEvent);
				if (result == null) result = caseInteractionFlowModelElement(storageEvent);
				if (result == null) result = caseElement(storageEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MOBILE_ACTION: {
				MobileAction mobileAction = (MobileAction)theEObject;
				T result = caseMobileAction(mobileAction);
				if (result == null) result = caseIFMLAction(mobileAction);
				if (result == null) result = caseInteractionFlowElement(mobileAction);
				if (result == null) result = caseNamedElement(mobileAction);
				if (result == null) result = caseInteractionFlowModelElement(mobileAction);
				if (result == null) result = caseElement(mobileAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.CAMERA_ACTION: {
				CameraAction cameraAction = (CameraAction)theEObject;
				T result = caseCameraAction(cameraAction);
				if (result == null) result = caseMobileAction(cameraAction);
				if (result == null) result = caseIFMLAction(cameraAction);
				if (result == null) result = caseInteractionFlowElement(cameraAction);
				if (result == null) result = caseNamedElement(cameraAction);
				if (result == null) result = caseInteractionFlowModelElement(cameraAction);
				if (result == null) result = caseElement(cameraAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MICROPHONE_ACTION: {
				MicrophoneAction microphoneAction = (MicrophoneAction)theEObject;
				T result = caseMicrophoneAction(microphoneAction);
				if (result == null) result = caseMobileAction(microphoneAction);
				if (result == null) result = caseIFMLAction(microphoneAction);
				if (result == null) result = caseInteractionFlowElement(microphoneAction);
				if (result == null) result = caseNamedElement(microphoneAction);
				if (result == null) result = caseInteractionFlowModelElement(microphoneAction);
				if (result == null) result = caseElement(microphoneAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MOBILE_ACTION_EVENT: {
				MobileActionEvent mobileActionEvent = (MobileActionEvent)theEObject;
				T result = caseMobileActionEvent(mobileActionEvent);
				if (result == null) result = caseActionEvent(mobileActionEvent);
				if (result == null) result = caseCatchingEvent(mobileActionEvent);
				if (result == null) result = caseEvent(mobileActionEvent);
				if (result == null) result = caseInteractionFlowElement(mobileActionEvent);
				if (result == null) result = caseNamedElement(mobileActionEvent);
				if (result == null) result = caseInteractionFlowModelElement(mobileActionEvent);
				if (result == null) result = caseElement(mobileActionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.CAMERA_ACTION_EVENT: {
				CameraActionEvent cameraActionEvent = (CameraActionEvent)theEObject;
				T result = caseCameraActionEvent(cameraActionEvent);
				if (result == null) result = caseMobileActionEvent(cameraActionEvent);
				if (result == null) result = caseActionEvent(cameraActionEvent);
				if (result == null) result = caseCatchingEvent(cameraActionEvent);
				if (result == null) result = caseEvent(cameraActionEvent);
				if (result == null) result = caseInteractionFlowElement(cameraActionEvent);
				if (result == null) result = caseNamedElement(cameraActionEvent);
				if (result == null) result = caseInteractionFlowModelElement(cameraActionEvent);
				if (result == null) result = caseElement(cameraActionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MICROPHONE_ACTION_EVENT: {
				MicrophoneActionEvent microphoneActionEvent = (MicrophoneActionEvent)theEObject;
				T result = caseMicrophoneActionEvent(microphoneActionEvent);
				if (result == null) result = caseMobileActionEvent(microphoneActionEvent);
				if (result == null) result = caseActionEvent(microphoneActionEvent);
				if (result == null) result = caseCatchingEvent(microphoneActionEvent);
				if (result == null) result = caseEvent(microphoneActionEvent);
				if (result == null) result = caseInteractionFlowElement(microphoneActionEvent);
				if (result == null) result = caseNamedElement(microphoneActionEvent);
				if (result == null) result = caseInteractionFlowModelElement(microphoneActionEvent);
				if (result == null) result = caseElement(microphoneActionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreen(Screen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolBar(ToolBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobileComponent(MobileComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobileElementEvent(MobileElementEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobileSystemEvent(MobileSystemEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Battery Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Battery Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBatteryEvent(BatteryEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageEvent(StorageEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobileAction(MobileAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camera Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCameraAction(CameraAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microphone Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microphone Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicrophoneAction(MicrophoneAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobileActionEvent(MobileActionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camera Action Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera Action Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCameraActionEvent(CameraActionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microphone Action Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microphone Action Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicrophoneActionEvent(MicrophoneActionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Flow Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Flow Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionFlowModelElement(InteractionFlowModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Flow Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Flow Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionFlowElement(InteractionFlowElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewElement(ViewElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewContainer(ViewContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewComponent(ViewComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catching Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catching Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatchingEvent(CatchingEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Element Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Element Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewElementEvent(ViewElementEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemEvent(SystemEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFML Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFML Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFMLAction(IFMLAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionEvent(ActionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MobileSwitch
