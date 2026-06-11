/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Long;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
	public String FlowType;
	public Id Id;
	public Boolean IsDeleted;
	public String Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String OrchestrationName;
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
