/**
 */
package Manufacturing;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Manufacturing.ManufacturingPackage
 * @generated
 */
public interface ManufacturingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ManufacturingFactory eINSTANCE = Manufacturing.impl.ManufacturingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	ManufacturingSystem createManufacturingSystem();

	/**
	 * Returns a new object of class '<em>Work Piece</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Piece</em>'.
	 * @generated
	 */
	WorkPiece createWorkPiece();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Unary Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Condition</em>'.
	 * @generated
	 */
	UnaryCondition createUnaryCondition();

	/**
	 * Returns a new object of class '<em>Work Piece Type Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Piece Type Condition</em>'.
	 * @generated
	 */
	WorkPieceTypeCondition createWorkPieceTypeCondition();

	/**
	 * Returns a new object of class '<em>Binary Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Condition</em>'.
	 * @generated
	 */
	BinaryCondition createBinaryCondition();

	/**
	 * Returns a new object of class '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Step</em>'.
	 * @generated
	 */
	ProcessStep createProcessStep();

	/**
	 * Returns a new object of class '<em>Transport Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transport Step</em>'.
	 * @generated
	 */
	TransportStep createTransportStep();

	/**
	 * Returns a new object of class '<em>Quality Assurance Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quality Assurance Step</em>'.
	 * @generated
	 */
	QualityAssuranceStep createQualityAssuranceStep();

	/**
	 * Returns a new object of class '<em>Work Piece Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Piece Type</em>'.
	 * @generated
	 */
	WorkPieceType createWorkPieceType();

	/**
	 * Returns a new object of class '<em>Storage Facility</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Facility</em>'.
	 * @generated
	 */
	StorageFacility createStorageFacility();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ManufacturingPackage getManufacturingPackage();

} //ManufacturingFactory
