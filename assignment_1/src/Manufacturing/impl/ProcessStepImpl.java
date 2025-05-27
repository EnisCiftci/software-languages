/**
 */
package Manufacturing.impl;

import Manufacturing.Conditon;
import Manufacturing.ManufacturingPackage;
import Manufacturing.ManufacturingSystem;
import Manufacturing.ProcessStep;

import Manufacturing.WorkPiece;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Manufacturing.impl.ProcessStepImpl#getSubManufacturingsystem <em>Sub Manufacturingsystem</em>}</li>
 *   <li>{@link Manufacturing.impl.ProcessStepImpl#getInputConditon <em>Input Conditon</em>}</li>
 *   <li>{@link Manufacturing.impl.ProcessStepImpl#getOutputWorkpiece <em>Output Workpiece</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessStepImpl extends StepImpl implements ProcessStep {
	/**
	 * The cached value of the '{@link #getSubManufacturingsystem() <em>Sub Manufacturingsystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubManufacturingsystem()
	 * @generated
	 * @ordered
	 */
	protected ManufacturingSystem subManufacturingsystem;

	/**
	 * The cached value of the '{@link #getInputConditon() <em>Input Conditon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputConditon()
	 * @generated
	 * @ordered
	 */
	protected Conditon inputConditon;

	/**
	 * The cached value of the '{@link #getOutputWorkpiece() <em>Output Workpiece</em>}' containment reference list.
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
	protected ProcessStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturingPackage.Literals.PROCESS_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManufacturingSystem getSubManufacturingsystem() {
		return subManufacturingsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubManufacturingsystem(ManufacturingSystem newSubManufacturingsystem, NotificationChain msgs) {
		ManufacturingSystem oldSubManufacturingsystem = subManufacturingsystem;
		subManufacturingsystem = newSubManufacturingsystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ManufacturingPackage.PROCESS_STEP__SUB_MANUFACTURINGSYSTEM, oldSubManufacturingsystem, newSubManufacturingsystem);
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
	public void setSubManufacturingsystem(ManufacturingSystem newSubManufacturingsystem) {
		if (newSubManufacturingsystem != subManufacturingsystem) {
			NotificationChain msgs = null;
			if (subManufacturingsystem != null)
				msgs = ((InternalEObject)subManufacturingsystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ManufacturingPackage.PROCESS_STEP__SUB_MANUFACTURINGSYSTEM, null, msgs);
			if (newSubManufacturingsystem != null)
				msgs = ((InternalEObject)newSubManufacturingsystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ManufacturingPackage.PROCESS_STEP__SUB_MANUFACTURINGSYSTEM, null, msgs);
			msgs = basicSetSubManufacturingsystem(newSubManufacturingsystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingPackage.PROCESS_STEP__SUB_MANUFACTURINGSYSTEM, newSubManufacturingsystem, newSubManufacturingsystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conditon getInputConditon() {
		return inputConditon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputConditon(Conditon newInputConditon, NotificationChain msgs) {
		Conditon oldInputConditon = inputConditon;
		inputConditon = newInputConditon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ManufacturingPackage.PROCESS_STEP__INPUT_CONDITON, oldInputConditon, newInputConditon);
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
	public void setInputConditon(Conditon newInputConditon) {
		if (newInputConditon != inputConditon) {
			NotificationChain msgs = null;
			if (inputConditon != null)
				msgs = ((InternalEObject)inputConditon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ManufacturingPackage.PROCESS_STEP__INPUT_CONDITON, null, msgs);
			if (newInputConditon != null)
				msgs = ((InternalEObject)newInputConditon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ManufacturingPackage.PROCESS_STEP__INPUT_CONDITON, null, msgs);
			msgs = basicSetInputConditon(newInputConditon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingPackage.PROCESS_STEP__INPUT_CONDITON, newInputConditon, newInputConditon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkPiece> getOutputWorkpiece() {
		if (outputWorkpiece == null) {
			outputWorkpiece = new EObjectContainmentEList<WorkPiece>(WorkPiece.class, this, ManufacturingPackage.PROCESS_STEP__OUTPUT_WORKPIECE);
		}
		return outputWorkpiece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManufacturingPackage.PROCESS_STEP__SUB_MANUFACTURINGSYSTEM:
				return basicSetSubManufacturingsystem(null, msgs);
			case ManufacturingPackage.PROCESS_STEP__INPUT_CONDITON:
				return basicSetInputConditon(null, msgs);
			case ManufacturingPackage.PROCESS_STEP__OUTPUT_WORKPIECE:
				return ((InternalEList<?>)getOutputWorkpiece()).basicRemove(otherEnd, msgs);
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
			case ManufacturingPackage.PROCESS_STEP__SUB_MANUFACTURINGSYSTEM:
				return getSubManufacturingsystem();
			case ManufacturingPackage.PROCESS_STEP__INPUT_CONDITON:
				return getInputConditon();
			case ManufacturingPackage.PROCESS_STEP__OUTPUT_WORKPIECE:
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
			case ManufacturingPackage.PROCESS_STEP__SUB_MANUFACTURINGSYSTEM:
				setSubManufacturingsystem((ManufacturingSystem)newValue);
				return;
			case ManufacturingPackage.PROCESS_STEP__INPUT_CONDITON:
				setInputConditon((Conditon)newValue);
				return;
			case ManufacturingPackage.PROCESS_STEP__OUTPUT_WORKPIECE:
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
			case ManufacturingPackage.PROCESS_STEP__SUB_MANUFACTURINGSYSTEM:
				setSubManufacturingsystem((ManufacturingSystem)null);
				return;
			case ManufacturingPackage.PROCESS_STEP__INPUT_CONDITON:
				setInputConditon((Conditon)null);
				return;
			case ManufacturingPackage.PROCESS_STEP__OUTPUT_WORKPIECE:
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
			case ManufacturingPackage.PROCESS_STEP__SUB_MANUFACTURINGSYSTEM:
				return subManufacturingsystem != null;
			case ManufacturingPackage.PROCESS_STEP__INPUT_CONDITON:
				return inputConditon != null;
			case ManufacturingPackage.PROCESS_STEP__OUTPUT_WORKPIECE:
				return outputWorkpiece != null && !outputWorkpiece.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessStepImpl
