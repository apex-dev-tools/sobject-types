/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.Long;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class FlowOrchestrationLog extends SObject {
	public static SObjectType$<FlowOrchestrationLog> SObjectType;
	public static SObjectFields$<FlowOrchestrationLog> Fields;

	public String Actor;
	public String Assignee;
	public String AssigneeType;
	public String Comments;
	public String Context;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Long Duration;
	public Id Id;
	public Boolean IsDeleted;
	public String Kind;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OrchestrationInstanceId;
	public FlowOrchestrationInstance OrchestrationInstance;
	public String OrchestrationName;
	public Integer OrchestrationVersion;
	public String StageName;
	public String StepName;
	public Datetime SystemModstamp;
	public Datetime Timestamp;

	public FlowOrchestrationLog clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationLog clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationLog clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
