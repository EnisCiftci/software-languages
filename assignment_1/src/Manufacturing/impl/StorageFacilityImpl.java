/**
 */
package Manufacturing.impl;

import Manufacturing.ManufacturingPackage;
import Manufacturing.StorageFacility;
import Manufacturing.WorkPiece;

import Manufacturing.WorkPieceType;
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
 * An implementation of the model object '<em><b>Storage Facility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Manufacturing.impl.StorageFacilityImpl#getId <em>Id</em>}</li>
 *   <li>{@link Manufacturing.impl.StorageFacilityImpl#getName <em>Name</em>}</li>
 *   <li>{@link Manufacturing.impl.StorageFacilityImpl#getStorage <em>Storage</em>}</li>
 *   <li>{@link Manufacturing.impl.StorageFacilityImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageFacilityImpl extends MinimalEObjectImpl.Container implements StorageFacility {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

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
	 * The cached value of the '{@link #getStorage() <em>Storage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkPiece> storage;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkPieceType> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageFacilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturingPackage.Literals.STORAGE_FACILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingPackage.STORAGE_FACILITY__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingPackage.STORAGE_FACILITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkPiece> getStorage() {
		if (storage == null) {
			storage = new EObjectContainmentEList<WorkPiece>(WorkPiece.class, this, ManufacturingPackage.STORAGE_FACILITY__STORAGE);
		}
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkPieceType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<WorkPieceType>(WorkPieceType.class, this, ManufacturingPackage.STORAGE_FACILITY__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManufacturingPackage.STORAGE_FACILITY__STORAGE:
				return ((InternalEList<?>)getStorage()).basicRemove(otherEnd, msgs);
			case ManufacturingPackage.STORAGE_FACILITY__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case ManufacturingPackage.STORAGE_FACILITY__ID:
				return getId();
			case ManufacturingPackage.STORAGE_FACILITY__NAME:
				return getName();
			case ManufacturingPackage.STORAGE_FACILITY__STORAGE:
				return getStorage();
			case ManufacturingPackage.STORAGE_FACILITY__TYPES:
				return getTypes();
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
			case ManufacturingPackage.STORAGE_FACILITY__ID:
				setId((Integer)newValue);
				return;
			case ManufacturingPackage.STORAGE_FACILITY__NAME:
				setName((String)newValue);
				return;
			case ManufacturingPackage.STORAGE_FACILITY__STORAGE:
				getStorage().clear();
				getStorage().addAll((Collection<? extends WorkPiece>)newValue);
				return;
			case ManufacturingPackage.STORAGE_FACILITY__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends WorkPieceType>)newValue);
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
			case ManufacturingPackage.STORAGE_FACILITY__ID:
				setId(ID_EDEFAULT);
				return;
			case ManufacturingPackage.STORAGE_FACILITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ManufacturingPackage.STORAGE_FACILITY__STORAGE:
				getStorage().clear();
				return;
			case ManufacturingPackage.STORAGE_FACILITY__TYPES:
				getTypes().clear();
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
			case ManufacturingPackage.STORAGE_FACILITY__ID:
				return id != ID_EDEFAULT;
			case ManufacturingPackage.STORAGE_FACILITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ManufacturingPackage.STORAGE_FACILITY__STORAGE:
				return storage != null && !storage.isEmpty();
			case ManufacturingPackage.STORAGE_FACILITY__TYPES:
				return types != null && !types.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StorageFacilityImpl
