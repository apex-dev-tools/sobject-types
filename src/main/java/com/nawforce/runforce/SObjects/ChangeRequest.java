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
public class ChangeRequest extends SObject {
	public static SObjectType$<ChangeRequest> SObjectType;
	public static SObjectFields$<ChangeRequest> Fields;

	public String BusinessJustification;
	public String BusinessReason;
	public String Category;
	public String ChangeRequestNumber;
	public String ChangeType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Datetime EstimatedEndTime;
	public Datetime EstimatedStartTime;
	public Datetime FinalReviewDateTime;
	public String FinalReviewNotes;
	public Id Id;
	public String Impact;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id OwnerId;
	public Name Owner;
	public String Priority;
	public String RemediationPlan;
	public Id ReviewerId;
	public User Reviewer;
	public String RiskImpactAnalysis;
	public String RiskLevel;
	public String Status;
	public String StatusCode;
	public String Subject;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public ChangeRequestRelatedIssue[] ChangeRequestRelatedIssues;
	public ChangeRequestRelatedItem[] ChangeRequestRelatedItems;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ChangeRequestFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ChangeRequestHistory[] Histories;
	public WorkPlan[] NewWorkPlans;
	public WorkStep[] NewWorkSteps;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public ChangeRequestShare[] Shares;
	public SwarmMember[] SwarmMembers;
	public Swarm[] Swarms;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public ChangeRequest clone$() {throw new java.lang.UnsupportedOperationException();}
	public ChangeRequest clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ChangeRequest clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ChangeRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ChangeRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
