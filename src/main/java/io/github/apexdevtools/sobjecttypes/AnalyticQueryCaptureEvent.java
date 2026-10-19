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
public class AnalyticQueryCaptureEvent extends SObject {
	public static SObjectType$<AnalyticQueryCaptureEvent> SObjectType;
	public static SObjectFields$<AnalyticQueryCaptureEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DashboardId;
	public String EventUuid;
	public String Query;
	public String ReplayId;

	public AnalyticQueryCaptureEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AnalyticQueryCaptureEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticQueryCaptureEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticQueryCaptureEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticQueryCaptureEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
