/**
 */
package Manufacturing;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Manufacturing.Step#getDuration <em>Duration</em>}</li>
 *   <li>{@link Manufacturing.Step#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link Manufacturing.Step#getInputWorkpiece <em>Input Workpiece</em>}</li>
 *   <li>{@link Manufacturing.Step#getOutputWorkpiece <em>Output Workpiece</em>}</li>
 * </ul>
 *
 * @see Manufacturing.ManufacturingPackage#getStep()
 * @model abstract="true"
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see Manufacturing.ManufacturingPackage#getStep_Duration()
	 * @model
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link Manufacturing.Step#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible</em>' reference.
	 * @see #setResponsible(Person)
	 * @see Manufacturing.ManufacturingPackage#getStep_Responsible()
	 * @model
	 * @generated
	 */
	Person getResponsible();

	/**
	 * Sets the value of the '{@link Manufacturing.Step#getResponsible <em>Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(Person value);

	/**
	 * Returns the value of the '<em><b>Input Workpiece</b></em>' reference list.
	 * The list contents are of type {@link Manufacturing.WorkPiece}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Workpiece</em>' reference list.
	 * @see Manufacturing.ManufacturingPackage#getStep_InputWorkpiece()
	 * @model required="true"
	 * @generated
	 */
	EList<WorkPiece> getInputWorkpiece();

	/**
	 * Returns the value of the '<em><b>Output Workpiece</b></em>' reference list.
	 * The list contents are of type {@link Manufacturing.WorkPiece}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Workpiece</em>' reference list.
	 * @see Manufacturing.ManufacturingPackage#getStep_OutputWorkpiece()
	 * @model required="true"
	 * @generated
	 */
	EList<WorkPiece> getOutputWorkpiece();

} // Step
