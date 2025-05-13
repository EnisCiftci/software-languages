/**
 */
package Manufacturing.tests;

import Manufacturing.ManufacturingFactory;
import Manufacturing.UnaryCondition;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unary Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnaryConditionTest extends ConditonTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnaryConditionTest.class);
	}

	/**
	 * Constructs a new Unary Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unary Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UnaryCondition getFixture() {
		return (UnaryCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManufacturingFactory.eINSTANCE.createUnaryCondition());
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

} //UnaryConditionTest
