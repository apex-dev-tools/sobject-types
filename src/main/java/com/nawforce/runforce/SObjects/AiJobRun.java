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
public class AiJobRun extends SObject {
	public static SObjectType$<AiJobRun> SObjectType;
	public static SObjectFields$<AiJobRun> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EndTime;
	public String ErrorCode;
	public String ErrorMessage;
	public Id Id;
	public Boolean IsDeleted;
	public String JobType;
	public String Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Datetime StartTime;
	public String Status;
	public Datetime SystemModstamp;
	public String Target;

	public AiJobRunItem[] AiJobRuns;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AiJobRunShare[] Shares;

	public AiJobRun clone$() {throw new java.lang.UnsupportedOperationException();}
	public AiJobRun clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AiJobRun clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AiJobRun clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AiJobRun clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
