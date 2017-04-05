/**
 */
package de.bund.bfr.rakip.openfsmr;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.bund.bfr.rakip.openfsmr.openfsmrFactory
 * @model kind="package"
 * @generated
 */
public interface openfsmrPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "openfsmr";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bfr.bund.de/rakip/openfsmr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "openfsmr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	openfsmrPackage eINSTANCE = de.bund.bfr.rakip.openfsmr.impl.openfsmrPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.bund.bfr.rakip.openfsmr.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bund.bfr.rakip.openfsmr.impl.VariableImpl
	 * @see de.bund.bfr.rakip.openfsmr.impl.openfsmrPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__UNIT = 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__MIN = 2;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__MAX = 3;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.bund.bfr.rakip.openfsmr.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bund.bfr.rakip.openfsmr.impl.EnvironmentImpl
	 * @see de.bund.bfr.rakip.openfsmr.impl.openfsmrPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__DETAILS = 1;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.bund.bfr.rakip.openfsmr.impl.OrganismImpl <em>Organism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bund.bfr.rakip.openfsmr.impl.OrganismImpl
	 * @see de.bund.bfr.rakip.openfsmr.impl.openfsmrPackageImpl#getOrganism()
	 * @generated
	 */
	int ORGANISM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISM__DETAILS = 1;

	/**
	 * The number of structural features of the '<em>Organism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Organism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.bund.bfr.rakip.openfsmr.impl.OpenFSMRRecordImpl <em>Open FSMR Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bund.bfr.rakip.openfsmr.impl.OpenFSMRRecordImpl
	 * @see de.bund.bfr.rakip.openfsmr.impl.openfsmrPackageImpl#getOpenFSMRRecord()
	 * @generated
	 */
	int OPEN_FSMR_RECORD = 3;

	/**
	 * The feature id for the '<em><b>Independent Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FSMR_RECORD__INDEPENDENT_VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Dependent Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FSMR_RECORD__DEPENDENT_VARIABLES = 1;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FSMR_RECORD__ENVIRONMENT = 2;

	/**
	 * The feature id for the '<em><b>Organism</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FSMR_RECORD__ORGANISM = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FSMR_RECORD__ID = 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FSMR_RECORD__CREATOR = 5;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FSMR_RECORD__CREATED_DATE = 6;

	/**
	 * The feature id for the '<em><b>Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FSMR_RECORD__MODIFIED_DATE = 7;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FSMR_RECORD__RIGHTS = 8;

	/**
	 * The feature id for the '<em><b>Reference Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FSMR_RECORD__REFERENCE_DESCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>Reference Description Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FSMR_RECORD__REFERENCE_DESCRIPTION_LINK = 10;

	/**
	 * The feature id for the '<em><b>Software</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FSMR_RECORD__SOFTWARE = 11;

	/**
	 * The feature id for the '<em><b>Food Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FSMR_RECORD__FOOD_PROCESS = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FSMR_RECORD__TYPE = 13;

	/**
	 * The feature id for the '<em><b>Curation Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FSMR_RECORD__CURATION_STATUS = 14;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FSMR_RECORD__SUBJECT = 15;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FSMR_RECORD__NOTES = 16;

	/**
	 * The number of structural features of the '<em>Open FSMR Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FSMR_RECORD_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Open FSMR Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FSMR_RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.bund.bfr.rakip.openfsmr.FoodProcess <em>Food Process</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bund.bfr.rakip.openfsmr.FoodProcess
	 * @see de.bund.bfr.rakip.openfsmr.impl.openfsmrPackageImpl#getFoodProcess()
	 * @generated
	 */
	int FOOD_PROCESS = 4;

	/**
	 * The meta object id for the '{@link de.bund.bfr.rakip.openfsmr.ModelType <em>Model Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bund.bfr.rakip.openfsmr.ModelType
	 * @see de.bund.bfr.rakip.openfsmr.impl.openfsmrPackageImpl#getModelType()
	 * @generated
	 */
	int MODEL_TYPE = 5;

	/**
	 * The meta object id for the '{@link de.bund.bfr.rakip.openfsmr.CurationStatus <em>Curation Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bund.bfr.rakip.openfsmr.CurationStatus
	 * @see de.bund.bfr.rakip.openfsmr.impl.openfsmrPackageImpl#getCurationStatus()
	 * @generated
	 */
	int CURATION_STATUS = 6;

	/**
	 * The meta object id for the '<em>URL</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URL
	 * @see de.bund.bfr.rakip.openfsmr.impl.openfsmrPackageImpl#getURL()
	 * @generated
	 */
	int URL = 7;


	/**
	 * Returns the meta object for class '{@link de.bund.bfr.rakip.openfsmr.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.openfsmr.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.openfsmr.Variable#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.Variable#getUnit()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Unit();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.openfsmr.Variable#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.Variable#getMin()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Min();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.openfsmr.Variable#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.Variable#getMax()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Max();

	/**
	 * Returns the meta object for class '{@link de.bund.bfr.rakip.openfsmr.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.openfsmr.Environment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.Environment#getName()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.openfsmr.Environment#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Details</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.Environment#getDetails()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Details();

	/**
	 * Returns the meta object for class '{@link de.bund.bfr.rakip.openfsmr.Organism <em>Organism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organism</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.Organism
	 * @generated
	 */
	EClass getOrganism();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.openfsmr.Organism#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.Organism#getName()
	 * @see #getOrganism()
	 * @generated
	 */
	EAttribute getOrganism_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.openfsmr.Organism#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Details</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.Organism#getDetails()
	 * @see #getOrganism()
	 * @generated
	 */
	EAttribute getOrganism_Details();

	/**
	 * Returns the meta object for class '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord <em>Open FSMR Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open FSMR Record</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.OpenFSMRRecord
	 * @generated
	 */
	EClass getOpenFSMRRecord();

	/**
	 * Returns the meta object for the containment reference list '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getIndependentVariables <em>Independent Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Independent Variables</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getIndependentVariables()
	 * @see #getOpenFSMRRecord()
	 * @generated
	 */
	EReference getOpenFSMRRecord_IndependentVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getDependentVariables <em>Dependent Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependent Variables</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getDependentVariables()
	 * @see #getOpenFSMRRecord()
	 * @generated
	 */
	EReference getOpenFSMRRecord_DependentVariables();

	/**
	 * Returns the meta object for the containment reference '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getEnvironment()
	 * @see #getOpenFSMRRecord()
	 * @generated
	 */
	EReference getOpenFSMRRecord_Environment();

	/**
	 * Returns the meta object for the containment reference '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getOrganism <em>Organism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organism</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getOrganism()
	 * @see #getOpenFSMRRecord()
	 * @generated
	 */
	EReference getOpenFSMRRecord_Organism();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getId()
	 * @see #getOpenFSMRRecord()
	 * @generated
	 */
	EAttribute getOpenFSMRRecord_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creator</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getCreator()
	 * @see #getOpenFSMRRecord()
	 * @generated
	 */
	EAttribute getOpenFSMRRecord_Creator();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getCreatedDate()
	 * @see #getOpenFSMRRecord()
	 * @generated
	 */
	EAttribute getOpenFSMRRecord_CreatedDate();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getModifiedDate <em>Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified Date</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getModifiedDate()
	 * @see #getOpenFSMRRecord()
	 * @generated
	 */
	EAttribute getOpenFSMRRecord_ModifiedDate();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getRights <em>Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rights</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getRights()
	 * @see #getOpenFSMRRecord()
	 * @generated
	 */
	EAttribute getOpenFSMRRecord_Rights();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getReferenceDescription <em>Reference Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Description</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getReferenceDescription()
	 * @see #getOpenFSMRRecord()
	 * @generated
	 */
	EAttribute getOpenFSMRRecord_ReferenceDescription();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getReferenceDescriptionLink <em>Reference Description Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Description Link</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getReferenceDescriptionLink()
	 * @see #getOpenFSMRRecord()
	 * @generated
	 */
	EAttribute getOpenFSMRRecord_ReferenceDescriptionLink();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getSoftware <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Software</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getSoftware()
	 * @see #getOpenFSMRRecord()
	 * @generated
	 */
	EAttribute getOpenFSMRRecord_Software();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getFoodProcess <em>Food Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Food Process</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getFoodProcess()
	 * @see #getOpenFSMRRecord()
	 * @generated
	 */
	EAttribute getOpenFSMRRecord_FoodProcess();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getType()
	 * @see #getOpenFSMRRecord()
	 * @generated
	 */
	EAttribute getOpenFSMRRecord_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getCurationStatus <em>Curation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curation Status</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getCurationStatus()
	 * @see #getOpenFSMRRecord()
	 * @generated
	 */
	EAttribute getOpenFSMRRecord_CurationStatus();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getSubject()
	 * @see #getOpenFSMRRecord()
	 * @generated
	 */
	EAttribute getOpenFSMRRecord_Subject();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.OpenFSMRRecord#getNotes()
	 * @see #getOpenFSMRRecord()
	 * @generated
	 */
	EAttribute getOpenFSMRRecord_Notes();

	/**
	 * Returns the meta object for enum '{@link de.bund.bfr.rakip.openfsmr.FoodProcess <em>Food Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Food Process</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.FoodProcess
	 * @generated
	 */
	EEnum getFoodProcess();

	/**
	 * Returns the meta object for enum '{@link de.bund.bfr.rakip.openfsmr.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Type</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.ModelType
	 * @generated
	 */
	EEnum getModelType();

	/**
	 * Returns the meta object for enum '{@link de.bund.bfr.rakip.openfsmr.CurationStatus <em>Curation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Curation Status</em>'.
	 * @see de.bund.bfr.rakip.openfsmr.CurationStatus
	 * @generated
	 */
	EEnum getCurationStatus();

	/**
	 * Returns the meta object for data type '{@link java.net.URL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URL</em>'.
	 * @see java.net.URL
	 * @model instanceClass="java.net.URL"
	 * @generated
	 */
	EDataType getURL();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	openfsmrFactory getopenfsmrFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.bund.bfr.rakip.openfsmr.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bund.bfr.rakip.openfsmr.impl.VariableImpl
		 * @see de.bund.bfr.rakip.openfsmr.impl.openfsmrPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__UNIT = eINSTANCE.getVariable_Unit();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__MIN = eINSTANCE.getVariable_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__MAX = eINSTANCE.getVariable_Max();

		/**
		 * The meta object literal for the '{@link de.bund.bfr.rakip.openfsmr.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bund.bfr.rakip.openfsmr.impl.EnvironmentImpl
		 * @see de.bund.bfr.rakip.openfsmr.impl.openfsmrPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__NAME = eINSTANCE.getEnvironment_Name();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__DETAILS = eINSTANCE.getEnvironment_Details();

		/**
		 * The meta object literal for the '{@link de.bund.bfr.rakip.openfsmr.impl.OrganismImpl <em>Organism</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bund.bfr.rakip.openfsmr.impl.OrganismImpl
		 * @see de.bund.bfr.rakip.openfsmr.impl.openfsmrPackageImpl#getOrganism()
		 * @generated
		 */
		EClass ORGANISM = eINSTANCE.getOrganism();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISM__NAME = eINSTANCE.getOrganism_Name();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISM__DETAILS = eINSTANCE.getOrganism_Details();

		/**
		 * The meta object literal for the '{@link de.bund.bfr.rakip.openfsmr.impl.OpenFSMRRecordImpl <em>Open FSMR Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bund.bfr.rakip.openfsmr.impl.OpenFSMRRecordImpl
		 * @see de.bund.bfr.rakip.openfsmr.impl.openfsmrPackageImpl#getOpenFSMRRecord()
		 * @generated
		 */
		EClass OPEN_FSMR_RECORD = eINSTANCE.getOpenFSMRRecord();

		/**
		 * The meta object literal for the '<em><b>Independent Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_FSMR_RECORD__INDEPENDENT_VARIABLES = eINSTANCE.getOpenFSMRRecord_IndependentVariables();

		/**
		 * The meta object literal for the '<em><b>Dependent Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_FSMR_RECORD__DEPENDENT_VARIABLES = eINSTANCE.getOpenFSMRRecord_DependentVariables();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_FSMR_RECORD__ENVIRONMENT = eINSTANCE.getOpenFSMRRecord_Environment();

		/**
		 * The meta object literal for the '<em><b>Organism</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_FSMR_RECORD__ORGANISM = eINSTANCE.getOpenFSMRRecord_Organism();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_FSMR_RECORD__ID = eINSTANCE.getOpenFSMRRecord_Id();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_FSMR_RECORD__CREATOR = eINSTANCE.getOpenFSMRRecord_Creator();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_FSMR_RECORD__CREATED_DATE = eINSTANCE.getOpenFSMRRecord_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_FSMR_RECORD__MODIFIED_DATE = eINSTANCE.getOpenFSMRRecord_ModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Rights</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_FSMR_RECORD__RIGHTS = eINSTANCE.getOpenFSMRRecord_Rights();

		/**
		 * The meta object literal for the '<em><b>Reference Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_FSMR_RECORD__REFERENCE_DESCRIPTION = eINSTANCE.getOpenFSMRRecord_ReferenceDescription();

		/**
		 * The meta object literal for the '<em><b>Reference Description Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_FSMR_RECORD__REFERENCE_DESCRIPTION_LINK = eINSTANCE.getOpenFSMRRecord_ReferenceDescriptionLink();

		/**
		 * The meta object literal for the '<em><b>Software</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_FSMR_RECORD__SOFTWARE = eINSTANCE.getOpenFSMRRecord_Software();

		/**
		 * The meta object literal for the '<em><b>Food Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_FSMR_RECORD__FOOD_PROCESS = eINSTANCE.getOpenFSMRRecord_FoodProcess();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_FSMR_RECORD__TYPE = eINSTANCE.getOpenFSMRRecord_Type();

		/**
		 * The meta object literal for the '<em><b>Curation Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_FSMR_RECORD__CURATION_STATUS = eINSTANCE.getOpenFSMRRecord_CurationStatus();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_FSMR_RECORD__SUBJECT = eINSTANCE.getOpenFSMRRecord_Subject();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_FSMR_RECORD__NOTES = eINSTANCE.getOpenFSMRRecord_Notes();

		/**
		 * The meta object literal for the '{@link de.bund.bfr.rakip.openfsmr.FoodProcess <em>Food Process</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bund.bfr.rakip.openfsmr.FoodProcess
		 * @see de.bund.bfr.rakip.openfsmr.impl.openfsmrPackageImpl#getFoodProcess()
		 * @generated
		 */
		EEnum FOOD_PROCESS = eINSTANCE.getFoodProcess();

		/**
		 * The meta object literal for the '{@link de.bund.bfr.rakip.openfsmr.ModelType <em>Model Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bund.bfr.rakip.openfsmr.ModelType
		 * @see de.bund.bfr.rakip.openfsmr.impl.openfsmrPackageImpl#getModelType()
		 * @generated
		 */
		EEnum MODEL_TYPE = eINSTANCE.getModelType();

		/**
		 * The meta object literal for the '{@link de.bund.bfr.rakip.openfsmr.CurationStatus <em>Curation Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bund.bfr.rakip.openfsmr.CurationStatus
		 * @see de.bund.bfr.rakip.openfsmr.impl.openfsmrPackageImpl#getCurationStatus()
		 * @generated
		 */
		EEnum CURATION_STATUS = eINSTANCE.getCurationStatus();

		/**
		 * The meta object literal for the '<em>URL</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URL
		 * @see de.bund.bfr.rakip.openfsmr.impl.openfsmrPackageImpl#getURL()
		 * @generated
		 */
		EDataType URL = eINSTANCE.getURL();

	}

} //openfsmrPackage
