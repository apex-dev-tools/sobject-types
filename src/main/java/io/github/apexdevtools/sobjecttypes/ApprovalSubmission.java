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
public class ApprovalSubmission extends SObject {
	public static SObjectType$<ApprovalSubmission> SObjectType;
	public static SObjectFields$<ApprovalSubmission> Fields;

	public String Comments;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Boolean DoesSendApprovalEmail;
	public Id FlowOrchestrationInstanceId;
	public FlowOrchestrationInstance FlowOrchestrationInstance;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsEligibleForSmartApproval;
	public Boolean IsSmartApprovalRun;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id RelatedRecordId;
	public Name RelatedRecord;
	public String RelatedRecordObjectName;
	public Id SmartApprvlBasisSubmissionId;
	public ApprovalSubmission SmartApprvlBasisSubmission;
	public String Status;
	public Id SubmittedById;
	public User SubmittedBy;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public ApprovalSubmissionDetail[] ApprovalSubmissionDetails;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public ApprovalSubmission[] BasisApprovalSubmissions;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ApprovalSubmissionFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ApprovalSubmissionHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ApprovalSubmissionShare[] Shares;
	public Task[] Tasks;

	public ApprovalSubmission clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApprovalSubmission clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApprovalSubmission clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApprovalSubmission clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApprovalSubmission clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
