/**
 */
package Manufacturing.tests;

import Manufacturing.ManufacturingFactory;
import Manufacturing.WorkPiece;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Work Piece</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkPieceTest extends TestCase {

	/**
	 * The fixture for this Work Piece test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkPiece fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkPieceTest.class);
	}

	/**
	 * Constructs a new Work Piece test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkPieceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Work Piece test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(WorkPiece fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Work Piece test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkPiece getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManufacturingFactory.eINSTANCE.createWorkPiece());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //WorkPieceTest
