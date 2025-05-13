/**
 */
package Manufacturing;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Piece Type Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Manufacturing.WorkPieceTypeCondition#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see Manufacturing.ManufacturingPackage#getWorkPieceTypeCondition()
 * @model
 * @generated
 */
public interface WorkPieceTypeCondition extends Conditon {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(WorkPieceType)
	 * @see Manufacturing.ManufacturingPackage#getWorkPieceTypeCondition_Type()
	 * @model required="true"
	 * @generated
	 */
	WorkPieceType getType();

	/**
	 * Sets the value of the '{@link Manufacturing.WorkPieceTypeCondition#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(WorkPieceType value);

} // WorkPieceTypeCondition
