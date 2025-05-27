/**
 */
package Manufacturing;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Manufacturing.ProcessStep#getSubManufacturingsystem <em>Sub Manufacturingsystem</em>}</li>
 *   <li>{@link Manufacturing.ProcessStep#getInputConditon <em>Input Conditon</em>}</li>
 *   <li>{@link Manufacturing.ProcessStep#getOutputWorkpiece <em>Output Workpiece</em>}</li>
 * </ul>
 *
 * @see Manufacturing.ManufacturingPackage#getProcessStep()
 * @model
 * @generated
 */
public interface ProcessStep extends Step {
	/**
	 * Returns the value of the '<em><b>Sub Manufacturingsystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Manufacturingsystem</em>' containment reference.
	 * @see #setSubManufacturingsystem(ManufacturingSystem)
	 * @see Manufacturing.ManufacturingPackage#getProcessStep_SubManufacturingsystem()
	 * @model containment="true"
	 * @generated
	 */
	ManufacturingSystem getSubManufacturingsystem();

	/**
	 * Sets the value of the '{@link Manufacturing.ProcessStep#getSubManufacturingsystem <em>Sub Manufacturingsystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Manufacturingsystem</em>' containment reference.
	 * @see #getSubManufacturingsystem()
	 * @generated
	 */
	void setSubManufacturingsystem(ManufacturingSystem value);

	/**
	 * Returns the value of the '<em><b>Input Conditon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Conditon</em>' containment reference.
	 * @see #setInputConditon(Conditon)
	 * @see Manufacturing.ManufacturingPackage#getProcessStep_InputConditon()
	 * @model containment="true"
	 * @generated
	 */
	Conditon getInputConditon();

	/**
	 * Sets the value of the '{@link Manufacturing.ProcessStep#getInputConditon <em>Input Conditon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Conditon</em>' containment reference.
	 * @see #getInputConditon()
	 * @generated
	 */
	void setInputConditon(Conditon value);

	/**
	 * Returns the value of the '<em><b>Output Workpiece</b></em>' containment reference list.
	 * The list contents are of type {@link Manufacturing.WorkPiece}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Workpiece</em>' containment reference list.
	 * @see Manufacturing.ManufacturingPackage#getProcessStep_OutputWorkpiece()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<WorkPiece> getOutputWorkpiece();

} // ProcessStep
