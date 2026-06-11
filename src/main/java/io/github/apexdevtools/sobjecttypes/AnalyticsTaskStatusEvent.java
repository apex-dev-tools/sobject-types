/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Long;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AnalyticsTaskStatusEvent extends SObject {
	public static SObjectType$<AnalyticsTaskStatusEvent> SObjectType;
	public static SObjectFields$<AnalyticsTaskStatusEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public Long FailureCount;
	public Long InProgressCount;
	public String Message;
	public Long NotStartedCount;
	public String ReplayId;
	public String RequestStatus;
	public String Result;
	public String RuntimeRequest;
	public Long SuccessCount;
	public String TaskNode;
	public String TaskPhase;
	public String TaskStatus;
	public Long TotalDurationInSecond;
	public Long TotalTask;
	public Long WarningCount;

	public AnalyticsTaskStatusEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsTaskStatusEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsTaskStatusEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsTaskStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsTaskStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
