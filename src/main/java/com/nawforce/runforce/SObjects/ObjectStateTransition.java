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
public class ObjectStateTransition extends SObject {
	public static SObjectType$<ObjectStateTransition> SObjectType;
	public static SObjectFields$<ObjectStateTransition> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id FromStateId;
	public ObjectStateValue FromState;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id ObjectStateDefinitionId;
	public ObjectStateDefinition ObjectStateDefinition;
	public Datetime SystemModstamp;
	public Id ToStateId;
	public ObjectStateValue ToState;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ObjectStateTransitionFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ObjectStateTransitionHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public ObjectStateTransition clone$() {throw new java.lang.UnsupportedOperationException();}
	public ObjectStateTransition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ObjectStateTransition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ObjectStateTransition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ObjectStateTransition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}