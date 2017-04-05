/**
 */
package de.bund.bfr.rakip.pmmlab.impl;

import de.bund.bfr.rakip.pmmlab.Matrix;
import de.bund.bfr.rakip.pmmlab.ModelEquation;
import de.bund.bfr.rakip.pmmlab.Organism;
import de.bund.bfr.rakip.pmmlab.Parameter;
import de.bund.bfr.rakip.pmmlab.PmmLabRecord;
import de.bund.bfr.rakip.pmmlab.ReferenceDescription;
import de.bund.bfr.rakip.pmmlab.pmmlabPackage;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Pmm Lab Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.PmmLabRecordImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.PmmLabRecordImpl#getCreatorGivenName <em>Creator Given Name</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.PmmLabRecordImpl#getCreatorFamilyName <em>Creator Family Name</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.PmmLabRecordImpl#getCreatorContact <em>Creator Contact</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.PmmLabRecordImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.PmmLabRecordImpl#getModifiedDate <em>Modified Date</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.PmmLabRecordImpl#getLicense <em>License</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.PmmLabRecordImpl#getYear <em>Year</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.PmmLabRecordImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.PmmLabRecordImpl#getMatrix <em>Matrix</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.PmmLabRecordImpl#getOrganism <em>Organism</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.PmmLabRecordImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.PmmLabRecordImpl#getReferencedescription <em>Referencedescription</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.PmmLabRecordImpl#getModelequation <em>Modelequation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PmmLabRecordImpl extends MinimalEObjectImpl.Container implements PmmLabRecord {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatorGivenName() <em>Creator Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatorGivenName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATOR_GIVEN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatorGivenName() <em>Creator Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatorGivenName()
	 * @generated
	 * @ordered
	 */
	protected String creatorGivenName = CREATOR_GIVEN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatorFamilyName() <em>Creator Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatorFamilyName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATOR_FAMILY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatorFamilyName() <em>Creator Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatorFamilyName()
	 * @generated
	 * @ordered
	 */
	protected String creatorFamilyName = CREATOR_FAMILY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatorContact() <em>Creator Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatorContact()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATOR_CONTACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatorContact() <em>Creator Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatorContact()
	 * @generated
	 * @ordered
	 */
	protected String creatorContact = CREATOR_CONTACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModifiedDate() <em>Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifiedDate() <em>Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected Date modifiedDate = MODIFIED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected String license = LICENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatrix() <em>Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrix()
	 * @generated
	 * @ordered
	 */
	protected Matrix matrix;

	/**
	 * The cached value of the '{@link #getOrganism() <em>Organism</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganism()
	 * @generated
	 * @ordered
	 */
	protected Organism organism;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * The cached value of the '{@link #getReferencedescription() <em>Referencedescription</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedescription()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceDescription> referencedescription;

	/**
	 * The cached value of the '{@link #getModelequation() <em>Modelequation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelequation()
	 * @generated
	 * @ordered
	 */
	protected ModelEquation modelequation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PmmLabRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return pmmlabPackage.Literals.PMM_LAB_RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PMM_LAB_RECORD__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreatorGivenName() {
		return creatorGivenName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatorGivenName(String newCreatorGivenName) {
		String oldCreatorGivenName = creatorGivenName;
		creatorGivenName = newCreatorGivenName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PMM_LAB_RECORD__CREATOR_GIVEN_NAME, oldCreatorGivenName, creatorGivenName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreatorFamilyName() {
		return creatorFamilyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatorFamilyName(String newCreatorFamilyName) {
		String oldCreatorFamilyName = creatorFamilyName;
		creatorFamilyName = newCreatorFamilyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PMM_LAB_RECORD__CREATOR_FAMILY_NAME, oldCreatorFamilyName, creatorFamilyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreatorContact() {
		return creatorContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatorContact(String newCreatorContact) {
		String oldCreatorContact = creatorContact;
		creatorContact = newCreatorContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PMM_LAB_RECORD__CREATOR_CONTACT, oldCreatorContact, creatorContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		Date oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PMM_LAB_RECORD__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiedDate(Date newModifiedDate) {
		Date oldModifiedDate = modifiedDate;
		modifiedDate = newModifiedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PMM_LAB_RECORD__MODIFIED_DATE, oldModifiedDate, modifiedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicense() {
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicense(String newLicense) {
		String oldLicense = license;
		license = newLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PMM_LAB_RECORD__LICENSE, oldLicense, license));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PMM_LAB_RECORD__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PMM_LAB_RECORD__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix getMatrix() {
		return matrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatrix(Matrix newMatrix, NotificationChain msgs) {
		Matrix oldMatrix = matrix;
		matrix = newMatrix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, pmmlabPackage.PMM_LAB_RECORD__MATRIX, oldMatrix, newMatrix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatrix(Matrix newMatrix) {
		if (newMatrix != matrix) {
			NotificationChain msgs = null;
			if (matrix != null)
				msgs = ((InternalEObject)matrix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - pmmlabPackage.PMM_LAB_RECORD__MATRIX, null, msgs);
			if (newMatrix != null)
				msgs = ((InternalEObject)newMatrix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - pmmlabPackage.PMM_LAB_RECORD__MATRIX, null, msgs);
			msgs = basicSetMatrix(newMatrix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PMM_LAB_RECORD__MATRIX, newMatrix, newMatrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organism getOrganism() {
		return organism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganism(Organism newOrganism, NotificationChain msgs) {
		Organism oldOrganism = organism;
		organism = newOrganism;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, pmmlabPackage.PMM_LAB_RECORD__ORGANISM, oldOrganism, newOrganism);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganism(Organism newOrganism) {
		if (newOrganism != organism) {
			NotificationChain msgs = null;
			if (organism != null)
				msgs = ((InternalEObject)organism).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - pmmlabPackage.PMM_LAB_RECORD__ORGANISM, null, msgs);
			if (newOrganism != null)
				msgs = ((InternalEObject)newOrganism).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - pmmlabPackage.PMM_LAB_RECORD__ORGANISM, null, msgs);
			msgs = basicSetOrganism(newOrganism, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PMM_LAB_RECORD__ORGANISM, newOrganism, newOrganism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, pmmlabPackage.PMM_LAB_RECORD__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceDescription> getReferencedescription() {
		if (referencedescription == null) {
			referencedescription = new EObjectContainmentEList<ReferenceDescription>(ReferenceDescription.class, this, pmmlabPackage.PMM_LAB_RECORD__REFERENCEDESCRIPTION);
		}
		return referencedescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelEquation getModelequation() {
		return modelequation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelequation(ModelEquation newModelequation, NotificationChain msgs) {
		ModelEquation oldModelequation = modelequation;
		modelequation = newModelequation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, pmmlabPackage.PMM_LAB_RECORD__MODELEQUATION, oldModelequation, newModelequation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelequation(ModelEquation newModelequation) {
		if (newModelequation != modelequation) {
			NotificationChain msgs = null;
			if (modelequation != null)
				msgs = ((InternalEObject)modelequation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - pmmlabPackage.PMM_LAB_RECORD__MODELEQUATION, null, msgs);
			if (newModelequation != null)
				msgs = ((InternalEObject)newModelequation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - pmmlabPackage.PMM_LAB_RECORD__MODELEQUATION, null, msgs);
			msgs = basicSetModelequation(newModelequation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.PMM_LAB_RECORD__MODELEQUATION, newModelequation, newModelequation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case pmmlabPackage.PMM_LAB_RECORD__MATRIX:
				return basicSetMatrix(null, msgs);
			case pmmlabPackage.PMM_LAB_RECORD__ORGANISM:
				return basicSetOrganism(null, msgs);
			case pmmlabPackage.PMM_LAB_RECORD__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case pmmlabPackage.PMM_LAB_RECORD__REFERENCEDESCRIPTION:
				return ((InternalEList<?>)getReferencedescription()).basicRemove(otherEnd, msgs);
			case pmmlabPackage.PMM_LAB_RECORD__MODELEQUATION:
				return basicSetModelequation(null, msgs);
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
			case pmmlabPackage.PMM_LAB_RECORD__ID:
				return getId();
			case pmmlabPackage.PMM_LAB_RECORD__CREATOR_GIVEN_NAME:
				return getCreatorGivenName();
			case pmmlabPackage.PMM_LAB_RECORD__CREATOR_FAMILY_NAME:
				return getCreatorFamilyName();
			case pmmlabPackage.PMM_LAB_RECORD__CREATOR_CONTACT:
				return getCreatorContact();
			case pmmlabPackage.PMM_LAB_RECORD__CREATION_DATE:
				return getCreationDate();
			case pmmlabPackage.PMM_LAB_RECORD__MODIFIED_DATE:
				return getModifiedDate();
			case pmmlabPackage.PMM_LAB_RECORD__LICENSE:
				return getLicense();
			case pmmlabPackage.PMM_LAB_RECORD__YEAR:
				return getYear();
			case pmmlabPackage.PMM_LAB_RECORD__COMMENT:
				return getComment();
			case pmmlabPackage.PMM_LAB_RECORD__MATRIX:
				return getMatrix();
			case pmmlabPackage.PMM_LAB_RECORD__ORGANISM:
				return getOrganism();
			case pmmlabPackage.PMM_LAB_RECORD__PARAMETER:
				return getParameter();
			case pmmlabPackage.PMM_LAB_RECORD__REFERENCEDESCRIPTION:
				return getReferencedescription();
			case pmmlabPackage.PMM_LAB_RECORD__MODELEQUATION:
				return getModelequation();
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
			case pmmlabPackage.PMM_LAB_RECORD__ID:
				setId((String)newValue);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__CREATOR_GIVEN_NAME:
				setCreatorGivenName((String)newValue);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__CREATOR_FAMILY_NAME:
				setCreatorFamilyName((String)newValue);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__CREATOR_CONTACT:
				setCreatorContact((String)newValue);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__MODIFIED_DATE:
				setModifiedDate((Date)newValue);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__LICENSE:
				setLicense((String)newValue);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__YEAR:
				setYear((Integer)newValue);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__COMMENT:
				setComment((String)newValue);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__MATRIX:
				setMatrix((Matrix)newValue);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__ORGANISM:
				setOrganism((Organism)newValue);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__REFERENCEDESCRIPTION:
				getReferencedescription().clear();
				getReferencedescription().addAll((Collection<? extends ReferenceDescription>)newValue);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__MODELEQUATION:
				setModelequation((ModelEquation)newValue);
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
			case pmmlabPackage.PMM_LAB_RECORD__ID:
				setId(ID_EDEFAULT);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__CREATOR_GIVEN_NAME:
				setCreatorGivenName(CREATOR_GIVEN_NAME_EDEFAULT);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__CREATOR_FAMILY_NAME:
				setCreatorFamilyName(CREATOR_FAMILY_NAME_EDEFAULT);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__CREATOR_CONTACT:
				setCreatorContact(CREATOR_CONTACT_EDEFAULT);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__MODIFIED_DATE:
				setModifiedDate(MODIFIED_DATE_EDEFAULT);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__LICENSE:
				setLicense(LICENSE_EDEFAULT);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__MATRIX:
				setMatrix((Matrix)null);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__ORGANISM:
				setOrganism((Organism)null);
				return;
			case pmmlabPackage.PMM_LAB_RECORD__PARAMETER:
				getParameter().clear();
				return;
			case pmmlabPackage.PMM_LAB_RECORD__REFERENCEDESCRIPTION:
				getReferencedescription().clear();
				return;
			case pmmlabPackage.PMM_LAB_RECORD__MODELEQUATION:
				setModelequation((ModelEquation)null);
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
			case pmmlabPackage.PMM_LAB_RECORD__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case pmmlabPackage.PMM_LAB_RECORD__CREATOR_GIVEN_NAME:
				return CREATOR_GIVEN_NAME_EDEFAULT == null ? creatorGivenName != null : !CREATOR_GIVEN_NAME_EDEFAULT.equals(creatorGivenName);
			case pmmlabPackage.PMM_LAB_RECORD__CREATOR_FAMILY_NAME:
				return CREATOR_FAMILY_NAME_EDEFAULT == null ? creatorFamilyName != null : !CREATOR_FAMILY_NAME_EDEFAULT.equals(creatorFamilyName);
			case pmmlabPackage.PMM_LAB_RECORD__CREATOR_CONTACT:
				return CREATOR_CONTACT_EDEFAULT == null ? creatorContact != null : !CREATOR_CONTACT_EDEFAULT.equals(creatorContact);
			case pmmlabPackage.PMM_LAB_RECORD__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case pmmlabPackage.PMM_LAB_RECORD__MODIFIED_DATE:
				return MODIFIED_DATE_EDEFAULT == null ? modifiedDate != null : !MODIFIED_DATE_EDEFAULT.equals(modifiedDate);
			case pmmlabPackage.PMM_LAB_RECORD__LICENSE:
				return LICENSE_EDEFAULT == null ? license != null : !LICENSE_EDEFAULT.equals(license);
			case pmmlabPackage.PMM_LAB_RECORD__YEAR:
				return year != YEAR_EDEFAULT;
			case pmmlabPackage.PMM_LAB_RECORD__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case pmmlabPackage.PMM_LAB_RECORD__MATRIX:
				return matrix != null;
			case pmmlabPackage.PMM_LAB_RECORD__ORGANISM:
				return organism != null;
			case pmmlabPackage.PMM_LAB_RECORD__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case pmmlabPackage.PMM_LAB_RECORD__REFERENCEDESCRIPTION:
				return referencedescription != null && !referencedescription.isEmpty();
			case pmmlabPackage.PMM_LAB_RECORD__MODELEQUATION:
				return modelequation != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", creatorGivenName: ");
		result.append(creatorGivenName);
		result.append(", creatorFamilyName: ");
		result.append(creatorFamilyName);
		result.append(", creatorContact: ");
		result.append(creatorContact);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", modifiedDate: ");
		result.append(modifiedDate);
		result.append(", license: ");
		result.append(license);
		result.append(", year: ");
		result.append(year);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //PmmLabRecordImpl
