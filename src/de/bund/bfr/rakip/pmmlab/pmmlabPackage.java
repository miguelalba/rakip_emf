/**
 */
package de.bund.bfr.rakip.pmmlab;

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
 * @see de.bund.bfr.rakip.pmmlab.pmmlabFactory
 * @model kind="package"
 * @generated
 */
public interface pmmlabPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pmmlab";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bfr.bund.de/pmmlab";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pmmlab";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	pmmlabPackage eINSTANCE = de.bund.bfr.rakip.pmmlab.impl.pmmlabPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.bund.bfr.rakip.pmmlab.impl.PmmLabRecordImpl <em>Pmm Lab Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bund.bfr.rakip.pmmlab.impl.PmmLabRecordImpl
	 * @see de.bund.bfr.rakip.pmmlab.impl.pmmlabPackageImpl#getPmmLabRecord()
	 * @generated
	 */
	int PMM_LAB_RECORD = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMM_LAB_RECORD__ID = 0;

	/**
	 * The feature id for the '<em><b>Creator Given Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMM_LAB_RECORD__CREATOR_GIVEN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Creator Family Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMM_LAB_RECORD__CREATOR_FAMILY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Creator Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMM_LAB_RECORD__CREATOR_CONTACT = 3;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMM_LAB_RECORD__CREATION_DATE = 4;

	/**
	 * The feature id for the '<em><b>Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMM_LAB_RECORD__MODIFIED_DATE = 5;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMM_LAB_RECORD__LICENSE = 6;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMM_LAB_RECORD__YEAR = 7;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMM_LAB_RECORD__COMMENT = 8;

	/**
	 * The feature id for the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMM_LAB_RECORD__MATRIX = 9;

	/**
	 * The feature id for the '<em><b>Organism</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMM_LAB_RECORD__ORGANISM = 10;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMM_LAB_RECORD__PARAMETER = 11;

	/**
	 * The feature id for the '<em><b>Referencedescription</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMM_LAB_RECORD__REFERENCEDESCRIPTION = 12;

	/**
	 * The feature id for the '<em><b>Modelequation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMM_LAB_RECORD__MODELEQUATION = 13;

	/**
	 * The number of structural features of the '<em>Pmm Lab Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMM_LAB_RECORD_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Pmm Lab Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMM_LAB_RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.bund.bfr.rakip.pmmlab.impl.MatrixImpl <em>Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bund.bfr.rakip.pmmlab.impl.MatrixImpl
	 * @see de.bund.bfr.rakip.pmmlab.impl.pmmlabPackageImpl#getMatrix()
	 * @generated
	 */
	int MATRIX = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__NAME = 0;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__DETAILS = 1;

	/**
	 * The number of structural features of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.bund.bfr.rakip.pmmlab.impl.OrganismImpl <em>Organism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bund.bfr.rakip.pmmlab.impl.OrganismImpl
	 * @see de.bund.bfr.rakip.pmmlab.impl.pmmlabPackageImpl#getOrganism()
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
	 * The meta object id for the '{@link de.bund.bfr.rakip.pmmlab.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bund.bfr.rakip.pmmlab.impl.ParameterImpl
	 * @see de.bund.bfr.rakip.pmmlab.impl.pmmlabPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Is Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_DEPENDENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__UNIT = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 5;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MIN = 6;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MAX = 7;

	/**
	 * The feature id for the '<em><b>Sse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__SSE = 8;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MSE = 9;

	/**
	 * The feature id for the '<em><b>Rmse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__RMSE = 10;

	/**
	 * The feature id for the '<em><b>Rsquared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__RSQUARED = 11;

	/**
	 * The feature id for the '<em><b>Aic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__AIC = 12;

	/**
	 * The feature id for the '<em><b>Bic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__BIC = 13;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.bund.bfr.rakip.pmmlab.impl.ReferenceDescriptionImpl <em>Reference Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bund.bfr.rakip.pmmlab.impl.ReferenceDescriptionImpl
	 * @see de.bund.bfr.rakip.pmmlab.impl.pmmlabPackageImpl#getReferenceDescription()
	 * @generated
	 */
	int REFERENCE_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DESCRIPTION__LINK = 0;

	/**
	 * The feature id for the '<em><b>First Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DESCRIPTION__FIRST_AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DESCRIPTION__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DESCRIPTION__ABSTRACT = 3;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DESCRIPTION__VOLUME = 4;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DESCRIPTION__ISSUE = 5;

	/**
	 * The feature id for the '<em><b>Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DESCRIPTION__PAGE = 6;

	/**
	 * The feature id for the '<em><b>Approval Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DESCRIPTION__APPROVAL_MODE = 7;

	/**
	 * The feature id for the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DESCRIPTION__WEBSITE = 8;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DESCRIPTION__COMMENT = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DESCRIPTION__TYPE = 10;

	/**
	 * The number of structural features of the '<em>Reference Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DESCRIPTION_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Reference Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.bund.bfr.rakip.pmmlab.impl.ModelEquationImpl <em>Model Equation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bund.bfr.rakip.pmmlab.impl.ModelEquationImpl
	 * @see de.bund.bfr.rakip.pmmlab.impl.pmmlabPackageImpl#getModelEquation()
	 * @generated
	 */
	int MODEL_EQUATION = 5;

	/**
	 * The feature id for the '<em><b>Formula Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EQUATION__FORMULA_NAME = 0;

	/**
	 * The feature id for the '<em><b>Model Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EQUATION__MODEL_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EQUATION__FORMULA = 2;

	/**
	 * The feature id for the '<em><b>Literature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EQUATION__LITERATURE = 3;

	/**
	 * The number of structural features of the '<em>Model Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EQUATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Model Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EQUATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.bund.bfr.rakip.pmmlab.ModelClass <em>Model Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bund.bfr.rakip.pmmlab.ModelClass
	 * @see de.bund.bfr.rakip.pmmlab.impl.pmmlabPackageImpl#getModelClass()
	 * @generated
	 */
	int MODEL_CLASS = 6;

	/**
	 * The meta object id for the '{@link de.bund.bfr.rakip.pmmlab.ReferenceType <em>Reference Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bund.bfr.rakip.pmmlab.ReferenceType
	 * @see de.bund.bfr.rakip.pmmlab.impl.pmmlabPackageImpl#getReferenceType()
	 * @generated
	 */
	int REFERENCE_TYPE = 7;

	/**
	 * The meta object id for the '<em>URL</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URL
	 * @see de.bund.bfr.rakip.pmmlab.impl.pmmlabPackageImpl#getURL()
	 * @generated
	 */
	int URL = 8;


	/**
	 * Returns the meta object for class '{@link de.bund.bfr.rakip.pmmlab.PmmLabRecord <em>Pmm Lab Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pmm Lab Record</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.PmmLabRecord
	 * @generated
	 */
	EClass getPmmLabRecord();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.PmmLabRecord#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.PmmLabRecord#getId()
	 * @see #getPmmLabRecord()
	 * @generated
	 */
	EAttribute getPmmLabRecord_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.PmmLabRecord#getCreatorGivenName <em>Creator Given Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creator Given Name</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.PmmLabRecord#getCreatorGivenName()
	 * @see #getPmmLabRecord()
	 * @generated
	 */
	EAttribute getPmmLabRecord_CreatorGivenName();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.PmmLabRecord#getCreatorFamilyName <em>Creator Family Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creator Family Name</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.PmmLabRecord#getCreatorFamilyName()
	 * @see #getPmmLabRecord()
	 * @generated
	 */
	EAttribute getPmmLabRecord_CreatorFamilyName();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.PmmLabRecord#getCreatorContact <em>Creator Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creator Contact</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.PmmLabRecord#getCreatorContact()
	 * @see #getPmmLabRecord()
	 * @generated
	 */
	EAttribute getPmmLabRecord_CreatorContact();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.PmmLabRecord#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.PmmLabRecord#getCreationDate()
	 * @see #getPmmLabRecord()
	 * @generated
	 */
	EAttribute getPmmLabRecord_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.PmmLabRecord#getModifiedDate <em>Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified Date</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.PmmLabRecord#getModifiedDate()
	 * @see #getPmmLabRecord()
	 * @generated
	 */
	EAttribute getPmmLabRecord_ModifiedDate();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.PmmLabRecord#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.PmmLabRecord#getLicense()
	 * @see #getPmmLabRecord()
	 * @generated
	 */
	EAttribute getPmmLabRecord_License();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.PmmLabRecord#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.PmmLabRecord#getYear()
	 * @see #getPmmLabRecord()
	 * @generated
	 */
	EAttribute getPmmLabRecord_Year();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.PmmLabRecord#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.PmmLabRecord#getComment()
	 * @see #getPmmLabRecord()
	 * @generated
	 */
	EAttribute getPmmLabRecord_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link de.bund.bfr.rakip.pmmlab.PmmLabRecord#getMatrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Matrix</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.PmmLabRecord#getMatrix()
	 * @see #getPmmLabRecord()
	 * @generated
	 */
	EReference getPmmLabRecord_Matrix();

	/**
	 * Returns the meta object for the containment reference '{@link de.bund.bfr.rakip.pmmlab.PmmLabRecord#getOrganism <em>Organism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organism</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.PmmLabRecord#getOrganism()
	 * @see #getPmmLabRecord()
	 * @generated
	 */
	EReference getPmmLabRecord_Organism();

	/**
	 * Returns the meta object for the containment reference list '{@link de.bund.bfr.rakip.pmmlab.PmmLabRecord#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.PmmLabRecord#getParameter()
	 * @see #getPmmLabRecord()
	 * @generated
	 */
	EReference getPmmLabRecord_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link de.bund.bfr.rakip.pmmlab.PmmLabRecord#getReferencedescription <em>Referencedescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Referencedescription</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.PmmLabRecord#getReferencedescription()
	 * @see #getPmmLabRecord()
	 * @generated
	 */
	EReference getPmmLabRecord_Referencedescription();

	/**
	 * Returns the meta object for the containment reference '{@link de.bund.bfr.rakip.pmmlab.PmmLabRecord#getModelequation <em>Modelequation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modelequation</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.PmmLabRecord#getModelequation()
	 * @see #getPmmLabRecord()
	 * @generated
	 */
	EReference getPmmLabRecord_Modelequation();

	/**
	 * Returns the meta object for class '{@link de.bund.bfr.rakip.pmmlab.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.Matrix
	 * @generated
	 */
	EClass getMatrix();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.Matrix#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.Matrix#getName()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.Matrix#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Details</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.Matrix#getDetails()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_Details();

	/**
	 * Returns the meta object for class '{@link de.bund.bfr.rakip.pmmlab.Organism <em>Organism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organism</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.Organism
	 * @generated
	 */
	EClass getOrganism();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.Organism#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.Organism#getName()
	 * @see #getOrganism()
	 * @generated
	 */
	EAttribute getOrganism_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.Organism#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Details</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.Organism#getDetails()
	 * @see #getOrganism()
	 * @generated
	 */
	EAttribute getOrganism_Details();

	/**
	 * Returns the meta object for class '{@link de.bund.bfr.rakip.pmmlab.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.Parameter#isIsDependent <em>Is Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Dependent</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.Parameter#isIsDependent()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_IsDependent();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.Parameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.Parameter#getDescription()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.Parameter#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.Parameter#getUnit()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Unit();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.Parameter#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.Parameter#getMin()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Min();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.Parameter#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.Parameter#getMax()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Max();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.Parameter#getSse <em>Sse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sse</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.Parameter#getSse()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Sse();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.Parameter#getMse <em>Mse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mse</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.Parameter#getMse()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Mse();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.Parameter#getRmse <em>Rmse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rmse</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.Parameter#getRmse()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Rmse();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.Parameter#getRsquared <em>Rsquared</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rsquared</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.Parameter#getRsquared()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Rsquared();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.Parameter#getAic <em>Aic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aic</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.Parameter#getAic()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Aic();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.Parameter#getBic <em>Bic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bic</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.Parameter#getBic()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Bic();

	/**
	 * Returns the meta object for class '{@link de.bund.bfr.rakip.pmmlab.ReferenceDescription <em>Reference Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Description</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.ReferenceDescription
	 * @generated
	 */
	EClass getReferenceDescription();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.ReferenceDescription#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.ReferenceDescription#getLink()
	 * @see #getReferenceDescription()
	 * @generated
	 */
	EAttribute getReferenceDescription_Link();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.ReferenceDescription#getFirstAuthor <em>First Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Author</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.ReferenceDescription#getFirstAuthor()
	 * @see #getReferenceDescription()
	 * @generated
	 */
	EAttribute getReferenceDescription_FirstAuthor();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.ReferenceDescription#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.ReferenceDescription#getTitle()
	 * @see #getReferenceDescription()
	 * @generated
	 */
	EAttribute getReferenceDescription_Title();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.ReferenceDescription#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.ReferenceDescription#getAbstract()
	 * @see #getReferenceDescription()
	 * @generated
	 */
	EAttribute getReferenceDescription_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.ReferenceDescription#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.ReferenceDescription#getVolume()
	 * @see #getReferenceDescription()
	 * @generated
	 */
	EAttribute getReferenceDescription_Volume();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.ReferenceDescription#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.ReferenceDescription#getIssue()
	 * @see #getReferenceDescription()
	 * @generated
	 */
	EAttribute getReferenceDescription_Issue();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.ReferenceDescription#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.ReferenceDescription#getPage()
	 * @see #getReferenceDescription()
	 * @generated
	 */
	EAttribute getReferenceDescription_Page();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.ReferenceDescription#getApprovalMode <em>Approval Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approval Mode</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.ReferenceDescription#getApprovalMode()
	 * @see #getReferenceDescription()
	 * @generated
	 */
	EAttribute getReferenceDescription_ApprovalMode();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.ReferenceDescription#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.ReferenceDescription#getWebsite()
	 * @see #getReferenceDescription()
	 * @generated
	 */
	EAttribute getReferenceDescription_Website();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.ReferenceDescription#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.ReferenceDescription#getComment()
	 * @see #getReferenceDescription()
	 * @generated
	 */
	EAttribute getReferenceDescription_Comment();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.ReferenceDescription#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.ReferenceDescription#getType()
	 * @see #getReferenceDescription()
	 * @generated
	 */
	EAttribute getReferenceDescription_Type();

	/**
	 * Returns the meta object for class '{@link de.bund.bfr.rakip.pmmlab.ModelEquation <em>Model Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Equation</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.ModelEquation
	 * @generated
	 */
	EClass getModelEquation();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.ModelEquation#getFormulaName <em>Formula Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula Name</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.ModelEquation#getFormulaName()
	 * @see #getModelEquation()
	 * @generated
	 */
	EAttribute getModelEquation_FormulaName();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.ModelEquation#getModelClass <em>Model Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Class</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.ModelEquation#getModelClass()
	 * @see #getModelEquation()
	 * @generated
	 */
	EAttribute getModelEquation_ModelClass();

	/**
	 * Returns the meta object for the attribute '{@link de.bund.bfr.rakip.pmmlab.ModelEquation#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.ModelEquation#getFormula()
	 * @see #getModelEquation()
	 * @generated
	 */
	EAttribute getModelEquation_Formula();

	/**
	 * Returns the meta object for the containment reference list '{@link de.bund.bfr.rakip.pmmlab.ModelEquation#getLiterature <em>Literature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literature</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.ModelEquation#getLiterature()
	 * @see #getModelEquation()
	 * @generated
	 */
	EReference getModelEquation_Literature();

	/**
	 * Returns the meta object for enum '{@link de.bund.bfr.rakip.pmmlab.ModelClass <em>Model Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Class</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.ModelClass
	 * @generated
	 */
	EEnum getModelClass();

	/**
	 * Returns the meta object for enum '{@link de.bund.bfr.rakip.pmmlab.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reference Type</em>'.
	 * @see de.bund.bfr.rakip.pmmlab.ReferenceType
	 * @generated
	 */
	EEnum getReferenceType();

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
	pmmlabFactory getpmmlabFactory();

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
		 * The meta object literal for the '{@link de.bund.bfr.rakip.pmmlab.impl.PmmLabRecordImpl <em>Pmm Lab Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bund.bfr.rakip.pmmlab.impl.PmmLabRecordImpl
		 * @see de.bund.bfr.rakip.pmmlab.impl.pmmlabPackageImpl#getPmmLabRecord()
		 * @generated
		 */
		EClass PMM_LAB_RECORD = eINSTANCE.getPmmLabRecord();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMM_LAB_RECORD__ID = eINSTANCE.getPmmLabRecord_Id();

		/**
		 * The meta object literal for the '<em><b>Creator Given Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMM_LAB_RECORD__CREATOR_GIVEN_NAME = eINSTANCE.getPmmLabRecord_CreatorGivenName();

		/**
		 * The meta object literal for the '<em><b>Creator Family Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMM_LAB_RECORD__CREATOR_FAMILY_NAME = eINSTANCE.getPmmLabRecord_CreatorFamilyName();

		/**
		 * The meta object literal for the '<em><b>Creator Contact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMM_LAB_RECORD__CREATOR_CONTACT = eINSTANCE.getPmmLabRecord_CreatorContact();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMM_LAB_RECORD__CREATION_DATE = eINSTANCE.getPmmLabRecord_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMM_LAB_RECORD__MODIFIED_DATE = eINSTANCE.getPmmLabRecord_ModifiedDate();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMM_LAB_RECORD__LICENSE = eINSTANCE.getPmmLabRecord_License();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMM_LAB_RECORD__YEAR = eINSTANCE.getPmmLabRecord_Year();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMM_LAB_RECORD__COMMENT = eINSTANCE.getPmmLabRecord_Comment();

		/**
		 * The meta object literal for the '<em><b>Matrix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMM_LAB_RECORD__MATRIX = eINSTANCE.getPmmLabRecord_Matrix();

		/**
		 * The meta object literal for the '<em><b>Organism</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMM_LAB_RECORD__ORGANISM = eINSTANCE.getPmmLabRecord_Organism();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMM_LAB_RECORD__PARAMETER = eINSTANCE.getPmmLabRecord_Parameter();

		/**
		 * The meta object literal for the '<em><b>Referencedescription</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMM_LAB_RECORD__REFERENCEDESCRIPTION = eINSTANCE.getPmmLabRecord_Referencedescription();

		/**
		 * The meta object literal for the '<em><b>Modelequation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMM_LAB_RECORD__MODELEQUATION = eINSTANCE.getPmmLabRecord_Modelequation();

		/**
		 * The meta object literal for the '{@link de.bund.bfr.rakip.pmmlab.impl.MatrixImpl <em>Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bund.bfr.rakip.pmmlab.impl.MatrixImpl
		 * @see de.bund.bfr.rakip.pmmlab.impl.pmmlabPackageImpl#getMatrix()
		 * @generated
		 */
		EClass MATRIX = eINSTANCE.getMatrix();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__NAME = eINSTANCE.getMatrix_Name();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__DETAILS = eINSTANCE.getMatrix_Details();

		/**
		 * The meta object literal for the '{@link de.bund.bfr.rakip.pmmlab.impl.OrganismImpl <em>Organism</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bund.bfr.rakip.pmmlab.impl.OrganismImpl
		 * @see de.bund.bfr.rakip.pmmlab.impl.pmmlabPackageImpl#getOrganism()
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
		 * The meta object literal for the '{@link de.bund.bfr.rakip.pmmlab.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bund.bfr.rakip.pmmlab.impl.ParameterImpl
		 * @see de.bund.bfr.rakip.pmmlab.impl.pmmlabPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Is Dependent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__IS_DEPENDENT = eINSTANCE.getParameter_IsDependent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DESCRIPTION = eINSTANCE.getParameter_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__UNIT = eINSTANCE.getParameter_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__MIN = eINSTANCE.getParameter_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__MAX = eINSTANCE.getParameter_Max();

		/**
		 * The meta object literal for the '<em><b>Sse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__SSE = eINSTANCE.getParameter_Sse();

		/**
		 * The meta object literal for the '<em><b>Mse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__MSE = eINSTANCE.getParameter_Mse();

		/**
		 * The meta object literal for the '<em><b>Rmse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__RMSE = eINSTANCE.getParameter_Rmse();

		/**
		 * The meta object literal for the '<em><b>Rsquared</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__RSQUARED = eINSTANCE.getParameter_Rsquared();

		/**
		 * The meta object literal for the '<em><b>Aic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__AIC = eINSTANCE.getParameter_Aic();

		/**
		 * The meta object literal for the '<em><b>Bic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__BIC = eINSTANCE.getParameter_Bic();

		/**
		 * The meta object literal for the '{@link de.bund.bfr.rakip.pmmlab.impl.ReferenceDescriptionImpl <em>Reference Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bund.bfr.rakip.pmmlab.impl.ReferenceDescriptionImpl
		 * @see de.bund.bfr.rakip.pmmlab.impl.pmmlabPackageImpl#getReferenceDescription()
		 * @generated
		 */
		EClass REFERENCE_DESCRIPTION = eINSTANCE.getReferenceDescription();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_DESCRIPTION__LINK = eINSTANCE.getReferenceDescription_Link();

		/**
		 * The meta object literal for the '<em><b>First Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_DESCRIPTION__FIRST_AUTHOR = eINSTANCE.getReferenceDescription_FirstAuthor();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_DESCRIPTION__TITLE = eINSTANCE.getReferenceDescription_Title();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_DESCRIPTION__ABSTRACT = eINSTANCE.getReferenceDescription_Abstract();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_DESCRIPTION__VOLUME = eINSTANCE.getReferenceDescription_Volume();

		/**
		 * The meta object literal for the '<em><b>Issue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_DESCRIPTION__ISSUE = eINSTANCE.getReferenceDescription_Issue();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_DESCRIPTION__PAGE = eINSTANCE.getReferenceDescription_Page();

		/**
		 * The meta object literal for the '<em><b>Approval Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_DESCRIPTION__APPROVAL_MODE = eINSTANCE.getReferenceDescription_ApprovalMode();

		/**
		 * The meta object literal for the '<em><b>Website</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_DESCRIPTION__WEBSITE = eINSTANCE.getReferenceDescription_Website();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_DESCRIPTION__COMMENT = eINSTANCE.getReferenceDescription_Comment();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_DESCRIPTION__TYPE = eINSTANCE.getReferenceDescription_Type();

		/**
		 * The meta object literal for the '{@link de.bund.bfr.rakip.pmmlab.impl.ModelEquationImpl <em>Model Equation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bund.bfr.rakip.pmmlab.impl.ModelEquationImpl
		 * @see de.bund.bfr.rakip.pmmlab.impl.pmmlabPackageImpl#getModelEquation()
		 * @generated
		 */
		EClass MODEL_EQUATION = eINSTANCE.getModelEquation();

		/**
		 * The meta object literal for the '<em><b>Formula Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_EQUATION__FORMULA_NAME = eINSTANCE.getModelEquation_FormulaName();

		/**
		 * The meta object literal for the '<em><b>Model Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_EQUATION__MODEL_CLASS = eINSTANCE.getModelEquation_ModelClass();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_EQUATION__FORMULA = eINSTANCE.getModelEquation_Formula();

		/**
		 * The meta object literal for the '<em><b>Literature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_EQUATION__LITERATURE = eINSTANCE.getModelEquation_Literature();

		/**
		 * The meta object literal for the '{@link de.bund.bfr.rakip.pmmlab.ModelClass <em>Model Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bund.bfr.rakip.pmmlab.ModelClass
		 * @see de.bund.bfr.rakip.pmmlab.impl.pmmlabPackageImpl#getModelClass()
		 * @generated
		 */
		EEnum MODEL_CLASS = eINSTANCE.getModelClass();

		/**
		 * The meta object literal for the '{@link de.bund.bfr.rakip.pmmlab.ReferenceType <em>Reference Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bund.bfr.rakip.pmmlab.ReferenceType
		 * @see de.bund.bfr.rakip.pmmlab.impl.pmmlabPackageImpl#getReferenceType()
		 * @generated
		 */
		EEnum REFERENCE_TYPE = eINSTANCE.getReferenceType();

		/**
		 * The meta object literal for the '<em>URL</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URL
		 * @see de.bund.bfr.rakip.pmmlab.impl.pmmlabPackageImpl#getURL()
		 * @generated
		 */
		EDataType URL = eINSTANCE.getURL();

	}

} //pmmlabPackage
