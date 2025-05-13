/**
 */
package Manufacturing.util;

import Manufacturing.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Manufacturing.ManufacturingPackage
 * @generated
 */
public class ManufacturingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ManufacturingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ManufacturingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManufacturingSwitch<Adapter> modelSwitch =
		new ManufacturingSwitch<Adapter>() {
			@Override
			public Adapter caseManufacturingSystem(ManufacturingSystem object) {
				return createManufacturingSystemAdapter();
			}
			@Override
			public Adapter caseWorkPiece(WorkPiece object) {
				return createWorkPieceAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseConditon(Conditon object) {
				return createConditonAdapter();
			}
			@Override
			public Adapter caseUnaryCondition(UnaryCondition object) {
				return createUnaryConditionAdapter();
			}
			@Override
			public Adapter caseWorkPieceTypeCondition(WorkPieceTypeCondition object) {
				return createWorkPieceTypeConditionAdapter();
			}
			@Override
			public Adapter caseBinaryCondition(BinaryCondition object) {
				return createBinaryConditionAdapter();
			}
			@Override
			public Adapter caseProcessStep(ProcessStep object) {
				return createProcessStepAdapter();
			}
			@Override
			public Adapter caseTransportStep(TransportStep object) {
				return createTransportStepAdapter();
			}
			@Override
			public Adapter caseQualityAssuranceStep(QualityAssuranceStep object) {
				return createQualityAssuranceStepAdapter();
			}
			@Override
			public Adapter caseWorkPieceType(WorkPieceType object) {
				return createWorkPieceTypeAdapter();
			}
			@Override
			public Adapter caseStorageFacility(StorageFacility object) {
				return createStorageFacilityAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Manufacturing.ManufacturingSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacturing.ManufacturingSystem
	 * @generated
	 */
	public Adapter createManufacturingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacturing.WorkPiece <em>Work Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacturing.WorkPiece
	 * @generated
	 */
	public Adapter createWorkPieceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacturing.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacturing.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacturing.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacturing.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacturing.Conditon <em>Conditon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacturing.Conditon
	 * @generated
	 */
	public Adapter createConditonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacturing.UnaryCondition <em>Unary Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacturing.UnaryCondition
	 * @generated
	 */
	public Adapter createUnaryConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacturing.WorkPieceTypeCondition <em>Work Piece Type Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacturing.WorkPieceTypeCondition
	 * @generated
	 */
	public Adapter createWorkPieceTypeConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacturing.BinaryCondition <em>Binary Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacturing.BinaryCondition
	 * @generated
	 */
	public Adapter createBinaryConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacturing.ProcessStep <em>Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacturing.ProcessStep
	 * @generated
	 */
	public Adapter createProcessStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacturing.TransportStep <em>Transport Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacturing.TransportStep
	 * @generated
	 */
	public Adapter createTransportStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacturing.QualityAssuranceStep <em>Quality Assurance Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacturing.QualityAssuranceStep
	 * @generated
	 */
	public Adapter createQualityAssuranceStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacturing.WorkPieceType <em>Work Piece Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacturing.WorkPieceType
	 * @generated
	 */
	public Adapter createWorkPieceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Manufacturing.StorageFacility <em>Storage Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Manufacturing.StorageFacility
	 * @generated
	 */
	public Adapter createStorageFacilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ManufacturingAdapterFactory
