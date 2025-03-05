/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DataActionJobSummary extends SObject {
	public static SObjectType$<DataActionJobSummary> SObjectType;
	public static SObjectFields$<DataActionJobSummary> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataActionDefinitionId;
	public DataAction DataActionDefinition;
	public Datetime EndExecutionTime;
	public String ExecutionDetails;
	public String ExternalRequestName;
	public Integer FailedRecordCount;
	public String FailedRecords;
	public Id Id;
	public Boolean IsDeleted;
	public String JobStatus;
	public String JobType;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String ProcessName;
	public Integer ProcessedRecordCount;
	public Datetime PublishDateTime;
	public Integer SkippedRecords;
	public Datetime StartExecutionTime;
	public Datetime SystemModstamp;
	public Integer UpdatedRecordCount;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public DataActionJobSummaryFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public DataActionJobSummaryHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public DataActionJobSummaryShare[] Shares;

	public DataActionJobSummary clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataActionJobSummary clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataActionJobSummary clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataActionJobSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataActionJobSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
