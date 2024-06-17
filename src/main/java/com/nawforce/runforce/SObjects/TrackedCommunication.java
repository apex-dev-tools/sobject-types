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
public class TrackedCommunication extends SObject {
	public static SObjectType$<TrackedCommunication> SObjectType;
	public static SObjectFields$<TrackedCommunication> Fields;

	public Id CommunicatorReferenceId;
	public Name CommunicatorReference;
	public Id ContextReferenceId;
	public Name ContextReference;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Datetime OccurrenceEndDateTime;
	public Datetime OccurrenceStartDateTime;
	public Id OwnerId;
	public Name Owner;
	public String Priority;
	public Id RequesterReferenceId;
	public Name RequesterReference;
	public String Status;
	public String StatusReason;
	public Id SubjectId;
	public Name Subject;
	public Datetime SystemModstamp;
	public String Type;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public TrackedCommunicationFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public TrackedCommunicationHistory[] Histories;
	public Identifier[] Identifiers;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TrackedCommunicationShare[] Shares;
	public TrackedCommunicationDetail[] TCDetail_Detail;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TrackedCommunicationDetail[] Tracked_Communication_Detail;

	public TrackedCommunication clone$() {throw new java.lang.UnsupportedOperationException();}
	public TrackedCommunication clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public TrackedCommunication clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public TrackedCommunication clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public TrackedCommunication clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
