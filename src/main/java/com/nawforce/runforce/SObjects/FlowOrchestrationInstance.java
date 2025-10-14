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
