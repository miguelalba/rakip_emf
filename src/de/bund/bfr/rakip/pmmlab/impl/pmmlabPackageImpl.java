/**
 */
package de.bund.bfr.rakip.pmmlab.impl;

import de.bund.bfr.rakip.openfsmr.impl.openfsmrPackageImpl;

import de.bund.bfr.rakip.openfsmr.openfsmrPackage;

import de.bund.bfr.rakip.pmmlab.Matrix;
import de.bund.bfr.rakip.pmmlab.ModelClass;
import de.bund.bfr.rakip.pmmlab.ModelEquation;
import de.bund.bfr.rakip.pmmlab.Organism;
import de.bund.bfr.rakip.pmmlab.Parameter;
import de.bund.bfr.rakip.pmmlab.PmmLabRecord;
import de.bund.bfr.rakip.pmmlab.ReferenceDescription;
import de.bund.bfr.rakip.pmmlab.ReferenceType;
import de.bund.bfr.rakip.pmmlab.pmmlabFactory;
import de.bund.bfr.rakip.pmmlab.pmmlabPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class pmmlabPackageImpl extends EPackageImpl implements pmmlabPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pmmLabRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organismEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEquationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType urlEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private pmmlabPackageImpl() {
		super(eNS_URI, pmmlabFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link pmmlabPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static pmmlabPackage init() {
		if (isInited) return (pmmlabPackage)EPackage.Registry.INSTANCE.getEPackage(pmmlabPackage.eNS_URI);

		// Obtain or create and register package
		pmmlabPackageImpl thepmmlabPackage = (pmmlabPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof pmmlabPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new pmmlabPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		openfsmrPackageImpl theopenfsmrPackage = (openfsmrPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(openfsmrPackage.eNS_URI) instanceof openfsmrPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(openfsmrPackage.eNS_URI) : openfsmrPackage.eINSTANCE);

		// Create package meta-data objects
		thepmmlabPackage.createPackageContents();
		theopenfsmrPackage.createPackageContents();

		// Initialize created meta-data
		thepmmlabPackage.initializePackageContents();
		theopenfsmrPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thepmmlabPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(pmmlabPackage.eNS_URI, thepmmlabPackage);
		return thepmmlabPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPmmLabRecord() {
		return pmmLabRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPmmLabRecord_Id() {
		return (EAttribute)pmmLabRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPmmLabRecord_CreatorGivenName() {
		return (EAttribute)pmmLabRecordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPmmLabRecord_CreatorFamilyName() {
		return (EAttribute)pmmLabRecordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPmmLabRecord_CreatorContact() {
		return (EAttribute)pmmLabRecordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPmmLabRecord_CreationDate() {
		return (EAttribute)pmmLabRecordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPmmLabRecord_ModifiedDate() {
		return (EAttribute)pmmLabRecordEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPmmLabRecord_License() {
		return (EAttribute)pmmLabRecordEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPmmLabRecord_Year() {
		return (EAttribute)pmmLabRecordEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPmmLabRecord_Comment() {
		return (EAttribute)pmmLabRecordEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPmmLabRecord_Matrix() {
		return (EReference)pmmLabRecordEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPmmLabRecord_Organism() {
		return (EReference)pmmLabRecordEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPmmLabRecord_Parameter() {
		return (EReference)pmmLabRecordEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPmmLabRecord_Referencedescription() {
		return (EReference)pmmLabRecordEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPmmLabRecord_Modelequation() {
		return (EReference)pmmLabRecordEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatrix() {
		return matrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix_Name() {
		return (EAttribute)matrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix_Details() {
		return (EAttribute)matrixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganism() {
		return organismEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganism_Name() {
		return (EAttribute)organismEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganism_Details() {
		return (EAttribute)organismEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_IsDependent() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Description() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Type() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Unit() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Min() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Max() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Sse() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Mse() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Rmse() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Rsquared() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Aic() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Bic() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceDescription() {
		return referenceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceDescription_Link() {
		return (EAttribute)referenceDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceDescription_FirstAuthor() {
		return (EAttribute)referenceDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceDescription_Title() {
		return (EAttribute)referenceDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceDescription_Abstract() {
		return (EAttribute)referenceDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceDescription_Volume() {
		return (EAttribute)referenceDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceDescription_Issue() {
		return (EAttribute)referenceDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceDescription_Page() {
		return (EAttribute)referenceDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceDescription_ApprovalMode() {
		return (EAttribute)referenceDescriptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceDescription_Website() {
		return (EAttribute)referenceDescriptionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceDescription_Comment() {
		return (EAttribute)referenceDescriptionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceDescription_Type() {
		return (EAttribute)referenceDescriptionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelEquation() {
		return modelEquationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelEquation_FormulaName() {
		return (EAttribute)modelEquationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelEquation_ModelClass() {
		return (EAttribute)modelEquationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelEquation_Formula() {
		return (EAttribute)modelEquationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelEquation_Literature() {
		return (EReference)modelEquationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelClass() {
		return modelClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReferenceType() {
		return referenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURL() {
		return urlEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pmmlabFactory getpmmlabFactory() {
		return (pmmlabFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pmmLabRecordEClass = createEClass(PMM_LAB_RECORD);
		createEAttribute(pmmLabRecordEClass, PMM_LAB_RECORD__ID);
		createEAttribute(pmmLabRecordEClass, PMM_LAB_RECORD__CREATOR_GIVEN_NAME);
		createEAttribute(pmmLabRecordEClass, PMM_LAB_RECORD__CREATOR_FAMILY_NAME);
		createEAttribute(pmmLabRecordEClass, PMM_LAB_RECORD__CREATOR_CONTACT);
		createEAttribute(pmmLabRecordEClass, PMM_LAB_RECORD__CREATION_DATE);
		createEAttribute(pmmLabRecordEClass, PMM_LAB_RECORD__MODIFIED_DATE);
		createEAttribute(pmmLabRecordEClass, PMM_LAB_RECORD__LICENSE);
		createEAttribute(pmmLabRecordEClass, PMM_LAB_RECORD__YEAR);
		createEAttribute(pmmLabRecordEClass, PMM_LAB_RECORD__COMMENT);
		createEReference(pmmLabRecordEClass, PMM_LAB_RECORD__MATRIX);
		createEReference(pmmLabRecordEClass, PMM_LAB_RECORD__ORGANISM);
		createEReference(pmmLabRecordEClass, PMM_LAB_RECORD__PARAMETER);
		createEReference(pmmLabRecordEClass, PMM_LAB_RECORD__REFERENCEDESCRIPTION);
		createEReference(pmmLabRecordEClass, PMM_LAB_RECORD__MODELEQUATION);

		matrixEClass = createEClass(MATRIX);
		createEAttribute(matrixEClass, MATRIX__NAME);
		createEAttribute(matrixEClass, MATRIX__DETAILS);

		organismEClass = createEClass(ORGANISM);
		createEAttribute(organismEClass, ORGANISM__NAME);
		createEAttribute(organismEClass, ORGANISM__DETAILS);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__IS_DEPENDENT);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__DESCRIPTION);
		createEAttribute(parameterEClass, PARAMETER__TYPE);
		createEAttribute(parameterEClass, PARAMETER__UNIT);
		createEAttribute(parameterEClass, PARAMETER__VALUE);
		createEAttribute(parameterEClass, PARAMETER__MIN);
		createEAttribute(parameterEClass, PARAMETER__MAX);
		createEAttribute(parameterEClass, PARAMETER__SSE);
		createEAttribute(parameterEClass, PARAMETER__MSE);
		createEAttribute(parameterEClass, PARAMETER__RMSE);
		createEAttribute(parameterEClass, PARAMETER__RSQUARED);
		createEAttribute(parameterEClass, PARAMETER__AIC);
		createEAttribute(parameterEClass, PARAMETER__BIC);

		referenceDescriptionEClass = createEClass(REFERENCE_DESCRIPTION);
		createEAttribute(referenceDescriptionEClass, REFERENCE_DESCRIPTION__LINK);
		createEAttribute(referenceDescriptionEClass, REFERENCE_DESCRIPTION__FIRST_AUTHOR);
		createEAttribute(referenceDescriptionEClass, REFERENCE_DESCRIPTION__TITLE);
		createEAttribute(referenceDescriptionEClass, REFERENCE_DESCRIPTION__ABSTRACT);
		createEAttribute(referenceDescriptionEClass, REFERENCE_DESCRIPTION__VOLUME);
		createEAttribute(referenceDescriptionEClass, REFERENCE_DESCRIPTION__ISSUE);
		createEAttribute(referenceDescriptionEClass, REFERENCE_DESCRIPTION__PAGE);
		createEAttribute(referenceDescriptionEClass, REFERENCE_DESCRIPTION__APPROVAL_MODE);
		createEAttribute(referenceDescriptionEClass, REFERENCE_DESCRIPTION__WEBSITE);
		createEAttribute(referenceDescriptionEClass, REFERENCE_DESCRIPTION__COMMENT);
		createEAttribute(referenceDescriptionEClass, REFERENCE_DESCRIPTION__TYPE);

		modelEquationEClass = createEClass(MODEL_EQUATION);
		createEAttribute(modelEquationEClass, MODEL_EQUATION__FORMULA_NAME);
		createEAttribute(modelEquationEClass, MODEL_EQUATION__MODEL_CLASS);
		createEAttribute(modelEquationEClass, MODEL_EQUATION__FORMULA);
		createEReference(modelEquationEClass, MODEL_EQUATION__LITERATURE);

		// Create enums
		modelClassEEnum = createEEnum(MODEL_CLASS);
		referenceTypeEEnum = createEEnum(REFERENCE_TYPE);

		// Create data types
		urlEDataType = createEDataType(URL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(pmmLabRecordEClass, PmmLabRecord.class, "PmmLabRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPmmLabRecord_Id(), ecorePackage.getEString(), "id", null, 0, 1, PmmLabRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPmmLabRecord_CreatorGivenName(), ecorePackage.getEString(), "creatorGivenName", null, 0, 1, PmmLabRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPmmLabRecord_CreatorFamilyName(), ecorePackage.getEString(), "creatorFamilyName", null, 0, 1, PmmLabRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPmmLabRecord_CreatorContact(), ecorePackage.getEString(), "creatorContact", null, 0, 1, PmmLabRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPmmLabRecord_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, PmmLabRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPmmLabRecord_ModifiedDate(), ecorePackage.getEDate(), "modifiedDate", null, 0, 1, PmmLabRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPmmLabRecord_License(), ecorePackage.getEString(), "license", null, 0, 1, PmmLabRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPmmLabRecord_Year(), ecorePackage.getEInt(), "year", null, 0, 1, PmmLabRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPmmLabRecord_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, PmmLabRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPmmLabRecord_Matrix(), this.getMatrix(), null, "matrix", null, 0, 1, PmmLabRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPmmLabRecord_Organism(), this.getOrganism(), null, "organism", null, 0, 1, PmmLabRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPmmLabRecord_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, PmmLabRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPmmLabRecord_Referencedescription(), this.getReferenceDescription(), null, "referencedescription", null, 0, -1, PmmLabRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPmmLabRecord_Modelequation(), this.getModelEquation(), null, "modelequation", null, 1, 1, PmmLabRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matrixEClass, Matrix.class, "Matrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatrix_Name(), ecorePackage.getEString(), "name", null, 0, 1, Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix_Details(), ecorePackage.getEString(), "details", null, 0, 1, Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organismEClass, Organism.class, "Organism", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganism_Name(), ecorePackage.getEString(), "name", null, 0, 1, Organism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganism_Details(), ecorePackage.getEString(), "details", null, 0, 1, Organism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_IsDependent(), ecorePackage.getEBoolean(), "isDependent", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Description(), ecorePackage.getEString(), "description", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), ecorePackage.getEString(), "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Min(), ecorePackage.getEDouble(), "min", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Max(), ecorePackage.getEDouble(), "max", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Sse(), ecorePackage.getEDouble(), "sse", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Mse(), ecorePackage.getEDouble(), "mse", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Rmse(), ecorePackage.getEDouble(), "rmse", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Rsquared(), ecorePackage.getEDouble(), "rsquared", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Aic(), ecorePackage.getEDouble(), "aic", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Bic(), ecorePackage.getEDouble(), "bic", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceDescriptionEClass, ReferenceDescription.class, "ReferenceDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceDescription_Link(), this.getURL(), "link", null, 0, 1, ReferenceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceDescription_FirstAuthor(), ecorePackage.getEString(), "firstAuthor", null, 0, 1, ReferenceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceDescription_Title(), ecorePackage.getEString(), "title", null, 0, 1, ReferenceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceDescription_Abstract(), ecorePackage.getEString(), "abstract", null, 0, 1, ReferenceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceDescription_Volume(), ecorePackage.getEString(), "volume", null, 0, 1, ReferenceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceDescription_Issue(), ecorePackage.getEInt(), "issue", null, 0, 1, ReferenceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceDescription_Page(), ecorePackage.getEInt(), "page", null, 0, 1, ReferenceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceDescription_ApprovalMode(), ecorePackage.getEString(), "approvalMode", null, 0, 1, ReferenceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceDescription_Website(), this.getURL(), "website", null, 0, 1, ReferenceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceDescription_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, ReferenceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceDescription_Type(), this.getReferenceType(), "type", null, 0, 1, ReferenceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEquationEClass, ModelEquation.class, "ModelEquation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelEquation_FormulaName(), ecorePackage.getEString(), "formulaName", null, 0, 1, ModelEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelEquation_ModelClass(), this.getModelClass(), "modelClass", null, 0, 1, ModelEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelEquation_Formula(), ecorePackage.getEString(), "formula", null, 0, 1, ModelEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelEquation_Literature(), this.getReferenceDescription(), null, "literature", null, 0, -1, ModelEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(modelClassEEnum, ModelClass.class, "ModelClass");
		addEEnumLiteral(modelClassEEnum, ModelClass.UNKNOWN);
		addEEnumLiteral(modelClassEEnum, ModelClass.GROWTH);
		addEEnumLiteral(modelClassEEnum, ModelClass.INACTIVATION);
		addEEnumLiteral(modelClassEEnum, ModelClass.SURVIVAL);
		addEEnumLiteral(modelClassEEnum, ModelClass.GROWTH_INACTIVATION);
		addEEnumLiteral(modelClassEEnum, ModelClass.INACTIVATION_SURVIVAL);
		addEEnumLiteral(modelClassEEnum, ModelClass.GROWTH_SURVIVAL);
		addEEnumLiteral(modelClassEEnum, ModelClass.GROWTH_INACTIVATION_SURVIVAL);
		addEEnumLiteral(modelClassEEnum, ModelClass.T);
		addEEnumLiteral(modelClassEEnum, ModelClass.PH);
		addEEnumLiteral(modelClassEEnum, ModelClass.AW);
		addEEnumLiteral(modelClassEEnum, ModelClass.TPH);
		addEEnumLiteral(modelClassEEnum, ModelClass.TAW);
		addEEnumLiteral(modelClassEEnum, ModelClass.PH_AW);
		addEEnumLiteral(modelClassEEnum, ModelClass.TPH_AW);

		initEEnum(referenceTypeEEnum, ReferenceType.class, "ReferenceType");
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.PAPER);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.SOP);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.LA);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.MANUAL);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.LAB_LOG);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.BOOK);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.WEBSITE);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.REPORT);

		// Initialize data types
		initEDataType(urlEDataType, java.net.URL.class, "URL", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //pmmlabPackageImpl
