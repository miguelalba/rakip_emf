/**
 */
package de.bund.bfr.rakip.openfsmr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Food Process</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getFoodProcess()
 * @model
 * @generated
 */
public enum FoodProcess implements Enumerator {
	/**
	 * The '<em><b>Cooling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COOLING_VALUE
	 * @generated
	 * @ordered
	 */
	COOLING(0, "cooling", "cooling"),

	/**
	 * The '<em><b>Drying</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRYING_VALUE
	 * @generated
	 * @ordered
	 */
	DRYING(1, "drying", "drying"),

	/**
	 * The '<em><b>Fermentation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FERMENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	FERMENTATION(2, "fermentation", "fermentation"),

	/**
	 * The '<em><b>High pressure processing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_PRESSURE_PROCESSING_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH_PRESSURE_PROCESSING(3, "high_pressure_processing", "high_pressure_processing"),

	/**
	 * The '<em><b>Non thermal processing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_THERMAL_PROCESSING_VALUE
	 * @generated
	 * @ordered
	 */
	NON_THERMAL_PROCESSING(4, "non_thermal_processing", "non_thermal_processing"),

	/**
	 * The '<em><b>Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	STORAGE(5, "storage", "storage"),

	/**
	 * The '<em><b>Thermal processing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THERMAL_PROCESSING_VALUE
	 * @generated
	 * @ordered
	 */
	THERMAL_PROCESSING(6, "thermal_processing", "thermal_processing"),

	/**
	 * The '<em><b>Cross contamination</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CROSS_CONTAMINATION_VALUE
	 * @generated
	 * @ordered
	 */
	CROSS_CONTAMINATION(7, "cross_contamination", "cross_contamination");

	/**
	 * The '<em><b>Cooling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cooling</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COOLING
	 * @model name="cooling"
	 * @generated
	 * @ordered
	 */
	public static final int COOLING_VALUE = 0;

	/**
	 * The '<em><b>Drying</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Drying</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRYING
	 * @model name="drying"
	 * @generated
	 * @ordered
	 */
	public static final int DRYING_VALUE = 1;

	/**
	 * The '<em><b>Fermentation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fermentation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FERMENTATION
	 * @model name="fermentation"
	 * @generated
	 * @ordered
	 */
	public static final int FERMENTATION_VALUE = 2;

	/**
	 * The '<em><b>High pressure processing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>High pressure processing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGH_PRESSURE_PROCESSING
	 * @model name="high_pressure_processing"
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_PRESSURE_PROCESSING_VALUE = 3;

	/**
	 * The '<em><b>Non thermal processing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Non thermal processing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_THERMAL_PROCESSING
	 * @model name="non_thermal_processing"
	 * @generated
	 * @ordered
	 */
	public static final int NON_THERMAL_PROCESSING_VALUE = 4;

	/**
	 * The '<em><b>Storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Storage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STORAGE
	 * @model name="storage"
	 * @generated
	 * @ordered
	 */
	public static final int STORAGE_VALUE = 5;

	/**
	 * The '<em><b>Thermal processing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Thermal processing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THERMAL_PROCESSING
	 * @model name="thermal_processing"
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_PROCESSING_VALUE = 6;

	/**
	 * The '<em><b>Cross contamination</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cross contamination</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CROSS_CONTAMINATION
	 * @model name="cross_contamination"
	 * @generated
	 * @ordered
	 */
	public static final int CROSS_CONTAMINATION_VALUE = 7;

	/**
	 * An array of all the '<em><b>Food Process</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FoodProcess[] VALUES_ARRAY =
		new FoodProcess[] {
			COOLING,
			DRYING,
			FERMENTATION,
			HIGH_PRESSURE_PROCESSING,
			NON_THERMAL_PROCESSING,
			STORAGE,
			THERMAL_PROCESSING,
			CROSS_CONTAMINATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Food Process</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FoodProcess> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Food Process</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FoodProcess get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FoodProcess result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Food Process</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FoodProcess getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FoodProcess result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Food Process</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FoodProcess get(int value) {
		switch (value) {
			case COOLING_VALUE: return COOLING;
			case DRYING_VALUE: return DRYING;
			case FERMENTATION_VALUE: return FERMENTATION;
			case HIGH_PRESSURE_PROCESSING_VALUE: return HIGH_PRESSURE_PROCESSING;
			case NON_THERMAL_PROCESSING_VALUE: return NON_THERMAL_PROCESSING;
			case STORAGE_VALUE: return STORAGE;
			case THERMAL_PROCESSING_VALUE: return THERMAL_PROCESSING;
			case CROSS_CONTAMINATION_VALUE: return CROSS_CONTAMINATION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FoodProcess(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FoodProcess
