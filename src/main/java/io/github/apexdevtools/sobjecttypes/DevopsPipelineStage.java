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
public class DevopsPipelineStage extends SObject {
	public static SObjectType$<DevopsPipelineStage> SObjectType;
	public static SObjectFields$<DevopsPipelineStage> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DevOpsEnvironmentId;
	public DevopsEnvironment DevOpsEnvironment;
	public Id DevopsPipelineId;
	public DevopsPipeline DevopsPipeline;
	public String ExternalId;
	public Id Id;
	public Boolean IsBundled;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastSyncDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id NextStageId;
	public DevopsPipelineStage NextStage;
	public String ReviewRemoteReference;
	public Id SourceCodeRepositoryBranchId;
	public SourceCodeRepositoryBranch SourceCodeRepositoryBranch;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DevopsActivityLog[] DevopsActivityLogs;
	public DevopsEnvDeployment[] DevopsEnvDeployments;
	public DevopsPipelineStage[] DevopsPipelineStages;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public DevopsPipelineStageFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public DevopsPipelineStageHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public Task[] Tasks;
	public WorkItem[] WorkItems;

	public DevopsPipelineStage clone$() {throw new java.lang.UnsupportedOperationException();}
	public DevopsPipelineStage clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DevopsPipelineStage clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DevopsPipelineStage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DevopsPipelineStage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
