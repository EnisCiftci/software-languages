/**
 */
package Manufacturing.tests;

import Manufacturing.ManufacturingFactory;
import Manufacturing.QualityAssuranceStep;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Quality Assurance Step</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualityAssuranceStepTest extends StepTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QualityAssuranceStepTest.class);
	}

	/**
	 * Constructs a new Quality Assurance Step test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityAssuranceStepTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Quality Assurance Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QualityAssuranceStep getFixture() {
		return (QualityAssuranceStep)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManufacturingFactory.eINSTANCE.createQualityAssuranceStep());
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

} //QualityAssuranceStepTest
