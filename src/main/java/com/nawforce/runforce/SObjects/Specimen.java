/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class Specimen extends SObject {
	public static SObjectType$<Specimen> SObjectType;
	public static SObjectFields$<Specimen> Fields;

	public Id BodySiteId;
	public CodeSet BodySite;
	public Id CaseId;
	public Case Case;
	public Id CollectionDeviceCodeId;
	public CodeSet CollectionDeviceCode;
	public Decimal CollectionDuration;
	public Id CollectionDurationUomId;
	public UnitOfMeasure CollectionDurationUom;
	public Datetime CollectionEndDate;
	public Id CollectionMethodCodeId;
	public CodeSet CollectionMethodCode;
	public Decimal CollectionQuantity;
	public Id CollectionQuantityUomId;
	public UnitOfMeasure CollectionQuantityUom;
	public Datetime CollectionStartDate;
	public Id CollectorId;
	public Name Collector;
	public Id ConditionCodeId;
	public CodeSetBundle ConditionCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal FastingDuration;
	public Id FastingDurationUomId;
	public UnitOfMeasure FastingDurationUom;
	public Id FastingStatusCodeId;
	public CodeSet FastingStatusCode;
	public Id FeatureCodeId;
	public CodeSetBundle FeatureCode;
	public String GroupingMethod;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Datetime ReceivedDate;
	public Id SourceReferenceRecordId;
	public Name SourceReferenceRecord;
	public String Status;
	public Datetime SystemModstamp;
	public Id TypeId;
	public CodeSet Type;
	public Id UsageCodeId;
	public CodeSetBundle UsageCode;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public ClinicalServiceRequestDetail[] ClinSvcReqDetail_Detail;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DiagnosticSummaryDetail[] DiagSummaryDetailDomain;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public SpecimenFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public SpecimenHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public SpecimenShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public Specimen clone$() {throw new java.lang.UnsupportedOperationException();}
	public Specimen clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Specimen clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Specimen clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Specimen clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
