/**
 */
package de.bund.bfr.rakip.openfsmr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Model Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.bund.bfr.rakip.openfsmr.openfsmrPackage#getModelType()
 * @model
 * @generated
 */
public enum ModelType implements Enumerator {
	/**
	 * The '<em><b>Growth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROWTH_VALUE
	 * @generated
	 * @ordered
	 */
	GROWTH(0, "growth", "growth"),

	/**
	 * The '<em><b>Inactivation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INACTIVATION_VALUE
	 * @generated
	 * @ordered
	 */
	INACTIVATION(1, "inactivation", "inactivation"),

	/**
	 * The '<em><b>Survival</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURVIVAL_VALUE
	 * @generated
	 * @ordered
	 */
	SURVIVAL(2, "survival", "survival"),

	/**
	 * The '<em><b>Metabolite formation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METABOLITE_FORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	METABOLITE_FORMATION(3, "metabolite_formation", "metabolite_formation"),

	/**
	 * The '<em><b>Growth boundary model</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROWTH_BOUNDARY_MODEL_VALUE
	 * @generated
	 * @ordered
	 */
	GROWTH_BOUNDARY_MODEL(4, "growth_boundary_model", "growth_boundary_model"),

	/**
	 * The '<em><b>Spoilage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPOILAGE_VALUE
	 * @generated
	 * @ordered
	 */
	SPOILAGE(5, "spoilage", "spoilage"),

	/**
	 * The '<em><b>Transfer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFER_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFER(6, "transfer", "transfer"),

	/**
	 * The '<em><b>Mpd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MPD_VALUE
	 * @generated
	 * @ordered
	 */
	MPD(7, "mpd", "mpd"),

	/**
	 * The '<em><b>Lpd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LPD_VALUE
	 * @generated
	 * @ordered
	 */
	LPD(8, "lpd", "lpd");

	/**
	 * The '<em><b>Growth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Growth</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GROWTH
	 * @model name="growth"
	 * @generated
	 * @ordered
	 */
	public static final int GROWTH_VALUE = 0;

	/**
	 * The '<em><b>Inactivation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inactivation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INACTIVATION
	 * @model name="inactivation"
	 * @generated
	 * @ordered
	 */
	public static final int INACTIVATION_VALUE = 1;

	/**
	 * The '<em><b>Survival</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Survival</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SURVIVAL
	 * @model name="survival"
	 * @generated
	 * @ordered
	 */
	public static final int SURVIVAL_VALUE = 2;

	/**
	 * The '<em><b>Metabolite formation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Metabolite formation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METABOLITE_FORMATION
	 * @model name="metabolite_formation"
	 * @generated
	 * @ordered
	 */
	public static final int METABOLITE_FORMATION_VALUE = 3;

	/**
	 * The '<em><b>Growth boundary model</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Growth boundary model</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GROWTH_BOUNDARY_MODEL
	 * @model name="growth_boundary_model"
	 * @generated
	 * @ordered
	 */
	public static final int GROWTH_BOUNDARY_MODEL_VALUE = 4;

	/**
	 * The '<em><b>Spoilage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Spoilage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPOILAGE
	 * @model name="spoilage"
	 * @generated
	 * @ordered
	 */
	public static final int SPOILAGE_VALUE = 5;

	/**
	 * The '<em><b>Transfer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transfer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSFER
	 * @model name="transfer"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFER_VALUE = 6;

	/**
	 * The '<em><b>Mpd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mpd</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MPD
	 * @model name="mpd"
	 * @generated
	 * @ordered
	 */
	public static final int MPD_VALUE = 7;

	/**
	 * The '<em><b>Lpd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lpd</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LPD
	 * @model name="lpd"
	 * @generated
	 * @ordered
	 */
	public static final int LPD_VALUE = 8;

	/**
	 * An array of all the '<em><b>Model Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModelType[] VALUES_ARRAY =
		new ModelType[] {
			GROWTH,
			INACTIVATION,
			SURVIVAL,
			METABOLITE_FORMATION,
			GROWTH_BOUNDARY_MODEL,
			SPOILAGE,
			TRANSFER,
			MPD,
			LPD,
		};

	/**
	 * A public read-only list of all the '<em><b>Model Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModelType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Model Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelType get(int value) {
		switch (value) {
			case GROWTH_VALUE: return GROWTH;
			case INACTIVATION_VALUE: return INACTIVATION;
			case SURVIVAL_VALUE: return SURVIVAL;
			case METABOLITE_FORMATION_VALUE: return METABOLITE_FORMATION;
			case GROWTH_BOUNDARY_MODEL_VALUE: return GROWTH_BOUNDARY_MODEL;
			case SPOILAGE_VALUE: return SPOILAGE;
			case TRANSFER_VALUE: return TRANSFER;
			case MPD_VALUE: return MPD;
			case LPD_VALUE: return LPD;
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
	private ModelType(int value, String name, String literal) {
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
	
} //ModelType
