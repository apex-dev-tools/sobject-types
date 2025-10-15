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
public class ApplicationForm extends SObject {
	public static SObjectType$<ApplicationForm> SObjectType;
	public static SObjectFields$<ApplicationForm> Fields;

	public Id AccountId;
	public Account Account;
	public String ApplicationSummary;
	public Date CompletionDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date DueDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LeadId;
	public Lead Lead;
	public String Name;
	public Id OpportunityId;
	public Opportunity Opportunity;
	public Id OwnerId;
	public Name Owner;
	public Decimal Score;
	public String ScoreReason;
	public String ScoreType;
	public String Stage;
	public String SubType;
	public Date SubmissionDate;
	public Datetime SystemModstamp;
	public String Type;
	public String UsageType;

	public ActionPlan[] ActionPlans;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public Applicant[] Applicants;
	public ApplicationFormProduct[] ApplicationFormProducts;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public AuthApplicationAsset[] AuthRegApplication;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ApplicationFormFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public AuthFormRequestRecord[] FormRequestRecordRelatedRecords;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ApplicationFormHistory[] Histories;
	public InfoAuthorizationRequest[] InfoAuthRequestSourceRecords;
	public MultipartyInfoAuthRequest[] MultipartyInfoAuthRequestSourceRecords;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessException[] ProcessExceptions;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordAlert[] RecordAlertParent;
	public RecordAlert[] RecordAlertWhat;
	public AuthApplicationPlace[] RegAuthApplication;
	public RegulatoryCodeViolation[] RegCodeResponseContext;
	public RegulatoryTrxnFee[] RegulatoryTrxnFees;
	public ApplicationFormShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public ApplicationForm clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApplicationForm clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApplicationForm clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApplicationForm clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApplicationForm clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
