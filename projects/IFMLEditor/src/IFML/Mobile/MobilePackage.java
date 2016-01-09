/**
 */
package IFML.Mobile;

import IFML.Core.CorePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see IFML.Mobile.MobileFactory
 * @model kind="package"
 * @generated
 */
public interface MobilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Mobile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/20130218/mobile";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mobile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MobilePackage eINSTANCE = IFML.Mobile.impl.MobilePackageImpl.init();

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.ScreenImpl <em>Screen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.ScreenImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getScreen()
	 * @generated
	 */
	int SCREEN = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__ID = CorePackage.VIEW_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__CONSTRAINTS = CorePackage.VIEW_CONTAINER__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__ANNOTATIONS = CorePackage.VIEW_CONTAINER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__NAME = CorePackage.VIEW_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__PARAMETERS = CorePackage.VIEW_CONTAINER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__OUT_INTERACTION_FLOWS = CorePackage.VIEW_CONTAINER__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__IN_INTERACTION_FLOWS = CorePackage.VIEW_CONTAINER__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_CONTAINER__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__ACTIVATION_EXPRESSION = CorePackage.VIEW_CONTAINER__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__VIEW_CONTAINER = CorePackage.VIEW_CONTAINER__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>Is Landmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__IS_LANDMARK = CorePackage.VIEW_CONTAINER__IS_LANDMARK;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__IS_DEFAULT = CorePackage.VIEW_CONTAINER__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Is XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__IS_XOR = CorePackage.VIEW_CONTAINER__IS_XOR;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__VIEW_ELEMENTS = CorePackage.VIEW_CONTAINER__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__ACTIONS = CorePackage.VIEW_CONTAINER__ACTIONS;

	/**
	 * The number of structural features of the '<em>Screen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_FEATURE_COUNT = CorePackage.VIEW_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Screen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OPERATION_COUNT = CorePackage.VIEW_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.ToolBarImpl <em>Tool Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.ToolBarImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getToolBar()
	 * @generated
	 */
	int TOOL_BAR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR__ID = CorePackage.VIEW_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR__CONSTRAINTS = CorePackage.VIEW_CONTAINER__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR__ANNOTATIONS = CorePackage.VIEW_CONTAINER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR__NAME = CorePackage.VIEW_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR__PARAMETERS = CorePackage.VIEW_CONTAINER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR__OUT_INTERACTION_FLOWS = CorePackage.VIEW_CONTAINER__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR__IN_INTERACTION_FLOWS = CorePackage.VIEW_CONTAINER__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_CONTAINER__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR__ACTIVATION_EXPRESSION = CorePackage.VIEW_CONTAINER__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR__VIEW_CONTAINER = CorePackage.VIEW_CONTAINER__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>Is Landmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR__IS_LANDMARK = CorePackage.VIEW_CONTAINER__IS_LANDMARK;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR__IS_DEFAULT = CorePackage.VIEW_CONTAINER__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Is XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR__IS_XOR = CorePackage.VIEW_CONTAINER__IS_XOR;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR__VIEW_ELEMENTS = CorePackage.VIEW_CONTAINER__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR__ACTIONS = CorePackage.VIEW_CONTAINER__ACTIONS;

	/**
	 * The number of structural features of the '<em>Tool Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR_FEATURE_COUNT = CorePackage.VIEW_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tool Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR_OPERATION_COUNT = CorePackage.VIEW_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MobileComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MobileComponentImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileComponent()
	 * @generated
	 */
	int MOBILE_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_COMPONENT__ID = CorePackage.VIEW_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_COMPONENT__CONSTRAINTS = CorePackage.VIEW_COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_COMPONENT__ANNOTATIONS = CorePackage.VIEW_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_COMPONENT__NAME = CorePackage.VIEW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_COMPONENT__PARAMETERS = CorePackage.VIEW_COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_COMPONENT__OUT_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_COMPONENT__IN_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_COMPONENT__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_COMPONENT__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_COMPONENT__ACTIVATION_EXPRESSION = CorePackage.VIEW_COMPONENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_COMPONENT__VIEW_CONTAINER = CorePackage.VIEW_COMPONENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_COMPONENT__VIEW_COMPONENT_PARTS = CorePackage.VIEW_COMPONENT__VIEW_COMPONENT_PARTS;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_COMPONENT_FEATURE_COUNT = CorePackage.VIEW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_COMPONENT_OPERATION_COUNT = CorePackage.VIEW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MobileElementEventImpl <em>Element Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MobileElementEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileElementEvent()
	 * @generated
	 */
	int MOBILE_ELEMENT_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ELEMENT_EVENT__ID = CorePackage.VIEW_ELEMENT_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ELEMENT_EVENT__CONSTRAINTS = CorePackage.VIEW_ELEMENT_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ELEMENT_EVENT__ANNOTATIONS = CorePackage.VIEW_ELEMENT_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ELEMENT_EVENT__NAME = CorePackage.VIEW_ELEMENT_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ELEMENT_EVENT__PARAMETERS = CorePackage.VIEW_ELEMENT_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ELEMENT_EVENT__OUT_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ELEMENT_EVENT__IN_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ELEMENT_EVENT__ACTIVATION_EXPRESSION = CorePackage.VIEW_ELEMENT_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ELEMENT_EVENT__INTERACTION_FLOW_EXPRESSION = CorePackage.VIEW_ELEMENT_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ELEMENT_EVENT__VIEW_ELEMENT = CorePackage.VIEW_ELEMENT_EVENT__VIEW_ELEMENT;

	/**
	 * The number of structural features of the '<em>Element Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ELEMENT_EVENT_FEATURE_COUNT = CorePackage.VIEW_ELEMENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Element Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ELEMENT_EVENT_OPERATION_COUNT = CorePackage.VIEW_ELEMENT_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MobileSystemEventImpl <em>System Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MobileSystemEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileSystemEvent()
	 * @generated
	 */
	int MOBILE_SYSTEM_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT__ID = CorePackage.SYSTEM_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT__CONSTRAINTS = CorePackage.SYSTEM_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT__ANNOTATIONS = CorePackage.SYSTEM_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT__NAME = CorePackage.SYSTEM_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT__PARAMETERS = CorePackage.SYSTEM_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT__OUT_INTERACTION_FLOWS = CorePackage.SYSTEM_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT__IN_INTERACTION_FLOWS = CorePackage.SYSTEM_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT__ACTIVATION_EXPRESSION = CorePackage.SYSTEM_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT__INTERACTION_FLOW_EXPRESSION = CorePackage.SYSTEM_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Triggering Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT__TRIGGERING_EXPRESSIONS = CorePackage.SYSTEM_EVENT__TRIGGERING_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT__TYPE = CorePackage.SYSTEM_EVENT__TYPE;

	/**
	 * The number of structural features of the '<em>System Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT_FEATURE_COUNT = CorePackage.SYSTEM_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>System Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT_OPERATION_COUNT = CorePackage.SYSTEM_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.BatteryEventImpl <em>Battery Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.BatteryEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getBatteryEvent()
	 * @generated
	 */
	int BATTERY_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT__ID = MOBILE_SYSTEM_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT__CONSTRAINTS = MOBILE_SYSTEM_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT__ANNOTATIONS = MOBILE_SYSTEM_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT__NAME = MOBILE_SYSTEM_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT__PARAMETERS = MOBILE_SYSTEM_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT__OUT_INTERACTION_FLOWS = MOBILE_SYSTEM_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT__IN_INTERACTION_FLOWS = MOBILE_SYSTEM_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT__ACTIVATION_EXPRESSION = MOBILE_SYSTEM_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT__INTERACTION_FLOW_EXPRESSION = MOBILE_SYSTEM_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Triggering Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT__TRIGGERING_EXPRESSIONS = MOBILE_SYSTEM_EVENT__TRIGGERING_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT__TYPE = MOBILE_SYSTEM_EVENT__TYPE;

	/**
	 * The number of structural features of the '<em>Battery Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT_FEATURE_COUNT = MOBILE_SYSTEM_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Battery Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT_OPERATION_COUNT = MOBILE_SYSTEM_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.StorageEventImpl <em>Storage Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.StorageEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getStorageEvent()
	 * @generated
	 */
	int STORAGE_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_EVENT__ID = MOBILE_SYSTEM_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_EVENT__CONSTRAINTS = MOBILE_SYSTEM_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_EVENT__ANNOTATIONS = MOBILE_SYSTEM_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_EVENT__NAME = MOBILE_SYSTEM_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_EVENT__PARAMETERS = MOBILE_SYSTEM_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_EVENT__OUT_INTERACTION_FLOWS = MOBILE_SYSTEM_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_EVENT__IN_INTERACTION_FLOWS = MOBILE_SYSTEM_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_EVENT__ACTIVATION_EXPRESSION = MOBILE_SYSTEM_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_EVENT__INTERACTION_FLOW_EXPRESSION = MOBILE_SYSTEM_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Triggering Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_EVENT__TRIGGERING_EXPRESSIONS = MOBILE_SYSTEM_EVENT__TRIGGERING_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_EVENT__TYPE = MOBILE_SYSTEM_EVENT__TYPE;

	/**
	 * The number of structural features of the '<em>Storage Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_EVENT_FEATURE_COUNT = MOBILE_SYSTEM_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Storage Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_EVENT_OPERATION_COUNT = MOBILE_SYSTEM_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MobileActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MobileActionImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileAction()
	 * @generated
	 */
	int MOBILE_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION__ID = CorePackage.IFML_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION__CONSTRAINTS = CorePackage.IFML_ACTION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION__ANNOTATIONS = CorePackage.IFML_ACTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION__NAME = CorePackage.IFML_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION__PARAMETERS = CorePackage.IFML_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION__OUT_INTERACTION_FLOWS = CorePackage.IFML_ACTION__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION__IN_INTERACTION_FLOWS = CorePackage.IFML_ACTION__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Action Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION__ACTION_EVENTS = CorePackage.IFML_ACTION__ACTION_EVENTS;

	/**
	 * The feature id for the '<em><b>Dynamic Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION__DYNAMIC_BEHAVIOR = CorePackage.IFML_ACTION__DYNAMIC_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION__VIEW_CONTAINER = CorePackage.IFML_ACTION__VIEW_CONTAINER;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_FEATURE_COUNT = CorePackage.IFML_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_OPERATION_COUNT = CorePackage.IFML_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.CameraActionImpl <em>Camera Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.CameraActionImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getCameraAction()
	 * @generated
	 */
	int CAMERA_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION__ID = MOBILE_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION__CONSTRAINTS = MOBILE_ACTION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION__ANNOTATIONS = MOBILE_ACTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION__NAME = MOBILE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION__PARAMETERS = MOBILE_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION__OUT_INTERACTION_FLOWS = MOBILE_ACTION__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION__IN_INTERACTION_FLOWS = MOBILE_ACTION__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Action Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION__ACTION_EVENTS = MOBILE_ACTION__ACTION_EVENTS;

	/**
	 * The feature id for the '<em><b>Dynamic Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION__DYNAMIC_BEHAVIOR = MOBILE_ACTION__DYNAMIC_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION__VIEW_CONTAINER = MOBILE_ACTION__VIEW_CONTAINER;

	/**
	 * The number of structural features of the '<em>Camera Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_FEATURE_COUNT = MOBILE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Camera Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_OPERATION_COUNT = MOBILE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MicrophoneActionImpl <em>Microphone Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MicrophoneActionImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMicrophoneAction()
	 * @generated
	 */
	int MICROPHONE_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION__ID = MOBILE_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION__CONSTRAINTS = MOBILE_ACTION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION__ANNOTATIONS = MOBILE_ACTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION__NAME = MOBILE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION__PARAMETERS = MOBILE_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION__OUT_INTERACTION_FLOWS = MOBILE_ACTION__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION__IN_INTERACTION_FLOWS = MOBILE_ACTION__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Action Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION__ACTION_EVENTS = MOBILE_ACTION__ACTION_EVENTS;

	/**
	 * The feature id for the '<em><b>Dynamic Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION__DYNAMIC_BEHAVIOR = MOBILE_ACTION__DYNAMIC_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION__VIEW_CONTAINER = MOBILE_ACTION__VIEW_CONTAINER;

	/**
	 * The number of structural features of the '<em>Microphone Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_FEATURE_COUNT = MOBILE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Microphone Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_OPERATION_COUNT = MOBILE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MobileActionEventImpl <em>Action Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MobileActionEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileActionEvent()
	 * @generated
	 */
	int MOBILE_ACTION_EVENT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_EVENT__ID = CorePackage.ACTION_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_EVENT__CONSTRAINTS = CorePackage.ACTION_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_EVENT__ANNOTATIONS = CorePackage.ACTION_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_EVENT__NAME = CorePackage.ACTION_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_EVENT__PARAMETERS = CorePackage.ACTION_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_EVENT__OUT_INTERACTION_FLOWS = CorePackage.ACTION_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_EVENT__IN_INTERACTION_FLOWS = CorePackage.ACTION_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_EVENT__ACTIVATION_EXPRESSION = CorePackage.ACTION_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_EVENT__INTERACTION_FLOW_EXPRESSION = CorePackage.ACTION_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Action Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_EVENT_FEATURE_COUNT = CorePackage.ACTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_EVENT_OPERATION_COUNT = CorePackage.ACTION_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.CameraActionEventImpl <em>Camera Action Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.CameraActionEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getCameraActionEvent()
	 * @generated
	 */
	int CAMERA_ACTION_EVENT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT__ID = MOBILE_ACTION_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT__CONSTRAINTS = MOBILE_ACTION_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT__ANNOTATIONS = MOBILE_ACTION_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT__NAME = MOBILE_ACTION_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT__PARAMETERS = MOBILE_ACTION_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT__OUT_INTERACTION_FLOWS = MOBILE_ACTION_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT__IN_INTERACTION_FLOWS = MOBILE_ACTION_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT__ACTIVATION_EXPRESSION = MOBILE_ACTION_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT__INTERACTION_FLOW_EXPRESSION = MOBILE_ACTION_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Camera Action Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT_FEATURE_COUNT = MOBILE_ACTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Camera Action Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT_OPERATION_COUNT = MOBILE_ACTION_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MicrophoneActionEventImpl <em>Microphone Action Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MicrophoneActionEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMicrophoneActionEvent()
	 * @generated
	 */
	int MICROPHONE_ACTION_EVENT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT__ID = MOBILE_ACTION_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT__CONSTRAINTS = MOBILE_ACTION_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT__ANNOTATIONS = MOBILE_ACTION_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT__NAME = MOBILE_ACTION_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT__PARAMETERS = MOBILE_ACTION_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT__OUT_INTERACTION_FLOWS = MOBILE_ACTION_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT__IN_INTERACTION_FLOWS = MOBILE_ACTION_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT__ACTIVATION_EXPRESSION = MOBILE_ACTION_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT__INTERACTION_FLOW_EXPRESSION = MOBILE_ACTION_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Microphone Action Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT_FEATURE_COUNT = MOBILE_ACTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Microphone Action Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT_OPERATION_COUNT = MOBILE_ACTION_EVENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link IFML.Mobile.Screen <em>Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screen</em>'.
	 * @see IFML.Mobile.Screen
	 * @generated
	 */
	EClass getScreen();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.ToolBar <em>Tool Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Bar</em>'.
	 * @see IFML.Mobile.ToolBar
	 * @generated
	 */
	EClass getToolBar();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MobileComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see IFML.Mobile.MobileComponent
	 * @generated
	 */
	EClass getMobileComponent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MobileElementEvent <em>Element Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Event</em>'.
	 * @see IFML.Mobile.MobileElementEvent
	 * @generated
	 */
	EClass getMobileElementEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MobileSystemEvent <em>System Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Event</em>'.
	 * @see IFML.Mobile.MobileSystemEvent
	 * @generated
	 */
	EClass getMobileSystemEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.BatteryEvent <em>Battery Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery Event</em>'.
	 * @see IFML.Mobile.BatteryEvent
	 * @generated
	 */
	EClass getBatteryEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.StorageEvent <em>Storage Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Event</em>'.
	 * @see IFML.Mobile.StorageEvent
	 * @generated
	 */
	EClass getStorageEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MobileAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see IFML.Mobile.MobileAction
	 * @generated
	 */
	EClass getMobileAction();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.CameraAction <em>Camera Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera Action</em>'.
	 * @see IFML.Mobile.CameraAction
	 * @generated
	 */
	EClass getCameraAction();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MicrophoneAction <em>Microphone Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microphone Action</em>'.
	 * @see IFML.Mobile.MicrophoneAction
	 * @generated
	 */
	EClass getMicrophoneAction();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MobileActionEvent <em>Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Event</em>'.
	 * @see IFML.Mobile.MobileActionEvent
	 * @generated
	 */
	EClass getMobileActionEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.CameraActionEvent <em>Camera Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera Action Event</em>'.
	 * @see IFML.Mobile.CameraActionEvent
	 * @generated
	 */
	EClass getCameraActionEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MicrophoneActionEvent <em>Microphone Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microphone Action Event</em>'.
	 * @see IFML.Mobile.MicrophoneActionEvent
	 * @generated
	 */
	EClass getMicrophoneActionEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MobileFactory getMobileFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.ScreenImpl <em>Screen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.ScreenImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getScreen()
		 * @generated
		 */
		EClass SCREEN = eINSTANCE.getScreen();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.ToolBarImpl <em>Tool Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.ToolBarImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getToolBar()
		 * @generated
		 */
		EClass TOOL_BAR = eINSTANCE.getToolBar();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MobileComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MobileComponentImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileComponent()
		 * @generated
		 */
		EClass MOBILE_COMPONENT = eINSTANCE.getMobileComponent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MobileElementEventImpl <em>Element Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MobileElementEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileElementEvent()
		 * @generated
		 */
		EClass MOBILE_ELEMENT_EVENT = eINSTANCE.getMobileElementEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MobileSystemEventImpl <em>System Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MobileSystemEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileSystemEvent()
		 * @generated
		 */
		EClass MOBILE_SYSTEM_EVENT = eINSTANCE.getMobileSystemEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.BatteryEventImpl <em>Battery Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.BatteryEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getBatteryEvent()
		 * @generated
		 */
		EClass BATTERY_EVENT = eINSTANCE.getBatteryEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.StorageEventImpl <em>Storage Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.StorageEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getStorageEvent()
		 * @generated
		 */
		EClass STORAGE_EVENT = eINSTANCE.getStorageEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MobileActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MobileActionImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileAction()
		 * @generated
		 */
		EClass MOBILE_ACTION = eINSTANCE.getMobileAction();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.CameraActionImpl <em>Camera Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.CameraActionImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getCameraAction()
		 * @generated
		 */
		EClass CAMERA_ACTION = eINSTANCE.getCameraAction();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MicrophoneActionImpl <em>Microphone Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MicrophoneActionImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMicrophoneAction()
		 * @generated
		 */
		EClass MICROPHONE_ACTION = eINSTANCE.getMicrophoneAction();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MobileActionEventImpl <em>Action Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MobileActionEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileActionEvent()
		 * @generated
		 */
		EClass MOBILE_ACTION_EVENT = eINSTANCE.getMobileActionEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.CameraActionEventImpl <em>Camera Action Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.CameraActionEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getCameraActionEvent()
		 * @generated
		 */
		EClass CAMERA_ACTION_EVENT = eINSTANCE.getCameraActionEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MicrophoneActionEventImpl <em>Microphone Action Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MicrophoneActionEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMicrophoneActionEvent()
		 * @generated
		 */
		EClass MICROPHONE_ACTION_EVENT = eINSTANCE.getMicrophoneActionEvent();

	}

} //MobilePackage
