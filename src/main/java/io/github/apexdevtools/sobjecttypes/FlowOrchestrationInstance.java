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
public class FlowOrchestrationInstance extends SObject {
	public static SObjectType$<FlowOrchestrationInstance> SObjectType;
	public static SObjectFields$<FlowOrchestrationInstance> Fields;

	public String AuxiliaryTriggeringRecord;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String CurrentStage;
	public Long Duration;
	public String FlowDefinitionVersionName;
	public String FlowType;
	public Id Id;
	public Id InterviewId;
	public FlowInterview Interview;
	public Boolean IsDebugRun;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String OrchestrationDeveloperName;
	public String OrchestrationLabel;
	public String OrchestrationName;
	public Id OwnerId;
	public Name Owner;
	public String Status;
	public Datetime SystemModstamp;
	public String TriggeringRecord;
	public String TriggeringRecordType;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public CareProgramEnrollee[] FlowOrchestrationInstanceCPEnrollee;
	public FlowOrchestrationLog[] FlowOrchestrationLogs;
	public FlowOrchestrationStageInstance[] FlowOrchestrationStageInstances;
	public FlowOrchestrationStepInstance[] FlowOrchestrationStepInstances;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public FlowOrchestrationInstanceShare[] Shares;

	public FlowOrchestrationInstance clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationInstance clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationInstance clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationInstance clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationInstance clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
