/**
 */
package de.bund.bfr.rakip.openfsmr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage
 * @generated
 */
public interface openfsmrFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	openfsmrFactory eINSTANCE = de.bund.bfr.rakip.openfsmr.impl.openfsmrFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Organism</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organism</em>'.
	 * @generated
	 */
	Organism createOrganism();

	/**
	 * Returns a new object of class '<em>Open FSMR Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open FSMR Record</em>'.
	 * @generated
	 */
	OpenFSMRRecord createOpenFSMRRecord();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	openfsmrPackage getopenfsmrPackage();

} //openfsmrFactory
