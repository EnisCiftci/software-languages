/**
 */
package Manufacturing.util;

import Manufacturing.*;

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
 * @see Manufacturing.ManufacturingPackage
 * @generated
 */
public class ManufacturingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ManufacturingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturingSwitch() {
		if (modelPackage == null) {
			modelPackage = ManufacturingPackage.eINSTANCE;
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
			case ManufacturingPackage.MANUFACTURING_SYSTEM: {
				ManufacturingSystem manufacturingSystem = (ManufacturingSystem)theEObject;
				T result = caseManufacturingSystem(manufacturingSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingPackage.WORK_PIECE: {
				WorkPiece workPiece = (WorkPiece)theEObject;
				T result = caseWorkPiece(workPiece);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingPackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingPackage.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingPackage.CONDITON: {
				Conditon conditon = (Conditon)theEObject;
				T result = caseConditon(conditon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingPackage.UNARY_CONDITION: {
				UnaryCondition unaryCondition = (UnaryCondition)theEObject;
				T result = caseUnaryCondition(unaryCondition);
				if (result == null) result = caseConditon(unaryCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingPackage.WORK_PIECE_TYPE_CONDITION: {
				WorkPieceTypeCondition workPieceTypeCondition = (WorkPieceTypeCondition)theEObject;
				T result = caseWorkPieceTypeCondition(workPieceTypeCondition);
				if (result == null) result = caseConditon(workPieceTypeCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingPackage.BINARY_CONDITION: {
				BinaryCondition binaryCondition = (BinaryCondition)theEObject;
				T result = caseBinaryCondition(binaryCondition);
				if (result == null) result = caseConditon(binaryCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingPackage.PROCESS_STEP: {
				ProcessStep processStep = (ProcessStep)theEObject;
				T result = caseProcessStep(processStep);
				if (result == null) result = caseStep(processStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingPackage.TRANSPORT_STEP: {
				TransportStep transportStep = (TransportStep)theEObject;
				T result = caseTransportStep(transportStep);
				if (result == null) result = caseStep(transportStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingPackage.QUALITY_ASSURANCE_STEP: {
				QualityAssuranceStep qualityAssuranceStep = (QualityAssuranceStep)theEObject;
				T result = caseQualityAssuranceStep(qualityAssuranceStep);
				if (result == null) result = caseStep(qualityAssuranceStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingPackage.WORK_PIECE_TYPE: {
				WorkPieceType workPieceType = (WorkPieceType)theEObject;
				T result = caseWorkPieceType(workPieceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingPackage.STORAGE_FACILITY: {
				StorageFacility storageFacility = (StorageFacility)theEObject;
				T result = caseStorageFacility(storageFacility);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManufacturingSystem(ManufacturingSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Piece</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Piece</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkPiece(WorkPiece object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditon(Conditon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryCondition(UnaryCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Piece Type Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Piece Type Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkPieceTypeCondition(WorkPieceTypeCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryCondition(BinaryCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessStep(ProcessStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportStep(TransportStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Assurance Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Assurance Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualityAssuranceStep(QualityAssuranceStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Piece Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Piece Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkPieceType(WorkPieceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Facility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Facility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageFacility(StorageFacility object) {
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

} //ManufacturingSwitch
