/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
