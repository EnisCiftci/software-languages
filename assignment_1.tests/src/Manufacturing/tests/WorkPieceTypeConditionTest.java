/**
 */
package Manufacturing.tests;

import Manufacturing.ManufacturingFactory;
import Manufacturing.WorkPieceTypeCondition;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Work Piece Type Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkPieceTypeConditionTest extends ConditonTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkPieceTypeConditionTest.class);
	}

	/**
	 * Constructs a new Work Piece Type Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkPieceTypeConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Work Piece Type Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WorkPieceTypeCondition getFixture() {
		return (WorkPieceTypeCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManufacturingFactory.eINSTANCE.createWorkPieceTypeCondition());
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

} //WorkPieceTypeConditionTest
