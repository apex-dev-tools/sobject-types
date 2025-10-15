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
public class IndividualApplication extends SObject {
	public static SObjectType$<IndividualApplication> SObjectType;
	public static SObjectFields$<IndividualApplication> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal AmountPaid;
	public Id ApplicationCaseId;
	public Case ApplicationCase;
	public String ApplicationCategory;
	public String ApplicationReferenceNumber;
	public String ApplicationType;
	public Datetime AppliedDate;
	public Datetime ApprovedDate;
	public Id BudgetId;
	public Budget Budget;
	public Id BusinessTypeId;
	public BusinessType BusinessType;
	public String Category;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String ExternalProject;
	public Id HealthcareProviderId;
	public HealthcareProvider HealthcareProvider;
	public Id Id;
	public Boolean IsApprovalRequired;
	public Boolean IsDeleted;
	public Boolean IsOwnerEditable;
	public Boolean IsSubmittedByThirdParty;
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
	public Id ParentApplicationId;
	public IndividualApplication ParentApplication;
	public Datetime PaymentDate;
	public String RejectionReason;
	public Datetime RequirementsCompleteDate;
	public Id SavedApplicationRefId;
	public PreliminaryApplicationRef SavedApplicationRef;
	public String ServiceType;
	public String Status;
	public Id SubmittedByAccountId;
	public Account SubmittedByAccount;
	public Id SubmittedByContactId;
	public Contact SubmittedByContact;
	public Datetime SystemModstamp;
	public Boolean WasReturned;

	public ActionPlan[] ActionPlans;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApplicationReview[] ApplicationReviews;
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
	public DigitalSignature[] DigitalSignatures;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public IndividualApplicationFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public IndividualApplicationHistory[] Histories;
	public IndividualApplication[] IndividualApplication_IndividualApplications;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordAlert[] RecordAlertParent;
	public RecordAlert[] RecordAlertWhat;
	public AuthApplicationPlace[] RegAuthApplication;
	public RegulatoryCodeViolation[] RegCodeResponseContext;
	public RegulatoryTrxnFee[] RegulatoryTrxnFees;
	public IndividualApplicationShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public IndividualApplication clone$() {throw new java.lang.UnsupportedOperationException();}
	public IndividualApplication clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IndividualApplication clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IndividualApplication clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IndividualApplication clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
