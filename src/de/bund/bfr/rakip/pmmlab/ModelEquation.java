/**
 */
package de.bund.bfr.rakip.pmmlab;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Equation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.ModelEquation#getFormulaName <em>Formula Name</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.ModelEquation#getModelClass <em>Model Class</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.ModelEquation#getFormula <em>Formula</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.ModelEquation#getLiterature <em>Literature</em>}</li>
 * </ul>
 *
 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getModelEquation()
 * @model
 * @generated
 */
public interface ModelEquation extends EObject {
	/**
	 * Returns the value of the '<em><b>Formula Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula Name</em>' attribute.
	 * @see #setFormulaName(String)
	 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getModelEquation_FormulaName()
	 * @model
	 * @generated
	 */
	String getFormulaName();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.pmmlab.ModelEquation#getFormulaName <em>Formula Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula Name</em>' attribute.
	 * @see #getFormulaName()
	 * @generated
	 */
	void setFormulaName(String value);

	/**
	 * Returns the value of the '<em><b>Model Class</b></em>' attribute.
	 * The literals are from the enumeration {@link de.bund.bfr.rakip.pmmlab.ModelClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Class</em>' attribute.
	 * @see de.bund.bfr.rakip.pmmlab.ModelClass
	 * @see #setModelClass(ModelClass)
	 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getModelEquation_ModelClass()
	 * @model
	 * @generated
	 */
	ModelClass getModelClass();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.pmmlab.ModelEquation#getModelClass <em>Model Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Class</em>' attribute.
	 * @see de.bund.bfr.rakip.pmmlab.ModelClass
	 * @see #getModelClass()
	 * @generated
	 */
	void setModelClass(ModelClass value);

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' attribute.
	 * @see #setFormula(String)
	 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getModelEquation_Formula()
	 * @model
	 * @generated
	 */
	String getFormula();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.pmmlab.ModelEquation#getFormula <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' attribute.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(String value);

	/**
	 * Returns the value of the '<em><b>Literature</b></em>' containment reference list.
	 * The list contents are of type {@link de.bund.bfr.rakip.pmmlab.ReferenceDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literature</em>' containment reference list.
	 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getModelEquation_Literature()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReferenceDescription> getLiterature();

} // ModelEquation
