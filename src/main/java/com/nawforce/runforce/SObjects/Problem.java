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
public class Problem extends SObject {
	public static SObjectType$<Problem> SObjectType;
	public static SObjectFields$<Problem> Fields;

	public String Category;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
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
	public Id ParentProblemId;
	public Problem ParentProblem;
	public String Priority;
	public String PriorityOverrideReason;
	public String ProblemNumber;
	public Datetime ResolutionDateTime;
	public String ResolutionSummary;
	public Id ResolvedById;
	public User ResolvedBy;
	public String RootCauseSummary;
	public String Status;
	public String StatusCode;
	public String SubCategory;
	public String Subject;
	public Datetime SystemModstamp;
	public String Urgency;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CaseRelatedIssue[] CaseRelatedIssues;
	public ChangeRequestRelatedIssue[] ChangeRequestRelatedIssues;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ProblemFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ProblemHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProblemIncident[] ProblemIncidentRelatedIssues;
	public ProblemIncident[] ProblemIncidents;
	public ProblemRelatedItem[] ProblemRelatedItems;
	public Problem[] Problems;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public ProblemShare[] Shares;
	public SwarmMember[] SwarmMembers;
	public Swarm[] Swarms;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public Problem clone$() {throw new java.lang.UnsupportedOperationException();}
	public Problem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Problem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Problem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Problem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
