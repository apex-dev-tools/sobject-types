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
public class DevopsPipelnStgPromWkItem extends SObject {
	public static SObjectType$<DevopsPipelnStgPromWkItem> SObjectType;
	public static SObjectFields$<DevopsPipelnStgPromWkItem> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DevopsPipelnStgPromId;
	public DevopsPipelnStgProm DevopsPipelnStgProm;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Datetime MergeCompletionDate;
	public String MergeRemoteReference;
	public Id MergeSourceBranchId;
	public SourceCodeRepositoryBranch MergeSourceBranch;
	public String Name;
	public Datetime SystemModstamp;
	public Id WorkItemId;
	public WorkItem WorkItem;

	public ActivityHistory[] ActivityHistories;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public DevopsPipelnStgPromWkItemFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public DevopsPipelnStgPromWkItemHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public Task[] Tasks;

	public DevopsPipelnStgPromWkItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public DevopsPipelnStgPromWkItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DevopsPipelnStgPromWkItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DevopsPipelnStgPromWkItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DevopsPipelnStgPromWkItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
