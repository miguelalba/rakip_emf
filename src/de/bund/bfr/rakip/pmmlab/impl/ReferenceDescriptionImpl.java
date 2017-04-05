/**
 */
package de.bund.bfr.rakip.pmmlab.impl;

import de.bund.bfr.rakip.pmmlab.ReferenceDescription;
import de.bund.bfr.rakip.pmmlab.ReferenceType;
import de.bund.bfr.rakip.pmmlab.pmmlabPackage;

import java.net.URL;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ReferenceDescriptionImpl#getLink <em>Link</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ReferenceDescriptionImpl#getFirstAuthor <em>First Author</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ReferenceDescriptionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ReferenceDescriptionImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ReferenceDescriptionImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ReferenceDescriptionImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ReferenceDescriptionImpl#getPage <em>Page</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ReferenceDescriptionImpl#getApprovalMode <em>Approval Mode</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ReferenceDescriptionImpl#getWebsite <em>Website</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ReferenceDescriptionImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.bund.bfr.rakip.pmmlab.impl.ReferenceDescriptionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceDescriptionImpl extends MinimalEObjectImpl.Container implements ReferenceDescription {
	/**
	 * The default value of the '{@link #getLink() <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected static final URL LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected URL link = LINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstAuthor() <em>First Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstAuthor() <em>First Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstAuthor()
	 * @generated
	 * @ordered
	 */
	protected String firstAuthor = FIRST_AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected String abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLUME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected String volume = VOLUME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssue() <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected static final int ISSUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIssue() <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected int issue = ISSUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPage() <em>Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected static final int PAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected int page = PAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getApprovalMode() <em>Approval Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalMode()
	 * @generated
	 * @ordered
	 */
	protected static final String APPROVAL_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApprovalMode() <em>Approval Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalMode()
	 * @generated
	 * @ordered
	 */
	protected String approvalMode = APPROVAL_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebsite() <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected static final URL WEBSITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebsite() <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected URL website = WEBSITE_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ReferenceType TYPE_EDEFAULT = ReferenceType.PAPER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ReferenceType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return pmmlabPackage.Literals.REFERENCE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URL getLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(URL newLink) {
		URL oldLink = link;
		link = newLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.REFERENCE_DESCRIPTION__LINK, oldLink, link));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstAuthor() {
		return firstAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstAuthor(String newFirstAuthor) {
		String oldFirstAuthor = firstAuthor;
		firstAuthor = newFirstAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.REFERENCE_DESCRIPTION__FIRST_AUTHOR, oldFirstAuthor, firstAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.REFERENCE_DESCRIPTION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(String newAbstract) {
		String oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.REFERENCE_DESCRIPTION__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(String newVolume) {
		String oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.REFERENCE_DESCRIPTION__VOLUME, oldVolume, volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIssue() {
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssue(int newIssue) {
		int oldIssue = issue;
		issue = newIssue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.REFERENCE_DESCRIPTION__ISSUE, oldIssue, issue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPage() {
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage(int newPage) {
		int oldPage = page;
		page = newPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.REFERENCE_DESCRIPTION__PAGE, oldPage, page));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApprovalMode() {
		return approvalMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalMode(String newApprovalMode) {
		String oldApprovalMode = approvalMode;
		approvalMode = newApprovalMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.REFERENCE_DESCRIPTION__APPROVAL_MODE, oldApprovalMode, approvalMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URL getWebsite() {
		return website;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebsite(URL newWebsite) {
		URL oldWebsite = website;
		website = newWebsite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.REFERENCE_DESCRIPTION__WEBSITE, oldWebsite, website));
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
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.REFERENCE_DESCRIPTION__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ReferenceType newType) {
		ReferenceType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pmmlabPackage.REFERENCE_DESCRIPTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case pmmlabPackage.REFERENCE_DESCRIPTION__LINK:
				return getLink();
			case pmmlabPackage.REFERENCE_DESCRIPTION__FIRST_AUTHOR:
				return getFirstAuthor();
			case pmmlabPackage.REFERENCE_DESCRIPTION__TITLE:
				return getTitle();
			case pmmlabPackage.REFERENCE_DESCRIPTION__ABSTRACT:
				return getAbstract();
			case pmmlabPackage.REFERENCE_DESCRIPTION__VOLUME:
				return getVolume();
			case pmmlabPackage.REFERENCE_DESCRIPTION__ISSUE:
				return getIssue();
			case pmmlabPackage.REFERENCE_DESCRIPTION__PAGE:
				return getPage();
			case pmmlabPackage.REFERENCE_DESCRIPTION__APPROVAL_MODE:
				return getApprovalMode();
			case pmmlabPackage.REFERENCE_DESCRIPTION__WEBSITE:
				return getWebsite();
			case pmmlabPackage.REFERENCE_DESCRIPTION__COMMENT:
				return getComment();
			case pmmlabPackage.REFERENCE_DESCRIPTION__TYPE:
				return getType();
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
			case pmmlabPackage.REFERENCE_DESCRIPTION__LINK:
				setLink((URL)newValue);
				return;
			case pmmlabPackage.REFERENCE_DESCRIPTION__FIRST_AUTHOR:
				setFirstAuthor((String)newValue);
				return;
			case pmmlabPackage.REFERENCE_DESCRIPTION__TITLE:
				setTitle((String)newValue);
				return;
			case pmmlabPackage.REFERENCE_DESCRIPTION__ABSTRACT:
				setAbstract((String)newValue);
				return;
			case pmmlabPackage.REFERENCE_DESCRIPTION__VOLUME:
				setVolume((String)newValue);
				return;
			case pmmlabPackage.REFERENCE_DESCRIPTION__ISSUE:
				setIssue((Integer)newValue);
				return;
			case pmmlabPackage.REFERENCE_DESCRIPTION__PAGE:
				setPage((Integer)newValue);
				return;
			case pmmlabPackage.REFERENCE_DESCRIPTION__APPROVAL_MODE:
				setApprovalMode((String)newValue);
				return;
			case pmmlabPackage.REFERENCE_DESCRIPTION__WEBSITE:
				setWebsite((URL)newValue);
				return;
			case pmmlabPackage.REFERENCE_DESCRIPTION__COMMENT:
				setComment((String)newValue);
				return;
			case pmmlabPackage.REFERENCE_DESCRIPTION__TYPE:
				setType((ReferenceType)newValue);
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
			case pmmlabPackage.REFERENCE_DESCRIPTION__LINK:
				setLink(LINK_EDEFAULT);
				return;
			case pmmlabPackage.REFERENCE_DESCRIPTION__FIRST_AUTHOR:
				setFirstAuthor(FIRST_AUTHOR_EDEFAULT);
				return;
			case pmmlabPackage.REFERENCE_DESCRIPTION__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case pmmlabPackage.REFERENCE_DESCRIPTION__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case pmmlabPackage.REFERENCE_DESCRIPTION__VOLUME:
				setVolume(VOLUME_EDEFAULT);
				return;
			case pmmlabPackage.REFERENCE_DESCRIPTION__ISSUE:
				setIssue(ISSUE_EDEFAULT);
				return;
			case pmmlabPackage.REFERENCE_DESCRIPTION__PAGE:
				setPage(PAGE_EDEFAULT);
				return;
			case pmmlabPackage.REFERENCE_DESCRIPTION__APPROVAL_MODE:
				setApprovalMode(APPROVAL_MODE_EDEFAULT);
				return;
			case pmmlabPackage.REFERENCE_DESCRIPTION__WEBSITE:
				setWebsite(WEBSITE_EDEFAULT);
				return;
			case pmmlabPackage.REFERENCE_DESCRIPTION__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case pmmlabPackage.REFERENCE_DESCRIPTION__TYPE:
				setType(TYPE_EDEFAULT);
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
			case pmmlabPackage.REFERENCE_DESCRIPTION__LINK:
				return LINK_EDEFAULT == null ? link != null : !LINK_EDEFAULT.equals(link);
			case pmmlabPackage.REFERENCE_DESCRIPTION__FIRST_AUTHOR:
				return FIRST_AUTHOR_EDEFAULT == null ? firstAuthor != null : !FIRST_AUTHOR_EDEFAULT.equals(firstAuthor);
			case pmmlabPackage.REFERENCE_DESCRIPTION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case pmmlabPackage.REFERENCE_DESCRIPTION__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
			case pmmlabPackage.REFERENCE_DESCRIPTION__VOLUME:
				return VOLUME_EDEFAULT == null ? volume != null : !VOLUME_EDEFAULT.equals(volume);
			case pmmlabPackage.REFERENCE_DESCRIPTION__ISSUE:
				return issue != ISSUE_EDEFAULT;
			case pmmlabPackage.REFERENCE_DESCRIPTION__PAGE:
				return page != PAGE_EDEFAULT;
			case pmmlabPackage.REFERENCE_DESCRIPTION__APPROVAL_MODE:
				return APPROVAL_MODE_EDEFAULT == null ? approvalMode != null : !APPROVAL_MODE_EDEFAULT.equals(approvalMode);
			case pmmlabPackage.REFERENCE_DESCRIPTION__WEBSITE:
				return WEBSITE_EDEFAULT == null ? website != null : !WEBSITE_EDEFAULT.equals(website);
			case pmmlabPackage.REFERENCE_DESCRIPTION__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case pmmlabPackage.REFERENCE_DESCRIPTION__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (link: ");
		result.append(link);
		result.append(", firstAuthor: ");
		result.append(firstAuthor);
		result.append(", title: ");
		result.append(title);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(", volume: ");
		result.append(volume);
		result.append(", issue: ");
		result.append(issue);
		result.append(", page: ");
		result.append(page);
		result.append(", approvalMode: ");
		result.append(approvalMode);
		result.append(", website: ");
		result.append(website);
		result.append(", comment: ");
		result.append(comment);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ReferenceDescriptionImpl
