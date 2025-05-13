/**
 */
package Manufacturing;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see Manufacturing.ManufacturingFactory
 * @model kind="package"
 * @generated
 */
public interface ManufacturingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Manufacturing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://manufacturing.org/DSL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "manufacturing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ManufacturingPackage eINSTANCE = Manufacturing.impl.ManufacturingPackageImpl.init();

	/**
	 * The meta object id for the '{@link Manufacturing.impl.ManufacturingSystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacturing.impl.ManufacturingSystemImpl
	 * @see Manufacturing.impl.ManufacturingPackageImpl#getManufacturingSystem()
	 * @generated
	 */
	int MANUFACTURING_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM__START = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM__END = 2;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM__STEPS = 3;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Manufacturing.impl.WorkPieceImpl <em>Work Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacturing.impl.WorkPieceImpl
	 * @see Manufacturing.impl.ManufacturingPackageImpl#getWorkPiece()
	 * @generated
	 */
	int WORK_PIECE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE__ID = 1;

	/**
	 * The number of structural features of the '<em>Work Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Work Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Manufacturing.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacturing.impl.PersonImpl
	 * @see Manufacturing.impl.ManufacturingPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Manufacturing.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacturing.impl.StepImpl
	 * @see Manufacturing.impl.ManufacturingPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__DURATION = 0;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__RESPONSIBLE = 1;

	/**
	 * The feature id for the '<em><b>Input Workpiece</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__INPUT_WORKPIECE = 2;

	/**
	 * The feature id for the '<em><b>Output Workpiece</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OUTPUT_WORKPIECE = 3;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Manufacturing.impl.ConditonImpl <em>Conditon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacturing.impl.ConditonImpl
	 * @see Manufacturing.impl.ManufacturingPackageImpl#getConditon()
	 * @generated
	 */
	int CONDITON = 4;

	/**
	 * The number of structural features of the '<em>Conditon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITON_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Conditon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Manufacturing.impl.UnaryConditionImpl <em>Unary Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacturing.impl.UnaryConditionImpl
	 * @see Manufacturing.impl.ManufacturingPackageImpl#getUnaryCondition()
	 * @generated
	 */
	int UNARY_CONDITION = 5;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_CONDITION__OPERATOR = CONDITON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conditon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_CONDITION__CONDITON = CONDITON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_CONDITION_FEATURE_COUNT = CONDITON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unary Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_CONDITION_OPERATION_COUNT = CONDITON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Manufacturing.impl.WorkPieceTypeConditionImpl <em>Work Piece Type Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacturing.impl.WorkPieceTypeConditionImpl
	 * @see Manufacturing.impl.ManufacturingPackageImpl#getWorkPieceTypeCondition()
	 * @generated
	 */
	int WORK_PIECE_TYPE_CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_TYPE_CONDITION__TYPE = CONDITON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work Piece Type Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_TYPE_CONDITION_FEATURE_COUNT = CONDITON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Work Piece Type Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_TYPE_CONDITION_OPERATION_COUNT = CONDITON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Manufacturing.impl.BinaryConditionImpl <em>Binary Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacturing.impl.BinaryConditionImpl
	 * @see Manufacturing.impl.ManufacturingPackageImpl#getBinaryCondition()
	 * @generated
	 */
	int BINARY_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONDITION__OPERATOR = CONDITON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Conditon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONDITION__LEFT_CONDITON = CONDITON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Conditon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONDITION__RIGHT_CONDITON = CONDITON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONDITION_FEATURE_COUNT = CONDITON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONDITION_OPERATION_COUNT = CONDITON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Manufacturing.impl.ProcessStepImpl <em>Process Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacturing.impl.ProcessStepImpl
	 * @see Manufacturing.impl.ManufacturingPackageImpl#getProcessStep()
	 * @generated
	 */
	int PROCESS_STEP = 8;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__DURATION = STEP__DURATION;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__RESPONSIBLE = STEP__RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Input Workpiece</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__INPUT_WORKPIECE = STEP__INPUT_WORKPIECE;

	/**
	 * The feature id for the '<em><b>Output Workpiece</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__OUTPUT_WORKPIECE = STEP__OUTPUT_WORKPIECE;

	/**
	 * The feature id for the '<em><b>Sub Manufacturingsystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__SUB_MANUFACTURINGSYSTEM = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Conditon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__OUTPUT_CONDITON = STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Conditon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__INPUT_CONDITON = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Manufacturing.impl.TransportStepImpl <em>Transport Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacturing.impl.TransportStepImpl
	 * @see Manufacturing.impl.ManufacturingPackageImpl#getTransportStep()
	 * @generated
	 */
	int TRANSPORT_STEP = 9;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_STEP__DURATION = STEP__DURATION;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_STEP__RESPONSIBLE = STEP__RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Input Workpiece</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_STEP__INPUT_WORKPIECE = STEP__INPUT_WORKPIECE;

	/**
	 * The feature id for the '<em><b>Output Workpiece</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_STEP__OUTPUT_WORKPIECE = STEP__OUTPUT_WORKPIECE;

	/**
	 * The number of structural features of the '<em>Transport Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transport Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Manufacturing.impl.QualityAssuranceStepImpl <em>Quality Assurance Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacturing.impl.QualityAssuranceStepImpl
	 * @see Manufacturing.impl.ManufacturingPackageImpl#getQualityAssuranceStep()
	 * @generated
	 */
	int QUALITY_ASSURANCE_STEP = 10;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE_STEP__DURATION = STEP__DURATION;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE_STEP__RESPONSIBLE = STEP__RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Input Workpiece</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE_STEP__INPUT_WORKPIECE = STEP__INPUT_WORKPIECE;

	/**
	 * The feature id for the '<em><b>Output Workpiece</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE_STEP__OUTPUT_WORKPIECE = STEP__OUTPUT_WORKPIECE;

	/**
	 * The number of structural features of the '<em>Quality Assurance Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Quality Assurance Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Manufacturing.impl.WorkPieceTypeImpl <em>Work Piece Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacturing.impl.WorkPieceTypeImpl
	 * @see Manufacturing.impl.ManufacturingPackageImpl#getWorkPieceType()
	 * @generated
	 */
	int WORK_PIECE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Work Piece Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Work Piece Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Manufacturing.impl.StorageFacilityImpl <em>Storage Facility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacturing.impl.StorageFacilityImpl
	 * @see Manufacturing.impl.ManufacturingPackageImpl#getStorageFacility()
	 * @generated
	 */
	int STORAGE_FACILITY = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FACILITY__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FACILITY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FACILITY__STORAGE = 2;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FACILITY__TYPES = 3;

	/**
	 * The number of structural features of the '<em>Storage Facility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FACILITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Storage Facility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FACILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Manufacturing.UnaryOperator <em>Unary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacturing.UnaryOperator
	 * @see Manufacturing.impl.ManufacturingPackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 13;

	/**
	 * The meta object id for the '{@link Manufacturing.BinaryOperator <em>Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacturing.BinaryOperator
	 * @see Manufacturing.impl.ManufacturingPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 14;


	/**
	 * Returns the meta object for class '{@link Manufacturing.ManufacturingSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see Manufacturing.ManufacturingSystem
	 * @generated
	 */
	EClass getManufacturingSystem();

	/**
	 * Returns the meta object for the attribute '{@link Manufacturing.ManufacturingSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Manufacturing.ManufacturingSystem#getName()
	 * @see #getManufacturingSystem()
	 * @generated
	 */
	EAttribute getManufacturingSystem_Name();

	/**
	 * Returns the meta object for the containment reference '{@link Manufacturing.ManufacturingSystem#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see Manufacturing.ManufacturingSystem#getStart()
	 * @see #getManufacturingSystem()
	 * @generated
	 */
	EReference getManufacturingSystem_Start();

	/**
	 * Returns the meta object for the containment reference '{@link Manufacturing.ManufacturingSystem#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see Manufacturing.ManufacturingSystem#getEnd()
	 * @see #getManufacturingSystem()
	 * @generated
	 */
	EReference getManufacturingSystem_End();

	/**
	 * Returns the meta object for the containment reference list '{@link Manufacturing.ManufacturingSystem#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see Manufacturing.ManufacturingSystem#getSteps()
	 * @see #getManufacturingSystem()
	 * @generated
	 */
	EReference getManufacturingSystem_Steps();

	/**
	 * Returns the meta object for class '{@link Manufacturing.WorkPiece <em>Work Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Piece</em>'.
	 * @see Manufacturing.WorkPiece
	 * @generated
	 */
	EClass getWorkPiece();

	/**
	 * Returns the meta object for the reference '{@link Manufacturing.WorkPiece#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see Manufacturing.WorkPiece#getType()
	 * @see #getWorkPiece()
	 * @generated
	 */
	EReference getWorkPiece_Type();

	/**
	 * Returns the meta object for the attribute '{@link Manufacturing.WorkPiece#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Manufacturing.WorkPiece#getId()
	 * @see #getWorkPiece()
	 * @generated
	 */
	EAttribute getWorkPiece_Id();

	/**
	 * Returns the meta object for class '{@link Manufacturing.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see Manufacturing.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link Manufacturing.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Manufacturing.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for class '{@link Manufacturing.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see Manufacturing.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link Manufacturing.Step#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see Manufacturing.Step#getDuration()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Duration();

	/**
	 * Returns the meta object for the reference '{@link Manufacturing.Step#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsible</em>'.
	 * @see Manufacturing.Step#getResponsible()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Responsible();

	/**
	 * Returns the meta object for the reference list '{@link Manufacturing.Step#getInputWorkpiece <em>Input Workpiece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Workpiece</em>'.
	 * @see Manufacturing.Step#getInputWorkpiece()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_InputWorkpiece();

	/**
	 * Returns the meta object for the reference list '{@link Manufacturing.Step#getOutputWorkpiece <em>Output Workpiece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Workpiece</em>'.
	 * @see Manufacturing.Step#getOutputWorkpiece()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_OutputWorkpiece();

	/**
	 * Returns the meta object for class '{@link Manufacturing.Conditon <em>Conditon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditon</em>'.
	 * @see Manufacturing.Conditon
	 * @generated
	 */
	EClass getConditon();

	/**
	 * Returns the meta object for class '{@link Manufacturing.UnaryCondition <em>Unary Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Condition</em>'.
	 * @see Manufacturing.UnaryCondition
	 * @generated
	 */
	EClass getUnaryCondition();

	/**
	 * Returns the meta object for the attribute '{@link Manufacturing.UnaryCondition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see Manufacturing.UnaryCondition#getOperator()
	 * @see #getUnaryCondition()
	 * @generated
	 */
	EAttribute getUnaryCondition_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link Manufacturing.UnaryCondition#getConditon <em>Conditon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conditon</em>'.
	 * @see Manufacturing.UnaryCondition#getConditon()
	 * @see #getUnaryCondition()
	 * @generated
	 */
	EReference getUnaryCondition_Conditon();

	/**
	 * Returns the meta object for class '{@link Manufacturing.WorkPieceTypeCondition <em>Work Piece Type Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Piece Type Condition</em>'.
	 * @see Manufacturing.WorkPieceTypeCondition
	 * @generated
	 */
	EClass getWorkPieceTypeCondition();

	/**
	 * Returns the meta object for the reference '{@link Manufacturing.WorkPieceTypeCondition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see Manufacturing.WorkPieceTypeCondition#getType()
	 * @see #getWorkPieceTypeCondition()
	 * @generated
	 */
	EReference getWorkPieceTypeCondition_Type();

	/**
	 * Returns the meta object for class '{@link Manufacturing.BinaryCondition <em>Binary Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Condition</em>'.
	 * @see Manufacturing.BinaryCondition
	 * @generated
	 */
	EClass getBinaryCondition();

	/**
	 * Returns the meta object for the containment reference '{@link Manufacturing.BinaryCondition#getRightConditon <em>Right Conditon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Conditon</em>'.
	 * @see Manufacturing.BinaryCondition#getRightConditon()
	 * @see #getBinaryCondition()
	 * @generated
	 */
	EReference getBinaryCondition_RightConditon();

	/**
	 * Returns the meta object for the attribute '{@link Manufacturing.BinaryCondition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see Manufacturing.BinaryCondition#getOperator()
	 * @see #getBinaryCondition()
	 * @generated
	 */
	EAttribute getBinaryCondition_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link Manufacturing.BinaryCondition#getLeftConditon <em>Left Conditon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Conditon</em>'.
	 * @see Manufacturing.BinaryCondition#getLeftConditon()
	 * @see #getBinaryCondition()
	 * @generated
	 */
	EReference getBinaryCondition_LeftConditon();

	/**
	 * Returns the meta object for class '{@link Manufacturing.ProcessStep <em>Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Step</em>'.
	 * @see Manufacturing.ProcessStep
	 * @generated
	 */
	EClass getProcessStep();

	/**
	 * Returns the meta object for the containment reference '{@link Manufacturing.ProcessStep#getSubManufacturingsystem <em>Sub Manufacturingsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Manufacturingsystem</em>'.
	 * @see Manufacturing.ProcessStep#getSubManufacturingsystem()
	 * @see #getProcessStep()
	 * @generated
	 */
	EReference getProcessStep_SubManufacturingsystem();

	/**
	 * Returns the meta object for the containment reference '{@link Manufacturing.ProcessStep#getOutputConditon <em>Output Conditon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Conditon</em>'.
	 * @see Manufacturing.ProcessStep#getOutputConditon()
	 * @see #getProcessStep()
	 * @generated
	 */
	EReference getProcessStep_OutputConditon();

	/**
	 * Returns the meta object for the containment reference '{@link Manufacturing.ProcessStep#getInputConditon <em>Input Conditon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Conditon</em>'.
	 * @see Manufacturing.ProcessStep#getInputConditon()
	 * @see #getProcessStep()
	 * @generated
	 */
	EReference getProcessStep_InputConditon();

	/**
	 * Returns the meta object for class '{@link Manufacturing.TransportStep <em>Transport Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Step</em>'.
	 * @see Manufacturing.TransportStep
	 * @generated
	 */
	EClass getTransportStep();

	/**
	 * Returns the meta object for class '{@link Manufacturing.QualityAssuranceStep <em>Quality Assurance Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Assurance Step</em>'.
	 * @see Manufacturing.QualityAssuranceStep
	 * @generated
	 */
	EClass getQualityAssuranceStep();

	/**
	 * Returns the meta object for class '{@link Manufacturing.WorkPieceType <em>Work Piece Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Piece Type</em>'.
	 * @see Manufacturing.WorkPieceType
	 * @generated
	 */
	EClass getWorkPieceType();

	/**
	 * Returns the meta object for the attribute '{@link Manufacturing.WorkPieceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Manufacturing.WorkPieceType#getName()
	 * @see #getWorkPieceType()
	 * @generated
	 */
	EAttribute getWorkPieceType_Name();

	/**
	 * Returns the meta object for class '{@link Manufacturing.StorageFacility <em>Storage Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Facility</em>'.
	 * @see Manufacturing.StorageFacility
	 * @generated
	 */
	EClass getStorageFacility();

	/**
	 * Returns the meta object for the attribute '{@link Manufacturing.StorageFacility#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Manufacturing.StorageFacility#getId()
	 * @see #getStorageFacility()
	 * @generated
	 */
	EAttribute getStorageFacility_Id();

	/**
	 * Returns the meta object for the attribute '{@link Manufacturing.StorageFacility#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Manufacturing.StorageFacility#getName()
	 * @see #getStorageFacility()
	 * @generated
	 */
	EAttribute getStorageFacility_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Manufacturing.StorageFacility#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Storage</em>'.
	 * @see Manufacturing.StorageFacility#getStorage()
	 * @see #getStorageFacility()
	 * @generated
	 */
	EReference getStorageFacility_Storage();

	/**
	 * Returns the meta object for the containment reference list '{@link Manufacturing.StorageFacility#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see Manufacturing.StorageFacility#getTypes()
	 * @see #getStorageFacility()
	 * @generated
	 */
	EReference getStorageFacility_Types();

	/**
	 * Returns the meta object for enum '{@link Manufacturing.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Operator</em>'.
	 * @see Manufacturing.UnaryOperator
	 * @generated
	 */
	EEnum getUnaryOperator();

	/**
	 * Returns the meta object for enum '{@link Manufacturing.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Operator</em>'.
	 * @see Manufacturing.BinaryOperator
	 * @generated
	 */
	EEnum getBinaryOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ManufacturingFactory getManufacturingFactory();

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
		 * The meta object literal for the '{@link Manufacturing.impl.ManufacturingSystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacturing.impl.ManufacturingSystemImpl
		 * @see Manufacturing.impl.ManufacturingPackageImpl#getManufacturingSystem()
		 * @generated
		 */
		EClass MANUFACTURING_SYSTEM = eINSTANCE.getManufacturingSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANUFACTURING_SYSTEM__NAME = eINSTANCE.getManufacturingSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_SYSTEM__START = eINSTANCE.getManufacturingSystem_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_SYSTEM__END = eINSTANCE.getManufacturingSystem_End();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_SYSTEM__STEPS = eINSTANCE.getManufacturingSystem_Steps();

		/**
		 * The meta object literal for the '{@link Manufacturing.impl.WorkPieceImpl <em>Work Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacturing.impl.WorkPieceImpl
		 * @see Manufacturing.impl.ManufacturingPackageImpl#getWorkPiece()
		 * @generated
		 */
		EClass WORK_PIECE = eINSTANCE.getWorkPiece();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PIECE__TYPE = eINSTANCE.getWorkPiece_Type();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PIECE__ID = eINSTANCE.getWorkPiece_Id();

		/**
		 * The meta object literal for the '{@link Manufacturing.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacturing.impl.PersonImpl
		 * @see Manufacturing.impl.ManufacturingPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '{@link Manufacturing.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacturing.impl.StepImpl
		 * @see Manufacturing.impl.ManufacturingPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__DURATION = eINSTANCE.getStep_Duration();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__RESPONSIBLE = eINSTANCE.getStep_Responsible();

		/**
		 * The meta object literal for the '<em><b>Input Workpiece</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__INPUT_WORKPIECE = eINSTANCE.getStep_InputWorkpiece();

		/**
		 * The meta object literal for the '<em><b>Output Workpiece</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__OUTPUT_WORKPIECE = eINSTANCE.getStep_OutputWorkpiece();

		/**
		 * The meta object literal for the '{@link Manufacturing.impl.ConditonImpl <em>Conditon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacturing.impl.ConditonImpl
		 * @see Manufacturing.impl.ManufacturingPackageImpl#getConditon()
		 * @generated
		 */
		EClass CONDITON = eINSTANCE.getConditon();

		/**
		 * The meta object literal for the '{@link Manufacturing.impl.UnaryConditionImpl <em>Unary Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacturing.impl.UnaryConditionImpl
		 * @see Manufacturing.impl.ManufacturingPackageImpl#getUnaryCondition()
		 * @generated
		 */
		EClass UNARY_CONDITION = eINSTANCE.getUnaryCondition();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_CONDITION__OPERATOR = eINSTANCE.getUnaryCondition_Operator();

		/**
		 * The meta object literal for the '<em><b>Conditon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_CONDITION__CONDITON = eINSTANCE.getUnaryCondition_Conditon();

		/**
		 * The meta object literal for the '{@link Manufacturing.impl.WorkPieceTypeConditionImpl <em>Work Piece Type Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacturing.impl.WorkPieceTypeConditionImpl
		 * @see Manufacturing.impl.ManufacturingPackageImpl#getWorkPieceTypeCondition()
		 * @generated
		 */
		EClass WORK_PIECE_TYPE_CONDITION = eINSTANCE.getWorkPieceTypeCondition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PIECE_TYPE_CONDITION__TYPE = eINSTANCE.getWorkPieceTypeCondition_Type();

		/**
		 * The meta object literal for the '{@link Manufacturing.impl.BinaryConditionImpl <em>Binary Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacturing.impl.BinaryConditionImpl
		 * @see Manufacturing.impl.ManufacturingPackageImpl#getBinaryCondition()
		 * @generated
		 */
		EClass BINARY_CONDITION = eINSTANCE.getBinaryCondition();

		/**
		 * The meta object literal for the '<em><b>Right Conditon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_CONDITION__RIGHT_CONDITON = eINSTANCE.getBinaryCondition_RightConditon();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_CONDITION__OPERATOR = eINSTANCE.getBinaryCondition_Operator();

		/**
		 * The meta object literal for the '<em><b>Left Conditon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_CONDITION__LEFT_CONDITON = eINSTANCE.getBinaryCondition_LeftConditon();

		/**
		 * The meta object literal for the '{@link Manufacturing.impl.ProcessStepImpl <em>Process Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacturing.impl.ProcessStepImpl
		 * @see Manufacturing.impl.ManufacturingPackageImpl#getProcessStep()
		 * @generated
		 */
		EClass PROCESS_STEP = eINSTANCE.getProcessStep();

		/**
		 * The meta object literal for the '<em><b>Sub Manufacturingsystem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STEP__SUB_MANUFACTURINGSYSTEM = eINSTANCE.getProcessStep_SubManufacturingsystem();

		/**
		 * The meta object literal for the '<em><b>Output Conditon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STEP__OUTPUT_CONDITON = eINSTANCE.getProcessStep_OutputConditon();

		/**
		 * The meta object literal for the '<em><b>Input Conditon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STEP__INPUT_CONDITON = eINSTANCE.getProcessStep_InputConditon();

		/**
		 * The meta object literal for the '{@link Manufacturing.impl.TransportStepImpl <em>Transport Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacturing.impl.TransportStepImpl
		 * @see Manufacturing.impl.ManufacturingPackageImpl#getTransportStep()
		 * @generated
		 */
		EClass TRANSPORT_STEP = eINSTANCE.getTransportStep();

		/**
		 * The meta object literal for the '{@link Manufacturing.impl.QualityAssuranceStepImpl <em>Quality Assurance Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacturing.impl.QualityAssuranceStepImpl
		 * @see Manufacturing.impl.ManufacturingPackageImpl#getQualityAssuranceStep()
		 * @generated
		 */
		EClass QUALITY_ASSURANCE_STEP = eINSTANCE.getQualityAssuranceStep();

		/**
		 * The meta object literal for the '{@link Manufacturing.impl.WorkPieceTypeImpl <em>Work Piece Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacturing.impl.WorkPieceTypeImpl
		 * @see Manufacturing.impl.ManufacturingPackageImpl#getWorkPieceType()
		 * @generated
		 */
		EClass WORK_PIECE_TYPE = eINSTANCE.getWorkPieceType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PIECE_TYPE__NAME = eINSTANCE.getWorkPieceType_Name();

		/**
		 * The meta object literal for the '{@link Manufacturing.impl.StorageFacilityImpl <em>Storage Facility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacturing.impl.StorageFacilityImpl
		 * @see Manufacturing.impl.ManufacturingPackageImpl#getStorageFacility()
		 * @generated
		 */
		EClass STORAGE_FACILITY = eINSTANCE.getStorageFacility();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_FACILITY__ID = eINSTANCE.getStorageFacility_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_FACILITY__NAME = eINSTANCE.getStorageFacility_Name();

		/**
		 * The meta object literal for the '<em><b>Storage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_FACILITY__STORAGE = eINSTANCE.getStorageFacility_Storage();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_FACILITY__TYPES = eINSTANCE.getStorageFacility_Types();

		/**
		 * The meta object literal for the '{@link Manufacturing.UnaryOperator <em>Unary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacturing.UnaryOperator
		 * @see Manufacturing.impl.ManufacturingPackageImpl#getUnaryOperator()
		 * @generated
		 */
		EEnum UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

		/**
		 * The meta object literal for the '{@link Manufacturing.BinaryOperator <em>Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacturing.BinaryOperator
		 * @see Manufacturing.impl.ManufacturingPackageImpl#getBinaryOperator()
		 * @generated
		 */
		EEnum BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

	}

} //ManufacturingPackage
