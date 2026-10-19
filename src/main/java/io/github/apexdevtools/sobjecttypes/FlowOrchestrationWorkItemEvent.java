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
public class FlowOrchestrationWorkItemEvent extends SObject {
	public static SObjectType$<FlowOrchestrationWorkItemEvent> SObjectType;
	public static SObjectFields$<FlowOrchestrationWorkItemEvent> Fields;

	public String Assignee;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public String OrchestrationInstance;
	public String RelatedRecord;
	public String ReplayId;
	public String Type;
	public String WorkItem;

	public FlowOrchestrationWorkItemEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationWorkItemEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationWorkItemEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationWorkItemEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationWorkItemEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
