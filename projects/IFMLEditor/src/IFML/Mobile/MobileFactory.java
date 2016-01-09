/**
 */
package IFML.Mobile;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see IFML.Mobile.MobilePackage
 * @generated
 */
public interface MobileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MobileFactory eINSTANCE = IFML.Mobile.impl.MobileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Screen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Screen</em>'.
	 * @generated
	 */
	Screen createScreen();

	/**
	 * Returns a new object of class '<em>Tool Bar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool Bar</em>'.
	 * @generated
	 */
	ToolBar createToolBar();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	MobileComponent createMobileComponent();

	/**
	 * Returns a new object of class '<em>Element Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Event</em>'.
	 * @generated
	 */
	MobileElementEvent createMobileElementEvent();

	/**
	 * Returns a new object of class '<em>System Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Event</em>'.
	 * @generated
	 */
	MobileSystemEvent createMobileSystemEvent();

	/**
	 * Returns a new object of class '<em>Battery Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Battery Event</em>'.
	 * @generated
	 */
	BatteryEvent createBatteryEvent();

	/**
	 * Returns a new object of class '<em>Storage Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Event</em>'.
	 * @generated
	 */
	StorageEvent createStorageEvent();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	MobileAction createMobileAction();

	/**
	 * Returns a new object of class '<em>Camera Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera Action</em>'.
	 * @generated
	 */
	CameraAction createCameraAction();

	/**
	 * Returns a new object of class '<em>Microphone Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microphone Action</em>'.
	 * @generated
	 */
	MicrophoneAction createMicrophoneAction();

	/**
	 * Returns a new object of class '<em>Action Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Event</em>'.
	 * @generated
	 */
	MobileActionEvent createMobileActionEvent();

	/**
	 * Returns a new object of class '<em>Camera Action Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera Action Event</em>'.
	 * @generated
	 */
	CameraActionEvent createCameraActionEvent();

	/**
	 * Returns a new object of class '<em>Microphone Action Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microphone Action Event</em>'.
	 * @generated
	 */
	MicrophoneActionEvent createMicrophoneActionEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MobilePackage getMobilePackage();

} //MobileFactory
