/**
 */
package de.bund.bfr.rakip.pmmlab.impl;

import de.bund.bfr.rakip.pmmlab.*;

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
public class pmmlabFactoryImpl extends EFactoryImpl implements pmmlabFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static pmmlabFactory init() {
		try {
			pmmlabFactory thepmmlabFactory = (pmmlabFactory)EPackage.Registry.INSTANCE.getEFactory(pmmlabPackage.eNS_URI);
			if (thepmmlabFactory != null) {
				return thepmmlabFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new pmmlabFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pmmlabFactoryImpl() {
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
			case pmmlabPackage.PMM_LAB_RECORD: return createPmmLabRecord();
			case pmmlabPackage.MATRIX: return createMatrix();
			case pmmlabPackage.ORGANISM: return createOrganism();
			case pmmlabPackage.PARAMETER: return createParameter();
			case pmmlabPackage.REFERENCE_DESCRIPTION: return createReferenceDescription();
			case pmmlabPackage.MODEL_EQUATION: return createModelEquation();
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
			case pmmlabPackage.MODEL_CLASS:
				return createModelClassFromString(eDataType, initialValue);
			case pmmlabPackage.REFERENCE_TYPE:
				return createReferenceTypeFromString(eDataType, initialValue);
			case pmmlabPackage.URL:
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
			case pmmlabPackage.MODEL_CLASS:
				return convertModelClassToString(eDataType, instanceValue);
			case pmmlabPackage.REFERENCE_TYPE:
				return convertReferenceTypeToString(eDataType, instanceValue);
			case pmmlabPackage.URL:
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
	public PmmLabRecord createPmmLabRecord() {
		PmmLabRecordImpl pmmLabRecord = new PmmLabRecordImpl();
		return pmmLabRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix createMatrix() {
		MatrixImpl matrix = new MatrixImpl();
		return matrix;
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
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceDescription createReferenceDescription() {
		ReferenceDescriptionImpl referenceDescription = new ReferenceDescriptionImpl();
		return referenceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelEquation createModelEquation() {
		ModelEquationImpl modelEquation = new ModelEquationImpl();
		return modelEquation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelClass createModelClassFromString(EDataType eDataType, String initialValue) {
		ModelClass result = ModelClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType createReferenceTypeFromString(EDataType eDataType, String initialValue) {
		ReferenceType result = ReferenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceTypeToString(EDataType eDataType, Object instanceValue) {
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
	public pmmlabPackage getpmmlabPackage() {
		return (pmmlabPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static pmmlabPackage getPackage() {
		return pmmlabPackage.eINSTANCE;
	}

} //pmmlabFactoryImpl
