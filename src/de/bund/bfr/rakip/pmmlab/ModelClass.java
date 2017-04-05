/**
 */
package de.bund.bfr.rakip.pmmlab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Model Class</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getModelClass()
 * @model
 * @generated
 */
public enum ModelClass implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "unknown", "unknown"),

	/**
	 * The '<em><b>Growth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROWTH_VALUE
	 * @generated
	 * @ordered
	 */
	GROWTH(1, "growth", "growth"),

	/**
	 * The '<em><b>Inactivation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INACTIVATION_VALUE
	 * @generated
	 * @ordered
	 */
	INACTIVATION(2, "inactivation", "inactivation"),

	/**
	 * The '<em><b>Survival</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURVIVAL_VALUE
	 * @generated
	 * @ordered
	 */
	SURVIVAL(3, "survival", "survival"),

	/**
	 * The '<em><b>Growth inactivation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROWTH_INACTIVATION_VALUE
	 * @generated
	 * @ordered
	 */
	GROWTH_INACTIVATION(4, "growth_inactivation", "growth_inactivation"),

	/**
	 * The '<em><b>Inactivation survival</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INACTIVATION_SURVIVAL_VALUE
	 * @generated
	 * @ordered
	 */
	INACTIVATION_SURVIVAL(5, "inactivation_survival", "inactivation_survival"),

	/**
	 * The '<em><b>Growth survival</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROWTH_SURVIVAL_VALUE
	 * @generated
	 * @ordered
	 */
	GROWTH_SURVIVAL(6, "growth_survival", "growth_survival"),

	/**
	 * The '<em><b>Growth inactivation survival</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROWTH_INACTIVATION_SURVIVAL_VALUE
	 * @generated
	 * @ordered
	 */
	GROWTH_INACTIVATION_SURVIVAL(7, "growth_inactivation_survival", "growth_inactivation_survival"),

	/**
	 * The '<em><b>T</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #T_VALUE
	 * @generated
	 * @ordered
	 */
	T(8, "T", "T"),

	/**
	 * The '<em><b>PH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PH_VALUE
	 * @generated
	 * @ordered
	 */
	PH(9, "pH", "pH"),

	/**
	 * The '<em><b>Aw</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AW_VALUE
	 * @generated
	 * @ordered
	 */
	AW(10, "aw", "aw"),

	/**
	 * The '<em><b>TpH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TPH_VALUE
	 * @generated
	 * @ordered
	 */
	TPH(11, "T_pH", "T_pH"),

	/**
	 * The '<em><b>Taw</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAW_VALUE
	 * @generated
	 * @ordered
	 */
	TAW(12, "T_aw", "T_aw"),

	/**
	 * The '<em><b>PH aw</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PH_AW_VALUE
	 * @generated
	 * @ordered
	 */
	PH_AW(13, "pH_aw", "pH_aw"),

	/**
	 * The '<em><b>TpH aw</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TPH_AW_VALUE
	 * @generated
	 * @ordered
	 */
	TPH_AW(14, "T_pH_aw", "T_pH_aw");

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

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
	public static final int GROWTH_VALUE = 1;

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
	public static final int INACTIVATION_VALUE = 2;

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
	public static final int SURVIVAL_VALUE = 3;

	/**
	 * The '<em><b>Growth inactivation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Growth inactivation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GROWTH_INACTIVATION
	 * @model name="growth_inactivation"
	 * @generated
	 * @ordered
	 */
	public static final int GROWTH_INACTIVATION_VALUE = 4;

	/**
	 * The '<em><b>Inactivation survival</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inactivation survival</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INACTIVATION_SURVIVAL
	 * @model name="inactivation_survival"
	 * @generated
	 * @ordered
	 */
	public static final int INACTIVATION_SURVIVAL_VALUE = 5;

	/**
	 * The '<em><b>Growth survival</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Growth survival</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GROWTH_SURVIVAL
	 * @model name="growth_survival"
	 * @generated
	 * @ordered
	 */
	public static final int GROWTH_SURVIVAL_VALUE = 6;

	/**
	 * The '<em><b>Growth inactivation survival</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Growth inactivation survival</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GROWTH_INACTIVATION_SURVIVAL
	 * @model name="growth_inactivation_survival"
	 * @generated
	 * @ordered
	 */
	public static final int GROWTH_INACTIVATION_SURVIVAL_VALUE = 7;

	/**
	 * The '<em><b>T</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>T</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #T
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int T_VALUE = 8;

	/**
	 * The '<em><b>PH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PH
	 * @model name="pH"
	 * @generated
	 * @ordered
	 */
	public static final int PH_VALUE = 9;

	/**
	 * The '<em><b>Aw</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aw</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AW
	 * @model name="aw"
	 * @generated
	 * @ordered
	 */
	public static final int AW_VALUE = 10;

	/**
	 * The '<em><b>TpH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TpH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TPH
	 * @model name="T_pH"
	 * @generated
	 * @ordered
	 */
	public static final int TPH_VALUE = 11;

	/**
	 * The '<em><b>Taw</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Taw</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAW
	 * @model name="T_aw"
	 * @generated
	 * @ordered
	 */
	public static final int TAW_VALUE = 12;

	/**
	 * The '<em><b>PH aw</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PH aw</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PH_AW
	 * @model name="pH_aw"
	 * @generated
	 * @ordered
	 */
	public static final int PH_AW_VALUE = 13;

	/**
	 * The '<em><b>TpH aw</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TpH aw</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TPH_AW
	 * @model name="T_pH_aw"
	 * @generated
	 * @ordered
	 */
	public static final int TPH_AW_VALUE = 14;

	/**
	 * An array of all the '<em><b>Model Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModelClass[] VALUES_ARRAY =
		new ModelClass[] {
			UNKNOWN,
			GROWTH,
			INACTIVATION,
			SURVIVAL,
			GROWTH_INACTIVATION,
			INACTIVATION_SURVIVAL,
			GROWTH_SURVIVAL,
			GROWTH_INACTIVATION_SURVIVAL,
			T,
			PH,
			AW,
			TPH,
			TAW,
			PH_AW,
			TPH_AW,
		};

	/**
	 * A public read-only list of all the '<em><b>Model Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModelClass> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Model Class</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelClass get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelClass result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Class</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelClass getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelClass result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Class</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelClass get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case GROWTH_VALUE: return GROWTH;
			case INACTIVATION_VALUE: return INACTIVATION;
			case SURVIVAL_VALUE: return SURVIVAL;
			case GROWTH_INACTIVATION_VALUE: return GROWTH_INACTIVATION;
			case INACTIVATION_SURVIVAL_VALUE: return INACTIVATION_SURVIVAL;
			case GROWTH_SURVIVAL_VALUE: return GROWTH_SURVIVAL;
			case GROWTH_INACTIVATION_SURVIVAL_VALUE: return GROWTH_INACTIVATION_SURVIVAL;
			case T_VALUE: return T;
			case PH_VALUE: return PH;
			case AW_VALUE: return AW;
			case TPH_VALUE: return TPH;
			case TAW_VALUE: return TAW;
			case PH_AW_VALUE: return PH_AW;
			case TPH_AW_VALUE: return TPH_AW;
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
	private ModelClass(int value, String name, String literal) {
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
	
} //ModelClass
