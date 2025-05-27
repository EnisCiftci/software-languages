/**
 */
package Manufacturing;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Manufacturing.ManufacturingSystem#getName <em>Name</em>}</li>
 *   <li>{@link Manufacturing.ManufacturingSystem#getStart <em>Start</em>}</li>
 *   <li>{@link Manufacturing.ManufacturingSystem#getEnd <em>End</em>}</li>
 *   <li>{@link Manufacturing.ManufacturingSystem#getSteps <em>Steps</em>}</li>
 *   <li>{@link Manufacturing.ManufacturingSystem#getMitarbeiter <em>Mitarbeiter</em>}</li>
 * </ul>
 *
 * @see Manufacturing.ManufacturingPackage#getManufacturingSystem()
 * @model
 * @generated
 */
public interface ManufacturingSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Manufacturing.ManufacturingPackage#getManufacturingSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Manufacturing.ManufacturingSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(StorageFacility)
	 * @see Manufacturing.ManufacturingPackage#getManufacturingSystem_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StorageFacility getStart();

	/**
	 * Sets the value of the '{@link Manufacturing.ManufacturingSystem#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(StorageFacility value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(StorageFacility)
	 * @see Manufacturing.ManufacturingPackage#getManufacturingSystem_End()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StorageFacility getEnd();

	/**
	 * Sets the value of the '{@link Manufacturing.ManufacturingSystem#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(StorageFacility value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link Manufacturing.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see Manufacturing.ManufacturingPackage#getManufacturingSystem_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * Returns the value of the '<em><b>Mitarbeiter</b></em>' containment reference list.
	 * The list contents are of type {@link Manufacturing.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitarbeiter</em>' containment reference list.
	 * @see Manufacturing.ManufacturingPackage#getManufacturingSystem_Mitarbeiter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getMitarbeiter();

} // ManufacturingSystem
