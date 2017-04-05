/**
 */
package de.bund.bfr.rakip.pmmlab.impl;

import de.bund.bfr.rakip.pmmlab.ModelClass;
import de.bund.bfr.rakip.pmmlab.ModelEquation;
import de.bund.bfr.rakip.pmmlab.ReferenceDescription;
import de.bund.bfr.rakip.pmmlab.pmmlabPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Equation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ModelEquationImpl#getFormulaName <em>Formula Name</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ModelEquationImpl#getModelClass <em>Model Class</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ModelEquationImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ModelEquationImpl#getLiterature <em>Literature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelEquationImpl extends MinimalEObjectImpl.Container implements ModelEquation {
	/**
	 * The default value of the '{@link #getFormulaName() <em>Formula Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormulaName()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMULA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormulaName() <em>Formula Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormulaName()
	 * @generated
	 * @ordered
	 */
	protected String formulaName = FORMULA_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelClass() <em>Model Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelClass()
	 * @generated
	 * @ordered
	 */
	protected static final ModelClass MODEL_CLASS_EDEFAULT = ModelClass.UNKNOWN;

	/**
	 * The cached value of the '{@link #getModelClass() <em>Model Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelClass()
	 * @generated
	 * @ordered
	 */
	protected ModelClass modelClass = MODEL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMULA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected String formula = FORMULA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLiterature() <em>Literature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiterature()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceDescription> literature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelEquationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return pmmlabPackage.Literals.MODEL_EQUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormulaName() {
		return formulaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormulaName(String newFormulaName) {
		String oldFormulaName = formulaName;
		formulaName = newFormulaName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.MODEL_EQUATION__FORMULA_NAME, oldFormulaName, formulaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelClass getModelClass() {
		return modelClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelClass(ModelClass newModelClass) {
		ModelClass oldModelClass = modelClass;
		modelClass = newModelClass == null ? MODEL_CLASS_EDEFAULT : newModelClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.MODEL_EQUATION__MODEL_CLASS, oldModelClass, modelClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormula() {
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula(String newFormula) {
		String oldFormula = formula;
		formula = newFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.MODEL_EQUATION__FORMULA, oldFormula, formula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceDescription> getLiterature() {
		if (literature == null) {
			literature = new EObjectContainmentEList<ReferenceDescription>(ReferenceDescription.class, this, pmmlabPackage.MODEL_EQUATION__LITERATURE);
		}
		return literature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case pmmlabPackage.MODEL_EQUATION__LITERATURE:
				return ((InternalEList<?>)getLiterature()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case pmmlabPackage.MODEL_EQUATION__FORMULA_NAME:
				return getFormulaName();
			case pmmlabPackage.MODEL_EQUATION__MODEL_CLASS:
				return getModelClass();
			case pmmlabPackage.MODEL_EQUATION__FORMULA:
				return getFormula();
			case pmmlabPackage.MODEL_EQUATION__LITERATURE:
				return getLiterature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case pmmlabPackage.MODEL_EQUATION__FORMULA_NAME:
				setFormulaName((String)newValue);
				return;
			case pmmlabPackage.MODEL_EQUATION__MODEL_CLASS:
				setModelClass((ModelClass)newValue);
				return;
			case pmmlabPackage.MODEL_EQUATION__FORMULA:
				setFormula((String)newValue);
				return;
			case pmmlabPackage.MODEL_EQUATION__LITERATURE:
				getLiterature().clear();
				getLiterature().addAll((Collection<? extends ReferenceDescription>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case pmmlabPackage.MODEL_EQUATION__FORMULA_NAME:
				setFormulaName(FORMULA_NAME_EDEFAULT);
				return;
			case pmmlabPackage.MODEL_EQUATION__MODEL_CLASS:
				setModelClass(MODEL_CLASS_EDEFAULT);
				return;
			case pmmlabPackage.MODEL_EQUATION__FORMULA:
				setFormula(FORMULA_EDEFAULT);
				return;
			case pmmlabPackage.MODEL_EQUATION__LITERATURE:
				getLiterature().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case pmmlabPackage.MODEL_EQUATION__FORMULA_NAME:
				return FORMULA_NAME_EDEFAULT == null ? formulaName != null : !FORMULA_NAME_EDEFAULT.equals(formulaName);
			case pmmlabPackage.MODEL_EQUATION__MODEL_CLASS:
				return modelClass != MODEL_CLASS_EDEFAULT;
			case pmmlabPackage.MODEL_EQUATION__FORMULA:
				return FORMULA_EDEFAULT == null ? formula != null : !FORMULA_EDEFAULT.equals(formula);
			case pmmlabPackage.MODEL_EQUATION__LITERATURE:
				return literature != null && !literature.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (formulaName: ");
		result.append(formulaName);
		result.append(", modelClass: ");
		result.append(modelClass);
		result.append(", formula: ");
		result.append(formula);
		result.append(')');
		return result.toString();
	}

} //ModelEquationImpl
