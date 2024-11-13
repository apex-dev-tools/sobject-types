/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class FlowInterview extends SObject {
	public static SObjectType$<FlowInterview> SObjectType;
	public static SObjectFields$<FlowInterview> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrentElement;
	public String CurrentFlowVersion;
	public String EngineType;
	public String Error;
	public String FlowVersionViewId;
	public String Guid;
	public Id Id;
	public String InterviewLabel;
	public String InterviewStatus;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterFlowVersion;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String PauseLabel;
	public Datetime SystemModstamp;
	public Boolean WasPausedFromScreen;

	public DynamicDataCapture[] DynamicDataCaptures;
	public RecordAction[] RecordActions;
	public FlowRecordRelation[] RecordRelations;
	public FlowInterviewShare[] Shares;
	public FlowStageRelation[] StageRelations;
	public WorkStep[] WorkSteps;

	public FlowInterview clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowInterview clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowInterview clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowInterview clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowInterview clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
