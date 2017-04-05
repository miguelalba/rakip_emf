/**
 */
package de.bund.bfr.rakip.pmmlab.impl;

import de.bund.bfr.rakip.pmmlab.Parameter;
import de.bund.bfr.rakip.pmmlab.pmmlabPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ParameterImpl#isIsDependent <em>Is Dependent</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ParameterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ParameterImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ParameterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ParameterImpl#getMin <em>Min</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ParameterImpl#getMax <em>Max</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ParameterImpl#getSse <em>Sse</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ParameterImpl#getMse <em>Mse</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ParameterImpl#getRmse <em>Rmse</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ParameterImpl#getRsquared <em>Rsquared</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ParameterImpl#getAic <em>Aic</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ParameterImpl#getBic <em>Bic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter {
	/**
	 * The default value of the '{@link #isIsDependent() <em>Is Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDependent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEPENDENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDependent() <em>Is Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDependent()
	 * @generated
	 * @ordered
	 */
	protected boolean isDependent = IS_DEPENDENT_EDEFAULT;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected double min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected double max = MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSse() <em>Sse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSse()
	 * @generated
	 * @ordered
	 */
	protected static final double SSE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSse() <em>Sse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSse()
	 * @generated
	 * @ordered
	 */
	protected double sse = SSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMse() <em>Mse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMse()
	 * @generated
	 * @ordered
	 */
	protected static final double MSE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMse() <em>Mse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMse()
	 * @generated
	 * @ordered
	 */
	protected double mse = MSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRmse() <em>Rmse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRmse()
	 * @generated
	 * @ordered
	 */
	protected static final double RMSE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRmse() <em>Rmse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRmse()
	 * @generated
	 * @ordered
	 */
	protected double rmse = RMSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRsquared() <em>Rsquared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRsquared()
	 * @generated
	 * @ordered
	 */
	protected static final double RSQUARED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRsquared() <em>Rsquared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRsquared()
	 * @generated
	 * @ordered
	 */
	protected double rsquared = RSQUARED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAic() <em>Aic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAic()
	 * @generated
	 * @ordered
	 */
	protected static final double AIC_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAic() <em>Aic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAic()
	 * @generated
	 * @ordered
	 */
	protected double aic = AIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getBic() <em>Bic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBic()
	 * @generated
	 * @ordered
	 */
	protected static final double BIC_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBic() <em>Bic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBic()
	 * @generated
	 * @ordered
	 */
	protected double bic = BIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return pmmlabPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDependent() {
		return isDependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDependent(boolean newIsDependent) {
		boolean oldIsDependent = isDependent;
		isDependent = newIsDependent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PARAMETER__IS_DEPENDENT, oldIsDependent, isDependent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PARAMETER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PARAMETER__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PARAMETER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(double newMin) {
		double oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PARAMETER__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(double newMax) {
		double oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PARAMETER__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSse() {
		return sse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSse(double newSse) {
		double oldSse = sse;
		sse = newSse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PARAMETER__SSE, oldSse, sse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMse() {
		return mse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMse(double newMse) {
		double oldMse = mse;
		mse = newMse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PARAMETER__MSE, oldMse, mse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRmse() {
		return rmse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRmse(double newRmse) {
		double oldRmse = rmse;
		rmse = newRmse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PARAMETER__RMSE, oldRmse, rmse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRsquared() {
		return rsquared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRsquared(double newRsquared) {
		double oldRsquared = rsquared;
		rsquared = newRsquared;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PARAMETER__RSQUARED, oldRsquared, rsquared));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAic() {
		return aic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAic(double newAic) {
		double oldAic = aic;
		aic = newAic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PARAMETER__AIC, oldAic, aic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBic() {
		return bic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBic(double newBic) {
		double oldBic = bic;
		bic = newBic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PARAMETER__BIC, oldBic, bic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case pmmlabPackage.PARAMETER__IS_DEPENDENT:
				return isIsDependent();
			case pmmlabPackage.PARAMETER__NAME:
				return getName();
			case pmmlabPackage.PARAMETER__DESCRIPTION:
				return getDescription();
			case pmmlabPackage.PARAMETER__TYPE:
				return getType();
			case pmmlabPackage.PARAMETER__UNIT:
				return getUnit();
			case pmmlabPackage.PARAMETER__VALUE:
				return getValue();
			case pmmlabPackage.PARAMETER__MIN:
				return getMin();
			case pmmlabPackage.PARAMETER__MAX:
				return getMax();
			case pmmlabPackage.PARAMETER__SSE:
				return getSse();
			case pmmlabPackage.PARAMETER__MSE:
				return getMse();
			case pmmlabPackage.PARAMETER__RMSE:
				return getRmse();
			case pmmlabPackage.PARAMETER__RSQUARED:
				return getRsquared();
			case pmmlabPackage.PARAMETER__AIC:
				return getAic();
			case pmmlabPackage.PARAMETER__BIC:
				return getBic();
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
			case pmmlabPackage.PARAMETER__IS_DEPENDENT:
				setIsDependent((Boolean)newValue);
				return;
			case pmmlabPackage.PARAMETER__NAME:
				setName((String)newValue);
				return;
			case pmmlabPackage.PARAMETER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case pmmlabPackage.PARAMETER__TYPE:
				setType((String)newValue);
				return;
			case pmmlabPackage.PARAMETER__UNIT:
				setUnit((String)newValue);
				return;
			case pmmlabPackage.PARAMETER__VALUE:
				setValue((String)newValue);
				return;
			case pmmlabPackage.PARAMETER__MIN:
				setMin((Double)newValue);
				return;
			case pmmlabPackage.PARAMETER__MAX:
				setMax((Double)newValue);
				return;
			case pmmlabPackage.PARAMETER__SSE:
				setSse((Double)newValue);
				return;
			case pmmlabPackage.PARAMETER__MSE:
				setMse((Double)newValue);
				return;
			case pmmlabPackage.PARAMETER__RMSE:
				setRmse((Double)newValue);
				return;
			case pmmlabPackage.PARAMETER__RSQUARED:
				setRsquared((Double)newValue);
				return;
			case pmmlabPackage.PARAMETER__AIC:
				setAic((Double)newValue);
				return;
			case pmmlabPackage.PARAMETER__BIC:
				setBic((Double)newValue);
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
			case pmmlabPackage.PARAMETER__IS_DEPENDENT:
				setIsDependent(IS_DEPENDENT_EDEFAULT);
				return;
			case pmmlabPackage.PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case pmmlabPackage.PARAMETER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case pmmlabPackage.PARAMETER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case pmmlabPackage.PARAMETER__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case pmmlabPackage.PARAMETER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case pmmlabPackage.PARAMETER__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case pmmlabPackage.PARAMETER__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case pmmlabPackage.PARAMETER__SSE:
				setSse(SSE_EDEFAULT);
				return;
			case pmmlabPackage.PARAMETER__MSE:
				setMse(MSE_EDEFAULT);
				return;
			case pmmlabPackage.PARAMETER__RMSE:
				setRmse(RMSE_EDEFAULT);
				return;
			case pmmlabPackage.PARAMETER__RSQUARED:
				setRsquared(RSQUARED_EDEFAULT);
				return;
			case pmmlabPackage.PARAMETER__AIC:
				setAic(AIC_EDEFAULT);
				return;
			case pmmlabPackage.PARAMETER__BIC:
				setBic(BIC_EDEFAULT);
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
			case pmmlabPackage.PARAMETER__IS_DEPENDENT:
				return isDependent != IS_DEPENDENT_EDEFAULT;
			case pmmlabPackage.PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case pmmlabPackage.PARAMETER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case pmmlabPackage.PARAMETER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case pmmlabPackage.PARAMETER__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
			case pmmlabPackage.PARAMETER__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case pmmlabPackage.PARAMETER__MIN:
				return min != MIN_EDEFAULT;
			case pmmlabPackage.PARAMETER__MAX:
				return max != MAX_EDEFAULT;
			case pmmlabPackage.PARAMETER__SSE:
				return sse != SSE_EDEFAULT;
			case pmmlabPackage.PARAMETER__MSE:
				return mse != MSE_EDEFAULT;
			case pmmlabPackage.PARAMETER__RMSE:
				return rmse != RMSE_EDEFAULT;
			case pmmlabPackage.PARAMETER__RSQUARED:
				return rsquared != RSQUARED_EDEFAULT;
			case pmmlabPackage.PARAMETER__AIC:
				return aic != AIC_EDEFAULT;
			case pmmlabPackage.PARAMETER__BIC:
				return bic != BIC_EDEFAULT;
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
		result.append(" (isDependent: ");
		result.append(isDependent);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", type: ");
		result.append(type);
		result.append(", unit: ");
		result.append(unit);
		result.append(", value: ");
		result.append(value);
		result.append(", min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", sse: ");
		result.append(sse);
		result.append(", mse: ");
		result.append(mse);
		result.append(", rmse: ");
		result.append(rmse);
		result.append(", rsquared: ");
		result.append(rsquared);
		result.append(", aic: ");
		result.append(aic);
		result.append(", bic: ");
		result.append(bic);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
