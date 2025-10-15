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
public class ApplicationReview extends SObject {
	public static SObjectType$<ApplicationReview> SObjectType;
	public static SObjectFields$<ApplicationReview> Fields;

	public String ApplicationCategory;
	public Id ApplicationId;
	public Name Application;
	public String ApplicationRecommendation;
	public Date AssignedDate;
	public String Comment;
	public String Condition;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date DueDate;
	public Date EndDate;
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
	public Id ReviewedById;
	public User ReviewedBy;
	public Date StartDate;
	public String Status;
	public Date SubmissionDate;
	public Datetime SystemModstamp;

	public ActionPlan[] ActionPlans;
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
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ApplicationReviewFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ApplicationReviewHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordAlert[] RecordAlertParent;
	public RecordAlert[] RecordAlertWhat;
	public ApplicationReviewShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public ApplicationReview clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApplicationReview clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApplicationReview clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApplicationReview clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApplicationReview clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
