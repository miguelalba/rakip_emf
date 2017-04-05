/**
 */
package de.bund.bfr.rakip.pmmlab;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.Parameter#isIsDependent <em>Is Dependent</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.Parameter#getDescription <em>Description</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.Parameter#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.Parameter#getValue <em>Value</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.Parameter#getMin <em>Min</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.Parameter#getMax <em>Max</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.Parameter#getSse <em>Sse</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.Parameter#getMse <em>Mse</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.Parameter#getRmse <em>Rmse</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.Parameter#getRsquared <em>Rsquared</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.Parameter#getAic <em>Aic</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.Parameter#getBic <em>Bic</em>}</li>
 * </ul>
 *
 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Dependent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Dependent</em>' attribute.
	 * @see #setIsDependent(boolean)
	 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getParameter_IsDependent()
	 * @model
	 * @generated
	 */
	boolean isIsDependent();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.pmmlab.Parameter#isIsDependent <em>Is Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Dependent</em>' attribute.
	 * @see #isIsDependent()
	 * @generated
	 */
	void setIsDependent(boolean value);

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
	 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.pmmlab.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getParameter_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.pmmlab.Parameter#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getParameter_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.pmmlab.Parameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getParameter_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.pmmlab.Parameter#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getParameter_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.pmmlab.Parameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

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
	 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getParameter_Min()
	 * @model
	 * @generated
	 */
	double getMin();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.pmmlab.Parameter#getMin <em>Min</em>}' attribute.
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
	 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getParameter_Max()
	 * @model
	 * @generated
	 */
	double getMax();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.pmmlab.Parameter#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(double value);

	/**
	 * Returns the value of the '<em><b>Sse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sse</em>' attribute.
	 * @see #setSse(double)
	 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getParameter_Sse()
	 * @model
	 * @generated
	 */
	double getSse();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.pmmlab.Parameter#getSse <em>Sse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sse</em>' attribute.
	 * @see #getSse()
	 * @generated
	 */
	void setSse(double value);

	/**
	 * Returns the value of the '<em><b>Mse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mse</em>' attribute.
	 * @see #setMse(double)
	 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getParameter_Mse()
	 * @model
	 * @generated
	 */
	double getMse();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.pmmlab.Parameter#getMse <em>Mse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mse</em>' attribute.
	 * @see #getMse()
	 * @generated
	 */
	void setMse(double value);

	/**
	 * Returns the value of the '<em><b>Rmse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rmse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rmse</em>' attribute.
	 * @see #setRmse(double)
	 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getParameter_Rmse()
	 * @model
	 * @generated
	 */
	double getRmse();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.pmmlab.Parameter#getRmse <em>Rmse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rmse</em>' attribute.
	 * @see #getRmse()
	 * @generated
	 */
	void setRmse(double value);

	/**
	 * Returns the value of the '<em><b>Rsquared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rsquared</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rsquared</em>' attribute.
	 * @see #setRsquared(double)
	 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getParameter_Rsquared()
	 * @model
	 * @generated
	 */
	double getRsquared();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.pmmlab.Parameter#getRsquared <em>Rsquared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rsquared</em>' attribute.
	 * @see #getRsquared()
	 * @generated
	 */
	void setRsquared(double value);

	/**
	 * Returns the value of the '<em><b>Aic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aic</em>' attribute.
	 * @see #setAic(double)
	 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getParameter_Aic()
	 * @model
	 * @generated
	 */
	double getAic();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.pmmlab.Parameter#getAic <em>Aic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aic</em>' attribute.
	 * @see #getAic()
	 * @generated
	 */
	void setAic(double value);

	/**
	 * Returns the value of the '<em><b>Bic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bic</em>' attribute.
	 * @see #setBic(double)
	 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getParameter_Bic()
	 * @model
	 * @generated
	 */
	double getBic();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.pmmlab.Parameter#getBic <em>Bic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bic</em>' attribute.
	 * @see #getBic()
	 * @generated
	 */
	void setBic(double value);

} // Parameter
