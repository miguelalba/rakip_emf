/**
 */
package de.bund.bfr.rakip.pmmlab.util;

import de.bund.bfr.rakip.pmmlab.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage
 * @generated
 */
public class pmmlabAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static pmmlabPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pmmlabAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = pmmlabPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected pmmlabSwitch<Adapter> modelSwitch =
		new pmmlabSwitch<Adapter>() {
			@Override
			public Adapter casePmmLabRecord(PmmLabRecord object) {
				return createPmmLabRecordAdapter();
			}
			@Override
			public Adapter caseMatrix(Matrix object) {
				return createMatrixAdapter();
			}
			@Override
			public Adapter caseOrganism(Organism object) {
				return createOrganismAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseReferenceDescription(ReferenceDescription object) {
				return createReferenceDescriptionAdapter();
			}
			@Override
			public Adapter caseModelEquation(ModelEquation object) {
				return createModelEquationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.bund.bfr.rakip.pmmlab.PmmLabRecord <em>Pmm Lab Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.bund.bfr.rakip.pmmlab.PmmLabRecord
	 * @generated
	 */
	public Adapter createPmmLabRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.bund.bfr.rakip.pmmlab.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.bund.bfr.rakip.pmmlab.Matrix
	 * @generated
	 */
	public Adapter createMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.bund.bfr.rakip.pmmlab.Organism <em>Organism</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.bund.bfr.rakip.pmmlab.Organism
	 * @generated
	 */
	public Adapter createOrganismAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.bund.bfr.rakip.pmmlab.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.bund.bfr.rakip.pmmlab.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.bund.bfr.rakip.pmmlab.ReferenceDescription <em>Reference Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.bund.bfr.rakip.pmmlab.ReferenceDescription
	 * @generated
	 */
	public Adapter createReferenceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.bund.bfr.rakip.pmmlab.ModelEquation <em>Model Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.bund.bfr.rakip.pmmlab.ModelEquation
	 * @generated
	 */
	public Adapter createModelEquationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //pmmlabAdapterFactory
