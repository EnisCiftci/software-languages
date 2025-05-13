/**
 */
package Manufacturing.tests;

import Manufacturing.BinaryCondition;
import Manufacturing.ManufacturingFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Binary Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryConditionTest extends ConditonTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BinaryConditionTest.class);
	}

	/**
	 * Constructs a new Binary Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Binary Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BinaryCondition getFixture() {
		return (BinaryCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManufacturingFactory.eINSTANCE.createBinaryCondition());
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

} //BinaryConditionTest
