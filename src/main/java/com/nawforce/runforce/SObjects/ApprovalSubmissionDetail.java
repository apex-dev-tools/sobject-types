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
public class ApprovalSubmissionDetail extends SObject {
	public static SObjectType$<ApprovalSubmissionDetail> SObjectType;
	public static SObjectFields$<ApprovalSubmissionDetail> Fields;

	public String ActionChannelName;
	public String ActionContext;
	public String ActionName;
	public Id ActionPerformedById;
	public User ActionPerformedBy;
	public String ActionPerformerRole;
	public Id ApprovalSubmissionId;
	public ApprovalSubmission ApprovalSubmission;
	public Id ApprovalWorkItemId;
	public ApprovalWorkItem ApprovalWorkItem;
	public String Comments;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public ApprovalSubmissionDetail clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApprovalSubmissionDetail clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApprovalSubmissionDetail clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApprovalSubmissionDetail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApprovalSubmissionDetail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
