/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class BusinessLicenseApplication extends SObject {
	public static SObjectType$<BusinessLicenseApplication> SObjectType;
	public static SObjectFields$<BusinessLicenseApplication> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal AmountPaid;
	public Id ApplicantId;
	public Contact Applicant;
	public Id ApplicationCaseId;
	public Case ApplicationCase;
	public String ApplicationCategory;
	public String ApplicationType;
	public Datetime AppliedDate;
	public Datetime ApprovedDate;
	public Id BusinessTypeId;
	public BusinessType BusinessType;
	public String Category;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LicensePermitNameId;
	public BusinessLicense LicensePermitName;
	public Id LicenseTypeId;
	public RegulatoryAuthorizationType LicenseType;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Datetime PaymentDate;
	public Id PrimaryOwnerId;
	public Contact PrimaryOwner;
	public Datetime RequirementsCompleteDate;
	public Id SavedApplicationRefId;
	public PreliminaryApplicationRef SavedApplicationRef;
	public Address SiteAddress;
	public String SiteCity;
	public String SiteCountry;
	public String SiteCountryCode;
	public String SiteGeocodeAccuracy;
	public Decimal SiteLatitude;
	public Decimal SiteLongitude;
	public String SitePostalCode;
	public String SiteState;
	public String SiteStateCode;
	public String SiteStreet;
	public String Status;
	public Datetime SystemModstamp;
	public Boolean WasReturned;

	public ActionPlan[] ActionPlans;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public PublicApplicationParticipant[] Applications;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public AuthApplicationAsset[] AuthRegApplication;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public Visit[] Contexts;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public DuplicateRecordItem[] DuplicateRecordItems;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public BusinessLicenseApplicationFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public BusinessLicenseApplicationHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AuthApplicationPlace[] RegAuthApplication;
	public RegulatoryCodeViolation[] RegCodeResponseContext;
	public RegulatoryTrxnFee[] RegulatoryTrxnFees;
	public BusinessLicenseApplicationShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public BusinessLicenseApplication clone$() {throw new java.lang.UnsupportedOperationException();}
	public BusinessLicenseApplication clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BusinessLicenseApplication clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BusinessLicenseApplication clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BusinessLicenseApplication clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
