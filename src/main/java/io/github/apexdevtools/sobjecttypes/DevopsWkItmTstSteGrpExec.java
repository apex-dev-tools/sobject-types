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
public class DevopsWkItmTstSteGrpExec extends SObject {
	public static SObjectType$<DevopsWkItmTstSteGrpExec> SObjectType;
	public static SObjectFields$<DevopsWkItmTstSteGrpExec> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DevopsTestSuiteGroupExecId;
	public DevopsTestSuiteGroupExec DevopsTestSuiteGroupExec;
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
	public Datetime SystemModstamp;
	public Id WorkItemId;
	public WorkItem WorkItem;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public DevopsWkItmTstSteGrpExecShare[] Shares;

	public DevopsWkItmTstSteGrpExec clone$() {throw new java.lang.UnsupportedOperationException();}
	public DevopsWkItmTstSteGrpExec clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DevopsWkItmTstSteGrpExec clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DevopsWkItmTstSteGrpExec clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DevopsWkItmTstSteGrpExec clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
