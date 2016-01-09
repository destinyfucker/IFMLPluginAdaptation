/**
 */
package IFML.Mobile.impl;

import IFML.Core.CorePackage;

import IFML.Core.impl.CorePackageImpl;

import IFML.DataTypes.DataTypesPackage;

import IFML.DataTypes.impl.DataTypesPackageImpl;

import IFML.Extensions.ExtensionsPackage;

import IFML.Extensions.impl.ExtensionsPackageImpl;

import IFML.Mobile.BatteryEvent;
import IFML.Mobile.CameraAction;
import IFML.Mobile.CameraActionEvent;
import IFML.Mobile.MicrophoneAction;
import IFML.Mobile.MicrophoneActionEvent;
import IFML.Mobile.MobileAction;
import IFML.Mobile.MobileActionEvent;
import IFML.Mobile.MobileComponent;
import IFML.Mobile.MobileElementEvent;
import IFML.Mobile.MobileFactory;
import IFML.Mobile.MobilePackage;
import IFML.Mobile.MobileSystemEvent;
import IFML.Mobile.Screen;
import IFML.Mobile.StorageEvent;
import IFML.Mobile.ToolBar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MobilePackageImpl extends EPackageImpl implements MobilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolBarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobileComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobileElementEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobileSystemEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batteryEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobileActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cameraActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microphoneActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobileActionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cameraActionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microphoneActionEventEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see IFML.Mobile.MobilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MobilePackageImpl() {
		super(eNS_URI, MobileFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MobilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MobilePackage init() {
		if (isInited) return (MobilePackage)EPackage.Registry.INSTANCE.getEPackage(MobilePackage.eNS_URI);

		// Obtain or create and register package
		MobilePackageImpl theMobilePackage = (MobilePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MobilePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MobilePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) instanceof DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) : DataTypesPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		ExtensionsPackageImpl theExtensionsPackage = (ExtensionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtensionsPackage.eNS_URI) instanceof ExtensionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtensionsPackage.eNS_URI) : ExtensionsPackage.eINSTANCE);

		// Create package meta-data objects
		theMobilePackage.createPackageContents();
		theDataTypesPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theExtensionsPackage.createPackageContents();

		// Initialize created meta-data
		theMobilePackage.initializePackageContents();
		theDataTypesPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theExtensionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMobilePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MobilePackage.eNS_URI, theMobilePackage);
		return theMobilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScreen() {
		return screenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolBar() {
		return toolBarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobileComponent() {
		return mobileComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobileElementEvent() {
		return mobileElementEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobileSystemEvent() {
		return mobileSystemEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatteryEvent() {
		return batteryEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageEvent() {
		return storageEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobileAction() {
		return mobileActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCameraAction() {
		return cameraActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicrophoneAction() {
		return microphoneActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobileActionEvent() {
		return mobileActionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCameraActionEvent() {
		return cameraActionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicrophoneActionEvent() {
		return microphoneActionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobileFactory getMobileFactory() {
		return (MobileFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		screenEClass = createEClass(SCREEN);

		toolBarEClass = createEClass(TOOL_BAR);

		mobileComponentEClass = createEClass(MOBILE_COMPONENT);

		mobileElementEventEClass = createEClass(MOBILE_ELEMENT_EVENT);

		mobileSystemEventEClass = createEClass(MOBILE_SYSTEM_EVENT);

		batteryEventEClass = createEClass(BATTERY_EVENT);

		storageEventEClass = createEClass(STORAGE_EVENT);

		mobileActionEClass = createEClass(MOBILE_ACTION);

		cameraActionEClass = createEClass(CAMERA_ACTION);

		microphoneActionEClass = createEClass(MICROPHONE_ACTION);

		mobileActionEventEClass = createEClass(MOBILE_ACTION_EVENT);

		cameraActionEventEClass = createEClass(CAMERA_ACTION_EVENT);

		microphoneActionEventEClass = createEClass(MICROPHONE_ACTION_EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		screenEClass.getESuperTypes().add(theCorePackage.getViewContainer());
		toolBarEClass.getESuperTypes().add(theCorePackage.getViewContainer());
		mobileComponentEClass.getESuperTypes().add(theCorePackage.getViewComponent());
		mobileElementEventEClass.getESuperTypes().add(theCorePackage.getViewElementEvent());
		mobileSystemEventEClass.getESuperTypes().add(theCorePackage.getSystemEvent());
		batteryEventEClass.getESuperTypes().add(this.getMobileSystemEvent());
		storageEventEClass.getESuperTypes().add(this.getMobileSystemEvent());
		mobileActionEClass.getESuperTypes().add(theCorePackage.getIFMLAction());
		cameraActionEClass.getESuperTypes().add(this.getMobileAction());
		microphoneActionEClass.getESuperTypes().add(this.getMobileAction());
		mobileActionEventEClass.getESuperTypes().add(theCorePackage.getActionEvent());
		cameraActionEventEClass.getESuperTypes().add(this.getMobileActionEvent());
		microphoneActionEventEClass.getESuperTypes().add(this.getMobileActionEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(screenEClass, Screen.class, "Screen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toolBarEClass, ToolBar.class, "ToolBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobileComponentEClass, MobileComponent.class, "MobileComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobileElementEventEClass, MobileElementEvent.class, "MobileElementEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobileSystemEventEClass, MobileSystemEvent.class, "MobileSystemEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(batteryEventEClass, BatteryEvent.class, "BatteryEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storageEventEClass, StorageEvent.class, "StorageEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobileActionEClass, MobileAction.class, "MobileAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cameraActionEClass, CameraAction.class, "CameraAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(microphoneActionEClass, MicrophoneAction.class, "MicrophoneAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobileActionEventEClass, MobileActionEvent.class, "MobileActionEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cameraActionEventEClass, CameraActionEvent.class, "CameraActionEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(microphoneActionEventEClass, MicrophoneActionEvent.class, "MicrophoneActionEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MobilePackageImpl
