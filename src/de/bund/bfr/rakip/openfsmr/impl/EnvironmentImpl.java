/**
 */
package de.bund.bfr.rakip.openfsmr.impl;

import de.bund.bfr.rakip.openfsmr.Environment;
import de.bund.bfr.rakip.openfsmr.openfsmrPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.impl.EnvironmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.impl.EnvironmentImpl#getDetails <em>Details</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EnvironmentImpl extends MinimalEObjectImpl.Container implements Environment {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDetails() <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAILS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetails() <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected String details = DETAILS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return openfsmrPackage.Literals.ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openfsmrPackage.ENVIRONMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetails(String newDetails) {
		String oldDetails = details;
		details = newDetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openfsmrPackage.ENVIRONMENT__DETAILS, oldDetails, details));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case openfsmrPackage.ENVIRONMENT__NAME:
				return getName();
			case openfsmrPackage.ENVIRONMENT__DETAILS:
				return getDetails();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case openfsmrPackage.ENVIRONMENT__NAME:
				setName((String)newValue);
				return;
			case openfsmrPackage.ENVIRONMENT__DETAILS:
				setDetails((String)newValue);
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
			case openfsmrPackage.ENVIRONMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case openfsmrPackage.ENVIRONMENT__DETAILS:
				setDetails(DETAILS_EDEFAULT);
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
			case openfsmrPackage.ENVIRONMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case openfsmrPackage.ENVIRONMENT__DETAILS:
				return DETAILS_EDEFAULT == null ? details != null : !DETAILS_EDEFAULT.equals(details);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", details: ");
		result.append(details);
		result.append(')');
		return result.toString();
	}

} //EnvironmentImpl
