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
public class FlowOrchestrationStageInstance extends SObject {
	public static SObjectType$<FlowOrchestrationStageInstance> SObjectType;
	public static SObjectFields$<FlowOrchestrationStageInstance> Fields;

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
	public String OrchestrationName;
	public Id OwnerId;
	public Name Owner;
	public Integer Position;
	public String Status;
	public Datetime SystemModstamp;

	public FlowOrchestrationStepInstance[] FlowOrchestrationStepInstances;
	public FlowOrchestrationStageInstanceShare[] Shares;

	public FlowOrchestrationStageInstance clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationStageInstance clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationStageInstance clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationStageInstance clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationStageInstance clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
