/**
 */
package IFML.Extensions.impl;

import IFML.Extensions.*;

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
public class ExtensionsFactoryImpl extends EFactoryImpl implements ExtensionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExtensionsFactory init() {
		try {
			ExtensionsFactory theExtensionsFactory = (ExtensionsFactory)EPackage.Registry.INSTANCE.getEFactory(ExtensionsPackage.eNS_URI);
			if (theExtensionsFactory != null) {
				return theExtensionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExtensionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionsFactoryImpl() {
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
			case ExtensionsPackage.ON_SUBMIT_EVENT: return createOnSubmitEvent();
			case ExtensionsPackage.VALIDATION_RULE: return createValidationRule();
			case ExtensionsPackage.LIST: return createList();
			case ExtensionsPackage.POSITION: return createPosition();
			case ExtensionsPackage.USER_ROLE: return createUserRole();
			case ExtensionsPackage.IFML_SLOT: return createIFMLSlot();
			case ExtensionsPackage.ON_SELECT_EVENT: return createOnSelectEvent();
			case ExtensionsPackage.FORM: return createForm();
			case ExtensionsPackage.DEVICE: return createDevice();
			case ExtensionsPackage.SELECTION_FIELD: return createSelectionField();
			case ExtensionsPackage.SIMPLE_FIELD: return createSimpleField();
			case ExtensionsPackage.DETAILS: return createDetails();
			case ExtensionsPackage.IFML_WINDOW: return createIFMLWindow();
			case ExtensionsPackage.ON_LOAD_EVENT: return createOnLoadEvent();
			case ExtensionsPackage.IFML_MENU: return createIFMLMenu();
			case ExtensionsPackage.JUMP_EVENT: return createJumpEvent();
			case ExtensionsPackage.LANDING_EVENT: return createLandingEvent();
			case ExtensionsPackage.SET_CONTEXT_EVENT: return createSetContextEvent();
			case ExtensionsPackage.SCREEN: return createScreen();
			case ExtensionsPackage.TOOL_BAR: return createToolBar();
			case ExtensionsPackage.MOBILE_COMPONENT: return createMobileComponent();
			case ExtensionsPackage.MOBILE_ELEMENT_EVENT: return createMobileElementEvent();
			case ExtensionsPackage.MOBILE_SYSTEM_EVENT: return createMobileSystemEvent();
			case ExtensionsPackage.BATTERY_EVENT: return createBatteryEvent();
			case ExtensionsPackage.STORAGE_EVENT: return createStorageEvent();
			case ExtensionsPackage.MOBILE_ACTION: return createMobileAction();
			case ExtensionsPackage.CAMERA_ACTION: return createCameraAction();
			case ExtensionsPackage.MICROPHONE_ACTION: return createMicrophoneAction();
			case ExtensionsPackage.MOBILE_ACTION_EVENT: return createMobileActionEvent();
			case ExtensionsPackage.CAMERA_ACTION_EVENT: return createCameraActionEvent();
			case ExtensionsPackage.MICROPHONE_ACTION_EVENT: return createMicrophoneActionEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnSubmitEvent createOnSubmitEvent() {
		OnSubmitEventImpl onSubmitEvent = new OnSubmitEventImpl();
		return onSubmitEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationRule createValidationRule() {
		ValidationRuleImpl validationRule = new ValidationRuleImpl();
		return validationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserRole createUserRole() {
		UserRoleImpl userRole = new UserRoleImpl();
		return userRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFMLSlot createIFMLSlot() {
		IFMLSlotImpl ifmlSlot = new IFMLSlotImpl();
		return ifmlSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnSelectEvent createOnSelectEvent() {
		OnSelectEventImpl onSelectEvent = new OnSelectEventImpl();
		return onSelectEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionField createSelectionField() {
		SelectionFieldImpl selectionField = new SelectionFieldImpl();
		return selectionField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleField createSimpleField() {
		SimpleFieldImpl simpleField = new SimpleFieldImpl();
		return simpleField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Details createDetails() {
		DetailsImpl details = new DetailsImpl();
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFMLWindow createIFMLWindow() {
		IFMLWindowImpl ifmlWindow = new IFMLWindowImpl();
		return ifmlWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnLoadEvent createOnLoadEvent() {
		OnLoadEventImpl onLoadEvent = new OnLoadEventImpl();
		return onLoadEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFMLMenu createIFMLMenu() {
		IFMLMenuImpl ifmlMenu = new IFMLMenuImpl();
		return ifmlMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpEvent createJumpEvent() {
		JumpEventImpl jumpEvent = new JumpEventImpl();
		return jumpEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LandingEvent createLandingEvent() {
		LandingEventImpl landingEvent = new LandingEventImpl();
		return landingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetContextEvent createSetContextEvent() {
		SetContextEventImpl setContextEvent = new SetContextEventImpl();
		return setContextEvent;
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
	public ExtensionsPackage getExtensionsPackage() {
		return (ExtensionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExtensionsPackage getPackage() {
		return ExtensionsPackage.eINSTANCE;
	}

} //ExtensionsFactoryImpl
