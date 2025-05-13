/**
 */
package Manufacturing.impl;

import Manufacturing.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ManufacturingFactoryImpl extends EFactoryImpl implements ManufacturingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ManufacturingFactory init() {
		try {
			ManufacturingFactory theManufacturingFactory = (ManufacturingFactory)EPackage.Registry.INSTANCE.getEFactory(ManufacturingPackage.eNS_URI);
			if (theManufacturingFactory != null) {
				return theManufacturingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ManufacturingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturingFactoryImpl() {
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
			case ManufacturingPackage.MANUFACTURING_SYSTEM: return createManufacturingSystem();
			case ManufacturingPackage.WORK_PIECE: return createWorkPiece();
			case ManufacturingPackage.PERSON: return createPerson();
			case ManufacturingPackage.UNARY_CONDITION: return createUnaryCondition();
			case ManufacturingPackage.WORK_PIECE_TYPE_CONDITION: return createWorkPieceTypeCondition();
			case ManufacturingPackage.BINARY_CONDITION: return createBinaryCondition();
			case ManufacturingPackage.PROCESS_STEP: return createProcessStep();
			case ManufacturingPackage.TRANSPORT_STEP: return createTransportStep();
			case ManufacturingPackage.QUALITY_ASSURANCE_STEP: return createQualityAssuranceStep();
			case ManufacturingPackage.WORK_PIECE_TYPE: return createWorkPieceType();
			case ManufacturingPackage.STORAGE_FACILITY: return createStorageFacility();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ManufacturingPackage.UNARY_OPERATOR:
				return createUnaryOperatorFromString(eDataType, initialValue);
			case ManufacturingPackage.BINARY_OPERATOR:
				return createBinaryOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ManufacturingPackage.UNARY_OPERATOR:
				return convertUnaryOperatorToString(eDataType, instanceValue);
			case ManufacturingPackage.BINARY_OPERATOR:
				return convertBinaryOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManufacturingSystem createManufacturingSystem() {
		ManufacturingSystemImpl manufacturingSystem = new ManufacturingSystemImpl();
		return manufacturingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkPiece createWorkPiece() {
		WorkPieceImpl workPiece = new WorkPieceImpl();
		return workPiece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryCondition createUnaryCondition() {
		UnaryConditionImpl unaryCondition = new UnaryConditionImpl();
		return unaryCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkPieceTypeCondition createWorkPieceTypeCondition() {
		WorkPieceTypeConditionImpl workPieceTypeCondition = new WorkPieceTypeConditionImpl();
		return workPieceTypeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryCondition createBinaryCondition() {
		BinaryConditionImpl binaryCondition = new BinaryConditionImpl();
		return binaryCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessStep createProcessStep() {
		ProcessStepImpl processStep = new ProcessStepImpl();
		return processStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransportStep createTransportStep() {
		TransportStepImpl transportStep = new TransportStepImpl();
		return transportStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualityAssuranceStep createQualityAssuranceStep() {
		QualityAssuranceStepImpl qualityAssuranceStep = new QualityAssuranceStepImpl();
		return qualityAssuranceStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkPieceType createWorkPieceType() {
		WorkPieceTypeImpl workPieceType = new WorkPieceTypeImpl();
		return workPieceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StorageFacility createStorageFacility() {
		StorageFacilityImpl storageFacility = new StorageFacilityImpl();
		return storageFacility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperator createUnaryOperatorFromString(EDataType eDataType, String initialValue) {
		UnaryOperator result = UnaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperator createBinaryOperatorFromString(EDataType eDataType, String initialValue) {
		BinaryOperator result = BinaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManufacturingPackage getManufacturingPackage() {
		return (ManufacturingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ManufacturingPackage getPackage() {
		return ManufacturingPackage.eINSTANCE;
	}

} //ManufacturingFactoryImpl
