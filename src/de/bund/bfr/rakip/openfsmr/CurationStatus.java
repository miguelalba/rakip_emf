/**
 */
package de.bund.bfr.rakip.openfsmr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Curation Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getCurationStatus()
 * @model
 * @generated
 */
public enum CurationStatus implements Enumerator {
	/**
	 * The '<em><b>Based on published results</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASED_ON_PUBLISHED_RESULTS_VALUE
	 * @generated
	 * @ordered
	 */
	BASED_ON_PUBLISHED_RESULTS(0, "based_on_published_results", "based_on_published_results"),

	/**
	 * The '<em><b>Independent validation results</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDEPENDENT_VALIDATION_RESULTS_VALUE
	 * @generated
	 * @ordered
	 */
	INDEPENDENT_VALIDATION_RESULTS(1, "independent_validation_results", "independent_validation_results"),

	/**
	 * The '<em><b>Long term use</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_TERM_USE_VALUE
	 * @generated
	 * @ordered
	 */
	LONG_TERM_USE(2, "long_term_use", "long_term_use"),

	/**
	 * The '<em><b>Not curated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_CURATED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_CURATED(3, "not_curated", "not_curated");

	/**
	 * The '<em><b>Based on published results</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Based on published results</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASED_ON_PUBLISHED_RESULTS
	 * @model name="based_on_published_results"
	 * @generated
	 * @ordered
	 */
	public static final int BASED_ON_PUBLISHED_RESULTS_VALUE = 0;

	/**
	 * The '<em><b>Independent validation results</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Independent validation results</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDEPENDENT_VALIDATION_RESULTS
	 * @model name="independent_validation_results"
	 * @generated
	 * @ordered
	 */
	public static final int INDEPENDENT_VALIDATION_RESULTS_VALUE = 1;

	/**
	 * The '<em><b>Long term use</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Long term use</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONG_TERM_USE
	 * @model name="long_term_use"
	 * @generated
	 * @ordered
	 */
	public static final int LONG_TERM_USE_VALUE = 2;

	/**
	 * The '<em><b>Not curated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not curated</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_CURATED
	 * @model name="not_curated"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_CURATED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Curation Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CurationStatus[] VALUES_ARRAY =
		new CurationStatus[] {
			BASED_ON_PUBLISHED_RESULTS,
			INDEPENDENT_VALIDATION_RESULTS,
			LONG_TERM_USE,
			NOT_CURATED,
		};

	/**
	 * A public read-only list of all the '<em><b>Curation Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CurationStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Curation Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CurationStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CurationStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Curation Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CurationStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CurationStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Curation Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CurationStatus get(int value) {
		switch (value) {
			case BASED_ON_PUBLISHED_RESULTS_VALUE: return BASED_ON_PUBLISHED_RESULTS;
			case INDEPENDENT_VALIDATION_RESULTS_VALUE: return INDEPENDENT_VALIDATION_RESULTS;
			case LONG_TERM_USE_VALUE: return LONG_TERM_USE;
			case NOT_CURATED_VALUE: return NOT_CURATED;
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
	private CurationStatus(int value, String name, String literal) {
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
	
} //CurationStatus
