/**
 */
package IFML.Mobile.impl;

import IFML.Mobile.*;

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
public class MobileFactoryImpl extends EFactoryImpl implements MobileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MobileFactory init() {
		try {
			MobileFactory theMobileFactory = (MobileFactory)EPackage.Registry.INSTANCE.getEFactory(MobilePackage.eNS_URI);
			if (theMobileFactory != null) {
				return theMobileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MobileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobileFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MobilePackage.SCREEN: return createScreen();
			case MobilePackage.TOOL_BAR: return createToolBar();
			case MobilePackage.MOBILE_COMPONENT: return createMobileComponent();
			case MobilePackage.MOBILE_ELEMENT_EVENT: return createMobileElementEvent();
			case MobilePackage.MOBILE_SYSTEM_EVENT: return createMobileSystemEvent();
			case MobilePackage.BATTERY_EVENT: return createBatteryEvent();
			case MobilePackage.STORAGE_EVENT: return createStorageEvent();
			case MobilePackage.MOBILE_ACTION: return createMobileAction();
			case MobilePackage.CAMERA_ACTION: return createCameraAction();
			case MobilePackage.MICROPHONE_ACTION: return createMicrophoneAction();
			case MobilePackage.MOBILE_ACTION_EVENT: return createMobileActionEvent();
			case MobilePackage.CAMERA_ACTION_EVENT: return createCameraActionEvent();
			case MobilePackage.MICROPHONE_ACTION_EVENT: return createMicrophoneActionEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screen createScreen() {
		ScreenImpl screen = new ScreenImpl();
		return screen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolBar createToolBar() {
		ToolBarImpl toolBar = new ToolBarImpl();
		return toolBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobileComponent createMobileComponent() {
		MobileComponentImpl mobileComponent = new MobileComponentImpl();
		return mobileComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobileElementEvent createMobileElementEvent() {
		MobileElementEventImpl mobileElementEvent = new MobileElementEventImpl();
		return mobileElementEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobileSystemEvent createMobileSystemEvent() {
		MobileSystemEventImpl mobileSystemEvent = new MobileSystemEventImpl();
		return mobileSystemEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatteryEvent createBatteryEvent() {
		BatteryEventImpl batteryEvent = new BatteryEventImpl();
		return batteryEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageEvent createStorageEvent() {
		StorageEventImpl storageEvent = new StorageEventImpl();
		return storageEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobileAction createMobileAction() {
		MobileActionImpl mobileAction = new MobileActionImpl();
		return mobileAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraAction createCameraAction() {
		CameraActionImpl cameraAction = new CameraActionImpl();
		return cameraAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrophoneAction createMicrophoneAction() {
		MicrophoneActionImpl microphoneAction = new MicrophoneActionImpl();
		return microphoneAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobileActionEvent createMobileActionEvent() {
		MobileActionEventImpl mobileActionEvent = new MobileActionEventImpl();
		return mobileActionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraActionEvent createCameraActionEvent() {
		CameraActionEventImpl cameraActionEvent = new CameraActionEventImpl();
		return cameraActionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrophoneActionEvent createMicrophoneActionEvent() {
		MicrophoneActionEventImpl microphoneActionEvent = new MicrophoneActionEventImpl();
		return microphoneActionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilePackage getMobilePackage() {
		return (MobilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MobilePackage getPackage() {
		return MobilePackage.eINSTANCE;
	}

} //MobileFactoryImpl
