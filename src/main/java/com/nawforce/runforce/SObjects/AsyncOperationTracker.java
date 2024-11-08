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
public class AsyncOperationTracker extends SObject {
	public static SObjectType$<AsyncOperationTracker> SObjectType;
	public static SObjectFields$<AsyncOperationTracker> Fields;

	public String AsyncOperationNumber;
	public String CorrelationIdentifier;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime ExpiresAt;
	public Integer FailedJobItems;
	public Datetime FinishedAt;
	public Id Id;
	public Boolean IsDeleted;
	public String JobType;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id OwnerId;
	public Name Owner;
	public Id ParentOperationId;
	public AsyncOperationTracker ParentOperation;
	public Id ReferenceEntityId;
	public Name ReferenceEntity;
	public String Response;
	public Integer SequenceNumber;
	public Datetime StartedAt;
	public String Status;
	public String StepName;
	public Datetime SubmittedAt;
	public Integer SuccessfulJobItems;
	public Datetime SystemModstamp;
	public Integer TotalJobItems;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AsyncOperationTracker[] AsyncOperationTrackers;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public RevenueTransactionErrorLog[] PrimaryRevenueTransactionErrorLogs;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RevenueTransactionErrorLog[] RevenueTransactionErrorLogs;
	public AsyncOperationTrackerShare[] Shares;

	public AsyncOperationTracker clone$() {throw new java.lang.UnsupportedOperationException();}
	public AsyncOperationTracker clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AsyncOperationTracker clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AsyncOperationTracker clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AsyncOperationTracker clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
