/**
 */
package Manufacturing;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Facility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Manufacturing.StorageFacility#getId <em>Id</em>}</li>
 *   <li>{@link Manufacturing.StorageFacility#getName <em>Name</em>}</li>
 *   <li>{@link Manufacturing.StorageFacility#getStorage <em>Storage</em>}</li>
 *   <li>{@link Manufacturing.StorageFacility#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see Manufacturing.ManufacturingPackage#getStorageFacility()
 * @model
 * @generated
 */
public interface StorageFacility extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see Manufacturing.ManufacturingPackage#getStorageFacility_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link Manufacturing.StorageFacility#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Manufacturing.ManufacturingPackage#getStorageFacility_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Manufacturing.StorageFacility#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Storage</b></em>' containment reference list.
	 * The list contents are of type {@link Manufacturing.WorkPiece}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage</em>' containment reference list.
	 * @see Manufacturing.ManufacturingPackage#getStorageFacility_Storage()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkPiece> getStorage();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link Manufacturing.WorkPieceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see Manufacturing.ManufacturingPackage#getStorageFacility_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkPieceType> getTypes();

} // StorageFacility
