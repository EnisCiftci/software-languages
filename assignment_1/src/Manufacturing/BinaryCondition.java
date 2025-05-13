/**
 */
package Manufacturing;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Manufacturing.BinaryCondition#getOperator <em>Operator</em>}</li>
 *   <li>{@link Manufacturing.BinaryCondition#getLeftConditon <em>Left Conditon</em>}</li>
 *   <li>{@link Manufacturing.BinaryCondition#getRightConditon <em>Right Conditon</em>}</li>
 * </ul>
 *
 * @see Manufacturing.ManufacturingPackage#getBinaryCondition()
 * @model
 * @generated
 */
public interface BinaryCondition extends Conditon {
	/**
	 * Returns the value of the '<em><b>Right Conditon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Conditon</em>' containment reference.
	 * @see #setRightConditon(Conditon)
	 * @see Manufacturing.ManufacturingPackage#getBinaryCondition_RightConditon()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Conditon getRightConditon();

	/**
	 * Sets the value of the '{@link Manufacturing.BinaryCondition#getRightConditon <em>Right Conditon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Conditon</em>' containment reference.
	 * @see #getRightConditon()
	 * @generated
	 */
	void setRightConditon(Conditon value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link Manufacturing.BinaryOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see Manufacturing.BinaryOperator
	 * @see #setOperator(BinaryOperator)
	 * @see Manufacturing.ManufacturingPackage#getBinaryCondition_Operator()
	 * @model
	 * @generated
	 */
	BinaryOperator getOperator();

	/**
	 * Sets the value of the '{@link Manufacturing.BinaryCondition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see Manufacturing.BinaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BinaryOperator value);

	/**
	 * Returns the value of the '<em><b>Left Conditon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Conditon</em>' containment reference.
	 * @see #setLeftConditon(Conditon)
	 * @see Manufacturing.ManufacturingPackage#getBinaryCondition_LeftConditon()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Conditon getLeftConditon();

	/**
	 * Sets the value of the '{@link Manufacturing.BinaryCondition#getLeftConditon <em>Left Conditon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Conditon</em>' containment reference.
	 * @see #getLeftConditon()
	 * @generated
	 */
	void setLeftConditon(Conditon value);

} // BinaryCondition
