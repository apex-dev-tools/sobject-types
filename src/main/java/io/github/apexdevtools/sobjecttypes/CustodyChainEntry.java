/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class CustodyChainEntry extends SObject {
	public static SObjectType$<CustodyChainEntry> SObjectType;
	public static SObjectFields$<CustodyChainEntry> Fields;

	public Id AssessmentTaskId;
	public AssessmentTask AssessmentTask;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id CustodianId;
	public Name Custodian;
	public Id CustodyItemId;
	public CustodyItem CustodyItem;
	public String Description;
	public Datetime EndDateTime;
	public Id EnrolleeWorkOrderId;
	public CarePgmEnrolleeWorkOrder EnrolleeWorkOrder;
	public Id EnrolleeWorkOrderStepId;
	public CarePgmEnrolleeWkOrdStep EnrolleeWorkOrderStep;
	public Id Id;
	public Boolean IsDeleted;
	public Id ItemCustodySiteId;
	public Name ItemCustodySite;
	public String ItemVerificationType;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String RecordUpdateInformation;
	public String ReferenceObjectApiName;
	public Id ReferenceRecordId;
	public Name ReferenceRecord;
	public Datetime StartDateTime;
	public String Status;
	public String StatusCategory;
	public Datetime SystemModstamp;
	public String VerificationProcessType;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DigitalVerification[] DigitalVerificationParentReferenceRecord;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CustodyChainEntryFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CustodyChainEntryHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public CustodyChainEntry clone$() {throw new java.lang.UnsupportedOperationException();}
	public CustodyChainEntry clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CustodyChainEntry clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CustodyChainEntry clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CustodyChainEntry clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
