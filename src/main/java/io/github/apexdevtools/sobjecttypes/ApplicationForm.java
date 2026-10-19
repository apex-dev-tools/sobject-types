/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ApplicationForm extends SObject {
	public static SObjectType$<ApplicationForm> SObjectType;
	public static SObjectFields$<ApplicationForm> Fields;

	public Id AccountId;
	public Account Account;
	public Address Address;
	public String ApplicationCategory;
	public String ApplicationStatus;
	public String ApplicationSummary;
	public Datetime ApprovalDate;
	public Id BusinessTypeId;
	public BusinessType BusinessType;
	public String City;
	public Date CompletionDate;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date DueDate;
	public String GeocodeAccuracy;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsReturned;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal Latitude;
	public Id LeadId;
	public Lead Lead;
	public Decimal Longitude;
	public String Name;
	public Id OpportunityId;
	public Opportunity Opportunity;
	public Id OwnerId;
	public Name Owner;
	public String PostalCode;
	public String Purpose;
	public Id ReferenceRecordId;
	public Benefit ReferenceRecord;
	public Datetime RequirementsCompletedDate;
	public String ReturnReason;
	public Decimal Score;
	public String ScoreReason;
	public String ScoreType;
	public String Stage;
	public String State;
	public String StateCode;
	public String Street;
	public String SubType;
	public Date SubmissionDate;
	public Id SubmittedById;
	public Name SubmittedBy;
	public Datetime SystemModstamp;
	public String Title;
	public String Type;
	public String UsageType;

	public ActionPlan[] ActionPlans;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public Applicant[] Applicants;
	public ApplicationFormProduct[] ApplicationFormProducts;
	public ApplicationFormRelation[] ApplicationFormRelations;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public AuthApplicationAsset[] AuthRegApplication;
	public CaseProceeding[] CaseProceedingApplication;
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
