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
public class FlowDebugRefreshEvent extends SObject {
	public static SObjectType$<FlowDebugRefreshEvent> SObjectType;
	public static SObjectFields$<FlowDebugRefreshEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public String FlowVersion;
	public String InterviewGuid;
	public String ReplayId;

	public FlowDebugRefreshEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowDebugRefreshEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowDebugRefreshEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowDebugRefreshEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowDebugRefreshEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
