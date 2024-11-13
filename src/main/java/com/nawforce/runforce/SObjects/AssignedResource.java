/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AssignedResource extends SObject {
	public static SObjectType$<AssignedResource> SObjectType;
	public static SObjectFields$<AssignedResource> Fields;

	public Decimal ActualTravelTime;
	public String AssignedResourceNumber;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal EstimatedTravelTime;
	public Id EventId;
	public Event Event;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsRequiredResource;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Role;
	public Id ServiceAppointmentId;
	public ServiceAppointment ServiceAppointment;
	public Id ServiceCrewId;
	public ServiceCrew ServiceCrew;
	public Id ServiceResourceId;
	public ServiceResource ServiceResource;
	public Datetime SystemModstamp;
	public String Transaction;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public AssignedResourceFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public AssignedResourceHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public AssignedResource clone$() {throw new java.lang.UnsupportedOperationException();}
	public AssignedResource clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AssignedResource clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AssignedResource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AssignedResource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
