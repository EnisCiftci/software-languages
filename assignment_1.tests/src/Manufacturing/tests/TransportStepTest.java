/**
 */
package Manufacturing.tests;

import Manufacturing.ManufacturingFactory;
import Manufacturing.TransportStep;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transport Step</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransportStepTest extends StepTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransportStepTest.class);
	}

	/**
	 * Constructs a new Transport Step test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportStepTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Transport Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TransportStep getFixture() {
		return (TransportStep)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManufacturingFactory.eINSTANCE.createTransportStep());
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

} //TransportStepTest
