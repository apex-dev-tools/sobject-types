/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class DevopsTestSuiteGroupExec extends SObject {
	public static SObjectType$<DevopsTestSuiteGroupExec> SObjectType;
	public static SObjectFields$<DevopsTestSuiteGroupExec> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DevopsPipelineStageTriggerId;
	public DevopsPipelineStageTrigger DevopsPipelineStageTrigger;
	public Datetime ExecutionEndTime;
	public Datetime ExecutionStartTime;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Integer PendingExecutionCount;
	public String QualityGateStatus;
	public Id RequestInfoId;
	public DevopsRequestInfo RequestInfo;
	public String Status;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public DevopsActivityLog[] DevopsActivityLogs;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public DevopsTestSuiteGroupExecShare[] Shares;
	public DevopsTestSuiteExecution[] TestSuiteGroupExec_SuiteExec;

	public DevopsTestSuiteGroupExec clone$() {throw new java.lang.UnsupportedOperationException();}
	public DevopsTestSuiteGroupExec clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DevopsTestSuiteGroupExec clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DevopsTestSuiteGroupExec clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DevopsTestSuiteGroupExec clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
