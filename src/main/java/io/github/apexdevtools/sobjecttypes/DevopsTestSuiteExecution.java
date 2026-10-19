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
public class DevopsTestSuiteExecution extends SObject {
	public static SObjectType$<DevopsTestSuiteExecution> SObjectType;
	public static SObjectFields$<DevopsTestSuiteExecution> Fields;

	public Decimal Coverage;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DevopsTestSuiteGroupExecId;
	public DevopsTestSuiteGroupExec DevopsTestSuiteGroupExec;
	public Id DevopsTestSuiteId;
	public DevopsTestSuite DevopsTestSuite;
	public Id DevopsTestSuiteStageId;
	public DevopsTestSuiteStage DevopsTestSuiteStage;
	public Datetime ExecutionEndTime;
	public Datetime ExecutionStartTime;
	public String ExternalIdRef;
	public Integer FailureCount;
	public Decimal FailureRate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LearnMore;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String QualityGateStatus;
	public String ReportUrl;
	public String ResultDetails;
	public String Status;
	public Integer SuccessCount;
	public Decimal SuccessRate;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public DevopsTestSuiteExecutionShare[] Shares;
	public DevopsQualityGateResult[] TestSuiteExec_QualityGateResult;
	public DevopsTestExecution[] TestSuiteExec_TestExecution;

	public DevopsTestSuiteExecution clone$() {throw new java.lang.UnsupportedOperationException();}
	public DevopsTestSuiteExecution clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DevopsTestSuiteExecution clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DevopsTestSuiteExecution clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DevopsTestSuiteExecution clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
