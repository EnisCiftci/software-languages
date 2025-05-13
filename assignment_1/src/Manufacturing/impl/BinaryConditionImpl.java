/**
 */
package Manufacturing.impl;

import Manufacturing.BinaryCondition;
import Manufacturing.BinaryOperator;
import Manufacturing.Conditon;
import Manufacturing.ManufacturingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Manufacturing.impl.BinaryConditionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link Manufacturing.impl.BinaryConditionImpl#getLeftConditon <em>Left Conditon</em>}</li>
 *   <li>{@link Manufacturing.impl.BinaryConditionImpl#getRightConditon <em>Right Conditon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryConditionImpl extends ConditonImpl implements BinaryCondition {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final BinaryOperator OPERATOR_EDEFAULT = BinaryOperator.AND;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected BinaryOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeftConditon() <em>Left Conditon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftConditon()
	 * @generated
	 * @ordered
	 */
	protected Conditon leftConditon;

	/**
	 * The cached value of the '{@link #getRightConditon() <em>Right Conditon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightConditon()
	 * @generated
	 * @ordered
	 */
	protected Conditon rightConditon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturingPackage.Literals.BINARY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conditon getRightConditon() {
		return rightConditon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightConditon(Conditon newRightConditon, NotificationChain msgs) {
		Conditon oldRightConditon = rightConditon;
		rightConditon = newRightConditon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ManufacturingPackage.BINARY_CONDITION__RIGHT_CONDITON, oldRightConditon, newRightConditon);
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
	public void setRightConditon(Conditon newRightConditon) {
		if (newRightConditon != rightConditon) {
			NotificationChain msgs = null;
			if (rightConditon != null)
				msgs = ((InternalEObject)rightConditon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ManufacturingPackage.BINARY_CONDITION__RIGHT_CONDITON, null, msgs);
			if (newRightConditon != null)
				msgs = ((InternalEObject)newRightConditon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ManufacturingPackage.BINARY_CONDITION__RIGHT_CONDITON, null, msgs);
			msgs = basicSetRightConditon(newRightConditon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingPackage.BINARY_CONDITION__RIGHT_CONDITON, newRightConditon, newRightConditon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManufacturingPackage.BINARY_CONDITION__LEFT_CONDITON:
				return basicSetLeftConditon(null, msgs);
			case ManufacturingPackage.BINARY_CONDITION__RIGHT_CONDITON:
				return basicSetRightConditon(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(BinaryOperator newOperator) {
		BinaryOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingPackage.BINARY_CONDITION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conditon getLeftConditon() {
		return leftConditon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftConditon(Conditon newLeftConditon, NotificationChain msgs) {
		Conditon oldLeftConditon = leftConditon;
		leftConditon = newLeftConditon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ManufacturingPackage.BINARY_CONDITION__LEFT_CONDITON, oldLeftConditon, newLeftConditon);
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
	public void setLeftConditon(Conditon newLeftConditon) {
		if (newLeftConditon != leftConditon) {
			NotificationChain msgs = null;
			if (leftConditon != null)
				msgs = ((InternalEObject)leftConditon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ManufacturingPackage.BINARY_CONDITION__LEFT_CONDITON, null, msgs);
			if (newLeftConditon != null)
				msgs = ((InternalEObject)newLeftConditon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ManufacturingPackage.BINARY_CONDITION__LEFT_CONDITON, null, msgs);
			msgs = basicSetLeftConditon(newLeftConditon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingPackage.BINARY_CONDITION__LEFT_CONDITON, newLeftConditon, newLeftConditon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManufacturingPackage.BINARY_CONDITION__OPERATOR:
				return getOperator();
			case ManufacturingPackage.BINARY_CONDITION__LEFT_CONDITON:
				return getLeftConditon();
			case ManufacturingPackage.BINARY_CONDITION__RIGHT_CONDITON:
				return getRightConditon();
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
			case ManufacturingPackage.BINARY_CONDITION__OPERATOR:
				setOperator((BinaryOperator)newValue);
				return;
			case ManufacturingPackage.BINARY_CONDITION__LEFT_CONDITON:
				setLeftConditon((Conditon)newValue);
				return;
			case ManufacturingPackage.BINARY_CONDITION__RIGHT_CONDITON:
				setRightConditon((Conditon)newValue);
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
			case ManufacturingPackage.BINARY_CONDITION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case ManufacturingPackage.BINARY_CONDITION__LEFT_CONDITON:
				setLeftConditon((Conditon)null);
				return;
			case ManufacturingPackage.BINARY_CONDITION__RIGHT_CONDITON:
				setRightConditon((Conditon)null);
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
			case ManufacturingPackage.BINARY_CONDITION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case ManufacturingPackage.BINARY_CONDITION__LEFT_CONDITON:
				return leftConditon != null;
			case ManufacturingPackage.BINARY_CONDITION__RIGHT_CONDITON:
				return rightConditon != null;
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

} //BinaryConditionImpl
