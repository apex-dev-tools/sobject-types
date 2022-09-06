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
public class FlowOrchestrationStepInstance extends SObject {
	public static SObjectType$<FlowOrchestrationStepInstance> SObjectType;
	public static SObjectFields$<FlowOrchestrationStepInstance> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public String Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OrchestrationInstanceId;
	public FlowOrchestrationInstance OrchestrationInstance;
	public Id OwnerId;
	public Name Owner;
	public Id StageInstanceId;
	public FlowOrchestrationStageInstance StageInstance;
	public String Status;
	public String StepType;
	public Datetime SystemModstamp;

	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public FlowOrchestrationStepInstanceShare[] Shares;

	public FlowOrchestrationStepInstance clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationStepInstance clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationStepInstance clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationStepInstance clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationStepInstance clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
