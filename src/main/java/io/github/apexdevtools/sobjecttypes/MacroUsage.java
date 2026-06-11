/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class MacroUsage extends SObject {
	public static SObjectType$<MacroUsage> SObjectType;
	public static SObjectFields$<MacroUsage> Fields;

	public String AppContext;
	public Integer ConditionCount;
	public String ContextRecord;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer DurationInMs;
	public Integer ExecutedInstructionCount;
	public Datetime ExecutionEndTime;
	public String ExecutionState;
	public String FailureReason;
	public Id FolderId;
	public Folder Folder;
	public Id Id;
	public Integer InstructionCount;
	public Boolean IsDeleted;
	public Boolean IsFromBulk;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MacroId;
	public Macro Macro;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public MacroUsageShare[] Shares;

	public MacroUsage clone$() {throw new java.lang.UnsupportedOperationException();}
	public MacroUsage clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MacroUsage clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MacroUsage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MacroUsage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
