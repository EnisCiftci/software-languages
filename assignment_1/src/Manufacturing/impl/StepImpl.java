/**
 */
package Manufacturing.impl;

import Manufacturing.ManufacturingPackage;
import Manufacturing.Person;
import Manufacturing.Step;
import Manufacturing.WorkPiece;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Manufacturing.impl.StepImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link Manufacturing.impl.StepImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link Manufacturing.impl.StepImpl#getInputWorkpiece <em>Input Workpiece</em>}</li>
 *   <li>{@link Manufacturing.impl.StepImpl#getOutputWorkpiece <em>Output Workpiece</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StepImpl extends MinimalEObjectImpl.Container implements Step {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected String duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected Person responsible;

	/**
	 * The cached value of the '{@link #getInputWorkpiece() <em>Input Workpiece</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputWorkpiece()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkPiece> inputWorkpiece;

	/**
	 * The cached value of the '{@link #getOutputWorkpiece() <em>Output Workpiece</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputWorkpiece()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkPiece> outputWorkpiece;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturingPackage.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(String newDuration) {
		String oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingPackage.STEP__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getResponsible() {
		if (responsible != null && responsible.eIsProxy()) {
			InternalEObject oldResponsible = (InternalEObject)responsible;
			responsible = (Person)eResolveProxy(oldResponsible);
			if (responsible != oldResponsible) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManufacturingPackage.STEP__RESPONSIBLE, oldResponsible, responsible));
			}
		}
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetResponsible() {
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponsible(Person newResponsible) {
		Person oldResponsible = responsible;
		responsible = newResponsible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingPackage.STEP__RESPONSIBLE, oldResponsible, responsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkPiece> getInputWorkpiece() {
		if (inputWorkpiece == null) {
			inputWorkpiece = new EObjectResolvingEList<WorkPiece>(WorkPiece.class, this, ManufacturingPackage.STEP__INPUT_WORKPIECE);
		}
		return inputWorkpiece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkPiece> getOutputWorkpiece() {
		if (outputWorkpiece == null) {
			outputWorkpiece = new EObjectResolvingEList<WorkPiece>(WorkPiece.class, this, ManufacturingPackage.STEP__OUTPUT_WORKPIECE);
		}
		return outputWorkpiece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManufacturingPackage.STEP__DURATION:
				return getDuration();
			case ManufacturingPackage.STEP__RESPONSIBLE:
				if (resolve) return getResponsible();
				return basicGetResponsible();
			case ManufacturingPackage.STEP__INPUT_WORKPIECE:
				return getInputWorkpiece();
			case ManufacturingPackage.STEP__OUTPUT_WORKPIECE:
				return getOutputWorkpiece();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ManufacturingPackage.STEP__DURATION:
				setDuration((String)newValue);
				return;
			case ManufacturingPackage.STEP__RESPONSIBLE:
				setResponsible((Person)newValue);
				return;
			case ManufacturingPackage.STEP__INPUT_WORKPIECE:
				getInputWorkpiece().clear();
				getInputWorkpiece().addAll((Collection<? extends WorkPiece>)newValue);
				return;
			case ManufacturingPackage.STEP__OUTPUT_WORKPIECE:
				getOutputWorkpiece().clear();
				getOutputWorkpiece().addAll((Collection<? extends WorkPiece>)newValue);
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
			case ManufacturingPackage.STEP__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case ManufacturingPackage.STEP__RESPONSIBLE:
				setResponsible((Person)null);
				return;
			case ManufacturingPackage.STEP__INPUT_WORKPIECE:
				getInputWorkpiece().clear();
				return;
			case ManufacturingPackage.STEP__OUTPUT_WORKPIECE:
				getOutputWorkpiece().clear();
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
			case ManufacturingPackage.STEP__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case ManufacturingPackage.STEP__RESPONSIBLE:
				return responsible != null;
			case ManufacturingPackage.STEP__INPUT_WORKPIECE:
				return inputWorkpiece != null && !inputWorkpiece.isEmpty();
			case ManufacturingPackage.STEP__OUTPUT_WORKPIECE:
				return outputWorkpiece != null && !outputWorkpiece.isEmpty();
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
		result.append(" (duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //StepImpl
