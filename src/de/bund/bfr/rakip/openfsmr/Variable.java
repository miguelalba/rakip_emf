/**
 */
package de.bund.bfr.rakip.openfsmr;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.Variable#getName <em>Name</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.Variable#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.Variable#getMin <em>Min</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.Variable#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
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
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getVariable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.openfsmr.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getVariable_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.openfsmr.Variable#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(double)
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getVariable_Min()
	 * @model
	 * @generated
	 */
	double getMin();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.openfsmr.Variable#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(double value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(double)
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getVariable_Max()
	 * @model
	 * @generated
	 */
	double getMax();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.openfsmr.Variable#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(double value);

} // Variable
