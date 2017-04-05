/**
 */
package de.bund.bfr.rakip.pmmlab;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage
 * @generated
 */
public interface pmmlabFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	pmmlabFactory eINSTANCE = de.bund.bfr.rakip.pmmlab.impl.pmmlabFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pmm Lab Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pmm Lab Record</em>'.
	 * @generated
	 */
	PmmLabRecord createPmmLabRecord();

	/**
	 * Returns a new object of class '<em>Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matrix</em>'.
	 * @generated
	 */
	Matrix createMatrix();

	/**
	 * Returns a new object of class '<em>Organism</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organism</em>'.
	 * @generated
	 */
	Organism createOrganism();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Reference Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Description</em>'.
	 * @generated
	 */
	ReferenceDescription createReferenceDescription();

	/**
	 * Returns a new object of class '<em>Model Equation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Equation</em>'.
	 * @generated
	 */
	ModelEquation createModelEquation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	pmmlabPackage getpmmlabPackage();

} //pmmlabFactory
