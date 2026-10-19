/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class CarePgmEnrolleeWkOrdStep extends SObject {
	public static SObjectType$<CarePgmEnrolleeWkOrdStep> SObjectType;
	public static SObjectFields$<CarePgmEnrolleeWkOrdStep> Fields;

	public Id ActionPlanTemplateId;
	public ActionPlanTemplate ActionPlanTemplate;
	public Boolean AreAllTasksCompleted;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EndDateTime;
	public Id Id;
	public Boolean IsCustodyCompleted;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id ParentEnrolleeWorkOrderId;
	public CarePgmEnrolleeWorkOrder ParentEnrolleeWorkOrder;
	public Integer SequenceNumber;
	public Datetime StartDateTime;
	public String Status;
	public Datetime SystemModstamp;
	public Id WorkTypeStepId;
	public WorkTypeStep WorkTypeStep;

	public ActionPlan[] ActionPlans;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AssessmentTask[] AssessmentTaskReferenceRecord;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public CareProgramEnrollee[] CurrentWorkOrderStepCPEnrollees;
	public CustodyChainEntry[] CustodyChainEntry_ReferenceRecord;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CarePgmEnrolleeWkOrdStepFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CarePgmEnrolleeWkOrdStepHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public CarePgmEnrolleeWkOrdStep clone$() {throw new java.lang.UnsupportedOperationException();}
	public CarePgmEnrolleeWkOrdStep clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CarePgmEnrolleeWkOrdStep clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CarePgmEnrolleeWkOrdStep clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CarePgmEnrolleeWkOrdStep clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
