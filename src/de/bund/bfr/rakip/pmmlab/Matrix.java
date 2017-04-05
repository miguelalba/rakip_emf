/**
 */
package de.bund.bfr.rakip.pmmlab;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.Matrix#getName <em>Name</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.Matrix#getDetails <em>Details</em>}</li>
 * </ul>
 *
 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getMatrix()
 * @model
 * @generated
 */
public interface Matrix extends EObject {
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
	 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getMatrix_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.pmmlab.Matrix#getName <em>Name</em>}' attribute.
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
	 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getMatrix_Details()
	 * @model
	 * @generated
	 */
	String getDetails();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.pmmlab.Matrix#getDetails <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details</em>' attribute.
	 * @see #getDetails()
	 * @generated
	 */
	void setDetails(String value);

} // Matrix
