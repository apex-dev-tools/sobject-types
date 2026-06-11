/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ApprovalWorkItem extends SObject {
	public static SObjectType$<ApprovalWorkItem> SObjectType;
	public static SObjectFields$<ApprovalWorkItem> Fields;

	public String ApprovalChainName;
	public String ApprovalConditionName;
	public Id ApprovalSubmissionId;
	public ApprovalSubmission ApprovalSubmission;
	public Id AssignedToId;
	public Name AssignedTo;
	public String Comments;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id FlowOrchestrationWorkItemId;
	public FlowOrchestrationWorkItem FlowOrchestrationWorkItem;
	public Id Id;
	public Boolean IsAutoReviewed;
	public Boolean IsDeleted;
	public Boolean IsEligibleForSmartApproval;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id RelatedRecordId;
	public Name RelatedRecord;
	public String RelatedRecordObjectName;
	public Id ReviewedById;
	public User ReviewedBy;
	public Datetime ReviewedDate;
	public Id SmartApprovalBasisWorkItemId;
	public ApprovalWorkItem SmartApprovalBasisWorkItem;
	public String Status;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public ApprovalSubmissionDetail[] ApprovalSubmissionDetails;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItemCriteria[] ApprovalWorkItemMultiCriteria;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public ApprovalWorkItem[] BasisApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ApprovalWorkItemFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ApprovalWorkItemHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public Task[] Tasks;

	public ApprovalWorkItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApprovalWorkItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApprovalWorkItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApprovalWorkItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApprovalWorkItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
