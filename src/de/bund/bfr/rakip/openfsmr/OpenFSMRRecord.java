/**
 */
package de.bund.bfr.rakip.openfsmr;

import java.net.URL;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open FSMR Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getIndependentVariables <em>Independent Variables</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getDependentVariables <em>Dependent Variables</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getOrganism <em>Organism</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getId <em>Id</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getCreator <em>Creator</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getModifiedDate <em>Modified Date</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getRights <em>Rights</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getReferenceDescription <em>Reference Description</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getReferenceDescriptionLink <em>Reference Description Link</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getSoftware <em>Software</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getFoodProcess <em>Food Process</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getType <em>Type</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getCurationStatus <em>Curation Status</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getSubject <em>Subject</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getOpenFSMRRecord()
 * @model
 * @generated
 */
public interface OpenFSMRRecord extends EObject {
	/**
	 * Returns the value of the '<em><b>Independent Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.bund.bfr.rakip.openfsmr.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Independent Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Independent Variables</em>' containment reference list.
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getOpenFSMRRecord_IndependentVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getIndependentVariables();

	/**
	 * Returns the value of the '<em><b>Dependent Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.bund.bfr.rakip.openfsmr.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Variables</em>' containment reference list.
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getOpenFSMRRecord_DependentVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getDependentVariables();

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(Environment)
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getOpenFSMRRecord_Environment()
	 * @model containment="true"
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

	/**
	 * Returns the value of the '<em><b>Organism</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organism</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organism</em>' containment reference.
	 * @see #setOrganism(Organism)
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getOpenFSMRRecord_Organism()
	 * @model containment="true"
	 * @generated
	 */
	Organism getOrganism();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getOrganism <em>Organism</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organism</em>' containment reference.
	 * @see #getOrganism()
	 * @generated
	 */
	void setOrganism(Organism value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getOpenFSMRRecord_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' attribute.
	 * @see #setCreator(String)
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getOpenFSMRRecord_Creator()
	 * @model
	 * @generated
	 */
	String getCreator();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getCreator <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' attribute.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(String value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getOpenFSMRRecord_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified Date</em>' attribute.
	 * @see #setModifiedDate(Date)
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getOpenFSMRRecord_ModifiedDate()
	 * @model
	 * @generated
	 */
	Date getModifiedDate();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getModifiedDate <em>Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified Date</em>' attribute.
	 * @see #getModifiedDate()
	 * @generated
	 */
	void setModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Rights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rights</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rights</em>' attribute.
	 * @see #setRights(String)
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getOpenFSMRRecord_Rights()
	 * @model
	 * @generated
	 */
	String getRights();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getRights <em>Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rights</em>' attribute.
	 * @see #getRights()
	 * @generated
	 */
	void setRights(String value);

	/**
	 * Returns the value of the '<em><b>Reference Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Description</em>' attribute.
	 * @see #setReferenceDescription(String)
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getOpenFSMRRecord_ReferenceDescription()
	 * @model
	 * @generated
	 */
	String getReferenceDescription();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getReferenceDescription <em>Reference Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Description</em>' attribute.
	 * @see #getReferenceDescription()
	 * @generated
	 */
	void setReferenceDescription(String value);

	/**
	 * Returns the value of the '<em><b>Reference Description Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Description Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Description Link</em>' attribute.
	 * @see #setReferenceDescriptionLink(URL)
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getOpenFSMRRecord_ReferenceDescriptionLink()
	 * @model dataType="de.bund.bfr.rakip.pmmlab.URL"
	 * @generated
	 */
	URL getReferenceDescriptionLink();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getReferenceDescriptionLink <em>Reference Description Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Description Link</em>' attribute.
	 * @see #getReferenceDescriptionLink()
	 * @generated
	 */
	void setReferenceDescriptionLink(URL value);

	/**
	 * Returns the value of the '<em><b>Software</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software</em>' attribute.
	 * @see #setSoftware(String)
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getOpenFSMRRecord_Software()
	 * @model
	 * @generated
	 */
	String getSoftware();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getSoftware <em>Software</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software</em>' attribute.
	 * @see #getSoftware()
	 * @generated
	 */
	void setSoftware(String value);

	/**
	 * Returns the value of the '<em><b>Food Process</b></em>' attribute.
	 * The literals are from the enumeration {@link de.bund.bfr.rakip.openfsmr.FoodProcess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Food Process</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Food Process</em>' attribute.
	 * @see de.bund.bfr.rakip.openfsmr.FoodProcess
	 * @see #setFoodProcess(FoodProcess)
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getOpenFSMRRecord_FoodProcess()
	 * @model
	 * @generated
	 */
	FoodProcess getFoodProcess();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getFoodProcess <em>Food Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Food Process</em>' attribute.
	 * @see de.bund.bfr.rakip.openfsmr.FoodProcess
	 * @see #getFoodProcess()
	 * @generated
	 */
	void setFoodProcess(FoodProcess value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.bund.bfr.rakip.openfsmr.ModelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.bund.bfr.rakip.openfsmr.ModelType
	 * @see #setType(ModelType)
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getOpenFSMRRecord_Type()
	 * @model
	 * @generated
	 */
	ModelType getType();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.bund.bfr.rakip.openfsmr.ModelType
	 * @see #getType()
	 * @generated
	 */
	void setType(ModelType value);

	/**
	 * Returns the value of the '<em><b>Curation Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.bund.bfr.rakip.openfsmr.CurationStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curation Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curation Status</em>' attribute.
	 * @see de.bund.bfr.rakip.openfsmr.CurationStatus
	 * @see #setCurationStatus(CurationStatus)
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getOpenFSMRRecord_CurationStatus()
	 * @model
	 * @generated
	 */
	CurationStatus getCurationStatus();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getCurationStatus <em>Curation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curation Status</em>' attribute.
	 * @see de.bund.bfr.rakip.openfsmr.CurationStatus
	 * @see #getCurationStatus()
	 * @generated
	 */
	void setCurationStatus(CurationStatus value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getOpenFSMRRecord_Subject()
	 * @model
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getOpenFSMRRecord_Notes()
	 * @model
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

} // OpenFSMRRecord
