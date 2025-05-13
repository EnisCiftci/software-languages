/**
 */
package Manufacturing.impl;

import Manufacturing.ManufacturingPackage;
import Manufacturing.ManufacturingSystem;
import Manufacturing.Step;
import Manufacturing.StorageFacility;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Manufacturing.impl.ManufacturingSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link Manufacturing.impl.ManufacturingSystemImpl#getStart <em>Start</em>}</li>
 *   <li>{@link Manufacturing.impl.ManufacturingSystemImpl#getEnd <em>End</em>}</li>
 *   <li>{@link Manufacturing.impl.ManufacturingSystemImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManufacturingSystemImpl extends MinimalEObjectImpl.Container implements ManufacturingSystem {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected StorageFacility start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected StorageFacility end;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> steps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManufacturingSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturingPackage.Literals.MANUFACTURING_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingPackage.MANUFACTURING_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StorageFacility getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(StorageFacility newStart, NotificationChain msgs) {
		StorageFacility oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ManufacturingPackage.MANUFACTURING_SYSTEM__START, oldStart, newStart);
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
	public void setStart(StorageFacility newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ManufacturingPackage.MANUFACTURING_SYSTEM__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ManufacturingPackage.MANUFACTURING_SYSTEM__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingPackage.MANUFACTURING_SYSTEM__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StorageFacility getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(StorageFacility newEnd, NotificationChain msgs) {
		StorageFacility oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ManufacturingPackage.MANUFACTURING_SYSTEM__END, oldEnd, newEnd);
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
	public void setEnd(StorageFacility newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ManufacturingPackage.MANUFACTURING_SYSTEM__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ManufacturingPackage.MANUFACTURING_SYSTEM__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingPackage.MANUFACTURING_SYSTEM__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<Step>(Step.class, this, ManufacturingPackage.MANUFACTURING_SYSTEM__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManufacturingPackage.MANUFACTURING_SYSTEM__START:
				return basicSetStart(null, msgs);
			case ManufacturingPackage.MANUFACTURING_SYSTEM__END:
				return basicSetEnd(null, msgs);
			case ManufacturingPackage.MANUFACTURING_SYSTEM__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
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
			case ManufacturingPackage.MANUFACTURING_SYSTEM__NAME:
				return getName();
			case ManufacturingPackage.MANUFACTURING_SYSTEM__START:
				return getStart();
			case ManufacturingPackage.MANUFACTURING_SYSTEM__END:
				return getEnd();
			case ManufacturingPackage.MANUFACTURING_SYSTEM__STEPS:
				return getSteps();
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
			case ManufacturingPackage.MANUFACTURING_SYSTEM__NAME:
				setName((String)newValue);
				return;
			case ManufacturingPackage.MANUFACTURING_SYSTEM__START:
				setStart((StorageFacility)newValue);
				return;
			case ManufacturingPackage.MANUFACTURING_SYSTEM__END:
				setEnd((StorageFacility)newValue);
				return;
			case ManufacturingPackage.MANUFACTURING_SYSTEM__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends Step>)newValue);
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
			case ManufacturingPackage.MANUFACTURING_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ManufacturingPackage.MANUFACTURING_SYSTEM__START:
				setStart((StorageFacility)null);
				return;
			case ManufacturingPackage.MANUFACTURING_SYSTEM__END:
				setEnd((StorageFacility)null);
				return;
			case ManufacturingPackage.MANUFACTURING_SYSTEM__STEPS:
				getSteps().clear();
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
			case ManufacturingPackage.MANUFACTURING_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ManufacturingPackage.MANUFACTURING_SYSTEM__START:
				return start != null;
			case ManufacturingPackage.MANUFACTURING_SYSTEM__END:
				return end != null;
			case ManufacturingPackage.MANUFACTURING_SYSTEM__STEPS:
				return steps != null && !steps.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ManufacturingSystemImpl
