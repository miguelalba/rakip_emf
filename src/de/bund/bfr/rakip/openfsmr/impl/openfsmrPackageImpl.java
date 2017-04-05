/**
 */
package de.bund.bfr.rakip.openfsmr.impl;

import de.bund.bfr.rakip.openfsmr.CurationStatus;
import de.bund.bfr.rakip.openfsmr.Environment;
import de.bund.bfr.rakip.openfsmr.FoodProcess;
import de.bund.bfr.rakip.openfsmr.ModelType;
import de.bund.bfr.rakip.openfsmr.OpenFSMRRecord;
import de.bund.bfr.rakip.openfsmr.Organism;
import de.bund.bfr.rakip.openfsmr.Variable;
import de.bund.bfr.rakip.openfsmr.openfsmrFactory;
import de.bund.bfr.rakip.openfsmr.openfsmrPackage;

import de.bund.bfr.rakip.pmmlab.impl.pmmlabPackageImpl;

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
public class openfsmrPackageImpl extends EPackageImpl implements openfsmrPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentEClass = null;

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
	private EClass openFSMRRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum foodProcessEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum curationStatusEEnum = null;

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
	 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private openfsmrPackageImpl() {
		super(eNS_URI, openfsmrFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link openfsmrPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static openfsmrPackage init() {
		if (isInited) return (openfsmrPackage)EPackage.Registry.INSTANCE.getEPackage(openfsmrPackage.eNS_URI);

		// Obtain or create and register package
		openfsmrPackageImpl theopenfsmrPackage = (openfsmrPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof openfsmrPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new openfsmrPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		pmmlabPackageImpl thepmmlabPackage = (pmmlabPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(pmmlabPackage.eNS_URI) instanceof pmmlabPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(pmmlabPackage.eNS_URI) : pmmlabPackage.eINSTANCE);

		// Create package meta-data objects
		theopenfsmrPackage.createPackageContents();
		thepmmlabPackage.createPackageContents();

		// Initialize created meta-data
		theopenfsmrPackage.initializePackageContents();
		thepmmlabPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theopenfsmrPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(openfsmrPackage.eNS_URI, theopenfsmrPackage);
		return theopenfsmrPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Unit() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Min() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Max() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironment() {
		return environmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironment_Name() {
		return (EAttribute)environmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironment_Details() {
		return (EAttribute)environmentEClass.getEStructuralFeatures().get(1);
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
	public EClass getOpenFSMRRecord() {
		return openFSMRRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenFSMRRecord_IndependentVariables() {
		return (EReference)openFSMRRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenFSMRRecord_DependentVariables() {
		return (EReference)openFSMRRecordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenFSMRRecord_Environment() {
		return (EReference)openFSMRRecordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenFSMRRecord_Organism() {
		return (EReference)openFSMRRecordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenFSMRRecord_Id() {
		return (EAttribute)openFSMRRecordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenFSMRRecord_Creator() {
		return (EAttribute)openFSMRRecordEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenFSMRRecord_CreatedDate() {
		return (EAttribute)openFSMRRecordEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenFSMRRecord_ModifiedDate() {
		return (EAttribute)openFSMRRecordEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenFSMRRecord_Rights() {
		return (EAttribute)openFSMRRecordEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenFSMRRecord_ReferenceDescription() {
		return (EAttribute)openFSMRRecordEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenFSMRRecord_ReferenceDescriptionLink() {
		return (EAttribute)openFSMRRecordEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenFSMRRecord_Software() {
		return (EAttribute)openFSMRRecordEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenFSMRRecord_FoodProcess() {
		return (EAttribute)openFSMRRecordEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenFSMRRecord_Type() {
		return (EAttribute)openFSMRRecordEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenFSMRRecord_CurationStatus() {
		return (EAttribute)openFSMRRecordEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenFSMRRecord_Subject() {
		return (EAttribute)openFSMRRecordEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenFSMRRecord_Notes() {
		return (EAttribute)openFSMRRecordEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFoodProcess() {
		return foodProcessEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelType() {
		return modelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCurationStatus() {
		return curationStatusEEnum;
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
	public openfsmrFactory getopenfsmrFactory() {
		return (openfsmrFactory)getEFactoryInstance();
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
		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__UNIT);
		createEAttribute(variableEClass, VARIABLE__MIN);
		createEAttribute(variableEClass, VARIABLE__MAX);

		environmentEClass = createEClass(ENVIRONMENT);
		createEAttribute(environmentEClass, ENVIRONMENT__NAME);
		createEAttribute(environmentEClass, ENVIRONMENT__DETAILS);

		organismEClass = createEClass(ORGANISM);
		createEAttribute(organismEClass, ORGANISM__NAME);
		createEAttribute(organismEClass, ORGANISM__DETAILS);

		openFSMRRecordEClass = createEClass(OPEN_FSMR_RECORD);
		createEReference(openFSMRRecordEClass, OPEN_FSMR_RECORD__INDEPENDENT_VARIABLES);
		createEReference(openFSMRRecordEClass, OPEN_FSMR_RECORD__DEPENDENT_VARIABLES);
		createEReference(openFSMRRecordEClass, OPEN_FSMR_RECORD__ENVIRONMENT);
		createEReference(openFSMRRecordEClass, OPEN_FSMR_RECORD__ORGANISM);
		createEAttribute(openFSMRRecordEClass, OPEN_FSMR_RECORD__ID);
		createEAttribute(openFSMRRecordEClass, OPEN_FSMR_RECORD__CREATOR);
		createEAttribute(openFSMRRecordEClass, OPEN_FSMR_RECORD__CREATED_DATE);
		createEAttribute(openFSMRRecordEClass, OPEN_FSMR_RECORD__MODIFIED_DATE);
		createEAttribute(openFSMRRecordEClass, OPEN_FSMR_RECORD__RIGHTS);
		createEAttribute(openFSMRRecordEClass, OPEN_FSMR_RECORD__REFERENCE_DESCRIPTION);
		createEAttribute(openFSMRRecordEClass, OPEN_FSMR_RECORD__REFERENCE_DESCRIPTION_LINK);
		createEAttribute(openFSMRRecordEClass, OPEN_FSMR_RECORD__SOFTWARE);
		createEAttribute(openFSMRRecordEClass, OPEN_FSMR_RECORD__FOOD_PROCESS);
		createEAttribute(openFSMRRecordEClass, OPEN_FSMR_RECORD__TYPE);
		createEAttribute(openFSMRRecordEClass, OPEN_FSMR_RECORD__CURATION_STATUS);
		createEAttribute(openFSMRRecordEClass, OPEN_FSMR_RECORD__SUBJECT);
		createEAttribute(openFSMRRecordEClass, OPEN_FSMR_RECORD__NOTES);

		// Create enums
		foodProcessEEnum = createEEnum(FOOD_PROCESS);
		modelTypeEEnum = createEEnum(MODEL_TYPE);
		curationStatusEEnum = createEEnum(CURATION_STATUS);

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

		// Obtain other dependent packages
		pmmlabPackage thepmmlabPackage = (pmmlabPackage)EPackage.Registry.INSTANCE.getEPackage(pmmlabPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Min(), ecorePackage.getEDouble(), "min", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Max(), ecorePackage.getEDouble(), "max", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentEClass, Environment.class, "Environment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironment_Details(), ecorePackage.getEString(), "details", null, 0, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organismEClass, Organism.class, "Organism", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganism_Name(), ecorePackage.getEString(), "name", null, 0, 1, Organism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganism_Details(), ecorePackage.getEString(), "details", null, 0, 1, Organism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openFSMRRecordEClass, OpenFSMRRecord.class, "OpenFSMRRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpenFSMRRecord_IndependentVariables(), this.getVariable(), null, "independentVariables", null, 0, -1, OpenFSMRRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpenFSMRRecord_DependentVariables(), this.getVariable(), null, "dependentVariables", null, 0, -1, OpenFSMRRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpenFSMRRecord_Environment(), this.getEnvironment(), null, "environment", null, 0, 1, OpenFSMRRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpenFSMRRecord_Organism(), this.getOrganism(), null, "organism", null, 0, 1, OpenFSMRRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenFSMRRecord_Id(), ecorePackage.getEString(), "id", null, 0, 1, OpenFSMRRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenFSMRRecord_Creator(), ecorePackage.getEString(), "creator", null, 0, 1, OpenFSMRRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenFSMRRecord_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, OpenFSMRRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenFSMRRecord_ModifiedDate(), ecorePackage.getEDate(), "modifiedDate", null, 0, 1, OpenFSMRRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenFSMRRecord_Rights(), ecorePackage.getEString(), "rights", null, 0, 1, OpenFSMRRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenFSMRRecord_ReferenceDescription(), ecorePackage.getEString(), "referenceDescription", null, 0, 1, OpenFSMRRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenFSMRRecord_ReferenceDescriptionLink(), thepmmlabPackage.getURL(), "referenceDescriptionLink", null, 0, 1, OpenFSMRRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenFSMRRecord_Software(), ecorePackage.getEString(), "software", null, 0, 1, OpenFSMRRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenFSMRRecord_FoodProcess(), this.getFoodProcess(), "foodProcess", null, 0, 1, OpenFSMRRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenFSMRRecord_Type(), this.getModelType(), "type", null, 0, 1, OpenFSMRRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenFSMRRecord_CurationStatus(), this.getCurationStatus(), "curationStatus", null, 0, 1, OpenFSMRRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenFSMRRecord_Subject(), ecorePackage.getEString(), "subject", null, 0, 1, OpenFSMRRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenFSMRRecord_Notes(), ecorePackage.getEString(), "notes", null, 0, 1, OpenFSMRRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(foodProcessEEnum, FoodProcess.class, "FoodProcess");
		addEEnumLiteral(foodProcessEEnum, FoodProcess.COOLING);
		addEEnumLiteral(foodProcessEEnum, FoodProcess.DRYING);
		addEEnumLiteral(foodProcessEEnum, FoodProcess.FERMENTATION);
		addEEnumLiteral(foodProcessEEnum, FoodProcess.HIGH_PRESSURE_PROCESSING);
		addEEnumLiteral(foodProcessEEnum, FoodProcess.NON_THERMAL_PROCESSING);
		addEEnumLiteral(foodProcessEEnum, FoodProcess.STORAGE);
		addEEnumLiteral(foodProcessEEnum, FoodProcess.THERMAL_PROCESSING);
		addEEnumLiteral(foodProcessEEnum, FoodProcess.CROSS_CONTAMINATION);

		initEEnum(modelTypeEEnum, ModelType.class, "ModelType");
		addEEnumLiteral(modelTypeEEnum, ModelType.GROWTH);
		addEEnumLiteral(modelTypeEEnum, ModelType.INACTIVATION);
		addEEnumLiteral(modelTypeEEnum, ModelType.SURVIVAL);
		addEEnumLiteral(modelTypeEEnum, ModelType.METABOLITE_FORMATION);
		addEEnumLiteral(modelTypeEEnum, ModelType.GROWTH_BOUNDARY_MODEL);
		addEEnumLiteral(modelTypeEEnum, ModelType.SPOILAGE);
		addEEnumLiteral(modelTypeEEnum, ModelType.TRANSFER);
		addEEnumLiteral(modelTypeEEnum, ModelType.MPD);
		addEEnumLiteral(modelTypeEEnum, ModelType.LPD);

		initEEnum(curationStatusEEnum, CurationStatus.class, "CurationStatus");
		addEEnumLiteral(curationStatusEEnum, CurationStatus.BASED_ON_PUBLISHED_RESULTS);
		addEEnumLiteral(curationStatusEEnum, CurationStatus.INDEPENDENT_VALIDATION_RESULTS);
		addEEnumLiteral(curationStatusEEnum, CurationStatus.LONG_TERM_USE);
		addEEnumLiteral(curationStatusEEnum, CurationStatus.NOT_CURATED);

		// Initialize data types
		initEDataType(urlEDataType, java.net.URL.class, "URL", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //openfsmrPackageImpl
