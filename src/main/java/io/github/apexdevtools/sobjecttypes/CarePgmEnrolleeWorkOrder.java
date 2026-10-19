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
public class CarePgmEnrolleeWorkOrder extends SObject {
	public static SObjectType$<CarePgmEnrolleeWorkOrder> SObjectType;
	public static SObjectFields$<CarePgmEnrolleeWorkOrder> Fields;

	public Id CareProgramEnrolleeId;
	public CareProgramEnrollee CareProgramEnrollee;
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
	public Id NextWorkOrderId;
	public CarePgmEnrolleeWorkOrder NextWorkOrder;
	public Id PreviousWorkOrderId;
	public CarePgmEnrolleeWorkOrder PreviousWorkOrder;
	public Id ServiceAppointmentId;
	public ServiceAppointment ServiceAppointment;
	public Datetime StartDateTime;
	public String Status;
	public Datetime SystemModstamp;
	public Id WorkTypeId;
	public WorkType WorkType;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CarePgmEnrolleeWorkOrder[] CPEnrolleeWorkOrder_NextWorkOrder;
	public CarePgmEnrolleeWorkOrder[] CPEnrolleeWorkOrder_PreviousWorkOrder;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public CareProgramEnrollee[] CurrentWorkOrderCPEnrollees;
	public CustodyChainEntry[] CustodyChainEntry_ReferenceRecord;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public CarePgmEnrolleeWkOrdStep[] Enrollee_Work_Order_Steps_Work_Order;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CarePgmEnrolleeWorkOrderFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CarePgmEnrolleeWorkOrderHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public CarePgmEnrolleeWorkOrder clone$() {throw new java.lang.UnsupportedOperationException();}
	public CarePgmEnrolleeWorkOrder clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CarePgmEnrolleeWorkOrder clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CarePgmEnrolleeWorkOrder clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CarePgmEnrolleeWorkOrder clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
