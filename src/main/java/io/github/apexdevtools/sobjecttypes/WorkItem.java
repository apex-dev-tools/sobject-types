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
public class WorkItem extends SObject {
	public static SObjectType$<WorkItem> SObjectType;
	public static SObjectFields$<WorkItem> Fields;

	public Id AssignedToId;
	public User AssignedTo;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DevelopmentApprovedById;
	public User DevelopmentApprovedBy;
	public Id DevelopmentEnvironmentId;
	public DevopsEnvironment DevelopmentEnvironment;
	public Id DevopsPipelineStageId;
	public DevopsPipelineStage DevopsPipelineStage;
	public Id DevopsProjectId;
	public DevopsProject DevopsProject;
	public String ExternalId;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsDevelopmentApproved;
	public String JiraExternalReference;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastSyncDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id ParentWorkItemId;
	public WorkItem ParentWorkItem;
	public Id RebaseBranchId;
	public SourceCodeRepositoryBranch RebaseBranch;
	public Id RebaseStatusId;
	public DevopsRequestInfo RebaseStatus;
	public String ReviewRemoteReference;
	public Id SourceCodeRepositoryBranchId;
	public SourceCodeRepositoryBranch SourceCodeRepositoryBranch;
	public String Status;
	public String Subject;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DevopsActivityLog[] DevopsActivityLogs;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public WorkItemFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public WorkItemHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public WorkItemShare[] Shares;
	public Task[] Tasks;
	public WorkItemComponentList[] WorkItemComponentLists;
	public WorkItem[] WorkItems;

	public WorkItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
