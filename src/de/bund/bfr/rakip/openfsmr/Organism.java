/**
 */
package de.bund.bfr.rakip.openfsmr;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organism</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.Organism#getName <em>Name</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.Organism#getDetails <em>Details</em>}</li>
 * </ul>
 *
 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getOrganism()
 * @model
 * @generated
 */
public interface Organism extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getOrganism_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.openfsmr.Organism#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Details</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' attribute.
	 * @see #setDetails(String)
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getOrganism_Details()
	 * @model
	 * @generated
	 */
	String getDetails();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.openfsmr.Organism#getDetails <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details</em>' attribute.
	 * @see #getDetails()
	 * @generated
	 */
	void setDetails(String value);

} // Organism
