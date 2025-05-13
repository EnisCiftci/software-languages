/**
 */
package Manufacturing.impl;

import Manufacturing.BinaryCondition;
import Manufacturing.BinaryOperator;
import Manufacturing.Conditon;
import Manufacturing.ManufacturingFactory;
import Manufacturing.ManufacturingPackage;
import Manufacturing.ManufacturingSystem;
import Manufacturing.Person;
import Manufacturing.ProcessStep;
import Manufacturing.QualityAssuranceStep;
import Manufacturing.Step;
import Manufacturing.StorageFacility;
import Manufacturing.TransportStep;
import Manufacturing.UnaryCondition;
import Manufacturing.UnaryOperator;
import Manufacturing.WorkPiece;
import Manufacturing.WorkPieceType;
import Manufacturing.WorkPieceTypeCondition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ManufacturingPackageImpl extends EPackageImpl implements ManufacturingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manufacturingSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workPieceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workPieceTypeConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityAssuranceStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workPieceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageFacilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryOperatorEEnum = null;

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
	 * @see Manufacturing.ManufacturingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ManufacturingPackageImpl() {
		super(eNS_URI, ManufacturingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ManufacturingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ManufacturingPackage init() {
		if (isInited) return (ManufacturingPackage)EPackage.Registry.INSTANCE.getEPackage(ManufacturingPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredManufacturingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ManufacturingPackageImpl theManufacturingPackage = registeredManufacturingPackage instanceof ManufacturingPackageImpl ? (ManufacturingPackageImpl)registeredManufacturingPackage : new ManufacturingPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theManufacturingPackage.createPackageContents();

		// Initialize created meta-data
		theManufacturingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theManufacturingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ManufacturingPackage.eNS_URI, theManufacturingPackage);
		return theManufacturingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManufacturingSystem() {
		return manufacturingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManufacturingSystem_Name() {
		return (EAttribute)manufacturingSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManufacturingSystem_Start() {
		return (EReference)manufacturingSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManufacturingSystem_End() {
		return (EReference)manufacturingSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManufacturingSystem_Steps() {
		return (EReference)manufacturingSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkPiece() {
		return workPieceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkPiece_Type() {
		return (EReference)workPieceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkPiece_Id() {
		return (EAttribute)workPieceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Name() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_Duration() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_Responsible() {
		return (EReference)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_InputWorkpiece() {
		return (EReference)stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_OutputWorkpiece() {
		return (EReference)stepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditon() {
		return conditonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryCondition() {
		return unaryConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnaryCondition_Operator() {
		return (EAttribute)unaryConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaryCondition_Conditon() {
		return (EReference)unaryConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkPieceTypeCondition() {
		return workPieceTypeConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkPieceTypeCondition_Type() {
		return (EReference)workPieceTypeConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryCondition() {
		return binaryConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryCondition_RightConditon() {
		return (EReference)binaryConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryCondition_Operator() {
		return (EAttribute)binaryConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryCondition_LeftConditon() {
		return (EReference)binaryConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessStep() {
		return processStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessStep_SubManufacturingsystem() {
		return (EReference)processStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessStep_OutputConditon() {
		return (EReference)processStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessStep_InputConditon() {
		return (EReference)processStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransportStep() {
		return transportStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQualityAssuranceStep() {
		return qualityAssuranceStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkPieceType() {
		return workPieceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkPieceType_Name() {
		return (EAttribute)workPieceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStorageFacility() {
		return storageFacilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStorageFacility_Id() {
		return (EAttribute)storageFacilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStorageFacility_Name() {
		return (EAttribute)storageFacilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStorageFacility_Storage() {
		return (EReference)storageFacilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStorageFacility_Types() {
		return (EReference)storageFacilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnaryOperator() {
		return unaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBinaryOperator() {
		return binaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManufacturingFactory getManufacturingFactory() {
		return (ManufacturingFactory)getEFactoryInstance();
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
		manufacturingSystemEClass = createEClass(MANUFACTURING_SYSTEM);
		createEAttribute(manufacturingSystemEClass, MANUFACTURING_SYSTEM__NAME);
		createEReference(manufacturingSystemEClass, MANUFACTURING_SYSTEM__START);
		createEReference(manufacturingSystemEClass, MANUFACTURING_SYSTEM__END);
		createEReference(manufacturingSystemEClass, MANUFACTURING_SYSTEM__STEPS);

		workPieceEClass = createEClass(WORK_PIECE);
		createEReference(workPieceEClass, WORK_PIECE__TYPE);
		createEAttribute(workPieceEClass, WORK_PIECE__ID);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__NAME);

		stepEClass = createEClass(STEP);
		createEAttribute(stepEClass, STEP__DURATION);
		createEReference(stepEClass, STEP__RESPONSIBLE);
		createEReference(stepEClass, STEP__INPUT_WORKPIECE);
		createEReference(stepEClass, STEP__OUTPUT_WORKPIECE);

		conditonEClass = createEClass(CONDITON);

		unaryConditionEClass = createEClass(UNARY_CONDITION);
		createEAttribute(unaryConditionEClass, UNARY_CONDITION__OPERATOR);
		createEReference(unaryConditionEClass, UNARY_CONDITION__CONDITON);

		workPieceTypeConditionEClass = createEClass(WORK_PIECE_TYPE_CONDITION);
		createEReference(workPieceTypeConditionEClass, WORK_PIECE_TYPE_CONDITION__TYPE);

		binaryConditionEClass = createEClass(BINARY_CONDITION);
		createEAttribute(binaryConditionEClass, BINARY_CONDITION__OPERATOR);
		createEReference(binaryConditionEClass, BINARY_CONDITION__LEFT_CONDITON);
		createEReference(binaryConditionEClass, BINARY_CONDITION__RIGHT_CONDITON);

		processStepEClass = createEClass(PROCESS_STEP);
		createEReference(processStepEClass, PROCESS_STEP__SUB_MANUFACTURINGSYSTEM);
		createEReference(processStepEClass, PROCESS_STEP__OUTPUT_CONDITON);
		createEReference(processStepEClass, PROCESS_STEP__INPUT_CONDITON);

		transportStepEClass = createEClass(TRANSPORT_STEP);

		qualityAssuranceStepEClass = createEClass(QUALITY_ASSURANCE_STEP);

		workPieceTypeEClass = createEClass(WORK_PIECE_TYPE);
		createEAttribute(workPieceTypeEClass, WORK_PIECE_TYPE__NAME);

		storageFacilityEClass = createEClass(STORAGE_FACILITY);
		createEAttribute(storageFacilityEClass, STORAGE_FACILITY__ID);
		createEAttribute(storageFacilityEClass, STORAGE_FACILITY__NAME);
		createEReference(storageFacilityEClass, STORAGE_FACILITY__STORAGE);
		createEReference(storageFacilityEClass, STORAGE_FACILITY__TYPES);

		// Create enums
		unaryOperatorEEnum = createEEnum(UNARY_OPERATOR);
		binaryOperatorEEnum = createEEnum(BINARY_OPERATOR);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		unaryConditionEClass.getESuperTypes().add(this.getConditon());
		workPieceTypeConditionEClass.getESuperTypes().add(this.getConditon());
		binaryConditionEClass.getESuperTypes().add(this.getConditon());
		processStepEClass.getESuperTypes().add(this.getStep());
		transportStepEClass.getESuperTypes().add(this.getStep());
		qualityAssuranceStepEClass.getESuperTypes().add(this.getStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(manufacturingSystemEClass, ManufacturingSystem.class, "ManufacturingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManufacturingSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, ManufacturingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManufacturingSystem_Start(), this.getStorageFacility(), null, "start", null, 1, 1, ManufacturingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManufacturingSystem_End(), this.getStorageFacility(), null, "end", null, 1, 1, ManufacturingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManufacturingSystem_Steps(), this.getStep(), null, "steps", null, 0, -1, ManufacturingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workPieceEClass, WorkPiece.class, "WorkPiece", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkPiece_Type(), this.getWorkPieceType(), null, "type", null, 1, 1, WorkPiece.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkPiece_Id(), ecorePackage.getEInt(), "id", null, 0, 1, WorkPiece.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStep_Duration(), ecorePackage.getEString(), "duration", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Responsible(), this.getPerson(), null, "responsible", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_InputWorkpiece(), this.getWorkPiece(), null, "inputWorkpiece", null, 1, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_OutputWorkpiece(), this.getWorkPiece(), null, "outputWorkpiece", null, 1, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditonEClass, Conditon.class, "Conditon", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryConditionEClass, UnaryCondition.class, "UnaryCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnaryCondition_Operator(), this.getUnaryOperator(), "operator", null, 0, 1, UnaryCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryCondition_Conditon(), this.getConditon(), null, "conditon", null, 1, 1, UnaryCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workPieceTypeConditionEClass, WorkPieceTypeCondition.class, "WorkPieceTypeCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkPieceTypeCondition_Type(), this.getWorkPieceType(), null, "type", null, 1, 1, WorkPieceTypeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryConditionEClass, BinaryCondition.class, "BinaryCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryCondition_Operator(), this.getBinaryOperator(), "operator", null, 0, 1, BinaryCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryCondition_LeftConditon(), this.getConditon(), null, "leftConditon", null, 1, 1, BinaryCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryCondition_RightConditon(), this.getConditon(), null, "rightConditon", null, 1, 1, BinaryCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processStepEClass, ProcessStep.class, "ProcessStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessStep_SubManufacturingsystem(), this.getManufacturingSystem(), null, "subManufacturingsystem", null, 0, 1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessStep_OutputConditon(), this.getConditon(), null, "outputConditon", null, 0, 1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessStep_InputConditon(), this.getConditon(), null, "inputConditon", null, 0, 1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transportStepEClass, TransportStep.class, "TransportStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qualityAssuranceStepEClass, QualityAssuranceStep.class, "QualityAssuranceStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workPieceTypeEClass, WorkPieceType.class, "WorkPieceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkPieceType_Name(), ecorePackage.getEString(), "name", null, 0, 1, WorkPieceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storageFacilityEClass, StorageFacility.class, "StorageFacility", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStorageFacility_Id(), ecorePackage.getEInt(), "id", null, 0, 1, StorageFacility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorageFacility_Name(), ecorePackage.getEString(), "name", null, 0, 1, StorageFacility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStorageFacility_Storage(), this.getWorkPiece(), null, "storage", null, 0, -1, StorageFacility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStorageFacility_Types(), this.getWorkPieceType(), null, "types", null, 0, -1, StorageFacility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(unaryOperatorEEnum, UnaryOperator.class, "UnaryOperator");
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.NOT);

		initEEnum(binaryOperatorEEnum, BinaryOperator.class, "BinaryOperator");
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.AND);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.OR);

		// Create resource
		createResource(eNS_URI);
	}

} //ManufacturingPackageImpl
