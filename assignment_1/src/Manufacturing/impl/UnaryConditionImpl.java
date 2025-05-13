/**
 */
package Manufacturing.impl;

import Manufacturing.Conditon;
import Manufacturing.ManufacturingPackage;
import Manufacturing.UnaryCondition;
import Manufacturing.UnaryOperator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Manufacturing.impl.UnaryConditionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link Manufacturing.impl.UnaryConditionImpl#getConditon <em>Conditon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryConditionImpl extends ConditonImpl implements UnaryCondition {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final UnaryOperator OPERATOR_EDEFAULT = UnaryOperator.NOT;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected UnaryOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConditon() <em>Conditon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditon()
	 * @generated
	 * @ordered
	 */
	protected Conditon conditon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturingPackage.Literals.UNARY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(UnaryOperator newOperator) {
		UnaryOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingPackage.UNARY_CONDITION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conditon getConditon() {
		return conditon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditon(Conditon newConditon, NotificationChain msgs) {
		Conditon oldConditon = conditon;
		conditon = newConditon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ManufacturingPackage.UNARY_CONDITION__CONDITON, oldConditon, newConditon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConditon(Conditon newConditon) {
		if (newConditon != conditon) {
			NotificationChain msgs = null;
			if (conditon != null)
				msgs = ((InternalEObject)conditon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ManufacturingPackage.UNARY_CONDITION__CONDITON, null, msgs);
			if (newConditon != null)
				msgs = ((InternalEObject)newConditon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ManufacturingPackage.UNARY_CONDITION__CONDITON, null, msgs);
			msgs = basicSetConditon(newConditon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingPackage.UNARY_CONDITION__CONDITON, newConditon, newConditon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManufacturingPackage.UNARY_CONDITION__CONDITON:
				return basicSetConditon(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManufacturingPackage.UNARY_CONDITION__OPERATOR:
				return getOperator();
			case ManufacturingPackage.UNARY_CONDITION__CONDITON:
				return getConditon();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ManufacturingPackage.UNARY_CONDITION__OPERATOR:
				setOperator((UnaryOperator)newValue);
				return;
			case ManufacturingPackage.UNARY_CONDITION__CONDITON:
				setConditon((Conditon)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ManufacturingPackage.UNARY_CONDITION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case ManufacturingPackage.UNARY_CONDITION__CONDITON:
				setConditon((Conditon)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ManufacturingPackage.UNARY_CONDITION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case ManufacturingPackage.UNARY_CONDITION__CONDITON:
				return conditon != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //UnaryConditionImpl
