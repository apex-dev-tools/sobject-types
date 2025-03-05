/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Long;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class FlowOrchestrationWorkItem extends SObject {
	public static SObjectType$<FlowOrchestrationWorkItem> SObjectType;
	public static SObjectFields$<FlowOrchestrationWorkItem> Fields;

	public Id AssigneeId;
	public Name Assignee;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Long ElapsedTimeSinceAsgntInSec;
	public Long ElapsedTimeSinceCreationInSec;
	public Id Id;
	public Boolean IsDeleted;
	public String Label;
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
	public String ScreenFlow;
	public String ScreenFlowInputs;
	public String Status;
	public Id StepInstanceId;
	public FlowOrchestrationStepInstance StepInstance;
	public Datetime SystemModstamp;

	public ApprovalWorkItem[] ApprovalWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public FlowOrchestrationWorkItemShare[] Shares;
	public UserDefinedLabelAssignment[] UserDefinedLabelAssignments;

	public FlowOrchestrationWorkItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationWorkItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationWorkItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationWorkItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationWorkItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
