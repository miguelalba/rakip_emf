/**
 */
package de.bund.bfr.rakip.pmmlab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reference Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.bund.bfr.rakip.pmmlab.pmmlabPackage#getReferenceType()
 * @model
 * @generated
 */
public enum ReferenceType implements Enumerator {
	/**
	 * The '<em><b>Paper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAPER_VALUE
	 * @generated
	 * @ordered
	 */
	PAPER(0, "paper", "paper"),

	/**
	 * The '<em><b>Sop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOP_VALUE
	 * @generated
	 * @ordered
	 */
	SOP(1, "sop", "sop"),

	/**
	 * The '<em><b>La</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LA_VALUE
	 * @generated
	 * @ordered
	 */
	LA(2, "la", "la"),

	/**
	 * The '<em><b>Manual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUAL_VALUE
	 * @generated
	 * @ordered
	 */
	MANUAL(3, "manual", "manual"),

	/**
	 * The '<em><b>Lab log</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAB_LOG_VALUE
	 * @generated
	 * @ordered
	 */
	LAB_LOG(4, "lab_log", "lab_log"),

	/**
	 * The '<em><b>Book</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOK_VALUE
	 * @generated
	 * @ordered
	 */
	BOOK(5, "book", "book"),

	/**
	 * The '<em><b>Website</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEBSITE_VALUE
	 * @generated
	 * @ordered
	 */
	WEBSITE(6, "website", "website"),

	/**
	 * The '<em><b>Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	REPORT(7, "report", "report");

	/**
	 * The '<em><b>Paper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Paper</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAPER
	 * @model name="paper"
	 * @generated
	 * @ordered
	 */
	public static final int PAPER_VALUE = 0;

	/**
	 * The '<em><b>Sop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOP
	 * @model name="sop"
	 * @generated
	 * @ordered
	 */
	public static final int SOP_VALUE = 1;

	/**
	 * The '<em><b>La</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>La</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LA
	 * @model name="la"
	 * @generated
	 * @ordered
	 */
	public static final int LA_VALUE = 2;

	/**
	 * The '<em><b>Manual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Manual</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANUAL
	 * @model name="manual"
	 * @generated
	 * @ordered
	 */
	public static final int MANUAL_VALUE = 3;

	/**
	 * The '<em><b>Lab log</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lab log</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LAB_LOG
	 * @model name="lab_log"
	 * @generated
	 * @ordered
	 */
	public static final int LAB_LOG_VALUE = 4;

	/**
	 * The '<em><b>Book</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Book</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOK
	 * @model name="book"
	 * @generated
	 * @ordered
	 */
	public static final int BOOK_VALUE = 5;

	/**
	 * The '<em><b>Website</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Website</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEBSITE
	 * @model name="website"
	 * @generated
	 * @ordered
	 */
	public static final int WEBSITE_VALUE = 6;

	/**
	 * The '<em><b>Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Report</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPORT
	 * @model name="report"
	 * @generated
	 * @ordered
	 */
	public static final int REPORT_VALUE = 7;

	/**
	 * An array of all the '<em><b>Reference Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReferenceType[] VALUES_ARRAY =
		new ReferenceType[] {
			PAPER,
			SOP,
			LA,
			MANUAL,
			LAB_LOG,
			BOOK,
			WEBSITE,
			REPORT,
		};

	/**
	 * A public read-only list of all the '<em><b>Reference Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReferenceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reference Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReferenceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferenceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reference Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReferenceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferenceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reference Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReferenceType get(int value) {
		switch (value) {
			case PAPER_VALUE: return PAPER;
			case SOP_VALUE: return SOP;
			case LA_VALUE: return LA;
			case MANUAL_VALUE: return MANUAL;
			case LAB_LOG_VALUE: return LAB_LOG;
			case BOOK_VALUE: return BOOK;
			case WEBSITE_VALUE: return WEBSITE;
			case REPORT_VALUE: return REPORT;
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
	private ReferenceType(int value, String name, String literal) {
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
	
} //ReferenceType
