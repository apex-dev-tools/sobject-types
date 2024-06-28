/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Long;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
