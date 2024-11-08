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
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id RelatedRecordId;
	public Name RelatedRecord;
	public String RelatedRecordObjectName;
	public Id ReviewedById;
	public User ReviewedBy;
	public Datetime ReviewedDate;
	public String Status;
	public Datetime SystemModstamp;

	public ApprovalSubmissionDetail[] ApprovalSubmissionDetails;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public ApprovalWorkItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApprovalWorkItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApprovalWorkItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApprovalWorkItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApprovalWorkItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
