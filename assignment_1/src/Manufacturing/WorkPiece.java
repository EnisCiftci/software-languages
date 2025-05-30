/**
 */
package Manufacturing;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Piece</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Manufacturing.WorkPiece#getType <em>Type</em>}</li>
 *   <li>{@link Manufacturing.WorkPiece#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Manufacturing.ManufacturingPackage#getWorkPiece()
 * @model
 * @generated
 */
public interface WorkPiece extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(WorkPieceType)
	 * @see Manufacturing.ManufacturingPackage#getWorkPiece_Type()
	 * @model required="true"
	 * @generated
	 */
	WorkPieceType getType();

	/**
	 * Sets the value of the '{@link Manufacturing.WorkPiece#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(WorkPieceType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Manufacturing.ManufacturingPackage#getWorkPiece_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Manufacturing.WorkPiece#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // WorkPiece
