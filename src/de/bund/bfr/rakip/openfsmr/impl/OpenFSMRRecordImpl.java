/**
 */
package de.bund.bfr.rakip.openfsmr.impl;

import de.bund.bfr.rakip.openfsmr.CurationStatus;
import de.bund.bfr.rakip.openfsmr.Environment;
import de.bund.bfr.rakip.openfsmr.FoodProcess;
import de.bund.bfr.rakip.openfsmr.ModelType;
import de.bund.bfr.rakip.openfsmr.OpenFSMRRecord;
import de.bund.bfr.rakip.openfsmr.Organism;
import de.bund.bfr.rakip.openfsmr.Variable;
import de.bund.bfr.rakip.openfsmr.openfsmrPackage;

import java.net.URL;

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
 * An implementation of the model object '<em><b>Open FSMR Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.impl.OpenFSMRRecordImpl#getIndependentVariables <em>Independent Variables</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.impl.OpenFSMRRecordImpl#getDependentVariables <em>Dependent Variables</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.impl.OpenFSMRRecordImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.impl.OpenFSMRRecordImpl#getOrganism <em>Organism</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.impl.OpenFSMRRecordImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.impl.OpenFSMRRecordImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.impl.OpenFSMRRecordImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.impl.OpenFSMRRecordImpl#getModifiedDate <em>Modified Date</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.impl.OpenFSMRRecordImpl#getRights <em>Rights</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.impl.OpenFSMRRecordImpl#getReferenceDescription <em>Reference Description</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.impl.OpenFSMRRecordImpl#getReferenceDescriptionLink <em>Reference Description Link</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.impl.OpenFSMRRecordImpl#getSoftware <em>Software</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.impl.OpenFSMRRecordImpl#getFoodProcess <em>Food Process</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.impl.OpenFSMRRecordImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.impl.OpenFSMRRecordImpl#getCurationStatus <em>Curation Status</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.impl.OpenFSMRRecordImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.openfsmr.impl.OpenFSMRRecordImpl#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpenFSMRRecordImpl extends MinimalEObjectImpl.Container implements OpenFSMRRecord {
	/**
	 * The cached value of the '{@link #getIndependentVariables() <em>Independent Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndependentVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> independentVariables;

	/**
	 * The cached value of the '{@link #getDependentVariables() <em>Dependent Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> dependentVariables;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected Environment environment;

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
	 * The default value of the '{@link #getCreator() <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected String creator = CREATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected Date createdDate = CREATED_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getRights() <em>Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRights()
	 * @generated
	 * @ordered
	 */
	protected static final String RIGHTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRights() <em>Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRights()
	 * @generated
	 * @ordered
	 */
	protected String rights = RIGHTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferenceDescription() <em>Reference Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceDescription() <em>Reference Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDescription()
	 * @generated
	 * @ordered
	 */
	protected String referenceDescription = REFERENCE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferenceDescriptionLink() <em>Reference Description Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDescriptionLink()
	 * @generated
	 * @ordered
	 */
	protected static final URL REFERENCE_DESCRIPTION_LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceDescriptionLink() <em>Reference Description Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDescriptionLink()
	 * @generated
	 * @ordered
	 */
	protected URL referenceDescriptionLink = REFERENCE_DESCRIPTION_LINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoftware() <em>Software</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware()
	 * @generated
	 * @ordered
	 */
	protected static final String SOFTWARE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoftware() <em>Software</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware()
	 * @generated
	 * @ordered
	 */
	protected String software = SOFTWARE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFoodProcess() <em>Food Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoodProcess()
	 * @generated
	 * @ordered
	 */
	protected static final FoodProcess FOOD_PROCESS_EDEFAULT = FoodProcess.COOLING;

	/**
	 * The cached value of the '{@link #getFoodProcess() <em>Food Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoodProcess()
	 * @generated
	 * @ordered
	 */
	protected FoodProcess foodProcess = FOOD_PROCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ModelType TYPE_EDEFAULT = ModelType.GROWTH;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ModelType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurationStatus() <em>Curation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurationStatus()
	 * @generated
	 * @ordered
	 */
	protected static final CurationStatus CURATION_STATUS_EDEFAULT = CurationStatus.BASED_ON_PUBLISHED_RESULTS;

	/**
	 * The cached value of the '{@link #getCurationStatus() <em>Curation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurationStatus()
	 * @generated
	 * @ordered
	 */
	protected CurationStatus curationStatus = CURATION_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected String subject = SUBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected String notes = NOTES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenFSMRRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return openfsmrPackage.Literals.OPEN_FSMR_RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getIndependentVariables() {
		if (independentVariables == null) {
			independentVariables = new EObjectContainmentEList<Variable>(Variable.class, this, openfsmrPackage.OPEN_FSMR_RECORD__INDEPENDENT_VARIABLES);
		}
		return independentVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getDependentVariables() {
		if (dependentVariables == null) {
			dependentVariables = new EObjectContainmentEList<Variable>(Variable.class, this, openfsmrPackage.OPEN_FSMR_RECORD__DEPENDENT_VARIABLES);
		}
		return dependentVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(Environment newEnvironment, NotificationChain msgs) {
		Environment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, openfsmrPackage.OPEN_FSMR_RECORD__ENVIRONMENT, oldEnvironment, newEnvironment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(Environment newEnvironment) {
		if (newEnvironment != environment) {
			NotificationChain msgs = null;
			if (environment != null)
				msgs = ((InternalEObject)environment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - openfsmrPackage.OPEN_FSMR_RECORD__ENVIRONMENT, null, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - openfsmrPackage.OPEN_FSMR_RECORD__ENVIRONMENT, null, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openfsmrPackage.OPEN_FSMR_RECORD__ENVIRONMENT, newEnvironment, newEnvironment));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, openfsmrPackage.OPEN_FSMR_RECORD__ORGANISM, oldOrganism, newOrganism);
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
				msgs = ((InternalEObject)organism).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - openfsmrPackage.OPEN_FSMR_RECORD__ORGANISM, null, msgs);
			if (newOrganism != null)
				msgs = ((InternalEObject)newOrganism).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - openfsmrPackage.OPEN_FSMR_RECORD__ORGANISM, null, msgs);
			msgs = basicSetOrganism(newOrganism, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openfsmrPackage.OPEN_FSMR_RECORD__ORGANISM, newOrganism, newOrganism));
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
			eNotify(new ENotificationImpl(this, Notification.SET, openfsmrPackage.OPEN_FSMR_RECORD__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(String newCreator) {
		String oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openfsmrPackage.OPEN_FSMR_RECORD__CREATOR, oldCreator, creator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedDate(Date newCreatedDate) {
		Date oldCreatedDate = createdDate;
		createdDate = newCreatedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openfsmrPackage.OPEN_FSMR_RECORD__CREATED_DATE, oldCreatedDate, createdDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, openfsmrPackage.OPEN_FSMR_RECORD__MODIFIED_DATE, oldModifiedDate, modifiedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRights() {
		return rights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRights(String newRights) {
		String oldRights = rights;
		rights = newRights;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openfsmrPackage.OPEN_FSMR_RECORD__RIGHTS, oldRights, rights));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceDescription() {
		return referenceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceDescription(String newReferenceDescription) {
		String oldReferenceDescription = referenceDescription;
		referenceDescription = newReferenceDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openfsmrPackage.OPEN_FSMR_RECORD__REFERENCE_DESCRIPTION, oldReferenceDescription, referenceDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URL getReferenceDescriptionLink() {
		return referenceDescriptionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceDescriptionLink(URL newReferenceDescriptionLink) {
		URL oldReferenceDescriptionLink = referenceDescriptionLink;
		referenceDescriptionLink = newReferenceDescriptionLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openfsmrPackage.OPEN_FSMR_RECORD__REFERENCE_DESCRIPTION_LINK, oldReferenceDescriptionLink, referenceDescriptionLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSoftware() {
		return software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftware(String newSoftware) {
		String oldSoftware = software;
		software = newSoftware;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openfsmrPackage.OPEN_FSMR_RECORD__SOFTWARE, oldSoftware, software));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoodProcess getFoodProcess() {
		return foodProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoodProcess(FoodProcess newFoodProcess) {
		FoodProcess oldFoodProcess = foodProcess;
		foodProcess = newFoodProcess == null ? FOOD_PROCESS_EDEFAULT : newFoodProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openfsmrPackage.OPEN_FSMR_RECORD__FOOD_PROCESS, oldFoodProcess, foodProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ModelType newType) {
		ModelType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openfsmrPackage.OPEN_FSMR_RECORD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurationStatus getCurationStatus() {
		return curationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurationStatus(CurationStatus newCurationStatus) {
		CurationStatus oldCurationStatus = curationStatus;
		curationStatus = newCurationStatus == null ? CURATION_STATUS_EDEFAULT : newCurationStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openfsmrPackage.OPEN_FSMR_RECORD__CURATION_STATUS, oldCurationStatus, curationStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(String newSubject) {
		String oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openfsmrPackage.OPEN_FSMR_RECORD__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openfsmrPackage.OPEN_FSMR_RECORD__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case openfsmrPackage.OPEN_FSMR_RECORD__INDEPENDENT_VARIABLES:
				return ((InternalEList<?>)getIndependentVariables()).basicRemove(otherEnd, msgs);
			case openfsmrPackage.OPEN_FSMR_RECORD__DEPENDENT_VARIABLES:
				return ((InternalEList<?>)getDependentVariables()).basicRemove(otherEnd, msgs);
			case openfsmrPackage.OPEN_FSMR_RECORD__ENVIRONMENT:
				return basicSetEnvironment(null, msgs);
			case openfsmrPackage.OPEN_FSMR_RECORD__ORGANISM:
				return basicSetOrganism(null, msgs);
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
			case openfsmrPackage.OPEN_FSMR_RECORD__INDEPENDENT_VARIABLES:
				return getIndependentVariables();
			case openfsmrPackage.OPEN_FSMR_RECORD__DEPENDENT_VARIABLES:
				return getDependentVariables();
			case openfsmrPackage.OPEN_FSMR_RECORD__ENVIRONMENT:
				return getEnvironment();
			case openfsmrPackage.OPEN_FSMR_RECORD__ORGANISM:
				return getOrganism();
			case openfsmrPackage.OPEN_FSMR_RECORD__ID:
				return getId();
			case openfsmrPackage.OPEN_FSMR_RECORD__CREATOR:
				return getCreator();
			case openfsmrPackage.OPEN_FSMR_RECORD__CREATED_DATE:
				return getCreatedDate();
			case openfsmrPackage.OPEN_FSMR_RECORD__MODIFIED_DATE:
				return getModifiedDate();
			case openfsmrPackage.OPEN_FSMR_RECORD__RIGHTS:
				return getRights();
			case openfsmrPackage.OPEN_FSMR_RECORD__REFERENCE_DESCRIPTION:
				return getReferenceDescription();
			case openfsmrPackage.OPEN_FSMR_RECORD__REFERENCE_DESCRIPTION_LINK:
				return getReferenceDescriptionLink();
			case openfsmrPackage.OPEN_FSMR_RECORD__SOFTWARE:
				return getSoftware();
			case openfsmrPackage.OPEN_FSMR_RECORD__FOOD_PROCESS:
				return getFoodProcess();
			case openfsmrPackage.OPEN_FSMR_RECORD__TYPE:
				return getType();
			case openfsmrPackage.OPEN_FSMR_RECORD__CURATION_STATUS:
				return getCurationStatus();
			case openfsmrPackage.OPEN_FSMR_RECORD__SUBJECT:
				return getSubject();
			case openfsmrPackage.OPEN_FSMR_RECORD__NOTES:
				return getNotes();
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
			case openfsmrPackage.OPEN_FSMR_RECORD__INDEPENDENT_VARIABLES:
				getIndependentVariables().clear();
				getIndependentVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__DEPENDENT_VARIABLES:
				getDependentVariables().clear();
				getDependentVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__ENVIRONMENT:
				setEnvironment((Environment)newValue);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__ORGANISM:
				setOrganism((Organism)newValue);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__ID:
				setId((String)newValue);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__CREATOR:
				setCreator((String)newValue);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__MODIFIED_DATE:
				setModifiedDate((Date)newValue);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__RIGHTS:
				setRights((String)newValue);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__REFERENCE_DESCRIPTION:
				setReferenceDescription((String)newValue);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__REFERENCE_DESCRIPTION_LINK:
				setReferenceDescriptionLink((URL)newValue);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__SOFTWARE:
				setSoftware((String)newValue);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__FOOD_PROCESS:
				setFoodProcess((FoodProcess)newValue);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__TYPE:
				setType((ModelType)newValue);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__CURATION_STATUS:
				setCurationStatus((CurationStatus)newValue);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__SUBJECT:
				setSubject((String)newValue);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__NOTES:
				setNotes((String)newValue);
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
			case openfsmrPackage.OPEN_FSMR_RECORD__INDEPENDENT_VARIABLES:
				getIndependentVariables().clear();
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__DEPENDENT_VARIABLES:
				getDependentVariables().clear();
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__ENVIRONMENT:
				setEnvironment((Environment)null);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__ORGANISM:
				setOrganism((Organism)null);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__ID:
				setId(ID_EDEFAULT);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__MODIFIED_DATE:
				setModifiedDate(MODIFIED_DATE_EDEFAULT);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__RIGHTS:
				setRights(RIGHTS_EDEFAULT);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__REFERENCE_DESCRIPTION:
				setReferenceDescription(REFERENCE_DESCRIPTION_EDEFAULT);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__REFERENCE_DESCRIPTION_LINK:
				setReferenceDescriptionLink(REFERENCE_DESCRIPTION_LINK_EDEFAULT);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__SOFTWARE:
				setSoftware(SOFTWARE_EDEFAULT);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__FOOD_PROCESS:
				setFoodProcess(FOOD_PROCESS_EDEFAULT);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__CURATION_STATUS:
				setCurationStatus(CURATION_STATUS_EDEFAULT);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__SUBJECT:
				setSubject(SUBJECT_EDEFAULT);
				return;
			case openfsmrPackage.OPEN_FSMR_RECORD__NOTES:
				setNotes(NOTES_EDEFAULT);
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
			case openfsmrPackage.OPEN_FSMR_RECORD__INDEPENDENT_VARIABLES:
				return independentVariables != null && !independentVariables.isEmpty();
			case openfsmrPackage.OPEN_FSMR_RECORD__DEPENDENT_VARIABLES:
				return dependentVariables != null && !dependentVariables.isEmpty();
			case openfsmrPackage.OPEN_FSMR_RECORD__ENVIRONMENT:
				return environment != null;
			case openfsmrPackage.OPEN_FSMR_RECORD__ORGANISM:
				return organism != null;
			case openfsmrPackage.OPEN_FSMR_RECORD__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case openfsmrPackage.OPEN_FSMR_RECORD__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case openfsmrPackage.OPEN_FSMR_RECORD__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case openfsmrPackage.OPEN_FSMR_RECORD__MODIFIED_DATE:
				return MODIFIED_DATE_EDEFAULT == null ? modifiedDate != null : !MODIFIED_DATE_EDEFAULT.equals(modifiedDate);
			case openfsmrPackage.OPEN_FSMR_RECORD__RIGHTS:
				return RIGHTS_EDEFAULT == null ? rights != null : !RIGHTS_EDEFAULT.equals(rights);
			case openfsmrPackage.OPEN_FSMR_RECORD__REFERENCE_DESCRIPTION:
				return REFERENCE_DESCRIPTION_EDEFAULT == null ? referenceDescription != null : !REFERENCE_DESCRIPTION_EDEFAULT.equals(referenceDescription);
			case openfsmrPackage.OPEN_FSMR_RECORD__REFERENCE_DESCRIPTION_LINK:
				return REFERENCE_DESCRIPTION_LINK_EDEFAULT == null ? referenceDescriptionLink != null : !REFERENCE_DESCRIPTION_LINK_EDEFAULT.equals(referenceDescriptionLink);
			case openfsmrPackage.OPEN_FSMR_RECORD__SOFTWARE:
				return SOFTWARE_EDEFAULT == null ? software != null : !SOFTWARE_EDEFAULT.equals(software);
			case openfsmrPackage.OPEN_FSMR_RECORD__FOOD_PROCESS:
				return foodProcess != FOOD_PROCESS_EDEFAULT;
			case openfsmrPackage.OPEN_FSMR_RECORD__TYPE:
				return type != TYPE_EDEFAULT;
			case openfsmrPackage.OPEN_FSMR_RECORD__CURATION_STATUS:
				return curationStatus != CURATION_STATUS_EDEFAULT;
			case openfsmrPackage.OPEN_FSMR_RECORD__SUBJECT:
				return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
			case openfsmrPackage.OPEN_FSMR_RECORD__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
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
		result.append(", creator: ");
		result.append(creator);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", modifiedDate: ");
		result.append(modifiedDate);
		result.append(", rights: ");
		result.append(rights);
		result.append(", referenceDescription: ");
		result.append(referenceDescription);
		result.append(", referenceDescriptionLink: ");
		result.append(referenceDescriptionLink);
		result.append(", software: ");
		result.append(software);
		result.append(", foodProcess: ");
		result.append(foodProcess);
		result.append(", type: ");
		result.append(type);
		result.append(", curationStatus: ");
		result.append(curationStatus);
		result.append(", subject: ");
		result.append(subject);
		result.append(", notes: ");
		result.append(notes);
		result.append(')');
		return result.toString();
	}

} //OpenFSMRRecordImpl
