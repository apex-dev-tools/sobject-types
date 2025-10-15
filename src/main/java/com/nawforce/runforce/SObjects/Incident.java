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
public class Incident extends SObject {
	public static SObjectType$<Incident> SObjectType;
	public static SObjectFields$<Incident> Fields;

	public Id BusinessHoursId;
	public BusinessHours BusinessHours;
	public String Category;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Datetime DetectedDateTime;
	public Datetime EndDateTime;
	public Id EntitlementId;
	public Entitlement Entitlement;
	public Id Id;
	public String Impact;
	public String IncidentNumber;
	public Boolean IsClosed;
	public Boolean IsDeleted;
	public Boolean IsMajorIncident;
	public Boolean IsStopped;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String MilestoneStatus;
	public Id OwnerId;
	public Name Owner;
	public Id ParentIncidentId;
	public Incident ParentIncident;
	public String Priority;
	public String PriorityOverrideReason;
	public String ReportedMethod;
	public Datetime ResolutionDateTime;
	public String ResolutionSummary;
	public Id ResolvedById;
	public User ResolvedBy;
	public Datetime SlaExitDate;
	public Datetime SlaStartDate;
	public Datetime StartDateTime;
	public String Status;
	public String StatusCode;
	public Datetime StopStartDate;
	public String SubCategory;
	public String Subject;
	public Datetime SystemModstamp;
	public String Type;
	public String Urgency;

	public ActionPlan[] ActionPlans;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CaseRelatedIssue[] CaseRelatedIssues;
	public ChangeRequestRelatedIssue[] ChangeRequestRelatedIssues;
	public Incident[] ChildIncidents;
	public Claim[] Claims;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EntityMilestone[] EntityMilestones;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public IncidentFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public IncidentHistory[] Histories;
	public IncidentRelatedItem[] IncidentRelatedItems;
	public ListEmail[] ListEmails;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProblemIncident[] ProblemIncidentRelatedIssues;
	public ProblemIncident[] ProblemIncidents;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public IncidentShare[] Shares;
	public SwarmMember[] SwarmMembers;
	public Swarm[] Swarms;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public Incident clone$() {throw new java.lang.UnsupportedOperationException();}
	public Incident clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Incident clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Incident clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Incident clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
