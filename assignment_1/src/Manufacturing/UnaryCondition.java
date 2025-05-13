/**
 */
package Manufacturing;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Manufacturing.UnaryCondition#getOperator <em>Operator</em>}</li>
 *   <li>{@link Manufacturing.UnaryCondition#getConditon <em>Conditon</em>}</li>
 * </ul>
 *
 * @see Manufacturing.ManufacturingPackage#getUnaryCondition()
 * @model
 * @generated
 */
public interface UnaryCondition extends Conditon {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link Manufacturing.UnaryOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see Manufacturing.UnaryOperator
	 * @see #setOperator(UnaryOperator)
	 * @see Manufacturing.ManufacturingPackage#getUnaryCondition_Operator()
	 * @model
	 * @generated
	 */
	UnaryOperator getOperator();

	/**
	 * Sets the value of the '{@link Manufacturing.UnaryCondition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see Manufacturing.UnaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(UnaryOperator value);

	/**
	 * Returns the value of the '<em><b>Conditon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditon</em>' containment reference.
	 * @see #setConditon(Conditon)
	 * @see Manufacturing.ManufacturingPackage#getUnaryCondition_Conditon()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Conditon getConditon();

	/**
	 * Sets the value of the '{@link Manufacturing.UnaryCondition#getConditon <em>Conditon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditon</em>' containment reference.
	 * @see #getConditon()
	 * @generated
	 */
	void setConditon(Conditon value);

} // UnaryCondition
