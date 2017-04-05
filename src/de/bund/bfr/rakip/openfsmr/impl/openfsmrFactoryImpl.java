/**
 */
package de.bund.bfr.rakip.openfsmr.impl;

import de.bund.bfr.rakip.openfsmr.*;

import java.net.URL;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class openfsmrFactoryImpl extends EFactoryImpl implements openfsmrFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static openfsmrFactory init() {
		try {
			openfsmrFactory theopenfsmrFactory = (openfsmrFactory)EPackage.Registry.INSTANCE.getEFactory(openfsmrPackage.eNS_URI);
			if (theopenfsmrFactory != null) {
				return theopenfsmrFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new openfsmrFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public openfsmrFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case openfsmrPackage.VARIABLE: return createVariable();
			case openfsmrPackage.ORGANISM: return createOrganism();
			case openfsmrPackage.OPEN_FSMR_RECORD: return createOpenFSMRRecord();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case openfsmrPackage.FOOD_PROCESS:
				return createFoodProcessFromString(eDataType, initialValue);
			case openfsmrPackage.MODEL_TYPE:
				return createModelTypeFromString(eDataType, initialValue);
			case openfsmrPackage.CURATION_STATUS:
				return createCurationStatusFromString(eDataType, initialValue);
			case openfsmrPackage.URL:
				return createURLFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case openfsmrPackage.FOOD_PROCESS:
				return convertFoodProcessToString(eDataType, instanceValue);
			case openfsmrPackage.MODEL_TYPE:
				return convertModelTypeToString(eDataType, instanceValue);
			case openfsmrPackage.CURATION_STATUS:
				return convertCurationStatusToString(eDataType, instanceValue);
			case openfsmrPackage.URL:
				return convertURLToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organism createOrganism() {
		OrganismImpl organism = new OrganismImpl();
		return organism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenFSMRRecord createOpenFSMRRecord() {
		OpenFSMRRecordImpl openFSMRRecord = new OpenFSMRRecordImpl();
		return openFSMRRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoodProcess createFoodProcessFromString(EDataType eDataType, String initialValue) {
		FoodProcess result = FoodProcess.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFoodProcessToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType createModelTypeFromString(EDataType eDataType, String initialValue) {
		ModelType result = ModelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurationStatus createCurationStatusFromString(EDataType eDataType, String initialValue) {
		CurationStatus result = CurationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URL createURLFromString(EDataType eDataType, String initialValue) {
		return (URL)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURLToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public openfsmrPackage getopenfsmrPackage() {
		return (openfsmrPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static openfsmrPackage getPackage() {
		return openfsmrPackage.eINSTANCE;
	}

} //openfsmrFactoryImpl
