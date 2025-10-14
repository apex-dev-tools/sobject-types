/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CareRequestItem extends SObject {
	public static SObjectType$<CareRequestItem> SObjectType;
	public static SObjectFields$<CareRequestItem> Fields;

	public Decimal AmbulanceTransportDistance;
	public String AmbulanceTransportReason;
	public String AmbulanceTransportType;
	public Integer ApprovedLengthOfStay;
	public String ApprovedLevelOfCare;
	public Integer ApprovedQuantity;
	public Date ApprovedServiceEndDate;
	public Date ApprovedServiceStartDate;
	public String AssertionIdentifier;
	public String AuthApprovalIdentifier;
	public String AuthorizationRefIdentifier;
	public Id CareRequestCaseId;
	public Case CareRequestCase;
	public Id CareRequestId;
	public CareRequest CareRequest;
	public String ClinicalDetermination;
	public String ClinicalDeterminationNotes;
	public Id ClinicalDeterminationReasonId;
	public CodeSet ClinicalDeterminationReason;
	public Id ClinicalServiceRequestId;
	public ClinicalServiceRequest ClinicalServiceRequest;
	public String CodeDescription;
	public String CodeType;
	public String CodeTypeIdentifier;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Integer CumulativeLengthOfStay;
	public String CurrencyIsoCode;
	public String CurrentLevelOfCare;
	public Datetime DecisionDate;
	public String DeniedLevelOfCare;
	public Integer DeniedQuantity;
	public String Division;
	public Date EffectiveDate;
	public Date EndDate;
	public String FreeFormProcedureDescription;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String ModifiedCodeDescription;
	public String ModifiedCodeIdentifier;
	public String ModifiedCodeType;
	public String ModifiedCodeTypeIdentifier;
	public Date ModifiedEffectiveDate;
	public Date ModifiedEndDate;
	public String ModifiedLevelOfCare;
	public String ModifiedModifier;
	public String ModifiedModifierDescription;
	public Id ModifiedProcedureCodeId;
	public HealthCareProcedure ModifiedProcedureCode;
	public Id ModifiedProcedureCodeSetId;
	public Name ModifiedProcedureCodeSet;
	public Integer ModifiedQuantity;
	public String Modifier;
	public String Modifier2;
	public String Modifier2Description;
	public String Modifier3;
	public String Modifier3Description;
	public String Modifier4;
	public String Modifier4Description;
	public Id ModifierCodeSetId;
	public Name ModifierCodeSet;
	public String ModifierDescription;
	public String Name;
	public String Priority;
	public Id ProcedureCodeId;
	public HealthCareProcedure ProcedureCode;
	public Id ProcedureCodeSetId;
	public Name ProcedureCodeSet;
	public Integer Quantity;
	public String QuantityType;
	public Id ReasonCodeId;
	public Name ReasonCode;
	public String RequestType;
	public Integer RequestedLengthOfStay;
	public String RequestedLevelOfCare;
	public Date RequestedServiceEndDate;
	public Date RequestedServiceStartDate;
	public Integer RequiredResponseCount;
	public Datetime ResponseDateTime;
	public String ServiceCategory;
	public String ServiceCategoryCode;
	public Id ServicingFacilityId;
	public Name ServicingFacility;
	public Id ServicingProviderId;
	public HealthcareProvider ServicingProvider;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public String Status;
	public Id StatusCodeId;
	public CodeSetBundle StatusCode;
	public String StatusReason;
	public Datetime SubmittedDateTime;
	public Datetime SystemModstamp;
	public Integer TransactionNumber;
	public Id TransportLocationId;
	public Account TransportLocation;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CareProcessingError[] CareProcessingErrorReferenceObject;
	public CareRequestReviewer[] CareRequestReviewers;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CareRequestItemFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CareRequestItemHistory[] Histories;
	public Identifier[] Identifiers;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public CareRequestItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareRequestItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
